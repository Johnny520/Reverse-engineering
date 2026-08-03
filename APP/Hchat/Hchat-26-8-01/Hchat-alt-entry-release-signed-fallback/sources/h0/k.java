package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements y2.b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0.c f4922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0.l f4923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f4924i;

    public k(y0.c r1, h0.l r2) {
            r0 = this;
            r0.<init>()
            r0.f4922g = r1
            r0.f4923h = r2
            r1 = 0
            r0.f4924i = r1
            return
    }

    @Override // y2.b0
    public final long e(u2.k r7, long r8, u2.m r10, long r11) {
            r6 = this;
            h0.l r8 = r6.f4923h
            long r8 = r8.a()
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r8
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            goto L18
        L16:
            long r8 = r6.f4924i
        L18:
            r6.f4924i = r8
            y0.c r0 = r6.f4922g
            r3 = 0
            r5 = r10
            r1 = r11
            long r10 = r0.a(r1, r3, r5)
            long r0 = r7.b()
            long r7 = ig.a.W(r8)
            long r7 = u2.j.d(r0, r7)
            long r7 = u2.j.d(r7, r10)
            return r7
    }
}
