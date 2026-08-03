package og;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends og.s {
    public static java.lang.String V(char[] r3, int r4, int r5) {
            tf.c r0 = tf.f.Companion
            int r1 = r3.length
            r0.getClass()
            java.lang.String r0 = "startIndex: "
            if (r4 < 0) goto L20
            if (r5 > r1) goto L20
            if (r4 > r5) goto L15
            java.lang.String r0 = new java.lang.String
            int r5 = r5 - r4
            r0.<init>(r3, r4, r5)
            return r0
        L15:
            java.lang.String r3 = " > endIndex: "
            java.lang.String r3 = p.a.j(r4, r0, r3, r5)
            j8.o.t(r3)
        L1e:
            r3 = 0
            return r3
        L20:
            java.lang.String r3 = ", endIndex: "
            java.lang.String r2 = ", size: "
            java.lang.StringBuilder r3 = eh.a.s(r4, r5, r0, r3, r2)
            j8.o.e(r1, r3)
            goto L1e
    }

    public static boolean W(java.lang.String r7, java.lang.String r8, boolean r9) {
            r7.getClass()
            r8.getClass()
            if (r9 != 0) goto Ld
            boolean r7 = r7.endsWith(r8)
            return r7
        Ld:
            int r9 = r7.length()
            int r0 = r8.length()
            int r3 = r9 - r0
            int r6 = r8.length()
            r2 = 1
            r5 = 0
            r1 = r7
            r4 = r8
            boolean r7 = r1.regionMatches(r2, r3, r4, r5, r6)
            return r7
    }

    public static boolean X(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    public static final boolean Y(java.lang.String r6, int r7, java.lang.String r8, int r9, int r10, boolean r11) {
            r6.getClass()
            r8.getClass()
            if (r11 != 0) goto Ld
            boolean r6 = r6.regionMatches(r7, r8, r9, r10)
            return r6
        Ld:
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1 = r11
            boolean r6 = r0.regionMatches(r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String Z(int r3, java.lang.String r4) {
            if (r3 < 0) goto L44
            if (r3 == 0) goto L41
            r0 = 1
            if (r3 == r0) goto L3c
            int r1 = r4.length()
            if (r1 == 0) goto L41
            if (r1 == r0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r4.length()
            int r2 = r2 * r3
            r1.<init>(r2)
            if (r0 > r3) goto L23
        L1b:
            r1.append(r4)
            if (r0 == r3) goto L23
            int r0 = r0 + 1
            goto L1b
        L23:
            java.lang.String r3 = r1.toString()
            return r3
        L28:
            r0 = 0
            char r4 = r4.charAt(r0)
            char[] r1 = new char[r3]
        L2f:
            if (r0 >= r3) goto L36
            r1[r0] = r4
            int r0 = r0 + 1
            goto L2f
        L36:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            return r3
        L3c:
            java.lang.String r3 = r4.toString()
            return r3
        L41:
            java.lang.String r3 = ""
            return r3
        L44:
            java.lang.String r4 = "Count 'n' must be non-negative, but was "
            j8.o.d(r3, r4)
            r3 = 0
            return r3
    }

    public static java.lang.String a0(java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9) {
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r0 = 0
            int r1 = og.m.o0(r6, r7, r0, r9)
            if (r1 >= 0) goto L11
            return r6
        L11:
            int r2 = r7.length()
            r3 = 1
            if (r2 >= r3) goto L19
            goto L1a
        L19:
            r3 = r2
        L1a:
            int r4 = r6.length()
            int r4 = r4 - r2
            int r5 = r8.length()
            int r5 = r5 + r4
            if (r5 < 0) goto L4c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
        L2b:
            r4.append(r6, r0, r1)
            r4.append(r8)
            int r0 = r1 + r2
            int r5 = r6.length()
            if (r1 >= r5) goto L40
            int r1 = r1 + r3
            int r1 = og.m.o0(r6, r7, r1, r9)
            if (r1 > 0) goto L2b
        L40:
            int r7 = r6.length()
            r4.append(r6, r0, r7)
            java.lang.String r6 = r4.toString()
            return r6
        L4c:
            java.lang.OutOfMemoryError r6 = new java.lang.OutOfMemoryError
            r6.<init>()
            throw r6
    }

    public static java.lang.String b0(java.lang.String r0, char r1, char r2) {
            r0.getClass()
            java.lang.String r0 = r0.replace(r1, r2)
            r0.getClass()
            return r0
    }

    public static boolean c0(java.lang.String r6, java.lang.String r7, int r8, boolean r9) {
            r6.getClass()
            if (r9 != 0) goto La
            boolean r6 = r6.startsWith(r7, r8)
            return r6
        La:
            r3 = 0
            int r4 = r7.length()
            r0 = r6
            r2 = r7
            r1 = r8
            r5 = r9
            boolean r6 = Y(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static boolean d0(java.lang.String r6, java.lang.String r7, boolean r8) {
            r6.getClass()
            r7.getClass()
            if (r8 != 0) goto Ld
            boolean r6 = r6.startsWith(r7)
            return r6
        Ld:
            r3 = 0
            int r4 = r7.length()
            r1 = 0
            r0 = r6
            r2 = r7
            r5 = r8
            boolean r6 = Y(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.Integer e0(int r9, java.lang.String r10) {
            r10.getClass()
            a.a.w(r9)
            int r0 = r10.length()
            if (r0 != 0) goto Ld
            goto L4d
        Ld:
            r1 = 0
            char r2 = r10.charAt(r1)
            r3 = 48
            r4 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r2 >= r3) goto L2c
            r3 = 1
            if (r0 != r3) goto L1d
            goto L4d
        L1d:
            r5 = 43
            if (r2 == r5) goto L2a
            r4 = 45
            if (r2 == r4) goto L26
            goto L4d
        L26:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r3
            goto L2e
        L2a:
            r2 = r1
            goto L2e
        L2c:
            r2 = r1
            r3 = r2
        L2e:
            r5 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r6 = r5
        L32:
            if (r3 >= r0) goto L53
            char r7 = r10.charAt(r3)
            int r7 = java.lang.Character.digit(r7, r9)
            if (r7 >= 0) goto L3f
            goto L4d
        L3f:
            if (r1 >= r6) goto L48
            if (r6 != r5) goto L4d
            int r6 = r4 / r9
            if (r1 >= r6) goto L48
            goto L4d
        L48:
            int r1 = r1 * r9
            int r8 = r4 + r7
            if (r1 >= r8) goto L4f
        L4d:
            r9 = 0
            return r9
        L4f:
            int r1 = r1 - r7
            int r3 = r3 + 1
            goto L32
        L53:
            if (r2 == 0) goto L5a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            return r9
        L5a:
            int r9 = -r1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            return r9
    }

    public static java.lang.Integer f0(java.lang.String r1) {
            r1.getClass()
            r0 = 10
            java.lang.Integer r1 = e0(r0, r1)
            return r1
    }

    public static java.lang.Long g0(java.lang.String r19) {
            r0 = r19
            r0.getClass()
            r1 = 10
            a.a.w(r1)
            int r2 = r0.length()
            if (r2 != 0) goto L11
            goto L65
        L11:
            r3 = 0
            char r4 = r0.charAt(r3)
            r5 = 48
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r5) goto L36
            r5 = 1
            if (r2 != r5) goto L23
            goto L65
        L23:
            r8 = 43
            if (r4 == r8) goto L30
            r3 = 45
            if (r4 == r3) goto L2c
            goto L65
        L2c:
            r6 = -9223372036854775808
            r3 = r5
            goto L37
        L30:
            r18 = r5
            r5 = r3
            r3 = r18
            goto L37
        L36:
            r5 = r3
        L37:
            r8 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r8
        L3f:
            if (r3 >= r2) goto L6b
            char r4 = r0.charAt(r3)
            int r4 = java.lang.Character.digit(r4, r1)
            if (r4 >= 0) goto L4c
            goto L65
        L4c:
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L5c
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 != 0) goto L65
            long r12 = (long) r1
            long r12 = r6 / r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L5c
            goto L65
        L5c:
            long r14 = (long) r1
            long r10 = r10 * r14
            long r14 = (long) r4
            long r16 = r6 + r14
            int r4 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r4 >= 0) goto L67
        L65:
            r0 = 0
            return r0
        L67:
            long r10 = r10 - r14
            int r3 = r3 + 1
            goto L3f
        L6b:
            if (r5 == 0) goto L72
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            return r0
        L72:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }
}
