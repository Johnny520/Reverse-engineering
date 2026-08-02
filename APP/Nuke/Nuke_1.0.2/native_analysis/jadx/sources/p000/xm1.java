package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xm1 extends th1 implements d43, qm1 {

    /* JADX INFO: renamed from: v */
    public qm1 f13078v;

    /* JADX INFO: renamed from: w */
    public tm1 f13079w;

    /* JADX INFO: renamed from: x */
    public xm1 f13080x;

    /* JADX INFO: renamed from: y */
    public final String f13081y = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public xm1(qm1 qm1Var, tm1 tm1Var) {
        this.f13078v = qm1Var;
        this.f13079w = tm1Var;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        tm1 tm1Var = this.f13079w;
        tm1Var.f10845a = this;
        tm1Var.f10846b = null;
        this.f13080x = null;
        tm1Var.f10847c = new C0159ea(17, this);
        tm1Var.f10848d = m5255A0();
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        o72 o72Var = new o72();
        tb3.m5158d(this, new C0762u6(o72Var, 2));
        xm1 xm1Var = (xm1) ((d43) o72Var.f7574i);
        this.f13080x = xm1Var;
        tm1 tm1Var = this.f13079w;
        tm1Var.f10846b = xm1Var;
        if (tm1Var.f10845a == this) {
            tm1Var.f10845a = null;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final j20 m6159M0() {
        xm1 xm1VarM6160N0 = m6160N0();
        j20 j20VarM6159M0 = xm1VarM6160N0 != null ? xm1VarM6160N0.m6159M0() : null;
        if (j20VarM6159M0 != null && AbstractC0731te.m5188Q(j20VarM6159M0)) {
            return j20VarM6159M0;
        }
        j20 j20Var = this.f13079w.f10848d;
        if (j20Var != null) {
            return j20Var;
        }
        C0676s.m4653l("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    @Override // p000.qm1
    /* JADX INFO: renamed from: N */
    public final long mo3646N(int i, long j, long j2) {
        long jMo3646N = this.f13078v.mo3646N(i, j, j2);
        xm1 xm1VarM6160N0 = this.f10770u ? m6160N0() : null;
        return rs1.m4612e(jMo3646N, xm1VarM6160N0 != null ? xm1VarM6160N0.mo3646N(i, rs1.m4612e(j, jMo3646N), rs1.m4611d(j2, jMo3646N)) : 0L);
    }

    /* JADX INFO: renamed from: N0 */
    public final xm1 m6160N0() {
        vn1 vn1Var;
        d43 d43Var = null;
        if (!this.f10770u) {
            return null;
        }
        if (!this.f10757h.f10770u) {
            kz0.m2764b("visitAncestors called on an unattached node");
        }
        th1 th1Var = this.f10757h.f10761l;
        r61 r61VarM4933c0 = sp0.m4933c0(this);
        loop0: while (true) {
            if (r61VarM4933c0 == null) {
                break;
            }
            if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 262144) != 0) {
                while (th1Var != null) {
                    if ((th1Var.f10759j & 262144) != 0) {
                        th1 th1VarM4952m = th1Var;
                        zk1 zk1Var = null;
                        while (th1VarM4952m != null) {
                            if (th1VarM4952m instanceof d43) {
                                d43 d43Var2 = (d43) th1VarM4952m;
                                if (t11.m5086l(this.f13081y, d43Var2.mo962r()) && xm1.class == d43Var2.getClass()) {
                                    d43Var = d43Var2;
                                    break loop0;
                                }
                            }
                            if ((th1VarM4952m.f10759j & 262144) != 0 && (th1VarM4952m instanceof u60)) {
                                int i = 0;
                                for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                    if ((th1Var2.f10759j & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            th1VarM4952m = th1Var2;
                                        } else {
                                            if (zk1Var == null) {
                                                zk1Var = new zk1(new th1[16]);
                                            }
                                            if (th1VarM4952m != null) {
                                                zk1Var.m6423b(th1VarM4952m);
                                                th1VarM4952m = null;
                                            }
                                            zk1Var.m6423b(th1Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            th1VarM4952m = sp0.m4952m(zk1Var);
                        }
                    }
                    th1Var = th1Var.f10761l;
                }
            }
            r61VarM4933c0 = r61VarM4933c0.m4389u();
            th1Var = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
        }
        return (xm1) d43Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.qm1
    /* JADX INFO: renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4196g0(long j, t00 t00Var) {
        wm1 wm1Var;
        long j2;
        long j3;
        if (t00Var instanceof wm1) {
            wm1Var = (wm1) t00Var;
            int i = wm1Var.f12588n;
            if ((i & Integer.MIN_VALUE) != 0) {
                wm1Var.f12588n = i - Integer.MIN_VALUE;
            } else {
                wm1Var = new wm1(this, (u00) t00Var);
            }
        }
        Object objMo4196g0 = wm1Var.f12586l;
        int i2 = wm1Var.f12588n;
        k20 k20Var = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(objMo4196g0);
            xm1 xm1VarM6160N0 = this.f10770u ? m6160N0() : null;
            if (xm1VarM6160N0 == null) {
                j2 = 0;
                qm1 qm1Var = this.f13078v;
                long jM987d = da3.m987d(j, j2);
                wm1Var.f12585k = j2;
                wm1Var.f12588n = 2;
                objMo4196g0 = qm1Var.mo4196g0(jM987d, wm1Var);
                if (objMo4196g0 != k20Var) {
                    j3 = j2;
                    return new da3(da3.m988e(j3, ((da3) objMo4196g0).f1950a));
                }
                return k20Var;
            }
            wm1Var.f12585k = j;
            wm1Var.f12588n = 1;
            objMo4196g0 = xm1VarM6160N0.mo4196g0(j, wm1Var);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = wm1Var.f12585k;
                fg1.m1627T(objMo4196g0);
                return new da3(da3.m988e(j3, ((da3) objMo4196g0).f1950a));
            }
            j = wm1Var.f12585k;
            fg1.m1627T(objMo4196g0);
        }
        j2 = ((da3) objMo4196g0).f1950a;
        qm1 qm1Var2 = this.f13078v;
        long jM987d2 = da3.m987d(j, j2);
        wm1Var.f12585k = j2;
        wm1Var.f12588n = 2;
        objMo4196g0 = qm1Var2.mo4196g0(jM987d2, wm1Var);
        if (objMo4196g0 != k20Var) {
        }
        return k20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // p000.qm1
    /* JADX INFO: renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3658k0(long j, long j2, t00 t00Var) {
        vm1 vm1Var;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (t00Var instanceof vm1) {
            vm1Var = (vm1) t00Var;
            int i = vm1Var.f12022o;
            if ((i & Integer.MIN_VALUE) != 0) {
                vm1Var.f12022o = i - Integer.MIN_VALUE;
            } else {
                vm1Var = new vm1(this, (u00) t00Var);
            }
        }
        vm1 vm1Var2 = vm1Var;
        Object objMo3658k0 = vm1Var2.f12020m;
        int i2 = vm1Var2.f12022o;
        xm1 xm1VarM6160N0 = null;
        k20 k20Var = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(objMo3658k0);
            qm1 qm1Var = this.f13078v;
            vm1Var2.f12018k = j;
            vm1Var2.f12019l = j2;
            vm1Var2.f12022o = 1;
            objMo3658k0 = qm1Var.mo3658k0(j, j2, vm1Var2);
            if (objMo3658k0 != k20Var) {
                j3 = j;
                j4 = j2;
            }
            return k20Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = vm1Var2.f12018k;
            fg1.m1627T(objMo3658k0);
            j6 = ((da3) objMo3658k0).f1950a;
            j5 = j7;
            return new da3(da3.m988e(j5, j6));
        }
        j4 = vm1Var2.f12019l;
        j3 = vm1Var2.f12018k;
        fg1.m1627T(objMo3658k0);
        j5 = ((da3) objMo3658k0).f1950a;
        boolean z = this.f10770u;
        if (!z) {
            xm1VarM6160N0 = this.f13080x;
        } else if (z) {
            xm1VarM6160N0 = m6160N0();
        }
        if (xm1VarM6160N0 == null) {
            j6 = 0;
            return new da3(da3.m988e(j5, j6));
        }
        long jM988e = da3.m988e(j3, j5);
        long jM987d = da3.m987d(j4, j5);
        vm1Var2.f12018k = j5;
        vm1Var2.f12022o = 2;
        objMo3658k0 = xm1VarM6160N0.mo3658k0(jM988e, jM987d, vm1Var2);
        if (objMo3658k0 != k20Var) {
            j7 = j5;
            j6 = ((da3) objMo3658k0).f1950a;
            j5 = j7;
            return new da3(da3.m988e(j5, j6));
        }
        return k20Var;
    }

    @Override // p000.qm1
    /* JADX INFO: renamed from: l */
    public final long mo4197l(long j, int i) {
        xm1 xm1VarM6160N0 = this.f10770u ? m6160N0() : null;
        long jMo4197l = xm1VarM6160N0 != null ? xm1VarM6160N0.mo4197l(j, i) : 0L;
        return rs1.m4612e(jMo4197l, this.f13078v.mo4197l(rs1.m4611d(j, jMo4197l), i));
    }

    @Override // p000.d43
    /* JADX INFO: renamed from: r */
    public final Object mo962r() {
        return this.f13081y;
    }
}
