package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends nd.r implements ud.k, hc.c {
    public final void I(java.lang.String r2) {
            r1 = this;
            bc.a r0 = bc.a.f701l
            nd.o.b(r1, r0, r2)
            return
    }

    public final void J(java.lang.String r2) {
            r1 = this;
            bc.a r0 = bc.a.f700k
            nd.o.b(r1, r0, r2)
            return
    }

    public final void K(java.lang.String r4) {
            r3 = this;
            mh.b r0 = xe.h.f21561c
            ud.u r0 = r3.n()
            xe.h r0 = r0.f13743b
            monitor-enter(r0)
            java.util.HashSet r1 = r0.f21563b     // Catch: java.lang.Throwable -> L23
            r1.add(r3)     // Catch: java.lang.Throwable -> L23
            mh.b r1 = xe.h.f21561c     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = xe.h.b(r3, r4)     // Catch: java.lang.Throwable -> L23
            r1.v(r2)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            bc.a r0 = bc.a.f699j
            nd.o.b(r3, r0, r4)
            md.a r4 = md.a.Z
            r3.w(r4)
            return
        L23:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r4
    }

    public final void L(java.lang.String r2) {
            r1 = this;
            bc.a r0 = bc.a.f699j
            nd.o.b(r1, r0, r2)
            return
    }

    public final void M(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            ud.u r0 = r1.n()
            bc.g r0 = r0.f13742a
            java.lang.String r0 = r0.F
            java.lang.String r3 = xe.s.g(r3)
            java.lang.String r2 = wb.en.h(r2, r0, r3)
            bc.a r3 = bc.a.f699j
            nd.o.b(r1, r3, r2)
            return
    }

    public final boolean N(bc.a r2) {
            r1 = this;
            ud.u r0 = r1.n()
            bc.g r0 = r0.f13742a
            bc.a r0 = r0.H
            int r2 = r2.ordinal()
            int r0 = r0.ordinal()
            if (r2 > r0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public abstract b5.k O();

    public abstract ud.e P();

    public abstract void Q(b5.k r1);
}
