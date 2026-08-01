// Decompiled by JEB v5.42.0.202606242140

package c.ˏי;

import android.text.TextUtils;
import com.android.xc.XposedTools.InvocationTargetError;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.WeakHashMap;

public class CLS110 {
    public static final HashMap FLD385;
    public static final WeakHashMap FLD386;
    public static final HashMap FLD387;
    public static final HashMap FLD388;

    static {
        CLS110.FLD387 = new HashMap();
        CLS110.FLD388 = new HashMap();
        CLS110.FLD385 = new HashMap();
        CLS110.FLD386 = new WeakHashMap();
    }

    public static Constructor MTH1531(Class class0, Class[] arr_class) {
        if(class0 == null) {
            return null;
        }
        String s = class0.getName() + CLS110.MTH1533(arr_class) + "#bestmatch";
        HashMap hashMap0 = CLS110.FLD385;
        if(hashMap0.containsKey(s)) {
            Constructor constructor0 = (Constructor)hashMap0.get(s);
            if(constructor0 == null) {
                throw new NoSuchMethodError(s);
            }
            return constructor0;
        }
        Constructor constructor1 = CLS111.MTH1558(class0, arr_class);
        if(constructor1 == null) {
            throw new NoSuchMethodError(s);
        }
        hashMap0.put(s, constructor1);
        return constructor1;
    }

    public static Object MTH1532(Object object0, String s) {
        HashMap hashMap0;
        if(object0 == null) {
            throw new NullPointerException("object must not be null");
        }
        if(s == null) {
            throw new NullPointerException("key must not be null");
        }
        WeakHashMap weakHashMap0 = CLS110.FLD386;
        synchronized(weakHashMap0) {
            hashMap0 = (HashMap)weakHashMap0.get(object0);
            if(hashMap0 == null) {
                return null;
            }
        }
        return hashMap0.get(s);
    }

    public static String MTH1533(Class[] arr_class) {
        StringBuilder stringBuilder0 = new StringBuilder("(");
        boolean z = true;
        for(int v = 0; v < arr_class.length; ++v) {
            Class class0 = arr_class[v];
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(",");
            }
            stringBuilder0.append((class0 == null ? "null" : class0.getCanonicalName()));
        }
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    public static Field MTH1534(Class class0, String s) {
        if(class0 != null && !TextUtils.isEmpty(s)) {
            String s1 = class0.getName() + '#' + s;
            HashMap hashMap0 = CLS110.FLD387;
            if(hashMap0.containsKey(s1)) {
                Field field0 = (Field)hashMap0.get(s1);
                if(field0 == null) {
                    throw new NoSuchFieldError(s1);
                }
                return field0;
            }
            try {
                Field field1 = CLS110.MTH1538(class0, s);
                field1.setAccessible(true);
                hashMap0.put(s1, field1);
                return field1;
            }
            catch(NoSuchFieldException unused_ex) {
                CLS110.FLD387.put(s1, null);
                throw new NoSuchFieldError(s1);
            }
        }
        return null;
    }

    public static int MTH1535(Class class0, String s) {
        try {
            return CLS110.MTH1534(class0, s).getInt(null);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS111.MTH1585(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Constructor MTH1536(Class class0, Object[] arr_object) {
        return CLS110.MTH1531(class0, CLS110.MTH1537(arr_object));
    }

    public static Class[] MTH1537(Object[] arr_object) {
        Class[] arr_class = new Class[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            arr_class[v] = object0 == null ? null : object0.getClass();
        }
        return arr_class;
    }

    public static Field MTH1538(Class class0, String s) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            while(true) {
                class0 = class0.getSuperclass();
                if(class0 == null || class0.equals(Object.class)) {
                    break;
                }
                try {
                    return class0.getDeclaredField(s);
                }
                catch(NoSuchFieldException unused_ex) {
                }
            }
            throw noSuchFieldException0;
        }
    }

    public static Object MTH1539(Class class0, String s) {
        try {
            return CLS110.MTH1534(class0, s).get(null);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS111.MTH1585(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static void MTH1540(Object object0, String s, Object object1) {
        try {
            CLS110.MTH1534(object0.getClass(), s).set(object0, object1);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS111.MTH1585(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Object MTH1541(Class class0, Object[] arr_object) {
        if(class0 == null) {
            return null;
        }
        try {
            return CLS110.MTH1536(class0, arr_object).newInstance(arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS111.MTH1585(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new InvocationTargetError(invocationTargetException0.getCause());
        }
        catch(InstantiationException instantiationException0) {
            throw new InstantiationError(instantiationException0.getMessage());
        }
    }

    public static Method MTH1542(Class class0, String s, Object[] arr_object) {
        return CLS110.MTH1546(class0, s, CLS110.MTH1537(arr_object));
    }

    public static Object MTH1543(Object object0, String s) {
        try {
            return CLS110.MTH1534(object0.getClass(), s).get(object0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS111.MTH1585(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Object MTH1544(Object object0, String s, Object[] arr_object) {
        if(object0 != null && !TextUtils.isEmpty(s)) {
            try {
                return CLS110.MTH1542(object0.getClass(), s, arr_object).invoke(object0, arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                CLS111.MTH1585(illegalAccessException0);
                throw new IllegalAccessError(illegalAccessException0.getMessage());
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new InvocationTargetError(invocationTargetException0.getCause());
            }
        }
        return null;
    }

    public static Object MTH1545(Object object0, String s, Object object1) {
        HashMap hashMap0;
        if(object0 == null) {
            throw new NullPointerException("object must not be null");
        }
        if(s == null) {
            throw new NullPointerException("key must not be null");
        }
        WeakHashMap weakHashMap0 = CLS110.FLD386;
        synchronized(weakHashMap0) {
            hashMap0 = (HashMap)weakHashMap0.get(object0);
            if(hashMap0 == null) {
                hashMap0 = new HashMap();
                weakHashMap0.put(object0, hashMap0);
            }
        }
        return hashMap0.put(s, object1);
    }

    public static Method MTH1546(Class class0, String s, Class[] arr_class) {
        if(class0 != null && !TextUtils.isEmpty(s)) {
            String s1 = class0.getName() + '#' + s + CLS110.MTH1533(arr_class) + "#bestmatch";
            HashMap hashMap0 = CLS110.FLD388;
            if(hashMap0.containsKey(s1)) {
                Method method0 = (Method)hashMap0.get(s1);
                if(method0 == null) {
                    throw new NoSuchMethodError(s1);
                }
                return method0;
            }
            Method method1 = CLS111.MTH1563(class0, s, arr_class);
            if(method1 == null) {
                throw new NoSuchMethodError(s1);
            }
            hashMap0.put(s1, method1);
            return method1;
        }
        return null;
    }

    public static Object MTH1547(Class class0, String s, Object[] arr_object) {
        if(class0 != null && !TextUtils.isEmpty(s)) {
            try {
                return CLS110.MTH1542(class0, s, arr_object).invoke(null, arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                CLS111.MTH1585(illegalAccessException0);
                throw new IllegalAccessError(illegalAccessException0.getMessage());
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new InvocationTargetError(invocationTargetException0.getCause());
            }
        }
        return null;
    }
}

