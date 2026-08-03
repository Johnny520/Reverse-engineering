package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5228a;

    public j(long r1) {
            r0 = this;
            r0.<init>()
            r0.f5228a = r1
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof ha.j
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ha.j r8 = (ha.j) r8
            long r3 = r7.f5228a
            long r5 = r8.f5228a
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L15
            return r2
        L15:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f5228a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State(until="
            r0.<init>(r1)
            long r1 = r3.f5228a
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
