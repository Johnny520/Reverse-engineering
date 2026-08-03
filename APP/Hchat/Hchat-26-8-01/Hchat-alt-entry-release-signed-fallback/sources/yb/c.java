package yb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class c extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.r0 f22403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.a f22404b;

    public c(f1.r0 r1, fg.a r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f22403a = r1
            r0.f22404b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof yb.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            yb.c r5 = (yb.c) r5
            f1.r0 r1 = r5.f22403a
            f1.r0 r3 = r4.f22403a
            boolean r1 = gg.l.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            fg.a r1 = r4.f22404b
            fg.a r5 = r5.f22404b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r3 = this;
            yb.f r0 = new yb.f
            f1.r0 r1 = r3.f22403a
            fg.a r2 = r3.f22404b
            r0.<init>(r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            yb.f r2 = (yb.f) r2
            r2.getClass()
            f1.r0 r0 = r1.f22403a
            r0.getClass()
            r2.f22410u = r0
            fg.a r0 = r1.f22404b
            r0.getClass()
            r2.f22411v = r0
            x1.k.l(r2)
            return
    }

    public final int hashCode() {
            r2 = this;
            f1.r0 r0 = r2.f22403a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            fg.a r1 = r2.f22404b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
