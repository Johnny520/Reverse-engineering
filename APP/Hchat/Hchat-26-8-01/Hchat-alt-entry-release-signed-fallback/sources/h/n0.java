package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.b1 f4721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f4722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f4723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b1.g f4724j;

    public n0(v1.b1 r1, long r2, long r4, b1.g r6) {
            r0 = this;
            r0.f4721g = r1
            r0.f4722h = r2
            r0.f4723i = r4
            r0.f4724j = r6
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            v1.a1 r9 = (v1.a1) r9
            long r0 = r8.f4722h
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            long r4 = r8.f4723i
            long r6 = r4 >> r2
            int r6 = (int) r6
            int r3 = r3 + r6
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r6
            int r0 = (int) r0
            long r4 = r4 & r6
            int r1 = (int) r4
            int r0 = r0 + r1
            r9.getClass()
            long r3 = (long) r3
            long r1 = r3 << r2
            long r3 = (long) r0
            long r3 = r3 & r6
            long r0 = r1 | r3
            v1.b1 r2 = r8.f4721g
            v1.a1.e(r9, r2)
            long r3 = r2.f13904k
            long r0 = u2.j.d(r0, r3)
            r9 = 0
            b1.g r3 = r8.f4724j
            r2.A0(r0, r9, r3)
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
