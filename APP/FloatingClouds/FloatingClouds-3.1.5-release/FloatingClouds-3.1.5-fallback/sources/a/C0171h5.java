package a;

/* JADX INFO: renamed from: a.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0171h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedHashMap f493a = null;
    public static final java.util.LinkedHashMap b = null;

    static {
            a.mc r0 = new a.mc
            java.lang.String r9 = "boolean"
            java.lang.String r10 = "Z"
            r0.<init>(r9, r10)
            a.mc r1 = new a.mc
            java.lang.String r11 = "byte"
            java.lang.String r12 = "B"
            r1.<init>(r11, r12)
            a.mc r2 = new a.mc
            java.lang.String r13 = "char"
            java.lang.String r14 = "C"
            r2.<init>(r13, r14)
            a.mc r3 = new a.mc
            java.lang.String r15 = "short"
            java.lang.String r4 = "S"
            r3.<init>(r15, r4)
            r5 = r4
            a.mc r4 = new a.mc
            java.lang.String r6 = "int"
            java.lang.String r7 = "I"
            r4.<init>(r6, r7)
            r8 = r5
            a.mc r5 = new a.mc
            r16 = r15
            java.lang.String r15 = "float"
            r17 = r13
            java.lang.String r13 = "F"
            r5.<init>(r15, r13)
            r18 = r6
            a.mc r6 = new a.mc
            r19 = r13
            java.lang.String r13 = "long"
            r20 = r15
            java.lang.String r15 = "J"
            r6.<init>(r13, r15)
            r21 = r7
            a.mc r7 = new a.mc
            r22 = r13
            java.lang.String r13 = "double"
            r23 = r15
            java.lang.String r15 = "D"
            r7.<init>(r13, r15)
            r24 = r8
            a.mc r8 = new a.mc
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
            a.mc[] r0 = new a.C0267mc[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = 9
            int r3 = a.C0048aa.C(r2)
            r1.<init>(r3)
            a.C0067ba.F(r1, r0)
            a.C0171h5.f493a = r1
            a.mc r0 = new a.mc
            r0.<init>(r10, r9)
            a.mc r1 = new a.mc
            r1.<init>(r12, r11)
            a.mc r3 = new a.mc
            r4 = r17
            r3.<init>(r14, r4)
            a.mc r4 = new a.mc
            r5 = r16
            r4.<init>(r13, r5)
            a.mc r5 = new a.mc
            r6 = r28
            r5.<init>(r6, r15)
            a.mc r6 = new a.mc
            r8 = r19
            r7 = r20
            r6.<init>(r8, r7)
            a.mc r7 = new a.mc
            r8 = r22
            r9 = r23
            r7.<init>(r9, r8)
            a.mc r8 = new a.mc
            r9 = r25
            r10 = r26
            r8.<init>(r10, r9)
            a.mc r9 = new a.mc
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
            a.mc[] r0 = new a.C0267mc[]{r29, r30, r31, r32, r33, r34, r35, r36, r37}
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            int r2 = a.C0048aa.C(r2)
            r1.<init>(r2)
            a.C0067ba.F(r1, r0)
            a.C0171h5.b = r1
            return
    }

    public static final java.lang.String a(java.lang.String r4) {
            java.lang.String r0 = "typeSign"
            a.C0193i9.e(r4, r0)
            r0 = 0
            char r1 = r4.charAt(r0)
            r2 = 91
            r3 = 1
            if (r1 != r2) goto L23
            java.lang.String r4 = r4.substring(r3)
            java.lang.String r0 = "(this as java.lang.String).substring(startIndex)"
            a.C0193i9.d(r4, r0)
            java.lang.String r4 = a(r4)
            java.lang.String r0 = "[]"
            java.lang.String r4 = a.C0487z.f(r4, r0)
            return r4
        L23:
            int r1 = r4.length()
            if (r1 != r3) goto L40
            java.util.LinkedHashMap r0 = a.C0171h5.b
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L34
            return r0
        L34:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown primitive typeSign: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        L40:
            char r0 = r4.charAt(r0)
            r1 = 76
            if (r0 != r1) goto L6c
            int r0 = r4.length()
            int r0 = r0 - r3
            char r0 = r4.charAt(r0)
            r1 = 59
            if (r0 != r1) goto L6c
            int r0 = r4.length()
            int r0 = r0 - r3
            java.lang.String r4 = r4.substring(r3, r0)
            java.lang.String r0 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            a.C0193i9.d(r4, r0)
            r0 = 47
            r1 = 46
            java.lang.String r4 = a.Ae.F(r4, r0, r1)
            return r4
        L6c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown class sign: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    public static final java.lang.String b(java.lang.String r2) {
            java.lang.String r0 = "typeName"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "[]"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L28
            int r0 = r2.length()
            int r0 = r0 + (-2)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            java.lang.String r0 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            a.C0193i9.d(r2, r0)
            java.lang.String r2 = b(r2)
            java.lang.String r0 = "["
            java.lang.String r2 = a.C0487z.k(r0, r2)
            return r2
        L28:
            java.util.LinkedHashMap r0 = a.C0171h5.f493a
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L43
            r0 = 46
            r1 = 47
            java.lang.String r2 = a.Ae.F(r2, r0, r1)
            java.lang.String r0 = "L"
            java.lang.String r1 = ";"
            java.lang.String r2 = a.C0487z.g(r0, r2, r1)
            return r2
        L43:
            return r0
    }
}
