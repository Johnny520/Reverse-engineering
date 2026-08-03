package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1458e;

    public a(int r1, int r2, java.lang.String r3, long r4, int r6) {
            r0 = this;
            r0.<init>()
            r0.f1454a = r3
            r0.f1455b = r1
            r0.f1456c = r2
            r0.f1457d = r6
            r0.f1458e = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L34
        L3:
            boolean r0 = r5 instanceof ca.a
            if (r0 != 0) goto L8
            goto L32
        L8:
            ca.a r5 = (ca.a) r5
            java.lang.String r0 = r4.f1454a
            java.lang.String r1 = r5.f1454a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L32
        L15:
            int r0 = r4.f1455b
            int r1 = r5.f1455b
            if (r0 == r1) goto L1c
            goto L32
        L1c:
            int r0 = r4.f1456c
            int r1 = r5.f1456c
            if (r0 == r1) goto L23
            goto L32
        L23:
            int r0 = r4.f1457d
            int r1 = r5.f1457d
            if (r0 == r1) goto L2a
            goto L32
        L2a:
            long r0 = r4.f1458e
            long r2 = r5.f1458e
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L34
        L32:
            r5 = 0
            return r5
        L34:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f1454a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f1455b
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f1456c
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f1457d
            int r0 = eh.a.e(r2, r0, r1)
            long r1 = r3.f1458e
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", durationMillis="
            java.lang.String r1 = ", width="
            int r2 = r5.f1455b
            java.lang.String r3 = "ChatLivePhotoMedia(videoPath="
            java.lang.String r4 = r5.f1454a
            java.lang.StringBuilder r0 = eh.a.u(r2, r3, r4, r0, r1)
            java.lang.String r1 = ", height="
            java.lang.String r2 = ", sizeBytes="
            int r3 = r5.f1456c
            int r4 = r5.f1457d
            wb.en.p(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            long r2 = r5.f1458e
            java.lang.String r0 = eh.a.p(r0, r2, r1)
            return r0
    }
}
