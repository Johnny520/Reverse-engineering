package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u2.k f13348e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13352d;

    static {
            u2.k r0 = new u2.k
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            u2.k.f13348e = r0
            return
    }

    public k(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f13349a = r1
            r0.f13350b = r2
            r0.f13351c = r3
            r0.f13352d = r4
            return
    }

    public final int a() {
            r2 = this;
            int r0 = r2.f13352d
            int r1 = r2.f13350b
            int r0 = r0 - r1
            return r0
    }

    public final long b() {
            r6 = this;
            int r0 = r6.f13349a
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r2 = r6.f13350b
            long r2 = (long) r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof u2.k
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            u2.k r5 = (u2.k) r5
            int r1 = r4.f13349a
            int r3 = r5.f13349a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f13350b
            int r3 = r5.f13350b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.f13351c
            int r3 = r5.f13351c
            if (r1 == r3) goto L21
            return r2
        L21:
            int r1 = r4.f13352d
            int r5 = r5.f13352d
            if (r1 == r5) goto L28
            return r2
        L28:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f13349a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f13350b
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f13351c
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.f13352d
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IntRect.fromLTRB("
            r0.<init>(r1)
            int r1 = r3.f13349a
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r2 = r3.f13350b
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.f13351c
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.f13352d
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
