package p000;

/* JADX INFO: renamed from: b8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0046b8 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f726h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f727i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f728j;

    public /* synthetic */ C0046b8(t81 t81Var, int i) {
        this.f728j = t81Var;
        this.f727i = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f726h;
        a83 a83Var = a83.f116a;
        int i2 = this.f727i;
        Object obj3 = this.f728j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0157e8.m1290b((uh1) obj3, (InterfaceC0596px) obj, pp0.m3902N(1), i2);
                break;
            default:
                t81 t81Var = (t81) obj3;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    l11 l11VarM1298e = t81Var.f10608b.f9976a.m1298e(i2);
                    ((C0402kw) l11VarM1298e.f5880c.f564k).mo171o(t81Var.f10609c, Integer.valueOf(i2 - l11VarM1298e.f5878a), go0Var, 0);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0046b8(uh1 uh1Var, int i, int i2) {
        this.f728j = uh1Var;
        this.f727i = i2;
    }
}
