package p357y1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import p042d2.C0684d;

/* JADX INFO: renamed from: y1.e1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C5876e1 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5880f1 f23849g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ComponentCallbacks2C5876e1(C5880f1 c5880f1) {
        this.f23849g = c5880f1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f23849g.m10584d(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C5880f1 c5880f1 = this.f23849g;
        c5880f1.f23862f.f2090a.clear();
        C0684d c0684d = c5880f1.f23863g;
        synchronized (c0684d) {
            c0684d.f2091a.m2374c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i9) {
        C5880f1 c5880f1 = this.f23849g;
        c5880f1.f23862f.f2090a.clear();
        C0684d c0684d = c5880f1.f23863g;
        synchronized (c0684d) {
            c0684d.f2091a.m2374c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z9) {
        this.f23849g.f23875s.f24166c.setValue(Boolean.valueOf(z9));
    }
}
