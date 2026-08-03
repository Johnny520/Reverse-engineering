package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends m.o1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m.a f8254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sg.c f8255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qg.e1 f8256h;

    public l1(m.o2 r1, m.a r2, m.d2 r3, u2.c r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0.f8254f = r2
            r1 = 0
            r2 = 6
            r3 = 2147483647(0x7fffffff, float:NaN)
            sg.c r1 = sg.j.a(r3, r2, r1)
            r0.f8255g = r1
            return
    }

    public static final java.lang.Object c(m.l1 r19, m.o2 r20, m.h1 r21, float r22, float r23, yf.c r24) {
            r5 = r19
            r7 = r20
            r0 = r21
            r1 = r24
            r5.getClass()
            b.e r9 = r5.f8304e
            boolean r2 = r1 instanceof m.i1
            if (r2 == 0) goto L21
            r2 = r1
            m.i1 r2 = (m.i1) r2
            int r3 = r2.f8209l
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r3 & r4
            if (r6 == 0) goto L21
            int r3 = r3 - r4
            r2.f8209l = r3
        L1f:
            r10 = r2
            goto L27
        L21:
            m.i1 r2 = new m.i1
            r2.<init>(r5, r1)
            goto L1f
        L27:
            java.lang.Object r1 = r10.f8207j
            int r2 = r10.f8209l
            sf.n r12 = sf.n.f12433a
            r13 = 2
            r14 = 1
            xf.a r15 = xf.a.f21579g
            if (r2 == 0) goto L4f
            if (r2 == r14) goto L42
            if (r2 != r13) goto L3b
            f8.i.I0(r1)
            return r12
        L3b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r0)
            r0 = 0
            return r0
        L42:
            float r0 = r10.f8206i
            gg.r r2 = r10.f8205h
            m.o2 r3 = r10.f8204g
            f8.i.I0(r1)
            r16 = r12
            goto Lfe
        L4f:
            f8.i.I0(r1)
            gg.u r3 = new gg.u
            r3.<init>()
            r3.f4564g = r0
            long r1 = r0.f8183b
            long r13 = r0.f8182a
            java.lang.Object r0 = r9.f332h
            t1.d r0 = (t1.d) r0
            r4 = 32
            r16 = r12
            long r11 = r13 >> r4
            int r6 = (int) r11
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r0.a(r1, r6)
            java.lang.Object r0 = r9.f333i
            t1.d r0 = (t1.d) r0
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r11
            int r6 = (int) r13
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r0.a(r1, r6)
            sg.c r0 = r5.f8255g
            m.h1 r0 = g(r0)
            if (r0 == 0) goto Lb5
            long r1 = r0.f8183b
            long r13 = r0.f8182a
            java.lang.Object r6 = r9.f332h
            t1.d r6 = (t1.d) r6
            r17 = r11
            long r11 = r13 >> r4
            int r4 = (int) r11
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r6.a(r1, r4)
            java.lang.Object r4 = r9.f333i
            t1.d r4 = (t1.d) r4
            long r11 = r13 & r17
            int r6 = (int) r11
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r4.a(r1, r6)
            java.lang.Object r1 = r3.f4564g
            m.h1 r1 = (m.h1) r1
            m.h1 r0 = r1.a(r0)
            r3.f4564g = r0
        Lb5:
            gg.r r1 = new gg.r
            r1.<init>()
            java.lang.Object r0 = r3.f4564g
            m.h1 r0 = (m.h1) r0
            long r11 = r0.f8182a
            long r11 = r7.e(r11)
            float r0 = r7.g(r11)
            r1.f4561g = r0
            boolean r0 = m.m1.a(r0)
            if (r0 == 0) goto Ld2
            goto L166
        Ld2:
            gg.u r2 = new gg.u
            r2.<init>()
            r0 = 30
            r4 = 0
            i.l r0 = i.d.b(r4, r4, r0)
            r2.f4564g = r0
            m.j1 r0 = new m.j1
            r8 = 0
            r4 = r22
            r6 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.f8204g = r7
            r10.f8205h = r1
            r10.f8206i = r6
            r2 = 1
            r10.f8209l = r2
            java.lang.Object r0 = r5.b(r0, r10)
            if (r0 != r15) goto Lfb
            goto L165
        Lfb:
            r2 = r1
            r0 = r6
            r3 = r7
        Lfe:
            java.lang.Object r1 = r9.f332h
            t1.d r1 = (t1.d) r1
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r1 = r1.b(r4)
            java.lang.Object r6 = r9.f333i
            t1.d r6 = (t1.d) r6
            float r4 = r6.b(r4)
            long r6 = a.a.d(r1, r4)
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L150
            float r1 = r2.f4561g
            float r1 = java.lang.Math.abs(r1)
            r4 = 100
            float r4 = (float) r4
            float r1 = r1 / r4
            float r0 = java.lang.Math.min(r1, r0)
            float r1 = r2.f4561g
            float r1 = java.lang.Math.signum(r1)
            float r1 = r3.d(r1)
            float r1 = r1 * r0
            r0 = 1000(0x3e8, float:1.401E-42)
            float r0 = (float) r0
            float r1 = r1 * r0
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L13f
            r6 = r8
            goto L150
        L13f:
            m.p1 r0 = r3.f8308d
            m.p1 r2 = m.p1.f8325h
            if (r0 != r2) goto L14b
            long r0 = a.a.d(r1, r4)
        L149:
            r6 = r0
            goto L150
        L14b:
            long r0 = a.a.d(r4, r1)
            goto L149
        L150:
            gg.a r0 = r5.f8301b
            u2.q r1 = new u2.q
            r1.<init>(r6)
            r2 = 0
            r10.f8204g = r2
            r10.f8205h = r2
            r2 = 2
            r10.f8209l = r2
            java.lang.Object r0 = r0.invoke(r1, r10)
            if (r0 != r15) goto L166
        L165:
            return r15
        L166:
            return r16
    }

    public static final java.lang.Object d(m.l1 r11, gg.u r12, gg.r r13, m.o2 r14, gg.u r15, long r16, yf.c r18) {
            r0 = r16
            r2 = r18
            boolean r3 = r2 instanceof m.k1
            if (r3 == 0) goto L17
            r3 = r2
            m.k1 r3 = (m.k1) r3
            int r4 = r3.f8246m
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f8246m = r4
            goto L1c
        L17:
            m.k1 r3 = new m.k1
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f8245l
            int r4 = r3.f8246m
            r5 = 1
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L37
            gg.u r11 = r3.f8244k
            m.o2 r12 = r3.f8243j
            gg.r r0 = r3.f8242i
            gg.u r1 = r3.f8241h
            m.l1 r3 = r3.f8240g
            f8.i.I0(r2)
            r7 = r11
            r6 = r12
            r12 = r1
            r11 = r3
            goto L69
        L37:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r11)
            r11 = 0
            return r11
        L3e:
            f8.i.I0(r2)
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L4a
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L4a:
            ci.c r2 = new ci.c
            r4 = 0
            r6 = 7
            r2.<init>(r11, r4, r6)
            r3.f8240g = r11
            r3.f8241h = r12
            r3.f8242i = r13
            r3.f8243j = r14
            r3.f8244k = r15
            r3.f8246m = r5
            java.lang.Object r2 = qg.v.y(r0, r2, r3)
            xf.a r0 = xf.a.f21579g
            if (r2 != r0) goto L66
            return r0
        L66:
            r0 = r13
            r6 = r14
            r7 = r15
        L69:
            m.h1 r2 = (m.h1) r2
            if (r2 == 0) goto Lc8
            java.lang.Object r1 = r12.f4564g
            m.h1 r1 = (m.h1) r1
            boolean r1 = r1.f8184c
            long r3 = r2.f8182a
            long r8 = r2.f8183b
            m.h1 r10 = new m.h1
            r18 = r1
            r14 = r3
            r16 = r8
            r13 = r10
            r13.<init>(r14, r16, r18)
            r1 = r13
            r12.f4564g = r1
            long r3 = r6.e(r3)
            float r12 = r6.i(r3)
            r0.f4561g = r12
            r12 = 30
            r1 = 0
            i.l r12 = i.d.b(r1, r1, r12)
            r7.f4564g = r12
            b.e r11 = r11.f8304e
            long r3 = r2.f8183b
            long r1 = r2.f8182a
            java.lang.Object r12 = r11.f332h
            t1.d r12 = (t1.d) r12
            r6 = 32
            long r6 = r1 >> r6
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r12.a(r3, r6)
            java.lang.Object r11 = r11.f333i
            t1.d r11 = (t1.d) r11
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r6
            int r12 = (int) r1
            float r12 = java.lang.Float.intBitsToFloat(r12)
            r11.a(r3, r12)
            float r11 = r0.f4561g
            boolean r11 = m.m1.a(r11)
            r11 = r11 ^ r5
            goto Lc9
        Lc8:
            r11 = 0
        Lc9:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
    }

    public static m.h1 g(sg.c r3) {
            m.g1 r0 = new m.g1
            r1 = 0
            r0.<init>(r3, r1)
            d9.k r3 = new d9.k
            r1 = 2
            r2 = 0
            r3.<init>(r0, r2, r1)
            ng.k r3 = fb.v0.B(r3)
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            m.h1 r0 = (m.h1) r0
            if (r2 != 0) goto L21
        L1f:
            r2 = r0
            goto L11
        L21:
            m.h1 r0 = r2.a(r0)
            goto L1f
        L26:
            return r2
    }

    public final float e(m.m2 r5, float r6) {
            r4 = this;
            m.o2 r0 = r4.f8300a
            float r6 = r0.d(r6)
            long r1 = r0.h(r6)
            m.o2 r5 = r5.f8273a
            m.u1 r6 = r5.f8315k
            r3 = 1
            long r5 = r5.c(r6, r1, r3)
            long r5 = r0.e(r5)
            float r5 = r0.g(r5)
            return r5
    }

    public final boolean f(s1.k r13) {
            r12 = this;
            m.a r0 = r12.f8254f
            java.lang.Object r0 = r0.f8069h
            android.view.ViewConfiguration r0 = (android.view.ViewConfiguration) r0
            float r1 = r0.getScaledVerticalScrollFactor()
            float r1 = -r1
            float r0 = r0.getScaledHorizontalScrollFactor()
            float r0 = -r0
            java.lang.Object r2 = r13.f12262a
            e1.b r3 = new e1.b
            r4 = 0
            r3.<init>(r4)
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L1f:
            long r7 = r3.f2294a
            if (r6 >= r4) goto L37
            java.lang.Object r3 = r2.get(r6)
            s1.t r3 = (s1.t) r3
            long r9 = r3.f12300j
            long r7 = e1.b.e(r7, r9)
            e1.b r3 = new e1.b
            r3.<init>(r7)
            int r6 = r6 + 1
            goto L1f
        L37:
            r2 = 32
            long r3 = r7 >> r2
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r3 = r3 * r0
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r7 & r9
            int r0 = (int) r6
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 * r1
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            long r2 = r3 << r2
            long r0 = r0 & r9
            long r7 = r2 | r0
            m.o2 r0 = r12.f8300a
            long r1 = r0.e(r7)
            float r1 = r0.i(r1)
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 != 0) goto L6d
            goto L7c
        L6d:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            m.i2 r0 = r0.f8305a
            if (r1 <= 0) goto L78
            boolean r5 = r0.d()
            goto L7c
        L78:
            boolean r5 = r0.c()
        L7c:
            if (r5 == 0) goto L99
            m.h1 r6 = new m.h1
            java.lang.Object r13 = r13.f12262a
            java.lang.Object r13 = tf.m.t1(r13)
            s1.t r13 = (s1.t) r13
            long r9 = r13.f12292b
            r11 = 0
            r6.<init>(r7, r9, r11)
            sg.c r13 = r12.f8255g
            java.lang.Object r13 = r13.p(r6)
            boolean r13 = r13 instanceof sg.i
            r13 = r13 ^ 1
            return r13
        L99:
            boolean r13 = r12.f8303d
            return r13
    }
}
