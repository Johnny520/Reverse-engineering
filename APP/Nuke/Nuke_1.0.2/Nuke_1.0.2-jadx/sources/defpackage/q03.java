package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q03 implements v02 {
    public final View a;
    public final b5 b;
    public final r03 c;
    public boolean d;
    public in0 e;
    public in0 f;
    public k03 g;
    public xx0 h;
    public final ArrayList i;
    public final j71 j;
    public Rect k;
    public final t30 l;
    public final zk1 m;
    public m2 n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q03(View view, b7 b7Var) {
        b5 b5Var = new b5(view);
        r03 r03Var = new r03(Choreographer.getInstance());
        this.a = view;
        this.b = b5Var;
        this.c = r03Var;
        this.e = oq0.B;
        this.f = oq0.C;
        this.g = new k03("", f13.b, 4);
        this.h = xx0.g;
        this.i = new ArrayList();
        this.j = p7.B(i91.i, new ea(21, this));
        this.l = new t30(b7Var, b5Var);
        this.m = new zk1(new p03[16]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void a(k03 k03Var, us1 us1Var, y03 y03Var, zm zmVar, o62 o62Var, o62 o62Var2) {
        t30 t30Var = this.l;
        synchronized (t30Var.c) {
            try {
                t30Var.j = k03Var;
                t30Var.l = us1Var;
                t30Var.k = y03Var;
                t30Var.m = zmVar;
                t30Var.n = o62Var;
                t30Var.o = o62Var2;
                if (t30Var.e || t30Var.d) {
                    t30Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void b() {
        i(p03.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void c(k03 k03Var, k03 k03Var2) {
        boolean z = (f13.b(this.g.b, k03Var2.b) && t11.l(this.g.c, k03Var2.c)) ? false : true;
        this.g = k03Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            k62 k62Var = (k62) ((WeakReference) this.i.get(i)).get();
            if (k62Var != null) {
                k62Var.d = k03Var2;
            }
        }
        t30 t30Var = this.l;
        synchronized (t30Var.c) {
            t30Var.j = null;
            t30Var.l = null;
            t30Var.k = null;
            t30Var.m = v6.C;
            t30Var.n = null;
            t30Var.o = null;
        }
        if (t11.l(k03Var, k03Var2)) {
            if (z) {
                b5 b5Var = this.b;
                int iF = f13.f(k03Var2.b);
                int iE = f13.e(k03Var2.b);
                f13 f13Var = this.g.c;
                int iF2 = f13Var != null ? f13.f(f13Var.a) : -1;
                f13 f13Var2 = this.g.c;
                ((InputMethodManager) ((j71) b5Var.j).getValue()).updateSelection((View) b5Var.i, iF, iE, iF2, f13Var2 != null ? f13.e(f13Var2.a) : -1);
                return;
            }
            return;
        }
        if (k03Var != null && (!t11.l(k03Var.a.i, k03Var2.a.i) || (f13.b(k03Var.b, k03Var2.b) && !t11.l(k03Var.c, k03Var2.c)))) {
            b5 b5Var2 = this.b;
            ((InputMethodManager) ((j71) b5Var2.j).getValue()).restartInput((View) b5Var2.i);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            k62 k62Var2 = (k62) ((WeakReference) this.i.get(i2)).get();
            if (k62Var2 != null) {
                k03 k03Var3 = this.g;
                b5 b5Var3 = this.b;
                if (k62Var2.h) {
                    k62Var2.d = k03Var3;
                    if (k62Var2.f) {
                        ((InputMethodManager) ((j71) b5Var3.j).getValue()).updateExtractedText((View) b5Var3.i, k62Var2.e, eu.c0(k03Var3));
                    }
                    f13 f13Var3 = k03Var3.c;
                    long j = k03Var3.b;
                    int iF3 = f13Var3 != null ? f13.f(f13Var3.a) : -1;
                    f13 f13Var4 = k03Var3.c;
                    ((InputMethodManager) ((j71) b5Var3.j).getValue()).updateSelection((View) b5Var3.i, f13.f(j), f13.e(j), iF3, f13Var4 != null ? f13.e(f13Var4.a) : -1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void d() {
        i(p03.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void e() {
        i(p03.k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void f(k03 k03Var, xx0 xx0Var, m0 m0Var, n10 n10Var) {
        this.d = true;
        this.g = k03Var;
        this.h = xx0Var;
        this.e = m0Var;
        this.f = n10Var;
        i(p03.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void g() {
        this.d = false;
        this.e = oq0.D;
        this.f = oq0.E;
        this.k = null;
        i(p03.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v02
    public final void h(o62 o62Var) {
        Rect rect;
        this.k = new Rect(gf1.Q(o62Var.a), gf1.Q(o62Var.b), gf1.Q(o62Var.c), gf1.Q(o62Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(p03 p03Var) {
        this.m.b(p03Var);
        if (this.n == null) {
            m2 m2Var = new m2(11, this);
            this.c.execute(m2Var);
            this.n = m2Var;
        }
    }
}
