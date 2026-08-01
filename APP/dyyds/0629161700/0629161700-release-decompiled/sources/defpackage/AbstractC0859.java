package defpackage;

/* JADX INFO: renamed from: ᛵᛳᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0859 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.LinkedHashMap f3913 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.LinkedHashMap f3914 = null;

    static {
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.String r9 = "boolean"
            java.lang.String r10 = "Z"
            r0.<init>(r9, r10)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r11 = "byte"
            java.lang.String r12 = "B"
            r1.<init>(r11, r12)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r13 = "char"
            java.lang.String r14 = "C"
            r2.<init>(r13, r14)
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r15 = "short"
            java.lang.String r4 = "S"
            r3.<init>(r15, r4)
            r5 = r4
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r6 = "int"
            java.lang.String r7 = "I"
            r4.<init>(r6, r7)
            r8 = r5
            kotlin.Pair r5 = new kotlin.Pair
            r16 = r15
            java.lang.String r15 = "float"
            r17 = r13
            java.lang.String r13 = "F"
            r5.<init>(r15, r13)
            r18 = r6
            kotlin.Pair r6 = new kotlin.Pair
            r19 = r13
            java.lang.String r13 = "long"
            r20 = r15
            java.lang.String r15 = "J"
            r6.<init>(r13, r15)
            r21 = r7
            kotlin.Pair r7 = new kotlin.Pair
            r22 = r13
            java.lang.String r13 = "double"
            r23 = r15
            java.lang.String r15 = "D"
            r7.<init>(r13, r15)
            r24 = r8
            kotlin.Pair r8 = new kotlin.Pair
            r25 = r13
            java.lang.String r13 = "void"
            r26 = r15
            java.lang.String r15 = "V"
            r8.<init>(r13, r15)
            r27 = r18
            r18 = r15
            r15 = r27
            r27 = r13
            r28 = r21
            r13 = r24
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = 9
            int r2 = defpackage.AbstractC1893.m3323(r2)
            r1.<init>(r2)
            defpackage.AbstractC1893.m3325(r1, r0)
            defpackage.AbstractC0859.f3913 = r1
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r10, r9)
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r12, r11)
            kotlin.Pair r3 = new kotlin.Pair
            r4 = r17
            r3.<init>(r14, r4)
            kotlin.Pair r4 = new kotlin.Pair
            r5 = r16
            r4.<init>(r13, r5)
            kotlin.Pair r5 = new kotlin.Pair
            r6 = r28
            r5.<init>(r6, r15)
            kotlin.Pair r6 = new kotlin.Pair
            r8 = r19
            r7 = r20
            r6.<init>(r8, r7)
            kotlin.Pair r7 = new kotlin.Pair
            r8 = r22
            r9 = r23
            r7.<init>(r9, r8)
            kotlin.Pair r8 = new kotlin.Pair
            r9 = r25
            r10 = r26
            r8.<init>(r10, r9)
            kotlin.Pair r9 = new kotlin.Pair
            r11 = r18
            r10 = r27
            r9.<init>(r11, r10)
            r29 = r0
            r30 = r1
            r31 = r3
            r32 = r4
            r33 = r5
            r34 = r6
            r35 = r7
            r36 = r8
            r37 = r9
            kotlin.Pair[] r0 = new kotlin.Pair[]{r29, r30, r31, r32, r33, r34, r35, r36, r37}
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r2)
            defpackage.AbstractC1893.m3325(r1, r0)
            defpackage.AbstractC0859.f3914 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.lang.String m1817(java.lang.String r3) {
            java.lang.String r0 = "[]"
            r1 = 0
            boolean r0 = defpackage.AbstractC0651.m1483(r3, r0, r1)
            if (r0 == 0) goto L1e
            int r0 = r3.length()
            int r0 = r0 + (-2)
            java.lang.String r3 = r3.substring(r1, r0)
            java.lang.String r3 = m1817(r3)
            java.lang.String r0 = "["
            java.lang.String r3 = r0.concat(r3)
            return r3
        L1e:
            java.util.LinkedHashMap r0 = defpackage.AbstractC0859.f3913
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "L"
            r0.<init>(r1)
            r1 = 46
            r2 = 47
            java.lang.String r3 = r3.replace(r1, r2)
            r0.append(r3)
            r3 = 59
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L44:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.lang.String m1818(java.lang.Class r3) {
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto L70
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L11
            java.lang.String r3 = "Z"
            return r3
        L11:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1c
            java.lang.String r3 = "B"
            return r3
        L1c:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L27
            java.lang.String r3 = "C"
            return r3
        L27:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L32
            java.lang.String r3 = "S"
            return r3
        L32:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L3d
            java.lang.String r3 = "I"
            return r3
        L3d:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L48
            java.lang.String r3 = "F"
            return r3
        L48:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L53
            java.lang.String r3 = "J"
            return r3
        L53:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5e
            java.lang.String r3 = "D"
            return r3
        L5e:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L69
            java.lang.String r3 = "V"
            return r3
        L69:
            java.lang.String r0 = "Unknown primitive type: "
            defpackage.C2264.m3671(r3, r0)
            r3 = 0
            return r3
        L70:
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L85
            java.lang.Class r3 = r3.getComponentType()
            java.lang.String r3 = m1818(r3)
            java.lang.String r0 = "["
            java.lang.String r3 = r0.concat(r3)
            return r3
        L85:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "L"
            r0.<init>(r1)
            java.lang.String r3 = r3.getName()
            r1 = 46
            r2 = 47
            java.lang.String r3 = r3.replace(r1, r2)
            r0.append(r3)
            r3 = 59
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.String m1819(java.lang.reflect.Method r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Class[] r1 = r4.getParameterTypes()
            ᛷᛸᛶᲁ r2 = new ᛷᛸᛶᲁ
            r3 = 15
            r2.<init>(r3)
            java.lang.String r1 = defpackage.AbstractC2315.m3769(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.Class r4 = r4.getReturnType()
            java.lang.String r4 = m1818(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.lang.String m1820(java.lang.String r4) {
            r0 = 0
            char r1 = r4.charAt(r0)
            r2 = 91
            r3 = 1
            if (r1 != r2) goto L19
            java.lang.String r4 = r4.substring(r3)
            java.lang.String r4 = m1820(r4)
            java.lang.String r0 = "[]"
            java.lang.String r4 = r4.concat(r0)
            return r4
        L19:
            int r1 = r4.length()
            r2 = 0
            if (r1 != r3) goto L35
            java.util.LinkedHashMap r0 = defpackage.AbstractC0859.f3914
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L2b
            return r0
        L2b:
            java.lang.String r0 = "Unknown primitive typeSign: "
            java.lang.String r4 = r0.concat(r4)
            defpackage.C2264.m3684(r4)
            return r2
        L35:
            char r0 = r4.charAt(r0)
            r1 = 76
            if (r0 != r1) goto L5c
            int r0 = r4.length()
            int r0 = r0 - r3
            char r0 = r4.charAt(r0)
            r1 = 59
            if (r0 != r1) goto L5c
            int r0 = r4.length()
            int r0 = r0 - r3
            java.lang.String r4 = r4.substring(r3, r0)
            r0 = 47
            r1 = 46
            java.lang.String r4 = r4.replace(r0, r1)
            return r4
        L5c:
            java.lang.String r0 = "Unknown class sign: "
            java.lang.String r4 = r0.concat(r4)
            defpackage.C2264.m3676(r4)
            return r2
    }
}
