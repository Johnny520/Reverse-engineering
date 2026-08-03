package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p.c f9872a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p.c f9873b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p.c0 f9874c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o9.e f9875d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o9.e f9876e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o9.e f9877f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o9.e f9878g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f9879h = 9;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f9880i = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f9881j = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f9882k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f9883l = 15;

    static {
            p.c r0 = new p.c
            r1 = 0
            r0.<init>(r1)
            p.d.f9872a = r0
            p.c r0 = new p.c
            r1 = 1
            r0.<init>(r1)
            p.d.f9873b = r0
            p.c0 r0 = new p.c0
            r0.<init>()
            p.d.f9874c = r0
            o9.e r0 = new o9.e
            r1 = 5
            r0.<init>(r1)
            p.d.f9875d = r0
            o9.e r0 = new o9.e
            r1 = 6
            r0.<init>(r1)
            p.d.f9876e = r0
            o9.e r0 = new o9.e
            r1 = 7
            r0.<init>(r1)
            p.d.f9877f = r0
            o9.e r0 = new o9.e
            r1 = 8
            r0.<init>(r1)
            p.d.f9878g = r0
            return
    }

    public static p.z0 a(int r2, float r3) {
            r0 = 0
            float r1 = (float) r0
            r2 = r2 & 2
            if (r2 == 0) goto L7
            float r3 = (float) r0
        L7:
            p.z0 r2 = new p.z0
            r2.<init>(r1, r3, r1, r3)
            return r2
    }

    public static p.z0 b(float r3, float r4, int r5) {
            r0 = 0
            float r1 = (float) r0
            float r2 = (float) r0
            r5 = r5 & 8
            if (r5 == 0) goto L8
            float r4 = (float) r0
        L8:
            p.z0 r5 = new p.z0
            r5.<init>(r1, r3, r2, r4)
            return r5
    }

    public static final void c(i0.h0 r5, y0.o r6) {
            p.n r0 = p.n.f9953c
            long r1 = r5.T
            int r1 = java.lang.Long.hashCode(r1)
            y0.o r6 = y0.a.c(r5, r6)
            s0.h r2 = r5.l()
            x1.f r3 = x1.g.f20914f
            r3.getClass()
            x1.y r3 = x1.f.f20883b
            x1.f2 r4 = r5.f5894a
            r5.d0()
            boolean r4 = r5.S
            if (r4 == 0) goto L24
            r5.k(r3)
            goto L27
        L24:
            r5.n0()
        L27:
            x1.e r3 = x1.f.f20886e
            i0.r.A(r3, r5, r0)
            x1.e r0 = x1.f.f20885d
            i0.r.A(r0, r5, r2)
            x1.d r0 = x1.f.f20888g
            i0.r.w(r0, r5)
            x1.e r0 = x1.f.f20884c
            i0.r.A(r0, r5, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            x1.e r0 = x1.f.f20887f
            i0.r.A(r0, r5, r6)
            r6 = 1
            r5.p(r6)
            return
    }

    public static final p.j0 d(p.b r2, i0.h0 r3) {
            p.j0 r0 = new p.j0
            i0.m2 r1 = y1.h1.f21946h
            java.lang.Object r3 = r3.j(r1)
            u2.c r3 = (u2.c) r3
            r0.<init>(r2, r3)
            return r0
    }

    public static final p.c1 e(v1.m0 r1) {
            java.lang.Object r1 = r1.X()
            boolean r0 = r1 instanceof p.c1
            if (r0 == 0) goto Lb
            p.c1 r1 = (p.c1) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static final float f(p.c1 r0) {
            if (r0 == 0) goto L5
            float r0 = r0.f9869a
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static final y0.o g() {
            p.l0 r0 = new p.l0
            r0.<init>()
            return r0
    }

    public static v1.o0 h(p.b1 r22, int r23, int r24, int r25, int r26, int r27, v1.p0 r28, java.util.List r29, v1.b1[] r30, int r31) {
            r0 = r22
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r29
            r5 = r31
            long r6 = (long) r3
            int[] r8 = new int[r5]
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L17:
            if (r11 >= r5) goto L88
            java.lang.Object r17 = r4.get(r11)
            r9 = r17
            v1.m0 r9 = (v1.m0) r9
            p.c1 r17 = e(r9)
            float r17 = f(r17)
            int r18 = (r17 > r16 ? 1 : (r17 == r16 ? 0 : -1))
            if (r18 <= 0) goto L36
            float r15 = r15 + r17
            int r12 = r12 + 1
            r18 = r6
            r20 = r11
            goto L83
        L36:
            int r14 = r1 - r13
            r17 = r30[r11]
            r18 = r6
            if (r17 != 0) goto L61
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r6) goto L4c
            r20 = r11
            r21 = r12
            r6 = 2147483647(0x7fffffff, float:NaN)
        L4a:
            r7 = 0
            goto L56
        L4c:
            r20 = r11
            r21 = r12
            if (r14 >= 0) goto L54
            r6 = 0
            goto L4a
        L54:
            r6 = r14
            goto L4a
        L56:
            long r11 = r0.b(r7, r6, r2, r7)
            v1.b1 r17 = r9.Q(r11)
        L5e:
            r6 = r17
            goto L66
        L61:
            r20 = r11
            r21 = r12
            goto L5e
        L66:
            int r7 = r0.d(r6)
            int r9 = r0.e(r6)
            r8[r20] = r7
            int r11 = r14 - r7
            if (r11 >= 0) goto L75
            r11 = 0
        L75:
            int r14 = java.lang.Math.min(r3, r11)
            int r7 = r7 + r14
            int r13 = r13 + r7
            int r10 = java.lang.Math.max(r10, r9)
            r30[r20] = r6
            r12 = r21
        L83:
            int r11 = r20 + 1
            r6 = r18
            goto L17
        L88:
            r18 = r6
            r21 = r12
            if (r21 != 0) goto L92
            int r13 = r13 - r14
            r7 = 0
            goto L14d
        L92:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r6) goto L99
            r3 = r1
            goto L9b
        L99:
            r3 = r23
        L9b:
            r6 = 1
            int r12 = r21 + (-1)
            long r11 = (long) r12
            long r11 = r11 * r18
            int r3 = r3 - r13
            long r6 = (long) r3
            long r6 = r6 - r11
            r18 = 0
            int r3 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r3 >= 0) goto Lac
            r6 = r18
        Lac:
            float r3 = (float) r6
            float r3 = r3 / r15
            r9 = 0
        Laf:
            if (r9 >= r5) goto Lc9
            java.lang.Object r14 = r4.get(r9)
            v1.m0 r14 = (v1.m0) r14
            p.c1 r14 = e(r14)
            float r14 = f(r14)
            float r14 = r14 * r3
            int r14 = java.lang.Math.round(r14)
            long r14 = (long) r14
            long r6 = r6 - r14
            int r9 = r9 + 1
            goto Laf
        Lc9:
            r14 = r10
            r9 = 0
            r10 = 0
        Lcc:
            if (r9 >= r5) goto L141
            r15 = r30[r9]
            if (r15 != 0) goto L133
            java.lang.Object r15 = r4.get(r9)
            v1.m0 r15 = (v1.m0) r15
            p.c1 r1 = e(r15)
            float r17 = f(r1)
            int r18 = (r17 > r16 ? 1 : (r17 == r16 ? 0 : -1))
            if (r18 <= 0) goto Le7
        Le4:
            r18 = r3
            goto Led
        Le7:
            java.lang.String r18 = "All weights <= 0 should have placeables"
            q.a.b(r18)
            goto Le4
        Led:
            int r3 = java.lang.Long.signum(r6)
            r19 = r6
            long r6 = (long) r3
            long r6 = r19 - r6
            float r17 = r17 * r18
            int r17 = java.lang.Math.round(r17)
            int r3 = r17 + r3
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
            if (r1 == 0) goto L108
            boolean r1 = r1.f9870b
            goto L109
        L108:
            r1 = 1
        L109:
            if (r1 == 0) goto L113
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r1) goto L116
            r4 = r3
        L111:
            r1 = 1
            goto L118
        L113:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L116:
            r4 = 0
            goto L111
        L118:
            long r3 = r0.b(r4, r3, r2, r1)
            v1.b1 r3 = r15.Q(r3)
            int r4 = r0.d(r3)
            int r15 = r0.e(r3)
            r8[r9] = r4
            int r10 = r10 + r4
            int r4 = java.lang.Math.max(r14, r15)
            r30[r9] = r3
            r14 = r4
            goto L138
        L133:
            r18 = r3
            r19 = r6
            r1 = 1
        L138:
            int r9 = r9 + 1
            r1 = r25
            r4 = r29
            r3 = r18
            goto Lcc
        L141:
            long r1 = (long) r10
            long r1 = r1 + r11
            int r7 = (int) r1
            int r1 = r25 - r13
            if (r7 >= 0) goto L149
            r7 = 0
        L149:
            if (r7 <= r1) goto L14c
            r7 = r1
        L14c:
            r10 = r14
        L14d:
            int r7 = r7 + r13
            if (r7 >= 0) goto L151
            r7 = 0
        L151:
            r1 = r23
            int r4 = java.lang.Math.max(r7, r1)
            r1 = r24
            r7 = 0
            int r1 = java.lang.Math.max(r1, r7)
            int r1 = java.lang.Math.max(r10, r1)
            int[] r3 = new int[r5]
            r2 = r28
            r0.j(r4, r2, r8, r3)
            r5 = r1
            r1 = r30
            v1.o0 r0 = r0.f(r1, r2, r3, r4, r5)
            return r0
    }

    public static final y0.o i(y0.o r1, fg.l r2) {
            p.t0 r0 = new p.t0
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final y0.o j(y0.o r1, fg.l r2) {
            p.v r0 = new p.v
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final y0.o k(y0.o r1, p.x0 r2) {
            p.y0 r0 = new p.y0
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final y0.o l(y0.o r1, float r2) {
            p.v0 r0 = new p.v0
            r0.<init>(r2, r2, r2, r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final y0.o m(y0.o r1, float r2, float r3) {
            p.v0 r0 = new p.v0
            r0.<init>(r2, r3, r2, r3)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static y0.o n(y0.o r2, float r3, float r4, int r5) {
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            float r3 = (float) r1
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            float r4 = (float) r1
        Lb:
            y0.o r2 = m(r2, r3, r4)
            return r2
    }

    public static final y0.o o(y0.o r1, float r2, float r3, float r4, float r5) {
            p.v0 r0 = new p.v0
            r0.<init>(r2, r3, r4, r5)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static y0.o p(y0.o r2, float r3, float r4, float r5, float r6, int r7) {
            r0 = r7 & 1
            r1 = 0
            if (r0 == 0) goto L6
            float r3 = (float) r1
        L6:
            r0 = r7 & 2
            if (r0 == 0) goto Lb
            float r4 = (float) r1
        Lb:
            r0 = r7 & 4
            if (r0 == 0) goto L10
            float r5 = (float) r1
        L10:
            r7 = r7 & 8
            if (r7 == 0) goto L15
            float r6 = (float) r1
        L15:
            y0.o r2 = o(r2, r3, r4, r5, r6)
            return r2
    }

    public static final p.k0 q(b3.a r4) {
            p.k0 r0 = new p.k0
            int r1 = r4.f445a
            int r2 = r4.f446b
            int r3 = r4.f447c
            int r4 = r4.f448d
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static final void r(java.lang.StringBuilder r1, java.lang.String r2) {
            int r0 = r1.length()
            if (r0 <= 0) goto Lb
            r0 = 43
            r1.append(r0)
        Lb:
            r1.append(r2)
            return
    }

    public static final y0.o s(y0.o r1, p.n0 r2) {
            p.o0 r0 = new p.o0
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final y0.o t(y0.o r1, fg.l r2) {
            p.j1 r0 = new p.j1
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final y0.o u(y0.o r1, p.s0 r2) {
            p.g0 r0 = new p.g0
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }
}
