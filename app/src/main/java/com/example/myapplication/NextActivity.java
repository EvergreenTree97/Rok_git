package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextActivity extends AppCompatActivity {
    private View v;
    private View v_r;
    private Button b_tl,b_t,b_tr,b_l,b_r,b_bl,b_b,b_br;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        v = findViewById(R.id.view);
        v_r = findViewById(R.id.rectangle);
        v_r.bringToFront();

        b_tl = findViewById(R.id.T_Left);
        b_t = findViewById(R.id.Top);
        b_tr = findViewById(R.id.T_Right);
        b_l = findViewById(R.id.Left);
        b_r = findViewById(R.id.Right);
        b_bl = findViewById(R.id.B_Left);
        b_b = findViewById(R.id.Bottom);
        b_br = findViewById(R.id.B_Right);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               System.out.println("Top Left");
            }
        };

        b_tl.setOnClickListener(listener);
    }
}