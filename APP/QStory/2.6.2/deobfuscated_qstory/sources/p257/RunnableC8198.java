package p257;

import androidx.appcompat.app.RunnableC0062;
import com.kongzue.dialogx.interfaces.RunnableC3741;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8198 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ RunnableC3741 f22582;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22583;

    public /* synthetic */ RunnableC8198(RunnableC3741 runnableC3741, int i) {
        this.f22583 = i;
        this.f22582 = runnableC3741;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22583;
        RunnableC3741 runnableC3741 = this.f22582;
        switch (i) {
            case 0:
                C8220 c8220 = new C8220(5);
                C8199 c8199 = (C8199) runnableC3741.f11603;
                c8220.mo8079(c8199.f22593);
                c8199.m13698();
                long j = c8199.f22593.f22571;
                if (j > 0) {
                    c8199.f22585.postDelayed(new RunnableC0062(this, 27), j);
                }
                break;
            default:
                C8199 c81992 = (C8199) runnableC3741.f11603;
                if (c81992.f22593.f22579 > -1) {
                    c81992.m13700(null);
                }
                break;
        }
    }
}
