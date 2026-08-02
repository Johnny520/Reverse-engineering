package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r8 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s12 s12Var, t00 t00Var) {
        int i = this.a;
        t00 t00Var2 = null;
        k20 k20Var = k20.h;
        Object obj = this.b;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                Object objP = sp0.p(s12Var, new q8((s8) obj, t00Var2, 0), t00Var);
                return objP == k20Var ? objP : a83Var;
            case 1:
                Object objM0 = ((zw2) s12Var).M0(new q8((n10) obj, t00Var2, 2), t00Var);
                return objM0 == k20Var ? objM0 : a83Var;
            case 2:
                Object objP2 = sp0.p(s12Var, new ym2((aw2) obj, null), t00Var);
                return objP2 == k20Var ? objP2 : a83Var;
            case 3:
                Object objP3 = sp0.p(s12Var, new q8(new e2(1, (vy2) obj, vy2.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 6), t00Var2, 1), t00Var);
                if (objP3 != k20Var) {
                    objP3 = a83Var;
                }
                return objP3 == k20Var ? objP3 : a83Var;
            case 4:
                b03 b03Var = (b03) obj;
                Object objJ = p40.j(s12Var, b03Var.A, b03Var.z, t00Var);
                return objJ == k20Var ? objJ : a83Var;
            default:
                Object objU = te.u(new u0(s12Var, (kz2) obj, null), t00Var);
                if (objU != k20Var) {
                    objU = a83Var;
                }
                return objU == k20Var ? objU : a83Var;
        }
    }
}
