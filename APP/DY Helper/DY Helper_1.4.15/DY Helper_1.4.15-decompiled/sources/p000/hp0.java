package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hp0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4784;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.g21 f4785;

    public /* synthetic */ hp0(p000.g21 r1, int r2) {
            r0 = this;
            r0.f4784 = r2
            r0.f4785 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f4784
            switch(r0) {
                case 0: goto L17;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            g21 r1 = r1.f4785
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1.setValue(r2)
        Lc:
            s62 r1 = p000.s62.f9751
            return r1
        Lf:
            g21 r1 = r1.f4785
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1.setValue(r2)
            goto Lc
        L17:
            aq0 r2 = (p000.aq0) r2
            r2.getClass()
            g21 r1 = r1.f4785
            java.lang.Object r1 = r1.getValue()
            a80 r1 = (p000.a80) r1
            r1.invoke(r2)
            goto Lc
    }
}
