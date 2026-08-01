package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class o30 extends p000.l30 {

    /* JADX INFO: renamed from: β */
    public boolean f7923;

    /* JADX INFO: renamed from: γ */
    public java.io.File[] f7924;

    /* JADX INFO: renamed from: δ */
    public int f7925;

    @Override // p000.q30
    /* JADX INFO: renamed from: α */
    public final java.io.File mo3718() {
            r5 = this;
            boolean r0 = r5.f7923
            java.io.File r1 = r5.f8817
            if (r0 != 0) goto La
            r0 = 1
            r5.f7923 = r0
            return r1
        La:
            java.io.File[] r0 = r5.f7924
            r2 = 0
            if (r0 == 0) goto L16
            int r3 = r5.f7925
            int r4 = r0.length
            if (r3 >= r4) goto L15
            goto L16
        L15:
            return r2
        L16:
            if (r0 != 0) goto L24
            java.io.File[] r0 = r1.listFiles()
            r5.f7924 = r0
            if (r0 == 0) goto L23
            int r0 = r0.length
            if (r0 != 0) goto L24
        L23:
            return r2
        L24:
            java.io.File[] r0 = r5.f7924
            r0.getClass()
            int r1 = r5.f7925
            int r2 = r1 + 1
            r5.f7925 = r2
            r5 = r0[r1]
            return r5
    }
}
