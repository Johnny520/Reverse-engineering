package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class m30 extends p000.l30 {

    /* JADX INFO: renamed from: β */
    public boolean f6919;

    /* JADX INFO: renamed from: γ */
    public java.io.File[] f6920;

    /* JADX INFO: renamed from: δ */
    public int f6921;

    /* JADX INFO: renamed from: ε */
    public boolean f6922;

    @Override // p000.q30
    /* JADX INFO: renamed from: α */
    public final java.io.File mo3718() {
            r5 = this;
            boolean r0 = r5.f6922
            java.io.File r1 = r5.f8817
            r2 = 1
            if (r0 != 0) goto L15
            java.io.File[] r0 = r5.f6920
            if (r0 != 0) goto L15
            java.io.File[] r0 = r1.listFiles()
            r5.f6920 = r0
            if (r0 != 0) goto L15
            r5.f6922 = r2
        L15:
            java.io.File[] r0 = r5.f6920
            if (r0 == 0) goto L2a
            int r3 = r5.f6921
            int r4 = r0.length
            if (r3 >= r4) goto L2a
            r0.getClass()
            int r1 = r5.f6921
            int r2 = r1 + 1
            r5.f6921 = r2
            r5 = r0[r1]
            return r5
        L2a:
            boolean r0 = r5.f6919
            if (r0 != 0) goto L31
            r5.f6919 = r2
            return r1
        L31:
            r5 = 0
            return r5
    }
}
