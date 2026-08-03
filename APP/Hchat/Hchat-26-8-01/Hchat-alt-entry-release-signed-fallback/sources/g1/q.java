package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends gg.m implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1.r f4118h;

    public /* synthetic */ q(g1.r r1, int r2) {
            r0 = this;
            r0.f4117g = r2
            r0.f4118h = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f4117g
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.Number r10 = (java.lang.Number) r10
            double r0 = r10.doubleValue()
            g1.r r10 = r9.f4118h
            g1.j r2 = r10.f4127k
            double r3 = r2.c(r0)
            float r0 = r10.f4121e
            double r5 = (double) r0
            float r10 = r10.f4122f
            double r7 = (double) r10
            double r0 = r9.e0.p(r3, r5, r7)
            java.lang.Double r10 = java.lang.Double.valueOf(r0)
            return r10
        L22:
            java.lang.Number r10 = (java.lang.Number) r10
            double r0 = r10.doubleValue()
            g1.r r10 = r9.f4118h
            g1.j r6 = r10.f4130n
            float r2 = r10.f4121e
            double r2 = (double) r2
            float r10 = r10.f4122f
            double r4 = (double) r10
            double r0 = r9.e0.p(r0, r2, r4)
            double r0 = r6.c(r0)
            java.lang.Double r10 = java.lang.Double.valueOf(r0)
            return r10
    }
}
