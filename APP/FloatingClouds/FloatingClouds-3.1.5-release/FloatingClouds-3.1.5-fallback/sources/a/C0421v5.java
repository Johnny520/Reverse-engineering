package a;

/* JADX INFO: renamed from: a.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0421v5 implements top.mmjz.floatingclouds.plugin.IPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f732a;
    public final java.util.LinkedHashSet b;
    public volatile android.view.View c;
    public final android.os.Handler d;
    public volatile java.lang.Runnable e;
    public volatile int f;
    public volatile long g;

    public C0421v5() {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.b = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.d = r0
            return
    }

    public static void a(android.view.View r4, java.util.ArrayList r5, int r6) {
            boolean r0 = r4 instanceof android.widget.ImageView
            if (r0 == 0) goto L23
            r0 = 2
            int[] r0 = new int[r0]
            r4.getLocationInWindow(r0)
            r1 = 1
            r0 = r0[r1]
            if (r0 < 0) goto L23
            if (r0 > r6) goto L23
            r0 = r4
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            int r0 = r0.getWidth()
            r1 = 20
            if (r1 > r0) goto L23
            r1 = 101(0x65, float:1.42E-43)
            if (r0 >= r1) goto L23
            r5.add(r4)
        L23:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L3f
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L2e:
            if (r1 >= r0) goto L3f
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "getChildAt(...)"
            a.C0193i9.d(r2, r3)
            a(r2, r5, r6)
            int r1 = r1 + 1
            goto L2e
        L3f:
            return
    }

    public static int b(android.content.Context r0, int r1) {
            float r1 = (float) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static android.view.View d(android.widget.FrameLayout r6) {
            android.content.Context r0 = r6.getContext()
            java.lang.String r1 = "getContext(...)"
            a.C0193i9.d(r0, r1)
            android.content.res.Resources r2 = r0.getResources()
            java.lang.String r3 = "status_bar_height"
            java.lang.String r4 = "dimen"
            java.lang.String r5 = "android"
            int r2 = r2.getIdentifier(r3, r4, r5)
            r3 = 0
            if (r2 <= 0) goto L23
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getDimensionPixelSize(r2)
            goto L24
        L23:
            r0 = r3
        L24:
            android.content.Context r2 = r6.getContext()
            a.C0193i9.d(r2, r1)
            r1 = 56
            int r1 = b(r2, r1)
            int r1 = r1 + r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            a(r6, r0, r1)
            int r6 = r0.size()
            r1 = 2
            if (r6 < r1) goto L4d
            int r6 = r0.size()
            int r6 = r6 - r1
            java.lang.Object r6 = r0.get(r6)
        L4a:
            android.view.View r6 = (android.view.View) r6
            return r6
        L4d:
            int r6 = r0.size()
            r1 = 1
            if (r6 != r1) goto L59
            java.lang.Object r6 = r0.get(r3)
            goto L4a
        L59:
            r6 = 0
            return r6
    }

    public static int e(android.content.Context r3) {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            int r0 = r0.I
            r1 = 20
            r2 = 200(0xc8, float:2.8E-43)
            int r0 = a.Oc.C(r0, r1, r2)
            int r0 = r0 * 8
            int r0 = r0 / 100
            r1 = 4
            if (r0 >= r1) goto L1b
            r0 = r1
        L1b:
            int r3 = b(r3, r0)
            return r3
    }

    public static boolean f() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L15
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.H
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final void c(android.app.Activity r11) {
            r10 = this;
            android.view.View r0 = r10.c
            if (r0 == 0) goto L11
            android.view.View r0 = r10.c
            a.C0193i9.b(r0)
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L11
            goto Lc0
        L11:
            r0 = 1
            android.view.Window r1 = r11.getWindow()     // Catch: java.lang.Throwable -> L21
            android.view.View r1 = r1.getDecorView()     // Catch: java.lang.Throwable -> L21
            boolean r2 = r1 instanceof android.widget.FrameLayout     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L24
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r11 = move-exception
            goto La1
        L24:
            r1 = 0
        L25:
            if (r1 != 0) goto L29
            goto Lc0
        L29:
            android.view.View r2 = d(r1)     // Catch: java.lang.Throwable -> L21
            if (r2 != 0) goto L31
            goto Lc0
        L31:
            r3 = 2
            int[] r4 = new int[r3]     // Catch: java.lang.Throwable -> L21
            r2.getLocationOnScreen(r4)     // Catch: java.lang.Throwable -> L21
            int[] r5 = new int[r3]     // Catch: java.lang.Throwable -> L21
            r1.getLocationOnScreen(r5)     // Catch: java.lang.Throwable -> L21
            r6 = 0
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L21
            r6 = r5[r6]     // Catch: java.lang.Throwable -> L21
            int r7 = r7 - r6
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L21
            r5 = r5[r0]     // Catch: java.lang.Throwable -> L21
            int r4 = r4 - r5
            int r5 = e(r11)     // Catch: java.lang.Throwable -> L21
            android.content.res.Resources r6 = r11.getResources()     // Catch: java.lang.Throwable -> L21
            android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> L21
            int r6 = r6.uiMode     // Catch: java.lang.Throwable -> L21
            r6 = r6 & 48
            r8 = 32
            if (r6 != r8) goto L62
            java.lang.String r6 = "#FF6B6B"
        L5d:
            int r6 = android.graphics.Color.parseColor(r6)     // Catch: java.lang.Throwable -> L21
            goto L65
        L62:
            java.lang.String r6 = "#FA5151"
            goto L5d
        L65:
            android.view.View r8 = new android.view.View     // Catch: java.lang.Throwable -> L21
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L21
            java.lang.String r9 = "fc_dot_indicator"
            r8.setTag(r9)     // Catch: java.lang.Throwable -> L21
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> L21
            r9.<init>()     // Catch: java.lang.Throwable -> L21
            r9.setShape(r0)     // Catch: java.lang.Throwable -> L21
            r9.setColor(r6)     // Catch: java.lang.Throwable -> L21
            r8.setBackground(r9)     // Catch: java.lang.Throwable -> L21
            r6 = 8
            r8.setVisibility(r6)     // Catch: java.lang.Throwable -> L21
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L21
            r6.<init>(r5, r5)     // Catch: java.lang.Throwable -> L21
            int r7 = r7 - r5
            r9 = 4
            int r11 = b(r11, r9)     // Catch: java.lang.Throwable -> L21
            int r7 = r7 - r11
            r6.leftMargin = r7     // Catch: java.lang.Throwable -> L21
            int r11 = r2.getHeight()     // Catch: java.lang.Throwable -> L21
            int r11 = r11 - r5
            int r11 = r11 / r3
            int r4 = r4 + r11
            r6.topMargin = r4     // Catch: java.lang.Throwable -> L21
            r1.addView(r8, r6)     // Catch: java.lang.Throwable -> L21
            r10.c = r8     // Catch: java.lang.Throwable -> L21
            a.Wf r11 = a.Wf.f330a     // Catch: java.lang.Throwable -> L21
            goto La5
        La1:
            a.wd$a r11 = a.C0465xd.a(r11)
        La5:
            java.lang.Throwable r11 = a.C0447wd.a(r11)
            if (r11 == 0) goto Lc0
            java.lang.String r11 = r11.getMessage()
            java.lang.String r1 = "DotIndicator: ensureDotView fail: "
            java.lang.String r11 = a.C0487z.k(r1, r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r0)
            a.C0453x1.a(r11)
        Lc0:
            return
    }

    public final void g(java.lang.String r7) {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.g
            long r2 = r0 - r2
            r4 = 30000(0x7530, double:1.4822E-319)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto Lf
            return
        Lf:
            r6.g = r0
            java.lang.String r0 = "DotIndicator: syncFromDb skip: "
            java.lang.String r7 = a.C0487z.k(r0, r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            a.C0282n9.B(r7)
            return
    }

    public final void h() {
            r4 = this;
            boolean r0 = f()
            if (r0 == 0) goto L43
            boolean r0 = r4.f732a
            if (r0 != 0) goto Lb
            goto L43
        Lb:
            r4.l()
            java.util.LinkedHashSet r0 = r4.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2b
            r4.k()
            r4.j()
            java.lang.String r0 = "DotIndicator: read-report recheck: all read, dot hidden"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            return
        L2b:
            r4.k()
            r4.j()
            r0 = 0
            r4.f = r0
            a.u5 r0 = new a.u5
            r1 = 1
            r0.<init>(r4, r1)
            r4.e = r0
            android.os.Handler r1 = r4.d
            r2 = 400(0x190, double:1.976E-321)
            r1.postDelayed(r0, r2)
        L43:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r10) {
            r9 = this;
            r0 = 1
            java.lang.String r1 = "F026"
            java.lang.String r2 = "com.tencent.mm.ui.LauncherUI"
            java.lang.String r3 = "session"
            a.C0193i9.e(r10, r3)
            a.j2 r3 = new a.j2
            r4 = 2
            r3.<init>(r4, r9)
            a.C0086ca.b(r3)
            java.lang.String r3 = "onResume"
            r5 = 0
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L40
            a.q5 r6 = new a.q5     // Catch: java.lang.Throwable -> L40
            r6.<init>(r9, r0)     // Catch: java.lang.Throwable -> L40
            a.J8.a(r10, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "onCreate"
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Throwable -> L40
            a.q5 r6 = new a.q5     // Catch: java.lang.Throwable -> L40
            r6.<init>(r9, r4)     // Catch: java.lang.Throwable -> L40
            a.J8.a(r10, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "DotIndicator: hooked LauncherUI.onResume + onCreate"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L40
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)     // Catch: java.lang.Throwable -> L40
            a.C0453x1.b(r2)     // Catch: java.lang.Throwable -> L40
            a.Wf r2 = a.Wf.f330a     // Catch: java.lang.Throwable -> L40
            goto L45
        L40:
            r2 = move-exception
            a.wd$a r2 = a.C0465xd.a(r2)
        L45:
            java.lang.Throwable r2 = a.C0447wd.a(r2)
            if (r2 == 0) goto L60
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "DotIndicator: hookLauncherResume fail: "
            java.lang.String r2 = a.C0487z.k(r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            a.C0453x1.a(r2)
        L60:
            java.lang.String r2 = "."
            a.Pc r3 = a.Pc.f211a     // Catch: java.lang.Throwable -> L81
            java.lang.ClassLoader r4 = r10.f136a     // Catch: java.lang.Throwable -> L81
            r3.getClass()     // Catch: java.lang.Throwable -> L81
            java.util.List r3 = a.Pc.a(r4)     // Catch: java.lang.Throwable -> L81
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L84
            java.lang.String r4 = "DotIndicator: read-report locator empty, polling-only mode"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L81
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.Throwable -> L81
            a.C0453x1.b(r4)     // Catch: java.lang.Throwable -> L81
            goto L84
        L81:
            r10 = move-exception
            goto L10a
        L84:
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L81
        L88:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto Lf1
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L81
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L81
            a.q5 r5 = new a.q5     // Catch: java.lang.Throwable -> L81
            r6 = 3
            r5.<init>(r9, r6)     // Catch: java.lang.Throwable -> L81
            a.J8.h(r10, r1, r4, r5)     // Catch: java.lang.Throwable -> L81
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r5 = a.E8.f71a     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = "readReport"
            java.lang.Class r6 = r4.getDeclaringClass()     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = r4.getName()     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r8.<init>()     // Catch: java.lang.Throwable -> L81
            r8.append(r6)     // Catch: java.lang.Throwable -> L81
            r8.append(r2)     // Catch: java.lang.Throwable -> L81
            r8.append(r7)     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L81
            a.E8.b(r1, r5, r6)     // Catch: java.lang.Throwable -> L81
            java.lang.Class r5 = r4.getDeclaringClass()     // Catch: java.lang.Throwable -> L81
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r6.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r7 = "DotIndicator: hooked read-report trigger "
            r6.append(r7)     // Catch: java.lang.Throwable -> L81
            r6.append(r5)     // Catch: java.lang.Throwable -> L81
            r6.append(r2)     // Catch: java.lang.Throwable -> L81
            r6.append(r4)     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L81
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L81
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.Throwable -> L81
            a.C0453x1.b(r4)     // Catch: java.lang.Throwable -> L81
            goto L88
        Lf1:
            java.lang.Thread r1 = new java.lang.Thread     // Catch: java.lang.Throwable -> L81
            a.P0 r2 = new a.P0     // Catch: java.lang.Throwable -> L81
            r3 = 5
            r2.<init>(r9, r3, r10)     // Catch: java.lang.Throwable -> L81
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r10 = "ReadReportStorageHook"
            r1.setName(r10)     // Catch: java.lang.Throwable -> L81
            r1.setDaemon(r0)     // Catch: java.lang.Throwable -> L81
            r1.start()     // Catch: java.lang.Throwable -> L81
            a.Wf r10 = a.Wf.f330a     // Catch: java.lang.Throwable -> L81
            goto L10e
        L10a:
            a.wd$a r10 = a.C0465xd.a(r10)
        L10e:
            java.lang.Throwable r10 = a.C0447wd.a(r10)
            if (r10 == 0) goto L129
            java.lang.String r10 = r10.getMessage()
            java.lang.String r1 = "DotIndicator: hookReadReport fail: "
            java.lang.String r10 = a.C0487z.k(r1, r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r0)
            a.C0453x1.a(r10)
        L129:
            java.lang.String r10 = "DotIndicator: handleHook DONE (event-bus mode)"
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r0)
            a.C0453x1.b(r10)
            return
    }

    public final void i() {
            r4 = this;
            r4.j()
            r0 = 0
            r4.f = r0
            a.u5 r0 = new a.u5
            r1 = 0
            r0.<init>(r4, r1)
            r4.e = r0
            android.os.Handler r1 = r4.d
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.postDelayed(r0, r2)
            return
    }

    public final void j() {
            r2 = this;
            java.lang.Runnable r0 = r2.e
            if (r0 == 0) goto L9
            android.os.Handler r1 = r2.d
            r1.removeCallbacks(r0)
        L9:
            r0 = 0
            r2.e = r0
            return
    }

    public final void k() {
            r4 = this;
            java.util.LinkedHashSet r0 = r4.b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            boolean r0 = f()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            boolean r1 = r4.f732a
            if (r0 != r1) goto L16
            goto L1c
        L16:
            r4.f732a = r0
            android.view.View r1 = r4.c
            if (r1 != 0) goto L1d
        L1c:
            return
        L1d:
            a.m4 r2 = new a.m4
            r3 = 1
            r2.<init>(r1, r0, r4, r3)
            r1.post(r2)
            return
    }

    public final void l() {
            r9 = this;
            a.K3$a r0 = a.K3.f148a     // Catch: java.lang.Throwable -> L15
            r0.getClass()     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r0 = a.K3.a.f()     // Catch: java.lang.Throwable -> L15
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L18
            java.util.LinkedHashSet r0 = r9.b     // Catch: java.lang.Throwable -> L15
            r0.clear()     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            goto L16c
        L18:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r2 = 10
            int r2 = a.C0312p3.g0(r0, r2)     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L15
        L27:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L15
            top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = r2.getMaskId()     // Catch: java.lang.Throwable -> L15
            r1.add(r2)     // Catch: java.lang.Throwable -> L15
            goto L27
        L3b:
            java.util.Set r0 = a.C0383t3.A0(r1)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> r1 = a.xh.f764a     // Catch: java.lang.Throwable -> L15
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "<get-entries>(...)"
            a.C0193i9.d(r1, r2)     // Catch: java.lang.Throwable -> L15
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L15
        L4e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L15
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L71
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L15
            r5 = r2
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L15
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = "<get-key>(...)"
            a.C0193i9.d(r5, r6)     // Catch: java.lang.Throwable -> L15
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = "EnMicroMsg"
            boolean r5 = a.Be.I(r5, r6, r3)     // Catch: java.lang.Throwable -> L15
            if (r5 == 0) goto L4e
            goto L72
        L71:
            r2 = r4
        L72:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L80
            java.lang.Object r1 = r2.getValue()     // Catch: java.lang.Throwable -> L15
            a.G4 r1 = (a.G4) r1     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L80
            java.lang.Object r4 = r1.f96a     // Catch: java.lang.Throwable -> L15
        L80:
            java.lang.String r1 = ")"
            if (r4 != 0) goto La2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> r0 = a.xh.f764a     // Catch: java.lang.Throwable -> L15
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "EnMicroMsg not in Store (size="
            r2.append(r3)     // Catch: java.lang.Throwable -> L15
            r2.append(r0)     // Catch: java.lang.Throwable -> L15
            r2.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L15
            r9.g(r0)     // Catch: java.lang.Throwable -> L15
            return
        La2:
            java.lang.String r2 = ","
            a.g2 r5 = new a.g2     // Catch: java.lang.Throwable -> L15
            r6 = 14
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L15
            r6 = 30
            java.lang.String r2 = a.C0383t3.p0(r0, r2, r5, r6)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> r5 = a.xh.f764a     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r5.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = "SELECT username, unReadCount FROM rconversation WHERE username IN ("
            r5.append(r6)     // Catch: java.lang.Throwable -> L15
            r5.append(r2)     // Catch: java.lang.Throwable -> L15
            r5.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L15
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L15
            java.lang.Object[] r0 = r0.toArray(r5)     // Catch: java.lang.Throwable -> L15
            android.database.Cursor r0 = a.xh.a.a(r4, r2, r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto Ld9
            java.lang.String r0 = "rawQuery returned null"
            r9.g(r0)     // Catch: java.lang.Throwable -> L15
            return
        Ld9:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = "username"
            int r4 = r0.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L10b
            int r5 = r0.getColumnCount()     // Catch: java.lang.Throwable -> L10b
            r6 = r3
        Le9:
            if (r6 >= r5) goto L10d
            java.lang.String r7 = r0.getColumnName(r6)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r8 = "getColumnName(...)"
            a.C0193i9.d(r7, r8)     // Catch: java.lang.Throwable -> L10b
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L10b
            java.lang.String r7 = r7.toLowerCase(r8)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r8 = "toLowerCase(...)"
            a.C0193i9.d(r7, r8)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r8 = "unread"
            boolean r7 = a.Be.I(r7, r8, r3)     // Catch: java.lang.Throwable -> L10b
            if (r7 == 0) goto L108
            goto L10e
        L108:
            int r6 = r6 + 1
            goto Le9
        L10b:
            r1 = move-exception
            goto L166
        L10d:
            r6 = -1
        L10e:
            if (r4 < 0) goto L143
            if (r6 >= 0) goto L113
            goto L143
        L113:
            boolean r1 = r0.moveToNext()     // Catch: java.lang.Throwable -> L10b
            if (r1 == 0) goto L12a
            java.lang.String r1 = r0.getString(r4)     // Catch: java.lang.Throwable -> L10b
            if (r1 != 0) goto L120
            goto L113
        L120:
            int r3 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L10b
            if (r3 <= 0) goto L113
            r2.add(r1)     // Catch: java.lang.Throwable -> L10b
            goto L113
        L12a:
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> L10b
            r0.close()     // Catch: java.lang.Throwable -> L15
            r0 = 0
            r9.g = r0     // Catch: java.lang.Throwable -> L15
            java.util.LinkedHashSet r0 = r9.b     // Catch: java.lang.Throwable -> L15
            r0.clear()     // Catch: java.lang.Throwable -> L15
            java.util.LinkedHashSet r0 = r9.b     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.addAll(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L15
            goto L170
        L143:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10b
            r2.<init>()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = "column not found (user="
            r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            r2.append(r4)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = " unread="
            r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            r2.append(r6)     // Catch: java.lang.Throwable -> L10b
            r2.append(r1)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L10b
            r9.g(r1)     // Catch: java.lang.Throwable -> L10b
            r0.close()     // Catch: java.lang.Throwable -> L15
            return
        L166:
            throw r1     // Catch: java.lang.Throwable -> L167
        L167:
            r2 = move-exception
            a.C0435w1.e(r0, r1)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L16c:
            a.wd$a r0 = a.C0465xd.a(r0)
        L170:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L181
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L17e
            java.lang.String r0 = "unknown"
        L17e:
            r9.g(r0)
        L181:
            return
    }
}
