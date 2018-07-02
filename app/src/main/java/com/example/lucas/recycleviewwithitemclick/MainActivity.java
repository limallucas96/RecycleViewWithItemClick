package com.example.lucas.recycleviewwithitemclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.LayoutManager layoutManager;
    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        setUpList();

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        RecyclerAdapter recyclerAdapter =  new RecyclerAdapter(list, this);
        recyclerView.setAdapter(recyclerAdapter);

    }

    private void setUpList(){
        for (int i = 1 ; i <= 10 ; i++){
            list.add("Click me " + i);
        }
    }
}
