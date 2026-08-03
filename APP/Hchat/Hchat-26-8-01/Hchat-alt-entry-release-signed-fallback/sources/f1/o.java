package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class o extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f3081a;

    public o(fg.l r1) {
            r0 = this;
            r0.<init>()
            r0.f3081a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof f1.o
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            f1.o r4 = (f1.o) r4
            fg.l r4 = r4.f3081a
            fg.l r1 = r3.f3081a
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            f1.q r0 = new f1.q
            fg.l r1 = r2.f3081a
            r0.<init>(r1)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            f1.q r3 = (f1.q) r3
            fg.l r0 = r2.f3081a
            r3.f3107u = r0
            y0.n r1 = r3.f21819g
            boolean r1 = r1.f21832t
            if (r1 != 0) goto Ld
            goto L1a
        Ld:
            r1 = 2
            x1.i1 r3 = x1.k.t(r3, r1)
            x1.i1 r3 = r3.f20944v
            if (r3 == 0) goto L1a
            r1 = 1
            r3.Q1(r0, r1)
        L1a:
            return
    }

    public final int hashCode() {
            r1 = this;
            fg.l r0 = r1.f3081a
            int r0 = r0.hashCode()
            return r0
    }
}
