package org.luckypray.dexkit.util;

import com.p001mr.elaris.Prefs;
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
import p000.AbstractC0184d9;
import p000.AbstractC0260i5;
import p000.AbstractC0319ld;
import p000.AbstractC0486u9;
import p000.C0409pc;
import p000.C0425qc;
import p000.C0455sa;
import p000.InterfaceC0279j5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class InstanceUtil {
    public static final InstanceUtil INSTANCE = new InstanceUtil();
    private static final AdaptiveLoaderCache<String, Class<?>> classCache = new AdaptiveLoaderCache<>(true);
    private static final Map<String, Class<? extends Object>> primitiveMap;

    /* JADX INFO: renamed from: org.luckypray.dexkit.util.InstanceUtil$getClassInstance$1 */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class C03951 extends AbstractC0184d9 implements InterfaceC0279j5 {
        final /* synthetic */ ClassLoader $classLoader;
        final /* synthetic */ String $typeName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03951(String str, ClassLoader classLoader) {
            super(0);
            this.$typeName = str;
            this.$classLoader = classLoader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // p000.InterfaceC0279j5
        public final Class<?> invoke() throws ClassNotFoundException {
            String strSubstring = this.$typeName;
            int i = 0;
            while (AbstractC0319ld.m756J(strSubstring)) {
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
        C0455sa[] c0455saArr = {new C0455sa("boolean", Boolean.TYPE), new C0455sa("byte", Byte.TYPE), new C0455sa("char", Character.TYPE), new C0455sa("short", Short.TYPE), new C0455sa("int", Integer.TYPE), new C0455sa("long", Long.TYPE), new C0455sa("float", Float.TYPE), new C0455sa(Prefs.REPEATER_MODE_DOUBLE, Double.TYPE), new C0455sa("void", Void.TYPE)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0486u9.m1068u(9));
        for (int i = 0; i < 9; i++) {
            C0455sa c0455sa = c0455saArr[i];
            linkedHashMap.put(c0455sa.f859a, c0455sa.f860b);
        }
        primitiveMap = linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InstanceUtil() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Constructor<?> getDeclaredCtorOrNull(Class<?> cls, Class<?>[] clsArr) {
        Object c0409pc;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredConstructor.setAccessible(true);
            c0409pc = declaredConstructor;
        } catch (Throwable th) {
            c0409pc = new C0409pc(th);
        }
        boolean z = c0409pc instanceof C0409pc;
        Object obj = c0409pc;
        if (z) {
            obj = null;
        }
        return (Constructor) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Field getDeclaredFieldOrNull(Class<?> cls, String str) {
        Object c0409pc;
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            c0409pc = declaredField;
        } catch (Throwable th) {
            c0409pc = new C0409pc(th);
        }
        boolean z = c0409pc instanceof C0409pc;
        Object obj = c0409pc;
        if (z) {
            obj = null;
        }
        return (Field) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Method getDeclaredMethodOrNull(Class<?> cls, String str, Class<?>[] clsArr) {
        Object c0409pc;
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredMethod.setAccessible(true);
            c0409pc = declaredMethod;
        } catch (Throwable th) {
            c0409pc = new C0409pc(th);
        }
        boolean z = c0409pc instanceof C0409pc;
        Object obj = c0409pc;
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
    private final Object m1304resolveParamTypesOrNullgIAlus(ClassLoader classLoader, List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Object objM1305tryLoadTypegIAlus = m1305tryLoadTypegIAlus(classLoader, it.next());
            Throwable thM819a = C0425qc.m819a(objM1305tryLoadTypegIAlus);
            if (thM819a != null) {
                return new C0409pc(thM819a);
            }
            arrayList.add((Class) objM1305tryLoadTypegIAlus);
        }
        Object[] array = arrayList.toArray(new Class[0]);
        if (array != null) {
            return array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: tryLoadType-gIAlu-s, reason: not valid java name */
    private final Object m1305tryLoadTypegIAlus(ClassLoader classLoader, String str) {
        try {
            return getClassInstance(classLoader, str);
        } catch (Throwable th) {
            return new C0409pc(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<?> getClassInstance(ClassLoader classLoader, String str) {
        classLoader.getClass();
        str.getClass();
        return classCache.get(classLoader, str, new C03951(str, classLoader));
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
        Object objM1304resolveParamTypesOrNullgIAlus = m1304resolveParamTypesOrNullgIAlus(classLoader, dexMethod.getParamTypeNames());
        Throwable thM819a = C0425qc.m819a(objM1304resolveParamTypesOrNullgIAlus);
        if (thM819a != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Constructor " + dexMethod + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM819a);
            throw noSuchMethodException;
        }
        Constructor<?> declaredCtorOrNull = getDeclaredCtorOrNull(classInstance, (Class[]) objM1304resolveParamTypesOrNullgIAlus);
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
            if (AbstractC0260i5.m643p(methodSign, DexSignUtil.getConstructorSign(constructor))) {
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
        Object objM1305tryLoadTypegIAlus = m1305tryLoadTypegIAlus(classLoader, dexField.getTypeName());
        Throwable thM819a = C0425qc.m819a(objM1305tryLoadTypegIAlus);
        if (thM819a != null) {
            NoSuchFieldException noSuchFieldException = new NoSuchFieldException("Field " + dexField + " not available: type missing");
            noSuchFieldException.initCause(thM819a);
            throw noSuchFieldException;
        }
        Class cls = (Class) objM1305tryLoadTypegIAlus;
        for (Class<?> superclass = classInstance; superclass != null; superclass = superclass.getSuperclass()) {
            Field declaredFieldOrNull = getDeclaredFieldOrNull(superclass, dexField.getName());
            if (declaredFieldOrNull != null && AbstractC0260i5.m643p(declaredFieldOrNull.getType(), cls)) {
                return declaredFieldOrNull;
            }
        }
        for (Class<?> superclass2 = classInstance; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            try {
                Field[] declaredFields = superclass2.getDeclaredFields();
                declaredFields.getClass();
                for (Field field : declaredFields) {
                    if (AbstractC0260i5.m643p(dexField.getName(), field.getName())) {
                        String typeSign = dexField.getTypeSign();
                        Class<?> type = field.getType();
                        type.getClass();
                        if (AbstractC0260i5.m643p(typeSign, DexSignUtil.getTypeSign(type))) {
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
        Object objM1304resolveParamTypesOrNullgIAlus = m1304resolveParamTypesOrNullgIAlus(classLoader, dexMethod.getParamTypeNames());
        Throwable thM819a = C0425qc.m819a(objM1304resolveParamTypesOrNullgIAlus);
        if (thM819a != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + dexMethod + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM819a);
            throw noSuchMethodException;
        }
        Class<?>[] clsArr = (Class[]) objM1304resolveParamTypesOrNullgIAlus;
        Object objM1305tryLoadTypegIAlus = m1305tryLoadTypegIAlus(classLoader, dexMethod.getReturnTypeName());
        Throwable thM819a2 = C0425qc.m819a(objM1305tryLoadTypegIAlus);
        if (thM819a2 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + dexMethod + " not available: return type missing");
            noSuchMethodException2.initCause(thM819a2);
            throw noSuchMethodException2;
        }
        Class cls = (Class) objM1305tryLoadTypegIAlus;
        for (Class<?> superclass = classInstance; superclass != null; superclass = superclass.getSuperclass()) {
            Method declaredMethodOrNull = getDeclaredMethodOrNull(superclass, dexMethod.getName(), clsArr);
            if (declaredMethodOrNull != null && AbstractC0260i5.m643p(declaredMethodOrNull.getReturnType(), cls)) {
                return declaredMethodOrNull;
            }
        }
        for (Class<?> superclass2 = classInstance; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            try {
                Method[] declaredMethods = superclass2.getDeclaredMethods();
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    if (AbstractC0260i5.m643p(method.getName(), dexMethod.getName()) && AbstractC0260i5.m643p(dexMethod.getMethodSign(), DexSignUtil.getMethodSign(method))) {
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
