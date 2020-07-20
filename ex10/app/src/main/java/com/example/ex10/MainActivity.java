package com.example.ex10;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity<img2> extends AppCompatActivity {
    ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);

        registerForContextMenu(img1);
        registerForContextMenu(img2);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if (v == img1) {
            menu.setHeaderTitle("현대 자동차");
            menu.add(0, 1, 0, "그랜저");
            menu.add(0, 2, 0, "소나타");
            menu.add(0, 3, 0, "제네시스");
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 1:
                img1.setImageResource(R.drawable.hcar2);
                break;
            case 2:
                img1.setImageResource(R.drawable.hcar1);
                break;
            case 3:
                img1.setImageResource(R.drawable.hcar3);
                break;
            case 4:
                img2.setImageResource(R.drawable.kcar1);
                break;
            case 5:
                img2.setImageResource(R.drawable.kcar2);
                break;
            case 6:
                img2.setImageResource(R.drawable.kcar3);
                break;

        }
        return super.onContextItemSelected(item);
    }
}