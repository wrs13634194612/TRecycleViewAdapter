package com.example.recycleviewadapterthree.adapter;


import androidx.annotation.NonNull;

import com.example.recycleviewadapterthree.LikeBean;
import com.example.recycleviewadapterthree.R;

/**
 * @Author: lzsheng
 */
public class MySimpleAdapter extends BaseSimpleAdapter<LikeBean, BaseViewHolder> {

    public MySimpleAdapter() {
        addChildClickViewIds(R.id.tv_name);
    }

    @Override
    protected int getViewHolderLayoutResId() {
        return R.layout.recycler_item_simple;
    }

    @Override
    protected void convert(@NonNull BaseViewHolder viewHolder, LikeBean mLikeBean, int position) {
        viewHolder.setText(R.id.tv_name, "Hello " + mLikeBean.getName());
    }
}
