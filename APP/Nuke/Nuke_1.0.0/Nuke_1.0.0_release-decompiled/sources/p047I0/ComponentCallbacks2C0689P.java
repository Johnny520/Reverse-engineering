package p047I0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import p067N0.C1010d;

/* JADX INFO: renamed from: I0.P */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0689P implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1010d f2207d;

    public ComponentCallbacks2C0689P(C1010d c1010d) {
        this.f2207d = c1010d;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C1010d c1010d = this.f2207d;
        synchronized (c1010d) {
            c1010d.f3126a.m4339c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C1010d c1010d = this.f2207d;
        synchronized (c1010d) {
            c1010d.f3126a.m4339c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        C1010d c1010d = this.f2207d;
        synchronized (c1010d) {
            c1010d.f3126a.m4339c();
        }
    }
}
