package ng;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ng.j, ng.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ng.j f9434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9435c;

    public e(ng.j r1, int r2, int r3) {
            r0 = this;
            r0.f9433a = r3
            switch(r3) {
                case 1: goto L19;
                default: goto L5;
            }
        L5:
            r1.getClass()
            r0.<init>()
            r0.f9434b = r1
            r0.f9435c = r2
            if (r2 < 0) goto L12
            return
        L12:
            java.lang.String r1 = "count must be non-negative, but was "
            j8.o.d(r2, r1)
            r1 = 0
            throw r1
        L19:
            r0.<init>()
            r0.f9434b = r1
            r0.f9435c = r2
            if (r2 < 0) goto L23
            return
        L23:
            java.lang.String r1 = "count must be non-negative, but was "
            j8.o.d(r2, r1)
            r1 = 0
            throw r1
    }

    @Override // ng.f
    public final ng.j a(int r4) {
            r3 = this;
            int r0 = r3.f9433a
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            int r0 = r3.f9435c
            if (r4 < r0) goto Lb
            r0 = r3
            goto L13
        Lb:
            ng.e r0 = new ng.e
            ng.j r1 = r3.f9434b
            r2 = 1
            r0.<init>(r1, r4, r2)
        L13:
            return r0
        L14:
            int r0 = r3.f9435c
            int r1 = r0 + r4
            if (r1 >= 0) goto L21
            ng.e r0 = new ng.e
            r1 = 1
            r0.<init>(r3, r4, r1)
            goto L29
        L21:
            ng.r r4 = new ng.r
            ng.j r2 = r3.f9434b
            r4.<init>(r2, r0, r1)
            r0 = r4
        L29:
            return r0
    }

    @Override // ng.f
    public final ng.j b(int r4) {
            r3 = this;
            int r0 = r3.f9433a
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            int r0 = r3.f9435c
            if (r4 < r0) goto Lc
            ng.g r4 = ng.g.f9436a
            goto L14
        Lc:
            ng.r r1 = new ng.r
            ng.j r2 = r3.f9434b
            r1.<init>(r2, r4, r0)
            r4 = r1
        L14:
            return r4
        L15:
            int r0 = r3.f9435c
            int r0 = r0 + r4
            if (r0 >= 0) goto L21
            ng.e r0 = new ng.e
            r1 = 0
            r0.<init>(r3, r4, r1)
            goto L2a
        L21:
            ng.e r4 = new ng.e
            ng.j r1 = r3.f9434b
            r2 = 0
            r4.<init>(r1, r0, r2)
            r0 = r4
        L2a:
            return r0
    }

    @Override // ng.j
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f9433a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            ng.d r0 = new ng.d
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        Lc:
            ng.d r0 = new ng.d
            r0.<init>(r2)
            return r0
    }
}
