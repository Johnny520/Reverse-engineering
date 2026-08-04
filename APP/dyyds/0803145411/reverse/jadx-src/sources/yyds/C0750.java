package yyds;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: renamed from: yyds.ᛳᲈᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0750 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2115 f3461;

    public C0750(C2115 c2115) {
        this.f3461 = c2115;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC0181.m743().post(new RunnableC0773(this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC0181.m743().post(new RunnableC0773(this, false));
    }
}
