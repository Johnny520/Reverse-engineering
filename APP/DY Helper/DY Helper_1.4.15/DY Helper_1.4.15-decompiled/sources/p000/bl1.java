package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bl1 {

    /* JADX INFO: renamed from: α */
    public p000.C1064zn f1777;

    /* JADX INFO: renamed from: β */
    public int f1778;

    /* JADX INFO: renamed from: γ */
    public p000.q80 f1779;

    /* JADX INFO: renamed from: δ */
    public p000.e80 f1780;

    /* JADX INFO: renamed from: ε */
    public int f1781;

    /* JADX INFO: renamed from: ζ */
    public p000.u11 f1782;

    /* JADX INFO: renamed from: η */
    public p000.b21 f1783;

    public bl1(p000.C1064zn r1) {
            r0 = this;
            r0.<init>()
            r0.f1777 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m978() {
            r2 = this;
            zn r0 = r2.f1777
            r1 = 0
            if (r0 == 0) goto L13
            q80 r2 = r2.f1779
            if (r2 == 0) goto Le
            boolean r2 = r2.m4810()
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L13
            r2 = 1
            return r2
        L13:
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final p000.sn0 m979(java.lang.Object r2) {
            r1 = this;
            zn r0 = r1.f1777
            if (r0 == 0) goto Lc
            sn0 r1 = r0.m7199(r1, r2)
            if (r1 != 0) goto Lb
            goto Lc
        Lb:
            return r1
        Lc:
            sn0 r1 = p000.sn0.f9973
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final void m980() {
            r2 = this;
            zn r0 = r2.f1777
            if (r0 == 0) goto Lc
            r1 = 1
            r0.f13190 = r1
            n r0 = r0.f13193
            r0.m3927()
        Lc:
            r0 = 0
            r2.f1777 = r0
            r2.f1782 = r0
            r2.f1783 = r0
            r2.f1780 = r0
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m981(boolean r2) {
            r1 = this;
            int r0 = r1.f1778
            if (r2 == 0) goto L7
            r2 = r0 | 32
            goto L9
        L7:
            r2 = r0 & (-33)
        L9:
            r1.f1778 = r2
            return
    }
}
