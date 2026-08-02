package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qz0 extends zn1 {
    public static final q9 a0;
    public final qx2 Y;
    public pz0 Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        q9 q9VarI = pp0.i();
        int i = ju.h;
        q9VarI.k(ju.d);
        q9VarI.q(1.0f);
        q9VarI.r(1);
        a0 = q9VarI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qz0(r61 r61Var) {
        super(r61Var);
        qx2 qx2Var = new qx2();
        qx2Var.k = 0;
        this.Y = qx2Var;
        qx2Var.o = this;
        this.Z = r61Var.o != null ? new pz0(this) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int N(int i) {
        sz0 sz0VarT = this.v.t();
        nf1 nf1VarG = sz0VarT.G();
        r61 r61Var = (r61) sz0VarT.i;
        return nf1VarG.j((zn1) r61Var.M.e, r61Var.m(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zn1
    public final void N0() {
        if (this.Z == null) {
            this.Z = new pz0(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zn1
    public final md1 Q0() {
        return this.Z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zn1
    public final th1 S0() {
        return this.Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int W(int i) {
        sz0 sz0VarT = this.v.t();
        nf1 nf1VarG = sz0VarT.G();
        r61 r61Var = (r61) sz0VarT.i;
        return nf1VarG.d((zn1) r61Var.M.e, r61Var.m(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int X(int i) {
        sz0 sz0VarT = this.v.t();
        nf1 nf1VarG = sz0VarT.G();
        r61 r61Var = (r61) sz0VarT.i;
        return nf1VarG.h((zn1) r61Var.M.e, r61Var.m(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.zn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0(xn1 xn1Var, long j, xs0 xs0Var, int i, boolean z) {
        int i2;
        boolean z2;
        r61 r61Var = this.v;
        boolean z3 = false;
        if (xn1Var.r(r61Var)) {
            if (t1(j)) {
                i2 = i;
                z2 = z;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(K0(j, R0())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
            }
            z3 = true;
            if (z3) {
                return;
            }
            int i3 = xs0Var.j;
            zk1 zk1VarX = r61Var.x();
            Object[] objArr = zk1VarX.h;
            int i4 = zk1VarX.j - 1;
            while (i4 >= 0) {
                r61 r61Var2 = (r61) objArr[i4];
                if (r61Var2.I()) {
                    xn1Var.l(r61Var2, j, xs0Var, i2, z2);
                    long jA = xs0Var.a();
                    if (xe1.z(jA) < 0.0f && xe1.O(jA) && !xe1.N(jA) && !xn1Var.o(xs0Var, r61Var2)) {
                        break;
                    }
                }
                i4--;
                i2 = i;
            }
            xs0Var.j = i3;
            return;
        }
        i2 = i;
        z2 = z;
        if (z3) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final sz1 e(long j) {
        k0(j);
        r61 r61Var = this.v;
        zk1 zk1VarY = r61Var.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            ((r61) objArr[i2]).N.p.s = p61.j;
        }
        l1(r61Var.D.g(this, r61Var.m(), j));
        c1();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int f(int i) {
        sz0 sz0VarT = this.v.t();
        nf1 nf1VarG = sz0VarT.G();
        r61 r61Var = (r61) sz0VarT.i;
        return nf1VarG.b((zn1) r61Var.M.e, r61Var.m(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sz1
    public final void f0(long j, float f, in0 in0Var) {
        i1(j, f, in0Var);
        if (this.q) {
            return;
        }
        this.v.N.p.q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zn1
    public final void h1(qp qpVar, pq0 pq0Var) {
        r61 r61Var = this.v;
        zv1 zv1VarA = u61.a(r61Var);
        zk1 zk1VarX = r61Var.x();
        Object[] objArr = zk1VarX.h;
        int i = zk1VarX.j;
        for (int i2 = 0; i2 < i; i2++) {
            r61 r61Var2 = (r61) objArr[i2];
            if (r61Var2.I()) {
                r61Var2.i(qpVar, pq0Var);
            }
        }
        if (((b7) zv1VarA).getShowLayoutBounds()) {
            long j = this.j;
            qpVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, a0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final int m0(du0 du0Var) {
        pz0 pz0Var = this.Z;
        if (pz0Var != null) {
            return pz0Var.m0(du0Var);
        }
        mf1 mf1Var = this.v.N.p;
        n61 n61Var = mf1Var.m.d;
        s61 s61Var = mf1Var.D;
        if (n61Var == n61.h) {
            s61Var.d = true;
            if (s61Var.b) {
                mf1Var.B = true;
                mf1Var.C = true;
            }
        } else {
            s61Var.e = true;
        }
        qz0 qz0VarN = mf1Var.n();
        boolean z = qz0VarN.r;
        qz0VarN.r = true;
        mf1Var.q();
        qz0VarN.r = z;
        Integer num = (Integer) s61Var.g.get(du0Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
