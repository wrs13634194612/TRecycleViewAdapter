package com.example.recycleviewadapterthree;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewadapterthree.adapter.MySimpleAdapter;
import com.example.recycleviewadapterthree.listener.OnRecyclerViewItemChildClick;
import com.example.recycleviewadapterthree.listener.OnRecyclerViewItemClick;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lzsheng
 */
public class MainActivity extends AppCompatActivity {
//    List<String> data;
    List<LikeBean> likeList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.rv_online_devices);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);


       // data = new ArrayList<>();
        likeList = new ArrayList<>();


        likeList.add(new LikeBean("张飞",18));
        likeList.add(new LikeBean("赵云",28));




        for (int i = 'a'; i < 'h' + 1; i++) {
         //   data.add(String.valueOf((char) i));
        }
        MySimpleAdapter adapter = new MySimpleAdapter();
        adapter.addAll(likeList);
        recyclerView.setAdapter(adapter);

        adapter.setOnRecyclerViewItemClick(new OnRecyclerViewItemClick<LikeBean>() {

            @Override
            public void OnItemClick(View itemView, LikeBean likeBean, int position) {
                Log.e("TAG","setOnRecyclerViewItemClick: "+ likeBean.getName());
            }
        });
        adapter.setOnRecyclerViewItemChildClick(new OnRecyclerViewItemChildClick<LikeBean>() {
            @Override
            public void OnItemChildClick(View viewChild, LikeBean likeBean, int position) {
                switch (viewChild.getId()) {
                    case R.id.tv_name:
                        Log.e("TAG","OnItemChildClick: "+ likeBean.getName());
                        break;
                    default:
                        break;
                }
            }
        });

    }

}