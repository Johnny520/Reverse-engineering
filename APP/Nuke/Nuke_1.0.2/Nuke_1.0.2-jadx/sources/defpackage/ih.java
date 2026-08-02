package defpackage;

import java.util.Set;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ih implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xm0 i;
    public final /* synthetic */ in0 j;
    public final /* synthetic */ xk1 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ih(xm0 xm0Var, in0 in0Var, xk1 xk1Var, int i) {
        this.h = i;
        this.i = xm0Var;
        this.j = in0Var;
        this.k = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.h;
        a83 a83Var = a83.a;
        eb ebVar = nx.a;
        xk1 xk1Var = this.k;
        in0 in0Var = this.j;
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
                    String strQ = rg3.Q(R.string.auto_receive_redpacket_confirm_count, new Object[]{Integer.valueOf(((Set) xk1Var.getValue()).size())}, go0Var);
                    boolean zF = go0Var.f(in0Var) | go0Var.f(xk1Var);
                    Object objL = go0Var.L();
                    if (zF || objL == ebVar) {
                        objL = new ph(in0Var, xk1Var, 0);
                        go0Var.f0(objL);
                    }
                    se.q(strQ, (xm0) objL, pb2.a(pb2Var), false, 0, go0Var, 0, 56);
                }
                break;
            case 1:
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
                    String strQ2 = rg3.Q(R.string.auto_receive_transfer_money_confirm_count, new Object[]{Integer.valueOf(((Set) xk1Var.getValue()).size())}, go0Var2);
                    boolean zF2 = go0Var2.f(in0Var) | go0Var2.f(xk1Var);
                    Object objL2 = go0Var2.L();
                    if (zF2 || objL2 == ebVar) {
                        objL2 = new ph(in0Var, xk1Var, 1);
                        go0Var2.f0(objL2);
                    }
                    se.q(strQ2, (xm0) objL2, pb2.a(pb2Var2), false, 0, go0Var2, 0, 56);
                }
                break;
            case 2:
                pb2 pb2Var3 = (pb2) obj;
                px pxVar3 = (px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                pb2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((go0) pxVar3).f(pb2Var3) ? 4 : 2;
                }
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    go0Var3.R();
                } else {
                    se.r(rg3.P(R.string.home_settings_cancel, go0Var3), this.i, pb2.a(pb2Var3), false, 0, go0Var3, 0, 56);
                    String strP = rg3.P(R.string.home_settings_save, go0Var3);
                    boolean zF3 = go0Var3.f(in0Var) | go0Var3.f(xk1Var);
                    Object objL3 = go0Var3.L();
                    if (zF3 || objL3 == ebVar) {
                        objL3 = new ph(in0Var, xk1Var, 2);
                        go0Var3.f0(objL3);
                    }
                    se.q(strP, (xm0) objL3, pb2.a(pb2Var3), false, 0, go0Var3, 0, 56);
                }
                break;
            default:
                pb2 pb2Var4 = (pb2) obj;
                px pxVar4 = (px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                pb2Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((go0) pxVar4).f(pb2Var4) ? 4 : 2;
                }
                go0 go0Var4 = (go0) pxVar4;
                if (!go0Var4.O(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    go0Var4.R();
                } else {
                    se.r(rg3.P(R.string.home_settings_cancel, go0Var4), this.i, pb2.a(pb2Var4), false, 0, go0Var4, 0, 56);
                    String strP2 = rg3.P(R.string.home_settings_save, go0Var4);
                    boolean zF4 = go0Var4.f(in0Var) | go0Var4.f(xk1Var);
                    Object objL4 = go0Var4.L();
                    if (zF4 || objL4 == ebVar) {
                        objL4 = new ph(in0Var, xk1Var, 3);
                        go0Var4.f0(objL4);
                    }
                    se.q(strP2, (xm0) objL4, pb2.a(pb2Var4), false, 0, go0Var4, 0, 56);
                }
                break;
        }
        return a83Var;
    }
}
