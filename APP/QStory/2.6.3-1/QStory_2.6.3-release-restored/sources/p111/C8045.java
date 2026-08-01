package p111;

import androidx.activity.AbstractC0900;
import kotlinx.coroutines.AbstractC6231;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8045 extends AbstractRunnableC8041 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Runnable f19603;

    public C8045(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f19603 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19603.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f19603;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC6231.m11060(runnable));
        sb.append(", ");
        sb.append(this.f19594);
        sb.append(", ");
        return AbstractC0900.m708(sb, this.f19593 ? "Blocking" : "Non-blocking", ']');
    }
}
