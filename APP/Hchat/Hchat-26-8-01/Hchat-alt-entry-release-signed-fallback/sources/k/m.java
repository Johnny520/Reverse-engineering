package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class m extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1.s f7011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.r0 f7013d;

    public m(long r2, f1.h0 r4, f1.r0 r5, int r6) {
            r1 = this;
            r0 = r6 & 1
            if (r0 == 0) goto L6
            long r2 = f1.w.f3131g
        L6:
            r6 = r6 & 2
            if (r6 == 0) goto Lb
            r4 = 0
        Lb:
            r1.<init>()
            r1.f7010a = r2
            r1.f7011b = r4
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.f7012c = r2
            r1.f7013d = r5
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof k.m
            if (r0 == 0) goto L7
            k.m r6 = (k.m) r6
            goto L8
        L7:
            r6 = 0
        L8:
            r0 = 0
            if (r6 != 0) goto Lc
            return r0
        Lc:
            long r1 = r5.f7010a
            long r3 = r6.f7010a
            boolean r1 = f1.w.c(r1, r3)
            if (r1 == 0) goto L34
            f1.s r1 = r5.f7011b
            f1.s r2 = r6.f7011b
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L34
            float r1 = r5.f7012c
            float r2 = r6.f7012c
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L34
            f1.r0 r1 = r5.f7013d
            f1.r0 r6 = r6.f7013d
            boolean r6 = gg.l.a(r1, r6)
            if (r6 == 0) goto L34
            r6 = 1
            return r6
        L34:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r3 = this;
            k.o r0 = new k.o
            r0.<init>()
            long r1 = r3.f7010a
            r0.f7021u = r1
            f1.s r1 = r3.f7011b
            r0.f7022v = r1
            float r1 = r3.f7012c
            r0.f7023w = r1
            f1.r0 r1 = r3.f7013d
            r0.f7024x = r1
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r0.f7025y = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r3) {
            r2 = this;
            k.o r3 = (k.o) r3
            long r0 = r2.f7010a
            r3.f7021u = r0
            f1.s r0 = r2.f7011b
            r3.f7022v = r0
            float r0 = r2.f7012c
            r3.f7023w = r0
            f1.r0 r0 = r3.f7024x
            f1.r0 r1 = r2.f7013d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1d
            r3.f7024x = r1
            x1.k.n(r3)
        L1d:
            x1.k.l(r3)
            return
    }

    public final int hashCode() {
            r3 = this;
            int r0 = f1.w.f3132h
            long r0 = r3.f7010a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            f1.s r2 = r3.f7011b
            if (r2 == 0) goto L14
            int r2 = r2.hashCode()
            goto L15
        L14:
            r2 = 0
        L15:
            int r0 = r0 + r2
            int r0 = r0 * r1
            float r2 = r3.f7012c
            int r0 = eh.a.d(r2, r0, r1)
            f1.r0 r1 = r3.f7013d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
