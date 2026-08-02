package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sk0 extends th1 implements fl0, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View v;
    public ViewTreeObserver w;
    public final rk0 x = new rk0(this, 0);
    public final rk0 y = new rk0(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        ViewTreeObserver viewTreeObserver = tp0.H(this).getViewTreeObserver();
        this.w = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        ViewTreeObserver viewTreeObserver = this.w;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.w = null;
        tp0.H(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.v = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final pl0 M0() {
        boolean z;
        if (!this.h.u) {
            kz0.b("visitLocalDescendants called on an unattached node");
        }
        th1 th1Var = this.h;
        if ((th1Var.k & 1024) != 0) {
            boolean z2 = false;
            for (th1 th1Var2 = th1Var.m; th1Var2 != null; th1Var2 = th1Var2.m) {
                if ((th1Var2.j & 1024) != 0) {
                    th1 th1VarM = th1Var2;
                    zk1 zk1Var = null;
                    while (th1VarM != null) {
                        if (th1VarM instanceof pl0) {
                            pl0 pl0Var = (pl0) th1VarM;
                            if (z2) {
                                return pl0Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                            int i = 0;
                            for (th1 th1Var3 = ((u60) th1VarM).w; th1Var3 != null; th1Var3 = th1Var3.m) {
                                if ((th1Var3.j & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        th1VarM = th1Var3;
                                    } else {
                                        if (zk1Var == null) {
                                            zk1Var = new zk1(new th1[16]);
                                        }
                                        if (th1VarM != null) {
                                            zk1Var.b(th1VarM);
                                            th1VarM = null;
                                        }
                                        zk1Var.b(th1Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        th1VarM = sp0.m(zk1Var);
                    }
                }
            }
        }
        s.l("Could not find focus target of embedded view wrapper");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fl0
    public final void W(dl0 dl0Var) {
        dl0Var.d(false);
        dl0Var.b(this.x);
        dl0Var.a(this.y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        boolean z2;
        if (sp0.c0(this).u == null) {
            return;
        }
        View viewJ = pp0.j(this);
        yk0 focusOwner = ((b7) sp0.f0(this)).getFocusOwner();
        zv1 zv1VarF0 = sp0.f0(this);
        if (view == null || view.equals(zv1VarF0)) {
            z = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewJ.getParent()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (view2 == null || view2.equals(zv1VarF0)) {
            z2 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewJ.getParent()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (z && z2) {
            this.v = view2;
            return;
        }
        if (!z2) {
            if (!z) {
                this.v = null;
                return;
            }
            this.v = null;
            if (M0().R0().a()) {
                ((bl0) focusOwner).b(8, false, false);
                return;
            }
            return;
        }
        this.v = view2;
        pl0 pl0VarM0 = M0();
        int iOrdinal = pl0VarM0.R0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal == 3) {
            qp0.L(pl0VarM0);
        } else {
            c80.s();
        }
    }
}
