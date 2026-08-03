package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements g1.j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1.r f4112h;

    public /* synthetic */ n(g1.r r1, int r2) {
            r0 = this;
            r0.f4111g = r2
            r0.f4112h = r1
            r0.<init>()
            return
    }

    @Override // g1.j
    public final double c(double r10) {
            r9 = this;
            int r0 = r9.f4111g
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            g1.r r0 = r9.f4112h
            g1.j r1 = r0.f4130n
            float r2 = r0.f4121e
            double r5 = (double) r2
            float r0 = r0.f4122f
            double r7 = (double) r0
            r3 = r10
            double r10 = r9.e0.p(r3, r5, r7)
            double r10 = r1.c(r10)
            return r10
        L19:
            r3 = r10
            g1.r r10 = r9.f4112h
            g1.j r11 = r10.f4127k
            double r0 = r11.c(r3)
            float r11 = r10.f4121e
            double r2 = (double) r11
            float r10 = r10.f4122f
            double r4 = (double) r10
            double r10 = r9.e0.p(r0, r2, r4)
            return r10
    }
}
