package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d12 extends p000.bp0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.r01 f2842;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.e80 f2843;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f2844;

    public d12(p000.r01 r1, p000.e80 r2, int r3) {
            r0 = this;
            r0.f2842 = r1
            r0.f2843 = r2
            r0.f2844 = r3
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            v80 r2 = (p000.v80) r2
            java.lang.Number r3 = (java.lang.Number) r3
            r3.intValue()
            int r3 = r1.f2844
            r3 = r3 | 1
            int r3 = p000.v81.m6136(r3)
            r01 r0 = r1.f2842
            e80 r1 = r1.f2843
            p000.jx0.m3041(r0, r1, r2, r3)
            s62 r1 = p000.s62.f9751
            return r1
    }
}
