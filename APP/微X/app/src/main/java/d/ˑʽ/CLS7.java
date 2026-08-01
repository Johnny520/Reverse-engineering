// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.database.Cursor;
import android.text.TextUtils;
import d.ˎˏ.CLS1;
import d.ˎˏ.CLS4;
import d.יʻ.CLS62;
import d.יʻ.CLS69;

public final class CLS7 {
    public String FLD39;
    public Object FLD40;
    public static final CLS7 FLD41;
    public Object FLD42;

    static {
        CLS7.FLD41 = new CLS7();
    }

    // 此方法包含解密的字符串
    public CLS7() {
        new String("/*fkz*/");
    }

    // 此方法包含解密的字符串
    public final boolean MTH405() {
        try {
            Object object0 = this.MTH408();
            if(object0 != null) {
                return ((Boolean)CLS4.MTH389(object0, CLS69.MTH802("SqliteDB_isOpen"), new Object[0])).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final boolean MTH406() {
        try {
            Object object0 = this.MTH407();
            if(object0 != null) {
                return ((Boolean)CLS4.MTH389(object0, "isOpen", new Object[0])).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public final Object MTH407() {
        if(this.FLD40 == null) {
            this.FLD40 = CLS62.FLD317.MTH761("getMainDB", new Object[0]);
        }
        return this.FLD40;
    }

    // 此方法包含解密的字符串
    public final Object MTH408() {
        Object object0 = null;
        if(this.FLD42 == null) {
            if(CLS69.MTH793("CoreStorage_dbField")) {
                try {
                    Object object1 = CLS1.MTH370();
                    if(object1 != null) {
                        object0 = CLS4.MTH392(object1, CLS69.MTH802("CoreStorage_dbField"));
                    }
                }
                catch(Throwable throwable0) {
                    CLS69.MTH797(throwable0);
                }
            }
            this.FLD42 = object0;
        }
        return this.FLD42;
    }

    // 此方法包含解密的字符串
    public final String MTH409(int v) {
        String s = null;
        Cursor cursor0 = this.MTH410("SELECT value FROM userinfo WHERE id = " + v, null);
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            s = cursor0.getString(cursor0.getColumnIndex("value"));
        }
        cursor0.close();
        return s;
    }

    // 此方法包含解密的字符串
    public final Cursor MTH410(String s, String[] arr_s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            if(this.MTH405()) {
                Object object0 = this.MTH408();
                if(object0 != null) {
                    return (Cursor)CLS4.MTH389(object0, CLS69.MTH802("SqliteDB_rawQuery"), new Object[]{s, arr_s, 0});
                }
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH809(s);
            CLS69.MTH797(throwable0);
        }
        try {
            if(this.MTH406()) {
                Object object1 = this.MTH407();
                if(object1 != null) {
                    return (Cursor)CLS4.MTH389(object1, "rawQuery", new Object[]{s, arr_s});
                }
            }
        }
        catch(Throwable throwable1) {
            CLS69.MTH809(s);
            CLS69.MTH797(throwable1);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH411(long v) {
        String[] arr_s;
        try {
            arr_s = new String[]{String.valueOf(v)};
            if(this.MTH405()) {
                Object object0 = this.MTH408();
                if(object0 != null) {
                    ((Integer)CLS4.MTH389(object0, CLS69.MTH802("SqliteDB_delete"), new Object[]{"message", "msgId = ?", arr_s})).intValue();
                    return;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        try {
            if(this.MTH406()) {
                Object object1 = this.MTH407();
                if(object1 != null) {
                    ((Integer)CLS4.MTH389(object1, "delete", new Object[]{"message", "msgId = ?", arr_s})).intValue();
                }
            }
        }
        catch(Throwable throwable1) {
            CLS69.MTH797(throwable1);
        }
    }

    public final String MTH412() {
        if(!TextUtils.isEmpty(this.FLD39)) {
            return this.FLD39;
        }
        String s = this.MTH409(2);
        this.FLD39 = s;
        return s;
    }

    // 此方法包含解密的字符串
    public final String MTH413() {
        try {
            String s = this.MTH409(42);
            return TextUtils.isEmpty(s) ? this.MTH412() : s;
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public final String MTH414(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        Cursor cursor0 = this.MTH410("/*fkz*/" + CLS69.MTH806("q_db23"), new String[]{s});
        if(cursor0 == null) {
            return s;
        }
        if(cursor0.moveToFirst()) {
            String s1 = cursor0.getString(cursor0.getColumnIndex("conRemark"));
            if(TextUtils.isEmpty(s1)) {
                s1 = cursor0.getString(cursor0.getColumnIndex("nickname"));
            }
            if(!TextUtils.isEmpty(s1)) {
                if(s1.contains("￀") && s1.contains("￀")) {
                    s1 = s1.substring(0, s1.indexOf("￀")) + s1.substring(s1.indexOf("￀") + 1);
                }
                s1 = s1.replaceAll("\\u202E|\\u202D|\\n|\\r", "").trim();
            }
            if(!TextUtils.isEmpty(s1) || !TextUtils.isEmpty(s) && (s.endsWith("@chatroom") || CLS62.FLD317.MTH760("isChatroom", new Object[]{s}))) {
                s = s1;
            }
        }
        else {
            s = "";
        }
        cursor0.close();
        return s;
    }
}

