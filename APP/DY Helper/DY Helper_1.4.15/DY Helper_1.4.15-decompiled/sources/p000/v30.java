package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v30 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11087;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.ch1 f11088;

    public /* synthetic */ v30(p000.ch1 r1, int r2) {
            r0 = this;
            r0.f11087 = r2
            r0.f11088 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f11087
            bh1 r2 = (p000.bh1) r2
            switch(r0) {
                case 0: goto L1e;
                case 1: goto L17;
                case 2: goto L10;
                default: goto L7;
            }
        L7:
            r0 = 0
            ch1 r1 = r1.f11088
            p000.bh1.m960(r2, r1, r0, r0)
        Ld:
            s62 r1 = p000.s62.f9751
            return r1
        L10:
            r0 = 0
            ch1 r1 = r1.f11088
            p000.bh1.m958(r2, r1, r0, r0)
            goto Ld
        L17:
            r0 = 0
            ch1 r1 = r1.f11088
            p000.bh1.m960(r2, r1, r0, r0)
            goto Ld
        L1e:
            r0 = 0
            ch1 r1 = r1.f11088
            p000.bh1.m960(r2, r1, r0, r0)
            goto Ld
    }
}
