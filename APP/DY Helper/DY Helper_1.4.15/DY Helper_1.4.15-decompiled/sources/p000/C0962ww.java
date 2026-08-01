package p000;

/* JADX INFO: renamed from: ww */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0962ww implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11876;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ float f11877;

    public /* synthetic */ C0962ww(int r1, float r2) {
            r0 = this;
            r0.f11876 = r1
            r0.f11877 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f11876
            switch(r0) {
                case 0: goto L58;
                case 1: goto L3d;
                case 2: goto L1b;
                default: goto L5;
            }
        L5:
            yv r4 = (p000.C1035yv) r4
            r4.getClass()
            ie0 r4 = p000.pt0.f8697
            float r0 = r4.f5060
            la r4 = r4.f5062
            r4.getClass()
            ie0 r1 = new ie0
            float r3 = r3.f11877
            r1.<init>(r0, r3, r4)
            return r1
        L1b:
            yv r4 = (p000.C1035yv) r4
            r4.getClass()
            r0 = 10
            float r0 = (float) r0
            float r1 = r4.mo586()
            float r1 = r1 * r0
            float r3 = r3.f11877
            float r1 = r1 * r3
            r0 = 14
            float r0 = (float) r0
            float r2 = r4.mo586()
            float r2 = r2 * r0
            float r2 = r2 * r3
            r3 = 1
            r0 = 1056964608(0x3f000000, float:0.5)
            p000.pd2.m4483(r4, r1, r2, r3, r0)
            s62 r3 = p000.s62.f9751
            return r3
        L3d:
            za0 r4 = (p000.za0) r4
            r4.getClass()
            r0 = 1
            float r0 = (float) r0
            float r3 = r3.f11877
            float r0 = r0 - r3
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            r1 = 1068648741(0x3fb24925, float:1.3928572)
            float r3 = r3 * r1
            float r3 = r3 + r0
            r4.mo2778(r3)
            r4.mo2786(r3)
            s62 r3 = p000.s62.f9751
            return r3
        L58:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            float r3 = r3.f11877
            float r4 = r4 * r3
            int r3 = (int) r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
    }
}
