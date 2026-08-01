package p047I0;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p007B0.C0172E;
import p007B0.C0190d;
import p029F0.AbstractC0391b0;
import p029F0.C0397e0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.AbstractC0596h0;
import p041H0.InterfaceC0558E0;
import p041H0.InterfaceC0597i;
import p041H0.InterfaceC0627x;
import p041H0.InterfaceC0632z0;
import p056K2.C0891q;
import p061L2.C0982v;
import p063M0.InterfaceC0993a;
import p077P0.InterfaceC1136w;
import p084Q2.AbstractC1178c;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p198m0.AbstractC2577h;
import p198m0.C2567A;
import p198m0.C2575f;
import p198m0.C2584o;
import p204n0.C2684c;
import p273z0.AbstractC3508a;
import p273z0.AbstractC3510c;
import p273z0.InterfaceC3512e;

/* JADX INFO: renamed from: I0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0749n extends AbstractC2206o implements InterfaceC0993a, InterfaceC0632z0, InterfaceC3512e, InterfaceC0627x, InterfaceC0558E0, InterfaceC0597i {

    /* JADX INFO: renamed from: r */
    public final C0172E f2333r = new C0172E(5, this);

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0772y f2334s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0749n(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y) {
        this.f2334s = viewTreeObserverOnGlobalLayoutListenerC0772y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p273z0.InterfaceC3512e
    /* JADX INFO: renamed from: U */
    public final boolean mo1266U(KeyEvent keyEvent) {
        C2575f c2575f;
        int[] iArr = AbstractC2577h.f8211a;
        long jM5764b = AbstractC3510c.m5764b(keyEvent);
        boolean z5 = true;
        if (AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10926b)) {
            c2575f = new C2575f(2);
        } else if (AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10927c)) {
            c2575f = new C2575f(1);
        } else if (AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10940p)) {
            c2575f = new C2575f(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            c2575f = AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10931g) ? new C2575f(4) : AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10930f) ? new C2575f(3) : (AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10928d) || AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10921C)) ? new C2575f(5) : (AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10929e) || AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10922D)) ? new C2575f(6) : (AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10932h) || AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10942r) || AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10923E)) ? new C2575f(7) : (AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10925a) || AbstractC3508a.m5762a(jM5764b, AbstractC3508a.f10945u)) ? new C2575f(8) : null;
        }
        if (c2575f != null) {
            int i5 = c2575f.f8210a;
            if (AbstractC3510c.m5765c(keyEvent) == 2) {
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f2334s;
                C2567A c2567aM4531f = ((C2584o) viewTreeObserverOnGlobalLayoutListenerC0772y.getFocusOwner()).m4531f();
                if (c2567aM4531f == null || !c2567aM4531f.f8189r || !viewTreeObserverOnGlobalLayoutListenerC0772y.m1317w(i5)) {
                    Boolean boolM4530e = ((C2584o) viewTreeObserverOnGlobalLayoutListenerC0772y.getFocusOwner()).m4530e(i5, viewTreeObserverOnGlobalLayoutListenerC0772y.getEmbeddedViewFocusRect(), new C0172E(4, c2575f));
                    if (!(boolM4530e != null ? boolM4530e.booleanValue() : true)) {
                        if (i5 != 1 && i5 != 2) {
                            z5 = false;
                        }
                        if (z5) {
                            Integer numM4523c = AbstractC2577h.m4523c(i5);
                            int iIntValue = numM4523c != null ? numM4523c.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = viewTreeObserverOnGlobalLayoutListenerC0772y.getRootView();
                            AbstractC1665j.m2983c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewTreeObserverOnGlobalLayoutListenerC0772y.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC0772y)) {
                                return ((C2584o) viewTreeObserverOnGlobalLayoutListenerC0772y.getFocusOwner()).m4533h(i5);
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
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(j5);
        return interfaceC0379Q.mo605r(abstractC0391b0Mo648e.f1206d, abstractC0391b0Mo648e.f1207e, C0982v.f3048d, this.f2333r, new C0397e0(abstractC0391b0Mo648e, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p273z0.InterfaceC3512e
    /* JADX INFO: renamed from: k */
    public final boolean mo1267k(KeyEvent keyEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0558E0
    /* JADX INFO: renamed from: s */
    public final Object mo146s() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p063M0.InterfaceC0993a
    /* JADX INFO: renamed from: t0 */
    public final Object mo1268t0(AbstractC0596h0 abstractC0596h0, C0190d c0190d, AbstractC1178c abstractC1178c) {
        long jMo638R = abstractC0596h0.mo638R(0L);
        C2684c c2684c = (C2684c) c0190d.mo6a();
        C2684c c2684cM4658i = c2684c != null ? c2684c.m4658i(jMo638R) : null;
        if (c2684cM4658i != null) {
            this.f2334s.requestRectangleOnScreen(new Rect((int) c2684cM4658i.f8558a, (int) c2684cM4658i.f8559b, (int) c2684cM4658i.f8560c, (int) c2684cM4658i.f8561d), false);
        }
        return C0891q.f2780a;
    }

    @Override // p041H0.InterfaceC0632z0
    /* JADX INFO: renamed from: X */
    public final void mo943X(InterfaceC1136w interfaceC1136w) {
    }
}
