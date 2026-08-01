package p011;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.RunnableC1898;
import com.bumptech.glide.AbstractC3056;
import lin.xposed.hook.view.main.itemview.Update;
import p010.AbstractC6154;
import p075.C6960;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6163 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC6162 f16790;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16791;

    public /* synthetic */ RunnableC6163(ViewOnClickListenerC6162 viewOnClickListenerC6162, int i) {
        this.f16791 = i;
        this.f16790 = viewOnClickListenerC6162;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16791;
        ViewOnClickListenerC6162 viewOnClickListenerC6162 = this.f16790;
        switch (i) {
            case 0:
                try {
                    Update.detectUpdates();
                    C6960.m12246();
                    new Handler(Looper.getMainLooper()).post(new RunnableC6163(viewOnClickListenerC6162, 1));
                } catch (Exception unused) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1898(7));
                    return;
                }
                break;
            default:
                viewOnClickListenerC6162.m11584();
                AbstractC6154.m11561(AbstractC3056.m6668(-3937690763689985447L));
                break;
        }
    }
}
