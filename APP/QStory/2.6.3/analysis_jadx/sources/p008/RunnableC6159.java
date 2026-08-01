package p008;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.RunnableC1898;
import lin.xposed.hook.view.main.itemview.Update;
import p010.AbstractC6185;
import p075.C6961;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世兰子楪哲苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6159 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC6158 f16945;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16946;

    public /* synthetic */ RunnableC6159(ViewOnClickListenerC6158 viewOnClickListenerC6158, int i) {
        this.f16946 = i;
        this.f16945 = viewOnClickListenerC6158;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16946;
        ViewOnClickListenerC6158 viewOnClickListenerC6158 = this.f16945;
        switch (i) {
            case 0:
                try {
                    Update.detectUpdates();
                    C6961.m12274();
                    new Handler(Looper.getMainLooper()).post(new RunnableC6159(viewOnClickListenerC6158, 1));
                } catch (Exception unused) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1898(6));
                    return;
                }
                break;
            default:
                viewOnClickListenerC6158.m11558();
                AbstractC6185.m11592(AbstractC8405.m13972(1291));
                break;
        }
    }
}
