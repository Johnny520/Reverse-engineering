package org.luckypray.dexkit.util;

import Yue.AbstractC5673;
import Yue.C5385;
import Yue.C5499;
import Yue.C5943;
import Yue.C7148;
import Yue.C7149;
import Yue.C7627;
import Yue.C8003;
import Yue.InterfaceC5122;
import Yue.InterfaceC5573;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7507;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.wrap.DexClass;
import org.luckypray.dexkit.wrap.DexField;
import org.luckypray.dexkit.wrap.DexMethod;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nInstanceUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstanceUtil.kt\norg/luckypray/dexkit/util/InstanceUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n37#2,2:270\n1#3:272\n*S KotlinDebug\n*F\n+ 1 InstanceUtil.kt\norg/luckypray/dexkit/util/InstanceUtil\n*L\n95#1:270,2\n*E\n"})
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f0\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0014\u001a\u00020\u00062\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\t2\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J!\u0010!\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b!\u0010#J+\u0010(\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J+\u0010.\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b.\u0010/R$\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R2\u00105\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u000e\b\u0001\u0012\n 4*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\t038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Lorg/luckypray/dexkit/util/InstanceUtil;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "Ljava/lang/ClassLoader;", "classLoader", "", "typeName", "LYue/ۥۡۦۧۤ;", "Ljava/lang/Class;", "tryLoadType-gIAlu-s", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;", "tryLoadType", "", "paramTypeNames", "", "resolveParamTypesOrNull-gIAlu-s", "(Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/lang/Object;", "resolveParamTypesOrNull", "clazz", "name", "paramTypes", "Ljava/lang/reflect/Method;", "getDeclaredMethodOrNull", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Constructor;", "getDeclaredCtorOrNull", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "Ljava/lang/reflect/Field;", "getDeclaredFieldOrNull", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", "Lorg/luckypray/dexkit/wrap/DexClass;", "dexClass", "getClassInstance", "(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexClass;)Ljava/lang/Class;", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;", "Lorg/luckypray/dexkit/wrap/DexField;", "dexField", "", "isStatic", "getFieldInstance", "(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexField;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;", "Lorg/luckypray/dexkit/wrap/DexMethod;", "dexMethod", "getConstructorInstance", "(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/reflect/Constructor;", "getMethodInstance", "(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;", "classCache", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;", "", "kotlin.jvm.PlatformType", "primitiveMap", "Ljava/util/Map;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class InstanceUtil {

    @InterfaceC6399
    public static final InstanceUtil INSTANCE = new InstanceUtil();

    @InterfaceC6399
    private static final AdaptiveLoaderCache<String, Class<?>> classCache = new AdaptiveLoaderCache<>(true);

    @InterfaceC6399
    private static final Map<String, Class<? extends Object>> primitiveMap = C5943.m18607(C8003.m4014("boolean", Boolean.TYPE), C8003.m4014("byte", Byte.TYPE), C8003.m4014("char", Character.TYPE), C8003.m4014("short", Short.TYPE), C8003.m4014("int", Integer.TYPE), C8003.m4014("long", Long.TYPE), C8003.m4014("float", Float.TYPE), C8003.m4014("double", Double.TYPE), C8003.m4014("void", Void.TYPE));

    /* JADX INFO: renamed from: org.luckypray.dexkit.util.InstanceUtil$getClassInstance$1 */
    @InterfaceC6211(m2698d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001H\n¢\u0006\u0002\b\u0002"}, m2699d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class C29381 extends AbstractC5673 implements InterfaceC5122<Class<?>> {
        final /* synthetic */ ClassLoader $classLoader;
        final /* synthetic */ String $typeName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29381(String str, ClassLoader classLoader) {
            super(0);
            this.$typeName = str;
            this.$classLoader = classLoader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final Class<?> invoke() throws ClassNotFoundException {
            String strSubstring = this.$typeName;
            int i = 0;
            while (C7627.m23973(strSubstring, C5385.f13236, false, 2, null)) {
                i++;
                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                C5499.m17102(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            Class<?> clsLoadClass = (Class) InstanceUtil.primitiveMap.get(strSubstring);
            if (clsLoadClass == null) {
                clsLoadClass = this.$classLoader.loadClass(strSubstring);
            }
            C5499.m17102(clsLoadClass, "baseClass");
            for (int i2 = 0; i2 < i; i2++) {
                clsLoadClass = Array.newInstance(clsLoadClass, 0).getClass();
            }
            return clsLoadClass;
        }
    }

    private InstanceUtil() {
    }

    private final Constructor<?> getDeclaredCtorOrNull(Class<?> clazz, Class<?>[] paramTypes) {
        Object objM3438;
        try {
            C7148.C1189 c1189 = C7148.f21560;
            Constructor<?> declaredConstructor = clazz.getDeclaredConstructor((Class[]) Arrays.copyOf(paramTypes, paramTypes.length));
            declaredConstructor.setAccessible(true);
            objM3438 = C7148.m3438(declaredConstructor);
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            objM3438 = C7148.m3438(C7149.m3441(th));
        }
        if (C7148.m22407(objM3438)) {
            objM3438 = null;
        }
        return (Constructor) objM3438;
    }

    private final Field getDeclaredFieldOrNull(Class<?> clazz, String name) {
        Object objM3438;
        try {
            C7148.C1189 c1189 = C7148.f21560;
            Field declaredField = clazz.getDeclaredField(name);
            declaredField.setAccessible(true);
            objM3438 = C7148.m3438(declaredField);
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            objM3438 = C7148.m3438(C7149.m3441(th));
        }
        if (C7148.m22407(objM3438)) {
            objM3438 = null;
        }
        return (Field) objM3438;
    }

    private final Method getDeclaredMethodOrNull(Class<?> clazz, String name, Class<?>[] paramTypes) {
        Object objM3438;
        try {
            C7148.C1189 c1189 = C7148.f21560;
            Method declaredMethod = clazz.getDeclaredMethod(name, (Class[]) Arrays.copyOf(paramTypes, paramTypes.length));
            declaredMethod.setAccessible(true);
            objM3438 = C7148.m3438(declaredMethod);
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            objM3438 = C7148.m3438(C7149.m3441(th));
        }
        if (C7148.m22407(objM3438)) {
            objM3438 = null;
        }
        return (Method) objM3438;
    }

    public static /* synthetic */ Field getFieldInstance$default(InstanceUtil instanceUtil, ClassLoader classLoader, DexField dexField, Boolean bool, int i, Object obj) throws NoSuchFieldException {
        if ((i & 4) != 0) {
            bool = null;
        }
        return instanceUtil.getFieldInstance(classLoader, dexField, bool);
    }

    public static /* synthetic */ Method getMethodInstance$default(InstanceUtil instanceUtil, ClassLoader classLoader, DexMethod dexMethod, Boolean bool, int i, Object obj) throws NoSuchMethodException {
        if ((i & 4) != 0) {
            bool = null;
        }
        return instanceUtil.getMethodInstance(classLoader, dexMethod, bool);
    }

    /* JADX INFO: renamed from: resolveParamTypesOrNull-gIAlu-s, reason: not valid java name */
    private final Object m31223resolveParamTypesOrNullgIAlus(ClassLoader classLoader, List<String> paramTypeNames) {
        ArrayList arrayList = new ArrayList(paramTypeNames.size());
        Iterator<String> it = paramTypeNames.iterator();
        while (it.hasNext()) {
            Object objM31224tryLoadTypegIAlus = m31224tryLoadTypegIAlus(classLoader, it.next());
            Throwable thM22403 = C7148.m22403(objM31224tryLoadTypegIAlus);
            if (thM22403 != null) {
                C7148.C1189 c1189 = C7148.f21560;
                return C7148.m3438(C7149.m3441(thM22403));
            }
            arrayList.add((Class) objM31224tryLoadTypegIAlus);
        }
        C7148.C1189 c11892 = C7148.f21560;
        Object[] array = arrayList.toArray(new Class[0]);
        if (array != null) {
            return C7148.m3438(array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX INFO: renamed from: tryLoadType-gIAlu-s, reason: not valid java name */
    private final Object m31224tryLoadTypegIAlus(ClassLoader classLoader, String typeName) {
        try {
            C7148.C1189 c1189 = C7148.f21560;
            return C7148.m3438(getClassInstance(classLoader, typeName));
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            return C7148.m3438(C7149.m3441(th));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final Class<?> getClassInstance(@InterfaceC6399 ClassLoader classLoader, @InterfaceC6399 DexClass dexClass) throws ClassNotFoundException {
        C5499.m17103(classLoader, "classLoader");
        C5499.m17103(dexClass, "dexClass");
        return getClassInstance(classLoader, dexClass.getTypeName());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    @InterfaceC6399
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Constructor<?> getConstructorInstance(@InterfaceC6399 ClassLoader classLoader, @InterfaceC6399 DexMethod dexMethod) throws NoSuchMethodException, ClassNotFoundException {
        Member reflectedMethod;
        Constructor<?>[] declaredConstructors;
        int i;
        C5499.m17103(classLoader, "classLoader");
        C5499.m17103(dexMethod, "dexMethod");
        if (!dexMethod.isConstructor()) {
            throw new IllegalArgumentException((dexMethod + " not a constructor").toString());
        }
        Class<?> classInstance = getClassInstance(classLoader, dexMethod.getClassName());
        Object objM31223resolveParamTypesOrNullgIAlus = m31223resolveParamTypesOrNullgIAlus(classLoader, dexMethod.getParamTypeNames());
        Throwable thM22403 = C7148.m22403(objM31223resolveParamTypesOrNullgIAlus);
        if (thM22403 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Constructor " + dexMethod + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM22403);
            throw noSuchMethodException;
        }
        Constructor<?> declaredCtorOrNull = getDeclaredCtorOrNull(classInstance, (Class[]) objM31223resolveParamTypesOrNullgIAlus);
        if (declaredCtorOrNull != null) {
            return declaredCtorOrNull;
        }
        try {
            declaredConstructors = classInstance.getDeclaredConstructors();
            C5499.m17102(declaredConstructors, "declaredClass.declaredConstructors");
        } catch (Throwable unused) {
        }
        for (Constructor<?> constructor : declaredConstructors) {
            String methodSign = dexMethod.getMethodSign();
            C5499.m17102(constructor, "constructor");
            if (C5499.m17094(methodSign, DexSignUtil.getConstructorSign(constructor))) {
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
    @InterfaceC6399
    @InterfaceC5573
    public final Field getFieldInstance(@InterfaceC6399 ClassLoader classLoader, @InterfaceC6399 DexField dexField) throws NoSuchFieldException {
        C5499.m17103(classLoader, "classLoader");
        C5499.m17103(dexField, "dexField");
        return getFieldInstance$default(this, classLoader, dexField, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5573
    public final Method getMethodInstance(@InterfaceC6399 ClassLoader classLoader, @InterfaceC6399 DexMethod dexMethod) throws NoSuchMethodException {
        C5499.m17103(classLoader, "classLoader");
        C5499.m17103(dexMethod, "dexMethod");
        return getMethodInstance$default(this, classLoader, dexMethod, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final Class<?> getClassInstance(@InterfaceC6399 ClassLoader classLoader, @InterfaceC6399 String typeName) throws ClassNotFoundException {
        C5499.m17103(classLoader, "classLoader");
        C5499.m17103(typeName, "typeName");
        return classCache.get(classLoader, typeName, new C29381(typeName, classLoader));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final Field getFieldInstance(@InterfaceC6399 ClassLoader classLoader, @InterfaceC6399 DexField dexField, @InterfaceC6489 Boolean isStatic) throws NoSuchFieldException, ClassNotFoundException {
        C5499.m17103(classLoader, "classLoader");
        C5499.m17103(dexField, "dexField");
        Class<?> classInstance = getClassInstance(classLoader, dexField.getClassName());
        Object objM31224tryLoadTypegIAlus = m31224tryLoadTypegIAlus(classLoader, dexField.getTypeName());
        Throwable thM22403 = C7148.m22403(objM31224tryLoadTypegIAlus);
        if (thM22403 != null) {
            NoSuchFieldException noSuchFieldException = new NoSuchFieldException("Field " + dexField + " not available: type missing");
            noSuchFieldException.initCause(thM22403);
            throw noSuchFieldException;
        }
        Class cls = (Class) objM31224tryLoadTypegIAlus;
        for (Class<?> superclass = classInstance; superclass != null; superclass = superclass.getSuperclass()) {
            Field declaredFieldOrNull = getDeclaredFieldOrNull(superclass, dexField.getName());
            if (declaredFieldOrNull != null && C5499.m17094(declaredFieldOrNull.getType(), cls)) {
                return declaredFieldOrNull;
            }
        }
        for (Class<?> superclass2 = classInstance; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            try {
                Field[] declaredFields = superclass2.getDeclaredFields();
                C5499.m17102(declaredFields, "clz.declaredFields");
                for (Field field : declaredFields) {
                    if (C5499.m17094(dexField.getName(), field.getName())) {
                        String typeSign = dexField.getTypeSign();
                        Class<?> type = field.getType();
                        C5499.m17102(type, "field.type");
                        if (C5499.m17094(typeSign, DexSignUtil.getTypeSign(type))) {
                            field.setAccessible(true);
                            C5499.m17102(field, "field");
                            return field;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Field reflectedField = NativeReflect.getReflectedField(classInstance, dexField.getName(), dexField.getTypeSign(), isStatic);
        if (reflectedField != null) {
            reflectedField.setAccessible(true);
            return reflectedField;
        }
        throw new NoSuchFieldException("Field " + dexField + " not found");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5573
    public final Method getMethodInstance(@InterfaceC6399 ClassLoader classLoader, @InterfaceC6399 DexMethod dexMethod, @InterfaceC6489 Boolean isStatic) throws NoSuchMethodException, ClassNotFoundException {
        C5499.m17103(classLoader, "classLoader");
        C5499.m17103(dexMethod, "dexMethod");
        if (!dexMethod.isMethod()) {
            throw new IllegalArgumentException((dexMethod + " not a method").toString());
        }
        Class<?> classInstance = getClassInstance(classLoader, dexMethod.getClassName());
        Object objM31223resolveParamTypesOrNullgIAlus = m31223resolveParamTypesOrNullgIAlus(classLoader, dexMethod.getParamTypeNames());
        Throwable thM22403 = C7148.m22403(objM31223resolveParamTypesOrNullgIAlus);
        if (thM22403 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + dexMethod + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM22403);
            throw noSuchMethodException;
        }
        Class<?>[] clsArr = (Class[]) objM31223resolveParamTypesOrNullgIAlus;
        Object objM31224tryLoadTypegIAlus = m31224tryLoadTypegIAlus(classLoader, dexMethod.getReturnTypeName());
        Throwable thM224032 = C7148.m22403(objM31224tryLoadTypegIAlus);
        if (thM224032 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + dexMethod + " not available: return type missing");
            noSuchMethodException2.initCause(thM224032);
            throw noSuchMethodException2;
        }
        Class cls = (Class) objM31224tryLoadTypegIAlus;
        for (Class<?> superclass = classInstance; superclass != null; superclass = superclass.getSuperclass()) {
            Method declaredMethodOrNull = getDeclaredMethodOrNull(superclass, dexMethod.getName(), clsArr);
            if (declaredMethodOrNull != null && C5499.m17094(declaredMethodOrNull.getReturnType(), cls)) {
                return declaredMethodOrNull;
            }
        }
        for (Class<?> superclass2 = classInstance; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            try {
                Method[] declaredMethods = superclass2.getDeclaredMethods();
                C5499.m17102(declaredMethods, "clz.declaredMethods");
                for (Method method : declaredMethods) {
                    if (C5499.m17094(method.getName(), dexMethod.getName())) {
                        String methodSign = dexMethod.getMethodSign();
                        C5499.m17102(method, "method");
                        if (C5499.m17094(methodSign, DexSignUtil.getMethodSign(method))) {
                            method.setAccessible(true);
                            return method;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        Member reflectedMethod = NativeReflect.getReflectedMethod(classInstance, dexMethod.getName(), dexMethod.getMethodSign(), isStatic);
        if (reflectedMethod != null) {
            Method method2 = (Method) reflectedMethod;
            method2.setAccessible(true);
            return method2;
        }
        throw new NoSuchMethodException("Method " + dexMethod + " not found");
    }
}
