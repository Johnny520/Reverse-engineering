package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class r72 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f9282;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f9283;

    /* JADX INFO: renamed from: γ */
    public final long f9284;

    /* JADX INFO: renamed from: δ */
    public final long f9285;

    public r72(java.lang.String r1, java.lang.String r2, long r3, long r5) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f9282 = r1
            r0.f9283 = r2
            r0.f9284 = r3
            r0.f9285 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L33
        L3:
            boolean r0 = r5 instanceof p000.r72
            if (r0 != 0) goto L8
            goto L31
        L8:
            r72 r5 = (p000.r72) r5
            java.lang.String r0 = r4.f9282
            java.lang.String r1 = r5.f9282
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.String r0 = r4.f9283
            java.lang.String r1 = r5.f9283
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            long r0 = r4.f9284
            long r2 = r5.f9284
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L29
            goto L31
        L29:
            long r0 = r4.f9285
            long r4 = r5.f9285
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L33
        L31:
            r4 = 0
            return r4
        L33:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f9282
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9283
            int r0 = p000.a12.m15(r0, r1, r2)
            long r2 = r4.f9284
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r1 = r4.f9285
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", responseUrl="
            java.lang.String r1 = ", totalBytes="
            java.lang.String r2 = "DownloadResult(requestUrl="
            java.lang.String r3 = r5.f9282
            java.lang.String r4 = r5.f9283
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            long r1 = r5.f9284
            r0.append(r1)
            java.lang.String r1 = ", downloadedBytes="
            r0.append(r1)
            long r1 = r5.f9285
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
