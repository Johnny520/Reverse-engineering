// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;

public final class CLS60 extends SQLiteOpenHelper {
    // 此方法包含解密的字符串
    static {
        new String("RPAN");
        new String("FKZ_WX_RPAN");
        new String("CREATE TABLE RPAN(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, AMOUNT INTEGER, SHOWN INTEGER)");
        new String("_ID");
        new String("ACCOUNT");
        new String("USERNAME");
        new String("AMOUNT");
        new String("SHOWN");
    }

    // 此方法包含解密的字符串
    public CLS60(Context context0) {
        super(context0, "FKZ_WX_RPAN", null, 1);
        new String("ACCOUNT = ? AND USERNAME = ?");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE RPAN(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, AMOUNT INTEGER, SHOWN INTEGER)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS RPAN");
        this.onCreate(sQLiteDatabase0);
    }

    public final int MTH1293(String s) {
        Cursor cursor0 = CLS60.MTH1296(this.getReadableDatabase(), s);
        int v = 0;
        if(cursor0 == null) {
            return 0;
        }
        if(cursor0.moveToFirst() && CLS182.MTH3490(4100927443160585013L, cursor0) == 0) {
            v = CLS182.MTH3490(4100927468930388789L, cursor0);
        }
        cursor0.close();
        return v;
    }

    // 此方法包含解密的字符串
    public final void MTH1294(String s, int v) {
        if(TextUtils.isEmpty(CLS27.MTH904())) {
            return;
        }
        this.getWritableDatabase().insert("RPAN", null, CLS60.MTH1295(s, v));
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH1295(String s, int v) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", CLS27.MTH904());
        contentValues0.put("USERNAME", s);
        contentValues0.put(CLS182.MTH3479(v, contentValues0, "AMOUNT", 4100927090973266741L), 0);
        return contentValues0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Cursor MTH1296(SQLiteDatabase sQLiteDatabase0, String s) {
        String s1 = CLS27.MTH904();
        return TextUtils.isEmpty(s1) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM RPAN WHERE ACCOUNT = ? AND USERNAME = ?", new String[]{s1, s});
    }

    // 此方法包含解密的字符串
    public final void MTH1297(String s, int v) {
        Cursor cursor0 = CLS60.MTH1296(this.getReadableDatabase(), s);
        if(cursor0 == null) {
            this.MTH1294(s, v);
        }
        else {
            int v1 = cursor0.getCount();
            cursor0.close();
            if(v1 <= 0) {
                this.MTH1294(s, v);
                return;
            }
            String s1 = CLS27.MTH904();
            if(!TextUtils.isEmpty(s1)) {
                this.getWritableDatabase().update("RPAN", CLS60.MTH1295(s, v), "ACCOUNT = ? AND USERNAME = ?", new String[]{s1, s});
            }
        }
    }
}

