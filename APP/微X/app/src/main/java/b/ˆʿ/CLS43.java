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
import b.ⁱᵔ.CLS502;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS43 extends SQLiteOpenHelper {
    // 此方法包含解密的字符串
    static {
        new String("ChatroomTag");
        new String("FKZ_WX_ChatroomTag");
        new String("CREATE TABLE ChatroomTag(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, TAG TEXT, CHATROOM TEXT)");
        new String("_ID");
        new String("ACCOUNT");
        new String("TAG");
        new String("CHATROOM");
    }

    // 此方法包含解密的字符串
    public CLS43(Context context0) {
        super(context0, "FKZ_WX_ChatroomTag", null, 1);
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE ChatroomTag(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, TAG TEXT, CHATROOM TEXT)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS ChatroomTag");
        this.onCreate(sQLiteDatabase0);
    }

    // 此方法包含解密的字符串
    public final void MTH1156(String s, AbstractCollection abstractCollection0) {
        HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(this.MTH1162(s))));
        for(Object object0: abstractCollection0) {
            hashSet0.remove(((String)object0));
        }
        this.MTH1158(s, TextUtils.join(",", hashSet0));
    }

    // 此方法包含解密的字符串
    public final void MTH1157(String s, String s1) {
        if(TextUtils.isEmpty(CLS27.MTH904())) {
            return;
        }
        this.getWritableDatabase().insert("ChatroomTag", null, CLS43.MTH1166(s, s1));
    }

    // 此方法包含解密的字符串
    public final void MTH1158(String s, String s1) {
        Cursor cursor0 = CLS43.MTH1161(this.getReadableDatabase(), s);
        if(cursor0 == null) {
            this.MTH1157(s, s1);
            return;
        }
        int v = cursor0.getCount();
        cursor0.close();
        if(v > 0) {
            String s2 = CLS27.MTH904();
            if(!TextUtils.isEmpty(s2)) {
                this.getWritableDatabase().update("ChatroomTag", CLS43.MTH1166(s, s1), "ACCOUNT=? AND TAG=?", new String[]{s2, s});
            }
        }
        else {
            this.MTH1157(s, s1);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1159(String s) {
        String s1 = CLS27.MTH904();
        if(!TextUtils.isEmpty(s1)) {
            this.getWritableDatabase().delete("ChatroomTag", "ACCOUNT=? AND TAG=?", new String[]{s1, s});
        }
    }

    // 此方法包含解密的字符串
    public final JSONArray MTH1160() {
        JSONArray jSONArray0 = new JSONArray();
        Cursor cursor0 = CLS43.MTH1164(this.getReadableDatabase());
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s = CLS182.MTH3472(4100896502216184629L, cursor0);
                    String s1 = CLS182.MTH3472(4100896519396053813L, cursor0);
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("t", s);
                        jSONObject0.put("c", s1);
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

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Cursor MTH1161(SQLiteDatabase sQLiteDatabase0, String s) {
        String s1 = CLS27.MTH904();
        return TextUtils.isEmpty(s1) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM ChatroomTag WHERE ACCOUNT=? AND TAG=? ", new String[]{s1, s});
    }

    // 此方法包含解密的字符串
    public final String MTH1162(String s) {
        String s1 = "";
        Cursor cursor0 = CLS43.MTH1161(this.getReadableDatabase(), s);
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            s1 = CLS182.MTH3472(0x38E94F9B2B3CD335L, cursor0);
        }
        cursor0.close();
        return s1;
    }

    // 此方法包含解密的字符串
    public final void MTH1163(JSONArray jSONArray0) {
        try {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                if(jSONObject0.has("t") || jSONObject0.has("c")) {
                    this.MTH1158(jSONObject0.getString("t"), jSONObject0.getString("c"));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Cursor MTH1164(SQLiteDatabase sQLiteDatabase0) {
        String s = CLS27.MTH904();
        return TextUtils.isEmpty(s) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM ChatroomTag WHERE ACCOUNT=?", new String[]{s});
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH1165() {
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = CLS43.MTH1164(this.getReadableDatabase());
        if(cursor0 == null) {
            return arrayList0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                arrayList0.add(cursor0.getString(cursor0.getColumnIndex("TAG")));
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        Collections.sort(arrayList0);
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH1166(String s, String s1) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", CLS27.MTH904());
        contentValues0.put("TAG", s);
        contentValues0.put("CHATROOM", s1);
        return contentValues0;
    }
}

