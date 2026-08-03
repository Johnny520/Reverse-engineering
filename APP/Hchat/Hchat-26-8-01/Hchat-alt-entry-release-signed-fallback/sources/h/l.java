package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.b1[] f4711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4713i;

    public l(v1.b1[] r1, h.m r2, int r3, int r4) {
            r0 = this;
            r0.f4711g = r1
            r0.f4712h = r3
            r0.f4713i = r4
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r15) {
            r14 = this;
            v1.a1 r15 = (v1.a1) r15
            v1.b1[] r0 = r14.f4711g
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L59
            r3 = r0[r2]
            if (r3 == 0) goto L56
            int r4 = r3.f13900g
            int r5 = r3.f13901h
            long r6 = (long) r4
            r4 = 32
            long r6 = r6 << r4
            long r8 = (long) r5
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            long r5 = r6 | r8
            int r7 = r14.f4712h
            long r7 = (long) r7
            long r7 = r7 << r4
            int r9 = r14.f4713i
            long r12 = (long) r9
            long r12 = r12 & r10
            long r7 = r7 | r12
            long r12 = r7 >> r4
            int r9 = (int) r12
            long r12 = r5 >> r4
            int r12 = (int) r12
            int r9 = r9 - r12
            float r9 = (float) r9
            r12 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r12
            long r7 = r7 & r10
            int r7 = (int) r7
            long r5 = r5 & r10
            int r5 = (int) r5
            int r7 = r7 - r5
            float r5 = (float) r7
            float r5 = r5 / r12
            r6 = 1
            float r6 = (float) r6
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r8 = r6 + r7
            float r8 = r8 * r9
            float r6 = r6 + r7
            float r6 = r6 * r5
            int r5 = java.lang.Math.round(r8)
            int r6 = java.lang.Math.round(r6)
            long r7 = (long) r5
            long r7 = r7 << r4
            long r5 = (long) r6
            long r5 = r5 & r10
            long r5 = r5 | r7
            long r7 = r5 >> r4
            int r4 = (int) r7
            long r5 = r5 & r10
            int r5 = (int) r5
            v1.a1.B(r15, r3, r4, r5)
        L56:
            int r2 = r2 + 1
            goto L6
        L59:
            sf.n r15 = sf.n.f12433a
            return r15
    }
}
