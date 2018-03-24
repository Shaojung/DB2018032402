package com.example.student.db2018032402;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    StudentDAO dao;
    TextView tv, tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        dao = new StudentDAOImpl(DetailActivity.this);
        Intent it = getIntent();
        int id = it.getIntExtra("id", 0);
        Log.d("ID", String.valueOf(id));
        Phone p = dao.getOneData(id);
        tv = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv.setText(p.stuname);
        tv2.setText(p.tel);
    }
}
