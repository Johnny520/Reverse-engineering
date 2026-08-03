package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends r4.u0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f11409g;

    public h0(r4.p r2, int r3) {
            r1 = this;
            r1.f11408f = r3
            switch(r3) {
                case 1: goto L45;
                case 2: goto L37;
                case 3: goto L29;
                case 4: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = "method_handles"
            r0 = 8
            r1.<init>(r3, r2, r0)
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r1.f11409g = r2
            return
        L14:
            r3 = 0
            r0 = 4
            r1.<init>(r3, r2, r0)
            r4.x r2 = new r4.x
            r2.<init>()
            r3 = 0
            r2.g(r3)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.f11409g = r2
            return
        L29:
            java.lang.String r3 = "type_ids"
            r0 = 4
            r1.<init>(r3, r2, r0)
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r1.f11409g = r2
            return
        L37:
            java.lang.String r3 = "string_ids"
            r0 = 4
            r1.<init>(r3, r2, r0)
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r1.f11409g = r2
            return
        L45:
            java.lang.String r3 = "proto_ids"
            r0 = 4
            r1.<init>(r3, r2, r0)
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r1.f11409g = r2
            return
    }

    private final void u() {
            r0 = this;
            return
    }

    @Override // r4.o0
    public final java.util.Collection c() {
            r1 = this;
            int r0 = r1.f11408f
            switch(r0) {
                case 0: goto L25;
                case 1: goto L1c;
                case 2: goto L13;
                case 3: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f11409g
            java.util.List r0 = (java.util.List) r0
            return r0
        La:
            java.lang.Object r0 = r1.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.util.Collection r0 = r0.values()
            return r0
        L13:
            java.lang.Object r0 = r1.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.util.Collection r0 = r0.values()
            return r0
        L1c:
            java.lang.Object r0 = r1.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.util.Collection r0 = r0.values()
            return r0
        L25:
            java.lang.Object r0 = r1.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.util.Collection r0 = r0.values()
            return r0
    }

    @Override // r4.u0
    public final void k() {
            r4 = this;
            int r0 = r4.f11408f
            switch(r0) {
                case 0: goto L66;
                case 1: goto L46;
                case 2: goto L26;
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r0 = r4.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            r4.s0 r2 = (r4.s0) r2
            r2.g(r1)
            int r1 = r1 + 1
            goto L13
        L25:
            return
        L26:
            java.lang.Object r0 = r4.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L33:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r0.next()
            r4.r0 r2 = (r4.r0) r2
            r2.g(r1)
            int r1 = r1 + 1
            goto L33
        L45:
            return
        L46:
            java.lang.Object r0 = r4.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L53:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r0.next()
            r4.n0 r2 = (r4.n0) r2
            r2.g(r1)
            int r1 = r1 + 1
            goto L53
        L65:
            return
        L66:
            java.lang.Object r0 = r4.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L73:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r0.next()
            r4.g0 r2 = (r4.g0) r2
            int r3 = r1 + 1
            r2.g(r1)
            r1 = r3
            goto L73
        L86:
            return
    }

    public int l(v4.c0 r2) {
            r1 = this;
            if (r2 == 0) goto L1d
            r1.f()
            java.lang.Object r0 = r1.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.lang.Object r2 = r0.get(r2)
            r4.r0 r2 = (r4.r0) r2
            if (r2 == 0) goto L16
            int r2 = r2.e()
            return r2
        L16:
            java.lang.String r2 = "not found"
            j8.o.t(r2)
        L1b:
            r2 = 0
            return r2
        L1d:
            java.lang.String r2 = "string == null"
            bsh.j.c(r2)
            goto L1b
    }

    public int m(v4.d0 r1) {
            r0 = this;
            if (r1 == 0) goto L9
            w4.c r1 = r1.f14088g
            int r1 = r0.o(r1)
            return r1
        L9:
            java.lang.String r1 = "type == null"
            bsh.j.c(r1)
            r1 = 0
            return r1
    }

    public int n(w4.a r2) {
            r1 = this;
            if (r2 == 0) goto L1d
            r1.f()
            java.lang.Object r0 = r1.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.lang.Object r2 = r0.get(r2)
            r4.n0 r2 = (r4.n0) r2
            if (r2 == 0) goto L16
            int r2 = r2.e()
            return r2
        L16:
            java.lang.String r2 = "not found"
            j8.o.t(r2)
        L1b:
            r2 = 0
            return r2
        L1d:
            java.lang.String r2 = "prototype == null"
            bsh.j.c(r2)
            goto L1b
    }

    public int o(w4.c r2) {
            r1 = this;
            if (r2 == 0) goto L1d
            r1.f()
            java.lang.Object r0 = r1.f11409g
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.lang.Object r0 = r0.get(r2)
            r4.s0 r0 = (r4.s0) r0
            if (r0 == 0) goto L16
            int r2 = r0.e()
            return r2
        L16:
            java.lang.String r0 = "not found: "
            g1.d.f(r2, r0)
        L1b:
            r2 = 0
            return r2
        L1d:
            java.lang.String r2 = "type == null"
            bsh.j.c(r2)
            goto L1b
    }

    public synchronized r4.s0 p(v4.d0 r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L25
            r2.g()     // Catch: java.lang.Throwable -> L21
            w4.c r0 = r3.f14088g     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r2.f11409g     // Catch: java.lang.Throwable -> L21
            java.util.TreeMap r1 = (java.util.TreeMap) r1     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L21
            r4.s0 r1 = (r4.s0) r1     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            r4.s0 r1 = new r4.s0     // Catch: java.lang.Throwable -> L21
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r3 = r2.f11409g     // Catch: java.lang.Throwable -> L21
            java.util.TreeMap r3 = (java.util.TreeMap) r3     // Catch: java.lang.Throwable -> L21
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r3 = move-exception
            goto L2d
        L23:
            monitor-exit(r2)
            return r1
        L25:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = "type == null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L21
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r3
    }

    public synchronized void q(v4.x r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L23
            r2.g()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r2.f11409g     // Catch: java.lang.Throwable -> L1f
            java.util.TreeMap r0 = (java.util.TreeMap) r0     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L1f
            r4.g0 r0 = (r4.g0) r0     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L21
            r4.g0 r0 = new r4.g0     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r2.f11409g     // Catch: java.lang.Throwable -> L1f
            java.util.TreeMap r1 = (java.util.TreeMap) r1     // Catch: java.lang.Throwable -> L1f
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r3 = move-exception
            goto L2b
        L21:
            monitor-exit(r2)
            return
        L23:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "methodHandle == null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1f
        L2b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            throw r3
    }

    public void r(v4.c0 r3) {
            r2 = this;
            r4.r0 r0 = new r4.r0
            r0.<init>(r3)
            monitor-enter(r2)
            r2.g()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.f11409g     // Catch: java.lang.Throwable -> L20
            java.util.TreeMap r1 = (java.util.TreeMap) r1     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L20
            r4.r0 r1 = (r4.r0) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L17
            monitor-exit(r2)
            return
        L17:
            java.lang.Object r1 = r2.f11409g     // Catch: java.lang.Throwable -> L20
            java.util.TreeMap r1 = (java.util.TreeMap) r1     // Catch: java.lang.Throwable -> L20
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            return
        L20:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    public synchronized void s(w4.a r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L23
            r2.g()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r2.f11409g     // Catch: java.lang.Throwable -> L1f
            java.util.TreeMap r0 = (java.util.TreeMap) r0     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L1f
            r4.n0 r0 = (r4.n0) r0     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L21
            r4.n0 r0 = new r4.n0     // Catch: java.lang.Throwable -> L1f
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r2.f11409g     // Catch: java.lang.Throwable -> L1f
            java.util.TreeMap r1 = (java.util.TreeMap) r1     // Catch: java.lang.Throwable -> L1f
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r3 = move-exception
            goto L2b
        L21:
            monitor-exit(r2)
            return
        L23:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "prototype == null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1f
        L2b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            throw r3
    }

    public synchronized void t(w4.c r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L28
            r2.g()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r2.f11409g     // Catch: java.lang.Throwable -> L24
            java.util.TreeMap r0 = (java.util.TreeMap) r0     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L24
            r4.s0 r0 = (r4.s0) r0     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L26
            r4.s0 r0 = new r4.s0     // Catch: java.lang.Throwable -> L24
            v4.d0 r1 = new v4.d0     // Catch: java.lang.Throwable -> L24
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L24
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r2.f11409g     // Catch: java.lang.Throwable -> L24
            java.util.TreeMap r1 = (java.util.TreeMap) r1     // Catch: java.lang.Throwable -> L24
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r3 = move-exception
            goto L30
        L26:
            monitor-exit(r2)
            return
        L28:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L24
            java.lang.String r0 = "type == null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L24
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r3
    }
}
