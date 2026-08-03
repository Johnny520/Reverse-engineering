package p0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p0.j f10065e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0.b f10068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f10069d;

    static {
            p0.j r0 = new p0.j
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r0.<init>(r1, r1, r2, r3)
            p0.j.f10065e = r0
            return
    }

    public j(int r1, int r2, java.lang.Object[] r3, r0.b r4) {
            r0 = this;
            r0.<init>()
            r0.f10066a = r1
            r0.f10067b = r2
            r0.f10068c = r4
            r0.f10069d = r3
            return
    }

    public static p0.j j(int r11, java.lang.Object r12, java.lang.Object r13, int r14, java.lang.Object r15, java.lang.Object r16, int r17, r0.b r18) {
            r5 = r16
            r0 = r17
            r7 = r18
            r1 = 30
            r8 = 0
            if (r0 <= r1) goto L15
            p0.j r11 = new p0.j
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r15, r5}
            r11.<init>(r8, r8, r12, r7)
            return r11
        L15:
            int r9 = be.h.B(r11, r0)
            int r1 = be.h.B(r14, r0)
            r10 = 1
            if (r9 == r1) goto L45
            r11 = 3
            r14 = 2
            r0 = 4
            if (r9 >= r1) goto L30
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r8] = r12
            r0[r10] = r13
            r0[r14] = r15
            r0[r11] = r5
            goto L3a
        L30:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r8] = r15
            r0[r10] = r5
            r0[r14] = r12
            r0[r11] = r13
        L3a:
            p0.j r11 = new p0.j
            int r12 = r10 << r9
            int r13 = r10 << r1
            r12 = r12 | r13
            r11.<init>(r12, r8, r0, r7)
            return r11
        L45:
            int r6 = r0 + 5
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            p0.j r11 = j(r0, r1, r2, r3, r4, r5, r6, r7)
            p0.j r12 = new p0.j
            int r13 = r10 << r9
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            r12.<init>(r8, r13, r11, r7)
            return r12
    }

    public final java.lang.Object[] a(int r10, int r11, int r12, java.lang.Object r13, java.lang.Object r14, int r15, r0.b r16) {
            r9 = this;
            java.lang.Object[] r0 = r9.f10069d
            r2 = r0[r10]
            r0 = 0
            if (r2 == 0) goto Lc
            int r1 = r2.hashCode()
            goto Ld
        Lc:
            r1 = r0
        Ld:
            java.lang.Object r3 = r9.x(r10)
            int r7 = r15 + 5
            r4 = r12
            r5 = r13
            r6 = r14
            r8 = r16
            p0.j r12 = j(r1, r2, r3, r4, r5, r6, r7, r8)
            int r11 = r9.t(r11)
            int r13 = r11 + 1
            java.lang.Object[] r14 = r9.f10069d
            int r1 = r11 + (-1)
            int r2 = r14.length
            int r2 = r2 + (-1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 6
            tf.l.r0(r0, r10, r14, r3, r2)
            int r0 = r10 + 2
            tf.l.n0(r10, r0, r14, r13, r2)
            r2[r1] = r12
            int r10 = r14.length
            tf.l.n0(r11, r13, r14, r10, r2)
            return r2
    }

    public final int b() {
            r4 = this;
            int r0 = r4.f10067b
            if (r0 != 0) goto La
            java.lang.Object[] r0 = r4.f10069d
            int r0 = r0.length
            int r0 = r0 / 2
            return r0
        La:
            int r0 = r4.f10066a
            int r0 = java.lang.Integer.bitCount(r0)
            int r1 = r0 * 2
            java.lang.Object[] r2 = r4.f10069d
            int r2 = r2.length
        L15:
            if (r1 >= r2) goto L23
            p0.j r3 = r4.s(r1)
            int r3 = r3.b()
            int r0 = r0 + r3
            int r1 = r1 + 1
            goto L15
        L23:
            return r0
    }

    public final boolean c(java.lang.Object r6) {
            r5 = this;
            java.lang.Object[] r0 = r5.f10069d
            int r0 = r0.length
            r1 = 0
            lg.d r0 = r9.e0.r0(r1, r0)
            r2 = 2
            lg.b r0 = r9.e0.n0(r0, r2)
            int r2 = r0.f8042g
            int r3 = r0.f8043h
            int r0 = r0.f8044i
            if (r0 <= 0) goto L17
            if (r2 <= r3) goto L1b
        L17:
            if (r0 >= 0) goto L2b
            if (r3 > r2) goto L2b
        L1b:
            java.lang.Object[] r4 = r5.f10069d
            r4 = r4[r2]
            boolean r4 = gg.l.a(r6, r4)
            if (r4 == 0) goto L27
            r6 = 1
            return r6
        L27:
            if (r2 == r3) goto L2b
            int r2 = r2 + r0
            goto L1b
        L2b:
            return r1
    }

    public final boolean d(int r3, int r4, java.lang.Object r5) {
            r2 = this;
            r0 = 1
            int r1 = be.h.B(r3, r4)
            int r0 = r0 << r1
            boolean r1 = r2.h(r0)
            if (r1 == 0) goto L19
            int r3 = r2.f(r0)
            java.lang.Object[] r4 = r2.f10069d
            r3 = r4[r3]
            boolean r3 = gg.l.a(r5, r3)
            return r3
        L19:
            boolean r1 = r2.i(r0)
            if (r1 == 0) goto L37
            int r0 = r2.t(r0)
            p0.j r0 = r2.s(r0)
            r1 = 30
            if (r4 != r1) goto L30
            boolean r3 = r0.c(r5)
            return r3
        L30:
            int r4 = r4 + 5
            boolean r3 = r0.d(r3, r4, r5)
            return r3
        L37:
            r3 = 0
            return r3
    }

    public final boolean e(p0.j r6) {
            r5 = this;
            if (r5 != r6) goto L3
            goto L26
        L3:
            int r0 = r5.f10067b
            int r1 = r6.f10067b
            r2 = 0
            if (r0 == r1) goto Lb
            goto L22
        Lb:
            int r0 = r5.f10066a
            int r1 = r6.f10066a
            if (r0 == r1) goto L12
            goto L22
        L12:
            java.lang.Object[] r0 = r5.f10069d
            int r0 = r0.length
            r1 = r2
        L16:
            if (r1 >= r0) goto L26
            java.lang.Object[] r3 = r5.f10069d
            r3 = r3[r1]
            java.lang.Object[] r4 = r6.f10069d
            r4 = r4[r1]
            if (r3 == r4) goto L23
        L22:
            return r2
        L23:
            int r1 = r1 + 1
            goto L16
        L26:
            r6 = 1
            return r6
    }

    public final int f(int r2) {
            r1 = this;
            int r0 = r1.f10066a
            int r2 = r2 + (-1)
            r2 = r2 & r0
            int r2 = java.lang.Integer.bitCount(r2)
            int r2 = r2 * 2
            return r2
    }

    public final java.lang.Object g(int r4, int r5, java.lang.Object r6) {
            r3 = this;
            r0 = 1
            int r1 = be.h.B(r4, r5)
            int r0 = r0 << r1
            boolean r1 = r3.h(r0)
            if (r1 == 0) goto L1f
            int r4 = r3.f(r0)
            java.lang.Object[] r5 = r3.f10069d
            r5 = r5[r4]
            boolean r5 = gg.l.a(r6, r5)
            if (r5 == 0) goto L66
            java.lang.Object r4 = r3.x(r4)
            return r4
        L1f:
            boolean r1 = r3.i(r0)
            if (r1 == 0) goto L66
            int r0 = r3.t(r0)
            p0.j r0 = r3.s(r0)
            r1 = 30
            if (r5 != r1) goto L5f
            java.lang.Object[] r4 = r0.f10069d
            int r4 = r4.length
            r5 = 0
            lg.d r4 = r9.e0.r0(r5, r4)
            r5 = 2
            lg.b r4 = r9.e0.n0(r4, r5)
            int r5 = r4.f8042g
            int r1 = r4.f8043h
            int r4 = r4.f8044i
            if (r4 <= 0) goto L48
            if (r5 <= r1) goto L4c
        L48:
            if (r4 >= 0) goto L66
            if (r1 > r5) goto L66
        L4c:
            java.lang.Object[] r2 = r0.f10069d
            r2 = r2[r5]
            boolean r2 = gg.l.a(r6, r2)
            if (r2 == 0) goto L5b
            java.lang.Object r4 = r0.x(r5)
            return r4
        L5b:
            if (r5 == r1) goto L66
            int r5 = r5 + r4
            goto L4c
        L5f:
            int r5 = r5 + 5
            java.lang.Object r4 = r0.g(r4, r5, r6)
            return r4
        L66:
            r4 = 0
            return r4
    }

    public final boolean h(int r2) {
            r1 = this;
            int r0 = r1.f10066a
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final boolean i(int r2) {
            r1 = this;
            int r0 = r1.f10067b
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    public final p0.j k(int r4, s0.g r5) {
            r3 = this;
            int r0 = r5.f12193k
            int r0 = r0 + (-1)
            r5.f(r0)
            java.lang.Object r0 = r3.x(r4)
            r5.f12191i = r0
            java.lang.Object[] r0 = r3.f10069d
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L15
            r4 = 0
            return r4
        L15:
            r0.b r1 = r3.f10068c
            r0.b r2 = r5.f12189g
            if (r1 != r2) goto L22
            java.lang.Object[] r4 = be.h.e(r4, r0)
            r3.f10069d = r4
            return r3
        L22:
            java.lang.Object[] r4 = be.h.e(r4, r0)
            p0.j r0 = new p0.j
            r0.b r5 = r5.f12189g
            r1 = 0
            r0.<init>(r1, r1, r4, r5)
            return r0
    }

    public final p0.j l(int r11, java.lang.Object r12, java.lang.Object r13, int r14, s0.g r15) {
            r10 = this;
            int r0 = be.h.B(r11, r14)
            r1 = 1
            int r4 = r1 << r0
            boolean r0 = r10.h(r4)
            r0.b r2 = r10.f10068c
            if (r0 == 0) goto L87
            int r3 = r10.f(r4)
            java.lang.Object[] r0 = r10.f10069d
            r0 = r0[r3]
            boolean r0 = gg.l.a(r12, r0)
            if (r0 == 0) goto L51
            java.lang.Object r11 = r10.x(r3)
            r15.f12191i = r11
            java.lang.Object r11 = r10.x(r3)
            if (r11 != r13) goto L2c
            r12 = r10
            goto L112
        L2c:
            r0.b r11 = r15.f12189g
            if (r2 != r11) goto L36
            java.lang.Object[] r11 = r10.f10069d
            int r3 = r3 + r1
            r11[r3] = r13
            return r10
        L36:
            int r11 = r15.f12192j
            int r11 = r11 + r1
            r15.f12192j = r11
            java.lang.Object[] r11 = r10.f10069d
            int r12 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
            int r3 = r3 + r1
            r11[r3] = r13
            p0.j r12 = new p0.j
            int r13 = r10.f10066a
            int r14 = r10.f10067b
            r0.b r15 = r15.f12189g
            r12.<init>(r13, r14, r11, r15)
            return r12
        L51:
            int r0 = r15.f12193k
            int r0 = r0 + r1
            r15.f(r0)
            r0.b r9 = r15.f12189g
            if (r2 != r9) goto L71
            r2 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            java.lang.Object[] r11 = r2.a(r3, r4, r5, r6, r7, r8, r9)
            r2.f10069d = r11
            int r11 = r2.f10066a
            r11 = r11 ^ r4
            r2.f10066a = r11
            int r11 = r2.f10067b
            r11 = r11 | r4
            r2.f10067b = r11
            return r2
        L71:
            r2 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            java.lang.Object[] r11 = r2.a(r3, r4, r5, r6, r7, r8, r9)
            r12 = r2
            p0.j r13 = new p0.j
            int r14 = r12.f10066a
            r14 = r14 ^ r4
            int r15 = r12.f10067b
            r15 = r15 | r4
            r13.<init>(r14, r15, r11, r9)
            return r13
        L87:
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r12 = r10
            boolean r11 = r10.i(r4)
            if (r11 == 0) goto L11a
            int r11 = r10.t(r4)
            p0.j r0 = r10.s(r11)
            r13 = 30
            if (r8 != r13) goto L106
            java.lang.Object[] r13 = r0.f10069d
            int r13 = r13.length
            r14 = 0
            lg.d r13 = r9.e0.r0(r14, r13)
            r2 = 2
            lg.b r13 = r9.e0.n0(r13, r2)
            int r2 = r13.f8042g
            int r3 = r13.f8043h
            int r13 = r13.f8044i
            if (r13 <= 0) goto Lb5
            if (r2 <= r3) goto Lb9
        Lb5:
            if (r13 >= 0) goto Lf1
            if (r3 > r2) goto Lf1
        Lb9:
            java.lang.Object[] r4 = r0.f10069d
            r4 = r4[r2]
            boolean r4 = gg.l.a(r6, r4)
            if (r4 == 0) goto Led
            java.lang.Object r13 = r0.x(r2)
            r15.f12191i = r13
            r0.b r13 = r0.f10068c
            r0.b r3 = r15.f12189g
            if (r13 != r3) goto Ld6
            java.lang.Object[] r13 = r0.f10069d
            int r2 = r2 + r1
            r13[r2] = r7
            r1 = r0
            goto L104
        Ld6:
            int r13 = r15.f12192j
            int r13 = r13 + r1
            r15.f12192j = r13
            java.lang.Object[] r13 = r0.f10069d
            int r3 = r13.length
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r3)
            int r2 = r2 + r1
            r13[r2] = r7
            p0.j r1 = new p0.j
            r0.b r2 = r15.f12189g
            r1.<init>(r14, r14, r13, r2)
            goto L104
        Led:
            if (r2 == r3) goto Lf1
            int r2 = r2 + r13
            goto Lb9
        Lf1:
            int r13 = r15.f12193k
            int r13 = r13 + r1
            r15.f(r13)
            java.lang.Object[] r13 = r0.f10069d
            java.lang.Object[] r13 = be.h.d(r14, r6, r7, r13)
            p0.j r1 = new p0.j
            r0.b r2 = r15.f12189g
            r1.<init>(r14, r14, r13, r2)
        L104:
            r5 = r15
            goto L110
        L106:
            int r4 = r8 + 5
            r1 = r5
            r2 = r6
            r3 = r7
            r5 = r15
            p0.j r1 = r0.l(r1, r2, r3, r4, r5)
        L110:
            if (r0 != r1) goto L113
        L112:
            return r12
        L113:
            r0.b r13 = r5.f12189g
            p0.j r11 = r10.r(r11, r1, r13)
            return r11
        L11a:
            r5 = r15
            int r11 = r5.f12193k
            int r11 = r11 + r1
            r5.f(r11)
            r0.b r11 = r5.f12189g
            int r13 = r10.f(r4)
            java.lang.Object[] r14 = r12.f10069d
            if (r2 != r11) goto L137
            java.lang.Object[] r11 = be.h.d(r13, r6, r7, r14)
            r12.f10069d = r11
            int r11 = r12.f10066a
            r11 = r11 | r4
            r12.f10066a = r11
            return r12
        L137:
            java.lang.Object[] r13 = be.h.d(r13, r6, r7, r14)
            p0.j r14 = new p0.j
            int r15 = r12.f10066a
            r15 = r15 | r4
            int r0 = r12.f10067b
            r14.<init>(r15, r0, r13, r11)
            return r14
    }

    public final p0.j m(p0.j r28, int r29, r0.a r30, s0.g r31) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r9 = r31
            if (r0 != r1) goto L16
            int r1 = r0.b()
            int r2 = r3.f11304a
            int r2 = r2 + r1
            r3.f11304a = r2
            return r0
        L16:
            r4 = 30
            r5 = 2
            r10 = 0
            if (r2 <= r4) goto L8c
            r0.b r2 = r9.f12189g
            int r4 = r1.f10067b
            java.lang.Object[] r4 = r0.f10069d
            int r6 = r4.length
            java.lang.Object[] r7 = r1.f10069d
            int r7 = r7.length
            int r6 = r6 + r7
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r6)
            java.lang.Object[] r6 = r0.f10069d
            int r6 = r6.length
            java.lang.Object[] r7 = r1.f10069d
            int r7 = r7.length
            lg.d r7 = r9.e0.r0(r10, r7)
            lg.b r5 = r9.e0.n0(r7, r5)
            int r7 = r5.f8042g
            int r8 = r5.f8043h
            int r5 = r5.f8044i
            if (r5 <= 0) goto L43
            if (r7 <= r8) goto L47
        L43:
            if (r5 >= 0) goto L6c
            if (r8 > r7) goto L6c
        L47:
            java.lang.Object[] r9 = r1.f10069d
            r9 = r9[r7]
            boolean r9 = r0.c(r9)
            if (r9 != 0) goto L62
            java.lang.Object[] r9 = r1.f10069d
            r11 = r9[r7]
            r4[r6] = r11
            int r11 = r6 + 1
            int r12 = r7 + 1
            r9 = r9[r12]
            r4[r11] = r9
            int r6 = r6 + 2
            goto L68
        L62:
            int r9 = r3.f11304a
            int r9 = r9 + 1
            r3.f11304a = r9
        L68:
            if (r7 == r8) goto L6c
            int r7 = r7 + r5
            goto L47
        L6c:
            java.lang.Object[] r3 = r0.f10069d
            int r3 = r3.length
            if (r6 != r3) goto L73
            goto L23a
        L73:
            java.lang.Object[] r3 = r1.f10069d
            int r3 = r3.length
            if (r6 != r3) goto L79
            return r1
        L79:
            int r1 = r4.length
            if (r6 != r1) goto L82
            p0.j r1 = new p0.j
            r1.<init>(r10, r10, r4, r2)
            return r1
        L82:
            p0.j r1 = new p0.j
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r6)
            r1.<init>(r10, r10, r3, r2)
            return r1
        L8c:
            int r4 = r0.f10067b
            int r6 = r1.f10067b
            r4 = r4 | r6
            int r6 = r0.f10066a
            int r7 = r1.f10066a
            r8 = r6 ^ r7
            int r11 = ~r4
            r8 = r8 & r11
            r6 = r6 & r7
            r11 = r8
        L9b:
            if (r6 == 0) goto Lbe
            int r7 = java.lang.Integer.lowestOneBit(r6)
            int r8 = r0.f(r7)
            java.lang.Object[] r12 = r0.f10069d
            r8 = r12[r8]
            int r12 = r1.f(r7)
            java.lang.Object[] r13 = r1.f10069d
            r12 = r13[r12]
            boolean r8 = gg.l.a(r8, r12)
            if (r8 == 0) goto Lbb
            r8 = r11 | r7
            r11 = r8
            goto Lbc
        Lbb:
            r4 = r4 | r7
        Lbc:
            r6 = r6 ^ r7
            goto L9b
        Lbe:
            r6 = r4 & r11
            if (r6 != 0) goto Lc3
            goto Lc8
        Lc3:
            java.lang.String r6 = "Check failed."
            i0.n1.b(r6)
        Lc8:
            r0.b r6 = r0.f10068c
            r0.b r7 = r9.f12189g
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto Ldc
            int r6 = r0.f10066a
            if (r6 != r11) goto Ldc
            int r6 = r0.f10067b
            if (r6 != r4) goto Ldc
            r12 = r0
            goto Lef
        Ldc:
            int r6 = java.lang.Integer.bitCount(r11)
            int r6 = r6 * r5
            int r5 = java.lang.Integer.bitCount(r4)
            int r5 = r5 + r6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            p0.j r6 = new p0.j
            r7 = 0
            r6.<init>(r11, r4, r5, r7)
            r12 = r6
        Lef:
            r13 = r4
            r14 = r10
        Lf1:
            if (r13 == 0) goto L1ec
            int r15 = java.lang.Integer.lowestOneBit(r13)
            java.lang.Object[] r4 = r12.f10069d
            int r5 = r4.length
            int r5 = r5 + (-1)
            int r16 = r5 - r14
            boolean r5 = r0.i(r15)
            if (r5 == 0) goto L165
            int r5 = r0.t(r15)
            p0.j r5 = r0.s(r5)
            boolean r6 = r1.i(r15)
            if (r6 == 0) goto L124
            int r6 = r1.t(r15)
            p0.j r6 = r1.s(r6)
            int r7 = r2 + 5
            p0.j r5 = r5.m(r6, r7, r3, r9)
            r17 = r4
            goto L1e4
        L124:
            boolean r6 = r1.h(r15)
            if (r6 == 0) goto L160
            int r6 = r1.f(r15)
            java.lang.Object[] r7 = r1.f10069d
            r7 = r7[r6]
            java.lang.Object r6 = r1.x(r6)
            int r8 = r9.f12193k
            if (r7 == 0) goto L13f
            int r17 = r7.hashCode()
            goto L141
        L13f:
            r17 = r10
        L141:
            r18 = r8
            int r8 = r2 + 5
            r10 = r17
            r17 = r4
            r4 = r5
            r5 = r10
            r10 = r7
            r7 = r6
            r6 = r10
            r10 = r18
            p0.j r5 = r4.l(r5, r6, r7, r8, r9)
            int r4 = r9.f12193k
            if (r4 != r10) goto L1e4
            int r4 = r3.f11304a
            int r4 = r4 + 1
            r3.f11304a = r4
            goto L1e4
        L160:
            r17 = r4
            r4 = r5
            goto L1e4
        L165:
            r17 = r4
            boolean r4 = r1.i(r15)
            if (r4 == 0) goto L1ac
            int r4 = r1.t(r15)
            p0.j r4 = r1.s(r4)
            boolean r5 = r0.h(r15)
            if (r5 == 0) goto L199
            int r5 = r0.f(r15)
            java.lang.Object[] r6 = r0.f10069d
            r6 = r6[r5]
            if (r6 == 0) goto L18a
            int r7 = r6.hashCode()
            goto L18b
        L18a:
            r7 = 0
        L18b:
            int r8 = r2 + 5
            boolean r7 = r4.d(r7, r8, r6)
            if (r7 == 0) goto L19b
            int r5 = r3.f11304a
            int r5 = r5 + 1
            r3.f11304a = r5
        L199:
            r5 = r4
            goto L1e4
        L19b:
            java.lang.Object r7 = r0.x(r5)
            if (r6 == 0) goto L1a6
            int r5 = r6.hashCode()
            goto L1a7
        L1a6:
            r5 = 0
        L1a7:
            p0.j r5 = r4.l(r5, r6, r7, r8, r9)
            goto L1e4
        L1ac:
            int r4 = r0.f(r15)
            java.lang.Object[] r5 = r0.f10069d
            r20 = r5[r4]
            java.lang.Object r21 = r0.x(r4)
            int r4 = r1.f(r15)
            java.lang.Object[] r5 = r1.f10069d
            r23 = r5[r4]
            java.lang.Object r24 = r1.x(r4)
            if (r20 == 0) goto L1cd
            int r4 = r20.hashCode()
            r19 = r4
            goto L1cf
        L1cd:
            r19 = 0
        L1cf:
            if (r23 == 0) goto L1d8
            int r4 = r23.hashCode()
            r22 = r4
            goto L1da
        L1d8:
            r22 = 0
        L1da:
            int r25 = r2 + 5
            r0.b r4 = r9.f12189g
            r26 = r4
            p0.j r5 = j(r19, r20, r21, r22, r23, r24, r25, r26)
        L1e4:
            r17[r16] = r5
            int r14 = r14 + 1
            r13 = r13 ^ r15
            r10 = 0
            goto Lf1
        L1ec:
            r10 = 0
        L1ed:
            if (r11 == 0) goto L234
            int r2 = java.lang.Integer.lowestOneBit(r11)
            int r4 = r10 * 2
            boolean r5 = r1.h(r2)
            if (r5 != 0) goto L210
            int r5 = r0.f(r2)
            java.lang.Object[] r6 = r12.f10069d
            java.lang.Object[] r7 = r0.f10069d
            r7 = r7[r5]
            r6[r4] = r7
            int r4 = r4 + 1
            java.lang.Object r5 = r0.x(r5)
            r6[r4] = r5
            goto L230
        L210:
            int r5 = r1.f(r2)
            java.lang.Object[] r6 = r12.f10069d
            java.lang.Object[] r7 = r1.f10069d
            r7 = r7[r5]
            r6[r4] = r7
            int r4 = r4 + 1
            java.lang.Object r5 = r1.x(r5)
            r6[r4] = r5
            boolean r4 = r0.h(r2)
            if (r4 == 0) goto L230
            int r4 = r3.f11304a
            int r4 = r4 + 1
            r3.f11304a = r4
        L230:
            int r10 = r10 + 1
            r11 = r11 ^ r2
            goto L1ed
        L234:
            boolean r2 = r0.e(r12)
            if (r2 == 0) goto L23b
        L23a:
            return r0
        L23b:
            boolean r2 = r1.e(r12)
            if (r2 == 0) goto L242
            return r1
        L242:
            return r12
    }

    public final p0.j n(int r9, java.lang.Object r10, int r11, s0.g r12) {
            r8 = this;
            r0 = 1
            int r1 = be.h.B(r9, r11)
            int r6 = r0 << r1
            boolean r0 = r8.h(r6)
            if (r0 == 0) goto L22
            int r9 = r8.f(r6)
            java.lang.Object[] r11 = r8.f10069d
            r11 = r11[r9]
            boolean r10 = gg.l.a(r10, r11)
            if (r10 == 0) goto L20
            p0.j r9 = r8.p(r9, r6, r12)
            return r9
        L20:
            r2 = r8
            goto L74
        L22:
            boolean r0 = r8.i(r6)
            if (r0 == 0) goto L20
            int r5 = r8.t(r6)
            p0.j r3 = r8.s(r5)
            r0 = 30
            if (r11 != r0) goto L65
            java.lang.Object[] r9 = r3.f10069d
            int r9 = r9.length
            r11 = 0
            lg.d r9 = r9.e0.r0(r11, r9)
            r11 = 2
            lg.b r9 = r9.e0.n0(r9, r11)
            int r11 = r9.f8042g
            int r0 = r9.f8043h
            int r9 = r9.f8044i
            if (r9 <= 0) goto L4b
            if (r11 <= r0) goto L4f
        L4b:
            if (r9 >= 0) goto L62
            if (r0 > r11) goto L62
        L4f:
            java.lang.Object[] r1 = r3.f10069d
            r1 = r1[r11]
            boolean r1 = gg.l.a(r10, r1)
            if (r1 == 0) goto L5e
            p0.j r9 = r3.k(r11, r12)
            goto L63
        L5e:
            if (r11 == r0) goto L62
            int r11 = r11 + r9
            goto L4f
        L62:
            r9 = r3
        L63:
            r4 = r9
            goto L6c
        L65:
            int r11 = r11 + 5
            p0.j r9 = r3.n(r9, r10, r11, r12)
            goto L63
        L6c:
            r0.b r7 = r12.f12189g
            r2 = r8
            p0.j r9 = r2.q(r3, r4, r5, r6, r7)
            return r9
        L74:
            return r2
    }

    public final p0.j o(int r10, java.lang.Object r11, java.lang.Object r12, int r13, s0.g r14) {
            r9 = this;
            r1 = 1
            int r2 = be.h.B(r10, r13)
            int r7 = r1 << r2
            boolean r1 = r9.h(r7)
            if (r1 == 0) goto L2a
            int r10 = r9.f(r7)
            java.lang.Object[] r0 = r9.f10069d
            r0 = r0[r10]
            boolean r11 = gg.l.a(r11, r0)
            if (r11 == 0) goto L8e
            java.lang.Object r11 = r9.x(r10)
            boolean r11 = gg.l.a(r12, r11)
            if (r11 == 0) goto L8e
            p0.j r10 = r9.p(r10, r7, r14)
            return r10
        L2a:
            boolean r1 = r9.i(r7)
            if (r1 == 0) goto L8e
            int r6 = r9.t(r7)
            p0.j r4 = r9.s(r6)
            r1 = 30
            if (r13 != r1) goto L77
            java.lang.Object[] r10 = r4.f10069d
            int r10 = r10.length
            r0 = 0
            lg.d r10 = r9.e0.r0(r0, r10)
            r0 = 2
            lg.b r10 = r9.e0.n0(r10, r0)
            int r0 = r10.f8042g
            int r1 = r10.f8043h
            int r10 = r10.f8044i
            if (r10 <= 0) goto L53
            if (r0 <= r1) goto L57
        L53:
            if (r10 >= 0) goto L74
            if (r1 > r0) goto L74
        L57:
            java.lang.Object[] r2 = r4.f10069d
            r2 = r2[r0]
            boolean r2 = gg.l.a(r11, r2)
            if (r2 == 0) goto L70
            java.lang.Object r2 = r4.x(r0)
            boolean r2 = gg.l.a(r12, r2)
            if (r2 == 0) goto L70
            p0.j r10 = r4.k(r0, r14)
            goto L75
        L70:
            if (r0 == r1) goto L74
            int r0 = r0 + r10
            goto L57
        L74:
            r10 = r4
        L75:
            r0 = r4
            goto L84
        L77:
            int r0 = r13 + 5
            r1 = r4
            r4 = r0
            r0 = r1
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r14
            p0.j r10 = r0.o(r1, r2, r3, r4, r5)
        L84:
            r0.b r8 = r14.f12189g
            r3 = r9
            r5 = r10
            r4 = r0
            p0.j r10 = r3.q(r4, r5, r6, r7, r8)
            return r10
        L8e:
            return r9
    }

    public final p0.j p(int r4, int r5, s0.g r6) {
            r3 = this;
            int r0 = r6.f12193k
            int r0 = r0 + (-1)
            r6.f(r0)
            java.lang.Object r0 = r3.x(r4)
            r6.f12191i = r0
            java.lang.Object[] r0 = r3.f10069d
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L15
            r4 = 0
            return r4
        L15:
            r0.b r1 = r3.f10068c
            r0.b r2 = r6.f12189g
            if (r1 != r2) goto L27
            java.lang.Object[] r4 = be.h.e(r4, r0)
            r3.f10069d = r4
            int r4 = r3.f10066a
            r4 = r4 ^ r5
            r3.f10066a = r4
            return r3
        L27:
            java.lang.Object[] r4 = be.h.e(r4, r0)
            p0.j r0 = new p0.j
            int r1 = r3.f10066a
            r5 = r5 ^ r1
            int r1 = r3.f10067b
            r0.b r6 = r6.f12189g
            r0.<init>(r5, r1, r4, r6)
            return r0
    }

    public final p0.j q(p0.j r3, p0.j r4, int r5, int r6, r0.b r7) {
            r2 = this;
            r0.b r0 = r2.f10068c
            if (r4 != 0) goto L29
            java.lang.Object[] r3 = r2.f10069d
            int r4 = r3.length
            r1 = 1
            if (r4 != r1) goto Lc
            r3 = 0
            return r3
        Lc:
            if (r0 != r7) goto L1a
            java.lang.Object[] r3 = be.h.f(r5, r3)
            r2.f10069d = r3
            int r3 = r2.f10067b
            r3 = r3 ^ r6
            r2.f10067b = r3
            return r2
        L1a:
            java.lang.Object[] r3 = be.h.f(r5, r3)
            p0.j r4 = new p0.j
            int r5 = r2.f10066a
            int r0 = r2.f10067b
            r6 = r6 ^ r0
            r4.<init>(r5, r6, r3, r7)
            return r4
        L29:
            if (r0 == r7) goto L2f
            if (r3 == r4) goto L2e
            goto L2f
        L2e:
            return r2
        L2f:
            p0.j r3 = r2.r(r5, r4, r7)
            return r3
    }

    public final p0.j r(int r4, p0.j r5, r0.b r6) {
            r3 = this;
            java.lang.Object[] r0 = r3.f10069d
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L15
            java.lang.Object[] r1 = r5.f10069d
            int r1 = r1.length
            r2 = 2
            if (r1 != r2) goto L15
            int r1 = r5.f10067b
            if (r1 != 0) goto L15
            int r4 = r3.f10067b
            r5.f10066a = r4
            return r5
        L15:
            r0.b r1 = r3.f10068c
            if (r1 != r6) goto L1c
            r0[r4] = r5
            return r3
        L1c:
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r0[r4] = r5
            p0.j r4 = new p0.j
            int r5 = r3.f10066a
            int r1 = r3.f10067b
            r4.<init>(r5, r1, r0, r6)
            return r4
    }

    public final p0.j s(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f10069d
            r2 = r0[r2]
            r2.getClass()
            p0.j r2 = (p0.j) r2
            return r2
    }

    public final int t(int r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.f10069d
            int r0 = r0.length
            int r0 = r0 + (-1)
            int r1 = r2.f10067b
            int r3 = r3 + (-1)
            r3 = r3 & r1
            int r3 = java.lang.Integer.bitCount(r3)
            int r0 = r0 - r3
            return r0
    }

    public final a5.a u(int r12, java.lang.Object r13, java.lang.Object r14, int r15) {
            r11 = this;
            int r0 = be.h.B(r12, r15)
            r1 = 1
            int r4 = r1 << r0
            boolean r0 = r11.h(r4)
            r2 = 0
            r10 = 0
            if (r0 == 0) goto L5f
            int r3 = r11.f(r4)
            java.lang.Object[] r0 = r11.f10069d
            r0 = r0[r3]
            boolean r0 = gg.l.a(r13, r0)
            if (r0 == 0) goto L41
            java.lang.Object r12 = r11.x(r3)
            if (r12 != r14) goto L26
            r13 = r11
            goto Lda
        L26:
            java.lang.Object[] r12 = r11.f10069d
            int r13 = r12.length
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r13)
            int r3 = r3 + r1
            r12[r3] = r14
            p0.j r13 = new p0.j
            int r14 = r11.f10066a
            int r15 = r11.f10067b
            r13.<init>(r14, r15, r12, r10)
            a5.a r12 = new a5.a
            r14 = 9
            r12.<init>(r2, r14, r13)
            return r12
        L41:
            r9 = 0
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.Object[] r12 = r2.a(r3, r4, r5, r6, r7, r8, r9)
            r13 = r2
            p0.j r14 = new p0.j
            int r15 = r13.f10066a
            r15 = r15 ^ r4
            int r0 = r13.f10067b
            r0 = r0 | r4
            r14.<init>(r15, r0, r12, r10)
            a5.a r12 = new a5.a
            r15 = 9
            r12.<init>(r1, r15, r14)
            return r12
        L5f:
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r13 = r11
            boolean r12 = r11.i(r4)
            if (r12 == 0) goto Le6
            int r12 = r11.t(r4)
            p0.j r14 = r11.s(r12)
            r15 = 30
            if (r8 != r15) goto Ld2
            java.lang.Object[] r15 = r14.f10069d
            int r15 = r15.length
            lg.d r15 = r9.e0.r0(r2, r15)
            r0 = 2
            lg.b r15 = r9.e0.n0(r15, r0)
            int r0 = r15.f8042g
            int r3 = r15.f8043h
            int r15 = r15.f8044i
            if (r15 <= 0) goto L8c
            if (r0 <= r3) goto L90
        L8c:
            if (r15 >= 0) goto Lbd
            if (r3 > r0) goto Lbd
        L90:
            java.lang.Object[] r5 = r14.f10069d
            r5 = r5[r0]
            boolean r5 = gg.l.a(r6, r5)
            if (r5 == 0) goto Lb9
            java.lang.Object r15 = r14.x(r0)
            if (r7 != r15) goto La2
            r14 = r10
            goto Lcf
        La2:
            java.lang.Object[] r14 = r14.f10069d
            int r15 = r14.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
            int r0 = r0 + r1
            r14[r0] = r7
            p0.j r15 = new p0.j
            r15.<init>(r2, r2, r14, r10)
            a5.a r14 = new a5.a
            r0 = 9
            r14.<init>(r2, r0, r15)
            goto Lcf
        Lb9:
            if (r0 == r3) goto Lbd
            int r0 = r0 + r15
            goto L90
        Lbd:
            java.lang.Object[] r14 = r14.f10069d
            java.lang.Object[] r14 = be.h.d(r2, r6, r7, r14)
            p0.j r15 = new p0.j
            r15.<init>(r2, r2, r14, r10)
            a5.a r14 = new a5.a
            r0 = 9
            r14.<init>(r1, r0, r15)
        Lcf:
            if (r14 != 0) goto Ldb
            goto Lda
        Ld2:
            int r15 = r8 + 5
            a5.a r14 = r14.u(r5, r6, r7, r15)
            if (r14 != 0) goto Ldb
        Lda:
            return r10
        Ldb:
            java.lang.Object r15 = r14.f57i
            p0.j r15 = (p0.j) r15
            p0.j r12 = r11.w(r12, r4, r15)
            r14.f57i = r12
            return r14
        Le6:
            int r12 = r11.f(r4)
            java.lang.Object[] r14 = r13.f10069d
            java.lang.Object[] r12 = be.h.d(r12, r6, r7, r14)
            p0.j r14 = new p0.j
            int r15 = r13.f10066a
            r15 = r15 | r4
            int r0 = r13.f10067b
            r14.<init>(r15, r0, r12, r10)
            a5.a r12 = new a5.a
            r15 = 9
            r12.<init>(r1, r15, r14)
            return r12
    }

    public final p0.j v(int r10, int r11, java.lang.Object r12) {
            r9 = this;
            int r0 = be.h.B(r10, r11)
            r1 = 1
            int r0 = r1 << r0
            boolean r2 = r9.h(r0)
            r3 = 2
            r4 = 0
            if (r2 == 0) goto L33
            int r10 = r9.f(r0)
            java.lang.Object[] r11 = r9.f10069d
            r11 = r11[r10]
            boolean r11 = gg.l.a(r12, r11)
            if (r11 == 0) goto La4
            java.lang.Object[] r11 = r9.f10069d
            int r12 = r11.length
            if (r12 != r3) goto L24
            goto L8d
        L24:
            java.lang.Object[] r10 = be.h.e(r10, r11)
            p0.j r11 = new p0.j
            int r12 = r9.f10066a
            r12 = r12 ^ r0
            int r0 = r9.f10067b
            r11.<init>(r12, r0, r10, r4)
            return r11
        L33:
            boolean r2 = r9.i(r0)
            if (r2 == 0) goto La4
            int r2 = r9.t(r0)
            p0.j r5 = r9.s(r2)
            r6 = 30
            if (r11 != r6) goto L80
            java.lang.Object[] r10 = r5.f10069d
            int r10 = r10.length
            r11 = 0
            lg.d r10 = r9.e0.r0(r11, r10)
            lg.b r10 = r9.e0.n0(r10, r3)
            int r6 = r10.f8042g
            int r7 = r10.f8043h
            int r10 = r10.f8044i
            if (r10 <= 0) goto L5b
            if (r6 <= r7) goto L5f
        L5b:
            if (r10 >= 0) goto L7e
            if (r7 > r6) goto L7e
        L5f:
            java.lang.Object[] r8 = r5.f10069d
            r8 = r8[r6]
            boolean r8 = gg.l.a(r12, r8)
            if (r8 == 0) goto L7a
            java.lang.Object[] r10 = r5.f10069d
            int r12 = r10.length
            if (r12 != r3) goto L70
            r12 = r4
            goto L86
        L70:
            java.lang.Object[] r10 = be.h.e(r6, r10)
            p0.j r12 = new p0.j
            r12.<init>(r11, r11, r10, r4)
            goto L86
        L7a:
            if (r6 == r7) goto L7e
            int r6 = r6 + r10
            goto L5f
        L7e:
            r12 = r5
            goto L86
        L80:
            int r11 = r11 + 5
            p0.j r12 = r5.v(r10, r11, r12)
        L86:
            if (r12 != 0) goto L9d
            java.lang.Object[] r10 = r9.f10069d
            int r11 = r10.length
            if (r11 != r1) goto L8e
        L8d:
            return r4
        L8e:
            java.lang.Object[] r10 = be.h.f(r2, r10)
            p0.j r11 = new p0.j
            int r12 = r9.f10066a
            int r1 = r9.f10067b
            r0 = r0 ^ r1
            r11.<init>(r12, r0, r10, r4)
            return r11
        L9d:
            if (r5 == r12) goto La4
            p0.j r10 = r9.w(r2, r0, r12)
            return r10
        La4:
            return r9
    }

    public final p0.j w(int r9, int r10, p0.j r11) {
            r8 = this;
            java.lang.Object[] r0 = r11.f10069d
            int r1 = r0.length
            r2 = 2
            r3 = 0
            if (r1 != r2) goto L45
            int r1 = r11.f10067b
            if (r1 != 0) goto L45
            java.lang.Object[] r1 = r8.f10069d
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto L16
            int r9 = r8.f10067b
            r11.f10066a = r9
            return r11
        L16:
            int r11 = r8.f(r10)
            java.lang.Object[] r1 = r8.f10069d
            r4 = 0
            r4 = r0[r4]
            r0 = r0[r2]
            int r5 = r1.length
            int r5 = r5 + r2
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r1, r5)
            int r6 = r9 + 2
            int r7 = r9 + 1
            int r1 = r1.length
            tf.l.n0(r6, r7, r5, r1, r5)
            int r1 = r11 + 2
            tf.l.n0(r1, r11, r5, r9, r5)
            r5[r11] = r4
            int r11 = r11 + r2
            r5[r11] = r0
            p0.j r9 = new p0.j
            int r11 = r8.f10066a
            r11 = r11 ^ r10
            int r0 = r8.f10067b
            r10 = r10 ^ r0
            r9.<init>(r11, r10, r5, r3)
            return r9
        L45:
            java.lang.Object[] r10 = r8.f10069d
            int r0 = r10.length
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r0)
            r10[r9] = r11
            p0.j r9 = new p0.j
            int r11 = r8.f10066a
            int r0 = r8.f10067b
            r9.<init>(r11, r0, r10, r3)
            return r9
    }

    public final java.lang.Object x(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f10069d
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }
}
