package com.zdd.wzq;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.zdd.wzq.adapter.SpinnerAdapter;
import com.zdd.wzq.gobang.Gobang;
import com.zdd.wzq.view.CheckerboardView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private CheckerboardView checkerboardView;
    public Button restart,forward,next;
    private Spinner spinner;
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
        spinner = (Spinner)findViewById(R.id.spinner);

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
        initSpinner();
    }
    private void initSpinner(){
        final List<String> datas = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            datas.add("" + i);
        }
        SharedPreferences sharedPreferences = getSharedPreferences("wzq_prefer", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        int difficulty = sharedPreferences.getInt("difficulty",0);

        SpinnerAdapter adapter = new SpinnerAdapter(this) ;
        spinner.setAdapter(adapter);

        adapter.setDatas(datas);
        spinner.setSelection(difficulty);
        /**选项选择监听*/
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                editor.putInt("difficulty",position);
                editor.apply();
                Gobang.difficulty = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void setText(String text){
        textView.setText(text);

    }
}
