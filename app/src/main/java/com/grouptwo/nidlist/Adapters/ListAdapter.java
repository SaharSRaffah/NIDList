package com.grouptwo.nidlist.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.grouptwo.nidlist.R;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder>{

    //initiate class variables
    ArrayList<String> listData;
    Context context;

    //initiate the constructor
    public ListAdapter(ArrayList<String> listData, Context context){
        this.listData = listData;
        this.context = context;
    }

    @NonNull
    @Override
    public ListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.MyViewHolder holder, int position) {
        holder.nid_txt.setText(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nid_txt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nid_txt = itemView.findViewById(R.id.txt_idnum);
        }
    }
}
