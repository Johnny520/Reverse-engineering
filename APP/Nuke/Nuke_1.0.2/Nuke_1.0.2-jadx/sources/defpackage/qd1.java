package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qd1 extends sz1 implements if1, w5, ki1 {
    public boolean A;
    public Object D;
    public boolean H;
    public final v61 m;
    public boolean n;
    public boolean r;
    public boolean s;
    public fz t;
    public in0 v;
    public int o = Integer.MAX_VALUE;
    public int p = Integer.MAX_VALUE;
    public p61 q = p61.j;
    public long u = 0;
    public od1 w = od1.j;
    public final s61 x = new s61(this, 1);
    public final zk1 y = new zk1(new qd1[16]);
    public boolean z = true;
    public final pd1 B = new pd1(this, 0);
    public boolean C = true;
    public long E = gz.b(0, 0, 0, 0, 15);
    public final pd1 F = new pd1(this, 2);
    public final pd1 G = new pd1(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qd1(v61 v61Var) {
        this.m = v61Var;
        this.D = v61Var.p.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int N(int i) {
        q0();
        md1 md1VarQ0 = this.m.a().Q0();
        md1VarQ0.getClass();
        return md1VarQ0.N(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final int P() {
        return this.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final void U() {
        r61.T(this.m.a, false, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int W(int i) {
        q0();
        md1 md1VarQ0 = this.m.a().Q0();
        md1VarQ0.getClass();
        return md1VarQ0.W(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int X(int i) {
        q0();
        md1 md1VarQ0 = this.m.a().Q0();
        md1VarQ0.getClass();
        return md1VarQ0.X(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final s61 a() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // defpackage.if1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sz1 e(long j) {
        p61 p61Var;
        v61 v61Var = this.m;
        r61 r61Var = v61Var.a;
        r61 r61Var2 = v61Var.a;
        r61 r61VarU = r61Var.u();
        if ((r61VarU != null ? r61VarU.N.d : null) == n61.i) {
            v61Var.b = false;
        } else {
            r61 r61VarU2 = r61Var2.u();
            if ((r61VarU2 != null ? r61VarU2.N.d : null) == n61.k) {
            }
        }
        r61 r61VarU3 = r61Var2.u();
        p61 p61Var2 = p61.j;
        if (r61VarU3 != null) {
            v61 v61Var2 = r61VarU3.N;
            if (this.q != p61Var2 && !r61Var2.L) {
                kz0.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = v61Var2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                p61Var = p61.h;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    s.n("Measurable could be only measured from the parent's measure or layout block. Parents state is ", v61Var2.d);
                    return null;
                }
                p61Var = p61.i;
            }
            this.q = p61Var;
        } else {
            this.q = p61Var2;
        }
        if (r61Var2.J == p61Var2) {
            r61Var2.e();
        }
        v0(j);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int f(int i) {
        q0();
        md1 md1VarQ0 = this.m.a().Q0();
        md1VarQ0.getClass();
        return md1VarQ0.f(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sz1
    public final void f0(long j, float f, in0 in0Var) {
        t0(j, in0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sz1, defpackage.if1
    public final Object i() {
        return this.D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final void k(v5 v5Var) throws j90 {
        zk1 zk1VarY = this.m.a.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            qd1 qd1Var = ((r61) objArr[i2]).N.q;
            qd1Var.getClass();
            v5Var.j(qd1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ki1
    public final void l(boolean z) {
        md1 md1VarQ0;
        v61 v61Var = this.m;
        md1 md1VarQ02 = v61Var.a().Q0();
        if (Boolean.valueOf(z).equals(md1VarQ02 != null ? Boolean.valueOf(md1VarQ02.p) : null) || (md1VarQ0 = v61Var.a().Q0()) == null) {
            return;
        }
        md1VarQ0.p = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean l0() {
        v61 v61Var = this.m;
        return fg1.z(v61Var.a) || v61Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m0(boolean z) {
        if (z && l0()) {
            return;
        }
        if (z || l0()) {
            this.w = od1.j;
            zk1 zk1VarY = this.m.a.y();
            Object[] objArr = zk1VarY.h;
            int i = zk1VarY.j;
            for (int i2 = 0; i2 < i; i2++) {
                qd1 qd1Var = ((r61) objArr[i2]).N.q;
                qd1Var.getClass();
                qd1Var.m0(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final qz0 n() {
        return (qz0) this.m.a.M.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n0() {
        od1 od1Var = this.w;
        v61 v61Var = this.m;
        boolean z = v61Var.c;
        r61 r61Var = v61Var.a;
        od1 od1Var2 = od1.h;
        if (z) {
            this.w = od1.i;
        } else {
            this.w = od1Var2;
        }
        if (od1Var != od1Var2 && v61Var.e) {
            r61.T(r61Var, true, 6);
        }
        zk1 zk1VarY = r61Var.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            qd1 qd1Var = r61Var2.N.q;
            if (qd1Var == null) {
                s.j("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (qd1Var.p != Integer.MAX_VALUE) {
                qd1Var.n0();
                r61.W(r61Var2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o0() {
        v61 v61Var = this.m;
        if (v61Var.o > 0) {
            zk1 zk1VarY = v61Var.a.y();
            Object[] objArr = zk1VarY.h;
            int i = zk1VarY.j;
            for (int i2 = 0; i2 < i; i2++) {
                r61 r61Var = (r61) objArr[i2];
                v61 v61Var2 = r61Var.N;
                if ((v61Var2.m || v61Var2.n) && !v61Var2.f) {
                    r61Var.S(false);
                }
                qd1 qd1Var = v61Var2.q;
                if (qd1Var != null) {
                    qd1Var.o0();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final w5 p() {
        v61 v61Var;
        r61 r61VarU = this.m.a.u();
        if (r61VarU == null || (v61Var = r61VarU.N) == null) {
            return null;
        }
        return v61Var.q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final void q() {
        this.A = true;
        s61 s61Var = this.x;
        s61Var.h();
        v61 v61Var = this.m;
        boolean z = v61Var.f;
        r61 r61Var = v61Var.a;
        if (z) {
            zk1 zk1VarY = r61Var.y();
            Object[] objArr = zk1VarY.h;
            int i = zk1VarY.j;
            for (int i2 = 0; i2 < i; i2++) {
                r61 r61Var2 = (r61) objArr[i2];
                v61 v61Var2 = r61Var2.N;
                if (v61Var2.e && r61Var2.s() == p61.h) {
                    qd1 qd1Var = v61Var2.q;
                    qd1Var.getClass();
                    qd1 qd1Var2 = v61Var2.q;
                    fz fzVar = qd1Var2 != null ? qd1Var2.t : null;
                    fzVar.getClass();
                    if (qd1Var.v0(fzVar.a)) {
                        r61.T(r61Var, false, 7);
                    }
                }
            }
        }
        pz0 pz0Var = n().Z;
        pz0Var.getClass();
        if (v61Var.g || (!pz0Var.r && v61Var.f)) {
            v61Var.f = false;
            n61 n61Var = v61Var.d;
            v61Var.d = n61.k;
            v61Var.i(false);
            bw1 snapshotObserver = ((b7) u61.a(r61Var)).getSnapshotObserver();
            snapshotObserver.a.c(r61Var, snapshotObserver.h, this.B);
            v61Var.d = n61Var;
            if (v61Var.m && pz0Var.r) {
                requestLayout();
            }
            v61Var.g = false;
        }
        if (s61Var.b && s61Var.e()) {
            s61Var.g();
        }
        this.A = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q0() {
        v61 v61Var = this.m;
        r61.T(v61Var.a, false, 7);
        r61 r61Var = v61Var.a;
        r61 r61VarU = r61Var.u();
        if (r61VarU == null || r61Var.J != p61.j) {
            return;
        }
        int iOrdinal = r61VarU.N.d.ordinal();
        r61Var.J = iOrdinal != 0 ? iOrdinal != 2 ? r61VarU.J : p61.i : p61.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r0() {
        n61 n61Var;
        this.H = true;
        v61 v61Var = this.m;
        r61 r61VarU = v61Var.a.u();
        od1 od1Var = this.w;
        if ((od1Var != od1.h && !v61Var.c) || (od1Var != od1.i && v61Var.c)) {
            n0();
            if (this.n && r61VarU != null) {
                r61VarU.S(false);
            }
        }
        if (r61VarU != null) {
            v61 v61Var2 = r61VarU.N;
            if (!this.n && ((n61Var = v61Var2.d) == n61.j || n61Var == n61.k)) {
                if (this.p != Integer.MAX_VALUE) {
                    kz0.b("Place was called on a node which was placed already");
                }
                int i = v61Var2.h;
                this.p = i;
                v61Var2.h = i + 1;
            }
        } else {
            this.p = 0;
        }
        q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final void requestLayout() {
        this.m.a.S(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(long j, in0 in0Var) {
        v61 v61Var = this.m;
        r61 r61Var = v61Var.a;
        r61 r61Var2 = v61Var.a;
        try {
            r61 r61VarU = r61Var.u();
            n61 n61Var = r61VarU != null ? r61VarU.N.d : null;
            n61 n61Var2 = n61.k;
            if (n61Var == n61Var2) {
                v61Var.c = false;
            }
            if (r61Var2.X) {
                kz0.a("place is called on a deactivated node");
            }
            v61Var.d = n61Var2;
            boolean z = true;
            this.r = true;
            this.H = false;
            if (!z01.a(j, this.u)) {
                if (v61Var.n || v61Var.m) {
                    v61Var.f = true;
                }
                o0();
            }
            zv1 zv1VarA = u61.a(r61Var2);
            this.u = j;
            if (v61Var.f) {
                v61Var.h(false);
                this.x.e = false;
                bw1 snapshotObserver = ((b7) zv1VarA).getSnapshotObserver();
                snapshotObserver.a.c(r61Var2, snapshotObserver.g, this.G);
            } else {
                if (this.w == od1.j) {
                    z = false;
                }
                if (z) {
                    md1 md1VarQ0 = v61Var.a().Q0();
                    md1VarQ0.getClass();
                    md1VarQ0.J0(z01.c(j, md1VarQ0.l));
                    r0();
                }
            }
            this.v = in0Var;
            v61Var.d = n61.l;
        } catch (Throwable th) {
            r61Var.Y(th);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean v0(long j) {
        v61 v61Var = this.m;
        r61 r61Var = v61Var.a;
        r61 r61Var2 = v61Var.a;
        try {
            if (r61Var.X) {
                kz0.a("measure is called on a deactivated node");
            }
            r61 r61VarU = r61Var2.u();
            r61Var2.L = r61Var2.L || (r61VarU != null && r61VarU.L);
            if (!r61Var2.N.e) {
                fz fzVar = this.t;
                if (fzVar == null ? false : fz.b(fzVar.a, j)) {
                    zv1 zv1Var = r61Var2.u;
                    if (zv1Var != null) {
                        ((b7) zv1Var).l(r61Var2, true);
                    }
                    r61Var2.X();
                    return false;
                }
            }
            this.t = new fz(j);
            k0(j);
            this.x.d = false;
            zk1 zk1VarY = r61Var2.y();
            Object[] objArr = zk1VarY.h;
            int i = zk1VarY.j;
            for (int i2 = 0; i2 < i; i2++) {
                qd1 qd1Var = ((r61) objArr[i2]).N.q;
                qd1Var.getClass();
                qd1Var.x.getClass();
            }
            long j2 = this.s ? this.j : -9223372034707292160L;
            this.s = true;
            md1 md1VarQ0 = v61Var.a().Q0();
            if (!(md1VarQ0 != null)) {
                kz0.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            v61Var.c(j);
            g0((((long) md1VarQ0.h) << 32) | (((long) md1VarQ0.i) & 4294967295L));
            return (((int) (j2 >> 32)) == md1VarQ0.h && ((int) (j2 & 4294967295L)) == md1VarQ0.i) ? false : true;
        } catch (Throwable th) {
            r61Var.Y(th);
            throw null;
        }
    }
}
