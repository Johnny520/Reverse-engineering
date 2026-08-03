package t2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2.q f13024c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13026b;

    static {
            t2.q r0 = new t2.q
            r1 = 0
            long r2 = x6.d.D(r1)
            long r4 = x6.d.D(r1)
            r0.<init>(r2, r4)
            t2.q.f13024c = r0
            return
    }

    public q(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.f13025a = r1
            r0.f13026b = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof t2.q
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t2.q r8 = (t2.q) r8
            long r3 = r8.f13025a
            long r5 = r7.f13025a
            boolean r1 = u2.o.a(r5, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f13026b
            long r5 = r8.f13026b
            boolean r8 = u2.o.a(r3, r5)
            if (r8 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            u2.p[] r0 = u2.o.f13358b
            long r0 = r3.f13025a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f13026b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextIndent(firstLine="
            r0.<init>(r1)
            long r1 = r3.f13025a
            java.lang.String r1 = u2.o.d(r1)
            r0.append(r1)
            java.lang.String r1 = ", restLine="
            r0.append(r1)
            long r1 = r3.f13026b
            java.lang.String r1 = u2.o.d(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
