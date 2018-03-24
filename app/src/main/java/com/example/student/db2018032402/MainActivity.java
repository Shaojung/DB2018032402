package com.example.student.db2018032402;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
    public void click1(View v)
    {
        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(fout, null);
        Cursor c = db.rawQuery("Select * from phone", null);
        c.moveToFirst();
        do
        {
            Log.d("DB", c.getString(1));
        }while (c.moveToNext());
        db.close();
    }
    public void copyDb()
    {
        fout = new File(getFilesDir(), "student.sqlite");
        InputStream is = getResources().openRawResource(R.raw.student);
        byte b[] = new byte[1024];
        int len;
        try {
            FileOutputStream fos = new FileOutputStream(fout);
            while((len = is.read(b)) != -1)
            {
                fos.write(b, 0, len);
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
