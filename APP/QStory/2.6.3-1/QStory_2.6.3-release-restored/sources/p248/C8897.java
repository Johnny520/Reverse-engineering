package p248;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.compose.foundation.lazy.layout.C1575;
import p238.AbstractC8818;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8897 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1575 f22596;

    public C8897(C1575 c1575) {
        this.f22596 = c1575;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC8818.m14037().post(new RunnableC8896(this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC8818.m14037().post(new RunnableC8896(this, false));
    }
}
