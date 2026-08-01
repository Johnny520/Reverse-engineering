package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wa2 {

    /* JADX INFO: renamed from: α */
    public final long f11645;

    /* JADX INFO: renamed from: β */
    public final java.util.List f11646;

    public wa2(long r1, java.util.List r3) {
            r0 = this;
            r0.<init>()
            r0.f11645 = r1
            r0.f11646 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L1f
        L3:
            boolean r0 = r5 instanceof p000.wa2
            if (r0 != 0) goto L8
            goto L1d
        L8:
            wa2 r5 = (p000.wa2) r5
            long r0 = r4.f11645
            long r2 = r5.f11645
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L1d
        L13:
            java.util.List r4 = r4.f11646
            java.util.List r5 = r5.f11646
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1f
        L1d:
            r4 = 0
            return r4
        L1f:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f11645
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            java.util.List r2 = r2.f11646
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PendingCommentReplacement(hostDuration="
            r0.<init>(r1)
            long r1 = r3.f11645
            r0.append(r1)
            java.lang.String r1 = ", wave="
            r0.append(r1)
            java.util.List r3 = r3.f11646
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
