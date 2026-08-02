package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ x1(String str, int i) {
        this.h = i;
        this.i = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.h;
        String str = this.i;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.R();
                } else {
                    te.a(str, fg1.G(te.e, 0.0f, 16.0f, 0.0f, 8.0f, 5), go0Var, 48);
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
                    fg1.d(str, xm0Var, go0Var2, (iIntValue2 << 3) & 112);
                }
                break;
            case 2:
                px pxVar3 = (px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    go0Var3.R();
                } else {
                    rh1 rh1Var = rh1.a;
                    uh1 uh1VarG = fg1.G(rh1Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    String strP = rg3.P(R.string.display_contact_id_label, go0Var3);
                    tu2 tu2Var = ur1.a;
                    eu.a(strP, uh1VarG, new m13(((lp1) go0Var3.j(tu2Var)).f, rg3.D(13), im0.k, 0L, 0, rg3.D(18), null, null, 16646136), 0, false, 0, 0, go0Var3, 48, 1016);
                    Object objL = go0Var3.L();
                    if (objL == nx.a) {
                        objL = new gs(16);
                        go0Var3.f0(objL);
                    }
                    tp0.b(this.i, (in0) objL, null, null, null, null, false, 0, 0, false, true, null, null, null, go0Var3, 48, 6, 15356);
                    eu.a(rg3.P(R.string.display_contact_id_copy_hint, go0Var3), fg1.G(rh1Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var3.j(tu2Var)).f, rg3.D(12), null, 0L, 0, rg3.D(17), null, null, 16646140), 0, false, 0, 0, go0Var3, 48, 1016);
                }
                break;
            case 3:
                bv bvVar = (bv) obj;
                px pxVar4 = (px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                bvVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((go0) pxVar4).f(bvVar) ? 4 : 2;
                }
                go0 go0Var4 = (go0) pxVar4;
                if (!go0Var4.O(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    go0Var4.R();
                } else {
                    qp0.e(str, new bu0(), go0Var4, 0, 0);
                }
                break;
            default:
                px pxVar5 = (px) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var5 = (go0) pxVar5;
                if (!go0Var5.O(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    go0Var5.R();
                } else {
                    ci0.g(null, rg3.P(R.string.script_settings_operation_failed, go0Var5), this.i, go0Var5, 0, 1);
                }
                break;
        }
        return a83Var;
    }
}
