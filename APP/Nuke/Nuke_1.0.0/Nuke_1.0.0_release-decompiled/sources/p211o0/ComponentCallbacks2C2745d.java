package p211o0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: renamed from: o0.d */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2745d implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2746e f8727d;

    public ComponentCallbacks2C2745d(C2746e c2746e) {
        this.f8727d = c2746e;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        if (i5 >= 40) {
            this.f8727d.getClass();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
