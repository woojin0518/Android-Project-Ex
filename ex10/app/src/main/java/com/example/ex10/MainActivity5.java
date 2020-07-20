package com.example.ex10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //데이터 생성
        //어댑터 생성
        final ArrayAdapter ad=ArrayAdapter.createFromResource(this, R.array.fruits, android.R.layout.simple_spinner_item);

        ad.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        //spinner->adapter
        Spinner spinner=findViewById(R.id.spinner);
        spinner.setAdapter(ad);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity5.this, ad.getItem(i) + "는 맛있다.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //어댑터 생성
        final ArrayAdapter ad1=ArrayAdapter.createFromResource(this, R.array.foods, android.R.layout.simple_spinner_item);

        ad1.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        //spinner->adapter
        Spinner spinner1=findViewById(R.id.spinner1);
        spinner1.setAdapter(ad1);

       spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
          public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
              Toast.makeText(MainActivity5.this, ad1.getItem(i) + "는 맛있다.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //데이터 생성
        ArrayList<String> data=new ArrayList<String>();
        data.add("그랜저");
        data.add("소나타");

        //어댑터 생성
        final ArrayAdapter ad2=new ArrayAdapter(this, android.R.layout.simple_spinner_item,data);
        ad2.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        //Adapter-> Spinner
        Spinner spinner2=findViewById(R.id.spinner2);
        spinner2.setAdapter(ad2);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity5.this, ad2.getItem(i) + "를 타고싶다.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}