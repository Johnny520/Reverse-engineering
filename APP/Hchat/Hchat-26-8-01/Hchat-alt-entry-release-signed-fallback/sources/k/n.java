package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final void a(y0.o r4, fg.l r5, i0.h0 r6, int r7) {
            r0 = -932836462(0xffffffffc8660b92, float:-235566.28)
            r6.b0(r0)
            boolean r0 = r6.f(r4)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r7
            boolean r1 = r6.h(r5)
            if (r1 == 0) goto L19
            r1 = 32
            goto L1b
        L19:
            r1 = 16
        L1b:
            r0 = r0 | r1
            r1 = r0 & 19
            r2 = 18
            r3 = 1
            if (r1 == r2) goto L25
            r1 = r3
            goto L26
        L25:
            r1 = 0
        L26:
            r0 = r0 & r3
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L35
            y0.o r0 = c1.h.d(r4, r5)
            p.d.c(r6, r0)
            goto L38
        L35:
            r6.V()
        L38:
            i0.r1 r6 = r6.t()
            if (r6 == 0) goto L47
            b0.q r0 = new b0.q
            r1 = 8
            r0.<init>(r4, r5, r7, r1)
            r6.f6035d = r0
        L47:
            return
    }

    public static final void b(k1.b r8, java.lang.String r9, y0.o r10, v1.s0 r11, f1.n r12, i0.h0 r13, int r14) {
            y0.g r0 = y0.b.f21796k
            r1 = 1142754848(0x441d0e20, float:628.2207)
            r13.b0(r1)
            r1 = r14 & 6
            r2 = 2
            if (r1 != 0) goto L21
            r1 = r14 & 8
            if (r1 != 0) goto L16
            boolean r1 = r13.f(r8)
            goto L1a
        L16:
            boolean r1 = r13.h(r8)
        L1a:
            if (r1 == 0) goto L1e
            r1 = 4
            goto L1f
        L1e:
            r1 = r2
        L1f:
            r1 = r1 | r14
            goto L22
        L21:
            r1 = r14
        L22:
            r3 = r14 & 48
            r4 = 32
            if (r3 != 0) goto L33
            boolean r3 = r13.f(r9)
            if (r3 == 0) goto L30
            r3 = r4
            goto L32
        L30:
            r3 = 16
        L32:
            r1 = r1 | r3
        L33:
            r3 = r14 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L43
            boolean r3 = r13.f(r10)
            if (r3 == 0) goto L40
            r3 = 256(0x100, float:3.59E-43)
            goto L42
        L40:
            r3 = 128(0x80, float:1.8E-43)
        L42:
            r1 = r1 | r3
        L43:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L53
            boolean r0 = r13.f(r0)
            if (r0 == 0) goto L50
            r0 = 2048(0x800, float:2.87E-42)
            goto L52
        L50:
            r0 = 1024(0x400, float:1.435E-42)
        L52:
            r1 = r1 | r0
        L53:
            r0 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L63
            boolean r0 = r13.f(r11)
            if (r0 == 0) goto L60
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L62
        L60:
            r0 = 8192(0x2000, float:1.148E-41)
        L62:
            r1 = r1 | r0
        L63:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r14
            if (r0 != 0) goto L76
            r0 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = r13.c(r0)
            if (r0 == 0) goto L73
            r0 = 131072(0x20000, float:1.83671E-40)
            goto L75
        L73:
            r0 = 65536(0x10000, float:9.1835E-41)
        L75:
            r1 = r1 | r0
        L76:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r14
            if (r0 != 0) goto L87
            boolean r0 = r13.f(r12)
            if (r0 == 0) goto L84
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L86
        L84:
            r0 = 524288(0x80000, float:7.34684E-40)
        L86:
            r1 = r1 | r0
        L87:
            r0 = 599187(0x92493, float:8.3964E-40)
            r0 = r0 & r1
            r3 = 599186(0x92492, float:8.39638E-40)
            r5 = 0
            r6 = 1
            if (r0 == r3) goto L94
            r0 = r6
            goto L95
        L94:
            r0 = r5
        L95:
            r3 = r1 & 1
            boolean r0 = r13.S(r3, r0)
            if (r0 == 0) goto L132
            y0.l r0 = y0.l.f21818a
            i0.e r3 = i0.l.f5952a
            if (r9 == 0) goto Lcc
            r7 = 1899222916(0x7133d784, float:8.9053375E29)
            r13.a0(r7)
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r4) goto Laf
            r1 = r6
            goto Lb0
        Laf:
            r1 = r5
        Lb0:
            java.lang.Object r4 = r13.P()
            if (r1 != 0) goto Lb8
            if (r4 != r3) goto Lc2
        Lb8:
            ca.s r4 = new ca.s
            r1 = 9
            r4.<init>(r9, r1)
            r13.k0(r4)
        Lc2:
            fg.l r4 = (fg.l) r4
            y0.o r0 = f2.o.a(r0, r4)
            r13.p(r5)
            goto Ld5
        Lcc:
            r1 = 1899381698(0x713643c2, float:9.02531E29)
            r13.a0(r1)
            r13.p(r5)
        Ld5:
            y0.o r0 = r10.d(r0)
            y0.o r0 = c1.h.c(r0)
            y0.o r0 = c1.h.g(r0, r8, r11, r12, r2)
            java.lang.Object r1 = r13.P()
            if (r1 != r3) goto Lec
            k.u0 r1 = k.u0.f7080a
            r13.k0(r1)
        Lec:
            v1.n0 r1 = (v1.n0) r1
            long r2 = r13.T
            int r2 = java.lang.Long.hashCode(r2)
            y0.o r0 = y0.a.c(r13, r0)
            s0.h r3 = r13.l()
            x1.f r4 = x1.g.f20914f
            r4.getClass()
            x1.y r4 = x1.f.f20883b
            r13.d0()
            boolean r5 = r13.S
            if (r5 == 0) goto L10e
            r13.k(r4)
            goto L111
        L10e:
            r13.n0()
        L111:
            x1.e r4 = x1.f.f20886e
            i0.r.A(r4, r13, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r13, r3)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r13)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r13, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            x1.e r1 = x1.f.f20887f
            i0.r.A(r1, r13, r0)
            r13.p(r6)
            goto L135
        L132:
            r13.V()
        L135:
            i0.r1 r13 = r13.t()
            if (r13 == 0) goto L149
            c9.c0 r0 = new c9.c0
            r7 = 3
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r13.f6035d = r0
        L149:
            return
    }

    public static final void c(m1.f r14, java.lang.String r15, y0.o r16, f1.n r17, i0.h0 r18, int r19) {
            r5 = r18
            r0 = r19
            i0.m2 r1 = y1.h1.f21946h
            java.lang.Object r1 = r5.j(r1)
            u2.c r1 = (u2.c) r1
            int r2 = r14.f8571j
            float r2 = (float) r2
            float r3 = r1.d()
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r6 = (long) r2
            int r2 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r2
            r4 = 32
            long r6 = r6 << r4
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r8
            long r2 = r2 | r6
            boolean r2 = r5.e(r2)
            java.lang.Object r3 = r5.P()
            if (r2 != 0) goto L35
            i0.e r2 = i0.l.f5952a
            if (r3 != r2) goto Lc8
        L35:
            m1.c r2 = new m1.c
            r2.<init>()
            m1.g0 r3 = r14.f8567f
            m1.b.a(r2, r3)
            float r3 = r14.f8563b
            float r6 = r14.f8564c
            float r3 = r1.x0(r3)
            float r1 = r1.x0(r6)
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r3
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r10 = (long) r1
            long r6 = r6 << r4
            long r10 = r10 & r8
            long r6 = r6 | r10
            float r1 = r14.f8565d
            float r3 = r14.f8566e
            boolean r10 = java.lang.Float.isNaN(r1)
            if (r10 == 0) goto L69
            long r10 = r6 >> r4
            int r1 = (int) r10
            float r1 = java.lang.Float.intBitsToFloat(r1)
        L69:
            boolean r10 = java.lang.Float.isNaN(r3)
            if (r10 == 0) goto L76
            long r10 = r6 & r8
            int r3 = (int) r10
            float r3 = java.lang.Float.intBitsToFloat(r3)
        L76:
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r10 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            long r12 = (long) r1
            long r3 = r10 << r4
            long r8 = r8 & r12
            long r3 = r3 | r8
            m1.j0 r1 = new m1.j0
            r1.<init>(r2)
            java.lang.String r2 = r14.f8562a
            long r8 = r14.f8568g
            int r10 = r14.f8569h
            r11 = 16
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 == 0) goto L9b
            f1.n r11 = new f1.n
            r11.<init>(r8, r10)
            goto L9c
        L9b:
            r11 = 0
        L9c:
            boolean r14 = r14.f8570i
            e1.e r8 = new e1.e
            r8.<init>(r6)
            i0.j1 r6 = r1.f8616e
            r6.setValue(r8)
            i0.j1 r6 = r1.f8617f
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            r6.setValue(r14)
            m1.e0 r14 = r1.f8618g
            i0.j1 r6 = r14.f8553g
            r6.setValue(r11)
            i0.j1 r6 = r14.f8555i
            e1.e r7 = new e1.e
            r7.<init>(r3)
            r6.setValue(r7)
            r14.f8549c = r2
            r5.k0(r1)
            r3 = r1
        Lc8:
            m1.j0 r3 = (m1.j0) r3
            r14 = r0 & 112(0x70, float:1.57E-43)
            r1 = 8
            r14 = r14 | r1
            r1 = r0 & 896(0x380, float:1.256E-42)
            r14 = r14 | r1
            r1 = r0 & 7168(0x1c00, float:1.0045E-41)
            r14 = r14 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r0
            r14 = r14 | r1
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r0
            r14 = r14 | r1
            r1 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r1
            r6 = r14 | r0
            r0 = r3
            v1.s0 r3 = v1.g.f13935b
            r1 = r15
            r2 = r16
            r4 = r17
            b(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static final void d(f1.g r8, java.lang.String r9, y0.o r10, v1.s0 r11, i0.h0 r12, int r13, int r14) {
            r14 = r14 & 16
            if (r14 == 0) goto L6
            v1.s0 r11 = v1.g.f13935b
        L6:
            r3 = r11
            boolean r11 = r12.f(r8)
            java.lang.Object r14 = r12.P()
            if (r11 != 0) goto L15
            i0.e r11 = i0.l.f5952a
            if (r14 != r11) goto L36
        L15:
            android.graphics.Bitmap r11 = r8.f3055a
            int r14 = r11.getWidth()
            int r11 = r11.getHeight()
            long r0 = (long) r14
            r14 = 32
            long r0 = r0 << r14
            long r4 = (long) r11
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r0 = r0 | r4
            k1.a r14 = new k1.a
            r14.<init>(r8, r0)
            r8 = 1
            r14.f7128g = r8
            r12.k0(r14)
        L36:
            r0 = r14
            k1.a r0 = (k1.a) r0
            r8 = r13 & 112(0x70, float:1.57E-43)
            r11 = 8
            r8 = r8 | r11
            r11 = r13 & 896(0x380, float:1.256E-42)
            r8 = r8 | r11
            r11 = r13 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r13
            r8 = r8 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r13
            r8 = r8 | r11
            r11 = 3670016(0x380000, float:5.142788E-39)
            r11 = r11 & r13
            r6 = r8 | r11
            r4 = 0
            r1 = r9
            r2 = r10
            r5 = r12
            b(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static float e(android.widget.EdgeEffect r8, float r9, float r10, u2.c r11) {
            float r0 = k.f0.f6949a
            r0 = 1136724797(0x43c10b3d, float:386.0878)
            float r11 = r11.d()
            float r11 = r11 * r0
            r0 = 1126170624(0x43200000, float:160.0)
            float r11 = r11 * r0
            r0 = 1062668861(0x3f570a3d, float:0.84)
            float r11 = r11 * r0
            double r0 = (double) r11
            r11 = 1051931443(0x3eb33333, float:0.35)
            float r2 = java.lang.Math.abs(r9)
            float r2 = r2 * r11
            double r2 = (double) r2
            float r11 = k.f0.f6949a
            double r4 = (double) r11
            double r4 = r4 * r0
            double r2 = r2 / r4
            double r0 = java.lang.Math.log(r2)
            double r2 = k.f0.f6950b
            double r6 = k.f0.f6951c
            double r2 = r2 / r6
            double r2 = r2 * r0
            double r0 = java.lang.Math.exp(r2)
            double r0 = r0 * r4
            float r11 = (float) r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 31
            if (r0 < r2) goto L3c
            float r3 = k.l.b(r8)
            goto L3d
        L3c:
            r3 = r1
        L3d:
            float r3 = r3 * r10
            int r10 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r10 > 0) goto L56
            int r10 = ig.a.X(r9)
            if (r0 < r2) goto L4c
            r8.onAbsorb(r10)
            return r9
        L4c:
            boolean r11 = r8.isFinished()
            if (r11 == 0) goto L55
            r8.onAbsorb(r10)
        L55:
            return r9
        L56:
            return r1
    }

    public static y0.o f(f1.h0 r6) {
            k.m r0 = new k.m
            r1 = 0
            r5 = 1
            f1.m0 r4 = f1.c0.f3038b
            r3 = r6
            r0.<init>(r1, r3, r4, r5)
            return r0
    }

    public static final y0.o g(y0.o r6, long r7, f1.r0 r9) {
            k.m r0 = new k.m
            r3 = 0
            r5 = 2
            r1 = r7
            r4 = r9
            r0.<init>(r1, r3, r4, r5)
            y0.o r6 = r6.d(r0)
            return r6
    }

    public static final void h(long r2, m.p1 r4) {
            m.p1 r0 = m.p1.f8324g
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r0) goto L14
            int r2 = u2.a.g(r2)
            if (r2 == r1) goto Le
            goto L1a
        Le:
            java.lang.String r2 = "Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."
            o.b.c(r2)
            return
        L14:
            int r2 = u2.a.h(r2)
            if (r2 == r1) goto L1b
        L1a:
            return
        L1b:
            java.lang.String r2 = "Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."
            o.b.c(r2)
            return
    }

    public static y0.o i(y0.o r8, n.k r9, k.y0 r10, boolean r11, f2.i r12, fg.a r13, int r14) {
            r0 = r14 & 4
            if (r0 == 0) goto L5
            r11 = 1
        L5:
            r4 = r11
            r11 = r14 & 16
            if (r11 == 0) goto Lb
            r12 = 0
        Lb:
            r6 = r12
            r5 = 0
            if (r10 == 0) goto L19
            k.u r0 = new k.u
            r3 = 0
            r1 = r9
            r2 = r10
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L43
        L19:
            r1 = r9
            r2 = r10
            r7 = r13
            if (r2 != 0) goto L26
            k.u r0 = new k.u
            r3 = 0
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L43
        L26:
            y0.l r9 = y0.l.f21818a
            if (r1 == 0) goto L3a
            y0.o r9 = k.v0.a(r9, r1, r2)
            k.u r0 = new k.u
            r3 = 0
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            y0.o r0 = r9.d(r0)
            goto L43
        L3a:
            k.v r10 = new k.v
            r10.<init>(r2, r4, r6, r7)
            y0.o r0 = y0.a.a(r9, r10)
        L43:
            y0.o r8 = r8.d(r0)
            return r8
    }

    public static y0.o j(y0.o r8, boolean r9, java.lang.String r10, n.k r11, fg.a r12, int r13) {
            r0 = r13 & 1
            if (r0 == 0) goto L5
            r9 = 1
        L5:
            r4 = r9
            r9 = r13 & 2
            r0 = 0
            if (r9 == 0) goto Ld
            r5 = r0
            goto Le
        Ld:
            r5 = r10
        Le:
            r9 = r13 & 8
            if (r9 == 0) goto L14
            r1 = r0
            goto L15
        L14:
            r1 = r11
        L15:
            k.u r0 = new k.u
            r2 = 0
            r3 = 1
            r6 = 0
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            y0.o r8 = r8.d(r0)
            return r8
    }

    public static y0.o k(y0.o r1, n.k r2, fg.a r3) {
            k.z r0 = new k.z
            r0.<init>(r3, r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final y0.o l(y0.o r0, boolean r1) {
            if (r1 == 0) goto L8
            k.h0 r1 = new k.h0
            r1.<init>()
            goto La
        L8:
            y0.l r1 = y0.l.f21818a
        La:
            y0.o r0 = r0.d(r1)
            return r0
    }

    public static final k.k0 m(x1.j r2) {
            k.b r0 = k.l0.f7008v
            x1.e2 r2 = x1.k.j(r2, r0)
            boolean r0 = r2 instanceof k.l0
            r1 = 0
            if (r0 == 0) goto Le
            k.l0 r2 = (k.l0) r2
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L14
            x1.j r2 = r2.f7009u
            return r2
        L14:
            return r1
    }

    public static final y0.o n(y0.o r0, n.k r1, boolean r2) {
            if (r2 == 0) goto L8
            k.p0 r2 = new k.p0
            r2.<init>(r1)
            goto La
        L8:
            y0.l r2 = y0.l.f21818a
        La:
            y0.o r0 = r0.d(r2)
            return r0
    }

    public static final boolean o(android.view.KeyEvent r4) {
            long r0 = q1.d.b(r4)
            int r4 = q1.a.O
            long r2 = q1.a.f10578h
            boolean r4 = q1.a.a(r0, r2)
            if (r4 != 0) goto L29
            long r2 = q1.a.f10588r
            boolean r4 = q1.a.a(r0, r2)
            if (r4 != 0) goto L29
            long r2 = q1.a.E
            boolean r4 = q1.a.a(r0, r2)
            if (r4 != 0) goto L29
            long r2 = q1.a.f10587q
            boolean r4 = q1.a.a(r0, r2)
            if (r4 == 0) goto L27
            goto L29
        L27:
            r4 = 0
            return r4
        L29:
            r4 = 1
            return r4
    }

    public static final boolean p(i0.h0 r1) {
            i0.u r0 = y1.i0.f21965a
            java.lang.Object r1 = r1.j(r0)
            android.content.res.Configuration r1 = (android.content.res.Configuration) r1
            int r1 = r1.uiMode
            r1 = r1 & 48
            r0 = 32
            if (r1 != r0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static final k.w1 q(i0.h0 r4) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            boolean r2 = r4.d(r0)
            java.lang.Object r3 = r4.P()
            if (r2 != 0) goto L11
            i0.e r2 = i0.l.f5952a
            if (r3 != r2) goto L1a
        L11:
            k.s1 r3 = new k.s1
            r2 = 0
            r3.<init>(r2)
            r4.k0(r3)
        L1a:
            fg.a r3 = (fg.a) r3
            p4.t r2 = k.w1.f7092j
            java.lang.Object r4 = v0.k.e(r1, r2, r3, r4, r0)
            k.w1 r4 = (k.w1) r4
            return r4
    }

    public static final y0.o r(y0.o r10, k.w1 r11, boolean r12, boolean r13) {
            m.p1 r0 = m.p1.f8324g
            if (r12 == 0) goto L6
            r4 = r0
            goto L9
        L6:
            m.p1 r1 = m.p1.f8325h
            r4 = r1
        L9:
            r7 = 0
            r6 = 1
            if (r13 == 0) goto L37
            r5 = r4
            r4 = r7
            n.k r7 = r11.f7096d
            float r13 = k.y.f7111a
            y0.l r13 = y0.l.f21818a
            if (r5 != r0) goto L1e
            k.o0 r0 = k.o0.f7028c
            y0.o r13 = c1.h.b(r13, r0)
            goto L24
        L1e:
            k.o0 r0 = k.o0.f7027b
            y0.o r13 = c1.h.b(r13, r0)
        L24:
            y0.o r10 = r10.d(r13)
            k.x1 r2 = new k.x1
            r9 = 1
            r3 = 0
            r8 = r6
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r3 = r6
            y0.o r10 = r10.d(r2)
            goto L43
        L37:
            r3 = r11
            r5 = r4
            r4 = r7
            n.k r8 = r3.f7096d
            r4 = r5
            r5 = 0
            r2 = r10
            y0.o r10 = s(r2, r3, r4, r5, r6, r7, r8)
        L43:
            k.z1 r11 = new k.z1
            r11.<init>(r3, r12)
            y0.o r10 = r10.d(r11)
            return r10
    }

    public static y0.o s(y0.o r8, m.i2 r9, m.p1 r10, k.k1 r11, boolean r12, m.p r13, n.k r14) {
            float r0 = k.y.f7111a
            m.p1 r0 = m.p1.f8324g
            y0.l r1 = y0.l.f21818a
            if (r10 != r0) goto Lf
            k.o0 r0 = k.o0.f7028c
            y0.o r0 = c1.h.b(r1, r0)
            goto L15
        Lf:
            k.o0 r0 = k.o0.f7027b
            y0.o r0 = c1.h.b(r1, r0)
        L15:
            y0.o r8 = r8.d(r0)
            k.x1 r0 = new k.x1
            r7 = 0
            r4 = r9
            r3 = r10
            r1 = r11
            r6 = r12
            r2 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            y0.o r8 = r8.d(r0)
            return r8
    }

    public static final long t(long r5, float r7) {
            r0 = 32
            long r1 = r5 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 - r7
            r2 = 0
            float r1 = java.lang.Math.max(r2, r1)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = r5 - r7
            float r5 = java.lang.Math.max(r2, r5)
            int r6 = java.lang.Float.floatToRawIntBits(r1)
            long r6 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r1 = (long) r5
            long r5 = r6 << r0
            long r0 = r1 & r3
            long r5 = r5 | r0
            return r5
    }
}
