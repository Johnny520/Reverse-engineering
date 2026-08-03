package m9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f8786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f8787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f8789e;

    public b(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f8785a = r1
            r0.f8786b = r3
            r0.f8787c = r4
            r0.f8788d = r2
            r0.f8789e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3a
        L3:
            boolean r0 = r3 instanceof m9.b
            if (r0 != 0) goto L8
            goto L38
        L8:
            m9.b r3 = (m9.b) r3
            int r0 = r2.f8785a
            int r1 = r3.f8785a
            if (r0 == r1) goto L11
            goto L38
        L11:
            java.lang.String r0 = r2.f8786b
            java.lang.String r1 = r3.f8786b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L38
        L1c:
            java.lang.String r0 = r2.f8787c
            java.lang.String r1 = r3.f8787c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L38
        L27:
            int r0 = r2.f8788d
            int r1 = r3.f8788d
            if (r0 == r1) goto L2e
            goto L38
        L2e:
            java.lang.String r0 = r2.f8789e
            java.lang.String r3 = r3.f8789e
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L3a
        L38:
            r3 = 0
            return r3
        L3a:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f8785a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f8786b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f8787c
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.f8788d
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r1 = r3.f8789e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GameResult(value="
            r0.<init>(r1)
            int r1 = r3.f8785a
            r0.append(r1)
            java.lang.String r1 = ", label="
            r0.append(r1)
            java.lang.String r1 = r3.f8786b
            r0.append(r1)
            java.lang.String r1 = ", md5="
            r0.append(r1)
            java.lang.String r1 = r3.f8787c
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            int r1 = r3.f8788d
            r0.append(r1)
            java.lang.String r1 = ", fileName="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f8789e
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
