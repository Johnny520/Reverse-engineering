package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class e01 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f3357;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.de0 f3358;

    public /* synthetic */ e01(p000.de0 r1, int r2) {
            r0 = this;
            r0.f3357 = r2
            r0.f3358 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r2) {
            r1 = this;
            int r0 = r1.f3357
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r2)
            return
        L9:
            r2.getClass()
            f01 r0 = p000.f01.f3708
            de0 r1 = r1.f3358
            java.lang.Object r2 = r2.f5691
            p000.f01.m1983(r1, r2)
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r2) {
            r1 = this;
            int r0 = r1.f3357
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r2)
            return
        L9:
            r2.getClass()
            f01 r0 = p000.f01.f3708
            de0 r1 = r1.f3358
            java.lang.Object r2 = r2.f5691
            p000.f01.m1983(r1, r2)
            return
    }
}
