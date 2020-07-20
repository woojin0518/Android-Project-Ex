package com.example.ex11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView list;
    ArrayList<Product> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        data = new ArrayList<Product>();
        Product product = new Product(R.drawable.flower, "데이지", 1000);
        data.add(product);

        product = new Product(R.drawable.flower1, "수국", 3000);
        data.add(product);

        product = new Product(R.drawable.flower2, "게베라", 3000);
        data.add(product);

        //어댑터 생성
        Myadapter ad=new Myadapter();

        //ListView 에 어댑터 set
        list=findViewById(R.id.list);
        list.setAdapter(ad);




    }
    //My adapter 정의
    class Myadapter extends BaseAdapter{


        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view= getLayoutInflater().inflate(R.layout.item, viewGroup, false);

            ImageView img=view.findViewById(R.id.img);
            img.setImageResource(data.get(i).img);

            final TextView name=view.findViewById(R.id.name);
            name.setText(data.get(i).name);

            TextView price=view.findViewById(R.id.price);
            price.setText(data.get(i).price +"원");

            Button btn=view.findViewById(R.id.btn);
            btn.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity2.this,name.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });

            return view;
        }
    }



}
