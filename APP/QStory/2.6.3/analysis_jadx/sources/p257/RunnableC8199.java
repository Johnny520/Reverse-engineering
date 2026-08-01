package p257;

import androidx.appcompat.app.RunnableC0062;
import com.kongzue.dialogx.interfaces.RunnableC3742;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8199 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ RunnableC3742 f22581;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22582;

    public /* synthetic */ RunnableC8199(RunnableC3742 runnableC3742, int i) {
        this.f22582 = i;
        this.f22581 = runnableC3742;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22582;
        RunnableC3742 runnableC3742 = this.f22581;
        switch (i) {
            case 0:
                C8221 c8221 = new C8221(5);
                C8200 c8200 = (C8200) runnableC3742.f11608;
                c8221.mo8066(c8200.f22592);
                c8200.m13715();
                long j = c8200.f22592.f22570;
                if (j > 0) {
                    c8200.f22584.postDelayed(new RunnableC0062(this, 27), j);
                }
                break;
            default:
                C8200 c82002 = (C8200) runnableC3742.f11608;
                if (c82002.f22592.f22578 > -1) {
                    c82002.m13717(null);
                }
                break;
        }
    }
}
