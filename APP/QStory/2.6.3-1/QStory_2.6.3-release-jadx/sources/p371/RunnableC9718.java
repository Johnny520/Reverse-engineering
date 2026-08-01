package p371;

import android.os.Handler;
import android.os.Looper;
import p026.AbstractC7017;
import p273.C9037;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9718 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9037 f25403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25404;

    public /* synthetic */ RunnableC9718(C9037 c9037, int i) {
        this.f25404 = i;
        this.f25403 = c9037;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25404;
        C9037 c9037 = this.f25403;
        int i2 = 1;
        switch (i) {
            case 0:
                try {
                    Thread.sleep(5000L);
                    new Handler(Looper.getMainLooper()).post(new RunnableC9718(c9037, i2));
                } catch (Exception e) {
                    String strM14531 = AbstractC9234.m14531(3148);
                    String str = AbstractC7017.f17361;
                    AbstractC7017.m12164(strM14531, e.toString(), e, true);
                    return;
                }
                break;
            default:
                c9037.mo14279(true);
                break;
        }
    }
}
