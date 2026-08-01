package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class x41 extends p000.bp0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12050;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.d51 f12051;

    public /* synthetic */ x41(p000.d51 r1, int r2) {
            r0 = this;
            r0.f12050 = r2
            r0.f12051 = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f12050
            switch(r0) {
                case 0: goto L34;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            d51 r4 = r4.f12051
            r4.m1653()
            s62 r4 = p000.s62.f9751
            return r4
        Ld:
            d51 r4 = r4.f12051
            w6 r0 = r4.f2894
            int r1 = r0.mo4827()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L19:
            boolean r1 = r0.hasPrevious()
            r2 = 0
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.previous()
            r3 = r1
            u60 r3 = (p000.u60) r3
            boolean r3 = r3.f10607
            if (r3 == 0) goto L19
            goto L2d
        L2c:
            r1 = r2
        L2d:
            u60 r1 = (p000.u60) r1
            r4.f2895 = r2
            s62 r4 = p000.s62.f9751
            return r4
        L34:
            d51 r4 = r4.f12051
            r4.m1653()
            s62 r4 = p000.s62.f9751
            return r4
    }
}
