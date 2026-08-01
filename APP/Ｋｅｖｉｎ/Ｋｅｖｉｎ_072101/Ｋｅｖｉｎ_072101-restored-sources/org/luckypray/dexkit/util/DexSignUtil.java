package org.luckypray.dexkit.util;

/* JADX INFO: compiled from: DexSignUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0014\u0010\n\u001a\u00020\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J\u0014\u0010\r\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0014\u0010\r\u001a\u00020\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0014\u0010\u0013\u001a\u00020\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\u0014\u0010\u0018\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J\u0014\u0010\u001a\u001a\u00020\u00052\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0007J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0003R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m115d2 = {"Lorg/luckypray/dexkit/util/DexSignUtil;", "", "()V", "primitiveMap", "", "", "primitiveTypeNameMap", "getClassDescriptor", "clazz", "Ljava/lang/Class;", "getConstructorSign", "constructor", "Ljava/lang/reflect/Constructor;", "getDescriptor", "field", "Ljava/lang/reflect/Field;", "method", "Ljava/lang/reflect/Method;", "getFieldDescriptor", "getMethodDescriptor", "getMethodSign", "getParamTypeNames", "", "paramSigns", "getTypeName", "typeSign", "getTypeSign", "type", "typeName", "primitiveTypeName", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class DexSignUtil {
    public static final org.luckypray.dexkit.util.DexSignUtil INSTANCE = null;
    private static final java.util.Map<java.lang.String, java.lang.String> primitiveMap = null;
    private static final java.util.Map<java.lang.String, java.lang.String> primitiveTypeNameMap = null;

    static {
            org.luckypray.dexkit.util.DexSignUtil r0 = new org.luckypray.dexkit.util.DexSignUtil
            r0.<init>()
            org.luckypray.dexkit.util.DexSignUtil.INSTANCE = r0
            r0 = 9
            kotlin.Pair[] r1 = new kotlin.Pair[r0]
            java.lang.String r2 = "boolean"
            java.lang.String r3 = "Z"
            kotlin.Pair r4 = kotlin.TuplesKt.m122to(r2, r3)
            r5 = 0
            r1[r5] = r4
            java.lang.String r4 = "byte"
            java.lang.String r6 = "B"
            kotlin.Pair r7 = kotlin.TuplesKt.m122to(r4, r6)
            r8 = 1
            r1[r8] = r7
            java.lang.String r7 = "char"
            java.lang.String r9 = "C"
            kotlin.Pair r10 = kotlin.TuplesKt.m122to(r7, r9)
            r11 = 2
            r1[r11] = r10
            java.lang.String r10 = "short"
            java.lang.String r12 = "S"
            kotlin.Pair r13 = kotlin.TuplesKt.m122to(r10, r12)
            r14 = 3
            r1[r14] = r13
            java.lang.String r13 = "int"
            java.lang.String r15 = "I"
            kotlin.Pair r16 = kotlin.TuplesKt.m122to(r13, r15)
            r17 = 4
            r1[r17] = r16
            java.lang.String r14 = "float"
            java.lang.String r11 = "F"
            kotlin.Pair r18 = kotlin.TuplesKt.m122to(r14, r11)
            r19 = 5
            r1[r19] = r18
            java.lang.String r8 = "long"
            java.lang.String r5 = "J"
            kotlin.Pair r20 = kotlin.TuplesKt.m122to(r8, r5)
            r21 = 6
            r1[r21] = r20
            java.lang.String r0 = "double"
            r22 = r5
            java.lang.String r5 = "D"
            kotlin.Pair r0 = kotlin.TuplesKt.m122to(r0, r5)
            r5 = 7
            r1[r5] = r0
            java.lang.String r0 = "void"
            java.lang.String r5 = "V"
            kotlin.Pair r0 = kotlin.TuplesKt.m122to(r0, r5)
            r5 = 8
            r1[r5] = r0
            java.util.Map r0 = kotlin.collections.MapsKt.mutableMapOf(r1)
            org.luckypray.dexkit.util.DexSignUtil.primitiveMap = r0
            r0 = 9
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r3, r2)
            r2 = 0
            r0[r2] = r1
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r6, r4)
            r2 = 1
            r0[r2] = r1
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r9, r7)
            r2 = 2
            r0[r2] = r1
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r12, r10)
            r2 = 3
            r0[r2] = r1
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r15, r13)
            r0[r17] = r1
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r11, r14)
            r0[r19] = r1
            r1 = r22
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r1, r8)
            r0[r21] = r1
            java.lang.String r1 = "D"
            java.lang.String r2 = "double"
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r1, r2)
            r2 = 7
            r0[r2] = r1
            java.lang.String r1 = "V"
            java.lang.String r2 = "void"
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r1, r2)
            r2 = 8
            r0[r2] = r1
            java.util.Map r0 = kotlin.collections.MapsKt.mutableMapOf(r0)
            org.luckypray.dexkit.util.DexSignUtil.primitiveTypeNameMap = r0
            return
    }

    private DexSignUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getClassDescriptor(java.lang.Class<?> r1) {
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = getDescriptor(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getConstructorSign(java.lang.reflect.Constructor<?> r14) {
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.String r3 = "("
            r1.append(r3)
            java.lang.Class[] r3 = r14.getParameterTypes()
            java.lang.String r4 = "constructor.parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r5 = r3
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.String r3 = ""
            r6 = r3
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            org.luckypray.dexkit.util.DexSignUtil$getConstructorSign$1$1 r3 = org.luckypray.dexkit.util.DexSignUtil$getConstructorSign$1$1.INSTANCE
            r11 = r3
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r12 = 30
            r13 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r3 = kotlin.collections.ArraysKt.joinToString$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.append(r3)
            java.lang.String r3 = ")V"
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getDescriptor(java.lang.Class<?> r1) {
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = getTypeSign(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getDescriptor(java.lang.reflect.Constructor<?> r5) {
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.Class r3 = r5.getDeclaringClass()
            java.lang.String r4 = "constructor.declaringClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = getTypeSign(r3)
            r1.append(r3)
            java.lang.String r3 = "->"
            r1.append(r3)
            java.lang.String r3 = "<init>"
            r1.append(r3)
            java.lang.String r3 = getConstructorSign(r5)
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getDescriptor(java.lang.reflect.Field r5) {
            java.lang.String r0 = "field"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.Class r3 = r5.getDeclaringClass()
            java.lang.String r4 = "field.declaringClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = getTypeSign(r3)
            r1.append(r3)
            java.lang.String r3 = "->"
            r1.append(r3)
            java.lang.String r3 = r5.getName()
            r1.append(r3)
            java.lang.String r3 = ":"
            r1.append(r3)
            java.lang.Class r3 = r5.getType()
            java.lang.String r4 = "field.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = getTypeSign(r3)
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getDescriptor(java.lang.reflect.Method r5) {
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.Class r3 = r5.getDeclaringClass()
            java.lang.String r4 = "method.declaringClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = getTypeSign(r3)
            r1.append(r3)
            java.lang.String r3 = "->"
            r1.append(r3)
            java.lang.String r3 = r5.getName()
            r1.append(r3)
            java.lang.String r3 = getMethodSign(r5)
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getFieldDescriptor(java.lang.reflect.Field r1) {
            java.lang.String r0 = "field"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = getDescriptor(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getMethodDescriptor(java.lang.reflect.Constructor<?> r1) {
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = getDescriptor(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getMethodDescriptor(java.lang.reflect.Method r1) {
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = getDescriptor(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getMethodSign(java.lang.reflect.Method r14) {
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.String r3 = "("
            r1.append(r3)
            java.lang.Class[] r3 = r14.getParameterTypes()
            java.lang.String r4 = "method.parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r5 = r3
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.String r3 = ""
            r6 = r3
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            org.luckypray.dexkit.util.DexSignUtil$getMethodSign$1$1 r3 = org.luckypray.dexkit.util.DexSignUtil$getMethodSign$1$1.INSTANCE
            r11 = r3
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r12 = 30
            r13 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r3 = kotlin.collections.ArraysKt.joinToString$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.Class r3 = r14.getReturnType()
            java.lang.String r4 = "method.returnType"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = getTypeSign(r3)
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<java.lang.String> getParamTypeNames(java.lang.String r10) {
            java.lang.String r0 = "paramSigns"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            r2 = 0
            r8 = r2
        Lf:
            int r2 = r10.length()
            if (r8 >= r2) goto L48
            char r9 = r10.charAt(r8)
            r2 = 91
            if (r9 != r2) goto L20
            int r8 = r8 + 1
            goto Lf
        L20:
            r2 = 76
            if (r9 != r2) goto L32
            r2 = r10
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6 = 4
            r7 = 0
            r3 = 59
            r5 = 0
            r4 = r8
            int r2 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
            r8 = r2
        L32:
            int r2 = r8 + 1
            java.lang.String r2 = r10.substring(r1, r2)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = getTypeName(r2)
            r0.add(r3)
            int r8 = r8 + 1
            r1 = r8
            goto Lf
        L48:
            if (r1 != r8) goto L4b
            return r0
        L4b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown signString: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r10)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getTypeName(java.lang.Class<?> r3) {
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L2a
            java.lang.Class r0 = r3.getComponentType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r0 = getTypeName(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "[]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2a:
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto Lad
        L31:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L3c
            java.lang.String r0 = "boolean"
            goto L93
        L3c:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L47
            java.lang.String r0 = "byte"
            goto L93
        L47:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L52
            java.lang.String r0 = "char"
            goto L93
        L52:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L5d
            java.lang.String r0 = "short"
            goto L93
        L5d:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L68
            java.lang.String r0 = "int"
            goto L93
        L68:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L73
            java.lang.String r0 = "float"
            goto L93
        L73:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L7e
            java.lang.String r0 = "long"
            goto L93
        L7e:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L89
            java.lang.String r0 = "double"
            goto L93
        L89:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L94
            java.lang.String r0 = "void"
        L93:
            return r0
        L94:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown primitive type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lad:
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "clazz.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getTypeName(java.lang.String r10) {
            java.lang.String r0 = "typeSign"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            char r1 = r10.charAt(r0)
            r2 = 91
            r3 = 1
            if (r1 != r2) goto L30
            java.lang.String r0 = r10.substring(r3)
            java.lang.String r1 = "(this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = getTypeName(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "[]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L30:
            int r1 = r10.length()
            if (r1 != r3) goto L3b
            java.lang.String r0 = primitiveTypeName(r10)
            return r0
        L3b:
            char r0 = r10.charAt(r0)
            r1 = 76
            if (r0 != r1) goto L6a
            int r0 = r10.length()
            int r0 = r0 - r3
            char r0 = r10.charAt(r0)
            r1 = 59
            if (r0 != r1) goto L6a
            int r0 = r10.length()
            int r0 = r0 - r3
            java.lang.String r4 = r10.substring(r3, r0)
            java.lang.String r0 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            r8 = 4
            r9 = 0
            r5 = 47
            r6 = 46
            r7 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r4, r5, r6, r7, r8, r9)
            return r0
        L6a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown class sign: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getTypeSign(java.lang.Class<?> r7) {
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r7.isPrimitive()
            if (r0 == 0) goto L88
        Lc:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L17
            java.lang.String r0 = "Z"
            goto L6e
        L17:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L22
            java.lang.String r0 = "B"
            goto L6e
        L22:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L2d
            java.lang.String r0 = "C"
            goto L6e
        L2d:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L38
            java.lang.String r0 = "S"
            goto L6e
        L38:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L43
            java.lang.String r0 = "I"
            goto L6e
        L43:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L4e
            java.lang.String r0 = "F"
            goto L6e
        L4e:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L59
            java.lang.String r0 = "J"
            goto L6e
        L59:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L64
            java.lang.String r0 = "D"
            goto L6e
        L64:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            if (r0 == 0) goto L6f
            java.lang.String r0 = "V"
        L6e:
            return r0
        L6f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown primitive type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L88:
            boolean r0 = r7.isArray()
            if (r0 == 0) goto Lad
            java.lang.Class r0 = r7.getComponentType()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r0 = getTypeSign(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            goto Lda
        Lad:
            java.lang.String r1 = r7.getName()
            java.lang.String r0 = "type.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            r5 = 4
            r6 = 0
            r2 = 46
            r3 = 47
            r4 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "L"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ";"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        Lda:
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getTypeSign(java.lang.String r7) {
            java.lang.String r0 = "typeName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            java.lang.String r1 = "[]"
            r2 = 0
            r3 = 2
            boolean r0 = kotlin.text.StringsKt.endsWith$default(r7, r1, r2, r3, r0)
            if (r0 == 0) goto L36
            int r0 = r7.length()
            int r0 = r0 - r3
            java.lang.String r0 = r7.substring(r2, r0)
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = getTypeSign(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            return r0
        L36:
            java.util.Map<java.lang.String, java.lang.String> r0 = org.luckypray.dexkit.util.DexSignUtil.primitiveMap
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L65
            r5 = 4
            r6 = 0
            r2 = 46
            r3 = 47
            r4 = 0
            r1 = r7
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "L"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ";"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L65:
            return r0
    }

    @kotlin.jvm.JvmStatic
    private static final java.lang.String primitiveTypeName(java.lang.String r3) {
            java.util.Map<java.lang.String, java.lang.String> r0 = org.luckypray.dexkit.util.DexSignUtil.primitiveTypeNameMap
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown primitive typeSign: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
