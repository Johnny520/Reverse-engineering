package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gb0 extends th1 implements d43, a61 {
    public gb0 v;
    public gb0 w;
    public long x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        this.w = null;
        this.v = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean M0() {
        gb0 gb0Var = this.v;
        if (gb0Var != null) {
            return gb0Var.M0();
        }
        gb0 gb0Var2 = this.w;
        if (gb0Var2 != null) {
            return gb0Var2.M0();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N0() {
        gb0 gb0Var = this.w;
        if (gb0Var != null) {
            gb0Var.N0();
            return;
        }
        gb0 gb0Var2 = this.v;
        if (gb0Var2 != null) {
            gb0Var2.N0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void O0() {
        gb0 gb0Var = this.w;
        if (gb0Var != null) {
            gb0Var.O0();
        }
        gb0 gb0Var2 = this.v;
        if (gb0Var2 != null) {
            gb0Var2.O0();
        }
        this.v = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P0(n4 n4Var) {
        d43 d43Var;
        gb0 gb0Var;
        gb0 gb0Var2 = this.v;
        int i = 1;
        if (gb0Var2 == null || !se.w(gb0Var2, te.I(n4Var))) {
            if (this.h.u) {
                o72 o72Var = new o72();
                tb3.f(this, new ec(o72Var, this, n4Var, i));
                d43Var = (d43) o72Var.i;
            } else {
                d43Var = null;
            }
            gb0Var = (gb0) d43Var;
        } else {
            gb0Var = gb0Var2;
        }
        if (gb0Var != null && gb0Var2 == null) {
            gb0Var.N0();
            gb0Var.P0(n4Var);
            gb0 gb0Var3 = this.w;
            if (gb0Var3 != null) {
                gb0Var3.O0();
            }
        } else if (gb0Var == null && gb0Var2 != null) {
            gb0 gb0Var4 = this.w;
            if (gb0Var4 != null) {
                gb0Var4.N0();
                gb0Var4.P0(n4Var);
            }
            gb0Var2.O0();
        } else if (!t11.l(gb0Var, gb0Var2)) {
            if (gb0Var != null) {
                gb0Var.N0();
                gb0Var.P0(n4Var);
            }
            if (gb0Var2 != null) {
                gb0Var2.O0();
            }
        } else if (gb0Var != null) {
            gb0Var.P0(n4Var);
        } else {
            gb0 gb0Var5 = this.w;
            if (gb0Var5 != null) {
                gb0Var5.P0(n4Var);
            }
        }
        this.v = gb0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q0() {
        gb0 gb0Var = this.w;
        if (gb0Var != null) {
            gb0Var.Q0();
            return;
        }
        gb0 gb0Var2 = this.v;
        if (gb0Var2 != null) {
            gb0Var2.Q0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a61, defpackage.qf1
    public final void c(long j) {
        this.x = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d43
    public final Object r() {
        return gd3.r;
    }
}
