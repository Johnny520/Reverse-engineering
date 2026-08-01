// Decompiled by JEB v5.42.0.202606242140

package b.ˆʿ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS86;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class CLS56 extends SQLiteOpenHelper {
    public final HashMap FLD178;

    // 此方法包含解密的字符串
    static {
        new String("BLACKLIST");
        new String("FKZ_WX_BLACKLIST");
        new String("CREATE TABLE BLACKLIST(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, MEMBERS TEXT, BLOCKALL INTEGER, ENABLE INTEGER, TYPES TEXT, EXTRA TEXT)");
        new String("_ID");
        new String("ACCOUNT");
        new String("USERNAME");
        new String("MEMBERS");
        new String("BLOCKALL");
        new String("ENABLE");
        new String("TYPES");
        new String("EXTRA");
    }

    // 此方法包含解密的字符串
    public CLS56(Context context0) {
        super(context0, "FKZ_WX_BLACKLIST", null, 1);
        new String("ACCOUNT = ? AND USERNAME = ?");
        this.FLD178 = new HashMap();
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE BLACKLIST(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, USERNAME TEXT, MEMBERS TEXT, BLOCKALL INTEGER, ENABLE INTEGER, TYPES TEXT, EXTRA TEXT)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS BLACKLIST");
        this.onCreate(sQLiteDatabase0);
    }

    // 此方法包含解密的字符串
    public static Cursor MTH1260(SQLiteDatabase sQLiteDatabase0, String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        String s1 = CLS27.MTH904();
        return TextUtils.isEmpty(s1) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM BLACKLIST WHERE ACCOUNT = ? AND USERNAME = ?", new String[]{s1, s});
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH1261(Cursor cursor0) {
        boolean z;
        ArrayList arrayList0 = new ArrayList();
        if(cursor0 == null) {
            return arrayList0;
        }
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList1 = new ArrayList();
        if(cursor0.moveToFirst()) {
            z = false;
            do {
                CLS86 ٴـ0 = CLS56.MTH1274(cursor0);
                if(hashSet0.contains(ٴـ0.FLD346)) {
                    arrayList1.add(cursor0.getInt(cursor0.getColumnIndex("_ID")));
                    z = true;
                }
                else {
                    arrayList0.add(ٴـ0);
                }
                hashSet0.add(ٴـ0.FLD346);
            }
            while(cursor0.moveToNext());
        }
        else {
            z = false;
        }
        cursor0.close();
        if(z) {
            for(Object object0: arrayList1) {
                Integer integer0 = (Integer)object0;
                String s = CLS27.MTH904();
                if(!TextUtils.isEmpty(s)) {
                    this.getWritableDatabase().delete("BLACKLIST", "ACCOUNT=? AND _ID=?", new String[]{s, String.valueOf(integer0)});
                }
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final HashSet MTH1262() {
        HashSet hashSet0 = new HashSet();
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        String s = CLS27.MTH904();
        ArrayList arrayList0 = this.MTH1261((TextUtils.isEmpty(s) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM BLACKLIST WHERE ACCOUNT = ? AND BLOCKALL= 1 AND ENABLE = 1", new String[]{s})));
        if(arrayList0.isEmpty()) {
            return hashSet0;
        }
        for(Object object0: arrayList0) {
            hashSet0.add(((CLS86)object0).FLD346);
        }
        return hashSet0;
    }

    public final void MTH1263(String s, String s1) {
        if(!TextUtils.isEmpty(CLS27.MTH904()) && !TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            this.MTH1267(new CLS86(1, 1, s, null, s1));
        }
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH1264(int v, int v1, String s, String s1, String s2, String s3) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", CLS27.MTH904());
        contentValues0.put("USERNAME", s);
        contentValues0.put("MEMBERS", s1);
        contentValues0.put(CLS182.MTH3479(v, contentValues0, "BLOCKALL", 4100931643638600501L), v1);
        contentValues0.put("TYPES", s2);
        contentValues0.put("EXTRA", s3);
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public final void MTH1265(String s, String s1) {
        CLS86 ٴـ0 = this.MTH1275(s);
        if(CLS426.MTH6126(s)) {
            String s2 = ٴـ0.FLD345;
            if(!TextUtils.isEmpty(s2)) {
                String[] arr_s = new String[1];
                arr_s[0] = s1;
                if(CLS502.MTH6934(s2, arr_s)) {
                    String[] arr_s1 = CLS502.MTH6941(s2);
                    ArrayList arrayList0 = new ArrayList();
                    for(int v = 0; v < arr_s1.length; ++v) {
                        String s3 = arr_s1[v];
                        if(!s3.equals(s1)) {
                            arrayList0.add(s3);
                        }
                    }
                    if(arrayList0.isEmpty()) {
                        this.MTH1272(ٴـ0);
                        return;
                    }
                    ٴـ0.FLD345 = TextUtils.join(",", arrayList0);
                    this.MTH1267(ٴـ0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH1266() {
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        String s = CLS27.MTH904();
        return TextUtils.isEmpty(s) ? this.MTH1261(null) : this.MTH1261(sQLiteDatabase0.rawQuery("SELECT * FROM BLACKLIST WHERE ACCOUNT = ?", new String[]{s}));
    }

    // 此方法包含解密的字符串
    public final void MTH1267(CLS86 ٴـ0) {
        String s = ٴـ0.FLD346;
        String s1 = ٴـ0.FLD345;
        int v = ٴـ0.FLD347;
        int v1 = ٴـ0.FLD344;
        String s2 = ٴـ0.FLD349;
        String s3 = ٴـ0.FLD348;
        Cursor cursor0 = CLS56.MTH1260(this.getReadableDatabase(), s);
        if(cursor0 == null) {
            this.MTH1270(v, v1, s, s1, s2, s3);
        }
        else {
            int v2 = cursor0.getCount();
            cursor0.close();
            if(v2 > 0) {
                String s4 = CLS27.MTH904();
                if(!TextUtils.isEmpty(s4)) {
                    this.getWritableDatabase().update("BLACKLIST", CLS56.MTH1264(v, v1, s, s1, s2, s3), "ACCOUNT = ? AND USERNAME = ?", new String[]{s4, s});
                }
            }
            else {
                this.MTH1270(v, v1, s, s1, s2, s3);
            }
        }
        this.FLD178.put(ٴـ0.FLD346, ٴـ0);
    }

    public final boolean MTH1268(int v, String s) {
        try {
            CLS86 ٴـ0 = this.MTH1275(s);
            if(ٴـ0 == null || ٴـ0.FLD344 != 1 || TextUtils.isEmpty(ٴـ0.FLD349)) {
                return false;
            }
            if(ٴـ0.MTH1700(-1)) {
                return true;
            }
            switch(v) {
                case 3: {
                    return ٴـ0.MTH1700(1);
                }
                case 34: {
                    return ٴـ0.MTH1700(2);
                }
                case 0x2F: {
                    return ٴـ0.MTH1700(6);
                }
                case 0x30: {
                    return ٴـ0.MTH1700(10);
                }
                case 49: {
                    return ٴـ0.MTH1700(4);
                }
                case 50: {
                    return ٴـ0.MTH1700(9);
                }
                case 43: 
                case 62: {
                    return ٴـ0.MTH1700(3);
                }
                case 42: 
                case 66: {
                    return ٴـ0.MTH1700(5);
                }
                case 10000: 
                case 10002: {
                    return ٴـ0.MTH1700(11);
                }
                case 0x1000031: {
                    return ٴـ0.MTH1700(12);
                }
                case 99800001: {
                    return ٴـ0.MTH1700(17);
                }
                case 99900001: {
                    return ٴـ0.MTH1700(15);
                }
                case 0x19000031: {
                    return ٴـ0.MTH1700(8);
                }
                case 0x1A000031: {
                    return ٴـ0.MTH1700(7);
                }
                case 0x1A000032: {
                    return ٴـ0.MTH1700(13);
                }
                case 0x30000031: {
                    return ٴـ0.MTH1700(18);
                }
                case 1: 
                case 0x31000031: {
                    return ٴـ0.MTH1700(0);
                }
                case 0x2D000031: 
                case 0x3A000031: {
                    return ٴـ0.MTH1700(19);
                }
                default: {
                    return true;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    public final void MTH1269(String s, String s1) {
        if(TextUtils.isEmpty(CLS27.MTH904())) {
            return;
        }
        CLS86 ٴـ0 = this.MTH1275(s);
        if(ٴـ0 == null) {
            this.MTH1267(new CLS86(0, 1, s, null, s1));
            return;
        }
        if(ٴـ0.FLD344 != 1) {
            ٴـ0.FLD344 = 1;
            this.MTH1267(ٴـ0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1270(int v, int v1, String s, String s1, String s2, String s3) {
        if(TextUtils.isEmpty(CLS27.MTH904())) {
            return;
        }
        this.getWritableDatabase().insert("BLACKLIST", null, CLS56.MTH1264(v, v1, s, s1, s2, s3));
    }

    // 此方法包含解密的字符串
    public final void MTH1271(String s, String s1) {
        int v1;
        CLS86 ٴـ0 = this.MTH1275(s);
        if(ٴـ0 == null) {
            CLS27.MTH904();
            this.MTH1267(new CLS86(0, 1, s, s1, "0,1,2,3,4,5,6,9,10"));
            return;
        }
        if(CLS426.MTH6126(s)) {
            String s2 = ٴـ0.FLD345;
            int v = 1;
            if(TextUtils.isEmpty(s2)) {
                ٴـ0.FLD345 = s1;
                v1 = 1;
            }
            else {
                String[] arr_s = new String[1];
                v1 = 0;
                arr_s[0] = s1;
                if(!CLS502.MTH6934(s2, arr_s)) {
                    ٴـ0.FLD345 = CLS182.MTH3484(4100928594211820341L, CLS182.MTH3483(s2), s1);
                    v1 = 1;
                }
            }
            if(ٴـ0.FLD344 == 1) {
                v = v1;
            }
            else {
                ٴـ0.FLD344 = 1;
            }
            if(v != 0) {
                this.MTH1267(ٴـ0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1272(CLS86 ٴـ0) {
        String s = ٴـ0.FLD346;
        String s1 = CLS27.MTH904();
        if(!TextUtils.isEmpty(s1)) {
            this.getWritableDatabase().delete("BLACKLIST", "ACCOUNT = ? AND USERNAME = ?", new String[]{s1, s});
            this.FLD178.remove(s);
        }
    }

    public final boolean MTH1273(int v, String s, String s1) {
        try {
            CLS86 ٴـ0 = this.MTH1275(s);
            if(ٴـ0 == null || ٴـ0.FLD344 != 1 || CLS502.MTH6934(ٴـ0.MTH1699(), new String[]{s1})) {
                return false;
            }
            if(TextUtils.isEmpty(ٴـ0.FLD349)) {
                return false;
            }
            if(TextUtils.isEmpty(ٴـ0.FLD345) || TextUtils.isEmpty(s1) || CLS502.MTH6934(ٴـ0.FLD345, new String[]{s1})) {
                if(ٴـ0.MTH1700(-1)) {
                    return true;
                }
                switch(v) {
                    case 3: {
                        return ٴـ0.MTH1700(1);
                    }
                    case 34: {
                        return ٴـ0.MTH1700(2);
                    }
                    case 0x2F: {
                        return ٴـ0.MTH1700(6);
                    }
                    case 0x30: {
                        return ٴـ0.MTH1700(10);
                    }
                    case 49: {
                        return ٴـ0.MTH1700(4);
                    }
                    case 50: {
                        return ٴـ0.MTH1700(9);
                    }
                    case 43: 
                    case 62: {
                        return ٴـ0.MTH1700(3);
                    }
                    case 42: 
                    case 66: {
                        return ٴـ0.MTH1700(5);
                    }
                    case 10000: 
                    case 10002: {
                        return ٴـ0.MTH1700(11);
                    }
                    case 0x1000031: {
                        return ٴـ0.MTH1700(12);
                    }
                    case 99800001: {
                        return ٴـ0.MTH1700(17);
                    }
                    case 99900001: {
                        return ٴـ0.MTH1700(15);
                    }
                    case 99900003: {
                        return ٴـ0.MTH1700(16);
                    }
                    case 0x19000031: {
                        return ٴـ0.MTH1700(8);
                    }
                    case 0x1A000031: {
                        return ٴـ0.MTH1700(7);
                    }
                    case 0x1A000032: {
                        return ٴـ0.MTH1700(13);
                    }
                    case 0x30000031: {
                        return ٴـ0.MTH1700(18);
                    }
                    case 1: 
                    case 0x31000031: {
                        return ٴـ0.MTH1700(0);
                    }
                    case 0x2D000031: 
                    case 0x3A000031: {
                        return ٴـ0.MTH1700(19);
                    }
                    default: {
                        return false;
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static CLS86 MTH1274(Cursor cursor0) {
        String s = CLS182.MTH3472(4100927718038491957L, cursor0);
        cursor0.getString(cursor0.getColumnIndex("ACCOUNT"));
        String s1 = cursor0.getString(cursor0.getColumnIndex("MEMBERS"));
        String s2 = CLS182.MTH3472(4100927825412674357L, cursor0);
        return new CLS86(CLS182.MTH3490(4100927851182478133L, cursor0), CLS182.MTH3490(0x38E96C302B3CD335L, cursor0), s, s1, s2, CLS182.MTH3472(4100927919901954869L, cursor0));
    }

    public final CLS86 MTH1275(String s) {
        HashMap hashMap0 = this.FLD178;
        if(hashMap0.containsKey(s)) {
            return (CLS86)hashMap0.get(s);
        }
        Cursor cursor0 = CLS56.MTH1260(this.getReadableDatabase(), s);
        CLS86 ٴـ0 = null;
        if(cursor0 == null) {
            return null;
        }
        if(cursor0.moveToFirst()) {
            ٴـ0 = CLS56.MTH1274(cursor0);
        }
        cursor0.close();
        hashMap0.put(s, ٴـ0);
        return ٴـ0;
    }
}

