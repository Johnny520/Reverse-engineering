package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pz0 extends md1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.md1
    public final void I0() {
        qd1 qd1Var = this.v.v.N.q;
        qd1Var.getClass();
        qd1Var.r0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int N(int i) {
        sz0 sz0VarT = this.v.v.t();
        nf1 nf1VarG = sz0VarT.G();
        r61 r61Var = (r61) sz0VarT.i;
        return nf1VarG.j((zn1) r61Var.M.e, r61Var.l(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int W(int i) {
        sz0 sz0VarT = this.v.v.t();
        nf1 nf1VarG = sz0VarT.G();
        r61 r61Var = (r61) sz0VarT.i;
        return nf1VarG.d((zn1) r61Var.M.e, r61Var.l(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int X(int i) {
        sz0 sz0VarT = this.v.v.t();
        nf1 nf1VarG = sz0VarT.G();
        r61 r61Var = (r61) sz0VarT.i;
        return nf1VarG.h((zn1) r61Var.M.e, r61Var.l(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final sz1 e(long j) {
        k0(j);
        zn1 zn1Var = this.v;
        zk1 zk1VarY = zn1Var.v.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            qd1 qd1Var = ((r61) objArr[i2]).N.q;
            qd1Var.getClass();
            qd1Var.q = p61.j;
        }
        r61 r61Var = zn1Var.v;
        md1.H0(this, r61Var.D.g(this, r61Var.l(), j));
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.if1
    public final int f(int i) {
        sz0 sz0VarT = this.v.v.t();
        nf1 nf1VarG = sz0VarT.G();
        r61 r61Var = (r61) sz0VarT.i;
        return nf1VarG.b((zn1) r61Var.M.e, r61Var.l(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final int m0(du0 du0Var) {
        qd1 qd1Var = this.v.v.N.q;
        qd1Var.getClass();
        v61 v61Var = qd1Var.m;
        n61 n61Var = v61Var.d;
        s61 s61Var = qd1Var.x;
        if (n61Var == n61.i) {
            s61Var.d = true;
            if (s61Var.b) {
                v61Var.f = true;
                v61Var.g = true;
            }
        } else {
            s61Var.e = true;
        }
        pz0 pz0Var = qd1Var.n().Z;
        if (pz0Var != null) {
            pz0Var.r = true;
        }
        qd1Var.q();
        pz0 pz0Var2 = qd1Var.n().Z;
        if (pz0Var2 != null) {
            pz0Var2.r = false;
        }
        Integer num = (Integer) s61Var.g.get(du0Var);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.A.g(iIntValue, du0Var);
        return iIntValue;
    }
}
