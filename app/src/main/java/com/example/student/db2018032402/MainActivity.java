package com.example.student.db2018032402;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    File fout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        copyDb();
        if (fout.exists()) {
            Toast.makeText(MainActivity.this, "檔案存在", Toast.LENGTH_SHORT).show();

        }
    }
    public void copyDb()
    {
        fout = new File(getFilesDir(), "student.sqlite");
        InputStream is = getResources().openRawResource(R.raw.student);
        int b;
        try {
            FileOutputStream fos = new FileOutputStream(fout);
            while((b = is.read()) == -1)
            {
                fos.write(b);
            }
            fos.close();
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
