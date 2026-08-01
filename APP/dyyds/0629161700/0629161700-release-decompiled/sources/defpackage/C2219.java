package defpackage;

/* JADX INFO: renamed from: ᲈᛴᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2219 extends defpackage.AbstractC0767 implements defpackage.InterfaceC1925 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.concurrent.Executor f9472;

    public C2219(java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.f9472 = r1
            boolean r0 = r1 instanceof java.util.concurrent.ScheduledThreadPoolExecutor
            if (r0 == 0) goto Lf
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = (java.util.concurrent.ScheduledThreadPoolExecutor) r1
            r0 = 1
            r1.setRemoveOnCancelPolicy(r0)
        Lf:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.util.concurrent.Executor r1 = r1.f9472
            boolean r0 = r1 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L9
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1
            goto La
        L9:
            r1 = 0
        La:
            if (r1 == 0) goto Lf
            r1.shutdown()
        Lf:
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C2219
            if (r0 == 0) goto Le
            ᲈᛴᛲᛵ r2 = (defpackage.C2219) r2
            java.util.concurrent.Executor r2 = r2.f9472
            java.util.concurrent.Executor r1 = r1.f9472
            if (r2 != r1) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.concurrent.Executor r0 = r0.f9472
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // defpackage.AbstractC1805
    public final java.lang.String toString() {
            r0 = this;
            java.util.concurrent.Executor r0 = r0.f9472
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // defpackage.InterfaceC1925
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final void mo571(long r6, defpackage.C2260 r8) {
            r5 = this;
            java.util.concurrent.Executor r0 = r5.f9472
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            r2 = 0
            if (r1 == 0) goto La
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            r1 = 0
            if (r0 == 0) goto L38
            ᛱᲈᛷᲀ r3 = new ᛱᲈᛷᲀ
            r4 = 8
            r3.<init>(r5, r8, r4, r1)
            ᛳᛵᲈᛵ r5 = r8.f9598
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
            java.util.concurrent.ScheduledFuture r2 = r0.schedule(r3, r6, r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L1e
            goto L38
        L1e:
            r0 = move-exception
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r4 = "The task was rejected"
            r3.<init>(r4)
            r3.initCause(r0)
            ᛷᲈᲀ r0 = defpackage.C1403.f6097
            ᛶᲁᛳᲈ r5 = r5.mo970(r0)
            ᲇᛳᛸᛳ r5 = (defpackage.InterfaceC2023) r5
            if (r5 == 0) goto L38
            ᛴᛲᛵᛵ r5 = (defpackage.AbstractC0624) r5
            r5.m1435(r3)
        L38:
            if (r2 == 0) goto L43
            ᛱᲇᛷᛸ r5 = new ᛱᲇᛷᛸ
            r5.<init>(r1, r2)
            r8.m3667(r5)
            return
        L43:
            ᲀᲁᲁᛳ r5 = defpackage.RunnableC1761.f7778
            r5.mo571(r6, r8)
            return
    }

    @Override // defpackage.AbstractC1805
    /* JADX INFO: renamed from: ᛲᛲᛸᲈ */
    public final void mo572(defpackage.InterfaceC0493 r3, java.lang.Runnable r4) {
            r2 = this;
            java.util.concurrent.Executor r2 = r2.f9472     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            r2.execute(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L6
            return
        L6:
            r2 = move-exception
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r1 = "The task was rejected"
            r0.<init>(r1)
            r0.initCause(r2)
            ᛷᲈᲀ r2 = defpackage.C1403.f6097
            ᛶᲁᛳᲈ r2 = r3.mo970(r2)
            ᲇᛳᛸᛳ r2 = (defpackage.InterfaceC2023) r2
            if (r2 == 0) goto L20
            ᛴᛲᛵᛵ r2 = (defpackage.AbstractC0624) r2
            r2.m1435(r0)
        L20:
            ᛶᛸᛳ r2 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r2 = defpackage.ExecutorC0679.f3269
            r2.mo572(r3, r4)
            return
    }

    @Override // defpackage.InterfaceC1925
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final defpackage.InterfaceC0843 mo573(long r4, defpackage.RunnableC1062 r6, defpackage.InterfaceC0493 r7) {
            r3 = this;
            java.util.concurrent.Executor r3 = r3.f9472
            boolean r0 = r3 instanceof java.util.concurrent.ScheduledExecutorService
            r1 = 0
            if (r0 == 0) goto La
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3
            goto Lb
        La:
            r3 = r1
        Lb:
            if (r3 == 0) goto L2e
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.RejectedExecutionException -> L14
            java.util.concurrent.ScheduledFuture r1 = r3.schedule(r6, r4, r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L14
            goto L2e
        L14:
            r3 = move-exception
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r2 = "The task was rejected"
            r0.<init>(r2)
            r0.initCause(r3)
            ᛷᲈᲀ r3 = defpackage.C1403.f6097
            ᛶᲁᛳᲈ r3 = r7.mo970(r3)
            ᲇᛳᛸᛳ r3 = (defpackage.InterfaceC2023) r3
            if (r3 == 0) goto L2e
            ᛴᛲᛵᛵ r3 = (defpackage.AbstractC0624) r3
            r3.m1435(r0)
        L2e:
            if (r1 == 0) goto L36
            ᛸᛳᛲᲀ r3 = new ᛸᛳᛲᲀ
            r3.<init>(r1)
            return r3
        L36:
            ᲀᲁᲁᛳ r3 = defpackage.RunnableC1761.f7778
            ᛵᛲᲇᲇ r3 = r3.mo573(r4, r6, r7)
            return r3
    }
}
