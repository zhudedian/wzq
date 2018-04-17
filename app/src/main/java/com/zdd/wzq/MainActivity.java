package com.zdd.wzq;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zdd.wzq.view.CheckerboardView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private CheckerboardView checkerboardView;
    public Button restart,forward,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        textView = (TextView)findViewById(R.id.text);
        checkerboardView = (CheckerboardView)findViewById(R.id.checker_board);
        restart = (Button)findViewById(R.id.restart);
        forward = (Button)findViewById(R.id.forward);
        next = (Button)findViewById(R.id.next);

        restart.setVisibility(View.GONE);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkerboardView.reStart();
                restart.setVisibility(View.GONE);
                textView.setText("");
            }
        });
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkerboardView.forward();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkerboardView.next();
            }
        });
    }
    public void setText(String text){
        textView.setText(text);

    }
}
