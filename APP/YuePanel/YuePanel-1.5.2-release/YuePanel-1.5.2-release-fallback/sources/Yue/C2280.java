package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2280 extends Yue.AbstractC2277 implements Yue.InterfaceC1802 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.Executor f7063;

    public C2280(@Yue.InterfaceC4418 java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.f7063 = r1
            java.util.concurrent.Executor r1 = r0.mo8460()
            Yue.C1446.m7098(r1)
            return
    }

    @Override // Yue.AbstractC2277, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mo8460()
            boolean r1 = r0 instanceof java.util.concurrent.ExecutorService
            if (r1 == 0) goto Lb
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L11
            r0.shutdown()
        L11:
            return
    }

    @Override // Yue.AbstractC1643
    public void dispatch(@Yue.InterfaceC4418 Yue.InterfaceC1632 r3, @Yue.InterfaceC4418 java.lang.Runnable r4) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.mo8460()     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            Yue.ۥ۟۟ۢۧ r1 = Yue.C0098.m539()     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            if (r1 == 0) goto L13
            java.lang.Runnable r1 = r1.m537(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            if (r1 != 0) goto L14
            goto L13
        L11:
            r0 = move-exception
            goto L18
        L13:
            r1 = r4
        L14:
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L11
            goto L2b
        L18:
            Yue.ۥ۟۟ۢۧ r1 = Yue.C0098.m539()
            if (r1 == 0) goto L21
            r1.m534()
        L21:
            r2.m10522(r3, r0)
            Yue.ۥ۟ۧۦۨ r0 = Yue.C1878.m8791()
            r0.dispatch(r3, r4)
        L2b:
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C2280
            if (r0 == 0) goto L12
            Yue.ۥۣ۠ۡۤ r2 = (Yue.C2280) r2
            java.util.concurrent.Executor r2 = r2.mo8460()
            java.util.concurrent.Executor r0 = r1.mo8460()
            if (r2 != r0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mo8460()
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mo8460()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC1802
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated without replacement as an internal method never intended for public use")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public java.lang.Object mo8485(long r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
            r0 = this;
            java.lang.Object r1 = Yue.InterfaceC1802.C1803.m8487(r0, r1, r3)
            return r1
    }

    @Override // Yue.InterfaceC1802
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public Yue.InterfaceC1892 mo8438(long r10, @Yue.InterfaceC4418 java.lang.Runnable r12, @Yue.InterfaceC4418 Yue.InterfaceC1632 r13) {
            r9 = this;
            java.util.concurrent.Executor r0 = r9.mo8460()
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            r2 = 0
            if (r1 == 0) goto Ld
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r4 = r0
            goto Le
        Ld:
            r4 = r2
        Le:
            if (r4 == 0) goto L18
            r3 = r9
            r5 = r12
            r6 = r13
            r7 = r10
            java.util.concurrent.ScheduledFuture r2 = r3.m10523(r4, r5, r6, r7)
        L18:
            if (r2 == 0) goto L20
            Yue.ۥۣ۠۟ۢ r10 = new Yue.ۥۣ۠۟ۢ
            r10.<init>(r2)
            goto L26
        L20:
            Yue.ۥ۟ۨۥۤ r0 = Yue.RunnableC1771.f5485
            Yue.ۥۣۣ۠۟ r10 = r0.mo8438(r10, r12, r13)
        L26:
            return r10
    }

    @Override // Yue.InterfaceC1802
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public void mo8486(long r10, @Yue.InterfaceC4418 Yue.InterfaceC0932<? super Yue.C6593> r12) {
            r9 = this;
            java.util.concurrent.Executor r0 = r9.mo8460()
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            r2 = 0
            if (r1 == 0) goto Ld
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            r4 = r0
            goto Le
        Ld:
            r4 = r2
        Le:
            if (r4 == 0) goto L1f
            Yue.ۥۡۦۨ۟ r5 = new Yue.ۥۡۦۨ۟
            r5.<init>(r9, r12)
            Yue.ۥ۟ۧۦۥ r6 = r12.getContext()
            r3 = r9
            r7 = r10
            java.util.concurrent.ScheduledFuture r2 = r3.m10523(r4, r5, r6, r7)
        L1f:
            if (r2 == 0) goto L25
            Yue.C3399.m14042(r12, r2)
            return
        L25:
            Yue.ۥ۟ۨۥۤ r0 = Yue.RunnableC1771.f5485
            r0.mo8486(r10, r12)
            return
    }

    @Override // Yue.AbstractC2277
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public java.util.concurrent.Executor mo8460() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.f7063
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public final void m10522(Yue.InterfaceC1632 r2, java.util.concurrent.RejectedExecutionException r3) {
            r1 = this;
            java.lang.String r0 = "The task was rejected"
            java.util.concurrent.CancellationException r3 = Yue.C2266.m10466(r0, r3)
            Yue.C3399.m14025(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public final java.util.concurrent.ScheduledFuture<?> m10523(java.util.concurrent.ScheduledExecutorService r2, java.lang.Runnable r3, Yue.InterfaceC1632 r4, long r5) {
            r1 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.RejectedExecutionException -> L7
            java.util.concurrent.ScheduledFuture r2 = r2.schedule(r3, r5, r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L7
            goto Lc
        L7:
            r2 = move-exception
            r1.m10522(r4, r2)
            r2 = 0
        Lc:
            return r2
    }
}
