package p095;

import androidx.activity.AbstractC0053;
import kotlinx.coroutines.AbstractC5398;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7215 extends AbstractRunnableC7211 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Runnable f19263;

    public C7215(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f19263 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19263.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f19263;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC5398.m10497(runnable));
        sb.append(", ");
        sb.append(this.f19254);
        sb.append(", ");
        return AbstractC0053.m155(sb, this.f19253 ? "Blocking" : "Non-blocking", ']');
    }
}
