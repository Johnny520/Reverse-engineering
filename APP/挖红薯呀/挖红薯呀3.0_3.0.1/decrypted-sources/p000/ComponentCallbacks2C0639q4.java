package p000;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: renamed from: q4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0639q4 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xu0 f5039d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ComponentCallbacks2C0639q4(xu0 xu0Var) {
        this.f5039d = xu0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        xu0 xu0Var = this.f5039d;
        synchronized (xu0Var) {
            xu0Var.f7425a.m4324c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        xu0 xu0Var = this.f5039d;
        synchronized (xu0Var) {
            xu0Var.f7425a.m4324c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        xu0 xu0Var = this.f5039d;
        synchronized (xu0Var) {
            xu0Var.f7425a.m4324c();
        }
    }
}
