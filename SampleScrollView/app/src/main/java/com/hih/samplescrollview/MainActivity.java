package com.hih.samplescrollview;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    // import 하는 방법은 alt + enter
    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = (ScrollView) findViewById(R.id.scrollView);
        imageView = (ImageView) findViewById(R.id.imageView);
//      scrollView.setHorizontalScrollBarEnabled(true);
        Resources res = getResources(); // 리소스 폴더를 가리키는 클래스 변수
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image1);

        int bitmapWidth = bitmap.getIntrinsicWidth(); // 스마트폰 가로 해상도
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap); // 레이아웃에 이미지를 draw
        imageView.getLayoutParams().width = bitmapWidth; // 레이아웃 가로 pixel
        imageView.getLayoutParams().height = bitmapHeight; // 레이아웃 세로 pixel
    }

    public void onButton1Clicked(View view) {
        changeImage();
    }
    private void changeImage() {
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image2);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }
}
