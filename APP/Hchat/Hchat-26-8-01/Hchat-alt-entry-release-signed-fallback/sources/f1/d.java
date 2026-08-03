package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements android.content.ComponentCallbacks2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.f f3042g;

    public d(f1.f r1) {
            r0 = this;
            r0.<init>()
            r0.f3042g = r1
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r4) {
            r3 = this;
            r0 = 40
            if (r4 < r0) goto L20
            f1.f r4 = r3.f3042g
            b.e r0 = r4.f3052e
            r1 = 0
            if (r0 == 0) goto L1e
            monitor-enter(r0)
            java.lang.Object r2 = r0.f332h     // Catch: java.lang.Throwable -> L16
            f.k0 r2 = (f.k0) r2     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L18
            r2.a()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r4 = move-exception
            goto L1c
        L18:
            r0.f333i = r1     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            goto L1e
        L1c:
            monitor-exit(r0)
            throw r4
        L1e:
            r4.f3052e = r1
        L20:
            return
    }
}
