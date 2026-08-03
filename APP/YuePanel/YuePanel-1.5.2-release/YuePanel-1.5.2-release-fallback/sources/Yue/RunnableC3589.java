package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3589 extends Yue.AbstractC1643 implements java.lang.Runnable, Yue.InterfaceC1802 {
    private volatile int runningWorkers;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.AbstractC1643 f11407;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f11408;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ Yue.InterfaceC1802 f11409;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3792<java.lang.Runnable> f11410;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Object f11411;

    public RunnableC3589(@Yue.InterfaceC4418 Yue.AbstractC1643 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f11407 = r1
            r0.f11408 = r2
            boolean r2 = r1 instanceof Yue.InterfaceC1802
            if (r2 == 0) goto Le
            Yue.ۥ۟ۨۨ r1 = (Yue.InterfaceC1802) r1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 != 0) goto L15
            Yue.ۥ۟ۨۨ r1 = Yue.C1772.m8450()
        L15:
            r0.f11409 = r1
            Yue.ۥ۠ۨ۠ۧ r1 = new Yue.ۥ۠ۨ۠ۧ
            r2 = 0
            r1.<init>(r2)
            r0.f11410 = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f11411 = r1
            return
    }

    @Override // Yue.AbstractC1643
    public void dispatch(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 java.lang.Runnable r2) {
            r0 = this;
            boolean r1 = r0.m14522(r2)
            if (r1 != 0) goto L11
            boolean r1 = r0.m14524()
            if (r1 == 0) goto L11
            Yue.ۥ۟ۧۦۨ r1 = r0.f11407
            r1.dispatch(r0, r0)
        L11:
            return
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC3324
    public void dispatchYield(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 java.lang.Runnable r2) {
            r0 = this;
            boolean r1 = r0.m14522(r2)
            if (r1 != 0) goto L11
            boolean r1 = r0.m14524()
            if (r1 == 0) goto L11
            Yue.ۥ۟ۧۦۨ r1 = r0.f11407
            r1.dispatchYield(r0, r0)
        L11:
            return
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC4418
    @Yue.InterfaceC2302
    public Yue.AbstractC1643 limitedParallelism(int r2) {
            r1 = this;
            Yue.C3590.m14525(r2)
            int r0 = r1.f11408
            if (r2 < r0) goto L8
            return r1
        L8:
            Yue.ۥ۟ۧۦۨ r2 = super.limitedParallelism(r2)
            return r2
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            Yue.ۥ۠ۨ۠ۧ<java.lang.Runnable> r2 = r4.f11410
            java.lang.Object r2 = r2.m15201()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            Yue.ۥ۠۠ۧۦ r3 = Yue.C2141.f6728
            Yue.C1650.m7933(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            Yue.ۥ۟ۧۦۨ r2 = r4.f11407
            boolean r2 = r2.isDispatchNeeded(r4)
            if (r2 == 0) goto L2
            Yue.ۥ۟ۧۦۨ r0 = r4.f11407
            r0.dispatch(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f11411
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            Yue.ۥ۠ۨ۠ۧ<java.lang.Runnable> r2 = r4.f11410     // Catch: java.lang.Throwable -> L47
            int r2 = r2.m15197()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // Yue.InterfaceC1802
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated without replacement as an internal method never intended for public use")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public java.lang.Object mo8485(long r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r4) {
            r1 = this;
            Yue.ۥ۟ۨۨ r0 = r1.f11409
            java.lang.Object r2 = r0.mo8485(r2, r4)
            return r2
    }

    @Override // Yue.InterfaceC1802
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public Yue.InterfaceC1892 mo8438(long r2, @Yue.InterfaceC4418 java.lang.Runnable r4, @Yue.InterfaceC4418 Yue.InterfaceC1632 r5) {
            r1 = this;
            Yue.ۥ۟ۨۨ r0 = r1.f11409
            Yue.ۥۣۣ۠۟ r2 = r0.mo8438(r2, r4, r5)
            return r2
    }

    @Override // Yue.InterfaceC1802
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public void mo8486(long r2, @Yue.InterfaceC4418 Yue.InterfaceC0932<? super Yue.C6593> r4) {
            r1 = this;
            Yue.ۥ۟ۨۨ r0 = r1.f11409
            r0.mo8486(r2, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public final boolean m14522(java.lang.Runnable r2) {
            r1 = this;
            Yue.ۥ۠ۨ۠ۧ<java.lang.Runnable> r0 = r1.f11410
            r0.m15195(r2)
            int r2 = r1.runningWorkers
            int r0 = r1.f11408
            if (r2 < r0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final void m14523(java.lang.Runnable r1, Yue.InterfaceC2823<Yue.C6593> r2) {
            r0 = this;
            boolean r1 = r0.m14522(r1)
            if (r1 == 0) goto L7
            return
        L7:
            boolean r1 = r0.m14524()
            if (r1 != 0) goto Le
            return
        Le:
            r2.invoke()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final boolean m14524() {
            r3 = this;
            java.lang.Object r0 = r3.f11411
            monitor-enter(r0)
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L14
            int r2 = r3.f11408     // Catch: java.lang.Throwable -> L14
            if (r1 < r2) goto Lc
            monitor-exit(r0)
            r0 = 0
            return r0
        Lc:
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L14
            r2 = 1
            int r1 = r1 + r2
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return r2
        L14:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
