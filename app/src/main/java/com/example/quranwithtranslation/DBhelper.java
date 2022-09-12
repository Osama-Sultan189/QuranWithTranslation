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
        super(context, "QuranDb.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public ArrayList<Surah> getAllSurah() {

       SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursorCourses = db.rawQuery("SELECT * FROM tsurah", null);

        ArrayList<Surah> surahArrayList = new ArrayList<>();

        // moving our cursor to first position.
        if (cursorCourses.moveToFirst()) {
            do {

                surahArrayList.add(new Surah(cursorCourses.getInt(0),
                        cursorCourses.getString(1),
                        cursorCourses.getString(2),cursorCourses.getString(3),
                        cursorCourses.getString(4)));
            } while (cursorCourses.moveToNext());

        }

        cursorCourses.close();
        surahArrayList.remove(surahArrayList.size()-1);
        return surahArrayList;

    }

    public ArrayList<Ayah> getAyat(int id,String colName) {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursorCourses = db.rawQuery("SELECT * FROM tayah where "+colName+" = "+ id, null);

        ArrayList<Ayah> AyahArrayList = new ArrayList<>();

        // moving our cursor to first position.
        if (cursorCourses.moveToFirst()) {
            do {

                AyahArrayList.add(new Ayah(cursorCourses.getInt(0),cursorCourses.getInt(1),
                        cursorCourses.getInt(2),cursorCourses.getString(3),
                        cursorCourses.getString(4),cursorCourses.getString(5),
                        cursorCourses.getString(6),cursorCourses.getString(7),
                        cursorCourses.getInt(8),cursorCourses.getInt(9),
                        cursorCourses.getInt(10)));
            } while (cursorCourses.moveToNext());

        }

        cursorCourses.close();
        return AyahArrayList;

    }


}