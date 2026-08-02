package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v61 {

    /* JADX INFO: renamed from: a */
    public final r61 f11780a;

    /* JADX INFO: renamed from: b */
    public boolean f11781b;

    /* JADX INFO: renamed from: c */
    public boolean f11782c;

    /* JADX INFO: renamed from: e */
    public boolean f11784e;

    /* JADX INFO: renamed from: f */
    public boolean f11785f;

    /* JADX INFO: renamed from: g */
    public boolean f11786g;

    /* JADX INFO: renamed from: h */
    public int f11787h;

    /* JADX INFO: renamed from: i */
    public int f11788i;

    /* JADX INFO: renamed from: j */
    public boolean f11789j;

    /* JADX INFO: renamed from: k */
    public boolean f11790k;

    /* JADX INFO: renamed from: l */
    public int f11791l;

    /* JADX INFO: renamed from: m */
    public boolean f11792m;

    /* JADX INFO: renamed from: n */
    public boolean f11793n;

    /* JADX INFO: renamed from: o */
    public int f11794o;

    /* JADX INFO: renamed from: q */
    public qd1 f11796q;

    /* JADX INFO: renamed from: d */
    public n61 f11783d = n61.f7022l;

    /* JADX INFO: renamed from: p */
    public final mf1 f11795p = new mf1(this);

    public v61(r61 r61Var) {
        this.f11780a = r61Var;
    }

    /* JADX INFO: renamed from: a */
    public final zn1 m5627a() {
        return (zn1) this.f11780a.f9372M.f12034e;
    }

    /* JADX INFO: renamed from: b */
    public final void m5628b() {
        n61 n61Var = this.f11780a.f9373N.f11783d;
        n61 n61Var2 = n61.f7020j;
        n61 n61Var3 = n61.f7021k;
        if (n61Var == n61Var2 || n61Var == n61Var3) {
            if (this.f11795p.f6607G) {
                m5633g(true);
            } else {
                m5632f(true);
            }
        }
        if (n61Var == n61Var3) {
            qd1 qd1Var = this.f11796q;
            if (qd1Var == null || !qd1Var.f8899A) {
                m5634h(true);
            } else {
                m5635i(true);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5629c(long j) {
        qd1 qd1Var = this.f11796q;
        if (qd1Var != null) {
            v61 v61Var = qd1Var.f8907m;
            v61Var.f11783d = n61.f7019i;
            r61 r61Var = v61Var.f11780a;
            v61Var.f11784e = false;
            qd1Var.f8903E = j;
            bw1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61Var)).getSnapshotObserver();
            pd1 pd1Var = qd1Var.f8904F;
            snapshotObserver.f1051a.m5436c(r61Var, snapshotObserver.f1052b, pd1Var);
            v61Var.f11785f = true;
            v61Var.f11786g = true;
            boolean zM1651z = fg1.m1651z(r61Var);
            mf1 mf1Var = v61Var.f11795p;
            if (zM1651z) {
                mf1Var.f6602B = true;
                mf1Var.f6603C = true;
            } else {
                mf1Var.f6601A = true;
            }
            v61Var.f11783d = n61.f7022l;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5630d(int i) {
        int i2 = this.f11791l;
        this.f11791l = i;
        if ((i2 == 0) != (i == 0)) {
            r61 r61VarM4389u = this.f11780a.m4389u();
            v61 v61Var = r61VarM4389u != null ? r61VarM4389u.f9373N : null;
            if (v61Var != null) {
                int i3 = v61Var.f11791l;
                if (i == 0) {
                    v61Var.m5630d(i3 - 1);
                } else {
                    v61Var.m5630d(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5631e(int i) {
        int i2 = this.f11794o;
        this.f11794o = i;
        if ((i2 == 0) != (i == 0)) {
            r61 r61VarM4389u = this.f11780a.m4389u();
            v61 v61Var = r61VarM4389u != null ? r61VarM4389u.f9373N : null;
            if (v61Var != null) {
                int i3 = v61Var.f11794o;
                if (i == 0) {
                    v61Var.m5631e(i3 - 1);
                } else {
                    v61Var.m5631e(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5632f(boolean z) {
        if (this.f11790k != z) {
            this.f11790k = z;
            if (z && !this.f11789j) {
                m5630d(this.f11791l + 1);
            } else {
                if (z || this.f11789j) {
                    return;
                }
                m5630d(this.f11791l - 1);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5633g(boolean z) {
        if (this.f11789j != z) {
            this.f11789j = z;
            if (z && !this.f11790k) {
                m5630d(this.f11791l + 1);
            } else {
                if (z || this.f11790k) {
                    return;
                }
                m5630d(this.f11791l - 1);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5634h(boolean z) {
        if (this.f11793n != z) {
            this.f11793n = z;
            if (z && !this.f11792m) {
                m5631e(this.f11794o + 1);
            } else {
                if (z || this.f11792m) {
                    return;
                }
                m5631e(this.f11794o - 1);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5635i(boolean z) {
        if (this.f11792m != z) {
            this.f11792m = z;
            if (z && !this.f11793n) {
                m5631e(this.f11794o + 1);
            } else {
                if (z || this.f11793n) {
                    return;
                }
                m5631e(this.f11794o - 1);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5636j() {
        mf1 mf1Var = this.f11795p;
        v61 v61Var = mf1Var.f6618m;
        Object obj = mf1Var.f6629x;
        r61 r61Var = this.f11780a;
        if ((obj != null || v61Var.m5627a().mo2342i() != null) && mf1Var.f6628w) {
            mf1Var.f6628w = false;
            mf1Var.f6629x = v61Var.m5627a().mo2342i();
            r61 r61VarM4389u = r61Var.m4389u();
            if (r61VarM4389u != null) {
                r61.m4341V(r61VarM4389u, false, 7);
            }
        }
        qd1 qd1Var = this.f11796q;
        if (qd1Var != null) {
            v61 v61Var2 = qd1Var.f8907m;
            if (qd1Var.f8902D == null) {
                md1 md1VarMo2842Q0 = v61Var2.m5627a().mo2842Q0();
                md1VarMo2842Q0.getClass();
                if (md1VarMo2842Q0.f6572v.mo2342i() == null) {
                    return;
                }
            }
            if (qd1Var.f8901C) {
                qd1Var.f8901C = false;
                md1 md1VarMo2842Q02 = v61Var2.m5627a().mo2842Q0();
                md1VarMo2842Q02.getClass();
                qd1Var.f8902D = md1VarMo2842Q02.f6572v.mo2342i();
                if (fg1.m1651z(r61Var)) {
                    r61 r61VarM4389u2 = r61Var.m4389u();
                    if (r61VarM4389u2 != null) {
                        r61.m4341V(r61VarM4389u2, false, 7);
                        return;
                    }
                    return;
                }
                r61 r61VarM4389u3 = r61Var.m4389u();
                if (r61VarM4389u3 != null) {
                    r61.m4340T(r61VarM4389u3, false, 7);
                }
            }
        }
    }
}
