package androidx.appcompat.app;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0091 implements Executor {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Runnable f259;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ExecutorC0090 f261;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f262 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayDeque f260 = new ArrayDeque();

    public ExecutorC0091(ExecutorC0090 executorC0090) {
        this.f261 = executorC0090;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f262) {
            try {
                this.f260.add(new RunnableC0099(this, 0, runnable));
                if (this.f259 == null) {
                    m323();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m323() {
        synchronized (this.f262) {
            try {
                Runnable runnable = (Runnable) this.f260.poll();
                this.f259 = runnable;
                if (runnable != null) {
                    this.f261.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
