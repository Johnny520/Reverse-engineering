package p153;

import android.os.Handler;
import com.kongzue.dialogx.interfaces.RunnableC3741;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7604 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7596 f20629;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Handler f20630;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CallableC7597 f20631;

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f20631.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f20630.post(new RunnableC3741(11, this.f20629, objCall, false));
    }
}
