package com.stacktips.speechtotext;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "question_set";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_QUESTIONS = "tbl_ques";
    public static final String COL_QUESTIONS = "tbl_questions";
    public static final String COL_ANSWERS = "tbl_answers";

    public static final String CREATE_TABLE_EMPLOYEE = "create table "+TABLE_QUESTIONS+"("+
            COL_QUESTIONS+" text, "+
            COL_ANSWERS+" text);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_EMPLOYEE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TABLE_QUESTIONS);
        onCreate(db);
    }
}
