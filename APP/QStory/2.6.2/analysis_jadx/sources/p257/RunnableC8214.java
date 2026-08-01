package p257;

import androidx.recyclerview.widget.C2492;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8214 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8211 f22667;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22668;

    public /* synthetic */ RunnableC8214(C8211 c8211, int i) {
        this.f22668 = i;
        this.f22667 = c8211;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22668;
        C8211 c8211 = this.f22667;
        switch (i) {
            case 0:
                C2492 c2492 = c8211.f22654;
                if (c2492 != null) {
                    c2492.m4926();
                }
                break;
            default:
                C2492 c24922 = c8211.f22654;
                if (c24922 != null) {
                    c24922.m4923(null);
                    break;
                }
                break;
        }
    }
}
