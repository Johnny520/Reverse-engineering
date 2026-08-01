package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nd2 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f7569;

    /* JADX INFO: renamed from: β */
    public final long f7570;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f7571;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f7572;

    /* JADX INFO: renamed from: ε */
    public final long f7573;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f7574;

    public nd2(java.lang.String r1, long r2, java.lang.String r4, java.lang.String r5, long r6, java.lang.String r8) {
            r0 = this;
            r0.<init>()
            r0.f7569 = r1
            r0.f7570 = r2
            r0.f7571 = r4
            r0.f7572 = r5
            r0.f7573 = r6
            r0.f7574 = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L49
        L3:
            boolean r0 = r5 instanceof p000.nd2
            if (r0 != 0) goto L8
            goto L47
        L8:
            nd2 r5 = (p000.nd2) r5
            java.lang.String r0 = r4.f7569
            java.lang.String r1 = r5.f7569
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L47
        L15:
            long r0 = r4.f7570
            long r2 = r5.f7570
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L47
        L1e:
            java.lang.String r0 = r4.f7571
            java.lang.String r1 = r5.f7571
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L47
        L29:
            java.lang.String r0 = r4.f7572
            java.lang.String r1 = r5.f7572
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L34
            goto L47
        L34:
            long r0 = r4.f7573
            long r2 = r5.f7573
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3d
            goto L47
        L3d:
            java.lang.String r4 = r4.f7574
            java.lang.String r5 = r5.f7574
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L49
        L47:
            r4 = 0
            return r4
        L49:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f7569
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f7570
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r2 = r4.f7571
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f7572
            int r0 = p000.a12.m15(r0, r1, r2)
            long r2 = r4.f7573
            int r0 = p000.lz1.m3677(r0, r1, r2)
            r2 = 60
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r4 = r4.f7574
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "XhsDexKitMeta(hostPackageName="
            java.lang.String r1 = ", hostVersionCode="
            java.lang.String r2 = r5.f7569
            long r3 = r5.f7570
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r0, r2, r3, r1)
            java.lang.String r1 = ", hostVersionName="
            java.lang.String r2 = ", hostApkPath="
            java.lang.String r3 = r5.f7571
            java.lang.String r4 = r5.f7572
            p000.AbstractC0602nx.m4119(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", hostLastUpdateTime="
            java.lang.String r2 = ", moduleVersionCode=60, moduleVersionName="
            long r3 = r5.f7573
            p000.AbstractC0602nx.m4118(r0, r1, r3, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f7574
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
