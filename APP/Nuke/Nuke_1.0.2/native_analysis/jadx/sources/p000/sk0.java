package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sk0 extends th1 implements fl0, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: v */
    public View f10170v;

    /* JADX INFO: renamed from: w */
    public ViewTreeObserver f10171w;

    /* JADX INFO: renamed from: x */
    public final rk0 f10172x = new rk0(this, 0);

    /* JADX INFO: renamed from: y */
    public final rk0 f10173y = new rk0(this, 1);

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        ViewTreeObserver viewTreeObserver = tp0.m5344H(this).getViewTreeObserver();
        this.f10171w = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        ViewTreeObserver viewTreeObserver = this.f10171w;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f10171w = null;
        tp0.m5344H(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f10170v = null;
    }

    /* JADX INFO: renamed from: M0 */
    public final pl0 m4881M0() {
        boolean z;
        if (!this.f10757h.f10770u) {
            kz0.m2764b("visitLocalDescendants called on an unattached node");
        }
        th1 th1Var = this.f10757h;
        if ((th1Var.f10760k & 1024) != 0) {
            boolean z2 = false;
            for (th1 th1Var2 = th1Var.f10762m; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                if ((th1Var2.f10759j & 1024) != 0) {
                    th1 th1VarM4952m = th1Var2;
                    zk1 zk1Var = null;
                    while (th1VarM4952m != null) {
                        if (th1VarM4952m instanceof pl0) {
                            pl0 pl0Var = (pl0) th1VarM4952m;
                            if (z2) {
                                return pl0Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                            int i = 0;
                            for (th1 th1Var3 = ((u60) th1VarM4952m).f11116w; th1Var3 != null; th1Var3 = th1Var3.f10762m) {
                                if ((th1Var3.f10759j & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        th1VarM4952m = th1Var3;
                                    } else {
                                        if (zk1Var == null) {
                                            zk1Var = new zk1(new th1[16]);
                                        }
                                        if (th1VarM4952m != null) {
                                            zk1Var.m6423b(th1VarM4952m);
                                            th1VarM4952m = null;
                                        }
                                        zk1Var.m6423b(th1Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        th1VarM4952m = sp0.m4952m(zk1Var);
                    }
                }
            }
        }
        C0676s.m4653l("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // p000.fl0
    /* JADX INFO: renamed from: W */
    public final void mo1661W(dl0 dl0Var) {
        dl0Var.mo1055d(false);
        dl0Var.mo1053b(this.f10172x);
        dl0Var.mo1052a(this.f10173y);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        boolean z2;
        if (sp0.m4933c0(this).f9397u == null) {
            return;
        }
        View viewM3912j = pp0.m3912j(this);
        yk0 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(this)).getFocusOwner();
        zv1 zv1VarM4939f0 = sp0.m4939f0(this);
        if (view == null || view.equals(zv1VarM4939f0)) {
            z = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewM3912j.getParent()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (view2 == null || view2.equals(zv1VarM4939f0)) {
            z2 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewM3912j.getParent()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (z && z2) {
            this.f10170v = view2;
            return;
        }
        if (!z2) {
            if (!z) {
                this.f10170v = null;
                return;
            }
            this.f10170v = null;
            if (m4881M0().m3876R0().m2718a()) {
                ((bl0) focusOwner).m557b(8, false, false);
                return;
            }
            return;
        }
        this.f10170v = view2;
        pl0 pl0VarM4881M0 = m4881M0();
        int iOrdinal = pl0VarM4881M0.m3876R0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal == 3) {
            qp0.m4230L(pl0VarM4881M0);
        } else {
            c80.m675s();
        }
    }
}
