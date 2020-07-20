package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1~100까지 합을 토스트로 출력
        class Ex01{
            public void main(String [] args){
                int a;
                int sum=0;
                for (a=1;a<=100;a++){
                    sum = sum + a;
                }
                System.out.print("1부터 100까지의 합 :"+sum);
            }
        }



    }
}