package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f3429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3430b;

    public b2(java.util.List r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f3429a = r1
            r0.f3430b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L1f
        L3:
            boolean r0 = r5 instanceof fb.b2
            if (r0 != 0) goto L8
            goto L1d
        L8:
            fb.b2 r5 = (fb.b2) r5
            java.util.List r0 = r4.f3429a
            java.util.List r1 = r5.f3429a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1d
        L15:
            long r0 = r4.f3430b
            long r2 = r5.f3430b
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
            java.util.List r0 = r3.f3429a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.f3430b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CachedAddresses(addresses="
            r0.<init>(r1)
            java.util.List r1 = r3.f3429a
            r0.append(r1)
            java.lang.String r1 = ", expiresAt="
            r0.append(r1)
            long r1 = r3.f3430b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
