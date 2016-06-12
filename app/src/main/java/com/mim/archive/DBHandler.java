package com.mim.archive;

/**
 * Created by User on 6/8/2016.
 */


        import android.content.ContentValues;
        import android.content.Context;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Aybars on 26.09.2015.
 */
public class DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_NAME = "products.db";
    public static final String TABLE_NEWS = "news";
    public static final String TABLE_USER= "user";
    public static final String TABLE_ADMIN = "admin";

    public static final String COLUMN_NEWSID = "_newsId";
    public static final String COLUMN_USERID = "_userId";
    public static final String COLUMN_ADMINID = "_adminId";
    public static final String COLUMN_NEWSTITLE = "newsTitle";
    public static final String COLUMN_USERNAME = "userName";
    public static final String COLUMN_ADMINNAME = "adminName";
    public static final String COLUMN_NEWSPAPER = "newsPaper";
    public static final String COLUMN_NEWSDATE = "newsDate";
    public static final String COLUMN_NEWSTAG = "newsTag";
    public static final String COLUMN_NEWSURL = "newsUrl";
    public static final String COLUMN_ADMINPASSWORD = "adminPassword";
    public static final String COLUMN_USERPASSWORD= "userPassword";

    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_user = "CREATE TABLE " + TABLE_USER + "(" +
                COLUMN_USERID + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                COLUMN_USERNAME + " TEXT ," +
                COLUMN_USERPASSWORD+ " TEXT " +
                ");";
        String create_admin = "CREATE TABLE " + TABLE_ADMIN + "(" +
                COLUMN_ADMINID + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                COLUMN_ADMINNAME + " TEXT DEFAULT NULL," +
                COLUMN_ADMINPASSWORD + " TEXT DEFAULT NULL" +
                ");";
        String create_news = "CREATE TABLE " + TABLE_NEWS + "(" +
                COLUMN_NEWSID + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                COLUMN_NEWSTITLE + " TEXT DEFAULT NULL," +
                COLUMN_NEWSPAPER + " TEXT DEFAULT NULL," +
                COLUMN_NEWSDATE + " TEXT DEFAULT NULL," +
                COLUMN_NEWSTAG + " TEXT DEFAULT NULL," +
                COLUMN_NEWSURL+ " TEXT DEFAULT NULL" +

                ");";
        db.execSQL(create_user);
        db.execSQL(create_admin);
        db.execSQL(create_news);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " + TABLE_USER);
        db.execSQL("DROP TABLE IF EXIST " + TABLE_ADMIN);
        db.execSQL("DROP TABLE IF EXIST " + TABLE_NEWS);
        onCreate(db);
    }

    //Add new row to database
    public void addNews(News news){
        ContentValues values = new ContentValues();
        values.put(COLUMN_NEWSTITLE, news.get_newsTitle());
       // values.put(COLUMN_NEWSPAPER, news.get_newsPaper());
       // values.put(COLUMN_NEWSTAG, news.get_tag());
        //values.put(COLUMN_NEWSDATE, news.get_newsDate());
        values.put(COLUMN_NEWSURL, news.get_newsUrl());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_NEWS, null, values);
        db.close();
    }


    public void addUser(User user){
        ContentValues values = new ContentValues();
        values.put(COLUMN_USERNAME, user.get_userName());
        values.put(COLUMN_USERPASSWORD, user.get_userPassword());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_USER, null, values);
        db.close();
    }
    //Delete product from the database
    public void deleteNews(String newsTitle){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_NEWS + " WHERE " + COLUMN_NEWSTITLE + "=\"" + newsTitle + "\";");
    }

    public void deleteUser(String userName){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_USER + " WHERE " + COLUMN_USERNAME + "=\"" + userName + "\";");
    }

    //Print out the database as a string
    public String databaseToString(){
        String dbString = "";
        SQLiteDatabase db =  getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_NEWS + " WHERE 1";

        //Cursor point to a location in your result
        Cursor c = db.rawQuery(query, null);
        //Move to first row in your result
        c.moveToFirst();

        //Position after the last row means the end of the results
        while (!c.isAfterLast()) {
            if (c.getString(c.getColumnIndex("newsTitle")) != null) {
                dbString += c.getString(c.getColumnIndex("newsTitle"));
                dbString += "\n";
            }
            c.moveToNext();
        }
        db.close();
        return dbString;
    }
}

