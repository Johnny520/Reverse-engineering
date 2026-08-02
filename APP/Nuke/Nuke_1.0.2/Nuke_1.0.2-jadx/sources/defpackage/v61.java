package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v61 {
    public final r61 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public qd1 q;
    public n61 d = n61.l;
    public final mf1 p = new mf1(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v61(r61 r61Var) {
        this.a = r61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final zn1 a() {
        return (zn1) this.a.M.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        n61 n61Var = this.a.N.d;
        n61 n61Var2 = n61.j;
        n61 n61Var3 = n61.k;
        if (n61Var == n61Var2 || n61Var == n61Var3) {
            if (this.p.G) {
                g(true);
            } else {
                f(true);
            }
        }
        if (n61Var == n61Var3) {
            qd1 qd1Var = this.q;
            if (qd1Var == null || !qd1Var.A) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(long j) {
        qd1 qd1Var = this.q;
        if (qd1Var != null) {
            v61 v61Var = qd1Var.m;
            v61Var.d = n61.i;
            r61 r61Var = v61Var.a;
            v61Var.e = false;
            qd1Var.E = j;
            bw1 snapshotObserver = ((b7) u61.a(r61Var)).getSnapshotObserver();
            pd1 pd1Var = qd1Var.F;
            snapshotObserver.a.c(r61Var, snapshotObserver.b, pd1Var);
            v61Var.f = true;
            v61Var.g = true;
            boolean z = fg1.z(r61Var);
            mf1 mf1Var = v61Var.p;
            if (z) {
                mf1Var.B = true;
                mf1Var.C = true;
            } else {
                mf1Var.A = true;
            }
            v61Var.d = n61.l;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            r61 r61VarU = this.a.u();
            v61 v61Var = r61VarU != null ? r61VarU.N : null;
            if (v61Var != null) {
                int i3 = v61Var.l;
                if (i == 0) {
                    v61Var.d(i3 - 1);
                } else {
                    v61Var.d(i3 + 1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            r61 r61VarU = this.a.u();
            v61 v61Var = r61VarU != null ? r61VarU.N : null;
            if (v61Var != null) {
                int i3 = v61Var.o;
                if (i == 0) {
                    v61Var.e(i3 - 1);
                } else {
                    v61Var.e(i3 + 1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        mf1 mf1Var = this.p;
        v61 v61Var = mf1Var.m;
        Object obj = mf1Var.x;
        r61 r61Var = this.a;
        if ((obj != null || v61Var.a().i() != null) && mf1Var.w) {
            mf1Var.w = false;
            mf1Var.x = v61Var.a().i();
            r61 r61VarU = r61Var.u();
            if (r61VarU != null) {
                r61.V(r61VarU, false, 7);
            }
        }
        qd1 qd1Var = this.q;
        if (qd1Var != null) {
            v61 v61Var2 = qd1Var.m;
            if (qd1Var.D == null) {
                md1 md1VarQ0 = v61Var2.a().Q0();
                md1VarQ0.getClass();
                if (md1VarQ0.v.i() == null) {
                    return;
                }
            }
            if (qd1Var.C) {
                qd1Var.C = false;
                md1 md1VarQ02 = v61Var2.a().Q0();
                md1VarQ02.getClass();
                qd1Var.D = md1VarQ02.v.i();
                if (fg1.z(r61Var)) {
                    r61 r61VarU2 = r61Var.u();
                    if (r61VarU2 != null) {
                        r61.V(r61VarU2, false, 7);
                        return;
                    }
                    return;
                }
                r61 r61VarU3 = r61Var.u();
                if (r61VarU3 != null) {
                    r61.T(r61VarU3, false, 7);
                }
            }
        }
    }
}
