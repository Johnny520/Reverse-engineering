package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ws0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11849;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.String f11850;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.r01 f11851;

    public /* synthetic */ ws0(java.lang.String r1, p000.r01 r2, int r3, int r4) {
            r0 = this;
            r0.f11849 = r4
            r0.f11850 = r1
            r0.f11851 = r2
            r0.<init>()
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f11849
            v80 r2 = (p000.v80) r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            switch(r0) {
                case 0: goto L38;
                case 1: goto L2a;
                case 2: goto L1c;
                default: goto Lc;
            }
        Lc:
            r3 = 49
            int r3 = p000.v81.m6136(r3)
            java.lang.String r0 = r1.f11850
            r01 r1 = r1.f11851
            p000.pt0.m4590(r0, r1, r2, r3)
        L19:
            s62 r1 = p000.s62.f9751
            return r1
        L1c:
            r3 = 49
            int r3 = p000.v81.m6136(r3)
            java.lang.String r0 = r1.f11850
            r01 r1 = r1.f11851
            p000.pt0.m4590(r0, r1, r2, r3)
            goto L19
        L2a:
            r3 = 49
            int r3 = p000.v81.m6136(r3)
            java.lang.String r0 = r1.f11850
            r01 r1 = r1.f11851
            p000.jx0.m3038(r0, r1, r2, r3)
            goto L19
        L38:
            r3 = 49
            int r3 = p000.v81.m6136(r3)
            java.lang.String r0 = r1.f11850
            r01 r1 = r1.f11851
            p000.jx0.m3038(r0, r1, r2, r3)
            goto L19
    }
}
