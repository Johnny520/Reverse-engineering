package p251;

import androidx.appcompat.app.RunnableC0099;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC8178 implements Executor {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public RunnableC0099 f22541;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public RunnableC0099 f22542;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f22542 == null) {
                this.f22542 = new RunnableC0099(this, 23, runnable);
                AbstractC8175.m13635().execute(this.f22542);
            } else if (this.f22541 == null) {
                this.f22541 = new RunnableC0099(this, 23, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final synchronized void m13672() {
        RunnableC0099 runnableC0099 = this.f22541;
        this.f22542 = runnableC0099;
        this.f22541 = null;
        if (runnableC0099 != null) {
            AbstractC8175.m13635().execute(this.f22542);
        }
    }
}
