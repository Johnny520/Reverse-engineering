package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends w0.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fg.l f14759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w0.f f14760f;

    public d(long r1, w0.j r3, fg.l r4, w0.f r5) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.f14759e = r4
            r0.f14760f = r5
            r5.k()
            return
    }

    @Override // w0.f
    public final void c() {
            r5 = this;
            w0.f r0 = r5.f14760f
            boolean r1 = r5.f14765c
            if (r1 != 0) goto L24
            long r1 = r5.f14764b
            long r3 = r0.g()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L13
            r5.a()
        L13:
            r0.l()
            r0 = 1
            r5.f14765c = r0
            java.lang.Object r0 = w0.m.f14786c
            monitor-enter(r0)
            r5.o()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            return
        L21:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L24:
            return
    }

    @Override // w0.f
    public final fg.l e() {
            r1 = this;
            fg.l r0 = r1.f14759e
            return r0
    }

    @Override // w0.f
    public final boolean f() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // w0.f
    public final fg.l i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // w0.f
    public final void k() {
            r1 = this;
            w0.q.l()
            r0 = 0
            throw r0
    }

    @Override // w0.f
    public final void l() {
            r1 = this;
            w0.q.l()
            r0 = 0
            throw r0
    }

    @Override // w0.f
    public final void m() {
            r0 = this;
            return
    }

    @Override // w0.f
    public final void n(w0.u r2) {
            r1 = this;
            w0.l r2 = w0.m.f14784a
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot modify a state object in a read-only snapshot"
            r2.<init>(r0)
            throw r2
    }

    @Override // w0.f
    public final w0.f u(fg.l r7) {
            r6 = this;
            w0.d r0 = new w0.d
            long r1 = r6.f14764b
            w0.j r3 = r6.f14763a
            fg.l r4 = r6.f14759e
            r5 = 1
            fg.l r4 = w0.m.k(r7, r4, r5)
            w0.f r5 = r6.f14760f
            r0.<init>(r1, r3, r4, r5)
            return r0
    }
}
