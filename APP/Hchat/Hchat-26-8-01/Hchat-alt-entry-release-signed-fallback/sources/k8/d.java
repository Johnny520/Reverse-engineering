package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f7398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7399b;

    public d(java.lang.String r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f7398a = r1
            r0.f7399b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L1f
        L3:
            boolean r0 = r5 instanceof k8.d
            if (r0 != 0) goto L8
            goto L1d
        L8:
            k8.d r5 = (k8.d) r5
            java.lang.String r0 = r4.f7398a
            java.lang.String r1 = r5.f7398a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1d
        L15:
            long r0 = r4.f7399b
            long r2 = r5.f7399b
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L1f
        L1d:
            r5 = 0
            return r5
        L1f:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f7398a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.f7399b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "TimedInsert(talker="
            java.lang.String r1 = ", createTime="
            java.lang.String r2 = r5.f7398a
            long r3 = r5.f7399b
            java.lang.StringBuilder r0 = eh.a.v(r0, r2, r1, r3)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
