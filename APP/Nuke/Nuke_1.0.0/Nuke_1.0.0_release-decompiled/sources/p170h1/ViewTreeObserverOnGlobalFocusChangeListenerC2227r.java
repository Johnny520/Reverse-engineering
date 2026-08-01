package p170h1;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0614q0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p105V.C1483e;
import p169h0.AbstractC2206o;
import p198m0.AbstractC2573d;
import p198m0.C2567A;
import p198m0.C2584o;
import p198m0.InterfaceC2581l;
import p198m0.InterfaceC2586q;
import p198m0.InterfaceC2589t;

/* JADX INFO: renamed from: h1.r */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC2227r extends AbstractC2206o implements InterfaceC2589t, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: r */
    public ViewTreeObserver f7280r;

    /* JADX INFO: renamed from: s */
    public final C2226q f7281s = new C2226q(this, 0);

    /* JADX INFO: renamed from: t */
    public final C2226q f7282t = new C2226q(this, 1);

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        ViewTreeObserver viewTreeObserver = AbstractC0601k.m1046v(this).getViewTreeObserver();
        this.f7280r = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        ViewTreeObserver viewTreeObserver = this.f7280r;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f7280r = null;
        AbstractC0601k.m1046v(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    /* JADX INFO: renamed from: J0 */
    public final C2567A m4034J0() {
        if (!this.f7186d.f7199q) {
            AbstractC0277a.m483b("visitLocalDescendants called on an unattached node");
        }
        AbstractC2206o abstractC2206o = this.f7186d;
        if ((abstractC2206o.f7189g & 1024) != 0) {
            boolean z5 = false;
            for (AbstractC2206o abstractC2206o2 = abstractC2206o.f7191i; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
                if ((abstractC2206o2.f7188f & 1024) != 0) {
                    AbstractC2206o abstractC2206oM1029e = abstractC2206o2;
                    C1483e c1483e = null;
                    while (abstractC2206oM1029e != null) {
                        if (abstractC2206oM1029e instanceof C2567A) {
                            C2567A c2567a = (C2567A) abstractC2206oM1029e;
                            if (z5) {
                                return c2567a;
                            }
                            z5 = true;
                        } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                            int i5 = 0;
                            for (AbstractC2206o abstractC2206o3 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o3 != null; abstractC2206o3 = abstractC2206o3.f7191i) {
                                if ((abstractC2206o3.f7188f & 1024) != 0) {
                                    i5++;
                                    if (i5 == 1) {
                                        abstractC2206oM1029e = abstractC2206o3;
                                    } else {
                                        if (c1483e == null) {
                                            c1483e = new C1483e(new AbstractC2206o[16]);
                                        }
                                        if (abstractC2206oM1029e != null) {
                                            c1483e.m2753b(abstractC2206oM1029e);
                                            abstractC2206oM1029e = null;
                                        }
                                        c1483e.m2753b(abstractC2206o3);
                                    }
                                }
                            }
                            if (i5 == 1) {
                            }
                        }
                        abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // p198m0.InterfaceC2589t
    /* JADX INFO: renamed from: e */
    public final void mo947e(InterfaceC2586q interfaceC2586q) {
        interfaceC2586q.mo956d(false);
        interfaceC2586q.mo4537b(this.f7281s);
        interfaceC2586q.mo4536a(this.f7282t);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z5;
        boolean z6;
        if (AbstractC0601k.m1044t(this).f1725r == null) {
            return;
        }
        View viewM4031c = AbstractC2219j.m4031c(this);
        InterfaceC2581l focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(this)).getFocusOwner();
        InterfaceC0614q0 interfaceC0614q0M1045u = AbstractC0601k.m1045u(this);
        if (view == null || view.equals(interfaceC0614q0M1045u)) {
            z5 = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewM4031c.getParent()) {
                    z5 = true;
                    break;
                }
            }
            z5 = false;
        }
        if (view2 == null || view2.equals(interfaceC0614q0M1045u)) {
            z6 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewM4031c.getParent()) {
                    z6 = true;
                    break;
                }
            }
            z6 = false;
        }
        if (z5 && z6) {
            return;
        }
        if (!z6) {
            if (z5 && m4034J0().m4488O0().m4540a()) {
                ((C2584o) focusOwner).m4527b(8, false, false);
                return;
            }
            return;
        }
        C2567A c2567aM4034J0 = m4034J0();
        int iOrdinal = c2567aM4034J0.m4488O0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal != 3) {
            throw new C0330q();
        }
        AbstractC2573d.m4516w(c2567aM4034J0);
    }
}
