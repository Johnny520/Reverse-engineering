package p355;

import android.os.Handler;
import android.os.Looper;
import p010.AbstractC6188;
import p257.C8208;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8889 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8208 f25058;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25059;

    public /* synthetic */ RunnableC8889(C8208 c8208, int i) {
        this.f25059 = i;
        this.f25058 = c8208;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25059;
        C8208 c8208 = this.f25058;
        int i2 = 1;
        switch (i) {
            case 0:
                try {
                    Thread.sleep(5000L);
                    new Handler(Looper.getMainLooper()).post(new RunnableC8889(c8208, i2));
                } catch (Exception e) {
                    String strM13972 = AbstractC8405.m13972(3148);
                    String str = AbstractC6188.f17016;
                    AbstractC6188.m11605(strM13972, e.toString(), e, true);
                    return;
                }
                break;
            default:
                c8208.mo13720(true);
                break;
        }
    }
}
