package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fk2 implements nn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ cq1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ fk2(cq1 cq1Var, int i) {
        this.h = i;
        this.i = cq1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        String strQ;
        int i = this.h;
        a83 a83Var = a83.a;
        cq1 cq1Var = this.i;
        switch (i) {
            case 0:
                px pxVar = (px) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((o71) obj).getClass();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    go0Var.R();
                } else {
                    ci0.g(null, cq1Var.b, rg3.P(R.string.script_settings_no_schema, go0Var), go0Var, 0, 1);
                }
                break;
            default:
                px pxVar2 = (px) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bv) obj).getClass();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    go0Var2.R();
                } else {
                    boolean z = cq1Var.f;
                    String str = cq1Var.b;
                    if (z) {
                        go0Var2.W(725364599);
                        strQ = rg3.Q(R.string.script_settings_revoke_running_message, new Object[]{str}, go0Var2);
                        go0Var2.p(false);
                    } else {
                        go0Var2.W(725555094);
                        strQ = rg3.Q(R.string.script_settings_revoke_disabled_message, new Object[]{str}, go0Var2);
                        go0Var2.p(false);
                    }
                    qp0.e(strQ, null, go0Var2, 0, 2);
                }
                break;
        }
        return a83Var;
    }
}
