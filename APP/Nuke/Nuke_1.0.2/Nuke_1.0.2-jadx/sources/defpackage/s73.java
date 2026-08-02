package defpackage;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s73 implements rf {
    public final Object h;
    public final ArrayList i = new ArrayList();
    public Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s73(r61 r61Var) {
        this.h = r61Var;
        this.j = r61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void a(int i, Object obj) {
        ((r61) this.j).A(i, (r61) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void b(Object obj) {
        this.i.add(this.j);
        this.j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        this.i.clear();
        this.j = this.h;
        ((r61) this.h).P();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void f() {
        q62 rectManager;
        d6 d6Var;
        q62 rectManager2;
        r61 r61Var = (r61) this.j;
        vn1 vn1Var = r61Var.M;
        if (!r61Var.H()) {
            kz0.a("onReuse is only expected on attached node");
        }
        ab3 ab3Var = r61Var.v;
        if (ab3Var != null) {
            View view = ab3Var.i;
            if (view.getParent() != ab3Var) {
                ab3Var.addView(view);
            } else {
                ab3Var.m.a();
            }
        }
        f71 f71Var = r61Var.O;
        if (f71Var != null) {
            f71Var.i(false);
        }
        r61Var.A = false;
        if (r61Var.X) {
            r61Var.X = false;
        } else {
            th1 th1Var = (qx2) r61Var.M.f;
            for (th1 th1Var2 = th1Var; th1Var2 != null; th1Var2 = th1Var2.l) {
                if (th1Var2.u) {
                    th1Var2.H0();
                }
            }
            for (th1 th1Var3 = th1Var; th1Var3 != null; th1Var3 = th1Var3.l) {
                if (th1Var3.u) {
                    th1Var3.J0();
                }
            }
            while (th1Var != null) {
                if (th1Var.u) {
                    th1Var.D0();
                }
                th1Var = th1Var.l;
            }
        }
        int i = r61Var.i;
        zv1 zv1Var = r61Var.u;
        if (zv1Var != null && (rectManager2 = ((b7) zv1Var).getRectManager()) != null) {
            rectManager2.g(r61Var);
        }
        r61Var.i = nn2.a.addAndGet(1);
        zv1 zv1Var2 = r61Var.u;
        if (zv1Var2 != null) {
            b7 b7Var = (b7) zv1Var2;
            b7Var.getLayoutNodes().g(i);
            b7Var.getLayoutNodes().h(r61Var.i, r61Var);
        }
        for (th1 th1Var4 = (th1) vn1Var.g; th1Var4 != null; th1Var4 = th1Var4.m) {
            th1Var4.C0();
        }
        vn1Var.x();
        if (vn1Var.m(8)) {
            r61Var.F();
        }
        r61.W(r61Var);
        zv1 zv1Var3 = r61Var.u;
        if (zv1Var3 != null && (d6Var = ((b7) zv1Var3).U) != null) {
            b7 b7Var2 = d6Var.j;
            hh1 hh1Var = d6Var.h;
            ak1 ak1Var = d6Var.o;
            if (ak1Var.e(i)) {
                hh1Var.B(b7Var2, i, false);
            }
            ln2 ln2VarW = r61Var.w();
            if (ln2VarW != null && ln2VarW.h.b(vn2.r)) {
                ak1Var.a(r61Var.i);
                hh1Var.B(b7Var2, r61Var.i, true);
            }
        }
        zv1 zv1Var4 = r61Var.u;
        if (zv1Var4 == null || (rectManager = ((b7) zv1Var4).getRectManager()) == null) {
            return;
        }
        rectManager.f(r61Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final /* bridge */ /* synthetic */ void g(int i, Object obj) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void i() {
        zv1 zv1Var = ((r61) this.h).u;
        if (zv1Var != null) {
            ((b7) zv1Var).y();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void j(int i, int i2, int i3) {
        ((r61) this.j).L(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final Object k() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void l(int i, int i2) {
        ((r61) this.j).Q(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rf
    public final void o() {
        this.j = this.i.remove(r0.size() - 1);
    }
}
