// Decompiled by JEB v5.42.0.202606242140

package p.pkg8;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p.pkg1.CLS1;
import p.pkg5.CLS30;

public final class CLS51 extends SQLiteOpenHelper {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS50 extends Enum {
        public static final enum CLS50 FLD343;
        public static final enum CLS50 FLD344;
        public static final enum CLS50 FLD345;
        public static final CLS50[] FLD346;
        public static final enum CLS50 FLD347;
        public static final enum CLS50 FLD348;
        public static final enum CLS50 FLD349;
        public static final enum CLS50 FLD350;
        public static final enum CLS50 FLD351;

        static {
            String[] arr_s = CLS1.FLD14;
            long v = CLS1.MTH397((v1 * 0x62A9D9ED799705F5L ^ v1 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v2 = CLS1.MTH397(v);
            int v3 = (int)(v1 >>> 0x20 ^ v >>> 0x20 & 0xFFFFL ^ v2 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v4 = CLS1.MTH397(v2) ^ ((long)arr_s[v3 / 0x1FFF].charAt(v3 % 0x1FFF)) << 0x20;
            int v5 = (int)(v4 >>> 0x20 & 0xFFFFL);
            char[] arr_c = new char[v5];
            for(int v6 = 0; v6 < v5; ++v6) {
                int v7 = v3 + v6 + 1;
                v4 = CLS1.MTH397(v4) ^ ((long)arr_s[v7 / 0x1FFF].charAt(v7 % 0x1FFF)) << 0x20;
                arr_c[v6] = (char)(((int)(v4 >>> 0x20 & 0xFFFFL)));
            }
            CLS50.FLD347 = new CLS50(new String(arr_c), 0);
            String[] arr_s1 = CLS1.FLD14;
            long v8 = CLS1.MTH397((v9 * 0x62A9D9ED799705F5L ^ v9 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v10 = CLS1.MTH397(v8);
            int v11 = (int)(v9 >>> 0x20 ^ v8 >>> 0x20 & 0xFFFFL ^ v10 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v12 = CLS1.MTH397(v10) ^ ((long)arr_s1[v11 / 0x1FFF].charAt(v11 % 0x1FFF)) << 0x20;
            int v13 = (int)(v12 >>> 0x20 & 0xFFFFL);
            char[] arr_c1 = new char[v13];
            for(int v14 = 0; v14 < v13; ++v14) {
                int v15 = v11 + v14 + 1;
                v12 = CLS1.MTH397(v12) ^ ((long)arr_s1[v15 / 0x1FFF].charAt(v15 % 0x1FFF)) << 0x20;
                arr_c1[v14] = (char)(((int)(v12 >>> 0x20 & 0xFFFFL)));
            }
            CLS50.FLD351 = new CLS50(new String(arr_c1), 1);
            String[] arr_s2 = CLS1.FLD14;
            long v16 = CLS1.MTH397((v17 * 0x62A9D9ED799705F5L ^ v17 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v18 = CLS1.MTH397(v16);
            int v19 = (int)(v17 >>> 0x20 ^ v16 >>> 0x20 & 0xFFFFL ^ v18 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v20 = CLS1.MTH397(v18) ^ ((long)arr_s2[v19 / 0x1FFF].charAt(v19 % 0x1FFF)) << 0x20;
            int v21 = (int)(v20 >>> 0x20 & 0xFFFFL);
            char[] arr_c2 = new char[v21];
            for(int v22 = 0; v22 < v21; ++v22) {
                int v23 = v19 + v22 + 1;
                v20 = CLS1.MTH397(v20) ^ ((long)arr_s2[v23 / 0x1FFF].charAt(v23 % 0x1FFF)) << 0x20;
                arr_c2[v22] = (char)(((int)(v20 >>> 0x20 & 0xFFFFL)));
            }
            CLS50.FLD349 = new CLS50(new String(arr_c2), 2);
            String[] arr_s3 = CLS1.FLD14;
            long v24 = CLS1.MTH397((v25 * 0x62A9D9ED799705F5L ^ v25 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v26 = CLS1.MTH397(v24);
            int v27 = (int)(v25 >>> 0x20 ^ v24 >>> 0x20 & 0xFFFFL ^ v26 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v28 = CLS1.MTH397(v26) ^ ((long)arr_s3[v27 / 0x1FFF].charAt(v27 % 0x1FFF)) << 0x20;
            int v29 = (int)(v28 >>> 0x20 & 0xFFFFL);
            char[] arr_c3 = new char[v29];
            for(int v30 = 0; v30 < v29; ++v30) {
                int v31 = v27 + v30 + 1;
                v28 = CLS1.MTH397(v28) ^ ((long)arr_s3[v31 / 0x1FFF].charAt(v31 % 0x1FFF)) << 0x20;
                arr_c3[v30] = (char)(((int)(v28 >>> 0x20 & 0xFFFFL)));
            }
            CLS50.FLD343 = new CLS50(new String(arr_c3), 3);
            String[] arr_s4 = CLS1.FLD14;
            long v32 = CLS1.MTH397((v33 * 0x62A9D9ED799705F5L ^ v33 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v34 = CLS1.MTH397(v32);
            int v35 = (int)(v33 >>> 0x20 ^ v32 >>> 0x20 & 0xFFFFL ^ v34 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v36 = CLS1.MTH397(v34) ^ ((long)arr_s4[v35 / 0x1FFF].charAt(v35 % 0x1FFF)) << 0x20;
            int v37 = (int)(v36 >>> 0x20 & 0xFFFFL);
            char[] arr_c4 = new char[v37];
            for(int v38 = 0; v38 < v37; ++v38) {
                int v39 = v35 + v38 + 1;
                v36 = CLS1.MTH397(v36) ^ ((long)arr_s4[v39 / 0x1FFF].charAt(v39 % 0x1FFF)) << 0x20;
                arr_c4[v38] = (char)(((int)(v36 >>> 0x20 & 0xFFFFL)));
            }
            CLS50.FLD345 = new CLS50(new String(arr_c4), 4);
            String[] arr_s5 = CLS1.FLD14;
            long v40 = CLS1.MTH397((v41 * 0x62A9D9ED799705F5L ^ v41 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v42 = CLS1.MTH397(v40);
            int v43 = (int)(v41 >>> 0x20 ^ v40 >>> 0x20 & 0xFFFFL ^ v42 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v44 = CLS1.MTH397(v42) ^ ((long)arr_s5[v43 / 0x1FFF].charAt(v43 % 0x1FFF)) << 0x20;
            int v45 = (int)(v44 >>> 0x20 & 0xFFFFL);
            char[] arr_c5 = new char[v45];
            for(int v46 = 0; v46 < v45; ++v46) {
                int v47 = v43 + v46 + 1;
                v44 = CLS1.MTH397(v44) ^ ((long)arr_s5[v47 / 0x1FFF].charAt(v47 % 0x1FFF)) << 0x20;
                arr_c5[v46] = (char)(((int)(v44 >>> 0x20 & 0xFFFFL)));
            }
            CLS50.FLD344 = new CLS50(new String(arr_c5), 5);
            String[] arr_s6 = CLS1.FLD14;
            long v48 = CLS1.MTH397((v49 * 0x62A9D9ED799705F5L ^ v49 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v50 = CLS1.MTH397(v48);
            int v51 = (int)(v49 >>> 0x20 ^ v48 >>> 0x20 & 0xFFFFL ^ v50 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v52 = CLS1.MTH397(v50) ^ ((long)arr_s6[v51 / 0x1FFF].charAt(v51 % 0x1FFF)) << 0x20;
            int v53 = (int)(v52 >>> 0x20 & 0xFFFFL);
            char[] arr_c6 = new char[v53];
            for(int v54 = 0; v54 < v53; ++v54) {
                int v55 = v51 + v54 + 1;
                v52 = CLS1.MTH397(v52) ^ ((long)arr_s6[v55 / 0x1FFF].charAt(v55 % 0x1FFF)) << 0x20;
                arr_c6[v54] = (char)(((int)(v52 >>> 0x20 & 0xFFFFL)));
            }
            CLS50.FLD350 = new CLS50(new String(arr_c6), 6);
            String[] arr_s7 = CLS1.FLD14;
            long v56 = CLS1.MTH397((v57 * 0x62A9D9ED799705F5L ^ v57 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v58 = CLS1.MTH397(v56);
            int v59 = (int)(v57 >>> 0x20 ^ v56 >>> 0x20 & 0xFFFFL ^ v58 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v60 = CLS1.MTH397(v58) ^ ((long)arr_s7[v59 / 0x1FFF].charAt(v59 % 0x1FFF)) << 0x20;
            int v61 = (int)(v60 >>> 0x20 & 0xFFFFL);
            char[] arr_c7 = new char[v61];
            for(int v62 = 0; v62 < v61; ++v62) {
                int v63 = v59 + v62 + 1;
                v60 = CLS1.MTH397(v60) ^ ((long)arr_s7[v63 / 0x1FFF].charAt(v63 % 0x1FFF)) << 0x20;
                arr_c7[v62] = (char)(((int)(v60 >>> 0x20 & 0xFFFFL)));
            }
            CLS50.FLD348 = new CLS50(new String(arr_c7), 7);
            CLS50.FLD346 = new CLS50[]{CLS50.FLD347, CLS50.FLD351, CLS50.FLD349, CLS50.FLD343, CLS50.FLD345, CLS50.FLD344, CLS50.FLD350, CLS50.FLD348};
        }

        public CLS50(String s, int v) {
            super(s, v);
        }

        public static CLS50 valueOf(String s) {
            return (CLS50)Enum.valueOf(CLS50.class, s);
        }

        public static CLS50[] values() {
            return (CLS50[])CLS50.FLD346.clone();
        }
    }

    public boolean FLD352;
    public HashMap FLD353;
    public final String FLD354;
    public final boolean FLD355;

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
    public CLS51(Context context0, String s) {
        super(context0, "FKZ_WX_DATA", null, 1);
        this.FLD352 = false;
        this.FLD355 = true;
        this.FLD354 = s;
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
    public static ContentValues MTH922(String s, CLS50 ٴﹶ$ٴʼ0, String s1) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", CLS44.MTH889());
        contentValues0.put("TAG", s);
        contentValues0.put("TYPE", ٴﹶ$ٴʼ0.toString());
        if(s1 != null) {
            if(ٴﹶ$ٴʼ0 == CLS50.FLD345) {
                contentValues0.put("VALUE", Long.toHexString(((long)(((Long)s1)))));
                return contentValues0;
            }
            if(ٴﹶ$ٴʼ0 == CLS50.FLD344) {
                contentValues0.put("DATA", ((byte[])s1));
                return contentValues0;
            }
            contentValues0.put("VALUE", s1.toString());
        }
        return contentValues0;
    }

    // 此方法包含解密的字符串
    public final void MTH923(String s, CLS50 ٴﹶ$ٴʼ0, String s1) {
        if(TextUtils.isEmpty(CLS44.MTH889())) {
            return;
        }
        this.getWritableDatabase().insert("DATA", null, CLS51.MTH922(s, ٴﹶ$ٴʼ0, s1));
    }

    public final String MTH924(String s, String s1) {
        try {
            String s2 = (String)this.MTH930(s1, s);
            return TextUtils.isEmpty(s2) ? s1 : s2;
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
            return s1;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH925(String s, CLS50 ٴﹶ$ٴʼ0, String s1) {
        String s3;
        if(this.FLD355) {
            String s2 = ٴﹶ$ٴʼ0 == CLS50.FLD345 ? Long.toHexString(((long)(((Long)s1)))) : "" + s1;
            try {
                s3 = CLS56.MTH955(this.FLD354, s2);
            }
            catch(Throwable throwable0) {
                CLS44.MTH897(throwable0);
                s3 = "";
            }
            this.MTH929(s, ٴﹶ$ٴʼ0, s3);
        }
        else {
            this.MTH929(s, ٴﹶ$ٴʼ0, s1);
        }
        if(this.FLD352) {
            this.FLD353.put(s, s1);
            return;
        }
        CLS53.FLD362.MTH937("WxDataManagerSet", new Object[]{s, s1});
    }

    // 此方法包含解密的字符串
    public final String MTH926(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS56.MTH953(this.FLD354, s);
        if(TextUtils.isEmpty(s1)) {
            String[] arr_s = CLS44.MTH888("sigs").split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                s1 = CLS56.MTH953(CLS30.MTH833((arr_s[v] + "9n4hZkF")), s);
                if(!TextUtils.isEmpty(s1)) {
                    break;
                }
            }
        }
        return s1;
    }

    // 此方法包含解密的字符串
    public final void MTH927(String s, String s1) {
        CLS50 ٴﹶ$ٴʼ0;
        try {
            if(s instanceof Long) {
                ٴﹶ$ٴʼ0 = CLS50.FLD345;
            }
            else if(s instanceof String) {
                ٴﹶ$ٴʼ0 = CLS50.FLD347;
            }
            else if(s instanceof Integer) {
                ٴﹶ$ٴʼ0 = CLS50.FLD351;
            }
            else if(s instanceof Boolean) {
                ٴﹶ$ٴʼ0 = CLS50.FLD349;
            }
            else if(s instanceof Double) {
                ٴﹶ$ٴʼ0 = CLS50.FLD343;
            }
            else if(s instanceof Byte[]) {
                ٴﹶ$ٴʼ0 = CLS50.FLD344;
            }
            else if(s instanceof JSONObject) {
                ٴﹶ$ٴʼ0 = CLS50.FLD350;
            }
            else if(s instanceof JSONArray) {
                ٴﹶ$ٴʼ0 = CLS50.FLD348;
            }
            else {
                ٴﹶ$ٴʼ0 = CLS50.FLD347;
            }
            this.MTH925(s1, ٴﹶ$ٴʼ0, s);
        }
        catch(Throwable throwable0) {
            if(!this.FLD352) {
                CLS53.FLD362.MTH937("WxDataManagerSet2", new Object[]{s1, s});
            }
            CLS44.MTH897(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static Cursor MTH928(SQLiteDatabase sQLiteDatabase0, String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        String s1 = CLS44.MTH889();
        return TextUtils.isEmpty(s1) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM DATA WHERE ACCOUNT=? AND TAG=? ", new String[]{s1, s});
    }

    // 此方法包含解密的字符串
    public final void MTH929(String s, CLS50 ٴﹶ$ٴʼ0, String s1) {
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        String s2 = CLS44.MTH889();
        Cursor cursor0 = TextUtils.isEmpty(s2) ? null : sQLiteDatabase0.rawQuery("SELECT * FROM DATA WHERE ACCOUNT=? AND TAG=? AND TYPE=?", new String[]{s2, s, ٴﹶ$ٴʼ0.toString()});
        if(cursor0 == null) {
            this.MTH923(s, ٴﹶ$ٴʼ0, s1);
            return;
        }
        int v = cursor0.getCount();
        cursor0.close();
        if(v > 1) {
            try {
                String s3 = CLS44.MTH889();
                if(!TextUtils.isEmpty(s3)) {
                    this.getWritableDatabase().delete("DATA", "ACCOUNT=? AND TAG=?", new String[]{s3, s});
                    this.FLD353.remove(s);
                }
            }
            catch(Throwable throwable0) {
                CLS44.MTH897(throwable0);
            }
            this.MTH923(s, ٴﹶ$ٴʼ0, s1);
            return;
        }
        if(v > 0) {
            String s4 = CLS44.MTH889();
            if(!TextUtils.isEmpty(s4)) {
                this.getWritableDatabase().update("DATA", CLS51.MTH922(s, ٴﹶ$ٴʼ0, s1), "ACCOUNT=? AND TAG=?", new String[]{s4, s});
            }
        }
        else {
            this.MTH923(s, ٴﹶ$ٴʼ0, s1);
        }
    }

    // 此方法包含解密的字符串
    public final Object MTH930(Object object0, String s) {
        JSONObject jSONObject1;
        byte[] arr_b;
        Cursor cursor1;
        JSONObject jSONObject0;
        Object object1;
        Cursor cursor0;
        if(this.FLD355) {
            if(this.FLD353.containsKey(s)) {
                return this.FLD353.get(s);
            }
            try {
                cursor0 = CLS51.MTH928(this.getReadableDatabase(), s);
                if(cursor0 != null) {
                    if(cursor0.getCount() <= 0 || !cursor0.moveToFirst()) {
                        object1 = object0;
                    }
                    else {
                        String s1 = cursor0.getString(cursor0.getColumnIndex("TYPE"));
                        object1 = this.MTH926(cursor0.getString(cursor0.getColumnIndex("VALUE")));
                        if(TextUtils.isEmpty(s1)) {
                            s1 = "STRING";
                        }
                        switch(CLS50.valueOf(s1).ordinal()) {
                            case 1: {
                                object1 = Integer.valueOf(((String)object1));
                                break;
                            }
                            case 2: {
                                object1 = Boolean.valueOf(((String)object1));
                                break;
                            }
                            case 3: {
                                object1 = Double.valueOf(((String)object1));
                                break;
                            }
                            case 4: {
                                object1 = Long.parseLong(((String)object1), 16);
                                break;
                            }
                            case 5: {
                                object1 = cursor0.getBlob(cursor0.getColumnIndex("DATA"));
                                break;
                            }
                            case 6: {
                                jSONObject0 = new JSONObject(((String)object1));
                                goto label_30;
                            }
                            case 7: {
                                jSONObject0 = new JSONArray(((String)object1));
                                goto label_30;
                            }
                        }
                    }
                    goto label_31;
                }
            }
            catch(Throwable throwable0) {
                object0 = CLS53.FLD362.MTH943("WxDataManagerGet", new Object[]{s, object0});
                CLS44.MTH897(throwable0);
                this.FLD353.put(s, object0);
            }
            return object0;
            try {
                jSONObject0 = new JSONObject(((String)object1));
                goto label_30;
            }
            catch(Throwable throwable1) {
                try {
                    CLS44.MTH897(throwable1);
                    object1 = object0;
                    goto label_31;
                label_30:
                    object1 = jSONObject0;
                label_31:
                    if(!cursor0.isClosed()) {
                        cursor0.close();
                    }
                    object0 = object1;
                    goto label_38;
                }
                catch(Throwable throwable0) {
                }
            }
            object0 = CLS53.FLD362.MTH943("WxDataManagerGet", new Object[]{s, object0});
            CLS44.MTH897(throwable0);
        label_38:
            this.FLD353.put(s, object0);
            return object0;
        }
        if(this.FLD353.containsKey(s)) {
            return this.FLD353.get(s);
        }
        try {
            cursor1 = CLS51.MTH928(this.getReadableDatabase(), s);
            if(cursor1 == null) {
                return object0;
            }
            if(cursor1.getCount() <= 0 || !cursor1.moveToFirst()) {
                goto label_71;
            }
            else {
                String s2 = cursor1.getString(cursor1.getColumnIndex("TYPE"));
                arr_b = cursor1.getString(cursor1.getColumnIndex("VALUE"));
                if(TextUtils.isEmpty(s2)) {
                    s2 = "STRING";
                }
                switch(CLS50.valueOf(s2).ordinal()) {
                    case 1: {
                        arr_b = Integer.valueOf(((String)arr_b));
                        break;
                    }
                    case 2: {
                        arr_b = Boolean.valueOf(((String)arr_b));
                        break;
                    }
                    case 3: {
                        arr_b = Double.valueOf(((String)arr_b));
                        break;
                    }
                    case 4: {
                        arr_b = Long.parseLong(((String)arr_b), 16);
                        break;
                    }
                    case 5: {
                        arr_b = cursor1.getBlob(cursor1.getColumnIndex("DATA"));
                        break;
                    }
                    case 6: {
                        jSONObject1 = new JSONObject(((String)arr_b));
                        arr_b = jSONObject1;
                        break;
                    }
                    case 7: {
                        jSONObject1 = new JSONArray(((String)arr_b));
                        arr_b = jSONObject1;
                    }
                }
            }
            goto label_72;
        }
        catch(Throwable throwable2) {
            arr_b = CLS53.FLD362.MTH943("WxDataManagerGet", new Object[]{s, object0});
            CLS44.MTH897(throwable2);
            this.FLD353.put(s, arr_b);
            return arr_b;
        }
        try {
            jSONObject1 = new JSONObject(((String)arr_b));
            arr_b = jSONObject1;
            goto label_72;
        }
        catch(Throwable throwable3) {
            try {
                CLS44.MTH897(throwable3);
            label_71:
                arr_b = object0;
            label_72:
                if(!cursor1.isClosed()) {
                    cursor1.close();
                }
                goto label_78;
            }
            catch(Throwable throwable2) {
            }
        }
        arr_b = CLS53.FLD362.MTH943("WxDataManagerGet", new Object[]{s, object0});
        CLS44.MTH897(throwable2);
    label_78:
        this.FLD353.put(s, arr_b);
        return arr_b;
    }
}

