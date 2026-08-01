package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sb0 {

    /* JADX INFO: renamed from: α */
    public final java.util.List f9810;

    /* JADX INFO: renamed from: β */
    public final java.util.List f9811;

    /* JADX INFO: renamed from: γ */
    public final boolean f9812;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f9813;

    public sb0(java.util.List r1, java.util.List r2, boolean r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f9810 = r1
            r0.f9811 = r2
            r0.f9812 = r3
            r0.f9813 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p000.sb0
            if (r0 != 0) goto L8
            goto L31
        L8:
            sb0 r3 = (p000.sb0) r3
            java.util.List r0 = r2.f9810
            java.util.List r1 = r3.f9810
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.util.List r0 = r2.f9811
            java.util.List r1 = r3.f9811
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            boolean r0 = r2.f9812
            boolean r1 = r3.f9812
            if (r0 == r1) goto L27
            goto L31
        L27:
            java.lang.String r2 = r2.f9813
            java.lang.String r3 = r3.f9813
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f9810
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.f9811
            int r0 = p000.a12.m16(r2, r0, r1)
            boolean r2 = r3.f9812
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r3 = r3.f9813
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GroupApplyLoadResult(groups="
            r0.<init>(r1)
            java.util.List r1 = r2.f9810
            r0.append(r1)
            java.lang.String r1 = ", requests="
            r0.append(r1)
            java.util.List r1 = r2.f9811
            r0.append(r1)
            java.lang.String r1 = ", complete="
            r0.append(r1)
            boolean r1 = r2.f9812
            r0.append(r1)
            java.lang.String r1 = ", warningMessage="
            r0.append(r1)
            java.lang.String r2 = r2.f9813
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
