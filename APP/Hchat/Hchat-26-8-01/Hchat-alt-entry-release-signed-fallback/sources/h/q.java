package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h.s f4734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v1.b1 f4735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f4736i;

    public q(h.s r1, v1.b1 r2, long r3) {
            r0 = this;
            r0.f4734g = r1
            r0.f4735h = r2
            r0.f4736i = r3
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r12) {
            r11 = this;
            v1.a1 r12 = (v1.a1) r12
            h.s r0 = r11.f4734g
            h.t r0 = r0.f4749x
            r0.getClass()
            v1.b1 r0 = r11.f4735h
            int r1 = r0.f13900g
            int r2 = r0.f13901h
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            long r5 = (long) r2
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r2 = r3 | r5
            long r4 = r11.f4736i
            long r9 = r4 >> r1
            int r6 = (int) r9
            long r9 = r2 >> r1
            int r9 = (int) r9
            int r6 = r6 - r9
            float r6 = (float) r6
            r9 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r9
            long r4 = r4 & r7
            int r4 = (int) r4
            long r2 = r2 & r7
            int r2 = (int) r2
            int r4 = r4 - r2
            float r2 = (float) r4
            float r2 = r2 / r9
            r3 = 1
            float r3 = (float) r3
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r3 + r4
            float r5 = r5 * r6
            float r3 = r3 + r4
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r5)
            int r3 = java.lang.Math.round(r3)
            long r4 = (long) r2
            long r1 = r4 << r1
            long r3 = (long) r3
            long r3 = r3 & r7
            long r1 = r1 | r3
            v1.a1.C(r12, r0, r1)
            sf.n r12 = sf.n.f12433a
            return r12
    }
}
