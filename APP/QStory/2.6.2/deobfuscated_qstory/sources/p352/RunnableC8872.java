package p352;

import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.AbstractC3056;
import p010.AbstractC6157;
import p257.C8207;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8872 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8207 f25007;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25008;

    public /* synthetic */ RunnableC8872(C8207 c8207, int i) {
        this.f25008 = i;
        this.f25007 = c8207;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25008;
        C8207 c8207 = this.f25007;
        int i2 = 1;
        switch (i) {
            case 0:
                try {
                    Thread.sleep(5000L);
                    new Handler(Looper.getMainLooper()).post(new RunnableC8872(c8207, i2));
                } catch (Exception e) {
                    String strM6668 = "setCancelable";
                    String str = AbstractC6157.f16779;
                    AbstractC6157.m11574(strM6668, e.toString(), e, true);
                    return;
                }
                break;
            default:
                c8207.mo13703(true);
                break;
        }
    }
}
