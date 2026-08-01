// Decompiled by JEB v5.42.0.202606242140

package c.ˉˆ;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import c.ʾˎ.CLS41;
import c.ʾˎ.CLS42;
import c.ˊﹶ.CLS98;
import c.ˏᵎ.CLS163.CLS162;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS194;
import c.ˏᵎ.CLS217;
import c.ˏᵎ.CLS224;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint({"Range"})
public class CLS59 extends SQLiteOpenHelper {
    public static class CLS57 {
        public static final int[] FLD181;

        static {
            int[] arr_v = new int[CLS58.values().length];
            CLS57.FLD181 = arr_v;
            try {
                arr_v[CLS58.FLD191.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS57.FLD181[CLS58.FLD182.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS57.FLD181[CLS58.FLD185.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS57.FLD181[CLS58.FLD183.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS57.FLD181[CLS58.FLD184.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS57.FLD181[CLS58.FLD186.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS57.FLD181[CLS58.FLD190.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS57.FLD181[CLS58.FLD187.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS58 extends Enum {
        public static final enum CLS58 FLD182;
        public static final enum CLS58 FLD183;
        public static final enum CLS58 FLD184;
        public static final enum CLS58 FLD185;
        public static final enum CLS58 FLD186;
        public static final enum CLS58 FLD187;
        public static final CLS58[] FLD188;
        public static final enum CLS58 FLD189;
        public static final enum CLS58 FLD190;
        public static final enum CLS58 FLD191;

        static {
            CLS58.FLD189 = new CLS58(CLS42.MTH860(v, CLS41.FLD129), 0);
            CLS58.FLD191 = new CLS58(CLS42.MTH860(v1, CLS41.FLD129), 1);
            CLS58.FLD182 = new CLS58(CLS42.MTH860(v2, CLS41.FLD129), 2);
            CLS58.FLD185 = new CLS58(CLS42.MTH860(v3, CLS41.FLD129), 3);
            CLS58.FLD184 = new CLS58(CLS42.MTH860(v4, CLS41.FLD129), 4);
            CLS58.FLD186 = new CLS58(CLS42.MTH860(v5, CLS41.FLD129), 5);
            CLS58.FLD190 = new CLS58(CLS42.MTH860(v6, CLS41.FLD129), 6);
            CLS58.FLD187 = new CLS58(CLS42.MTH860(v7, CLS41.FLD129), 7);
            CLS58.FLD183 = new CLS58(CLS42.MTH860(v8, CLS41.FLD129), 8);
            CLS58.FLD188 = new CLS58[]{CLS58.FLD189, CLS58.FLD191, CLS58.FLD182, CLS58.FLD185, CLS58.FLD184, CLS58.FLD186, CLS58.FLD190, CLS58.FLD187, CLS58.FLD183};
        }

        public CLS58(String s, int v) {
            super(s, v);
        }

        public static CLS58 valueOf(String s) {
            return (CLS58)Enum.valueOf(CLS58.class, s);
        }

        public static CLS58[] values() {
            return (CLS58[])CLS58.FLD188.clone();
        }

        public static CLS58[] MTH977() [...] // Inlined contents
    }

    public String FLD192;
    public static final String FLD193;
    public static final String FLD194;
    public static final String FLD195;
    public static final String FLD196;
    public static final String FLD197;
    public static final String FLD198;
    public static final String FLD199;
    public static final String FLD200;
    public final HashMap FLD201;
    public static final String FLD202;
    public boolean FLD203;

    // 此方法包含解密的字符串
    static {
        CLS59.FLD196 = "DATA";
        CLS59.FLD195 = "FKZ_WX_DATA";
        CLS59.FLD198 = "CREATE TABLE DATA(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, TAG TEXT, TYPE TEXT, VALUE TEXT, DATA BLOB)";
        CLS59.FLD202 = "_ID";
        CLS59.FLD199 = "ACCOUNT";
        CLS59.FLD193 = "TAG";
        CLS59.FLD200 = "VALUE";
        CLS59.FLD197 = "TYPE";
        CLS59.FLD194 = "DATA";
    }

    // 此方法包含解密的字符串
    public CLS59(Context context0) {
        super(context0, "FKZ_WX_DATA", null, 1);
        this.FLD203 = false;
        this.FLD201 = new HashMap();
        CLS194.MTH2881().MTH2899("WxDataManagerGet", ((CLS162)new CLS423(this)));
    }

    public CLS59(Context context0, boolean z, String s) {
        this(context0);
        this.FLD203 = z;
        this.FLD192 = s;
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE DATA(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, TAG TEXT, TYPE TEXT, VALUE TEXT, DATA BLOB)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS DATA");
        this.onCreate(sQLiteDatabase0);
    }

    public long MTH983(String s, long v) {
        return this.MTH993(s, v, false);
    }

    public void MTH984(String s, Object object0) {
        CLS58 ʼˊ$ﾞⁱ0;
        try {
            if(object0 instanceof Long) {
                ʼˊ$ﾞⁱ0 = CLS58.FLD184;
            }
            else if(object0 instanceof String) {
                ʼˊ$ﾞⁱ0 = CLS58.FLD189;
            }
            else if(object0 instanceof Integer) {
                ʼˊ$ﾞⁱ0 = CLS58.FLD191;
            }
            else if(object0 instanceof Boolean) {
                ʼˊ$ﾞⁱ0 = CLS58.FLD182;
            }
            else if(object0 instanceof Double) {
                ʼˊ$ﾞⁱ0 = CLS58.FLD185;
            }
            else if(object0 instanceof Float) {
                ʼˊ$ﾞⁱ0 = CLS58.FLD183;
            }
            else if(object0 instanceof Byte[]) {
                ʼˊ$ﾞⁱ0 = CLS58.FLD186;
            }
            else if(object0 instanceof JSONObject) {
                ʼˊ$ﾞⁱ0 = CLS58.FLD190;
            }
            else if(object0 instanceof JSONArray) {
                ʼˊ$ﾞⁱ0 = CLS58.FLD187;
            }
            else {
                ʼˊ$ﾞⁱ0 = CLS58.FLD189;
            }
            this.MTH1005(s, ʼˊ$ﾞⁱ0, object0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public JSONObject MTH985(String s, JSONObject jSONObject0, boolean z) {
        try {
            Object object0 = this.MTH987(s, jSONObject0, z);
            if(object0 instanceof String) {
                return new JSONObject(((String)object0));
            }
            return object0 == null ? jSONObject0 : ((JSONObject)object0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return jSONObject0;
        }
    }

    public void MTH986(String s) {
        this.MTH995(s);
    }

    // 此方法包含解密的字符串
    public Object MTH987(String s, Object object0, boolean z) {
        JSONObject jSONObject0;
        if(this.FLD203) {
            return this.MTH1003(s, object0, z);
        }
        if(!z && this.FLD201.containsKey(s)) {
            return this.FLD201.get(s);
        }
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        String s1 = CLS98.MTH1286(s);
        if(s1 != null) {
            object0 = s1;
        }
        Cursor cursor0 = this.MTH997(sQLiteDatabase0, s);
        if(cursor0 == null) {
            return object0;
        }
        try {
            if(cursor0.moveToFirst()) {
                String s2 = cursor0.getString(cursor0.getColumnIndex("TYPE"));
                String s3 = cursor0.getString(cursor0.getColumnIndex("VALUE"));
                if(TextUtils.isEmpty(s2)) {
                    s2 = "STRING";
                }
                switch(CLS57.FLD181[CLS58.valueOf(s2).ordinal()]) {
                    case 1: {
                        object0 = Integer.valueOf(s3);
                        break;
                    }
                    case 2: {
                        object0 = Boolean.valueOf(s3);
                        break;
                    }
                    case 3: {
                        object0 = Double.valueOf(s3);
                        break;
                    }
                    case 4: {
                        object0 = Float.valueOf(s3);
                        break;
                    }
                    case 5: {
                        object0 = Long.parseLong(s3, 16);
                        break;
                    }
                    case 6: {
                        object0 = cursor0.getBlob(cursor0.getColumnIndex("DATA"));
                        break;
                    }
                    case 7: {
                        try {
                            jSONObject0 = new JSONObject(s3);
                            goto label_41;
                        }
                        catch(Throwable throwable1) {
                        }
                        CLS185.MTH2708(throwable1);
                        break;
                    }
                    case 8: {
                        jSONObject0 = new JSONArray(s3);
                        goto label_41;
                    }
                    default: {
                        object0 = s3;
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        goto label_42;
    label_41:
        object0 = jSONObject0;
    label_42:
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        this.FLD201.put(s, object0);
        return object0;
    }

    // 此方法包含解密的字符串
    public final void MTH988(String s, CLS58 ʼˊ$ﾞⁱ0, Object object0) {
        try {
            if(TextUtils.isEmpty("+NO_ID+")) {
                return;
            }
            this.getWritableDatabase().insert("DATA", null, this.MTH1014(s, ʼˊ$ﾞⁱ0, object0));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public boolean MTH989(String s, boolean z, boolean z1) {
        try {
            Object object0 = this.MTH987(s, Boolean.valueOf(z), z1);
            if(object0 instanceof String) {
                return Boolean.parseBoolean(((String)object0));
            }
            return object0 == null ? z : ((Boolean)object0).booleanValue();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return z;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH990() {
        try {
            if(TextUtils.isEmpty("+NO_ID+")) {
                return;
            }
            this.getWritableDatabase().delete("DATA", "ACCOUNT = ?", new String[]{"+NO_ID+"});
            this.FLD201.clear();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public HashMap MTH991() {
        return this.FLD201;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public void MTH992() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("xv_verifier6", this.MTH1015("xv_verifier6", ""));
        hashMap0.put("xv_verifier6_time", this.MTH1015("xv_verifier6_time", ""));
        hashMap0.put("verifier6", this.MTH1015("verifier6", ""));
        hashMap0.put("verifier6_time", this.MTH1015("verifier6_time", ""));
        this.MTH990();
        for(Object object0: hashMap0.keySet()) {
            this.MTH984(((String)object0), hashMap0.get(((String)object0)));
        }
    }

    public long MTH993(String s, long v, boolean z) {
        try {
            Object object0 = this.MTH987(s, v, z);
            if(object0 instanceof String) {
                return Long.parseLong(((String)object0));
            }
            return object0 == null ? v : ((long)(((Long)object0)));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return v;
        }
    }

    public boolean MTH994(String s, boolean z) {
        return this.MTH989(s, z, false);
    }

    // 此方法包含解密的字符串
    public final void MTH995(String s) {
        try {
            if(TextUtils.isEmpty("+NO_ID+")) {
                return;
            }
            this.getWritableDatabase().delete("DATA", "ACCOUNT=? AND TAG=?", new String[]{"+NO_ID+", s});
            this.FLD201.remove(s);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public int MTH996(String s) {
        int v = this.MTH1007(s, 0);
        this.MTH984(s, ((int)(v + 1)));
        return v + 1;
    }

    // 此方法包含解密的字符串
    public Cursor MTH997(SQLiteDatabase sQLiteDatabase0, String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return null;
            }
            return TextUtils.isEmpty("+NO_ID+") ? null : sQLiteDatabase0.rawQuery("SELECT * FROM DATA WHERE ACCOUNT=? AND TAG=? ", new String[]{"+NO_ID+", s});
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    public JSONArray MTH998(String s, JSONArray jSONArray0, boolean z) {
        try {
            Object object0 = this.MTH987(s, jSONArray0, z);
            if(object0 instanceof String) {
                return new JSONArray(((String)object0));
            }
            return object0 == null ? jSONArray0 : ((JSONArray)object0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return jSONArray0;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH999(String s, CLS58 ʼˊ$ﾞⁱ0, Object object0) {
        this.MTH1002(s, ʼˊ$ﾞⁱ0, this.MTH1016((ʼˊ$ﾞⁱ0 == CLS58.FLD184 ? Long.toHexString(((long)(((Long)object0)))) : "" + object0)));
    }

    public int MTH1000(String s, int v, boolean z) {
        try {
            Object object0 = this.MTH987(s, v, z);
            if(object0 instanceof String) {
                return Integer.parseInt(((String)object0));
            }
            return object0 == null ? v : ((int)(((Integer)object0)));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return v;
        }
    }

    public JSONArray MTH1001(String s, JSONArray jSONArray0) {
        return this.MTH998(s, jSONArray0, false);
    }

    public final void MTH1002(String s, CLS58 ʼˊ$ﾞⁱ0, Object object0) {
        try {
            Cursor cursor0 = this.MTH1009(this.getReadableDatabase(), s, ʼˊ$ﾞⁱ0);
            if(cursor0 == null) {
                this.MTH988(s, ʼˊ$ﾞⁱ0, object0);
                return;
            }
            int v = cursor0.getCount();
            cursor0.close();
            if(v > 0) {
                this.MTH1013(s, ʼˊ$ﾞⁱ0, object0);
                return;
            }
            this.MTH988(s, ʼˊ$ﾞⁱ0, object0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final Object MTH1003(String s, Object object0, boolean z) {
        JSONObject jSONObject0;
        if(!z && this.FLD201.containsKey(s)) {
            return this.FLD201.get(s);
        }
        String s1 = CLS98.MTH1286(s);
        if(s1 != null) {
            object0 = s1;
        }
        Cursor cursor0 = this.MTH997(this.getReadableDatabase(), s);
        if(cursor0 == null) {
            return object0;
        }
        try {
            if(cursor0.moveToFirst()) {
                String s2 = cursor0.getString(cursor0.getColumnIndex("TYPE"));
                String s3 = this.MTH1017(cursor0.getString(cursor0.getColumnIndex("VALUE")));
                if(TextUtils.isEmpty(s2)) {
                    s2 = "STRING";
                }
                switch(CLS58.valueOf(s2)) {
                    case 1: {
                        object0 = Integer.valueOf(s3);
                        break;
                    }
                    case 2: {
                        object0 = Boolean.valueOf(s3);
                        break;
                    }
                    case 3: {
                        object0 = Double.valueOf(s3);
                        break;
                    }
                    case 4: {
                        object0 = Float.valueOf(s3);
                        break;
                    }
                    case 5: {
                        object0 = Long.parseLong(s3, 16);
                        break;
                    }
                    case 6: {
                        object0 = cursor0.getBlob(cursor0.getColumnIndex("DATA"));
                        break;
                    }
                    case 7: {
                        try {
                            jSONObject0 = new JSONObject(s3);
                            goto label_38;
                        }
                        catch(Throwable throwable1) {
                        }
                        CLS185.MTH2708(throwable1);
                        break;
                    }
                    case 8: {
                        jSONObject0 = new JSONArray(s3);
                        goto label_38;
                    }
                    default: {
                        object0 = s3;
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        goto label_39;
    label_38:
        object0 = jSONObject0;
    label_39:
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        this.FLD201.put(s, object0);
        return object0;
    }

    public String MTH1004(String s, String s1, boolean z) {
        try {
            return (String)this.MTH987(s, s1, z);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return s1;
        }
    }

    public void MTH1005(String s, CLS58 ʼˊ$ﾞⁱ0, Object object0) {
        this.FLD201.put(s, object0);
        if(this.FLD203) {
            this.MTH999(s, ʼˊ$ﾞⁱ0, object0);
            return;
        }
        this.MTH1002(s, ʼˊ$ﾞⁱ0, object0);
    }

    public JSONObject MTH1006(String s, JSONObject jSONObject0) {
        return this.MTH985(s, jSONObject0, false);
    }

    public int MTH1007(String s, int v) {
        return this.MTH1000(s, v, false);
    }

    private Object MTH1008(Object[] arr_object) {
        return this.MTH987(((String)arr_object[0]), arr_object[1], false);
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public final Cursor MTH1009(SQLiteDatabase sQLiteDatabase0, String s, CLS58 ʼˊ$ﾞⁱ0) {
        try {
            return TextUtils.isEmpty("+NO_ID+") ? null : sQLiteDatabase0.rawQuery("SELECT * FROM DATA WHERE ACCOUNT=? AND TAG=? AND TYPE=?", new String[]{"+NO_ID+", s, ʼˊ$ﾞⁱ0.toString()});
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    public boolean MTH1010(String s) {
        boolean z = true;
        if(this.FLD201.containsKey(s)) {
            return true;
        }
        Cursor cursor0 = this.MTH997(this.getReadableDatabase(), s);
        if(cursor0 == null) {
            return false;
        }
        if(cursor0.getCount() <= 0) {
            z = false;
        }
        cursor0.close();
        return z;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final String MTH1011() [...] // 潜在的解密器

    // 此方法包含解密的字符串
    public final void MTH1013(String s, CLS58 ʼˊ$ﾞⁱ0, Object object0) {
        try {
            if(TextUtils.isEmpty("+NO_ID+")) {
                return;
            }
            this.getWritableDatabase().update("DATA", this.MTH1014(s, ʼˊ$ﾞⁱ0, object0), "ACCOUNT=? AND TAG=? AND TYPE=?", new String[]{"+NO_ID+", s, ʼˊ$ﾞⁱ0.toString()});
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final ContentValues MTH1014(String s, CLS58 ʼˊ$ﾞⁱ0, Object object0) {
        String s1;
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("ACCOUNT", "+NO_ID+");
        contentValues0.put("TAG", s);
        contentValues0.put("TYPE", ʼˊ$ﾞⁱ0.toString());
        if(object0 != null) {
            if(ʼˊ$ﾞⁱ0 != CLS58.FLD184 || !(object0 instanceof Long)) {
                if(ʼˊ$ﾞⁱ0 == CLS58.FLD186) {
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

    public String MTH1015(String s, String s1) {
        return this.MTH1004(s, s1, false);
    }

    // 此方法包含解密的字符串
    public final String MTH1016(String s) {
        try {
            return CLS217.MTH3044(this.FLD192, s);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1017(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS217.MTH3042(this.FLD192, s);
        if(TextUtils.isEmpty(s1)) {
            for(int v = 0; v < 1; ++v) {
                s1 = CLS217.MTH3042(CLS224.MTH3090((new String[]{""}[v] + "9n4hZkF")), s);
                if(!TextUtils.isEmpty(s1)) {
                    break;
                }
            }
        }
        return s1;
    }
}

