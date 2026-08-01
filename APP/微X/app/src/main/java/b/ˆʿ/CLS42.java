// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ᐧˉ.CLS182;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS42 extends SQLiteOpenHelper {
    // 此方法包含解密的字符串
    static {
        new String("ChatroomMsg");
        new String("FKZ_WX_ChatroomMsg");
        new String("CREATE TABLE ChatroomMsg(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, COUNT INTEGER, CHATROOM TEXT, LASTMESSAGE TEXT, TIME INTEGER)");
        new String("_ID");
        new String("ACCOUNT");
        new String("USERNAME");
        new String("CHATROOM");
        new String("LASTMESSAGE");
        new String("COUNT");
        new String("TIME");
    }

    // 此方法包含解密的字符串
    public CLS42(Context context0) {
        super(context0, "FKZ_WX_ChatroomMsg", null, 1);
        new String("ACCOUNT = ? AND CHATROOM = ? AND USERNAME = ?");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE ChatroomMsg(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, COUNT INTEGER, CHATROOM TEXT, LASTMESSAGE TEXT, TIME INTEGER)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS ChatroomMsg");
        this.onCreate(sQLiteDatabase0);
    }

    public final void MTH1138(int v, String s, String s1, String s2) {
        Cursor cursor0 = CLS42.MTH1148(this.getReadableDatabase(), s, s1, s2);
        if(cursor0 == null) {
            this.MTH1140(v, 0L, s, s1, s2);
            return;
        }
        int v1 = cursor0.getCount();
        cursor0.close();
        if(v1 > 0) {
            this.MTH1149(v, 0L, s, s1, s2);
            return;
        }
        this.MTH1140(v, 0L, s, s1, s2);
    }

    public final void MTH1139(int v, long v1, String s, String s1, String s2) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            Cursor cursor0 = CLS42.MTH1145(this.getReadableDatabase(), s, s1);
            if(cursor0 != null) {
                int v2 = cursor0.getCount();
                cursor0.close();
                if(v2 > 0) {
                    this.MTH1149(v, v1, s, s1, s2);
                    return;
                }
            }
            this.MTH1140(v, v1, s, s1, s2);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1140(int v, long v1, String s, String s1, String s2) {
        if(TextUtils.isEmpty(CLS27.MTH904())) {
            return;
        }
        this.getWritableDatabase().insert("ChatroomMsg", null, CLS42.MTH1143(v, v1, s, s1, s2));
    }

    // 此方法包含解密的字符串
    public final void MTH1141(String s, String s1) {
        String s2 = CLS27.MTH904();
        if(TextUtils.isEmpty(s2)) {
            return;
        }
        this.getWritableDatabase().delete("ChatroomMsg", "ACCOUNT = ? AND CHATROOM = ? AND USERNAME = ?", new String[]{s2, s, s1});
    }

    // 此方法包含解密的字符串
    public final int MTH1142(String s, String s1, String s2) {
        Cursor cursor0 = CLS42.MTH1148(this.getReadableDatabase(), s, s1, s2);
        if(cursor0 == null) {
            this.MTH1138(0, s, s1, s2);
            return 1;
        }
        if(cursor0.getCount() > 0) {
            if(cursor0.moveToFirst()) {
                int v = cursor0.getInt(cursor0.getColumnIndex("COUNT"));
                this.MTH1138(v + 1, s, s1, s2);
                cursor0.close();
                return v + 2;
            }
            cursor0.close();
            return 1;
        }
        this.MTH1138(0, s, s1, s2);
        return 1;
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH1143(int v, long v1, String s, String s1, String s2) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", CLS27.MTH904());
        contentValues0.put("USERNAME", s1);
        contentValues0.put("CHATROOM", s);
        contentValues0.put("COUNT", v);
        contentValues0.put("LASTMESSAGE", s2);
        contentValues0.put("TIME", v1);
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public final JSONArray MTH1144() {
        JSONArray jSONArray0 = new JSONArray();
        Cursor cursor0 = this.getReadableDatabase().rawQuery("SELECT * FROM ChatroomMsg", null);
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s = CLS182.MTH3472(4100913750804845365L, cursor0);
                    String s1 = CLS182.MTH3472(4100913789459551029L, cursor0);
                    long v = CLS34.MTH1076(0x38E95F662B3CD335L, cursor0);
                    String s2 = CLS182.MTH3472(4100913849589093173L, cursor0);
                    int v1 = CLS182.MTH3490(4100913901128700725L, cursor0);
                    JSONObject jSONObject0 = new JSONObject();
                    try {
                        jSONObject0.put("chatroom", s1);
                        jSONObject0.put("username", s);
                        jSONObject0.put("time", v);
                        jSONObject0.put("msg", s2);
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

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Cursor MTH1145(SQLiteDatabase sQLiteDatabase0, String s, String s1) {
        String s2 = CLS27.MTH904();
        return TextUtils.isEmpty(s2) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM ChatroomMsg WHERE ACCOUNT = ? AND CHATROOM = ? AND USERNAME = ?", new String[]{s2, s, s1});
    }

    // 此方法包含解密的字符串
    public final int MTH1146(int v, long v1, String s, String s1, String s2) {
        Cursor cursor0 = CLS42.MTH1148(this.getReadableDatabase(), s, s2, s1);
        int v2 = 0;
        if(cursor0 == null) {
            this.MTH1139(0, v1, s, s2, s1);
            return 0;
        }
        if(cursor0.getCount() > 0) {
            if(cursor0.moveToFirst()) {
                v2 = cursor0.getInt(cursor0.getColumnIndex("COUNT")) + 1;
                if(v2 <= v) {
                    this.MTH1139(v2, v1, s, s2, s1);
                }
            }
            cursor0.close();
            return v2;
        }
        this.MTH1139(0, v1, s, s2, s1);
        return 0;
    }

    // 此方法包含解密的字符串
    public final void MTH1147(JSONArray jSONArray0) {
        try {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                String s = jSONObject0.optString("chatroom");
                String s1 = jSONObject0.optString("username");
                int v1 = jSONObject0.optInt("count");
                String s2 = jSONObject0.optString("msg");
                this.MTH1139(v1, jSONObject0.optLong("time"), s, s1, s2);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Cursor MTH1148(SQLiteDatabase sQLiteDatabase0, String s, String s1, String s2) {
        String s3 = CLS27.MTH904();
        return TextUtils.isEmpty(s3) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM ChatroomMsg WHERE ACCOUNT = ? AND CHATROOM = ? AND USERNAME = ? AND LASTMESSAGE = ?", new String[]{s3, s, s1, s2});
    }

    // 此方法包含解密的字符串
    public final void MTH1149(int v, long v1, String s, String s1, String s2) {
        String s3 = CLS27.MTH904();
        if(TextUtils.isEmpty(s3)) {
            return;
        }
        this.getWritableDatabase().update("ChatroomMsg", CLS42.MTH1143(v, v1, s, s1, s2), "ACCOUNT = ? AND CHATROOM = ? AND USERNAME = ?", new String[]{s3, s, s1});
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH1150(String s, String s1) {
        Cursor cursor0 = CLS42.MTH1145(this.getReadableDatabase(), s, s1);
        ArrayList arrayList0 = new ArrayList();
        if(cursor0 == null) {
            return arrayList0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                int v = CLS182.MTH3490(4100912642703282997L, cursor0);
                String s2 = CLS182.MTH3472(4100912668473086773L, cursor0);
                if(v != 0) {
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("username", s2);
                    bundle0.putInt("count", v);
                    arrayList0.add(bundle0);
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final int MTH1151(String s, String s1) {
        int v = 0;
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            Cursor cursor0 = CLS42.MTH1148(this.getReadableDatabase(), s, "_INVITE_COUNT_", s1);
            if(cursor0 != null && cursor0.getCount() > 0) {
                if(cursor0.moveToFirst()) {
                    v = CLS182.MTH3490(4100912324875703093L, cursor0);
                }
                cursor0.close();
            }
        }
        return v;
    }
}

