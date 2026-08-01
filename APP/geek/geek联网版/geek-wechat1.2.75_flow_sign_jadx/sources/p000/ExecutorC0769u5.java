package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: u5 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0769u5 implements Executor {

    /* JADX INFO: renamed from: a */
    public final Object f4631a = new Object();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f4632b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final ExecutorC0806v5 f4633c;

    /* JADX INFO: renamed from: d */
    public Runnable f4634d;

    public ExecutorC0769u5(ExecutorC0806v5 executorC0806v5) {
        this.f4633c = executorC0806v5;
    }

    /* JADX INFO: renamed from: a */
    public final void m2438a() {
        synchronized (this.f4631a) {
            try {
                Runnable runnable = (Runnable) this.f4632b.poll();
                this.f4634d = runnable;
                if (runnable != null) {
                    this.f4633c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f4631a) {
            try {
                this.f4632b.add(new RunnableC0732t5(this, 0, runnable));
                if (this.f4634d == null) {
                    m2438a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
