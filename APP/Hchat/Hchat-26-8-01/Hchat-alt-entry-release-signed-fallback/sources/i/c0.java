package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements i.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.l1 f5612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.p0 f5613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5614c;

    public c0(i.l1 r1, i.p0 r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.f5612a = r1
            r0.f5613b = r2
            r0.f5614c = r3
            int r2 = r1.f5725a
            if (r2 != 0) goto L19
            int r1 = r1.f5726b
            if (r1 == 0) goto L12
            goto L19
        L12:
            java.lang.String r1 = "Animation to be infinitely repeated cannot have a 0-duration"
            j8.o.t(r1)
            r1 = 0
            throw r1
        L19:
            return
    }

    @Override // i.k
    public final i.n1 a(i.m1 r5) {
            r4 = this;
            i.r1 r5 = new i.r1
            i.u1 r0 = new i.u1
            i.l1 r1 = r4.f5612a
            int r2 = r1.f5725a
            int r3 = r1.f5726b
            i.v r1 = r1.f5727c
            r0.<init>(r2, r3, r1)
            i.p0 r1 = r4.f5613b
            long r2 = r4.f5614c
            r5.<init>(r0, r1, r2)
            return r5
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof i.c0
            if (r0 == 0) goto L20
            i.c0 r5 = (i.c0) r5
            i.l1 r0 = r5.f5612a
            i.l1 r1 = r4.f5612a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            i.p0 r0 = r5.f5613b
            i.p0 r1 = r4.f5613b
            if (r0 != r1) goto L20
            long r0 = r5.f5614c
            long r2 = r4.f5614c
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L20
            r5 = 1
            return r5
        L20:
            r5 = 0
            return r5
    }

    public final int hashCode() {
            r4 = this;
            i.l1 r0 = r4.f5612a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            i.p0 r1 = r4.f5613b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.f5614c
            int r0 = java.lang.Long.hashCode(r2)
            int r0 = r0 + r1
            return r0
    }
}
