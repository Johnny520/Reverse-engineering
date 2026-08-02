package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: renamed from: r8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0647r8 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9423a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9424b;

    public /* synthetic */ C0647r8(int i, Object obj) {
        this.f9423a = i;
        this.f9424b = obj;
    }

    @Override // androidx.compose.p001ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s12 s12Var, t00 t00Var) {
        int i = this.f9423a;
        t00 t00Var2 = null;
        k20 k20Var = k20.f5323h;
        Object obj = this.f9424b;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                Object objM4958p = sp0.m4958p(s12Var, new C0608q8((C0685s8) obj, t00Var2, 0), t00Var);
                return objM4958p == k20Var ? objM4958p : a83Var;
            case 1:
                Object objM6513M0 = ((zw2) s12Var).m6513M0(new C0608q8((n10) obj, t00Var2, 2), t00Var);
                return objM6513M0 == k20Var ? objM6513M0 : a83Var;
            case 2:
                Object objM4958p2 = sp0.m4958p(s12Var, new ym2((aw2) obj, null), t00Var);
                return objM4958p2 == k20Var ? objM4958p2 : a83Var;
            case 3:
                Object objM4958p3 = sp0.m4958p(s12Var, new C0608q8(new C0151e2(1, (vy2) obj, vy2.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 6), t00Var2, 1), t00Var);
                if (objM4958p3 != k20Var) {
                    objM4958p3 = a83Var;
                }
                return objM4958p3 == k20Var ? objM4958p3 : a83Var;
            case 4:
                b03 b03Var = (b03) obj;
                Object objM3728j = p40.m3728j(s12Var, b03Var.f478A, b03Var.f505z, t00Var);
                return objM3728j == k20Var ? objM3728j : a83Var;
            default:
                Object objM5238u = AbstractC0731te.m5238u(new C0756u0(s12Var, (kz2) obj, null), t00Var);
                if (objM5238u != k20Var) {
                    objM5238u = a83Var;
                }
                return objM5238u == k20Var ? objM5238u : a83Var;
        }
    }
}
