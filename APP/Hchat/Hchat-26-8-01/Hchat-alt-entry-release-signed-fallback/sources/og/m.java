package og;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends og.t {
    public static java.lang.String A0(java.lang.String r1, java.lang.String r2) {
            r1.getClass()
            r2.getClass()
            boolean r0 = H0(r1, r2)
            if (r0 == 0) goto L14
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
        L14:
            return r1
    }

    public static java.lang.String B0(java.lang.String r1, java.lang.String r2) {
            r1.getClass()
            boolean r0 = m0(r1, r2)
            if (r0 == 0) goto L17
            int r0 = r1.length()
            int r2 = r2.length()
            int r0 = r0 - r2
            r2 = 0
            java.lang.String r1 = r1.substring(r2, r0)
        L17:
            return r1
    }

    public static java.lang.StringBuilder C0(java.lang.CharSequence r2, int r3, int r4, java.lang.CharSequence r5) {
            r2.getClass()
            r5.getClass()
            if (r4 < r3) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r0.append(r2, r1, r3)
            r0.append(r5)
            int r3 = r2.length()
            r0.append(r2, r4, r3)
            return r0
        L1c:
            java.lang.String r2 = ") is less than start index ("
            java.lang.String r5 = ")."
            java.lang.String r0 = "End index ("
            java.lang.String r2 = eh.a.k(r4, r3, r0, r2, r5)
            okio.a.i(r2)
            r2 = 0
            return r2
    }

    public static final void D0(int r1) {
            if (r1 < 0) goto L3
            return
        L3:
            java.lang.String r0 = "Limit must be non-negative, but was "
            java.lang.String r1 = eh.a.l(r1, r0)
            j8.o.q(r1)
            return
    }

    public static final java.util.List E0(java.lang.CharSequence r8, java.lang.String r9, int r10) {
            D0(r10)
            r0 = 0
            int r1 = o0(r8, r9, r0, r0)
            r2 = -1
            if (r1 == r2) goto L52
            r3 = 1
            if (r10 != r3) goto Lf
            goto L52
        Lf:
            if (r10 <= 0) goto L13
            r4 = r3
            goto L14
        L13:
            r4 = r0
        L14:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            if (r4 == 0) goto L1e
            if (r10 <= r6) goto L1d
            goto L1e
        L1d:
            r6 = r10
        L1e:
            r5.<init>(r6)
            r6 = r0
        L22:
            java.lang.CharSequence r6 = r8.subSequence(r6, r1)
            java.lang.String r6 = r6.toString()
            r5.add(r6)
            int r6 = r9.length()
            int r6 = r6 + r1
            if (r4 == 0) goto L3c
            int r1 = r5.size()
            int r7 = r10 + (-1)
            if (r1 == r7) goto L42
        L3c:
            int r1 = o0(r8, r9, r6, r0)
            if (r1 != r2) goto L22
        L42:
            int r9 = r8.length()
            java.lang.CharSequence r8 = r8.subSequence(r6, r9)
            java.lang.String r8 = r8.toString()
            r5.add(r8)
            return r5
        L52:
            java.lang.String r8 = r8.toString()
            java.util.List r8 = a.a.x0(r8)
            return r8
    }

    public static java.util.List F0(java.lang.CharSequence r4, char[] r5, int r6) {
            r6 = r6 & 4
            r0 = 0
            if (r6 == 0) goto L7
            r6 = r0
            goto L8
        L7:
            r6 = 2
        L8:
            r4.getClass()
            int r1 = r5.length
            r2 = 1
            if (r1 != r2) goto L1a
            char r5 = r5[r0]
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.util.List r4 = E0(r4, r5, r6)
            return r4
        L1a:
            D0(r6)
            og.c r0 = new og.c
            b0.t r1 = new b0.t
            r3 = 16
            r1.<init>(r5, r3)
            r0.<init>(r4, r6, r1)
            ng.p r5 = new ng.p
            r6 = 0
            r5.<init>(r0, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r0 = tf.n.e1(r5)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L3c:
            r0 = r5
            og.b r0 = (og.b) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r0 = r0.next()
            lg.d r0 = (lg.d) r0
            r0.getClass()
            int r1 = r0.f8042g
            int r0 = r0.f8043h
            int r0 = r0 + r2
            java.lang.CharSequence r0 = r4.subSequence(r1, r0)
            java.lang.String r0 = r0.toString()
            r6.add(r0)
            goto L3c
        L5f:
            return r6
    }

    public static java.util.List G0(java.lang.CharSequence r5, java.lang.String[] r6) {
            r5.getClass()
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L15
            r0 = r6[r1]
            int r3 = r0.length()
            if (r3 <= 0) goto L15
            java.util.List r5 = E0(r5, r0, r1)
            return r5
        L15:
            D0(r1)
            java.util.List r6 = java.util.Arrays.asList(r6)
            r6.getClass()
            og.c r0 = new og.c
            og.u r3 = new og.u
            r4 = 0
            r3.<init>(r4, r6)
            r0.<init>(r5, r1, r3)
            ng.p r6 = new ng.p
            r1 = 0
            r6.<init>(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r6)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L3d:
            r1 = r6
            og.b r1 = (og.b) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L60
            java.lang.Object r1 = r1.next()
            lg.d r1 = (lg.d) r1
            r1.getClass()
            int r3 = r1.f8042g
            int r1 = r1.f8043h
            int r1 = r1 + r2
            java.lang.CharSequence r1 = r5.subSequence(r3, r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto L3d
        L60:
            return r0
    }

    public static boolean H0(java.lang.CharSequence r6, java.lang.CharSequence r7) {
            r6.getClass()
            r7.getClass()
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L18
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L18
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            r0 = 0
            boolean r6 = og.t.d0(r6, r7, r0)
            return r6
        L18:
            r3 = 0
            int r4 = r7.length()
            r1 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            boolean r6 = z0(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static boolean I0(java.lang.String r2, char r3) {
            r2.getClass()
            int r0 = r2.length()
            r1 = 0
            if (r0 <= 0) goto L16
            char r2 = r2.charAt(r1)
            boolean r2 = a.a.I(r2, r3, r1)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            return r1
    }

    public static java.lang.String J0(java.lang.String r2, char r3, java.lang.String r4) {
            r0 = 0
            r1 = 6
            int r3 = q0(r2, r3, r0, r1)
            r0 = -1
            if (r3 != r0) goto La
            return r4
        La:
            int r3 = r3 + 1
            int r4 = r2.length()
            java.lang.String r2 = r2.substring(r3, r4)
            return r2
    }

    public static java.lang.String K0(java.lang.String r2, java.lang.String r3) {
            r2.getClass()
            r2.getClass()
            r0 = 0
            r1 = 6
            int r0 = r0(r2, r3, r0, r0, r1)
            r1 = -1
            if (r0 != r1) goto L10
            return r2
        L10:
            int r3 = r3.length()
            int r3 = r3 + r0
            int r0 = r2.length()
            java.lang.String r2 = r2.substring(r3, r0)
            return r2
    }

    public static java.lang.String L0(java.lang.String r2, char r3, java.lang.String r4) {
            r0 = 0
            r1 = 6
            int r3 = w0(r2, r3, r0, r1)
            r0 = -1
            if (r3 != r0) goto La
            return r4
        La:
            int r3 = r3 + 1
            int r4 = r2.length()
            java.lang.String r2 = r2.substring(r3, r4)
            return r2
    }

    public static java.lang.String M0(java.lang.String r2, char r3) {
            r2.getClass()
            r2.getClass()
            r0 = 6
            r1 = 0
            int r3 = q0(r2, r3, r1, r0)
            r0 = -1
            if (r3 != r0) goto L10
            return r2
        L10:
            java.lang.String r2 = r2.substring(r1, r3)
            return r2
    }

    public static java.lang.String N0(java.lang.String r2, java.lang.String r3) {
            r2.getClass()
            r2.getClass()
            r0 = 6
            r1 = 0
            int r3 = r0(r2, r3, r1, r1, r0)
            r0 = -1
            if (r3 != r0) goto L10
            return r2
        L10:
            java.lang.String r2 = r2.substring(r1, r3)
            return r2
    }

    public static java.lang.String O0(java.lang.String r2, char r3, java.lang.String r4) {
            r0 = 6
            r1 = 0
            int r3 = w0(r2, r3, r1, r0)
            r0 = -1
            if (r3 != r0) goto La
            return r4
        La:
            java.lang.String r2 = r2.substring(r1, r3)
            return r2
    }

    public static java.lang.String P0(int r1, java.lang.String r2) {
            r2.getClass()
            if (r1 < 0) goto L12
            int r0 = r2.length()
            if (r1 <= r0) goto Lc
            r1 = r0
        Lc:
            r0 = 0
            java.lang.String r1 = r2.substring(r0, r1)
            return r1
        L12:
            java.lang.String r2 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r1 = eh.a.m(r1, r2, r0)
            j8.o.q(r1)
            r1 = 0
            return r1
    }

    public static java.lang.String Q0(int r1, java.lang.String r2) {
            if (r1 < 0) goto Lf
            int r0 = r2.length()
            if (r1 <= r0) goto L9
            r1 = r0
        L9:
            int r0 = r0 - r1
            java.lang.String r1 = r2.substring(r0)
            return r1
        Lf:
            java.lang.String r2 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r1 = eh.a.m(r1, r2, r0)
            j8.o.q(r1)
            r1 = 0
            return r1
    }

    public static java.lang.CharSequence R0(java.lang.CharSequence r5) {
            r5.getClass()
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        Lb:
            if (r2 > r0) goto L29
            if (r3 != 0) goto L11
            r4 = r2
            goto L12
        L11:
            r4 = r0
        L12:
            char r4 = r5.charAt(r4)
            boolean r4 = a.a.v0(r4)
            if (r3 != 0) goto L23
            if (r4 != 0) goto L20
            r3 = r1
            goto Lb
        L20:
            int r2 = r2 + 1
            goto Lb
        L23:
            if (r4 != 0) goto L26
            goto L29
        L26:
            int r0 = r0 + (-1)
            goto Lb
        L29:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            return r5
    }

    public static java.lang.String S0(java.lang.String r5, char... r6) {
            r5.getClass()
            int r0 = r5.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        Lb:
            if (r2 > r0) goto L29
            if (r3 != 0) goto L11
            r4 = r2
            goto L12
        L11:
            r4 = r0
        L12:
            char r4 = r5.charAt(r4)
            boolean r4 = tf.l.l0(r6, r4)
            if (r3 != 0) goto L23
            if (r4 != 0) goto L20
            r3 = r1
            goto Lb
        L20:
            int r2 = r2 + 1
            goto Lb
        L23:
            if (r4 != 0) goto L26
            goto L29
        L26:
            int r0 = r0 + (-1)
            goto Lb
        L29:
            int r0 = r0 + r1
            java.lang.CharSequence r5 = r5.subSequence(r2, r0)
            java.lang.String r5 = r5.toString()
            return r5
    }

    public static java.lang.CharSequence T0(java.lang.String r3) {
            r3.getClass()
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L24
        Lb:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = a.a.v0(r2)
            if (r2 != 0) goto L1f
            int r0 = r0 + 1
            r1 = 0
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            return r3
        L1f:
            if (r1 >= 0) goto L22
            goto L24
        L22:
            r0 = r1
            goto Lb
        L24:
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String U0(java.lang.String r3, char... r4) {
            r3.getClass()
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L24
        Lb:
            int r1 = r0 + (-1)
            char r2 = r3.charAt(r0)
            boolean r2 = tf.l.l0(r4, r2)
            if (r2 != 0) goto L1f
            int r0 = r0 + 1
            r4 = 0
            java.lang.CharSequence r3 = r3.subSequence(r4, r0)
            goto L26
        L1f:
            if (r1 >= 0) goto L22
            goto L24
        L22:
            r0 = r1
            goto Lb
        L24:
            java.lang.String r3 = ""
        L26:
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static java.lang.CharSequence V0(java.lang.String r3) {
            r3.getClass()
            int r0 = r3.length()
            r1 = 0
        L8:
            if (r1 >= r0) goto L20
            char r2 = r3.charAt(r1)
            boolean r2 = a.a.v0(r2)
            if (r2 != 0) goto L1d
            int r0 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            return r3
        L1d:
            int r1 = r1 + 1
            goto L8
        L20:
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String W0(java.lang.String r3, char... r4) {
            r3.getClass()
            int r0 = r3.length()
            r1 = 0
        L8:
            if (r1 >= r0) goto L20
            char r2 = r3.charAt(r1)
            boolean r2 = tf.l.l0(r4, r2)
            if (r2 != 0) goto L1d
            int r4 = r3.length()
            java.lang.CharSequence r3 = r3.subSequence(r1, r4)
            goto L22
        L1d:
            int r1 = r1 + 1
            goto L8
        L20:
            java.lang.String r3 = ""
        L22:
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static boolean h0(java.lang.CharSequence r8, java.lang.CharSequence r9, boolean r10) {
            r8.getClass()
            r9.getClass()
            boolean r0 = r9 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.String r9 = (java.lang.String) r9
            r0 = 2
            int r8 = r0(r8, r9, r1, r10, r0)
            if (r8 < 0) goto L26
            goto L24
        L15:
            int r5 = r8.length()
            r7 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            r6 = r10
            int r8 = p0(r2, r3, r4, r5, r6, r7)
            if (r8 < 0) goto L26
        L24:
            r8 = 1
            return r8
        L26:
            return r1
    }

    public static boolean i0(java.lang.CharSequence r2, char r3) {
            r2.getClass()
            r0 = 2
            r1 = 0
            int r2 = q0(r2, r3, r1, r0)
            if (r2 < 0) goto Ld
            r2 = 1
            return r2
        Ld:
            return r1
    }

    public static java.lang.String j0(int r1, java.lang.String r2) {
            r2.getClass()
            if (r1 < 0) goto L11
            int r0 = r2.length()
            if (r1 <= r0) goto Lc
            r1 = r0
        Lc:
            java.lang.String r1 = r2.substring(r1)
            return r1
        L11:
            java.lang.String r2 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r1 = eh.a.m(r1, r2, r0)
            j8.o.q(r1)
            r1 = 0
            return r1
    }

    public static java.lang.String k0(int r1, java.lang.String r2) {
            if (r1 < 0) goto Lf
            int r0 = r2.length()
            int r0 = r0 - r1
            if (r0 >= 0) goto La
            r0 = 0
        La:
            java.lang.String r1 = P0(r0, r2)
            return r1
        Lf:
            java.lang.String r2 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r1 = eh.a.m(r1, r2, r0)
            j8.o.q(r1)
            r1 = 0
            return r1
    }

    public static boolean l0(java.lang.CharSequence r3, char r4) {
            r3.getClass()
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L1b
            int r0 = r3.length()
            r2 = 1
            int r0 = r0 - r2
            char r3 = r3.charAt(r0)
            boolean r3 = a.a.I(r3, r4, r1)
            if (r3 == 0) goto L1b
            return r2
        L1b:
            return r1
    }

    public static boolean m0(java.lang.CharSequence r8, java.lang.String r9) {
            r8.getClass()
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto Lf
            java.lang.String r8 = (java.lang.String) r8
            r0 = 0
            boolean r8 = og.t.W(r8, r9, r0)
            return r8
        Lf:
            int r0 = r8.length()
            int r1 = r9.length()
            int r3 = r0 - r1
            r5 = 0
            int r6 = r9.length()
            r7 = 0
            r2 = r8
            r4 = r9
            boolean r8 = z0(r2, r3, r4, r5, r6, r7)
            return r8
    }

    public static java.lang.Character n0(java.lang.CharSequence r1, int r2) {
            r1.getClass()
            if (r2 < 0) goto L14
            int r0 = r1.length()
            if (r2 >= r0) goto L14
            char r1 = r1.charAt(r2)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
        L14:
            r1 = 0
            return r1
    }

    public static int o0(java.lang.CharSequence r6, java.lang.String r7, int r8, boolean r9) {
            r6.getClass()
            r7.getClass()
            if (r9 != 0) goto L14
            boolean r0 = r6 instanceof java.lang.String
            if (r0 != 0) goto Ld
            goto L14
        Ld:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.indexOf(r7, r8)
            return r6
        L14:
            int r3 = r6.length()
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            int r6 = p0(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static final int p0(java.lang.CharSequence r16, java.lang.CharSequence r17, int r18, int r19, boolean r20, boolean r21) {
            r2 = r16
            r0 = r17
            r1 = r18
            r3 = r19
            r6 = -1
            r4 = 1
            r5 = 0
            if (r21 != 0) goto L1d
            lg.d r7 = new lg.d
            if (r1 >= 0) goto L12
            r1 = r5
        L12:
            int r5 = r2.length()
            if (r3 <= r5) goto L19
            r3 = r5
        L19:
            r7.<init>(r1, r3, r4)
            goto L30
        L1d:
            r2.getClass()
            int r7 = r2.length()
            int r7 = r7 - r4
            if (r1 <= r7) goto L28
            r1 = r7
        L28:
            if (r3 >= 0) goto L2b
            r3 = r5
        L2b:
            lg.b r7 = new lg.b
            r7.<init>(r1, r3, r6)
        L30:
            boolean r1 = r2 instanceof java.lang.String
            int r8 = r7.f8044i
            int r9 = r7.f8043h
            int r3 = r7.f8042g
            if (r1 == 0) goto L5f
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L5f
            if (r8 <= 0) goto L42
            if (r3 <= r9) goto L46
        L42:
            if (r8 >= 0) goto L7d
            if (r9 > r3) goto L7d
        L46:
            r13 = r3
        L47:
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            int r14 = r10.length()
            r11 = 0
            r15 = r20
            boolean r1 = og.t.Y(r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L5b
            return r13
        L5b:
            if (r13 == r9) goto L7d
            int r13 = r13 + r8
            goto L47
        L5f:
            if (r8 <= 0) goto L63
            if (r3 <= r9) goto L67
        L63:
            if (r8 >= 0) goto L7d
            if (r9 > r3) goto L7d
        L67:
            r1 = 0
            int r4 = r0.length()
            r5 = r20
            boolean r1 = z0(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L75
            return r3
        L75:
            if (r3 == r9) goto L7d
            int r3 = r3 + r8
            r2 = r16
            r0 = r17
            goto L67
        L7d:
            return r6
    }

    public static int q0(java.lang.CharSequence r1, char r2, int r3, int r4) {
            r4 = r4 & 2
            r0 = 0
            if (r4 == 0) goto L6
            r3 = r0
        L6:
            r1.getClass()
            boolean r4 = r1 instanceof java.lang.String
            if (r4 != 0) goto L17
            r4 = 1
            char[] r4 = new char[r4]
            r4[r0] = r2
            int r1 = s0(r1, r4, r3, r0)
            return r1
        L17:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.indexOf(r2, r3)
            return r1
    }

    public static /* synthetic */ int r0(java.lang.CharSequence r2, java.lang.String r3, int r4, boolean r5, int r6) {
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = r1
        Lb:
            int r2 = o0(r2, r3, r4, r5)
            return r2
    }

    public static final int s0(java.lang.CharSequence r6, char[] r7, int r8, boolean r9) {
            r6.getClass()
            r0 = 1
            if (r9 != 0) goto L2b
            int r1 = r7.length
            if (r1 != r0) goto L2b
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L2b
            int r9 = r7.length
            if (r9 == 0) goto L1e
            r0 = 1
            if (r9 != r0) goto L17
            r9 = 0
            char r7 = r7[r9]
            goto L24
        L17:
            java.lang.String r7 = "Array has more than one element."
            j8.o.t(r7)
        L1c:
            r7 = 0
            goto L24
        L1e:
            java.lang.String r7 = "Array is empty."
            j8.o.l(r7)
            goto L1c
        L24:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.indexOf(r7, r8)
            return r6
        L2b:
            r1 = 0
            if (r8 >= 0) goto L2f
            r8 = r1
        L2f:
            int r2 = r6.length()
            int r2 = r2 - r0
            if (r8 > r2) goto L4f
        L36:
            char r0 = r6.charAt(r8)
            int r3 = r7.length
            r4 = r1
        L3c:
            if (r4 >= r3) goto L4a
            char r5 = r7[r4]
            boolean r5 = a.a.I(r5, r0, r9)
            if (r5 == 0) goto L47
            return r8
        L47:
            int r4 = r4 + 1
            goto L3c
        L4a:
            if (r8 == r2) goto L4f
            int r8 = r8 + 1
            goto L36
        L4f:
            r6 = -1
            return r6
    }

    public static boolean t0(java.lang.CharSequence r3) {
            r3.getClass()
            r0 = 0
            r1 = r0
        L5:
            int r2 = r3.length()
            if (r1 >= r2) goto L19
            char r2 = r3.charAt(r1)
            boolean r2 = a.a.v0(r2)
            if (r2 != 0) goto L16
            return r0
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r3 = 1
            return r3
    }

    public static char u0(java.lang.CharSequence r1) {
            r1.getClass()
            int r0 = r1.length()
            if (r0 == 0) goto L14
            int r0 = r1.length()
            int r0 = r0 + (-1)
            char r1 = r1.charAt(r0)
            return r1
        L14:
            java.lang.String r1 = "Char sequence is empty."
            j8.o.l(r1)
            r1 = 0
            return r1
    }

    public static int v0(int r0, java.lang.String r1, java.lang.String r2) {
            r0 = r0 & 2
            if (r0 == 0) goto Lb
            int r0 = r1.length()
            int r0 = r0 + (-1)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r2.getClass()
            int r0 = r1.lastIndexOf(r2, r0)
            return r0
    }

    public static int w0(java.lang.String r0, char r1, int r2, int r3) {
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            r0.getClass()
            int r2 = r0.length()
            int r2 = r2 + (-1)
        Ld:
            r0.getClass()
            int r0 = r0.lastIndexOf(r1, r2)
            return r0
    }

    public static java.util.List x0(java.lang.CharSequence r2) {
            r2.getClass()
            og.d r0 = new og.d
            r0.<init>(r2)
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L11
            tf.t r2 = tf.t.f13167g
            goto L37
        L11:
            java.lang.Object r2 = r0.next()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L20
            java.util.List r2 = a.a.x0(r2)
            goto L37
        L20:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r2)
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            r1.add(r2)
            goto L28
        L36:
            r2 = r1
        L37:
            return r2
    }

    public static java.lang.String y0(int r3, java.lang.String r4) {
            if (r3 < 0) goto L32
            int r0 = r4.length()
            if (r3 > r0) goto L12
            r3 = 0
            int r0 = r4.length()
            java.lang.CharSequence r3 = r4.subSequence(r3, r0)
            goto L2d
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            int r1 = r4.length()
            int r3 = r3 - r1
            r1 = 1
            if (r1 > r3) goto L29
        L1f:
            r2 = 48
            r0.append(r2)
            if (r1 == r3) goto L29
            int r1 = r1 + 1
            goto L1f
        L29:
            r0.append(r4)
            r3 = r0
        L2d:
            java.lang.String r3 = r3.toString()
            return r3
        L32:
            java.lang.String r4 = "Desired length "
            java.lang.String r0 = " is less than zero."
            java.lang.String r3 = eh.a.m(r3, r4, r0)
            j8.o.t(r3)
            r3 = 0
            return r3
    }

    public static final boolean z0(java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, int r7, int r8, boolean r9) {
            r4.getClass()
            r6.getClass()
            r0 = 0
            if (r7 < 0) goto L35
            if (r5 < 0) goto L35
            int r1 = r4.length()
            int r1 = r1 - r8
            if (r5 > r1) goto L35
            int r1 = r6.length()
            int r1 = r1 - r8
            if (r7 <= r1) goto L1a
            goto L35
        L1a:
            r1 = r0
        L1b:
            if (r1 >= r8) goto L33
            int r2 = r5 + r1
            char r2 = r4.charAt(r2)
            int r3 = r7 + r1
            char r3 = r6.charAt(r3)
            boolean r2 = a.a.I(r2, r3, r9)
            if (r2 != 0) goto L30
            return r0
        L30:
            int r1 = r1 + 1
            goto L1b
        L33:
            r4 = 1
            return r4
        L35:
            return r0
    }
}
