package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rb0 {

    /* JADX INFO: renamed from: α */
    public final int f9321;

    /* JADX INFO: renamed from: β */
    public final int f9322;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f9323;

    public rb0(int r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f9321 = r1
            r0.f9322 = r2
            r0.f9323 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof p000.rb0
            if (r0 != 0) goto L8
            goto L22
        L8:
            rb0 r3 = (p000.rb0) r3
            int r0 = r2.f9321
            int r1 = r3.f9321
            if (r0 == r1) goto L11
            goto L22
        L11:
            int r0 = r2.f9322
            int r1 = r3.f9322
            if (r0 == r1) goto L18
            goto L22
        L18:
            java.lang.String r2 = r2.f9323
            java.lang.String r3 = r3.f9323
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f9321
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f9322
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f9323
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", totalGroupCount="
            java.lang.String r1 = ", currentGroupName="
            java.lang.String r2 = "GroupApplyLoadProgress(scannedGroupCount="
            int r3 = r5.f9321
            int r4 = r5.f9322
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f9323
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
