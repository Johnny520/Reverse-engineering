// Decompiled by JEB v5.42.0.202606242140

package c.ˎﹳ;

import android.content.ContentValues;
import android.content.Context;
import c.ˏי.CLS110;
import c.ˏᵎ.CLS170;
import c.ˏᵎ.CLS185;
import java.util.ArrayList;
import java.util.Set;

public class CLS435 implements CLS108 {
    public final Object FLD377;
    public String FLD378;

    public CLS435(Object object0, String s) {
        this.FLD377 = object0;
        this.FLD378 = s;
    }

    // 此方法包含解密的字符串
    public Set MTH1510() {
        Object object0 = this.FLD377;
        if(object0 != null) {
            try {
                return (Set)CLS110.MTH1544(object0, "getDataChannels", new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public void MTH1511(String s, Object[] arr_object) {
        Object object0 = this.FLD377;
        if(object0 != null) {
            try {
                CLS110.MTH1544(object0, "publish", new Object[]{s, arr_object});
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public void MTH1512(String s, Object[] arr_object) {
        Object object0 = this.FLD377;
        if(object0 != null) {
            try {
                CLS110.MTH1544(object0, "publishIncrement", new Object[]{s, arr_object});
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public Set MTH1513() {
        Object object0 = this.FLD377;
        if(object0 != null) {
            try {
                return (Set)CLS110.MTH1544(object0, "getIdEventChannels", new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public Set MTH1514() {
        Object object0 = this.FLD377;
        if(object0 != null) {
            try {
                return (Set)CLS110.MTH1544(object0, "getEventChannels", new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public void MTH1515(String s, int v, Object[] arr_object) {
        Object object0 = this.FLD377;
        if(object0 != null) {
            try {
                CLS110.MTH1544(object0, "publishId", new Object[]{s, v, arr_object});
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public ContentValues MTH1516() {
        Object object0 = this.FLD377;
        if(object0 != null) {
            try {
                return (ContentValues)CLS110.MTH1544(object0, "getInfo", new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public boolean MTH1517(Context context0, Object[] arr_object) {
        Object object0 = this.FLD377;
        if(object0 != null) {
            try {
                return ((Boolean)CLS110.MTH1544(object0, "init", new Object[]{context0, arr_object})).booleanValue();
            }
            catch(Throwable throwable0) {
                CLS170.MTH2460().MTH2491();
                CLS185.MTH2708(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public void MTH1518(String s, Object[] arr_object) {
        Object object0 = this.FLD377;
        if(object0 != null) {
            try {
                CLS110.MTH1544(object0, "publishAsync", new Object[]{s, arr_object});
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // c.ˎﹳ.CLS108
    public void MTH1504() {
        Object object0 = this.FLD377;
        if(object0 != null) {
            try {
                CLS110.MTH1544(object0, "finish", new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    public String MTH1520() {
        return this.FLD378;
    }

    // 此方法包含解密的字符串
    public ArrayList MTH1521(String s, Object[] arr_object) {
        Object object0 = this.FLD377;
        if(object0 != null) {
            try {
                return (ArrayList)CLS110.MTH1544(object0, "getData", new Object[]{s, arr_object});
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return null;
    }
}

