package p257;

import androidx.compose.animation.core.C0325;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8236 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8232 f22735;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22736;

    public /* synthetic */ RunnableC8236(C8232 c8232, int i) {
        this.f22736 = i;
        this.f22735 = c8232;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22736;
        C8232 c8232 = this.f22735;
        switch (i) {
            case 0:
                C0325 c0325 = c8232.f22719;
                if (c0325 != null) {
                    c0325.m992();
                }
                break;
            default:
                C0325 c03252 = c8232.f22719;
                if (c03252 != null) {
                    c03252.m978(null);
                    break;
                }
                break;
        }
    }
}
