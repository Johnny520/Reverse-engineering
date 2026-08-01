package p000;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: j3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0341j3 extends oe0 implements InterfaceC0123db, vz0, a50, r50, h91 {

    /* JADX INFO: renamed from: r */
    public final C0711s2 f2665r = new C0711s2(2, this);

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0875w3 f2666s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0341j3(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3) {
        this.f2666s = viewTreeObserverOnGlobalLayoutListenerC0875w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.a50
    /* JADX INFO: renamed from: I */
    public final boolean mo22I(KeyEvent keyEvent) {
        C0665qu c0665qu;
        int[] iArr = AbstractC0779tu.f6044a;
        long jM2968D = p30.m2968D(keyEvent);
        Integer num = null;
        if (y40.m5209a(jM2968D, y40.f7522b)) {
            c0665qu = new C0665qu(2);
        } else if (y40.m5209a(jM2968D, y40.f7523c)) {
            c0665qu = new C0665qu(1);
        } else if (y40.m5209a(jM2968D, y40.f7529i)) {
            c0665qu = new C0665qu(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            c0665qu = y40.m5209a(jM2968D, y40.f7527g) ? new C0665qu(4) : y40.m5209a(jM2968D, y40.f7526f) ? new C0665qu(3) : (y40.m5209a(jM2968D, y40.f7524d) || y40.m5209a(jM2968D, y40.f7533m)) ? new C0665qu(5) : (y40.m5209a(jM2968D, y40.f7525e) || y40.m5209a(jM2968D, y40.f7534n)) ? new C0665qu(6) : (y40.m5209a(jM2968D, y40.f7528h) || y40.m5209a(jM2968D, y40.f7531k) || y40.m5209a(jM2968D, y40.f7535o)) ? new C0665qu(7) : (y40.m5209a(jM2968D, y40.f7521a) || y40.m5209a(jM2968D, y40.f7532l)) ? new C0665qu(8) : null;
        }
        if (c0665qu != null) {
            int i = c0665qu.f5222a;
            if (p30.m2971G(keyEvent) == 2) {
                ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f2666s;
                ((C1017zu) viewTreeObserverOnGlobalLayoutListenerC0875w3.getFocusOwner()).getClass();
                Boolean boolM5611e = ((C1017zu) viewTreeObserverOnGlobalLayoutListenerC0875w3.getFocusOwner()).m5611e(i, viewTreeObserverOnGlobalLayoutListenerC0875w3.getEmbeddedViewFocusRect(), new C0711s2(1, c0665qu));
                if (boolM5611e != null ? boolM5611e.booleanValue() : true) {
                    return true;
                }
                if (i == 1 || i == 2) {
                    if (i == 5) {
                        num = 33;
                    } else if (i == 6) {
                        num = 130;
                    } else if (i == 3) {
                        num = 17;
                    } else if (i == 4) {
                        num = 66;
                    } else if (i == 1) {
                        num = 2;
                    } else if (i == 2) {
                        num = 1;
                    }
                    int iIntValue = num != null ? num.intValue() : 2;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = viewTreeObserverOnGlobalLayoutListenerC0875w3.getRootView();
                    rootView.getClass();
                    View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewTreeObserverOnGlobalLayoutListenerC0875w3.getView(), iIntValue);
                    if (viewFindNextFocus == null || viewFindNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC0875w3)) {
                        return ((C1017zu) viewTreeObserverOnGlobalLayoutListenerC0875w3.getFocusOwner()).m5613g(i);
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.r50
    /* JADX INFO: renamed from: Y */
    public final yd0 mo790Y(zd0 zd0Var, sd0 sd0Var, long j) {
        xq0 xq0VarMo184e = sd0Var.mo184e(j);
        return zd0Var.mo1278E(xq0VarMo184e.f7400d, xq0VarMo184e.f7401e, C0330is.f2614d, this.f2665r, new C0306i3(xq0VarMo184e, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0123db
    /* JADX INFO: renamed from: a0 */
    public final Object mo674a0(qj0 qj0Var, C0458m3 c0458m3, m51 m51Var) {
        long jM3275P0 = qj0Var.m3275P0(0L);
        st0 st0Var = (st0) c0458m3.invoke();
        st0 st0VarM4105e = st0Var != null ? st0Var.m4105e(jM3275P0) : null;
        if (st0VarM4105e != null) {
            this.f2666s.requestRectangleOnScreen(new Rect((int) st0VarM4105e.f5832a, (int) st0VarM4105e.f5833b, (int) st0VarM4105e.f5834c, (int) st0VarM4105e.f5835d), false);
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.h91
    /* JADX INFO: renamed from: k */
    public final Object mo1247k() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // p000.vz0
    /* JADX INFO: renamed from: S */
    public final void mo757S(f01 f01Var) {
    }
}
