// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.HashSet;
import t.ʻˑ.CLS3;
import t.ˑٴ.CLS114;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;

public final class CLS34 {
    public final HashSet FLD462;
    public static final CLS34 FLD463;
    public String FLD464;
    public Object FLD465;
    public Object FLD466;

    static {
        CLS34.FLD463 = new CLS34();
    }

    // 此方法包含解密的字符串
    public CLS34() {
        new String("/*fkz*/");
        this.FLD462 = new HashSet();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final Cursor MTH1364(String s, String[] arr_s) {
        return this.MTH1365("/*fkz*/" + s, arr_s);
    }

    // 此方法包含解密的字符串
    public final Cursor MTH1365(String s, String[] arr_s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            if(this.MTH1371()) {
                Object object0 = this.MTH1370();
                if(object0 != null) {
                    return (Cursor)CLS3.MTH991(object0, CLS133.MTH2115("SqliteDB_rawQuery"), new Object[]{s, arr_s, 0});
                }
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2109(s);
            CLS133.MTH2113(throwable0);
        }
        try {
            if(this.MTH1372()) {
                Object object1 = this.MTH1368();
                if(object1 != null) {
                    return (Cursor)CLS3.MTH991(object1, "rawQuery", new Object[]{s, arr_s});
                }
            }
        }
        catch(Throwable throwable1) {
            CLS133.MTH2109(s);
            CLS133.MTH2113(throwable1);
        }
        return null;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static String MTH1366(String s) {
        if(TextUtils.isEmpty(s)) {
            return s;
        }
        if(s.contains("￀") && s.contains("￀")) {
            s = s.substring(0, s.indexOf("￀")) + s.substring(s.indexOf("￀") + 1);
        }
        return s.replaceAll("\\u202E|\\u202D|\\n|\\r", "").trim();
    }

    // 此方法包含解密的字符串
    public final String MTH1367(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        Cursor cursor0 = this.MTH1364(CLS133.MTH2116("q_db23"), new String[]{s});
        if(cursor0 == null) {
            return s;
        }
        if(cursor0.moveToFirst()) {
            String s1 = cursor0.getString(cursor0.getColumnIndex("conRemark"));
            if(TextUtils.isEmpty(s1)) {
                s1 = cursor0.getString(cursor0.getColumnIndex("nickname"));
            }
            String s2 = CLS34.MTH1366(s1);
            if(!TextUtils.isEmpty(s2) || CLS29.MTH1326(s)) {
                s = s2;
            }
        }
        else {
            s = "";
        }
        cursor0.close();
        return s;
    }

    // 此方法包含解密的字符串
    public final Object MTH1368() {
        if(this.FLD465 == null) {
            this.FLD465 = CLS123.FLD912.MTH2003("getMainDB", new Object[0]);
        }
        return this.FLD465;
    }

    // 此方法包含解密的字符串
    public final boolean MTH1369(String s) {
        long v;
        if(!TextUtils.isEmpty(s)) {
            String s1 = CLS133.MTH2112();
            if(TextUtils.isEmpty(s)) {
                v = 0xFFFFBD812B3CF2B7L;
                goto label_9;
            }
            String s2 = "";
            Cursor cursor0 = this.MTH1364(CLS133.MTH2116("q_db27"), new String[]{s});
            if(cursor0 == null) {
                v = 0xFFFFBD792B3CF2B7L;
            label_9:
                String s3 = CLS114.MTH1900(v);
                return !TextUtils.isEmpty(s3) && s3.contains(s1);
            }
            if(cursor0.moveToFirst()) {
                s2 = cursor0.getString(cursor0.getColumnIndex("memberlist"));
            }
            cursor0.close();
            return !TextUtils.isEmpty(s2) && s2.contains(s1);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final Object MTH1370() {
        Object object0 = null;
        if(this.FLD466 == null) {
            if(CLS133.MTH2110("CoreStorage_dbField")) {
                try {
                    Object object1 = CLS33.MTH1358();
                    if(object1 != null) {
                        object0 = CLS3.MTH989(object1, CLS133.MTH2115("CoreStorage_dbField"));
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
            this.FLD466 = object0;
        }
        return this.FLD466;
    }

    // 此方法包含解密的字符串
    public final boolean MTH1371() {
        try {
            Object object0 = this.MTH1370();
            if(object0 != null) {
                return ((Boolean)CLS3.MTH991(object0, CLS133.MTH2115("SqliteDB_isOpen"), new Object[0])).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final boolean MTH1372() {
        try {
            Object object0 = this.MTH1368();
            if(object0 != null) {
                return ((Boolean)CLS3.MTH991(object0, "isOpen", new Object[0])).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return false;
    }
}

