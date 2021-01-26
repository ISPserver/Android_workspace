package com.koreait.boardclient;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HttpManager {
    String TAG = this.getClass().getName();
    URL url;
    HttpURLConnection con;
    BoardConverter<Board> converter;

    public HttpManager(){
        converter = new BoardConverter<Board>();
    }

    public ArrayList<Board> requestByGet(String requestUrl){
        BufferedReader buffr=null;
        StringBuilder sb = new StringBuilder();
        ArrayList<Board> boardList=null;

        try {
            url = new URL(requestUrl);
            con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");

            //서버의 제이슨 데이터 가져오기 위한 스트림 생성
            buffr = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
            //스트링으로부터 데이터를 누적 최종적으로 json 문자열화 시키기
            String data=null;
            while (true){
                data=buffr.readLine();
                if(data==null)break;
                sb.append(data);
            }

            con.getResponseCode(); //요청 및 응답이 발생하는 시점
            Log.d(TAG,sb.toString());

            boardList = converter.getConvertedData(sb.toString());//string을 list화
            Log.d(TAG,"컨버트된 리스트의 수" + boardList.size());

            //ListView에 반영영
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(buffr!=null){
                try {
                    buffr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return boardList;
    };

    public void requestByPost(){

    }

}