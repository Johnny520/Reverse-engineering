package p248;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.compose.foundation.lazy.layout.C1575;
import com.bumptech.glide.C3895;
import com.bumptech.glide.load.engine.C3836;
import java.util.HashSet;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8889 implements InterfaceC8890 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3895 f22585;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f22586;

    public C8889(Context context, C3895 c3895) {
        this.f22586 = context.getApplicationContext();
        this.f22585 = c3895;
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335() {
        C8894 c8894M14106 = C8894.m14106(this.f22586);
        C3895 c3895 = this.f22585;
        synchronized (c8894M14106) {
            ((HashSet) c8894M14106.f22589).add(c3895);
            c8894M14106.m14111();
        }
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7337() {
        C8894 c8894M14106 = C8894.m14106(this.f22586);
        C3895 c3895 = this.f22585;
        synchronized (c8894M14106) {
            ((HashSet) c8894M14106.f22589).remove(c3895);
            if (c8894M14106.f22590 && ((HashSet) c8894M14106.f22589).isEmpty()) {
                C1575 c1575 = (C1575) c8894M14106.f22591;
                ((ConnectivityManager) ((C3836) c1575.f2415).get()).unregisterNetworkCallback((C8897) c1575.f2414);
                c8894M14106.f22590 = false;
            }
        }
    }

    @Override // p248.InterfaceC8902
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo7339() {
    }
}
