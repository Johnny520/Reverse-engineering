package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements k.k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2.c f6986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.g0 f6988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0.j1 f6989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x1.j f6994i;

    public i(android.content.Context r3, u2.c r4, long r5, p.x0 r7) {
            r2 = this;
            r2.<init>()
            r2.f6986a = r4
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.f6987b = r0
            k.g0 r4 = new k.g0
            int r5 = f1.c0.w(r5)
            r4.<init>(r3, r5)
            r2.f6988c = r4
            i0.e r3 = i0.e.f5867j
            i0.j1 r5 = new i0.j1
            sf.n r6 = sf.n.f12433a
            r5.<init>(r6, r3)
            r2.f6989d = r5
            r3 = 1
            r2.f6990e = r3
            r5 = 0
            r2.f6992g = r5
            r5 = -1
            r2.f6993h = r5
            c0.g r3 = new c0.g
            r5 = 5
            r3.<init>(r2, r5)
            s1.k r5 = s1.h0.f12244a
            s1.l0 r5 = new s1.l0
            r6 = 0
            r5.<init>(r6, r6, r6, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 31
            if (r3 < r6) goto L47
            k.n0 r3 = new k.n0
            r3.<init>(r5, r2, r4)
            goto L4c
        L47:
            k.n0 r3 = new k.n0
            r3.<init>(r5, r2, r4, r7)
        L4c:
            r2.f6994i = r3
            return
    }

    @Override // k.k1
    public final java.lang.Object a(long r19, m.n2 r21, yf.c r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            r4 = r22
            boolean r5 = r4 instanceof k.h
            if (r5 == 0) goto L1b
            r5 = r4
            k.h r5 = (k.h) r5
            int r6 = r5.f6983j
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1b
            int r6 = r6 - r7
            r5.f6983j = r6
            goto L20
        L1b:
            k.h r5 = new k.h
            r5.<init>(r0, r4)
        L20:
            java.lang.Object r4 = r5.f6981h
            int r6 = r5.f6983j
            sf.n r7 = sf.n.f12433a
            r8 = 2
            r9 = 1
            r10 = 0
            k.g0 r11 = r0.f6988c
            if (r6 == 0) goto L43
            if (r6 == r9) goto L3f
            if (r6 != r8) goto L38
            long r1 = r5.f6980g
            f8.i.I0(r4)
            goto L13a
        L38:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r1 = 0
            return r1
        L3f:
            f8.i.I0(r4)
            return r7
        L43:
            f8.i.I0(r4)
            long r12 = r0.f6992g
            boolean r4 = e1.e.c(r12)
            xf.a r6 = xf.a.f21579g
            if (r4 == 0) goto L67
            r5.f6983j = r9
            r3.getClass()
            m.n2 r4 = new m.n2
            m.o2 r3 = r3.f8287k
            r4.<init>(r3, r5)
            r4.f8286j = r1
            java.lang.Object r1 = r4.invokeSuspend(r7)
            if (r1 != r6) goto L66
            goto L139
        L66:
            return r7
        L67:
            android.widget.EdgeEffect r4 = r11.f6963f
            boolean r4 = k.g0.g(r4)
            r9 = 32
            u2.c r12 = r0.f6986a
            if (r4 == 0) goto L90
            float r4 = u2.q.b(r1)
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L90
            android.widget.EdgeEffect r4 = r11.c()
            float r13 = u2.q.b(r1)
            long r14 = r0.f6992g
            long r14 = r14 >> r9
            int r9 = (int) r14
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r4 = k.n.e(r4, r13, r9, r12)
            goto Lb8
        L90:
            android.widget.EdgeEffect r4 = r11.f6964g
            boolean r4 = k.g0.g(r4)
            if (r4 == 0) goto Lb7
            float r4 = u2.q.b(r1)
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 <= 0) goto Lb7
            android.widget.EdgeEffect r4 = r11.d()
            float r13 = u2.q.b(r1)
            float r13 = -r13
            long r14 = r0.f6992g
            long r14 = r14 >> r9
            int r9 = (int) r14
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r4 = k.n.e(r4, r13, r9, r12)
            float r4 = -r4
            goto Lb8
        Lb7:
            r4 = r10
        Lb8:
            android.widget.EdgeEffect r9 = r11.f6961d
            boolean r9 = k.g0.g(r9)
            if (r9 == 0) goto Le3
            float r9 = u2.q.c(r1)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto Le3
            android.widget.EdgeEffect r9 = r11.e()
            float r15 = u2.q.c(r1)
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r0.f6992g
            long r13 = r13 & r16
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r9 = k.n.e(r9, r15, r13, r12)
            goto L111
        Le3:
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            android.widget.EdgeEffect r9 = r11.f6962e
            boolean r9 = k.g0.g(r9)
            if (r9 == 0) goto L110
            float r9 = u2.q.c(r1)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L110
            android.widget.EdgeEffect r9 = r11.b()
            float r13 = u2.q.c(r1)
            float r13 = -r13
            long r14 = r0.f6992g
            long r14 = r14 & r16
            int r14 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r14)
            float r9 = k.n.e(r9, r13, r14, r12)
            float r9 = -r9
            goto L111
        L110:
            r9 = r10
        L111:
            long r12 = a.a.d(r4, r9)
            r14 = 0
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 != 0) goto L11c
            goto L11f
        L11c:
            r0.g()
        L11f:
            long r1 = u2.q.d(r1, r12)
            r5.f6980g = r1
            r5.f6983j = r8
            r3.getClass()
            m.n2 r4 = new m.n2
            m.o2 r3 = r3.f8287k
            r4.<init>(r3, r5)
            r4.f8286j = r1
            java.lang.Object r4 = r4.invokeSuspend(r7)
            if (r4 != r6) goto L13a
        L139:
            return r6
        L13a:
            u2.q r4 = (u2.q) r4
            long r3 = r4.f13362a
            long r1 = u2.q.d(r1, r3)
            r3 = 0
            r0.f6991f = r3
            float r3 = u2.q.b(r1)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            r4 = 31
            if (r3 <= 0) goto L16d
            android.widget.EdgeEffect r3 = r11.c()
            float r5 = u2.q.b(r1)
            int r5 = ig.a.X(r5)
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L163
            r3.onAbsorb(r5)
            goto L193
        L163:
            boolean r6 = r3.isFinished()
            if (r6 == 0) goto L193
            r3.onAbsorb(r5)
            goto L193
        L16d:
            float r3 = u2.q.b(r1)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L193
            android.widget.EdgeEffect r3 = r11.d()
            float r5 = u2.q.b(r1)
            int r5 = ig.a.X(r5)
            int r5 = -r5
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L18a
            r3.onAbsorb(r5)
            goto L193
        L18a:
            boolean r6 = r3.isFinished()
            if (r6 == 0) goto L193
            r3.onAbsorb(r5)
        L193:
            float r3 = u2.q.c(r1)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 <= 0) goto L1b9
            android.widget.EdgeEffect r3 = r11.e()
            float r1 = u2.q.c(r1)
            int r1 = ig.a.X(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L1af
            r3.onAbsorb(r1)
            goto L1df
        L1af:
            boolean r2 = r3.isFinished()
            if (r2 == 0) goto L1df
            r3.onAbsorb(r1)
            goto L1df
        L1b9:
            float r3 = u2.q.c(r1)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L1df
            android.widget.EdgeEffect r3 = r11.b()
            float r1 = u2.q.c(r1)
            int r1 = ig.a.X(r1)
            int r1 = -r1
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L1d6
            r3.onAbsorb(r1)
            goto L1df
        L1d6:
            boolean r2 = r3.isFinished()
            if (r2 == 0) goto L1df
            r3.onAbsorb(r1)
        L1df:
            r0.e()
            return r7
    }

    @Override // k.k1
    public final long b(long r20, int r22, b0.d0 r23) {
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            r4 = r23
            long r5 = r0.f6992g
            boolean r5 = e1.e.c(r5)
            if (r5 == 0) goto L24
            java.lang.Object r3 = r4.f355h
            m.o2 r3 = (m.o2) r3
            m.u1 r4 = r3.f8315k
            int r5 = r3.f8314j
            long r1 = r3.c(r4, r1, r5)
            e1.b r3 = new e1.b
            r3.<init>(r1)
            long r1 = r3.f2294a
            return r1
        L24:
            boolean r5 = r0.f6991f
            r6 = 0
            r8 = 1
            k.g0 r9 = r0.f6988c
            if (r5 != 0) goto L5b
            android.widget.EdgeEffect r5 = r9.f6963f
            boolean r5 = k.g0.g(r5)
            if (r5 == 0) goto L38
            r0.i(r6)
        L38:
            android.widget.EdgeEffect r5 = r9.f6964g
            boolean r5 = k.g0.g(r5)
            if (r5 == 0) goto L43
            r0.j(r6)
        L43:
            android.widget.EdgeEffect r5 = r9.f6961d
            boolean r5 = k.g0.g(r5)
            if (r5 == 0) goto L4e
            r0.k(r6)
        L4e:
            android.widget.EdgeEffect r5 = r9.f6962e
            boolean r5 = k.g0.g(r5)
            if (r5 == 0) goto L59
            r0.h(r6)
        L59:
            r0.f6991f = r8
        L5b:
            int r5 = k.k.f7007a
            r5 = 2
            if (r3 != r5) goto L63
            r5 = 1082130432(0x40800000, float:4.0)
            goto L65
        L63:
            r5 = 1065353216(0x3f800000, float:1.0)
        L65:
            long r10 = e1.b.f(r1, r5)
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r1 & r12
            int r14 = (int) r14
            float r15 = java.lang.Float.intBitsToFloat(r14)
            r16 = 0
            int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r15 != 0) goto L81
            r17 = r12
        L7d:
            r12 = r16
            goto Lef
        L81:
            android.widget.EdgeEffect r15 = r9.f6961d
            boolean r15 = k.g0.g(r15)
            if (r15 == 0) goto Lb9
            float r15 = java.lang.Float.intBitsToFloat(r14)
            int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r15 >= 0) goto Lb9
            float r15 = r0.k(r10)
            r17 = r12
            android.widget.EdgeEffect r12 = r9.f6961d
            boolean r12 = k.g0.g(r12)
            if (r12 != 0) goto La6
            android.widget.EdgeEffect r12 = r9.e()
            r12.finish()
        La6:
            long r12 = r10 & r17
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            int r12 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r12 != 0) goto Lb6
            float r12 = java.lang.Float.intBitsToFloat(r14)
            goto Lef
        Lb6:
            float r12 = r15 / r5
            goto Lef
        Lb9:
            r17 = r12
            android.widget.EdgeEffect r12 = r9.f6962e
            boolean r12 = k.g0.g(r12)
            if (r12 == 0) goto L7d
            float r12 = java.lang.Float.intBitsToFloat(r14)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 <= 0) goto L7d
            float r12 = r0.h(r10)
            android.widget.EdgeEffect r13 = r9.f6962e
            boolean r13 = k.g0.g(r13)
            if (r13 != 0) goto Lde
            android.widget.EdgeEffect r13 = r9.b()
            r13.finish()
        Lde:
            long r6 = r10 & r17
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 != 0) goto Lee
            float r12 = java.lang.Float.intBitsToFloat(r14)
            goto Lef
        Lee:
            float r12 = r12 / r5
        Lef:
            r13 = 32
            long r6 = r1 >> r13
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 != 0) goto Lff
        Lfc:
            r5 = r16
            goto L165
        Lff:
            android.widget.EdgeEffect r7 = r9.f6963f
            boolean r7 = k.g0.g(r7)
            if (r7 == 0) goto L134
            float r7 = java.lang.Float.intBitsToFloat(r6)
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 >= 0) goto L134
            float r7 = r0.i(r10)
            android.widget.EdgeEffect r15 = r9.f6963f
            boolean r15 = k.g0.g(r15)
            if (r15 != 0) goto L122
            android.widget.EdgeEffect r15 = r9.c()
            r15.finish()
        L122:
            long r10 = r10 >> r13
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 != 0) goto L131
            float r5 = java.lang.Float.intBitsToFloat(r6)
            goto L165
        L131:
            float r5 = r7 / r5
            goto L165
        L134:
            android.widget.EdgeEffect r7 = r9.f6964g
            boolean r7 = k.g0.g(r7)
            if (r7 == 0) goto Lfc
            float r7 = java.lang.Float.intBitsToFloat(r6)
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 <= 0) goto Lfc
            float r7 = r0.j(r10)
            android.widget.EdgeEffect r15 = r9.f6964g
            boolean r15 = k.g0.g(r15)
            if (r15 != 0) goto L157
            android.widget.EdgeEffect r15 = r9.d()
            r15.finish()
        L157:
            long r10 = r10 >> r13
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 != 0) goto L131
            float r5 = java.lang.Float.intBitsToFloat(r6)
        L165:
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r10 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r12)
            r12 = r13
            r7 = r14
            long r13 = (long) r5
            long r10 = r10 << r12
            long r13 = r13 & r17
            long r10 = r10 | r13
            r13 = 0
            boolean r5 = e1.b.b(r10, r13)
            if (r5 != 0) goto L180
            r0.g()
        L180:
            long r1 = e1.b.d(r1, r10)
            java.lang.Object r4 = r4.f355h
            m.o2 r4 = (m.o2) r4
            m.u1 r5 = r4.f8315k
            int r13 = r4.f8314j
            long r4 = r4.c(r5, r1, r13)
            e1.b r13 = new e1.b
            r13.<init>(r4)
            long r4 = r13.f2294a
            long r13 = e1.b.d(r1, r4)
            r15 = r12
            r20 = r13
            long r12 = r1 >> r15
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L1b5
            long r12 = r1 & r17
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L1b5
            goto L1ef
        L1b5:
            long r12 = r4 >> r15
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L1cc
            long r12 = r4 & r17
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L1cc
            goto L1ef
        L1cc:
            android.widget.EdgeEffect r12 = r9.f6963f
            boolean r12 = k.g0.g(r12)
            if (r12 != 0) goto L1ec
            android.widget.EdgeEffect r12 = r9.f6961d
            boolean r12 = k.g0.g(r12)
            if (r12 != 0) goto L1ec
            android.widget.EdgeEffect r12 = r9.f6964g
            boolean r12 = k.g0.g(r12)
            if (r12 != 0) goto L1ec
            android.widget.EdgeEffect r12 = r9.f6962e
            boolean r12 = k.g0.g(r12)
            if (r12 == 0) goto L1ef
        L1ec:
            r0.e()
        L1ef:
            if (r3 != r8) goto L243
            long r13 = r20 >> r15
            int r3 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r3)
            r14 = 1056964608(0x3f000000, float:0.5)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            r15 = -1090519040(0xffffffffbf000000, float:-0.5)
            if (r13 <= 0) goto L20b
            r12 = r20
            r0.i(r12)
        L205:
            r3 = r8
            r20 = r14
            r21 = r15
            goto L21e
        L20b:
            r12 = r20
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 >= 0) goto L219
            r0.j(r12)
            goto L205
        L219:
            r20 = r14
            r21 = r15
            r3 = 0
        L21e:
            long r14 = r12 & r17
            int r14 = (int) r14
            float r15 = java.lang.Float.intBitsToFloat(r14)
            int r15 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r15 <= 0) goto L22e
            r0.k(r12)
        L22c:
            r12 = r8
            goto L23b
        L22e:
            float r14 = java.lang.Float.intBitsToFloat(r14)
            int r14 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r14 >= 0) goto L23a
            r0.h(r12)
            goto L22c
        L23a:
            r12 = 0
        L23b:
            if (r3 != 0) goto L23f
            if (r12 == 0) goto L243
        L23f:
            r3 = r8
        L240:
            r13 = 0
            goto L245
        L243:
            r3 = 0
            goto L240
        L245:
            boolean r1 = e1.b.b(r1, r13)
            if (r1 != 0) goto L354
            android.widget.EdgeEffect r1 = r9.f6963f
            boolean r1 = k.g0.f(r1)
            if (r1 == 0) goto L286
            float r1 = java.lang.Float.intBitsToFloat(r6)
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 >= 0) goto L286
            android.widget.EdgeEffect r1 = r9.c()
            float r2 = java.lang.Float.intBitsToFloat(r6)
            boolean r12 = r1 instanceof k.m0
            if (r12 == 0) goto L27c
            k.m0 r1 = (k.m0) r1
            float r12 = r1.f7015b
            float r12 = r12 + r2
            r1.f7015b = r12
            float r2 = java.lang.Math.abs(r12)
            float r12 = r1.f7014a
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 <= 0) goto L27f
            r1.onRelease()
            goto L27f
        L27c:
            r1.onRelease()
        L27f:
            android.widget.EdgeEffect r1 = r9.f6963f
            boolean r1 = k.g0.f(r1)
            goto L287
        L286:
            r1 = 0
        L287:
            android.widget.EdgeEffect r2 = r9.f6964g
            boolean r2 = k.g0.f(r2)
            if (r2 == 0) goto L2c9
            float r2 = java.lang.Float.intBitsToFloat(r6)
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto L2c9
            android.widget.EdgeEffect r2 = r9.d()
            float r6 = java.lang.Float.intBitsToFloat(r6)
            boolean r12 = r2 instanceof k.m0
            if (r12 == 0) goto L2b8
            k.m0 r2 = (k.m0) r2
            float r12 = r2.f7015b
            float r12 = r12 + r6
            r2.f7015b = r12
            float r6 = java.lang.Math.abs(r12)
            float r12 = r2.f7014a
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 <= 0) goto L2bb
            r2.onRelease()
            goto L2bb
        L2b8:
            r2.onRelease()
        L2bb:
            if (r1 != 0) goto L2c8
            android.widget.EdgeEffect r1 = r9.f6964g
            boolean r1 = k.g0.f(r1)
            if (r1 == 0) goto L2c6
            goto L2c8
        L2c6:
            r1 = 0
            goto L2c9
        L2c8:
            r1 = r8
        L2c9:
            android.widget.EdgeEffect r2 = r9.f6961d
            boolean r2 = k.g0.f(r2)
            if (r2 == 0) goto L30b
            float r2 = java.lang.Float.intBitsToFloat(r7)
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 >= 0) goto L30b
            android.widget.EdgeEffect r2 = r9.e()
            float r6 = java.lang.Float.intBitsToFloat(r7)
            boolean r12 = r2 instanceof k.m0
            if (r12 == 0) goto L2fa
            k.m0 r2 = (k.m0) r2
            float r12 = r2.f7015b
            float r12 = r12 + r6
            r2.f7015b = r12
            float r6 = java.lang.Math.abs(r12)
            float r12 = r2.f7014a
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 <= 0) goto L2fd
            r2.onRelease()
            goto L2fd
        L2fa:
            r2.onRelease()
        L2fd:
            if (r1 != 0) goto L30a
            android.widget.EdgeEffect r1 = r9.f6961d
            boolean r1 = k.g0.f(r1)
            if (r1 == 0) goto L308
            goto L30a
        L308:
            r1 = 0
            goto L30b
        L30a:
            r1 = r8
        L30b:
            android.widget.EdgeEffect r2 = r9.f6962e
            boolean r2 = k.g0.f(r2)
            if (r2 == 0) goto L34d
            float r2 = java.lang.Float.intBitsToFloat(r7)
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto L34d
            android.widget.EdgeEffect r2 = r9.b()
            float r6 = java.lang.Float.intBitsToFloat(r7)
            boolean r7 = r2 instanceof k.m0
            if (r7 == 0) goto L33c
            k.m0 r2 = (k.m0) r2
            float r7 = r2.f7015b
            float r7 = r7 + r6
            r2.f7015b = r7
            float r6 = java.lang.Math.abs(r7)
            float r7 = r2.f7014a
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L33f
            r2.onRelease()
            goto L33f
        L33c:
            r2.onRelease()
        L33f:
            if (r1 != 0) goto L34c
            android.widget.EdgeEffect r1 = r9.f6962e
            boolean r1 = k.g0.f(r1)
            if (r1 == 0) goto L34a
            goto L34c
        L34a:
            r1 = 0
            goto L34d
        L34c:
            r1 = r8
        L34d:
            if (r1 != 0) goto L353
            if (r3 == 0) goto L352
            goto L353
        L352:
            r8 = 0
        L353:
            r3 = r8
        L354:
            if (r3 == 0) goto L359
            r0.g()
        L359:
            long r1 = e1.b.e(r10, r4)
            return r1
    }

    @Override // k.k1
    public final x1.i c() {
            r1 = this;
            x1.j r0 = r1.f6994i
            return r0
    }

    @Override // k.k1
    public final boolean d() {
            r5 = this;
            k.g0 r0 = r5.f6988c
            android.widget.EdgeEffect r1 = r0.f6961d
            r2 = 31
            r3 = 0
            if (r1 == 0) goto L17
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L12
            float r1 = k.l.b(r1)
            goto L13
        L12:
            r1 = r3
        L13:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L4e
        L17:
            android.widget.EdgeEffect r1 = r0.f6962e
            if (r1 == 0) goto L29
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L24
            float r1 = k.l.b(r1)
            goto L25
        L24:
            r1 = r3
        L25:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L4e
        L29:
            android.widget.EdgeEffect r1 = r0.f6963f
            if (r1 == 0) goto L3b
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L36
            float r1 = k.l.b(r1)
            goto L37
        L36:
            r1 = r3
        L37:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L4e
        L3b:
            android.widget.EdgeEffect r0 = r0.f6964g
            if (r0 == 0) goto L50
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r2) goto L48
            float r0 = k.l.b(r0)
            goto L49
        L48:
            r0 = r3
        L49:
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L4e
            goto L50
        L4e:
            r0 = 1
            return r0
        L50:
            r0 = 0
            return r0
    }

    public final void e() {
            r5 = this;
            k.g0 r0 = r5.f6988c
            android.widget.EdgeEffect r1 = r0.f6961d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L11
            r1.onRelease()
            boolean r1 = r1.isFinished()
            r1 = r1 ^ r2
            goto L12
        L11:
            r1 = r3
        L12:
            android.widget.EdgeEffect r4 = r0.f6962e
            if (r4 == 0) goto L25
            r4.onRelease()
            boolean r4 = r4.isFinished()
            if (r4 == 0) goto L24
            if (r1 == 0) goto L22
            goto L24
        L22:
            r1 = r3
            goto L25
        L24:
            r1 = r2
        L25:
            android.widget.EdgeEffect r4 = r0.f6963f
            if (r4 == 0) goto L38
            r4.onRelease()
            boolean r4 = r4.isFinished()
            if (r4 == 0) goto L37
            if (r1 == 0) goto L35
            goto L37
        L35:
            r1 = r3
            goto L38
        L37:
            r1 = r2
        L38:
            android.widget.EdgeEffect r0 = r0.f6964g
            if (r0 == 0) goto L4a
            r0.onRelease()
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L49
            if (r1 == 0) goto L48
            goto L49
        L48:
            r2 = r3
        L49:
            r1 = r2
        L4a:
            if (r1 == 0) goto L4f
            r5.g()
        L4f:
            return
    }

    public final long f() {
            r8 = this;
            long r0 = r8.f6987b
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r0
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L12
            goto L18
        L12:
            long r0 = r8.f6992g
            long r0 = f8.i.B(r0)
        L18:
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r4 = r8.f6992g
            long r4 = r4 >> r2
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r3 = r3 / r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r6 = r8.f6992g
            long r6 = r6 & r4
            int r1 = (int) r6
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r0 = r0 / r1
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            long r2 = r6 << r2
            long r0 = r0 & r4
            long r0 = r0 | r2
            return r0
    }

    public final void g() {
            r2 = this;
            boolean r0 = r2.f6990e
            if (r0 == 0) goto Lb
            i0.j1 r0 = r2.f6989d
            sf.n r1 = sf.n.f12433a
            r0.setValue(r1)
        Lb:
            return
    }

    public final float h(long r9) {
            r8 = this;
            long r0 = r8.f()
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r1
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            long r3 = r8.f6992g
            long r3 = r3 & r1
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r10 = r10 / r3
            k.g0 r3 = r8.f6988c
            android.widget.EdgeEffect r3 = r3.b()
            float r10 = -r10
            r4 = 1
            float r4 = (float) r4
            float r4 = r4 - r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r0 < r5) goto L35
            float r10 = k.l.c(r3, r10, r4)
            goto L38
        L35:
            r3.onPull(r10, r4)
        L38:
            float r10 = -r10
            long r6 = r8.f6992g
            long r1 = r1 & r6
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 * r10
            r10 = 0
            if (r0 < r5) goto L4a
            float r0 = k.l.b(r3)
            goto L4b
        L4a:
            r0 = r10
        L4b:
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 != 0) goto L50
            return r1
        L50:
            float r9 = java.lang.Float.intBitsToFloat(r9)
            return r9
    }

    public final float i(long r8) {
            r7 = this;
            long r0 = r7.f()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 32
            long r8 = r8 >> r1
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            long r2 = r7.f6992g
            long r2 = r2 >> r1
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r9 = r9 / r2
            k.g0 r2 = r7.f6988c
            android.widget.EdgeEffect r2 = r2.c()
            r3 = 1
            float r3 = (float) r3
            float r3 = r3 - r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r0 < r4) goto L34
            float r9 = k.l.c(r2, r9, r3)
            goto L37
        L34:
            r2.onPull(r9, r3)
        L37:
            long r5 = r7.f6992g
            long r5 = r5 >> r1
            int r1 = (int) r5
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 * r9
            r9 = 0
            if (r0 < r4) goto L48
            float r0 = k.l.b(r2)
            goto L49
        L48:
            r0 = r9
        L49:
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 != 0) goto L4e
            return r1
        L4e:
            float r8 = java.lang.Float.intBitsToFloat(r8)
            return r8
    }

    public final float j(long r8) {
            r7 = this;
            long r0 = r7.f()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 32
            long r8 = r8 >> r1
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            long r2 = r7.f6992g
            long r2 = r2 >> r1
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r9 = r9 / r2
            k.g0 r2 = r7.f6988c
            android.widget.EdgeEffect r2 = r2.d()
            float r9 = -r9
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L32
            float r9 = k.l.c(r2, r9, r0)
            goto L35
        L32:
            r2.onPull(r9, r0)
        L35:
            float r9 = -r9
            long r5 = r7.f6992g
            long r0 = r5 >> r1
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 * r9
            r9 = 0
            if (r3 < r4) goto L48
            float r1 = k.l.b(r2)
            goto L49
        L48:
            r1 = r9
        L49:
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 != 0) goto L4e
            return r0
        L4e:
            float r8 = java.lang.Float.intBitsToFloat(r8)
            return r8
    }

    public final float k(long r9) {
            r8 = this;
            long r0 = r8.f()
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r1
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            long r3 = r8.f6992g
            long r3 = r3 & r1
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r10 = r10 / r3
            k.g0 r3 = r8.f6988c
            android.widget.EdgeEffect r3 = r3.e()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L31
            float r10 = k.l.c(r3, r10, r0)
            goto L34
        L31:
            r3.onPull(r10, r0)
        L34:
            long r6 = r8.f6992g
            long r0 = r6 & r1
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 * r10
            r10 = 0
            if (r4 < r5) goto L46
            float r1 = k.l.b(r3)
            goto L47
        L46:
            r1 = r10
        L47:
            int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r10 != 0) goto L4c
            return r0
        L4c:
            float r9 = java.lang.Float.intBitsToFloat(r9)
            return r9
    }

    public final void l(long r11) {
            r10 = this;
            long r0 = r10.f6992g
            r2 = 0
            boolean r0 = e1.e.a(r0, r2)
            long r1 = r10.f6992g
            boolean r1 = e1.e.a(r11, r1)
            r10.f6992g = r11
            if (r1 != 0) goto L9d
            r2 = 32
            long r3 = r11 >> r2
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            int r3 = ig.a.X(r3)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r4
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            int r11 = ig.a.X(r11)
            long r6 = (long) r3
            long r6 = r6 << r2
            long r11 = (long) r11
            long r11 = r11 & r4
            long r11 = r11 | r6
            k.g0 r3 = r10.f6988c
            r3.f6960c = r11
            android.widget.EdgeEffect r6 = r3.f6961d
            if (r6 == 0) goto L44
            long r7 = r11 >> r2
            int r7 = (int) r7
            long r8 = r11 & r4
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L44:
            android.widget.EdgeEffect r6 = r3.f6962e
            if (r6 == 0) goto L51
            long r7 = r11 >> r2
            int r7 = (int) r7
            long r8 = r11 & r4
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L51:
            android.widget.EdgeEffect r6 = r3.f6963f
            if (r6 == 0) goto L5e
            long r7 = r11 & r4
            int r7 = (int) r7
            long r8 = r11 >> r2
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L5e:
            android.widget.EdgeEffect r6 = r3.f6964g
            if (r6 == 0) goto L6b
            long r7 = r11 & r4
            int r7 = (int) r7
            long r8 = r11 >> r2
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L6b:
            android.widget.EdgeEffect r6 = r3.f6965h
            if (r6 == 0) goto L78
            long r7 = r11 >> r2
            int r7 = (int) r7
            long r8 = r11 & r4
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L78:
            android.widget.EdgeEffect r6 = r3.f6966i
            if (r6 == 0) goto L85
            long r7 = r11 >> r2
            int r7 = (int) r7
            long r8 = r11 & r4
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L85:
            android.widget.EdgeEffect r6 = r3.f6967j
            if (r6 == 0) goto L92
            long r7 = r11 & r4
            int r7 = (int) r7
            long r8 = r11 >> r2
            int r8 = (int) r8
            r6.setSize(r7, r8)
        L92:
            android.widget.EdgeEffect r3 = r3.f6968k
            if (r3 == 0) goto L9d
            long r4 = r4 & r11
            int r4 = (int) r4
            long r11 = r11 >> r2
            int r11 = (int) r11
            r3.setSize(r4, r11)
        L9d:
            if (r0 != 0) goto La4
            if (r1 != 0) goto La4
            r10.e()
        La4:
            return
    }
}
