package com.example.student.db2018032402;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.File;

public class AddActivity extends AppCompatActivity {
    File fout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        fout = new File(getFilesDir(), "student.sqlite");
    }
    public void clickAdd(View v)
    {
        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(fout, null);
        ContentValues cv = new ContentValues();
        cv.put("stuname", "AAAA");
        cv.put("tel", "1111");
        db.insert("phone", null, cv);

    }
}
