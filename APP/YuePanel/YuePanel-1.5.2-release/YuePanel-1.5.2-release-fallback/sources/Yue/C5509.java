package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5509 extends Yue.AbstractC2277 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f20403;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f20404;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final long f20405;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f20406;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public Yue.ExecutorC1656 f20407;

    public C5509() {
            r8 = this;
            r6 = 15
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
    }

    public C5509(int r1, int r2, long r3, @Yue.InterfaceC4418 java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f20403 = r1
            r0.f20404 = r2
            r0.f20405 = r3
            r0.f20406 = r5
            Yue.ۥۣ۟ۧۧ r1 = r0.m20737()
            r0.f20407 = r1
            return
    }

    public /* synthetic */ C5509(int r4, int r5, long r6, java.lang.String r8, int r9, Yue.C1769 r10) {
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            int r4 = Yue.C6129.f22089
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            int r5 = Yue.C6129.f22090
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            long r6 = Yue.C6129.f22091
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.String r8 = "CoroutineScheduler"
        L1a:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r10)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    private final Yue.ExecutorC1656 m20737() {
            r7 = this;
            Yue.ۥۣ۟ۧۧ r6 = new Yue.ۥۣ۟ۧۧ
            int r1 = r7.f20403
            int r2 = r7.f20404
            long r3 = r7.f20405
            java.lang.String r5 = r7.f20406
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            return r6
    }

    @Override // Yue.AbstractC2277, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            Yue.ۥۣ۟ۧۧ r0 = r1.f20407
            r0.close()
            return
    }

    @Override // Yue.AbstractC1643
    public void dispatch(@Yue.InterfaceC4418 Yue.InterfaceC1632 r7, @Yue.InterfaceC4418 java.lang.Runnable r8) {
            r6 = this;
            Yue.ۥۣ۟ۧۧ r0 = r6.f20407
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r8
            Yue.ExecutorC1656.m7947(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // Yue.AbstractC1643
    public void dispatchYield(@Yue.InterfaceC4418 Yue.InterfaceC1632 r7, @Yue.InterfaceC4418 java.lang.Runnable r8) {
            r6 = this;
            Yue.ۥۣ۟ۧۧ r0 = r6.f20407
            r4 = 2
            r5 = 0
            r2 = 0
            r3 = 1
            r1 = r8
            Yue.ExecutorC1656.m7947(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // Yue.AbstractC2277
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public java.util.concurrent.Executor mo8460() {
            r1 = this;
            Yue.ۥۣ۟ۧۧ r0 = r1.f20407
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final void m20738(@Yue.InterfaceC4418 java.lang.Runnable r2, @Yue.InterfaceC4418 Yue.InterfaceC6113 r3, boolean r4) {
            r1 = this;
            Yue.ۥۣ۟ۧۧ r0 = r1.f20407
            r0.m7958(r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public final void m20739() {
            r0 = this;
            r0.m20741()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final synchronized void m20740(long r2) {
            r1 = this;
            monitor-enter(r1)
            Yue.ۥۣ۟ۧۧ r0 = r1.f20407     // Catch: java.lang.Throwable -> L8
            r0.m7969(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public final synchronized void m20741() {
            r3 = this;
            monitor-enter(r3)
            Yue.ۥۣ۟ۧۧ r0 = r3.f20407     // Catch: java.lang.Throwable -> L10
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.m7969(r1)     // Catch: java.lang.Throwable -> L10
            Yue.ۥۣ۟ۧۧ r0 = r3.m20737()     // Catch: java.lang.Throwable -> L10
            r3.f20407 = r0     // Catch: java.lang.Throwable -> L10
            monitor-exit(r3)
            return
        L10:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            throw r0
    }
}
