package p154e2;

import android.net.ConnectivityManager;
import android.net.Network;
import p068N1.C1013c;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: e2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2028g extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1013c f6759a;

    public C2028g(C1013c c1013c) {
        this.f6759a = c1013c;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        AbstractC2511o.m4457f().post(new RunnableC2027f(this, true));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC2511o.m4457f().post(new RunnableC2027f(this, false));
    }
}
