package com.grouptwo.nidlist.ui.Output;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.grouptwo.nidlist.R;

public class DetailsScreen extends AppCompatActivity {

    //initiate class variable
    TextView nid_txt, name_txt, age_txt;
    ImageView nid_img;
    Intent getId;
    String nid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_screen);

        initView();

        getIncomingIntent();

    }

    //get the result from the previous screen and display it here
    public void getIncomingIntent(){

        getId = getIntent();
        nid = getId.getStringExtra("nid");
        nid_txt.setText(nid);
    }

    public void initView(){
        nid_txt = findViewById(R.id.txt_nid);
        name_txt = findViewById(R.id.txt_name);
        age_txt = findViewById(R.id.txt_age);
        nid_img = findViewById(R.id.img_nid);
    }
}