package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gl1 extends p000.y12 implements p000.e80 {

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ int f4414;

    /* JADX INFO: renamed from: κ */
    public /* synthetic */ java.lang.Object f4415;

    public /* synthetic */ gl1(int r1, p000.InterfaceC0631op r2, int r3) {
            r0 = this;
            r0.f4414 = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f4414
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            bw1 r2 = (p000.bw1) r2
            op r3 = (p000.InterfaceC0631op) r3
            op r1 = r1.mo1119(r3, r2)
            gl1 r1 = (p000.gl1) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
        L16:
            fl1 r2 = (p000.fl1) r2
            op r3 = (p000.InterfaceC0631op) r3
            op r1 = r1.mo1119(r3, r2)
            gl1 r1 = (p000.gl1) r1
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.mo11(r2)
            return r1
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r3, java.lang.Object r4) {
            r2 = this;
            int r2 = r2.f4414
            switch(r2) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            gl1 r2 = new gl1
            r0 = 2
            r1 = 1
            r2.<init>(r0, r3, r1)
            r2.f4415 = r4
            return r2
        Lf:
            gl1 r2 = new gl1
            r0 = 2
            r1 = 0
            r2.<init>(r0, r3, r1)
            r2.f4415 = r4
            return r2
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f4414
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L18;
                default: goto L7;
            }
        L7:
            p000.i81.m2649(r4)
            java.lang.Object r3 = r3.f4415
            bw1 r3 = (p000.bw1) r3
            bw1 r4 = p000.bw1.f1875
            if (r3 == r4) goto L13
            r1 = r2
        L13:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L18:
            p000.i81.m2649(r4)
            java.lang.Object r3 = r3.f4415
            fl1 r3 = (p000.fl1) r3
            fl1 r4 = p000.fl1.f4005
            if (r3 != r4) goto L24
            r1 = r2
        L24:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
    }
}
