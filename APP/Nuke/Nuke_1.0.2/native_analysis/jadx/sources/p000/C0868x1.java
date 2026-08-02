package p000;

import me.dartcv.nuke.R;

/* JADX INFO: renamed from: x1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0868x1 implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12764h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f12765i;

    public /* synthetic */ C0868x1(String str, int i) {
        this.f12764h = i;
        this.f12765i = str;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        int i = this.f12764h;
        String str = this.f12765i;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.m1961R();
                } else {
                    AbstractC0731te.m5198a(str, fg1.m1615G(AbstractC0731te.f10693e, 0.0f, 16.0f, 0.0f, 8.0f, 5), go0Var, 48);
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
                    fg1.m1631d(str, xm0Var, go0Var2, (iIntValue2 << 3) & 112);
                }
                break;
            case 2:
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (!go0Var3.m1958O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    go0Var3.m1961R();
                } else {
                    rh1 rh1Var = rh1.f9587a;
                    uh1 uh1VarM1615G = fg1.m1615G(rh1Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    String strM4462P = rg3.m4462P(R.string.display_contact_id_label, go0Var3);
                    tu2 tu2Var = ur1.f11452a;
                    AbstractC0179eu.m1446a(strM4462P, uh1VarM1615G, new m13(((lp1) go0Var3.m1988j(tu2Var)).f6238f, rg3.m4450D(13), im0.f4681k, 0L, 0, rg3.m4450D(18), null, null, 16646136), 0, false, 0, 0, go0Var3, 48, 1016);
                    Object objM1956L = go0Var3.m1956L();
                    if (objM1956L == C0520nx.f7360a) {
                        objM1956L = new C0251gs(16);
                        go0Var3.m1981f0(objM1956L);
                    }
                    tp0.m5357b(this.f12765i, (in0) objM1956L, null, null, null, null, false, 0, 0, false, true, null, null, null, go0Var3, 48, 6, 15356);
                    AbstractC0179eu.m1446a(rg3.m4462P(R.string.display_contact_id_copy_hint, go0Var3), fg1.m1615G(rh1Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), new m13(((lp1) go0Var3.m1988j(tu2Var)).f6238f, rg3.m4450D(12), null, 0L, 0, rg3.m4450D(17), null, null, 16646140), 0, false, 0, 0, go0Var3, 48, 1016);
                }
                break;
            case 3:
                C0069bv c0069bv = (C0069bv) obj;
                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                c0069bv.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((go0) interfaceC0596px4).m1980f(c0069bv) ? 4 : 2;
                }
                go0 go0Var4 = (go0) interfaceC0596px4;
                if (!go0Var4.m1958O(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    go0Var4.m1961R();
                } else {
                    qp0.m4250e(str, new bu0(), go0Var4, 0, 0);
                }
                break;
            default:
                InterfaceC0596px interfaceC0596px5 = (InterfaceC0596px) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var5 = (go0) interfaceC0596px5;
                if (!go0Var5.m1958O(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    go0Var5.m1961R();
                } else {
                    ci0.m806g(null, rg3.m4462P(R.string.script_settings_operation_failed, go0Var5), this.f12765i, go0Var5, 0, 1);
                }
                break;
        }
        return a83Var;
    }
}
