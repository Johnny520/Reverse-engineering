package p099h.Hchat.utils;

import gg.AbstractC1416l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p092g4.AbstractC1341a;
import p174m.C2571a;
import p240q6.C3441a;
import p240q6.C3442b;
import p240q6.C3443c;
import p256r6.C3709c;
import p276sf.C3959f;
import p313v6.C4481a;
import p313v6.C4482b;
import p313v6.C4483c;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class KavaReflector {
    public static final int $stable = 0;
    public static final KavaReflector INSTANCE = new KavaReflector();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private KavaReflector() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Method accessible(Method method) {
        if (method != null) {
            return (Method) INSTANCE.accessible(method);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean areAssignable(Class<?>[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        Iterable iterableM8364A0 = AbstractC4165l.m8364A0(clsArr);
        if ((iterableM8364A0 instanceof Collection) && ((Collection) iterableM8364A0).isEmpty()) {
            return true;
        }
        Iterator it = iterableM8364A0.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (!Boolean.valueOf(INSTANCE.isAssignableForCtor(clsArr[iIntValue], objArr[iIntValue])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Class<?> boxType(Class<?> cls) {
        return !cls.isPrimitive() ? cls : cls.equals(Integer.TYPE) ? Integer.class : cls.equals(Long.TYPE) ? Long.class : cls.equals(Boolean.TYPE) ? Boolean.class : cls.equals(Double.TYPE) ? Double.class : cls.equals(Float.TYPE) ? Float.class : cls.equals(Short.TYPE) ? Short.class : cls.equals(Byte.TYPE) ? Byte.class : cls.equals(Character.TYPE) ? Character.class : cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0048 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static final List<Constructor<?>> declaredConstructors(Class<?> cls) {
        ?? c3959f;
        C4173t c4173t = C4173t.f13710g;
        if (cls == null) {
            return c4173t;
        }
        KavaReflector kavaReflector = INSTANCE;
        try {
            C2571a c2571aM3580K = AbstractC1341a.m3580K(cls);
            c2571aM3580K.m6037s();
            C3441a c3441a = new C3441a();
            c3441a.f12066a = (C3709c) c2571aM3580K.f8339h;
            List listM7222b = c3441a.m7222b();
            c3959f = new ArrayList(AbstractC4167n.m8429e1(listM7222b));
            Iterator it = listM7222b.iterator();
            while (it.hasNext()) {
                c3959f.add((Constructor) kavaReflector.accessible(((C4481a) it.next()).f14830a));
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        ?? r02 = c4173t;
        if (!(c3959f instanceof C3959f)) {
            r02 = c3959f;
        }
        return (List) r02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0048 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static final List<Field> declaredFields(Class<?> cls) {
        ?? c3959f;
        C4173t c4173t = C4173t.f13710g;
        if (cls == null) {
            return c4173t;
        }
        KavaReflector kavaReflector = INSTANCE;
        try {
            C2571a c2571aM3580K = AbstractC1341a.m3580K(cls);
            c2571aM3580K.m6037s();
            C3442b c3442b = new C3442b();
            c3442b.f12066a = (C3709c) c2571aM3580K.f8339h;
            List listM7224b = c3442b.m7224b();
            c3959f = new ArrayList(AbstractC4167n.m8429e1(listM7224b));
            Iterator it = listM7224b.iterator();
            while (it.hasNext()) {
                c3959f.add((Field) kavaReflector.accessible(((C4482b) it.next()).f14831a));
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        ?? r02 = c4173t;
        if (!(c3959f instanceof C3959f)) {
            r02 = c3959f;
        }
        return (List) r02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0048 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static final List<Method> declaredMethods(Class<?> cls) {
        ?? c3959f;
        C4173t c4173t = C4173t.f13710g;
        if (cls == null) {
            return c4173t;
        }
        KavaReflector kavaReflector = INSTANCE;
        try {
            C2571a c2571aM3580K = AbstractC1341a.m3580K(cls);
            c2571aM3580K.m6037s();
            C3443c c3443c = new C3443c();
            c3443c.f12066a = (C3709c) c2571aM3580K.f8339h;
            List listM7225b = c3443c.m7225b();
            c3959f = new ArrayList(AbstractC4167n.m8429e1(listM7225b));
            Iterator it = listM7225b.iterator();
            while (it.hasNext()) {
                c3959f.add((Method) kavaReflector.accessible(((C4483c) it.next()).f14832a));
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        ?? r02 = c4173t;
        if (!(c3959f instanceof C3959f)) {
            r02 = c3959f;
        }
        return (List) r02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Method findCompatibleMethod(Class<?> cls, String str, Object... objArr) {
        Object next;
        objArr.getClass();
        if (cls != null && str != null && str.length() != 0) {
            while (cls != null && !cls.equals(Object.class)) {
                Iterator<T> it = declaredMethods(cls).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Method method = (Method) next;
                    if (AbstractC1416l.m3825a(method.getName(), str)) {
                        KavaReflector kavaReflector = INSTANCE;
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        parameterTypes.getClass();
                        boolean z9 = kavaReflector.areAssignable(parameterTypes, objArr);
                        if (Boolean.valueOf(z9).booleanValue()) {
                            break;
                        }
                    }
                }
                Method method2 = (Method) next;
                if (method2 != null) {
                    return method2;
                }
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Constructor<?> findConstructor(Class<?> cls, Class<?>... clsArr) {
        Object c3959f;
        Constructor constructor;
        clsArr.getClass();
        if (cls == null) {
            return null;
        }
        KavaReflector kavaReflector = INSTANCE;
        try {
            C2571a c2571aM3580K = AbstractC1341a.m3580K(cls);
            c2571aM3580K.m6037s();
            C3441a c3441a = new C3441a();
            c3441a.f12066a = (C3709c) c2571aM3580K.f8339h;
            Object[] objArrCopyOf = Arrays.copyOf(clsArr, clsArr.length);
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
            ArrayList arrayList = c3441a.f12040g;
            arrayList.getClass();
            List listAsList = Arrays.asList(objArrCopyOf2);
            listAsList.getClass();
            arrayList.addAll(listAsList);
            C4481a c4481a = (C4481a) AbstractC4166m.m8424v1(c3441a.m7222b());
            c3959f = (c4481a == null || (constructor = c4481a.f14830a) == null) ? null : (Constructor) kavaReflector.accessible(constructor);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Constructor) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Field findDeclaredField(Class<?> cls, String str) {
        Object c3959f;
        Field field;
        if (cls == null || str == null || str.length() == 0) {
            return null;
        }
        KavaReflector kavaReflector = INSTANCE;
        try {
            C2571a c2571aM3580K = AbstractC1341a.m3580K(cls);
            c2571aM3580K.m6037s();
            C3442b c3442b = new C3442b();
            c3442b.f12066a = (C3709c) c2571aM3580K.f8339h;
            c3442b.f12067b = str;
            C4482b c4482b = (C4482b) AbstractC4166m.m8424v1(c3442b.m7224b());
            c3959f = (c4482b == null || (field = c4482b.f14831a) == null) ? null : (Field) kavaReflector.accessible(field);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Field) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Method findDeclaredMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Object c3959f;
        Method method;
        clsArr.getClass();
        if (cls == null || str == null || str.length() == 0) {
            return null;
        }
        KavaReflector kavaReflector = INSTANCE;
        try {
            C2571a c2571aM3580K = AbstractC1341a.m3580K(cls);
            c2571aM3580K.m6037s();
            C3443c c3443c = new C3443c();
            c3443c.f12066a = (C3709c) c2571aM3580K.f8339h;
            c3443c.f12067b = str;
            Object[] objArrCopyOf = Arrays.copyOf(clsArr, clsArr.length);
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
            ArrayList arrayList = c3443c.f12040g;
            arrayList.getClass();
            List listAsList = Arrays.asList(objArrCopyOf2);
            listAsList.getClass();
            arrayList.addAll(listAsList);
            C4483c c4483c = (C4483c) AbstractC4166m.m8424v1(c3443c.m7225b());
            c3959f = (c4483c == null || (method = c4483c.f14832a) == null) ? null : (Method) kavaReflector.accessible(method);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Method) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Field findField(Class<?> cls, String str) {
        Object c3959f;
        if (cls == null || str == null || str.length() == 0) {
            return null;
        }
        Field fieldFindDeclaredField = findDeclaredField(cls, str);
        if (fieldFindDeclaredField != null) {
            return fieldFindDeclaredField;
        }
        try {
            c3959f = (Field) INSTANCE.accessible(cls.getField(str));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Field) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Field findFieldRecursive(Class<?> cls, String str) {
        if (cls == null || str == null || str.length() == 0) {
            return null;
        }
        for (Class<?> superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            Field fieldFindDeclaredField = findDeclaredField(superclass, str);
            if (fieldFindDeclaredField != null) {
                return fieldFindDeclaredField;
            }
        }
        return findField(cls, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Method findMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Object c3959f;
        clsArr.getClass();
        if (cls == null || str == null || str.length() == 0) {
            return null;
        }
        Method methodFindDeclaredMethod = findDeclaredMethod(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        if (methodFindDeclaredMethod != null) {
            return methodFindDeclaredMethod;
        }
        try {
            c3959f = (Method) INSTANCE.accessible(cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length)));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Method) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Method findMethodRecursive(Class<?> cls, String str, Class<?>... clsArr) {
        clsArr.getClass();
        if (cls == null || str == null || str.length() == 0) {
            return null;
        }
        for (Class<?> superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            Method methodFindDeclaredMethod = findDeclaredMethod(superclass, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (methodFindDeclaredMethod != null) {
                return methodFindDeclaredMethod;
            }
        }
        return findMethod(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object invoke(Method method, Object obj, Object... objArr) {
        Object c3959f;
        objArr.getClass();
        if (method == null) {
            return null;
        }
        try {
            INSTANCE.accessible(method);
            c3959f = method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            return null;
        }
        return c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object invokeMethod(Object obj, String str, Object... objArr) {
        objArr.getClass();
        if (obj == null) {
            return null;
        }
        return invoke(findCompatibleMethod(obj.getClass(), str, Arrays.copyOf(objArr, objArr.length)), obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object invokeOrThrow(Method method, Object obj, Object... objArr) throws NoSuchMethodException {
        objArr.getClass();
        if (method == null) {
            throw new NoSuchMethodException("method is null");
        }
        INSTANCE.accessible(method);
        return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object invokeStaticMethod(Class<?> cls, String str, Object... objArr) {
        objArr.getClass();
        return invoke(findCompatibleMethod(cls, str, Arrays.copyOf(objArr, objArr.length)), null, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean invokeSuccessfully(Method method, Object obj, Object... objArr) {
        Object c3959f;
        objArr.getClass();
        if (method == null) {
            return false;
        }
        try {
            INSTANCE.accessible(method);
            method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj2 = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj2;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isAbstract(Method method) {
        return method != null && Modifier.isAbstract(method.getModifiers());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean isAssignableForCtor(Class<?> cls, Object obj) {
        return obj == null ? !cls.isPrimitive() : boxType(cls).isAssignableFrom(obj.getClass());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isPublic(Method method) {
        return method != null && Modifier.isPublic(method.getModifiers());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isStatic(Method method) {
        return method != null && Modifier.isStatic(method.getModifiers());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Class<?> loadClass(String str, ClassLoader classLoader) {
        Object c3959f;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            c3959f = Class.forName(str, false, classLoader);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Class) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int modifiers(Method method) {
        if (method != null) {
            return method.getModifiers();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object newInstance(Constructor<?> constructor, Object... objArr) {
        Object c3959f;
        objArr.getClass();
        if (constructor == null) {
            return null;
        }
        try {
            constructor.setAccessible(true);
            c3959f = constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            return null;
        }
        return c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object newInstanceByArgs(Class<?> cls, Object[] objArr) {
        objArr.getClass();
        if (cls == null) {
            return null;
        }
        for (Constructor<?> constructor : declaredConstructors(cls)) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes != null && parameterTypes.length == objArr.length) {
                Iterable iterableM8364A0 = AbstractC4165l.m8364A0(parameterTypes);
                if (!(iterableM8364A0 instanceof Collection) || !((Collection) iterableM8364A0).isEmpty()) {
                    Iterator it = iterableM8364A0.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        KavaReflector kavaReflector = INSTANCE;
                        Class<?> cls2 = parameterTypes[iIntValue];
                        cls2.getClass();
                        if (!Boolean.valueOf(kavaReflector.isAssignableForCtor(cls2, objArr[iIntValue])).booleanValue()) {
                            break;
                        }
                    }
                }
                Object objNewInstance = newInstance(constructor, Arrays.copyOf(objArr, objArr.length));
                if (objNewInstance != null) {
                    return objNewInstance;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object readField(Object obj, String str) {
        Object c3959f;
        if (obj != null && str != null && str.length() != 0) {
            for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                Field fieldFindDeclaredField = findDeclaredField(superclass, str);
                if (fieldFindDeclaredField != null) {
                    try {
                        fieldFindDeclaredField.setAccessible(true);
                        c3959f = fieldFindDeclaredField.get(obj);
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (c3959f instanceof C3959f) {
                        return null;
                    }
                    return c3959f;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object staticInstance(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        for (Field field : declaredFields(cls)) {
            Object field2 = (isStatic(field) && cls.isAssignableFrom(field.getType())) ? readField(field, (Object) null) : null;
            if (field2 != null) {
                return field2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean writeField(Field field, Object obj, Object obj2) {
        Object c3959f;
        if (field == null) {
            return false;
        }
        try {
            INSTANCE.accessible(field);
            field.set(obj, obj2);
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj3 = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj3;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    public static final int modifiers(Field field) {
        if (field != null) {
            return field.getModifiers();
        }
        return 0;
    }

    public static final Field accessible(Field field) {
        if (field != null) {
            return (Field) INSTANCE.accessible(field);
        }
        return null;
    }

    public static final Constructor<?> accessible(Constructor<?> constructor) {
        if (constructor != null) {
            return (Constructor) INSTANCE.accessible(constructor);
        }
        return null;
    }

    private final <T extends AccessibleObject> T accessible(T t9) {
        t9.setAccessible(true);
        return t9;
    }

    public static final boolean isAbstract(int i9) {
        return Modifier.isAbstract(i9);
    }

    public static final boolean isStatic(Field field) {
        return field != null && Modifier.isStatic(field.getModifiers());
    }

    public static final boolean isStatic(int i9) {
        return Modifier.isStatic(i9);
    }

    public static final boolean writeField(Object obj, String str, Object obj2) {
        if (obj == null || str == null || str.length() == 0) {
            return false;
        }
        return writeField(findFieldRecursive(obj.getClass(), str), obj, obj2);
    }

    public static final Object readField(Field field, Object obj) {
        Object c3959f;
        if (field == null) {
            return null;
        }
        try {
            INSTANCE.accessible(field);
            c3959f = field.get(obj);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            return null;
        }
        return c3959f;
    }
}
