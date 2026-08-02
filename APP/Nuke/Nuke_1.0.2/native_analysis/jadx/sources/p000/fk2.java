package p000;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk2 implements nn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3029h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ cq1 f3030i;

    public /* synthetic */ fk2(cq1 cq1Var, int i) {
        this.f3029h = i;
        this.f3030i = cq1Var;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final Object mo489e(Object obj, Object obj2, Object obj3) {
        String strM4463Q;
        int i = this.f3029h;
        a83 a83Var = a83.f116a;
        cq1 cq1Var = this.f3030i;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.m1961R();
                } else {
                    ci0.m806g(null, cq1Var.f1676b, rg3.m4462P(R.string.script_settings_no_schema, go0Var), go0Var, 0, 1);
                }
                break;
            default:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C0069bv) obj).getClass();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.m1961R();
                } else {
                    boolean z = cq1Var.f1680f;
                    String str = cq1Var.f1676b;
                    if (z) {
                        go0Var2.m1966W(725364599);
                        strM4463Q = rg3.m4463Q(R.string.script_settings_revoke_running_message, new Object[]{str}, go0Var2);
                        go0Var2.m1994p(false);
                    } else {
                        go0Var2.m1966W(725555094);
                        strM4463Q = rg3.m4463Q(R.string.script_settings_revoke_disabled_message, new Object[]{str}, go0Var2);
                        go0Var2.m1994p(false);
                    }
                    qp0.m4250e(strM4463Q, null, go0Var2, 0, 2);
                }
                break;
        }
        return a83Var;
    }
}
