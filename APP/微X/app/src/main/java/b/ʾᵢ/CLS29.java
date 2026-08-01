// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Pair;
import b.ˊﾞ.CLS613;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS431;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS29 extends SQLiteOpenHelper {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS28 extends Enum {
        public static final CLS28[] FLD111;
        public static final enum CLS28 FLD112;
        public static final enum CLS28 FLD113;
        public static final enum CLS28 FLD114;
        public static final enum CLS28 FLD115;
        public static final enum CLS28 FLD116;
        public static final enum CLS28 FLD117;
        public static final enum CLS28 FLD118;
        public static final enum CLS28 FLD119;
        public static final enum CLS28 FLD120;

        static {
            String[] arr_s = CLS370.FLD3464;
            long v = CLS613.MTH1969((v1 * 0x62A9D9ED799705F5L ^ v1 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v2 = CLS613.MTH1969(v);
            int v3 = (int)(v1 >>> 0x20 ^ v >>> 0x20 & 0xFFFFL ^ v2 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v4 = CLS613.MTH1969(v2) ^ ((long)arr_s[v3 / 0x1FFF].charAt(v3 % 0x1FFF)) << 0x20;
            int v5 = (int)(v4 >>> 0x20 & 0xFFFFL);
            char[] arr_c = new char[v5];
            for(int v6 = 0; v6 < v5; ++v6) {
                int v7 = v3 + v6 + 1;
                v4 = CLS613.MTH1969(v4) ^ ((long)arr_s[v7 / 0x1FFF].charAt(v7 % 0x1FFF)) << 0x20;
                arr_c[v6] = (char)(((int)(v4 >>> 0x20 & 0xFFFFL)));
            }
            CLS28.FLD114 = new CLS28(0, new String(arr_c));
            String[] arr_s1 = CLS370.FLD3464;
            long v8 = CLS613.MTH1969((v9 * 0x62A9D9ED799705F5L ^ v9 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v10 = CLS613.MTH1969(v8);
            int v11 = (int)(v9 >>> 0x20 ^ v8 >>> 0x20 & 0xFFFFL ^ v10 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v12 = CLS613.MTH1969(v10) ^ ((long)arr_s1[v11 / 0x1FFF].charAt(v11 % 0x1FFF)) << 0x20;
            int v13 = (int)(v12 >>> 0x20 & 0xFFFFL);
            char[] arr_c1 = new char[v13];
            for(int v14 = 0; v14 < v13; ++v14) {
                int v15 = v11 + v14 + 1;
                v12 = CLS613.MTH1969(v12) ^ ((long)arr_s1[v15 / 0x1FFF].charAt(v15 % 0x1FFF)) << 0x20;
                arr_c1[v14] = (char)(((int)(v12 >>> 0x20 & 0xFFFFL)));
            }
            CLS28.FLD117 = new CLS28(1, new String(arr_c1));
            String[] arr_s2 = CLS370.FLD3464;
            long v16 = CLS613.MTH1969((v17 * 0x62A9D9ED799705F5L ^ v17 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v18 = CLS613.MTH1969(v16);
            int v19 = (int)(v17 >>> 0x20 ^ v16 >>> 0x20 & 0xFFFFL ^ v18 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v20 = CLS613.MTH1969(v18) ^ ((long)arr_s2[v19 / 0x1FFF].charAt(v19 % 0x1FFF)) << 0x20;
            int v21 = (int)(v20 >>> 0x20 & 0xFFFFL);
            char[] arr_c2 = new char[v21];
            for(int v22 = 0; v22 < v21; ++v22) {
                int v23 = v19 + v22 + 1;
                v20 = CLS613.MTH1969(v20) ^ ((long)arr_s2[v23 / 0x1FFF].charAt(v23 % 0x1FFF)) << 0x20;
                arr_c2[v22] = (char)(((int)(v20 >>> 0x20 & 0xFFFFL)));
            }
            CLS28.FLD116 = new CLS28(2, new String(arr_c2));
            String[] arr_s3 = CLS370.FLD3464;
            long v24 = CLS613.MTH1969((v25 * 0x62A9D9ED799705F5L ^ v25 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v26 = CLS613.MTH1969(v24);
            int v27 = (int)(v25 >>> 0x20 ^ v24 >>> 0x20 & 0xFFFFL ^ v26 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v28 = CLS613.MTH1969(v26) ^ ((long)arr_s3[v27 / 0x1FFF].charAt(v27 % 0x1FFF)) << 0x20;
            int v29 = (int)(v28 >>> 0x20 & 0xFFFFL);
            char[] arr_c3 = new char[v29];
            for(int v30 = 0; v30 < v29; ++v30) {
                int v31 = v27 + v30 + 1;
                v28 = CLS613.MTH1969(v28) ^ ((long)arr_s3[v31 / 0x1FFF].charAt(v31 % 0x1FFF)) << 0x20;
                arr_c3[v30] = (char)(((int)(v28 >>> 0x20 & 0xFFFFL)));
            }
            CLS28.FLD118 = new CLS28(3, new String(arr_c3));
            String[] arr_s4 = CLS370.FLD3464;
            long v32 = CLS613.MTH1969((v33 * 0x62A9D9ED799705F5L ^ v33 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v34 = CLS613.MTH1969(v32);
            int v35 = (int)(v33 >>> 0x20 ^ v32 >>> 0x20 & 0xFFFFL ^ v34 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v36 = CLS613.MTH1969(v34) ^ ((long)arr_s4[v35 / 0x1FFF].charAt(v35 % 0x1FFF)) << 0x20;
            int v37 = (int)(v36 >>> 0x20 & 0xFFFFL);
            char[] arr_c4 = new char[v37];
            for(int v38 = 0; v38 < v37; ++v38) {
                int v39 = v35 + v38 + 1;
                v36 = CLS613.MTH1969(v36) ^ ((long)arr_s4[v39 / 0x1FFF].charAt(v39 % 0x1FFF)) << 0x20;
                arr_c4[v38] = (char)(((int)(v36 >>> 0x20 & 0xFFFFL)));
            }
            CLS28.FLD115 = new CLS28(4, new String(arr_c4));
            String[] arr_s5 = CLS370.FLD3464;
            long v40 = CLS613.MTH1969((v41 * 0x62A9D9ED799705F5L ^ v41 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v42 = CLS613.MTH1969(v40);
            int v43 = (int)(v41 >>> 0x20 ^ v40 >>> 0x20 & 0xFFFFL ^ v42 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v44 = CLS613.MTH1969(v42) ^ ((long)arr_s5[v43 / 0x1FFF].charAt(v43 % 0x1FFF)) << 0x20;
            int v45 = (int)(v44 >>> 0x20 & 0xFFFFL);
            char[] arr_c5 = new char[v45];
            for(int v46 = 0; v46 < v45; ++v46) {
                int v47 = v43 + v46 + 1;
                v44 = CLS613.MTH1969(v44) ^ ((long)arr_s5[v47 / 0x1FFF].charAt(v47 % 0x1FFF)) << 0x20;
                arr_c5[v46] = (char)(((int)(v44 >>> 0x20 & 0xFFFFL)));
            }
            CLS28.FLD120 = new CLS28(5, new String(arr_c5));
            String[] arr_s6 = CLS370.FLD3464;
            long v48 = CLS613.MTH1969((v49 * 0x62A9D9ED799705F5L ^ v49 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v50 = CLS613.MTH1969(v48);
            int v51 = (int)(v49 >>> 0x20 ^ v48 >>> 0x20 & 0xFFFFL ^ v50 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v52 = CLS613.MTH1969(v50) ^ ((long)arr_s6[v51 / 0x1FFF].charAt(v51 % 0x1FFF)) << 0x20;
            int v53 = (int)(v52 >>> 0x20 & 0xFFFFL);
            char[] arr_c6 = new char[v53];
            for(int v54 = 0; v54 < v53; ++v54) {
                int v55 = v51 + v54 + 1;
                v52 = CLS613.MTH1969(v52) ^ ((long)arr_s6[v55 / 0x1FFF].charAt(v55 % 0x1FFF)) << 0x20;
                arr_c6[v54] = (char)(((int)(v52 >>> 0x20 & 0xFFFFL)));
            }
            CLS28.FLD119 = new CLS28(6, new String(arr_c6));
            String[] arr_s7 = CLS370.FLD3464;
            long v56 = CLS613.MTH1969((v57 * 0x62A9D9ED799705F5L ^ v57 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v58 = CLS613.MTH1969(v56);
            int v59 = (int)(v57 >>> 0x20 ^ v56 >>> 0x20 & 0xFFFFL ^ v58 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v60 = CLS613.MTH1969(v58) ^ ((long)arr_s7[v59 / 0x1FFF].charAt(v59 % 0x1FFF)) << 0x20;
            int v61 = (int)(v60 >>> 0x20 & 0xFFFFL);
            char[] arr_c7 = new char[v61];
            for(int v62 = 0; v62 < v61; ++v62) {
                int v63 = v59 + v62 + 1;
                v60 = CLS613.MTH1969(v60) ^ ((long)arr_s7[v63 / 0x1FFF].charAt(v63 % 0x1FFF)) << 0x20;
                arr_c7[v62] = (char)(((int)(v60 >>> 0x20 & 0xFFFFL)));
            }
            CLS28.FLD112 = new CLS28(7, new String(arr_c7));
            String[] arr_s8 = CLS370.FLD3464;
            long v64 = CLS613.MTH1969((v65 * 0x62A9D9ED799705F5L ^ v65 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v66 = CLS613.MTH1969(v64);
            int v67 = (int)(v65 >>> 0x20 ^ v64 >>> 0x20 & 0xFFFFL ^ v66 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v68 = CLS613.MTH1969(v66) ^ ((long)arr_s8[v67 / 0x1FFF].charAt(v67 % 0x1FFF)) << 0x20;
            int v69 = (int)(v68 >>> 0x20 & 0xFFFFL);
            char[] arr_c8 = new char[v69];
            for(int v70 = 0; v70 < v69; ++v70) {
                int v71 = v67 + v70 + 1;
                v68 = CLS613.MTH1969(v68) ^ ((long)arr_s8[v71 / 0x1FFF].charAt(v71 % 0x1FFF)) << 0x20;
                arr_c8[v70] = (char)(((int)(v68 >>> 0x20 & 0xFFFFL)));
            }
            CLS28.FLD113 = new CLS28(8, new String(arr_c8));
            CLS28.FLD111 = new CLS28[]{CLS28.FLD114, CLS28.FLD117, CLS28.FLD116, CLS28.FLD118, CLS28.FLD115, CLS28.FLD120, CLS28.FLD119, CLS28.FLD112, CLS28.FLD113};
        }

        public CLS28(int v, String s) {
            super(s, v);
        }

        public static CLS28 valueOf(String s) {
            return (CLS28)Enum.valueOf(CLS28.class, s);
        }

        public static CLS28[] values() {
            return (CLS28[])CLS28.FLD111.clone();
        }
    }

    public HashMap FLD121;
    public final String FLD122;
    public final boolean FLD123;
    public boolean FLD124;

    // 此方法包含解密的字符串
    static {
        new String("DATA");
        new String("FKZ_WX_DATA");
        new String("CREATE TABLE DATA(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, TAG TEXT, TYPE TEXT, VALUE TEXT, DATA BLOB)");
        new String("_ID");
        new String("ACCOUNT");
        new String("TAG");
        new String("VALUE");
        new String("TYPE");
        new String("DATA");
    }

    // 此方法包含解密的字符串
    public CLS29(Context context0, String s) {
        super(context0, "FKZ_WX_DATA", null, 1);
        this.FLD124 = false;
        this.FLD123 = true;
        this.FLD122 = s;
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE DATA(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, TAG TEXT, TYPE TEXT, VALUE TEXT, DATA BLOB)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS DATA");
        this.onCreate(sQLiteDatabase0);
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH915(String s, CLS28 ˎᵢ$ˆٴ0, Object object0) {
        String s1;
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", CLS27.MTH881());
        contentValues0.put("TAG", s);
        contentValues0.put("TYPE", ˎᵢ$ˆٴ0.toString());
        if(object0 != null) {
            if(ˎᵢ$ˆٴ0 != CLS28.FLD115 || !(object0 instanceof Long)) {
                if(ˎᵢ$ˆٴ0 == CLS28.FLD120) {
                    contentValues0.put("DATA", ((byte[])object0));
                    return contentValues0;
                }
                s1 = object0.toString();
            }
            else {
                s1 = Long.toHexString(((long)(((Long)object0))));
            }
            contentValues0.put("VALUE", s1);
        }
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public final void MTH916(String s, CLS28 ˎᵢ$ˆٴ0, Object object0) {
        String s2;
        if(this.FLD123) {
            String s1 = ˎᵢ$ˆٴ0 == CLS28.FLD115 ? Long.toHexString(((long)(((Long)object0)))) : CLS182.MTH3489(4101182293635027765L, new StringBuilder(), object0);
            try {
                s2 = CLS33.MTH1054(this.FLD122, s1);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                s2 = "";
            }
            this.MTH935(s, ˎᵢ$ˆٴ0, s2);
        }
        else {
            this.MTH935(s, ˎᵢ$ˆٴ0, object0);
        }
        if(this.FLD124) {
            this.FLD121.put(s, object0);
            return;
        }
        CLS21.FLD76.MTH819("WxDataManagerSet", new Object[]{s, object0});
    }

    // 此方法包含解密的字符串
    public static Cursor MTH917(SQLiteDatabase sQLiteDatabase0, String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        String s1 = CLS27.MTH881();
        return TextUtils.isEmpty(s1) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM DATA WHERE ACCOUNT=? AND TAG=? ", new String[]{s1, s});
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Cursor MTH918(SQLiteDatabase sQLiteDatabase0, String s) {
        String s1 = CLS27.MTH881();
        return TextUtils.isEmpty(s1) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM DATA WHERE ACCOUNT=? AND TAG LIKE ? ", new String[]{s1, s});
    }

    // 此方法包含解密的字符串
    public final String MTH919(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS33.MTH1055(this.FLD122, s);
        if(TextUtils.isEmpty(s1)) {
            String[] arr_s = CLS27.MTH882("sigs").split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                s1 = CLS33.MTH1055(CLS431.MTH6160((arr_s[v] + "9n4hZkF")), s);
                if(!TextUtils.isEmpty(s1)) {
                    break;
                }
            }
        }
        return s1;
    }

    public final double MTH920(String s) {
        try {
            Object object0 = this.MTH939(1.0, s);
            if(object0 instanceof String) {
                return Double.parseDouble(((String)object0));
            }
            return object0 == null ? 1.0 : ((double)(((Double)object0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return 1.0;
        }
    }

    public final JSONObject MTH921(String s) {
        return this.MTH924(s, new JSONObject());
    }

    // 此方法包含解密的字符串
    public final void MTH922(Object object0, String s) {
        CLS28 ˎᵢ$ˆٴ0;
        try {
            if(object0 instanceof Long) {
                ˎᵢ$ˆٴ0 = CLS28.FLD115;
            }
            else if(object0 instanceof String) {
                ˎᵢ$ˆٴ0 = CLS28.FLD114;
            }
            else if(object0 instanceof Integer) {
                ˎᵢ$ˆٴ0 = CLS28.FLD117;
            }
            else if(object0 instanceof Boolean) {
                ˎᵢ$ˆٴ0 = CLS28.FLD116;
            }
            else if(object0 instanceof Double) {
                ˎᵢ$ˆٴ0 = CLS28.FLD118;
            }
            else if(object0 instanceof Float) {
                ˎᵢ$ˆٴ0 = CLS28.FLD113;
            }
            else if(object0 instanceof Byte[]) {
                ˎᵢ$ˆٴ0 = CLS28.FLD120;
            }
            else if(object0 instanceof JSONObject) {
                ˎᵢ$ˆٴ0 = CLS28.FLD119;
            }
            else if(object0 instanceof JSONArray) {
                ˎᵢ$ˆٴ0 = CLS28.FLD112;
            }
            else {
                ˎᵢ$ˆٴ0 = CLS28.FLD114;
            }
            this.MTH916(s, ˎᵢ$ˆٴ0, object0);
        }
        catch(Throwable throwable0) {
            if(!this.FLD124) {
                CLS21.FLD76.MTH819("WxDataManagerSet2", new Object[]{s, object0});
            }
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH923(JSONArray jSONArray0) {
        try {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                if(!jSONObject0.has("c")) {
                    return;
                }
                String s = jSONObject0.getString("n");
                if(!CLS29.MTH930(s)) {
                    String s1 = jSONObject0.getString("c");
                    if(s1.endsWith("String")) {
                        this.MTH922(jSONObject0.getString("v"), s);
                    }
                    else if(s1.endsWith("Integer")) {
                        this.MTH922(jSONObject0.getInt("v"), s);
                    }
                    else if(s1.endsWith("Boolean")) {
                        this.MTH922(Boolean.valueOf(jSONObject0.getBoolean("v")), s);
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final JSONObject MTH924(String s, JSONObject jSONObject0) {
        try {
            Object object0 = this.MTH939(jSONObject0, s);
            if(object0 instanceof String) {
                return new JSONObject(((String)object0));
            }
            return object0 == null ? jSONObject0 : ((JSONObject)object0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return jSONObject0;
        }
    }

    // 此方法包含解密的字符串
    public final String MTH925(String s, String s1) {
        try {
            if(s1 == null) {
                s1 = "";
            }
            String s2 = (String)this.MTH939(s1, s);
            return TextUtils.isEmpty(s2) ? s1 : s2;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return s1;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH926(String s, CLS28 ˎᵢ$ˆٴ0, Object object0) {
        if(TextUtils.isEmpty(CLS27.MTH881())) {
            return;
        }
        this.getWritableDatabase().insert("DATA", null, CLS29.MTH915(s, ˎᵢ$ˆٴ0, object0));
    }

    public final int MTH927(int v, String s) {
        try {
            Object object0 = this.MTH939(v, s);
            if(object0 instanceof String) {
                return Integer.parseInt(((String)object0));
            }
            return object0 == null ? v : ((int)(((Integer)object0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return v;
        }
    }

    public final boolean MTH928(String s) {
        boolean z = true;
        if(this.FLD121.containsKey(s)) {
            return true;
        }
        Cursor cursor0 = CLS29.MTH917(this.getReadableDatabase(), s);
        if(cursor0 == null) {
            return false;
        }
        if(cursor0.getCount() <= 0) {
            z = false;
        }
        cursor0.close();
        return z;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH929(String s) {
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = CLS29.MTH918(sQLiteDatabase0, s);
        if(cursor0 == null) {
            return arrayList0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                try {
                label_6:
                    String s1 = cursor0.getString(cursor0.getColumnIndex("TAG"));
                    String s2 = cursor0.getString(cursor0.getColumnIndex("VALUE"));
                    if(this.FLD123) {
                        s2 = this.MTH919(s2);
                    }
                    arrayList0.add(Pair.create(s1, s2));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                if(cursor0.moveToNext()) {
                    goto label_6;
                }
                break;
            }
        }
        cursor0.close();
        return arrayList0;
    }

    // 去混淆评级： 高(340)
    // 此方法包含解密的字符串
    public static boolean MTH930(String s) {
        return s.startsWith("urls") ? true : CLS502.MTH6943(s, new String[]{"verifier6", "verifier6_time", "params_S6", "LIC", "fp", "fp_async", "xv_verifier6", "offline_time", "valid", "system_app_check", "last_update_check", "push_msg", "usedKeys", "backup_time", "s_valid"});
    }

    public final float MTH931(String s) {
        try {
            Object object0 = this.MTH939(1.0f, s);
            if(object0 instanceof String) {
                return Float.parseFloat(((String)object0));
            }
            return object0 == null ? 1.0f : ((float)(((Float)object0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return 1.0f;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH932(String s) {
        try {
            String s1 = CLS27.MTH881();
            if(!TextUtils.isEmpty(s1)) {
                this.getWritableDatabase().delete("DATA", "ACCOUNT=? AND TAG=?", new String[]{s1, s});
                this.FLD121.remove(s);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final void MTH933(String s) {
        this.MTH922(((int)(this.MTH927(0, s) + 1)), s);
    }

    // 此方法包含解密的字符串
    public final void MTH934(JSONArray jSONArray0, boolean z) {
        for(int v = 0; true; ++v) {
            try {
                if(v >= jSONArray0.length()) {
                    break;
                }
                JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                String s = jSONObject0.getString("t");
                if(!CLS29.MTH930(s)) {
                    String s1 = jSONObject0.getString("v");
                    if(z) {
                        try {
                            s1 = CLS33.MTH1054(this.FLD122, s1);
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                            s1 = "";
                        }
                    }
                    this.MTH935(s, CLS28.valueOf(jSONObject0.getString("x")), s1);
                    this.FLD121.remove(s);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                break;
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH935(String s, CLS28 ˎᵢ$ˆٴ0, Object object0) {
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        String s1 = CLS27.MTH881();
        Cursor cursor0 = TextUtils.isEmpty(s1) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM DATA WHERE ACCOUNT=? AND TAG=? AND TYPE=?", new String[]{s1, s, ˎᵢ$ˆٴ0.toString()});
        if(cursor0 == null) {
            this.MTH926(s, ˎᵢ$ˆٴ0, object0);
            return;
        }
        int v = cursor0.getCount();
        cursor0.close();
        if(v > 1) {
            this.MTH932(s);
            this.MTH926(s, ˎᵢ$ˆٴ0, object0);
            return;
        }
        if(v > 0) {
            String s2 = CLS27.MTH881();
            if(!TextUtils.isEmpty(s2)) {
                this.getWritableDatabase().update("DATA", CLS29.MTH915(s, ˎᵢ$ˆٴ0, object0), "ACCOUNT=? AND TAG=?", new String[]{s2, s});
            }
        }
        else {
            this.MTH926(s, ˎᵢ$ˆٴ0, object0);
        }
    }

    public final long MTH936(long v, String s) {
        try {
            Object object0 = this.MTH939(v, s);
            if(object0 instanceof String) {
                return Long.parseLong(((String)object0));
            }
            return object0 == null ? v : ((long)(((Long)object0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return v;
        }
    }

    public final JSONArray MTH937(String s, JSONArray jSONArray0) {
        try {
            Object object0 = this.MTH939(jSONArray0, s);
            if(object0 instanceof String) {
                return new JSONArray(((String)object0));
            }
            return object0 == null ? jSONArray0 : ((JSONArray)object0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return jSONArray0;
        }
    }

    public final boolean MTH938(String s, boolean z) {
        try {
            Object object0 = this.MTH939(Boolean.valueOf(z), s);
            if(object0 instanceof String) {
                return Boolean.parseBoolean(((String)object0));
            }
            return object0 == null ? z : ((Boolean)object0).booleanValue();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return z;
        }
    }

    // 此方法包含解密的字符串
    public final Object MTH939(Object object0, String s) {
        JSONObject jSONObject1;
        String s4;
        Cursor cursor1;
        Object object2;
        JSONObject jSONObject0;
        String s2;
        Cursor cursor0;
        if(this.FLD123) {
            if(this.FLD121.containsKey(s)) {
                return this.FLD121.get(s);
            }
            Object object1 = CLS27.MTH888(s);
            if(object1 == null) {
                object1 = object0;
            }
            try {
                cursor0 = CLS29.MTH917(this.getReadableDatabase(), s);
                if(cursor0 == null) {
                    return object1;
                }
                if(cursor0.getCount() > 0 && cursor0.moveToFirst()) {
                    String s1 = cursor0.getString(cursor0.getColumnIndex("TYPE"));
                    s2 = this.MTH919(cursor0.getString(cursor0.getColumnIndex("VALUE")));
                    if(TextUtils.isEmpty(s1)) {
                        s1 = "STRING";
                    }
                    switch(CLS28.valueOf(s1).ordinal()) {
                        case 1: {
                            object1 = Integer.valueOf(s2);
                            break;
                        }
                        case 2: {
                            object1 = Boolean.valueOf(s2);
                            break;
                        }
                        case 3: {
                            object1 = Double.valueOf(s2);
                            break;
                        }
                        case 4: {
                            object1 = Long.parseLong(s2, 16);
                            break;
                        }
                        case 5: {
                            object1 = cursor0.getBlob(cursor0.getColumnIndex("DATA"));
                            break;
                        }
                        case 6: {
                            jSONObject0 = new JSONObject(s2);
                            object1 = jSONObject0;
                            break;
                        }
                        case 7: {
                            jSONObject0 = new JSONArray(s2);
                            object1 = jSONObject0;
                            break;
                        }
                        case 8: {
                            goto label_36;
                        }
                        default: {
                            object1 = s2;
                        }
                    }
                }
                goto label_37;
            }
            catch(Throwable throwable0) {
                object2 = CLS21.FLD76.MTH836("WxDataManagerGet", new Object[]{s, object0});
                CLS27.MTH893(throwable0);
                this.FLD121.put(s, object2);
                return object2;
            }
            try {
                jSONObject0 = new JSONObject(s2);
                object1 = jSONObject0;
                goto label_37;
            }
            catch(Throwable throwable1) {
                try {
                    CLS27.MTH893(throwable1);
                    goto label_37;
                label_36:
                    object1 = Float.valueOf(s2);
                label_37:
                    if(!cursor0.isClosed()) {
                        cursor0.close();
                    }
                    object2 = object1;
                    goto label_44;
                }
                catch(Throwable throwable0) {
                }
            }
            object2 = CLS21.FLD76.MTH836("WxDataManagerGet", new Object[]{s, object0});
            CLS27.MTH893(throwable0);
        label_44:
            this.FLD121.put(s, object2);
            return object2;
        }
        if(this.FLD121.containsKey(s)) {
            return this.FLD121.get(s);
        }
        byte[] arr_b = CLS27.MTH888(s);
        if(arr_b == null) {
            arr_b = object0;
        }
        try {
            cursor1 = CLS29.MTH917(this.getReadableDatabase(), s);
            if(cursor1 == null) {
                return arr_b;
            }
            if(cursor1.getCount() > 0 && cursor1.moveToFirst()) {
                String s3 = cursor1.getString(cursor1.getColumnIndex("TYPE"));
                s4 = cursor1.getString(cursor1.getColumnIndex("VALUE"));
                if(TextUtils.isEmpty(s3)) {
                    s3 = "STRING";
                }
                switch(CLS28.valueOf(s3).ordinal()) {
                    case 1: {
                        arr_b = Integer.valueOf(s4);
                        break;
                    }
                    case 2: {
                        arr_b = Boolean.valueOf(s4);
                        break;
                    }
                    case 3: {
                        arr_b = Double.valueOf(s4);
                        break;
                    }
                    case 4: {
                        arr_b = Long.parseLong(s4, 16);
                        break;
                    }
                    case 5: {
                        arr_b = cursor1.getBlob(cursor1.getColumnIndex("DATA"));
                        break;
                    }
                    case 6: {
                        jSONObject1 = new JSONObject(s4);
                        arr_b = jSONObject1;
                        break;
                    }
                    case 7: {
                        jSONObject1 = new JSONArray(s4);
                        arr_b = jSONObject1;
                        break;
                    }
                    case 8: {
                        goto label_81;
                    }
                    default: {
                        arr_b = s4;
                    }
                }
            }
            goto label_82;
        }
        catch(Throwable throwable2) {
            goto label_86;
        }
        try {
            jSONObject1 = new JSONObject(s4);
            arr_b = jSONObject1;
            goto label_82;
        }
        catch(Throwable throwable3) {
            try {
                CLS27.MTH893(throwable3);
                goto label_82;
            label_81:
                arr_b = Float.valueOf(s4);
            label_82:
                if(!cursor1.isClosed()) {
                    cursor1.close();
                }
                goto label_89;
            }
            catch(Throwable throwable2) {
            }
        }
    label_86:
        Object object3 = CLS21.FLD76.MTH836("WxDataManagerGet", new Object[]{s, object0});
        CLS27.MTH893(throwable2);
        arr_b = object3;
    label_89:
        this.FLD121.put(s, arr_b);
        return arr_b;
    }

    // 此方法包含解密的字符串
    public final JSONArray MTH940() {
        JSONArray jSONArray0 = new JSONArray();
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        String s = CLS27.MTH881();
        Cursor cursor0 = TextUtils.isEmpty(s) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM DATA WHERE ACCOUNT=?", new String[]{s});
        if(cursor0 == null) {
            return jSONArray0;
        }
        if(cursor0.moveToFirst()) {
            while(true) {
                String s1 = CLS182.MTH3472(0x38EA50AD2B3CD335L, cursor0);
                String s2 = CLS182.MTH3472(4101179132539097909L, cursor0);
                String s3 = CLS182.MTH3472(4101179158308901685L, cursor0);
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    if(!CLS29.MTH930(s1)) {
                        jSONObject0.put("t", s1);
                        jSONObject0.put("v", s2);
                        jSONObject0.put("x", s3);
                        jSONArray0.put(jSONObject0);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        cursor0.close();
        return jSONArray0;
    }
}

