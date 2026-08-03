package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l8.c f2428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2429b;

    public i(l8.c r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f2428a = r1
            r0.f2429b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L1b
        L3:
            boolean r0 = r5 instanceof e9.i
            if (r0 != 0) goto L8
            goto L19
        L8:
            e9.i r5 = (e9.i) r5
            l8.c r0 = r4.f2428a
            l8.c r1 = r5.f2428a
            if (r0 == r1) goto L11
            goto L19
        L11:
            long r0 = r4.f2429b
            long r2 = r5.f2429b
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L1b
        L19:
            r5 = 0
            return r5
        L1b:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            l8.c r0 = r3.f2428a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.f2429b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NativeMentionRecord(type="
            r0.<init>(r1)
            l8.c r1 = r3.f2428a
            r0.append(r1)
            java.lang.String r1 = ", createdAt="
            r0.append(r1)
            long r1 = r3.f2429b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
