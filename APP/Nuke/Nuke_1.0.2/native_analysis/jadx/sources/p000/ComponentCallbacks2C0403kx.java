package p000;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: kx */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0403kx implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0440lx f5840h;

    public ComponentCallbacks2C0403kx(C0440lx c0440lx) {
        this.f5840h = c0440lx;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f5840h.m2983d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C0440lx c0440lx = this.f5840h;
        c0440lx.f6353f.f12208a.clear();
        l92 l92Var = c0440lx.f6354g;
        synchronized (l92Var) {
            l92Var.f5994a.m6416c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C0440lx c0440lx = this.f5840h;
        c0440lx.f6353f.f12208a.clear();
        l92 l92Var = c0440lx.f6354g;
        synchronized (l92Var) {
            l92Var.f5994a.m6416c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.f5840h.f6366s.f5408a.setValue(Boolean.valueOf(z));
    }
}
