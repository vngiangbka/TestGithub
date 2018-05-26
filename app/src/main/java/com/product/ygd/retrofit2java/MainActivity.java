package com.product.ygd.retrofit2java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RecyclerView rvData;
    ArrayList<ModelData> arrayList;
    AdapterData adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvData = findViewById(R.id.rvData);

        arrayList = new ArrayList<>();
        arrayList.add(new ModelData("01", "Đừng Như Thói Quen", "Jaykii, Sara Lưu", ""));
        arrayList.add(new ModelData("02", "Người Âm Phủ", "OSAD, VRT", "1"));
        arrayList.add(new ModelData("03", "Chạm Đáy Nỗi Đau", "ERIK", "1111"));
        arrayList.add(new ModelData("04", "Rời Bỏ", "Hòa Minzy", "111111"));
        arrayList.add(new ModelData("05", "Cô Gái M52", "HuyR, Tùng Viu", "1111111111"));

        adapter = new AdapterData(MainActivity.this, arrayList);
        rvData.setLayoutManager(new LinearLayoutManager(this));
        rvData.setAdapter(adapter);
    }


}
