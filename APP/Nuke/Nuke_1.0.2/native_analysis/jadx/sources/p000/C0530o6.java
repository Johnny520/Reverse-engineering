package p000;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: o6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0530o6 extends th1 implements InterfaceC0355jm, on2, g51, j61, d43 {

    /* JADX INFO: renamed from: v */
    public final C0798v5 f7532v = new C0798v5(2, this);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0045b7 f7533w;

    public C0530o6(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7) {
        this.f7533w = viewTreeObserverOnGlobalLayoutListenerC0045b7;
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: X */
    public final boolean mo221X(KeyEvent keyEvent) {
        ok0 ok0Var;
        int[] iArr = vk0.f12001a;
        long jM4271z = qp0.m4271z(keyEvent);
        boolean z = true;
        if (b51.m440a(jM4271z, b51.f582b)) {
            ok0Var = new ok0(2);
        } else if (b51.m440a(jM4271z, b51.f583c)) {
            ok0Var = new ok0(1);
        } else if (b51.m440a(jM4271z, b51.f596p)) {
            ok0Var = new ok0(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            ok0Var = b51.m440a(jM4271z, b51.f587g) ? new ok0(4) : b51.m440a(jM4271z, b51.f586f) ? new ok0(3) : (b51.m440a(jM4271z, b51.f584d) || b51.m440a(jM4271z, b51.f568C)) ? new ok0(5) : (b51.m440a(jM4271z, b51.f585e) || b51.m440a(jM4271z, b51.f569D)) ? new ok0(6) : (b51.m440a(jM4271z, b51.f588h) || b51.m440a(jM4271z, b51.f598r) || b51.m440a(jM4271z, b51.f570E)) ? new ok0(7) : (b51.m440a(jM4271z, b51.f581a) || b51.m440a(jM4271z, b51.f601u)) ? new ok0(8) : null;
        }
        if (ok0Var != null) {
            int i = ok0Var.f7701a;
            if (qp0.m4222C(keyEvent) == 2) {
                ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f7533w;
                pl0 pl0VarM561f = ((bl0) viewTreeObserverOnGlobalLayoutListenerC0045b7.getFocusOwner()).m561f();
                if (pl0VarM561f == null || !pl0VarM561f.f8385v || !viewTreeObserverOnGlobalLayoutListenerC0045b7.m480x(i)) {
                    Boolean boolM560e = ((bl0) viewTreeObserverOnGlobalLayoutListenerC0045b7.getFocusOwner()).m560e(i, viewTreeObserverOnGlobalLayoutListenerC0045b7.getEmbeddedViewFocusRect(), new C0798v5(1, ok0Var));
                    if (!(boolM560e != null ? boolM560e.booleanValue() : true)) {
                        if (i != 1 && i != 2) {
                            z = false;
                        }
                        if (z) {
                            Integer numM5710c = vk0.m5710c(i);
                            int iIntValue = numM5710c != null ? numM5710c.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = viewTreeObserverOnGlobalLayoutListenerC0045b7.getRootView();
                            rootView.getClass();
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewTreeObserverOnGlobalLayoutListenerC0045b7.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC0045b7)) {
                                return ((bl0) viewTreeObserverOnGlobalLayoutListenerC0045b7.getFocusOwner()).m563h(i);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        sz1 sz1VarMo2340e = if1Var.mo2340e(j);
        return pf1Var.mo691S(sz1VarMo2340e.f10438h, sz1VarMo2340e.f10439i, ce0.f1492h, this.f7532v, new C0487n6(sz1VarMo2340e, 0));
    }

    @Override // p000.InterfaceC0355jm
    /* JADX INFO: renamed from: f0 */
    public final Object mo2513f0(zn1 zn1Var, C0723t6 c0723t6, u00 u00Var) {
        long jMo646M = zn1Var.mo646M(0L);
        o62 o62Var = (o62) c0723t6.mo6a();
        o62 o62VarM3521i = o62Var != null ? o62Var.m3521i(jMo646M) : null;
        if (o62VarM3521i != null) {
            this.f7533w.requestRectangleOnScreen(new Rect((int) o62VarM3521i.f7536a, (int) o62VarM3521i.f7537b, (int) o62VarM3521i.f7538c, (int) o62VarM3521i.f7539d), false);
        }
        return a83.f116a;
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: k */
    public final boolean mo231k(KeyEvent keyEvent) {
        return false;
    }

    @Override // p000.d43
    /* JADX INFO: renamed from: r */
    public final Object mo962r() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: l0 */
    public final void mo232l0(zn2 zn2Var) {
    }
}
