package p153;

import android.os.Handler;
import com.kongzue.dialogx.interfaces.RunnableC3742;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7605 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7597 f20624;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Handler f20625;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public CallableC7598 f20626;

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f20626.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f20625.post(new RunnableC3742(11, this.f20624, objCall, false));
    }
}
