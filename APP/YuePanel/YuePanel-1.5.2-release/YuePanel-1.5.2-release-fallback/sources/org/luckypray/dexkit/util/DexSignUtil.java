package org.luckypray.dexkit.util;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0014\u0010\n\u001a\u00020\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J\u0014\u0010\r\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0014\u0010\r\u001a\u00020\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0014\u0010\u0013\u001a\u00020\u00052\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0007J\u0014\u0010\u0018\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0007J\u0014\u0010\u001a\u001a\u00020\u00052\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\tH\u0007J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0007J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0003R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lorg/luckypray/dexkit/util/DexSignUtil;", "", "()V", "primitiveMap", "", "", "primitiveTypeNameMap", "getClassDescriptor", "clazz", "Ljava/lang/Class;", "getConstructorSign", "constructor", "Ljava/lang/reflect/Constructor;", "getDescriptor", "field", "Ljava/lang/reflect/Field;", "method", "Ljava/lang/reflect/Method;", "getFieldDescriptor", "getMethodDescriptor", "getMethodSign", "getParamTypeNames", "", "paramSigns", "getTypeName", "typeSign", "getTypeSign", "type", "typeName", "primitiveTypeName", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DexSignUtil {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.util.DexSignUtil INSTANCE = null;

    @Yue.InterfaceC4418
    private static final java.util.Map<java.lang.String, java.lang.String> primitiveMap = null;

    @Yue.InterfaceC4418
    private static final java.util.Map<java.lang.String, java.lang.String> primitiveTypeNameMap = null;

    static {
            org.luckypray.dexkit.util.DexSignUtil r0 = new org.luckypray.dexkit.util.DexSignUtil
            r0.<init>()
            org.luckypray.dexkit.util.DexSignUtil.INSTANCE = r0
            java.lang.String r0 = "boolean"
            java.lang.String r1 = "Z"
            Yue.ۥۣۡۦ۠ r2 = Yue.C6456.m23777(r0, r1)
            java.lang.String r11 = "byte"
            java.lang.String r12 = "B"
            Yue.ۥۣۡۦ۠ r3 = Yue.C6456.m23777(r11, r12)
            java.lang.String r13 = "char"
            java.lang.String r14 = "C"
            Yue.ۥۣۡۦ۠ r4 = Yue.C6456.m23777(r13, r14)
            java.lang.String r15 = "short"
            java.lang.String r10 = "S"
            Yue.ۥۣۡۦ۠ r5 = Yue.C6456.m23777(r15, r10)
            java.lang.String r9 = "int"
            java.lang.String r8 = "I"
            Yue.ۥۣۡۦ۠ r6 = Yue.C6456.m23777(r9, r8)
            java.lang.String r7 = "float"
            r16 = r15
            java.lang.String r15 = "F"
            Yue.ۥۣۡۦ۠ r17 = Yue.C6456.m23777(r7, r15)
            r18 = r15
            java.lang.String r15 = "long"
            r19 = r13
            java.lang.String r13 = "J"
            Yue.ۥۣۡۦ۠ r20 = Yue.C6456.m23777(r15, r13)
            r21 = r13
            java.lang.String r13 = "double"
            r22 = r15
            java.lang.String r15 = "D"
            Yue.ۥۣۡۦ۠ r23 = Yue.C6456.m23777(r13, r15)
            r24 = r13
            java.lang.String r13 = "void"
            r25 = r15
            java.lang.String r15 = "V"
            Yue.ۥۣۡۦ۠ r26 = Yue.C6456.m23777(r13, r15)
            r27 = r13
            r13 = r7
            r7 = r17
            r17 = r15
            r15 = r8
            r8 = r20
            r20 = r13
            r13 = r9
            r9 = r23
            r23 = r13
            r13 = r10
            r10 = r26
            Yue.ۥۣۡۦ۠[] r2 = new Yue.C4677[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.Map r2 = Yue.C3901.m15774(r2)
            org.luckypray.dexkit.util.DexSignUtil.primitiveMap = r2
            Yue.ۥۣۡۦ۠ r28 = Yue.C6456.m23777(r1, r0)
            Yue.ۥۣۡۦ۠ r29 = Yue.C6456.m23777(r12, r11)
            r0 = r19
            Yue.ۥۣۡۦ۠ r30 = Yue.C6456.m23777(r14, r0)
            r0 = r16
            Yue.ۥۣۡۦ۠ r31 = Yue.C6456.m23777(r13, r0)
            r0 = r23
            Yue.ۥۣۡۦ۠ r32 = Yue.C6456.m23777(r15, r0)
            r1 = r18
            r0 = r20
            Yue.ۥۣۡۦ۠ r33 = Yue.C6456.m23777(r1, r0)
            r1 = r21
            r0 = r22
            Yue.ۥۣۡۦ۠ r34 = Yue.C6456.m23777(r1, r0)
            r0 = r24
            r1 = r25
            Yue.ۥۣۡۦ۠ r35 = Yue.C6456.m23777(r1, r0)
            r1 = r17
            r0 = r27
            Yue.ۥۣۡۦ۠ r36 = Yue.C6456.m23777(r1, r0)
            Yue.ۥۣۡۦ۠[] r0 = new Yue.C4677[]{r28, r29, r30, r31, r32, r33, r34, r35, r36}
            java.util.Map r0 = Yue.C3901.m15774(r0)
            org.luckypray.dexkit.util.DexSignUtil.primitiveTypeNameMap = r0
            return
    }

    private DexSignUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getClassDescriptor(@Yue.InterfaceC4418 java.lang.Class<?> r1) {
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = getDescriptor(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getConstructorSign(@Yue.InterfaceC4418 java.lang.reflect.Constructor<?> r11) {
            java.lang.String r0 = "constructor"
            Yue.C3329.m13906(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.Class[] r2 = r11.getParameterTypes()
            java.lang.String r11 = "constructor.parameterTypes"
            Yue.C3329.m13905(r2, r11)
            org.luckypray.dexkit.util.DexSignUtil$getConstructorSign$1$1 r8 = org.luckypray.dexkit.util.DexSignUtil$getConstructorSign$1$1.INSTANCE
            r9 = 30
            r10 = 0
            java.lang.String r3 = ""
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r11 = Yue.C0595.m3076(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.append(r11)
            java.lang.String r11 = ")V"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r11, r0)
            return r11
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getDescriptor(@Yue.InterfaceC4418 java.lang.Class<?> r1) {
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = getTypeSign(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getDescriptor(@Yue.InterfaceC4418 java.lang.reflect.Constructor<?> r3) {
            java.lang.String r0 = "constructor"
            Yue.C3329.m13906(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getDeclaringClass()
            java.lang.String r2 = "constructor.declaringClass"
            Yue.C3329.m13905(r1, r2)
            java.lang.String r1 = getTypeSign(r1)
            r0.append(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = "<init>"
            r0.append(r1)
            java.lang.String r3 = getConstructorSign(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r3, r0)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getDescriptor(@Yue.InterfaceC4418 java.lang.reflect.Field r3) {
            java.lang.String r0 = "field"
            Yue.C3329.m13906(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getDeclaringClass()
            java.lang.String r2 = "field.declaringClass"
            Yue.C3329.m13905(r1, r2)
            java.lang.String r1 = getTypeSign(r1)
            r0.append(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r3.getName()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.Class r3 = r3.getType()
            java.lang.String r1 = "field.type"
            Yue.C3329.m13905(r3, r1)
            java.lang.String r3 = getTypeSign(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r3, r0)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getDescriptor(@Yue.InterfaceC4418 java.lang.reflect.Method r3) {
            java.lang.String r0 = "method"
            Yue.C3329.m13906(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getDeclaringClass()
            java.lang.String r2 = "method.declaringClass"
            Yue.C3329.m13905(r1, r2)
            java.lang.String r1 = getTypeSign(r1)
            r0.append(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r3.getName()
            r0.append(r1)
            java.lang.String r3 = getMethodSign(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r3, r0)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getFieldDescriptor(@Yue.InterfaceC4418 java.lang.reflect.Field r1) {
            java.lang.String r0 = "field"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = getDescriptor(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getMethodDescriptor(@Yue.InterfaceC4418 java.lang.reflect.Constructor<?> r1) {
            java.lang.String r0 = "constructor"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = getDescriptor(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getMethodDescriptor(@Yue.InterfaceC4418 java.lang.reflect.Method r1) {
            java.lang.String r0 = "method"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = getDescriptor(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getMethodSign(@Yue.InterfaceC4418 java.lang.reflect.Method r11) {
            java.lang.String r0 = "method"
            Yue.C3329.m13906(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.Class[] r2 = r11.getParameterTypes()
            java.lang.String r1 = "method.parameterTypes"
            Yue.C3329.m13905(r2, r1)
            org.luckypray.dexkit.util.DexSignUtil$getMethodSign$1$1 r8 = org.luckypray.dexkit.util.DexSignUtil$getMethodSign$1$1.INSTANCE
            r9 = 30
            r10 = 0
            java.lang.String r3 = ""
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r1 = Yue.C0595.m3076(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.Class r11 = r11.getReturnType()
            java.lang.String r1 = "method.returnType"
            Yue.C3329.m13905(r11, r1)
            java.lang.String r11 = getTypeSign(r11)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r11, r0)
            return r11
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.util.List<java.lang.String> getParamTypeNames(@Yue.InterfaceC4418 java.lang.String r8) {
            java.lang.String r0 = "paramSigns"
            Yue.C3329.m13906(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r4 = r1
        Lc:
            int r2 = r8.length()
            if (r4 >= r2) goto L3f
            char r2 = r8.charAt(r4)
            r3 = 91
            if (r2 != r3) goto L1d
            int r4 = r4 + 1
            goto Lc
        L1d:
            r3 = 76
            if (r2 != r3) goto L2b
            r6 = 4
            r7 = 0
            r3 = 59
            r5 = 0
            r2 = r8
            int r4 = Yue.C5989.m22363(r2, r3, r4, r5, r6, r7)
        L2b:
            int r4 = r4 + 1
            java.lang.String r1 = r8.substring(r1, r4)
            java.lang.String r2 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r1, r2)
            java.lang.String r1 = getTypeName(r1)
            r0.add(r1)
            r1 = r4
            goto Lc
        L3f:
            if (r1 != r4) goto L42
            return r0
        L42:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown signString: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getTypeName(@Yue.InterfaceC4418 java.lang.Class<?> r3) {
            java.lang.String r0 = "clazz"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L28
            java.lang.Class r3 = r3.getComponentType()
            Yue.C3329.m13903(r3)
            java.lang.String r3 = getTypeName(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "[]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L28:
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto La8
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L39
            java.lang.String r3 = "boolean"
            goto L90
        L39:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L44
            java.lang.String r3 = "byte"
            goto L90
        L44:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L4f
            java.lang.String r3 = "char"
            goto L90
        L4f:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L5a
            java.lang.String r3 = "short"
            goto L90
        L5a:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L65
            java.lang.String r3 = "int"
            goto L90
        L65:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L70
            java.lang.String r3 = "float"
            goto L90
        L70:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L7b
            java.lang.String r3 = "long"
            goto L90
        L7b:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L86
            java.lang.String r3 = "double"
            goto L90
        L86:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L91
            java.lang.String r3 = "void"
        L90:
            return r3
        L91:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown primitive type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        La8:
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "clazz.name"
            Yue.C3329.m13905(r3, r0)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getTypeName(@Yue.InterfaceC4418 java.lang.String r10) {
            java.lang.String r0 = "typeSign"
            Yue.C3329.m13906(r10, r0)
            r0 = 0
            char r1 = r10.charAt(r0)
            r2 = 91
            r3 = 1
            if (r1 != r2) goto L2e
            java.lang.String r10 = r10.substring(r3)
            java.lang.String r0 = "(this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r10, r0)
            java.lang.String r10 = getTypeName(r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = "[]"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
        L2e:
            int r1 = r10.length()
            if (r1 != r3) goto L39
            java.lang.String r10 = primitiveTypeName(r10)
            return r10
        L39:
            char r0 = r10.charAt(r0)
            r1 = 76
            if (r0 != r1) goto L68
            int r0 = r10.length()
            int r0 = r0 - r3
            char r0 = r10.charAt(r0)
            r1 = 59
            if (r0 != r1) goto L68
            int r0 = r10.length()
            int r0 = r0 - r3
            java.lang.String r4 = r10.substring(r3, r0)
            java.lang.String r10 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r4, r10)
            r8 = 4
            r9 = 0
            r5 = 47
            r6 = 46
            r7 = 0
            java.lang.String r10 = Yue.C5988.m22304(r4, r5, r6, r7, r8, r9)
            return r10
        L68:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown class sign: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getTypeSign(@Yue.InterfaceC4418 java.lang.Class<?> r6) {
            java.lang.String r0 = "type"
            Yue.C3329.m13906(r6, r0)
            boolean r0 = r6.isPrimitive()
            if (r0 == 0) goto L85
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = Yue.C3329.m13897(r6, r0)
            if (r0 == 0) goto L16
            java.lang.String r6 = "Z"
            goto L6d
        L16:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = Yue.C3329.m13897(r6, r0)
            if (r0 == 0) goto L21
            java.lang.String r6 = "B"
            goto L6d
        L21:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = Yue.C3329.m13897(r6, r0)
            if (r0 == 0) goto L2c
            java.lang.String r6 = "C"
            goto L6d
        L2c:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = Yue.C3329.m13897(r6, r0)
            if (r0 == 0) goto L37
            java.lang.String r6 = "S"
            goto L6d
        L37:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = Yue.C3329.m13897(r6, r0)
            if (r0 == 0) goto L42
            java.lang.String r6 = "I"
            goto L6d
        L42:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = Yue.C3329.m13897(r6, r0)
            if (r0 == 0) goto L4d
            java.lang.String r6 = "F"
            goto L6d
        L4d:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = Yue.C3329.m13897(r6, r0)
            if (r0 == 0) goto L58
            java.lang.String r6 = "J"
            goto L6d
        L58:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = Yue.C3329.m13897(r6, r0)
            if (r0 == 0) goto L63
            java.lang.String r6 = "D"
            goto L6d
        L63:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = Yue.C3329.m13897(r6, r0)
            if (r0 == 0) goto L6e
            java.lang.String r6 = "V"
        L6d:
            return r6
        L6e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown primitive type: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L85:
            boolean r0 = r6.isArray()
            if (r0 == 0) goto La8
            java.lang.Class r6 = r6.getComponentType()
            Yue.C3329.m13903(r6)
            java.lang.String r6 = getTypeSign(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            goto Ld2
        La8:
            java.lang.String r0 = r6.getName()
            java.lang.String r6 = "type.name"
            Yue.C3329.m13905(r0, r6)
            r4 = 4
            r5 = 0
            r1 = 46
            r2 = 47
            r3 = 0
            java.lang.String r6 = Yue.C5988.m22304(r0, r1, r2, r3, r4, r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "L"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ";"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
        Ld2:
            return r6
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getTypeSign(@Yue.InterfaceC4418 java.lang.String r7) {
            java.lang.String r0 = "typeName"
            Yue.C3329.m13906(r7, r0)
            r0 = 0
            java.lang.String r1 = "[]"
            r2 = 0
            r3 = 2
            boolean r0 = Yue.C5988.m22280(r7, r1, r2, r3, r0)
            if (r0 == 0) goto L34
            int r0 = r7.length()
            int r0 = r0 - r3
            java.lang.String r7 = r7.substring(r2, r0)
            java.lang.String r0 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r7, r0)
            java.lang.String r7 = getTypeSign(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
        L34:
            java.util.Map<java.lang.String, java.lang.String> r0 = org.luckypray.dexkit.util.DexSignUtil.primitiveMap
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L60
            r5 = 4
            r6 = 0
            r2 = 46
            r3 = 47
            r4 = 0
            r1 = r7
            java.lang.String r7 = Yue.C5988.m22304(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "L"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ";"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
        L60:
            return r0
    }

    @Yue.InterfaceC3427
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
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
