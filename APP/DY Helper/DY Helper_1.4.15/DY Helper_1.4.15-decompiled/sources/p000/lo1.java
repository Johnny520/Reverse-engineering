package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lo1 implements p000.InterfaceC0224du {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6726;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.po1 f6727;

    public /* synthetic */ lo1(p000.po1 r1, int r2) {
            r0 = this;
            r0.f6726 = r2
            r0.f6727 = r1
            r0.<init>()
            return
    }

    @Override // p000.InterfaceC0224du
    /* JADX INFO: renamed from: α */
    public final double mo1800(double r9) {
            r8 = this;
            int r0 = r8.f6726
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            po1 r8 = r8.f6727
            du r0 = r8.f8635
            float r1 = r8.f8626
            double r4 = (double) r1
            float r8 = r8.f8627
            double r6 = (double) r8
            r2 = r9
            double r8 = p000.j81.m2904(r2, r4, r6)
            double r8 = r0.mo1800(r8)
            return r8
        L19:
            r2 = r9
            po1 r8 = r8.f6727
            du r9 = r8.f8632
            double r0 = r9.mo1800(r2)
            float r9 = r8.f8626
            double r2 = (double) r9
            float r8 = r8.f8627
            double r4 = (double) r8
            double r8 = p000.j81.m2904(r0, r2, r4)
            return r8
    }
}
