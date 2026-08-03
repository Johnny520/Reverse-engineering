package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f2497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2499e;

    public a1(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.f2495a = r3
            r0.f2496b = r4
            r0.f2497c = r5
            r0.f2498d = r1
            r0.f2499e = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof eb.a1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            eb.a1 r5 = (eb.a1) r5
            java.lang.String r1 = r4.f2495a
            java.lang.String r3 = r5.f2495a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f2496b
            java.lang.String r3 = r5.f2496b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f2497c
            java.lang.String r3 = r5.f2497c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            int r1 = r4.f2498d
            int r3 = r5.f2498d
            if (r1 == r3) goto L34
            return r2
        L34:
            int r1 = r4.f2499e
            int r5 = r5.f2499e
            if (r1 == r5) goto L3b
            return r2
        L3b:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f2495a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f2496b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f2497c
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.f2498d
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.f2499e
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", url="
            java.lang.String r1 = ", aesKey="
            java.lang.String r2 = "ImageDownloadRequest(md5="
            java.lang.String r3 = r5.f2495a
            java.lang.String r4 = r5.f2496b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f2497c
            r0.append(r1)
            java.lang.String r1 = ", fileType="
            r0.append(r1)
            int r1 = r5.f2498d
            r0.append(r1)
            java.lang.String r1 = ", totalLen="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r2 = r5.f2499e
            java.lang.String r0 = j8.b.j(r0, r2, r1)
            return r0
    }
}
