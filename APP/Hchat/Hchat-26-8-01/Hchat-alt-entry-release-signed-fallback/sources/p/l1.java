package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements p.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p.r1 f9943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p.r1 f9944b;

    public l1(p.r1 r1, p.r1 r2) {
            r0 = this;
            r0.<init>()
            r0.f9943a = r1
            r0.f9944b = r2
            return
    }

    @Override // p.r1
    public final int a(u2.c r3, u2.m r4) {
            r2 = this;
            p.r1 r0 = r2.f9943a
            int r0 = r0.a(r3, r4)
            p.r1 r1 = r2.f9944b
            int r3 = r1.a(r3, r4)
            int r3 = java.lang.Math.max(r0, r3)
            return r3
    }

    @Override // p.r1
    public final int b(u2.c r3) {
            r2 = this;
            p.r1 r0 = r2.f9943a
            int r0 = r0.b(r3)
            p.r1 r1 = r2.f9944b
            int r3 = r1.b(r3)
            int r3 = java.lang.Math.max(r0, r3)
            return r3
    }

    @Override // p.r1
    public final int c(u2.c r3, u2.m r4) {
            r2 = this;
            p.r1 r0 = r2.f9943a
            int r0 = r0.c(r3, r4)
            p.r1 r1 = r2.f9944b
            int r3 = r1.c(r3, r4)
            int r3 = java.lang.Math.max(r0, r3)
            return r3
    }

    @Override // p.r1
    public final int d(u2.c r3) {
            r2 = this;
            p.r1 r0 = r2.f9943a
            int r0 = r0.d(r3)
            p.r1 r1 = r2.f9944b
            int r3 = r1.d(r3)
            int r3 = java.lang.Math.max(r0, r3)
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p.l1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p.l1 r5 = (p.l1) r5
            p.r1 r1 = r5.f9943a
            p.r1 r3 = r4.f9943a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L21
            p.r1 r5 = r5.f9944b
            p.r1 r1 = r4.f9944b
            boolean r5 = gg.l.a(r5, r1)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            p.r1 r0 = r2.f9943a
            int r0 = r0.hashCode()
            p.r1 r1 = r2.f9944b
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            p.r1 r1 = r2.f9943a
            r0.append(r1)
            java.lang.String r1 = " ∪ "
            r0.append(r1)
            p.r1 r1 = r2.f9944b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
