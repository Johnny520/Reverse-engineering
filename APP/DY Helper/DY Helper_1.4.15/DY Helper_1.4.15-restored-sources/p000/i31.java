package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i31 {

    /* JADX INFO: renamed from: α */
    public p000.q01 f4888;

    /* JADX INFO: renamed from: β */
    public int f4889;

    /* JADX INFO: renamed from: γ */
    public p000.k21 f4890;

    /* JADX INFO: renamed from: δ */
    public p000.k21 f4891;

    /* JADX INFO: renamed from: ε */
    public boolean f4892;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.k31 f4893;

    public i31(p000.k31 r1, p000.q01 r2, int r3, p000.k21 r4, p000.k21 r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f4893 = r1
            r0.f4888 = r2
            r0.f4889 = r3
            r0.f4890 = r4
            r0.f4891 = r5
            r0.f4892 = r6
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m2612(int r3, int r4) {
            r2 = this;
            k21 r0 = r2.f4890
            int r1 = r2.f4889
            int r3 = r3 + r1
            java.lang.Object[] r0 = r0.f5716
            r3 = r0[r3]
            v01 r3 = (p000.v01) r3
            k21 r2 = r2.f4891
            int r1 = r1 + r4
            java.lang.Object[] r2 = r2.f5716
            r2 = r2[r1]
            v01 r2 = (p000.v01) r2
            boolean r4 = p000.ln0.m3626(r3, r2)
            if (r4 == 0) goto L1b
            goto L25
        L1b:
            java.lang.Class r3 = r3.getClass()
            java.lang.Class r2 = r2.getClass()
            if (r3 != r2) goto L27
        L25:
            r2 = 1
            return r2
        L27:
            r2 = 0
            return r2
    }
}
