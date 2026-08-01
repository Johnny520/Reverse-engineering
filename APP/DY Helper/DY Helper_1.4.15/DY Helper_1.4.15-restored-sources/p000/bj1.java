package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bj1 {

    /* JADX INFO: renamed from: α */
    public final int f1741;

    /* JADX INFO: renamed from: β */
    public final int f1742;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f1743;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f1744;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f1745;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f1746;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f1747;

    public bj1(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.f1741 = r1
            r0.f1742 = r2
            r0.f1743 = r3
            r0.f1744 = r4
            r0.f1745 = r5
            r0.f1746 = r6
            r0.f1747 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L50
        L3:
            boolean r0 = r3 instanceof p000.bj1
            if (r0 != 0) goto L8
            goto L4e
        L8:
            bj1 r3 = (p000.bj1) r3
            int r0 = r2.f1741
            int r1 = r3.f1741
            if (r0 == r1) goto L11
            goto L4e
        L11:
            int r0 = r2.f1742
            int r1 = r3.f1742
            if (r0 == r1) goto L18
            goto L4e
        L18:
            java.lang.String r0 = r2.f1743
            java.lang.String r1 = r3.f1743
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            goto L4e
        L23:
            java.lang.String r0 = r2.f1744
            java.lang.String r1 = r3.f1744
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L4e
        L2e:
            java.lang.String r0 = r2.f1745
            java.lang.String r1 = r3.f1745
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L39
            goto L4e
        L39:
            java.lang.String r0 = r2.f1746
            java.lang.String r1 = r3.f1746
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L44
            goto L4e
        L44:
            java.lang.String r2 = r2.f1747
            java.lang.String r3 = r3.f1747
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L50
        L4e:
            r2 = 0
            return r2
        L50:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f1741
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f1742
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r4.f1743
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f1744
            int r0 = p000.a12.m15(r0, r1, r2)
            r2 = 0
            java.lang.String r3 = r4.f1745
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f1746
            if (r3 != 0) goto L2e
            r3 = r2
            goto L32
        L2e:
            int r3 = r3.hashCode()
        L32:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r4 = r4.f1747
            if (r4 != 0) goto L39
            goto L3d
        L39:
            int r2 = r4.hashCode()
        L3d:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", index="
            java.lang.String r1 = ", className="
            java.lang.String r2 = "DebugUnrecognizedItem(page="
            int r3 = r5.f1741
            int r4 = r5.f1742
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", reason="
            java.lang.String r2 = ", awemeId="
            java.lang.String r3 = r5.f1743
            java.lang.String r4 = r5.f1744
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", desc="
            java.lang.String r2 = ", awemeType="
            java.lang.String r3 = r5.f1745
            java.lang.String r4 = r5.f1746
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f1747
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
