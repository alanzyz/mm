package com.anvo.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.anvo.demo.adapter.HomeAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<String> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        mRecyclerView=findViewById(R.id.recycler_view);
//       设置布局管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new HomeAdapter(MainActivity.this,mDatas ));
    }
    protected  void initData(){
        mDatas=new ArrayList<>();
        for (int i=0;i<100;i++){
            mDatas.add(i+"");
        }
    }
}
