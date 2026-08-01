package p257;

import androidx.appcompat.app.RunnableC0062;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.RunnableC3741;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8203 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8199 f22599;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22600;

    public /* synthetic */ RunnableC8203(C8199 c8199, int i) {
        this.f22600 = i;
        this.f22599 = c8199;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f22600;
        C8199 c8199 = this.f22599;
        switch (i) {
            case 0:
                AbstractC3737.m8043(new RunnableC3741(c8199, 17, c8199.f22593.f22581));
                break;
            default:
                C8197 c8197 = c8199.f22593;
                if (c8197.f22573 == null) {
                    c8197.f22573 = new C8216(c8199, 5);
                }
                c8197.f22573.m13726(c8197);
                AbstractC3737.m8042(c8199.m13699(null), new RunnableC0062(this, 26));
                break;
        }
    }
}
