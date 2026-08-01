package org.luckypray.dexkit.util;

/* JADX INFO: compiled from: InstanceUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R(\u0010\u0003\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m115d2 = {"Lorg/luckypray/dexkit/util/InstanceUtil;", "", "()V", "constructorCache", "Lorg/luckypray/dexkit/util/WeakCache;", "Ljava/lang/Class;", "", "Ljava/lang/reflect/Constructor;", "fieldsCache", "Ljava/lang/reflect/Field;", "methodsCache", "Ljava/lang/reflect/Method;", "signCache", "", "getClassInstance", "classLoader", "Ljava/lang/ClassLoader;", "typeName", "dexClass", "Lorg/luckypray/dexkit/wrap/DexClass;", "getConstructorInstance", "dexMethod", "Lorg/luckypray/dexkit/wrap/DexMethod;", "getFieldInstance", "dexField", "Lorg/luckypray/dexkit/wrap/DexField;", "getMethodInstance", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class InstanceUtil {
    public static final org.luckypray.dexkit.util.InstanceUtil INSTANCE = null;
    private static final org.luckypray.dexkit.util.WeakCache<java.lang.Class<?>, java.lang.reflect.Constructor<?>[]> constructorCache = null;
    private static final org.luckypray.dexkit.util.WeakCache<java.lang.Class<?>, java.lang.reflect.Field[]> fieldsCache = null;
    private static final org.luckypray.dexkit.util.WeakCache<java.lang.Class<?>, java.lang.reflect.Method[]> methodsCache = null;
    private static final org.luckypray.dexkit.util.WeakCache<java.lang.Object, java.lang.String> signCache = null;




    static {
            org.luckypray.dexkit.util.InstanceUtil r0 = new org.luckypray.dexkit.util.InstanceUtil
            r0.<init>()
            org.luckypray.dexkit.util.InstanceUtil.INSTANCE = r0
            org.luckypray.dexkit.util.WeakCache r0 = new org.luckypray.dexkit.util.WeakCache
            r0.<init>()
            org.luckypray.dexkit.util.InstanceUtil.constructorCache = r0
            org.luckypray.dexkit.util.WeakCache r0 = new org.luckypray.dexkit.util.WeakCache
            r0.<init>()
            org.luckypray.dexkit.util.InstanceUtil.fieldsCache = r0
            org.luckypray.dexkit.util.WeakCache r0 = new org.luckypray.dexkit.util.WeakCache
            r0.<init>()
            org.luckypray.dexkit.util.InstanceUtil.methodsCache = r0
            org.luckypray.dexkit.util.WeakCache r0 = new org.luckypray.dexkit.util.WeakCache
            r0.<init>()
            org.luckypray.dexkit.util.InstanceUtil.signCache = r0
            return
    }

    private InstanceUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.Class<?> getClassInstance(java.lang.ClassLoader r5, java.lang.String r6) throws java.lang.ClassNotFoundException {
            r4 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            java.lang.String r1 = "[]"
            r2 = 0
            r3 = 2
            boolean r0 = kotlin.text.StringsKt.endsWith$default(r6, r1, r2, r3, r0)
            if (r0 == 0) goto L30
            int r0 = r6.length()
            int r0 = r0 - r3
            java.lang.String r0 = r6.substring(r2, r0)
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Class r0 = r4.getClassInstance(r5, r0)
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r0, r2)
            java.lang.Class r1 = r1.getClass()
            return r1
        L30:
            int r0 = r6.hashCode()
            switch(r0) {
                case -1325958191: goto L97;
                case 104431: goto L8b;
                case 3039496: goto L7f;
                case 3052374: goto L73;
                case 3327612: goto L67;
                case 3625364: goto L5b;
                case 64711720: goto L52;
                case 97526364: goto L46;
                case 109413500: goto L39;
                default: goto L37;
            }
        L37:
            goto La3
        L39:
            java.lang.String r0 = "short"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L42
            goto L37
        L42:
            java.lang.Class r0 = java.lang.Short.TYPE
            goto La7
        L46:
            java.lang.String r0 = "float"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L4f
            goto L37
        L4f:
            java.lang.Class r0 = java.lang.Float.TYPE
            goto La7
        L52:
            java.lang.String r0 = "boolean"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L94
            goto L37
        L5b:
            java.lang.String r0 = "void"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L64
            goto L37
        L64:
            java.lang.Class r0 = java.lang.Void.TYPE
            goto La7
        L67:
            java.lang.String r0 = "long"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L70
            goto L37
        L70:
            java.lang.Class r0 = java.lang.Long.TYPE
            goto La7
        L73:
            java.lang.String r0 = "char"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L7c
            goto L37
        L7c:
            java.lang.Class r0 = java.lang.Character.TYPE
            goto La7
        L7f:
            java.lang.String r0 = "byte"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L88
            goto L37
        L88:
            java.lang.Class r0 = java.lang.Byte.TYPE
            goto La7
        L8b:
            java.lang.String r0 = "int"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L94
            goto L37
        L94:
            java.lang.Class r0 = java.lang.Integer.TYPE
            goto La7
        L97:
            java.lang.String r0 = "double"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto La0
            goto L37
        La0:
            java.lang.Class r0 = java.lang.Double.TYPE
            goto La7
        La3:
            java.lang.Class r0 = r5.loadClass(r6)
        La7:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    public final java.lang.Class<?> getClassInstance(java.lang.ClassLoader r2, org.luckypray.dexkit.wrap.DexClass r3) throws java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "dexClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r3.getTypeName()
            java.lang.Class r0 = r1.getClassInstance(r2, r0)
            return r0
    }

    public final java.lang.reflect.Constructor<?> getConstructorInstance(java.lang.ClassLoader r9, org.luckypray.dexkit.wrap.DexMethod r10) throws java.lang.NoSuchMethodException {
            r8 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "dexMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r10.isConstructor()
            if (r0 == 0) goto Laf
        L11:
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.ClassNotFoundException -> L89
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.String r1 = r10.getClassName()     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.Class r1 = r9.loadClass(r1)     // Catch: java.lang.ClassNotFoundException -> L89
            r0.element = r1     // Catch: java.lang.ClassNotFoundException -> L89
        L20:
            org.luckypray.dexkit.util.WeakCache<java.lang.Class<?>, java.lang.reflect.Constructor<?>[]> r1 = org.luckypray.dexkit.util.InstanceUtil.constructorCache     // Catch: java.lang.ClassNotFoundException -> L89
            T r2 = r0.element     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.String r3 = "clz"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L89
            org.luckypray.dexkit.util.InstanceUtil$getConstructorInstance$declaredConstructors$1 r3 = new org.luckypray.dexkit.util.InstanceUtil$getConstructorInstance$declaredConstructors$1     // Catch: java.lang.ClassNotFoundException -> L89
            r3.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L89
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.Object r1 = r1.get(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.reflect.Constructor[] r1 = (java.lang.reflect.Constructor[]) r1     // Catch: java.lang.ClassNotFoundException -> L89
            int r2 = r1.length     // Catch: java.lang.ClassNotFoundException -> L89
            r3 = 0
        L38:
            if (r3 >= r2) goto L5b
            r4 = r1[r3]     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.String r5 = r10.getMethodSign()     // Catch: java.lang.ClassNotFoundException -> L89
            org.luckypray.dexkit.util.WeakCache<java.lang.Object, java.lang.String> r6 = org.luckypray.dexkit.util.InstanceUtil.signCache     // Catch: java.lang.ClassNotFoundException -> L89
            org.luckypray.dexkit.util.InstanceUtil$getConstructorInstance$1 r7 = new org.luckypray.dexkit.util.InstanceUtil$getConstructorInstance$1     // Catch: java.lang.ClassNotFoundException -> L89
            r7.<init>(r4)     // Catch: java.lang.ClassNotFoundException -> L89
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.Object r6 = r6.get(r4, r7)     // Catch: java.lang.ClassNotFoundException -> L89
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L89
            if (r5 == 0) goto L58
            r2 = 1
            r4.setAccessible(r2)     // Catch: java.lang.ClassNotFoundException -> L89
            return r4
        L58:
            int r3 = r3 + 1
            goto L38
        L5b:
            T r1 = r0.element     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.ClassNotFoundException -> L89
            r2 = r1
            r3 = 0
            r0.element = r2     // Catch: java.lang.ClassNotFoundException -> L89
            if (r1 == 0) goto L6a
            goto L20
        L6a:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L89
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.String r3 = "Constructor "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.StringBuilder r2 = r2.append(r10)     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.String r3 = " not found"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.ClassNotFoundException -> L89
            java.lang.String r2 = r2.toString()     // Catch: java.lang.ClassNotFoundException -> L89
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L89
            throw r1     // Catch: java.lang.ClassNotFoundException -> L89
        L89:
            r0 = move-exception
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No such method: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Throwable r1 = r1.initCause(r2)
            java.lang.String r2 = "NoSuchMethodException(\"N…$dexMethod\").initCause(e)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            throw r1
        Laf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r2 = " not a constructor"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.reflect.Field getFieldInstance(java.lang.ClassLoader r9, org.luckypray.dexkit.wrap.DexField r10) throws java.lang.NoSuchFieldException {
            r8 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "dexField"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.ClassNotFoundException -> L91
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.String r1 = r10.getClassName()     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.Class r1 = r9.loadClass(r1)     // Catch: java.lang.ClassNotFoundException -> L91
            r0.element = r1     // Catch: java.lang.ClassNotFoundException -> L91
        L1a:
            org.luckypray.dexkit.util.WeakCache<java.lang.Class<?>, java.lang.reflect.Field[]> r1 = org.luckypray.dexkit.util.InstanceUtil.fieldsCache     // Catch: java.lang.ClassNotFoundException -> L91
            T r2 = r0.element     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.String r3 = "clz"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L91
            org.luckypray.dexkit.util.InstanceUtil$getFieldInstance$declaredFields$1 r3 = new org.luckypray.dexkit.util.InstanceUtil$getFieldInstance$declaredFields$1     // Catch: java.lang.ClassNotFoundException -> L91
            r3.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L91
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.Object r1 = r1.get(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.reflect.Field[] r1 = (java.lang.reflect.Field[]) r1     // Catch: java.lang.ClassNotFoundException -> L91
            int r2 = r1.length     // Catch: java.lang.ClassNotFoundException -> L91
            r3 = 0
        L32:
            if (r3 >= r2) goto L63
            r4 = r1[r3]     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.String r5 = r10.getName()     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.String r6 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> L91
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L91
            if (r5 == 0) goto L60
            java.lang.String r5 = r10.getTypeSign()     // Catch: java.lang.ClassNotFoundException -> L91
            org.luckypray.dexkit.util.WeakCache<java.lang.Object, java.lang.String> r6 = org.luckypray.dexkit.util.InstanceUtil.signCache     // Catch: java.lang.ClassNotFoundException -> L91
            org.luckypray.dexkit.util.InstanceUtil$getFieldInstance$1 r7 = new org.luckypray.dexkit.util.InstanceUtil$getFieldInstance$1     // Catch: java.lang.ClassNotFoundException -> L91
            r7.<init>(r4)     // Catch: java.lang.ClassNotFoundException -> L91
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.Object r6 = r6.get(r4, r7)     // Catch: java.lang.ClassNotFoundException -> L91
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L91
            if (r5 == 0) goto L60
            r2 = 1
            r4.setAccessible(r2)     // Catch: java.lang.ClassNotFoundException -> L91
            return r4
        L60:
            int r3 = r3 + 1
            goto L32
        L63:
            T r1 = r0.element     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.ClassNotFoundException -> L91
            r2 = r1
            r3 = 0
            r0.element = r2     // Catch: java.lang.ClassNotFoundException -> L91
            if (r1 == 0) goto L72
            goto L1a
        L72:
            java.lang.NoSuchFieldException r1 = new java.lang.NoSuchFieldException     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L91
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.String r3 = "Field "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.StringBuilder r2 = r2.append(r10)     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.String r3 = " not found"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.ClassNotFoundException -> L91
            java.lang.String r2 = r2.toString()     // Catch: java.lang.ClassNotFoundException -> L91
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L91
            throw r1     // Catch: java.lang.ClassNotFoundException -> L91
        L91:
            r0 = move-exception
            java.lang.NoSuchFieldException r1 = new java.lang.NoSuchFieldException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No such field: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Throwable r1 = r1.initCause(r2)
            java.lang.String r2 = "NoSuchFieldException(\"No… $dexField\").initCause(e)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            throw r1
    }

    public final java.lang.reflect.Method getMethodInstance(java.lang.ClassLoader r9, org.luckypray.dexkit.wrap.DexMethod r10) throws java.lang.NoSuchMethodException {
            r8 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "dexMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r10.isMethod()
            if (r0 == 0) goto Lbd
        L11:
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.ClassNotFoundException -> L97
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.String r1 = r10.getClassName()     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.Class r1 = r9.loadClass(r1)     // Catch: java.lang.ClassNotFoundException -> L97
            r0.element = r1     // Catch: java.lang.ClassNotFoundException -> L97
        L20:
            org.luckypray.dexkit.util.WeakCache<java.lang.Class<?>, java.lang.reflect.Method[]> r1 = org.luckypray.dexkit.util.InstanceUtil.methodsCache     // Catch: java.lang.ClassNotFoundException -> L97
            T r2 = r0.element     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.String r3 = "clz"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L97
            org.luckypray.dexkit.util.InstanceUtil$getMethodInstance$declaredMethods$1 r3 = new org.luckypray.dexkit.util.InstanceUtil$getMethodInstance$declaredMethods$1     // Catch: java.lang.ClassNotFoundException -> L97
            r3.<init>(r0)     // Catch: java.lang.ClassNotFoundException -> L97
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.Object r1 = r1.get(r2, r3)     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.reflect.Method[] r1 = (java.lang.reflect.Method[]) r1     // Catch: java.lang.ClassNotFoundException -> L97
            int r2 = r1.length     // Catch: java.lang.ClassNotFoundException -> L97
            r3 = 0
        L38:
            if (r3 >= r2) goto L69
            r4 = r1[r3]     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.String r5 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.String r6 = r10.getName()     // Catch: java.lang.ClassNotFoundException -> L97
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L97
            if (r5 == 0) goto L66
            java.lang.String r5 = r10.getMethodSign()     // Catch: java.lang.ClassNotFoundException -> L97
            org.luckypray.dexkit.util.WeakCache<java.lang.Object, java.lang.String> r6 = org.luckypray.dexkit.util.InstanceUtil.signCache     // Catch: java.lang.ClassNotFoundException -> L97
            org.luckypray.dexkit.util.InstanceUtil$getMethodInstance$1 r7 = new org.luckypray.dexkit.util.InstanceUtil$getMethodInstance$1     // Catch: java.lang.ClassNotFoundException -> L97
            r7.<init>(r4)     // Catch: java.lang.ClassNotFoundException -> L97
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.Object r6 = r6.get(r4, r7)     // Catch: java.lang.ClassNotFoundException -> L97
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)     // Catch: java.lang.ClassNotFoundException -> L97
            if (r5 == 0) goto L66
            r2 = 1
            r4.setAccessible(r2)     // Catch: java.lang.ClassNotFoundException -> L97
            return r4
        L66:
            int r3 = r3 + 1
            goto L38
        L69:
            T r1 = r0.element     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.ClassNotFoundException -> L97
            r2 = r1
            r3 = 0
            r0.element = r2     // Catch: java.lang.ClassNotFoundException -> L97
            if (r1 == 0) goto L78
            goto L20
        L78:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L97
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.String r3 = "Method "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.StringBuilder r2 = r2.append(r10)     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.String r3 = " not found"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.ClassNotFoundException -> L97
            java.lang.String r2 = r2.toString()     // Catch: java.lang.ClassNotFoundException -> L97
            r1.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L97
            throw r1     // Catch: java.lang.ClassNotFoundException -> L97
        L97:
            r0 = move-exception
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No such method: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Throwable r1 = r1.initCause(r2)
            java.lang.String r2 = "NoSuchMethodException(\"N…$dexMethod\").initCause(e)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            throw r1
        Lbd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r2 = " not a method"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
