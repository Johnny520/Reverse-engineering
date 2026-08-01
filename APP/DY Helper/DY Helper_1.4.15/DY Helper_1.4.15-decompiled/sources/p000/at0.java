package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1300;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.ps0 f1301;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.a80 f1302;

    public /* synthetic */ at0(p000.ps0 r1, p000.a80 r2, int r3) {
            r0 = this;
            r0.f1300 = r3
            r0.f1301 = r1
            r0.f1302 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f1300
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            switch(r0) {
                case 0: goto L21;
                default: goto Lb;
            }
        Lb:
            ps0 r0 = r1.f1301
            java.util.List r0 = r0.f8687
            java.lang.Object r2 = p000.AbstractC0984xh.m6641(r2, r0)
            xt0 r2 = (p000.xt0) r2
            if (r2 == 0) goto L1e
            java.lang.String r2 = r2.f12283
            a80 r1 = r1.f1302
            r1.invoke(r2)
        L1e:
            s62 r1 = p000.s62.f9751
            return r1
        L21:
            ps0 r0 = r1.f1301
            java.util.List r0 = r0.f8687
            java.lang.Object r2 = p000.AbstractC0984xh.m6641(r2, r0)
            xt0 r2 = (p000.xt0) r2
            if (r2 == 0) goto L34
            java.lang.String r2 = r2.f12283
            a80 r1 = r1.f1302
            r1.invoke(r2)
        L34:
            s62 r1 = p000.s62.f9751
            return r1
    }
}
