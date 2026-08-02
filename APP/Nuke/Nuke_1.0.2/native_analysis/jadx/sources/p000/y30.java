package p000;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y30 implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13287h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xk1 f13288i;

    public /* synthetic */ y30(xk1 xk1Var, int i) {
        this.f13287h = i;
        this.f13288i = xk1Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        String strM4462P;
        int i = this.f13287h;
        C0160eb c0160eb = C0520nx.f7360a;
        a83 a83Var = a83.f116a;
        xk1 xk1Var = this.f13288i;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.m1961R();
                } else {
                    rh1 rh1Var = rh1.f9587a;
                    uh1 uh1VarM1615G = fg1.m1615G(rh1Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    String strM4462P2 = rg3.m4462P(R.string.custom_input_hint_label, go0Var);
                    tu2 tu2Var = ur1.f11452a;
                    AbstractC0179eu.m1446a(strM4462P2, uh1VarM1615G, new m13(((lp1) go0Var.m1988j(tu2Var)).f6238f, rg3.m4450D(13), im0.f4681k, 0L, 0, rg3.m4450D(18), null, null, 16646136), 0, false, 0, 0, go0Var, 48, 1016);
                    String str = (String) xk1Var.getValue();
                    boolean zM1980f = go0Var.m1980f(xk1Var);
                    Object objM1956L = go0Var.m1956L();
                    if (zM1980f || objM1956L == c0160eb) {
                        objM1956L = new C0590pr(xk1Var, 9);
                        go0Var.m1981f0(objM1956L);
                    }
                    tp0.m5357b(str, (in0) objM1956L, null, rg3.m4462P(R.string.custom_input_hint_placeholder, go0Var), null, null, false, 0, 0, false, false, null, null, null, go0Var, 0, 0, 16372);
                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.custom_input_hint_help, go0Var), fg1.m1615G(rh1Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var.m1988j(tu2Var)).f6238f, rg3.m4450D(12), null, 0L, 0, rg3.m4450D(17), null, null, 16646140), 0, false, 0, 0, go0Var, 48, 1016);
                }
                break;
            case 1:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.m1961R();
                } else {
                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.open_user_card_username_label, go0Var2), fg1.m1615G(rh1.f9587a, 0.0f, 0.0f, 0.0f, 8.0f, 7), new m13(((lp1) go0Var2.m1988j(ur1.f11452a)).f6238f, rg3.m4450D(13), im0.f4681k, 0L, 0, rg3.m4450D(18), null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                    String str2 = (String) xk1Var.getValue();
                    Object objM1956L2 = go0Var2.m1956L();
                    if (objM1956L2 == c0160eb) {
                        objM1956L2 = new C0590pr(xk1Var, 19);
                        go0Var2.m1981f0(objM1956L2);
                    }
                    tp0.m5357b(str2, (in0) objM1956L2, null, rg3.m4462P(R.string.open_user_card_username_hint, go0Var2), null, null, false, 0, 0, false, false, null, null, null, go0Var2, 48, 0, 16372);
                }
                break;
            default:
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    go0Var3.m1961R();
                } else {
                    if (((tq1) xk1Var.getValue()).f10900b) {
                        go0Var3.m1966W(-868239243);
                        strM4462P = rg3.m4462P(R.string.script_settings_scanning, go0Var3);
                        go0Var3.m1994p(false);
                    } else {
                        go0Var3.m1966W(-868121133);
                        strM4462P = rg3.m4462P(R.string.script_settings_none_found, go0Var3);
                        go0Var3.m1994p(false);
                    }
                    String str3 = strM4462P;
                    String strM4462P3 = ((tq1) xk1Var.getValue()).f10901c;
                    if (strM4462P3 == null) {
                        go0Var3.m1966W(-1552017935);
                        strM4462P3 = rg3.m4462P(R.string.script_settings_install_hint, go0Var3);
                    } else {
                        go0Var3.m1966W(-1552019609);
                    }
                    go0Var3.m1994p(false);
                    ci0.m806g(null, str3, strM4462P3, go0Var3, 0, 1);
                }
                break;
        }
        return a83Var;
    }
}
