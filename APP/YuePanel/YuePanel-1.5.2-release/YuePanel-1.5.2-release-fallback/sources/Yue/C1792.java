package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C1792 extends Yue.AbstractC6115 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object f5523;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.concurrent.ExecutorService f5524;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public volatile android.os.Handler f5525;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۧ$ۥ, reason: contains not printable characters */
    public class ThreadFactoryC1793 implements java.util.concurrent.ThreadFactory {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final java.lang.String f5526 = "arch_disk_io_";

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.concurrent.atomic.AtomicInteger f5527;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1792 f5528;

        public ThreadFactoryC1793(Yue.C1792 r2) {
                r1 = this;
                r1.f5528 = r2
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r0 = 0
                r2.<init>(r0)
                r1.f5527 = r2
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r3) {
                r2 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r0.<init>(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r1 = "arch_disk_io_"
                r3.append(r1)
                java.util.concurrent.atomic.AtomicInteger r1 = r2.f5527
                int r1 = r1.getAndIncrement()
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                r0.setName(r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C1794 {
        public C1794() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.os.Handler m8472(@Yue.InterfaceC4410 android.os.Looper r0) {
                android.os.Handler r0 = android.os.Handler.createAsync(r0)
                return r0
        }
    }

    public C1792() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f5523 = r0
            Yue.ۥۣ۟ۨۧ$ۥ r0 = new Yue.ۥۣ۟ۨۧ$ۥ
            r0.<init>(r2)
            r1 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            r2.f5524 = r0
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static android.os.Handler m8471(@Yue.InterfaceC4410 android.os.Looper r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r4 = Yue.C1792.C1794.m8472(r4)
            return r4
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            java.lang.Class<android.os.Looper> r1 = android.os.Looper.class
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.Throwable -> L2f
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.Throwable -> L2f
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.Throwable -> L2f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.Throwable -> L2f
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r2, r1}     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.Throwable -> L2f
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L29 java.lang.Throwable -> L2f
            return r0
        L29:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r4)
            return r0
        L2f:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r4)
            return r0
    }

    @Override // Yue.AbstractC6115
    /* JADX INFO: renamed from: ۥ */
    public void mo1946(@Yue.InterfaceC4410 java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.f5524
            r0.execute(r2)
            return
    }

    @Override // Yue.AbstractC6115
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo1947() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // Yue.AbstractC6115
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo1948(@Yue.InterfaceC4410 java.lang.Runnable r3) {
            r2 = this;
            android.os.Handler r0 = r2.f5525
            if (r0 != 0) goto L1c
            java.lang.Object r0 = r2.f5523
            monitor-enter(r0)
            android.os.Handler r1 = r2.f5525     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L16
            android.os.Handler r1 = m8471(r1)     // Catch: java.lang.Throwable -> L16
            r2.f5525 = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
        L1c:
            android.os.Handler r0 = r2.f5525
            r0.post(r3)
            return
    }
}
