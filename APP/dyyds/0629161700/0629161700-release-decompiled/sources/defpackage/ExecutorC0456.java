package defpackage;

/* JADX INFO: renamed from: ᛳᛴᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0456 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.Runnable f2263;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.ArrayDeque f2264;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2265;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Object f2266;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.util.concurrent.Executor f2267;

    public ExecutorC0456(java.util.concurrent.Executor r2) {
            r1 = this;
            r0 = 1
            r1.f2265 = r0
            r1.<init>()
            r1.f2267 = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.f2264 = r2
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.f2266 = r2
            return
    }

    public ExecutorC0456(defpackage.ExecutorC1811 r2) {
            r1 = this;
            r0 = 0
            r1.f2265 = r0
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f2266 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f2264 = r0
            r1.f2267 = r2
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r5) {
            r4 = this;
            int r0 = r4.f2265
            switch(r0) {
                case 0: goto L20;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f2266
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r4.f2264     // Catch: java.lang.Throwable -> L1a
            ᛸᛳᛴᲁ r2 = new ᛸᛳᛴᲁ     // Catch: java.lang.Throwable -> L1a
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L1a
            r1.offer(r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.Runnable r5 = r4.f2263     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto L1c
            r4.m1239()     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r4 = move-exception
            goto L1e
        L1c:
            monitor-exit(r0)
            return
        L1e:
            monitor-exit(r0)
            throw r4
        L20:
            java.lang.Object r0 = r4.f2266
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r4.f2264     // Catch: java.lang.Throwable -> L36
            ᛸᛳᛴᲁ r2 = new ᛸᛳᛴᲁ     // Catch: java.lang.Throwable -> L36
            r3 = 0
            r2.<init>(r4, r3, r5)     // Catch: java.lang.Throwable -> L36
            r1.add(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Runnable r5 = r4.f2263     // Catch: java.lang.Throwable -> L36
            if (r5 != 0) goto L38
            r4.m1239()     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r4 = move-exception
            goto L3a
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r4
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1239() {
            r3 = this;
            int r0 = r3.f2265
            switch(r0) {
                case 0: goto L21;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f2266
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r3.f2264     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L1b
            r2 = r1
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch: java.lang.Throwable -> L1b
            r3.f2263 = r2     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.util.concurrent.Executor r3 = r3.f2267     // Catch: java.lang.Throwable -> L1b
            r3.execute(r2)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            monitor-exit(r0)
            return
        L1f:
            monitor-exit(r0)
            throw r3
        L21:
            java.lang.Object r0 = r3.f2266
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r3.f2264     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L38
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L38
            r3.f2263 = r1     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            java.util.concurrent.Executor r3 = r3.f2267     // Catch: java.lang.Throwable -> L38
            ᲁᛲᛵᛵ r3 = (defpackage.ExecutorC1811) r3     // Catch: java.lang.Throwable -> L38
            r3.execute(r1)     // Catch: java.lang.Throwable -> L38
            goto L3a
        L38:
            r3 = move-exception
            goto L3c
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r3
    }
}
