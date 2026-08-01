package p049I2;

import java.util.concurrent.Executor;
import p021D3.RunnableC0270g;

/* JADX INFO: renamed from: I2.p */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0798p implements Executor {

    /* JADX INFO: renamed from: d */
    public RunnableC0270g f2573d;

    /* JADX INFO: renamed from: e */
    public RunnableC0270g f2574e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m1403a() {
        RunnableC0270g runnableC0270g = this.f2574e;
        this.f2573d = runnableC0270g;
        this.f2574e = null;
        if (runnableC0270g != null) {
            AbstractC0797o.m1393r().execute(this.f2573d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f2573d == null) {
                this.f2573d = new RunnableC0270g(3, this, runnable);
                AbstractC0797o.m1393r().execute(this.f2573d);
            } else if (this.f2574e == null) {
                this.f2574e = new RunnableC0270g(3, this, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
