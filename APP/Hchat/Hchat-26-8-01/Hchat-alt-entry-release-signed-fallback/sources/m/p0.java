package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends x1.j implements x1.w1, p1.c, x1.h, k.k0 {
    public k.l0 A;
    public sg.c B;
    public n.b C;
    public boolean D;
    public boolean E;
    public m.t F;
    public m.w G;
    public m.v H;
    public m.u I;
    public x6.d J;
    public m.a K;
    public long L;
    public m.a3 M;
    public m.b1 N;
    public long O;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m.p1 f8320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public fg.l f8321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f8322y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n.k f8323z;

    public p0(fg.l r1, boolean r2, n.k r3, m.p1 r4) {
            r0 = this;
            r0.<init>()
            r0.f8320w = r4
            r0.f8321x = r1
            r0.f8322y = r2
            r0.f8323z = r3
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r0.L = r1
            r1 = 0
            r0.O = r1
            return
    }

    public static final java.lang.Object n1(m.p0 r4, yf.c r5) {
            boolean r0 = r5 instanceof m.l0
            if (r0 == 0) goto L13
            r0 = r5
            m.l0 r0 = (m.l0) r0
            int r1 = r0.f8253i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8253i = r1
            goto L18
        L13:
            m.l0 r0 = new m.l0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8251g
            int r1 = r0.f8253i
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            f8.i.I0(r5)
            goto L47
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r4 = 0
            return r4
        L2c:
            f8.i.I0(r5)
            n.b r5 = r4.C
            if (r5 == 0) goto L4a
            n.k r1 = r4.f8323z
            if (r1 == 0) goto L47
            n.a r3 = new n.a
            r3.<init>(r5)
            r0.f8253i = r2
            java.lang.Object r5 = r1.a(r3, r0)
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L47
            return r0
        L47:
            r5 = 0
            r4.C = r5
        L4a:
            m.a0 r5 = new m.a0
            r0 = 0
            r2 = 0
            r5.<init>(r0, r2)
            r4.x1(r5)
            sf.n r4 = sf.n.f12433a
            return r4
    }

    public static final java.lang.Object o1(m.p0 r6, m.z r7, yf.c r8) {
            boolean r0 = r8 instanceof m.m0
            if (r0 == 0) goto L13
            r0 = r8
            m.m0 r0 = (m.m0) r0
            int r1 = r0.f8270k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8270k = r1
            goto L18
        L13:
            m.m0 r0 = new m.m0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f8268i
            int r1 = r0.f8270k
            r2 = 2
            r3 = 1
            xf.a r4 = xf.a.f21579g
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            n.b r7 = r0.f8267h
            m.z r0 = r0.f8266g
            f8.i.I0(r8)
            goto L6e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r6 = 0
            return r6
        L35:
            m.z r7 = r0.f8266g
            f8.i.I0(r8)
            goto L56
        L3b:
            f8.i.I0(r8)
            n.b r8 = r6.C
            if (r8 == 0) goto L56
            n.k r1 = r6.f8323z
            if (r1 == 0) goto L56
            n.a r5 = new n.a
            r5.<init>(r8)
            r0.f8266g = r7
            r0.f8270k = r3
            java.lang.Object r8 = r1.a(r5, r0)
            if (r8 != r4) goto L56
            goto L6b
        L56:
            n.b r8 = new n.b
            r8.<init>()
            n.k r1 = r6.f8323z
            if (r1 == 0) goto L70
            r0.f8266g = r7
            r0.f8267h = r8
            r0.f8270k = r2
            java.lang.Object r0 = r1.a(r8, r0)
            if (r0 != r4) goto L6c
        L6b:
            return r4
        L6c:
            r0 = r7
            r7 = r8
        L6e:
            r8 = r7
            r7 = r0
        L70:
            r6.C = r8
            long r7 = r7.f8430a
            r6.w1(r7)
            sf.n r6 = sf.n.f12433a
            return r6
    }

    public static final java.lang.Object p1(m.p0 r4, m.a0 r5, yf.c r6) {
            boolean r0 = r6 instanceof m.n0
            if (r0 == 0) goto L13
            r0 = r6
            m.n0 r0 = (m.n0) r0
            int r1 = r0.f8280j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8280j = r1
            goto L18
        L13:
            m.n0 r0 = new m.n0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f8278h
            int r1 = r0.f8280j
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            m.a0 r5 = r0.f8277g
            f8.i.I0(r6)
            goto L4b
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r4 = 0
            return r4
        L2e:
            f8.i.I0(r6)
            n.b r6 = r4.C
            if (r6 == 0) goto L4e
            n.k r1 = r4.f8323z
            if (r1 == 0) goto L4b
            n.c r3 = new n.c
            r3.<init>(r6)
            r0.f8277g = r5
            r0.f8280j = r2
            java.lang.Object r6 = r1.a(r3, r0)
            xf.a r0 = xf.a.f21579g
            if (r6 != r0) goto L4b
            return r0
        L4b:
            r6 = 0
            r4.C = r6
        L4e:
            r4.x1(r5)
            sf.n r4 = sf.n.f12433a
            return r4
    }

    public static void u1(m.p0 r3, s1.t r4, long r5, long r7, int r9) {
            r9 = r9 & 4
            if (r9 == 0) goto L6
            r7 = 0
        L6:
            m.v r9 = r3.H
            r0 = 0
            if (r9 != 0) goto L1e
            m.v r9 = new m.v
            r9.<init>()
            r1 = 0
            r9.f8395g = r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9.f8396h = r1
            r9.f8397i = r0
            r3.H = r9
        L1e:
            r9.f8395g = r4
            r9.f8396h = r5
            m.a3 r4 = r3.M
            m.p1 r5 = r3.f8320w
            if (r4 != 0) goto L30
            m.a3 r4 = new m.a3
            r4.<init>(r5)
            r3.M = r4
            goto L34
        L30:
            r4.f8077a = r5
            r4.f8078b = r7
        L34:
            r9.f8397i = r0
            r3.J = r9
            return
    }

    public final void A1(long r7, s1.t r9) {
            r6 = this;
            y0.n r0 = r6.f21819g
            x1.i1 r0 = x1.k.v(r0)
            r1 = 0
            long r0 = r0.P(r1)
            long r2 = r6.L
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r2 = e1.b.b(r2, r4)
            if (r2 != 0) goto L2f
            long r2 = r6.L
            boolean r2 = e1.b.b(r0, r2)
            if (r2 != 0) goto L2f
            long r2 = r6.L
            long r2 = e1.b.d(r0, r2)
            long r4 = r6.O
            long r2 = e1.b.e(r4, r2)
            r6.O = r2
        L2f:
            r6.L = r0
            m.a r0 = r6.z1()
            long r1 = r6.O
            g4.a.f(r0, r9, r1)
            sg.g r9 = r6.y1()
            m.y r0 = new m.y
            r1 = 0
            r0.<init>(r7, r1)
            r9.p(r0)
            return
    }

    @Override // k.k0
    public final boolean B0(p1.b r1) {
            r0 = this;
            boolean r1 = ac.p.j(r1)
            if (r1 == 0) goto Lc
            boolean r1 = r0.f8322y
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public final void B1(s1.t r6, s1.t r7, long r8) {
            r5 = this;
            m.a r0 = r5.K
            if (r0 != 0) goto Ld
            m.a r0 = new m.a
            r1 = 17
            r0.<init>(r1)
            r5.K = r0
        Ld:
            m.a r0 = r5.z1()
            r1 = 0
            g4.a.f(r0, r6, r1)
            long r3 = r7.f12293c
            long r7 = e1.b.d(r3, r8)
            r5.O = r1
            fg.l r9 = r5.f8321x
            int r6 = r6.f12299i
            s1.d0 r0 = new s1.d0
            r0.<init>(r6)
            java.lang.Object r6 = r9.invoke(r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5f
            boolean r6 = r5.D
            if (r6 != 0) goto L49
            sg.c r6 = r5.B
            if (r6 != 0) goto L46
            r6 = 2147483647(0x7fffffff, float:NaN)
            r9 = 6
            r0 = 0
            sg.c r6 = sg.j.a(r6, r9, r0)
            r5.B = r6
        L46:
            r5.D1()
        L49:
            x1.i1 r6 = x1.k.v(r5)
            long r0 = r6.P(r1)
            r5.L = r0
            sg.g r6 = r5.y1()
            m.z r9 = new m.z
            r9.<init>(r7)
            r6.p(r9)
        L5f:
            return
    }

    public abstract boolean C1();

    public final void D1() {
            r4 = this;
            r0 = 1
            r4.D = r0
            sg.c r0 = r4.B
            r1 = 0
            if (r0 != 0) goto L12
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = 6
            sg.c r0 = sg.j.a(r0, r2, r1)
            r4.B = r0
        L12:
            qg.t r0 = r4.Y0()
            m.o0 r2 = new m.o0
            r2.<init>(r4, r1)
            r3 = 3
            qg.v.q(r0, r1, r2, r3)
            return
    }

    public final void E1(fg.l r3, boolean r4, n.k r5, m.p1 r6, boolean r7) {
            r2 = this;
            r2.f8321x = r3
            boolean r3 = r2.f8322y
            r0 = 0
            r1 = 1
            if (r3 == r4) goto L12
            r2.f8322y = r4
            if (r4 != 0) goto L11
            r2.q1()
            r2.N = r0
        L11:
            r7 = r1
        L12:
            n.k r3 = r2.f8323z
            boolean r3 = gg.l.a(r3, r5)
            if (r3 != 0) goto L1f
            r2.q1()
            r2.f8323z = r5
        L1f:
            m.p1 r3 = r2.f8320w
            if (r3 == r6) goto L26
            r2.f8320w = r6
            goto L27
        L26:
            r1 = r7
        L27:
            if (r1 == 0) goto L5c
            boolean r3 = r2.E
            m.x r4 = m.x.f8417a
            if (r3 == 0) goto L3f
            r2.s1()
            boolean r3 = r2.D
            if (r3 == 0) goto L3d
            sg.g r3 = r2.y1()
            r3.p(r4)
        L3d:
            r2.K = r0
        L3f:
            m.b1 r3 = r2.N
            if (r3 == 0) goto L5c
            r3.a()
            m.p0 r5 = r3.f8082a
            boolean r6 = r5.D
            if (r6 == 0) goto L4f
            r5.v1(r4)
        L4f:
            r3.f8088g = r0
            a5.a r3 = r3.f8092k
            r4 = 0
            r3.f56h = r4
            java.lang.Object r3 = r3.f57i
            f.y r3 = (f.y) r3
            r3.f2924b = r4
        L5c:
            return
    }

    public void P(s1.k r19, s1.l r20, long r21) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 1
            r0.E = r3
            k.l0 r4 = r0.A
            if (r4 != 0) goto L17
            k.l0 r4 = new k.l0
            r4.<init>(r0)
            r0.k1(r4)
            r0.A = r4
        L17:
            boolean r4 = r0.f8322y
            if (r4 == 0) goto L34e
            x6.d r4 = r0.J
            r5 = 0
            if (r4 != 0) goto L33
            m.t r4 = r0.F
            if (r4 != 0) goto L31
            m.t r4 = new m.t
            r4.<init>()
            m.s r6 = m.s.f8354i
            r4.f8364g = r6
            r4.f8365h = r5
            r0.F = r4
        L31:
            r0.J = r4
        L33:
            x6.d r4 = r0.J
            if (r4 == 0) goto L349
            boolean r6 = r4 instanceof m.t
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            s1.l r9 = s1.l.f12274g
            r10 = 0
            s1.l r12 = s1.l.f12275h
            if (r6 == 0) goto Lb5
            m.t r4 = (m.t) r4
            java.lang.Object r6 = r1.f12262a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L52
            goto L34e
        L52:
            boolean r5 = m.y2.e(r1, r5)
            if (r5 != 0) goto L5a
            goto L34e
        L5a:
            java.lang.Object r1 = r1.f12262a
            java.lang.Object r1 = tf.m.t1(r1)
            s1.t r1 = (s1.t) r1
            m.s r5 = r4.f8364g
            int[] r6 = m.k0.f8239a
            int r5 = r5.ordinal()
            r5 = r6[r5]
            m.s r6 = m.s.f8353h
            m.s r13 = m.s.f8352g
            if (r5 != r3) goto L7c
            boolean r5 = r0.C1()
            if (r5 != 0) goto L7a
            r5 = r13
            goto L7e
        L7a:
            r5 = r6
            goto L7e
        L7c:
            m.s r5 = r4.f8364g
        L7e:
            r4.f8364g = r5
            if (r2 != r9) goto L89
            if (r5 != r6) goto L89
            r1.a()
            r4.f8365h = r3
        L89:
            if (r2 != r12) goto L34e
            if (r5 != r13) goto L97
            long r2 = r1.f12291a
            r4 = 0
            r6 = 12
            u1(r0, r1, r2, r4, r6)
            return
        L97:
            boolean r2 = r4.f8365h
            if (r2 == 0) goto L34e
            r0.B1(r1, r1, r10)
            r0.A1(r10, r1)
            long r1 = r1.f12291a
            m.w r3 = r0.G
            if (r3 != 0) goto Lb0
            m.w r3 = new m.w
            r3.<init>()
            r3.f8411g = r7
            r0.G = r3
        Lb0:
            r3.f8411g = r1
            r0.J = r3
            return
        Lb5:
            boolean r6 = r4 instanceof m.v
            s1.l r13 = s1.l.f12276i
            if (r6 == 0) goto L1f0
            m.v r4 = (m.v) r4
            if (r2 != r9) goto Lc1
            goto L34e
        Lc1:
            java.lang.Object r1 = r1.f12262a
            int r6 = r1.size()
            r9 = r5
        Lc8:
            if (r9 >= r6) goto Le4
            java.lang.Object r10 = r1.get(r9)
            r11 = r10
            s1.t r11 = (s1.t) r11
            long r14 = r11.f12291a
            r19 = r6
            long r5 = r4.f8396h
            boolean r5 = s1.s.e(r14, r5)
            if (r5 == 0) goto Lde
            goto Le5
        Lde:
            int r9 = r9 + 1
            r6 = r19
            r5 = 0
            goto Lc8
        Le4:
            r10 = 0
        Le5:
            s1.t r10 = (s1.t) r10
            if (r10 != 0) goto L10d
            int r5 = r1.size()
            r6 = 0
        Lee:
            if (r6 >= r5) goto Lff
            java.lang.Object r9 = r1.get(r6)
            r10 = r9
            s1.t r10 = (s1.t) r10
            boolean r10 = r10.f12294d
            if (r10 == 0) goto Lfc
            goto L100
        Lfc:
            int r6 = r6 + 1
            goto Lee
        Lff:
            r9 = 0
        L100:
            r10 = r9
            s1.t r10 = (s1.t) r10
            if (r10 != 0) goto L109
            r0.s1()
            return
        L109:
            long r5 = r10.f12291a
            r4.f8396h = r5
        L10d:
            java.lang.String r5 = "AwaitTouchSlop.touchSlopDetector was not initialized"
            java.lang.String r6 = "AwaitTouchSlop.initialDown was not initialized"
            if (r2 != r12) goto L1ca
            boolean r9 = r10.b()
            if (r9 != 0) goto L1b4
            boolean r9 = s1.s.d(r10)
            if (r9 == 0) goto L146
            int r3 = r1.size()
            r7 = 0
        L124:
            if (r7 >= r3) goto L136
            java.lang.Object r8 = r1.get(r7)
            r9 = r8
            s1.t r9 = (s1.t) r9
            boolean r9 = r9.f12294d
            if (r9 == 0) goto L133
            r14 = r8
            goto L137
        L133:
            int r7 = r7 + 1
            goto L124
        L136:
            r14 = 0
        L137:
            s1.t r14 = (s1.t) r14
            if (r14 != 0) goto L140
            r0.s1()
            goto L1ca
        L140:
            long r7 = r14.f12291a
            r4.f8396h = r7
            goto L1ca
        L146:
            i0.m2 r1 = y1.h1.f21958t
            java.lang.Object r1 = x1.k.h(r0, r1)
            y1.l2 r1 = (y1.l2) r1
            int r9 = r10.f12299i
            float r1 = m.j0.f(r1, r9)
            m.a3 r9 = r0.M
            if (r9 == 0) goto L1ae
            long r11 = s1.s.h(r10, r3)
            long r11 = r9.a(r11, r1, r3)
            r14 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r14 = r14 & r11
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r1 == 0) goto L1ab
            boolean r1 = r0.X(r10)
            k.k0 r9 = k.n.m(r0)
            if (r9 == 0) goto L181
            boolean r9 = r9.X(r10)
            if (r9 != r3) goto L181
            r9 = r3
            goto L182
        L181:
            r9 = 0
        L182:
            if (r1 != 0) goto L189
            if (r9 == 0) goto L189
            r4.f8397i = r3
            goto L1ca
        L189:
            r10.a()
            s1.t r1 = r4.f8395g
            r1.getClass()
            r0.B1(r1, r10, r11)
            r0.A1(r11, r10)
            long r11 = r10.f12291a
            m.w r1 = r0.G
            if (r1 != 0) goto L1a6
            m.w r1 = new m.w
            r1.<init>()
            r1.f8411g = r7
            r0.G = r1
        L1a6:
            r1.f8411g = r11
            r0.J = r1
            goto L1ca
        L1ab:
            r4.f8397i = r3
            goto L1ca
        L1ae:
            java.lang.String r1 = "Touch slop detector not initialized."
            j8.o.t(r1)
            return
        L1b4:
            s1.t r1 = r4.f8395g
            if (r1 == 0) goto L1c6
            long r7 = r4.f8396h
            m.a3 r3 = r0.M
            if (r3 == 0) goto L1c2
            r0.t1(r1, r7, r3)
            goto L1ca
        L1c2:
            j8.o.t(r5)
            return
        L1c6:
            j8.o.t(r6)
            return
        L1ca:
            if (r2 != r13) goto L34e
            boolean r1 = r4.f8397i
            if (r1 == 0) goto L34e
            boolean r1 = r10.b()
            if (r1 == 0) goto L1ec
            s1.t r1 = r4.f8395g
            if (r1 == 0) goto L1e8
            long r2 = r4.f8396h
            m.a3 r4 = r0.M
            if (r4 == 0) goto L1e4
            r0.t1(r1, r2, r4)
            return
        L1e4:
            j8.o.t(r5)
            return
        L1e8:
            j8.o.t(r6)
            return
        L1ec:
            r1 = 0
            r4.f8397i = r1
            return
        L1f0:
            boolean r5 = r4 instanceof m.u
            if (r5 == 0) goto L25d
            m.u r4 = (m.u) r4
            if (r2 == r13) goto L1fa
            goto L34e
        L1fa:
            java.lang.Object r1 = r1.f12262a
            int r2 = r1.size()
            r5 = 0
        L201:
            if (r5 >= r2) goto L214
            java.lang.Object r6 = r1.get(r5)
            s1.t r6 = (s1.t) r6
            boolean r6 = r6.b()
            if (r6 == 0) goto L211
            r3 = 0
            goto L214
        L211:
            int r5 = r5 + 1
            goto L201
        L214:
            int r2 = r1.size()
            r5 = 0
        L219:
            if (r5 >= r2) goto L259
            java.lang.Object r6 = r1.get(r5)
            s1.t r6 = (s1.t) r6
            boolean r6 = r6.f12294d
            if (r6 == 0) goto L256
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L22c
            goto L259
        L22c:
            if (r3 == 0) goto L34e
            java.lang.Object r1 = tf.m.t1(r1)
            s1.t r1 = (s1.t) r1
            long r1 = r1.f12293c
            s1.t r3 = r4.f8378g
            r3.getClass()
            long r5 = r3.f12293c
            long r1 = e1.b.d(r1, r5)
            r2 = r1
            s1.t r1 = r4.f8378g
            if (r1 == 0) goto L250
            r5 = r2
            long r2 = r4.f8379h
            r4 = r5
            r6 = 8
            u1(r0, r1, r2, r4, r6)
            return
        L250:
            java.lang.String r1 = "AwaitGesturePickup.initialDown was not initialized."
            j8.o.t(r1)
            return
        L256:
            int r5 = r5 + 1
            goto L219
        L259:
            r0.s1()
            return
        L25d:
            boolean r5 = r4 instanceof m.w
            if (r5 == 0) goto L345
            m.w r4 = (m.w) r4
            if (r2 == r12) goto L267
            goto L34e
        L267:
            long r5 = r4.f8411g
            java.lang.Object r2 = r1.f12262a
            int r7 = r2.size()
            r8 = 0
        L270:
            if (r8 >= r7) goto L285
            java.lang.Object r9 = r2.get(r8)
            r12 = r9
            s1.t r12 = (s1.t) r12
            long r12 = r12.f12291a
            boolean r12 = s1.s.e(r12, r5)
            if (r12 == 0) goto L282
            goto L286
        L282:
            int r8 = r8 + 1
            goto L270
        L285:
            r9 = 0
        L286:
            s1.t r9 = (s1.t) r9
            if (r9 != 0) goto L28c
            goto L34e
        L28c:
            boolean r2 = s1.s.d(r9)
            m.x r5 = m.x.f8417a
            if (r2 == 0) goto L31d
            java.lang.Object r1 = r1.f12262a
            int r2 = r1.size()
            r3 = 0
        L29b:
            if (r3 >= r2) goto L2ac
            java.lang.Object r6 = r1.get(r3)
            r7 = r6
            s1.t r7 = (s1.t) r7
            boolean r7 = r7.f12294d
            if (r7 == 0) goto L2a9
            goto L2ad
        L2a9:
            int r3 = r3 + 1
            goto L29b
        L2ac:
            r6 = 0
        L2ad:
            s1.t r6 = (s1.t) r6
            if (r6 != 0) goto L318
            boolean r1 = r9.b()
            if (r1 != 0) goto L30d
            boolean r1 = s1.s.d(r9)
            if (r1 == 0) goto L30d
            m.a r1 = r0.z1()
            g4.a.f(r1, r9, r10)
            i0.m2 r1 = y1.h1.f21958t
            java.lang.Object r1 = x1.k.h(r0, r1)
            y1.l2 r1 = (y1.l2) r1
            float r1 = r1.e()
            m.a r2 = r0.z1()
            long r3 = a.a.d(r1, r1)
            long r1 = r2.j(r3)
            m.a r3 = r0.z1()
            java.lang.Object r3 = r3.f8069h
            t1.b r3 = (t1.b) r3
            t1.d r4 = r3.f12980a
            t1.a[] r5 = r4.f12989d
            r6 = 0
            tf.l.x0(r6, r5)
            r5 = 0
            r4.f12990e = r5
            t1.d r4 = r3.f12981b
            t1.a[] r7 = r4.f12989d
            tf.l.x0(r6, r7)
            r4.f12990e = r5
            r3.f12982c = r10
            sg.g r3 = r0.y1()
            m.a0 r4 = new m.a0
            long r1 = m.s0.c(r1)
            r4.<init>(r1, r5)
            r3.p(r4)
            r0.E = r5
            goto L314
        L30d:
            sg.g r1 = r0.y1()
            r1.p(r5)
        L314:
            r0.s1()
            return
        L318:
            long r1 = r6.f12291a
            r4.f8411g = r1
            return
        L31d:
            boolean r1 = r9.b()
            if (r1 == 0) goto L32b
            sg.g r1 = r0.y1()
            r1.p(r5)
            return
        L32b:
            long r1 = s1.s.h(r9, r3)
            float r1 = e1.b.c(r1)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L339
            goto L34e
        L339:
            r1 = 0
            long r1 = s1.s.h(r9, r1)
            r0.A1(r1, r9)
            r9.a()
            return
        L345:
            okio.a.k()
            return
        L349:
            java.lang.String r1 = "currentDragState should not be null"
            j8.o.t(r1)
        L34e:
            return
    }

    @Override // p1.c
    public final void T0(ac.k r29, s1.l r30) {
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            int r3 = r1.f177h
            java.lang.Object r1 = r1.f178i
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            k.l0 r4 = r0.A
            if (r4 != 0) goto L1a
            k.l0 r4 = new k.l0
            r4.<init>(r0)
            r0.k1(r4)
            r0.A = r4
        L1a:
            boolean r4 = r0.f8322y
            if (r4 == 0) goto L3aa
            m.b1 r4 = r0.N
            if (r4 != 0) goto L29
            m.b1 r4 = new m.b1
            r4.<init>(r0)
            r0.N = r4
        L29:
            m.b1 r5 = r0.N
            if (r5 == 0) goto L3aa
            m.p0 r4 = r5.f8082a
            a7.a r6 = r5.f8087f
            r11 = 0
            if (r6 != 0) goto L47
            m.w0 r6 = r5.f8083b
            if (r6 != 0) goto L45
            m.w0 r6 = new m.w0
            r6.<init>()
            m.v0 r7 = m.v0.f8400i
            r6.f8412b = r7
            r6.f8413c = r11
            r5.f8083b = r6
        L45:
            r5.f8087f = r6
        L47:
            a7.a r6 = r5.f8087f
            if (r6 == 0) goto L3a5
            boolean r7 = r6 instanceof m.w0
            r14 = 0
            s1.l r8 = s1.l.f12274g
            r9 = 1
            s1.l r10 = s1.l.f12275h
            if (r7 == 0) goto Le3
            m.w0 r6 = (m.w0) r6
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L60
            goto L3aa
        L60:
            int r7 = r1.size()
        L64:
            if (r11 >= r7) goto L77
            java.lang.Object r16 = r1.get(r11)
            p1.b r16 = (p1.b) r16
            boolean r16 = ac.p.j(r16)
            if (r16 != 0) goto L74
            goto L3aa
        L74:
            int r11 = r11 + 1
            goto L64
        L77:
            java.lang.Object r1 = tf.m.t1(r1)
            p1.b r1 = (p1.b) r1
            m.v0 r7 = r6.f8412b
            int[] r11 = m.a1.f8072a
            int r7 = r7.ordinal()
            r7 = r11[r7]
            m.v0 r11 = m.v0.f8399h
            m.v0 r12 = m.v0.f8398g
            if (r7 != r9) goto L97
            boolean r4 = r4.C1()
            if (r4 != 0) goto L95
            r4 = r12
            goto L99
        L95:
            r4 = r11
            goto L99
        L97:
            m.v0 r4 = r6.f8412b
        L99:
            r6.f8412b = r4
            if (r2 != r8) goto La3
            if (r4 != r11) goto La3
            r1.f10084i = r9
            r6.f8413c = r9
        La3:
            if (r2 != r10) goto L3aa
            if (r4 != r12) goto Lb2
            long r7 = r1.f10076a
            r9 = 0
            r11 = 12
            r6 = r1
            m.b1.c(r5, r6, r7, r9, r11)
            return
        Lb2:
            boolean r2 = r6.f8413c
            if (r2 == 0) goto L3aa
            p1.a r8 = new p1.a
            r8.<init>(r3)
            r9 = 0
            r7 = r1
            r6 = r1
            r5.f(r6, r7, r8, r9)
            p1.a r1 = new p1.a
            r1.<init>(r3)
            r5.e(r6, r1, r14)
            long r1 = r6.f10076a
            m.z0 r3 = r5.f8084c
            if (r3 != 0) goto Lde
            m.z0 r3 = new m.z0
            r3.<init>()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.f8431b = r6
            r5.f8084c = r3
        Lde:
            r3.f8431b = r1
            r5.f8087f = r3
            return
        Le3:
            boolean r7 = r6 instanceof m.y0
            s1.l r12 = s1.l.f12276i
            r13 = 0
            if (r7 == 0) goto L22a
            r14 = r6
            m.y0 r14 = (m.y0) r14
            if (r2 != r8) goto Lf1
            goto L3aa
        Lf1:
            int r6 = r1.size()
            r7 = r11
        Lf6:
            if (r7 >= r6) goto L117
            java.lang.Object r8 = r1.get(r7)
            r15 = r8
            p1.b r15 = (p1.b) r15
            r17 = r12
            long r11 = r15.f10076a
            r19 = r10
            long r9 = r14.f8427c
            boolean r9 = s1.s.e(r11, r9)
            if (r9 == 0) goto L10e
            goto L11c
        L10e:
            int r7 = r7 + 1
            r12 = r17
            r10 = r19
            r9 = 1
            r11 = 0
            goto Lf6
        L117:
            r19 = r10
            r17 = r12
            r8 = r13
        L11c:
            p1.b r8 = (p1.b) r8
            if (r8 != 0) goto L143
            int r6 = r1.size()
            r7 = 0
        L125:
            if (r7 >= r6) goto L136
            java.lang.Object r8 = r1.get(r7)
            r9 = r8
            p1.b r9 = (p1.b) r9
            boolean r9 = r9.f10079d
            if (r9 == 0) goto L133
            goto L137
        L133:
            int r7 = r7 + 1
            goto L125
        L136:
            r8 = r13
        L137:
            p1.b r8 = (p1.b) r8
            if (r8 != 0) goto L13f
            r5.a()
            return
        L13f:
            long r6 = r8.f10076a
            r14.f8427c = r6
        L143:
            r7 = r8
            java.lang.String r11 = "AwaitTouchSlop.touchSlopDetector was not initialized"
            java.lang.String r12 = "AwaitTouchSlop.initialDown was not initialized"
            r8 = r19
            if (r2 != r8) goto L174
            boolean r6 = r7.f10084i
            if (r6 != 0) goto L1ef
            boolean r6 = ac.p.c(r7)
            if (r6 == 0) goto L17d
            int r3 = r1.size()
            r4 = 0
        L15b:
            if (r4 >= r3) goto L16d
            java.lang.Object r6 = r1.get(r4)
            r8 = r6
            p1.b r8 = (p1.b) r8
            boolean r8 = r8.f10079d
            if (r8 == 0) goto L16a
            r13 = r6
            goto L16d
        L16a:
            int r4 = r4 + 1
            goto L15b
        L16d:
            p1.b r13 = (p1.b) r13
            if (r13 != 0) goto L178
            r5.a()
        L174:
            r9 = r17
            goto L206
        L178:
            long r3 = r13.f10076a
            r14.f8427c = r3
            goto L174
        L17d:
            i0.m2 r1 = y1.h1.f21958t
            java.lang.Object r1 = x1.k.h(r4, r1)
            y1.l2 r1 = (y1.l2) r1
            float r6 = m.j0.f8216a
            float r1 = r1.f()
            m.a3 r6 = r5.f8090i
            if (r6 == 0) goto L1e9
            m.p1 r4 = r4.f8320w
            p1.a r8 = new p1.a
            r8.<init>(r3)
            r10 = r5
            r9 = 1
            long r4 = ac.p.H(r7, r4, r8, r9)
            long r4 = r6.a(r4, r1, r9)
            r18 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r18 = r4 & r18
            r20 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r1 == 0) goto L1e5
            r7.f10084i = r9
            p1.b r6 = r14.f8426b
            r6.getClass()
            p1.a r8 = new p1.a
            r8.<init>(r3)
            r26 = r4
            r5 = r10
            r9 = r26
            r5.f(r6, r7, r8, r9)
            p1.a r1 = new p1.a
            r1.<init>(r3)
            r5.e(r7, r1, r9)
            long r3 = r7.f10076a
            m.z0 r1 = r5.f8084c
            if (r1 != 0) goto L1e0
            m.z0 r1 = new m.z0
            r1.<init>()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.f8431b = r8
            r5.f8084c = r1
        L1e0:
            r1.f8431b = r3
            r5.f8087f = r1
            goto L174
        L1e5:
            r5 = r10
            r14.f8428d = r9
            goto L174
        L1e9:
            java.lang.String r1 = "Touch slop detector not initialized."
            j8.o.t(r1)
            return
        L1ef:
            p1.b r1 = r14.f8426b
            if (r1 == 0) goto L202
            long r3 = r14.f8427c
            m.a3 r6 = r5.f8090i
            if (r6 == 0) goto L1fe
            r5.b(r1, r3, r6)
            goto L174
        L1fe:
            j8.o.t(r11)
            return
        L202:
            j8.o.t(r12)
            return
        L206:
            if (r2 != r9) goto L3aa
            boolean r1 = r14.f8428d
            if (r1 == 0) goto L3aa
            boolean r1 = r7.f10084i
            if (r1 == 0) goto L226
            p1.b r1 = r14.f8426b
            if (r1 == 0) goto L222
            long r2 = r14.f8427c
            m.a3 r4 = r5.f8090i
            if (r4 == 0) goto L21e
            r5.b(r1, r2, r4)
            return
        L21e:
            j8.o.t(r11)
            return
        L222:
            j8.o.t(r12)
            return
        L226:
            r1 = 0
            r14.f8428d = r1
            return
        L22a:
            r8 = r10
            r9 = r12
            boolean r7 = r6 instanceof m.x0
            if (r7 == 0) goto L2a6
            m.x0 r6 = (m.x0) r6
            if (r2 == r9) goto L236
            goto L3aa
        L236:
            int r2 = r1.size()
            r7 = 0
        L23b:
            if (r7 >= r2) goto L24c
            java.lang.Object r8 = r1.get(r7)
            p1.b r8 = (p1.b) r8
            boolean r8 = r8.f10084i
            if (r8 == 0) goto L249
            r9 = 0
            goto L24d
        L249:
            int r7 = r7 + 1
            goto L23b
        L24c:
            r9 = 1
        L24d:
            int r2 = r1.size()
            r11 = 0
        L252:
            if (r11 >= r2) goto L2a2
            java.lang.Object r7 = r1.get(r11)
            p1.b r7 = (p1.b) r7
            boolean r7 = r7.f10079d
            if (r7 == 0) goto L29f
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L265
            goto L2a2
        L265:
            if (r9 == 0) goto L3aa
            java.lang.Object r1 = tf.m.t1(r1)
            p1.b r1 = (p1.b) r1
            m.p1 r2 = r4.f8320w
            p1.a r7 = new p1.a
            r7.<init>(r3)
            long r1 = ac.p.I(r1, r2, r7)
            p1.b r7 = r6.f8418b
            r7.getClass()
            m.p1 r4 = r4.f8320w
            p1.a r8 = new p1.a
            r8.<init>(r3)
            long r3 = ac.p.I(r7, r4, r8)
            long r9 = e1.b.d(r1, r3)
            p1.b r1 = r6.f8418b
            if (r1 == 0) goto L299
            long r7 = r6.f8419c
            r11 = 8
            r6 = r1
            m.b1.c(r5, r6, r7, r9, r11)
            return
        L299:
            java.lang.String r1 = "AwaitGesturePickup.initialDown was not initialized."
            j8.o.t(r1)
            return
        L29f:
            int r11 = r11 + 1
            goto L252
        L2a2:
            r5.a()
            return
        L2a6:
            boolean r7 = r6 instanceof m.z0
            if (r7 == 0) goto L3a1
            m.z0 r6 = (m.z0) r6
            if (r2 == r8) goto L2b0
            goto L3aa
        L2b0:
            long r7 = r6.f8431b
            int r2 = r1.size()
            r9 = 0
        L2b7:
            if (r9 >= r2) goto L2cc
            java.lang.Object r10 = r1.get(r9)
            r11 = r10
            p1.b r11 = (p1.b) r11
            long r11 = r11.f10076a
            boolean r11 = s1.s.e(r11, r7)
            if (r11 == 0) goto L2c9
            goto L2cd
        L2c9:
            int r9 = r9 + 1
            goto L2b7
        L2cc:
            r10 = r13
        L2cd:
            p1.b r10 = (p1.b) r10
            if (r10 != 0) goto L2d3
            goto L3aa
        L2d3:
            boolean r2 = ac.p.c(r10)
            m.x r7 = m.x.f8417a
            if (r2 == 0) goto L36b
            int r2 = r1.size()
            r8 = 0
        L2e0:
            if (r8 >= r2) goto L2f1
            java.lang.Object r9 = r1.get(r8)
            r11 = r9
            p1.b r11 = (p1.b) r11
            boolean r11 = r11.f10079d
            if (r11 == 0) goto L2ee
            goto L2f2
        L2ee:
            int r8 = r8 + 1
            goto L2e0
        L2f1:
            r9 = r13
        L2f2:
            p1.b r9 = (p1.b) r9
            if (r9 != 0) goto L366
            boolean r1 = r10.f10084i
            if (r1 != 0) goto L35f
            boolean r1 = ac.p.c(r10)
            if (r1 == 0) goto L35f
            p1.a r1 = new p1.a
            r1.<init>(r3)
            m.a r19 = r5.d()
            m.p1 r2 = r4.f8320w
            a5.a r3 = r5.f8091j
            long r6 = r5.f8093l
            r22 = r1
            r21 = r2
            r23 = r3
            r24 = r6
            r20 = r10
            ac.p.b(r19, r20, r21, r22, r23, r24)
            i0.m2 r1 = y1.h1.f21958t
            java.lang.Object r1 = x1.k.h(r4, r1)
            y1.l2 r1 = (y1.l2) r1
            float r1 = r1.e()
            m.a r2 = r5.d()
            long r6 = a.a.d(r1, r1)
            long r1 = r2.j(r6)
            m.a r3 = r5.d()
            java.lang.Object r3 = r3.f8069h
            t1.b r3 = (t1.b) r3
            t1.d r6 = r3.f12980a
            t1.a[] r7 = r6.f12989d
            tf.l.x0(r13, r7)
            r7 = 0
            r6.f12990e = r7
            t1.d r6 = r3.f12981b
            t1.a[] r8 = r6.f12989d
            tf.l.x0(r13, r8)
            r6.f12990e = r7
            r3.f12982c = r14
            m.a0 r3 = new m.a0
            long r1 = m.s0.c(r1)
            r9 = 1
            r3.<init>(r1, r9)
            r4.v1(r3)
            goto L362
        L35f:
            r4.v1(r7)
        L362:
            r5.a()
            return
        L366:
            long r1 = r9.f10076a
            r6.f8431b = r1
            return
        L36b:
            boolean r1 = r10.f10084i
            if (r1 == 0) goto L373
            r4.v1(r7)
            return
        L373:
            m.p1 r1 = r4.f8320w
            p1.a r2 = new p1.a
            r2.<init>(r3)
            r9 = 1
            long r1 = ac.p.H(r10, r1, r2, r9)
            float r1 = e1.b.c(r1)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L389
            goto L3aa
        L389:
            m.p1 r1 = r4.f8320w
            p1.a r2 = new p1.a
            r2.<init>(r3)
            r7 = 0
            long r1 = ac.p.H(r10, r1, r2, r7)
            p1.a r4 = new p1.a
            r4.<init>(r3)
            r5.e(r10, r4, r1)
            r9 = 1
            r10.f10084i = r9
            return
        L3a1:
            okio.a.k()
            return
        L3a5:
            java.lang.String r1 = "currentDragState should not be null"
            j8.o.t(r1)
        L3aa:
            return
    }

    @Override // k.k0
    public final boolean X(s1.t r9) {
            r8 = this;
            boolean r0 = s1.s.b(r9)
            if (r0 == 0) goto L9
            boolean r9 = r8.f8322y
            return r9
        L9:
            boolean r0 = s1.s.d(r9)
            r1 = 0
            if (r0 == 0) goto L12
            goto L97
        L12:
            m.a3 r0 = r8.M
            if (r0 != 0) goto L1f
            m.a3 r0 = new m.a3
            m.p1 r2 = r8.f8320w
            r0.<init>(r2)
            r8.M = r0
        L1f:
            i0.m2 r0 = y1.h1.f21958t
            java.lang.Object r0 = x1.k.h(r8, r0)
            y1.l2 r0 = (y1.l2) r0
            float r0 = r0.f()
            long r2 = s1.s.h(r9, r1)
            m.a3 r9 = r8.M
            if (r9 == 0) goto L98
            long r4 = r9.a(r2, r0, r1)
            r6 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r0 = e1.b.b(r4, r6)
            if (r0 != 0) goto L97
            long r4 = r9.f8078b
            long r2 = e1.b.e(r4, r2)
            r0 = 32
            long r4 = r2 >> r0
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = java.lang.Math.abs(r0)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = java.lang.Math.abs(r2)
            double r2 = (double) r2
            double r4 = (double) r0
            double r2 = java.lang.Math.atan2(r2, r4)
            float r0 = (float) r2
            r2 = 180(0xb4, float:2.52E-43)
            float r2 = (float) r2
            float r0 = r0 * r2
            double r2 = (double) r0
            r4 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r2 = r2 / r4
            m.p1 r9 = r9.f8077a
            if (r9 != 0) goto L7c
            r9 = -1
            goto L84
        L7c:
            int[] r0 = m.z2.f8436a
            int r9 = r9.ordinal()
            r9 = r0[r9]
        L84:
            r0 = 1
            r4 = 4629137466983448576(0x403e000000000000, double:30.0)
            if (r9 == r0) goto L92
            r6 = 2
            if (r9 == r6) goto L8d
            goto L97
        L8d:
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L97
            goto L96
        L92:
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L97
        L96:
            return r0
        L97:
            return r1
        L98:
            java.lang.String r9 = "Touch slop detector not initialized."
            j8.o.t(r9)
            r9 = 0
            return r9
    }

    @Override // x1.w1
    public final void b0() {
            r2 = this;
            boolean r0 = r2.E
            if (r0 == 0) goto L17
            r2.s1()
            boolean r0 = r2.D
            if (r0 == 0) goto L14
            sg.g r0 = r2.y1()
            m.x r1 = m.x.f8417a
            r0.p(r1)
        L14:
            r0 = 0
            r2.K = r0
        L17:
            r0 = 0
            r2.E = r0
            return
    }

    @Override // y0.n
    public final void d1() {
            r2 = this;
            r0 = 0
            r2.D = r0
            r2.q1()
            r0 = 0
            r2.O = r0
            k.l0 r0 = r2.A
            if (r0 == 0) goto L11
            r2.l1(r0)
        L11:
            r0 = 0
            r2.A = r0
            return
    }

    public final void q1() {
            r3 = this;
            n.b r0 = r3.C
            if (r0 == 0) goto L13
            n.k r1 = r3.f8323z
            if (r1 == 0) goto L10
            n.a r2 = new n.a
            r2.<init>(r0)
            r1.b(r2)
        L10:
            r0 = 0
            r3.C = r0
        L13:
            return
    }

    public abstract java.lang.Object r1(m.o0 r1, m.o0 r2);

    public final void s1() {
            r3 = this;
            m.t r0 = r3.F
            r1 = 0
            m.s r2 = m.s.f8354i
            if (r0 != 0) goto L12
            m.t r0 = new m.t
            r0.<init>()
            r0.f8364g = r2
            r0.f8365h = r1
            r3.F = r0
        L12:
            r0.f8364g = r2
            r0.f8365h = r1
            r3.J = r0
            return
    }

    public final void t1(s1.t r4, long r5, m.a3 r7) {
            r3 = this;
            m.u r0 = r3.I
            if (r0 != 0) goto L15
            m.u r0 = new m.u
            r0.<init>()
            r1 = 0
            r0.f8378g = r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.f8379h = r1
            r3.I = r0
        L15:
            r0.f8378g = r4
            r0.f8379h = r5
            r4 = 0
            r7.f8078b = r4
            r3.J = r0
            return
    }

    public final void v1(m.b0 r2) {
            r1 = this;
            boolean r0 = r2 instanceof m.z
            if (r0 == 0) goto Le
            boolean r0 = r1.D
            if (r0 != 0) goto Le
            r0 = 1
            r1.D = r0
            r1.D1()
        Le:
            sg.g r0 = r1.y1()
            r0.p(r2)
            return
    }

    public abstract void w1(long r1);

    public abstract void x1(m.a0 r1);

    @Override // p1.c
    public final void y0() {
            r3 = this;
            m.b1 r0 = r3.N
            if (r0 == 0) goto L20
            r0.a()
            m.p0 r1 = r0.f8082a
            boolean r2 = r1.D
            if (r2 == 0) goto L12
            m.x r2 = m.x.f8417a
            r1.v1(r2)
        L12:
            r1 = 0
            r0.f8088g = r1
            a5.a r0 = r0.f8092k
            r1 = 0
            r0.f56h = r1
            java.lang.Object r0 = r0.f57i
            f.y r0 = (f.y) r0
            r0.f2924b = r1
        L20:
            return
    }

    public final sg.g y1() {
            r1 = this;
            sg.c r0 = r1.B
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Events channel not initialized."
            j8.o.t(r0)
            r0 = 0
            return r0
    }

    public final m.a z1() {
            r1 = this;
            m.a r0 = r1.K
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Velocity Tracker not initialized."
            j8.o.t(r0)
            r0 = 0
            return r0
    }
}
