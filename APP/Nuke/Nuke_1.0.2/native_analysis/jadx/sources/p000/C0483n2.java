package p000;

/* JADX INFO: renamed from: n2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0483n2 extends w51 implements mn0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f6968i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f6969j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0483n2(int i, Object obj) {
        super(2);
        this.f6968i = i;
        this.f6969j = obj;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f6968i;
        rh1 rh1Var = rh1.f9587a;
        a83 a83Var = a83.f116a;
        Object obj3 = this.f6969j;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Number) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    ((AbstractC0526o2) obj3).mo927a(0, go0Var);
                }
                break;
            case 1:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.m1961R();
                } else {
                    Object objM1956L = go0Var2.m1956L();
                    if (objM1956L == C0520nx.f7360a) {
                        objM1956L = C0799v6.f11765n;
                        go0Var2.m1981f0(objM1956L);
                    }
                    AbstractC0731te.m5218k(nn2.m3321a(rh1Var, false, (in0) objM1956L), (mn0) ((xk1) obj3).getValue(), go0Var2, 0);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                ((C0328ix) obj3).mo927a(pp0.m3902N(1), (InterfaceC0596px) obj);
                break;
            case 3:
                uh1 uh1Var = (uh1) obj;
                uh1 uh1VarM5284L = (sh1) obj2;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj3;
                if (uh1VarM5284L instanceof C0477mx) {
                    nn0 nn0Var = ((C0477mx) uh1VarM5284L).f6912a;
                    xe1.m6119f(3, nn0Var);
                    uh1VarM5284L = AbstractC0738tl.m5284L(interfaceC0596px3, (uh1) nn0Var.mo489e(rh1Var, interfaceC0596px3, 0));
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                ((m80) obj3).mo927a(pp0.m3902N(1), (InterfaceC0596px) obj);
                break;
            default:
                ((Number) obj2).intValue();
                ((d22) obj3).mo927a(pp0.m3902N(1), (InterfaceC0596px) obj);
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0483n2(AbstractC0526o2 abstractC0526o2, int i, int i2) {
        super(2);
        this.f6968i = i2;
        this.f6969j = abstractC0526o2;
    }
}
