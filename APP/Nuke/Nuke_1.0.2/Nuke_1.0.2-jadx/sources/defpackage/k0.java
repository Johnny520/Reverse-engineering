package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xm0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ k0(xm0 xm0Var, int i) {
        this.h = i;
        this.i = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.h;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
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
                }
                break;
            case 1:
                xm0 xm0Var = (xm0) obj;
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xm0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((go0) pxVar2).h(xm0Var) ? 4 : 2;
                }
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    go0Var2.R();
                } else {
                    x30.d.getClass();
                    String strC = pp1.c().c("CustomInputHint/text");
                    if (strC == null) {
                        strC = "";
                    }
                    xm0 xm0Var2 = this.i;
                    boolean zF = go0Var2.f(xm0Var2) | ((iIntValue2 & 14) == 4);
                    Object objL = go0Var2.L();
                    if (zF || objL == nx.a) {
                        objL = new z(xm0Var2, xm0Var, 6);
                        go0Var2.f0(objL);
                    }
                    ci0.c(strC, xm0Var, (in0) objL, go0Var2, (iIntValue2 << 3) & 112);
                }
                break;
            default:
                pb2 pb2Var2 = (pb2) obj;
                px pxVar3 = (px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                pb2Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((go0) pxVar3).f(pb2Var2) ? 4 : 2;
                }
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    go0Var3.R();
                } else {
                    se.q(rg3.P(R.string.display_contact_id_close, go0Var3), this.i, pb2.a(pb2Var2), false, 0, go0Var3, 0, 56);
                }
                break;
        }
        return a83Var;
    }
}
