package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3742c;

    public q2(boolean r1, long r2, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f3740a = r1
            r0.f3741b = r2
            r0.f3742c = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L26
        L3:
            boolean r0 = r5 instanceof fb.q2
            if (r0 != 0) goto L8
            goto L24
        L8:
            fb.q2 r5 = (fb.q2) r5
            boolean r0 = r4.f3740a
            boolean r1 = r5.f3740a
            if (r0 == r1) goto L11
            goto L24
        L11:
            long r0 = r4.f3741b
            long r2 = r5.f3741b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            goto L24
        L1a:
            java.lang.String r0 = r4.f3742c
            java.lang.String r5 = r5.f3742c
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L26
        L24:
            r5 = 0
            return r5
        L26:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            boolean r0 = r4.f3740a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f3741b
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r1 = r4.f3742c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TreeEntry(directory="
            r0.<init>(r1)
            boolean r1 = r3.f3740a
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.f3741b
            r0.append(r1)
            java.lang.String r1 = ", digest="
            r0.append(r1)
            java.lang.String r1 = r3.f3742c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
