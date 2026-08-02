package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xm1 extends th1 implements d43, qm1 {
    public qm1 v;
    public tm1 w;
    public xm1 x;
    public final String y = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xm1(qm1 qm1Var, tm1 tm1Var) {
        this.v = qm1Var;
        this.w = tm1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        tm1 tm1Var = this.w;
        tm1Var.a = this;
        tm1Var.b = null;
        this.x = null;
        tm1Var.c = new ea(17, this);
        tm1Var.d = A0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        o72 o72Var = new o72();
        tb3.d(this, new u6(o72Var, 2));
        xm1 xm1Var = (xm1) ((d43) o72Var.i);
        this.x = xm1Var;
        tm1 tm1Var = this.w;
        tm1Var.b = xm1Var;
        if (tm1Var.a == this) {
            tm1Var.a = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final j20 M0() {
        xm1 xm1VarN0 = N0();
        j20 j20VarM0 = xm1VarN0 != null ? xm1VarN0.M0() : null;
        if (j20VarM0 != null && te.Q(j20VarM0)) {
            return j20VarM0;
        }
        j20 j20Var = this.w.d;
        if (j20Var != null) {
            return j20Var;
        }
        s.l("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qm1
    public final long N(int i, long j, long j2) {
        long jN = this.v.N(i, j, j2);
        xm1 xm1VarN0 = this.u ? N0() : null;
        return rs1.e(jN, xm1VarN0 != null ? xm1VarN0.N(i, rs1.e(j, jN), rs1.d(j2, jN)) : 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final xm1 N0() {
        vn1 vn1Var;
        d43 d43Var = null;
        if (!this.u) {
            return null;
        }
        if (!this.h.u) {
            kz0.b("visitAncestors called on an unattached node");
        }
        th1 th1Var = this.h.l;
        r61 r61VarC0 = sp0.c0(this);
        loop0: while (true) {
            if (r61VarC0 == null) {
                break;
            }
            if ((((th1) r61VarC0.M.g).k & 262144) != 0) {
                while (th1Var != null) {
                    if ((th1Var.j & 262144) != 0) {
                        th1 th1VarM = th1Var;
                        zk1 zk1Var = null;
                        while (th1VarM != null) {
                            if (th1VarM instanceof d43) {
                                d43 d43Var2 = (d43) th1VarM;
                                if (t11.l(this.y, d43Var2.r()) && xm1.class == d43Var2.getClass()) {
                                    d43Var = d43Var2;
                                    break loop0;
                                }
                            }
                            if ((th1VarM.j & 262144) != 0 && (th1VarM instanceof u60)) {
                                int i = 0;
                                for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                    if ((th1Var2.j & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            th1VarM = th1Var2;
                                        } else {
                                            if (zk1Var == null) {
                                                zk1Var = new zk1(new th1[16]);
                                            }
                                            if (th1VarM != null) {
                                                zk1Var.b(th1VarM);
                                                th1VarM = null;
                                            }
                                            zk1Var.b(th1Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            th1VarM = sp0.m(zk1Var);
                        }
                    }
                    th1Var = th1Var.l;
                }
            }
            r61VarC0 = r61VarC0.u();
            th1Var = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
        }
        return (xm1) d43Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g0(long j, t00 t00Var) {
        wm1 wm1Var;
        long j2;
        long j3;
        if (t00Var instanceof wm1) {
            wm1Var = (wm1) t00Var;
            int i = wm1Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                wm1Var.n = i - Integer.MIN_VALUE;
            } else {
                wm1Var = new wm1(this, (u00) t00Var);
            }
        }
        Object objG0 = wm1Var.l;
        int i2 = wm1Var.n;
        k20 k20Var = k20.h;
        if (i2 == 0) {
            fg1.T(objG0);
            xm1 xm1VarN0 = this.u ? N0() : null;
            if (xm1VarN0 == null) {
                j2 = 0;
                qm1 qm1Var = this.v;
                long jD = da3.d(j, j2);
                wm1Var.k = j2;
                wm1Var.n = 2;
                objG0 = qm1Var.g0(jD, wm1Var);
                if (objG0 != k20Var) {
                    j3 = j2;
                    return new da3(da3.e(j3, ((da3) objG0).a));
                }
                return k20Var;
            }
            wm1Var.k = j;
            wm1Var.n = 1;
            objG0 = xm1VarN0.g0(j, wm1Var);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = wm1Var.k;
                fg1.T(objG0);
                return new da3(da3.e(j3, ((da3) objG0).a));
            }
            j = wm1Var.k;
            fg1.T(objG0);
        }
        j2 = ((da3) objG0).a;
        qm1 qm1Var2 = this.v;
        long jD2 = da3.d(j, j2);
        wm1Var.k = j2;
        wm1Var.n = 2;
        objG0 = qm1Var2.g0(jD2, wm1Var);
        if (objG0 != k20Var) {
        }
        return k20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.qm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k0(long j, long j2, t00 t00Var) {
        vm1 vm1Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (t00Var instanceof vm1) {
            vm1Var = (vm1) t00Var;
            int i = vm1Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                vm1Var.o = i - Integer.MIN_VALUE;
            } else {
                vm1Var = new vm1(this, (u00) t00Var);
            }
        }
        vm1 vm1Var2 = vm1Var;
        Object objK0 = vm1Var2.m;
        int i2 = vm1Var2.o;
        xm1 xm1VarN0 = null;
        k20 k20Var = k20.h;
        if (i2 == 0) {
            fg1.T(objK0);
            qm1 qm1Var = this.v;
            vm1Var2.k = j;
            vm1Var2.l = j2;
            vm1Var2.o = 1;
            objK0 = qm1Var.k0(j, j2, vm1Var2);
            if (objK0 != k20Var) {
                j3 = j;
                j4 = j2;
            }
            return k20Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = vm1Var2.k;
            fg1.T(objK0);
            j6 = ((da3) objK0).a;
            j5 = j7;
            return new da3(da3.e(j5, j6));
        }
        j4 = vm1Var2.l;
        j3 = vm1Var2.k;
        fg1.T(objK0);
        j5 = ((da3) objK0).a;
        boolean z = this.u;
        if (!z) {
            xm1VarN0 = this.x;
        } else if (z) {
            xm1VarN0 = N0();
        }
        if (xm1VarN0 == null) {
            j6 = 0;
            return new da3(da3.e(j5, j6));
        }
        long jE = da3.e(j3, j5);
        long jD = da3.d(j4, j5);
        vm1Var2.k = j5;
        vm1Var2.o = 2;
        objK0 = xm1VarN0.k0(jE, jD, vm1Var2);
        if (objK0 != k20Var) {
            j7 = j5;
            j6 = ((da3) objK0).a;
            j5 = j7;
            return new da3(da3.e(j5, j6));
        }
        return k20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.qm1
    public final long l(long j, int i) {
        xm1 xm1VarN0 = this.u ? N0() : null;
        long jL = xm1VarN0 != null ? xm1VarN0.l(j, i) : 0L;
        return rs1.e(jL, this.v.l(rs1.d(j, jL), i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d43
    public final Object r() {
        return this.y;
    }
}
