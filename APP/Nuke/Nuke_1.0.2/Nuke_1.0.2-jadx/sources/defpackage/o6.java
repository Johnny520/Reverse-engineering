package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o6 extends th1 implements jm, on2, g51, j61, d43 {
    public final v5 v = new v5(2, this);
    public final /* synthetic */ b7 w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o6(b7 b7Var) {
        this.w = b7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g51
    public final boolean X(KeyEvent keyEvent) {
        ok0 ok0Var;
        int[] iArr = vk0.a;
        long jZ = qp0.z(keyEvent);
        boolean z = true;
        if (b51.a(jZ, b51.b)) {
            ok0Var = new ok0(2);
        } else if (b51.a(jZ, b51.c)) {
            ok0Var = new ok0(1);
        } else if (b51.a(jZ, b51.p)) {
            ok0Var = new ok0(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            ok0Var = b51.a(jZ, b51.g) ? new ok0(4) : b51.a(jZ, b51.f) ? new ok0(3) : (b51.a(jZ, b51.d) || b51.a(jZ, b51.C)) ? new ok0(5) : (b51.a(jZ, b51.e) || b51.a(jZ, b51.D)) ? new ok0(6) : (b51.a(jZ, b51.h) || b51.a(jZ, b51.r) || b51.a(jZ, b51.E)) ? new ok0(7) : (b51.a(jZ, b51.a) || b51.a(jZ, b51.u)) ? new ok0(8) : null;
        }
        if (ok0Var != null) {
            int i = ok0Var.a;
            if (qp0.C(keyEvent) == 2) {
                b7 b7Var = this.w;
                pl0 pl0VarF = ((bl0) b7Var.getFocusOwner()).f();
                if (pl0VarF == null || !pl0VarF.v || !b7Var.x(i)) {
                    Boolean boolE = ((bl0) b7Var.getFocusOwner()).e(i, b7Var.getEmbeddedViewFocusRect(), new v5(1, ok0Var));
                    if (!(boolE != null ? boolE.booleanValue() : true)) {
                        if (i != 1 && i != 2) {
                            z = false;
                        }
                        if (z) {
                            Integer numC = vk0.c(i);
                            int iIntValue = numC != null ? numC.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = b7Var.getRootView();
                            rootView.getClass();
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, b7Var.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(b7Var)) {
                                return ((bl0) b7Var.getFocusOwner()).h(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        sz1 sz1VarE = if1Var.e(j);
        return pf1Var.S(sz1VarE.h, sz1VarE.i, ce0.h, this.v, new n6(sz1VarE, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm
    public final Object f0(zn1 zn1Var, t6 t6Var, u00 u00Var) {
        long jM = zn1Var.M(0L);
        o62 o62Var = (o62) t6Var.a();
        o62 o62VarI = o62Var != null ? o62Var.i(jM) : null;
        if (o62VarI != null) {
            this.w.requestRectangleOnScreen(new Rect((int) o62VarI.a, (int) o62VarI.b, (int) o62VarI.c, (int) o62VarI.d), false);
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g51
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d43
    public final Object r() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.on2
    public final void l0(zn2 zn2Var) {
    }
}
