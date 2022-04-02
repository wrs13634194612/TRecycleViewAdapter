package com.example.recycleviewadapterthree.listener;

import android.view.View;

/**
 * @Author: lzsheng
 */
public interface OnRecyclerViewItemChildLongClick<T> {
    void OnItemChildLongClick(View viewChild, T t, int position);
}
