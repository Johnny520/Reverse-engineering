package org.luckypray.dexkit.util;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DexSignUtil {
    public static final org.luckypray.dexkit.util.DexSignUtil INSTANCE = null;
    private static final java.util.Map<java.lang.String, java.lang.String> primitiveMap = null;
    private static final java.util.Map<java.lang.String, java.lang.String> primitiveTypeNameMap = null;

    static {
            org.luckypray.dexkit.util.DexSignUtil r0 = new org.luckypray.dexkit.util.DexSignUtil
            r0.<init>()
            org.luckypray.dexkit.util.DexSignUtil.INSTANCE = r0
            l91 r1 = new l91
            java.lang.String r0 = "boolean"
            java.lang.String r10 = "Z"
            r1.<init>(r0, r10)
            l91 r2 = new l91
            java.lang.String r11 = "byte"
            java.lang.String r12 = "B"
            r2.<init>(r11, r12)
            l91 r3 = new l91
            java.lang.String r13 = "char"
            java.lang.String r14 = "C"
            r3.<init>(r13, r14)
            l91 r4 = new l91
            java.lang.String r15 = "short"
            java.lang.String r5 = "S"
            r4.<init>(r15, r5)
            r6 = r5
            l91 r5 = new l91
            java.lang.String r7 = "int"
            java.lang.String r8 = "I"
            r5.<init>(r7, r8)
            r9 = r6
            l91 r6 = new l91
            r16 = r15
            java.lang.String r15 = "float"
            r17 = r13
            java.lang.String r13 = "F"
            r6.<init>(r15, r13)
            r18 = r7
            l91 r7 = new l91
            r19 = r13
            java.lang.String r13 = "long"
            r20 = r15
            java.lang.String r15 = "J"
            r7.<init>(r13, r15)
            r21 = r8
            l91 r8 = new l91
            r22 = r13
            java.lang.String r13 = "double"
            r23 = r15
            java.lang.String r15 = "D"
            r8.<init>(r13, r15)
            r24 = r9
            l91 r9 = new l91
            r25 = r13
            java.lang.String r13 = "void"
            r26 = r15
            java.lang.String r15 = "V"
            r9.<init>(r13, r15)
            r27 = r18
            r18 = r15
            r15 = r27
            r27 = r13
            r28 = r21
            r13 = r24
            l91[] r1 = new p000.l91[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r3 = 9
            int r3 = p000.ex0.m1970(r3)
            r2.<init>(r3)
            p000.ex0.m1973(r2, r1)
            org.luckypray.dexkit.util.DexSignUtil.primitiveMap = r2
            l91 r1 = new l91
            r1.<init>(r10, r0)
            l91 r0 = new l91
            r0.<init>(r12, r11)
            l91 r2 = new l91
            r4 = r17
            r2.<init>(r14, r4)
            l91 r4 = new l91
            r5 = r16
            r4.<init>(r13, r5)
            l91 r5 = new l91
            r6 = r28
            r5.<init>(r6, r15)
            l91 r6 = new l91
            r8 = r19
            r7 = r20
            r6.<init>(r8, r7)
            l91 r7 = new l91
            r8 = r22
            r9 = r23
            r7.<init>(r9, r8)
            l91 r8 = new l91
            r9 = r25
            r10 = r26
            r8.<init>(r10, r9)
            l91 r9 = new l91
            r11 = r18
            r10 = r27
            r9.<init>(r11, r10)
            r30 = r0
            r29 = r1
            r31 = r2
            r32 = r4
            r33 = r5
            r34 = r6
            r35 = r7
            r36 = r8
            r37 = r9
            l91[] r0 = new p000.l91[]{r29, r30, r31, r32, r33, r34, r35, r36, r37}
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r3)
            p000.ex0.m1973(r1, r0)
            org.luckypray.dexkit.util.DexSignUtil.primitiveTypeNameMap = r1
            return
    }

    private DexSignUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.String getClassDescriptor(java.lang.Class<?> r0) {
            r0.getClass()
            java.lang.String r0 = getDescriptor(r0)
            return r0
    }

    public static final java.lang.String getConstructorSign(java.lang.reflect.Constructor<?> r5) {
            r5.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            org.luckypray.dexkit.util.DexSignUtil$getConstructorSign$1$1 r1 = org.luckypray.dexkit.util.DexSignUtil$getConstructorSign$1$1.INSTANCE
            r2 = 30
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = p000.AbstractC0312g7.m2256(r5, r3, r4, r1, r2)
            java.lang.String r1 = ")V"
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }

    public static final java.lang.String getDescriptor(java.lang.Class<?> r0) {
            r0.getClass()
            java.lang.String r0 = getTypeSign(r0)
            return r0
    }

    public static final java.lang.String getDescriptor(java.lang.reflect.Constructor<?> r2) {
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getDeclaringClass()
            r1.getClass()
            java.lang.String r1 = getTypeSign(r1)
            r0.append(r1)
            java.lang.String r1 = "-><init>"
            r0.append(r1)
            java.lang.String r2 = getConstructorSign(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static final java.lang.String getDescriptor(java.lang.reflect.Field r2) {
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getDeclaringClass()
            r1.getClass()
            java.lang.String r1 = getTypeSign(r1)
            r0.append(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.Class r2 = r2.getType()
            r2.getClass()
            java.lang.String r2 = getTypeSign(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static final java.lang.String getDescriptor(java.lang.reflect.Method r2) {
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getDeclaringClass()
            r1.getClass()
            java.lang.String r1 = getTypeSign(r1)
            r0.append(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r2 = getMethodSign(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static final java.lang.String getFieldDescriptor(java.lang.reflect.Field r0) {
            r0.getClass()
            java.lang.String r0 = getDescriptor(r0)
            return r0
    }

    public static final java.lang.String getMethodDescriptor(java.lang.reflect.Constructor<?> r0) {
            r0.getClass()
            java.lang.String r0 = getDescriptor(r0)
            return r0
    }

    public static final java.lang.String getMethodDescriptor(java.lang.reflect.Method r0) {
            r0.getClass()
            java.lang.String r0 = getDescriptor(r0)
            return r0
    }

    public static final java.lang.String getMethodSign(java.lang.reflect.Method r6) {
            r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Class[] r1 = r6.getParameterTypes()
            r1.getClass()
            org.luckypray.dexkit.util.DexSignUtil$getMethodSign$1$1 r2 = org.luckypray.dexkit.util.DexSignUtil$getMethodSign$1$1.INSTANCE
            r3 = 30
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.Class r6 = r6.getReturnType()
            r6.getClass()
            java.lang.String r6 = getTypeSign(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static final java.util.List<java.lang.String> getParamTypeNames(java.lang.String r5) {
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L9:
            r2 = r1
        La:
            int r3 = r5.length()
            if (r1 >= r3) goto L34
            char r3 = r5.charAt(r1)
            r4 = 91
            if (r3 != r4) goto L1b
            int r1 = r1 + 1
            goto La
        L1b:
            r4 = 76
            if (r3 != r4) goto L26
            r3 = 59
            r4 = 4
            int r1 = p000.q02.m4668(r5, r3, r1, r4)
        L26:
            int r1 = r1 + 1
            java.lang.String r2 = r5.substring(r2, r1)
            java.lang.String r2 = getTypeName(r2)
            r0.add(r2)
            goto L9
        L34:
            if (r2 != r1) goto L37
            return r0
        L37:
            java.lang.String r0 = "Unknown signString: "
            java.lang.String r5 = r0.concat(r5)
            p000.C1080.m7279(r5)
            r5 = 0
            return r5
    }

    public static final java.lang.String getTypeName(java.lang.Class<?> r1) {
            r1.getClass()
            boolean r0 = r1.isArray()
            if (r0 == 0) goto L1b
            java.lang.Class r1 = r1.getComponentType()
            r1.getClass()
            java.lang.String r1 = getTypeName(r1)
            java.lang.String r0 = "[]"
            java.lang.String r1 = p000.AbstractC0602nx.m4129(r1, r0)
            return r1
        L1b:
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L8b
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            java.lang.String r1 = "boolean"
            return r1
        L2c:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L37
            java.lang.String r1 = "byte"
            return r1
        L37:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L42
            java.lang.String r1 = "char"
            return r1
        L42:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4d
            java.lang.String r1 = "short"
            return r1
        L4d:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
            java.lang.String r1 = "int"
            return r1
        L58:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L63
            java.lang.String r1 = "float"
            return r1
        L63:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6e
            java.lang.String r1 = "long"
            return r1
        L6e:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L79
            java.lang.String r1 = "double"
            return r1
        L79:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L84
            java.lang.String r1 = "void"
            return r1
        L84:
            java.lang.String r0 = "Unknown primitive type: "
            p000.C1080.m7268(r1, r0)
            r1 = 0
            return r1
        L8b:
            java.lang.String r1 = r1.getName()
            return r1
    }

    public static final java.lang.String getTypeName(java.lang.String r4) {
            r4.getClass()
            r0 = 0
            char r1 = r4.charAt(r0)
            r2 = 91
            r3 = 1
            if (r1 != r2) goto L1c
            java.lang.String r4 = r4.substring(r3)
            java.lang.String r4 = getTypeName(r4)
            java.lang.String r0 = "[]"
            java.lang.String r4 = p000.AbstractC0602nx.m4129(r4, r0)
            return r4
        L1c:
            int r1 = r4.length()
            if (r1 != r3) goto L27
            java.lang.String r4 = primitiveTypeName(r4)
            return r4
        L27:
            char r0 = r4.charAt(r0)
            r1 = 76
            if (r0 != r1) goto L51
            int r0 = r4.length()
            int r0 = r0 - r3
            char r0 = r4.charAt(r0)
            r1 = 59
            if (r0 != r1) goto L51
            int r0 = r4.length()
            int r0 = r0 - r3
            java.lang.String r4 = r4.substring(r3, r0)
            r0 = 47
            r1 = 46
            java.lang.String r4 = r4.replace(r0, r1)
            r4.getClass()
            return r4
        L51:
            java.lang.String r0 = "Unknown class sign: "
            java.lang.String r4 = r0.concat(r4)
            p000.C1080.m7279(r4)
            r4 = 0
            return r4
    }

    public static final java.lang.String getTypeSign(java.lang.Class<?> r2) {
            r2.getClass()
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L73
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            java.lang.String r2 = "Z"
            return r2
        L14:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r2 = "B"
            return r2
        L1f:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2a
            java.lang.String r2 = "C"
            return r2
        L2a:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L35
            java.lang.String r2 = "S"
            return r2
        L35:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L40
            java.lang.String r2 = "I"
            return r2
        L40:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4b
            java.lang.String r2 = "F"
            return r2
        L4b:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L56
            java.lang.String r2 = "J"
            return r2
        L56:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L61
            java.lang.String r2 = "D"
            return r2
        L61:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6c
            java.lang.String r2 = "V"
            return r2
        L6c:
            java.lang.String r0 = "Unknown primitive type: "
            p000.C1080.m7268(r2, r0)
            r2 = 0
            return r2
        L73:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L8b
            java.lang.Class r2 = r2.getComponentType()
            r2.getClass()
            java.lang.String r2 = getTypeSign(r2)
            java.lang.String r0 = "["
            java.lang.String r2 = p000.lz1.m3687(r0, r2)
            return r2
        L8b:
            java.lang.String r2 = r2.getName()
            r0 = 46
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            java.lang.String r0 = "L"
            java.lang.String r1 = ";"
            java.lang.String r2 = p000.lz1.m3674(r0, r2, r1)
            return r2
    }

    public static final java.lang.String getTypeSign(java.lang.String r2) {
            r2.getClass()
            java.lang.String r0 = "[]"
            r1 = 0
            boolean r0 = p000.x02.m6479(r2, r0, r1)
            if (r0 == 0) goto L21
            int r0 = r2.length()
            int r0 = r0 + (-2)
            java.lang.String r2 = r2.substring(r1, r0)
            java.lang.String r2 = getTypeSign(r2)
            java.lang.String r0 = "["
            java.lang.String r2 = p000.lz1.m3687(r0, r2)
            return r2
        L21:
            java.util.Map<java.lang.String, java.lang.String> r0 = org.luckypray.dexkit.util.DexSignUtil.primitiveMap
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L4a
            r0 = 46
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "L"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = ";"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L4a:
            return r0
    }

    private static final java.lang.String primitiveTypeName(java.lang.String r1) {
            java.util.Map<java.lang.String, java.lang.String> r0 = org.luckypray.dexkit.util.DexSignUtil.primitiveTypeNameMap
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "Unknown primitive typeSign: "
            java.lang.String r1 = p000.lz1.m3687(r0, r1)
            p000.C1080.m7275(r1)
            r1 = 0
            return r1
    }
}
