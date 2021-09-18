package com.grouptwo.nidlist.ui.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.grouptwo.nidlist.Adapters.ListAdapter;
import com.grouptwo.nidlist.R;

import java.util.ArrayList;

public class ListScreen extends AppCompatActivity {

    //initiate class variable
    ArrayList<String> listData;
    RecyclerView listRec;
    ListAdapter listAdapter;
    TextView nid_txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_screen);

        initView();


        //insert the data into ArrayList
        listData = new ArrayList<>();
        listData.add("1045643839");
        listData.add("1067858546");
        listData.add("1074968688");
        listData.add("1005834687");
        listData.add("1040398346");

        listAdapter = new ListAdapter(listData, ListScreen.this);
        listRec.setLayoutManager(new LinearLayoutManager(this));
        listRec.setAdapter(listAdapter);
    }

    public void initView(){
        listRec = findViewById(R.id.listRec);
        nid_txt = findViewById(R.id.txt_idnum);
    }
}