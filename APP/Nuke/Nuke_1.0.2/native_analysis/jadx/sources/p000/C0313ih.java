package p000;

import java.util.Set;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: ih */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0313ih implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4610h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xm0 f4611i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ in0 f4612j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ xk1 f4613k;

    public /* synthetic */ C0313ih(xm0 xm0Var, in0 in0Var, xk1 xk1Var, int i) {
        this.f4610h = i;
        this.f4611i = xm0Var;
        this.f4612j = in0Var;
        this.f4613k = xk1Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        int i = this.f4610h;
        a83 a83Var = a83.f116a;
        C0160eb c0160eb = C0520nx.f7360a;
        xk1 xk1Var = this.f4613k;
        in0 in0Var = this.f4612j;
        switch (i) {
            case 0:
                pb2 pb2Var = (pb2) obj;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                pb2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((go0) interfaceC0596px).m1980f(pb2Var) ? 4 : 2;
                }
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    go0Var.m1961R();
                } else {
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var), this.f4611i, pb2.m3843a(pb2Var), false, 0, go0Var, 0, 56);
                    String strM4463Q = rg3.m4463Q(R.string.auto_receive_redpacket_confirm_count, new Object[]{Integer.valueOf(((Set) xk1Var.getValue()).size())}, go0Var);
                    boolean zM1980f = go0Var.m1980f(in0Var) | go0Var.m1980f(xk1Var);
                    Object objM1956L = go0Var.m1956L();
                    if (zM1980f || objM1956L == c0160eb) {
                        objM1956L = new C0580ph(in0Var, xk1Var, 0);
                        go0Var.m1981f0(objM1956L);
                    }
                    AbstractC0691se.m4846q(strM4463Q, (xm0) objM1956L, pb2.m3843a(pb2Var), false, 0, go0Var, 0, 56);
                }
                break;
            case 1:
                pb2 pb2Var2 = (pb2) obj;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                pb2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((go0) interfaceC0596px2).m1980f(pb2Var2) ? 4 : 2;
                }
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    go0Var2.m1961R();
                } else {
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var2), this.f4611i, pb2.m3843a(pb2Var2), false, 0, go0Var2, 0, 56);
                    String strM4463Q2 = rg3.m4463Q(R.string.auto_receive_transfer_money_confirm_count, new Object[]{Integer.valueOf(((Set) xk1Var.getValue()).size())}, go0Var2);
                    boolean zM1980f2 = go0Var2.m1980f(in0Var) | go0Var2.m1980f(xk1Var);
                    Object objM1956L2 = go0Var2.m1956L();
                    if (zM1980f2 || objM1956L2 == c0160eb) {
                        objM1956L2 = new C0580ph(in0Var, xk1Var, 1);
                        go0Var2.m1981f0(objM1956L2);
                    }
                    AbstractC0691se.m4846q(strM4463Q2, (xm0) objM1956L2, pb2.m3843a(pb2Var2), false, 0, go0Var2, 0, 56);
                }
                break;
            case 2:
                pb2 pb2Var3 = (pb2) obj;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                pb2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((go0) interfaceC0596px3).m1980f(pb2Var3) ? 4 : 2;
                }
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    go0Var3.m1961R();
                } else {
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var3), this.f4611i, pb2.m3843a(pb2Var3), false, 0, go0Var3, 0, 56);
                    String strM4462P = rg3.m4462P(R.string.home_settings_save, go0Var3);
                    boolean zM1980f3 = go0Var3.m1980f(in0Var) | go0Var3.m1980f(xk1Var);
                    Object objM1956L3 = go0Var3.m1956L();
                    if (zM1980f3 || objM1956L3 == c0160eb) {
                        objM1956L3 = new C0580ph(in0Var, xk1Var, 2);
                        go0Var3.m1981f0(objM1956L3);
                    }
                    AbstractC0691se.m4846q(strM4462P, (xm0) objM1956L3, pb2.m3843a(pb2Var3), false, 0, go0Var3, 0, 56);
                }
                break;
            default:
                pb2 pb2Var4 = (pb2) obj;
                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                pb2Var4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((go0) interfaceC0596px4).m1980f(pb2Var4) ? 4 : 2;
                }
                go0 go0Var4 = (go0) interfaceC0596px4;
                if (!go0Var4.m1958O(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    go0Var4.m1961R();
                } else {
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var4), this.f4611i, pb2.m3843a(pb2Var4), false, 0, go0Var4, 0, 56);
                    String strM4462P2 = rg3.m4462P(R.string.home_settings_save, go0Var4);
                    boolean zM1980f4 = go0Var4.m1980f(in0Var) | go0Var4.m1980f(xk1Var);
                    Object objM1956L4 = go0Var4.m1956L();
                    if (zM1980f4 || objM1956L4 == c0160eb) {
                        objM1956L4 = new C0580ph(in0Var, xk1Var, 3);
                        go0Var4.m1981f0(objM1956L4);
                    }
                    AbstractC0691se.m4846q(strM4462P2, (xm0) objM1956L4, pb2.m3843a(pb2Var4), false, 0, go0Var4, 0, 56);
                }
                break;
        }
        return a83Var;
    }
}
