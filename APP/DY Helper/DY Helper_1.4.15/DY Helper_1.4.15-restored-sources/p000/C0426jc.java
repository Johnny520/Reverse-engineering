package p000;

/* JADX INFO: renamed from: jc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0426jc implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5418;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.C0024an f5419;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f5420;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f5421;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f5422;

    public /* synthetic */ C0426jc(p000.C0024an r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r1 = this;
            r0 = 1
            r1.f5418 = r0
            r1.<init>()
            r1.f5419 = r2
            r1.f5421 = r3
            r1.f5422 = r4
            r1.f5420 = r5
            return
    }

    public /* synthetic */ C0426jc(p000.r01 r2, p000.C0011aa r3, p000.C0024an r4, int r5) {
            r1 = this;
            r0 = 0
            r1.f5418 = r0
            r1.<init>()
            r1.f5421 = r2
            r1.f5422 = r3
            r1.f5419 = r4
            r1.f5420 = r5
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f5418
            switch(r0) {
                case 0: goto L20;
                default: goto L5;
            }
        L5:
            v80 r3 = (p000.v80) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            int r4 = r2.f5420
            int r4 = p000.v81.m6136(r4)
            r4 = r4 | 1
            an r0 = r2.f5419
            java.lang.Object r1 = r2.f5421
            java.lang.Object r2 = r2.f5422
            r0.m182(r1, r2, r3, r4)
        L1d:
            s62 r2 = p000.s62.f9751
            return r2
        L20:
            java.lang.Object r0 = r2.f5421
            r01 r0 = (p000.r01) r0
            java.lang.Object r1 = r2.f5422
            aa r1 = (p000.C0011aa) r1
            v80 r3 = (p000.v80) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            int r4 = r2.f5420
            r4 = r4 | 1
            int r4 = p000.v81.m6136(r4)
            an r2 = r2.f5419
            p000.AbstractC1021yh.m6872(r0, r1, r2, r3, r4)
            goto L1d
    }
}
