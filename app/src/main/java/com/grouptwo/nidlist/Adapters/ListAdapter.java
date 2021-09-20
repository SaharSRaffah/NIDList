package com.grouptwo.nidlist.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.grouptwo.nidlist.R;
import com.grouptwo.nidlist.ui.List.ListScreen;
import com.grouptwo.nidlist.ui.Output.DetailsScreen;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder>{

    //initiate class variables
    ArrayList<String> listData;
    Context context;
    Intent goToDetailScreen;
    TextView nidNum_txt;
    RelativeLayout rel_lay;


    //initiate the constructor
    public ListAdapter(ArrayList<String> listData, Context context){
        this.listData = listData;
        this.context = context;
    }

    @NonNull
    @Override
    public ListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListAdapter.MyViewHolder holder, int position) {
        holder.nid_txt.setText(listData.get(position));

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                goToDetailScreen = new Intent(context, DetailsScreen.class);
                goToDetailScreen.putExtra("nid", listData.get(position));
                context.startActivity(goToDetailScreen);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        //get the TextView element from list_item which will display the data
        RelativeLayout relativeLayout;
        TextView nid_txt;

        public MyViewHolder(View itemView) {
            super(itemView);
            nid_txt = itemView.findViewById(R.id.txt_idnum);
            relativeLayout = itemView.findViewById(R.id.lay_rel);
        }
    }
}
