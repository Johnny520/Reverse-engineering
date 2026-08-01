package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class g12 extends p000.bp0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4210;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.h12 f4211;

    public /* synthetic */ g12(p000.h12 r1, int r2) {
            r0 = this;
            r0.f4210 = r2
            r0.f4211 = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f4210
            switch(r0) {
                case 0: goto L44;
                case 1: goto L25;
                default: goto L5;
            }
        L5:
            yp0 r2 = (p000.yp0) r2
            h12 r3 = (p000.h12) r3
            kq0 r3 = r2.f12735
            if (r3 != 0) goto L14
            kq0 r3 = new kq0
            r3.<init>(r2)
            r2.f12735 = r3
        L14:
            h12 r1 = r1.f4211
            r1.f4530 = r3
            kq0 r2 = r1.m2343()
            r2.m3406()
            r1.m2343()
            s62 r1 = p000.s62.f9751
            return r1
        L25:
            yp0 r2 = (p000.yp0) r2
            e80 r3 = (p000.e80) r3
            h12 r1 = r1.f4211
            kq0 r1 = r1.m2343()
            hq0 r0 = new hq0
            r0.<init>(r1, r3)
            px0 r1 = r2.f12725
            boolean r1 = p000.ln0.m3626(r1, r0)
            if (r1 != 0) goto L41
            r2.f12725 = r0
            r2.m6974()
        L41:
            s62 r1 = p000.s62.f9751
            return r1
        L44:
            yp0 r2 = (p000.yp0) r2
            un r3 = (p000.AbstractC0878un) r3
            h12 r1 = r1.f4211
            kq0 r1 = r1.m2343()
            r1.f6081 = r3
            s62 r1 = p000.s62.f9751
            return r1
    }
}
