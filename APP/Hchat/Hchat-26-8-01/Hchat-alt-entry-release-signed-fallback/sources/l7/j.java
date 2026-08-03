package l7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends l7.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7882o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r7.b f7883p;

    public j(int r4) {
            r3 = this;
            r3.f7882o = r4
            switch(r4) {
                case 1: goto L1b;
                default: goto L5;
            }
        L5:
            p7.g r4 = new p7.g
            r4.<init>()
            r0 = 1
            r3.<init>(r4, r0)
            r7.p r0 = new r7.p
            r7.f r4 = r4.f10287s
            r0.<init>(r4)
            r3.f7883p = r0
            r3.P(r0)
            return
        L1b:
            p7.a r4 = new p7.a
            r0 = 0
            r4.<init>(r0)
            r1 = 1
            r3.<init>(r4, r1)
            r7.c r1 = new r7.c
            r2 = 0
            r1.<init>(r0, r2)
            r3.f7883p = r1
            r3.P(r1)
            r4.f10271p = r3
            return
    }

    private final void U(p7.b r1) {
            r0 = this;
            return
    }

    private final void W() {
            r0 = this;
            return
    }

    @Override // l7.a
    public void Q(p7.b r2) {
            r1 = this;
            int r0 = r1.f7882o
            switch(r0) {
                case 1: goto L8;
                default: goto L5;
            }
        L5:
            super.Q(r2)
        L8:
            return
    }

    @Override // l7.a
    public final void S() {
            r2 = this;
            int r0 = r2.f7882o
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            r7.b r0 = r2.f7883p
            r7.p r0 = (r7.p) r0
            r7.f r1 = r0.f11576m
            byte[] r0 = r0.f11553k
            int r0 = r0.length
            int r0 = r0 / 4
            r1.k(r0)
            return
    }

    public byte V() {
            r2 = this;
            p7.a r0 = r2.f7869m
            p7.g r0 = (p7.g) r0
            r7.c r0 = r0.f10286r
            byte[] r0 = r0.f11553k
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    @Override // k7.c, k7.a
    public byte[] r() {
            r2 = this;
            int r0 = r2.f7882o
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            byte[] r0 = super.r()
            return r0
        La:
            x7.b r0 = new x7.b
            p7.a r1 = r2.f7869m
            r7.f r1 = r1.f10270o
            int r1 = r1.f11560n
            r0.<init>(r1)
            r2.K(r0)     // Catch: java.io.IOException -> L1b
            r0.close()     // Catch: java.io.IOException -> L1b
        L1b:
            byte[] r0 = r0.toByteArray()
            return r0
    }

    @Override // l7.a
    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.f7882o
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            p7.a r1 = r3.f7869m
            r0.append(r1)
            java.lang.String r1 = " {Body="
            r0.append(r1)
            r7.b r1 = r3.f7883p
            r7.c r1 = (r7.c) r1
            byte[] r1 = r1.f11553k
            int r1 = r1.length
            java.lang.String r2 = "}"
            java.lang.String r0 = j8.b.j(r0, r1, r2)
            return r0
        L22:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.Class<o7.j> r1 = o7.j.class
            k7.a r1 = r3.u(r1)
            o7.j r1 = (o7.j) r1
            if (r1 == 0) goto L3b
            j7.e r1 = r1.f9586m
            goto L3c
        L3b:
            r1 = 0
        L3c:
            if (r1 == 0) goto L4c
            java.lang.String r2 = ", typesCount="
            r0.append(r2)
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            r0.append(r1)
        L4c:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
