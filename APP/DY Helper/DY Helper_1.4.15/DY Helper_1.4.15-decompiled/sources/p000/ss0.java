package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10007;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.a80 f10008;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.xt0 f10009;

    public /* synthetic */ ss0(p000.a80 r1, p000.xt0 r2, int r3) {
            r0 = this;
            r0.f10007 = r3
            r0.f10008 = r1
            r0.f10009 = r2
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f10007
            switch(r0) {
                case 0: goto L25;
                case 1: goto L1b;
                case 2: goto L11;
                default: goto L5;
            }
        L5:
            xt0 r0 = r1.f10009
            java.lang.String r0 = r0.f12283
            a80 r1 = r1.f10008
            r1.invoke(r0)
        Le:
            s62 r1 = p000.s62.f9751
            return r1
        L11:
            xt0 r0 = r1.f10009
            java.lang.String r0 = r0.f12283
            a80 r1 = r1.f10008
            r1.invoke(r0)
            goto Le
        L1b:
            xt0 r0 = r1.f10009
            java.lang.String r0 = r0.f12283
            a80 r1 = r1.f10008
            r1.invoke(r0)
            goto Le
        L25:
            xt0 r0 = r1.f10009
            java.lang.String r0 = r0.f12283
            a80 r1 = r1.f10008
            r1.invoke(r0)
            goto Le
    }
}
