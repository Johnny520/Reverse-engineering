package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3044h;

    public /* synthetic */ e(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f3043g = r2
            r0.f3044h = r1
            r0.<init>()
            return
    }

    private final void a(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r5) {
            r4 = this;
            int r0 = r4.f3043g
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            r5.getClass()
            java.lang.Object r0 = r4.f3044h
            u9.h r0 = (u9.h) r0
            java.util.Map r0 = r0.f13560i
            r0.getClass()
            java.lang.Object r1 = r4.f3044h
            u9.h r1 = (u9.h) r1
            monitor-enter(r0)
            java.util.Map r1 = r1.f13560i     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L5a
            u9.a r1 = (u9.a) r1     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r0)
            if (r1 == 0) goto L59
            android.view.View r0 = r5.getRootView()
            r0.getClass()
            r1.f13536a = r0
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            boolean r2 = r0.isAlive()
            if (r2 == 0) goto L3a
            u9.e r2 = r1.f13537b
            r0.addOnPreDrawListener(r2)
        L3a:
            java.lang.Object r0 = r4.f3044h
            u9.h r0 = (u9.h) r0
            android.content.SharedPreferences r0 = r0.f13556e
            java.lang.String r2 = "hide_wechat_bottom_bar_enable"
            r3 = 0
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 == 0) goto L59
            java.lang.Object r0 = r4.f3044h
            u9.h r0 = (u9.h) r0
            r0.e(r5)
            java.lang.Object r5 = r4.f3044h
            u9.h r5 = (u9.h) r5
            android.view.View r0 = r1.f13536a
            r5.b(r0)
        L59:
            return
        L5a:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L5d:
            java.lang.Object r0 = r4.f3044h
            f1.f r0 = (f1.f) r0
            android.content.Context r5 = r5.getContext()
            boolean r1 = r0.f3051d
            if (r1 != 0) goto L75
            android.content.Context r5 = r5.getApplicationContext()
            f1.d r1 = r0.f3053f
            r5.registerComponentCallbacks(r1)
            r5 = 1
            r0.f3051d = r5
        L75:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r4) {
            r3 = this;
            int r0 = r3.f3043g
            switch(r0) {
                case 0: goto L42;
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            r4.removeOnAttachStateChangeListener(r3)
            java.lang.Object r4 = r3.f3044h
            qg.e1 r4 = (qg.e1) r4
            r0 = 0
            r4.a(r0)
            return
        L11:
            r4.getClass()
            java.lang.Object r0 = r3.f3044h
            u9.h r0 = (u9.h) r0
            java.util.Map r0 = r0.f13560i
            r0.getClass()
            java.lang.Object r1 = r3.f3044h
            u9.h r1 = (u9.h) r1
            monitor-enter(r0)
            java.util.Map r1 = r1.f13560i     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L3f
            u9.a r4 = (u9.a) r4     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)
            if (r4 == 0) goto L3e
            android.view.View r0 = r4.f13536a
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            boolean r1 = r0.isAlive()
            if (r1 == 0) goto L3e
            u9.e r4 = r4.f13537b
            r0.removeOnPreDrawListener(r4)
        L3e:
            return
        L3f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L42:
            java.lang.Object r0 = r3.f3044h
            f1.f r0 = (f1.f) r0
            android.content.Context r4 = r4.getContext()
            boolean r1 = r0.f3051d
            if (r1 == 0) goto L5a
            android.content.Context r4 = r4.getApplicationContext()
            f1.d r1 = r0.f3053f
            r4.unregisterComponentCallbacks(r1)
            r4 = 0
            r0.f3051d = r4
        L5a:
            b.e r4 = r0.f3052e
            r1 = 0
            if (r4 == 0) goto L72
            monitor-enter(r4)
            java.lang.Object r2 = r4.f332h     // Catch: java.lang.Throwable -> L6a
            f.k0 r2 = (f.k0) r2     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L6c
            r2.a()     // Catch: java.lang.Throwable -> L6a
            goto L6c
        L6a:
            r0 = move-exception
            goto L70
        L6c:
            r4.f333i = r1     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r4)
            goto L72
        L70:
            monitor-exit(r4)
            throw r0
        L72:
            r0.f3052e = r1
            return
    }
}
