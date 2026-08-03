package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class h0 extends g3.n0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f4203i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static java.lang.reflect.Method f4204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static java.lang.Class f4205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static java.lang.reflect.Field f4206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static java.lang.reflect.Field f4207m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.WindowInsets f4208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b3.a[] f4209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b3.a f4210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g3.r0 f4211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b3.a f4212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4213h;

    public h0(g3.r0 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.f4210e = r1
            r0.f4208c = r2
            return
    }

    public h0(g3.r0 r2, g3.h0 r3) {
            r1 = this;
            android.view.WindowInsets r0 = new android.view.WindowInsets
            android.view.WindowInsets r3 = r3.f4208c
            r0.<init>(r3)
            r1.<init>(r2, r0)
            return
    }

    private static void B() {
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "getViewRootImpl"
            r3 = 0
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.ReflectiveOperationException -> L35
            g3.h0.f4204j = r1     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.String r1 = "android.view.View$AttachInfo"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L35
            g3.h0.f4205k = r1     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.String r2 = "mVisibleInsets"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L35
            g3.h0.f4206l = r1     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.String r1 = "android.view.ViewRootImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.String r2 = "mAttachInfo"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L35
            g3.h0.f4207m = r1     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.reflect.Field r1 = g3.h0.f4206l     // Catch: java.lang.ReflectiveOperationException -> L35
            r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.reflect.Field r1 = g3.h0.f4207m     // Catch: java.lang.ReflectiveOperationException -> L35
            r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L35
            goto L4d
        L35:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to get visible insets. (Reflection error). "
            r2.<init>(r3)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "WindowInsetsCompat"
            android.util.Log.e(r3, r2, r1)
        L4d:
            g3.h0.f4203i = r0
            return
    }

    public static boolean C(int r0, int r1) {
            r0 = r0 & 6
            r1 = r1 & 6
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private b3.a w(int r4, boolean r5) {
            r3 = this;
            b3.a r0 = b3.a.f444e
            r1 = 1
        L3:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > r2) goto L17
            r2 = r4 & r1
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            b3.a r2 = r3.x(r1, r5)
            b3.a r0 = b3.a.a(r0, r2)
        L14:
            int r1 = r1 << 1
            goto L3
        L17:
            return r0
    }

    private b3.a y() {
            r1 = this;
            g3.r0 r0 = r1.f4211f
            if (r0 == 0) goto Lb
            g3.n0 r0 = r0.f4230a
            b3.a r0 = r0.j()
            return r0
        Lb:
            b3.a r0 = b3.a.f444e
            return r0
    }

    private b3.a z(android.view.View r6) {
            r5 = this;
            java.lang.String r0 = "WindowInsetsCompat"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L64
            boolean r1 = g3.h0.f4203i
            if (r1 != 0) goto Lf
            B()
        Lf:
            java.lang.reflect.Method r1 = g3.h0.f4204j
            r2 = 0
            if (r1 == 0) goto L63
            java.lang.Class r3 = g3.h0.f4205k
            if (r3 == 0) goto L63
            java.lang.reflect.Field r3 = g3.h0.f4206l
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            java.lang.Object r6 = r1.invoke(r6, r2)     // Catch: java.lang.ReflectiveOperationException -> L2e
            if (r6 != 0) goto L30
            java.lang.String r6 = "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L2e
            r1.<init>()     // Catch: java.lang.ReflectiveOperationException -> L2e
            android.util.Log.w(r0, r6, r1)     // Catch: java.lang.ReflectiveOperationException -> L2e
            return r2
        L2e:
            r6 = move-exception
            goto L4e
        L30:
            java.lang.reflect.Field r1 = g3.h0.f4207m     // Catch: java.lang.ReflectiveOperationException -> L2e
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.ReflectiveOperationException -> L2e
            java.lang.reflect.Field r1 = g3.h0.f4206l     // Catch: java.lang.ReflectiveOperationException -> L2e
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.ReflectiveOperationException -> L2e
            android.graphics.Rect r6 = (android.graphics.Rect) r6     // Catch: java.lang.ReflectiveOperationException -> L2e
            if (r6 == 0) goto L4d
            int r1 = r6.left     // Catch: java.lang.ReflectiveOperationException -> L2e
            int r3 = r6.top     // Catch: java.lang.ReflectiveOperationException -> L2e
            int r4 = r6.right     // Catch: java.lang.ReflectiveOperationException -> L2e
            int r6 = r6.bottom     // Catch: java.lang.ReflectiveOperationException -> L2e
            b3.a r6 = b3.a.b(r1, r3, r4, r6)     // Catch: java.lang.ReflectiveOperationException -> L2e
            return r6
        L4d:
            return r2
        L4e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to get visible insets. (Reflection error). "
            r1.<init>(r3)
            java.lang.String r3 = r6.getMessage()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1, r6)
        L63:
            return r2
        L64:
            java.lang.String r6 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
            j8.o.w(r6)
            r6 = 0
            return r6
    }

    public boolean A(int r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L14
            r2 = 2
            if (r4 == r2) goto L14
            r2 = 4
            if (r4 == r2) goto L13
            r2 = 8
            if (r4 == r2) goto L14
            r2 = 128(0x80, float:1.8E-43)
            if (r4 == r2) goto L14
            return r1
        L13:
            return r0
        L14:
            b3.a r4 = r3.x(r4, r0)
            b3.a r0 = b3.a.f444e
            boolean r4 = r4.equals(r0)
            r4 = r4 ^ r1
            return r4
    }

    @Override // g3.n0
    public void d(android.view.View r1) {
            r0 = this;
            b3.a r1 = r0.z(r1)
            if (r1 != 0) goto L8
            b3.a r1 = b3.a.f444e
        L8:
            r0.s(r1)
            return
    }

    @Override // g3.n0
    public void e(g3.r0 r3) {
            r2 = this;
            g3.r0 r0 = r2.f4211f
            g3.n0 r1 = r3.f4230a
            r1.t(r0)
            b3.a r0 = r2.f4212g
            g3.n0 r3 = r3.f4230a
            r3.s(r0)
            int r0 = r2.f4213h
            r3.v(r0)
            return
    }

    @Override // g3.n0
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = super.equals(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            g3.h0 r4 = (g3.h0) r4
            b3.a r0 = r3.f4212g
            b3.a r2 = r4.f4212g
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto L20
            int r0 = r3.f4213h
            int r4 = r4.f4213h
            boolean r4 = C(r0, r4)
            if (r4 == 0) goto L20
            r4 = 1
            return r4
        L20:
            return r1
    }

    @Override // g3.n0
    public b3.a g(int r2) {
            r1 = this;
            r0 = 0
            b3.a r2 = r1.w(r2, r0)
            return r2
    }

    @Override // g3.n0
    public b3.a h(int r2) {
            r1 = this;
            r0 = 1
            b3.a r2 = r1.w(r2, r0)
            return r2
    }

    @Override // g3.n0
    public final b3.a l() {
            r4 = this;
            b3.a r0 = r4.f4210e
            if (r0 != 0) goto L1c
            android.view.WindowInsets r0 = r4.f4208c
            int r1 = r0.getSystemWindowInsetLeft()
            int r2 = r0.getSystemWindowInsetTop()
            int r3 = r0.getSystemWindowInsetRight()
            int r0 = r0.getSystemWindowInsetBottom()
            b3.a r0 = b3.a.b(r1, r2, r3, r0)
            r4.f4210e = r0
        L1c:
            b3.a r0 = r4.f4210e
            return r0
    }

    @Override // g3.n0
    public g3.r0 n(int r4, int r5, int r6, int r7) {
            r3 = this;
            android.view.WindowInsets r0 = r3.f4208c
            r1 = 0
            g3.r0 r0 = g3.r0.c(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L13
            g3.f0 r1 = new g3.f0
            r1.<init>(r0)
            goto L2c
        L13:
            r2 = 30
            if (r1 < r2) goto L1d
            g3.e0 r1 = new g3.e0
            r1.<init>(r0)
            goto L2c
        L1d:
            r2 = 29
            if (r1 < r2) goto L27
            g3.d0 r1 = new g3.d0
            r1.<init>(r0)
            goto L2c
        L27:
            g3.c0 r1 = new g3.c0
            r1.<init>(r0)
        L2c:
            b3.a r0 = r3.l()
            b3.a r0 = g3.r0.a(r0, r4, r5, r6, r7)
            r1.g(r0)
            b3.a r0 = r3.j()
            b3.a r4 = g3.r0.a(r0, r4, r5, r6, r7)
            r1.e(r4)
            g3.r0 r4 = r1.b()
            return r4
    }

    @Override // g3.n0
    public boolean p() {
            r1 = this;
            android.view.WindowInsets r0 = r1.f4208c
            boolean r0 = r0.isRound()
            return r0
    }

    @Override // g3.n0
    public boolean q(int r4) {
            r3 = this;
            r0 = 1
            r1 = r0
        L2:
            r2 = 512(0x200, float:7.17E-43)
            if (r1 > r2) goto L16
            r2 = r4 & r1
            if (r2 != 0) goto Lb
            goto L13
        Lb:
            boolean r2 = r3.A(r1)
            if (r2 != 0) goto L13
            r4 = 0
            return r4
        L13:
            int r1 = r1 << 1
            goto L2
        L16:
            return r0
    }

    @Override // g3.n0
    public void r(b3.a[] r1) {
            r0 = this;
            r0.f4209d = r1
            return
    }

    @Override // g3.n0
    public void s(b3.a r1) {
            r0 = this;
            r0.f4212g = r1
            return
    }

    @Override // g3.n0
    public void t(g3.r0 r1) {
            r0 = this;
            r0.f4211f = r1
            return
    }

    @Override // g3.n0
    public void v(int r1) {
            r0 = this;
            r0.f4213h = r1
            return
    }

    public b3.a x(int r6, boolean r7) {
            r5 = this;
            r0 = 1
            b3.a r1 = b3.a.f444e
            r2 = 0
            if (r6 == r0) goto Lf4
            r0 = 0
            r3 = 2
            if (r6 == r3) goto La6
            r7 = 8
            if (r6 == r7) goto L6f
            r7 = 16
            if (r6 == r7) goto L6a
            r7 = 32
            if (r6 == r7) goto L65
            r7 = 64
            if (r6 == r7) goto L60
            r7 = 128(0x80, float:1.8E-43)
            if (r6 == r7) goto L20
            goto L111
        L20:
            g3.r0 r6 = r5.f4211f
            if (r6 == 0) goto L2b
            g3.n0 r6 = r6.f4230a
            g3.d r6 = r6.f()
            goto L2f
        L2b:
            g3.d r6 = r5.f()
        L2f:
            if (r6 == 0) goto L111
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r7 < r0) goto L3e
            android.view.DisplayCutout r1 = r6.f4194a
            int r1 = c3.a.e(r1)
            goto L3f
        L3e:
            r1 = r2
        L3f:
            if (r7 < r0) goto L48
            android.view.DisplayCutout r3 = r6.f4194a
            int r3 = c3.a.g(r3)
            goto L49
        L48:
            r3 = r2
        L49:
            if (r7 < r0) goto L52
            android.view.DisplayCutout r4 = r6.f4194a
            int r4 = c3.a.f(r4)
            goto L53
        L52:
            r4 = r2
        L53:
            if (r7 < r0) goto L5b
            android.view.DisplayCutout r6 = r6.f4194a
            int r2 = c3.a.d(r6)
        L5b:
            b3.a r6 = b3.a.b(r1, r3, r4, r2)
            return r6
        L60:
            b3.a r6 = r5.m()
            return r6
        L65:
            b3.a r6 = r5.i()
            return r6
        L6a:
            b3.a r6 = r5.k()
            return r6
        L6f:
            b3.a[] r6 = r5.f4209d
            if (r6 == 0) goto L79
            int r7 = fb.v0.w(r7)
            r0 = r6[r7]
        L79:
            if (r0 == 0) goto L7c
            return r0
        L7c:
            b3.a r6 = r5.l()
            b3.a r7 = r5.y()
            int r6 = r6.f448d
            int r0 = r7.f448d
            if (r6 <= r0) goto L8f
            b3.a r6 = b3.a.b(r2, r2, r2, r6)
            return r6
        L8f:
            b3.a r6 = r5.f4212g
            if (r6 == 0) goto L111
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L111
            b3.a r6 = r5.f4212g
            int r6 = r6.f448d
            int r7 = r7.f448d
            if (r6 <= r7) goto L111
            b3.a r6 = b3.a.b(r2, r2, r2, r6)
            return r6
        La6:
            if (r7 == 0) goto Lcd
            b3.a r6 = r5.y()
            b3.a r7 = r5.j()
            int r0 = r6.f445a
            int r1 = r7.f445a
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r6.f447c
            int r3 = r7.f447c
            int r1 = java.lang.Math.max(r1, r3)
            int r6 = r6.f448d
            int r7 = r7.f448d
            int r6 = java.lang.Math.max(r6, r7)
            b3.a r6 = b3.a.b(r0, r2, r1, r6)
            return r6
        Lcd:
            int r6 = r5.f4213h
            r6 = r6 & r3
            if (r6 == 0) goto Ld3
            goto L111
        Ld3:
            b3.a r6 = r5.l()
            g3.r0 r7 = r5.f4211f
            if (r7 == 0) goto Le1
            g3.n0 r7 = r7.f4230a
            b3.a r0 = r7.j()
        Le1:
            int r7 = r6.f448d
            if (r0 == 0) goto Leb
            int r0 = r0.f448d
            int r7 = java.lang.Math.min(r7, r0)
        Leb:
            int r0 = r6.f445a
            int r6 = r6.f447c
            b3.a r6 = b3.a.b(r0, r2, r6, r7)
            return r6
        Lf4:
            if (r7 == 0) goto L10b
            b3.a r6 = r5.y()
            int r6 = r6.f446b
            b3.a r7 = r5.l()
            int r7 = r7.f446b
            int r6 = java.lang.Math.max(r6, r7)
            b3.a r6 = b3.a.b(r2, r6, r2, r2)
            return r6
        L10b:
            int r6 = r5.f4213h
            r6 = r6 & 4
            if (r6 == 0) goto L112
        L111:
            return r1
        L112:
            b3.a r6 = r5.l()
            int r6 = r6.f446b
            b3.a r6 = b3.a.b(r2, r6, r2, r2)
            return r6
    }
}
