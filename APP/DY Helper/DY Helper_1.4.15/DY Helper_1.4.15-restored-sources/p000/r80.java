package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r80 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9287;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.v80 f9288;

    public /* synthetic */ r80(p000.v80 r1, int r2) {
            r0 = this;
            r0.f9287 = r2
            r0.f9288 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ r80(p000.v80 r1, p000.f11 r2) {
            r0 = this;
            r2 = 0
            r0.f9287 = r2
            r0.<init>()
            r0.f9288 = r1
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f9287
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            v80 r1 = r1.f9288
            hn r1 = r1.m6097()
            return r1
        Lc:
            v80 r1 = r1.f9288
            hn r1 = r1.m6097()
            return r1
        L13:
            r1 = 0
            throw r1
    }
}
