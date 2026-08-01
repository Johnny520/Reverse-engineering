package p000;

/* JADX INFO: renamed from: u4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0859u4 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f10585;

    /* JADX INFO: renamed from: ζ */
    public final java.util.ArrayDeque f10586;

    /* JADX INFO: renamed from: η */
    public final p000.ExecutorC0896v4 f10587;

    /* JADX INFO: renamed from: θ */
    public java.lang.Runnable f10588;

    public ExecutorC0859u4(p000.ExecutorC0896v4 r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f10585 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r1.f10586 = r0
            r1.f10587 = r2
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r5) {
            r4 = this;
            java.lang.Object r0 = r4.f10585
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r4.f10586     // Catch: java.lang.Throwable -> L16
            w1 r2 = new w1     // Catch: java.lang.Throwable -> L16
            r3 = 1
            r2.<init>(r4, r3, r5)     // Catch: java.lang.Throwable -> L16
            r1.add(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Runnable r5 = r4.f10588     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L18
            r4.m5780()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r4 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r4
    }

    /* JADX INFO: renamed from: α */
    public final void m5780() {
            r2 = this;
            java.lang.Object r0 = r2.f10585
            monitor-enter(r0)
            java.util.ArrayDeque r1 = r2.f10586     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L15
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L15
            r2.f10588 = r1     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            v4 r2 = r2.f10587     // Catch: java.lang.Throwable -> L15
            r2.execute(r1)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r2 = move-exception
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
    }
}
