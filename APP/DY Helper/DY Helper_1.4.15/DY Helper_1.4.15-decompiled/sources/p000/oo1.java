package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class oo1 extends p000.bp0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8167;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.po1 f8168;

    public /* synthetic */ oo1(p000.po1 r1, int r2) {
            r0 = this;
            r0.f8167 = r2
            r0.f8168 = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f8167
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            java.lang.Number r9 = (java.lang.Number) r9
            double r0 = r9.doubleValue()
            po1 r8 = r8.f8168
            du r9 = r8.f8632
            double r2 = r9.mo1800(r0)
            float r9 = r8.f8626
            double r4 = (double) r9
            float r8 = r8.f8627
            double r6 = (double) r8
            double r8 = p000.j81.m2904(r2, r4, r6)
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            return r8
        L22:
            java.lang.Number r9 = (java.lang.Number) r9
            double r0 = r9.doubleValue()
            po1 r8 = r8.f8168
            du r9 = r8.f8635
            float r2 = r8.f8626
            double r2 = (double) r2
            float r8 = r8.f8627
            double r4 = (double) r8
            double r0 = p000.j81.m2904(r0, r2, r4)
            double r8 = r9.mo1800(r0)
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            return r8
    }
}
