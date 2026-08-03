package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends v4.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v4.z f14130i = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v4.c0 f14131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.c0 f14132h;

    static {
            v4.z r0 = new v4.z
            v4.c0 r1 = new v4.c0
            java.lang.String r2 = "TYPE"
            r1.<init>(r2)
            v4.c0 r2 = new v4.c0
            java.lang.String r3 = "Ljava/lang/Class;"
            r2.<init>(r3)
            r0.<init>(r1, r2)
            v4.z.f14130i = r0
            return
    }

    public z(v4.c0 r1, v4.c0 r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L13
            if (r2 == 0) goto Lc
            r0.f14131g = r1
            r0.f14132h = r2
            return
        Lc:
            java.lang.String r1 = "descriptor == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L13:
            java.lang.String r1 = "name == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // z4.k
    public final java.lang.String a() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            v4.c0 r1 = r2.f14131g
            java.lang.String r1 = r1.a()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            v4.c0 r1 = r2.f14132h
            java.lang.String r1 = r1.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // v4.a
    public final int e(v4.a r3) {
            r2 = this;
            v4.z r3 = (v4.z) r3
            v4.c0 r0 = r2.f14131g
            v4.c0 r1 = r3.f14131g
            int r0 = r0.d(r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            v4.c0 r0 = r2.f14132h
            v4.c0 r3 = r3.f14132h
            int r3 = r0.d(r3)
            return r3
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof v4.z
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            v4.z r4 = (v4.z) r4
            v4.c0 r0 = r3.f14131g
            v4.c0 r2 = r4.f14131g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            v4.c0 r0 = r3.f14132h
            v4.c0 r4 = r4.f14132h
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            v4.c0 r0 = r2.f14131g
            java.lang.String r0 = r0.f14067g
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            v4.c0 r1 = r2.f14132h
            java.lang.String r1 = r1.f14067g
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // v4.a
    public final boolean i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "nat"
            return r0
    }

    public final w4.c k() {
            r1 = this;
            v4.c0 r0 = r1.f14132h
            java.lang.String r0 = r0.f14067g
            w4.c r0 = w4.c.m(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "nat{"
            r0.<init>(r1)
            java.lang.String r1 = r2.a()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
