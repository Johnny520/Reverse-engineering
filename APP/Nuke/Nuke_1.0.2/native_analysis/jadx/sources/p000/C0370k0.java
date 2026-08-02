package p000;

import me.dartcv.nuke.R;

/* JADX INFO: renamed from: k0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0370k0 implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5290h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xm0 f5291i;

    public /* synthetic */ C0370k0(xm0 xm0Var, int i) {
        this.f5290h = i;
        this.f5291i = xm0Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        int i = this.f5290h;
        a83 a83Var = a83.f116a;
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
                    AbstractC0691se.m4847r(rg3.m4462P(R.string.home_settings_cancel, go0Var), this.f5291i, pb2.m3843a(pb2Var), false, 0, go0Var, 0, 56);
                }
                break;
            case 1:
                xm0 xm0Var = (xm0) obj;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xm0Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((go0) interfaceC0596px2).m1984h(xm0Var) ? 4 : 2;
                }
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    go0Var2.m1961R();
                } else {
                    x30.f12787d.getClass();
                    String strM3606c = pp1.m3931c().m3606c("CustomInputHint/text");
                    if (strM3606c == null) {
                        strM3606c = "";
                    }
                    xm0 xm0Var2 = this.f5291i;
                    boolean zM1980f = go0Var2.m1980f(xm0Var2) | ((iIntValue2 & 14) == 4);
                    Object objM1956L = go0Var2.m1956L();
                    if (zM1980f || objM1956L == C0520nx.f7360a) {
                        objM1956L = new C0944z(xm0Var2, xm0Var, 6);
                        go0Var2.m1981f0(objM1956L);
                    }
                    ci0.m802c(strM3606c, xm0Var, (in0) objM1956L, go0Var2, (iIntValue2 << 3) & 112);
                }
                break;
            default:
                pb2 pb2Var2 = (pb2) obj;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                pb2Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((go0) interfaceC0596px3).m1980f(pb2Var2) ? 4 : 2;
                }
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    go0Var3.m1961R();
                } else {
                    AbstractC0691se.m4846q(rg3.m4462P(R.string.display_contact_id_close, go0Var3), this.f5291i, pb2.m3843a(pb2Var2), false, 0, go0Var3, 0, 56);
                }
                break;
        }
        return a83Var;
    }
}
