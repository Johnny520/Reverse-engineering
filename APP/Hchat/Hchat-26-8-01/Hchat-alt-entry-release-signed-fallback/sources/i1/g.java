package i1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i1.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1.v f6184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1.b f6185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.graphics.RenderNode f6186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f6188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public android.graphics.Matrix f6189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f6191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f1.n f6193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f6194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f6195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f6197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f6198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f6200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f6201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f6202t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6203u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6204v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6205w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f1.n0 f6206x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6207y;

    public g() {
            r4 = this;
            f1.v r0 = new f1.v
            r0.<init>()
            h1.b r1 = new h1.b
            r1.<init>()
            r4.<init>()
            r4.f6184b = r0
            r4.f6185c = r1
            android.graphics.RenderNode r0 = i1.f.a()
            r4.f6186d = r0
            r1 = 0
            r4.f6187e = r1
            i1.f.y(r0)
            r1 = 0
            r4.Q(r0, r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.f6191i = r0
            r2 = 3
            r4.f6192j = r2
            r4.f6194l = r0
            r4.f6195m = r0
            long r2 = f1.w.f3126b
            r4.f6199q = r2
            r4.f6200r = r2
            r0 = 1090519040(0x41000000, float:8.0)
            r4.f6202t = r0
            r4.f6207y = r1
            return
    }

    @Override // i1.d
    public final boolean A() {
            r1 = this;
            android.graphics.RenderNode r0 = r1.f6186d
            boolean r0 = i1.f.n(r0)
            return r0
    }

    @Override // i1.d
    public final float B() {
            r1 = this;
            float r0 = r1.f6201s
            return r0
    }

    @Override // i1.d
    public final void C(long r5) {
            r4 = this;
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r5
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            android.graphics.RenderNode r1 = r4.f6186d
            if (r0 != 0) goto L15
            i1.f.w(r1)
            return
        L15:
            r0 = 32
            long r2 = r5 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            i1.f.v(r1, r0)
            android.graphics.RenderNode r0 = r4.f6186d
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r1
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            i1.f.x(r0, r5)
            return
    }

    @Override // i1.d
    public final long D() {
            r2 = this;
            long r0 = r2.f6199q
            return r0
    }

    @Override // i1.d
    public final float E() {
            r1 = this;
            float r0 = r1.f6197o
            return r0
    }

    @Override // i1.d
    public final long F() {
            r2 = this;
            long r0 = r2.f6200r
            return r0
    }

    @Override // i1.d
    public final float G() {
            r1 = this;
            float r0 = r1.f6202t
            return r0
    }

    @Override // i1.d
    public final float H() {
            r1 = this;
            float r0 = r1.f6196n
            return r0
    }

    @Override // i1.d
    public final float I() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // i1.d
    public final void J(int r1) {
            r0 = this;
            r0.f6207y = r1
            r0.R()
            return
    }

    @Override // i1.d
    public final android.graphics.Matrix K() {
            r2 = this;
            android.graphics.Matrix r0 = r2.f6189g
            if (r0 != 0) goto Lb
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f6189g = r0
        Lb:
            android.graphics.RenderNode r1 = r2.f6186d
            i1.f.j(r1, r0)
            return r0
    }

    @Override // i1.d
    public final void L(f1.n0 r3) {
            r2 = this;
            r2.f6206x = r3
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L15
            android.graphics.RenderNode r0 = r2.f6186d
            if (r3 == 0) goto L11
            android.graphics.RenderEffect r3 = r3.f()
            goto L12
        L11:
            r3 = 0
        L12:
            a1.c.x(r0, r3)
        L15:
            return
    }

    @Override // i1.d
    public final float M() {
            r1 = this;
            float r0 = r1.f6198p
            return r0
    }

    @Override // i1.d
    public final void N(f1.u r2) {
            r1 = this;
            android.graphics.Canvas r0 = f1.c.f3036a
            f1.b r2 = (f1.b) r2
            android.graphics.Canvas r2 = r2.f3025a
            android.graphics.RenderNode r0 = r1.f6186d
            j2.b.k(r2, r0)
            return
    }

    @Override // i1.d
    public final int O() {
            r1 = this;
            int r0 = r1.f6192j
            return r0
    }

    public final void P() {
            r4 = this;
            boolean r0 = r4.f6203u
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            boolean r3 = r4.f6190h
            if (r3 != 0) goto Lc
            r3 = r2
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r0 == 0) goto L14
            boolean r0 = r4.f6190h
            if (r0 == 0) goto L14
            r1 = r2
        L14:
            boolean r0 = r4.f6204v
            if (r3 == r0) goto L1f
            r4.f6204v = r3
            android.graphics.RenderNode r0 = r4.f6186d
            i1.f.m(r0, r3)
        L1f:
            boolean r0 = r4.f6205w
            if (r1 == r0) goto L2a
            r4.f6205w = r1
            android.graphics.RenderNode r0 = r4.f6186d
            f1.a.n(r0, r1)
        L2a:
            return
    }

    public final void Q(android.graphics.RenderNode r3, int r4) {
            r2 = this;
            android.graphics.Paint r0 = r2.f6188f
            r1 = 1
            if (r4 != r1) goto Lc
            i1.f.l(r3, r0)
            i1.f.o(r3)
            return
        Lc:
            r1 = 2
            if (r4 != r1) goto L16
            i1.f.r(r3, r0)
            i1.f.s(r3)
            return
        L16:
            i1.f.r(r3, r0)
            i1.f.o(r3)
            return
    }

    public final void R() {
            r4 = this;
            int r0 = r4.f6207y
            r1 = 1
            if (r0 != r1) goto L6
            goto L1b
        L6:
            int r2 = r4.f6192j
            r3 = 3
            if (r2 != r3) goto L1b
            f1.n r2 = r4.f6193k
            if (r2 == 0) goto L10
            goto L1b
        L10:
            f1.n0 r2 = r4.f6206x
            if (r2 == 0) goto L15
            goto L1b
        L15:
            android.graphics.RenderNode r1 = r4.f6186d
            r4.Q(r1, r0)
            return
        L1b:
            android.graphics.RenderNode r0 = r4.f6186d
            r4.Q(r0, r1)
            return
    }

    @Override // i1.d
    public final float a() {
            r1 = this;
            float r0 = r1.f6191i
            return r0
    }

    @Override // i1.d
    public final float b() {
            r1 = this;
            float r0 = r1.f6194l
            return r0
    }

    @Override // i1.d
    public final void c(float r2) {
            r1 = this;
            r1.f6198p = r2
            android.graphics.RenderNode r0 = r1.f6186d
            i1.f.t(r0, r2)
            return
    }

    @Override // i1.d
    public final f1.n0 d() {
            r1 = this;
            f1.n0 r0 = r1.f6206x
            return r0
    }

    @Override // i1.d
    public final void e(android.graphics.Outline r1, long r2) {
            r0 = this;
            android.graphics.RenderNode r2 = r0.f6186d
            i1.f.k(r2, r1)
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            r0.f6190h = r1
            r0.P()
            return
    }

    @Override // i1.d
    public final void f(float r2) {
            r1 = this;
            r1.f6201s = r2
            android.graphics.RenderNode r0 = r1.f6186d
            i1.f.C(r0, r2)
            return
    }

    @Override // i1.d
    public final void g(float r2) {
            r1 = this;
            r1.f6197o = r2
            android.graphics.RenderNode r0 = r1.f6186d
            i1.f.D(r0, r2)
            return
    }

    @Override // i1.d
    public final void h(int r2) {
            r1 = this;
            r1.f6192j = r2
            android.graphics.Paint r0 = r1.f6188f
            if (r0 != 0) goto Ld
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.f6188f = r0
        Ld:
            android.graphics.BlendMode r2 = f1.c0.s(r2)
            f1.a.l(r0, r2)
            r1.R()
            return
    }

    @Override // i1.d
    public final void i(float r2) {
            r1 = this;
            r1.f6195m = r2
            android.graphics.RenderNode r0 = r1.f6186d
            f1.a.m(r0, r2)
            return
    }

    @Override // i1.d
    public final void j() {
            r1 = this;
            android.graphics.RenderNode r0 = r1.f6186d
            i1.f.f(r0)
            return
    }

    @Override // i1.d
    public final void k(f1.n r2) {
            r1 = this;
            r1.f6193k = r2
            android.graphics.Paint r0 = r1.f6188f
            if (r0 != 0) goto Ld
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.f6188f = r0
        Ld:
            if (r2 == 0) goto L12
            android.graphics.ColorFilter r2 = r2.f3077a
            goto L13
        L12:
            r2 = 0
        L13:
            r0.setColorFilter(r2)
            r1.R()
            return
    }

    @Override // i1.d
    public final void l() {
            r1 = this;
            android.graphics.RenderNode r0 = r1.f6186d
            i1.f.u(r0)
            return
    }

    @Override // i1.d
    public final void m(u2.c r6, u2.m r7, i1.b r8, b1.f r9) {
            r5 = this;
            h1.b r0 = r5.f6185c
            android.graphics.RenderNode r1 = r5.f6186d
            android.graphics.RecordingCanvas r1 = j2.b.e(r1)
            f1.v r2 = r5.f6184b     // Catch: java.lang.Throwable -> L2f
            f1.b r3 = r2.f3125a     // Catch: java.lang.Throwable -> L2f
            android.graphics.Canvas r4 = r3.f3025a     // Catch: java.lang.Throwable -> L2f
            r3.f3025a = r1     // Catch: java.lang.Throwable -> L2f
            b5.c r1 = r0.f5038h     // Catch: java.lang.Throwable -> L2f
            r1.R(r6)     // Catch: java.lang.Throwable -> L2f
            r1.S(r7)     // Catch: java.lang.Throwable -> L2f
            r1.f470b = r8     // Catch: java.lang.Throwable -> L2f
            long r6 = r5.f6187e     // Catch: java.lang.Throwable -> L2f
            r1.U(r6)     // Catch: java.lang.Throwable -> L2f
            r1.P(r3)     // Catch: java.lang.Throwable -> L2f
            r9.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            f1.b r6 = r2.f3125a     // Catch: java.lang.Throwable -> L2f
            r6.f3025a = r4     // Catch: java.lang.Throwable -> L2f
            android.graphics.RenderNode r6 = r5.f6186d
            j2.b.m(r6)
            return
        L2f:
            r6 = move-exception
            android.graphics.RenderNode r7 = r5.f6186d
            j2.b.m(r7)
            throw r6
    }

    @Override // i1.d
    public final void n(float r2) {
            r1 = this;
            r1.f6191i = r2
            android.graphics.RenderNode r0 = r1.f6186d
            i1.f.g(r0, r2)
            return
    }

    @Override // i1.d
    public final void o() {
            r1 = this;
            android.graphics.RenderNode r0 = r1.f6186d
            i1.f.A(r0)
            return
    }

    @Override // i1.d
    public final void p(long r2) {
            r1 = this;
            r1.f6199q = r2
            android.graphics.RenderNode r0 = r1.f6186d
            int r2 = f1.c0.w(r2)
            i1.f.h(r0, r2)
            return
    }

    @Override // i1.d
    public final void q(float r2) {
            r1 = this;
            r1.f6194l = r2
            android.graphics.RenderNode r0 = r1.f6186d
            i1.f.p(r0, r2)
            return
    }

    @Override // i1.d
    public final void r(boolean r1) {
            r0 = this;
            r0.f6203u = r1
            r0.P()
            return
    }

    @Override // i1.d
    public final void s(float r2) {
            r1 = this;
            r1.f6196n = r2
            android.graphics.RenderNode r0 = r1.f6186d
            i1.f.B(r0, r2)
            return
    }

    @Override // i1.d
    public final void t(long r2) {
            r1 = this;
            r1.f6200r = r2
            android.graphics.RenderNode r0 = r1.f6186d
            int r2 = f1.c0.w(r2)
            i1.f.q(r0, r2)
            return
    }

    @Override // i1.d
    public final void u(float r2) {
            r1 = this;
            r1.f6202t = r2
            android.graphics.RenderNode r0 = r1.f6186d
            i1.f.z(r0, r2)
            return
    }

    @Override // i1.d
    public final float v() {
            r1 = this;
            float r0 = r1.f6195m
            return r0
    }

    @Override // i1.d
    public final int w() {
            r1 = this;
            int r0 = r1.f6207y
            return r0
    }

    @Override // i1.d
    public final f1.n x() {
            r1 = this;
            f1.n r0 = r1.f6193k
            return r0
    }

    @Override // i1.d
    public final void y(int r5, int r6, long r7) {
            r4 = this;
            android.graphics.RenderNode r0 = r4.f6186d
            r1 = 32
            long r1 = r7 >> r1
            int r1 = (int) r1
            int r1 = r1 + r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r7
            int r2 = (int) r2
            int r2 = r2 + r6
            i1.f.i(r0, r5, r6, r1, r2)
            long r5 = r9.e0.q0(r7)
            r4.f6187e = r5
            return
    }

    @Override // i1.d
    public final float z() {
            r1 = this;
            r0 = 0
            return r0
    }
}
