// Decompiled by JEB v5.42.0.202606242140

package b.יﹳ;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class CLS167 {
    public final Object FLD1585;
    public Object[] FLD1586;
    public Object FLD1587;

    public CLS167(Object object0) {
        this.FLD1585 = object0;
    }

    // 此方法包含解密的字符串
    public final Object[] MTH3204() {
        Object object1;
        Object[] arr_object = this.FLD1586;
        if(arr_object != null) {
            return arr_object;
        }
        try {
            Object object0 = this.FLD1585;
            Field field0 = object0.getClass().getDeclaredField("args");
            object1 = null;
            if(field0 != null) {
                field0.setAccessible(true);
                object1 = field0.get(object0);
            }
        }
        catch(Throwable unused_ex) {
        }
        this.FLD1586 = (Object[])object1;
        return (Object[])object1;
    }

    // 此方法包含解密的字符串
    public final Object MTH3205() {
        Object object2;
        Object object0 = this.FLD1587;
        if(object0 != null) {
            return object0;
        }
        try {
            Object object1 = this.FLD1585;
            Field field0 = object1.getClass().getDeclaredField("thisObject");
            object2 = null;
            if(field0 != null) {
                field0.setAccessible(true);
                object2 = field0.get(object1);
            }
        }
        catch(Throwable unused_ex) {
        }
        this.FLD1587 = object2;
        return object2;
    }

    // 此方法包含解密的字符串
    public final Object MTH3206() {
        try {
            Method method0 = this.FLD1585.getClass().getDeclaredMethod("getResult");
            method0.setAccessible(true);
            return method0.invoke(this.FLD1585);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH3207(Object object0) {
        try {
            Method method0 = this.FLD1585.getClass().getDeclaredMethod("setResult", Object.class);
            method0.setAccessible(true);
            method0.invoke(this.FLD1585, object0);
        }
        catch(Throwable unused_ex) {
        }
    }
}

