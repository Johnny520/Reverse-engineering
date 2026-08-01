package p000;

/* JADX INFO: renamed from: ag */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0017ag implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f155d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0128dg f156e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0017ag(C0128dg c0128dg, int i) {
        this.f155d = i;
        this.f156e = c0128dg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f155d;
        na1 na1Var = na1.f4229a;
        C0128dg c0128dg = this.f156e;
        switch (i) {
            case 0:
                InterfaceC0298hw interfaceC0298hw = c0128dg.f1093O;
                if (interfaceC0298hw != null) {
                    interfaceC0298hw.invoke();
                }
                if (c0128dg.f1094P) {
                    ((InterfaceC0372jy) pf1.m3058r(c0128dg, AbstractC0131dj.f1125l)).mo1591a();
                }
                break;
            default:
                if (c0128dg.f4108x) {
                    c0128dg.f4109y.invoke();
                }
                break;
        }
        return na1Var;
    }
}
