package p257;

import androidx.compose.animation.core.C0325;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8237 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8233 f22734;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22735;

    public /* synthetic */ RunnableC8237(C8233 c8233, int i) {
        this.f22735 = i;
        this.f22734 = c8233;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22735;
        C8233 c8233 = this.f22734;
        switch (i) {
            case 0:
                C0325 c0325 = c8233.f22718;
                if (c0325 != null) {
                    c0325.m993();
                }
                break;
            default:
                C0325 c03252 = c8233.f22718;
                if (c03252 != null) {
                    c03252.m978(null);
                    break;
                }
                break;
        }
    }
}
