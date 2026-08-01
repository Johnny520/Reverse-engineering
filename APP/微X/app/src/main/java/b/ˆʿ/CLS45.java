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

public final class CLS45 extends SQLiteOpenHelper {
    public final HashMap FLD163;

    // 此方法包含解密的字符串
    static {
        new String("_ID");
        new String("ACCOUNT");
        new String("SNSID");
        new String("FAKELIKES");
        new String("FKZ_WX_FAKELIKES");
        new String("CREATE TABLE FAKELIKES(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, SNSID INTEGER)");
    }

    // 此方法包含解密的字符串
    public CLS45(Context context0) {
        super(context0, "FKZ_WX_FAKELIKES", null, 1);
        new String("ACCOUNT = ? AND SNSID = ?");
        this.FLD163 = new HashMap();
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE FAKELIKES(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, SNSID INTEGER)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS FAKELIKES");
        this.onCreate(sQLiteDatabase0);
    }

    // 此方法包含解密的字符串
    public final void MTH1189(long v) {
        String s = CLS27.MTH904();
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.getWritableDatabase().delete("FAKELIKES", "ACCOUNT = ? AND SNSID = ?", new String[]{s, String.valueOf(v)});
        this.FLD163.remove(v);
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH1190(long v) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", CLS27.MTH904());
        contentValues0.put("SNSID", v);
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public final boolean MTH1191(long v) {
        HashMap hashMap0 = this.FLD163;
        if(hashMap0.containsKey(v)) {
            Object object0 = hashMap0.get(v);
            return Boolean.TRUE.equals(object0);
        }
        String s = CLS27.MTH904();
        boolean z = false;
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        Cursor cursor0 = this.getReadableDatabase().rawQuery("SELECT * FROM FAKELIKES WHERE ACCOUNT = ? AND SNSID = ?", new String[]{s, String.valueOf(v)});
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
}

