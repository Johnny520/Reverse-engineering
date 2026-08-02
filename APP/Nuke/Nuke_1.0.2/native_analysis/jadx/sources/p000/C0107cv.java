package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: cv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0107cv implements a20, Serializable {

    /* JADX INFO: renamed from: h */
    public final a20 f1740h;

    /* JADX INFO: renamed from: i */
    public final y10 f1741i;

    public C0107cv(y10 y10Var, a20 a20Var) {
        a20Var.getClass();
        y10Var.getClass();
        this.f1740h = a20Var;
        this.f1741i = y10Var;
    }

    public final boolean equals(Object obj) {
        boolean zM5086l;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0107cv) {
            C0107cv c0107cv = (C0107cv) obj;
            int i = 2;
            C0107cv c0107cv2 = c0107cv;
            int i2 = 2;
            while (true) {
                a20 a20Var = c0107cv2.f1740h;
                c0107cv2 = a20Var instanceof C0107cv ? (C0107cv) a20Var : null;
                if (c0107cv2 == null) {
                    break;
                }
                i2++;
            }
            C0107cv c0107cv3 = this;
            while (true) {
                a20 a20Var2 = c0107cv3.f1740h;
                c0107cv3 = a20Var2 instanceof C0107cv ? (C0107cv) a20Var2 : null;
                if (c0107cv3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    y10 y10Var = this.f1741i;
                    if (!t11.m5086l(c0107cv.mo15o(y10Var.getKey()), y10Var)) {
                        zM5086l = false;
                        break;
                    }
                    a20 a20Var3 = this.f1740h;
                    if (!(a20Var3 instanceof C0107cv)) {
                        a20Var3.getClass();
                        y10 y10Var2 = (y10) a20Var3;
                        zM5086l = t11.m5086l(c0107cv.mo15o(y10Var2.getKey()), y10Var2);
                        break;
                    }
                    this = (C0107cv) a20Var3;
                }
                if (zM5086l) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1741i.hashCode() + this.f1740h.hashCode();
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: k */
    public final a20 mo14k(a20 a20Var) {
        a20Var.getClass();
        return a20Var == zd0.f13837h ? this : (a20) a20Var.mo16r(new C0920ye(24), this);
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: o */
    public final y10 mo15o(z10 z10Var) {
        z10Var.getClass();
        while (true) {
            y10 y10VarMo15o = this.f1741i.mo15o(z10Var);
            if (y10VarMo15o != null) {
                return y10VarMo15o;
            }
            a20 a20Var = this.f1740h;
            if (!(a20Var instanceof C0107cv)) {
                return a20Var.mo15o(z10Var);
            }
            this = (C0107cv) a20Var;
        }
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: r */
    public final Object mo16r(mn0 mn0Var, Object obj) {
        return mn0Var.mo12g(this.f1740h.mo16r(mn0Var, obj), this.f1741i);
    }

    public final String toString() {
        return hk1.m2210i(new StringBuilder("["), (String) mo16r(new C0920ye(2), ""), ']');
    }

    @Override // p000.a20
    /* JADX INFO: renamed from: u */
    public final a20 mo17u(z10 z10Var) {
        z10Var.getClass();
        y10 y10Var = this.f1741i;
        y10 y10VarMo15o = y10Var.mo15o(z10Var);
        a20 a20Var = this.f1740h;
        if (y10VarMo15o != null) {
            return a20Var;
        }
        a20 a20VarMo17u = a20Var.mo17u(z10Var);
        return a20VarMo17u == a20Var ? this : a20VarMo17u == zd0.f13837h ? y10Var : new C0107cv(y10Var, a20VarMo17u);
    }
}
