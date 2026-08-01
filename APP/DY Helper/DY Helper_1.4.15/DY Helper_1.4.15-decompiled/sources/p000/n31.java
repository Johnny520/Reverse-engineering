package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class n31 extends p000.bp0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7374;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.q31 f7375;

    public /* synthetic */ n31(p000.q31 r1, int r2) {
            r0 = this;
            r0.f7374 = r2
            r0.f7375 = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f7374
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            q31 r2 = r2.f7375
            q31 r2 = r2.f8841
            if (r2 == 0) goto Le
            r2.m4743()
        Le:
            s62 r2 = p000.s62.f9751
            return r2
        L11:
            q31 r2 = r2.f7375
            de r0 = r2.f8834
            r0.getClass()
            wa0 r1 = r2.f8833
            r2.m4734(r0, r1)
            s62 r2 = p000.s62.f9751
            return r2
    }
}
