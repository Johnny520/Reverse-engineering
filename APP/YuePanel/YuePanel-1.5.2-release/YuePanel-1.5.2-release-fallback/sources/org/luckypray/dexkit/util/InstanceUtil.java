package org.luckypray.dexkit.util;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nInstanceUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstanceUtil.kt\norg/luckypray/dexkit/util/InstanceUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n37#2,2:270\n1#3:272\n*S KotlinDebug\n*F\n+ 1 InstanceUtil.kt\norg/luckypray/dexkit/util/InstanceUtil\n*L\n95#1:270,2\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000f0\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0014\u001a\u00020\u00062\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\t2\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J!\u0010!\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b!\u0010#J+\u0010(\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J+\u0010.\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b.\u0010/R$\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R2\u00105\u001a \u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u000e\b\u0001\u0012\n 4*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\t038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Lorg/luckypray/dexkit/util/InstanceUtil;", "", "<init>", "()V", "Ljava/lang/ClassLoader;", "classLoader", "", "typeName", "LYue/ۥۡۦۧۤ;", "Ljava/lang/Class;", "tryLoadType-gIAlu-s", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;", "tryLoadType", "", "paramTypeNames", "", "resolveParamTypesOrNull-gIAlu-s", "(Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/lang/Object;", "resolveParamTypesOrNull", "clazz", "name", "paramTypes", "Ljava/lang/reflect/Method;", "getDeclaredMethodOrNull", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Constructor;", "getDeclaredCtorOrNull", "(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "Ljava/lang/reflect/Field;", "getDeclaredFieldOrNull", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", "Lorg/luckypray/dexkit/wrap/DexClass;", "dexClass", "getClassInstance", "(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexClass;)Ljava/lang/Class;", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;", "Lorg/luckypray/dexkit/wrap/DexField;", "dexField", "", "isStatic", "getFieldInstance", "(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexField;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;", "Lorg/luckypray/dexkit/wrap/DexMethod;", "dexMethod", "getConstructorInstance", "(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/reflect/Constructor;", "getMethodInstance", "(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;", "classCache", "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;", "", "kotlin.jvm.PlatformType", "primitiveMap", "Ljava/util/Map;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class InstanceUtil {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.util.InstanceUtil INSTANCE = null;

    @Yue.InterfaceC4418
    private static final org.luckypray.dexkit.util.AdaptiveLoaderCache<java.lang.String, java.lang.Class<?>> classCache = null;

    @Yue.InterfaceC4418
    private static final java.util.Map<java.lang.String, java.lang.Class<? extends java.lang.Object>> primitiveMap = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.util.InstanceUtil$getClassInstance$1, reason: invalid class name */
    @Yue.InterfaceC4201(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class AnonymousClass1 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<java.lang.Class<?>> {
        final /* synthetic */ java.lang.ClassLoader $classLoader;
        final /* synthetic */ java.lang.String $typeName;

        public AnonymousClass1(java.lang.String r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.$typeName = r1
                r0.$classLoader = r2
                r1 = 0
                r0.<init>(r1)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Yue.InterfaceC2823
        @Yue.InterfaceC4418
        public final java.lang.Class<?> invoke() {
                r6 = this;
                java.lang.String r0 = r6.$typeName
                r1 = 0
                r2 = r1
            L4:
                java.lang.String r3 = "[]"
                r4 = 0
                r5 = 2
                boolean r3 = Yue.C5988.m22280(r0, r3, r1, r5, r4)
                if (r3 == 0) goto L1f
                int r2 = r2 + 1
                int r3 = r0.length()
                int r3 = r3 - r5
                java.lang.String r0 = r0.substring(r1, r3)
                java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                Yue.C3329.m13905(r0, r3)
                goto L4
            L1f:
                java.util.Map r3 = org.luckypray.dexkit.util.InstanceUtil.access$getPrimitiveMap$p()
                java.lang.Object r3 = r3.get(r0)
                java.lang.Class r3 = (java.lang.Class) r3
                if (r3 != 0) goto L31
                java.lang.ClassLoader r3 = r6.$classLoader
                java.lang.Class r3 = r3.loadClass(r0)
            L31:
                java.lang.String r0 = "baseClass"
                Yue.C3329.m13905(r3, r0)
                r0 = r1
            L37:
                if (r0 >= r2) goto L44
                java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r1)
                java.lang.Class r3 = r3.getClass()
                int r0 = r0 + 1
                goto L37
            L44:
                return r3
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ java.lang.Class<?> invoke() {
                r1 = this;
                java.lang.Class r0 = r1.invoke()
                return r0
        }
    }

    static {
            org.luckypray.dexkit.util.InstanceUtil r0 = new org.luckypray.dexkit.util.InstanceUtil
            r0.<init>()
            org.luckypray.dexkit.util.InstanceUtil.INSTANCE = r0
            org.luckypray.dexkit.util.AdaptiveLoaderCache r0 = new org.luckypray.dexkit.util.AdaptiveLoaderCache
            r1 = 1
            r0.<init>(r1)
            org.luckypray.dexkit.util.InstanceUtil.classCache = r0
            java.lang.String r0 = "boolean"
            java.lang.Class r1 = java.lang.Boolean.TYPE
            Yue.ۥۣۡۦ۠ r2 = Yue.C6456.m23777(r0, r1)
            java.lang.String r0 = "byte"
            java.lang.Class r1 = java.lang.Byte.TYPE
            Yue.ۥۣۡۦ۠ r3 = Yue.C6456.m23777(r0, r1)
            java.lang.String r0 = "char"
            java.lang.Class r1 = java.lang.Character.TYPE
            Yue.ۥۣۡۦ۠ r4 = Yue.C6456.m23777(r0, r1)
            java.lang.String r0 = "short"
            java.lang.Class r1 = java.lang.Short.TYPE
            Yue.ۥۣۡۦ۠ r5 = Yue.C6456.m23777(r0, r1)
            java.lang.String r0 = "int"
            java.lang.Class r1 = java.lang.Integer.TYPE
            Yue.ۥۣۡۦ۠ r6 = Yue.C6456.m23777(r0, r1)
            java.lang.String r0 = "long"
            java.lang.Class r1 = java.lang.Long.TYPE
            Yue.ۥۣۡۦ۠ r7 = Yue.C6456.m23777(r0, r1)
            java.lang.String r0 = "float"
            java.lang.Class r1 = java.lang.Float.TYPE
            Yue.ۥۣۡۦ۠ r8 = Yue.C6456.m23777(r0, r1)
            java.lang.String r0 = "double"
            java.lang.Class r1 = java.lang.Double.TYPE
            Yue.ۥۣۡۦ۠ r9 = Yue.C6456.m23777(r0, r1)
            java.lang.String r0 = "void"
            java.lang.Class r1 = java.lang.Void.TYPE
            Yue.ۥۣۡۦ۠ r10 = Yue.C6456.m23777(r0, r1)
            Yue.ۥۣۡۦ۠[] r0 = new Yue.C4677[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.Map r0 = Yue.C3901.m15761(r0)
            org.luckypray.dexkit.util.InstanceUtil.primitiveMap = r0
            return
    }

    private InstanceUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.util.Map access$getPrimitiveMap$p() {
            java.util.Map<java.lang.String, java.lang.Class<? extends java.lang.Object>> r0 = org.luckypray.dexkit.util.InstanceUtil.primitiveMap
            return r0
    }

    private final java.lang.reflect.Constructor<?> getDeclaredCtorOrNull(java.lang.Class<?> r2, java.lang.Class<?>[] r3) {
            r1 = this;
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L16
            int r0 = r3.length     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)     // Catch: java.lang.Throwable -> L16
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch: java.lang.Throwable -> L16
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L16
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = Yue.C5388.m20377(r2)     // Catch: java.lang.Throwable -> L16
            goto L21
        L16:
            r2 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029
            java.lang.Object r2 = Yue.C5391.m20390(r2)
            java.lang.Object r2 = Yue.C5388.m20377(r2)
        L21:
            boolean r3 = Yue.C5388.m20384(r2)
            if (r3 == 0) goto L28
            r2 = 0
        L28:
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            return r2
    }

    private final java.lang.reflect.Field getDeclaredFieldOrNull(java.lang.Class<?> r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Lf
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> Lf
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = Yue.C5388.m20377(r2)     // Catch: java.lang.Throwable -> Lf
            goto L1a
        Lf:
            r2 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029
            java.lang.Object r2 = Yue.C5391.m20390(r2)
            java.lang.Object r2 = Yue.C5388.m20377(r2)
        L1a:
            boolean r3 = Yue.C5388.m20384(r2)
            if (r3 == 0) goto L21
            r2 = 0
        L21:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            return r2
    }

    private final java.lang.reflect.Method getDeclaredMethodOrNull(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>[] r4) {
            r1 = this;
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L16
            int r0 = r4.length     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.Throwable -> L16
            java.lang.Class[] r4 = (java.lang.Class[]) r4     // Catch: java.lang.Throwable -> L16
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L16
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = Yue.C5388.m20377(r2)     // Catch: java.lang.Throwable -> L16
            goto L21
        L16:
            r2 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029
            java.lang.Object r2 = Yue.C5391.m20390(r2)
            java.lang.Object r2 = Yue.C5388.m20377(r2)
        L21:
            boolean r3 = Yue.C5388.m20384(r2)
            if (r3 == 0) goto L28
            r2 = 0
        L28:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            return r2
    }

    public static /* synthetic */ java.lang.reflect.Field getFieldInstance$default(org.luckypray.dexkit.util.InstanceUtil r0, java.lang.ClassLoader r1, org.luckypray.dexkit.wrap.DexField r2, java.lang.Boolean r3, int r4, java.lang.Object r5) throws java.lang.NoSuchFieldException {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.reflect.Field r0 = r0.getFieldInstance(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.reflect.Method getMethodInstance$default(org.luckypray.dexkit.util.InstanceUtil r0, java.lang.ClassLoader r1, org.luckypray.dexkit.wrap.DexMethod r2, java.lang.Boolean r3, int r4, java.lang.Object r5) throws java.lang.NoSuchMethodException {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.reflect.Method r0 = r0.getMethodInstance(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: resolveParamTypesOrNull-gIAlu-s, reason: not valid java name */
    private final java.lang.Object m30862resolveParamTypesOrNullgIAlus(java.lang.ClassLoader r4, java.util.List<java.lang.String> r5) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.m30863tryLoadTypegIAlus(r4, r1)
            java.lang.Throwable r2 = Yue.C5388.m20380(r1)
            if (r2 != 0) goto L29
            java.lang.Class r1 = (java.lang.Class) r1
            r0.add(r1)
            goto Ld
        L29:
            Yue.ۥۡۦۧۤ$ۥ r4 = Yue.C5388.f20029
            java.lang.Object r4 = Yue.C5391.m20390(r2)
            java.lang.Object r4 = Yue.C5388.m20377(r4)
            return r4
        L34:
            Yue.ۥۡۦۧۤ$ۥ r4 = Yue.C5388.f20029
            r4 = 0
            java.lang.Class[] r4 = new java.lang.Class[r4]
            java.lang.Object[] r4 = r0.toArray(r4)
            if (r4 == 0) goto L44
            java.lang.Object r4 = Yue.C5388.m20377(r4)
            return r4
        L44:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: tryLoadType-gIAlu-s, reason: not valid java name */
    private final java.lang.Object m30863tryLoadTypegIAlus(java.lang.ClassLoader r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Lb
            java.lang.Class r2 = r1.getClassInstance(r2, r3)     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = Yue.C5388.m20377(r2)     // Catch: java.lang.Throwable -> Lb
            goto L16
        Lb:
            r2 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029
            java.lang.Object r2 = Yue.C5391.m20390(r2)
            java.lang.Object r2 = Yue.C5388.m20377(r2)
        L16:
            return r2
    }

    @Yue.InterfaceC4418
    public final java.lang.Class<?> getClassInstance(@Yue.InterfaceC4418 java.lang.ClassLoader r3, @Yue.InterfaceC4418 java.lang.String r4) throws java.lang.ClassNotFoundException {
            r2 = this;
            java.lang.String r0 = "classLoader"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r4, r0)
            org.luckypray.dexkit.util.AdaptiveLoaderCache<java.lang.String, java.lang.Class<?>> r0 = org.luckypray.dexkit.util.InstanceUtil.classCache
            org.luckypray.dexkit.util.InstanceUtil$getClassInstance$1 r1 = new org.luckypray.dexkit.util.InstanceUtil$getClassInstance$1
            r1.<init>(r4, r3)
            java.lang.Object r3 = r0.get(r3, r4, r1)
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
    }

    @Yue.InterfaceC4418
    public final java.lang.Class<?> getClassInstance(@Yue.InterfaceC4418 java.lang.ClassLoader r2, @Yue.InterfaceC4418 org.luckypray.dexkit.wrap.DexClass r3) throws java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.String r0 = "classLoader"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "dexClass"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r3 = r3.getTypeName()
            java.lang.Class r2 = r1.getClassInstance(r2, r3)
            return r2
    }

    @Yue.InterfaceC4418
    public final java.lang.reflect.Constructor<?> getConstructorInstance(@Yue.InterfaceC4418 java.lang.ClassLoader r9, @Yue.InterfaceC4418 org.luckypray.dexkit.wrap.DexMethod r10) throws java.lang.NoSuchMethodException {
            r8 = this;
            java.lang.String r0 = "classLoader"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "dexMethod"
            Yue.C3329.m13906(r10, r0)
            boolean r0 = r10.isConstructor()
            if (r0 == 0) goto La8
            java.lang.String r0 = r10.getClassName()
            java.lang.Class r0 = r8.getClassInstance(r9, r0)
            java.util.List r1 = r10.getParamTypeNames()
            java.lang.Object r9 = r8.m30862resolveParamTypesOrNullgIAlus(r9, r1)
            java.lang.Throwable r1 = Yue.C5388.m20380(r9)
            java.lang.String r2 = "Constructor "
            if (r1 != 0) goto L8b
            java.lang.Class[] r9 = (java.lang.Class[]) r9
            java.lang.reflect.Constructor r9 = r8.getDeclaredCtorOrNull(r0, r9)
            if (r9 == 0) goto L31
            return r9
        L31:
            r9 = 1
            java.lang.reflect.Constructor[] r1 = r0.getDeclaredConstructors()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "declaredClass.declaredConstructors"
            Yue.C3329.m13905(r1, r3)     // Catch: java.lang.Throwable -> L5b
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5b
            r4 = 0
        L3d:
            if (r4 >= r3) goto L5b
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = r10.getMethodSign()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = "constructor"
            Yue.C3329.m13905(r5, r7)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = org.luckypray.dexkit.util.DexSignUtil.getConstructorSign(r5)     // Catch: java.lang.Throwable -> L5b
            boolean r6 = Yue.C3329.m13897(r6, r7)     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto L58
            r5.setAccessible(r9)     // Catch: java.lang.Throwable -> L5b
            return r5
        L58:
            int r4 = r4 + 1
            goto L3d
        L5b:
            java.lang.String r1 = r10.getName()
            java.lang.String r3 = r10.getMethodSign()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.reflect.Member r0 = org.luckypray.dexkit.util.NativeReflect.getReflectedMethod(r0, r1, r3, r4)
            if (r0 == 0) goto L71
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            r0.setAccessible(r9)
            return r0
        L71:
            java.lang.NoSuchMethodException r9 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = " not found"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            throw r9
        L8b:
            java.lang.NoSuchMethodException r9 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = " not available: parameter type(s) missing"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            r9.initCause(r1)
            throw r9
        La8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            java.lang.String r10 = " not a constructor"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final java.lang.reflect.Field getFieldInstance(@Yue.InterfaceC4418 java.lang.ClassLoader r8, @Yue.InterfaceC4418 org.luckypray.dexkit.wrap.DexField r9) throws java.lang.NoSuchFieldException {
            r7 = this;
            java.lang.String r0 = "classLoader"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "dexField"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.reflect.Field r8 = getFieldInstance$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final java.lang.reflect.Field getFieldInstance(@Yue.InterfaceC4418 java.lang.ClassLoader r11, @Yue.InterfaceC4418 org.luckypray.dexkit.wrap.DexField r12, @Yue.InterfaceC4543 java.lang.Boolean r13) throws java.lang.NoSuchFieldException {
            r10 = this;
            java.lang.String r0 = "classLoader"
            Yue.C3329.m13906(r11, r0)
            java.lang.String r0 = "dexField"
            Yue.C3329.m13906(r12, r0)
            java.lang.String r0 = r12.getClassName()
            java.lang.Class r0 = r10.getClassInstance(r11, r0)
            java.lang.String r1 = r12.getTypeName()
            java.lang.Object r11 = r10.m30863tryLoadTypegIAlus(r11, r1)
            java.lang.Throwable r1 = Yue.C5388.m20380(r11)
            java.lang.String r2 = "Field "
            if (r1 != 0) goto Lb6
            java.lang.Class r11 = (java.lang.Class) r11
            r1 = r0
        L25:
            if (r1 == 0) goto L41
            java.lang.String r3 = r12.getName()
            java.lang.reflect.Field r3 = r10.getDeclaredFieldOrNull(r1, r3)
            if (r3 == 0) goto L3c
            java.lang.Class r4 = r3.getType()
            boolean r4 = Yue.C3329.m13897(r4, r11)
            if (r4 == 0) goto L3c
            return r3
        L3c:
            java.lang.Class r1 = r1.getSuperclass()
            goto L25
        L41:
            r11 = r0
        L42:
            r1 = 1
            if (r11 == 0) goto L8a
            java.lang.reflect.Field[] r3 = r11.getDeclaredFields()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r4 = "clz.declaredFields"
            Yue.C3329.m13905(r3, r4)     // Catch: java.lang.Throwable -> L8a
            int r4 = r3.length     // Catch: java.lang.Throwable -> L8a
            r5 = 0
        L50:
            if (r5 >= r4) goto L85
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = r12.getName()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = r6.getName()     // Catch: java.lang.Throwable -> L8a
            boolean r7 = Yue.C3329.m13897(r7, r8)     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L82
            java.lang.String r7 = r12.getTypeSign()     // Catch: java.lang.Throwable -> L8a
            java.lang.Class r8 = r6.getType()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r9 = "field.type"
            Yue.C3329.m13905(r8, r9)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = org.luckypray.dexkit.util.DexSignUtil.getTypeSign(r8)     // Catch: java.lang.Throwable -> L8a
            boolean r7 = Yue.C3329.m13897(r7, r8)     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L82
            r6.setAccessible(r1)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r11 = "field"
            Yue.C3329.m13905(r6, r11)     // Catch: java.lang.Throwable -> L8a
            return r6
        L82:
            int r5 = r5 + 1
            goto L50
        L85:
            java.lang.Class r11 = r11.getSuperclass()     // Catch: java.lang.Throwable -> L8a
            goto L42
        L8a:
            java.lang.String r11 = r12.getName()
            java.lang.String r3 = r12.getTypeSign()
            java.lang.reflect.Field r11 = org.luckypray.dexkit.util.NativeReflect.getReflectedField(r0, r11, r3, r13)
            if (r11 == 0) goto L9c
            r11.setAccessible(r1)
            return r11
        L9c:
            java.lang.NoSuchFieldException r11 = new java.lang.NoSuchFieldException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            r13.append(r12)
            java.lang.String r12 = " not found"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            throw r11
        Lb6:
            java.lang.NoSuchFieldException r11 = new java.lang.NoSuchFieldException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r2)
            r13.append(r12)
            java.lang.String r12 = " not available: type missing"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.<init>(r12)
            r11.initCause(r1)
            throw r11
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final java.lang.reflect.Method getMethodInstance(@Yue.InterfaceC4418 java.lang.ClassLoader r8, @Yue.InterfaceC4418 org.luckypray.dexkit.wrap.DexMethod r9) throws java.lang.NoSuchMethodException {
            r7 = this;
            java.lang.String r0 = "classLoader"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "dexMethod"
            Yue.C3329.m13906(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.reflect.Method r8 = getMethodInstance$default(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final java.lang.reflect.Method getMethodInstance(@Yue.InterfaceC4418 java.lang.ClassLoader r10, @Yue.InterfaceC4418 org.luckypray.dexkit.wrap.DexMethod r11, @Yue.InterfaceC4543 java.lang.Boolean r12) throws java.lang.NoSuchMethodException {
            r9 = this;
            java.lang.String r0 = "classLoader"
            Yue.C3329.m13906(r10, r0)
            java.lang.String r0 = "dexMethod"
            Yue.C3329.m13906(r11, r0)
            boolean r0 = r11.isMethod()
            if (r0 == 0) goto Lff
            java.lang.String r0 = r11.getClassName()
            java.lang.Class r0 = r9.getClassInstance(r10, r0)
            java.util.List r1 = r11.getParamTypeNames()
            java.lang.Object r1 = r9.m30862resolveParamTypesOrNullgIAlus(r10, r1)
            java.lang.Throwable r2 = Yue.C5388.m20380(r1)
            java.lang.String r3 = "Method "
            if (r2 != 0) goto Le2
            java.lang.Class[] r1 = (java.lang.Class[]) r1
            java.lang.String r2 = r11.getReturnTypeName()
            java.lang.Object r10 = r9.m30863tryLoadTypegIAlus(r10, r2)
            java.lang.Throwable r2 = Yue.C5388.m20380(r10)
            if (r2 != 0) goto Lc5
            java.lang.Class r10 = (java.lang.Class) r10
            r2 = r0
        L3b:
            if (r2 == 0) goto L57
            java.lang.String r4 = r11.getName()
            java.lang.reflect.Method r4 = r9.getDeclaredMethodOrNull(r2, r4, r1)
            if (r4 == 0) goto L52
            java.lang.Class r5 = r4.getReturnType()
            boolean r5 = Yue.C3329.m13897(r5, r10)
            if (r5 == 0) goto L52
            return r4
        L52:
            java.lang.Class r2 = r2.getSuperclass()
            goto L3b
        L57:
            r10 = r0
        L58:
            r1 = 1
            if (r10 == 0) goto L97
            java.lang.reflect.Method[] r2 = r10.getDeclaredMethods()     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = "clz.declaredMethods"
            Yue.C3329.m13905(r2, r4)     // Catch: java.lang.Throwable -> L97
            int r4 = r2.length     // Catch: java.lang.Throwable -> L97
            r5 = 0
        L66:
            if (r5 >= r4) goto L92
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = r11.getName()     // Catch: java.lang.Throwable -> L97
            boolean r7 = Yue.C3329.m13897(r7, r8)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L8f
            java.lang.String r7 = r11.getMethodSign()     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = "method"
            Yue.C3329.m13905(r6, r8)     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = org.luckypray.dexkit.util.DexSignUtil.getMethodSign(r6)     // Catch: java.lang.Throwable -> L97
            boolean r7 = Yue.C3329.m13897(r7, r8)     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L8f
            r6.setAccessible(r1)     // Catch: java.lang.Throwable -> L97
            return r6
        L8f:
            int r5 = r5 + 1
            goto L66
        L92:
            java.lang.Class r10 = r10.getSuperclass()     // Catch: java.lang.Throwable -> L97
            goto L58
        L97:
            java.lang.String r10 = r11.getName()
            java.lang.String r2 = r11.getMethodSign()
            java.lang.reflect.Member r10 = org.luckypray.dexkit.util.NativeReflect.getReflectedMethod(r0, r10, r2, r12)
            if (r10 == 0) goto Lab
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            r10.setAccessible(r1)
            return r10
        Lab:
            java.lang.NoSuchMethodException r10 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            r12.append(r11)
            java.lang.String r11 = " not found"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        Lc5:
            java.lang.NoSuchMethodException r10 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            r12.append(r11)
            java.lang.String r11 = " not available: return type missing"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            r10.initCause(r2)
            throw r10
        Le2:
            java.lang.NoSuchMethodException r10 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            r12.append(r11)
            java.lang.String r11 = " not available: parameter type(s) missing"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            r10.initCause(r2)
            throw r10
        Lff:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            java.lang.String r11 = " not a method"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
    }
}
