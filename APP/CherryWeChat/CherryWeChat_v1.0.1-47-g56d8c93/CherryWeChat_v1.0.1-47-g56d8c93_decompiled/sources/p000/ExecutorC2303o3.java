package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o3 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2303o3 implements Executor {

    /* JADX INFO: renamed from: a */
    public final Object f8063a = new Object();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f8064b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final ExecutorC2346p3 f8065c;

    /* JADX INFO: renamed from: d */
    public Runnable f8066d;

    public ExecutorC2303o3(ExecutorC2346p3 executorC2346p3) {
        this.f8065c = executorC2346p3;
    }

    /* JADX INFO: renamed from: a */
    public final void m4680a() {
        synchronized (this.f8063a) {
            try {
                Runnable runnable = (Runnable) this.f8064b.poll();
                this.f8066d = runnable;
                if (runnable != null) {
                    this.f8065c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f8063a) {
            try {
                this.f8064b.add(new RunnableC2260n3(0, this, runnable));
                if (this.f8066d == null) {
                    m4680a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
