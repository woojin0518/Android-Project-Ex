package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    ListView list;
    ArrayList<Address> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //데이터 생성
        data = new ArrayList<Address>();
        Address address=new Address(R.drawable.flower, "최우진", "010-6754-1344", "천안시 서북구 쌍용동");
        data.add(address);

        address=new Address(R.drawable.flower1, "최민주", "010-1234-1234", "천안시 서북구 쌍용2동");
        data.add(address);

        address=new Address(R.drawable.flower2, "최민호", "010-1214-4657", "서울시 강남구 압구정동");
        data.add(address);

        //어댑터 생성
        AddAdapter ad=new AddAdapter();

        //리스트 뷰에 어댑터 Set!
        list=findViewById(R.id.list);
        list.setAdapter(ad);
    }

    //어댑터 정의
    class AddAdapter extends BaseAdapter{

        @Override
        public int getCount() {return data.size();}

        @Override
        public Object getItem(int i) {return null;}

        @Override
        public long getItemId(int i) {return 0;}

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view= getLayoutInflater().inflate(R.layout.item_add, viewGroup, false);

            ImageView img=view.findViewById(R.id.img);
            img.setImageResource(data.get(i).img);

            TextView name=view.findViewById(R.id.name);
            name.setText(data.get(i).name);

            TextView add=view.findViewById(R.id.add);
            add.setText(data.get(i).add);

            TextView tel=view.findViewById(R.id.tel);
            tel.setText(data.get(i).tel);

            return view;
        }
    }
}