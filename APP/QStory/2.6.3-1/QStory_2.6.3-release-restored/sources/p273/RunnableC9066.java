package p273;

import androidx.compose.animation.core.C1171;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9066 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9062 f23079;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23080;

    public /* synthetic */ RunnableC9066(C9062 c9062, int i) {
        this.f23080 = i;
        this.f23079 = c9062;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f23080;
        C9062 c9062 = this.f23079;
        switch (i) {
            case 0:
                C1171 c1171 = c9062.f23063;
                if (c1171 != null) {
                    c1171.m1553();
                }
                break;
            default:
                C1171 c11712 = c9062.f23063;
                if (c11712 != null) {
                    c11712.m1538(null);
                    break;
                }
                break;
        }
    }
}
