package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 extends x1.n0 implements v1.m0, v1.t, x1.s1 {
    public static final f1.o0 T = null;
    public static final x1.t U = null;
    public static final float[] V = null;
    public static final x1.c1 W = null;
    public static final x1.d1 X = null;
    public u2.c A;
    public u2.m B;
    public float C;
    public v1.o0 D;
    public f.b0 E;
    public long F;
    public float G;
    public e1.a H;
    public x1.t I;
    public f1.r0 J;
    public boolean K;
    public boolean L;
    public i1.b M;
    public f1.u N;
    public a1.g O;
    public final x1.f1 P;
    public boolean Q;
    public x1.q1 R;
    public i1.b S;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x1.f0 f20943u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public x1.i1 f20944v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x1.i1 f20945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20946x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f20947y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public fg.l f20948z;

    static {
            f1.o0 r0 = new f1.o0
            r0.<init>()
            x1.i1.T = r0
            x1.t r0 = new x1.t
            r0.<init>()
            x1.i1.U = r0
            float[] r0 = f1.i0.a()
            x1.i1.V = r0
            x1.c1 r0 = new x1.c1
            r0.<init>()
            x1.i1.W = r0
            x1.d1 r0 = new x1.d1
            r0.<init>()
            x1.i1.X = r0
            return
    }

    public i1(x1.f0 r3) {
            r2 = this;
            r2.<init>()
            r2.f20943u = r3
            u2.c r0 = r3.E
            r2.A = r0
            u2.m r3 = r3.F
            r2.B = r3
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            r2.C = r3
            r0 = 0
            r2.F = r0
            f1.m0 r3 = f1.c0.f3038b
            r2.J = r3
            x1.f1 r3 = new x1.f1
            r0 = 1
            r3.<init>(r2, r0)
            r2.P = r3
            return
    }

    public static x1.i1 M1(v1.t r1) {
            boolean r0 = r1 instanceof v1.l0
            if (r0 == 0) goto L8
            r0 = r1
            v1.l0 r0 = (v1.l0) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L13
            x1.o0 r0 = r0.f13982g
            x1.i1 r0 = r0.f21007u
            if (r0 != 0) goto L12
            goto L13
        L12:
            return r0
        L13:
            r1.getClass()
            x1.i1 r1 = (x1.i1) r1
            return r1
    }

    public final void A1() {
            r1 = this;
            x1.f0 r0 = r1.f20943u
            x1.j0 r0 = r0.M
            r0.b()
            return
    }

    @Override // v1.b1
    public abstract void B0(long r1, float r3, i1.b r4);

    public final void B1() {
            r13 = this;
            r0 = 128(0x80, float:1.8E-43)
            boolean r1 = x1.j1.g(r0)
            y0.n r2 = r13.t1(r1)
            if (r2 == 0) goto La1
            y0.n r2 = r2.f21819g
            int r2 = r2.f21822j
            r2 = r2 & r0
            if (r2 == 0) goto La1
            w0.f r2 = w0.q.e()
            r3 = 0
            if (r2 == 0) goto L1f
            fg.l r4 = r2.e()
            goto L20
        L1f:
            r4 = r3
        L20:
            w0.f r5 = w0.q.h(r2)
            if (r1 == 0) goto L2e
            y0.n r6 = r13.r1()     // Catch: java.lang.Throwable -> L2b
            goto L38
        L2b:
            r0 = move-exception
            goto L9d
        L2e:
            y0.n r6 = r13.r1()     // Catch: java.lang.Throwable -> L2b
            y0.n r6 = r6.f21823k     // Catch: java.lang.Throwable -> L2b
            if (r6 != 0) goto L38
            goto L99
        L38:
            y0.n r1 = r13.t1(r1)     // Catch: java.lang.Throwable -> L2b
        L3c:
            if (r1 == 0) goto L99
            int r7 = r1.f21822j     // Catch: java.lang.Throwable -> L2b
            r7 = r7 & r0
            if (r7 == 0) goto L99
            int r7 = r1.f21821i     // Catch: java.lang.Throwable -> L2b
            r7 = r7 & r0
            if (r7 == 0) goto L94
            r7 = r1
            r8 = r3
        L4a:
            if (r7 == 0) goto L94
            boolean r9 = r7 instanceof x1.w0     // Catch: java.lang.Throwable -> L2b
            if (r9 == 0) goto L58
            x1.w0 r7 = (x1.w0) r7     // Catch: java.lang.Throwable -> L2b
            long r9 = r13.f13902i     // Catch: java.lang.Throwable -> L2b
            r7.e(r9)     // Catch: java.lang.Throwable -> L2b
            goto L8f
        L58:
            int r9 = r7.f21821i     // Catch: java.lang.Throwable -> L2b
            r9 = r9 & r0
            if (r9 == 0) goto L8f
            boolean r9 = r7 instanceof x1.j     // Catch: java.lang.Throwable -> L2b
            if (r9 == 0) goto L8f
            r9 = r7
            x1.j r9 = (x1.j) r9     // Catch: java.lang.Throwable -> L2b
            y0.n r9 = r9.f20950v     // Catch: java.lang.Throwable -> L2b
            r10 = 0
        L67:
            r11 = 1
            if (r9 == 0) goto L8c
            int r12 = r9.f21821i     // Catch: java.lang.Throwable -> L2b
            r12 = r12 & r0
            if (r12 == 0) goto L89
            int r10 = r10 + 1
            if (r10 != r11) goto L75
            r7 = r9
            goto L89
        L75:
            if (r8 != 0) goto L80
            j0.b r8 = new j0.b     // Catch: java.lang.Throwable -> L2b
            r11 = 16
            y0.n[] r11 = new y0.n[r11]     // Catch: java.lang.Throwable -> L2b
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L2b
        L80:
            if (r7 == 0) goto L86
            r8.b(r7)     // Catch: java.lang.Throwable -> L2b
            r7 = r3
        L86:
            r8.b(r9)     // Catch: java.lang.Throwable -> L2b
        L89:
            y0.n r9 = r9.f21824l     // Catch: java.lang.Throwable -> L2b
            goto L67
        L8c:
            if (r10 != r11) goto L8f
            goto L4a
        L8f:
            y0.n r7 = x1.k.e(r8)     // Catch: java.lang.Throwable -> L2b
            goto L4a
        L94:
            if (r1 == r6) goto L99
            y0.n r1 = r1.f21824l     // Catch: java.lang.Throwable -> L2b
            goto L3c
        L99:
            w0.q.k(r2, r5, r4)
            return
        L9d:
            w0.q.k(r2, r5, r4)
            throw r0
        La1:
            return
    }

    @Override // v1.t
    public final boolean C() {
            r1 = this;
            y0.n r0 = r1.r1()
            boolean r0 = r0.f21832t
            return r0
    }

    public final void C1() {
            r10 = this;
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r1 = x1.j1.g(r0)
            y0.n r2 = r10.r1()
            if (r1 == 0) goto Ld
            goto L13
        Ld:
            y0.n r2 = r2.f21823k
            if (r2 != 0) goto L13
            goto L73
        L13:
            y0.n r1 = r10.t1(r1)
        L17:
            if (r1 == 0) goto L73
            int r3 = r1.f21822j
            r3 = r3 & r0
            if (r3 == 0) goto L73
            int r3 = r1.f21821i
            r3 = r3 & r0
            if (r3 == 0) goto L6e
            r3 = 0
            r4 = r1
            r5 = r3
        L26:
            if (r4 == 0) goto L6e
            boolean r6 = r4 instanceof x1.u
            if (r6 == 0) goto L32
            x1.u r4 = (x1.u) r4
            r4.p0(r10)
            goto L69
        L32:
            int r6 = r4.f21821i
            r6 = r6 & r0
            if (r6 == 0) goto L69
            boolean r6 = r4 instanceof x1.j
            if (r6 == 0) goto L69
            r6 = r4
            x1.j r6 = (x1.j) r6
            y0.n r6 = r6.f20950v
            r7 = 0
        L41:
            r8 = 1
            if (r6 == 0) goto L66
            int r9 = r6.f21821i
            r9 = r9 & r0
            if (r9 == 0) goto L63
            int r7 = r7 + 1
            if (r7 != r8) goto L4f
            r4 = r6
            goto L63
        L4f:
            if (r5 != 0) goto L5a
            j0.b r5 = new j0.b
            r8 = 16
            y0.n[] r8 = new y0.n[r8]
            r5.<init>(r8)
        L5a:
            if (r4 == 0) goto L60
            r5.b(r4)
            r4 = r3
        L60:
            r5.b(r6)
        L63:
            y0.n r6 = r6.f21824l
            goto L41
        L66:
            if (r7 != r8) goto L69
            goto L26
        L69:
            y0.n r4 = x1.k.e(r5)
            goto L26
        L6e:
            if (r1 == r2) goto L73
            y0.n r1 = r1.f21824l
            goto L17
        L73:
            return
    }

    public final void D1() {
            r4 = this;
            r0 = 1
            r4.f20946x = r0
            x1.f1 r0 = r4.P
            r0.invoke()
            r4.J1()
            long r0 = r4.F
            r2 = 0
            boolean r0 = u2.j.b(r0, r2)
            if (r0 != 0) goto L1a
            x1.f0 r0 = r4.f20943u
            r0.N(r4)
        L1a:
            return
    }

    @Override // v1.t
    public final void E(float[] r7) {
            r6 = this;
            x1.f0 r0 = r6.f20943u
            x1.r1 r0 = x1.i0.a(r0)
            v1.t r1 = v1.w.h(r6)
            x1.i1 r1 = M1(r1)
            r6.P1(r1, r7)
            boolean r2 = r0 instanceof y1.t
            if (r2 == 0) goto L1b
            y1.t r0 = (y1.t) r0
            r0.v(r7)
            return
        L1b:
            r2 = 0
            long r0 = r1.P(r2)
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r0
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L47
            r2 = 32
            long r2 = r0 >> r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            f1.i0.f(r7, r2, r0)
        L47:
            return
    }

    public final void E1() {
            r10 = this;
            r0 = 1048576(0x100000, float:1.469368E-39)
            boolean r1 = x1.j1.g(r0)
            y0.n r2 = r10.t1(r1)
            if (r2 == 0) goto L75
            y0.n r2 = r2.f21819g
            int r2 = r2.f21822j
            r2 = r2 & r0
            if (r2 == 0) goto L75
            y0.n r2 = r10.r1()
            if (r1 == 0) goto L1a
            goto L1f
        L1a:
            y0.n r2 = r2.f21823k
            if (r2 != 0) goto L1f
            goto L75
        L1f:
            y0.n r1 = r10.t1(r1)
        L23:
            if (r1 == 0) goto L75
            int r3 = r1.f21822j
            r3 = r3 & r0
            if (r3 == 0) goto L75
            int r3 = r1.f21821i
            r3 = r3 & r0
            if (r3 == 0) goto L70
            r3 = 0
            r4 = r1
            r5 = r3
        L32:
            if (r4 == 0) goto L70
            int r6 = r4.f21821i
            r6 = r6 & r0
            if (r6 == 0) goto L6b
            boolean r6 = r4 instanceof x1.j
            if (r6 == 0) goto L6b
            r6 = r4
            x1.j r6 = (x1.j) r6
            y0.n r6 = r6.f20950v
            r7 = 0
        L43:
            r8 = 1
            if (r6 == 0) goto L68
            int r9 = r6.f21821i
            r9 = r9 & r0
            if (r9 == 0) goto L65
            int r7 = r7 + 1
            if (r7 != r8) goto L51
            r4 = r6
            goto L65
        L51:
            if (r5 != 0) goto L5c
            j0.b r5 = new j0.b
            r8 = 16
            y0.n[] r8 = new y0.n[r8]
            r5.<init>(r8)
        L5c:
            if (r4 == 0) goto L62
            r5.b(r4)
            r4 = r3
        L62:
            r5.b(r6)
        L65:
            y0.n r6 = r6.f21824l
            goto L43
        L68:
            if (r7 != r8) goto L6b
            goto L32
        L6b:
            y0.n r4 = x1.k.e(r5)
            goto L32
        L70:
            if (r1 == r2) goto L75
            y0.n r1 = r1.f21824l
            goto L23
        L75:
            return
    }

    @Override // v1.t
    public final long F() {
            r2 = this;
            long r0 = r2.f13902i
            return r0
    }

    public final void F1(y0.n r17, x1.e1 r18, long r19, x1.p r21, int r22, boolean r23, float r24, boolean r25) {
            r16 = this;
            r2 = r17
            if (r2 != 0) goto L14
            r3 = r16
            r4 = r18
            r5 = r19
            r7 = r21
            r8 = r22
            r9 = r23
            r3.x1(r4, r5, r7, r8, r9)
            return
        L14:
            r3 = r18
            boolean r0 = r3.b(r2)
            if (r0 != 0) goto L37
            int r0 = r3.a()
            y0.n r1 = x1.k.d(r2, r0)
            r0 = r16
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r2 = r3
            r3 = r19
            r0.F1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        L37:
            r6 = r22
            r0 = 3
            if (r6 != r0) goto L3d
            goto L40
        L3d:
            r1 = 4
            if (r6 != r1) goto L1a9
        L40:
            r1 = 0
            r4 = r1
            r3 = r2
        L43:
            if (r3 == 0) goto L1a9
            boolean r5 = r3 instanceof x1.w1
            r7 = 0
            r11 = 1
            if (r5 == 0) goto L168
            x1.w1 r3 = (x1.w1) r3
            long r3 = r3.H()
            r1 = 32
            long r8 = r19 >> r1
            int r1 = (int) r8
            float r5 = java.lang.Float.intBitsToFloat(r1)
            r8 = r16
            x1.f0 r9 = r8.f20943u
            u2.m r10 = r9.F
            int r12 = x1.c2.f20854b
            r12 = -9223372036854775808
            long r12 = r12 & r3
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r13 = 2
            u2.m r14 = u2.m.f13354g
            if (r12 == 0) goto L76
            if (r10 != r14) goto L71
            goto L76
        L71:
            int r10 = x1.d1.g(r13, r3)
            goto L7a
        L76:
            int r10 = x1.d1.g(r7, r3)
        L7a:
            int r10 = -r10
            float r10 = (float) r10
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 < 0) goto L1a9
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r5 = r8.w0()
            u2.m r9 = r9.F
            if (r12 == 0) goto L94
            if (r9 != r14) goto L8f
            goto L94
        L8f:
            int r7 = x1.d1.g(r7, r3)
            goto L98
        L94:
            int r7 = x1.d1.g(r13, r3)
        L98:
            int r5 = r5 + r7
            float r5 = (float) r5
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L1a9
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r19 & r9
            int r1 = (int) r9
            float r5 = java.lang.Float.intBitsToFloat(r1)
            int r7 = x1.d1.g(r11, r3)
            int r7 = -r7
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L1a9
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r5 = r8.r0()
            int r0 = x1.d1.g(r0, r3)
            int r0 = r0 + r5
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1a9
            x1.g1 r0 = new x1.g1
            r3 = r18
            r4 = r19
            r9 = r24
            r10 = r25
            r7 = r6
            r1 = r8
            r6 = r21
            r8 = r23
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            f.y r1 = r6.f21016h
            f.f0 r3 = r6.f21015g
            int r4 = r6.f21017i
            int r5 = r3.f2804b
            int r7 = r5 + (-1)
            r9 = 0
            if (r4 != r7) goto L100
            int r7 = r4 + 1
            r6.c(r7, r5)
            int r5 = r6.f21017i
            int r5 = r5 + r11
            r6.f21017i = r5
            r3.a(r2)
            long r2 = x1.k.a(r9, r8, r11)
            r1.a(r2)
            r0.invoke()
            r6.f21017i = r4
            return
        L100:
            long r4 = r6.a()
            int r7 = r6.f21017i
            boolean r10 = x1.k.o(r4)
            if (r10 == 0) goto L142
            int r4 = r3.f2804b
            int r5 = r4 + (-1)
            r6.f21017i = r5
            int r10 = r3.f2804b
            r6.c(r4, r10)
            int r4 = r6.f21017i
            int r4 = r4 + r11
            r6.f21017i = r4
            r3.a(r2)
            long r2 = x1.k.a(r9, r8, r11)
            r1.a(r2)
            r0.invoke()
            r6.f21017i = r5
            long r0 = r6.a()
            float r0 = x1.k.k(r0)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L13f
            int r0 = r7 + 1
            int r1 = r6.f21017i
            int r1 = r1 + r11
            r6.c(r0, r1)
        L13f:
            r6.f21017i = r7
            return
        L142:
            float r4 = x1.k.k(r4)
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L167
            int r4 = r6.f21017i
            int r5 = r4 + 1
            int r7 = r3.f2804b
            r6.c(r5, r7)
            int r5 = r6.f21017i
            int r5 = r5 + r11
            r6.f21017i = r5
            r3.a(r2)
            long r2 = x1.k.a(r9, r8, r11)
            r1.a(r2)
            r0.invoke()
            r6.f21017i = r4
        L167:
            return
        L168:
            r6 = r21
            r8 = r23
            int r5 = r3.f21821i
            r9 = 16
            r5 = r5 & r9
            if (r5 == 0) goto L1a4
            boolean r5 = r3 instanceof x1.j
            if (r5 == 0) goto L1a4
            r5 = r3
            x1.j r5 = (x1.j) r5
            y0.n r5 = r5.f20950v
        L17c:
            if (r5 == 0) goto L19e
            int r10 = r5.f21821i
            r10 = r10 & r9
            if (r10 == 0) goto L19b
            int r7 = r7 + 1
            if (r7 != r11) goto L189
            r3 = r5
            goto L19b
        L189:
            if (r4 != 0) goto L192
            j0.b r4 = new j0.b
            y0.n[] r10 = new y0.n[r9]
            r4.<init>(r10)
        L192:
            if (r3 == 0) goto L198
            r4.b(r3)
            r3 = r1
        L198:
            r4.b(r5)
        L19b:
            y0.n r5 = r5.f21824l
            goto L17c
        L19e:
            if (r7 != r11) goto L1a4
        L1a0:
            r6 = r22
            goto L43
        L1a4:
            y0.n r3 = x1.k.e(r4)
            goto L1a0
        L1a9:
            r6 = r21
            r8 = r23
            if (r25 == 0) goto L1b3
            r16.v1(r17, r18, r19, r21, r22, r23, r24)
            return
        L1b3:
            r16.L1(r17, r18, r19, r21, r22, r23, r24)
            return
    }

    public abstract void G1(f1.u r1, i1.b r2);

    public final void H1(long r6, float r8, fg.l r9, i1.b r10) {
            r5 = this;
            r0 = 0
            x1.f0 r1 = r5.f20943u
            r2 = 0
            if (r10 == 0) goto L50
            if (r9 != 0) goto L9
            goto Le
        L9:
            java.lang.String r9 = "both ways to create layers shouldn't be used together"
            u1.a.a(r9)
        Le:
            i1.b r9 = r5.S
            if (r9 == r10) goto L19
            r5.S = r2
            r5.Q1(r2, r0)
            r5.S = r10
        L19:
            x1.q1 r9 = r5.R
            if (r9 != 0) goto L5c
            x1.r1 r9 = x1.i0.a(r1)
            a1.g r0 = r5.O
            if (r0 != 0) goto L34
            x1.f1 r0 = new x1.f1
            r2 = 0
            r0.<init>(r5, r2)
            a1.g r2 = new a1.g
            r3 = 3
            r2.<init>(r5, r3, r0)
            r5.O = r2
            r0 = r2
        L34:
            y1.t r9 = (y1.t) r9
            x1.f1 r2 = r5.P
            x1.q1 r9 = r9.l(r0, r2, r10)
            long r3 = r5.f13902i
            r10 = r9
            y1.o1 r10 = (y1.o1) r10
            r10.e(r3)
            r10.d(r6)
            r5.R = r9
            r9 = 1
            r1.P = r9
            r2.invoke()
            goto L5c
        L50:
            i1.b r10 = r5.S
            if (r10 == 0) goto L59
            r5.S = r2
            r5.Q1(r2, r0)
        L59:
            r5.Q1(r9, r0)
        L5c:
            long r9 = r5.F
            boolean r9 = u2.j.b(r9, r6)
            if (r9 != 0) goto L91
            x1.r1 r9 = x1.i0.a(r1)
            r10 = -1065353216(0xffffffffc0800000, float:-4.0)
            y1.t r9 = (y1.t) r9
            r9.P(r10)
            r5.F = r6
            x1.q1 r9 = r5.R
            if (r9 == 0) goto L7b
            y1.o1 r9 = (y1.o1) r9
            r9.d(r6)
            goto L82
        L7b:
            x1.i1 r6 = r5.f20945w
            if (r6 == 0) goto L82
            r6.y1()
        L82:
            r1.N(r5)
            x1.n0.d1(r5)
            x1.r1 r6 = r1.f20902t
            if (r6 == 0) goto L91
            y1.t r6 = (y1.t) r6
            r6.B(r1)
        L91:
            r5.G = r8
            x1.b1 r6 = r1.L
            x1.i1 r6 = r6.f20842d
            if (r5 != r6) goto La6
            x1.r1 r6 = x1.i0.a(r1)
            y1.t r6 = (y1.t) r6
            g2.b r6 = r6.getRectManager()
            r6.f(r1)
        La6:
            boolean r6 = r5.f20999q
            if (r6 != 0) goto Lb1
            v1.o0 r6 = r5.Z0()
            r5.N0(r6)
        Lb1:
            return
    }

    public final void I1(e1.a r13, boolean r14, boolean r15) {
            r12 = this;
            x1.q1 r0 = r12.R
            r1 = 32
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 == 0) goto Lf4
            boolean r4 = r12.f20947y
            r5 = 0
            if (r4 == 0) goto Ldc
            if (r15 == 0) goto Lc7
            long r14 = r12.q1()
            float r4 = r13.f2290a
            float r6 = r13.f2291b
            float r7 = r13.f2292c
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 < 0) goto L82
            long r7 = r12.f13902i
            long r9 = r7 >> r1
            int r9 = (int) r9
            float r9 = (float) r9
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 > 0) goto L82
            float r9 = r13.f2293d
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 < 0) goto L82
            long r7 = r7 & r2
            int r7 = (int) r7
            float r7 = (float) r7
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L38
            goto L82
        L38:
            long r7 = r14 >> r1
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r8 = r14 & r2
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r9 = r13.f2292c
            float r10 = r13.f2290a
            float r9 = r9 - r10
            float r9 = r7 - r9
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 <= 0) goto L56
            float r4 = r4 - r9
            goto L5d
        L56:
            float r7 = -r7
            float r7 = r7 / r10
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 >= 0) goto L5d
            r4 = r7
        L5d:
            float r7 = r13.f2293d
            float r9 = r13.f2291b
            float r7 = r7 - r9
            float r7 = r8 - r7
            float r7 = r7 / r10
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L6b
            float r6 = r6 - r7
            goto L72
        L6b:
            float r7 = -r8
            float r7 = r7 / r10
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 >= 0) goto L72
            r6 = r7
        L72:
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r7 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r6)
            long r9 = (long) r4
            long r6 = r7 << r1
            long r8 = r9 & r2
            long r6 = r6 | r8
            goto L84
        L82:
            r6 = 0
        L84:
            long r8 = r6 >> r1
            int r4 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r12.f13902i
            long r9 = r7 >> r1
            int r9 = (int) r9
            long r7 = r7 & r2
            int r7 = (int) r7
            float r8 = (float) r9
            long r9 = r14 >> r1
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            float r10 = r10 + r8
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r9 = r9 + r4
            float r8 = java.lang.Math.max(r8, r9)
            float r8 = java.lang.Math.min(r10, r8)
            float r7 = (float) r7
            long r14 = r14 & r2
            int r14 = (int) r14
            float r15 = java.lang.Float.intBitsToFloat(r14)
            float r15 = r15 + r7
            float r14 = java.lang.Float.intBitsToFloat(r14)
            float r14 = r14 + r6
            float r14 = java.lang.Math.max(r7, r14)
            float r14 = java.lang.Math.min(r15, r14)
            r13.a(r4, r6, r8, r14)
            goto Ld5
        Lc7:
            if (r14 == 0) goto Ld5
            long r14 = r12.f13902i
            long r6 = r14 >> r1
            int r4 = (int) r6
            float r4 = (float) r4
            long r14 = r14 & r2
            int r14 = (int) r14
            float r14 = (float) r14
            r13.a(r5, r5, r4, r14)
        Ld5:
            boolean r14 = r13.b()
            if (r14 == 0) goto Ldc
            return
        Ldc:
            y1.o1 r0 = (y1.o1) r0
            float[] r14 = r0.b()
            boolean r15 = r0.f22043y
            if (r15 != 0) goto Lf4
            if (r14 != 0) goto Lf1
            r13.f2290a = r5
            r13.f2291b = r5
            r13.f2292c = r5
            r13.f2293d = r5
            goto Lf4
        Lf1:
            f1.i0.c(r14, r13)
        Lf4:
            long r14 = r12.F
            long r0 = r14 >> r1
            int r0 = (int) r0
            float r1 = r13.f2290a
            float r0 = (float) r0
            float r1 = r1 + r0
            r13.f2290a = r1
            float r1 = r13.f2292c
            float r1 = r1 + r0
            r13.f2292c = r1
            long r14 = r14 & r2
            int r14 = (int) r14
            float r15 = r13.f2291b
            float r14 = (float) r14
            float r15 = r15 + r14
            r13.f2291b = r15
            float r15 = r13.f2293d
            float r15 = r15 + r14
            r13.f2293d = r15
            return
    }

    public final void J1() {
            r2 = this;
            x1.q1 r0 = r2.R
            if (r0 == 0) goto L14
            i1.b r0 = r2.S
            r1 = 0
            if (r0 == 0) goto Lb
            r2.S = r1
        Lb:
            r0 = 0
            r2.Q1(r1, r0)
            x1.f0 r1 = r2.f20943u
            r1.U(r0)
        L14:
            return
    }

    public final void K1(v1.o0 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            v1.o0 r2 = r0.D
            if (r1 == r2) goto L19d
            r0.D = r1
            x1.f0 r3 = r0.f20943u
            r4 = 0
            if (r2 == 0) goto L23
            int r5 = r1.h()
            int r6 = r2.h()
            if (r5 != r6) goto L23
            int r5 = r1.g()
            int r2 = r2.g()
            if (r5 == r2) goto Ldc
        L23:
            int r2 = r1.h()
            int r5 = r1.g()
            x1.q1 r6 = r0.R
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r9 = 32
            if (r6 == 0) goto L41
            long r10 = (long) r2
            long r10 = r10 << r9
            long r12 = (long) r5
            long r12 = r12 & r7
            long r10 = r10 | r12
            y1.o1 r6 = (y1.o1) r6
            r6.e(r10)
            goto L4e
        L41:
            boolean r6 = r3.H()
            if (r6 == 0) goto L4e
            x1.i1 r6 = r0.f20945w
            if (r6 == 0) goto L4e
            r6.y1()
        L4e:
            long r10 = (long) r2
            long r9 = r10 << r9
            long r5 = (long) r5
            long r5 = r5 & r7
            long r5 = r5 | r9
            r0.C0(r5)
            fg.l r2 = r0.f20948z
            if (r2 == 0) goto L5e
            r0.R1(r4)
        L5e:
            r2 = 4
            boolean r5 = x1.j1.g(r2)
            y0.n r6 = r0.r1()
            if (r5 == 0) goto L6a
            goto L70
        L6a:
            y0.n r6 = r6.f21823k
            if (r6 != 0) goto L70
            goto Ld0
        L70:
            y0.n r5 = r0.t1(r5)
        L74:
            if (r5 == 0) goto Ld0
            int r7 = r5.f21822j
            r7 = r7 & r2
            if (r7 == 0) goto Ld0
            int r7 = r5.f21821i
            r7 = r7 & r2
            if (r7 == 0) goto Lcb
            r7 = 0
            r8 = r5
            r9 = r7
        L83:
            if (r8 == 0) goto Lcb
            boolean r10 = r8 instanceof x1.m
            if (r10 == 0) goto L8f
            x1.m r8 = (x1.m) r8
            r8.g0()
            goto Lc6
        L8f:
            int r10 = r8.f21821i
            r10 = r10 & r2
            if (r10 == 0) goto Lc6
            boolean r10 = r8 instanceof x1.j
            if (r10 == 0) goto Lc6
            r10 = r8
            x1.j r10 = (x1.j) r10
            y0.n r10 = r10.f20950v
            r11 = r4
        L9e:
            r12 = 1
            if (r10 == 0) goto Lc3
            int r13 = r10.f21821i
            r13 = r13 & r2
            if (r13 == 0) goto Lc0
            int r11 = r11 + 1
            if (r11 != r12) goto Lac
            r8 = r10
            goto Lc0
        Lac:
            if (r9 != 0) goto Lb7
            j0.b r9 = new j0.b
            r12 = 16
            y0.n[] r12 = new y0.n[r12]
            r9.<init>(r12)
        Lb7:
            if (r8 == 0) goto Lbd
            r9.b(r8)
            r8 = r7
        Lbd:
            r9.b(r10)
        Lc0:
            y0.n r10 = r10.f21824l
            goto L9e
        Lc3:
            if (r11 != r12) goto Lc6
            goto L83
        Lc6:
            y0.n r8 = x1.k.e(r9)
            goto L83
        Lcb:
            if (r5 == r6) goto Ld0
            y0.n r5 = r5.f21824l
            goto L74
        Ld0:
            x1.r1 r2 = r3.f20902t
            if (r2 == 0) goto Ld9
            y1.t r2 = (y1.t) r2
            r2.B(r3)
        Ld9:
            r3.N(r0)
        Ldc:
            f.b0 r2 = r0.E
            if (r2 == 0) goto Le5
            int r2 = r2.f2778e
            if (r2 == 0) goto Le5
            goto Lef
        Le5:
            java.util.Map r2 = r1.e()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L19d
        Lef:
            f.b0 r2 = r0.E
            java.util.Map r5 = r1.e()
            if (r2 != 0) goto Lf8
            goto L14c
        Lf8:
            int r6 = r2.f2778e
            int r7 = r5.size()
            if (r6 == r7) goto L101
            goto L14c
        L101:
            java.lang.Object[] r6 = r2.f2775b
            int[] r7 = r2.f2776c
            long[] r2 = r2.f2774a
            int r8 = r2.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L19d
            r9 = r4
        L10d:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L196
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r4
        L127:
            if (r14 >= r12) goto L194
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L18f
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r6[r15]
            r15 = r7[r15]
            r4 = r16
            v1.j r4 = (v1.j) r4
            java.lang.Object r4 = r5.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L146
            goto L14c
        L146:
            int r4 = r4.intValue()
            if (r4 == r15) goto L18f
        L14c:
            x1.j0 r2 = r3.M
            x1.v0 r2 = r2.f20966p
            x1.g0 r2 = r2.D
            r2.f()
            f.b0 r2 = r0.E
            if (r2 != 0) goto L162
            f.b0 r2 = f.o0.f2877a
            f.b0 r2 = new f.b0
            r2.<init>()
            r0.E = r2
        L162:
            r2.a()
            java.util.Map r1 = r1.e()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L171:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L19d
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.g(r3, r4)
            goto L171
        L18f:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            r4 = 0
            goto L127
        L194:
            if (r12 != r13) goto L19d
        L196:
            if (r9 == r8) goto L19d
            int r9 = r9 + 1
            r4 = 0
            goto L10d
        L19d:
            return
    }

    @Override // x1.s1
    public final boolean L() {
            r1 = this;
            x1.q1 r0 = r1.R
            if (r0 == 0) goto L12
            boolean r0 = r1.f20946x
            if (r0 != 0) goto L12
            x1.f0 r0 = r1.f20943u
            boolean r0 = r0.G()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final void L1(y0.n r15, x1.e1 r16, long r17, x1.p r19, int r20, boolean r21, float r22) {
            r14 = this;
            if (r15 != 0) goto L11
            r0 = r14
            r1 = r16
            r2 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r0.x1(r1, r2, r4, r5, r6)
            return
        L11:
            r2 = r16
            boolean r0 = r2.b(r15)
            if (r0 != 0) goto L30
            int r0 = r2.a()
            y0.n r1 = x1.k.d(r15, r0)
            r0 = r14
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r0.L1(r1, r2, r3, r5, r6, r7, r8)
            return
        L30:
            boolean r0 = r2.f(r15)
            if (r0 == 0) goto L104
            x1.h1 r0 = new x1.h1
            r1 = r14
            r4 = r17
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r3 = r2
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            r5 = r6
            r7 = r8
            r8 = r9
            f.y r1 = r5.f21016h
            f.f0 r3 = r5.f21015g
            int r4 = r5.f21017i
            int r6 = r3.f2804b
            int r9 = r6 + (-1)
            r10 = 0
            if (r4 != r9) goto Lab
            int r9 = r4 + 1
            r5.c(r9, r6)
            int r6 = r5.f21017i
            int r6 = r6 + 1
            r5.f21017i = r6
            r3.a(r15)
            long r6 = x1.k.a(r8, r7, r10)
            r1.a(r6)
            r0.invoke()
            r5.f21017i = r4
            int r15 = r3.f2804b
            int r15 = r15 + (-1)
            if (r9 == r15) goto L84
            long r6 = r5.a()
            boolean r15 = x1.k.o(r6)
            if (r15 == 0) goto L83
            goto L84
        L83:
            return
        L84:
            int r15 = r5.f21017i
            int r0 = r15 + 1
            r3.k(r0)
            if (r0 < 0) goto La5
            int r2 = r1.f2924b
            if (r0 >= r2) goto La5
            long[] r3 = r1.f2923a
            r4 = r3[r0]
            int r4 = r2 + (-1)
            if (r0 == r4) goto L9e
            int r15 = r15 + 2
            tf.l.q0(r3, r3, r0, r15, r2)
        L9e:
            int r15 = r1.f2924b
            int r15 = r15 + (-1)
            r1.f2924b = r15
            return
        La5:
            java.lang.String r15 = "Index must be between 0 and size"
            okio.a.i(r15)
            return
        Lab:
            long r11 = r5.a()
            int r4 = r5.f21017i
            int r6 = r3.f2804b
            int r9 = r6 + (-1)
            r5.f21017i = r9
            int r13 = r3.f2804b
            r5.c(r6, r13)
            int r6 = r5.f21017i
            int r6 = r6 + 1
            r5.f21017i = r6
            r3.a(r15)
            long r6 = x1.k.a(r8, r7, r10)
            r1.a(r6)
            r0.invoke()
            r5.f21017i = r9
            long r0 = r5.a()
            int r15 = r5.f21017i
            int r15 = r15 + 1
            int r2 = r3.f2804b
            int r2 = r2 + (-1)
            if (r15 >= r2) goto Lf8
            int r15 = x1.k.g(r11, r0)
            if (r15 <= 0) goto Lf8
            int r15 = r4 + 1
            boolean r0 = x1.k.o(r0)
            int r1 = r5.f21017i
            if (r0 == 0) goto Lf2
            int r1 = r1 + 2
            goto Lf4
        Lf2:
            int r1 = r1 + 1
        Lf4:
            r5.c(r15, r1)
            goto L101
        Lf8:
            int r15 = r5.f21017i
            int r15 = r15 + 1
            int r0 = r3.f2804b
            r5.c(r15, r0)
        L101:
            r5.f21017i = r4
            return
        L104:
            r5 = r19
            r7 = r21
            r8 = r22
            int r0 = r16.a()
            y0.n r1 = x1.k.d(r15, r0)
            r9 = 0
            r0 = r14
            r2 = r16
            r3 = r17
            r6 = r20
            r0.F1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    public final e1.c N1() {
            r7 = this;
            y0.n r0 = r7.r1()
            boolean r0 = r0.f21832t
            if (r0 != 0) goto L9
            goto L60
        L9:
            v1.t r0 = v1.w.h(r7)
            e1.a r1 = r7.H
            if (r1 != 0) goto L18
            e1.a r1 = new e1.a
            r1.<init>()
            r7.H = r1
        L18:
            long r2 = r7.q1()
            long r2 = r7.i1(r2)
            r4 = 32
            long r4 = r2 >> r4
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            float r5 = -r5
            r1.f2290a = r5
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r5
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r3 = -r3
            r1.f2291b = r3
            int r3 = r7.w0()
            float r3 = (float) r3
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r4 = r4 + r3
            r1.f2292c = r4
            int r3 = r7.r0()
            float r3 = (float) r3
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r3
            r1.f2293d = r2
            r2 = r7
        L53:
            if (r2 == r0) goto L69
            r3 = 0
            r4 = 1
            r2.I1(r1, r3, r4)
            boolean r3 = r1.b()
            if (r3 == 0) goto L63
        L60:
            e1.c r0 = e1.c.f2295e
            return r0
        L63:
            x1.i1 r2 = r2.f20945w
            r2.getClass()
            goto L53
        L69:
            e1.c r0 = new e1.c
            float r2 = r1.f2290a
            float r3 = r1.f2291b
            float r4 = r1.f2292c
            float r1 = r1.f2293d
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public final void O1(x1.i1 r6, float[] r7) {
            r5 = this;
            boolean r0 = gg.l.a(r6, r5)
            if (r0 != 0) goto L44
            x1.i1 r0 = r5.f20945w
            r0.getClass()
            r0.O1(r6, r7)
            long r0 = r5.F
            r2 = 0
            boolean r6 = u2.j.b(r0, r2)
            if (r6 != 0) goto L35
            float[] r6 = x1.i1.V
            f1.i0.d(r6)
            long r0 = r5.F
            r2 = 32
            long r2 = r0 >> r2
            int r2 = (int) r2
            float r2 = (float) r2
            float r2 = -r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            float r0 = (float) r0
            float r0 = -r0
            f1.i0.f(r6, r2, r0)
            f1.i0.e(r7, r6)
        L35:
            x1.q1 r6 = r5.R
            if (r6 == 0) goto L44
            y1.o1 r6 = (y1.o1) r6
            float[] r6 = r6.a()
            if (r6 == 0) goto L44
            f1.i0.e(r7, r6)
        L44:
            return
    }

    @Override // v1.t
    public final long P(long r2) {
            r1 = this;
            y0.n r0 = r1.r1()
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            u1.a.b(r0)
        Ld:
            long r2 = r1.m0(r2)
            x1.f0 r0 = r1.f20943u
            x1.r1 r0 = x1.i0.a(r0)
            y1.t r0 = (y1.t) r0
            long r2 = r0.w(r2)
            return r2
    }

    public final void P1(x1.i1 r8, float[] r9) {
            r7 = this;
            r0 = r7
        L1:
            boolean r1 = r0.equals(r8)
            if (r1 != 0) goto L3d
            x1.q1 r1 = r0.R
            if (r1 == 0) goto L14
            y1.o1 r1 = (y1.o1) r1
            float[] r1 = r1.b()
            f1.i0.e(r9, r1)
        L14:
            long r1 = r0.F
            r3 = 0
            boolean r3 = u2.j.b(r1, r3)
            if (r3 != 0) goto L37
            float[] r3 = x1.i1.V
            f1.i0.d(r3)
            r4 = 32
            long r4 = r1 >> r4
            int r4 = (int) r4
            float r4 = (float) r4
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            int r1 = (int) r1
            float r1 = (float) r1
            f1.i0.f(r3, r4, r1)
            f1.i0.e(r9, r3)
        L37:
            x1.i1 r0 = r0.f20945w
            r0.getClass()
            goto L1
        L3d:
            return
    }

    public final void Q1(fg.l r9, boolean r10) {
            r8 = this;
            if (r9 == 0) goto Lc
            i1.b r0 = r8.S
            if (r0 != 0) goto L7
            goto Lc
        L7:
            java.lang.String r0 = "layerBlock can't be provided when explicitLayer is provided"
            u1.a.a(r0)
        Lc:
            r0 = 0
            r1 = 1
            x1.f0 r2 = r8.f20943u
            if (r10 != 0) goto L29
            fg.l r10 = r8.f20948z
            if (r10 != r9) goto L29
            u2.c r10 = r8.A
            u2.c r3 = r2.E
            boolean r10 = gg.l.a(r10, r3)
            if (r10 == 0) goto L29
            u2.m r10 = r8.B
            u2.m r3 = r2.F
            if (r10 == r3) goto L27
            goto L29
        L27:
            r10 = r0
            goto L2a
        L29:
            r10 = r1
        L2a:
            u2.c r3 = r2.E
            r8.A = r3
            u2.m r3 = r2.F
            r8.B = r3
            boolean r3 = r2.G()
            x1.f1 r4 = r8.P
            r5 = 0
            if (r3 == 0) goto L7e
            if (r9 == 0) goto L7e
            r8.f20948z = r9
            x1.q1 r9 = r8.R
            if (r9 != 0) goto L78
            x1.r1 r9 = x1.i0.a(r2)
            a1.g r10 = r8.O
            if (r10 != 0) goto L5a
            x1.f1 r10 = new x1.f1
            r0 = 0
            r10.<init>(r8, r0)
            a1.g r0 = new a1.g
            r3 = 3
            r0.<init>(r8, r3, r10)
            r8.O = r0
            r10 = r0
        L5a:
            y1.t r9 = (y1.t) r9
            x1.q1 r9 = r9.l(r10, r4, r5)
            long r5 = r8.f13902i
            r10 = r9
            y1.o1 r10 = (y1.o1) r10
            r10.e(r5)
            long r5 = r8.F
            r10.d(r5)
            r8.R = r9
            r8.R1(r1)
            r2.P = r1
            r4.invoke()
            return
        L78:
            if (r10 == 0) goto L7d
            r8.R1(r1)
        L7d:
            return
        L7e:
            r8.f20948z = r5
            x1.q1 r9 = r8.R
            if (r9 == 0) goto Leb
            y1.o1 r9 = (y1.o1) r9
            float[] r10 = r9.b()
            boolean r10 = f1.c0.o(r10)
            if (r10 != 0) goto L93
            r2.N(r8)
        L93:
            r9.f22028j = r5
            r9.f22029k = r5
            r9.f22031m = r1
            r9.f(r0)
            f1.z r10 = r9.f22026h
            if (r10 == 0) goto Lcd
            i1.b r3 = r9.f22025g
            r10.a(r3)
            y1.t r10 = r9.f22027i
            p4.t r3 = r10.E0
        La9:
            java.lang.Object r6 = r3.f10225i
            java.lang.ref.ReferenceQueue r6 = (java.lang.ref.ReferenceQueue) r6
            java.lang.Object r7 = r3.f10224h
            j0.b r7 = (j0.b) r7
            java.lang.ref.Reference r6 = r6.poll()
            if (r6 == 0) goto Lba
            r7.j(r6)
        Lba:
            if (r6 != 0) goto La9
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            java.lang.Object r3 = r3.f10225i
            java.lang.ref.ReferenceQueue r3 = (java.lang.ref.ReferenceQueue) r3
            r6.<init>(r9, r3)
            r7.b(r6)
            f.f0 r10 = r10.K
            r10.j(r9)
        Lcd:
            r8.R = r5
            r2.P = r1
            r4.invoke()
            y0.n r9 = r8.r1()
            boolean r9 = r9.f21832t
            if (r9 == 0) goto Leb
            boolean r9 = r2.H()
            if (r9 == 0) goto Leb
            x1.r1 r9 = r2.f20902t
            if (r9 == 0) goto Leb
            y1.t r9 = (y1.t) r9
            r9.B(r2)
        Leb:
            r8.Q = r0
            return
    }

    @Override // v1.t
    public final long R(long r4) {
            r3 = this;
            y0.n r0 = r3.r1()
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            u1.a.b(r0)
        Ld:
            v1.t r0 = v1.w.h(r3)
            x1.f0 r1 = r3.f20943u
            x1.r1 r1 = x1.i0.a(r1)
            y1.t r1 = (y1.t) r1
            r1.F()
            float[] r1 = r1.f22090k0
            long r4 = f1.i0.b(r4, r1)
            r1 = 0
            long r1 = r0.m0(r1)
            long r4 = e1.b.d(r4, r1)
            long r4 = r3.W(r0, r4)
            return r4
    }

    public final void R1(boolean r30) {
            r29 = this;
            r0 = r29
            i1.b r1 = r0.S
            if (r1 == 0) goto L8
            goto L47b
        L8:
            x1.q1 r1 = r0.R
            fg.l r2 = r0.f20948z
            if (r1 == 0) goto L479
            if (r2 == 0) goto L472
            f1.o0 r3 = x1.i1.T
            r3.e()
            x1.f0 r4 = r0.f20943u
            u2.c r5 = r4.E
            r3.f3098w = r5
            u2.m r5 = r4.F
            r3.f3099x = r5
            long r5 = r0.f13902i
            long r5 = r9.e0.q0(r5)
            r3.f3097v = r5
            x1.r1 r5 = x1.i0.a(r4)
            y1.t r5 = (y1.t) r5
            x1.t1 r5 = r5.getSnapshotObserver()
            x1.d r6 = x1.d.f20858k
            c1.b r7 = new c1.b
            r8 = 5
            r7.<init>(r2, r8, r0)
            w0.s r2 = r5.f21066a
            r2.c(r0, r6, r7)
            x1.t r2 = r0.I
            if (r2 != 0) goto L49
            x1.t r2 = new x1.t
            r2.<init>()
            r0.I = r2
        L49:
            x1.t r5 = x1.i1.U
            r5.getClass()
            float r6 = r2.f21048a
            r5.f21048a = r6
            float r6 = r2.f21049b
            r5.f21049b = r6
            float r6 = r2.f21050c
            r5.f21050c = r6
            float r6 = r2.f21051d
            r5.f21051d = r6
            float r6 = r2.f21052e
            r5.f21052e = r6
            float r6 = r2.f21053f
            r5.f21053f = r6
            float r6 = r2.f21054g
            r5.f21054g = r6
            float r6 = r2.f21055h
            r5.f21055h = r6
            long r6 = r2.f21056i
            r5.f21056i = r6
            float r6 = r3.f3083h
            r2.f21048a = r6
            float r7 = r3.f3084i
            r2.f21049b = r7
            float r7 = r3.f3086k
            r2.f21050c = r7
            float r7 = r3.f3087l
            r2.f21051d = r7
            r7 = 0
            r2.f21052e = r7
            r2.f21053f = r7
            float r8 = r3.f3091p
            r2.f21054g = r8
            float r8 = r3.f3092q
            r2.f21055h = r8
            long r8 = r3.f3093r
            r2.f21056i = r8
            y1.o1 r1 = (y1.o1) r1
            y1.t r10 = r1.f22027i
            int r11 = r3.f3082g
            int r12 = r1.f22038t
            r11 = r11 | r12
            u2.m r12 = r3.f3099x
            r1.f22036r = r12
            u2.c r12 = r3.f3098w
            r1.f22035q = r12
            r12 = r11 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto Laa
            r1.f22039u = r8
        Laa:
            r8 = r11 & 1
            if (r8 == 0) goto Lbe
            i1.b r8 = r1.f22025g
            i1.d r8 = r8.f6133a
            float r9 = r8.b()
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 != 0) goto Lbb
            goto Lbe
        Lbb:
            r8.q(r6)
        Lbe:
            r6 = r11 & 2
            if (r6 == 0) goto Ld4
            i1.b r6 = r1.f22025g
            float r8 = r3.f3084i
            i1.d r6 = r6.f6133a
            float r9 = r6.v()
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 != 0) goto Ld1
            goto Ld4
        Ld1:
            r6.i(r8)
        Ld4:
            r6 = r11 & 4
            if (r6 == 0) goto Ldf
            i1.b r6 = r1.f22025g
            float r8 = r3.f3085j
            r6.f(r8)
        Ldf:
            r6 = r11 & 8
            if (r6 == 0) goto Lf5
            i1.b r6 = r1.f22025g
            float r8 = r3.f3086k
            i1.d r6 = r6.f6133a
            float r9 = r6.H()
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 != 0) goto Lf2
            goto Lf5
        Lf2:
            r6.s(r8)
        Lf5:
            r6 = r11 & 16
            if (r6 == 0) goto L10b
            i1.b r6 = r1.f22025g
            float r8 = r3.f3087l
            i1.d r6 = r6.f6133a
            float r9 = r6.E()
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 != 0) goto L108
            goto L10b
        L108:
            r6.g(r8)
        L10b:
            r6 = r11 & 32
            r8 = 1
            if (r6 == 0) goto L138
            i1.b r6 = r1.f22025g
            float r9 = r3.f3088m
            i1.d r13 = r6.f6133a
            float r14 = r13.M()
            int r14 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r14 != 0) goto L11f
            goto L127
        L11f:
            r13.c(r9)
            r6.f6139g = r8
            r6.a()
        L127:
            float r6 = r3.f3088m
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L138
            boolean r6 = r1.f22044z
            if (r6 != 0) goto L138
            fg.a r6 = r1.f22029k
            if (r6 == 0) goto L138
            r6.invoke()
        L138:
            r6 = r11 & 64
            if (r6 == 0) goto L151
            i1.b r6 = r1.f22025g
            long r13 = r3.f3089n
            i1.d r6 = r6.f6133a
            r9 = r7
            long r7 = r6.D()
            boolean r7 = f1.w.c(r13, r7)
            if (r7 != 0) goto L152
            r6.p(r13)
            goto L152
        L151:
            r9 = r7
        L152:
            r6 = r11 & 128(0x80, float:1.8E-43)
            if (r6 == 0) goto L169
            i1.b r6 = r1.f22025g
            long r7 = r3.f3090o
            i1.d r6 = r6.f6133a
            long r13 = r6.F()
            boolean r13 = f1.w.c(r7, r13)
            if (r13 != 0) goto L169
            r6.t(r7)
        L169:
            r6 = r11 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L17f
            i1.b r6 = r1.f22025g
            float r7 = r3.f3091p
            i1.d r6 = r6.f6133a
            float r8 = r6.B()
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 != 0) goto L17c
            goto L17f
        L17c:
            r6.f(r7)
        L17f:
            r6 = r11 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L193
            i1.b r6 = r1.f22025g
            i1.d r6 = r6.f6133a
            float r7 = r6.I()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L190
            goto L193
        L190:
            r6.l()
        L193:
            r6 = r11 & 512(0x200, float:7.17E-43)
            if (r6 == 0) goto L1a7
            i1.b r6 = r1.f22025g
            i1.d r6 = r6.f6133a
            float r7 = r6.z()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L1a4
            goto L1a7
        L1a4:
            r6.o()
        L1a7:
            r6 = r11 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L1bd
            i1.b r6 = r1.f22025g
            float r7 = r3.f3092q
            i1.d r6 = r6.f6133a
            float r8 = r6.G()
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 != 0) goto L1ba
            goto L1bd
        L1ba:
            r6.u(r7)
        L1bd:
            r13 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            if (r12 == 0) goto L22c
            r12 = 32
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r1.f22039u
            r8 = r10
            long r9 = f1.u0.f3122b
            boolean r6 = f1.u0.a(r6, r9)
            i1.b r7 = r1.f22025g
            if (r6 == 0) goto L1eb
            long r9 = r7.f6154v
            boolean r6 = e1.b.b(r9, r13)
            if (r6 != 0) goto L1e7
            r7.f6154v = r13
            i1.d r6 = r7.f6133a
            r6.C(r13)
        L1e7:
            r14 = r11
            r20 = r12
            goto L235
        L1eb:
            long r9 = r1.f22039u
            long r9 = r9 >> r12
            int r6 = (int) r9
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r9 = r1.f22030l
            long r9 = r9 >> r12
            int r9 = (int) r9
            float r9 = (float) r9
            float r6 = r6 * r9
            long r9 = r1.f22039u
            long r9 = r9 & r16
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            r10 = r12
            long r12 = r1.f22030l
            long r12 = r12 & r16
            int r12 = (int) r12
            float r12 = (float) r12
            float r9 = r9 * r12
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r12 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r9)
            r20 = r10
            r14 = r11
            long r10 = (long) r6
            long r12 = r12 << r20
            long r9 = r10 & r16
            long r9 = r9 | r12
            long r11 = r7.f6154v
            boolean r6 = e1.b.b(r11, r9)
            if (r6 != 0) goto L235
            r7.f6154v = r9
            i1.d r6 = r7.f6133a
            r6.C(r9)
            goto L235
        L22c:
            r8 = r10
            r14 = r11
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r20 = 32
        L235:
            r6 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L249
            i1.b r6 = r1.f22025g
            boolean r7 = r3.f3095t
            boolean r9 = r6.f6155w
            if (r9 == r7) goto L249
            r6.f6155w = r7
            r15 = 1
            r6.f6139g = r15
            r6.a()
        L249:
            r6 = 131072(0x20000, float:1.83671E-40)
            r6 = r6 & r14
            r7 = 0
            if (r6 == 0) goto L254
            i1.b r6 = r1.f22025g
            r6.g(r7)
        L254:
            r6 = 262144(0x40000, float:3.67342E-40)
            r6 = r6 & r14
            if (r6 == 0) goto L26c
            i1.b r6 = r1.f22025g
            f1.n r9 = r3.f3100y
            i1.d r6 = r6.f6133a
            f1.n r10 = r6.x()
            boolean r10 = gg.l.a(r10, r9)
            if (r10 != 0) goto L26c
            r6.k(r9)
        L26c:
            r6 = 524288(0x80000, float:7.34684E-40)
            r6 = r6 & r14
            if (r6 == 0) goto L281
            i1.b r6 = r1.f22025g
            int r9 = r3.f3101z
            i1.d r6 = r6.f6133a
            int r10 = r6.O()
            if (r10 != r9) goto L27e
            goto L281
        L27e:
            r6.h(r9)
        L281:
            r6 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 & r14
            if (r6 == 0) goto L2aa
            i1.b r6 = r1.f22025g
            int r9 = r3.f3096u
            if (r9 != 0) goto L28f
            r11 = 0
            goto L297
        L28f:
            r15 = 1
            if (r9 != r15) goto L294
            r11 = 1
            goto L297
        L294:
            r11 = 2
            if (r9 != r11) goto L2a4
        L297:
            i1.d r6 = r6.f6133a
            int r9 = r6.w()
            if (r9 != r11) goto L2a0
            goto L2aa
        L2a0:
            r6.J(r11)
            goto L2aa
        L2a4:
            java.lang.String r1 = "Not supported composition strategy"
            j8.o.A(r1)
            return
        L2aa:
            r6 = r14 & 7963(0x1f1b, float:1.1159E-41)
            if (r6 == 0) goto L2b3
            r15 = 1
            r1.f22041w = r15
            r1.f22042x = r15
        L2b3:
            f1.c0 r6 = r1.f22040v
            f1.c0 r9 = r3.A
            boolean r6 = gg.l.a(r6, r9)
            if (r6 != 0) goto L3bc
            f1.c0 r6 = r3.A
            r1.f22040v = r6
            if (r6 != 0) goto L2c7
            r27 = r8
            goto L3b6
        L2c7:
            i1.b r9 = r1.f22025g
            boolean r11 = r6 instanceof f1.k0
            if (r11 == 0) goto L30b
            r11 = r6
            f1.k0 r11 = (f1.k0) r11
            e1.c r11 = r11.f3073f
            float r12 = r11.f2296a
            float r13 = r11.f2297b
            int r15 = java.lang.Float.floatToRawIntBits(r12)
            r27 = r8
            long r7 = (long) r15
            int r15 = java.lang.Float.floatToRawIntBits(r13)
            r18 = r11
            long r10 = (long) r15
            long r7 = r7 << r20
            long r10 = r10 & r16
            long r23 = r7 | r10
            r7 = r18
            float r8 = r7.f2298c
            float r8 = r8 - r12
            float r7 = r7.f2299d
            float r7 = r7 - r13
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r10 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r7
            long r10 = r10 << r20
            long r7 = r7 & r16
            long r25 = r10 | r7
            r22 = 0
            r21 = r9
            r21.h(r22, r23, r25)
            goto L397
        L30b:
            r27 = r8
            r7 = r9
            boolean r8 = r6 instanceof f1.j0
            r10 = 0
            if (r8 == 0) goto L334
            r8 = r6
            f1.j0 r8 = (f1.j0) r8
            f1.j r8 = r8.f3071f
            r9 = 0
            r7.f6143k = r9
            r12 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r7.f6141i = r12
            r7.f6140h = r10
            r9 = 0
            r7.f6142j = r9
            r15 = 1
            r7.f6139g = r15
            r10 = 0
            r7.f6146n = r10
            r7.f6144l = r8
            r7.a()
            goto L397
        L334:
            boolean r8 = r6 instanceof f1.l0
            if (r8 == 0) goto L3b8
            r8 = r6
            f1.l0 r8 = (f1.l0) r8
            f1.j r12 = r8.f3075g
            if (r12 == 0) goto L35a
            r13 = 0
            r7.f6143k = r13
            r8 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r7.f6141i = r8
            r7.f6140h = r10
            r9 = 0
            r7.f6142j = r9
            r15 = 1
            r7.f6139g = r15
            r10 = 0
            r7.f6146n = r10
            r7.f6144l = r12
            r7.a()
            goto L397
        L35a:
            r10 = 0
            e1.d r8 = r8.f3074f
            float r11 = r8.f2301b
            float r12 = r8.f2300a
            int r13 = java.lang.Float.floatToRawIntBits(r12)
            long r9 = (long) r13
            int r13 = java.lang.Float.floatToRawIntBits(r11)
            r18 = r9
            long r9 = (long) r13
            long r18 = r18 << r20
            long r9 = r9 & r16
            long r23 = r18 | r9
            float r9 = r8.f2302c
            float r9 = r9 - r12
            float r10 = r8.f2303d
            float r10 = r10 - r11
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r11 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r10)
            long r9 = (long) r9
            long r11 = r11 << r20
            long r9 = r9 & r16
            long r25 = r11 | r9
            long r8 = r8.f2307h
            long r8 = r8 >> r20
            int r8 = (int) r8
            float r22 = java.lang.Float.intBitsToFloat(r8)
            r21 = r7
            r21.h(r22, r23, r25)
        L397:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 33
            if (r7 >= r8) goto L3b6
            boolean r7 = r6 instanceof f1.j0
            if (r7 != 0) goto L3af
            boolean r7 = r6 instanceof f1.l0
            if (r7 == 0) goto L3b6
            f1.l0 r6 = (f1.l0) r6
            e1.d r6 = r6.f3074f
            boolean r6 = be.h.D(r6)
            if (r6 != 0) goto L3b6
        L3af:
            fg.a r6 = r1.f22029k
            if (r6 == 0) goto L3b6
            r6.invoke()
        L3b6:
            r6 = 1
            goto L3bf
        L3b8:
            okio.a.k()
            return
        L3bc:
            r27 = r8
            r6 = 0
        L3bf:
            int r7 = r3.f3082g
            r1.f22038t = r7
            if (r14 != 0) goto L3c7
            if (r6 == 0) goto L3df
        L3c7:
            android.view.ViewParent r1 = r27.getParent()
            if (r1 == 0) goto L3d3
            r8 = r27
            r1.onDescendantInvalidated(r8, r8)
            goto L3d5
        L3d3:
            r8 = r27
        L3d5:
            boolean r1 = y1.t.r()
            if (r1 == 0) goto L3df
            r9 = 0
            r8.P(r9)
        L3df:
            boolean r1 = r0.f20947y
            boolean r6 = r3.f3095t
            r0.f20947y = r6
            float r3 = r3.f3085j
            r0.C = r3
            float r3 = r5.f21048a
            float r6 = r2.f21048a
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L436
            float r3 = r5.f21049b
            float r6 = r2.f21049b
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L436
            float r3 = r5.f21050c
            float r6 = r2.f21050c
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L436
            float r3 = r5.f21051d
            float r6 = r2.f21051d
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L436
            float r3 = r5.f21052e
            float r6 = r2.f21052e
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L436
            float r3 = r5.f21053f
            float r6 = r2.f21053f
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L436
            float r3 = r5.f21054g
            float r6 = r2.f21054g
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L436
            float r3 = r5.f21055h
            float r6 = r2.f21055h
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L436
            long r5 = r5.f21056i
            long r2 = r2.f21056i
            boolean r2 = f1.u0.a(r5, r2)
            if (r2 == 0) goto L436
            r28 = 1
            goto L438
        L436:
            r28 = 0
        L438:
            if (r30 == 0) goto L449
            if (r28 == 0) goto L440
            boolean r2 = r0.f20947y
            if (r1 == r2) goto L449
        L440:
            x1.r1 r1 = r4.f20902t
            if (r1 == 0) goto L449
            y1.t r1 = (y1.t) r1
            r1.B(r4)
        L449:
            if (r28 != 0) goto L47b
            r4.N(r0)
            int r1 = r4.V
            if (r1 <= 0) goto L47b
            x1.r1 r1 = x1.i0.a(r4)
            y1.t r1 = (y1.t) r1
            x1.t0 r2 = r1.f22080f0
            p4.t r2 = r2.f21061e
            r2.getClass()
            int r3 = r4.V
            if (r3 <= 0) goto L46d
            java.lang.Object r2 = r2.f10224h
            j0.b r2 = (j0.b) r2
            r2.b(r4)
            r15 = 1
            r4.U = r15
        L46d:
            r9 = 0
            r1.I(r9)
            return
        L472:
            java.lang.String r1 = "updateLayerParameters requires a non-null layerBlock"
            af.d r1 = wb.en.a(r1)
            throw r1
        L479:
            if (r2 != 0) goto L47c
        L47b:
            return
        L47c:
            java.lang.String r1 = "null layer with a non-null layerBlock"
            u1.a.b(r1)
            return
    }

    @Override // x1.n0
    public final x1.n0 S0() {
            r1 = this;
            x1.i1 r0 = r1.f20944v
            return r0
    }

    public final boolean S1(long r26) {
            r25 = this;
            r0 = r25
            r1 = 9187343241974906880(0x7f8000007f800000, double:1.404448428688076E306)
            long r3 = r26 & r1
            long r1 = r1 ^ r3
            r3 = 4294967297(0x100000001, double:2.1219957915E-314)
            long r1 = r1 - r3
            r3 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1ab
            x1.q1 r1 = r0.R
            if (r1 == 0) goto L1a8
            boolean r4 = r0.f20947y
            if (r4 == 0) goto L1a8
            y1.o1 r1 = (y1.o1) r1
            r4 = 32
            long r5 = r26 >> r4
            int r5 = (int) r5
            float r6 = java.lang.Float.intBitsToFloat(r5)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r26 & r7
            int r5 = (int) r9
            float r5 = java.lang.Float.intBitsToFloat(r5)
            i1.b r1 = r1.f22025g
            boolean r9 = r1.f6155w
            if (r9 == 0) goto L1a1
            f1.c0 r1 = r1.d()
            boolean r9 = r1 instanceof f1.k0
            if (r9 == 0) goto L6c
            f1.k0 r1 = (f1.k0) r1
            e1.c r1 = r1.f3073f
            float r4 = r1.f2296a
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L67
            float r4 = r1.f2298c
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 >= 0) goto L67
            float r4 = r1.f2297b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L67
            float r1 = r1.f2299d
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto L67
            goto L1a1
        L67:
            r15 = 0
            r16 = 1
            goto L189
        L6c:
            boolean r9 = r1 instanceof f1.l0
            if (r9 == 0) goto L18b
            f1.l0 r1 = (f1.l0) r1
            e1.d r1 = r1.f3074f
            float r9 = r1.f2302c
            float r10 = r1.f2301b
            float r11 = r1.f2303d
            float r12 = r1.f2300a
            long r13 = r1.f2305f
            r15 = 0
            r16 = 1
            long r2 = r1.f2307h
            r17 = r4
            r26 = r5
            long r4 = r1.f2306g
            r18 = r7
            long r7 = r1.f2304e
            int r20 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r20 < 0) goto L189
            int r20 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r20 >= 0) goto L189
            int r20 = (r26 > r10 ? 1 : (r26 == r10 ? 0 : -1))
            if (r20 < 0) goto L189
            int r20 = (r26 > r11 ? 1 : (r26 == r11 ? 0 : -1))
            if (r20 < 0) goto L9f
            goto L189
        L9f:
            r21 = r2
            long r2 = r7 >> r17
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            r20 = r2
            r27 = r3
            long r2 = r13 >> r17
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r3 = r3 + r27
            float r23 = r9 - r12
            int r3 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r3 > 0) goto L17b
            r23 = r2
            long r2 = r21 >> r17
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            r27 = r2
            r24 = r3
            long r2 = r4 >> r17
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r3 = r3 + r24
            float r17 = r9 - r12
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 > 0) goto L17b
            long r7 = r7 & r18
            int r3 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r3)
            r8 = r2
            r17 = r3
            long r2 = r21 & r18
            int r2 = (int) r2
            float r3 = java.lang.Float.intBitsToFloat(r2)
            float r3 = r3 + r7
            float r7 = r11 - r10
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 > 0) goto L17b
            long r13 = r13 & r18
            int r3 = (int) r13
            float r7 = java.lang.Float.intBitsToFloat(r3)
            long r4 = r4 & r18
            int r4 = (int) r4
            float r5 = java.lang.Float.intBitsToFloat(r4)
            float r5 = r5 + r7
            float r7 = r11 - r10
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L17b
            float r5 = java.lang.Float.intBitsToFloat(r20)
            float r5 = r5 + r12
            float r7 = java.lang.Float.intBitsToFloat(r17)
            float r7 = r7 + r10
            float r13 = java.lang.Float.intBitsToFloat(r23)
            float r13 = r9 - r13
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r3 = r3 + r10
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = r9 - r8
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r9 = r11 - r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r11 = r11 - r2
            float r2 = java.lang.Float.intBitsToFloat(r27)
            float r2 = r2 + r12
            int r4 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r4 >= 0) goto L143
            int r4 = (r26 > r7 ? 1 : (r26 == r7 ? 0 : -1))
            if (r4 >= 0) goto L143
            long r10 = r1.f2304e
            r8 = r5
            r9 = r7
            r7 = r26
            boolean r1 = y1.g0.r(r6, r7, r8, r9, r10)
            goto L1a5
        L143:
            r7 = r26
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L156
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 <= 0) goto L156
            r9 = r11
            long r10 = r1.f2307h
            r8 = r2
            boolean r1 = y1.g0.r(r6, r7, r8, r9, r10)
            goto L1a5
        L156:
            r11 = r9
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 <= 0) goto L168
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 >= 0) goto L168
            long r10 = r1.f2305f
            r9 = r3
            r8 = r13
            boolean r1 = y1.g0.r(r6, r7, r8, r9, r10)
            goto L1a5
        L168:
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L178
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 <= 0) goto L178
            r9 = r11
            long r10 = r1.f2306g
            boolean r1 = y1.g0.r(r6, r7, r8, r9, r10)
            goto L1a5
        L178:
            r1 = r16
            goto L1a5
        L17b:
            r7 = r26
            f1.j r2 = f1.l.a()
            f1.j.c(r2, r1)
            boolean r1 = y1.g0.q(r6, r7, r2)
            goto L1a5
        L189:
            r1 = r15
            goto L1a5
        L18b:
            r7 = r5
            r15 = 0
            r16 = 1
            boolean r2 = r1 instanceof f1.j0
            if (r2 == 0) goto L19c
            f1.j0 r1 = (f1.j0) r1
            f1.j r1 = r1.f3071f
            boolean r1 = y1.g0.q(r6, r7, r1)
            goto L1a5
        L19c:
            okio.a.k()
            r1 = 0
            return r1
        L1a1:
            r15 = 0
            r16 = 1
            goto L178
        L1a5:
            if (r1 == 0) goto L1ac
            goto L1aa
        L1a8:
            r16 = 1
        L1aa:
            return r16
        L1ab:
            r15 = 0
        L1ac:
            return r15
    }

    @Override // x1.n0
    public final v1.t T0() {
            r0 = this;
            return r0
    }

    @Override // v1.t
    public final long W(v1.t r4, long r5) {
            r3 = this;
            boolean r0 = r4 instanceof v1.l0
            if (r0 == 0) goto L19
            v1.l0 r4 = (v1.l0) r4
            x1.o0 r0 = r4.f13982g
            x1.i1 r0 = r0.f21007u
            r0.A1()
            r0 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r5 = r5 ^ r0
            long r4 = r4.W(r3, r5)
            long r4 = r4 ^ r0
            return r4
        L19:
            x1.i1 r4 = M1(r4)
            r4.A1()
            x1.i1 r0 = r3.n1(r4)
        L24:
            if (r4 == r0) goto L45
            x1.q1 r1 = r4.R
            if (r1 == 0) goto L39
            y1.o1 r1 = (y1.o1) r1
            float[] r2 = r1.b()
            boolean r1 = r1.f22043y
            if (r1 == 0) goto L35
            goto L39
        L35:
            long r5 = f1.i0.b(r5, r2)
        L39:
            long r1 = r4.F
            long r5 = ig.a.R(r5, r1)
            x1.i1 r4 = r4.f20945w
            r4.getClass()
            goto L24
        L45:
            long r4 = r3.h1(r0, r5)
            return r4
    }

    @Override // v1.b1, v1.m0
    public final java.lang.Object X() {
            r11 = this;
            x1.f0 r0 = r11.f20943u
            x1.b1 r1 = r0.L
            r2 = 64
            boolean r1 = r1.d(r2)
            r3 = 0
            if (r1 == 0) goto L6d
            r11.r1()
            x1.b1 r1 = r0.L
            x1.b2 r1 = r1.f20843e
            r4 = r3
        L15:
            if (r1 == 0) goto L6c
            int r5 = r1.f21821i
            r5 = r5 & r2
            if (r5 == 0) goto L69
            r5 = r1
            r6 = r3
        L1e:
            if (r5 == 0) goto L69
            boolean r7 = r5 instanceof x1.u1
            if (r7 == 0) goto L2d
            x1.u1 r5 = (x1.u1) r5
            u2.c r7 = r0.E
            java.lang.Object r4 = r5.R(r7, r4)
            goto L64
        L2d:
            int r7 = r5.f21821i
            r7 = r7 & r2
            if (r7 == 0) goto L64
            boolean r7 = r5 instanceof x1.j
            if (r7 == 0) goto L64
            r7 = r5
            x1.j r7 = (x1.j) r7
            y0.n r7 = r7.f20950v
            r8 = 0
        L3c:
            r9 = 1
            if (r7 == 0) goto L61
            int r10 = r7.f21821i
            r10 = r10 & r2
            if (r10 == 0) goto L5e
            int r8 = r8 + 1
            if (r8 != r9) goto L4a
            r5 = r7
            goto L5e
        L4a:
            if (r6 != 0) goto L55
            j0.b r6 = new j0.b
            r9 = 16
            y0.n[] r9 = new y0.n[r9]
            r6.<init>(r9)
        L55:
            if (r5 == 0) goto L5b
            r6.b(r5)
            r5 = r3
        L5b:
            r6.b(r7)
        L5e:
            y0.n r7 = r7.f21824l
            goto L3c
        L61:
            if (r8 != r9) goto L64
            goto L1e
        L64:
            y0.n r5 = x1.k.e(r6)
            goto L1e
        L69:
            y0.n r1 = r1.f21823k
            goto L15
        L6c:
            return r4
        L6d:
            return r3
    }

    @Override // x1.n0
    public final boolean X0() {
            r1 = this;
            v1.o0 r0 = r1.D
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // x1.n0
    public final x1.f0 Y0() {
            r1 = this;
            x1.f0 r0 = r1.f20943u
            return r0
    }

    @Override // x1.n0
    public final v1.o0 Z0() {
            r1 = this;
            v1.o0 r0 = r1.D
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Asking for measurement result of unmeasured layout modifier"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    @Override // x1.n0
    public final x1.n0 a1() {
            r1 = this;
            x1.i1 r0 = r1.f20945w
            return r0
    }

    @Override // v1.t
    public final v1.t b0() {
            r4 = this;
            y0.n r0 = r4.r1()
            boolean r0 = r0.f21832t
            x1.f0 r1 = r4.f20943u
            if (r0 != 0) goto L4a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "LayoutCoordinate operations are only valid when isAttached is true"
            r0.<init>(r2)
            r2 = r1
        L12:
            if (r2 == 0) goto L43
            java.lang.String r3 = "\n|"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = " isAttached="
            r0.append(r3)
            boolean r3 = r2.G()
            r0.append(r3)
            java.lang.String r3 = " modifier="
            r0.append(r3)
            y0.o r3 = r2.Q
            r0.append(r3)
            java.lang.String r3 = " tail="
            r0.append(r3)
            y0.n r3 = r4.r1()
            r0.append(r3)
            x1.f0 r2 = r2.u()
            goto L12
        L43:
            java.lang.String r0 = r0.toString()
            u1.a.b(r0)
        L4a:
            r4.A1()
            x1.b1 r0 = r1.L
            x1.i1 r0 = r0.f20842d
            x1.i1 r0 = r0.f20945w
            return r0
    }

    @Override // x1.n0
    public final long b1() {
            r2 = this;
            long r0 = r2.F
            return r0
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            x1.f0 r0 = r1.f20943u
            u2.c r0 = r0.E
            float r0 = r0.d()
            return r0
    }

    @Override // x1.n0
    public final void f1() {
            r4 = this;
            i1.b r0 = r4.S
            long r1 = r4.F
            if (r0 == 0) goto Lc
            float r3 = r4.G
            r4.B0(r1, r3, r0)
            return
        Lc:
            float r0 = r4.G
            fg.l r3 = r4.f20948z
            r4.A0(r1, r0, r3)
            return
    }

    @Override // v1.t
    public final void g0(v1.t r2, float[] r3) {
            r1 = this;
            x1.i1 r2 = M1(r2)
            r2.A1()
            x1.i1 r0 = r1.n1(r2)
            f1.i0.d(r3)
            r2.P1(r0, r3)
            r1.O1(r0, r3)
            return
    }

    public final void g1(x1.i1 r8, e1.a r9, boolean r10) {
            r7 = this;
            if (r8 != r7) goto L3
            goto L5d
        L3:
            x1.i1 r0 = r7.f20945w
            if (r0 == 0) goto La
            r0.g1(r8, r9, r10)
        La:
            long r0 = r7.F
            r8 = 32
            long r2 = r0 >> r8
            int r2 = (int) r2
            float r3 = r9.f2290a
            float r2 = (float) r2
            float r3 = r3 - r2
            r9.f2290a = r3
            float r3 = r9.f2292c
            float r3 = r3 - r2
            r9.f2292c = r3
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r1 = r9.f2291b
            float r0 = (float) r0
            float r1 = r1 - r0
            r9.f2291b = r1
            float r1 = r9.f2293d
            float r1 = r1 - r0
            r9.f2293d = r1
            x1.q1 r0 = r7.R
            if (r0 == 0) goto L5d
            y1.o1 r0 = (y1.o1) r0
            float[] r1 = r0.a()
            boolean r0 = r0.f22043y
            r4 = 0
            if (r0 != 0) goto L4b
            if (r1 != 0) goto L48
            r9.f2290a = r4
            r9.f2291b = r4
            r9.f2292c = r4
            r9.f2293d = r4
            goto L4b
        L48:
            f1.i0.c(r1, r9)
        L4b:
            boolean r0 = r7.f20947y
            if (r0 == 0) goto L5d
            if (r10 == 0) goto L5d
            long r0 = r7.f13902i
            long r5 = r0 >> r8
            int r8 = (int) r5
            float r8 = (float) r8
            long r0 = r0 & r2
            int r10 = (int) r0
            float r10 = (float) r10
            r9.a(r4, r4, r8, r10)
        L5d:
            return
    }

    @Override // v1.o
    public final u2.m getLayoutDirection() {
            r1 = this;
            x1.f0 r0 = r1.f20943u
            u2.m r0 = r0.F
            return r0
    }

    public final long h1(x1.i1 r3, long r4) {
            r2 = this;
            if (r3 != r2) goto L3
            return r4
        L3:
            x1.i1 r0 = r2.f20945w
            if (r0 == 0) goto L17
            boolean r1 = gg.l.a(r3, r0)
            if (r1 == 0) goto Le
            goto L17
        Le:
            long r3 = r0.h1(r3, r4)
            long r3 = r2.o1(r3)
            return r3
        L17:
            long r3 = r2.o1(r4)
            return r3
    }

    public final long i1(long r7) {
            r6 = this;
            r0 = 32
            long r1 = r7 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r2 = r6.w0()
            float r2 = (float) r2
            float r1 = r1 - r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r8 = r6.r0()
            float r8 = (float) r8
            float r7 = r7 - r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r8
            r4 = 0
            float r1 = java.lang.Math.max(r4, r1)
            float r7 = r7 / r8
            float r7 = java.lang.Math.max(r4, r7)
            int r8 = java.lang.Float.floatToRawIntBits(r1)
            long r4 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r7
            long r0 = r4 << r0
            long r7 = r7 & r2
            long r7 = r7 | r0
            return r7
    }

    @Override // v1.t
    public final long j0(long r2) {
            r1 = this;
            y0.n r0 = r1.r1()
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            u1.a.b(r0)
        Ld:
            x1.f0 r0 = r1.f20943u
            x1.r1 r0 = x1.i0.a(r0)
            y1.t r0 = (y1.t) r0
            long r2 = r0.J(r2)
            v1.t r0 = v1.w.h(r1)
            long r2 = r1.W(r0, r2)
            return r2
    }

    public final float j1(long r9, long r11) {
            r8 = this;
            int r0 = r8.w0()
            float r0 = (float) r0
            r1 = 32
            long r2 = r11 >> r1
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 2139095040(0x7f800000, float:Infinity)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r0 < 0) goto L2a
            int r0 = r8.r0()
            float r0 = (float) r0
            long r5 = r11 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L2a
            return r2
        L2a:
            long r11 = r8.i1(r11)
            long r5 = r11 >> r1
            int r0 = (int) r5
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r11 = r11 & r3
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            long r5 = r9 >> r1
            int r12 = (int) r5
            float r12 = java.lang.Float.intBitsToFloat(r12)
            r5 = 0
            int r6 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r6 >= 0) goto L49
            float r12 = -r12
            goto L4f
        L49:
            int r6 = r8.w0()
            float r6 = (float) r6
            float r12 = r12 - r6
        L4f:
            float r12 = java.lang.Math.max(r5, r12)
            long r9 = r9 & r3
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L5f
            float r9 = -r9
            goto L65
        L5f:
            int r10 = r8.r0()
            float r10 = (float) r10
            float r9 = r9 - r10
        L65:
            float r9 = java.lang.Math.max(r5, r9)
            int r10 = java.lang.Float.floatToRawIntBits(r12)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            long r6 = r6 << r1
            long r9 = r9 & r3
            long r9 = r9 | r6
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 > 0) goto L7e
            int r12 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r12 <= 0) goto L9f
        L7e:
            long r5 = r9 >> r1
            int r12 = (int) r5
            float r1 = java.lang.Float.intBitsToFloat(r12)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L9f
            long r9 = r9 & r3
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 > 0) goto L9f
            float r10 = java.lang.Float.intBitsToFloat(r12)
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = r10 * r10
            float r9 = r9 * r9
            float r9 = r9 + r10
            return r9
        L9f:
            return r2
    }

    @Override // v1.t
    public final e1.c k0(v1.t r8, boolean r9) {
            r7 = this;
            y0.n r0 = r7.r1()
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            u1.a.b(r0)
        Ld:
            boolean r0 = r8.C()
            if (r0 != 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LayoutCoordinates "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = " is not attached!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            u1.a.b(r0)
        L29:
            x1.i1 r0 = M1(r8)
            r0.A1()
            x1.i1 r1 = r7.n1(r0)
            e1.a r2 = r7.H
            if (r2 != 0) goto L3f
            e1.a r2 = new e1.a
            r2.<init>()
            r7.H = r2
        L3f:
            r3 = 0
            r2.f2290a = r3
            r2.f2291b = r3
            long r3 = r8.F()
            r5 = 32
            long r3 = r3 >> r5
            int r3 = (int) r3
            float r3 = (float) r3
            r2.f2292c = r3
            long r3 = r8.F()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r8 = (int) r3
            float r8 = (float) r8
            r2.f2293d = r8
        L5d:
            if (r0 == r1) goto L72
            r8 = 0
            r0.I1(r2, r9, r8)
            boolean r8 = r2.b()
            if (r8 == 0) goto L6c
            e1.c r8 = e1.c.f2295e
            return r8
        L6c:
            x1.i1 r0 = r0.f20945w
            r0.getClass()
            goto L5d
        L72:
            r7.g1(r1, r2, r9)
            e1.c r8 = new e1.c
            float r9 = r2.f2290a
            float r0 = r2.f2291b
            float r1 = r2.f2292c
            float r2 = r2.f2293d
            r8.<init>(r9, r0, r1, r2)
            return r8
    }

    public final void k1(f1.u r6, i1.b r7) {
            r5 = this;
            x1.q1 r0 = r5.R
            if (r0 == 0) goto L2a
            y1.o1 r0 = (y1.o1) r0
            h1.b r1 = r0.f22037s
            r0.g()
            i1.b r2 = r0.f22025g
            i1.d r2 = r2.f6133a
            float r2 = r2.M()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            r0.f22044z = r2
            b5.c r2 = r1.f5038h
            r2.P(r6)
            r2.f470b = r7
            i1.b r6 = r0.f22025g
            oh.h.u(r1, r6)
            return
        L2a:
            long r0 = r5.F
            r2 = 32
            long r2 = r0 >> r2
            int r2 = (int) r2
            float r2 = (float) r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            float r0 = (float) r0
            r6.m(r2, r0)
            r5.l1(r6, r7)
            float r7 = -r2
            float r0 = -r0
            r6.m(r7, r0)
            return
    }

    public final void l1(f1.u r12, i1.b r13) {
            r11 = this;
            r0 = 4
            y0.n r1 = r11.s1(r0)
            if (r1 != 0) goto Lb
            r11.G1(r12, r13)
            return
        Lb:
            x1.f0 r2 = r11.f20943u
            r2.getClass()
            x1.r1 r2 = x1.i0.a(r2)
            y1.t r2 = (y1.t) r2
            x1.h0 r3 = r2.getSharedDrawScope()
            long r4 = r11.f13902i
            long r5 = r9.e0.q0(r4)
            r3.getClass()
            r2 = 0
            r10 = r2
        L25:
            if (r1 == 0) goto L75
            boolean r4 = r1 instanceof x1.m
            if (r4 == 0) goto L35
            r8 = r1
            x1.m r8 = (x1.m) r8
            r7 = r11
            r4 = r12
            r9 = r13
            r3.j(r4, r5, r7, r8, r9)
            goto L70
        L35:
            r4 = r12
            r9 = r13
            int r12 = r1.f21821i
            r12 = r12 & r0
            if (r12 == 0) goto L70
            boolean r12 = r1 instanceof x1.j
            if (r12 == 0) goto L70
            r12 = r1
            x1.j r12 = (x1.j) r12
            y0.n r12 = r12.f20950v
            r13 = 0
        L46:
            r7 = 1
            if (r12 == 0) goto L6b
            int r8 = r12.f21821i
            r8 = r8 & r0
            if (r8 == 0) goto L68
            int r13 = r13 + 1
            if (r13 != r7) goto L54
            r1 = r12
            goto L68
        L54:
            if (r10 != 0) goto L5f
            j0.b r10 = new j0.b
            r7 = 16
            y0.n[] r7 = new y0.n[r7]
            r10.<init>(r7)
        L5f:
            if (r1 == 0) goto L65
            r10.b(r1)
            r1 = r2
        L65:
            r10.b(r12)
        L68:
            y0.n r12 = r12.f21824l
            goto L46
        L6b:
            if (r13 != r7) goto L70
        L6d:
            r12 = r4
            r13 = r9
            goto L25
        L70:
            y0.n r1 = x1.k.e(r10)
            goto L6d
        L75:
            return
    }

    @Override // v1.t
    public final long m(long r2) {
            r1 = this;
            long r2 = r1.m0(r2)
            x1.f0 r0 = r1.f20943u
            x1.r1 r0 = x1.i0.a(r0)
            y1.t r0 = (y1.t) r0
            r0.F()
            float[] r0 = r0.f22088j0
            long r2 = f1.i0.b(r2, r0)
            return r2
    }

    @Override // v1.t
    public final long m0(long r6) {
            r5 = this;
            y0.n r0 = r5.r1()
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Ld
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            u1.a.b(r0)
        Ld:
            r5.A1()
            r0 = r5
        L11:
            if (r0 == 0) goto L59
            x1.f0 r1 = r0.f20943u
            x1.b1 r2 = r1.L
            x1.i1 r2 = r2.f20842d
            if (r0 != r2) goto L3d
            boolean r2 = r1.f20891i
            if (r2 != 0) goto L3d
            x1.r1 r2 = x1.i0.a(r1)
            y1.t r2 = (y1.t) r2
            g2.b r2 = r2.getRectManager()
            long r1 = r2.b(r1)
            r3 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r3 = u2.j.b(r1, r3)
            if (r3 != 0) goto L3d
            long r6 = ig.a.R(r6, r1)
            return r6
        L3d:
            x1.q1 r1 = r0.R
            if (r1 == 0) goto L50
            y1.o1 r1 = (y1.o1) r1
            float[] r2 = r1.b()
            boolean r1 = r1.f22043y
            if (r1 == 0) goto L4c
            goto L50
        L4c:
            long r6 = f1.i0.b(r6, r2)
        L50:
            long r1 = r0.F
            long r6 = ig.a.R(r6, r1)
            x1.i1 r0 = r0.f20945w
            goto L11
        L59:
            return r6
    }

    public abstract void m1();

    public final x1.i1 n1(x1.i1 r6) {
            r5 = this;
            x1.f0 r0 = r6.f20943u
            x1.f0 r1 = r5.f20943u
            if (r0 != r1) goto L2b
            y0.n r0 = r6.r1()
            y0.n r1 = r5.r1()
            y0.n r2 = r1.f21819g
            boolean r2 = r2.f21832t
            if (r2 != 0) goto L19
            java.lang.String r2 = "visitLocalAncestors called on an unattached node"
            u1.a.b(r2)
        L19:
            y0.n r1 = r1.f21819g
            y0.n r1 = r1.f21823k
        L1d:
            if (r1 == 0) goto L60
            int r2 = r1.f21821i
            r2 = r2 & 2
            if (r2 == 0) goto L28
            if (r1 != r0) goto L28
            goto L65
        L28:
            y0.n r1 = r1.f21823k
            goto L1d
        L2b:
            int r2 = r0.f20904v
            int r3 = r1.f20904v
            if (r2 <= r3) goto L39
            x1.f0 r0 = r0.u()
            r0.getClass()
            goto L2b
        L39:
            r2 = r1
        L3a:
            int r3 = r2.f20904v
            int r4 = r0.f20904v
            if (r3 <= r4) goto L48
            x1.f0 r2 = r2.u()
            r2.getClass()
            goto L3a
        L48:
            if (r0 == r2) goto L5e
            x1.f0 r0 = r0.u()
            x1.f0 r2 = r2.u()
            if (r0 == 0) goto L57
            if (r2 == 0) goto L57
            goto L48
        L57:
            java.lang.String r6 = "layouts are not part of the same hierarchy"
            j8.o.t(r6)
            r6 = 0
            return r6
        L5e:
            if (r2 != r1) goto L61
        L60:
            return r5
        L61:
            x1.f0 r1 = r6.f20943u
            if (r0 != r1) goto L66
        L65:
            return r6
        L66:
            x1.b1 r6 = r0.L
            x1.r r6 = r6.f20841c
            return r6
    }

    public final long o1(long r7) {
            r6 = this;
            long r0 = r6.F
            r2 = 32
            long r3 = r7 >> r2
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r4 = r0 >> r2
            int r4 = (int) r4
            float r4 = (float) r4
            float r3 = r3 - r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r4
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r0 = r0 & r4
            int r8 = (int) r0
            float r8 = (float) r8
            float r7 = r7 - r8
            int r8 = java.lang.Float.floatToRawIntBits(r3)
            long r0 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r7
            long r0 = r0 << r2
            long r7 = r7 & r4
            long r7 = r7 | r0
            x1.q1 r0 = r6.R
            if (r0 == 0) goto L47
            y1.o1 r0 = (y1.o1) r0
            float[] r1 = r0.a()
            if (r1 != 0) goto L3e
            r7 = 9187343241974906880(0x7f8000007f800000, double:1.404448428688076E306)
            return r7
        L3e:
            boolean r0 = r0.f22043y
            if (r0 == 0) goto L43
            goto L47
        L43:
            long r7 = f1.i0.b(r7, r1)
        L47:
            return r7
    }

    public abstract x1.o0 p1();

    @Override // u2.c
    public final float q0() {
            r1 = this;
            x1.f0 r0 = r1.f20943u
            u2.c r0 = r0.E
            float r0 = r0.q0()
            return r0
    }

    public final long q1() {
            r3 = this;
            u2.c r0 = r3.A
            x1.f0 r1 = r3.f20943u
            y1.l2 r1 = r1.G
            long r1 = r1.d()
            long r0 = r0.L0(r1)
            return r0
    }

    public abstract y0.n r1();

    public final y0.n s1(int r4) {
            r3 = this;
            boolean r0 = x1.j1.g(r4)
            y0.n r1 = r3.r1()
            if (r0 == 0) goto Lb
            goto L10
        Lb:
            y0.n r1 = r1.f21823k
            if (r1 != 0) goto L10
            goto L26
        L10:
            y0.n r0 = r3.t1(r0)
        L14:
            if (r0 == 0) goto L26
            int r2 = r0.f21822j
            r2 = r2 & r4
            if (r2 == 0) goto L26
            int r2 = r0.f21821i
            r2 = r2 & r4
            if (r2 == 0) goto L21
            return r0
        L21:
            if (r0 == r1) goto L26
            y0.n r0 = r0.f21824l
            goto L14
        L26:
            r4 = 0
            return r4
    }

    public final y0.n t1(boolean r3) {
            r2 = this;
            x1.f0 r0 = r2.f20943u
            x1.b1 r0 = r0.L
            x1.i1 r1 = r0.f20842d
            if (r1 != r2) goto Lb
            y0.n r3 = r0.f20844f
            return r3
        Lb:
            x1.i1 r0 = r2.f20945w
            if (r3 == 0) goto L1a
            if (r0 == 0) goto L21
            y0.n r3 = r0.r1()
            if (r3 == 0) goto L21
            y0.n r3 = r3.f21824l
            return r3
        L1a:
            if (r0 == 0) goto L21
            y0.n r3 = r0.r1()
            return r3
        L21:
            r3 = 0
            return r3
    }

    public final void u1(y0.n r9, x1.e1 r10, long r11, x1.p r13, int r14, boolean r15) {
            r8 = this;
            if (r9 != 0) goto Lc
            r0 = r8
            r1 = r10
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r0.x1(r1, r2, r4, r5, r6)
            return
        Lc:
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            boolean r10 = r2.b(r9)
            if (r10 != 0) goto L24
            int r10 = r2.a()
            y0.n r1 = x1.k.d(r9, r10)
            r0 = r8
            r0.u1(r1, r2, r3, r5, r6, r7)
            return
        L24:
            int r10 = r5.f21017i
            f.f0 r11 = r5.f21015g
            int r12 = r10 + 1
            int r13 = r11.f2804b
            r5.c(r12, r13)
            int r12 = r5.f21017i
            int r12 = r12 + 1
            r5.f21017i = r12
            r11.a(r9)
            f.y r11 = r5.f21016h
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13 = 0
            long r12 = x1.k.a(r12, r7, r13)
            r11.a(r12)
            int r11 = r2.a()
            y0.n r1 = x1.k.d(r9, r11)
            r0 = r8
            r0.u1(r1, r2, r3, r5, r6, r7)
            r5.f21017i = r10
            return
    }

    public final void v1(y0.n r12, x1.e1 r13, long r14, x1.p r16, int r17, boolean r18, float r19) {
            r11 = this;
            if (r12 != 0) goto Lf
            r0 = r11
            r1 = r13
            r2 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r0.x1(r1, r2, r4, r5, r6)
            return
        Lf:
            boolean r0 = r13.b(r12)
            if (r0 != 0) goto L2c
            int r0 = r13.a()
            y0.n r1 = x1.k.d(r12, r0)
            r0 = r11
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r0.v1(r1, r2, r3, r5, r6, r7, r8)
            return
        L2c:
            r5 = r16
            int r10 = r5.f21017i
            f.f0 r0 = r5.f21015g
            int r1 = r10 + 1
            int r2 = r0.f2804b
            r5.c(r1, r2)
            int r1 = r5.f21017i
            int r1 = r1 + 1
            r5.f21017i = r1
            r0.a(r12)
            f.y r0 = r5.f21016h
            r1 = 0
            r7 = r18
            r8 = r19
            long r1 = x1.k.a(r8, r7, r1)
            r0.a(r1)
            int r0 = r13.a()
            y0.n r1 = x1.k.d(r12, r0)
            r9 = 1
            r0 = r11
            r2 = r13
            r3 = r14
            r6 = r17
            r0.F1(r1, r2, r3, r5, r6, r7, r8, r9)
            r5.f21017i = r10
            return
    }

    @Override // v1.t
    public final long w(v1.t r1, long r2) {
            r0 = this;
            long r1 = r0.W(r1, r2)
            return r1
    }

    public final void w1(x1.e1 r15, long r16, x1.p r18, int r19, boolean r20) {
            r14 = this;
            r3 = r16
            r5 = r18
            r6 = r19
            int r0 = r15.a()
            y0.n r1 = r14.s1(r0)
            boolean r0 = r14.S1(r3)
            r8 = 0
            r9 = 2139095040(0x7f800000, float:Infinity)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1
            if (r0 != 0) goto L4c
            if (r6 != r11) goto L4b
            long r12 = r14.q1()
            float r0 = r14.j1(r3, r12)
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            r2 = r2 & r10
            if (r2 >= r9) goto L4b
            int r2 = r5.f21017i
            f.f0 r7 = r5.f21015g
            int r7 = r7.f2804b
            int r7 = r7 - r11
            if (r2 != r7) goto L36
            goto L44
        L36:
            long r7 = x1.k.a(r0, r8, r8)
            long r9 = r5.a()
            int r2 = x1.k.g(r9, r7)
            if (r2 <= 0) goto L4b
        L44:
            r7 = 0
            r2 = r15
            r8 = r0
            r0 = r14
            r0.v1(r1, r2, r3, r5, r6, r7, r8)
        L4b:
            return
        L4c:
            if (r1 != 0) goto L52
            r14.x1(r15, r16, r18, r19, r20)
            return
        L52:
            r0 = 32
            long r2 = r16 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r16 & r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L90
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L90
            int r3 = r14.w0()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L90
            int r0 = r14.r0()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L90
            r0 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.u1(r1, r2, r3, r5, r6, r7)
            return
        L90:
            r3 = r16
            r5 = r18
            r6 = r19
            if (r6 != r11) goto La1
            long r12 = r14.q1()
            float r2 = r14.j1(r3, r12)
            goto La3
        La1:
            r2 = 2139095040(0x7f800000, float:Infinity)
        La3:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            r7 = r7 & r10
            if (r7 >= r9) goto Lcb
            int r7 = r5.f21017i
            f.f0 r9 = r5.f21015g
            int r9 = r9.f2804b
            int r9 = r9 - r11
            if (r7 != r9) goto Lb6
            r7 = r20
            goto Lc6
        Lb6:
            r7 = r20
            long r9 = x1.k.a(r2, r7, r8)
            long r12 = r5.a()
            int r9 = x1.k.g(r12, r9)
            if (r9 <= 0) goto Lcd
        Lc6:
            r9 = r11
        Lc7:
            r0 = r14
            r8 = r2
            r2 = r15
            goto Lcf
        Lcb:
            r7 = r20
        Lcd:
            r9 = r8
            goto Lc7
        Lcf:
            r0.F1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
    }

    public void x1(x1.e1 r8, long r9, x1.p r11, int r12, boolean r13) {
            r7 = this;
            x1.i1 r0 = r7.f20944v
            if (r0 == 0) goto Lf
            long r2 = r0.o1(r9)
            r1 = r8
            r4 = r11
            r5 = r12
            r6 = r13
            r0.w1(r1, r2, r4, r5, r6)
        Lf:
            return
    }

    public final void y1() {
            r1 = this;
            x1.q1 r0 = r1.R
            if (r0 == 0) goto La
            y1.o1 r0 = (y1.o1) r0
            r0.c()
            return
        La:
            x1.i1 r0 = r1.f20945w
            if (r0 == 0) goto L11
            r0.y1()
        L11:
            return
    }

    public final boolean z1() {
            r2 = this;
            x1.q1 r0 = r2.R
            if (r0 == 0) goto Ld
            float r0 = r2.C
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Ld
            r0 = 1
            return r0
        Ld:
            x1.i1 r0 = r2.f20945w
            if (r0 == 0) goto L16
            boolean r0 = r0.z1()
            return r0
        L16:
            r0 = 0
            return r0
    }
}
