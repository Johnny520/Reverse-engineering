package org.luckypray.dexkit.util;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class InstanceUtil {
    public static final org.luckypray.dexkit.util.InstanceUtil INSTANCE = null;
    private static final org.luckypray.dexkit.util.AdaptiveLoaderCache<java.lang.String, java.lang.Class<?>> classCache = null;
    private static final java.util.Map<java.lang.String, java.lang.Class<? extends java.lang.Object>> primitiveMap = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.util.InstanceUtil$getClassInstance$1 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06601 extends p000.bp0 implements p000.p70 {
        final /* synthetic */ java.lang.ClassLoader $classLoader;
        final /* synthetic */ java.lang.String $typeName;

        public C06601(java.lang.String r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.$typeName = r1
                r0.$classLoader = r2
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // p000.p70
        public final java.lang.Class<?> invoke() {
                r4 = this;
                java.lang.String r0 = r4.$typeName
                r1 = 0
                r2 = r1
            L4:
                java.lang.String r3 = "[]"
                boolean r3 = p000.x02.m6479(r0, r3, r1)
                if (r3 == 0) goto L19
                int r2 = r2 + 1
                int r3 = r0.length()
                int r3 = r3 + (-2)
                java.lang.String r0 = r0.substring(r1, r3)
                goto L4
            L19:
                java.util.Map r3 = org.luckypray.dexkit.util.InstanceUtil.access$getPrimitiveMap$p()
                java.lang.Object r3 = r3.get(r0)
                java.lang.Class r3 = (java.lang.Class) r3
                if (r3 != 0) goto L2b
                java.lang.ClassLoader r4 = r4.$classLoader
                java.lang.Class r3 = r4.loadClass(r0)
            L2b:
                r3.getClass()
                r4 = r1
            L2f:
                if (r4 >= r2) goto L3c
                java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r1)
                java.lang.Class r3 = r0.getClass()
                int r4 = r4 + 1
                goto L2f
            L3c:
                return r3
        }

        @Override // p000.p70
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r0 = this;
                java.lang.Class r0 = r0.invoke()
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
            l91 r2 = new l91
            java.lang.String r0 = "boolean"
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2.<init>(r0, r1)
            l91 r3 = new l91
            java.lang.String r0 = "byte"
            java.lang.Class r1 = java.lang.Byte.TYPE
            r3.<init>(r0, r1)
            l91 r4 = new l91
            java.lang.String r0 = "char"
            java.lang.Class r1 = java.lang.Character.TYPE
            r4.<init>(r0, r1)
            l91 r5 = new l91
            java.lang.String r0 = "short"
            java.lang.Class r1 = java.lang.Short.TYPE
            r5.<init>(r0, r1)
            l91 r6 = new l91
            java.lang.String r0 = "int"
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6.<init>(r0, r1)
            l91 r7 = new l91
            java.lang.String r0 = "long"
            java.lang.Class r1 = java.lang.Long.TYPE
            r7.<init>(r0, r1)
            l91 r8 = new l91
            java.lang.String r0 = "float"
            java.lang.Class r1 = java.lang.Float.TYPE
            r8.<init>(r0, r1)
            l91 r9 = new l91
            java.lang.String r0 = "double"
            java.lang.Class r1 = java.lang.Double.TYPE
            r9.<init>(r0, r1)
            l91 r10 = new l91
            java.lang.String r0 = "void"
            java.lang.Class r1 = java.lang.Void.TYPE
            r10.<init>(r0, r1)
            l91[] r0 = new p000.l91[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.Map r0 = p000.ex0.m1972(r0)
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

    private final java.lang.reflect.Constructor<?> getDeclaredCtorOrNull(java.lang.Class<?> r1, java.lang.Class<?>[] r2) {
            r0 = this;
            int r0 = r2.length     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)     // Catch: java.lang.Throwable -> L10
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch: java.lang.Throwable -> L10
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L10
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L17:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L1c
            r0 = 0
        L1c:
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            return r0
    }

    private final java.lang.reflect.Field getDeclaredFieldOrNull(java.lang.Class<?> r1, java.lang.String r2) {
            r0 = this;
            java.lang.reflect.Field r0 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L10:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L15
            r0 = 0
        L15:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            return r0
    }

    private final java.lang.reflect.Method getDeclaredMethodOrNull(java.lang.Class<?> r1, java.lang.String r2, java.lang.Class<?>[] r3) {
            r0 = this;
            int r0 = r3.length     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)     // Catch: java.lang.Throwable -> L10
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch: java.lang.Throwable -> L10
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Throwable -> L10
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L17:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L1c
            r0 = 0
        L1c:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
    }

    public static /* synthetic */ java.lang.reflect.Field getFieldInstance$default(org.luckypray.dexkit.util.InstanceUtil r0, java.lang.ClassLoader r1, org.luckypray.dexkit.wrap.DexField r2, java.lang.Boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.reflect.Field r0 = r0.getFieldInstance(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.reflect.Method getMethodInstance$default(org.luckypray.dexkit.util.InstanceUtil r0, java.lang.ClassLoader r1, org.luckypray.dexkit.wrap.DexMethod r2, java.lang.Boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.reflect.Method r0 = r0.getMethodInstance(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: resolveParamTypesOrNull-gIAlu-s, reason: not valid java name */
    private final java.lang.Object m7469resolveParamTypesOrNullgIAlus(java.lang.ClassLoader r4, java.util.List<java.lang.String> r5) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.m7470tryLoadTypegIAlus(r4, r1)
            java.lang.Throwable r2 = p000.fo1.m2190(r1)
            if (r2 != 0) goto L29
            java.lang.Class r1 = (java.lang.Class) r1
            r0.add(r1)
            goto Ld
        L29:
            eo1 r3 = new eo1
            r3.<init>(r2)
            return r3
        L2f:
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            if (r3 == 0) goto L39
            return r3
        L39:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T>"
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: tryLoadType-gIAlu-s, reason: not valid java name */
    private final java.lang.Object m7470tryLoadTypegIAlus(java.lang.ClassLoader r1, java.lang.String r2) {
            r0 = this;
            java.lang.Class r0 = r0.getClassInstance(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            return r1
    }

    public final java.lang.Class<?> getClassInstance(java.lang.ClassLoader r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            org.luckypray.dexkit.util.AdaptiveLoaderCache<java.lang.String, java.lang.Class<?>> r1 = org.luckypray.dexkit.util.InstanceUtil.classCache
            org.luckypray.dexkit.util.InstanceUtil$getClassInstance$1 r0 = new org.luckypray.dexkit.util.InstanceUtil$getClassInstance$1
            r0.<init>(r3, r2)
            java.lang.Object r1 = r1.get(r2, r3, r0)
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    public final java.lang.Class<?> getClassInstance(java.lang.ClassLoader r1, org.luckypray.dexkit.wrap.DexClass r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.lang.String r2 = r2.getTypeName()
            java.lang.Class r0 = r0.getClassInstance(r1, r2)
            return r0
    }

    public final java.lang.reflect.Constructor<?> getConstructorInstance(java.lang.ClassLoader r8, org.luckypray.dexkit.wrap.DexMethod r9) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            boolean r0 = r9.isConstructor()
            if (r0 == 0) goto L9a
            java.lang.String r0 = r9.getClassName()
            java.lang.Class r0 = r7.getClassInstance(r8, r0)
            java.util.List r1 = r9.getParamTypeNames()
            java.lang.Object r8 = r7.m7469resolveParamTypesOrNullgIAlus(r8, r1)
            java.lang.Throwable r1 = p000.fo1.m2190(r8)
            java.lang.String r2 = "Constructor "
            if (r1 != 0) goto L80
            java.lang.Class[] r8 = (java.lang.Class[]) r8
            java.lang.reflect.Constructor r7 = r7.getDeclaredCtorOrNull(r0, r8)
            if (r7 == 0) goto L2d
            return r7
        L2d:
            r7 = 1
            java.lang.reflect.Constructor[] r8 = r0.getDeclaredConstructors()     // Catch: java.lang.Throwable -> L53
            r8.getClass()     // Catch: java.lang.Throwable -> L53
            int r1 = r8.length     // Catch: java.lang.Throwable -> L53
            r3 = 0
        L37:
            if (r3 >= r1) goto L53
            r4 = r8[r3]     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = r9.getMethodSign()     // Catch: java.lang.Throwable -> L53
            r4.getClass()     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = org.luckypray.dexkit.util.DexSignUtil.getConstructorSign(r4)     // Catch: java.lang.Throwable -> L53
            boolean r5 = p000.ln0.m3626(r5, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L50
            r4.setAccessible(r7)     // Catch: java.lang.Throwable -> L53
            return r4
        L50:
            int r3 = r3 + 1
            goto L37
        L53:
            java.lang.String r8 = r9.getName()
            java.lang.String r1 = r9.getMethodSign()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.reflect.Member r8 = org.luckypray.dexkit.util.NativeReflect.getReflectedMethod(r0, r8, r1, r3)
            if (r8 == 0) goto L69
            java.lang.reflect.Constructor r8 = (java.lang.reflect.Constructor) r8
            r8.setAccessible(r7)
            return r8
        L69:
            java.lang.NoSuchMethodException r7 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            r8.append(r9)
            java.lang.String r9 = " not found"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L80:
            java.lang.NoSuchMethodException r7 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            r8.append(r9)
            java.lang.String r9 = " not available: parameter type(s) missing"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            r7.initCause(r1)
            throw r7
        L9a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            java.lang.String r8 = " not a constructor"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    public final java.lang.reflect.Field getFieldInstance(java.lang.ClassLoader r7, org.luckypray.dexkit.wrap.DexField r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            java.lang.reflect.Field r6 = getFieldInstance$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final java.lang.reflect.Field getFieldInstance(java.lang.ClassLoader r9, org.luckypray.dexkit.wrap.DexField r10, java.lang.Boolean r11) {
            r8 = this;
            r9.getClass()
            r10.getClass()
            java.lang.String r0 = r10.getClassName()
            java.lang.Class r0 = r8.getClassInstance(r9, r0)
            java.lang.String r1 = r10.getTypeName()
            java.lang.Object r9 = r8.m7470tryLoadTypegIAlus(r9, r1)
            java.lang.Throwable r1 = p000.fo1.m2190(r9)
            java.lang.String r2 = "Field "
            if (r1 != 0) goto La6
            java.lang.Class r9 = (java.lang.Class) r9
            r1 = r0
        L21:
            if (r1 == 0) goto L3d
            java.lang.String r3 = r10.getName()
            java.lang.reflect.Field r3 = r8.getDeclaredFieldOrNull(r1, r3)
            if (r3 == 0) goto L38
            java.lang.Class r4 = r3.getType()
            boolean r4 = p000.ln0.m3626(r4, r9)
            if (r4 == 0) goto L38
            return r3
        L38:
            java.lang.Class r1 = r1.getSuperclass()
            goto L21
        L3d:
            r8 = r0
        L3e:
            r9 = 1
            if (r8 == 0) goto L7d
            java.lang.reflect.Field[] r1 = r8.getDeclaredFields()     // Catch: java.lang.Throwable -> L7d
            r1.getClass()     // Catch: java.lang.Throwable -> L7d
            int r3 = r1.length     // Catch: java.lang.Throwable -> L7d
            r4 = 0
        L4a:
            if (r4 >= r3) goto L78
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = r10.getName()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r7 = r5.getName()     // Catch: java.lang.Throwable -> L7d
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L75
            java.lang.String r6 = r10.getTypeSign()     // Catch: java.lang.Throwable -> L7d
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Throwable -> L7d
            r7.getClass()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r7 = org.luckypray.dexkit.util.DexSignUtil.getTypeSign(r7)     // Catch: java.lang.Throwable -> L7d
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L75
            r5.setAccessible(r9)     // Catch: java.lang.Throwable -> L7d
            return r5
        L75:
            int r4 = r4 + 1
            goto L4a
        L78:
            java.lang.Class r8 = r8.getSuperclass()     // Catch: java.lang.Throwable -> L7d
            goto L3e
        L7d:
            java.lang.String r8 = r10.getName()
            java.lang.String r1 = r10.getTypeSign()
            java.lang.reflect.Field r8 = org.luckypray.dexkit.util.NativeReflect.getReflectedField(r0, r8, r1, r11)
            if (r8 == 0) goto L8f
            r8.setAccessible(r9)
            return r8
        L8f:
            java.lang.NoSuchFieldException r8 = new java.lang.NoSuchFieldException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r2)
            r9.append(r10)
            java.lang.String r10 = " not found"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        La6:
            java.lang.NoSuchFieldException r8 = new java.lang.NoSuchFieldException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r2)
            r9.append(r10)
            java.lang.String r10 = " not available: type missing"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            r8.initCause(r1)
            throw r8
    }

    public final java.lang.reflect.Method getMethodInstance(java.lang.ClassLoader r7, org.luckypray.dexkit.wrap.DexMethod r8) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            java.lang.reflect.Method r6 = getMethodInstance$default(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public final java.lang.reflect.Method getMethodInstance(java.lang.ClassLoader r9, org.luckypray.dexkit.wrap.DexMethod r10, java.lang.Boolean r11) {
            r8 = this;
            r9.getClass()
            r10.getClass()
            boolean r0 = r10.isMethod()
            if (r0 == 0) goto Leb
            java.lang.String r0 = r10.getClassName()
            java.lang.Class r0 = r8.getClassInstance(r9, r0)
            java.util.List r1 = r10.getParamTypeNames()
            java.lang.Object r1 = r8.m7469resolveParamTypesOrNullgIAlus(r9, r1)
            java.lang.Throwable r2 = p000.fo1.m2190(r1)
            java.lang.String r3 = "Method "
            if (r2 != 0) goto Ld1
            java.lang.Class[] r1 = (java.lang.Class[]) r1
            java.lang.String r2 = r10.getReturnTypeName()
            java.lang.Object r9 = r8.m7470tryLoadTypegIAlus(r9, r2)
            java.lang.Throwable r2 = p000.fo1.m2190(r9)
            if (r2 != 0) goto Lb7
            java.lang.Class r9 = (java.lang.Class) r9
            r2 = r0
        L37:
            if (r2 == 0) goto L53
            java.lang.String r4 = r10.getName()
            java.lang.reflect.Method r4 = r8.getDeclaredMethodOrNull(r2, r4, r1)
            if (r4 == 0) goto L4e
            java.lang.Class r5 = r4.getReturnType()
            boolean r5 = p000.ln0.m3626(r5, r9)
            if (r5 == 0) goto L4e
            return r4
        L4e:
            java.lang.Class r2 = r2.getSuperclass()
            goto L37
        L53:
            r8 = r0
        L54:
            r9 = 1
            if (r8 == 0) goto L8c
            java.lang.reflect.Method[] r1 = r8.getDeclaredMethods()     // Catch: java.lang.Throwable -> L8c
            r1.getClass()     // Catch: java.lang.Throwable -> L8c
            int r2 = r1.length     // Catch: java.lang.Throwable -> L8c
            r4 = 0
        L60:
            if (r4 >= r2) goto L87
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r7 = r10.getName()     // Catch: java.lang.Throwable -> L8c
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L84
            java.lang.String r6 = r10.getMethodSign()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r7 = org.luckypray.dexkit.util.DexSignUtil.getMethodSign(r5)     // Catch: java.lang.Throwable -> L8c
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L84
            r5.setAccessible(r9)     // Catch: java.lang.Throwable -> L8c
            return r5
        L84:
            int r4 = r4 + 1
            goto L60
        L87:
            java.lang.Class r8 = r8.getSuperclass()     // Catch: java.lang.Throwable -> L8c
            goto L54
        L8c:
            java.lang.String r8 = r10.getName()
            java.lang.String r1 = r10.getMethodSign()
            java.lang.reflect.Member r8 = org.luckypray.dexkit.util.NativeReflect.getReflectedMethod(r0, r8, r1, r11)
            if (r8 == 0) goto La0
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            r8.setAccessible(r9)
            return r8
        La0:
            java.lang.NoSuchMethodException r8 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r3)
            r9.append(r10)
            java.lang.String r10 = " not found"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lb7:
            java.lang.NoSuchMethodException r8 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r3)
            r9.append(r10)
            java.lang.String r10 = " not available: return type missing"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            r8.initCause(r2)
            throw r8
        Ld1:
            java.lang.NoSuchMethodException r8 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r3)
            r9.append(r10)
            java.lang.String r10 = " not available: parameter type(s) missing"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            r8.initCause(r2)
            throw r8
        Leb:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            java.lang.String r9 = " not a method"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }
}
