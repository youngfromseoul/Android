package com.chb.pc.sampleintent2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button btn = findViewById(R.id.button);
        //callback 함수 : 나를 다시 실행함
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("name", "alice");
               // intent.putExtra(name "name", value "alice");
                setResult(RESULT_OK, intent);
                finish();
            }
       });
    }
}
