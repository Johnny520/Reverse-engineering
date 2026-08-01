package md;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okhttp3.C5750e;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5106t;
import p280t5.C8130u;
import p376zd.C9987e;

/* JADX INFO: renamed from: md.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5161p {
    public static final <T> T callMethod(Object obj, String str, Object... objArr) {
        obj.getClass();
        str.getClass();
        objArr.getClass();
        try {
            T t10 = (T) findMethodBestMatch(obj.getClass(), str, Arrays.copyOf(objArr, objArr.length)).invoke(obj, Arrays.copyOf(objArr, objArr.length));
            if (t10 == null) {
                return null;
            }
            return t10;
        } catch (Exception e10) {
            C5160o.m21174a("Failed to call method ", str, obj.getClass().getName(), e10);
            return null;
        }
    }

    public static final <T> T callMethodExact(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        obj.getClass();
        str.getClass();
        clsArr.getClass();
        objArr.getClass();
        try {
            T t10 = (T) findMethodExact(obj.getClass(), str, (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(objArr, objArr.length));
            if (t10 == null) {
                return null;
            }
            return t10;
        } catch (Exception e10) {
            C5160o.m21174a("Failed to call exact method ", str, obj.getClass().getName(), e10);
            return null;
        }
    }

    public static final <T> T callStaticMethod(Class<?> cls, String str, Object... objArr) {
        cls.getClass();
        str.getClass();
        objArr.getClass();
        try {
            Method methodFindMethodBestMatch = findMethodBestMatch(cls, str, Arrays.copyOf(objArr, objArr.length));
            if (Modifier.isStatic(methodFindMethodBestMatch.getModifiers())) {
                T t10 = (T) methodFindMethodBestMatch.invoke(null, Arrays.copyOf(objArr, objArr.length));
                if (t10 == null) {
                    return null;
                }
                return t10;
            }
            throw new IllegalArgumentException("Method " + str + " is not static");
        } catch (Exception e10) {
            C5160o.m21174a("Failed to call static method ", str, cls.getName(), e10);
            return null;
        }
    }

    public static final <T> T callStaticMethodExact(Class<?> cls, String str, Class<?>[] clsArr, Object... objArr) {
        cls.getClass();
        str.getClass();
        clsArr.getClass();
        objArr.getClass();
        try {
            Method methodFindMethodExact = findMethodExact(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Modifier.isStatic(methodFindMethodExact.getModifiers())) {
                T t10 = (T) methodFindMethodExact.invoke(null, Arrays.copyOf(objArr, objArr.length));
                if (t10 == null) {
                    return null;
                }
                return t10;
            }
            throw new IllegalArgumentException("Method " + str + " is not static");
        } catch (Exception e10) {
            C5160o.m21174a("Failed to call static exact method ", str, cls.getName(), e10);
            return null;
        }
    }

    public static final Class<?> findClass(String str, ClassLoader classLoader) throws ClassNotFoundException {
        str.getClass();
        classLoader.getClass();
        Class<?> cls = Class.forName(str, false, classLoader);
        cls.getClass();
        return cls;
    }

    public static final Class<?> findClassOrNull(String str, ClassLoader classLoader) {
        str.getClass();
        classLoader.getClass();
        try {
            return Class.forName(str, false, classLoader);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Constructor<?> findConstructorExact(Class<?> cls, Class<?>... clsArr) {
        cls.getClass();
        clsArr.getClass();
        C5159n c5159n = C5159n.f15754a;
        String strM21168d = c5159n.m21168d(cls, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        Constructor<?> constructor = (Constructor) c5159n.m21167c().get(strM21168d);
        if (constructor != null) {
            return constructor;
        }
        try {
            Constructor<?> declaredConstructor = clsArr.length == 0 ? cls.getDeclaredConstructor(null) : cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredConstructor.setAccessible(true);
            c5159n.m21167c().put(strM21168d, declaredConstructor);
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            throw new NoSuchMethodError("Constructor not found in ".concat(cls.getName()));
        }
    }

    public static final Field findField(Class<?> cls, String str) {
        cls.getClass();
        str.getClass();
        C5159n c5159n = C5159n.f15754a;
        String strM21170f = c5159n.m21170f(cls, str);
        Field field = (Field) c5159n.m21169e().get(strM21170f);
        if (field != null) {
            return field;
        }
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                C5159n.f15754a.m21169e().put(strM21170f, declaredField);
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldError("Field " + str + " not found in " + cls.getName());
    }

    public static final Field findFirstFieldByType(Class<?> cls, Class<?> cls2) {
        Field field;
        cls.getClass();
        cls2.getClass();
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            Field[] declaredFields = superclass.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i10];
                if (AbstractC1061t.m3842c(field.getType(), cls2)) {
                    break;
                }
                i10++;
            }
            if (field != null) {
                field.setAccessible(true);
                return field;
            }
        }
        throw new NoSuchFieldError("Field of type " + cls2.getName() + " not found in " + cls.getName());
    }

    public static final Method findMethodBestMatch(Class<?> cls, String str, Object... objArr) {
        cls.getClass();
        str.getClass();
        objArr.getClass();
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            Method[] declaredMethods = superclass.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (AbstractC1061t.m3842c(method.getName(), str) && method.getParameterCount() == objArr.length) {
                    int length = objArr.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        Object obj = objArr[i10];
                        Class<?> cls2 = method.getParameterTypes()[i10];
                        cls2.getClass();
                        if (!isAssignable(obj, cls2)) {
                            break;
                        }
                    }
                    method.setAccessible(true);
                    return method;
                }
            }
        }
        throw new NoSuchMethodError("Method " + str + " with matching args not found in " + cls.getName());
    }

    public static final Method findMethodExact(Class<?> cls, String str, Class<?>... clsArr) {
        cls.getClass();
        str.getClass();
        clsArr.getClass();
        C5159n c5159n = C5159n.f15754a;
        String strM21173i = c5159n.m21173i(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        Method method = (Method) c5159n.m21172h().get(strM21173i);
        if (method != null) {
            return method;
        }
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                C5159n.f15754a.m21172h().put(strM21173i, declaredMethod);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodError("Method " + str + " not found in " + cls.getName());
    }

    public static final List<Method> findMethodsByReturnType(Class<?> cls, Class<?> cls2) {
        cls.getClass();
        cls2.getClass();
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (AbstractC1061t.m3842c(method.getReturnType(), cls2)) {
                arrayList.add(method);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Method) it.next()).setAccessible(true);
        }
        return arrayList;
    }

    public static final Object getAdditionalField(Object obj, String str) {
        str.getClass();
        if (obj == null) {
            return null;
        }
        return C5159n.f15754a.m21171g(obj).get(str);
    }

    public static final List<Field> getAllFields(Class<?> cls) {
        cls.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        for (Field field : declaredFields) {
            field.setAccessible(true);
        }
        return AbstractC5106t.m20713V0(declaredFields);
    }

    public static final boolean getBooleanField(Object obj, String str) {
        obj.getClass();
        str.getClass();
        try {
            return findField(obj.getClass(), str).getBoolean(obj);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
            return false;
        }
    }

    public static final byte getByteField(Object obj, String str) {
        obj.getClass();
        str.getClass();
        try {
            return findField(obj.getClass(), str).getByte(obj);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
            return (byte) 0;
        }
    }

    public static final double getDoubleField(Object obj, String str) {
        obj.getClass();
        str.getClass();
        try {
            return findField(obj.getClass(), str).getDouble(obj);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
            return 0.0d;
        }
    }

    public static final <T> T getEnumConstant(Class<?> cls, String str) {
        Object obj;
        cls.getClass();
        str.getClass();
        if (!cls.isEnum()) {
            C9987e.m38645a(cls.getName().concat(" is not an Enum"));
            return null;
        }
        Object[] enumConstants = cls.getEnumConstants();
        if (enumConstants != null) {
            for (Object obj2 : enumConstants) {
                obj = (T) obj2;
                obj.getClass();
                if (AbstractC1061t.m3842c(((Enum) obj).name(), str)) {
                    break;
                }
            }
            obj = (T) null;
        } else {
            obj = (T) null;
        }
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    public static final float getFloatField(Object obj, String str) {
        obj.getClass();
        str.getClass();
        try {
            return findField(obj.getClass(), str).getFloat(obj);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
            return 0.0f;
        }
    }

    public static final int getIntField(Object obj, String str) {
        obj.getClass();
        str.getClass();
        try {
            return findField(obj.getClass(), str).getInt(obj);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
            return 0;
        }
    }

    public static final long getLongField(Object obj, String str) {
        obj.getClass();
        str.getClass();
        try {
            return findField(obj.getClass(), str).getLong(obj);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
            return 0L;
        }
    }

    public static final Object getObjectField(Object obj, String str) {
        obj.getClass();
        str.getClass();
        try {
            return findField(obj.getClass(), str).get(obj);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
            return null;
        }
    }

    public static final boolean getStaticBooleanField(Class<?> cls, String str) {
        cls.getClass();
        str.getClass();
        try {
            return findField(cls, str).getBoolean(null);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
            return false;
        }
    }

    public static final int getStaticIntField(Class<?> cls, String str) {
        cls.getClass();
        str.getClass();
        try {
            return findField(cls, str).getInt(null);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
            return 0;
        }
    }

    public static final long getStaticLongField(Class<?> cls, String str) {
        cls.getClass();
        str.getClass();
        try {
            return findField(cls, str).getLong(null);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
            return 0L;
        }
    }

    public static final Object getStaticObjectField(Class<?> cls, String str) {
        cls.getClass();
        str.getClass();
        try {
            return findField(cls, str).get(null);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
            return null;
        }
    }

    public static final String getStringField(Object obj, String str) {
        obj.getClass();
        str.getClass();
        Object objectField = getObjectField(obj, str);
        if (objectField instanceof String) {
            return (String) objectField;
        }
        return null;
    }

    private static final boolean isAssignable(Object obj, Class<?> cls) {
        if (obj == null) {
            return !cls.isPrimitive();
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return true;
        }
        if (cls.isPrimitive()) {
            Class cls2 = AbstractC1061t.m3842c(cls, Boolean.TYPE) ? Boolean.class : AbstractC1061t.m3842c(cls, Byte.TYPE) ? Byte.class : AbstractC1061t.m3842c(cls, Character.TYPE) ? Character.class : AbstractC1061t.m3842c(cls, Short.TYPE) ? Short.class : AbstractC1061t.m3842c(cls, Integer.TYPE) ? Integer.class : AbstractC1061t.m3842c(cls, Long.TYPE) ? Long.class : AbstractC1061t.m3842c(cls, Float.TYPE) ? Float.class : AbstractC1061t.m3842c(cls, Double.TYPE) ? Double.class : null;
            if (cls2 != null && cls2.isAssignableFrom(obj.getClass())) {
                return true;
            }
        }
        return false;
    }

    public static final <T> T[] newArray(Class<?> cls, int i10) {
        cls.getClass();
        Object objNewInstance = Array.newInstance(cls, i10);
        objNewInstance.getClass();
        return (T[]) ((Object[]) objNewInstance);
    }

    public static final <T> T newInstance(Class<?> cls, Object... objArr) {
        cls.getClass();
        objArr.getClass();
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        declaredConstructors.getClass();
        for (Constructor<?> constructor : declaredConstructors) {
            if (constructor.getParameterCount() == objArr.length) {
                int length = objArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = objArr[i10];
                    Class<?> cls2 = constructor.getParameterTypes()[i10];
                    cls2.getClass();
                    if (!isAssignable(obj, cls2)) {
                        break;
                    }
                }
                constructor.setAccessible(true);
                try {
                    return (T) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
                } catch (Exception e10) {
                    C8130u.m31512a("Failed to instantiate ".concat(cls.getName()), e10);
                    return null;
                }
            }
        }
        throw new NoSuchMethodError("No matching constructor found in ".concat(cls.getName()));
    }

    public static final <T> T newInstanceExact(Class<?> cls, Class<?>[] clsArr, Object... objArr) {
        cls.getClass();
        clsArr.getClass();
        objArr.getClass();
        try {
            return (T) findConstructorExact(cls, (Class[]) Arrays.copyOf(clsArr, clsArr.length)).newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (Exception e10) {
            C8130u.m31512a("Failed to exact instantiate ".concat(cls.getName()), e10);
            return null;
        }
    }

    public static final void setAdditionalField(Object obj, String str, Object obj2) {
        str.getClass();
        if (obj == null) {
            return;
        }
        if (obj2 == null) {
            C5159n.f15754a.m21171g(obj).remove(str);
        } else {
            C5159n.f15754a.m21171g(obj).put(str, obj2);
        }
    }

    public static final void setBooleanField(Object obj, String str, boolean z10) {
        obj.getClass();
        str.getClass();
        try {
            findField(obj.getClass(), str).setBoolean(obj, z10);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
        }
    }

    public static final void setDoubleField(Object obj, String str, double d10) {
        obj.getClass();
        str.getClass();
        try {
            findField(obj.getClass(), str).setDouble(obj, d10);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
        }
    }

    public static final void setFloatField(Object obj, String str, float f10) {
        obj.getClass();
        str.getClass();
        try {
            findField(obj.getClass(), str).setFloat(obj, f10);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
        }
    }

    public static final void setIntField(Object obj, String str, int i10) {
        obj.getClass();
        str.getClass();
        try {
            findField(obj.getClass(), str).setInt(obj, i10);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
        }
    }

    public static final void setLongField(Object obj, String str, long j10) {
        obj.getClass();
        str.getClass();
        try {
            findField(obj.getClass(), str).setLong(obj, j10);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
        }
    }

    public static final void setObjectField(Object obj, String str, Object obj2) {
        obj.getClass();
        str.getClass();
        try {
            findField(obj.getClass(), str).set(obj, obj2);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
        }
    }

    public static final void setStaticObjectField(Class<?> cls, String str, Object obj) {
        cls.getClass();
        str.getClass();
        try {
            findField(cls, str).set(null, obj);
        } catch (Exception e10) {
            C5750e.m23251a(e10);
        }
    }
}
