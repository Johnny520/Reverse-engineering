package p267;

import androidx.appcompat.app.RunnableC0946;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC9007 implements Executor {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public RunnableC0946 f22886;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public RunnableC0946 f22887;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f22887 == null) {
                this.f22887 = new RunnableC0946(this, 23, runnable);
                AbstractC9004.m14194().execute(this.f22887);
            } else if (this.f22886 == null) {
                this.f22886 = new RunnableC0946(this, 23, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final synchronized void m14231() {
        RunnableC0946 runnableC0946 = this.f22886;
        this.f22887 = runnableC0946;
        this.f22886 = null;
        if (runnableC0946 != null) {
            AbstractC9004.m14194().execute(this.f22887);
        }
    }
}
