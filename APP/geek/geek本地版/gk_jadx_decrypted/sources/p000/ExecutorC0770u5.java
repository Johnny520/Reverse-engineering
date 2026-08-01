package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: u5 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0770u5 implements Executor {

    /* JADX INFO: renamed from: a */
    public final Object f4664a = new Object();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f4665b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final ExecutorC0807v5 f4666c;

    /* JADX INFO: renamed from: d */
    public Runnable f4667d;

    public ExecutorC0770u5(ExecutorC0807v5 executorC0807v5) {
        this.f4666c = executorC0807v5;
    }

    /* JADX INFO: renamed from: a */
    public final void m2420a() {
        synchronized (this.f4664a) {
            try {
                Runnable runnable = (Runnable) this.f4665b.poll();
                this.f4667d = runnable;
                if (runnable != null) {
                    this.f4666c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f4664a) {
            try {
                this.f4665b.add(new RunnableC0733t5(this, 0, runnable));
                if (this.f4667d == null) {
                    m2420a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
