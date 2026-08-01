package p000;

/* JADX INFO: renamed from: φ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1098 extends p000.AbstractC1099 implements java.util.RandomAccess {

    /* JADX INFO: renamed from: ε */
    public final p000.AbstractC1099 f13421;

    /* JADX INFO: renamed from: ζ */
    public final int f13422;

    /* JADX INFO: renamed from: η */
    public final int f13423;

    public C1098(p000.AbstractC1099 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f13421 = r1
            r0.f13422 = r2
            int r1 = r1.mo2340()
            p000.jx0.m3046(r2, r3, r1)
            int r3 = r3 - r2
            r0.f13423 = r3
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.f13423
            if (r3 < 0) goto L10
            if (r3 >= r0) goto L10
            int r0 = r2.f13422
            int r0 = r0 + r3
            χ r2 = r2.f13421
            java.lang.Object r2 = r2.get(r0)
            return r2
        L10:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p000.AbstractC0602nx.m4125(r3, r0, r2, r1)
            p000.C1080.m7269(r2)
            r2 = 0
            return r2
    }

    @Override // p000.AbstractC1099, java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.f13423
            p000.jx0.m3046(r3, r4, r0)
            φ r0 = new φ
            int r1 = r2.f13422
            int r3 = r3 + r1
            int r1 = r1 + r4
            χ r2 = r2.f13421
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // p000.AbstractC1089
    /* JADX INFO: renamed from: α */
    public final int mo2340() {
            r0 = this;
            int r0 = r0.f13423
            return r0
    }
}
