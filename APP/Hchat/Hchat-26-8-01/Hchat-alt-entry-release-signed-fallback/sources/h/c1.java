package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f4629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v1.p0 f4632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v1.b1 f4633k;

    public c1(h.d1 r1, long r2, int r4, int r5, v1.p0 r6, v1.b1 r7) {
            r0 = this;
            r0.f4629g = r2
            r0.f4630h = r4
            r0.f4631i = r5
            r0.f4632j = r6
            r0.f4633k = r7
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r12) {
            r11 = this;
            v1.a1 r12 = (v1.a1) r12
            int r0 = r11.f4630h
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r3 = r11.f4631i
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r0 = r0 | r3
            v1.p0 r3 = r11.f4632j
            u2.m r3 = r3.getLayoutDirection()
            long r7 = r0 >> r2
            int r4 = (int) r7
            long r7 = r11.f4629g
            long r9 = r7 >> r2
            int r9 = (int) r9
            int r4 = r4 - r9
            float r4 = (float) r4
            r9 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r9
            long r0 = r0 & r5
            int r0 = (int) r0
            long r7 = r7 & r5
            int r1 = (int) r7
            int r0 = r0 - r1
            float r0 = (float) r0
            float r0 = r0 / r9
            u2.m r1 = u2.m.f13354g
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r3 != r1) goto L34
            r1 = r7
            goto L37
        L34:
            r1 = -1
            float r1 = (float) r1
            float r1 = r1 * r7
        L37:
            r3 = 1
            float r3 = (float) r3
            float r1 = r1 + r3
            float r1 = r1 * r4
            float r3 = r3 + r7
            float r3 = r3 * r0
            int r0 = java.lang.Math.round(r1)
            int r1 = java.lang.Math.round(r3)
            long r3 = (long) r0
            long r2 = r3 << r2
            long r0 = (long) r1
            long r0 = r0 & r5
            long r0 = r0 | r2
            v1.b1 r2 = r11.f4633k
            v1.a1.C(r12, r2, r0)
            sf.n r12 = sf.n.f12433a
            return r12
    }
}
