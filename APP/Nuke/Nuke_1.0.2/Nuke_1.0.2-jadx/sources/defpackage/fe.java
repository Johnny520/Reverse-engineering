package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fe implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xm0 i;
    public final /* synthetic */ in0 j;
    public final /* synthetic */ xk1 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ Object m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ fe(xm0 xm0Var, in0 in0Var, xk1 xk1Var, Object obj, boolean z, int i) {
        this.h = i;
        this.i = xm0Var;
        this.j = in0Var;
        this.k = xk1Var;
        this.m = obj;
        this.l = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.h;
        a83 a83Var = a83.a;
        eb ebVar = nx.a;
        Object obj4 = this.m;
        xk1 xk1Var = this.k;
        in0 in0Var = this.j;
        int i2 = 1;
        switch (i) {
            case 0:
                xk1 xk1Var2 = (xk1) obj4;
                pb2 pb2Var = (pb2) obj;
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) pxVar).f(pb2Var) ? 4 : 2;
                }
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    go0Var.R();
                } else {
                    se.r(rg3.P(R.string.home_settings_cancel, go0Var), this.i, pb2.a(pb2Var), false, 0, go0Var, 0, 56);
                    String strP = rg3.P(R.string.home_settings_save, go0Var);
                    uh1 uh1VarA = pb2.a(pb2Var);
                    boolean zF = go0Var.f(in0Var) | go0Var.f(xk1Var) | go0Var.f(xk1Var2);
                    Object objL = go0Var.L();
                    if (zF || objL == ebVar) {
                        objL = new s1((Object) in0Var, xk1Var, xk1Var2, i2);
                        go0Var.f0(objL);
                    }
                    se.q(strP, (xm0) objL, uh1VarA, this.l, 0, go0Var, 0, 48);
                }
                break;
            default:
                Integer num = (Integer) obj4;
                pb2 pb2Var2 = (pb2) obj;
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pb2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((go0) pxVar2).f(pb2Var2) ? 4 : 2;
                }
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    go0Var2.R();
                } else {
                    se.r(rg3.P(R.string.home_settings_cancel, go0Var2), this.i, pb2.a(pb2Var2), false, 0, go0Var2, 0, 56);
                    String strP2 = rg3.P(R.string.home_settings_save, go0Var2);
                    uh1 uh1VarA2 = pb2.a(pb2Var2);
                    boolean zF2 = go0Var2.f(in0Var) | go0Var2.f(xk1Var) | go0Var2.f(num);
                    Object objL2 = go0Var2.L();
                    if (zF2 || objL2 == ebVar) {
                        objL2 = new s1(in0Var, num, xk1Var, 15);
                        go0Var2.f0(objL2);
                    }
                    se.q(strP2, (xm0) objL2, uh1VarA2, this.l, 0, go0Var2, 0, 48);
                }
                break;
        }
        return a83Var;
    }
}
