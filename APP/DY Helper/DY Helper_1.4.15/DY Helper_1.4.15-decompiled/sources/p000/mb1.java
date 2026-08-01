package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mb1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7058;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f7059;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.view.View f7060;

    public /* synthetic */ mb1(android.app.Activity r1, android.view.View r2, int r3) {
            r0 = this;
            r0.f7058 = r3
            r0.f7059 = r1
            r0.f7060 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f7058
            switch(r0) {
                case 0: goto L59;
                case 1: goto L43;
                case 2: goto L2d;
                case 3: goto L14;
                default: goto L5;
            }
        L5:
            gc1 r3 = (p000.gc1) r3
            r3.getClass()
            android.app.Activity r0 = r2.f7059
            android.view.View r2 = r2.f7060
            p000.xn0.m6733(r0, r2, r3)
            s62 r2 = p000.s62.f9751
            return r2
        L14:
            dc1 r3 = (p000.dc1) r3
            r3.getClass()
            android.app.Activity r0 = r2.f7059
            android.view.View r2 = r2.f7060
            boolean r1 = p000.xn0.m6696(r0, r2, r3)
            if (r1 == 0) goto L2a
            java.lang.String r3 = r3.m1696()
            p000.xn0.m6752(r0, r2, r3)
        L2a:
            s62 r2 = p000.s62.f9751
            return r2
        L2d:
            gc1 r3 = (p000.gc1) r3
            r3.getClass()
            r0 = 0
            android.app.Activity r1 = r2.f7059
            android.view.View r2 = r2.f7060
            boolean r0 = p000.xn0.m6727(r1, r2, r0)
            if (r0 != 0) goto L40
            p000.xn0.m6733(r1, r2, r3)
        L40:
            s62 r2 = p000.s62.f9751
            return r2
        L43:
            gc1 r3 = (p000.gc1) r3
            r3.getClass()
            r0 = 0
            android.app.Activity r1 = r2.f7059
            android.view.View r2 = r2.f7060
            boolean r0 = p000.xn0.m6727(r1, r2, r0)
            if (r0 != 0) goto L56
            p000.xn0.m6733(r1, r2, r3)
        L56:
            s62 r2 = p000.s62.f9751
            return r2
        L59:
            dc1 r3 = (p000.dc1) r3
            r3.getClass()
            android.app.Activity r0 = r2.f7059
            android.view.View r2 = r2.f7060
            boolean r1 = p000.xn0.m6696(r0, r2, r3)
            if (r1 == 0) goto L6f
            java.lang.String r3 = r3.m1696()
            p000.xn0.m6752(r0, r2, r3)
        L6f:
            s62 r2 = p000.s62.f9751
            return r2
    }
}
