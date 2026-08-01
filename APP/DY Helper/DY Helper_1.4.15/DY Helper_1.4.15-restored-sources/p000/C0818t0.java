package p000;

/* JADX INFO: renamed from: t0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0818t0 extends p000.bp0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10096;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.ch1 f10097;

    public /* synthetic */ C0818t0(p000.ch1 r1, int r2) {
            r0 = this;
            r0.f10096 = r2
            r0.f10097 = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f10096
            switch(r0) {
                case 0: goto L1a;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            bh1 r2 = (p000.bh1) r2
            ch1 r1 = r1.f10097
            p000.bh1.m961(r2, r1)
            s62 r1 = p000.s62.f9751
            return r1
        Lf:
            bh1 r2 = (p000.bh1) r2
            ch1 r1 = r1.f10097
            r0 = 0
            p000.bh1.m960(r2, r1, r0, r0)
            s62 r1 = p000.s62.f9751
            return r1
        L1a:
            bh1 r2 = (p000.bh1) r2
            ch1 r1 = r1.f10097
            r0 = 0
            p000.bh1.m958(r2, r1, r0, r0)
            s62 r1 = p000.s62.f9751
            return r1
    }
}
