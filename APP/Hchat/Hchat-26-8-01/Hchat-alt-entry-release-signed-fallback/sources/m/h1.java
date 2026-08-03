package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8184c;

    public h1(long r1, long r3, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f8182a = r1
            r0.f8183b = r3
            r0.f8184c = r5
            return
    }

    public final m.h1 a(m.h1 r8) {
            r7 = this;
            m.h1 r0 = new m.h1
            long r1 = r7.f8182a
            long r3 = r8.f8182a
            long r1 = e1.b.e(r1, r3)
            long r3 = r7.f8183b
            long r5 = r8.f8183b
            long r3 = java.lang.Math.max(r3, r5)
            boolean r5 = r7.f8184c
            r0.<init>(r1, r3, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L26
        L3:
            boolean r0 = r5 instanceof m.h1
            if (r0 != 0) goto L8
            goto L24
        L8:
            m.h1 r5 = (m.h1) r5
            long r0 = r4.f8182a
            long r2 = r5.f8182a
            boolean r0 = e1.b.b(r0, r2)
            if (r0 != 0) goto L15
            goto L24
        L15:
            long r0 = r4.f8183b
            long r2 = r5.f8183b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L24
        L1e:
            boolean r0 = r4.f8184c
            boolean r5 = r5.f8184c
            if (r0 == r5) goto L26
        L24:
            r5 = 0
            return r5
        L26:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f8182a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f8183b
            int r0 = eh.a.f(r0, r1, r2)
            boolean r1 = r4.f8184c
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MouseWheelScrollDelta(value="
            r0.<init>(r1)
            long r1 = r3.f8182a
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", timeMillis="
            r0.append(r1)
            long r1 = r3.f8183b
            r0.append(r1)
            java.lang.String r1 = ", shouldApplyImmediately="
            r0.append(r1)
            boolean r1 = r3.f8184c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
