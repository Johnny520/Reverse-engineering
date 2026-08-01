package p232;

import androidx.compose.foundation.lazy.layout.C0734;
import p222.AbstractC7988;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8066 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8067 f22251;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ boolean f22252;

    public RunnableC8066(C8067 c8067, boolean z) {
        this.f22251 = c8067;
        this.f22252 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC7988.m13445();
        C0734 c0734 = this.f22251.f22253;
        boolean z = c0734.f2071;
        boolean z2 = this.f22252;
        c0734.f2071 = z2;
        if (z != z2) {
            ((C8062) c0734.f2070).mo6746(z2);
        }
    }
}
