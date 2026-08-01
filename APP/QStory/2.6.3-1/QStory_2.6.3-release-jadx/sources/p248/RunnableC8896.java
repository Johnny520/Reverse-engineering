package p248;

import androidx.compose.foundation.lazy.layout.C1575;
import p238.AbstractC8818;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8896 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8897 f22594;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ boolean f22595;

    public RunnableC8896(C8897 c8897, boolean z) {
        this.f22594 = c8897;
        this.f22595 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC8818.m14032();
        C1575 c1575 = this.f22594.f22596;
        boolean z = c1575.f2417;
        boolean z2 = this.f22595;
        c1575.f2417 = z2;
        if (z != z2) {
            ((C8892) c1575.f2416).mo7351(z2);
        }
    }
}
