package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y1.j1 f21979c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21981b;

    static {
            y1.j1 r0 = new y1.j1
            r1 = 0
            r0.<init>(r1, r1)
            y1.j1.f21979c = r0
            return
    }

    public j1(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.f21980a = r1
            r0.f21981b = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof y1.j1
            r2 = 0
            if (r1 != 0) goto La
            goto L16
        La:
            y1.j1 r8 = (y1.j1) r8
            long r3 = r8.f21980a
            long r5 = r7.f21980a
            boolean r1 = u2.l.a(r5, r3)
            if (r1 != 0) goto L17
        L16:
            return r2
        L17:
            long r3 = r7.f21981b
            long r5 = r8.f21981b
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L20
            return r0
        L20:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f21980a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f21981b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
