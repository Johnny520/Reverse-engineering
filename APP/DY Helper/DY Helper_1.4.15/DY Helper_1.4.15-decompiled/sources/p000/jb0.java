package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class jb0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f5399 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f5400 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f5401 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f5402 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.ScheduledExecutorService f5403 = null;

    /* JADX INFO: renamed from: ζ */
    public static volatile java.lang.ClassLoader f5404;

    /* JADX INFO: renamed from: η */
    public static int f5405;

    /* JADX INFO: renamed from: θ */
    public static int f5406;

    /* JADX INFO: renamed from: ι */
    public static java.util.concurrent.ScheduledFuture f5407;

    /* JADX INFO: renamed from: κ */
    public static final p000.s20 f5408 = null;

    /* JADX INFO: renamed from: λ */
    public static final p000.ib0 f5409 = null;

    /* JADX INFO: renamed from: μ */
    public static final java.util.Set f5410 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.jb0.f5399 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.jb0.f5400 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.jb0.f5401 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.jb0.f5402 = r0
            aj r0 = new aj
            r1 = 6
            r0.<init>(r1)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            p000.jb0.f5403 = r0
            s20 r0 = new s20
            r1 = 25
            r0.<init>(r1)
            p000.jb0.f5408 = r0
            ib0 r0 = new ib0
            r0.<init>()
            p000.jb0.f5409 = r0
            java.lang.String r0 = "group_apply_auto_approval_polling_enabled"
            java.lang.String r1 = "group_apply_auto_approval_interval_seconds"
            java.lang.String r2 = "group_apply_auto_approval_cold_start_enabled"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.jb0.f5410 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m2919(android.app.Activity r2) {
            java.lang.Class r2 = r2.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            if (r2 != 0) goto Lc
            java.lang.ClassLoader r2 = p000.jb0.f5404
        Lc:
            p000.jb0.f5404 = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.jb0.f5400
            r0 = 1
            r2.set(r0)
            java.util.concurrent.ScheduledExecutorService r2 = p000.jb0.f5403
            s0 r0 = new s0
            r1 = 28
            r0.<init>(r1)
            r2.execute(r0)
            return
    }

    /* JADX INFO: renamed from: β */
    public static boolean m2920() {
            boolean r0 = p000.ui1.m5867()
            if (r0 == 0) goto L1a
            boolean r0 = p000.AbstractC0976x9.m6525()
            if (r0 == 0) goto L1a
            java.lang.ClassLoader r0 = p000.jb0.f5404
            if (r0 == 0) goto L1a
            java.util.concurrent.atomic.AtomicReference r0 = p000.ry1.f9578
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m2921(p000.hb0 r2) {
            int r2 = r2.ordinal()
            if (r2 == 0) goto L11
            r0 = 1
            if (r2 != r0) goto Lc
            java.lang.String r2 = "group_apply_auto_approval_polling_enabled"
            goto L13
        Lc:
            p000.C1080.m7272()
            r2 = 0
            return r2
        L11:
            java.lang.String r2 = "group_apply_auto_approval_cold_start_enabled"
        L13:
            r0 = 0
            boolean r2 = p000.ui1.m5887(r2, r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
            r2 = r0
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r2 instanceof p000.eo1
            if (r1 == 0) goto L2b
            r2 = r0
        L2b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m2922(p000.hb0 r1) {
            int r1 = r1.ordinal()
            if (r1 == 0) goto L11
            r0 = 1
            if (r1 != r0) goto Lc
            java.lang.String r1 = "轮询"
            return r1
        Lc:
            p000.C1080.m7272()
            r1 = 0
            return r1
        L11:
            java.lang.String r1 = "冷启动"
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m2923(p000.hb0 r4) {
            boolean r0 = m2920()
            if (r0 == 0) goto L31
            boolean r0 = m2921(r4)
            if (r0 != 0) goto Ld
            goto L31
        Ld:
            java.lang.ClassLoader r0 = p000.jb0.f5404
            if (r0 != 0) goto L12
            goto L31
        L12:
            java.lang.Object r1 = p000.ui1.f10844
            long r1 = p000.ui1.f10851
            gx r3 = new gx
            r3.<init>(r0, r4, r1)
            boolean r0 = p000.jc0.m2927(r3)
            if (r0 != 0) goto L30
            java.lang.String r4 = m2922(r4)
            java.lang.String r1 = "审批跳过：群申请任务正在其他入口执行"
            java.lang.String r4 = r4.concat(r1)
            java.lang.String r1 = "rb22c2f83ae9ef877"
            p000.C0888ux.m5975(r1, r4)
        L30:
            return r0
        L31:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ζ */
    public static void m2924(long r4) {
            hb0 r0 = p000.hb0.f4674
            boolean r0 = m2921(r0)
            if (r0 == 0) goto L31
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jb0.f5401
            boolean r0 = r0.get()
            if (r0 == 0) goto L11
            goto L31
        L11:
            r0 = 0
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.jb0.f5402
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L1c
            goto L31
        L1c:
            s0 r0 = new s0
            r1 = 29
            r0.<init>(r1)
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L2a
            r4 = r1
        L2a:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ScheduledExecutorService r2 = p000.jb0.f5403
            r2.schedule(r0, r4, r1)
        L31:
            return
    }

    /* JADX INFO: renamed from: η */
    public static void m2925() {
            hb0 r0 = p000.hb0.f4675
            boolean r0 = m2921(r0)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L16
            java.util.concurrent.ScheduledFuture r0 = p000.jb0.f5407
            if (r0 == 0) goto L11
            r0.cancel(r1)
        L11:
            p000.jb0.f5407 = r2
            p000.jb0.f5406 = r1
            return
        L16:
            r3 = 60
            java.lang.String r0 = "group_apply_auto_approval_interval_seconds"
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L23
            int r0 = r4.getInt(r0, r3)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r0 = r3
        L24:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L29
            goto L30
        L29:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L30:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L39
            r0 = r3
        L39:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3 = 10
            r4 = 3600(0xe10, float:5.045E-42)
            int r0 = p000.j81.m2906(r0, r3, r4)
            java.util.concurrent.ScheduledFuture r3 = p000.jb0.f5407
            if (r3 == 0) goto L56
            boolean r3 = r3.isCancelled()
            if (r3 != 0) goto L56
            int r3 = p000.jb0.f5406
            if (r3 != r0) goto L56
            return
        L56:
            java.util.concurrent.ScheduledFuture r3 = p000.jb0.f5407
            if (r3 == 0) goto L5d
            r3.cancel(r1)
        L5d:
            p000.jb0.f5407 = r2
            p000.jb0.f5406 = r0
            fb0 r5 = new fb0
            r1 = 0
            r5.<init>(r1)
            long r6 = (long) r0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ScheduledExecutorService r4 = p000.jb0.f5403
            r8 = r6
            java.util.concurrent.ScheduledFuture r1 = r4.scheduleWithFixedDelay(r5, r6, r8, r10)
            p000.jb0.f5407 = r1
            java.lang.String r1 = "轮询自动审批已启用，间隔="
            java.lang.String r3 = "s"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r0, r3)
            r1 = 4
            java.lang.String r3 = "rb22c2f83ae9ef877"
            p000.C0888ux.m5988(r3, r0, r2, r1, r2)
            return
    }
}
