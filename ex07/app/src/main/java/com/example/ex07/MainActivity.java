package com.example.ex07;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text2;
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text2=findViewById(R.id.text2);
        text1=findViewById(R.id.text1);
        findViewById(R.id.btn1).setOnLongClickListener(mLong);
        findViewById(R.id.btn2).setOnLongClickListener(mLong);
        findViewById(R.id.btn3).setOnLongClickListener(mLong);
    }

    //클릭 메서드
    public void mClick(View v){
        switch (v.getId()){
            case R.id.btn1:
                text2.setTextColor(Color.WHITE);
                text2.setBackgroundColor(Color.BLACK);
                text1.setTextColor(Color.WHITE);
                text1.setBackgroundColor(Color.BLACK);
                break;
            case R.id.btn2:
                text2.setTextColor(Color.RED);
                text2.setBackgroundColor(Color.GREEN);
                text1.setTextColor(Color.RED);
                text1.setBackgroundColor(Color.GREEN);
                break;
            case R.id.btn3:
                text2.setTextColor(Color.BLUE);
                text2.setBackgroundColor(Color.YELLOW);
                text1.setTextColor(Color.BLUE);
                text1.setBackgroundColor(Color.YELLOW);
                break;
        }
    }
    //롱클릭
    Button.OnLongClickListener mLong=new Button.OnLongClickListener(){
        @Override
        public boolean onLongClick(View v) {
            String str="";
            switch (v.getId()){
                case R.id.btn1:
                    str="첫번째 버튼";
                    break;
                case R.id.btn2:
                    str="두번째 버튼";
                    break;
                case R.id.btn3:
                    str="세번째 버튼";
                    break;
            }
            Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
            return false;
        }
    };
}