// Decompiled by JEB v5.42.0.202606242140

package p.pkg5;

import android.database.Cursor;
import android.text.TextUtils;
import p.pkg1.CLS1;
import p.pkg4.CLS21;
import p.pkg8.CLS44;
import p.pkg8.CLS53;

public final class CLS22 {
    public static final CLS22 FLD275;
    public Object FLD276;
    public Object FLD277;
    public String FLD278;

    static {
        CLS22.FLD275 = new CLS22();
    }

    // 此方法包含解密的字符串
    public final String MTH806() {
        String s1;
        boolean z1;
        Cursor cursor0;
        boolean z;
        String s = null;
        if(!TextUtils.isEmpty(this.FLD278)) {
            return this.FLD278;
        }
        if(TextUtils.isEmpty("SELECT value FROM userinfo WHERE id = 2")) {
        label_42:
            cursor0 = null;
        }
        else {
            try {
                Object object0 = this.MTH807();
                if(object0 == null) {
                    goto label_10;
                }
                else {
                    z = ((Boolean)CLS21.MTH801(object0, CLS44.MTH899("SqliteDB_isOpen"), new Object[0])).booleanValue();
                }
                goto label_11;
            }
            catch(Throwable throwable0) {
                try {
                    CLS44.MTH897(throwable0);
                label_10:
                    z = false;
                label_11:
                    if(z) {
                        Object object1 = this.MTH807();
                        if(object1 == null) {
                            goto label_19;
                        }
                        else {
                            cursor0 = (Cursor)CLS21.MTH801(object1, CLS44.MTH899("SqliteDB_rawQuery"), new Object[]{"SELECT value FROM userinfo WHERE id = 2", null, 0});
                        }
                    }
                    else {
                        goto label_19;
                    }
                    goto label_45;
                }
                catch(Throwable throwable1) {
                }
            }
            CLS44.MTH894("SELECT value FROM userinfo WHERE id = 2");
            CLS44.MTH897(throwable1);
            try {
            label_19:
                if(this.FLD276 == null) {
                    this.FLD276 = CLS53.FLD362.MTH943("getMainDB", new Object[0]);
                }
                Object object2 = this.FLD276;
                if(object2 == null) {
                    goto label_27;
                }
                else {
                    z1 = ((Boolean)CLS21.MTH801(object2, "isOpen", new Object[0])).booleanValue();
                }
                goto label_28;
            }
            catch(Throwable throwable2) {
            }
            try {
                CLS44.MTH897(throwable2);
            label_27:
                z1 = false;
            label_28:
                if(z1) {
                    if(this.FLD276 == null) {
                        this.FLD276 = CLS53.FLD362.MTH943("getMainDB", new Object[0]);
                    }
                    Object object3 = this.FLD276;
                    if(object3 == null) {
                        goto label_42;
                    }
                    else {
                        cursor0 = (Cursor)CLS21.MTH801(object3, "rawQuery", new Object[]{"SELECT value FROM userinfo WHERE id = 2", null});
                    }
                }
                else {
                    goto label_42;
                }
            }
            catch(Throwable throwable3) {
                CLS44.MTH894("SELECT value FROM userinfo WHERE id = 2");
                CLS44.MTH897(throwable3);
                cursor0 = null;
            }
        }
    label_45:
        if(cursor0 == null) {
            s1 = "";
        }
        else {
            if(cursor0.moveToFirst()) {
                s = cursor0.getString(cursor0.getColumnIndex("value"));
            }
            cursor0.close();
            s1 = s;
        }
        this.FLD278 = s1;
        return s1;
    }

    // 此方法包含解密的字符串
    public final Object MTH807() {
        Object object0 = null;
        if(this.FLD277 == null) {
            if(CLS44.MTH895("CoreStorage_dbField")) {
                try {
                    Object object1 = CLS1.MTH399();
                    if(object1 != null) {
                        String s = CLS44.MTH899("CoreStorage_dbField");
                        try {
                            object0 = CLS21.MTH802(object1.getClass(), s).get(object1);
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            CLS44.MTH897(illegalAccessException0);
                            throw new IllegalAccessError(illegalAccessException0.getMessage());
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS44.MTH897(throwable0);
                }
            }
            this.FLD277 = object0;
        }
        return this.FLD277;
    }
}

