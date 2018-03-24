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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        fout = new File(getFilesDir(), "student.sqlite");
        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
    }
    public void clickAdd(View v)
    {
        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(fout, null);
        ContentValues cv = new ContentValues();
        cv.put("stuname", ed1.getText().toString());
        cv.put("tel", ed2.getText().toString());
        db.insert("phone", null, cv);
        finish();
    }
}
