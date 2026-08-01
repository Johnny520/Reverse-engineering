// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS91;
import b.ᐧˉ.CLS182;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public final class CLS44 extends SQLiteOpenHelper {
    public final HashMap FLD160;
    public final HashMap FLD161;
    public final HashMap FLD162;

    // 此方法包含解密的字符串
    static {
        new String("AUTORESPONSE");
        new String("FKZ_WX_AUTORESPONSE");
        new String("CREATE TABLE AUTORESPONSE(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, KEYWORD TEXT, RESPONSE TEXT, ENABLE INTEGER)");
        new String("_ID");
        new String("ACCOUNT");
        new String("KEYWORD");
        new String("RESPONSE");
        new String("ENABLE");
        new String("USERNAME");
    }

    // 此方法包含解密的字符串
    public CLS44(Context context0) {
        super(context0, "FKZ_WX_AUTORESPONSE", null, 1);
        new String("ACCOUNT = ? AND USERNAME=? AND KEYWORD = ?");
        this.FLD160 = new HashMap();
        this.FLD162 = new HashMap();
        this.FLD161 = new HashMap();
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE AUTORESPONSE(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, KEYWORD TEXT, RESPONSE TEXT, ENABLE INTEGER)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS AUTORESPONSE");
        this.onCreate(sQLiteDatabase0);
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH1171(String s, String s1) {
        Cursor cursor0;
        HashMap hashMap0 = this.FLD160;
        if(hashMap0.containsKey(s)) {
            HashMap hashMap1 = (HashMap)hashMap0.get(s);
            if(hashMap1.containsKey(s1)) {
                return (ArrayList)hashMap1.get(s1);
            }
        }
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        if(TextUtils.isEmpty(s)) {
            cursor0 = null;
        }
        else {
            String s2 = CLS27.MTH904();
            cursor0 = TextUtils.isEmpty(s2) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM AUTORESPONSE WHERE ACCOUNT = ? AND USERNAME=? AND KEYWORD = ? AND ENABLE = 1", new String[]{s2, s, s1});
        }
        if(cursor0 == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        if(cursor0.moveToFirst()) {
            while(true) {
                arrayList0.add(CLS44.MTH1183(cursor0));
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        if(hashMap0.containsKey(s)) {
            ((HashMap)hashMap0.get(s)).put(s1, arrayList0);
            return arrayList0;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(s1, arrayList0);
        hashMap0.put(s, hashMap2);
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH1172(Cursor cursor0) {
        ArrayList arrayList0 = new ArrayList();
        if(cursor0 == null) {
            return arrayList0;
        }
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList1 = new ArrayList();
        if(cursor0.moveToFirst()) {
            while(true) {
                CLS91 ᵔʾ0 = CLS44.MTH1183(cursor0);
                String s = ᵔʾ0.FLD384 + ᵔʾ0.MTH1736() + ᵔʾ0.MTH1735();
                if(hashSet0.contains(s)) {
                    arrayList1.add(cursor0.getInt(cursor0.getColumnIndex("_ID")));
                }
                else {
                    arrayList0.add(ᵔʾ0);
                }
                hashSet0.add(s);
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        for(Object object0: arrayList1) {
            int v = (int)(((Integer)object0));
            String s1 = CLS27.MTH904();
            if(!TextUtils.isEmpty(s1)) {
                this.getWritableDatabase().delete("AUTORESPONSE", "ACCOUNT=? AND _ID=?", new String[]{s1, String.valueOf(v)});
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH1173(String s) {
        Cursor cursor0;
        HashMap hashMap0 = this.FLD162;
        if(hashMap0.containsKey(s)) {
            return (ArrayList)hashMap0.get(s);
        }
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        if(TextUtils.isEmpty(s)) {
            cursor0 = null;
        }
        else {
            String s1 = CLS27.MTH904();
            cursor0 = TextUtils.isEmpty(s1) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM AUTORESPONSE WHERE ACCOUNT=? AND USERNAME=? AND KEYWORD=? AND ENABLE = 1", new String[]{s1, s, ""});
        }
        if(cursor0 == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        if(cursor0.moveToFirst()) {
            while(true) {
                arrayList0.add(CLS44.MTH1183(cursor0));
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        hashMap0.put(s, arrayList0);
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final void MTH1174(CLS91 ᵔʾ0) {
        String s = ᵔʾ0.FLD384;
        String s1 = ᵔʾ0.MTH1736();
        String s2 = ᵔʾ0.FLD383;
        String s3 = CLS27.MTH904();
        if(!TextUtils.isEmpty(s3)) {
            this.getWritableDatabase().delete("AUTORESPONSE", "ACCOUNT = ? AND USERNAME=? AND KEYWORD = ? AND RESPONSE = ?", new String[]{s3, s, s1, s2});
            this.FLD160.clear();
            this.FLD162.clear();
            this.FLD161.clear();
        }
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH1175(int v, String s, String s1, String s2) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", CLS27.MTH904());
        contentValues0.put("KEYWORD", s);
        contentValues0.put("RESPONSE", s1);
        contentValues0.put(CLS182.MTH3496(4100901922464912181L, contentValues0, s2, 4100901961119617845L), v);
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public final HashSet MTH1176(String s) {
        HashMap hashMap0 = this.FLD161;
        if(hashMap0.containsKey(s)) {
            return (HashSet)hashMap0.get(s);
        }
        HashSet hashSet0 = new HashSet();
        String s1 = CLS27.MTH904();
        if(TextUtils.isEmpty(s1)) {
            return hashSet0;
        }
        Cursor cursor0 = this.getReadableDatabase().rawQuery("SELECT * FROM AUTORESPONSE WHERE ACCOUNT = ? AND USERNAME=? AND ENABLE=1", new String[]{s1, s});
        if(cursor0 == null) {
            return hashSet0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                String s2 = CLS182.MTH3472(4100903064926212917L, cursor0);
                if(!TextUtils.isEmpty(s2) && !s2.startsWith("_LINEAR_")) {
                    hashSet0.add(s2);
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        hashMap0.put(s, hashSet0);
        return hashSet0;
    }

    // 此方法包含解密的字符串
    public final void MTH1177(int v, String s, String s1, String s2) {
        if(TextUtils.isEmpty(CLS27.MTH904())) {
            return;
        }
        this.getWritableDatabase().insert("AUTORESPONSE", null, CLS44.MTH1175(v, s, s1, s2));
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH1178(String s) {
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        Cursor cursor0 = null;
        if(!TextUtils.isEmpty(s)) {
            String s1 = CLS27.MTH904();
            if(!TextUtils.isEmpty(s1)) {
                cursor0 = sQLiteDatabase0.rawQuery("SELECT * FROM AUTORESPONSE WHERE ACCOUNT=? AND USERNAME=? AND KEYWORD!=? AND KEYWORD NOT LIKE \'_LINEAR_%\'", new String[]{s1, s, ""});
            }
        }
        return this.MTH1172(cursor0);
    }

    public static CLS91 MTH1179(ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            if(arrayList0.size() == 1) {
                return (CLS91)arrayList0.get(0);
            }
            Random random0 = new Random();
            random0.setSeed(System.currentTimeMillis());
            return (CLS91)arrayList0.get(random0.nextInt(arrayList0.size()));
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH1180(String s) {
        String s1 = CLS27.MTH904();
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        this.getWritableDatabase().delete("AUTORESPONSE", "ACCOUNT = ? AND USERNAME=?", new String[]{s1, s});
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH1181(String s) {
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        if(!TextUtils.isEmpty(s)) {
            String s1 = CLS27.MTH904();
            return TextUtils.isEmpty(s1) ? this.MTH1172(null) : this.MTH1172(sQLiteDatabase0.rawQuery("SELECT * FROM AUTORESPONSE WHERE ACCOUNT=? AND USERNAME=? AND KEYWORD=?", new String[]{s1, s, ""}));
        }
        return this.MTH1172(null);
    }

    // 此方法包含解密的字符串
    public final void MTH1182(CLS91 ᵔʾ0) {
        Cursor cursor0;
        String s = ᵔʾ0.FLD387;
        String s1 = ᵔʾ0.MTH1736();
        String s2 = ᵔʾ0.FLD383;
        String s3 = ᵔʾ0.MTH1737();
        String s4 = ᵔʾ0.FLD384;
        int v = ᵔʾ0.FLD386;
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        if(TextUtils.isEmpty(s4)) {
            cursor0 = null;
        }
        else {
            String s5 = CLS27.MTH904();
            cursor0 = TextUtils.isEmpty(s5) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM AUTORESPONSE WHERE ACCOUNT = ? AND USERNAME=? AND KEYWORD = ? AND RESPONSE=?", new String[]{s5, s4, s, s2});
        }
        if(cursor0 == null) {
            this.MTH1177(v, s1, s3, s4);
            return;
        }
        int v1 = cursor0.getCount();
        cursor0.close();
        if(v1 > 0) {
            String s6 = CLS27.MTH904();
            if(!TextUtils.isEmpty(s6)) {
                this.getWritableDatabase().update("AUTORESPONSE", CLS44.MTH1175(v, s1, s3, s4), "ACCOUNT = ? AND USERNAME=? AND KEYWORD = ? AND RESPONSE = ?", new String[]{s6, s4, s, s2});
            }
        }
        else {
            this.MTH1177(v, s1, s3, s4);
        }
        this.FLD160.clear();
        this.FLD162.clear();
        this.FLD161.clear();
    }

    // 此方法包含解密的字符串
    public static CLS91 MTH1183(Cursor cursor0) {
        cursor0.getString(cursor0.getColumnIndex("ACCOUNT"));
        String s = cursor0.getString(cursor0.getColumnIndex("KEYWORD"));
        String s1 = CLS182.MTH3472(4100899401319109429L, cursor0);
        String s2 = CLS182.MTH3472(4100899439973815093L, cursor0);
        return new CLS91(CLS182.MTH3490(4100899478628520757L, cursor0), s, s1, s2);
    }

    public final CLS91 MTH1184(String s) {
        return CLS44.MTH1179(this.MTH1173(s));
    }
}

