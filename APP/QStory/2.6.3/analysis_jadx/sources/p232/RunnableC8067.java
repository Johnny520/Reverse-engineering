package p232;

import androidx.compose.foundation.lazy.layout.C0734;
import p222.AbstractC7989;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8067 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8068 f22249;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ boolean f22250;

    public RunnableC8067(C8068 c8068, boolean z) {
        this.f22249 = c8068;
        this.f22250 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC7989.m13473();
        C0734 c0734 = this.f22249.f22251;
        boolean z = c0734.f2072;
        boolean z2 = this.f22250;
        c0734.f2072 = z2;
        if (z != z2) {
            ((C8063) c0734.f2071).mo6791(z2);
        }
    }
}
