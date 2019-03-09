package com.mrunal.simplerecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class SimpleViewHolder extends RecyclerView.ViewHolder {

    private TextView simpleTextView;

    public SimpleViewHolder(@NonNull View itemView) {
        super(itemView);
        simpleTextView = itemView.findViewById(R.id.simple_text);
    }

    public void bindData(final SimpleViewModel viewModel) {
        simpleTextView.setText(viewModel.getSimpleText());
    }
}
