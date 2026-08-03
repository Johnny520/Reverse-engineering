package gh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends x6.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f4570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4571h;

    public c(java.lang.String r1, int r2) {
            r0 = this;
            r1.getClass()
            if (r2 == 0) goto Ld
            r0.<init>()
            r0.f4570g = r1
            r0.f4571h = r2
            return
        Ld:
            r1 = 0
            throw r1
    }

    @Override // x6.d
    public final int G(g6.b r5) {
            r4 = this;
            java.lang.String r0 = r4.f4570g
            if (r0 == 0) goto L44
            int r1 = r0.length()
            if (r1 != 0) goto L11
            int r1 = r4.f4571h
            r2 = 5
            if (r1 == r2) goto L11
            r4.f4571h = r2
        L11:
            int r0 = r5.e(r0)
            int r1 = r4.f4571h
            r2 = 1
            if (r1 == r2) goto L2a
            r3 = 2
            if (r1 == r3) goto L2b
            r2 = 3
            if (r1 == r2) goto L26
            r3 = 4
            if (r1 == r3) goto L2b
            r2 = 5
            if (r1 != r2) goto L28
        L26:
            r2 = r3
            goto L2b
        L28:
            r5 = 0
            throw r5
        L2a:
            r2 = 0
        L2b:
            r1 = 3
            r5.n(r1)
            r1 = 0
            r5.c(r1, r0)
            if (r2 == 0) goto L3c
            r5.a(r2)
            r0 = 1
            r5.m(r0)
        L3c:
            int r0 = r5.g()
            r5.i(r0)
            return r0
        L44:
            java.lang.String r5 = "value must not be null"
            j8.o.t(r5)
            r5 = 0
            return r5
    }
}
