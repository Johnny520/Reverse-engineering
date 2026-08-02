package p000;

import me.dartcv.nuke.R;

/* JADX INFO: renamed from: we */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0844we implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f12473h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xm0 f12474i;

    public /* synthetic */ C0844we(xm0 xm0Var, int i) {
        this.f12473h = 1;
        this.f12474i = xm0Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f12473h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (!go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.m1961R();
                } else {
                    sp0.m4940g(rg3.m4462P(R.string.home_settings_update_check_failed, go0Var), null, rg3.m4462P(R.string.home_settings_update_check_failed_description, go0Var), ci0.f1563s, null, null, false, null, null, go0Var, 3072, 498);
                    ci0.m805f(0.0f, go0Var, 0, 1);
                    sp0.m4940g(rg3.m4462P(R.string.home_settings_update_try_again, go0Var), null, null, ci0.f1564t, null, null, false, this.f12474i, null, go0Var, 3072, 374);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0691se.m4843n(this.f12474i, (InterfaceC0596px) obj, pp0.m3902N(1));
                break;
            default:
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (!go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.m1961R();
                } else {
                    sp0.m4940g(rg3.m4462P(R.string.home_settings_update_up_to_date, go0Var2), null, rg3.m4462P(R.string.home_settings_update_up_to_date_description, go0Var2), ci0.f1556l, null, null, false, null, null, go0Var2, 3072, 498);
                    ci0.m805f(0.0f, go0Var2, 0, 1);
                    sp0.m4940g(rg3.m4462P(R.string.home_settings_update_check_again, go0Var2), null, null, ci0.f1557m, null, null, false, this.f12474i, null, go0Var2, 3072, 374);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0844we(xm0 xm0Var, int i, byte b) {
        this.f12473h = i;
        this.f12474i = xm0Var;
    }
}
