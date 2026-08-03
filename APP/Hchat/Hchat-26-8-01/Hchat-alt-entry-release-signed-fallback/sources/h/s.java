package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends h.x0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i.d1 f4747v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i0.a1 f4748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h.t f4749x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f4750y;

    @Override // y0.n
    public final void e1() {
            r2 = this;
            long r0 = h.k.f4707a
            r2.f4750y = r0
            return
    }

    @Override // h.x0, x1.v
    public final v1.o0 j(v1.p0 r8, v1.m0 r9, long r10) {
            r7 = this;
            v1.b1 r9 = r9.Q(r10)
            boolean r10 = r8.u0()
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r11 = 32
            if (r10 == 0) goto L1c
            int r10 = r9.f13900g
            int r2 = r9.f13901h
            long r3 = (long) r10
            long r3 = r3 << r11
            long r5 = (long) r2
            long r5 = r5 & r0
            long r2 = r3 | r5
            goto L5a
        L1c:
            i.d1 r10 = r7.f4747v
            int r2 = r9.f13900g
            if (r10 != 0) goto L2c
            int r10 = r9.f13901h
            long r2 = (long) r2
            long r2 = r2 << r11
            long r4 = (long) r10
            long r4 = r4 & r0
            long r2 = r2 | r4
            r7.f4750y = r2
            goto L5a
        L2c:
            int r3 = r9.f13901h
            long r4 = (long) r2
            long r4 = r4 << r11
            long r2 = (long) r3
            long r2 = r2 & r0
            long r2 = r2 | r4
            h.r r4 = new h.r
            r5 = 0
            r4.<init>(r7, r2, r5)
            h.r r5 = new h.r
            r6 = 1
            r5.<init>(r7, r2, r6)
            i.c1 r10 = r10.a(r4, r5)
            h.t r2 = r7.f4749x
            r2.getClass()
            java.lang.Object r2 = r10.getValue()
            u2.l r2 = (u2.l) r2
            long r2 = r2.f13353a
            java.lang.Object r10 = r10.getValue()
            u2.l r10 = (u2.l) r10
            long r4 = r10.f13353a
            r7.f4750y = r4
        L5a:
            long r10 = r2 >> r11
            int r10 = (int) r10
            long r0 = r0 & r2
            int r11 = (int) r0
            h.q r0 = new h.q
            r0.<init>(r7, r9, r2)
            tf.u r9 = tf.u.f13168g
            v1.o0 r8 = r8.z(r10, r11, r9, r0)
            return r8
    }
}
