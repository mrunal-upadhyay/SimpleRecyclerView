package com.mrunal.simplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleAdapter simpleAdapter = new SimpleAdapter(generateSimpleList());
        RecyclerView recyclerView = findViewById(R.id.simple_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(simpleAdapter);
    }

    private List<SimpleViewModel> generateSimpleList() {
        List<SimpleViewModel> simpleViewModelList = new ArrayList<>();

        for(int i=0; i<100; i++){
            simpleViewModelList.add(new SimpleViewModel(String.format(Locale.US,"This is item %d",i)));
        }

        return simpleViewModelList;
    }
}
