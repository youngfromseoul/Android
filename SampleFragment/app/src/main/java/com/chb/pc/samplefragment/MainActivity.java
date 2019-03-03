package com.chb.pc.samplefragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgView1, imgView2;
    int imgIndex = 0;  
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView1 = findViewById(R.id.img1);
        imgView2 = findViewById(R.id.img2);
    }

    public void onBtnClicked(View view) {
        changeImage();
    }

    private void changeImage() {
        if (imgIndex == 0) {
            imgView1.setVisibility(View.INVISIBLE);
            imgView2.setVisibility(View.VISIBLE);
            imgIndex = 1;
        }else {
            imgView1.setVisibility(View.VISIBLE);
            imgView2.setVisibility(View.INVISIBLE);
            imgIndex = 0;
        }
    }
}
