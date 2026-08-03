package a;

/* JADX INFO: renamed from: a.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0406u8 implements top.mmjz.floatingclouds.plugin.IPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f710a;
    public final java.util.Set<android.view.View> b;

    public C0406u8() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f710a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1.b = r0
            return
    }

    public static final void b(int r4, a.Rc r5, android.view.View r6) {
            int r0 = r6.getId()
            if (r0 != r4) goto L17
            int r0 = r6.getVisibility()
            r1 = 8
            if (r0 == r1) goto L17
            r6.setVisibility(r1)
            int r0 = r5.f248a
            int r0 = r0 + 1
            r5.f248a = r0
        L17:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L33
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L22:
            if (r1 >= r0) goto L33
            android.view.View r2 = r6.getChildAt(r1)
            java.lang.String r3 = "getChildAt(...)"
            a.C0193i9.d(r2, r3)
            b(r4, r5, r2)
            int r1 = r1 + 1
            goto L22
        L33:
            return
    }

    public final void a(android.view.View r6) {
            r5 = this;
            android.content.Context r0 = r6.getContext()
            java.lang.String r1 = "getContext(...)"
            a.C0193i9.d(r0, r1)
            int r1 = r5.f710a
            r2 = -1
            r3 = 1
            if (r1 == r2) goto L12
            int r0 = r5.f710a
            goto L53
        L12:
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "pt"
            java.lang.String r4 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L27
            int r0 = r1.getIdentifier(r2, r4, r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L2c:
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r2 = r0 instanceof a.C0447wd.a
            if (r2 == 0) goto L36
            r0 = r1
        L36:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r5.f710a = r0
            int r0 = r5.f710a
            java.lang.String r1 = "HideSnsGroupIcon: resolved id 'pt' = "
            java.lang.String r0 = a.C0487z.e(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.b(r0)
            int r0 = r5.f710a
        L53:
            if (r0 != 0) goto L56
            goto L7c
        L56:
            a.Rc r1 = new a.Rc
            r1.<init>()
            b(r0, r1, r6)     // Catch: java.lang.Throwable -> L61
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L61
            goto L65
        L61:
            r6 = move-exception
            a.C0465xd.a(r6)
        L65:
            int r6 = r1.f248a
            if (r6 <= 0) goto L7c
            java.lang.String r0 = "HideSnsGroupIcon: hid "
            java.lang.String r1 = " group-icon(s)"
            java.lang.String r6 = a.C0487z.c(r6, r0, r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r3)
            a.C0453x1.b(r6)
        L7c:
            return
    }

    public final void c(android.view.View r3) {
            r2 = this;
            java.util.Set<android.view.View> r0 = r2.b
            boolean r0 = r0.add(r3)
            if (r0 != 0) goto L9
            goto L1c
        L9:
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()     // Catch: java.lang.Throwable -> L18
            a.t8 r1 = new a.t8     // Catch: java.lang.Throwable -> L18
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L18
            r0.addOnGlobalLayoutListener(r1)     // Catch: java.lang.Throwable -> L18
            a.Wf r3 = a.Wf.f330a     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r3 = move-exception
            a.C0465xd.a(r3)
        L1c:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r6) {
            r5 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r6, r0)
            java.lang.String r0 = "=== HideSnsGroupIcon handleHook START ==="
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"
            java.lang.String r2 = "initView"
            a.t r3 = new a.t     // Catch: java.lang.Throwable -> L31
            r4 = 4
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L31
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.e(r6, r0, r2, r3)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L33
            java.lang.String r0 = "HideSnsGroupIcon: hooked SnsCommentDetailUI.initView"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L31
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L31
            goto L40
        L31:
            r0 = move-exception
            goto L43
        L33:
            java.lang.String r0 = "HideSnsGroupIcon: initView not found"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L31
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> L31
        L40:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L31
            goto L47
        L43:
            a.wd$a r0 = a.C0465xd.a(r0)
        L47:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            r2 = 2
            if (r0 == 0) goto L5b
            java.lang.String r3 = "HideSnsGroupIcon hook initView failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.e(r0)
        L5b:
            java.lang.String r0 = "com.tencent.mm.view.recyclerview.WxRecyclerView"
            java.lang.ClassLoader r3 = r6.f136a
            java.lang.Class r0 = a.A1.b(r3, r0)
            if (r0 != 0) goto L73
            java.lang.String r6 = "HideSnsGroupIcon: com.tencent.mm.view.recyclerview.WxRecyclerView not found"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)
            a.C0453x1.e(r6)
            goto Lc8
        L73:
            a.l8 r3 = new a.l8
            r4 = 6
            r3.<init>(r4)
            java.lang.reflect.Method[] r0 = a.A1.f(r0, r3)
            java.lang.Object r0 = a.N1.d0(r0)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L93
            java.lang.String r6 = "HideSnsGroupIcon: setAdapter not found"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)
            a.C0453x1.e(r6)
            goto Lc8
        L93:
            io.github.libxposed.api.XposedInterface$HookBuilder r6 = r6.f(r0)     // Catch: java.lang.Throwable -> Lb0
            a.m2 r0 = new a.m2     // Catch: java.lang.Throwable -> Lb0
            r3 = 4
            r0.<init>(r3, r5)     // Catch: java.lang.Throwable -> Lb0
            r6.intercept(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r6 = "HideSnsGroupIcon: hooked com.tencent.mm.view.recyclerview.WxRecyclerView.setAdapter"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)     // Catch: java.lang.Throwable -> Lb0
            a.C0453x1.b(r6)     // Catch: java.lang.Throwable -> Lb0
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lb0
            goto Lb5
        Lb0:
            r6 = move-exception
            a.wd$a r6 = a.C0465xd.a(r6)
        Lb5:
            java.lang.Throwable r6 = a.C0447wd.a(r6)
            if (r6 == 0) goto Lc8
            java.lang.String r0 = "HideSnsGroupIcon hook setAdapter failed"
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
            a.C0453x1.e(r6)
        Lc8:
            java.lang.String r6 = "=== HideSnsGroupIcon handleHook DONE ==="
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)
            a.C0453x1.b(r6)
            java.lang.String r6 = "detailPage+recyclerView"
            java.lang.String r0 = "F009"
            java.lang.String r1 = "snsGroupIcon"
            a.E8.b(r0, r1, r6)
            return
    }
}
