package com.example.quranwithtranslation;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.security.AccessController;
import java.util.ArrayList;

public class DBhelper extends SQLiteOpenHelper {
    public DBhelper(@Nullable Context context) {
        super(context, "QuranDB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void getAllStudents() {

       /* SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursorCourses = db.rawQuery("SELECT * FROM " + STUDENT_TABLE, null);

        ArrayList<StudentModel> studentArrayList = new ArrayList<>();

        // moving our cursor to first position.
        if (cursorCourses.moveToFirst()) {
            do {

                studentArrayList.add(new StudentModel(cursorCourses.getInt(0),cursorCourses.getString(1),
                        cursorCourses.getInt(2)));
            } while (cursorCourses.moveToNext());

        }

        cursorCourses.close();
        return studentArrayList;*/

    }


}