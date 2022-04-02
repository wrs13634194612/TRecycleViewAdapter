package com.example.recycleviewadapterthree.listener;

import android.view.View;

/**
 * @Author: lzsheng
 */
public interface OnRecyclerViewItemChildClick<T> {
    void OnItemChildClick(View viewChild, T t, int position);
}
