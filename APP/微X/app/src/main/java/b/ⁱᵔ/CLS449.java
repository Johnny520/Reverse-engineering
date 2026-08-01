// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.database.Cursor;
import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;

public final class CLS449 {
    public Object FLD4407;
    public int FLD4408;
    public Object FLD4409;
    public static final CLS449 FLD4410;

    static {
        CLS449.FLD4410 = new CLS449();
    }

    // 此方法包含解密的字符串
    public CLS449() {
        new String("/*fkz*/");
        this.FLD4408 = 0;
    }

    // 此方法包含解密的字符串
    public final Object MTH6385() {
        Object object0 = null;
        if(this.FLD4409 == null) {
            if(CLS27.MTH890("FavDbCls1")) {
                try {
                    Object object1 = CLS166.MTH3195(CLS66.MTH1487(CLS27.MTH894("FavDbCls1")), CLS27.MTH897("PluginFav_getDb"), new Object[0]);
                    if(object1 != null) {
                        if(CLS27.MTH890("FavSearchStorageCls") && object1.getClass().getName().equals(CLS27.MTH897("FavSearchStorageCls"))) {
                            object0 = CLS166.MTH3192(CLS27.MTH894("SQLiteDatabaseCompat"), CLS27.MTH897("SQLiteDatabaseCompat_wrap"), new Object[]{CLS166.MTH3194(object1, CLS27.MTH897("FavSearchStorage_dbField"))});
                        }
                        else if(CLS27.MTH890("FavItemInfoStorage_getFavDb")) {
                            object0 = CLS166.MTH3195(object1, CLS27.MTH897("FavItemInfoStorage_getFavDb"), new Object[0]);
                        }
                        else if(CLS27.MTH890("FavItemInfoStorage_dbField")) {
                            object0 = CLS166.MTH3194(object1, CLS27.MTH897("FavItemInfoStorage_dbField"));
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            this.FLD4409 = object0;
            if(object0 != null) {
                if(CLS27.MTH890("SQLiteDatabaseCompat") && this.FLD4409.getClass().getName().equals(CLS27.MTH897("SQLiteDatabaseCompat"))) {
                    this.FLD4408 = 2;
                    return this.FLD4409;
                }
                this.FLD4408 = 1;
            }
        }
        return this.FLD4409;
    }

    // 此方法包含解密的字符串
    public final boolean MTH6386() {
        try {
            Object object0 = this.MTH6385();
            if(object0 != null) {
                return this.FLD4408 == 2 ? ((Boolean)CLS166.MTH3195(object0, CLS27.MTH897("SQLiteDatabaseCompat_isOpen"), new Object[0])).booleanValue() : ((Boolean)CLS166.MTH3195(object0, CLS27.MTH897("SqliteDB_isOpen"), new Object[0])).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    public static CLS449 MTH6387() {
        return CLS449.FLD4410;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final Cursor MTH6388(String s) {
        return this.MTH6390(CLS27.MTH882("q_fav1"), new String[]{s});
    }

    // 此方法包含解密的字符串
    public final int MTH6389(String s) {
        Cursor cursor0 = this.MTH6390(CLS27.MTH882("q_fav3"), new String[]{s});
        int v = -1;
        if(cursor0 == null) {
            return -1;
        }
        if(cursor0.moveToFirst()) {
            v = CLS182.MTH3490(0x38EA9BBC2B3CD335L, cursor0);
        }
        cursor0.close();
        return v;
    }

    // 此方法包含解密的字符串
    public final Cursor MTH6390(String s, String[] arr_s) {
        boolean z;
        String s1 = CLS182.MTH3484(4101261093400007477L, new StringBuilder(), s);
        if(!TextUtils.isEmpty(s1)) {
            try {
                if(this.MTH6386()) {
                    Object object0 = this.MTH6385();
                    if(object0 != null) {
                        return (Cursor)(this.FLD4408 == 2 ? CLS166.MTH3195(object0, CLS27.MTH897("SQLiteDatabaseCompat_rawQuery"), new Object[]{s1, arr_s}) : CLS166.MTH3195(object0, CLS27.MTH897("SqliteDB_rawQuery"), new Object[]{s1, arr_s, 0}));
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH906(s1);
                CLS27.MTH893(throwable0);
            }
            try {
                if(this.FLD4407 == null) {
                    this.FLD4407 = CLS21.FLD76.MTH836("getFavDB", new Object[0]);
                }
                Object object1 = this.FLD4407;
                if(object1 == null) {
                    z = false;
                }
                else {
                    try {
                        z = ((Boolean)CLS166.MTH3195(object1, "isOpen", new Object[0])).booleanValue();
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                        z = false;
                    }
                }
                if(z) {
                    if(this.FLD4407 == null) {
                        this.FLD4407 = CLS21.FLD76.MTH836("getFavDB", new Object[0]);
                    }
                    Object object2 = this.FLD4407;
                    if(object2 != null) {
                        return (Cursor)CLS166.MTH3195(object2, "rawQuery", new Object[]{s1, arr_s});
                    }
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH906(s1);
                CLS27.MTH893(throwable1);
            }
        }
        return null;
    }
}

