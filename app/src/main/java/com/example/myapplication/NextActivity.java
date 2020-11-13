package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class NextActivity extends AppCompatActivity {

    private View v,v2,v3;

    private Button b_tl,b_t,b_tr,b_l,b_r,b_bl,b_b,b_br;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        v = findViewById(R.id.view);
        v2 = findViewById(R.id.view2);
        v3 = findViewById(R.id.view3);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                if (V.getId() == R.id.T_Left){
                    if(v2.getX() > 0 && v2.getY() > 0){
                        v2.setX(v2.getX()-10);
                        v2.setY(v2.getY()-10);
                    }
                }
                else if(V.getId() == R.id.Top) {
                    if (v2.getY() > 0) {
                        v2.setY(v2.getY() - 10);
                    }
                }
                else if(V.getId() == R.id.T_Right) {
                    if (v2.getX() < v3.getWidth() && v2.getY() > 0) {
                        v2.setX(v2.getX() + 10);
                        v2.setY(v2.getY() - 10);
                    }
                }
                else if(V.getId() == R.id.Left) {
                    if (v2.getX() > 0) {
                        v2.setX(v2.getX() - 10);
                    }
                }
                else if(V.getId() == R.id.Right) {
                    if (v2.getX() < v3.getWidth()) {
                        v2.setX(v2.getX() + 10);
                    }
                }
                else if(V.getId() == R.id.B_Left) {
                    if (v2.getX() > 0 && v2.getY() < v3.getHeight()) {
                        v2.setX(v2.getX() - 10);
                        v2.setY(v2.getY() + 10);
                    }
                }
                else if(V.getId() == R.id.Bottom) {
                    if (v2.getX() < v3.getHeight()) {
                        v2.setY(v2.getY() + 10);
                    }
                }
                else if(V.getId() == R.id.B_Right) {
                        if (v2.getX() < v3.getWidth() && v2.getY() < v3.getHeight()) {
                            v2.setX(v2.getX() + 10);
                            v2.setY(v2.getY() + 10);
                        }
                }
            }
        };

        b_tl = findViewById(R.id.T_Left);
        b_tl.setOnClickListener(listener);
        b_t = findViewById(R.id.Top);
        b_t.setOnClickListener(listener);
        b_tr = findViewById(R.id.T_Right);
        b_tr.setOnClickListener(listener);
        b_l = findViewById(R.id.Left);
        b_l.setOnClickListener(listener);
        b_r = findViewById(R.id.Right);
        b_r.setOnClickListener(listener);
        b_bl = findViewById(R.id.B_Left);
        b_bl.setOnClickListener(listener);
        b_b = findViewById(R.id.Bottom);
        b_b.setOnClickListener(listener);
        b_br = findViewById(R.id.B_Right);
        b_br.setOnClickListener(listener);



    }
}
