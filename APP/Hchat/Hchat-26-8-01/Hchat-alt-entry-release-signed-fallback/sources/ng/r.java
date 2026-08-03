package ng;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements ng.j, ng.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ng.j f9454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9456c;

    public r(ng.j r2, int r3, int r4) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f9454a = r2
            r1.f9455b = r3
            r1.f9456c = r4
            if (r3 < 0) goto L2b
            if (r4 < 0) goto L20
            if (r4 < r3) goto L13
            return
        L13:
            java.lang.String r2 = "endIndex should be not less than startIndex, but was "
            java.lang.String r0 = " < "
            java.lang.String r2 = p.a.j(r4, r2, r0, r3)
            j8.o.q(r2)
            r2 = 0
            throw r2
        L20:
            java.lang.String r2 = "endIndex should be non-negative, but is "
            java.lang.String r2 = eh.a.l(r4, r2)
            j8.o.q(r2)
            r2 = 0
            throw r2
        L2b:
            java.lang.String r2 = "startIndex should be non-negative, but is "
            java.lang.String r2 = eh.a.l(r3, r2)
            j8.o.q(r2)
            r2 = 0
            throw r2
    }

    @Override // ng.f
    public final ng.j a(int r4) {
            r3 = this;
            int r0 = r3.f9456c
            int r1 = r3.f9455b
            int r0 = r0 - r1
            if (r4 < r0) goto L8
            return r3
        L8:
            ng.r r0 = new ng.r
            ng.j r2 = r3.f9454a
            int r4 = r4 + r1
            r0.<init>(r2, r1, r4)
            return r0
    }

    @Override // ng.f
    public final ng.j b(int r5) {
            r4 = this;
            int r0 = r4.f9456c
            int r1 = r4.f9455b
            int r2 = r0 - r1
            if (r5 < r2) goto Lb
            ng.g r5 = ng.g.f9436a
            return r5
        Lb:
            ng.r r2 = new ng.r
            ng.j r3 = r4.f9454a
            int r1 = r1 + r5
            r2.<init>(r3, r1, r0)
            return r2
    }

    @Override // ng.j
    public final java.util.Iterator iterator() {
            r1 = this;
            f.i0 r0 = new f.i0
            r0.<init>(r1)
            return r0
    }
}
