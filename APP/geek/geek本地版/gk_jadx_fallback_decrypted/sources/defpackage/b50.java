package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class b50 extends defpackage.a50 {
    public static boolean B(java.lang.CharSequence r8, java.lang.CharSequence r9, boolean r10) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r8)
            java.lang.String r0 = "other"
            defpackage.ip.o(r0, r9)
            boolean r0 = r9 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L19
            java.lang.String r9 = (java.lang.String) r9
            r0 = 2
            int r8 = G(r8, r9, r1, r10, r0)
            if (r8 < 0) goto L2a
            goto L28
        L19:
            int r5 = r8.length()
            r7 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            r6 = r10
            int r8 = F(r2, r3, r4, r5, r6, r7)
            if (r8 < 0) goto L2a
        L28:
            r8 = 1
            return r8
        L2a:
            return r1
    }

    public static boolean C(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r1)
            java.lang.String r0 = "suffix"
            defpackage.ip.o(r0, r2)
            boolean r1 = r1.endsWith(r2)
            return r1
    }

    public static final int D(java.lang.CharSequence r1) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r1)
            int r1 = r1.length()
            int r1 = r1 + (-1)
            return r1
    }

    public static final int E(java.lang.CharSequence r6, java.lang.String r7, int r8, boolean r9) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r6)
            java.lang.String r0 = "string"
            defpackage.ip.o(r0, r7)
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
            int r6 = F(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static final int F(java.lang.CharSequence r8, java.lang.CharSequence r9, int r10, int r11, boolean r12, boolean r13) {
            r0 = -1
            r1 = 0
            if (r13 != 0) goto L15
            hp r13 = new hp
            if (r10 >= 0) goto L9
            r10 = r1
        L9:
            int r1 = r8.length()
            if (r11 <= r1) goto L10
            r11 = r1
        L10:
            r1 = 1
            r13.<init>(r10, r11, r1)
            goto L24
        L15:
            int r13 = D(r8)
            if (r10 <= r13) goto L1c
            r10 = r13
        L1c:
            if (r11 >= 0) goto L1f
            r11 = r1
        L1f:
            fp r13 = new fp
            r13.<init>(r10, r11, r0)
        L24:
            boolean r10 = r8 instanceof java.lang.String
            int r11 = r13.c
            int r1 = r13.b
            int r13 = r13.a
            if (r10 == 0) goto L53
            boolean r10 = r9 instanceof java.lang.String
            if (r10 == 0) goto L53
            if (r11 <= 0) goto L36
            if (r13 <= r1) goto L3a
        L36:
            if (r11 >= 0) goto L6b
            if (r1 > r13) goto L6b
        L3a:
            r3 = r13
        L3b:
            r5 = r9
            java.lang.String r5 = (java.lang.String) r5
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            int r4 = r5.length()
            r2 = 0
            r7 = r12
            boolean r10 = J(r2, r3, r4, r5, r6, r7)
            if (r10 == 0) goto L4e
            return r3
        L4e:
            if (r3 == r1) goto L6b
            int r3 = r3 + r11
            r12 = r7
            goto L3b
        L53:
            r7 = r12
            if (r11 <= 0) goto L58
            if (r13 <= r1) goto L5c
        L58:
            if (r11 >= 0) goto L6b
            if (r1 > r13) goto L6b
        L5c:
            int r10 = r9.length()
            boolean r10 = K(r9, r8, r13, r10, r7)
            if (r10 == 0) goto L67
            return r13
        L67:
            if (r13 == r1) goto L6b
            int r13 = r13 + r11
            goto L5c
        L6b:
            return r0
    }

    public static /* synthetic */ int G(java.lang.CharSequence r2, java.lang.String r3, int r4, boolean r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = r1
        Lb:
            int r2 = E(r2, r3, r4, r5)
            return r2
    }

    public static boolean H(java.lang.CharSequence r4) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r4)
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

    public static int I(java.lang.String r1, java.lang.String r2, int r3) {
            r3 = r3 & 2
            if (r3 == 0) goto L9
            int r3 = D(r1)
            goto La
        L9:
            r3 = 0
        La:
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r1)
            java.lang.String r0 = "string"
            defpackage.ip.o(r0, r2)
            int r1 = r1.lastIndexOf(r2, r3)
            return r1
    }

    public static final boolean J(int r6, int r7, int r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r9)
            java.lang.String r0 = "other"
            defpackage.ip.o(r0, r10)
            if (r11 != 0) goto L11
            boolean r6 = r9.regionMatches(r6, r10, r7, r8)
            return r6
        L11:
            r2 = r6
            r4 = r7
            r5 = r8
            r0 = r9
            r3 = r10
            r1 = r11
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
            return r6
    }

    public static final boolean K(java.lang.CharSequence r4, java.lang.CharSequence r5, int r6, int r7, boolean r8) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r4)
            java.lang.String r0 = "other"
            defpackage.ip.o(r0, r5)
            r0 = 0
            if (r6 < 0) goto L48
            int r1 = r4.length()
            int r1 = r1 - r7
            if (r1 < 0) goto L48
            int r1 = r5.length()
            int r1 = r1 - r7
            if (r6 <= r1) goto L1c
            goto L48
        L1c:
            r1 = r0
        L1d:
            if (r1 >= r7) goto L46
            char r2 = r4.charAt(r1)
            int r3 = r6 + r1
            char r3 = r5.charAt(r3)
            if (r2 != r3) goto L2c
            goto L43
        L2c:
            if (r8 != 0) goto L2f
            goto L48
        L2f:
            char r2 = java.lang.Character.toUpperCase(r2)
            char r3 = java.lang.Character.toUpperCase(r3)
            if (r2 == r3) goto L43
            char r2 = java.lang.Character.toLowerCase(r2)
            char r3 = java.lang.Character.toLowerCase(r3)
            if (r2 != r3) goto L48
        L43:
            int r1 = r1 + 1
            goto L1d
        L46:
            r4 = 1
            return r4
        L48:
            return r0
    }

    public static java.lang.String L(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r7)
            java.lang.String r0 = "oldValue"
            defpackage.ip.o(r0, r8)
            java.lang.String r0 = "newValue"
            defpackage.ip.o(r0, r9)
            r0 = 0
            int r1 = E(r7, r8, r0, r0)
            if (r1 >= 0) goto L17
            return r7
        L17:
            int r2 = r8.length()
            r3 = 1
            if (r2 >= r3) goto L1f
            goto L20
        L1f:
            r3 = r2
        L20:
            int r4 = r7.length()
            int r4 = r4 - r2
            int r5 = r9.length()
            int r5 = r5 + r4
            if (r5 < 0) goto L58
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r5 = r0
        L32:
            r4.append(r7, r5, r1)
            r4.append(r9)
            int r5 = r1 + r2
            int r6 = r7.length()
            if (r1 >= r6) goto L47
            int r1 = r1 + r3
            int r1 = E(r7, r8, r1, r0)
            if (r1 > 0) goto L32
        L47:
            int r8 = r7.length()
            r4.append(r7, r5, r8)
            java.lang.String r7 = r4.toString()
            java.lang.String r8 = "toString(...)"
            defpackage.ip.n(r8, r7)
            return r7
        L58:
            java.lang.OutOfMemoryError r7 = new java.lang.OutOfMemoryError
            r7.<init>()
            throw r7
    }

    public static java.util.List M(java.lang.String r5, java.lang.String[] r6) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r5)
            int r0 = r6.length
            r1 = 1
            if (r0 != r1) goto L51
            r0 = 0
            r2 = r6[r0]
            int r3 = r2.length()
            if (r3 != 0) goto L13
            goto L51
        L13:
            int r6 = E(r5, r2, r0, r0)
            r1 = -1
            if (r6 == r1) goto L48
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            r3.<init>(r4)
            r4 = r0
        L22:
            java.lang.CharSequence r4 = r5.subSequence(r4, r6)
            java.lang.String r4 = r4.toString()
            r3.add(r4)
            int r4 = r2.length()
            int r4 = r4 + r6
            int r6 = E(r5, r2, r4, r0)
            if (r6 != r1) goto L22
            int r6 = r5.length()
            java.lang.CharSequence r5 = r5.subSequence(r4, r6)
            java.lang.String r5 = r5.toString()
            r3.add(r5)
            return r3
        L48:
            java.lang.String r5 = r5.toString()
            java.util.List r5 = defpackage.ip.C(r5)
            return r5
        L51:
            java.util.List r6 = java.util.Arrays.asList(r6)
            java.lang.String r0 = "asList(...)"
            defpackage.ip.n(r0, r6)
            gg r0 = new gg
            oh r2 = new oh
            r2.<init>(r6)
            r0.<init>(r5, r2)
            m20 r6 = new m20
            r6.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = defpackage.cb.h0(r6)
            r0.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L76:
            r2 = r6
            fg r2 = (defpackage.fg) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9b
            java.lang.Object r2 = r2.next()
            hp r2 = (defpackage.hp) r2
            java.lang.String r3 = "range"
            defpackage.ip.o(r3, r2)
            int r3 = r2.a
            int r2 = r2.b
            int r2 = r2 + r1
            java.lang.CharSequence r2 = r5.subSequence(r3, r2)
            java.lang.String r2 = r2.toString()
            r0.add(r2)
            goto L76
        L9b:
            return r0
    }

    public static boolean N(java.lang.String r6, java.lang.String r7, boolean r8) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r6)
            java.lang.String r0 = "prefix"
            defpackage.ip.o(r0, r7)
            if (r8 != 0) goto L11
            boolean r6 = r6.startsWith(r7)
            return r6
        L11:
            r1 = 0
            int r2 = r7.length()
            r0 = 0
            r3 = r6
            r4 = r7
            r5 = r8
            boolean r6 = J(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String O(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r2)
            java.lang.String r0 = "delimiter"
            defpackage.ip.o(r0, r3)
            java.lang.String r0 = "missingDelimiterValue"
            defpackage.ip.o(r0, r2)
            r0 = 0
            r1 = 6
            int r0 = G(r2, r3, r0, r0, r1)
            r1 = -1
            if (r0 != r1) goto L19
            return r2
        L19:
            int r3 = r3.length()
            int r3 = r3 + r0
            int r0 = r2.length()
            java.lang.String r2 = r2.substring(r3, r0)
            java.lang.String r3 = "substring(...)"
            defpackage.ip.n(r3, r2)
            return r2
    }

    public static java.lang.String P(java.lang.String r2) {
            r0 = 46
            int r1 = D(r2)
            int r0 = r2.lastIndexOf(r0, r1)
            r1 = -1
            if (r0 != r1) goto Le
            return r2
        Le:
            int r0 = r0 + 1
            int r1 = r2.length()
            java.lang.String r2 = r2.substring(r0, r1)
            java.lang.String r0 = "substring(...)"
            defpackage.ip.n(r0, r2)
            return r2
    }

    public static java.lang.String Q(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "delimiter"
            defpackage.ip.o(r0, r3)
            r0 = 6
            r1 = 0
            int r3 = G(r2, r3, r1, r1, r0)
            r0 = -1
            if (r3 != r0) goto Lf
            return r2
        Lf:
            java.lang.String r2 = r2.substring(r1, r3)
            java.lang.String r3 = "substring(...)"
            defpackage.ip.n(r3, r2)
            return r2
    }

    public static java.lang.Integer R(java.lang.String r10) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r10)
            r0 = 10
            defpackage.ff.h(r0)
            int r1 = r10.length()
            if (r1 != 0) goto L11
            goto L52
        L11:
            r2 = 0
            char r3 = r10.charAt(r2)
            r4 = 48
            r5 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r3 >= r4) goto L30
            r4 = 1
            if (r1 != r4) goto L21
            goto L52
        L21:
            r6 = 43
            if (r3 == r6) goto L2e
            r5 = 45
            if (r3 == r5) goto L2a
            goto L52
        L2a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r4
            goto L32
        L2e:
            r3 = r2
            goto L32
        L30:
            r3 = r2
            r4 = r3
        L32:
            r6 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r7 = r6
        L36:
            if (r4 >= r1) goto L58
            char r8 = r10.charAt(r4)
            int r8 = java.lang.Character.digit(r8, r0)
            if (r8 >= 0) goto L43
            goto L52
        L43:
            if (r2 >= r7) goto L4c
            if (r7 != r6) goto L52
            int r7 = r5 / 10
            if (r2 >= r7) goto L4c
            goto L52
        L4c:
            int r2 = r2 * 10
            int r9 = r5 + r8
            if (r2 >= r9) goto L54
        L52:
            r10 = 0
            return r10
        L54:
            int r2 = r2 - r8
            int r4 = r4 + 1
            goto L36
        L58:
            if (r3 == 0) goto L5f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            return r10
        L5f:
            int r10 = -r2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
    }

    public static java.lang.Long S(java.lang.String r19) {
            r0 = r19
            r1 = 10
            defpackage.ff.h(r1)
            int r2 = r0.length()
            if (r2 != 0) goto Le
            goto L62
        Le:
            r3 = 0
            char r4 = r0.charAt(r3)
            r5 = 48
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r5) goto L33
            r5 = 1
            if (r2 != r5) goto L20
            goto L62
        L20:
            r8 = 43
            if (r4 == r8) goto L2d
            r3 = 45
            if (r4 == r3) goto L29
            goto L62
        L29:
            r6 = -9223372036854775808
            r3 = r5
            goto L34
        L2d:
            r18 = r5
            r5 = r3
            r3 = r18
            goto L34
        L33:
            r5 = r3
        L34:
            r8 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r8
        L3c:
            if (r3 >= r2) goto L68
            char r4 = r0.charAt(r3)
            int r4 = java.lang.Character.digit(r4, r1)
            if (r4 >= 0) goto L49
            goto L62
        L49:
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L59
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 != 0) goto L62
            long r12 = (long) r1
            long r12 = r6 / r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L59
            goto L62
        L59:
            long r14 = (long) r1
            long r10 = r10 * r14
            long r14 = (long) r4
            long r16 = r6 + r14
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 >= 0) goto L64
        L62:
            r0 = 0
            return r0
        L64:
            long r10 = r10 - r14
            int r3 = r3 + 1
            goto L3c
        L68:
            if (r5 == 0) goto L6f
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            return r0
        L6f:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    public static java.lang.CharSequence T(java.lang.String r7) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r7)
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
