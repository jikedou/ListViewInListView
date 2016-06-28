package com.jsh.listviewinlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mLv1;
    private ArrayList<String> mList;
    private ArrayList<String> mList1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVeiw();
        initData();
        initAdapter();
    }

    private void initAdapter() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, R.layout.item, R.id.item_tv, mList1);
        mLv1.setAdapter(arrayAdapter);

//        LinearLayoutCompat.LayoutParams layoutParams=new LinearLayoutCompat.LayoutParams()

    }

    private void initData() {
        mList = new ArrayList<String>();
        for (int i=0;i<=20;i++) {
            mList.add("父：" + i);
        }
        mList1 = new ArrayList<>();
        for (int j=65;j<=190;j++) {
            mList1.add("子：" + (char)j);
        }



    }

    private void initVeiw() {
        mLv1 = (ListView) findViewById(R.id.lv1);
    }
}
