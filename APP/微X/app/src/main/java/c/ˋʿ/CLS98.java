// Decompiled by JEB v5.42.0.202606242140

package c.ˋʿ;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CLS98 {
    public Object FLD505;
    public final Object FLD506;
    public Object[] FLD507;

    public CLS98(Object object0) {
        this.FLD506 = object0;
    }

    public final Object MTH2076(String s) {
        try {
            Field field0 = this.FLD506.getClass().getDeclaredField(s);
            if(field0 != null) {
                field0.setAccessible(true);
                return field0.get(this.FLD506);
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    // 此方法包含解密的字符串
    public Object MTH2077() {
        Object object0 = this.FLD505;
        if(object0 != null) {
            return object0;
        }
        Object object1 = this.MTH2076("\uD8E3hisObject");
        this.FLD505 = object1;
        return object1;
    }

    // 此方法包含解密的字符串
    public Object[] MTH2078() {
        Object[] arr_object = this.FLD507;
        if(arr_object != null) {
            return arr_object;
        }
        Object[] arr_object1 = (Object[])this.MTH2076("\uD8E3rgs");
        this.FLD507 = arr_object1;
        return arr_object1;
    }

    public Object MTH2079() {
        return this.FLD506;
    }

    // 此方法包含解密的字符串
    public void MTH2080(Object object0) {
        try {
            Method method0 = this.FLD506.getClass().getDeclaredMethod("\uD8E3etResult", Object.class);
            method0.setAccessible(true);
            method0.invoke(this.FLD506, object0);
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    public Object MTH2081() {
        try {
            Method method0 = this.FLD506.getClass().getDeclaredMethod("\uD8E3etResult");
            method0.setAccessible(true);
            return method0.invoke(this.FLD506);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }
}

