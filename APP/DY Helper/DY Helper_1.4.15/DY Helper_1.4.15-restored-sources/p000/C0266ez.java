package p000;

/* JADX INFO: renamed from: ez */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0266ez implements p000.ml0 {

    /* JADX INFO: renamed from: ε */
    public final boolean f3687;

    public C0266ez(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f3687 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Empty{"
            r0.<init>(r1)
            boolean r2 = r2.f3687
            if (r2 == 0) goto Le
            java.lang.String r2 = "Active"
            goto L10
        Le:
            java.lang.String r2 = "New"
        L10:
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.String r2 = p000.AbstractC0602nx.m4132(r0, r2, r1)
            return r2
    }

    @Override // p000.ml0
    /* JADX INFO: renamed from: β */
    public final boolean mo1277() {
            r0 = this;
            boolean r0 = r0.f3687
            return r0
    }

    @Override // p000.ml0
    /* JADX INFO: renamed from: δ */
    public final p000.s31 mo1278() {
            r0 = this;
            r0 = 0
            return r0
    }
}
