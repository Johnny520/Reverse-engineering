package p000;

/* JADX INFO: renamed from: ym */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1026ym implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12680;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ int f12681;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f12682;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f12683;

    public /* synthetic */ C1026ym(int r1, int r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = this;
            r0.f12680 = r2
            r0.f12682 = r3
            r0.f12683 = r4
            r0.f12681 = r1
            r0.<init>()
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f12680
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f12682
            q4[] r0 = (p000.C0711q4[]) r0
            java.lang.Object r1 = r2.f12683
            e80 r1 = (p000.e80) r1
            v80 r3 = (p000.v80) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            int r2 = r2.f12681
            r2 = r2 | 1
            int r2 = p000.v81.m6136(r2)
            p000.AbstractC0978xb.m6579(r0, r1, r3, r2)
        L1f:
            s62 r2 = p000.s62.f9751
            return r2
        L22:
            java.lang.Object r0 = r2.f12682
            an r0 = (p000.C0024an) r0
            v80 r3 = (p000.v80) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            int r4 = r2.f12681
            int r4 = p000.v81.m6136(r4)
            r4 = r4 | 1
            java.lang.Object r2 = r2.f12683
            r0.m181(r2, r3, r4)
            goto L1f
    }
}
