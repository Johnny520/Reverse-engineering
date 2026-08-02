package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y30 implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xk1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ y30(xk1 xk1Var, int i) {
        this.h = i;
        this.i = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        String strP;
        int i = this.h;
        eb ebVar = nx.a;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.i;
        switch (i) {
            case 0:
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.R();
                } else {
                    rh1 rh1Var = rh1.a;
                    uh1 uh1VarG = fg1.G(rh1Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    String strP2 = rg3.P(R.string.custom_input_hint_label, go0Var);
                    tu2 tu2Var = ur1.a;
                    eu.a(strP2, uh1VarG, new m13(((lp1) go0Var.j(tu2Var)).f, rg3.D(13), im0.k, 0L, 0, rg3.D(18), null, null, 16646136), 0, false, 0, 0, go0Var, 48, 1016);
                    String str = (String) xk1Var.getValue();
                    boolean zF = go0Var.f(xk1Var);
                    Object objL = go0Var.L();
                    if (zF || objL == ebVar) {
                        objL = new pr(xk1Var, 9);
                        go0Var.f0(objL);
                    }
                    tp0.b(str, (in0) objL, null, rg3.P(R.string.custom_input_hint_placeholder, go0Var), null, null, false, 0, 0, false, false, null, null, null, go0Var, 0, 0, 16372);
                    eu.a(rg3.P(R.string.custom_input_hint_help, go0Var), fg1.G(rh1Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var.j(tu2Var)).f, rg3.D(12), null, 0L, 0, rg3.D(17), null, null, 16646140), 0, false, 0, 0, go0Var, 48, 1016);
                }
                break;
            case 1:
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.R();
                } else {
                    eu.a(rg3.P(R.string.open_user_card_username_label, go0Var2), fg1.G(rh1.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), new m13(((lp1) go0Var2.j(ur1.a)).f, rg3.D(13), im0.k, 0L, 0, rg3.D(18), null, null, 16646136), 0, false, 0, 0, go0Var2, 48, 1016);
                    String str2 = (String) xk1Var.getValue();
                    Object objL2 = go0Var2.L();
                    if (objL2 == ebVar) {
                        objL2 = new pr(xk1Var, 19);
                        go0Var2.f0(objL2);
                    }
                    tp0.b(str2, (in0) objL2, null, rg3.P(R.string.open_user_card_username_hint, go0Var2), null, null, false, 0, 0, false, false, null, null, null, go0Var2, 48, 0, 16372);
                }
                break;
            default:
                px pxVar3 = (px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    go0Var3.R();
                } else {
                    if (((tq1) xk1Var.getValue()).b) {
                        go0Var3.W(-868239243);
                        strP = rg3.P(R.string.script_settings_scanning, go0Var3);
                        go0Var3.p(false);
                    } else {
                        go0Var3.W(-868121133);
                        strP = rg3.P(R.string.script_settings_none_found, go0Var3);
                        go0Var3.p(false);
                    }
                    String str3 = strP;
                    String strP3 = ((tq1) xk1Var.getValue()).c;
                    if (strP3 == null) {
                        go0Var3.W(-1552017935);
                        strP3 = rg3.P(R.string.script_settings_install_hint, go0Var3);
                    } else {
                        go0Var3.W(-1552019609);
                    }
                    go0Var3.p(false);
                    ci0.g(null, str3, strP3, go0Var3, 0, 1);
                }
                break;
        }
        return a83Var;
    }
}
