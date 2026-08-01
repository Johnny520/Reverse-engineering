package io.fastkv;

import java.util.concurrent.Executor;
import p000.RunnableC0732t5;

/* JADX INFO: loaded from: classes.dex */
public class LimitExecutor implements Executor {
    private Runnable mActive;
    private Runnable mWaiting;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$wrapTask$0(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            scheduleNext();
        }
    }

    private synchronized void scheduleNext() {
        Runnable runnable = this.mWaiting;
        this.mActive = runnable;
        this.mWaiting = null;
        if (runnable != null) {
            FastKVConfig.getExecutor().execute(this.mActive);
        }
    }

    private Runnable wrapTask(Runnable runnable) {
        return new RunnableC0732t5(this, 3, runnable);
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        try {
            if (this.mActive == null) {
                this.mActive = wrapTask(runnable);
                FastKVConfig.getExecutor().execute(this.mActive);
            } else if (this.mWaiting == null) {
                this.mWaiting = wrapTask(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
