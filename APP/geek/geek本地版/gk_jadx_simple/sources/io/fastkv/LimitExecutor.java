package io.fastkv;

import defpackage.t5;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class LimitExecutor implements Executor {
    private Runnable mActive;
    private Runnable mWaiting;

    public LimitExecutor() {
    }

    public static /* synthetic */ void a(LimitExecutor r0, Runnable r1) {
        r0.lambda$wrapTask$0(r1);
    }

    private /* synthetic */ void lambda$wrapTask$0(Runnable r1) {
        r1.run();     // Catch: Throwable -> L5
        scheduleNext();
        return;
    L5:
        th = move-exception;
        scheduleNext();
        throw th;
    }

    private synchronized void scheduleNext() {
        monitor-enter(this);
        Runnable r0 = this.mWaiting;     // Catch: Throwable -> L7
        this.mActive = r0;     // Catch: Throwable -> L7
        this.mWaiting = null;     // Catch: Throwable -> L7
        if (r0 == null) goto L9;
        FastKVConfig.getExecutor().execute(this.mActive);     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    private Runnable wrapTask(Runnable r3) {
        return new t5(this, 3, r3);
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable r2) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.mActive != null) goto L9;
        this.mActive = wrapTask(r2);     // Catch: Throwable -> L6
        FastKVConfig.getExecutor().execute(this.mActive);     // Catch: Throwable -> L6
    L11:
        monitor-exit(this);
        return;
    L9:
        if (this.mWaiting != null) goto L11;
        this.mWaiting = wrapTask(r2);     // Catch: Throwable -> L6
        goto L11
    }
}
