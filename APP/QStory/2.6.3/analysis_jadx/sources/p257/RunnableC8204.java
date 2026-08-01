package p257;

import androidx.appcompat.app.RunnableC0062;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.RunnableC3742;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8204 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8200 f22598;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22599;

    public /* synthetic */ RunnableC8204(C8200 c8200, int i) {
        this.f22599 = i;
        this.f22598 = c8200;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22599;
        C8200 c8200 = this.f22598;
        switch (i) {
            case 0:
                AbstractC3738.m8030(new RunnableC3742(c8200, 17, c8200.f22592.f22580));
                break;
            default:
                C8198 c8198 = c8200.f22592;
                if (c8198.f22572 == null) {
                    c8198.f22572 = new C8217(c8200, 5);
                }
                c8198.f22572.m13743(c8198);
                AbstractC3738.m8029(c8200.m13716(null), new RunnableC0062(this, 26));
                break;
        }
    }
}
