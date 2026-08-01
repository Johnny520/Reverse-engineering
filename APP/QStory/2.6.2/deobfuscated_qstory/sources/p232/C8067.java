package p232;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.compose.foundation.lazy.layout.C0734;
import p222.AbstractC7988;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8067 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0734 f22253;

    public C8067(C0734 c0734) {
        this.f22253 = c0734;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC7988.m13450().post(new RunnableC8066(this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC7988.m13450().post(new RunnableC8066(this, false));
    }
}
