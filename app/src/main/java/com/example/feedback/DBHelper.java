package com.example.feedback;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DBNAME = "App.db";

    public DBHelper(Context context) {
        super(context, "App.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table student(usn TEXT primary key,username TEXT,password TEXT,email TEXT,flag INTEGER)");
        MyDB.execSQL("create Table faculty(username TEXT,password TEXT,subject TEXT primary key)");
        MyDB.execSQL("create Table q1(subject TEXT primary key,points INTEGER,count INTEGER)");
        MyDB.execSQL("create Table q2(subject TEXT primary key,points INTEGER,count INTEGER)");
        MyDB.execSQL("create Table q3(subject TEXT primary key,points INTEGER,count INTEGER)");
        MyDB.execSQL("create Table q4(subject TEXT primary key,points INTEGER,count INTEGER)");
        MyDB.execSQL("create Table q5(subject TEXT primary key,points INTEGER,count INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
        MyDB.execSQL("drop table if exists student");
        MyDB.execSQL("drop table if exists faculty");
        MyDB.execSQL("drop table if exists q1");
        MyDB.execSQL("drop table if exists q2");
        MyDB.execSQL("drop table if exists q3");
        MyDB.execSQL("drop table if exists q4");
        MyDB.execSQL("drop table if exists q5");
    }
    public Boolean insertData(String usn, String username,String password, String mail)
    {
        SQLiteDatabase MyDB3 = this.getWritableDatabase();
        ContentValues contentValues3 = new ContentValues();
        SQLiteDatabase MyDB2 = this.getWritableDatabase();
        ContentValues contentValues2 = new ContentValues();
        SQLiteDatabase MyDB1 = this.getWritableDatabase();
        ContentValues contentValues1 = new ContentValues();
        ContentValues contentValues4 = new ContentValues();
        ContentValues contentValues5 = new ContentValues();
        ContentValues contentValues6 = new ContentValues();
        ContentValues contentValues7 = new ContentValues();
        ContentValues contentValues8 = new ContentValues();

        contentValues2.put("username","Shubha");
        contentValues2.put("password","1234");
        contentValues2.put("subject","MAD");

        contentValues3.put("username","Rashmi");
        contentValues3.put("password","1234");
        contentValues3.put("subject","MLG");

        contentValues1.put("username","Shobana");
        contentValues1.put("password","1234");
        contentValues1.put("subject","APP");

        contentValues4.put("username","Nalina");
        contentValues4.put("password","1234");
        contentValues4.put("subject","CN");

        contentValues5.put("username","Preetha");
        contentValues5.put("password","1234");
        contentValues5.put("subject","SEO");

        contentValues6.put("username","Rajeshwari");
        contentValues6.put("password","1234");
        contentValues6.put("subject","EMR");

        contentValues7.put("username","Gururaj");
        contentValues7.put("password","1234");
        contentValues7.put("subject","AI");

        contentValues8.put("username","Chandrakala");
        contentValues8.put("password","1234");
        contentValues8.put("subject","CLC");

        // contentValues.put("type",type);
        MyDB1.insert("faculty", null,contentValues2);
        MyDB1.insert("faculty", null,contentValues3);
        MyDB1.insert("faculty", null,contentValues1);
        MyDB1.insert("faculty", null,contentValues4);
        MyDB1.insert("faculty", null,contentValues5);
        MyDB1.insert("faculty", null,contentValues6);
        MyDB1.insert("faculty", null,contentValues7);
        MyDB1.insert("faculty", null,contentValues8);

        SQLiteDatabase MyDB4 = this.getWritableDatabase();
        ContentValues contentValues9 = new ContentValues();
        contentValues9.put("subject","MLG");
        MyDB4.insert("q1",null,contentValues9);
        MyDB4.insert("q2",null,contentValues9);
        MyDB4.insert("q3",null,contentValues9);
        MyDB4.insert("q4",null,contentValues9);
        MyDB4.insert("q5",null,contentValues9);
        ContentValues contentValues10 = new ContentValues();
        contentValues10.put("subject","CLC");
        MyDB4.insert("q1",null,contentValues10);
        MyDB4.insert("q2",null,contentValues10);
        MyDB4.insert("q3",null,contentValues10);
        MyDB4.insert("q4",null,contentValues10);
        MyDB4.insert("q5",null,contentValues10);
        ContentValues contentValues11 = new ContentValues();
        contentValues11.put("subject","CN");
        MyDB4.insert("q1",null,contentValues11);
        MyDB4.insert("q2",null,contentValues11);
        MyDB4.insert("q3",null,contentValues11);
        MyDB4.insert("q4",null,contentValues11);
        MyDB4.insert("q5",null,contentValues11);

        ContentValues contentValues12 = new ContentValues();
        contentValues12.put("subject","SEO");
        MyDB4.insert("q1",null,contentValues12);
        MyDB4.insert("q2",null,contentValues12);
        MyDB4.insert("q3",null,contentValues12);
        MyDB4.insert("q4",null,contentValues12);
        MyDB4.insert("q5",null,contentValues12);

        ContentValues contentValues13 = new ContentValues();
        contentValues13.put("subject","EMR");
        MyDB4.insert("q1",null,contentValues13);
        MyDB4.insert("q2",null,contentValues13);
        MyDB4.insert("q3",null,contentValues13);
        MyDB4.insert("q4",null,contentValues13);
        MyDB4.insert("q5",null,contentValues13);

        ContentValues contentValues14 = new ContentValues();
        contentValues14.put("subject","AI");
        MyDB4.insert("q1",null,contentValues14);
        MyDB4.insert("q2",null,contentValues14);
        MyDB4.insert("q3",null,contentValues14);
        MyDB4.insert("q4",null,contentValues14);
        MyDB4.insert("q5",null,contentValues14);

        ContentValues contentValues15 = new ContentValues();
        contentValues15.put("subject","APP");
        MyDB4.insert("q1",null,contentValues15);
        MyDB4.insert("q2",null,contentValues15);
        MyDB4.insert("q3",null,contentValues15);
        MyDB4.insert("q4",null,contentValues15);
        MyDB4.insert("q5",null,contentValues15);

        ContentValues contentValues16 = new ContentValues();
        contentValues16.put("subject","MAD");
        MyDB4.insert("q1",null,contentValues16);
        MyDB4.insert("q2",null,contentValues16);
        MyDB4.insert("q3",null,contentValues16);
        MyDB4.insert("q4",null,contentValues16);
        MyDB4.insert("q5",null,contentValues16);

        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("usn",usn);
        contentValues.put("username",username);
        contentValues.put("password",password);
        contentValues.put("email",mail);
        contentValues.put("flag","0");
        //contentValues.put("type",opt);
       // contentValues.put("type",type);
        long results = MyDB.insert("student", null,contentValues);
        if(results==-1)
            return false;
        else
            return true;
    }
    public Boolean checkusername(String username)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from student where username = ?",new String[] {username});
        if(cursor.getCount()>0)
            return true;
        else
            return false;

    }
    public Boolean checkusernamepassword(String username, String password)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from student where username = ? and password = ?", new String[] {username,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
    public Boolean checkusernamepasswordf(String username, String password)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from faculty where username = ? and password = ?", new String[] {username,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
    public String checkfaculty(String sub)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from faculty where subject = ?",new String[] {sub});

        if(cursor.moveToNext()) {
            String name = cursor.getString(0);
            return name;
        }
        else
            return "no";

    }
    public Boolean insertfeedback1(String sub,int value)
    {
        int points= 0,count = 0;
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from q1 where subject = ?",new String[] {sub});
        if(cursor.moveToNext()) {
            points = cursor.getInt(1);
            count = cursor.getInt(2);}
            points = points + value;
            count = count + 1;
        ContentValues contentValues = new ContentValues();
        contentValues.put("points",points);
        contentValues.put("count",count);
       long results = MyDB.update("q1",contentValues,"subject = ?",new String[]{sub});
        if(results==-1)
            return false;
        else
            return true;
    }

    public Boolean insertfeedback2(String sub,int value)
    {
        int points= 0,count = 0;
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from q2 where subject = ?",new String[] {sub});
        if(cursor.moveToNext()) {
            points = cursor.getInt(1);
            count = cursor.getInt(2);}
        points = points + value;
        count = count + 1;
        ContentValues contentValues = new ContentValues();
        contentValues.put("points",points);
        contentValues.put("count",count);
        long results = MyDB.update("q2",contentValues,"subject = ?",new String[]{sub});
        if(results==-1)
            return false;
        else
            return true;
    }
    public Boolean insertfeedback3(String sub,int value)
    {
        int points= 0,count = 0;
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from q3 where subject = ?",new String[] {sub});
        if(cursor.moveToNext()) {
            points = cursor.getInt(1);
            count = cursor.getInt(2);}
        points = points + value;
        count = count + 1;
        ContentValues contentValues = new ContentValues();
        contentValues.put("points",points);
        contentValues.put("count",count);
        long results = MyDB.update("q3",contentValues,"subject = ?",new String[]{sub});
        if(results==-1)
            return false;
        else
            return true;
    }
    public Boolean insertfeedback4(String sub,int value)
    {
        int points= 0,count = 0;
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from q4 where subject = ?",new String[] {sub});
        if(cursor.moveToNext()) {
            points = cursor.getInt(1);
            count = cursor.getInt(2);}
        points = points + value;
        count = count + 1;
        ContentValues contentValues = new ContentValues();
        contentValues.put("points",points);
        contentValues.put("count",count);
        long results = MyDB.update("q4",contentValues,"subject = ?",new String[]{sub});
        if(results==-1)
            return false;
        else
            return true;
    }
    public Boolean insertfeedback5(String sub,int value)
    {
        int points= 0,count = 0;
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from q5 where subject = ?",new String[] {sub});
        if(cursor.moveToNext()) {
            points = cursor.getInt(1);
            count = cursor.getInt(2);}
        points = points + value;
        count = count + 1;
        ContentValues contentValues = new ContentValues();
        contentValues.put("points",points);
        contentValues.put("count",count);
        long results = MyDB.update("q5",contentValues,"subject = ?",new String[]{sub});
        if(results==-1)
            return false;
        else
            return true;
    }
    public Boolean insertflag(String user,int flag)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put("flag",flag);
        long results = db.update("student",c,"username = ?",new String[]{user});
        if(results==-1)
            return false;
        else
            return true;
    }
    public String checksub(String uname)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from faculty where  username = ?",new String[] {uname});

        if(cursor.moveToNext()) {
            String name = cursor.getString(2);
            cursor.close();
            return name;
        }
        else
            return "no";

    }
    public int checkcount(String sub)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from q1 where  subject = ?",new String[] {sub});

        if(cursor.moveToNext()) {
            //String points = cursor.getString(1);
            int counts = cursor.getInt(2);
            cursor.close();
            return counts;
        }
        else
            return 0;

    }
    public int checkp1(String sub)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from q1 where  subject = ?",new String[] {sub});

        if(cursor.moveToNext()) {
            int points = cursor.getInt(1);
            //int count = cursor.getInt(2);
            cursor.close();
            return points;
        }
        else
            return 0;

    }
    public int checkp2(String sub1)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from q2 where  subject = ?",new String[] {sub1});

        if(cursor.moveToNext()) {
            int points = cursor.getInt(1);
            //int count = cursor.getInt(2);
            cursor.close();
            return points;
        }
        else
            return 0;

    }
    public int checkp3(String sub2)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from q3 where  subject = ?",new String[] {sub2});

        if(cursor.moveToNext()) {
            int points = cursor.getInt(1);
            //int count = cursor.getInt(2);
            cursor.close();
            return points;
        }
        else
            return 0;

    }
    public int checkp4(String sub3)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from q4 where  subject = ?",new String[] {sub3});

        if(cursor.moveToNext()) {
            int points = cursor.getInt(1);
            //int count = cursor.getInt(2);
            cursor.close();
            return points;
        }
        else
            return 0;

    }
    public int checkp5(String sub4)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from q5 where  subject = ?",new String[] {sub4});

        if(cursor.moveToNext()) {
            int points = cursor.getInt(1);
            //int count = cursor.getInt(2);
            cursor.close();
            return points;
        }
        else
            return 0;

    }
    public Cursor getjavaData()
    {
        SQLiteDatabase DB= this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("select * from student where flag=0",null);
        return cursor;
    }
    public int checkflag(String name)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from student where  username = ?",new String[] {name});

        if(cursor.moveToNext()) {
            int flag = cursor.getInt(4);
            //int count = cursor.getInt(2);
            cursor.close();
            return flag;
        }
        else
            return 0;

    }

}
