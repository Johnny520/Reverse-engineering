package a;

/* JADX INFO: loaded from: classes.dex */
public class Be extends a.Ae {
    public static boolean I(java.lang.CharSequence r8, java.lang.CharSequence r9, boolean r10) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r8, r0)
            java.lang.String r0 = "other"
            a.C0193i9.e(r9, r0)
            boolean r0 = r9 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L19
            java.lang.String r9 = (java.lang.String) r9
            r0 = 2
            int r8 = N(r8, r9, r1, r10, r0)
            if (r8 < 0) goto L2a
            goto L28
        L19:
            int r5 = r8.length()
            r7 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            r6 = r10
            int r8 = M(r2, r3, r4, r5, r6, r7)
            if (r8 < 0) goto L2a
        L28:
            r8 = 1
            return r8
        L2a:
            return r1
    }

    public static boolean J(java.lang.String r2, char r3) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r2, r0)
            r0 = 2
            r1 = 0
            int r2 = O(r2, r3, r1, r0)
            if (r2 < 0) goto Lf
            r2 = 1
            return r2
        Lf:
            return r1
    }

    public static final int K(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            int r1 = r1.length()
            int r1 = r1 + (-1)
            return r1
    }

    public static final int L(java.lang.CharSequence r6, java.lang.String r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r6, r0)
            java.lang.String r0 = "string"
            a.C0193i9.e(r7, r0)
            if (r9 != 0) goto L18
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto L11
            goto L18
        L11:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.indexOf(r7, r8)
            return r6
        L18:
            int r3 = r6.length()
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            int r6 = M(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static final int M(java.lang.CharSequence r10, java.lang.CharSequence r11, int r12, int r13, boolean r14, boolean r15) {
            r0 = -1
            r1 = 0
            if (r15 != 0) goto L15
            a.f9 r15 = new a.f9
            if (r12 >= 0) goto L9
            r12 = r1
        L9:
            int r1 = r10.length()
            if (r13 <= r1) goto L10
            r13 = r1
        L10:
            r1 = 1
            r15.<init>(r12, r13, r1)
            goto L24
        L15:
            int r15 = K(r10)
            if (r12 <= r15) goto L1c
            r12 = r15
        L1c:
            if (r13 >= 0) goto L1f
            r13 = r1
        L1f:
            a.d9 r15 = new a.d9
            r15.<init>(r12, r13, r0)
        L24:
            boolean r12 = r10 instanceof java.lang.String
            int r13 = r15.c
            int r1 = r15.b
            int r15 = r15.f434a
            if (r12 == 0) goto L53
            boolean r12 = r11 instanceof java.lang.String
            if (r12 == 0) goto L53
            if (r13 <= 0) goto L36
            if (r15 <= r1) goto L3a
        L36:
            if (r13 >= 0) goto L73
            if (r1 > r15) goto L73
        L3a:
            r3 = r15
        L3b:
            r5 = r11
            java.lang.String r5 = (java.lang.String) r5
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6
            int r4 = r5.length()
            r2 = 0
            r7 = r14
            boolean r12 = a.Ae.E(r2, r3, r4, r5, r6, r7)
            if (r12 == 0) goto L4e
            return r3
        L4e:
            if (r3 == r1) goto L73
            int r3 = r3 + r13
            r14 = r7
            goto L3b
        L53:
            r7 = r14
            if (r13 <= 0) goto L58
            if (r15 <= r1) goto L5c
        L58:
            if (r13 >= 0) goto L73
            if (r1 > r15) goto L73
        L5c:
            int r8 = r11.length()
            r5 = 0
            r6 = r10
            r4 = r11
            r9 = r7
            r7 = r15
            boolean r10 = R(r4, r5, r6, r7, r8, r9)
            r7 = r9
            if (r10 == 0) goto L6d
            return r15
        L6d:
            if (r15 == r1) goto L73
            int r15 = r15 + r13
            r11 = r4
            r10 = r6
            goto L5c
        L73:
            return r0
    }

    public static /* synthetic */ int N(java.lang.CharSequence r2, java.lang.String r3, int r4, boolean r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = r1
        Lb:
            int r2 = L(r2, r3, r4, r5)
            return r2
    }

    public static int O(java.lang.String r0, char r1, int r2, int r3) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r3 = "<this>"
            a.C0193i9.e(r0, r3)
            int r0 = r0.indexOf(r1, r2)
            return r0
    }

    public static boolean P(java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r4, r0)
            r0 = 0
            r1 = r0
        L7:
            int r2 = r4.length()
            if (r1 >= r2) goto L22
            char r2 = r4.charAt(r1)
            boolean r3 = java.lang.Character.isWhitespace(r2)
            if (r3 != 0) goto L1f
            boolean r2 = java.lang.Character.isSpaceChar(r2)
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            return r0
        L1f:
            int r1 = r1 + 1
            goto L7
        L22:
            r4 = 1
            return r4
    }

    public static int Q(java.lang.String r2, char r3) {
            int r0 = K(r2)
            java.lang.String r1 = "<this>"
            a.C0193i9.e(r2, r1)
            int r2 = r2.lastIndexOf(r3, r0)
            return r2
    }

    public static final boolean R(java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, int r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r4, r0)
            java.lang.String r0 = "other"
            a.C0193i9.e(r6, r0)
            r0 = 0
            if (r7 < 0) goto L39
            if (r5 < 0) goto L39
            int r1 = r4.length()
            int r1 = r1 - r8
            if (r5 > r1) goto L39
            int r1 = r6.length()
            int r1 = r1 - r8
            if (r7 <= r1) goto L1e
            goto L39
        L1e:
            r1 = r0
        L1f:
            if (r1 >= r8) goto L37
            int r2 = r5 + r1
            char r2 = r4.charAt(r2)
            int r3 = r7 + r1
            char r3 = r6.charAt(r3)
            boolean r2 = a.C0435w1.l(r2, r3, r9)
            if (r2 != 0) goto L34
            return r0
        L34:
            int r1 = r1 + 1
            goto L1f
        L37:
            r4 = 1
            return r4
        L39:
            return r0
    }

    public static java.lang.String S(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            r0 = 0
            boolean r0 = a.Ae.H(r1, r2, r0)
            if (r0 == 0) goto L19
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r2 = "substring(...)"
            a.C0193i9.d(r1, r2)
        L19:
            return r1
    }

    public static java.lang.String T(java.lang.String r1, char r2) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            java.lang.String r0 = "missingDelimiterValue"
            a.C0193i9.e(r1, r0)
            int r2 = Q(r1, r2)
            r0 = -1
            if (r2 != r0) goto L12
            return r1
        L12:
            int r2 = r2 + 1
            int r0 = r1.length()
            java.lang.String r1 = r1.substring(r2, r0)
            java.lang.String r2 = "substring(...)"
            a.C0193i9.d(r1, r2)
            return r1
    }

    public static java.lang.String U(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "missingDelimiterValue"
            a.C0193i9.e(r3, r0)
            r0 = 46
            int r0 = Q(r2, r0)
            r1 = -1
            if (r0 != r1) goto L14
            return r3
        L14:
            r3 = 0
            java.lang.String r2 = r2.substring(r3, r0)
            java.lang.String r3 = "substring(...)"
            a.C0193i9.d(r2, r3)
            return r2
    }

    public static java.lang.CharSequence V(java.lang.String r7) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r7, r0)
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            if (r3 > r0) goto L38
            if (r4 != 0) goto L14
            r5 = r3
            goto L15
        L14:
            r5 = r0
        L15:
            char r5 = r7.charAt(r5)
            boolean r6 = java.lang.Character.isWhitespace(r5)
            if (r6 != 0) goto L28
            boolean r5 = java.lang.Character.isSpaceChar(r5)
            if (r5 == 0) goto L26
            goto L28
        L26:
            r5 = r2
            goto L29
        L28:
            r5 = r1
        L29:
            if (r4 != 0) goto L32
            if (r5 != 0) goto L2f
            r4 = r1
            goto Le
        L2f:
            int r3 = r3 + 1
            goto Le
        L32:
            if (r5 != 0) goto L35
            goto L38
        L35:
            int r0 = r0 + (-1)
            goto Le
        L38:
            int r0 = r0 + r1
            java.lang.CharSequence r7 = r7.subSequence(r3, r0)
            return r7
    }
}
