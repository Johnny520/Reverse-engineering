package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f4715h;

    public /* synthetic */ l0(fg.l r1, int r2) {
            r0 = this;
            r0.f4714g = r2
            r0.f4715h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f4714g
            switch(r0) {
                case 0: goto L2e;
                default: goto L5;
            }
        L5:
            u2.l r7 = (u2.l) r7
            long r0 = r7.f13353a
            r7 = 32
            long r0 = r0 >> r7
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            fg.l r1 = r6.f4715h
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            long r0 = r0 << r7
            r7 = 0
            long r2 = (long) r7
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            u2.j r7 = new u2.j
            r7.<init>(r0)
            return r7
        L2e:
            u2.l r7 = (u2.l) r7
            long r0 = r7.f13353a
            r7 = 32
            long r0 = r0 >> r7
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            fg.l r1 = r6.f4715h
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            long r0 = r0 << r7
            r7 = 0
            long r2 = (long) r7
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            u2.j r7 = new u2.j
            r7.<init>(r0)
            return r7
    }
}
