package com.example.student.db2018032402;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2018/3/24.
 */

public class StudentDAOImpl implements StudentDAO {
    File fout;
    Context context;
    public StudentDAOImpl(Context context)
    {
        this.context = context;

    }
    @Override
    public List<String> getList() {
        ArrayList<String> mylist = new ArrayList<>();
        fout = new File(context.getFilesDir(), "student.sqlite");
        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(fout, null);
        Cursor c = db.rawQuery("Select * from phone", null);
        c.moveToFirst();
        mylist.clear();
        do
        {
            mylist.add(c.getString(1));
            Log.d("DB", c.getString(1));
        }while (c.moveToNext());
        db.close();
        return mylist;
    }
}
