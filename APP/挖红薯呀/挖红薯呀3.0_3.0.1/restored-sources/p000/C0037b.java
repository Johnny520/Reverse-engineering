package p000;

/* JADX INFO: renamed from: b */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0037b implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f304d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0493n f305e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0037b(AbstractC0493n abstractC0493n, int i) {
        this.f304d = i;
        this.f305e = abstractC0493n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        InterfaceC0694rm interfaceC0694rm;
        int i = this.f304d;
        AbstractC0493n abstractC0493n = this.f305e;
        switch (i) {
            case 0:
                f10 f10Var = (f10) pf1.m3058r(abstractC0493n, c10.f626a);
                if (f10Var == null) {
                    z10.m5361a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + f10Var);
                }
                f10 f10Var2 = abstractC0493n.f4091A;
                abstractC0493n.f4091A = f10Var;
                if (f10Var2 != null && !p30.m3002l(f10Var, f10Var2) && ((interfaceC0694rm = abstractC0493n.f4093C) != null || !abstractC0493n.f4100J)) {
                    if (interfaceC0694rm != null) {
                        abstractC0493n.m4087x0(interfaceC0694rm);
                    }
                    abstractC0493n.f4093C = null;
                    abstractC0493n.m2616G0();
                }
                return na1.f4229a;
            default:
                abstractC0493n.f4109y.invoke();
                return Boolean.TRUE;
        }
    }
}
