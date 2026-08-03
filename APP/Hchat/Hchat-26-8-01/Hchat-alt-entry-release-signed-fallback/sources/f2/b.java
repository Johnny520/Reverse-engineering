package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends x1.x0 implements f2.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.l f3140b;

    public b(boolean r1, fg.l r2) {
            r0 = this;
            r0.<init>()
            r0.f3139a = r1
            r0.f3140b = r2
            return
    }

    @Override // f2.n
    public final f2.m e() {
            r2 = this;
            f2.m r0 = new f2.m
            r0.<init>()
            boolean r1 = r2.f3139a
            r0.f3206i = r1
            fg.l r1 = r2.f3140b
            r1.invoke(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L19
        L3:
            boolean r0 = r3 instanceof f2.b
            if (r0 != 0) goto L8
            goto L17
        L8:
            f2.b r3 = (f2.b) r3
            boolean r0 = r3.f3139a
            boolean r1 = r2.f3139a
            if (r1 == r0) goto L11
            goto L17
        L11:
            fg.l r0 = r2.f3140b
            fg.l r3 = r3.f3140b
            if (r0 == r3) goto L19
        L17:
            r3 = 0
            return r3
        L19:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r4 = this;
            f2.e r0 = new f2.e
            r1 = 0
            fg.l r2 = r4.f3140b
            boolean r3 = r4.f3139a
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            f2.e r2 = (f2.e) r2
            boolean r0 = r1.f3139a
            r2.f3144u = r0
            fg.l r0 = r1.f3140b
            r2.f3146w = r0
            return
    }

    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.f3139a
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            fg.l r1 = r2.f3140b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
