package p183m6;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: m6.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC5052v implements Executor {

    /* JADX INFO: renamed from: q */
    public Runnable f15363q;

    /* JADX INFO: renamed from: r */
    public Runnable f15364r;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20448a(ExecutorC5052v executorC5052v, Runnable runnable) {
        executorC5052v.getClass();
        try {
            runnable.run();
        } finally {
            executorC5052v.m20449b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m20449b() {
        Runnable runnable = this.f15364r;
        this.f15363q = runnable;
        this.f15364r = null;
        if (runnable != null) {
            AbstractC5047q.m20407a().execute(this.f15363q);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Runnable m20450c(final Runnable runnable) {
        return new Runnable() { // from class: m6.u
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC5052v.m20448a(this.f15361q, runnable);
            }
        };
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        try {
            if (this.f15363q == null) {
                this.f15363q = m20450c(runnable);
                AbstractC5047q.m20407a().execute(this.f15363q);
            } else if (this.f15364r == null) {
                this.f15364r = m20450c(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
