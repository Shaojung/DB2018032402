package com.example.student.db2018032402;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void copyDb()
    {
        File fout = new File(getFilesDir(), "student.sqlite");
        InputStream is = getResources().openRawResource(R.raw.student);
        try {
            FileOutputStream fos = new FileOutputStream(fout);
            


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
