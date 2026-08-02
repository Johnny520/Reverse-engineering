package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kw1 extends th1 implements j61 {
    public jw1 v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        jw1 jw1Var = this.v;
        d61 layoutDirection = pf1Var.getLayoutDirection();
        d61 d61Var = d61.h;
        float f = layoutDirection == d61Var ? jw1Var.a : jw1Var.c;
        jw1 jw1Var2 = this.v;
        float f2 = jw1Var2.b;
        float f3 = pf1Var.getLayoutDirection() == d61Var ? jw1Var2.c : jw1Var2.a;
        float f4 = this.v.d;
        if (!((za0.a(f, 0.0f) >= 0) & (za0.a(f2, 0.0f) >= 0) & (za0.a(f3, 0.0f) >= 0) & (za0.a(f4, 0.0f) >= 0))) {
            iz0.a("Padding must be non-negative");
        }
        int iT = pf1Var.T(f);
        int iT2 = pf1Var.T(f3) + iT;
        int iT3 = pf1Var.T(f2);
        int iT4 = pf1Var.T(f4) + iT3;
        sz1 sz1VarE = if1Var.e(gz.i(-iT2, -iT4, j));
        return pf1Var.j0(gz.g(j, sz1VarE.h + iT2), gz.f(j, sz1VarE.i + iT4), ce0.h, new e01(iT, iT3, 1, sz1VarE));
    }
}
