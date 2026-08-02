package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qd1 extends sz1 implements if1, InterfaceC0835w5, ki1 {

    /* JADX INFO: renamed from: A */
    public boolean f8899A;

    /* JADX INFO: renamed from: D */
    public Object f8902D;

    /* JADX INFO: renamed from: H */
    public boolean f8906H;

    /* JADX INFO: renamed from: m */
    public final v61 f8907m;

    /* JADX INFO: renamed from: n */
    public boolean f8908n;

    /* JADX INFO: renamed from: r */
    public boolean f8912r;

    /* JADX INFO: renamed from: s */
    public boolean f8913s;

    /* JADX INFO: renamed from: t */
    public C0221fz f8914t;

    /* JADX INFO: renamed from: v */
    public in0 f8916v;

    /* JADX INFO: renamed from: o */
    public int f8909o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: p */
    public int f8910p = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: q */
    public p61 f8911q = p61.f7987j;

    /* JADX INFO: renamed from: u */
    public long f8915u = 0;

    /* JADX INFO: renamed from: w */
    public od1 f8917w = od1.f7636j;

    /* JADX INFO: renamed from: x */
    public final s61 f8918x = new s61(this, 1);

    /* JADX INFO: renamed from: y */
    public final zk1 f8919y = new zk1(new qd1[16]);

    /* JADX INFO: renamed from: z */
    public boolean f8920z = true;

    /* JADX INFO: renamed from: B */
    public final pd1 f8900B = new pd1(this, 0);

    /* JADX INFO: renamed from: C */
    public boolean f8901C = true;

    /* JADX INFO: renamed from: E */
    public long f8903E = AbstractC0258gz.m2028b(0, 0, 0, 0, 15);

    /* JADX INFO: renamed from: F */
    public final pd1 f8904F = new pd1(this, 2);

    /* JADX INFO: renamed from: G */
    public final pd1 f8905G = new pd1(this, 1);

    public qd1(v61 v61Var) {
        this.f8907m = v61Var;
        this.f8902D = v61Var.f11795p.f6629x;
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: N */
    public final int mo2337N(int i) {
        m4143q0();
        md1 md1VarMo2842Q0 = this.f8907m.m5627a().mo2842Q0();
        md1VarMo2842Q0.getClass();
        return md1VarMo2842Q0.mo2337N(i);
    }

    @Override // p000.InterfaceC0835w5
    /* JADX INFO: renamed from: P */
    public final int mo3067P() {
        return this.f8910p;
    }

    @Override // p000.InterfaceC0835w5
    /* JADX INFO: renamed from: U */
    public final void mo3068U() {
        r61.m4340T(this.f8907m.f11780a, false, 7);
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: W */
    public final int mo2338W(int i) {
        m4143q0();
        md1 md1VarMo2842Q0 = this.f8907m.m5627a().mo2842Q0();
        md1VarMo2842Q0.getClass();
        return md1VarMo2842Q0.mo2338W(i);
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: X */
    public final int mo2339X(int i) {
        m4143q0();
        md1 md1VarMo2842Q0 = this.f8907m.m5627a().mo2842Q0();
        md1VarMo2842Q0.getClass();
        return md1VarMo2842Q0.mo2339X(i);
    }

    @Override // p000.InterfaceC0835w5
    /* JADX INFO: renamed from: a */
    public final s61 mo3070a() {
        return this.f8918x;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // p000.if1
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sz1 mo2340e(long j) {
        p61 p61Var;
        v61 v61Var = this.f8907m;
        r61 r61Var = v61Var.f11780a;
        r61 r61Var2 = v61Var.f11780a;
        r61 r61VarM4389u = r61Var.m4389u();
        if ((r61VarM4389u != null ? r61VarM4389u.f9373N.f11783d : null) == n61.f7019i) {
            v61Var.f11781b = false;
        } else {
            r61 r61VarM4389u2 = r61Var2.m4389u();
            if ((r61VarM4389u2 != null ? r61VarM4389u2.f9373N.f11783d : null) == n61.f7021k) {
            }
        }
        r61 r61VarM4389u3 = r61Var2.m4389u();
        p61 p61Var2 = p61.f7987j;
        if (r61VarM4389u3 != null) {
            v61 v61Var2 = r61VarM4389u3.f9373N;
            if (this.f8911q != p61Var2 && !r61Var2.f9371L) {
                kz0.m2764b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = v61Var2.f11783d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                p61Var = p61.f7985h;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    C0676s.m4655n("Measurable could be only measured from the parent's measure or layout block. Parents state is ", v61Var2.f11783d);
                    return null;
                }
                p61Var = p61.f7986i;
            }
            this.f8911q = p61Var;
        } else {
            this.f8911q = p61Var2;
        }
        if (r61Var2.f9369J == p61Var2) {
            r61Var2.m4372e();
        }
        m4146v0(j);
        return this;
    }

    @Override // p000.if1
    /* JADX INFO: renamed from: f */
    public final int mo2341f(int i) {
        m4143q0();
        md1 md1VarMo2842Q0 = this.f8907m.m5627a().mo2842Q0();
        md1VarMo2842Q0.getClass();
        return md1VarMo2842Q0.mo2341f(i);
    }

    @Override // p000.sz1
    /* JADX INFO: renamed from: f0 */
    public final void mo2506f0(long j, float f, in0 in0Var) {
        m4145t0(j, in0Var);
    }

    @Override // p000.sz1, p000.if1
    /* JADX INFO: renamed from: i */
    public final Object mo2342i() {
        return this.f8902D;
    }

    @Override // p000.InterfaceC0835w5
    /* JADX INFO: renamed from: k */
    public final void mo3072k(C0798v5 c0798v5) throws j90 {
        zk1 zk1VarM4393y = this.f8907m.f11780a.m4393y();
        Object[] objArr = zk1VarM4393y.f13934h;
        int i = zk1VarM4393y.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            qd1 qd1Var = ((r61) objArr[i2]).f9373N.f11796q;
            qd1Var.getClass();
            c0798v5.mo5j(qd1Var);
        }
    }

    @Override // p000.ki1
    /* JADX INFO: renamed from: l */
    public final void mo2636l(boolean z) {
        md1 md1VarMo2842Q0;
        v61 v61Var = this.f8907m;
        md1 md1VarMo2842Q02 = v61Var.m5627a().mo2842Q0();
        if (Boolean.valueOf(z).equals(md1VarMo2842Q02 != null ? Boolean.valueOf(md1VarMo2842Q02.f5466p) : null) || (md1VarMo2842Q0 = v61Var.m5627a().mo2842Q0()) == null) {
            return;
        }
        md1VarMo2842Q0.f5466p = z;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m4139l0() {
        v61 v61Var = this.f8907m;
        return fg1.m1651z(v61Var.f11780a) || v61Var.f11782c;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m4140m0(boolean z) {
        if (z && m4139l0()) {
            return;
        }
        if (z || m4139l0()) {
            this.f8917w = od1.f7636j;
            zk1 zk1VarM4393y = this.f8907m.f11780a.m4393y();
            Object[] objArr = zk1VarM4393y.f13934h;
            int i = zk1VarM4393y.f13936j;
            for (int i2 = 0; i2 < i; i2++) {
                qd1 qd1Var = ((r61) objArr[i2]).f9373N.f11796q;
                qd1Var.getClass();
                qd1Var.m4140m0(true);
            }
        }
    }

    @Override // p000.InterfaceC0835w5
    /* JADX INFO: renamed from: n */
    public final qz0 mo3075n() {
        return (qz0) this.f8907m.f11780a.f9372M.f12033d;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m4141n0() {
        od1 od1Var = this.f8917w;
        v61 v61Var = this.f8907m;
        boolean z = v61Var.f11782c;
        r61 r61Var = v61Var.f11780a;
        od1 od1Var2 = od1.f7634h;
        if (z) {
            this.f8917w = od1.f7635i;
        } else {
            this.f8917w = od1Var2;
        }
        if (od1Var != od1Var2 && v61Var.f11784e) {
            r61.m4340T(r61Var, true, 6);
        }
        zk1 zk1VarM4393y = r61Var.m4393y();
        Object[] objArr = zk1VarM4393y.f13934h;
        int i = zk1VarM4393y.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            qd1 qd1Var = r61Var2.f9373N.f11796q;
            if (qd1Var == null) {
                C0676s.m4651j("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (qd1Var.f8910p != Integer.MAX_VALUE) {
                qd1Var.m4141n0();
                r61.m4342W(r61Var2);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m4142o0() {
        v61 v61Var = this.f8907m;
        if (v61Var.f11794o > 0) {
            zk1 zk1VarM4393y = v61Var.f11780a.m4393y();
            Object[] objArr = zk1VarM4393y.f13934h;
            int i = zk1VarM4393y.f13936j;
            for (int i2 = 0; i2 < i; i2++) {
                r61 r61Var = (r61) objArr[i2];
                v61 v61Var2 = r61Var.f9373N;
                if ((v61Var2.f11792m || v61Var2.f11793n) && !v61Var2.f11785f) {
                    r61Var.m4361S(false);
                }
                qd1 qd1Var = v61Var2.f11796q;
                if (qd1Var != null) {
                    qd1Var.m4142o0();
                }
            }
        }
    }

    @Override // p000.InterfaceC0835w5
    /* JADX INFO: renamed from: p */
    public final InterfaceC0835w5 mo3078p() {
        v61 v61Var;
        r61 r61VarM4389u = this.f8907m.f11780a.m4389u();
        if (r61VarM4389u == null || (v61Var = r61VarM4389u.f9373N) == null) {
            return null;
        }
        return v61Var.f11796q;
    }

    @Override // p000.InterfaceC0835w5
    /* JADX INFO: renamed from: q */
    public final void mo3079q() {
        this.f8899A = true;
        s61 s61Var = this.f8918x;
        s61Var.m4745h();
        v61 v61Var = this.f8907m;
        boolean z = v61Var.f11785f;
        r61 r61Var = v61Var.f11780a;
        if (z) {
            zk1 zk1VarM4393y = r61Var.m4393y();
            Object[] objArr = zk1VarM4393y.f13934h;
            int i = zk1VarM4393y.f13936j;
            for (int i2 = 0; i2 < i; i2++) {
                r61 r61Var2 = (r61) objArr[i2];
                v61 v61Var2 = r61Var2.f9373N;
                if (v61Var2.f11784e && r61Var2.m4387s() == p61.f7985h) {
                    qd1 qd1Var = v61Var2.f11796q;
                    qd1Var.getClass();
                    qd1 qd1Var2 = v61Var2.f11796q;
                    C0221fz c0221fz = qd1Var2 != null ? qd1Var2.f8914t : null;
                    c0221fz.getClass();
                    if (qd1Var.m4146v0(c0221fz.f3199a)) {
                        r61.m4340T(r61Var, false, 7);
                    }
                }
            }
        }
        pz0 pz0Var = mo3075n().f9294Z;
        pz0Var.getClass();
        if (v61Var.f11786g || (!pz0Var.f5468r && v61Var.f11785f)) {
            v61Var.f11785f = false;
            n61 n61Var = v61Var.f11783d;
            v61Var.f11783d = n61.f7021k;
            v61Var.m5635i(false);
            bw1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(r61Var)).getSnapshotObserver();
            snapshotObserver.f1051a.m5436c(r61Var, snapshotObserver.f1058h, this.f8900B);
            v61Var.f11783d = n61Var;
            if (v61Var.f11792m && pz0Var.f5468r) {
                requestLayout();
            }
            v61Var.f11786g = false;
        }
        if (s61Var.f9937b && s61Var.m4742e()) {
            s61Var.m4744g();
        }
        this.f8899A = false;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m4143q0() {
        v61 v61Var = this.f8907m;
        r61.m4340T(v61Var.f11780a, false, 7);
        r61 r61Var = v61Var.f11780a;
        r61 r61VarM4389u = r61Var.m4389u();
        if (r61VarM4389u == null || r61Var.f9369J != p61.f7987j) {
            return;
        }
        int iOrdinal = r61VarM4389u.f9373N.f11783d.ordinal();
        r61Var.f9369J = iOrdinal != 0 ? iOrdinal != 2 ? r61VarM4389u.f9369J : p61.f7986i : p61.f7985h;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m4144r0() {
        n61 n61Var;
        this.f8906H = true;
        v61 v61Var = this.f8907m;
        r61 r61VarM4389u = v61Var.f11780a.m4389u();
        od1 od1Var = this.f8917w;
        if ((od1Var != od1.f7634h && !v61Var.f11782c) || (od1Var != od1.f7635i && v61Var.f11782c)) {
            m4141n0();
            if (this.f8908n && r61VarM4389u != null) {
                r61VarM4389u.m4361S(false);
            }
        }
        if (r61VarM4389u != null) {
            v61 v61Var2 = r61VarM4389u.f9373N;
            if (!this.f8908n && ((n61Var = v61Var2.f11783d) == n61.f7020j || n61Var == n61.f7021k)) {
                if (this.f8910p != Integer.MAX_VALUE) {
                    kz0.m2764b("Place was called on a node which was placed already");
                }
                int i = v61Var2.f11787h;
                this.f8910p = i;
                v61Var2.f11787h = i + 1;
            }
        } else {
            this.f8910p = 0;
        }
        mo3079q();
    }

    @Override // p000.InterfaceC0835w5
    public final void requestLayout() {
        this.f8907m.f11780a.m4361S(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    /* JADX INFO: renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4145t0(long j, in0 in0Var) {
        v61 v61Var = this.f8907m;
        r61 r61Var = v61Var.f11780a;
        r61 r61Var2 = v61Var.f11780a;
        try {
            r61 r61VarM4389u = r61Var.m4389u();
            n61 n61Var = r61VarM4389u != null ? r61VarM4389u.f9373N.f11783d : null;
            n61 n61Var2 = n61.f7021k;
            if (n61Var == n61Var2) {
                v61Var.f11782c = false;
            }
            if (r61Var2.f9383X) {
                kz0.m2763a("place is called on a deactivated node");
            }
            v61Var.f11783d = n61Var2;
            boolean z = true;
            this.f8912r = true;
            this.f8906H = false;
            if (!z01.m6371a(j, this.f8915u)) {
                if (v61Var.f11793n || v61Var.f11792m) {
                    v61Var.f11785f = true;
                }
                m4142o0();
            }
            zv1 zv1VarM5471a = u61.m5471a(r61Var2);
            this.f8915u = j;
            if (v61Var.f11785f) {
                v61Var.m5634h(false);
                this.f8918x.f9940e = false;
                bw1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1VarM5471a).getSnapshotObserver();
                snapshotObserver.f1051a.m5436c(r61Var2, snapshotObserver.f1057g, this.f8905G);
            } else {
                if (this.f8917w == od1.f7636j) {
                    z = false;
                }
                if (z) {
                    md1 md1VarMo2842Q0 = v61Var.m5627a().mo2842Q0();
                    md1VarMo2842Q0.getClass();
                    md1VarMo2842Q0.m3063J0(z01.m6373c(j, md1VarMo2842Q0.f10442l));
                    m4144r0();
                }
            }
            this.f8916v = in0Var;
            v61Var.f11783d = n61.f7022l;
        } catch (Throwable th) {
            r61Var.m4364Y(th);
            throw null;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final boolean m4146v0(long j) {
        v61 v61Var = this.f8907m;
        r61 r61Var = v61Var.f11780a;
        r61 r61Var2 = v61Var.f11780a;
        try {
            if (r61Var.f9383X) {
                kz0.m2763a("measure is called on a deactivated node");
            }
            r61 r61VarM4389u = r61Var2.m4389u();
            r61Var2.f9371L = r61Var2.f9371L || (r61VarM4389u != null && r61VarM4389u.f9371L);
            if (!r61Var2.f9373N.f11784e) {
                C0221fz c0221fz = this.f8914t;
                if (c0221fz == null ? false : C0221fz.m1757b(c0221fz.f3199a, j)) {
                    zv1 zv1Var = r61Var2.f9397u;
                    if (zv1Var != null) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var).m471l(r61Var2, true);
                    }
                    r61Var2.m4363X();
                    return false;
                }
            }
            this.f8914t = new C0221fz(j);
            m5047k0(j);
            this.f8918x.f9939d = false;
            zk1 zk1VarM4393y = r61Var2.m4393y();
            Object[] objArr = zk1VarM4393y.f13934h;
            int i = zk1VarM4393y.f13936j;
            for (int i2 = 0; i2 < i; i2++) {
                qd1 qd1Var = ((r61) objArr[i2]).f9373N.f11796q;
                qd1Var.getClass();
                qd1Var.f8918x.getClass();
            }
            long j2 = this.f8913s ? this.f10440j : -9223372034707292160L;
            this.f8913s = true;
            md1 md1VarMo2842Q0 = v61Var.m5627a().mo2842Q0();
            if (!(md1VarMo2842Q0 != null)) {
                kz0.m2764b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            v61Var.m5629c(j);
            m5046g0((((long) md1VarMo2842Q0.f10438h) << 32) | (((long) md1VarMo2842Q0.f10439i) & 4294967295L));
            return (((int) (j2 >> 32)) == md1VarMo2842Q0.f10438h && ((int) (j2 & 4294967295L)) == md1VarMo2842Q0.f10439i) ? false : true;
        } catch (Throwable th) {
            r61Var.m4364Y(th);
            throw null;
        }
    }
}
