package p000;

/* JADX INFO: renamed from: ι */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1086 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f13400;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f13401;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f13402;

    public C1086(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f13400 = r1
            r0.f13401 = r2
            r0.f13402 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.C1086
            if (r0 != 0) goto L8
            goto L2a
        L8:
            ι r3 = (p000.C1086) r3
            java.lang.String r0 = r2.f13400
            java.lang.String r1 = r3.f13400
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f13401
            java.lang.String r1 = r3.f13401
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.String r2 = r2.f13402
            java.lang.String r3 = r3.f13402
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f13400
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f13401
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f13402
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", desc="
            java.lang.String r2 = "FeatureSummary(category="
            java.lang.String r3 = r5.f13400
            java.lang.String r4 = r5.f13401
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f13402
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
