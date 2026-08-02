package defpackage;

import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class we implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xm0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ we(xm0 xm0Var, int i) {
        this.h = 1;
        this.i = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    sp0.g(rg3.P(R.string.home_settings_update_check_failed, go0Var), null, rg3.P(R.string.home_settings_update_check_failed_description, go0Var), ci0.s, null, null, false, null, null, go0Var, 3072, 498);
                    ci0.f(0.0f, go0Var, 0, 1);
                    sp0.g(rg3.P(R.string.home_settings_update_try_again, go0Var), null, null, ci0.t, null, null, false, this.i, null, go0Var, 3072, 374);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                se.n(this.i, (px) obj, pp0.N(1));
                break;
            default:
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.R();
                } else {
                    sp0.g(rg3.P(R.string.home_settings_update_up_to_date, go0Var2), null, rg3.P(R.string.home_settings_update_up_to_date_description, go0Var2), ci0.l, null, null, false, null, null, go0Var2, 3072, 498);
                    ci0.f(0.0f, go0Var2, 0, 1);
                    sp0.g(rg3.P(R.string.home_settings_update_check_again, go0Var2), null, null, ci0.m, null, null, false, this.i, null, go0Var2, 3072, 374);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ we(xm0 xm0Var, int i, byte b) {
        this.h = i;
        this.i = xm0Var;
    }
}
