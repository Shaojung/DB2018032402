package com.example.student.db2018032402;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.File;

public class AddActivity extends AppCompatActivity {
    File fout;
    EditText ed1, ed2;
    StudentDAO dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        dao = new StudentDAOImpl(AddActivity.this);
        fout = new File(getFilesDir(), "student.sqlite");
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
    }
    public void clickAdd(View v)
    {
        Phone p = new Phone(ed1.getText().toString(), ed2.getText().toString());
        dao.AddPhone(p);
        finish();
    }
}
