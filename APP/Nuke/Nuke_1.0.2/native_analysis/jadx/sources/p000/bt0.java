package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bt0 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1010h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ zt0 f1011i;

    public /* synthetic */ bt0(zt0 zt0Var) {
        this.f1010h = 0;
        this.f1011i = zt0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f1010h;
        a83 a83Var = a83.f116a;
        zt0 zt0Var = this.f1011i;
        InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    s11.m4704l(zt0Var, go0Var, 0);
                }
                break;
            case 1:
                num.getClass();
                s11.m4706m(zt0Var, interfaceC0596px, pp0.m3902N(1));
                break;
            default:
                num.getClass();
                s11.m4704l(zt0Var, interfaceC0596px, pp0.m3902N(1));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ bt0(zt0 zt0Var, int i, int i2) {
        this.f1010h = i2;
        this.f1011i = zt0Var;
    }
}
