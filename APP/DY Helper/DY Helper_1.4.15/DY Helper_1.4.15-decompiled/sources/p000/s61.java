package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s61 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9748;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.a71 f9749;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.j71 f9750;

    public /* synthetic */ s61(p000.a71 r1, p000.j71 r2, int r3) {
            r0 = this;
            r0.f9748 = r3
            r0.f9749 = r1
            r0.f9750 = r2
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f9748
            switch(r0) {
                case 0: goto L17;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            a71 r0 = r1.f9749
            j71 r1 = r1.f9750
            r0.invoke(r1)
        Lc:
            s62 r1 = p000.s62.f9751
            return r1
        Lf:
            a71 r0 = r1.f9749
            j71 r1 = r1.f9750
            r0.invoke(r1)
            goto Lc
        L17:
            a71 r0 = r1.f9749
            j71 r1 = r1.f9750
            r0.invoke(r1)
            goto Lc
    }
}
