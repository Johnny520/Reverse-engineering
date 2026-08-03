package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends w0.b {
    @Override // w0.b
    public final w0.b C(fg.l r3, fg.l r4) {
            r2 = this;
            i0.q0 r0 = new i0.q0
            r1 = 4
            r0.<init>(r3, r1, r4)
            i.x0 r3 = new i.x0
            r4 = 2
            r3.<init>(r0, r4)
            java.lang.Object r3 = w0.m.e(r3)
            w0.f r3 = (w0.f) r3
            w0.b r3 = (w0.b) r3
            return r3
    }

    @Override // w0.b, w0.f
    public final void c() {
            r2 = this;
            java.lang.Object r0 = w0.m.f14786c
            monitor-enter(r0)
            r2.o()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // w0.b, w0.f
    public final void k() {
            r1 = this;
            w0.q.l()
            r0 = 0
            throw r0
    }

    @Override // w0.b, w0.f
    public final void l() {
            r1 = this;
            w0.q.l()
            r0 = 0
            throw r0
    }

    @Override // w0.b, w0.f
    public final void m() {
            r0 = this;
            w0.m.a()
            return
    }

    @Override // w0.b, w0.f
    public final w0.f u(fg.l r3) {
            r2 = this;
            i0.t0 r0 = new i0.t0
            r1 = 1
            r0.<init>(r3, r1)
            i.x0 r3 = new i.x0
            r1 = 2
            r3.<init>(r0, r1)
            java.lang.Object r3 = w0.m.e(r3)
            w0.f r3 = (w0.f) r3
            w0.e r3 = (w0.e) r3
            return r3
    }

    @Override // w0.b
    public final w0.q w() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot"
            r0.<init>(r1)
            throw r0
    }
}
