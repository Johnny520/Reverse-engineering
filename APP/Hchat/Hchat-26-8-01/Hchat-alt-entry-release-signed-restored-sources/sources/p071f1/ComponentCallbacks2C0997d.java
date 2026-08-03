package p071f1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import p014b.C0126e;
import p069f.C0943k0;

/* JADX INFO: renamed from: f1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0997d implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1001f f3166g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ComponentCallbacks2C0997d(C1001f c1001f) {
        this.f3166g = c1001f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i9) {
        if (i9 >= 40) {
            C1001f c1001f = this.f3166g;
            C0126e c0126e = c1001f.f3176e;
            if (c0126e != null) {
                synchronized (c0126e) {
                    try {
                        C0943k0 c0943k0 = (C0943k0) c0126e.f332h;
                        if (c0943k0 != null) {
                            c0943k0.m2314a();
                        }
                        c0126e.f333i = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            c1001f.f3176e = null;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
