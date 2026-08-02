package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mf1 extends sz1 implements if1, w5, ki1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean G;
    public float K;
    public boolean L;
    public in0 M;
    public float O;
    public boolean Q;
    public final v61 m;
    public boolean n;
    public boolean q;
    public boolean r;
    public in0 u;
    public float v;
    public Object x;
    public boolean y;
    public boolean z;
    public int o = Integer.MAX_VALUE;
    public int p = Integer.MAX_VALUE;
    public p61 s = p61.j;
    public long t = 0;
    public boolean w = true;
    public final s61 D = new s61(this, 0);
    public final zk1 E = new zk1(new mf1[16]);
    public boolean F = true;
    public long H = gz.b(0, 0, 0, 0, 15);
    public final lf1 I = new lf1(this, 1);
    public final lf1 J = new lf1(this, 0);
    public long N = 0;
    public final lf1 P = new lf1(this, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mf1(v61 v61Var) {
        this.m = v61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int N(int i) {
        v61 v61Var = this.m;
        if (!fg1.z(v61Var.a)) {
            o0();
            return v61Var.a().N(i);
        }
        qd1 qd1Var = v61Var.q;
        qd1Var.getClass();
        return qd1Var.N(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final int P() {
        return this.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final void U() {
        r61.V(this.m.a, false, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int W(int i) {
        v61 v61Var = this.m;
        if (!fg1.z(v61Var.a)) {
            o0();
            return v61Var.a().W(i);
        }
        qd1 qd1Var = v61Var.q;
        qd1Var.getClass();
        return qd1Var.W(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int X(int i) {
        v61 v61Var = this.m;
        if (!fg1.z(v61Var.a)) {
            o0();
            return v61Var.a().X(i);
        }
        qd1 qd1Var = v61Var.q;
        qd1Var.getClass();
        return qd1Var.X(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sz1
    public final int Z() {
        return this.m.a().Z();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final s61 a() {
        return this.D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sz1
    public final int b0() {
        return this.m.a().b0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final sz1 e(long j) {
        p61 p61Var;
        v61 v61Var = this.m;
        r61 r61Var = v61Var.a;
        r61 r61Var2 = v61Var.a;
        p61 p61Var2 = r61Var.J;
        p61 p61Var3 = p61.j;
        if (p61Var2 == p61Var3) {
            r61Var.e();
        }
        if (fg1.z(r61Var2)) {
            qd1 qd1Var = v61Var.q;
            qd1Var.getClass();
            qd1Var.q = p61Var3;
            qd1Var.e(j);
        }
        r61 r61VarU = r61Var2.u();
        if (r61VarU != null) {
            v61 v61Var2 = r61VarU.N;
            if (this.s != p61Var3 && !r61Var2.L) {
                kz0.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = v61Var2.d.ordinal();
            if (iOrdinal == 0) {
                p61Var = p61.h;
            } else {
                if (iOrdinal != 2) {
                    s.n("Measurable could be only measured from the parent's measure or layout block. Parents state is ", v61Var2.d);
                    return null;
                }
                p61Var = p61.i;
            }
            this.s = p61Var;
        } else {
            this.s = p61Var3;
        }
        t0(j);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int f(int i) {
        v61 v61Var = this.m;
        if (!fg1.z(v61Var.a)) {
            o0();
            return v61Var.a().f(i);
        }
        qd1 qd1Var = v61Var.q;
        qd1Var.getClass();
        return qd1Var.f(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sz1
    public final void f0(long j, float f, in0 in0Var) {
        rz1 placementScope;
        v61 v61Var = this.m;
        r61 r61Var = v61Var.a;
        r61 r61Var2 = v61Var.a;
        try {
            this.z = true;
            if (!z01.a(j, this.t) || in0Var != this.u || this.Q) {
                if (v61Var.k || v61Var.j || this.Q) {
                    this.B = true;
                    this.Q = false;
                }
            }
            qd1 qd1Var = v61Var.q;
            if (qd1Var != null) {
                v61 v61Var2 = qd1Var.m;
                if (qd1Var.w == od1.j && !fg1.z(v61Var2.a)) {
                    v61Var2.c = true;
                }
            }
            qd1 qd1Var2 = v61Var.q;
            if (qd1Var2 != null && qd1Var2.l0()) {
                zn1 zn1Var = v61Var.a().x;
                if (zn1Var == null || (placementScope = zn1Var.s) == null) {
                    placementScope = ((b7) u61.a(r61Var2)).getPlacementScope();
                }
                qd1 qd1Var3 = v61Var.q;
                qd1Var3.getClass();
                r61 r61VarU = r61Var2.u();
                if (r61VarU != null) {
                    r61VarU.N.h = 0;
                }
                qd1Var3.p = Integer.MAX_VALUE;
                rz1.g(placementScope, qd1Var3, (int) (j >> 32), (int) (4294967295L & j));
            }
            qd1 qd1Var4 = v61Var.q;
            if (qd1Var4 != null && !qd1Var4.r) {
                kz0.b("Error: Placement happened before lookahead.");
            }
            r0(j, f, in0Var);
        } catch (Throwable th) {
            r61Var.Y(th);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sz1, defpackage.if1
    public final Object i() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final void k(v5 v5Var) throws j90 {
        zk1 zk1VarY = this.m.a.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            v5Var.j(((r61) objArr[i2]).N.p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ki1
    public final void l(boolean z) {
        v61 v61Var = this.m;
        if (z != v61Var.a().p) {
            v61Var.a().p = z;
            this.Q = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List l0() {
        v61 v61Var = this.m;
        v61Var.a.f0();
        boolean z = this.F;
        zk1 zk1Var = this.E;
        if (!z) {
            return zk1Var.f();
        }
        r61 r61Var = v61Var.a;
        zk1 zk1VarY = r61Var.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            if (zk1Var.j <= i2) {
                zk1Var.b(r61Var2.N.p);
            } else {
                mf1 mf1Var = r61Var2.N.p;
                Object[] objArr2 = zk1Var.h;
                Object obj = objArr2[i2];
                objArr2[i2] = mf1Var;
            }
        }
        zk1Var.l(((zk1) ((jk1) r61Var.n()).i).j, zk1Var.j);
        this.F = false;
        return zk1Var.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m0() {
        boolean z = this.y;
        this.y = true;
        v61 v61Var = this.m;
        r61 r61Var = v61Var.a;
        vn1 vn1Var = r61Var.M;
        if (!z) {
            ((qz0) vn1Var.d).d1();
            ((b7) u61.a(r61Var)).getRectManager().f(v61Var.a);
            if (r61Var.q()) {
                r61.V(r61Var, true, 6);
            } else if (r61Var.N.e) {
                r61.T(r61Var, true, 6);
            }
        }
        zn1 zn1Var = ((qz0) vn1Var.d).w;
        for (zn1 zn1Var2 = (zn1) vn1Var.e; !t11.l(zn1Var2, zn1Var) && zn1Var2 != null; zn1Var2 = zn1Var2.w) {
            if (zn1Var2.R) {
                zn1Var2.Z0();
            }
        }
        zk1 zk1VarY = r61Var.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            if (r61Var2.v() != Integer.MAX_VALUE) {
                r61Var2.N.p.m0();
                r61.W(r61Var2);
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
        if (this.y) {
            this.y = false;
            v61 v61Var = this.m;
            r61 r61Var = v61Var.a;
            r61 r61Var2 = v61Var.a;
            ((b7) u61.a(r61Var)).getRectManager().g(r61Var2);
            vn1 vn1Var = r61Var2.M;
            zn1 zn1Var = ((qz0) vn1Var.d).w;
            for (zn1 zn1Var2 = (zn1) vn1Var.e; !t11.l(zn1Var2, zn1Var) && zn1Var2 != null; zn1Var2 = zn1Var2.w) {
                zn1Var2.f1();
                zn1Var2.k1();
            }
            zk1 zk1VarY = r61Var2.y();
            Object[] objArr = zk1VarY.h;
            int i = zk1VarY.j;
            for (int i2 = 0; i2 < i; i2++) {
                ((r61) objArr[i2]).N.p.n0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o0() {
        v61 v61Var = this.m;
        r61.V(v61Var.a, false, 7);
        r61 r61Var = v61Var.a;
        r61 r61VarU = r61Var.u();
        if (r61VarU == null || r61Var.J != p61.j) {
            return;
        }
        int iOrdinal = r61VarU.N.d.ordinal();
        r61Var.J = iOrdinal != 0 ? iOrdinal != 2 ? r61VarU.J : p61.i : p61.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final w5 p() {
        v61 v61Var;
        r61 r61VarU = this.m.a.u();
        if (r61VarU == null || (v61Var = r61VarU.N) == null) {
            return null;
        }
        return v61Var.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final void q() {
        boolean zT0;
        this.G = true;
        s61 s61Var = this.D;
        s61Var.h();
        boolean z = this.B;
        v61 v61Var = this.m;
        if (z) {
            zk1 zk1VarY = v61Var.a.y();
            Object[] objArr = zk1VarY.h;
            int i = zk1VarY.j;
            for (int i2 = 0; i2 < i; i2++) {
                r61 r61Var = (r61) objArr[i2];
                boolean zQ = r61Var.q();
                v61 v61Var2 = r61Var.N;
                if (zQ && r61Var.r() == p61.h) {
                    mf1 mf1Var = v61Var2.p;
                    fz fzVar = mf1Var.q ? new fz(mf1Var.k) : null;
                    if (fzVar != null) {
                        if (r61Var.J == p61.j) {
                            r61Var.e();
                        }
                        zT0 = v61Var2.p.t0(fzVar.a);
                    } else {
                        zT0 = false;
                    }
                    if (zT0) {
                        r61.V(v61Var.a, false, 7);
                    }
                }
            }
        }
        if (this.C || (!n().r && this.B)) {
            this.B = false;
            n61 n61Var = v61Var.d;
            v61Var.d = n61.j;
            v61Var.g(false);
            r61 r61Var2 = v61Var.a;
            bw1 snapshotObserver = ((b7) u61.a(r61Var2)).getSnapshotObserver();
            snapshotObserver.a.c(r61Var2, snapshotObserver.e, this.J);
            v61Var.d = n61Var;
            this.C = false;
        }
        if (s61Var.b && s61Var.e()) {
            s61Var.g();
        }
        this.G = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q0() {
        this.L = true;
        v61 v61Var = this.m;
        r61 r61VarU = v61Var.a.u();
        float f = n().H;
        r61 r61Var = v61Var.a;
        vn1 vn1Var = r61Var.M;
        zn1 zn1Var = (zn1) vn1Var.e;
        qz0 qz0Var = (qz0) vn1Var.d;
        while (zn1Var != qz0Var) {
            zn1Var.getClass();
            l61 l61Var = (l61) zn1Var;
            f += l61Var.H;
            zn1Var = l61Var.w;
        }
        if (f != this.K) {
            this.K = f;
            if (r61VarU != null) {
                r61VarU.O();
            }
            if (r61VarU != null) {
                r61VarU.C();
            }
        }
        if (!n().r) {
            boolean z = this.y;
            if (!z || this.D.d()) {
                m0();
            }
            if (z) {
                ((qz0) r61Var.M.d).d1();
            } else {
                if (r61VarU != null) {
                    r61VarU.C();
                }
                if (this.n && r61VarU != null) {
                    r61VarU.U(false);
                }
            }
        }
        if (r61VarU != null) {
            v61 v61Var2 = r61VarU.N;
            if (!this.n && v61Var2.d == n61.j) {
                if (this.p != Integer.MAX_VALUE) {
                    kz0.b("Place was called on a node which was placed already");
                }
                int i = v61Var2.i;
                this.p = i;
                v61Var2.i = i + 1;
            }
        } else {
            this.p = 0;
        }
        q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r0(long j, float f, in0 in0Var) {
        v61 v61Var = this.m;
        r61 r61Var = v61Var.a;
        r61 r61Var2 = v61Var.a;
        if (r61Var.X) {
            kz0.a("place is called on a deactivated node");
        }
        v61Var.d = n61.j;
        this.t = j;
        this.v = f;
        this.u = in0Var;
        this.L = false;
        zv1 zv1VarA = u61.a(r61Var2);
        if (this.B || !this.y) {
            this.D.e = false;
            v61Var.f(false);
            this.M = in0Var;
            this.N = j;
            this.O = f;
            bw1 snapshotObserver = ((b7) zv1VarA).getSnapshotObserver();
            snapshotObserver.a.c(r61Var2, snapshotObserver.f, this.P);
        } else {
            zn1 zn1VarA = v61Var.a();
            zn1VarA.i1(z01.c(j, zn1VarA.l), f, in0Var);
            q0();
        }
        v61Var.d = n61.l;
        if (v61Var.a().r && (v61Var.k || v61Var.j)) {
            requestLayout();
        }
        this.r = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w5
    public final void requestLayout() {
        this.m.a.U(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean t0(long j) {
        v61 v61Var = this.m;
        r61 r61Var = v61Var.a;
        r61 r61Var2 = v61Var.a;
        try {
            if (r61Var.X) {
                kz0.a("measure is called on a deactivated node");
            }
            zv1 zv1VarA = u61.a(r61Var2);
            r61 r61VarU = r61Var2.u();
            boolean z = true;
            r61Var2.L = r61Var2.L || (r61VarU != null && r61VarU.L);
            if (!r61Var2.q() && fz.b(this.k, j)) {
                ((b7) zv1VarA).l(r61Var2, false);
                r61Var2.X();
                return false;
            }
            this.D.d = false;
            zk1 zk1VarY = r61Var2.y();
            Object[] objArr = zk1VarY.h;
            int i = zk1VarY.j;
            for (int i2 = 0; i2 < i; i2++) {
                ((r61) objArr[i2]).N.p.D.getClass();
            }
            this.q = true;
            long j2 = v61Var.a().j;
            k0(j);
            n61 n61Var = v61Var.d;
            n61 n61Var2 = n61.l;
            if (n61Var != n61Var2) {
                kz0.b("layout state is not idle before measure starts");
            }
            this.H = j;
            n61 n61Var3 = n61.h;
            v61Var.d = n61Var3;
            this.A = false;
            bw1 snapshotObserver = ((b7) u61.a(r61Var2)).getSnapshotObserver();
            snapshotObserver.a.c(r61Var2, snapshotObserver.c, this.I);
            if (v61Var.d == n61Var3) {
                this.B = true;
                this.C = true;
                v61Var.d = n61Var2;
            }
            if (h11.a(v61Var.a().j, j2) && v61Var.a().h == this.h && v61Var.a().i == this.i) {
                z = false;
            }
            g0((((long) v61Var.a().i) & 4294967295L) | (((long) v61Var.a().h) << 32));
            return z;
        } catch (Throwable th) {
            r61Var.Y(th);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v0() {
        v61 v61Var = this.m;
        r61 r61Var = v61Var.a;
        r61 r61Var2 = v61Var.a;
        if (!r61Var.I() || v61Var.l <= 0) {
            return;
        }
        v61 v61Var2 = r61Var2.N;
        if ((v61Var2.j || v61Var2.k) && !v61Var2.p.B) {
            r61Var2.U(false);
        }
        zk1 zk1VarY = r61Var2.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            ((r61) objArr[i2]).N.p.v0();
        }
    }
}
