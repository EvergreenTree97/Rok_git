package com.example.kakao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kakao.R;

public class NextActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        recyclerView = findViewById(R.id.recyclerView);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);



        String[] main_text =  {"이운기","홍종현","임지은","유승우"};

        String[] main_text2 =  {"ㅁㄴㅇㄹㄴㅁㅇㄹㅁㄴㅇㄹ","ㅁㄴㅇㄹㅁㄴㅇㄹ","ㅁㄴㅇㄹㅁㄴㅇㄹ","ㅁㄴㅇㄹㅁㄴㅇㄹ"};



        adapter = new MainAdapter(main_text, main_text2);



        recyclerView.setAdapter(adapter);
    }
}