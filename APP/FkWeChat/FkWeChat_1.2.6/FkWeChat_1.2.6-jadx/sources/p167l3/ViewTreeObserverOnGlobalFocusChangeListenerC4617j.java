package p167l3;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p120i2.AbstractC3167a;
import p165l1.C4503i;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4547h1;
import p166l2.AbstractC4557k;
import p166l2.AbstractC4561l;
import p166l2.AbstractC4565m;
import p166l2.InterfaceC4580q1;
import p172l8.C4700i0;
import p235q1.AbstractC6210j0;
import p235q1.AbstractC6211k;
import p235q1.C6203g;
import p235q1.C6206h0;
import p235q1.InterfaceC6205h;
import p235q1.InterfaceC6223q;
import p235q1.InterfaceC6226t;
import p235q1.InterfaceC6228v;
import p349y0.C9508c;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l3.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC4617j extends InterfaceC4507m.c implements InterfaceC6228v, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: F */
    public View f13740F;

    /* JADX INFO: renamed from: G */
    public ViewTreeObserver f13741G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC0184l f13742H = new a();

    /* JADX INFO: renamed from: I */
    public final InterfaceC0184l f13743I = new b();

    /* JADX INFO: renamed from: l3.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {
        public a() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m18547a(InterfaceC6205h interfaceC6205h) {
            View viewM18542g = AbstractC4615h.m18542g(ViewTreeObserverOnGlobalFocusChangeListenerC4617j.this);
            if (viewM18542g.isFocused() || viewM18542g.hasFocus()) {
                return;
            }
            if (AbstractC6211k.m24422b(viewM18542g, AbstractC6211k.m24423c(interfaceC6205h.mo24345a()), AbstractC4615h.m18541f(AbstractC4557k.m18016r(ViewTreeObserverOnGlobalFocusChangeListenerC4617j.this).getFocusOwner(), AbstractC4561l.m18025a(ViewTreeObserverOnGlobalFocusChangeListenerC4617j.this), viewM18542g))) {
                return;
            }
            interfaceC6205h.mo24346b();
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18547a((InterfaceC6205h) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: l3.j$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {
        public b() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m18548a(InterfaceC6205h interfaceC6205h) {
            View viewFindNextFocusFromRect;
            View viewM18542g = AbstractC4615h.m18542g(ViewTreeObserverOnGlobalFocusChangeListenerC4617j.this);
            if (C4503i.f13057c) {
                if (viewM18542g.hasFocus() || viewM18542g.isFocused()) {
                    viewM18542g.clearFocus();
                    return;
                }
                return;
            }
            if (C4503i.f13058d || !viewM18542g.hasFocus()) {
                return;
            }
            InterfaceC6223q focusOwner = AbstractC4557k.m18016r(ViewTreeObserverOnGlobalFocusChangeListenerC4617j.this).getFocusOwner();
            View viewM18025a = AbstractC4561l.m18025a(ViewTreeObserverOnGlobalFocusChangeListenerC4617j.this);
            if (!(viewM18542g instanceof ViewGroup)) {
                if (viewM18025a.requestFocus()) {
                    return;
                }
                C10010p0.m38820a("host view did not take focus");
                return;
            }
            Rect rectM18541f = AbstractC4615h.m18541f(focusOwner, viewM18025a, viewM18542g);
            Integer numM24423c = AbstractC6211k.m24423c(interfaceC6205h.mo24345a());
            int iIntValue = numM24423c != null ? numM24423c.intValue() : Opcodes.IXOR;
            FocusFinder focusFinder = FocusFinder.getInstance();
            ViewTreeObserverOnGlobalFocusChangeListenerC4617j viewTreeObserverOnGlobalFocusChangeListenerC4617j = ViewTreeObserverOnGlobalFocusChangeListenerC4617j.this;
            if (viewTreeObserverOnGlobalFocusChangeListenerC4617j.m18546H2() != null) {
                viewM18025a.getClass();
                viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) viewM18025a, viewTreeObserverOnGlobalFocusChangeListenerC4617j.m18546H2(), iIntValue);
            } else {
                viewM18025a.getClass();
                viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) viewM18025a, rectM18541f, iIntValue);
            }
            if (viewFindNextFocusFromRect != null && AbstractC4615h.m18539d(viewM18542g, viewFindNextFocusFromRect)) {
                viewFindNextFocusFromRect.requestFocus(iIntValue, rectM18541f);
                interfaceC6205h.mo24346b();
            } else {
                if (viewM18025a.requestFocus()) {
                    return;
                }
                C10010p0.m38820a("host view did not take focus");
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m18548a((InterfaceC6205h) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: G2 */
    public final C6206h0 m18545G2() {
        int iM17812a = AbstractC4547h1.m17812a(1024);
        if (!mo17471z().m17461m2()) {
            AbstractC3167a.m11956b("visitLocalDescendants called on an unattached node");
        }
        InterfaceC4507m.c cVarMo17471z = mo17471z();
        if ((cVarMo17471z.m17452c2() & iM17812a) != 0) {
            boolean z10 = false;
            for (InterfaceC4507m.c cVarM17453d2 = cVarMo17471z.m17453d2(); cVarM17453d2 != null; cVarM17453d2 = cVarM17453d2.m17453d2()) {
                if ((cVarM17453d2.m17457h2() & iM17812a) != 0) {
                    InterfaceC4507m.c cVarM18008j = cVarM17453d2;
                    C9508c c9508c = null;
                    while (cVarM18008j != null) {
                        if (cVarM18008j instanceof C6206h0) {
                            C6206h0 c6206h0 = (C6206h0) cVarM18008j;
                            if (z10) {
                                return c6206h0;
                            }
                            z10 = true;
                        } else if ((cVarM18008j.m17457h2() & iM17812a) != 0 && (cVarM18008j instanceof AbstractC4565m)) {
                            int i10 = 0;
                            for (InterfaceC4507m.c cVarM18050H2 = ((AbstractC4565m) cVarM18008j).m18050H2(); cVarM18050H2 != null; cVarM18050H2 = cVarM18050H2.m17453d2()) {
                                if ((cVarM18050H2.m17457h2() & iM17812a) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarM18008j = cVarM18050H2;
                                    } else {
                                        if (c9508c == null) {
                                            c9508c = new C9508c(new InterfaceC4507m.c[16], 0);
                                        }
                                        if (cVarM18008j != null) {
                                            c9508c.m37029b(cVarM18008j);
                                            cVarM18008j = null;
                                        }
                                        c9508c.m37029b(cVarM18050H2);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarM18008j = AbstractC4557k.m18008j(c9508c);
                    }
                }
            }
        }
        C10010p0.m38820a("Could not find focus target of embedded view wrapper");
        return null;
    }

    /* JADX INFO: renamed from: H2 */
    public final View m18546H2() {
        return this.f13740F;
    }

    @Override // p235q1.InterfaceC6228v
    /* JADX INFO: renamed from: j1 */
    public void mo17557j1(InterfaceC6226t interfaceC6226t) {
        interfaceC6226t.mo17627o(false);
        interfaceC6226t.mo24533f(this.f13742H);
        interfaceC6226t.mo24542p(this.f13743I);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC4557k.m18015q(this).m17845A0() == null) {
            return;
        }
        View viewM18542g = AbstractC4615h.m18542g(this);
        InterfaceC6223q focusOwner = AbstractC4557k.m18016r(this).getFocusOwner();
        InterfaceC4580q1 interfaceC4580q1M18016r = AbstractC4557k.m18016r(this);
        boolean z10 = (view == null || AbstractC1061t.m3842c(view, interfaceC4580q1M18016r) || !AbstractC4615h.m18539d(viewM18542g, view)) ? false : true;
        boolean z11 = (view2 == null || AbstractC1061t.m3842c(view2, interfaceC4580q1M18016r) || !AbstractC4615h.m18539d(viewM18542g, view2)) ? false : true;
        if (z10 && z11) {
            this.f13740F = view2;
            return;
        }
        if (z11) {
            this.f13740F = view2;
            C6206h0 c6206h0M18545G2 = m18545G2();
            if (c6206h0M18545G2.mo24362j0().mo24355a()) {
                return;
            }
            AbstractC6210j0.m24416i(c6206h0M18545G2);
            return;
        }
        if (!z10) {
            this.f13740F = null;
            return;
        }
        this.f13740F = null;
        if (m18545G2().mo24362j0().mo24356c()) {
            focusOwner.mo24501l(false, true, false, C6203g.f19254b.m24380c());
        }
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: p2 */
    public void mo1377p2() {
        super.mo1377p2();
        ViewTreeObserver viewTreeObserver = AbstractC4561l.m18025a(this).getViewTreeObserver();
        this.f13741G = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: q2 */
    public void mo1378q2() {
        ViewTreeObserver viewTreeObserver = this.f13741G;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f13741G = null;
        AbstractC4561l.m18025a(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f13740F = null;
        super.mo1378q2();
    }
}
