package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends r4.z implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.i f11398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r4.h f11399i;

    public f(v4.i r1) {
            r0 = this;
            r0.<init>()
            r0.f11398h = r1
            r1 = 0
            r0.f11399i = r1
            return
    }

    @Override // r4.a0
    public final void a(r4.p r4) {
            r3 = this;
            v4.i r0 = r3.f11398h
            v4.q r0 = r0.f14096g
            v4.h r0 = r0.f14118k
            r4.g r1 = r4.f11488m
            if (r0 == 0) goto L2a
            java.lang.Object r2 = r1.f11404h
            java.util.TreeMap r2 = (java.util.TreeMap) r2
            java.lang.Object r2 = r2.get(r0)
            r4.h r2 = (r4.h) r2
            if (r2 != 0) goto L27
            r4.k0 r4 = r4.f11490o
            r4.h r2 = new r4.h
            r2.<init>(r0)
            r4.k(r2)
            java.lang.Object r4 = r1.f11404h
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            r4.put(r0, r2)
        L27:
            r3.f11399i = r2
            return
        L2a:
            r1.getClass()
            java.lang.String r4 = "callSite == null"
            bsh.j.c(r4)
            return
    }

    @Override // r4.a0
    public final r4.b0 b() {
            r1 = this;
            r4.b0 r0 = r4.b0.f11364q
            return r0
    }

    @Override // r4.a0
    public final int c() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            r4.f r2 = (r4.f) r2
            v4.i r0 = r1.f11398h
            v4.i r2 = r2.f11398h
            int r2 = r0.d(r2)
            return r2
    }

    @Override // r4.a0
    public final void d(r4.p r3, z4.d r4) {
            r2 = this;
            r4.h r3 = r2.f11399i
            int r3 = r3.f()
            boolean r0 = r4.d()
            if (r0 == 0) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            v4.i r1 = r2.f11398h
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r4.b(r1, r0)
            java.lang.String r0 = a.a.Y0(r3)
            java.lang.String r1 = "call_site_off: "
            java.lang.String r0 = r1.concat(r0)
            r1 = 4
            r4.b(r1, r0)
        L3c:
            r4.k(r3)
            return
    }
}
