package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.j f4996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4998c;

    public u(t2.j r1, int r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.f4996a = r1
            r0.f4997b = r2
            r0.f4998c = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof h0.u
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h0.u r8 = (h0.u) r8
            t2.j r1 = r7.f4996a
            t2.j r3 = r8.f4996a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r7.f4997b
            int r3 = r8.f4997b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            long r3 = r7.f4998c
            long r5 = r8.f4998c
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L23
            return r2
        L23:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            t2.j r0 = r3.f4996a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f4997b
            int r0 = eh.a.e(r2, r0, r1)
            long r1 = r3.f4998c
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnchorInfo(direction="
            r0.<init>(r1)
            t2.j r1 = r3.f4996a
            r0.append(r1)
            java.lang.String r1 = ", offset="
            r0.append(r1)
            int r1 = r3.f4997b
            r0.append(r1)
            java.lang.String r1 = ", selectableId="
            r0.append(r1)
            long r1 = r3.f4998c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
