// Decompiled by JEB v5.42.0.202606242140

package c.יᴵ;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import c.ʽـ.CLS48;
import c.ʽـ.CLS49;
import c.ˈⁱ.CLS95;
import c.ـˉ.CLS181;
import c.ـˉ.CLS198;
import c.ـˉ.CLS204;
import c.ـˉ.CLS213;
import c.ـˉ.CLS255.CLS254;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint({"Range"})
public class CLS156 extends SQLiteOpenHelper {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS154 extends Enum {
        public static final enum CLS154 FLD710;
        public static final enum CLS154 FLD711;
        public static final enum CLS154 FLD712;
        public static final enum CLS154 FLD713;
        public static final CLS154[] FLD714;
        public static final enum CLS154 FLD715;
        public static final enum CLS154 FLD716;
        public static final enum CLS154 FLD717;
        public static final enum CLS154 FLD718;
        public static final enum CLS154 FLD719;

        static {
            CLS154.FLD712 = new CLS154(CLS48.MTH1003(v, CLS49.FLD179), 0);
            CLS154.FLD710 = new CLS154(CLS48.MTH1003(v1, CLS49.FLD179), 1);
            CLS154.FLD715 = new CLS154(CLS48.MTH1003(v2, CLS49.FLD179), 2);
            CLS154.FLD719 = new CLS154(CLS48.MTH1003(v3, CLS49.FLD179), 3);
            CLS154.FLD711 = new CLS154(CLS48.MTH1003(v4, CLS49.FLD179), 4);
            CLS154.FLD718 = new CLS154(CLS48.MTH1003(v5, CLS49.FLD179), 5);
            CLS154.FLD716 = new CLS154(CLS48.MTH1003(v6, CLS49.FLD179), 6);
            CLS154.FLD717 = new CLS154(CLS48.MTH1003(v7, CLS49.FLD179), 7);
            CLS154.FLD713 = new CLS154(CLS48.MTH1003(v8, CLS49.FLD179), 8);
            CLS154.FLD714 = new CLS154[]{CLS154.FLD712, CLS154.FLD710, CLS154.FLD715, CLS154.FLD719, CLS154.FLD711, CLS154.FLD718, CLS154.FLD716, CLS154.FLD717, CLS154.FLD713};
        }

        public CLS154(String s, int v) {
            super(s, v);
        }

        public static CLS154 valueOf(String s) {
            return (CLS154)Enum.valueOf(CLS154.class, s);
        }

        public static CLS154[] values() {
            return (CLS154[])CLS154.FLD714.clone();
        }

        public static CLS154[] MTH2709() [...] // Inlined contents
    }

    public static class CLS155 {
        public static final int[] FLD720;

        static {
            int[] arr_v = new int[CLS154.values().length];
            CLS155.FLD720 = arr_v;
            try {
                arr_v[CLS154.FLD710.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS155.FLD720[CLS154.FLD715.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS155.FLD720[CLS154.FLD719.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS155.FLD720[CLS154.FLD713.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS155.FLD720[CLS154.FLD711.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS155.FLD720[CLS154.FLD718.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS155.FLD720[CLS154.FLD716.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS155.FLD720[CLS154.FLD717.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public boolean FLD721;
    public static final String FLD722;
    public static final String FLD723;
    public final HashMap FLD724;
    public static final String FLD725;
    public static final String FLD726;
    public static final String FLD727;
    public String FLD728;
    public static final String FLD729;
    public static final String FLD730;
    public static final String FLD731;
    public static final String FLD732;

    // 此方法包含解密的字符串
    static {
        CLS156.FLD732 = "\uD8E3ATA";
        CLS156.FLD723 = "\uD8E3KZ_WX_DATA";
        CLS156.FLD731 = "\uD8E3REATE TABLE DATA(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, TAG TEXT, TYPE TEXT, VALUE TEXT, DATA BLOB)";
        CLS156.FLD729 = "\uD8E3ID";
        CLS156.FLD730 = "\uD8E3CCOUNT";
        CLS156.FLD726 = "\uD8E3AG";
        CLS156.FLD727 = "\uD8E3ALUE";
        CLS156.FLD725 = "\uD8E3YPE";
        CLS156.FLD722 = "\uD8E3ATA";
    }

    // 此方法包含解密的字符串
    public CLS156(Context context0) {
        super(context0, "\uD8E3KZ_WX_DATA", null, 1);
        this.FLD721 = false;
        this.FLD724 = new HashMap();
        CLS213.MTH3304().MTH3314("\uD8E3xDataManagerGet", ((CLS254)new CLS655(this)));
    }

    public CLS156(Context context0, boolean z, String s) {
        this(context0);
        this.FLD721 = z;
        this.FLD728 = s;
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("\uD8E3REATE TABLE DATA(_ID INTEGER PRIMARY KEY NOT NULL, ACCOUNT TEXT, TAG TEXT, TYPE TEXT, VALUE TEXT, DATA BLOB)");
    }

    // 此方法包含解密的字符串
    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("\uD8E3ROP TABLE IF EXISTS DATA");
        this.onCreate(sQLiteDatabase0);
    }

    private Object MTH2716(Object[] arr_object) {
        return this.MTH2730(((String)arr_object[0]), arr_object[1], false);
    }

    // 此方法包含解密的字符串
    public final void MTH2717(String s, CLS154 ٴʻ$ʻᵢ0, Object object0) {
        try {
            if(TextUtils.isEmpty("\uD8E3NO_ID+")) {
                return;
            }
            this.getWritableDatabase().update("\uD8E3ATA", this.MTH2731(s, ٴʻ$ʻᵢ0, object0), "\uD8E3CCOUNT=? AND TAG=? AND TYPE=?", new String[]{"\uD8E3NO_ID+", s, ٴʻ$ʻᵢ0.toString()});
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final String MTH2718(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS198.MTH3213(this.FLD728, s);
        if(TextUtils.isEmpty(s1)) {
            for(int v = 0; v < 1; ++v) {
                s1 = CLS198.MTH3213(CLS181.MTH3088((new String[]{""}[v] + "\uD8E3n4hZkF")), s);
                if(!TextUtils.isEmpty(s1)) {
                    break;
                }
            }
        }
        return s1;
    }

    public boolean MTH2719(String s, boolean z, boolean z1) {
        try {
            Object object0 = this.MTH2730(s, Boolean.valueOf(z), z1);
            if(object0 instanceof String) {
                return Boolean.parseBoolean(((String)object0));
            }
            return object0 == null ? z : ((Boolean)object0).booleanValue();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return z;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2720() {
        try {
            if(TextUtils.isEmpty("\uD8E3NO_ID+")) {
                return;
            }
            this.getWritableDatabase().delete("\uD8E3ATA", "\uD8E3CCOUNT = ?", new String[]{"\uD8E3NO_ID+"});
            this.FLD724.clear();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public final Cursor MTH2721(SQLiteDatabase sQLiteDatabase0, String s, CLS154 ٴʻ$ʻᵢ0) {
        try {
            return TextUtils.isEmpty("\uD8E3NO_ID+") ? null : sQLiteDatabase0.rawQuery("\uD8E3ELECT * FROM DATA WHERE ACCOUNT=? AND TAG=? AND TYPE=?", new String[]{"\uD8E3NO_ID+", s, ٴʻ$ʻᵢ0.toString()});
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    public int MTH2723(String s) {
        int v = this.MTH2741(s, 0);
        this.MTH2749(s, ((int)(v + 1)));
        return v + 1;
    }

    public final void MTH2724(String s, CLS154 ٴʻ$ʻᵢ0, Object object0) {
        try {
            Cursor cursor0 = this.MTH2721(this.getReadableDatabase(), s, ٴʻ$ʻᵢ0);
            if(cursor0 == null) {
                this.MTH2748(s, ٴʻ$ʻᵢ0, object0);
                return;
            }
            int v = cursor0.getCount();
            cursor0.close();
            if(v > 0) {
                this.MTH2717(s, ٴʻ$ʻᵢ0, object0);
                return;
            }
            this.MTH2748(s, ٴʻ$ʻᵢ0, object0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public boolean MTH2725(String s, boolean z) {
        return this.MTH2719(s, z, false);
    }

    public void MTH2726(String s, CLS154 ٴʻ$ʻᵢ0, Object object0) {
        this.FLD724.put(s, object0);
        if(this.FLD721) {
            this.MTH2745(s, ٴʻ$ʻᵢ0, object0);
            return;
        }
        this.MTH2724(s, ٴʻ$ʻᵢ0, object0);
    }

    public long MTH2727(String s, long v, boolean z) {
        try {
            Object object0 = this.MTH2730(s, v, z);
            if(object0 instanceof String) {
                return Long.parseLong(((String)object0));
            }
            return object0 == null ? v : ((long)(((Long)object0)));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return v;
        }
    }

    public JSONArray MTH2728(String s, JSONArray jSONArray0, boolean z) {
        try {
            Object object0 = this.MTH2730(s, jSONArray0, z);
            if(object0 instanceof String) {
                return new JSONArray(((String)object0));
            }
            return object0 == null ? jSONArray0 : ((JSONArray)object0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return jSONArray0;
        }
    }

    // 此方法包含解密的字符串
    public Cursor MTH2729(SQLiteDatabase sQLiteDatabase0, String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return null;
            }
            return TextUtils.isEmpty("\uD8E3NO_ID+") ? null : sQLiteDatabase0.rawQuery("\uD8E3ELECT * FROM DATA WHERE ACCOUNT=? AND TAG=? ", new String[]{"\uD8E3NO_ID+", s});
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public Object MTH2730(String s, Object object0, boolean z) {
        JSONObject jSONObject0;
        if(this.FLD721) {
            return this.MTH2734(s, object0, z);
        }
        if(!z && this.FLD724.containsKey(s)) {
            return this.FLD724.get(s);
        }
        SQLiteDatabase sQLiteDatabase0 = this.getReadableDatabase();
        String s1 = CLS95.MTH2018(s);
        if(s1 != null) {
            object0 = s1;
        }
        Cursor cursor0 = this.MTH2729(sQLiteDatabase0, s);
        if(cursor0 == null) {
            return object0;
        }
        try {
            if(cursor0.moveToFirst()) {
                String s2 = cursor0.getString(cursor0.getColumnIndex("\uD8E3YPE"));
                String s3 = cursor0.getString(cursor0.getColumnIndex("\uD8E3ALUE"));
                if(TextUtils.isEmpty(s2)) {
                    s2 = "\uD8E3TRING";
                }
                switch(CLS154.valueOf(s2)) {
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
                        object0 = cursor0.getBlob(cursor0.getColumnIndex("\uD8E3ATA"));
                        break;
                    }
                    case 7: {
                        try {
                            jSONObject0 = new JSONObject(s3);
                            goto label_41;
                        }
                        catch(Throwable throwable1) {
                        }
                        CLS204.MTH3257(throwable1);
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
            CLS204.MTH3257(throwable0);
        }
        goto label_42;
    label_41:
        object0 = jSONObject0;
    label_42:
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        this.FLD724.put(s, object0);
        return object0;
    }

    // 此方法包含解密的字符串
    public final ContentValues MTH2731(String s, CLS154 ٴʻ$ʻᵢ0, Object object0) {
        String s1;
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("\uD8E3CCOUNT", "\uD8E3NO_ID+");
        contentValues0.put("\uD8E3AG", s);
        contentValues0.put("\uD8E3YPE", ٴʻ$ʻᵢ0.toString());
        if(object0 != null) {
            if(ٴʻ$ʻᵢ0 != CLS154.FLD711 || !(object0 instanceof Long)) {
                if(ٴʻ$ʻᵢ0 == CLS154.FLD718) {
                    contentValues0.put("\uD8E3ATA", ((byte[])object0));
                    return contentValues0;
                }
                s1 = object0.toString();
            }
            else {
                s1 = Long.toHexString(((long)(((Long)object0))));
            }
            contentValues0.put("\uD8E3ALUE", s1);
        }
        return contentValues0;
    }

    public String MTH2732(String s, String s1, boolean z) {
        try {
            return (String)this.MTH2730(s, s1, z);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return s1;
        }
    }

    public String MTH2733(String s, String s1) {
        return this.MTH2732(s, s1, false);
    }

    // 此方法包含解密的字符串
    public final Object MTH2734(String s, Object object0, boolean z) {
        JSONObject jSONObject0;
        if(!z && this.FLD724.containsKey(s)) {
            return this.FLD724.get(s);
        }
        String s1 = CLS95.MTH2018(s);
        if(s1 != null) {
            object0 = s1;
        }
        Cursor cursor0 = this.MTH2729(this.getReadableDatabase(), s);
        if(cursor0 == null) {
            return object0;
        }
        try {
            if(cursor0.moveToFirst()) {
                String s2 = cursor0.getString(cursor0.getColumnIndex("\uD8E3YPE"));
                String s3 = this.MTH2718(cursor0.getString(cursor0.getColumnIndex("\uD8E3ALUE")));
                if(TextUtils.isEmpty(s2)) {
                    s2 = "\uD8E3TRING";
                }
                switch(CLS155.FLD720[CLS154.valueOf(s2).ordinal()]) {
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
                        object0 = cursor0.getBlob(cursor0.getColumnIndex("\uD8E3ATA"));
                        break;
                    }
                    case 7: {
                        try {
                            jSONObject0 = new JSONObject(s3);
                            goto label_38;
                        }
                        catch(Throwable throwable1) {
                        }
                        CLS204.MTH3257(throwable1);
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
            CLS204.MTH3257(throwable0);
        }
        goto label_39;
    label_38:
        object0 = jSONObject0;
    label_39:
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        this.FLD724.put(s, object0);
        return object0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final String MTH2735() [...] // 潜在的解密器

    public HashMap MTH2736() {
        return this.FLD724;
    }

    public int MTH2737(String s, int v, boolean z) {
        try {
            Object object0 = this.MTH2730(s, v, z);
            if(object0 instanceof String) {
                return Integer.parseInt(((String)object0));
            }
            return object0 == null ? v : ((int)(((Integer)object0)));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return v;
        }
    }

    public JSONArray MTH2738(String s, JSONArray jSONArray0) {
        return this.MTH2728(s, jSONArray0, false);
    }

    public void MTH2739(String s) {
        this.MTH2746(s);
    }

    public JSONObject MTH2740(String s, JSONObject jSONObject0, boolean z) {
        try {
            Object object0 = this.MTH2730(s, jSONObject0, z);
            if(object0 instanceof String) {
                return new JSONObject(((String)object0));
            }
            return object0 == null ? jSONObject0 : ((JSONObject)object0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return jSONObject0;
        }
    }

    public int MTH2741(String s, int v) {
        return this.MTH2737(s, v, false);
    }

    // 此方法包含解密的字符串
    public final String MTH2742(String s) {
        try {
            return CLS198.MTH3215(this.FLD728, s);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return "";
        }
    }

    public long MTH2743(String s, long v) {
        return this.MTH2727(s, v, false);
    }

    public boolean MTH2744(String s) {
        boolean z = true;
        if(this.FLD724.containsKey(s)) {
            return true;
        }
        Cursor cursor0 = this.MTH2729(this.getReadableDatabase(), s);
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
    public final void MTH2745(String s, CLS154 ٴʻ$ʻᵢ0, Object object0) {
        this.MTH2724(s, ٴʻ$ʻᵢ0, this.MTH2742((ٴʻ$ʻᵢ0 == CLS154.FLD711 ? Long.toHexString(((long)(((Long)object0)))) : "" + object0)));
    }

    // 此方法包含解密的字符串
    public final void MTH2746(String s) {
        try {
            if(TextUtils.isEmpty("\uD8E3NO_ID+")) {
                return;
            }
            this.getWritableDatabase().delete("\uD8E3ATA", "\uD8E3CCOUNT=? AND TAG=?", new String[]{"\uD8E3NO_ID+", s});
            this.FLD724.remove(s);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public void MTH2747() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("\uD8E3v_verifier6", this.MTH2733("\uD8E3v_verifier6", ""));
        hashMap0.put("\uD8E3v_verifier6_time", this.MTH2733("\uD8E3v_verifier6_time", ""));
        hashMap0.put("\uD8E3erifier6", this.MTH2733("\uD8E3erifier6", ""));
        hashMap0.put("\uD8E3erifier6_time", this.MTH2733("\uD8E3erifier6_time", ""));
        this.MTH2720();
        for(Object object0: hashMap0.keySet()) {
            this.MTH2749(((String)object0), hashMap0.get(((String)object0)));
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2748(String s, CLS154 ٴʻ$ʻᵢ0, Object object0) {
        try {
            if(TextUtils.isEmpty("\uD8E3NO_ID+")) {
                return;
            }
            this.getWritableDatabase().insert("\uD8E3ATA", null, this.MTH2731(s, ٴʻ$ʻᵢ0, object0));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public void MTH2749(String s, Object object0) {
        CLS154 ٴʻ$ʻᵢ0;
        try {
            if(object0 instanceof Long) {
                ٴʻ$ʻᵢ0 = CLS154.FLD711;
            }
            else if(object0 instanceof String) {
                ٴʻ$ʻᵢ0 = CLS154.FLD712;
            }
            else if(object0 instanceof Integer) {
                ٴʻ$ʻᵢ0 = CLS154.FLD710;
            }
            else if(object0 instanceof Boolean) {
                ٴʻ$ʻᵢ0 = CLS154.FLD715;
            }
            else if(object0 instanceof Double) {
                ٴʻ$ʻᵢ0 = CLS154.FLD719;
            }
            else if(object0 instanceof Float) {
                ٴʻ$ʻᵢ0 = CLS154.FLD713;
            }
            else if(object0 instanceof Byte[]) {
                ٴʻ$ʻᵢ0 = CLS154.FLD718;
            }
            else if(object0 instanceof JSONObject) {
                ٴʻ$ʻᵢ0 = CLS154.FLD716;
            }
            else if(object0 instanceof JSONArray) {
                ٴʻ$ʻᵢ0 = CLS154.FLD717;
            }
            else {
                ٴʻ$ʻᵢ0 = CLS154.FLD712;
            }
            this.MTH2726(s, ٴʻ$ʻᵢ0, object0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public JSONObject MTH2750(String s, JSONObject jSONObject0) {
        return this.MTH2740(s, jSONObject0, false);
    }
}

