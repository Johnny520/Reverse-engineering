package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class r90 {

    /* JADX INFO: renamed from: α */
    public final p000.q90 f9297;

    /* JADX INFO: renamed from: β */
    public final long f9298;

    /* JADX INFO: renamed from: γ */
    public final long f9299;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f9300;

    public r90(p000.q90 r1, long r2, long r4, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.f9297 = r1
            r0.f9298 = r2
            r0.f9299 = r4
            r0.f9300 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2f
        L3:
            boolean r0 = r5 instanceof p000.r90
            if (r0 != 0) goto L8
            goto L2d
        L8:
            r90 r5 = (p000.r90) r5
            q90 r0 = r4.f9297
            q90 r1 = r5.f9297
            if (r0 == r1) goto L11
            goto L2d
        L11:
            long r0 = r4.f9298
            long r2 = r5.f9298
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            goto L2d
        L1a:
            long r0 = r4.f9299
            long r2 = r5.f9299
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            goto L2d
        L23:
            java.lang.String r4 = r4.f9300
            java.lang.String r5 = r5.f9300
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L2f
        L2d:
            r4 = 0
            return r4
        L2f:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            q90 r0 = r4.f9297
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f9298
            int r0 = p000.lz1.m3677(r0, r1, r2)
            r2 = 185422799(0xb0d53cf, double:9.1611035E-316)
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.f9299
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r4 = r4.f9300
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DownloadProgress(phase="
            r0.<init>(r1)
            q90 r1 = r5.f9297
            r0.append(r1)
            java.lang.String r1 = ", completedBytes="
            r0.append(r1)
            long r1 = r5.f9298
            r0.append(r1)
            java.lang.String r1 = ", totalBytes=185422799, bytesPerSecond="
            java.lang.String r2 = ", message="
            long r3 = r5.f9299
            p000.AbstractC0602nx.m4118(r0, r1, r3, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f9300
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
