package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r13 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9322h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ x13 f9323i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ in0 f9324j;

    public /* synthetic */ r13(x13 x13Var, in0 in0Var, int i, int i2) {
        this.f9322h = i2;
        this.f9323i = x13Var;
        this.f9324j = in0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f9322h;
        a83 a83Var = a83.f116a;
        in0 in0Var = this.f9324j;
        x13 x13Var = this.f9323i;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                gf1.m1892j(x13Var, in0Var, interfaceC0596px, pp0.m3902N(1));
                break;
            case 1:
                gf1.m1893k(x13Var, in0Var, interfaceC0596px, pp0.m3902N(1));
                break;
            default:
                gf1.m1888f(x13Var, in0Var, interfaceC0596px, pp0.m3902N(1));
                break;
        }
        return a83Var;
    }
}
