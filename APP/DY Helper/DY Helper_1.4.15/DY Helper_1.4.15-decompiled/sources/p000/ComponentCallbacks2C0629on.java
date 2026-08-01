package p000;

/* JADX INFO: renamed from: on */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0629on implements android.content.ComponentCallbacks2, android.view.ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.C0693pn f8159;

    public ComponentCallbacks2C0629on(p000.C0693pn r1) {
            r0 = this;
            r0.<init>()
            r0.f8159 = r1
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            pn r0 = r0.f8159
            r0.m4555(r1)
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r1 = this;
            pn r1 = r1.f8159
            n r0 = r1.f8601
            java.lang.Object r0 = r0.f7336
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.clear()
            y21 r1 = r1.f8602
            monitor-enter(r1)
            java.lang.Object r0 = r1.f12428     // Catch: java.lang.Throwable -> L17
            n11 r0 = (p000.n11) r0     // Catch: java.lang.Throwable -> L17
            r0.m3938()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L17:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r1) {
            r0 = this;
            pn r0 = r0.f8159
            n r1 = r0.f8601
            java.lang.Object r1 = r1.f7336
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.clear()
            y21 r0 = r0.f8602
            monitor-enter(r0)
            java.lang.Object r1 = r0.f12428     // Catch: java.lang.Throwable -> L17
            n11 r1 = (p000.n11) r1     // Catch: java.lang.Throwable -> L17
            r1.m3938()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return
        L17:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean r1) {
            r0 = this;
            pn r0 = r0.f8159
            lm0 r0 = r0.f8614
            x91 r0 = r0.f6712
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            return
    }
}
