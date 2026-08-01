// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ᐧˉ.CLS182;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS53 extends SQLiteOpenHelper {
    // 此方法包含解密的字符串
    static {
        new String("ChatroomCheckIn");
        new String("FKZ_WX_ChatroomCheckIn");
        new String("CREATE TABLE ChatroomCheckIn(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, COUNT INTEGER, CHATROOM TEXT, TIME INTEGER)");
        new String("_ID");
        new String("ACCOUNT");
        new String("USERNAME");
        new String("CHATROOM");
        new String("COUNT");
        new String("TIME");
    }

    // 此方法包含解密的字符串
    public CLS53(Context context0) {
        super(context0, "FKZ_WX_ChatroomCheckIn", null, 1);
        new String("ACCOUNT = ? AND CHATROOM = ? AND USERNAME = ?");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE ChatroomCheckIn(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, COUNT INTEGER, CHATROOM TEXT, TIME INTEGER)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS ChatroomCheckIn");
        this.onCreate(sQLiteDatabase0);
    }

    // 此方法包含解密的字符串
    public final void MTH1232(JSONArray jSONArray0) {
        try {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                jSONObject0.getString("account");
                String s = jSONObject0.optString("chatroom");
                String s1 = jSONObject0.optString("username");
                int v1 = jSONObject0.optInt("count");
                long v2 = jSONObject0.optLong("time");
                this.getWritableDatabase().insert("ChatroomCheckIn", null, CLS53.MTH1234(v1, v2, s, s1));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final JSONArray MTH1233() {
        JSONArray jSONArray0 = new JSONArray();
        Cursor cursor0 = this.getReadableDatabase().rawQuery("SELECT * FROM ChatroomCheckIn", null);
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s = CLS182.MTH3472(4100941406099264309L, cursor0);
                    String s1 = CLS182.MTH3472(4100940894998156085L, cursor0);
                    long v = CLS34.MTH1076(4100940933652861749L, cursor0);
                    String s2 = CLS182.MTH3472(4100940955127698229L, cursor0);
                    int v1 = CLS182.MTH3490(4100940989487436597L, cursor0);
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("chatroom", s1);
                        jSONObject0.put("username", s);
                        jSONObject0.put("time", v);
                        jSONObject0.put("account", s2);
                        jSONObject0.put("count", v1);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                    jSONArray0.put(jSONObject0);
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            cursor0.close();
        }
        return jSONArray0;
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH1234(int v, long v1, String s, String s1) {
        String s2 = CLS27.MTH904();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", s2);
        contentValues0.put("USERNAME", s1);
        contentValues0.put("CHATROOM", s);
        contentValues0.put(CLS182.MTH3479(v, contentValues0, "COUNT", 4100946946607076149L), v1);
        return contentValues0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Cursor MTH1235(SQLiteDatabase sQLiteDatabase0, String s, String s1) {
        String s2 = CLS27.MTH904();
        return TextUtils.isEmpty(s2) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM ChatroomCheckIn WHERE ACCOUNT = ? AND CHATROOM = ? AND USERNAME = ?", new String[]{s2, s, s1});
    }

    // 此方法包含解密的字符串
    public final void MTH1236(int v, long v1, String s, String s1) {
        if(TextUtils.isEmpty(CLS27.MTH904())) {
            return;
        }
        this.getWritableDatabase().insert("ChatroomCheckIn", null, CLS53.MTH1234(v, v1, s, s1));
    }

    // 此方法包含解密的字符串
    public final void MTH1237(int v, long v1, String s, String s1) {
        String s2 = CLS27.MTH904();
        if(TextUtils.isEmpty(s2)) {
            return;
        }
        this.getWritableDatabase().update("ChatroomCheckIn", CLS53.MTH1234(v, v1, s, s1), "ACCOUNT = ? AND CHATROOM = ? AND USERNAME = ?", new String[]{s2, s, s1});
    }
}

