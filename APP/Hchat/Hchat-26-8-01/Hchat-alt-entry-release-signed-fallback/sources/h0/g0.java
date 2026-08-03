package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.g0 f4892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0.f0 f4894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4895d;

    public g0(w.g0 r1, long r2, h0.f0 r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f4892a = r1
            r0.f4893b = r2
            r0.f4894c = r4
            r0.f4895d = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2b
        L3:
            boolean r0 = r5 instanceof h0.g0
            if (r0 != 0) goto L8
            goto L29
        L8:
            h0.g0 r5 = (h0.g0) r5
            w.g0 r0 = r4.f4892a
            w.g0 r1 = r5.f4892a
            if (r0 == r1) goto L11
            goto L29
        L11:
            long r0 = r4.f4893b
            long r2 = r5.f4893b
            boolean r0 = e1.b.b(r0, r2)
            if (r0 != 0) goto L1c
            goto L29
        L1c:
            h0.f0 r0 = r4.f4894c
            h0.f0 r1 = r5.f4894c
            if (r0 == r1) goto L23
            goto L29
        L23:
            boolean r0 = r4.f4895d
            boolean r5 = r5.f4895d
            if (r0 == r5) goto L2b
        L29:
            r5 = 0
            return r5
        L2b:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            w.g0 r0 = r4.f4892a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f4893b
            int r0 = eh.a.f(r0, r1, r2)
            h0.f0 r2 = r4.f4894c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r4.f4895d
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SelectionHandleInfo(handle="
            r0.<init>(r1)
            w.g0 r1 = r3.f4892a
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.f4893b
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", anchor="
            r0.append(r1)
            h0.f0 r1 = r3.f4894c
            r0.append(r1)
            java.lang.String r1 = ", visible="
            r0.append(r1)
            boolean r1 = r3.f4895d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
