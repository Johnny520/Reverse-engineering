package androidx.appcompat.app;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0938 implements Executor {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Runnable f604;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ExecutorC0937 f606;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f607 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayDeque f605 = new ArrayDeque();

    public ExecutorC0938(ExecutorC0937 executorC0937) {
        this.f606 = executorC0937;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f607) {
            try {
                this.f605.add(new RunnableC0946(this, 0, runnable));
                if (this.f604 == null) {
                    m883();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m883() {
        synchronized (this.f607) {
            try {
                Runnable runnable = (Runnable) this.f605.poll();
                this.f604 = runnable;
                if (runnable != null) {
                    this.f606.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
