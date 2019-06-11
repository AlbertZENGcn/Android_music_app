package com.example.myapplication.activities;

import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.activities.BaseActivity;
import com.example.myapplication.adapters.MusicGridAdapter;
import com.example.myapplication.views.GridSpaceItemDecoration;

public class MainActivity extends BaseActivity {
    private RecyclerView mRvGrid;
    private MusicGridAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
    }

    private void initview(){

        initNavBar(false,"Netease Music",true);
        mRvGrid=fd(R.id.rv_grid);
        mRvGrid.setLayoutManager(new GridLayoutManager(this,3));//同一行出三个元素，item
        mRvGrid.addItemDecoration(new GridSpaceItemDecoration(getResources().getDimensionPixelSize(R.dimen.albumMarginSize),mRvGrid));//分割线
        mAdapter =new MusicGridAdapter(this);
        mAdapter= new MusicGridAdapter(this);
        mRvGrid.setAdapter(mAdapter);
    }
}
