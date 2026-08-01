// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.text.TextUtils;
import c.ˊﹶ.CLS98;
import c.ˏי.CLS110;
import c.ᵎʾ.CLS299;

@SuppressLint({"Range"})
public class CLS131 {
    public Object FLD568;
    public boolean FLD569;
    public String FLD570;
    public Object FLD571;
    public final String FLD572;
    public static final CLS131 FLD573;
    public Integer FLD574;

    static {
        CLS131.FLD573 = new CLS131();
    }

    // 此方法包含解密的字符串
    public CLS131() {
        this.FLD572 = "/*fkz*/";
        this.FLD574 = -1;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public Cursor MTH1987(String s) {
        return this.MTH1998("", new String[]{s});
    }

    // 此方法包含解密的字符串
    public long MTH1988() {
        Cursor cursor0 = this.MTH1997("");
        long v = -1L;
        if(cursor0 == null) {
            return -1L;
        }
        if(cursor0.moveToFirst()) {
            v = cursor0.getLong(0) + 1L;
        }
        cursor0.close();
        return v;
    }

    // 此方法包含解密的字符串
    public String MTH1989(int v) {
        String s = null;
        Cursor cursor0 = this.MTH1996("SELECT value FROM userinfo WHERE id = " + v, null);
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            s = cursor0.getString(cursor0.getColumnIndex("value"));
        }
        cursor0.close();
        return s;
    }

    public static CLS131 MTH1990() {
        return CLS131.FLD573;
    }

    // 此方法包含解密的字符串
    public String MTH1991() {
        try {
            return this.MTH1989(6);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    public Object MTH1992() {
        return this.FLD568;
    }

    // 此方法包含解密的字符串
    public String MTH1993() {
        try {
            return this.MTH1989(5);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public String MTH1994() {
        try {
            String s = this.MTH1989(42);
            return TextUtils.isEmpty(s) ? this.MTH2007() : s;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public String MTH1995() {
        try {
            if(((int)this.FLD574) != -1) {
                String s = this.MTH1989(9);
                if(TextUtils.isEmpty(s)) {
                    return "";
                }
                this.FLD574 = Integer.valueOf(s);
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        switch(((int)this.FLD574)) {
            case -1: 
            case 0: {
                return "";
            }
            default: {
                return String.valueOf(((long)(((int)this.FLD574))) & 0xFFFFFFFFL);
            }
        }
    }

    // 此方法包含解密的字符串
    public Cursor MTH1996(String s, String[] arr_s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            if(this.MTH2001()) {
                Object object0 = this.MTH2003();
                if(object0 != null) {
                    return (Cursor)CLS110.MTH1544(object0, CLS98.MTH1289("SqliteDB_rawQuery"), new Object[]{s, arr_s, 0});
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2706(s, true, false);
            CLS185.MTH2707(throwable0, true, false);
        }
        try {
            if(this.MTH1999()) {
                Object object1 = this.MTH1992();
                if(object1 != null) {
                    return (Cursor)CLS110.MTH1544(object1, "rawQuery", new Object[]{s, arr_s});
                }
            }
        }
        catch(Throwable throwable1) {
            CLS185.MTH2706(s, true, false);
            CLS185.MTH2707(throwable1, true, false);
        }
        return null;
    }

    public Cursor MTH1997(String s) {
        return this.MTH1998(s, null);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public Cursor MTH1998(String s, String[] arr_s) {
        return this.MTH1996("/*fkz*/" + s, arr_s);
    }

    // 此方法包含解密的字符串
    public final boolean MTH1999() {
        Object object0 = this.MTH1992();
        if(object0 != null) {
            try {
                return ((Boolean)CLS110.MTH1544(object0, "isOpen", new Object[0])).booleanValue();
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return false;
    }

    public void MTH2000(Object object0) {
        if(object0 == this.FLD568) {
            return;
        }
        this.FLD568 = object0;
        this.MTH2002();
    }

    // 此方法包含解密的字符串
    public final boolean MTH2001() {
        try {
            Object object0 = this.MTH2003();
            if(object0 != null) {
                return ((Boolean)CLS110.MTH1544(object0, CLS98.MTH1289("SqliteDB_isOpen"), new Object[0])).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return false;
    }

    public void MTH2002() {
        if(this.FLD569) {
            return;
        }
        this.FLD569 = true;
    }

    public final Object MTH2003() {
        if(this.FLD571 == null) {
            this.FLD571 = CLS299.MTH4274();
        }
        return this.FLD571;
    }

    // 此方法包含解密的字符串
    public String MTH2004(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        Cursor cursor0 = this.MTH1987(s);
        if(cursor0 == null) {
            return s;
        }
        if(cursor0.moveToFirst()) {
            String s1 = cursor0.getString(cursor0.getColumnIndex("conRemark"));
            if(TextUtils.isEmpty(s1)) {
                s1 = cursor0.getString(cursor0.getColumnIndex("nickname"));
            }
            String s2 = this.MTH2005(s1);
            if(!TextUtils.isEmpty(s2) || CLS179.MTH2613(s)) {
                s = s2;
            }
        }
        else {
            s = "";
        }
        cursor0.close();
        return s;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public String MTH2005(String s) {
        if(TextUtils.isEmpty(s)) {
            return s;
        }
        if(s.contains("￀") && s.contains("￀")) {
            s = s.substring(0, s.indexOf("￀")) + s.substring(s.indexOf("￀") + 1);
        }
        return s.replaceAll("\\u202E|\\u202D|\\n|\\r", "").trim();
    }

    public boolean MTH2006() {
        return this.FLD569;
    }

    public String MTH2007() {
        if(!TextUtils.isEmpty(this.FLD570)) {
            return this.FLD570;
        }
        String s = this.MTH1989(2);
        this.FLD570 = s;
        return s;
    }

    // 此方法包含解密的字符串
    public String MTH2008(String s) {
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        Cursor cursor0 = this.MTH1996("SELECT alias FROM rcontact WHERE username = ?", new String[]{s});
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            s1 = cursor0.getString(cursor0.getColumnIndex("alias"));
        }
        cursor0.close();
        return s1;
    }
}

