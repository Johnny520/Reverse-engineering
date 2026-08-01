package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class k52 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f5760;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f5761;

    /* JADX INFO: renamed from: γ */
    public final int f5762;

    /* JADX INFO: renamed from: δ */
    public final int f5763;

    /* JADX INFO: renamed from: ε */
    public final int f5764;

    /* JADX INFO: renamed from: ζ */
    public final int f5765;

    /* JADX INFO: renamed from: η */
    public final boolean f5766;

    /* JADX INFO: renamed from: θ */
    public final boolean f5767;

    /* JADX INFO: renamed from: ι */
    public final boolean f5768;

    public k52(java.lang.String r1, java.lang.String r2, int r3, int r4, int r5, int r6, boolean r7, boolean r8, boolean r9) {
            r0 = this;
            r0.<init>()
            r0.f5760 = r1
            r0.f5761 = r2
            r0.f5762 = r3
            r0.f5763 = r4
            r0.f5764 = r5
            r0.f5765 = r6
            r0.f5766 = r7
            r0.f5767 = r8
            r0.f5768 = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L52
        L3:
            boolean r0 = r3 instanceof p000.k52
            if (r0 != 0) goto L8
            goto L50
        L8:
            k52 r3 = (p000.k52) r3
            java.lang.String r0 = r2.f5760
            java.lang.String r1 = r3.f5760
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L50
        L15:
            java.lang.String r0 = r2.f5761
            java.lang.String r1 = r3.f5761
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L50
        L20:
            int r0 = r2.f5762
            int r1 = r3.f5762
            if (r0 == r1) goto L27
            goto L50
        L27:
            int r0 = r2.f5763
            int r1 = r3.f5763
            if (r0 == r1) goto L2e
            goto L50
        L2e:
            int r0 = r2.f5764
            int r1 = r3.f5764
            if (r0 == r1) goto L35
            goto L50
        L35:
            int r0 = r2.f5765
            int r1 = r3.f5765
            if (r0 == r1) goto L3c
            goto L50
        L3c:
            boolean r0 = r2.f5766
            boolean r1 = r3.f5766
            if (r0 == r1) goto L43
            goto L50
        L43:
            boolean r0 = r2.f5767
            boolean r1 = r3.f5767
            if (r0 == r1) goto L4a
            goto L50
        L4a:
            boolean r2 = r2.f5768
            boolean r3 = r3.f5768
            if (r2 == r3) goto L52
        L50:
            r2 = 0
            return r2
        L52:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f5760
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f5761
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r3.f5762
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5763
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5764
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5765
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r3.f5766
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f5767
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r3 = r3.f5768
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", viewClass="
            java.lang.String r1 = ", x="
            java.lang.String r2 = "DetectedTab(text="
            java.lang.String r3 = r5.f5760
            java.lang.String r4 = r5.f5761
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", y="
            java.lang.String r2 = ", width="
            int r3 = r5.f5762
            int r4 = r5.f5763
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", height="
            java.lang.String r2 = ", isKnown="
            int r3 = r5.f5764
            int r4 = r5.f5765
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", isProtected="
            java.lang.String r2 = ", willHide="
            boolean r3 = r5.f5766
            boolean r4 = r5.f5767
            p000.AbstractC0602nx.m4120(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            boolean r5 = r5.f5768
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }
}
