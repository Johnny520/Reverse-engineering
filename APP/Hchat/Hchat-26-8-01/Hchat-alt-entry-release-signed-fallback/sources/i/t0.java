package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements i.n1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i.n1 f5794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f5795h;

    public t0(i.n1 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f5794g = r1
            r0.f5795h = r2
            return
    }

    @Override // i.n1
    public final boolean a() {
            r1 = this;
            i.n1 r0 = r1.f5794g
            boolean r0 = r0.a()
            return r0
    }

    @Override // i.n1
    public final long b(i.q r3, i.q r4, i.q r5) {
            r2 = this;
            i.n1 r0 = r2.f5794g
            long r3 = r0.b(r3, r4, r5)
            long r0 = r2.f5795h
            long r3 = r3 + r0
            return r3
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof i.t0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            i.t0 r7 = (i.t0) r7
            long r2 = r7.f5795h
            long r4 = r6.f5795h
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1c
            i.n1 r7 = r7.f5794g
            i.n1 r0 = r6.f5794g
            boolean r7 = gg.l.a(r7, r0)
            if (r7 == 0) goto L1c
            r7 = 1
            return r7
        L1c:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            i.n1 r0 = r3.f5794g
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.f5795h
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // i.n1
    public final i.q n(long r10, i.q r12, i.q r13, i.q r14) {
            r9 = this;
            long r0 = r9.f5795h
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            return r14
        L7:
            i.n1 r3 = r9.f5794g
            long r4 = r10 - r0
            r6 = r12
            r7 = r13
            r8 = r14
            i.q r10 = r3.n(r4, r6, r7, r8)
            return r10
    }

    @Override // i.n1
    public final i.q w(long r10, i.q r12, i.q r13, i.q r14) {
            r9 = this;
            long r0 = r9.f5795h
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            return r12
        L7:
            i.n1 r3 = r9.f5794g
            long r4 = r10 - r0
            r6 = r12
            r7 = r13
            r8 = r14
            i.q r10 = r3.w(r4, r6, r7, r8)
            return r10
    }
}
