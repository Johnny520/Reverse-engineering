package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class dd1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicReference f3093 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ScheduledThreadPoolExecutor f3094 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.lang.Object f3095 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicInteger f3096 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicBoolean f3097 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.atomic.AtomicLong f3098 = null;

    /* JADX INFO: renamed from: η */
    public static java.util.concurrent.ScheduledFuture f3099;

    /* JADX INFO: renamed from: θ */
    public static long f3100;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            p000.dd1.f3093 = r0
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = new java.util.concurrent.ScheduledThreadPoolExecutor
            aj r1 = new aj
            r2 = 14
            r1.<init>(r2)
            r2 = 1
            r0.<init>(r2, r1)
            r0.setRemoveOnCancelPolicy(r2)
            p000.dd1.f3094 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.dd1.f3095 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            p000.dd1.f3096 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.dd1.f3097 = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            p000.dd1.f3098 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m1712() {
            java.lang.Object r0 = p000.dd1.f3095
            monitor-enter(r0)
            java.util.concurrent.ScheduledFuture r1 = p000.dd1.f3099     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Le
            r2 = 0
            r1.cancel(r2)     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r1 = move-exception
            goto L17
        Le:
            r1 = 0
            p000.dd1.f3099 = r1     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            p000.dd1.f3100 = r1     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        L17:
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: β */
    public static android.app.Activity m1713() {
            java.util.concurrent.atomic.AtomicReference r0 = p000.dd1.f3093
            java.lang.Object r0 = r0.get()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            if (r0 == 0) goto L20
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L20
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L20
            boolean r1 = r0.isDestroyed()
            if (r1 == 0) goto L1f
            goto L20
        L1f:
            return r0
        L20:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m1714() {
            boolean r0 = p000.AbstractC0976x9.m6528()
            if (r0 == 0) goto L4d
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto Ld
            goto L4d
        Ld:
            qd r0 = p000.v81.m6127()
            boolean r1 = r0.f8963
            if (r1 != 0) goto L4b
            boolean r1 = r0.f8964
            if (r1 != 0) goto L4b
            boolean r0 = r0.f8965
            if (r0 == 0) goto L1e
            goto L4b
        L1e:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jc1.f5424
            java.util.List r0 = p000.jc1.m2939()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2b
            goto L4d
        L2b:
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            ec1 r1 = (p000.ec1) r1
            sd r1 = r1.f3486
            ip1 r2 = r1.f9837
            ip1 r3 = p000.ip1.f5163
            if (r2 == r3) goto L4b
            ip1 r2 = r1.f9838
            if (r2 == r3) goto L4b
            ip1 r1 = r1.f9839
            if (r1 != r3) goto L2f
        L4b:
            r0 = 1
            return r0
        L4d:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static void m1715(android.app.Activity r7, boolean r8) {
            r7.getClass()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r7)
            java.util.concurrent.atomic.AtomicReference r7 = p000.dd1.f3093
            r7.set(r0)
            r7 = 4
            java.lang.String r0 = "r8b18805b9e3774c8"
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.dd1.f3097
            r2 = 0
            if (r8 == 0) goto L22
            r8 = 1
            r1.set(r8)
            m1712()
            java.lang.String r8 = "操作菜单已打开，取消待执行的前台营地自动任务"
            p000.C0888ux.m5992(r0, r8, r2, r7, r2)
            return
        L22:
            r8 = 0
            r1.set(r8)
            long r3 = android.os.SystemClock.elapsedRealtime()
            r5 = 1500(0x5dc, double:7.41E-321)
            long r3 = r3 + r5
            java.util.concurrent.atomic.AtomicLong r8 = p000.dd1.f3098
            r8.set(r3)
            java.lang.String r8 = "操作菜单已关闭，短暂忽略同轮 Activity 恢复"
            p000.C0888ux.m5992(r0, r8, r2, r7, r2)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m1716(android.app.Activity r2, boolean r3) {
            r2.getClass()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            java.util.concurrent.atomic.AtomicReference r1 = p000.dd1.f3093
            r1.set(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = p000.dd1.f3096
            r1 = 0
            r0.set(r1)
            if (r3 == 0) goto L21
            boolean r3 = m1714()
            if (r3 == 0) goto L21
            r2 = 500(0x1f4, double:2.47E-321)
            m1718(r2)
            return
        L21:
            m1712()
            com.example.dyhelper.ui.φ r3 = new com.example.dyhelper.ui.φ
            r3.<init>(r2)
            com.example.dyhelper.p002ui.C0182.m1597(r3)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.ClassLoader m1717(android.app.Activity r1) {
            java.util.concurrent.atomic.AtomicReference r0 = p000.ry1.f9578
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L14
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 != 0) goto L13
            goto L14
        L13:
            return r0
        L14:
            if (r1 == 0) goto L1f
            java.lang.Class r1 = r1.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 != 0) goto L31
            java.lang.Class<dd1> r1 = p000.dd1.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 != 0) goto L31
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()
            r1.getClass()
        L31:
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static void m1718(long r9) {
            boolean r0 = m1714()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.Object r0 = p000.dd1.f3095
            monitor-enter(r0)
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto L16
            r6 = r3
            goto L17
        L16:
            r6 = r9
        L17:
            long r1 = r1 + r6
            java.util.concurrent.ScheduledFuture r6 = p000.dd1.f3099     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L30
            boolean r6 = r6.isDone()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L30
            long r6 = p000.dd1.f3100     // Catch: java.lang.Throwable -> L2e
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 <= 0) goto L30
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 > 0) goto L30
            monitor-exit(r0)
            return
        L2e:
            r9 = move-exception
            goto L50
        L30:
            java.util.concurrent.ScheduledFuture r6 = p000.dd1.f3099     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L38
            r7 = 0
            r6.cancel(r7)     // Catch: java.lang.Throwable -> L2e
        L38:
            p000.dd1.f3100 = r1     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = p000.dd1.f3094     // Catch: java.lang.Throwable -> L2e
            fb0 r2 = new fb0     // Catch: java.lang.Throwable -> L2e
            r6 = 13
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L2e
            if (r5 >= 0) goto L46
            r9 = r3
        L46:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ScheduledFuture r9 = r1.schedule(r2, r9, r3)     // Catch: java.lang.Throwable -> L2e
            p000.dd1.f3099 = r9     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)
            return
        L50:
            monitor-exit(r0)
            throw r9
    }

    /* JADX INFO: renamed from: θ */
    public static void m1719() {
            boolean r0 = m1714()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = java.lang.System.currentTimeMillis()
            xn0 r2 = p000.xn0.f12237
            java.util.Map r2 = r2.m6762()
            java.util.Collection r2 = r2.values()
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            f7 r3 = new f7
            r4 = 1
            r3.<init>(r4, r2)
            f71 r2 = new f71
            r4 = 20
            r2.<init>(r4)
            c40 r4 = new c40
            vs1 r5 = p000.vs1.f11382
            r4.<init>(r3, r2, r5)
            nq1 r2 = new nq1
            r3 = 26
            r2.<init>(r3)
            y30 r3 = new y30
            r5 = 0
            r3.<init>(r4, r5, r2)
            mc r2 = new mc
            r4 = 7
            r2.<init>(r4, r0)
            y30 r4 = new y30
            r6 = 1
            r4.<init>(r3, r6, r2)
            x30 r2 = new x30
            r2.<init>(r4)
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L54
            r2 = 0
            goto L6f
        L54:
            java.lang.Object r3 = r2.next()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
        L5a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r2.next()
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r7 = r3.compareTo(r4)
            if (r7 <= 0) goto L5a
            r3 = r4
            goto L5a
        L6e:
            r2 = r3
        L6f:
            java.lang.Long r2 = (java.lang.Long) r2
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r3.setTimeInMillis(r0)
            r4 = 6
            r3.add(r4, r6)
            r4 = 11
            r3.set(r4, r5)
            r4 = 12
            r3.set(r4, r5)
            r4 = 13
            r6 = 5
            r3.set(r4, r6)
            r4 = 14
            r3.set(r4, r5)
            long r3 = r3.getTimeInMillis()
            if (r2 == 0) goto L9c
            long r5 = r2.longValue()
            goto La1
        L9c:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        La1:
            long r2 = java.lang.Math.min(r5, r3)
            long r4 = r2 - r0
            r6 = 15000(0x3a98, double:7.411E-320)
            r8 = 21600000(0x1499700, double:1.0671818E-316)
            long r0 = p000.j81.m2908(r4, r6, r8)
            m1718(r0)
            return
    }

    /* JADX INFO: renamed from: ι */
    public static void m1720(android.app.Activity r14, p000.dc1 r15, p000.dc1 r16) {
            r1 = r16
            boolean r2 = p000.ui1.m5867()
            if (r2 == 0) goto L8e
            java.lang.String r2 = "pet_elf_camp_show_top_notification"
            r3 = 1
            boolean r2 = p000.ui1.m5887(r2, r3)
            if (r2 == 0) goto L8e
            if (r14 != 0) goto L14
            goto L56
        L14:
            int r2 = r15.f3082
            int r3 = r1.f3082
            int r2 = r2 + r3
            zt0 r3 = p000.AbstractC1021yh.m6893()
            int r4 = r15.f3076
            if (r4 <= 0) goto L26
            be1 r4 = p000.be1.f1677
            r3.add(r4)
        L26:
            int r4 = r1.f3078
            if (r4 <= 0) goto L2f
            be1 r4 = p000.be1.f1678
            r3.add(r4)
        L2f:
            int r4 = r1.f3079
            if (r4 <= 0) goto L38
            be1 r4 = p000.be1.f1679
            r3.add(r4)
        L38:
            int r4 = r1.f3080
            if (r4 <= 0) goto L41
            be1 r4 = p000.be1.f1680
            r3.add(r4)
        L41:
            be1 r4 = p000.be1.f1681
            if (r2 <= 0) goto L48
            r3.add(r4)
        L48:
            zt0 r3 = p000.AbstractC1021yh.m6883(r3)
            java.util.Set r3 = p000.xn0.m6705(r3)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L57
        L56:
            return
        L57:
            r7 = r3
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            cd1 r12 = new cd1
            r12.<init>(r15, r1, r2)
            r13 = 30
            java.lang.String r8 = "，"
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r7, r8, r9, r10, r11, r12, r13)
            boolean r1 = r3.contains(r4)
            java.lang.String r2 = "camp:auto"
            if (r1 == 0) goto L78
            java.lang.String r1 = "营地后台任务今日首次结果"
            com.example.dyhelper.p002ui.C0182.m1590(r14, r2, r1, r0)
            return
        L78:
            java.lang.String r1 = com.example.dyhelper.p002ui.C0182.m1593(r2)
            r3 = r0
            d52 r0 = new d52
            java.lang.String r2 = "营地后台任务今日首次完成"
            r4 = 100
            f52 r5 = p000.f52.f3754
            r7 = 1600(0x640, double:7.905E-321)
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.example.dyhelper.p002ui.C0182.m1597(r0)
        L8e:
            return
    }
}
