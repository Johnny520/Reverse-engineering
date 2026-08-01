package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class tg0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f10367 = null;

    /* JADX INFO: renamed from: β */
    public static final android.os.Handler f10368 = null;

    /* JADX INFO: renamed from: γ */
    public static final p000.fb0 f10369 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.tg0.f10367 = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "r5df1c9bc692b57df"
            r0.<init>(r1)
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            p000.tg0.f10368 = r1
            fb0 r0 = new fb0
            r1 = 1
            r0.<init>(r1)
            p000.tg0.f10369 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m5708() {
            boolean r0 = p000.ui1.m5867()
            if (r0 == 0) goto L7
            goto L3a
        L7:
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "currentApplication"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Throwable -> L23
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L23
            boolean r2 = r1 instanceof android.app.Application     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            android.app.Application r1 = (android.app.Application) r1     // Catch: java.lang.Throwable -> L23
            goto L2d
        L23:
            r1 = move-exception
            goto L27
        L25:
            r1 = r0
            goto L2d
        L27:
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L2d:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L32
            goto L33
        L32:
            r0 = r1
        L33:
            android.app.Application r0 = (android.app.Application) r0
            if (r0 == 0) goto L3a
            p000.ui1.m5896(r0)
        L3a:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m5709() {
            m5708()
            java.lang.String r0 = "im_auto_read_include_interactive"
            r1 = 1
            m5708()     // Catch: java.lang.Throwable -> Le
            boolean r0 = p000.ui1.m5887(r0, r1)     // Catch: java.lang.Throwable -> Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            java.lang.String r2 = "im_auto_read_filter_mode"
            r3 = 0
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L1b
            int r2 = r4.getInt(r2, r3)     // Catch: java.lang.Throwable -> L1b
            goto L1c
        L1b:
            r2 = r3
        L1c:
            java.util.concurrent.ConcurrentHashMap r4 = p000.ck0.f2176
            java.lang.String r4 = "im_auto_read_filter_rules"
            java.lang.String r5 = ""
            java.lang.String r4 = p000.ui1.m5893(r4, r5)
            java.util.Set r4 = p000.ck0.m1244(r4)
            zj0 r5 = p000.zj0.f13118
            java.lang.String r6 = "静默一键已读失败："
            java.lang.String r7 = "静默一键已读失败: "
            java.util.concurrent.atomic.AtomicBoolean r8 = p000.zj0.f13123
            boolean r1 = r8.compareAndSet(r3, r1)
            r9 = 0
            if (r1 != 0) goto L41
            yj0 r0 = new yj0
            java.lang.String r1 = "已读任务正在执行"
            r0.<init>(r3, r1, r9)
            goto L9a
        L41:
            java.lang.ClassLoader r1 = p000.zj0.f13121
            if (r1 != 0) goto L4d
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r1 = r1.getContextClassLoader()
        L4d:
            if (r1 != 0) goto L5a
            r8.set(r3)
            yj0 r0 = new yj0
            java.lang.String r1 = "ClassLoader 不可用"
            r0.<init>(r3, r1, r9)
            goto L9a
        L5a:
            r5.m7160(r1)
            yj0 r0 = r5.m7159(r1, r0, r2, r4)     // Catch: java.lang.Throwable -> L65
            r8.set(r3)
            goto L9a
        L65:
            r0 = move-exception
            java.lang.Throwable r0 = p000.zj0.m7138(r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = "DYHelperIMMarkAllReadHelper"
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r4.<init>(r7)     // Catch: java.lang.Throwable -> Lbb
            r4.append(r2)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Lbb
            p000.C0888ux.m5977(r1, r2, r0)     // Catch: java.lang.Throwable -> Lbb
            yj0 r1 = new yj0     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r4.<init>(r6)     // Catch: java.lang.Throwable -> Lbb
            r4.append(r2)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Lbb
            r1.<init>(r3, r2, r0)     // Catch: java.lang.Throwable -> Lbb
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.zj0.f13123
            r0.set(r3)
            r0 = r1
        L9a:
            boolean r1 = r0.f12646
            java.lang.String r0 = r0.f12647
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "定时已读完成 success="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ", msg="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = 4
            java.lang.String r2 = "DYHelper"
            p000.C0888ux.m5988(r2, r0, r9, r1, r9)
            return
        Lbb:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.zj0.f13123
            r1.set(r3)
            throw r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m5710() {
            java.lang.String r0 = "im_auto_read_interval_minutes"
            r1 = 10
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Lc
            int r1 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> Lc
        Lc:
            r0 = 1
            r2 = 1440(0x5a0, float:2.018E-42)
            int r0 = p000.j81.m2906(r1, r0, r2)
            java.lang.String r1 = "im_auto_read_enabled"
            r2 = 0
            m5708()     // Catch: java.lang.Throwable -> L1d
            boolean r2 = p000.ui1.m5887(r1, r2)     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = 60000(0xea60, double:2.9644E-319)
            if (r2 == 0) goto L24
            long r0 = (long) r0
            long r3 = r3 * r0
        L24:
            android.os.Handler r0 = p000.tg0.f10368
            fb0 r1 = p000.tg0.f10369
            r0.removeCallbacks(r1)
            r0.postDelayed(r1, r3)
            return
    }
}
