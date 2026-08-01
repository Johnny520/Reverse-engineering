package p251;

import androidx.appcompat.app.RunnableC0099;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC8177 implements Executor {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public RunnableC0099 f22542;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public RunnableC0099 f22543;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        try {
            if (this.f22543 == null) {
                this.f22543 = new RunnableC0099(this, 23, runnable);
                AbstractC8174.m13623().execute(this.f22543);
            } else if (this.f22542 == null) {
                this.f22542 = new RunnableC0099(this, 23, runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final synchronized void m13648() {
        RunnableC0099 runnableC0099 = this.f22542;
        this.f22543 = runnableC0099;
        this.f22542 = null;
        if (runnableC0099 != null) {
            AbstractC8174.m13623().execute(this.f22543);
        }
    }
}
