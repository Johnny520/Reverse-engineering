package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wr0 {

    /* JADX INFO: renamed from: δ */
    public static final p000.wr0 f11805 = null;

    /* JADX INFO: renamed from: α */
    public final float f11806;

    /* JADX INFO: renamed from: β */
    public final int f11807;

    /* JADX INFO: renamed from: γ */
    public final int f11808;

    static {
            wr0 r0 = new wr0
            float r1 = p000.tr0.f10433
            r2 = 17
            r3 = 0
            r0.<init>(r1, r2, r3)
            p000.wr0.f11805 = r0
            return
    }

    public wr0(float r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f11806 = r1
            r0.f11807 = r2
            r0.f11808 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.wr0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wr0 r5 = (p000.wr0) r5
            float r1 = r5.f11806
            float r3 = p000.tr0.f10432
            float r3 = r4.f11806
            int r1 = java.lang.Float.compare(r3, r1)
            if (r1 != 0) goto L25
            int r1 = r4.f11807
            int r3 = r5.f11807
            if (r1 != r3) goto L25
            int r4 = r4.f11808
            int r5 = r5.f11808
            if (r4 != r5) goto L25
            return r0
        L25:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = p000.tr0.f10432
            float r0 = r3.f11806
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f11807
            int r0 = p000.a12.m14(r2, r0, r1)
            int r3 = r3.f11808
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LineHeightStyle(alignment="
            r0.<init>(r1)
            float r1 = r5.f11806
            java.lang.String r1 = p000.tr0.m5736(r1)
            r0.append(r1)
            java.lang.String r1 = ", trim="
            r0.append(r1)
            java.lang.String r1 = "Invalid"
            int r2 = r5.f11807
            r3 = 1
            if (r2 != r3) goto L1f
            java.lang.String r2 = "LineHeightStyle.Trim.FirstLineTop"
            goto L33
        L1f:
            r4 = 16
            if (r2 != r4) goto L26
            java.lang.String r2 = "LineHeightStyle.Trim.LastLineBottom"
            goto L33
        L26:
            r4 = 17
            if (r2 != r4) goto L2d
            java.lang.String r2 = "LineHeightStyle.Trim.Both"
            goto L33
        L2d:
            if (r2 != 0) goto L32
            java.lang.String r2 = "LineHeightStyle.Trim.None"
            goto L33
        L32:
            r2 = r1
        L33:
            r0.append(r2)
            java.lang.String r2 = ",mode="
            r0.append(r2)
            int r5 = r5.f11808
            if (r5 != 0) goto L42
            java.lang.String r1 = "LineHeightStyle.Mode.Fixed"
            goto L4c
        L42:
            if (r5 != r3) goto L47
            java.lang.String r1 = "LineHeightStyle.Mode.Minimum"
            goto L4c
        L47:
            r2 = 2
            if (r5 != r2) goto L4c
            java.lang.String r1 = "LineHeightStyle.Mode.Tight"
        L4c:
            r0.append(r1)
            r5 = 41
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
