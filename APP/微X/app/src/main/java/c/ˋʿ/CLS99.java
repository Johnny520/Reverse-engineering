// Decompiled by JEB v5.42.0.202606242140

package c.ˋʿ;

import android.text.TextUtils;
import com.android.xc.XposedTools.InvocationTargetError;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.WeakHashMap;

public class CLS99 {
    public static final HashMap FLD508;
    public static final HashMap FLD509;
    public static final HashMap FLD510;
    public static final WeakHashMap FLD511;

    static {
        CLS99.FLD509 = new HashMap();
        CLS99.FLD508 = new HashMap();
        CLS99.FLD510 = new HashMap();
        CLS99.FLD511 = new WeakHashMap();
    }

    public static Object MTH2083(Class class0, String s, Object[] arr_object) {
        if(class0 != null && !TextUtils.isEmpty(s)) {
            try {
                return CLS99.MTH2097(class0, s, arr_object).invoke(null, arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                CLS102.MTH2146(illegalAccessException0);
                throw new IllegalAccessError(illegalAccessException0.getMessage());
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new InvocationTargetError(invocationTargetException0.getCause());
            }
        }
        return null;
    }

    public static String MTH2084(Class[] arr_class) {
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

    public static Field MTH2085(Class class0, String s) {
        if(class0 != null && !TextUtils.isEmpty(s)) {
            String s1 = class0.getName() + '#' + s;
            HashMap hashMap0 = CLS99.FLD509;
            if(hashMap0.containsKey(s1)) {
                Field field0 = (Field)hashMap0.get(s1);
                if(field0 == null) {
                    throw new NoSuchFieldError(s1);
                }
                return field0;
            }
            try {
                Field field1 = CLS99.MTH2098(class0, s);
                field1.setAccessible(true);
                hashMap0.put(s1, field1);
                return field1;
            }
            catch(NoSuchFieldException unused_ex) {
                CLS99.FLD509.put(s1, null);
                throw new NoSuchFieldError(s1);
            }
        }
        return null;
    }

    public static Object MTH2086(Class class0, Object[] arr_object) {
        if(class0 == null) {
            return null;
        }
        try {
            return CLS99.MTH2099(class0, arr_object).newInstance(arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS102.MTH2146(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new InvocationTargetError(invocationTargetException0.getCause());
        }
        catch(InstantiationException instantiationException0) {
            throw new InstantiationError(instantiationException0.getMessage());
        }
    }

    public static Object MTH2087(Object object0, String s, Object[] arr_object) {
        if(object0 != null && !TextUtils.isEmpty(s)) {
            try {
                return CLS99.MTH2097(object0.getClass(), s, arr_object).invoke(object0, arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                CLS102.MTH2146(illegalAccessException0);
                throw new IllegalAccessError(illegalAccessException0.getMessage());
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new InvocationTargetError(invocationTargetException0.getCause());
            }
        }
        return null;
    }

    public static Class[] MTH2088(Object[] arr_object) {
        Class[] arr_class = new Class[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            arr_class[v] = object0 == null ? null : object0.getClass();
        }
        return arr_class;
    }

    public static Object MTH2089(Class class0, String s) {
        try {
            return CLS99.MTH2085(class0, s).get(null);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS102.MTH2146(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Object MTH2090(Object object0, String s) {
        HashMap hashMap0;
        if(object0 == null) {
            throw new NullPointerException("object must not be null");
        }
        if(s == null) {
            throw new NullPointerException("key must not be null");
        }
        WeakHashMap weakHashMap0 = CLS99.FLD511;
        synchronized(weakHashMap0) {
            hashMap0 = (HashMap)weakHashMap0.get(object0);
            if(hashMap0 == null) {
                return null;
            }
        }
        return hashMap0.get(s);
    }

    public static Object MTH2091(Object object0, String s, Object object1) {
        HashMap hashMap0;
        if(object0 == null) {
            throw new NullPointerException("object must not be null");
        }
        if(s == null) {
            throw new NullPointerException("key must not be null");
        }
        WeakHashMap weakHashMap0 = CLS99.FLD511;
        synchronized(weakHashMap0) {
            hashMap0 = (HashMap)weakHashMap0.get(object0);
            if(hashMap0 == null) {
                hashMap0 = new HashMap();
                weakHashMap0.put(object0, hashMap0);
            }
        }
        return hashMap0.put(s, object1);
    }

    public static void MTH2092(Object object0, String s, Object object1) {
        try {
            CLS99.MTH2085(object0.getClass(), s).set(object0, object1);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS102.MTH2146(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Object MTH2093(Object object0, String s) {
        try {
            return CLS99.MTH2085(object0.getClass(), s).get(object0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS102.MTH2146(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static int MTH2094(Class class0, String s) {
        try {
            return CLS99.MTH2085(class0, s).getInt(null);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS102.MTH2146(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Constructor MTH2095(Class class0, Class[] arr_class) {
        if(class0 == null) {
            return null;
        }
        String s = class0.getName() + CLS99.MTH2084(arr_class) + "#bestmatch";
        HashMap hashMap0 = CLS99.FLD510;
        if(hashMap0.containsKey(s)) {
            Constructor constructor0 = (Constructor)hashMap0.get(s);
            if(constructor0 == null) {
                throw new NoSuchMethodError(s);
            }
            return constructor0;
        }
        Constructor constructor1 = CLS102.MTH2152(class0, arr_class);
        if(constructor1 == null) {
            throw new NoSuchMethodError(s);
        }
        hashMap0.put(s, constructor1);
        return constructor1;
    }

    public static Method MTH2096(Class class0, String s, Class[] arr_class) {
        if(class0 != null && !TextUtils.isEmpty(s)) {
            String s1 = class0.getName() + '#' + s + CLS99.MTH2084(arr_class) + "#bestmatch";
            HashMap hashMap0 = CLS99.FLD508;
            if(hashMap0.containsKey(s1)) {
                Method method0 = (Method)hashMap0.get(s1);
                if(method0 == null) {
                    throw new NoSuchMethodError(s1);
                }
                return method0;
            }
            Method method1 = CLS102.MTH2179(class0, s, arr_class);
            if(method1 == null) {
                throw new NoSuchMethodError(s1);
            }
            hashMap0.put(s1, method1);
            return method1;
        }
        return null;
    }

    public static Method MTH2097(Class class0, String s, Object[] arr_object) {
        return CLS99.MTH2096(class0, s, CLS99.MTH2088(arr_object));
    }

    public static Field MTH2098(Class class0, String s) {
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

    public static Constructor MTH2099(Class class0, Object[] arr_object) {
        return CLS99.MTH2095(class0, CLS99.MTH2088(arr_object));
    }
}

