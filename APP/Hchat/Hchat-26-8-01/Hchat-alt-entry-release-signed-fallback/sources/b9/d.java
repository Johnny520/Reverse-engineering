package b9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f534c;

    public d(int r1, java.lang.String r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.f532a = r3
            r0.f533b = r2
            r0.f534c = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L26
        L3:
            boolean r0 = r5 instanceof b9.d
            if (r0 != 0) goto L8
            goto L24
        L8:
            b9.d r5 = (b9.d) r5
            long r0 = r4.f532a
            long r2 = r5.f532a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L24
        L13:
            java.lang.String r0 = r4.f533b
            java.lang.String r1 = r5.f533b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L24
        L1e:
            int r0 = r4.f534c
            int r5 = r5.f534c
            if (r0 == r5) goto L26
        L24:
            r5 = 0
            return r5
        L26:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f532a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f533b
            int r0 = eh.a.g(r0, r1, r2)
            int r1 = r3.f534c
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BoundTime(createTime="
            r0.<init>(r1)
            long r1 = r3.f532a
            r0.append(r1)
            java.lang.String r1 = ", nativeText="
            r0.append(r1)
            java.lang.String r1 = r3.f533b
            r0.append(r1)
            java.lang.String r1 = ", nativeVisibility="
            r0.append(r1)
            int r1 = r3.f534c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
