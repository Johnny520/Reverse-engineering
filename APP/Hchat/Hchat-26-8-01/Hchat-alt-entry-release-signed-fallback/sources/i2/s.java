package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2.d f6388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6390c;

    public s(q2.d r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f6388a = r1
            r0.f6389b = r2
            r0.f6390c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof i2.s
            if (r0 != 0) goto L8
            goto L22
        L8:
            i2.s r3 = (i2.s) r3
            q2.d r0 = r2.f6388a
            q2.d r1 = r3.f6388a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L22
        L15:
            int r0 = r2.f6389b
            int r1 = r3.f6389b
            if (r0 == r1) goto L1c
            goto L22
        L1c:
            int r0 = r2.f6390c
            int r3 = r3.f6390c
            if (r0 == r3) goto L24
        L22:
            r3 = 0
            return r3
        L24:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            q2.d r0 = r3.f6388a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f6389b
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.f6390c
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParagraphIntrinsicInfo(intrinsics="
            r0.<init>(r1)
            q2.d r1 = r3.f6388a
            r0.append(r1)
            java.lang.String r1 = ", startIndex="
            r0.append(r1)
            int r1 = r3.f6389b
            r0.append(r1)
            java.lang.String r1 = ", endIndex="
            r0.append(r1)
            int r1 = r3.f6390c
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
