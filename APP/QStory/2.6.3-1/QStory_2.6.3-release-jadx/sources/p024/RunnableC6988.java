package p024;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.p001ui.platform.RunnableC2733;
import lin.xposed.hook.view.main.itemview.Update;
import p026.AbstractC7014;
import p091.C7790;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世兰子楪哲苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6988 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC6987 f17290;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17291;

    public /* synthetic */ RunnableC6988(ViewOnClickListenerC6987 viewOnClickListenerC6987, int i) {
        this.f17291 = i;
        this.f17290 = viewOnClickListenerC6987;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17291;
        ViewOnClickListenerC6987 viewOnClickListenerC6987 = this.f17290;
        switch (i) {
            case 0:
                try {
                    Update.detectUpdates();
                    C7790.m12833();
                    new Handler(Looper.getMainLooper()).post(new RunnableC6988(viewOnClickListenerC6987, 1));
                } catch (Exception unused) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC2733(6));
                    return;
                }
                break;
            default:
                viewOnClickListenerC6987.m12117();
                AbstractC7014.m12151(AbstractC9234.m14531(1291));
                break;
        }
    }
}
