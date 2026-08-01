package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ty1 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10510;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.cu1 f10511;

    public /* synthetic */ ty1(p000.cu1 r1, int r2) {
            r0 = this;
            r0.f10510 = r2
            r0.f10511 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f10510
            switch(r0) {
                case 0: goto L13;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            cu1 r1 = r1.f10511
            r1.invoke()
        La:
            s62 r1 = p000.s62.f9751
            return r1
        Ld:
            cu1 r1 = r1.f10511
            r1.invoke()
            goto La
        L13:
            java.util.LinkedHashSet r0 = p000.jz1.f5676
            r0.clear()
            cu1 r1 = r1.f10511
            r1.invoke()
            goto La
    }
}
