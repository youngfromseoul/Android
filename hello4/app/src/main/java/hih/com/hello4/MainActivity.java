package hih.com.hello4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.naver.com"));
        startActivity(intent);
    }

    public void onButton2Clicked(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("tel:010-2909-6175"));
        startActivity(intent);
    }

    public void onButton3Clicked(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
    }
}
