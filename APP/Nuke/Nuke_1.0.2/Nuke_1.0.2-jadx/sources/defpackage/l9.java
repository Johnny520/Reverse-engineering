package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l9 implements v02 {
    public m91 a;
    public zt2 b;
    public u91 c;
    public lq2 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void a(k03 k03Var, us1 us1Var, y03 y03Var, zm zmVar, o62 o62Var, o62 o62Var2) {
        u91 u91Var = this.c;
        if (u91Var != null) {
            n91 n91Var = u91Var.m;
            synchronized (n91Var.c) {
                try {
                    n91Var.j = k03Var;
                    n91Var.l = us1Var;
                    n91Var.k = y03Var;
                    n91Var.m = o62Var;
                    n91Var.n = o62Var2;
                    if (n91Var.e || n91Var.d) {
                        n91Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void b() {
        j(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void c(k03 k03Var, k03 k03Var2) {
        u91 u91Var = this.c;
        if (u91Var != null) {
            boolean z = (f13.b(u91Var.h.b, k03Var2.b) && t11.l(u91Var.h.c, k03Var2.c)) ? false : true;
            u91Var.h = k03Var2;
            int size = u91Var.j.size();
            for (int i = 0; i < size; i++) {
                l62 l62Var = (l62) ((WeakReference) u91Var.j.get(i)).get();
                if (l62Var != null) {
                    l62Var.g = k03Var2;
                }
            }
            n91 n91Var = u91Var.m;
            synchronized (n91Var.c) {
                n91Var.j = null;
                n91Var.l = null;
                n91Var.k = null;
                n91Var.m = null;
                n91Var.n = null;
            }
            if (t11.l(k03Var, k03Var2)) {
                if (z) {
                    sz0 sz0Var = u91Var.b;
                    int iF = f13.f(k03Var2.b);
                    int iE = f13.e(k03Var2.b);
                    f13 f13Var = u91Var.h.c;
                    int iF2 = f13Var != null ? f13.f(f13Var.a) : -1;
                    f13 f13Var2 = u91Var.h.c;
                    sz0Var.F().updateSelection((View) sz0Var.i, iF, iE, iF2, f13Var2 != null ? f13.e(f13Var2.a) : -1);
                    return;
                }
                return;
            }
            if (k03Var != null && (!t11.l(k03Var.a.i, k03Var2.a.i) || (f13.b(k03Var.b, k03Var2.b) && !t11.l(k03Var.c, k03Var2.c)))) {
                sz0 sz0Var2 = u91Var.b;
                sz0Var2.F().restartInput((View) sz0Var2.i);
                return;
            }
            int size2 = u91Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                l62 l62Var2 = (l62) ((WeakReference) u91Var.j.get(i2)).get();
                if (l62Var2 != null) {
                    k03 k03Var3 = u91Var.h;
                    sz0 sz0Var3 = u91Var.b;
                    if (l62Var2.k) {
                        l62Var2.g = k03Var3;
                        if (l62Var2.i) {
                            sz0Var3.F().updateExtractedText((View) sz0Var3.i, l62Var2.h, qp0.j(k03Var3));
                        }
                        f13 f13Var3 = k03Var3.c;
                        long j = k03Var3.b;
                        int iF3 = f13Var3 != null ? f13.f(f13Var3.a) : -1;
                        f13 f13Var4 = k03Var3.c;
                        sz0Var3.F().updateSelection((View) sz0Var3.i, f13.f(j), f13.e(j), iF3, f13Var4 != null ? f13.e(f13Var4.a) : -1);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void d() {
        bt2 bt2Var;
        m91 m91Var = this.a;
        if (m91Var == null || (bt2Var = (bt2) p40.p(m91Var, ly.q)) == null) {
            return;
        }
        ((v60) bt2Var).b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void e() {
        bt2 bt2Var;
        m91 m91Var = this.a;
        if (m91Var == null || (bt2Var = (bt2) p40.p(m91Var, ly.q)) == null) {
            return;
        }
        ((v60) bt2Var).a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void f(k03 k03Var, xx0 xx0Var, m0 m0Var, n10 n10Var) {
        j(new h9(k03Var, this, xx0Var, m0Var, n10Var, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void g() {
        zt2 zt2Var = this.b;
        if (zt2Var != null) {
            zt2Var.c(null);
        }
        this.b = null;
        vk1 vk1VarI = i();
        if (vk1VarI != null) {
            lq2 lq2Var = (lq2) vk1VarI;
            synchronized (lq2Var) {
                lq2Var.t(lq2Var.n() + ((long) lq2Var.r), lq2Var.q, lq2Var.n() + ((long) lq2Var.r), lq2Var.n() + ((long) lq2Var.r) + ((long) lq2Var.s));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void h(o62 o62Var) {
        Rect rect;
        u91 u91Var = this.c;
        if (u91Var != null) {
            u91Var.l = new Rect(gf1.Q(o62Var.a), gf1.Q(o62Var.b), gf1.Q(o62Var.c), gf1.Q(o62Var.d));
            if (!u91Var.j.isEmpty() || (rect = u91Var.l) == null) {
                return;
            }
            u91Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final vk1 i() {
        lq2 lq2Var = this.d;
        if (lq2Var != null) {
            return lq2Var;
        }
        if (!bw2.a) {
            return null;
        }
        lq2 lq2VarE = p7.e(0, 2, hn.j);
        this.d = lq2VarE;
        return lq2VarE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(h9 h9Var) {
        m91 m91Var = this.a;
        if (m91Var == null) {
            return;
        }
        this.b = m91Var.u ? p7.A(m91Var.A0(), null, new a2(m91Var, new k9(h9Var, this, m91Var, zt2Var, 0), zt2Var, 14), 1) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(m91 m91Var) {
        if (!(this.a == m91Var)) {
            nz0.c("Expected textInputModifierNode to be " + m91Var + " but was " + this.a);
        }
        this.a = null;
    }
}
