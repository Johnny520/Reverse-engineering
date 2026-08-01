package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nc0 extends defpackage.tc0 {
    public static boolean h;
    public static java.lang.reflect.Method i;
    public static java.lang.Class j;
    public static java.lang.reflect.Field k;
    public static java.lang.reflect.Field l;
    public final android.view.WindowInsets c;
    public defpackage.ep[] d;
    public defpackage.ep e;
    public defpackage.wc0 f;
    public defpackage.ep g;

    public nc0(defpackage.wc0 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.e = r1
            r0.c = r2
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    private defpackage.ep r(int r4, boolean r5) {
            r3 = this;
            ep r0 = defpackage.ep.e
            r1 = 1
        L3:
            r2 = 256(0x100, float:3.59E-43)
            if (r1 > r2) goto L17
            r2 = r4 & r1
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            ep r2 = r3.s(r1, r5)
            ep r0 = defpackage.ep.a(r0, r2)
        L14:
            int r1 = r1 << 1
            goto L3
        L17:
            return r0
    }

    private defpackage.ep t() {
            r1 = this;
            wc0 r0 = r1.f
            if (r0 == 0) goto Lb
            tc0 r0 = r0.a
            ep r0 = r0.h()
            return r0
        Lb:
            ep r0 = defpackage.ep.e
            return r0
    }

    private defpackage.ep u(android.view.View r6) {
            r5 = this;
            java.lang.String r0 = "WindowInsetsCompat"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L63
            boolean r1 = defpackage.nc0.h
            if (r1 != 0) goto Lf
            v()
        Lf:
            java.lang.reflect.Method r1 = defpackage.nc0.i
            r2 = 0
            if (r1 == 0) goto L62
            java.lang.Class r3 = defpackage.nc0.j
            if (r3 == 0) goto L62
            java.lang.reflect.Field r3 = defpackage.nc0.k
            if (r3 != 0) goto L1d
            goto L62
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
            goto L4d
        L30:
            java.lang.reflect.Field r1 = defpackage.nc0.l     // Catch: java.lang.ReflectiveOperationException -> L2e
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.ReflectiveOperationException -> L2e
            java.lang.reflect.Field r1 = defpackage.nc0.k     // Catch: java.lang.ReflectiveOperationException -> L2e
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.ReflectiveOperationException -> L2e
            android.graphics.Rect r6 = (android.graphics.Rect) r6     // Catch: java.lang.ReflectiveOperationException -> L2e
            if (r6 == 0) goto L62
            int r1 = r6.left     // Catch: java.lang.ReflectiveOperationException -> L2e
            int r3 = r6.top     // Catch: java.lang.ReflectiveOperationException -> L2e
            int r4 = r6.right     // Catch: java.lang.ReflectiveOperationException -> L2e
            int r6 = r6.bottom     // Catch: java.lang.ReflectiveOperationException -> L2e
            ep r6 = defpackage.ep.b(r1, r3, r4, r6)     // Catch: java.lang.ReflectiveOperationException -> L2e
            return r6
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to get visible insets. (Reflection error). "
            r1.<init>(r3)
            java.lang.String r3 = r6.getMessage()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1, r6)
        L62:
            return r2
        L63:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
            r6.<init>(r0)
            throw r6
    }

    @android.annotation.SuppressLint({"PrivateApi"})
    private static void v() {
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "getViewRootImpl"
            r3 = 0
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.ReflectiveOperationException -> L35
            defpackage.nc0.i = r1     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.String r1 = "android.view.View$AttachInfo"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L35
            defpackage.nc0.j = r1     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.String r2 = "mVisibleInsets"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L35
            defpackage.nc0.k = r1     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.String r1 = "android.view.ViewRootImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.String r2 = "mAttachInfo"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L35
            defpackage.nc0.l = r1     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.reflect.Field r1 = defpackage.nc0.k     // Catch: java.lang.ReflectiveOperationException -> L35
            r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L35
            java.lang.reflect.Field r1 = defpackage.nc0.l     // Catch: java.lang.ReflectiveOperationException -> L35
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
            defpackage.nc0.h = r0
            return
    }

    @Override // defpackage.tc0
    public void d(android.view.View r1) {
            r0 = this;
            ep r1 = r0.u(r1)
            if (r1 != 0) goto L8
            ep r1 = defpackage.ep.e
        L8:
            r0.w(r1)
            return
    }

    @Override // defpackage.tc0
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = super.equals(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            nc0 r2 = (defpackage.nc0) r2
            ep r0 = r1.g
            ep r2 = r2.g
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
    }

    @Override // defpackage.tc0
    public defpackage.ep f(int r2) {
            r1 = this;
            r0 = 0
            ep r2 = r1.r(r2, r0)
            return r2
    }

    @Override // defpackage.tc0
    public final defpackage.ep j() {
            r4 = this;
            ep r0 = r4.e
            if (r0 != 0) goto L1c
            android.view.WindowInsets r0 = r4.c
            int r1 = r0.getSystemWindowInsetLeft()
            int r2 = r0.getSystemWindowInsetTop()
            int r3 = r0.getSystemWindowInsetRight()
            int r0 = r0.getSystemWindowInsetBottom()
            ep r0 = defpackage.ep.b(r1, r2, r3, r0)
            r4.e = r0
        L1c:
            ep r0 = r4.e
            return r0
    }

    @Override // defpackage.tc0
    public defpackage.wc0 l(int r4, int r5, int r6, int r7) {
            r3 = this;
            android.view.WindowInsets r0 = r3.c
            r1 = 0
            wc0 r0 = defpackage.wc0.g(r1, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L13
            lc0 r1 = new lc0
            r1.<init>(r0)
            goto L22
        L13:
            r2 = 29
            if (r1 < r2) goto L1d
            kc0 r1 = new kc0
            r1.<init>(r0)
            goto L22
        L1d:
            ic0 r1 = new ic0
            r1.<init>(r0)
        L22:
            ep r0 = r3.j()
            ep r0 = defpackage.wc0.e(r0, r4, r5, r6, r7)
            r1.g(r0)
            ep r0 = r3.h()
            ep r4 = defpackage.wc0.e(r0, r4, r5, r6, r7)
            r1.e(r4)
            wc0 r4 = r1.b()
            return r4
    }

    @Override // defpackage.tc0
    public boolean n() {
            r1 = this;
            android.view.WindowInsets r0 = r1.c
            boolean r0 = r0.isRound()
            return r0
    }

    @Override // defpackage.tc0
    public void o(defpackage.ep[] r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // defpackage.tc0
    public void p(defpackage.wc0 r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public defpackage.ep s(int r6, boolean r7) {
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 == r0) goto Lef
            r0 = 2
            r2 = 0
            if (r6 == r0) goto La7
            r7 = 8
            ep r0 = defpackage.ep.e
            if (r6 == r7) goto L6f
            r7 = 16
            if (r6 == r7) goto L6a
            r7 = 32
            if (r6 == r7) goto L65
            r7 = 64
            if (r6 == r7) goto L60
            r7 = 128(0x80, float:1.8E-43)
            if (r6 == r7) goto L1f
            return r0
        L1f:
            wc0 r6 = r5.f
            if (r6 == 0) goto L2a
            tc0 r6 = r6.a
            yg r6 = r6.e()
            goto L2e
        L2a:
            yg r6 = r5.e()
        L2e:
            if (r6 == 0) goto L5f
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r7 < r0) goto L3d
            android.view.DisplayCutout r2 = r6.a
            int r2 = defpackage.xg.d(r2)
            goto L3e
        L3d:
            r2 = r1
        L3e:
            if (r7 < r0) goto L47
            android.view.DisplayCutout r3 = r6.a
            int r3 = defpackage.xg.f(r3)
            goto L48
        L47:
            r3 = r1
        L48:
            if (r7 < r0) goto L51
            android.view.DisplayCutout r4 = r6.a
            int r4 = defpackage.xg.e(r4)
            goto L52
        L51:
            r4 = r1
        L52:
            if (r7 < r0) goto L5a
            android.view.DisplayCutout r6 = r6.a
            int r1 = defpackage.xg.c(r6)
        L5a:
            ep r6 = defpackage.ep.b(r2, r3, r4, r1)
            return r6
        L5f:
            return r0
        L60:
            ep r6 = r5.k()
            return r6
        L65:
            ep r6 = r5.g()
            return r6
        L6a:
            ep r6 = r5.i()
            return r6
        L6f:
            ep[] r6 = r5.d
            if (r6 == 0) goto L79
            int r7 = defpackage.ct.q(r7)
            r2 = r6[r7]
        L79:
            if (r2 == 0) goto L7c
            return r2
        L7c:
            ep r6 = r5.j()
            ep r7 = r5.t()
            int r6 = r6.d
            int r2 = r7.d
            if (r6 <= r2) goto L8f
            ep r6 = defpackage.ep.b(r1, r1, r1, r6)
            return r6
        L8f:
            ep r6 = r5.g
            if (r6 == 0) goto La6
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto La6
            ep r6 = r5.g
            int r6 = r6.d
            int r7 = r7.d
            if (r6 <= r7) goto La6
            ep r6 = defpackage.ep.b(r1, r1, r1, r6)
            return r6
        La6:
            return r0
        La7:
            if (r7 == 0) goto Lce
            ep r6 = r5.t()
            ep r7 = r5.h()
            int r0 = r6.a
            int r2 = r7.a
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r6.c
            int r3 = r7.c
            int r2 = java.lang.Math.max(r2, r3)
            int r6 = r6.d
            int r7 = r7.d
            int r6 = java.lang.Math.max(r6, r7)
            ep r6 = defpackage.ep.b(r0, r1, r2, r6)
            return r6
        Lce:
            ep r6 = r5.j()
            wc0 r7 = r5.f
            if (r7 == 0) goto Ldc
            tc0 r7 = r7.a
            ep r2 = r7.h()
        Ldc:
            int r7 = r6.d
            if (r2 == 0) goto Le6
            int r0 = r2.d
            int r7 = java.lang.Math.min(r7, r0)
        Le6:
            int r0 = r6.a
            int r6 = r6.c
            ep r6 = defpackage.ep.b(r0, r1, r6, r7)
            return r6
        Lef:
            if (r7 == 0) goto L106
            ep r6 = r5.t()
            int r6 = r6.b
            ep r7 = r5.j()
            int r7 = r7.b
            int r6 = java.lang.Math.max(r6, r7)
            ep r6 = defpackage.ep.b(r1, r6, r1, r1)
            return r6
        L106:
            ep r6 = r5.j()
            int r6 = r6.b
            ep r6 = defpackage.ep.b(r1, r6, r1, r1)
            return r6
    }

    public void w(defpackage.ep r1) {
            r0 = this;
            r0.g = r1
            return
    }
}
