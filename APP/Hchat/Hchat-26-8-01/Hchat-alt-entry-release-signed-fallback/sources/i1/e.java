package i1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements i1.d {
    public static final java.util.concurrent.atomic.AtomicBoolean B = null;
    public f1.n0 A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1.v f6159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1.b f6160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.view.RenderNode f6161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f6163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public android.graphics.Matrix f6164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f1.n f6169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f6170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f6172o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f6173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f6174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f6175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f6176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6177t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f6178u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f6179v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f6180w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6181x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6182y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6183z;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            i1.e.B = r0
            return
    }

    public e(y1.t r2, f1.v r3, h1.b r4) {
            r1 = this;
            r1.<init>()
            r1.f6159b = r3
            r1.f6160c = r4
            java.lang.String r3 = "Compose"
            android.view.RenderNode r2 = android.view.RenderNode.create(r3, r2)
            r1.f6161d = r2
            r3 = 0
            r1.f6162e = r3
            r1.f6166i = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = i1.e.B
            r4 = 0
            boolean r3 = r3.getAndSet(r4)
            if (r3 == 0) goto La9
            float r3 = r2.getScaleX()
            r2.setScaleX(r3)
            float r3 = r2.getScaleY()
            r2.setScaleY(r3)
            float r3 = r2.getTranslationX()
            r2.setTranslationX(r3)
            float r3 = r2.getTranslationY()
            r2.setTranslationY(r3)
            float r3 = r2.getElevation()
            r2.setElevation(r3)
            float r3 = r2.getRotation()
            r2.setRotation(r3)
            float r3 = r2.getRotationX()
            r2.setRotationX(r3)
            float r3 = r2.getRotationY()
            r2.setRotationY(r3)
            float r3 = r2.getCameraDistance()
            r2.setCameraDistance(r3)
            float r3 = r2.getPivotX()
            r2.setPivotX(r3)
            float r3 = r2.getPivotY()
            r2.setPivotY(r3)
            boolean r3 = r2.getClipToOutline()
            r2.setClipToOutline(r3)
            r2.setClipToBounds(r4)
            float r3 = r2.getAlpha()
            r2.setAlpha(r3)
            r2.isValid()
            r2.setLeftTopRightBottom(r4, r4, r4, r4)
            r2.offsetLeftAndRight(r4)
            r2.offsetTopAndBottom(r4)
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r3 < r0) goto L9c
            int r3 = i1.k.a(r2)
            i1.k.c(r2, r3)
            int r3 = i1.k.b(r2)
            i1.k.d(r2, r3)
        L9c:
            i1.j.a(r2)
            r2.setLayerType(r4)
            boolean r3 = r2.hasOverlappingRendering()
            r2.setHasOverlappingRendering(r3)
        La9:
            r2.setClipToBounds(r4)
            r1.Q(r4)
            r1.f6167j = r4
            r2 = 3
            r1.f6168k = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.f6170m = r2
            r1.f6172o = r2
            r1.f6173p = r2
            long r2 = f1.w.f3126b
            r1.f6177t = r2
            r1.f6178u = r2
            r2 = 1090519040(0x41000000, float:8.0)
            r1.f6180w = r2
            return
    }

    @Override // i1.d
    public final boolean A() {
            r1 = this;
            android.view.RenderNode r0 = r1.f6161d
            boolean r0 = r0.isValid()
            return r0
    }

    @Override // i1.d
    public final float B() {
            r1 = this;
            float r0 = r1.f6179v
            return r0
    }

    @Override // i1.d
    public final void C(long r7) {
            r6 = this;
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r7
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 != 0) goto L33
            r7 = 1
            r6.f6171n = r7
            android.view.RenderNode r7 = r6.f6161d
            long r4 = r6.f6162e
            long r3 = r4 >> r3
            int r8 = (int) r3
            float r8 = (float) r8
            r0 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r0
            r7.setPivotX(r8)
            android.view.RenderNode r7 = r6.f6161d
            long r3 = r6.f6162e
            long r1 = r1 & r3
            int r8 = (int) r1
            float r8 = (float) r8
            float r8 = r8 / r0
            r7.setPivotY(r8)
            return
        L33:
            r0 = 0
            r6.f6171n = r0
            android.view.RenderNode r0 = r6.f6161d
            long r3 = r7 >> r3
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r0.setPivotX(r3)
            android.view.RenderNode r0 = r6.f6161d
            long r7 = r7 & r1
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            r0.setPivotY(r7)
            return
    }

    @Override // i1.d
    public final long D() {
            r2 = this;
            long r0 = r2.f6177t
            return r0
    }

    @Override // i1.d
    public final float E() {
            r1 = this;
            float r0 = r1.f6175r
            return r0
    }

    @Override // i1.d
    public final long F() {
            r2 = this;
            long r0 = r2.f6178u
            return r0
    }

    @Override // i1.d
    public final float G() {
            r1 = this;
            float r0 = r1.f6180w
            return r0
    }

    @Override // i1.d
    public final float H() {
            r1 = this;
            float r0 = r1.f6174q
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
            r0.f6167j = r1
            r0.R()
            return
    }

    @Override // i1.d
    public final android.graphics.Matrix K() {
            r2 = this;
            android.graphics.Matrix r0 = r2.f6164g
            if (r0 != 0) goto Lb
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.f6164g = r0
        Lb:
            android.view.RenderNode r1 = r2.f6161d
            r1.getMatrix(r0)
            return r0
    }

    @Override // i1.d
    public final void L(f1.n0 r1) {
            r0 = this;
            r0.A = r1
            return
    }

    @Override // i1.d
    public final float M() {
            r1 = this;
            float r0 = r1.f6176s
            return r0
    }

    @Override // i1.d
    public final void N(f1.u r2) {
            r1 = this;
            android.graphics.Canvas r0 = f1.c.f3036a
            f1.b r2 = (f1.b) r2
            android.graphics.Canvas r2 = r2.f3025a
            r2.getClass()
            android.view.DisplayListCanvas r2 = (android.view.DisplayListCanvas) r2
            android.view.RenderNode r0 = r1.f6161d
            r2.drawRenderNode(r0)
            return
    }

    @Override // i1.d
    public final int O() {
            r1 = this;
            int r0 = r1.f6168k
            return r0
    }

    public final void P() {
            r4 = this;
            boolean r0 = r4.f6181x
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            boolean r3 = r4.f6165h
            if (r3 != 0) goto Lc
            r3 = r2
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r0 == 0) goto L14
            boolean r0 = r4.f6165h
            if (r0 == 0) goto L14
            r1 = r2
        L14:
            boolean r0 = r4.f6182y
            if (r3 == r0) goto L1f
            r4.f6182y = r3
            android.view.RenderNode r0 = r4.f6161d
            r0.setClipToBounds(r3)
        L1f:
            boolean r0 = r4.f6183z
            if (r1 == r0) goto L2a
            r4.f6183z = r1
            android.view.RenderNode r0 = r4.f6161d
            r0.setClipToOutline(r1)
        L2a:
            return
    }

    public final void Q(int r5) {
            r4 = this;
            android.view.RenderNode r0 = r4.f6161d
            r1 = 2
            r2 = 1
            if (r5 != r2) goto L12
            r0.setLayerType(r1)
            android.graphics.Paint r5 = r4.f6163f
            r0.setLayerPaint(r5)
            r0.setHasOverlappingRendering(r2)
            return
        L12:
            r3 = 0
            if (r5 != r1) goto L21
            r0.setLayerType(r3)
            android.graphics.Paint r5 = r4.f6163f
            r0.setLayerPaint(r5)
            r0.setHasOverlappingRendering(r3)
            return
        L21:
            r0.setLayerType(r3)
            android.graphics.Paint r5 = r4.f6163f
            r0.setLayerPaint(r5)
            r0.setHasOverlappingRendering(r2)
            return
    }

    public final void R() {
            r4 = this;
            int r0 = r4.f6167j
            r1 = 1
            if (r0 != r1) goto L6
            goto L14
        L6:
            int r2 = r4.f6168k
            r3 = 3
            if (r2 != r3) goto L14
            f1.n r2 = r4.f6169l
            if (r2 == 0) goto L10
            goto L14
        L10:
            r4.Q(r0)
            return
        L14:
            r4.Q(r1)
            return
    }

    @Override // i1.d
    public final float a() {
            r1 = this;
            float r0 = r1.f6170m
            return r0
    }

    @Override // i1.d
    public final float b() {
            r1 = this;
            float r0 = r1.f6172o
            return r0
    }

    @Override // i1.d
    public final void c(float r2) {
            r1 = this;
            r1.f6176s = r2
            android.view.RenderNode r0 = r1.f6161d
            r0.setElevation(r2)
            return
    }

    @Override // i1.d
    public final f1.n0 d() {
            r1 = this;
            f1.n0 r0 = r1.A
            return r0
    }

    @Override // i1.d
    public final void e(android.graphics.Outline r1, long r2) {
            r0 = this;
            r0.f6166i = r2
            android.view.RenderNode r2 = r0.f6161d
            r2.setOutline(r1)
            if (r1 == 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.f6165h = r1
            r0.P()
            return
    }

    @Override // i1.d
    public final void f(float r2) {
            r1 = this;
            r1.f6179v = r2
            android.view.RenderNode r0 = r1.f6161d
            r0.setRotation(r2)
            return
    }

    @Override // i1.d
    public final void g(float r2) {
            r1 = this;
            r1.f6175r = r2
            android.view.RenderNode r0 = r1.f6161d
            r0.setTranslationY(r2)
            return
    }

    @Override // i1.d
    public final void h(int r3) {
            r2 = this;
            int r0 = r2.f6168k
            if (r0 != r3) goto L5
            return
        L5:
            r2.f6168k = r3
            android.graphics.Paint r0 = r2.f6163f
            if (r0 != 0) goto L12
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.f6163f = r0
        L12:
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = f1.c0.z(r3)
            r1.<init>(r3)
            r0.setXfermode(r1)
            r2.R()
            return
    }

    @Override // i1.d
    public final void i(float r2) {
            r1 = this;
            r1.f6173p = r2
            android.view.RenderNode r0 = r1.f6161d
            r0.setScaleY(r2)
            return
    }

    @Override // i1.d
    public final void j() {
            r1 = this;
            android.view.RenderNode r0 = r1.f6161d
            i1.j.a(r0)
            return
    }

    @Override // i1.d
    public final void k(f1.n r3) {
            r2 = this;
            r2.f6169l = r3
            if (r3 == 0) goto L1e
            r0 = 1
            r2.Q(r0)
            android.view.RenderNode r0 = r2.f6161d
            android.graphics.Paint r1 = r2.f6163f
            if (r1 != 0) goto L15
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r2.f6163f = r1
        L15:
            android.graphics.ColorFilter r3 = r3.f3077a
            r1.setColorFilter(r3)
            r0.setLayerPaint(r1)
            return
        L1e:
            r2.R()
            return
    }

    @Override // i1.d
    public final void l() {
            r2 = this;
            r0 = 0
            android.view.RenderNode r1 = r2.f6161d
            r1.setRotationX(r0)
            return
    }

    @Override // i1.d
    public final void m(u2.c r14, u2.m r15, i1.b r16, b1.f r17) {
            r13 = this;
            android.view.RenderNode r0 = r13.f6161d
            long r1 = r13.f6162e
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            long r4 = r13.f6166i
            long r2 = r4 >> r3
            int r2 = (int) r2
            int r1 = java.lang.Math.max(r1, r2)
            long r2 = r13.f6162e
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            long r6 = r13.f6166i
            long r3 = r6 & r4
            int r3 = (int) r3
            int r2 = java.lang.Math.max(r2, r3)
            android.view.DisplayListCanvas r1 = r0.start(r1, r2)
            f1.v r0 = r13.f6159b     // Catch: java.lang.Throwable -> L81
            f1.b r2 = r0.f3125a     // Catch: java.lang.Throwable -> L81
            r0 = r1
            android.graphics.Canvas r0 = (android.graphics.Canvas) r0     // Catch: java.lang.Throwable -> L81
            android.graphics.Canvas r3 = r2.f3025a     // Catch: java.lang.Throwable -> L81
            r2.f3025a = r0     // Catch: java.lang.Throwable -> L81
            h1.b r4 = r13.f6160c     // Catch: java.lang.Throwable -> L81
            b5.c r0 = r4.f5038h     // Catch: java.lang.Throwable -> L81
            long r5 = r13.f6162e     // Catch: java.lang.Throwable -> L81
            long r5 = r9.e0.q0(r5)     // Catch: java.lang.Throwable -> L81
            u2.c r7 = r0.s()     // Catch: java.lang.Throwable -> L81
            u2.m r8 = r0.u()     // Catch: java.lang.Throwable -> L81
            f1.u r9 = r0.p()     // Catch: java.lang.Throwable -> L81
            long r10 = r0.v()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r12 = r0.f470b     // Catch: java.lang.Throwable -> L81
            i1.b r12 = (i1.b) r12     // Catch: java.lang.Throwable -> L81
            r0.R(r14)     // Catch: java.lang.Throwable -> L81
            r0.S(r15)     // Catch: java.lang.Throwable -> L81
            r0.P(r2)     // Catch: java.lang.Throwable -> L81
            r0.U(r5)     // Catch: java.lang.Throwable -> L81
            r14 = r16
            r0.f470b = r14     // Catch: java.lang.Throwable -> L81
            r2.e()     // Catch: java.lang.Throwable -> L81
            r14 = r17
            r14.invoke(r4)     // Catch: java.lang.Throwable -> L84
            r2.p()     // Catch: java.lang.Throwable -> L81
            r0.R(r7)     // Catch: java.lang.Throwable -> L81
            r0.S(r8)     // Catch: java.lang.Throwable -> L81
            r0.P(r9)     // Catch: java.lang.Throwable -> L81
            r0.U(r10)     // Catch: java.lang.Throwable -> L81
            r0.f470b = r12     // Catch: java.lang.Throwable -> L81
            r2.f3025a = r3     // Catch: java.lang.Throwable -> L81
            android.view.RenderNode r14 = r13.f6161d
            r14.end(r1)
            return
        L81:
            r0 = move-exception
            r14 = r0
            goto L9a
        L84:
            r0 = move-exception
            r14 = r0
            r2.p()     // Catch: java.lang.Throwable -> L81
            b5.c r0 = r4.f5038h     // Catch: java.lang.Throwable -> L81
            r0.R(r7)     // Catch: java.lang.Throwable -> L81
            r0.S(r8)     // Catch: java.lang.Throwable -> L81
            r0.P(r9)     // Catch: java.lang.Throwable -> L81
            r0.U(r10)     // Catch: java.lang.Throwable -> L81
            r0.f470b = r12     // Catch: java.lang.Throwable -> L81
            throw r14     // Catch: java.lang.Throwable -> L81
        L9a:
            android.view.RenderNode r0 = r13.f6161d
            r0.end(r1)
            throw r14
    }

    @Override // i1.d
    public final void n(float r2) {
            r1 = this;
            r1.f6170m = r2
            android.view.RenderNode r0 = r1.f6161d
            r0.setAlpha(r2)
            return
    }

    @Override // i1.d
    public final void o() {
            r2 = this;
            r0 = 0
            android.view.RenderNode r1 = r2.f6161d
            r1.setRotationY(r0)
            return
    }

    @Override // i1.d
    public final void p(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            r2.f6177t = r3
            android.view.RenderNode r0 = r2.f6161d
            int r3 = f1.c0.w(r3)
            i1.k.c(r0, r3)
        L11:
            return
    }

    @Override // i1.d
    public final void q(float r2) {
            r1 = this;
            r1.f6172o = r2
            android.view.RenderNode r0 = r1.f6161d
            r0.setScaleX(r2)
            return
    }

    @Override // i1.d
    public final void r(boolean r1) {
            r0 = this;
            r0.f6181x = r1
            r0.P()
            return
    }

    @Override // i1.d
    public final void s(float r2) {
            r1 = this;
            r1.f6174q = r2
            android.view.RenderNode r0 = r1.f6161d
            r0.setTranslationX(r2)
            return
    }

    @Override // i1.d
    public final void t(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            r2.f6178u = r3
            android.view.RenderNode r0 = r2.f6161d
            int r3 = f1.c0.w(r3)
            i1.k.d(r0, r3)
        L11:
            return
    }

    @Override // i1.d
    public final void u(float r2) {
            r1 = this;
            r1.f6180w = r2
            android.view.RenderNode r0 = r1.f6161d
            float r2 = -r2
            r0.setCameraDistance(r2)
            return
    }

    @Override // i1.d
    public final float v() {
            r1 = this;
            float r0 = r1.f6173p
            return r0
    }

    @Override // i1.d
    public final int w() {
            r1 = this;
            int r0 = r1.f6167j
            return r0
    }

    @Override // i1.d
    public final f1.n x() {
            r1 = this;
            f1.n r0 = r1.f6169l
            return r0
    }

    @Override // i1.d
    public final void y(int r6, int r7, long r8) {
            r5 = this;
            android.view.RenderNode r0 = r5.f6161d
            r1 = 32
            long r1 = r8 >> r1
            int r1 = (int) r1
            int r2 = r6 + r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r8
            int r3 = (int) r3
            int r4 = r7 + r3
            r0.setLeftTopRightBottom(r6, r7, r2, r4)
            long r6 = r5.f6162e
            boolean r6 = u2.l.a(r6, r8)
            if (r6 != 0) goto L33
            boolean r6 = r5.f6171n
            if (r6 == 0) goto L31
            android.view.RenderNode r6 = r5.f6161d
            float r7 = (float) r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r0
            r6.setPivotX(r7)
            android.view.RenderNode r6 = r5.f6161d
            float r7 = (float) r3
            float r7 = r7 / r0
            r6.setPivotY(r7)
        L31:
            r5.f6162e = r8
        L33:
            return
    }

    @Override // i1.d
    public final float z() {
            r1 = this;
            r0 = 0
            return r0
    }
}
