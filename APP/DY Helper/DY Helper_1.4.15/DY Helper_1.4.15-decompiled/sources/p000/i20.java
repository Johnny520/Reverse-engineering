package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i20 {

    /* JADX INFO: renamed from: α */
    public final float f4875;

    /* JADX INFO: renamed from: β */
    public final boolean f4876;

    /* JADX INFO: renamed from: γ */
    public final boolean f4877;

    /* JADX INFO: renamed from: δ */
    public final int f4878;

    /* JADX INFO: renamed from: ε */
    public final int f4879;

    public i20(float r2, boolean r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r1.f4875 = r2
            r1.f4876 = r3
            r1.f4877 = r4
            r1.f4878 = r5
            r0 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 * r0
            int r2 = p000.jx0.m3061(r2)
            int r2 = r2 * 31
            if (r3 == 0) goto L18
            r3 = 1
            goto L1d
        L18:
            if (r4 == 0) goto L1c
            r3 = 2
            goto L1d
        L1c:
            r3 = 0
        L1d:
            int r2 = r2 + r3
            int r2 = r2 * 31
            int r2 = r2 + r5
            r1.f4879 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.i20
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i20 r5 = (p000.i20) r5
            float r1 = r4.f4875
            float r3 = r5.f4875
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            boolean r1 = r4.f4876
            boolean r3 = r5.f4876
            if (r1 == r3) goto L1e
            return r2
        L1e:
            boolean r1 = r4.f4877
            boolean r3 = r5.f4877
            if (r1 == r3) goto L25
            return r2
        L25:
            int r4 = r4.f4878
            int r5 = r5.f4878
            if (r4 == r5) goto L2c
            return r2
        L2c:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f4875
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f4876
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f4877
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r3 = r3.f4878
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StyleSnapshot(textSizeSp="
            r0.<init>(r1)
            float r1 = r2.f4875
            r0.append(r1)
            java.lang.String r1 = ", neonEnabled="
            r0.append(r1)
            boolean r1 = r2.f4876
            r0.append(r1)
            java.lang.String r1 = ", solidNeonEnabled="
            r0.append(r1)
            boolean r1 = r2.f4877
            r0.append(r1)
            java.lang.String r1 = ", color="
            r0.append(r1)
            int r2 = r2.f4878
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
