package q1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class c extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg.l f10598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.l f10599b;

    public c(fg.l r1, fg.l r2) {
            r0 = this;
            r0.<init>()
            r0.f10598a = r1
            r0.f10599b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof q1.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            q1.c r5 = (q1.c) r5
            fg.l r1 = r5.f10598a
            fg.l r3 = r4.f10598a
            if (r3 == r1) goto L13
            return r2
        L13:
            fg.l r1 = r4.f10599b
            fg.l r5 = r5.f10599b
            if (r1 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            q1.f r0 = new q1.f
            r0.<init>()
            fg.l r1 = r2.f10598a
            r0.f10600u = r1
            fg.l r1 = r2.f10599b
            r0.f10601v = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            q1.f r2 = (q1.f) r2
            fg.l r0 = r1.f10598a
            r2.f10600u = r0
            fg.l r0 = r1.f10599b
            r2.f10601v = r0
            return
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            fg.l r1 = r3.f10598a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            fg.l r2 = r3.f10599b
            if (r2 == 0) goto L15
            int r0 = r2.hashCode()
        L15:
            int r1 = r1 + r0
            return r1
    }
}
