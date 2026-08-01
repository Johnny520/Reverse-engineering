// Decompiled by JEB v5.42.0.202606242140

package t.ʻˑ;

import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.WeakHashMap;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;

public final class CLS3 {
    public static final class CLS2 extends Error {
        public CLS2(Throwable throwable0) {
            super(throwable0);
        }
    }

    public static final HashMap FLD77;
    public static final HashMap FLD78;
    public static final HashMap FLD79;
    public static final WeakHashMap FLD80;

    static {
        CLS3.FLD77 = new HashMap();
        CLS3.FLD79 = new HashMap();
        CLS3.FLD78 = new HashMap();
        CLS3.FLD80 = new WeakHashMap();
    }

    public static Object MTH988(Class class0, Object[] arr_object) {
        if(class0 == null) {
            return null;
        }
        try {
            return CLS3.MTH994(class0, arr_object).newInstance(arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS133.MTH2113(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new CLS2(invocationTargetException0.getCause());
        }
        catch(InstantiationException instantiationException0) {
            throw new InstantiationError(instantiationException0.getMessage());
        }
    }

    public static Object MTH989(Object object0, String s) {
        try {
            return CLS3.MTH997(object0.getClass(), s).get(object0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS133.MTH2113(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static String MTH990(Class[] arr_class) {
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

    public static Object MTH991(Object object0, String s, Object[] arr_object) {
        if(object0 != null && !TextUtils.isEmpty(s)) {
            try {
                return CLS3.MTH993(object0.getClass(), s, arr_object).invoke(object0, arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                CLS133.MTH2113(illegalAccessException0);
                throw new IllegalAccessError(illegalAccessException0.getMessage());
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new CLS2(invocationTargetException0.getCause());
            }
        }
        return null;
    }

    public static void MTH992(Object object0, String s, Boolean boolean0) {
        HashMap hashMap0;
        if(object0 == null) {
            throw new NullPointerException("object must not be null");
        }
        WeakHashMap weakHashMap0 = CLS3.FLD80;
        synchronized(weakHashMap0) {
            hashMap0 = (HashMap)weakHashMap0.get(object0);
            if(hashMap0 == null) {
                hashMap0 = new HashMap();
                weakHashMap0.put(object0, hashMap0);
            }
        }
        synchronized(hashMap0) {
            hashMap0.put(s, boolean0);
        }
    }

    public static Method MTH993(Class class0, String s, Object[] arr_object) {
        Method method0;
        Class[] arr_class = new Class[arr_object.length];
        for(int v = 0; true; ++v) {
            method0 = null;
            if(v >= arr_object.length) {
                break;
            }
            Object object0 = arr_object[v];
            if(object0 != null) {
                method0 = object0.getClass();
            }
            arr_class[v] = method0;
        }
        if(class0 != null && !TextUtils.isEmpty(s)) {
            String s1 = class0.getName() + '#' + s + CLS3.MTH990(arr_class) + "#bestmatch";
            HashMap hashMap0 = CLS3.FLD79;
            if(!hashMap0.containsKey(s1)) {
                goto label_17;
            }
            method0 = (Method)hashMap0.get(s1);
            if(method0 == null) {
                throw new NoSuchMethodError(s1);
            label_17:
                method0 = (Method)CLS123.FLD912.MTH2003("findMethodBestMatch", new Object[]{class0, s, arr_class});
                if(method0 == null) {
                    throw new NoSuchMethodError(s1);
                }
                hashMap0.put(s1, method0);
                return method0;
            }
        }
        return method0;
    }

    public static Constructor MTH994(Class class0, Object[] arr_object) {
        Constructor constructor0;
        Class[] arr_class = new Class[arr_object.length];
        for(int v = 0; true; ++v) {
            constructor0 = null;
            if(v >= arr_object.length) {
                break;
            }
            Object object0 = arr_object[v];
            if(object0 != null) {
                constructor0 = object0.getClass();
            }
            arr_class[v] = constructor0;
        }
        if(class0 != null) {
            String s = class0.getName() + CLS3.MTH990(arr_class) + "#bestmatch";
            HashMap hashMap0 = CLS3.FLD78;
            if(!hashMap0.containsKey(s)) {
                goto label_17;
            }
            constructor0 = (Constructor)hashMap0.get(s);
            if(constructor0 == null) {
                throw new NoSuchMethodError(s);
            label_17:
                constructor0 = (Constructor)CLS123.FLD912.MTH2003("findConstructorBestMatch", new Object[]{class0, arr_class});
                if(constructor0 == null) {
                    throw new NoSuchMethodError(s);
                }
                hashMap0.put(s, constructor0);
                return constructor0;
            }
        }
        return constructor0;
    }

    public static void MTH995(Object object0, String s, Object object1) {
        try {
            CLS3.MTH997(object0.getClass(), s).set(object0, object1);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS133.MTH2113(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Object MTH996(Class class0, String s, Object[] arr_object) {
        if(class0 != null && !TextUtils.isEmpty(s)) {
            try {
                return CLS3.MTH993(class0, s, arr_object).invoke(null, arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                CLS133.MTH2113(illegalAccessException0);
                throw new IllegalAccessError(illegalAccessException0.getMessage());
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new CLS2(invocationTargetException0.getCause());
            }
        }
        return null;
    }

    public static Field MTH997(Class class0, String s) {
        Field field1;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        String s1 = class0.getName() + '#' + s;
        HashMap hashMap0 = CLS3.FLD77;
        if(hashMap0.containsKey(s1)) {
            Field field0 = (Field)hashMap0.get(s1);
            if(field0 == null) {
                throw new NoSuchFieldError(s1);
            }
            return field0;
        }
        try {
            field1 = class0.getDeclaredField(s);
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            try {
            label_12:
                class0 = class0.getSuperclass();
                if(class0 == null || class0.equals(Object.class)) {
                    throw noSuchFieldException0;
                }
            }
            catch(NoSuchFieldException unused_ex) {
                hashMap0.put(s1, null);
                throw new NoSuchFieldError(s1);
            }
            try {
                field1 = class0.getDeclaredField(s);
            }
            catch(NoSuchFieldException unused_ex) {
                goto label_12;
            }
        }
        try {
            field1.setAccessible(true);
            hashMap0.put(s1, field1);
            return field1;
        }
        catch(NoSuchFieldException unused_ex) {
            hashMap0.put(s1, null);
            throw new NoSuchFieldError(s1);
        }
    }

    public static int MTH998(Object object0, String s) {
        try {
            return CLS3.MTH997(object0.getClass(), s).getInt(object0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS133.MTH2113(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Object MTH999(Object object0, String s) {
        HashMap hashMap0;
        if(object0 == null) {
            throw new NullPointerException("object must not be null");
        }
        WeakHashMap weakHashMap0 = CLS3.FLD80;
        synchronized(weakHashMap0) {
            hashMap0 = (HashMap)weakHashMap0.get(object0);
            if(hashMap0 == null) {
                return null;
            }
        }
        return hashMap0.get(s);
    }
}

