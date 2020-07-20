package com.example.ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub2);

        //버튼클릭 시 전화번호 출력
        Button btnTel=findViewById(R.id.btn);
        btnTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText tel=findViewById(R.id.tel);
                String strTel=tel.getText().toString();
                Toast.makeText(MainActivity2.this,strTel,Toast.LENGTH_SHORT).show();
            }
        });



    }
}