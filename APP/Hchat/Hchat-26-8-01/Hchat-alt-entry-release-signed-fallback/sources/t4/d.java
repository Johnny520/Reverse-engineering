package t4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v4.c0 f13076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.a f13077h;

    public d(v4.c0 r1, v4.a r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L13
            if (r2 == 0) goto Lc
            r0.f13076g = r1
            r0.f13077h = r2
            return
        Lc:
            java.lang.String r1 = "value == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L13:
            java.lang.String r1 = "name == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            t4.d r3 = (t4.d) r3
            v4.c0 r0 = r2.f13076g
            v4.c0 r1 = r3.f13076g
            int r0 = r0.d(r1)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            v4.a r0 = r2.f13077h
            v4.a r3 = r3.f13077h
            int r3 = r0.d(r3)
            return r3
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof t4.d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            t4.d r4 = (t4.d) r4
            v4.c0 r0 = r3.f13076g
            v4.c0 r2 = r4.f13076g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            v4.a r0 = r3.f13077h
            v4.a r4 = r4.f13077h
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            v4.c0 r0 = r2.f13076g
            java.lang.String r0 = r0.f14067g
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            v4.a r1 = r2.f13077h
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            v4.c0 r1 = r2.f13076g
            java.lang.String r1 = r1.a()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            v4.a r1 = r2.f13077h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
