package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6188 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Thread m23143(int r0, java.lang.String r1, java.util.concurrent.atomic.AtomicInteger r2, java.lang.Runnable r3) {
            java.lang.Thread r0 = m23145(r0, r1, r2, r3)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1809
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.AbstractC2277 m23144(int r2, @Yue.InterfaceC4418 java.lang.String r3) {
            r0 = 1
            if (r2 < r0) goto L16
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            Yue.ۥۢۡۢ۠ r1 = new Yue.ۥۢۡۢ۠
            r1.<init>(r2, r3, r0)
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newScheduledThreadPool(r2, r1)
            Yue.ۥۣۣ۠ۡ r2 = Yue.C2281.m10527(r2)
            return r2
        L16:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Expected at least one thread, but "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = " specified"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.Thread m23145(int r2, java.lang.String r3, java.util.concurrent.atomic.AtomicInteger r4, java.lang.Runnable r5) {
            java.lang.Thread r0 = new java.lang.Thread
            r1 = 1
            if (r2 != r1) goto L6
            goto L1e
        L6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            r3 = 45
            r2.append(r3)
            int r3 = r4.incrementAndGet()
            r2.append(r3)
            java.lang.String r3 = r2.toString()
        L1e:
            r0.<init>(r5, r3)
            r0.setDaemon(r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1809
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Yue.AbstractC2277 m23146(@Yue.InterfaceC4418 java.lang.String r1) {
            r0 = 1
            Yue.ۥۣۣ۠ۡ r1 = m23144(r0, r1)
            return r1
    }
}
