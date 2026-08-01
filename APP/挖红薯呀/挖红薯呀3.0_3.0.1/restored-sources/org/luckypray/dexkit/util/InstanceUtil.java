package org.luckypray.dexkit.util;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.luckypray.dexkit.wrap.DexClass;
import org.luckypray.dexkit.wrap.DexField;
import org.luckypray.dexkit.wrap.DexMethod;
import p000.InterfaceC0298hw;
import p000.bv0;
import p000.c50;
import p000.cv0;
import p000.md0;
import p000.p30;
import p000.r41;
import p000.uo0;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class InstanceUtil {
    public static final InstanceUtil INSTANCE = new InstanceUtil();
    private static final AdaptiveLoaderCache<String, Class<?>> classCache = new AdaptiveLoaderCache<>(true);
    private static final Map<String, Class<? extends Object>> primitiveMap;

    /* JADX INFO: renamed from: org.luckypray.dexkit.util.InstanceUtil$getClassInstance$1 */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C05881 extends c50 implements InterfaceC0298hw {
        final /* synthetic */ ClassLoader $classLoader;
        final /* synthetic */ String $typeName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05881(String str, ClassLoader classLoader) {
            super(0);
            this.$typeName = str;
            this.$classLoader = classLoader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p000.InterfaceC0298hw
        public final Class<?> invoke() throws ClassNotFoundException {
            String strSubstring = this.$typeName;
            int i = 0;
            while (r41.m3380Q(strSubstring, "[]", false)) {
                i++;
                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
            }
            Class<?> clsLoadClass = (Class) InstanceUtil.primitiveMap.get(strSubstring);
            if (clsLoadClass == null) {
                clsLoadClass = this.$classLoader.loadClass(strSubstring);
            }
            clsLoadClass.getClass();
            for (int i2 = 0; i2 < i; i2++) {
                clsLoadClass = Array.newInstance(clsLoadClass, 0).getClass();
            }
            return clsLoadClass;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        uo0[] uo0VarArr = {new uo0("boolean", Boolean.TYPE), new uo0("byte", Byte.TYPE), new uo0("char", Character.TYPE), new uo0("short", Short.TYPE), new uo0("int", Integer.TYPE), new uo0("long", Long.TYPE), new uo0("float", Float.TYPE), new uo0("double", Double.TYPE), new uo0("void", Void.TYPE)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(md0.m2495x(9));
        md0.m2496y(linkedHashMap, uo0VarArr);
        primitiveMap = linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InstanceUtil() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Constructor<?> getDeclaredCtorOrNull(Class<?> cls, Class<?>[] clsArr) {
        Object bv0Var;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredConstructor.setAccessible(true);
            bv0Var = declaredConstructor;
        } catch (Throwable th) {
            bv0Var = new bv0(th);
        }
        boolean z = bv0Var instanceof bv0;
        Object obj = bv0Var;
        if (z) {
            obj = null;
        }
        return (Constructor) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Field getDeclaredFieldOrNull(Class<?> cls, String str) {
        Object bv0Var;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            bv0Var = declaredField;
        } catch (Throwable th) {
            bv0Var = new bv0(th);
        }
        boolean z = bv0Var instanceof bv0;
        Object obj = bv0Var;
        if (z) {
            obj = null;
        }
        return (Field) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Method getDeclaredMethodOrNull(Class<?> cls, String str, Class<?>[] clsArr) {
        Object bv0Var;
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredMethod.setAccessible(true);
            bv0Var = declaredMethod;
        } catch (Throwable th) {
            bv0Var = new bv0(th);
        }
        boolean z = bv0Var instanceof bv0;
        Object obj = bv0Var;
        if (z) {
            obj = null;
        }
        return (Method) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Field getFieldInstance$default(InstanceUtil instanceUtil, ClassLoader classLoader, DexField dexField, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        return instanceUtil.getFieldInstance(classLoader, dexField, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Method getMethodInstance$default(InstanceUtil instanceUtil, ClassLoader classLoader, DexMethod dexMethod, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        return instanceUtil.getMethodInstance(classLoader, dexMethod, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: resolveParamTypesOrNull-gIAlu-s, reason: not valid java name */
    private final Object m5735resolveParamTypesOrNullgIAlus(ClassLoader classLoader, List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Object objM5736tryLoadTypegIAlus = m5736tryLoadTypegIAlus(classLoader, it.next());
            Throwable thM604a = cv0.m604a(objM5736tryLoadTypegIAlus);
            if (thM604a != null) {
                return new bv0(thM604a);
            }
            arrayList.add((Class) objM5736tryLoadTypegIAlus);
        }
        Object[] array = arrayList.toArray(new Class[0]);
        if (array != null) {
            return array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: tryLoadType-gIAlu-s, reason: not valid java name */
    private final Object m5736tryLoadTypegIAlus(ClassLoader classLoader, String str) {
        try {
            return getClassInstance(classLoader, str);
        } catch (Throwable th) {
            return new bv0(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<?> getClassInstance(ClassLoader classLoader, String str) {
        classLoader.getClass();
        str.getClass();
        return classCache.get(classLoader, str, new C05881(str, classLoader));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Constructor<?> getConstructorInstance(ClassLoader classLoader, DexMethod dexMethod) throws NoSuchMethodException {
        Member reflectedMethod;
        Constructor<?>[] declaredConstructors;
        int i;
        classLoader.getClass();
        dexMethod.getClass();
        if (!dexMethod.isConstructor()) {
            throw new IllegalArgumentException((dexMethod + " not a constructor").toString());
        }
        Class<?> classInstance = getClassInstance(classLoader, dexMethod.getClassName());
        Object objM5735resolveParamTypesOrNullgIAlus = m5735resolveParamTypesOrNullgIAlus(classLoader, dexMethod.getParamTypeNames());
        Throwable thM604a = cv0.m604a(objM5735resolveParamTypesOrNullgIAlus);
        if (thM604a != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Constructor " + dexMethod + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM604a);
            throw noSuchMethodException;
        }
        Constructor<?> declaredCtorOrNull = getDeclaredCtorOrNull(classInstance, (Class[]) objM5735resolveParamTypesOrNullgIAlus);
        if (declaredCtorOrNull != null) {
            return declaredCtorOrNull;
        }
        try {
            declaredConstructors = classInstance.getDeclaredConstructors();
            declaredConstructors.getClass();
        } catch (Throwable unused) {
        }
        for (Constructor<?> constructor : declaredConstructors) {
            String methodSign = dexMethod.getMethodSign();
            constructor.getClass();
            if (p30.m3002l(methodSign, DexSignUtil.getConstructorSign(constructor))) {
                constructor.setAccessible(true);
                return constructor;
            }
            reflectedMethod = NativeReflect.getReflectedMethod(classInstance, dexMethod.getName(), dexMethod.getMethodSign(), Boolean.FALSE);
            if (reflectedMethod == null) {
                Constructor<?> constructor2 = (Constructor) reflectedMethod;
                constructor2.setAccessible(true);
                return constructor2;
            }
            throw new NoSuchMethodException("Constructor " + dexMethod + " not found");
        }
        reflectedMethod = NativeReflect.getReflectedMethod(classInstance, dexMethod.getName(), dexMethod.getMethodSign(), Boolean.FALSE);
        if (reflectedMethod == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Field getFieldInstance(ClassLoader classLoader, DexField dexField, Boolean bool) throws NoSuchFieldException {
        classLoader.getClass();
        dexField.getClass();
        Class<?> classInstance = getClassInstance(classLoader, dexField.getClassName());
        Object objM5736tryLoadTypegIAlus = m5736tryLoadTypegIAlus(classLoader, dexField.getTypeName());
        Throwable thM604a = cv0.m604a(objM5736tryLoadTypegIAlus);
        if (thM604a != null) {
            NoSuchFieldException noSuchFieldException = new NoSuchFieldException("Field " + dexField + " not available: type missing");
            noSuchFieldException.initCause(thM604a);
            throw noSuchFieldException;
        }
        Class cls = (Class) objM5736tryLoadTypegIAlus;
        for (Class<?> superclass = classInstance; superclass != null; superclass = superclass.getSuperclass()) {
            Field declaredFieldOrNull = getDeclaredFieldOrNull(superclass, dexField.getName());
            if (declaredFieldOrNull != null && p30.m3002l(declaredFieldOrNull.getType(), cls)) {
                return declaredFieldOrNull;
            }
        }
        for (Class<?> superclass2 = classInstance; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            try {
                Field[] declaredFields = superclass2.getDeclaredFields();
                declaredFields.getClass();
                for (Field field : declaredFields) {
                    if (p30.m3002l(dexField.getName(), field.getName())) {
                        String typeSign = dexField.getTypeSign();
                        Class<?> type = field.getType();
                        type.getClass();
                        if (p30.m3002l(typeSign, DexSignUtil.getTypeSign(type))) {
                            field.setAccessible(true);
                            return field;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Field reflectedField = NativeReflect.getReflectedField(classInstance, dexField.getName(), dexField.getTypeSign(), bool);
        if (reflectedField != null) {
            reflectedField.setAccessible(true);
            return reflectedField;
        }
        throw new NoSuchFieldException("Field " + dexField + " not found");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Method getMethodInstance(ClassLoader classLoader, DexMethod dexMethod, Boolean bool) throws NoSuchMethodException {
        classLoader.getClass();
        dexMethod.getClass();
        if (!dexMethod.isMethod()) {
            throw new IllegalArgumentException((dexMethod + " not a method").toString());
        }
        Class<?> classInstance = getClassInstance(classLoader, dexMethod.getClassName());
        Object objM5735resolveParamTypesOrNullgIAlus = m5735resolveParamTypesOrNullgIAlus(classLoader, dexMethod.getParamTypeNames());
        Throwable thM604a = cv0.m604a(objM5735resolveParamTypesOrNullgIAlus);
        if (thM604a != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + dexMethod + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM604a);
            throw noSuchMethodException;
        }
        Class<?>[] clsArr = (Class[]) objM5735resolveParamTypesOrNullgIAlus;
        Object objM5736tryLoadTypegIAlus = m5736tryLoadTypegIAlus(classLoader, dexMethod.getReturnTypeName());
        Throwable thM604a2 = cv0.m604a(objM5736tryLoadTypegIAlus);
        if (thM604a2 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + dexMethod + " not available: return type missing");
            noSuchMethodException2.initCause(thM604a2);
            throw noSuchMethodException2;
        }
        Class cls = (Class) objM5736tryLoadTypegIAlus;
        for (Class<?> superclass = classInstance; superclass != null; superclass = superclass.getSuperclass()) {
            Method declaredMethodOrNull = getDeclaredMethodOrNull(superclass, dexMethod.getName(), clsArr);
            if (declaredMethodOrNull != null && p30.m3002l(declaredMethodOrNull.getReturnType(), cls)) {
                return declaredMethodOrNull;
            }
        }
        for (Class<?> superclass2 = classInstance; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            try {
                Method[] declaredMethods = superclass2.getDeclaredMethods();
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    if (p30.m3002l(method.getName(), dexMethod.getName()) && p30.m3002l(dexMethod.getMethodSign(), DexSignUtil.getMethodSign(method))) {
                        method.setAccessible(true);
                        return method;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Member reflectedMethod = NativeReflect.getReflectedMethod(classInstance, dexMethod.getName(), dexMethod.getMethodSign(), bool);
        if (reflectedMethod != null) {
            Method method2 = (Method) reflectedMethod;
            method2.setAccessible(true);
            return method2;
        }
        throw new NoSuchMethodException("Method " + dexMethod + " not found");
    }

    public final Class<?> getClassInstance(ClassLoader classLoader, DexClass dexClass) {
        classLoader.getClass();
        dexClass.getClass();
        return getClassInstance(classLoader, dexClass.getTypeName());
    }

    public final Field getFieldInstance(ClassLoader classLoader, DexField dexField) {
        classLoader.getClass();
        dexField.getClass();
        return getFieldInstance$default(this, classLoader, dexField, null, 4, null);
    }

    public final Method getMethodInstance(ClassLoader classLoader, DexMethod dexMethod) {
        classLoader.getClass();
        dexMethod.getClass();
        return getMethodInstance$default(this, classLoader, dexMethod, null, 4, null);
    }
}
