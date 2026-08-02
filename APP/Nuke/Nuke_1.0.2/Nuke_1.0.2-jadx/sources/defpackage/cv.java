package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cv implements a20, Serializable {
    public final a20 h;
    public final y10 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cv(y10 y10Var, a20 a20Var) {
        a20Var.getClass();
        y10Var.getClass();
        this.h = a20Var;
        this.i = y10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        boolean zL;
        if (this == obj) {
            return true;
        }
        if (obj instanceof cv) {
            cv cvVar = (cv) obj;
            int i = 2;
            cv cvVar2 = cvVar;
            int i2 = 2;
            while (true) {
                a20 a20Var = cvVar2.h;
                cvVar2 = a20Var instanceof cv ? (cv) a20Var : null;
                if (cvVar2 == null) {
                    break;
                }
                i2++;
            }
            cv cvVar3 = this;
            while (true) {
                a20 a20Var2 = cvVar3.h;
                cvVar3 = a20Var2 instanceof cv ? (cv) a20Var2 : null;
                if (cvVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    y10 y10Var = this.i;
                    if (!t11.l(cvVar.o(y10Var.getKey()), y10Var)) {
                        zL = false;
                        break;
                    }
                    a20 a20Var3 = this.h;
                    if (!(a20Var3 instanceof cv)) {
                        a20Var3.getClass();
                        y10 y10Var2 = (y10) a20Var3;
                        zL = t11.l(cvVar.o(y10Var2.getKey()), y10Var2);
                        break;
                    }
                    this = (cv) a20Var3;
                }
                if (zL) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.i.hashCode() + this.h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final a20 k(a20 a20Var) {
        a20Var.getClass();
        return a20Var == zd0.h ? this : (a20) a20Var.r(new ye(24), this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final y10 o(z10 z10Var) {
        z10Var.getClass();
        while (true) {
            y10 y10VarO = this.i.o(z10Var);
            if (y10VarO != null) {
                return y10VarO;
            }
            a20 a20Var = this.h;
            if (!(a20Var instanceof cv)) {
                return a20Var.o(z10Var);
            }
            this = (cv) a20Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final Object r(mn0 mn0Var, Object obj) {
        return mn0Var.g(this.h.r(mn0Var, obj), this.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return hk1.i(new StringBuilder("["), (String) r(new ye(2), ""), ']');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final a20 u(z10 z10Var) {
        z10Var.getClass();
        y10 y10Var = this.i;
        y10 y10VarO = y10Var.o(z10Var);
        a20 a20Var = this.h;
        if (y10VarO != null) {
            return a20Var;
        }
        a20 a20VarU = a20Var.u(z10Var);
        return a20VarU == a20Var ? this : a20VarU == zd0.h ? y10Var : new cv(y10Var, a20VarU);
    }
}
