package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hw1 extends th1 implements j61 {
    public float v;
    public float w;
    public float x;
    public float y;
    public boolean z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        int iT = pf1Var.T(this.x) + pf1Var.T(this.v);
        int iT2 = pf1Var.T(this.y) + pf1Var.T(this.w);
        sz1 sz1VarE = if1Var.e(gz.i(-iT, -iT2, j));
        return pf1Var.j0(gz.g(j, sz1VarE.h + iT), gz.f(j, sz1VarE.i + iT2), ce0.h, new d2(26, this, sz1VarE));
    }
}
