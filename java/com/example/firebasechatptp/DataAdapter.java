package com.example.firebasechatptp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<ViewHolder>{

    ArrayList<String> message;

    LayoutInflater inflater;

    public DataAdapter(Context context, ArrayList<String> message) {
        this.message = message;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_massage, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String msg = message.get(position);
        holder.message.setText(msg);
    }

    @Override
    public int getItemCount() {
        return message.size();
    }
}
