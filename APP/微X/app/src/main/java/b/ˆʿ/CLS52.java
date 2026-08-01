// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS52 extends SQLiteOpenHelper {
    // 此方法包含解密的字符串
    static {
        new String("RName");
        new String("FKZ_WX_RName");
        new String("CREATE TABLE RName(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, NAME TEXT)");
        new String("_ID");
        new String("USERNAME");
        new String("NAME");
    }

    // 此方法包含解密的字符串
    public CLS52(Context context0) {
        super(context0, "FKZ_WX_RName", null, 1);
        new String("USERNAME = ?");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE RName(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, NAME TEXT)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS RName");
        this.onCreate(sQLiteDatabase0);
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH1225(String s, String s1) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("USERNAME", s);
        contentValues0.put("NAME", s1);
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public final JSONArray MTH1226() {
        JSONArray jSONArray0 = new JSONArray();
        Cursor cursor0 = this.getReadableDatabase().rawQuery("SELECT * FROM RName", null);
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s = CLS182.MTH3472(4100883316666585909L, cursor0);
                    String s1 = CLS182.MTH3472(0x38E943AF2B3CD335L, cursor0);
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("u", s);
                        jSONObject0.put("n", s1);
                        jSONArray0.put(jSONObject0);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
        }
        return jSONArray0;
    }

    // 此方法包含解密的字符串
    public final void MTH1227(String s, String s1) {
        Cursor cursor0 = this.getReadableDatabase().rawQuery("SELECT * FROM RName WHERE USERNAME = ?", new String[]{s});
        if(cursor0 == null) {
            this.getWritableDatabase().insert("RName", null, CLS52.MTH1225(s, s1));
            return;
        }
        int v = cursor0.getCount();
        cursor0.close();
        if(v > 0) {
            this.getWritableDatabase().update("RName", CLS52.MTH1225(s, s1), "USERNAME = ?", new String[]{s});
            return;
        }
        this.getWritableDatabase().insert("RName", null, CLS52.MTH1225(s, s1));
    }
}

