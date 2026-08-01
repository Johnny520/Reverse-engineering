package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class aj1 {

    /* JADX INFO: renamed from: α */
    public final int f282;

    /* JADX INFO: renamed from: β */
    public final int f283;

    /* JADX INFO: renamed from: γ */
    public final int f284;

    /* JADX INFO: renamed from: δ */
    public final int f285;

    /* JADX INFO: renamed from: ε */
    public final int f286;

    /* JADX INFO: renamed from: ζ */
    public final boolean f287;

    /* JADX INFO: renamed from: η */
    public final long f288;

    /* JADX INFO: renamed from: θ */
    public final boolean f289;

    /* JADX INFO: renamed from: ι */
    public final java.lang.String f290;

    public aj1(int r1, int r2, int r3, int r4, int r5, boolean r6, long r7, boolean r9, java.lang.String r10) {
            r0 = this;
            r0.<init>()
            r0.f282 = r1
            r0.f283 = r2
            r0.f284 = r3
            r0.f285 = r4
            r0.f286 = r5
            r0.f287 = r6
            r0.f288 = r7
            r0.f289 = r9
            r0.f290 = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L50
        L3:
            boolean r0 = r5 instanceof p000.aj1
            if (r0 != 0) goto L8
            goto L4e
        L8:
            aj1 r5 = (p000.aj1) r5
            int r0 = r4.f282
            int r1 = r5.f282
            if (r0 == r1) goto L11
            goto L4e
        L11:
            int r0 = r4.f283
            int r1 = r5.f283
            if (r0 == r1) goto L18
            goto L4e
        L18:
            int r0 = r4.f284
            int r1 = r5.f284
            if (r0 == r1) goto L1f
            goto L4e
        L1f:
            int r0 = r4.f285
            int r1 = r5.f285
            if (r0 == r1) goto L26
            goto L4e
        L26:
            int r0 = r4.f286
            int r1 = r5.f286
            if (r0 == r1) goto L2d
            goto L4e
        L2d:
            boolean r0 = r4.f287
            boolean r1 = r5.f287
            if (r0 == r1) goto L34
            goto L4e
        L34:
            long r0 = r4.f288
            long r2 = r5.f288
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3d
            goto L4e
        L3d:
            boolean r0 = r4.f289
            boolean r1 = r5.f289
            if (r0 == r1) goto L44
            goto L4e
        L44:
            java.lang.String r4 = r4.f290
            java.lang.String r5 = r5.f290
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L50
        L4e:
            r4 = 0
            return r4
        L50:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f282
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f283
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r4.f284
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r4.f285
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r4.f286
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r4.f287
            int r0 = p000.lz1.m3678(r0, r1, r2)
            long r2 = r4.f288
            int r0 = p000.lz1.m3677(r0, r1, r2)
            boolean r2 = r4.f289
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r4 = r4.f290
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", rawCount="
            java.lang.String r1 = ", recognizedCount="
            java.lang.String r2 = "DebugPageInfo(page="
            int r3 = r5.f282
            int r4 = r5.f283
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", unrecognizedCount="
            java.lang.String r2 = ", totalRecognized="
            int r3 = r5.f284
            int r4 = r5.f285
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            int r1 = r5.f286
            r0.append(r1)
            java.lang.String r1 = ", hasMore="
            r0.append(r1)
            boolean r1 = r5.f287
            r0.append(r1)
            java.lang.String r1 = ", nextCursor="
            r0.append(r1)
            long r1 = r5.f288
            r0.append(r1)
            java.lang.String r1 = ", tailProbe="
            r0.append(r1)
            boolean r1 = r5.f289
            r0.append(r1)
            java.lang.String r1 = ", source="
            java.lang.String r2 = ")"
            java.lang.String r5 = r5.f290
            java.lang.String r5 = p000.AbstractC0602nx.m4133(r0, r1, r5, r2)
            return r5
    }
}
