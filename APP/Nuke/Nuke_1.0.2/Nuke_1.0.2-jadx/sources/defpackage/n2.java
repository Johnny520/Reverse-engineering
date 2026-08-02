package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends w51 implements mn0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(int i, Object obj) {
        super(2);
        this.i = i;
        this.j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        rh1 rh1Var = rh1.a;
        a83 a83Var = a83.a;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                px pxVar = (px) obj;
                int iIntValue = ((Number) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    ((o2) obj3).a(0, go0Var);
                }
                break;
            case 1:
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.R();
                } else {
                    Object objL = go0Var2.L();
                    if (objL == nx.a) {
                        objL = v6.n;
                        go0Var2.f0(objL);
                    }
                    te.k(nn2.a(rh1Var, false, (in0) objL), (mn0) ((xk1) obj3).getValue(), go0Var2, 0);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                ((ix) obj3).a(pp0.N(1), (px) obj);
                break;
            case 3:
                uh1 uh1Var = (uh1) obj;
                uh1 uh1VarL = (sh1) obj2;
                px pxVar3 = (px) obj3;
                if (uh1VarL instanceof mx) {
                    nn0 nn0Var = ((mx) uh1VarL).a;
                    xe1.f(3, nn0Var);
                    uh1VarL = tl.L(pxVar3, (uh1) nn0Var.e(rh1Var, pxVar3, 0));
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                ((m80) obj3).a(pp0.N(1), (px) obj);
                break;
            default:
                ((Number) obj2).intValue();
                ((d22) obj3).a(pp0.N(1), (px) obj);
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(o2 o2Var, int i, int i2) {
        super(2);
        this.i = i2;
        this.j = o2Var;
    }
}
