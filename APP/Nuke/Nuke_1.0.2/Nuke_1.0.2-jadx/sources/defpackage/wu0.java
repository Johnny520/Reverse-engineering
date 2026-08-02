package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wu0 extends th1 implements d43, r12, gy {
    public db0 v;
    public ha w;
    public boolean x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wu0(ha haVar, db0 db0Var) {
        this.v = db0Var;
        this.w = haVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        Q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void J(h12 h12Var, i12 i12Var, long j) {
        if (i12Var == i12.i) {
            List list = h12Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (P0(((o12) list.get(i)).i)) {
                    int i2 = h12Var.f;
                    if (i2 == 4) {
                        this.x = true;
                        O0();
                        return;
                    } else {
                        if (i2 == 5) {
                            Q0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M0() {
        ha haVar;
        o72 o72Var = new o72();
        tb3.d(this, new oq0(22, o72Var));
        wu0 wu0Var = (wu0) o72Var.i;
        if (wu0Var == null || (haVar = wu0Var.w) == null) {
            haVar = this.w;
        }
        N0(haVar);
    }

    public abstract void N0(m12 m12Var);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void O0() {
        y62 y62Var = new y62();
        y62Var.h = true;
        tb3.f(this, new fb0(y62Var));
        if (y62Var.h) {
            M0();
        }
    }

    public abstract boolean P0(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q0() {
        if (this.x) {
            this.x = false;
            if (this.u) {
                o72 o72Var = new o72();
                tb3.d(this, new u6(o72Var, 1));
                wu0 wu0Var = (wu0) o72Var.i;
                if (wu0Var != null) {
                    wu0Var.M0();
                } else {
                    N0(null);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void m0() {
        Q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final long s() {
        if (this.v == null) {
            return x23.a;
        }
        e70 e70Var = sp0.c0(this).F;
        int i = x23.b;
        return jx2.e(e70Var.T(10.0f), e70Var.T(40.0f), e70Var.T(10.0f), e70Var.T(40.0f));
    }
}
