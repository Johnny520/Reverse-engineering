// Decompiled by JEB v5.42.0.202606242140

package p.pkg4;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.WeakHashMap;
import p.pkg8.CLS44;
import p.pkg8.CLS53;

public final class CLS21 {
    public static final class CLS20 extends Error {
        public CLS20(Throwable throwable0) {
            super(throwable0);
        }
    }

    public static final HashMap FLD273;
    public static final HashMap FLD274;

    static {
        CLS21.FLD273 = new HashMap();
        CLS21.FLD274 = new HashMap();
        new HashMap();
        new WeakHashMap();
    }

    public static Method MTH800(Class class0, String s, Object[] arr_object) {
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
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(class0.getName());
            stringBuilder0.append('#');
            stringBuilder0.append(s);
            StringBuilder stringBuilder1 = new StringBuilder("(");
            boolean z = true;
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                Class class1 = arr_class[v1];
                if(z) {
                    z = false;
                }
                else {
                    stringBuilder1.append(",");
                }
                stringBuilder1.append((class1 == null ? "null" : class1.getCanonicalName()));
            }
            stringBuilder1.append(")");
            stringBuilder0.append(stringBuilder1.toString());
            stringBuilder0.append("#bestmatch");
            String s1 = stringBuilder0.toString();
            HashMap hashMap0 = CLS21.FLD274;
            if(!hashMap0.containsKey(s1)) {
                goto label_36;
            }
            method0 = (Method)hashMap0.get(s1);
            if(method0 == null) {
                throw new NoSuchMethodError(s1);
            label_36:
                method0 = (Method)CLS53.FLD362.MTH943("findMethodBestMatch", new Object[]{class0, s, arr_class});
                if(method0 == null) {
                    throw new NoSuchMethodError(s1);
                }
                hashMap0.put(s1, method0);
                return method0;
            }
        }
        return method0;
    }

    public static Object MTH801(Object object0, String s, Object[] arr_object) {
        if(object0 != null && !TextUtils.isEmpty(s)) {
            try {
                return CLS21.MTH800(object0.getClass(), s, arr_object).invoke(object0, arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                CLS44.MTH897(illegalAccessException0);
                throw new IllegalAccessError(illegalAccessException0.getMessage());
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new CLS20(invocationTargetException0.getCause());
            }
        }
        return null;
    }

    public static Field MTH802(Class class0, String s) {
        Field field1;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        String s1 = class0.getName() + '#' + s;
        HashMap hashMap0 = CLS21.FLD273;
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

    public static Object MTH803(Class class0, String s, Object[] arr_object) {
        if(class0 != null && !TextUtils.isEmpty(s)) {
            try {
                return CLS21.MTH800(class0, s, arr_object).invoke(null, arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                CLS44.MTH897(illegalAccessException0);
                throw new IllegalAccessError(illegalAccessException0.getMessage());
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new CLS20(invocationTargetException0.getCause());
            }
        }
        return null;
    }
}

