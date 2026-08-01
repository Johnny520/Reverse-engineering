package p000;

/* JADX INFO: renamed from: oc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0618oc implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8025;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f8026;

    public /* synthetic */ C0618oc(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f8025 = r1
            r0.f8026 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f8025
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            yw1 r6 = (p000.yw1) r6
            java.lang.Object r0 = p000.ax1.f1362
            monitor-enter(r0)
            long r1 = p000.ax1.f1364     // Catch: java.lang.Throwable -> L1c
            r3 = 1
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L1c
            long r3 = r3 + r1
            p000.ax1.f1364 = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            java.lang.Object r5 = r5.f8026
            a80 r5 = (p000.a80) r5
            ok1 r0 = new ok1
            r0.<init>(r1, r6, r5)
            return r0
        L1c:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L1f:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r5 = r5.f8026
            be r5 = (p000.InterfaceC0074be) r5
            r5.cancel()
            s62 r5 = p000.s62.f9751
            return r5
    }
}
