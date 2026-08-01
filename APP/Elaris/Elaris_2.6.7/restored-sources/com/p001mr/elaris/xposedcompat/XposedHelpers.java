package com.p001mr.elaris.xposedcompat;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.C0479u2;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class XposedHelpers {

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class ClassNotFoundError extends Error {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ClassNotFoundError(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class InvocationTargetError extends Error {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public InvocationTargetError(Throwable th) {
            super(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private XposedHelpers() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object callMethod(Object obj, String str, Object... objArr) {
        if (obj == null) {
            throw new NullPointerException("obj == null");
        }
        Method methodFindBestMethod = findBestMethod(obj.getClass(), str, objArr);
        try {
            methodFindBestMethod.setAccessible(true);
            if (objArr == null) {
                objArr = new Object[0];
            }
            return methodFindBestMethod.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalAccessError(String.valueOf(e));
        } catch (InvocationTargetException e2) {
            throw new InvocationTargetError(e2.getCause());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object callStaticMethod(Class<?> cls, String str, Object... objArr) {
        Method methodFindBestMethod = findBestMethod(cls, str, objArr);
        try {
            methodFindBestMethod.setAccessible(true);
            if (objArr == null) {
                objArr = new Object[0];
            }
            return methodFindBestMethod.invoke(null, objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalAccessError(String.valueOf(e));
        } catch (InvocationTargetException e2) {
            throw new InvocationTargetError(e2.getCause());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static XC_MethodHook.Unhook findAndHookMethod(Class<?> cls, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0 || !(objArr[objArr.length - 1] instanceof XC_MethodHook)) {
            throw new IllegalArgumentException("no callback supplied");
        }
        return XposedBridge.hookMethod(findMethodExact(cls, str, getParameterClasses(cls.getClassLoader(), objArr, objArr.length - 1)), (XC_MethodHook) objArr[objArr.length - 1]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Constructor<?> findBestConstructor(Class<?> cls, Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            if (constructor.getParameterTypes().length == length && matches(constructor.getParameterTypes(), objArr)) {
                return constructor;
            }
        }
        throw new NoSuchMethodError(cls.getName().concat("#<init>"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Method findBestMethod(Class<?> cls, String str, Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            for (Method method : superclass.getDeclaredMethods()) {
                if (str.equals(method.getName()) && method.getParameterTypes().length == length && matches(method.getParameterTypes(), objArr)) {
                    return method;
                }
            }
        }
        throw new NoSuchMethodError(cls.getName() + "#" + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> findClass(String str, ClassLoader classLoader) {
        if (classLoader == null) {
            try {
                classLoader = XposedBridge.BOOTCLASSLOADER;
            } catch (ClassNotFoundException e) {
                throw new ClassNotFoundError(e);
            }
        }
        return Class.forName(str, false, classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> findClassIfExists(String str, ClassLoader classLoader) {
        try {
            return findClass(str, classLoader);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Constructor<?> findConstructorExact(Class<?> cls, Object... objArr) {
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(getParameterClasses(cls.getClassLoader(), objArr, objArr.length));
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            throw new NoSuchMethodError(cls.getName().concat("#<init>"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Field findField(Class<?> cls, String str) {
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldError(cls.getName() + "#" + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Field findFieldIfExists(Class<?> cls, String str) {
        try {
            return findField(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Field findFirstFieldByExactType(Class<?> cls, Class<?> cls2) {
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
        }
        throw new NoSuchFieldError(cls.getName() + "#" + cls2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Method findMethodExact(Class<?> cls, String str, Class<?>... clsArr) {
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodError(cls.getName() + "#" + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Method findMethodExactIfExists(Class<?> cls, String str, Object... objArr) {
        try {
            return findMethodExact(cls, str, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getIntField(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException("obj == null");
        }
        try {
            return findField(obj.getClass(), str).getInt(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalAccessError(String.valueOf(e));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object getObjectField(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException("obj == null");
        }
        try {
            return findField(obj.getClass(), str).get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalAccessError(String.valueOf(e));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Class<?>[] getParameterClasses(ClassLoader classLoader, Object[] objArr, int i) {
        Class<?>[] clsArr = new Class[i];
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (obj instanceof Class) {
                clsArr[i2] = (Class) obj;
            } else {
                if (!(obj instanceof String)) {
                    C0479u2.m1036a(obj, "parameter type must be Class or String: ");
                    return null;
                }
                clsArr[i2] = findClass((String) obj, classLoader);
            }
        }
        return clsArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object getStaticObjectField(Class<?> cls, String str) {
        try {
            return findField(cls, str).get(null);
        } catch (IllegalAccessException e) {
            throw new IllegalAccessError(String.valueOf(e));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean matches(Class<?>[] clsArr, Object[] objArr) {
        if (objArr == null) {
            return clsArr.length == 0;
        }
        for (int i = 0; i < clsArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                if (clsArr[i].isPrimitive()) {
                    return false;
                }
            } else if (!wrap(clsArr[i]).isInstance(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object newInstance(Class<?> cls, Object... objArr) {
        Constructor<?> constructorFindBestConstructor = findBestConstructor(cls, objArr);
        try {
            constructorFindBestConstructor.setAccessible(true);
            if (objArr == null) {
                objArr = new Object[0];
            }
            return constructorFindBestConstructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalAccessError(String.valueOf(e));
        } catch (InstantiationException e2) {
            throw new InstantiationError(String.valueOf(e2));
        } catch (InvocationTargetException e3) {
            throw new InvocationTargetError(e3.getCause());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setIntField(Object obj, String str, int i) {
        if (obj == null) {
            throw new NullPointerException("obj == null");
        }
        try {
            findField(obj.getClass(), str).setInt(obj, i);
        } catch (IllegalAccessException e) {
            throw new IllegalAccessError(String.valueOf(e));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setObjectField(Object obj, String str, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("obj == null");
        }
        try {
            findField(obj.getClass(), str).set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new IllegalAccessError(String.valueOf(e));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setStaticObjectField(Class<?> cls, String str, Object obj) {
        try {
            findField(cls, str).set(null, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalAccessError(String.valueOf(e));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Class<?> wrap(Class<?> cls) {
        return !cls.isPrimitive() ? cls : cls == Boolean.TYPE ? Boolean.class : cls == Byte.TYPE ? Byte.class : cls == Character.TYPE ? Character.class : cls == Double.TYPE ? Double.class : cls == Float.TYPE ? Float.class : cls == Integer.TYPE ? Integer.class : cls == Long.TYPE ? Long.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    public static Method findMethodExact(Class<?> cls, String str, Object... objArr) {
        return findMethodExact(cls, str, getParameterClasses(cls.getClassLoader(), objArr, objArr.length));
    }

    public static XC_MethodHook.Unhook findAndHookMethod(String str, ClassLoader classLoader, String str2, Object... objArr) {
        return findAndHookMethod(findClass(str, classLoader), str2, objArr);
    }
}
