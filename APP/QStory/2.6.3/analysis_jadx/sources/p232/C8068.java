package p232;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.compose.foundation.lazy.layout.C0734;
import p222.AbstractC7989;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8068 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0734 f22251;

    public C8068(C0734 c0734) {
        this.f22251 = c0734;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC7989.m13478().post(new RunnableC8067(this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC7989.m13478().post(new RunnableC8067(this, false));
    }
}
