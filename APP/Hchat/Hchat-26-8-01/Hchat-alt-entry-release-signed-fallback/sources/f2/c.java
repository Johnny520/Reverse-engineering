package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends x1.x0 implements f2.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f3141a;

    public c(fg.l r1) {
            r0 = this;
            r0.<init>()
            r0.f3141a = r1
            return
    }

    @Override // f2.n
    public final f2.m e() {
            r2 = this;
            f2.m r0 = new f2.m
            r0.<init>()
            r1 = 0
            r0.f3206i = r1
            r1 = 1
            r0.f3207j = r1
            fg.l r1 = r2.f3141a
            r1.invoke(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof f2.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            f2.c r4 = (f2.c) r4
            fg.l r4 = r4.f3141a
            fg.l r1 = r3.f3141a
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r4 = this;
            f2.e r0 = new f2.e
            r1 = 1
            fg.l r2 = r4.f3141a
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            f2.e r2 = (f2.e) r2
            fg.l r0 = r1.f3141a
            r2.f3146w = r0
            return
    }

    public final int hashCode() {
            r1 = this;
            fg.l r0 = r1.f3141a
            int r0 = r0.hashCode()
            return r0
    }
}
