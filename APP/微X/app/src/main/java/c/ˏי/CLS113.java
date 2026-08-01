// Decompiled by JEB v5.42.0.202606242140

package c.ˏי;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CLS113 {
    public Object[] FLD413;
    public final Object FLD414;
    public Object FLD415;

    public CLS113(Object object0) {
        this.FLD414 = object0;
    }

    public Object MTH1634() {
        return this.FLD414;
    }

    // 此方法包含解密的字符串
    public Object MTH1635() {
        Object object0 = this.FLD415;
        if(object0 != null) {
            return object0;
        }
        Object object1 = this.MTH1639("thisObject");
        this.FLD415 = object1;
        return object1;
    }

    // 此方法包含解密的字符串
    public Object MTH1636() {
        try {
            Method method0 = this.FLD414.getClass().getDeclaredMethod("getResult");
            method0.setAccessible(true);
            return method0.invoke(this.FLD414);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    // 此方法包含解密的字符串
    public void MTH1637(Object object0) {
        try {
            Method method0 = this.FLD414.getClass().getDeclaredMethod("setResult", Object.class);
            method0.setAccessible(true);
            method0.invoke(this.FLD414, object0);
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    public Object[] MTH1638() {
        Object[] arr_object = this.FLD413;
        if(arr_object != null) {
            return arr_object;
        }
        Object[] arr_object1 = (Object[])this.MTH1639("args");
        this.FLD413 = arr_object1;
        return arr_object1;
    }

    public final Object MTH1639(String s) {
        try {
            Field field0 = this.FLD414.getClass().getDeclaredField(s);
            if(field0 != null) {
                field0.setAccessible(true);
                return field0.get(this.FLD414);
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }
}

