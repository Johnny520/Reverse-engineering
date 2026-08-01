package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rs0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9479;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.g21 f9480;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.g21 f9481;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.g21 f9482;

    public /* synthetic */ rs0(p000.g21 r1, p000.g21 r2, p000.g21 r3, int r4) {
            r0 = this;
            r0.f9479 = r4
            r0.f9480 = r1
            r0.f9481 = r2
            r0.f9482 = r3
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f9479
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            g21 r0 = r2.f9480
            r1 = 0
            r0.setValue(r1)
            g21 r0 = r2.f9481
            r0.setValue(r1)
            g21 r2 = r2.f9482
            r2.setValue(r1)
        L15:
            s62 r2 = p000.s62.f9751
            return r2
        L18:
            g21 r0 = r2.f9480
            r1 = 0
            r0.setValue(r1)
            g21 r0 = r2.f9481
            r0.setValue(r1)
            g21 r2 = r2.f9482
            r2.setValue(r1)
            goto L15
    }
}
