package com.example.ex10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    EditText edit;
    ListView list;
    Button btn1, btn2;
    ArrayList<String> data;
    ArrayAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        edit=findViewById(R.id.edit);
        list=findViewById(R.id.list);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);

        //데이터 생성
        data=new ArrayList<>();
        data.add("포도");
        data.add("수박");
        data.add("딸기");

        //어댑터 생성
        ad=new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, data);

        //ListView 어댑터 set
        list.setAdapter(ad);
        list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str=data.get(i);
                Toast.makeText(MainActivity3.this, str, Toast.LENGTH_SHORT).show();
            }
        });


        //btn1을 클릭했을 때
        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str= edit.getText().toString();
                if (str.length()==0){
                    Toast.makeText(MainActivity3.this, "내용을 입력하세요.", Toast.LENGTH_SHORT).show();
                }else {
                    data.add(str);
                    ad.notifyDataSetChanged();
                    edit.setText("");
                }
            }
        });

        //btn2를 클릭했을때
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = list.getCheckedItemPosition();
                data.remove(position);
                ad.notifyDataSetChanged();
            }
        });

    }
}