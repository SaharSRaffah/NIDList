package com.grouptwo.nidlist.ui.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.grouptwo.nidlist.Adapters.ListAdapter;
import com.grouptwo.nidlist.R;
import com.grouptwo.nidlist.ui.Output.DetailsScreen;

import java.util.ArrayList;

public class ListScreen extends AppCompatActivity {

    //initiate class variable
    ArrayList<String> listData;
    RecyclerView listRec;
    ListAdapter listAdapter;
    //TextView nidNum_txt;
    //Intent goToDetailScreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_screen);

        initView();

        //goToDetailScreen = new Intent(ListScreen.this, DetailsScreen.class);

        //insert the data into ArrayList
        listData = new ArrayList<>();
        listData.add("1045643839");
        listData.add("1067858546");
        listData.add("1074968688");
        listData.add("1005834687");
        listData.add("1040398346");

        //manage the adapter and put it into recycler view
        listAdapter = new ListAdapter(listData, this);
        listRec.setAdapter(listAdapter);
        listRec.setLayoutManager(new LinearLayoutManager(this));



        /*nidNum_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nid;
                nid = nidNum_txt.getText().toString();

                goToDetailScreen.putExtra("nid", nid);
                startActivity(goToDetailScreen);
            }
        });*/
    }

    public void initView(){
        listRec = findViewById(R.id.listRec);
    }
}