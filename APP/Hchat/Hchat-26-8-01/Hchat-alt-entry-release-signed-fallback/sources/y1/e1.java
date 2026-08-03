package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements android.content.ComponentCallbacks2, android.view.ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y1.f1 f21880g;

    public e1(y1.f1 r1) {
            r0 = this;
            r0.<init>()
            r0.f21880g = r1
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            y1.f1 r0 = r1.f21880g
            r0.d(r2)
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r2 = this;
            y1.f1 r0 = r2.f21880g
            d2.c r1 = r0.f21893f
            java.util.HashMap r1 = r1.f1970a
            r1.clear()
            d2.d r0 = r0.f21894g
            monitor-enter(r0)
            f.w r1 = r0.f1971a     // Catch: java.lang.Throwable -> L13
            r1.c()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L13:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r2) {
            r1 = this;
            y1.f1 r2 = r1.f21880g
            d2.c r0 = r2.f21893f
            java.util.HashMap r0 = r0.f1970a
            r0.clear()
            d2.d r2 = r2.f21894g
            monitor-enter(r2)
            f.w r0 = r2.f1971a     // Catch: java.lang.Throwable -> L13
            r0.c()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        L13:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean r2) {
            r1 = this;
            y1.f1 r0 = r1.f21880g
            y1.v1 r0 = r0.f21906s
            i0.j1 r0 = r0.f22137c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r2)
            return
    }
}
