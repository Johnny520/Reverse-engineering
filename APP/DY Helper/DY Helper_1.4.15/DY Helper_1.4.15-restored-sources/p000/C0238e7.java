package p000;

/* JADX INFO: renamed from: e7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0238e7 implements java.lang.Iterable, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3426;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f3427;

    public /* synthetic */ C0238e7(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f3426 = r1
            r0.f3427 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            int r0 = r1.f3426
            switch(r0) {
                case 0: goto L1f;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f3427
            wr r1 = (p000.C0957wr) r1
            vr r0 = new vr
            r0.<init>(r1)
            return r0
        Lf:
            rw r0 = new rw
            java.lang.Object r1 = r1.f3427
            bi r1 = (p000.C0078bi) r1
            java.util.List r1 = r1.f1720
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
        L1f:
            java.lang.Object r1 = r1.f3427
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            τ r0 = new τ
            r0.<init>(r1)
            return r0
    }
}
