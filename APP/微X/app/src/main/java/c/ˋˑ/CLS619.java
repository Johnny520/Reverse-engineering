// Decompiled by JEB v5.42.0.202606242140

package c.ˋˑ;

import android.content.ContentValues;
import android.content.Context;
import c.ˋʿ.CLS99;
import c.ـˉ.CLS204;
import c.ـˉ.CLS261;
import java.util.ArrayList;
import java.util.Set;

public class CLS619 implements CLS103 {
    public String FLD548;
    public final Object FLD549;

    public CLS619(Object object0, String s) {
        this.FLD549 = object0;
        this.FLD548 = s;
    }

    // 此方法包含解密的字符串
    public ArrayList MTH2257(String s, Object[] arr_object) {
        Object object0 = this.FLD549;
        if(object0 != null) {
            try {
                return (ArrayList)CLS99.MTH2087(object0, "\uD8E3etData", new Object[]{s, arr_object});
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public void MTH2258(String s, Object[] arr_object) {
        Object object0 = this.FLD549;
        if(object0 != null) {
            try {
                CLS99.MTH2087(object0, "\uD8E3ublishIncrement", new Object[]{s, arr_object});
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public Set MTH2259() {
        Object object0 = this.FLD549;
        if(object0 != null) {
            try {
                return (Set)CLS99.MTH2087(object0, "\uD8E3etIdEventChannels", new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    @Override  // c.ˋˑ.CLS103
    public void MTH2193() {
        Object object0 = this.FLD549;
        if(object0 != null) {
            try {
                CLS99.MTH2087(object0, "\uD8E3inish", new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public void MTH2261(String s, int v, Object[] arr_object) {
        Object object0 = this.FLD549;
        if(object0 != null) {
            try {
                CLS99.MTH2087(object0, "\uD8E3ublishId", new Object[]{s, v, arr_object});
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public void MTH2262(String s, Object[] arr_object) {
        Object object0 = this.FLD549;
        if(object0 != null) {
            try {
                CLS99.MTH2087(object0, "\uD8E3ublish", new Object[]{s, arr_object});
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public void MTH2263(String s, Object[] arr_object) {
        Object object0 = this.FLD549;
        if(object0 != null) {
            try {
                CLS99.MTH2087(object0, "\uD8E3ublishAsync", new Object[]{s, arr_object});
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public Set MTH2264() {
        Object object0 = this.FLD549;
        if(object0 != null) {
            try {
                return (Set)CLS99.MTH2087(object0, "\uD8E3etDataChannels", new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return null;
    }

    public String MTH2265() {
        return this.FLD548;
    }

    // 此方法包含解密的字符串
    public boolean MTH2266(Context context0, Object[] arr_object) {
        Object object0 = this.FLD549;
        if(object0 != null) {
            try {
                return ((Boolean)CLS99.MTH2087(object0, "\uD8E3nit", new Object[]{context0, arr_object})).booleanValue();
            }
            catch(Throwable throwable0) {
                CLS261.MTH3881().MTH3883();
                CLS204.MTH3257(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public ContentValues MTH2267() {
        Object object0 = this.FLD549;
        if(object0 != null) {
            try {
                return (ContentValues)CLS99.MTH2087(object0, "\uD8E3etInfo", new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public Set MTH2268() {
        Object object0 = this.FLD549;
        if(object0 != null) {
            try {
                return (Set)CLS99.MTH2087(object0, "\uD8E3etEventChannels", new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return null;
    }
}

