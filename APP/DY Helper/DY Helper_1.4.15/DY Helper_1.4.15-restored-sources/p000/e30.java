package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class e30 {

    /* JADX INFO: renamed from: α */
    public static final p000.e30 f3390 = null;

    /* JADX INFO: renamed from: β */
    public static volatile boolean f3391;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.CopyOnWriteArrayList f3392 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.lang.ThreadLocal f3393 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.lang.Object f3394 = null;

    /* JADX INFO: renamed from: ζ */
    public static android.view.MotionEvent f3395;

    /* JADX INFO: renamed from: η */
    public static int f3396;

    /* JADX INFO: renamed from: θ */
    public static long f3397;

    /* JADX INFO: renamed from: ι */
    public static long f3398;

    /* JADX INFO: renamed from: κ */
    public static long f3399;

    static {
            e30 r0 = new e30
            r0.<init>()
            p000.e30.f3390 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.e30.f3392 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p000.e30.f3393 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.e30.f3394 = r0
            r0 = -1
            p000.e30.f3396 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m1838(android.app.Activity r3, android.view.MotionEvent r4) {
            java.lang.ThreadLocal r0 = p000.e30.f3393
            java.lang.Object r1 = r0.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.set(r2)
            r3.dispatchTouchEvent(r4)     // Catch: java.lang.Throwable -> L1e
            boolean r3 = p000.ln0.m3626(r1, r2)
            if (r3 == 0) goto L1a
            r0.set(r2)
            return
        L1a:
            r0.remove()
            return
        L1e:
            r3 = move-exception
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r4 = p000.ln0.m3626(r1, r4)
            if (r4 == 0) goto L2d
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r0.set(r4)
            goto L30
        L2d:
            r0.remove()
        L30:
            throw r3
    }

    /* JADX INFO: renamed from: β */
    public final void m1839(java.lang.ClassLoader r8) {
            r7 = this;
            java.lang.String r0 = "Feed 触摸分发器安装失败: "
            r8.getClass()
            boolean r1 = p000.e30.f3391
            if (r1 == 0) goto La
            return
        La:
            monitor-enter(r7)
            boolean r1 = p000.e30.f3391     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L11
            monitor-exit(r7)
            return
        L11:
            r1 = 4
            r2 = 0
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "android.app.Activity"
            java.lang.Class r8 = p000.qe0.m4876(r8, r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r4 = "dispatchTouchEvent"
            f10 r5 = new f10     // Catch: java.lang.Throwable -> L32
            r6 = 14
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r3.m6774(r8, r4, r5)     // Catch: java.lang.Throwable -> L32
            r8 = 1
            p000.e30.f3391 = r8     // Catch: java.lang.Throwable -> L32
            java.lang.String r8 = "FeedTouchEventDispatcher"
            java.lang.String r3 = "Feed 触摸分发器已安装"
            p000.C0888ux.m5988(r8, r3, r2, r1, r2)     // Catch: java.lang.Throwable -> L32
            goto L48
        L32:
            r8 = move-exception
            java.lang.String r3 = "FeedTouchEventDispatcher"
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            r4.append(r8)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L4a
            p000.C0888ux.m5988(r3, r8, r2, r1, r2)     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r7)
            return
        L4a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }
}
