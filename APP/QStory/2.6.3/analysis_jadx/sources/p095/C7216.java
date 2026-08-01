package p095;

import androidx.activity.AbstractC0053;
import kotlinx.coroutines.AbstractC5399;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7216 extends AbstractRunnableC7212 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Runnable f19258;

    public C7216(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f19258 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19258.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f19258;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC5399.m10501(runnable));
        sb.append(", ");
        sb.append(this.f19249);
        sb.append(", ");
        return AbstractC0053.m148(sb, this.f19248 ? "Blocking" : "Non-blocking", ']');
    }
}
