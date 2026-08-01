package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kl0 extends p000.AbstractC1099 {

    /* JADX INFO: renamed from: ε */
    public final p000.AbstractC1103 f5996;

    /* JADX INFO: renamed from: ζ */
    public final int f5997;

    /* JADX INFO: renamed from: η */
    public final int f5998;

    public kl0(p000.AbstractC1103 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f5996 = r1
            r0.f5997 = r2
            int r1 = r1.mo2340()
            p000.AbstractC1021yh.m6887(r2, r3, r1)
            int r3 = r3 - r2
            r0.f5998 = r3
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            int r0 = r1.f5998
            p000.AbstractC1021yh.m6885(r2, r0)
            int r0 = r1.f5997
            int r0 = r0 + r2
            б r1 = r1.f5996
            java.lang.Object r1 = r1.get(r0)
            return r1
    }

    @Override // p000.AbstractC1099, java.util.List
    public final java.util.List subList(int r3, int r4) {
            r2 = this;
            int r0 = r2.f5998
            p000.AbstractC1021yh.m6887(r3, r4, r0)
            kl0 r0 = new kl0
            int r1 = r2.f5997
            int r3 = r3 + r1
            int r1 = r1 + r4
            б r2 = r2.f5996
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // p000.AbstractC1089
    /* JADX INFO: renamed from: α */
    public final int mo2340() {
            r0 = this;
            int r0 = r0.f5998
            return r0
    }
}
