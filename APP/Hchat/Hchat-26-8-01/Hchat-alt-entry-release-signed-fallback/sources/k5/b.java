package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k5.u f7173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7176j;

    public b(k5.u r3, int r4) {
            r2 = this;
            r2.<init>()
            r2.f7173g = r3
            androidx.lifecycle.x r3 = r3.f7264b
            r3.getClass()
            a5.a r0 = new a5.a
            r1 = 5
            r0.<init>(r4, r1, r3)
            int r3 = r0.n()
            r2.f7174h = r3
            r3 = 0
            int r3 = r0.o(r3)
            r2.f7175i = r3
            int r3 = r0.f56h
            r2.f7176j = r3
            return
    }

    public final k5.a a() {
            r7 = this;
            k5.u r0 = r7.f7173g
            androidx.lifecycle.x r3 = r0.f7264b
            r3.getClass()
            a5.a r0 = new a5.a
            r1 = 5
            int r2 = r7.f7176j
            r0.<init>(r2, r1, r3)
            r1 = 0
            int r5 = r0.o(r1)
            k5.a r1 = new k5.a
            int r4 = r0.f56h
            r6 = 0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            k5.b r3 = (k5.b) r3
            int r0 = r3.f7174h
            int r1 = r2.f7174h
            int r0 = java.lang.Integer.compare(r1, r0)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.lang.String r0 = r2.getType()
            java.lang.String r1 = r3.getType()
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L1c
            return r0
        L1c:
            k5.a r0 = r2.a()
            k5.a r3 = r3.a()
            int r3 = d6.d.c(r0, r3)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof k5.b
            if (r0 == 0) goto L2a
            k5.b r3 = (k5.b) r3
            int r0 = r3.f7174h
            int r1 = r2.f7174h
            if (r1 != r0) goto L2a
            java.lang.String r0 = r2.getType()
            java.lang.String r1 = r3.getType()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
            k5.a r0 = r2.a()
            k5.a r3 = r3.a()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L2a
            r3 = 1
            return r3
        L2a:
            r3 = 0
            return r3
    }

    public final java.lang.String getType() {
            r2 = this;
            k5.u r0 = r2.f7173g
            k5.s r0 = r0.f7281s
            int r1 = r2.f7175i
            java.lang.String r0 = r0.b(r1)
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f7174h
            int r0 = r0 * 31
            java.lang.String r1 = r2.getType()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            k5.a r0 = r2.a()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
