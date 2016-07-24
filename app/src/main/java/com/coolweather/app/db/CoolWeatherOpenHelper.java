package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 张泽晗 on 2016/7/24.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper{
    //Province表建表语句
    public static final String CREATE_PROVINCE="create table Province ("
            +"id integer primary key autoincrement,"
            +"province_name text,"
            +"province_code text)";
    //City表建表语句
    public static final String CREATE_CITY="create table City ("
            +"id integer primary key autoincrement,"
            +"city_name text,"
            +"city_code text,"
            +"province_id integer)";
    //County表建表语句
    public static final String CREATE_COUNTY="create table County ("
            +"id integer primary key autoincrement,"
            +"county_name text,"
            +"county_code text,"
            +"city_id integer)";
    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory
                                 factory,int version){
        super(context,name,factory,version);
    }

    //必须重写onCreate方法建表，当数据库被首次创建时执行该方法，一般将创建表等初始化操作在该方法中执行
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_PROVINCE);//创建Province表
        db.execSQL(CREATE_CITY);//创建City表
        db.execSQL(CREATE_COUNTY);//创建County表
    }
    //onUpgrade方法也必须重写，当打开数据库时传入的版本号与当前的版本号不同时会调用该方法
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){

    }
}
