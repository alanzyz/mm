package com.anvo.demo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.anvo.demo.R;

import java.util.List;

/**
 * Created by Administrator on 2017/11/4.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
    Context context;
    private  List<String> mDatas;

    public HomeAdapter(Context context,List<String> mDatas) {
        this.context = context;
        this.mDatas=mDatas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder=new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));

        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(mDatas.get(position));

    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class   MyViewHolder extends RecyclerView.ViewHolder{
       TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.list_item);
        }
    }
}

