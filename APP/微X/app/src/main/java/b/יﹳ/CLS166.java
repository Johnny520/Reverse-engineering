// Decompiled by JEB v5.42.0.202606242140

package b.יﹳ;

import android.text.TextUtils;
import android.widget.Button;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.WeakHashMap;

public final class CLS166 {
    public static final class CLS165 extends Error {
        public CLS165(Throwable throwable0) {
            super(throwable0);
        }
    }

    public static final HashMap FLD1581;
    public static final HashMap FLD1582;
    public static final HashMap FLD1583;
    public static final WeakHashMap FLD1584;

    static {
        CLS166.FLD1581 = new HashMap();
        CLS166.FLD1583 = new HashMap();
        CLS166.FLD1582 = new HashMap();
        CLS166.FLD1584 = new WeakHashMap();
    }

    public static int MTH3181(Object object0, String s) {
        try {
            return CLS166.MTH3187(object0.getClass(), s).getInt(object0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS27.MTH893(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Object MTH3182(Object object0, String s) {
        HashMap hashMap0;
        if(object0 == null) {
            throw new NullPointerException("object must not be null");
        }
        WeakHashMap weakHashMap0 = CLS166.FLD1584;
        synchronized(weakHashMap0) {
            hashMap0 = (HashMap)weakHashMap0.get(object0);
            if(hashMap0 == null) {
                return null;
            }
        }
        return hashMap0.get(s);
    }

    public static boolean MTH3183(Object object0, String s) {
        try {
            return CLS166.MTH3187(object0.getClass(), s).getBoolean(object0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS27.MTH893(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Object MTH3184(Object object0, String s, Class[] arr_class, Object[] arr_object) {
        Method method0 = null;
        if(object0 != null && !TextUtils.isEmpty(s)) {
            try {
                Class class0 = object0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    for(int v = 0; v < arr_class.length; ++v) {
                        if(arr_class[v] == null) {
                            if(method0 == null) {
                                method0 = CLS166.MTH3191(arr_object);
                            }
                            arr_class[v] = method0[v];
                        }
                    }
                    method0 = CLS166.MTH3201(class0, s, arr_class);
                }
                return method0.invoke(object0, arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                CLS27.MTH893(illegalAccessException0);
                throw new IllegalAccessError(illegalAccessException0.getMessage());
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new CLS165(invocationTargetException0.getCause());
            }
        }
        return null;
    }

    public static long MTH3185(Object object0, String s) {
        try {
            return CLS166.MTH3187(object0.getClass(), s).getLong(object0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS27.MTH893(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Object MTH3186(Class class0, String s) {
        try {
            return CLS166.MTH3187(class0, s).get(null);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS27.MTH893(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Field MTH3187(Class class0, String s) {
        Field field1;
        if(class0 != null && !TextUtils.isEmpty(s)) {
            String s1 = class0.getName() + '#' + s;
            HashMap hashMap0 = CLS166.FLD1581;
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
                label_11:
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
                    goto label_11;
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
        return null;
    }

    public static Object MTH3188(Class class0, Object[] arr_object) {
        if(class0 == null) {
            return null;
        }
        try {
            return CLS166.MTH3197(class0, arr_object).newInstance(arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS27.MTH893(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new CLS165(invocationTargetException0.getCause());
        }
        catch(InstantiationException instantiationException0) {
            throw new InstantiationError(instantiationException0.getMessage());
        }
    }

    public static void MTH3189(Object object0, String s, boolean z) {
        try {
            CLS166.MTH3187(object0.getClass(), s).setBoolean(object0, z);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS27.MTH893(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static void MTH3190(long v, Object object0, String s) {
        try {
            CLS166.MTH3187(object0.getClass(), s).setLong(object0, v);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS27.MTH893(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Class[] MTH3191(Object[] arr_object) {
        Class[] arr_class = new Class[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            arr_class[v] = object0 == null ? null : object0.getClass();
        }
        return arr_class;
    }

    public static Object MTH3192(Class class0, String s, Object[] arr_object) {
        if(class0 != null && !TextUtils.isEmpty(s)) {
            try {
                return CLS166.MTH3201(class0, s, CLS166.MTH3191(arr_object)).invoke(null, arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                CLS27.MTH893(illegalAccessException0);
                throw new IllegalAccessError(illegalAccessException0.getMessage());
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new CLS165(invocationTargetException0.getCause());
            }
        }
        return null;
    }

    public static void MTH3193(Object object0, String s) {
        HashMap hashMap0;
        if(object0 == null) {
            throw new NullPointerException("object must not be null");
        }
        WeakHashMap weakHashMap0 = CLS166.FLD1584;
        synchronized(weakHashMap0) {
            hashMap0 = (HashMap)weakHashMap0.get(object0);
            if(hashMap0 == null) {
                return;
            }
        }
        synchronized(hashMap0) {
            hashMap0.remove(s);
        }
    }

    public static Object MTH3194(Object object0, String s) {
        try {
            return CLS166.MTH3187(object0.getClass(), s).get(object0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS27.MTH893(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Object MTH3195(Object object0, String s, Object[] arr_object) {
        if(object0 != null && !TextUtils.isEmpty(s)) {
            try {
                return CLS166.MTH3201(object0.getClass(), s, CLS166.MTH3191(arr_object)).invoke(object0, arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                CLS27.MTH893(illegalAccessException0);
                throw new IllegalAccessError(illegalAccessException0.getMessage());
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new CLS165(invocationTargetException0.getCause());
            }
        }
        return null;
    }

    public static void MTH3196(int v, Object object0, String s) {
        try {
            CLS166.MTH3187(object0.getClass(), s).setInt(object0, v);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS27.MTH893(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static Constructor MTH3197(Class class0, Object[] arr_object) {
        Constructor constructor0;
        Class[] arr_class = CLS166.MTH3191(arr_object);
        if(class0 == null) {
            return null;
        }
        String s = class0.getName() + CLS166.MTH3200(arr_class) + "#bestmatch";
        HashMap hashMap0 = CLS166.FLD1582;
        if(hashMap0.containsKey(s)) {
            constructor0 = (Constructor)hashMap0.get(s);
            if(constructor0 == null) {
                throw new NoSuchMethodError(s);
            }
            return constructor0;
        }
        constructor0 = (Constructor)CLS21.FLD76.MTH836("findConstructorBestMatch", new Object[]{class0, arr_class});
        if(constructor0 == null) {
            throw new NoSuchMethodError(s);
        }
        hashMap0.put(s, constructor0);
        return constructor0;
    }

    public static void MTH3198(Object object0, String s, Object object1) {
        try {
            CLS166.MTH3187(object0.getClass(), s).set(object0, object1);
        }
        catch(IllegalAccessException illegalAccessException0) {
            CLS27.MTH893(illegalAccessException0);
            throw new IllegalAccessError(illegalAccessException0.getMessage());
        }
    }

    public static void MTH3199(Object object0, String s, Object object1) {
        HashMap hashMap0;
        if(object0 == null) {
            throw new NullPointerException("object must not be null");
        }
        WeakHashMap weakHashMap0 = CLS166.FLD1584;
        synchronized(weakHashMap0) {
            hashMap0 = (HashMap)weakHashMap0.get(object0);
            if(hashMap0 == null) {
                hashMap0 = new HashMap();
                weakHashMap0.put(object0, hashMap0);
            }
        }
        synchronized(hashMap0) {
            hashMap0.put(s, object1);
        }
    }

    public static String MTH3200(Class[] arr_class) {
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

    public static Method MTH3201(Class class0, String s, Class[] arr_class) {
        if(class0 != null && !TextUtils.isEmpty(s)) {
            String s1 = class0.getName() + '#' + s + CLS166.MTH3200(arr_class) + "#bestmatch";
            HashMap hashMap0 = CLS166.FLD1583;
            if(hashMap0.containsKey(s1)) {
                Method method0 = (Method)hashMap0.get(s1);
                if(method0 == null) {
                    throw new NoSuchMethodError(s1);
                }
                return method0;
            }
            Method method1 = (Method)CLS21.FLD76.MTH836("findMethodBestMatch", new Object[]{class0, s, arr_class});
            if(method1 == null) {
                throw new NoSuchMethodError(s1);
            }
            hashMap0.put(s1, method1);
            return method1;
        }
        return null;
    }

    public static Field MTH3202(Class class0) {
        Class class2;
        Class class1 = class0;
        do {
            Field[] arr_field = class1.getDeclaredFields();
            for(int v = 0; true; ++v) {
                class2 = Button.class;
                if(v >= arr_field.length) {
                    break;
                }
                Field field0 = arr_field[v];
                if(field0.getType() == class2) {
                    field0.setAccessible(true);
                    return field0;
                }
            }
            class1 = class1.getSuperclass();
        }
        while(class1 != null);
        throw new NoSuchFieldError("Field of type " + class2.getName() + " in class " + class0.getName());
    }
}

