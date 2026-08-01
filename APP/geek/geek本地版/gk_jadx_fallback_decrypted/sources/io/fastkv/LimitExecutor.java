package io.fastkv;

/* JADX INFO: loaded from: classes.dex */
public class LimitExecutor implements java.util.concurrent.Executor {
    private java.lang.Runnable mActive;
    private java.lang.Runnable mWaiting;

    public LimitExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(io.fastkv.LimitExecutor r0, java.lang.Runnable r1) {
            r0.lambda$wrapTask$0(r1)
            return
    }

    private /* synthetic */ void lambda$wrapTask$0(java.lang.Runnable r1) {
            r0 = this;
            r1.run()     // Catch: java.lang.Throwable -> L7
            r0.scheduleNext()
            return
        L7:
            r1 = move-exception
            r0.scheduleNext()
            throw r1
    }

    private synchronized void scheduleNext() {
            r2 = this;
            monitor-enter(r2)
            java.lang.Runnable r0 = r2.mWaiting     // Catch: java.lang.Throwable -> L14
            r2.mActive = r0     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r2.mWaiting = r1     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            java.util.concurrent.Executor r0 = io.fastkv.FastKVConfig.getExecutor()     // Catch: java.lang.Throwable -> L14
            java.lang.Runnable r1 = r2.mActive     // Catch: java.lang.Throwable -> L14
            r0.execute(r1)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L18
        L16:
            monitor-exit(r2)
            return
        L18:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    private java.lang.Runnable wrapTask(java.lang.Runnable r3) {
            r2 = this;
            t5 r0 = new t5
            r1 = 3
            r0.<init>(r2, r1, r3)
            return r0
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(java.lang.Runnable r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.Runnable r0 = r1.mActive     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L17
            java.lang.Runnable r2 = r1.wrapTask(r2)     // Catch: java.lang.Throwable -> L15
            r1.mActive = r2     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.Executor r2 = io.fastkv.FastKVConfig.getExecutor()     // Catch: java.lang.Throwable -> L15
            java.lang.Runnable r0 = r1.mActive     // Catch: java.lang.Throwable -> L15
            r2.execute(r0)     // Catch: java.lang.Throwable -> L15
            goto L21
        L15:
            r2 = move-exception
            goto L23
        L17:
            java.lang.Runnable r0 = r1.mWaiting     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L21
            java.lang.Runnable r2 = r1.wrapTask(r2)     // Catch: java.lang.Throwable -> L15
            r1.mWaiting = r2     // Catch: java.lang.Throwable -> L15
        L21:
            monitor-exit(r1)
            return
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r2
    }
}
