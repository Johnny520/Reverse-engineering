package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jy1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f5666;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f5667;

    /* JADX INFO: renamed from: γ */
    public final boolean f5668;

    /* JADX INFO: renamed from: δ */
    public final int f5669;

    /* JADX INFO: renamed from: ε */
    public final int f5670;

    /* JADX INFO: renamed from: ζ */
    public final boolean f5671;

    public jy1(java.lang.String r1, java.lang.String r2, boolean r3, int r4, int r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f5666 = r1
            r0.f5667 = r2
            r0.f5668 = r3
            r0.f5669 = r4
            r0.f5670 = r5
            r0.f5671 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3d
        L3:
            boolean r0 = r3 instanceof p000.jy1
            if (r0 != 0) goto L8
            goto L3b
        L8:
            jy1 r3 = (p000.jy1) r3
            java.lang.String r0 = r2.f5666
            java.lang.String r1 = r3.f5666
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3b
        L15:
            java.lang.String r0 = r2.f5667
            java.lang.String r1 = r3.f5667
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3b
        L20:
            boolean r0 = r2.f5668
            boolean r1 = r3.f5668
            if (r0 == r1) goto L27
            goto L3b
        L27:
            int r0 = r2.f5669
            int r1 = r3.f5669
            if (r0 == r1) goto L2e
            goto L3b
        L2e:
            int r0 = r2.f5670
            int r1 = r3.f5670
            if (r0 == r1) goto L35
            goto L3b
        L35:
            boolean r2 = r2.f5671
            boolean r3 = r3.f5671
            if (r2 == r3) goto L3d
        L3b:
            r2 = 0
            return r2
        L3d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f5666
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f5667
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r3.f5668
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r2 = r3.f5669
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f5670
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r3 = r3.f5671
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", messageSource="
            java.lang.String r1 = ", autoRenewEnabled="
            java.lang.String r2 = "SparkConfig(message="
            java.lang.String r3 = r5.f5666
            java.lang.String r4 = r5.f5667
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            boolean r1 = r5.f5668
            r0.append(r1)
            java.lang.String r1 = ", delaySeconds="
            r0.append(r1)
            int r1 = r5.f5669
            r0.append(r1)
            java.lang.String r1 = ", triggerHour="
            r0.append(r1)
            int r1 = r5.f5670
            r0.append(r1)
            java.lang.String r1 = ", includeGroupChat="
            r0.append(r1)
            boolean r5 = r5.f5671
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
