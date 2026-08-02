package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class el extends th1 implements j61, on2 {
    public in0 v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public el(in0 in0Var) {
        this.v = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        sz1 sz1VarE = if1Var.e(j);
        return pf1Var.j0(sz1VarE.h, sz1VarE.i, ce0.h, new fa(6, sz1VarE, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final boolean i() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final void l0(zn2 zn2Var) {
        eq2 eq2Var;
        boolean z;
        zn1 zn1VarZ = sp0.Z(this, 2);
        if (zn1VarZ.M) {
            eq2Var = zn1VarZ.K;
            z = zn1VarZ.L;
        } else {
            ca2 ca2Var = te.b;
            if (ca2Var == null) {
                te.b = new ca2();
            } else {
                ca2Var.a();
            }
            ca2 ca2Var2 = te.b;
            ca2Var2.getClass();
            ca2Var2.x = zn1VarZ.v.F;
            ca2Var2.w = s11.q0(zn1VarZ.j);
            vr2 vr2VarB = tl.B();
            in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
            vr2 vr2VarK = tl.K(vr2VarB);
            try {
                this.v.j(ca2Var2);
                tl.U(vr2VarB, vr2VarK, in0VarE);
                eq2Var = ca2Var2.u;
                z = ca2Var2.v;
            } catch (Throwable th) {
                tl.U(vr2VarB, vr2VarK, in0VarE);
                throw th;
            }
        }
        if (z) {
            xn2.c(zn2Var, eq2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.v + ')';
    }
}
