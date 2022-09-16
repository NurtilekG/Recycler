package com.zoro.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_result;
    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_result=itemView.findViewById(R.id.tv_count);

    }
    public void  bind(String nameCountr){
        tv_result.setText(nameCountr);
    }
}
