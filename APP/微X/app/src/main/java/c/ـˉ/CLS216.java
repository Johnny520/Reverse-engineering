// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.text.TextUtils;
import c.ˆˆ.CLS65;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS99;

@SuppressLint({"Range"})
public class CLS216 {
    public Integer FLD991;
    public boolean FLD992;
    public final String FLD993;
    public Object FLD994;
    public static final CLS216 FLD995;
    public Object FLD996;
    public String FLD997;

    static {
        CLS216.FLD995 = new CLS216();
    }

    // 此方法包含解密的字符串
    public CLS216() {
        this.FLD993 = "\uD8E3*fkz*/";
        this.FLD991 = -1;
    }

    // 此方法包含解密的字符串
    public String MTH3350(String s) {
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        Cursor cursor0 = this.MTH3356("\uD8E3ELECT alias FROM rcontact WHERE username = ?", new String[]{s});
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            s1 = cursor0.getString(cursor0.getColumnIndex("\uD8E3lias"));
        }
        cursor0.close();
        return s1;
    }

    // 此方法包含解密的字符串
    public String MTH3351(int v) {
        String s = null;
        Cursor cursor0 = this.MTH3356("\uD8E3ELECT value FROM userinfo WHERE id = " + v, null);
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            s = cursor0.getString(cursor0.getColumnIndex("\uD8E3alue"));
        }
        cursor0.close();
        return s;
    }

    public static CLS216 MTH3352() {
        return CLS216.FLD995;
    }

    public void MTH3353() {
        if(this.FLD992) {
            return;
        }
        this.FLD992 = true;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public String MTH3354(String s) {
        if(TextUtils.isEmpty(s)) {
            return s;
        }
        if(s.contains("‮") && s.contains("‭")) {
            s = s.substring(0, s.indexOf("‮")) + s.substring(s.indexOf("‭") + 1);
        }
        return s.replaceAll("\uD8E3u202E|\\u202D|\\n|\\r", "").trim();
    }

    // 此方法包含解密的字符串
    public String MTH3355() {
        try {
            return this.MTH3351(5);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public Cursor MTH3356(String s, String[] arr_s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            if(this.MTH3366()) {
                Object object0 = this.MTH3368();
                if(object0 != null) {
                    return (Cursor)CLS99.MTH2087(object0, CLS95.MTH2004("\uD8E3qliteDB_rawQuery"), new Object[]{s, arr_s, 0});
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3255(s, true, false);
            CLS204.MTH3253(throwable0, true, false);
        }
        try {
            if(this.MTH3360()) {
                Object object1 = this.MTH3370();
                if(object1 != null) {
                    return (Cursor)CLS99.MTH2087(object1, "\uD8E3awQuery", new Object[]{s, arr_s});
                }
            }
        }
        catch(Throwable throwable1) {
            CLS204.MTH3255(s, true, false);
            CLS204.MTH3253(throwable1, true, false);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public String MTH3357() {
        try {
            if(((int)this.FLD991) != -1) {
                String s = this.MTH3351(9);
                if(TextUtils.isEmpty(s)) {
                    return "";
                }
                this.FLD991 = Integer.valueOf(s);
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        switch(((int)this.FLD991)) {
            case -1: 
            case 0: {
                return "";
            }
            default: {
                return String.valueOf(((long)(((int)this.FLD991))) & 0xFFFFFFFFL);
            }
        }
    }

    // 此方法包含解密的字符串
    public long MTH3358() {
        Cursor cursor0 = this.MTH3363("");
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

    public boolean MTH3359() {
        return this.FLD992;
    }

    // 此方法包含解密的字符串
    public final boolean MTH3360() {
        Object object0 = this.MTH3370();
        if(object0 != null) {
            try {
                return ((Boolean)CLS99.MTH2087(object0, "\uD8E3sOpen", new Object[0])).booleanValue();
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public String MTH3361(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        Cursor cursor0 = this.MTH3365(s);
        if(cursor0 == null) {
            return s;
        }
        if(cursor0.moveToFirst()) {
            String s1 = cursor0.getString(cursor0.getColumnIndex("\uD8E3onRemark"));
            if(TextUtils.isEmpty(s1)) {
                s1 = cursor0.getString(cursor0.getColumnIndex("\uD8E3ickname"));
            }
            String s2 = this.MTH3354(s1);
            if(!TextUtils.isEmpty(s2) || CLS246.MTH3661(s)) {
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
    public String MTH3362() {
        try {
            return this.MTH3351(6);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return "";
        }
    }

    public Cursor MTH3363(String s) {
        return this.MTH3364(s, null);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public Cursor MTH3364(String s, String[] arr_s) {
        return this.MTH3356("\uD8E3*fkz*/" + s, arr_s);
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public Cursor MTH3365(String s) {
        return this.MTH3364("", new String[]{s});
    }

    // 此方法包含解密的字符串
    public final boolean MTH3366() {
        try {
            Object object0 = this.MTH3368();
            if(object0 != null) {
                return ((Boolean)CLS99.MTH2087(object0, CLS95.MTH2004("\uD8E3qliteDB_isOpen"), new Object[0])).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return false;
    }

    public String MTH3367() {
        if(!TextUtils.isEmpty(this.FLD997)) {
            return this.FLD997;
        }
        String s = this.MTH3351(2);
        this.FLD997 = s;
        return s;
    }

    public final Object MTH3368() {
        if(this.FLD996 == null) {
            this.FLD996 = CLS65.MTH1211();
        }
        return this.FLD996;
    }

    // 此方法包含解密的字符串
    public String MTH3369() {
        try {
            String s = this.MTH3351(42);
            return TextUtils.isEmpty(s) ? this.MTH3367() : s;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return "";
        }
    }

    public Object MTH3370() {
        return this.FLD994;
    }

    public void MTH3371(Object object0) {
        if(object0 == this.FLD994) {
            return;
        }
        this.FLD994 = object0;
        this.MTH3353();
    }
}

