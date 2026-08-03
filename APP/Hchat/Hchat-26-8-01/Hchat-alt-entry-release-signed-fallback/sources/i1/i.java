package i1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements i1.d {
    public static final i1.h B = null;
    public f1.n0 A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.a f6208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1.v f6209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1.m f6210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.content.res.Resources f6211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f6212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public android.graphics.Paint f6213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f6216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6220n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f1.n f6221o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6222p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f6223q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6224r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f6225s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f6226t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f6227u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f6228v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f6229w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f6230x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f6231y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f6232z;

    static {
            i1.h r0 = new i1.h
            r0.<init>()
            i1.i.B = r0
            return
    }

    public i(j1.a r4) {
            r3 = this;
            f1.v r0 = new f1.v
            r0.<init>()
            h1.b r1 = new h1.b
            r1.<init>()
            r3.<init>()
            r3.f6208b = r4
            r3.f6209c = r0
            i1.m r2 = new i1.m
            r2.<init>(r4, r0, r1)
            r3.f6210d = r2
            android.content.res.Resources r0 = r4.getResources()
            r3.f6211e = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f6212f = r0
            r4.addView(r2)
            r4 = 0
            r2.setClipBounds(r4)
            r0 = 0
            r3.f6216j = r0
            android.view.View.generateViewId()
            r4 = 3
            r3.f6220n = r4
            r4 = 0
            r3.f6222p = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f6223q = r4
            r3.f6225s = r4
            r3.f6226t = r4
            long r0 = f1.w.f3126b
            r3.f6230x = r0
            r3.f6231y = r0
            return
    }

    @Override // i1.d
    public final float B() {
            r1 = this;
            float r0 = r1.f6232z
            return r0
    }

    @Override // i1.d
    public final void C(long r8) {
            r7 = this;
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r8
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            i1.m r4 = r7.f6210d
            if (r0 != 0) goto L3b
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r8 < r9) goto L22
            h3.c.g(r4)
            return
        L22:
            r8 = 1
            r7.f6224r = r8
            long r8 = r7.f6216j
            long r8 = r8 >> r3
            int r8 = (int) r8
            float r8 = (float) r8
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            r4.setPivotX(r8)
            long r5 = r7.f6216j
            long r0 = r5 & r1
            int r8 = (int) r0
            float r8 = (float) r8
            float r8 = r8 / r9
            r4.setPivotY(r8)
            return
        L3b:
            r0 = 0
            r7.f6224r = r0
            long r5 = r8 >> r3
            int r0 = (int) r5
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r4.setPivotX(r0)
            long r8 = r8 & r1
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            r4.setPivotY(r8)
            return
    }

    @Override // i1.d
    public final long D() {
            r2 = this;
            long r0 = r2.f6230x
            return r0
    }

    @Override // i1.d
    public final float E() {
            r1 = this;
            float r0 = r1.f6228v
            return r0
    }

    @Override // i1.d
    public final long F() {
            r2 = this;
            long r0 = r2.f6231y
            return r0
    }

    @Override // i1.d
    public final float G() {
            r2 = this;
            i1.m r0 = r2.f6210d
            float r0 = r0.getCameraDistance()
            android.content.res.Resources r1 = r2.f6211e
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.densityDpi
            float r1 = (float) r1
            float r0 = r0 / r1
            return r0
    }

    @Override // i1.d
    public final float H() {
            r1 = this;
            float r0 = r1.f6227u
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
            r0.f6222p = r1
            r0.Q()
            return
    }

    @Override // i1.d
    public final android.graphics.Matrix K() {
            r1 = this;
            i1.m r0 = r1.f6210d
            android.graphics.Matrix r0 = r0.getMatrix()
            return r0
    }

    @Override // i1.d
    public final void L(f1.n0 r3) {
            r2 = this;
            r2.A = r3
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L15
            if (r3 == 0) goto Lf
            android.graphics.RenderEffect r3 = r3.f()
            goto L10
        Lf:
            r3 = 0
        L10:
            i1.m r0 = r2.f6210d
            a1.c.A(r0, r3)
        L15:
            return
    }

    @Override // i1.d
    public final float M() {
            r1 = this;
            float r0 = r1.f6229w
            return r0
    }

    @Override // i1.d
    public final void N(f1.u r5) {
            r4 = this;
            boolean r0 = r4.f6217k
            i1.m r1 = r4.f6210d
            if (r0 == 0) goto L2c
            boolean r0 = r4.f6219m
            if (r0 != 0) goto L10
            boolean r0 = r1.getClipToOutline()
            if (r0 == 0) goto L28
        L10:
            boolean r0 = r4.f6218l
            if (r0 != 0) goto L28
            android.graphics.Rect r0 = r4.f6212f
            r2 = 0
            r0.left = r2
            r0.top = r2
            int r2 = r1.getWidth()
            r0.right = r2
            int r2 = r1.getHeight()
            r0.bottom = r2
            goto L29
        L28:
            r0 = 0
        L29:
            r1.setClipBounds(r0)
        L2c:
            android.graphics.Canvas r0 = f1.c.f3036a
            r0 = r5
            f1.b r0 = (f1.b) r0
            android.graphics.Canvas r0 = r0.f3025a
            boolean r0 = r0.isHardwareAccelerated()
            if (r0 == 0) goto L42
            j1.a r0 = r4.f6208b
            long r2 = r1.getDrawingTime()
            r0.a(r5, r1, r2)
        L42:
            return
    }

    @Override // i1.d
    public final int O() {
            r1 = this;
            int r0 = r1.f6220n
            return r0
    }

    public final void P(int r6) {
            r5 = this;
            r0 = 2
            i1.m r1 = r5.f6210d
            r2 = 1
            if (r6 != r2) goto Lc
            android.graphics.Paint r6 = r5.f6213g
            r1.setLayerType(r0, r6)
            goto L19
        Lc:
            android.graphics.Paint r3 = r5.f6213g
            r4 = 0
            if (r6 != r0) goto L16
            r1.setLayerType(r4, r3)
            r2 = r4
            goto L19
        L16:
            r1.setLayerType(r4, r3)
        L19:
            r1.setCanUseCompositingLayer$ui_graphics(r2)
            return
    }

    public final void Q() {
            r4 = this;
            int r0 = r4.f6222p
            r1 = 1
            if (r0 != r1) goto L6
            goto L14
        L6:
            int r2 = r4.f6220n
            r3 = 3
            if (r2 != r3) goto L14
            f1.n r2 = r4.f6221o
            if (r2 == 0) goto L10
            goto L14
        L10:
            r4.P(r0)
            return
        L14:
            r4.P(r1)
            return
    }

    @Override // i1.d
    public final float a() {
            r1 = this;
            float r0 = r1.f6223q
            return r0
    }

    @Override // i1.d
    public final float b() {
            r1 = this;
            float r0 = r1.f6225s
            return r0
    }

    @Override // i1.d
    public final void c(float r2) {
            r1 = this;
            r1.f6229w = r2
            i1.m r0 = r1.f6210d
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
    public final void e(android.graphics.Outline r3, long r4) {
            r2 = this;
            i1.m r4 = r2.f6210d
            r4.f6239k = r3
            r4.invalidateOutline()
            boolean r5 = r2.f6219m
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L13
            boolean r5 = r4.getClipToOutline()
            if (r5 == 0) goto L20
        L13:
            if (r3 == 0) goto L20
            r4.setClipToOutline(r1)
            boolean r4 = r2.f6219m
            if (r4 == 0) goto L20
            r2.f6219m = r0
            r2.f6217k = r1
        L20:
            if (r3 == 0) goto L23
            r0 = r1
        L23:
            r2.f6218l = r0
            return
    }

    @Override // i1.d
    public final void f(float r2) {
            r1 = this;
            r1.f6232z = r2
            i1.m r0 = r1.f6210d
            r0.setRotation(r2)
            return
    }

    @Override // i1.d
    public final void g(float r2) {
            r1 = this;
            r1.f6228v = r2
            i1.m r0 = r1.f6210d
            r0.setTranslationY(r2)
            return
    }

    @Override // i1.d
    public final void h(int r3) {
            r2 = this;
            r2.f6220n = r3
            android.graphics.Paint r0 = r2.f6213g
            if (r0 != 0) goto Ld
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.f6213g = r0
        Ld:
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r3 = f1.c0.z(r3)
            r1.<init>(r3)
            r0.setXfermode(r1)
            r2.Q()
            return
    }

    @Override // i1.d
    public final void i(float r2) {
            r1 = this;
            r1.f6226t = r2
            i1.m r0 = r1.f6210d
            r0.setScaleY(r2)
            return
    }

    @Override // i1.d
    public final void j() {
            r2 = this;
            j1.a r0 = r2.f6208b
            i1.m r1 = r2.f6210d
            r0.removeViewInLayout(r1)
            return
    }

    @Override // i1.d
    public final void k(f1.n r2) {
            r1 = this;
            r1.f6221o = r2
            android.graphics.Paint r0 = r1.f6213g
            if (r0 != 0) goto Ld
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1.f6213g = r0
        Ld:
            if (r2 == 0) goto L12
            android.graphics.ColorFilter r2 = r2.f3077a
            goto L13
        L12:
            r2 = 0
        L13:
            r0.setColorFilter(r2)
            r1.Q()
            return
    }

    @Override // i1.d
    public final void l() {
            r2 = this;
            r0 = 0
            i1.m r1 = r2.f6210d
            r1.setRotationX(r0)
            return
    }

    @Override // i1.d
    public final void m(u2.c r6, u2.m r7, i1.b r8, b1.f r9) {
            r5 = this;
            i1.m r0 = r5.f6210d
            android.view.ViewParent r1 = r0.getParent()
            j1.a r2 = r5.f6208b
            if (r1 != 0) goto Ld
            r2.addView(r0)
        Ld:
            r0.f6241m = r6
            r0.f6242n = r7
            r0.f6243o = r9
            r0.f6244p = r8
            boolean r6 = r0.isAttachedToWindow()
            if (r6 == 0) goto L38
            r6 = 4
            r0.setVisibility(r6)
            r6 = 0
            r0.setVisibility(r6)
            f1.v r6 = r5.f6209c     // Catch: java.lang.ClassCastException -> L38
            i1.h r7 = i1.i.B     // Catch: java.lang.ClassCastException -> L38
            f1.b r8 = r6.f3125a     // Catch: java.lang.ClassCastException -> L38
            android.graphics.Canvas r9 = r8.f3025a     // Catch: java.lang.ClassCastException -> L38
            r8.f3025a = r7     // Catch: java.lang.ClassCastException -> L38
            long r3 = r0.getDrawingTime()     // Catch: java.lang.ClassCastException -> L38
            r2.a(r8, r0, r3)     // Catch: java.lang.ClassCastException -> L38
            f1.b r6 = r6.f3125a     // Catch: java.lang.ClassCastException -> L38
            r6.f3025a = r9     // Catch: java.lang.ClassCastException -> L38
        L38:
            return
    }

    @Override // i1.d
    public final void n(float r2) {
            r1 = this;
            r1.f6223q = r2
            i1.m r0 = r1.f6210d
            r0.setAlpha(r2)
            return
    }

    @Override // i1.d
    public final void o() {
            r2 = this;
            r0 = 0
            i1.m r1 = r2.f6210d
            r1.setRotationY(r0)
            return
    }

    @Override // i1.d
    public final void p(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            r2.f6230x = r3
            i1.m r0 = r2.f6210d
            int r3 = f1.c0.w(r3)
            h3.c.n(r0, r3)
        L11:
            return
    }

    @Override // i1.d
    public final void q(float r2) {
            r1 = this;
            r1.f6225s = r2
            i1.m r0 = r1.f6210d
            r0.setScaleX(r2)
            return
    }

    @Override // i1.d
    public final void r(boolean r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == 0) goto La
            boolean r2 = r3.f6218l
            if (r2 != 0) goto La
            r2 = r1
            goto Lb
        La:
            r2 = r0
        Lb:
            r3.f6219m = r2
            r3.f6217k = r1
            if (r4 == 0) goto L16
            boolean r4 = r3.f6218l
            if (r4 == 0) goto L16
            r0 = r1
        L16:
            i1.m r4 = r3.f6210d
            r4.setClipToOutline(r0)
            return
    }

    @Override // i1.d
    public final void s(float r2) {
            r1 = this;
            r1.f6227u = r2
            i1.m r0 = r1.f6210d
            r0.setTranslationX(r2)
            return
    }

    @Override // i1.d
    public final void t(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            r2.f6231y = r3
            i1.m r0 = r2.f6210d
            int r3 = f1.c0.w(r3)
            h3.c.h(r0, r3)
        L11:
            return
    }

    @Override // i1.d
    public final void u(float r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.f6211e
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            float r0 = (float) r0
            float r2 = r2 * r0
            i1.m r0 = r1.f6210d
            r0.setCameraDistance(r2)
            return
    }

    @Override // i1.d
    public final float v() {
            r1 = this;
            float r0 = r1.f6226t
            return r0
    }

    @Override // i1.d
    public final int w() {
            r1 = this;
            int r0 = r1.f6222p
            return r0
    }

    @Override // i1.d
    public final f1.n x() {
            r1 = this;
            f1.n r0 = r1.f6221o
            return r0
    }

    @Override // i1.d
    public final void y(int r6, int r7, long r8) {
            r5 = this;
            long r0 = r5.f6216j
            boolean r0 = u2.l.a(r0, r8)
            i1.m r1 = r5.f6210d
            if (r0 != 0) goto L3d
            boolean r0 = r5.f6219m
            if (r0 != 0) goto L14
            boolean r0 = r1.getClipToOutline()
            if (r0 == 0) goto L17
        L14:
            r0 = 1
            r5.f6217k = r0
        L17:
            r0 = 32
            long r2 = r8 >> r0
            int r0 = (int) r2
            int r2 = r6 + r0
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r8
            int r3 = (int) r3
            int r4 = r7 + r3
            r1.layout(r6, r7, r2, r4)
            r5.f6216j = r8
            boolean r8 = r5.f6224r
            if (r8 == 0) goto L4f
            float r8 = (float) r0
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            r1.setPivotX(r8)
            float r8 = (float) r3
            float r8 = r8 / r9
            r1.setPivotY(r8)
            goto L4f
        L3d:
            int r8 = r5.f6214h
            if (r8 == r6) goto L46
            int r8 = r6 - r8
            r1.offsetLeftAndRight(r8)
        L46:
            int r8 = r5.f6215i
            if (r8 == r7) goto L4f
            int r8 = r7 - r8
            r1.offsetTopAndBottom(r8)
        L4f:
            r5.f6214h = r6
            r5.f6215i = r7
            return
    }

    @Override // i1.d
    public final float z() {
            r1 = this;
            r0 = 0
            return r0
    }
}
