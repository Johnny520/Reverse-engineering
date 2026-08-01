// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import java.util.HashMap;

public final class CLS41 extends SQLiteOpenHelper {
    public final HashMap FLD158;
    public final HashMap FLD159;

    // 此方法包含解密的字符串
    static {
        new String("_ID");
        new String("ACCOUNT");
        new String("SNSID");
        new String("CREATETIMES");
        new String("FAKECOMMENTS");
        new String("FKZ_WX_FAKECOMMENTS");
        new String("CREATE TABLE FAKECOMMENTS(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, SNSID INTEGER, CREATETIMES TEXT)");
    }

    // 此方法包含解密的字符串
    public CLS41(Context context0) {
        super(context0, "FKZ_WX_FAKECOMMENTS", null, 1);
        new String("ACCOUNT = ? AND SNSID = ?");
        this.FLD158 = new HashMap();
        this.FLD159 = new HashMap();
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE FAKECOMMENTS(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, SNSID INTEGER, CREATETIMES TEXT)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS FAKECOMMENTS");
        this.onCreate(sQLiteDatabase0);
    }

    // 此方法包含解密的字符串
    public final void MTH1129(long v) {
        String s = CLS27.MTH904();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.getWritableDatabase().delete("FAKECOMMENTS", "ACCOUNT = ? AND SNSID = ?", new String[]{s, String.valueOf(v)});
    }

    // 此方法包含解密的字符串
    public final void MTH1130(long v, String s) {
        ContentValues contentValues0;
        int v1;
        String s1 = CLS27.MTH904();
        if(TextUtils.isEmpty(s1)) {
            v1 = 0;
        }
        else {
            Cursor cursor0 = this.getReadableDatabase().rawQuery("SELECT * FROM FAKECOMMENTS WHERE ACCOUNT = ? AND SNSID = ?", new String[]{s1, String.valueOf(v)});
            if(cursor0 == null) {
                v1 = 0;
            }
            else {
                v1 = cursor0.getCount();
                cursor0.close();
            }
        }
        SQLiteDatabase sQLiteDatabase0 = this.getWritableDatabase();
        HashMap hashMap0 = this.FLD158;
        HashMap hashMap1 = this.FLD159;
        switch(v1) {
            case 0: {
                contentValues0 = CLS41.MTH1133(v, s);
                sQLiteDatabase0.insert("FAKECOMMENTS", null, contentValues0);
                break;
            }
            case 1: {
                contentValues0 = CLS41.MTH1133(v, s);
                String s2 = CLS27.MTH904();
                if(!TextUtils.isEmpty(s2)) {
                    this.getWritableDatabase().update("FAKECOMMENTS", contentValues0, "ACCOUNT = ? AND SNSID = ?", new String[]{s2, String.valueOf(v)});
                }
                break;
            }
            default: {
                this.MTH1129(v);
                sQLiteDatabase0.insert("FAKECOMMENTS", null, CLS41.MTH1133(v, s));
                hashMap1.clear();
                hashMap0.clear();
                return;
            }
        }
        hashMap1.put(v, contentValues0);
        hashMap0.put(v, Boolean.TRUE);
    }

    // 此方法包含解密的字符串
    public final ContentValues MTH1131(long v) {
        HashMap hashMap0 = this.FLD159;
        if(hashMap0.containsKey(v)) {
            return (ContentValues)hashMap0.get(v);
        }
        String s = CLS27.MTH904();
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        ContentValues contentValues0 = new ContentValues();
        Cursor cursor0 = this.getReadableDatabase().rawQuery("SELECT * FROM FAKECOMMENTS WHERE ACCOUNT = ? AND SNSID = ?", new String[]{s, String.valueOf(v)});
        if(cursor0 == null) {
            return null;
        }
        if(cursor0.moveToFirst()) {
            contentValues0.put("SNSID", v);
            contentValues0.put("CREATETIMES", cursor0.getString(cursor0.getColumnIndex("CREATETIMES")));
        }
        cursor0.close();
        hashMap0.put(v, contentValues0);
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public final boolean MTH1132(long v) {
        HashMap hashMap0 = this.FLD158;
        if(hashMap0.containsKey(v)) {
            Object object0 = hashMap0.get(v);
            return Boolean.TRUE.equals(object0);
        }
        String s = CLS27.MTH904();
        boolean z = false;
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        Cursor cursor0 = this.getReadableDatabase().rawQuery("SELECT * FROM FAKECOMMENTS WHERE ACCOUNT = ? AND SNSID = ?", new String[]{s, String.valueOf(v)});
        if(cursor0 == null) {
            return false;
        }
        if(cursor0.getCount() > 0) {
            z = true;
        }
        cursor0.close();
        hashMap0.put(v, Boolean.valueOf(z));
        return z;
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH1133(long v, String s) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", CLS27.MTH904());
        contentValues0.put("SNSID", v);
        contentValues0.put("CREATETIMES", s);
        return contentValues0;
    }
}

