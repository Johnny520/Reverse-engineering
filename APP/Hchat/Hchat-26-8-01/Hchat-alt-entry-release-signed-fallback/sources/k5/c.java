package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k5.u f7180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w5.a f7182i;

    public c(k5.u r2, a5.a r3) {
            r1 = this;
            r1.<init>()
            r1.f7180g = r2
            r0 = 0
            int r0 = r3.o(r0)
            r1.f7181h = r0
            w5.a r2 = fb.v0.J(r2, r3)
            r1.f7182i = r2
            return
    }

    public final java.lang.String a() {
            r2 = this;
            k5.u r0 = r2.f7180g
            k5.s r0 = r0.f7280r
            int r1 = r2.f7181h
            java.lang.String r0 = r0.b(r1)
            return r0
    }

    public final w5.a b() {
            r1 = this;
            w5.a r0 = r1.f7182i
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            k5.c r3 = (k5.c) r3
            java.lang.String r0 = r2.a()
            java.lang.String r1 = r3.a()
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L11
            return r0
        L11:
            w5.a r0 = r2.b()
            w5.a r3 = r3.b()
            int r3 = r0.compareTo(r3)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L26
            boolean r0 = r3 instanceof k5.c
            if (r0 == 0) goto L26
            k5.c r3 = (k5.c) r3
            java.lang.String r0 = r2.a()
            java.lang.String r1 = r3.a()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            w5.a r0 = r2.b()
            w5.a r3 = r3.b()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L26
            r3 = 1
            return r3
        L26:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            w5.a r1 = r2.b()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
