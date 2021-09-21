package com.grouptwo.nidlist.ui.Output;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.grouptwo.nidlist.R;

import java.lang.reflect.Array;

public class DetailsScreen extends AppCompatActivity {

    //initiate class variable
    Button back_btn;
    TextView nid_txt, name_txt, email_txt, gander_txt;
    ImageView nid_img;
    Intent getId;
    String nid;
    String [] ganderArray = {"Male", "Female"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_screen);

        initView();

        //make the image when clicked back to the previous screen
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        getIncomingIntent();

    }

    //get the result from the previous screen and display it here
    public void getIncomingIntent(){

        getId = getIntent();
        nid = getId.getStringExtra("nid");
        nid_txt.setText(nid);

        setIDInfo(nid);
    }

    @SuppressLint("SetTextI18n")
    public void setIDInfo(String id){
        switch (id) {
            case "1045643839":
                name_txt.setText(name_txt.getText() + " Ahmed Najeb");
                email_txt.setText(email_txt.getText() + " a-j@example.com");
                gander_txt.setText(gander_txt.getText() +" "+ ganderArray[0]);
                nid_img.setColorFilter(Color.parseColor("#1C43C2"));
                break;

            case "1067858546":
                name_txt.setText(name_txt.getText() + " Suha Ameen");
                email_txt.setText(email_txt.getText() + " ssameen@example.com");
                gander_txt.setText(gander_txt.getText() +" "+ ganderArray[1]);
                nid_img.setColorFilter(Color.parseColor("#9D32CB"));
                break;

            case "1074968688":
                name_txt.setText(name_txt.getText() + " Ali Nasir");
                email_txt.setText(email_txt.getText() + " a_n@example.com");
                gander_txt.setText(gander_txt.getText() +" "+ ganderArray[0]);
                nid_img.setColorFilter(Color.parseColor("#39B296"));
                break;

            case "1005834687":
                name_txt.setText(name_txt.getText() + " Saud Salim");
                email_txt.setText(email_txt.getText() + " s.r.salim@example.com");
                gander_txt.setText(gander_txt.getText() +" "+ ganderArray[0]);
                nid_img.setColorFilter(Color.parseColor("#DF1C31"));
                break;

            case "1040398346":
                name_txt.setText(name_txt.getText() + " Arwa Mahfoodh");
                email_txt.setText(email_txt.getText() + " arwa_mahfoodh@example.com");
                gander_txt.setText(gander_txt.getText() +" "+ ganderArray[1]);
                nid_img.setColorFilter(Color.parseColor("#EA3DA9"));
                break;
        }
    }

    public void initView(){
        nid_txt = findViewById(R.id.txt_nid);
        name_txt = findViewById(R.id.txt_name);
        email_txt = findViewById(R.id.txt_email);
        gander_txt =findViewById(R.id.txt_gander);
        nid_img = findViewById(R.id.img_nid);
        back_btn = findViewById(R.id.btn_back);
    }
}