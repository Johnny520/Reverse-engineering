package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yn1 extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f13531i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ zn1 f13532j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yn1(zn1 zn1Var, int i) {
        super(0);
        this.f13531i = i;
        this.f13532j = zn1Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f13531i;
        a83 a83Var = a83.f116a;
        zn1 zn1Var = this.f13532j;
        switch (i) {
            case 0:
                InterfaceC0627qp interfaceC0627qp = zn1Var.f13980O;
                interfaceC0627qp.getClass();
                zn1Var.m6448M0(interfaceC0627qp, zn1Var.f13979N);
                break;
            default:
                zn1 zn1Var2 = zn1Var.f13987x;
                if (zn1Var2 != null) {
                    zn1Var2.m6457Z0();
                }
                break;
        }
        return a83Var;
    }
}
