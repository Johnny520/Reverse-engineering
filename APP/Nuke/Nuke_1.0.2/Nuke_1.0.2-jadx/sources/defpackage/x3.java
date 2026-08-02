package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 extends v3 {
    public static x3 l;
    public static final c92 m = c92.i;
    public static final c92 n = c92.h;
    public y03 j;
    public qn2 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v3
    public final int[] a(int i) {
        int iE;
        if (c().length() > 0 && i < c().length()) {
            try {
                qn2 qn2Var = this.k;
                if (qn2Var == null) {
                    t11.S("node");
                    throw null;
                }
                o62 o62VarG = qn2Var.g();
                int iRound = Math.round(o62VarG.d - o62VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                y03 y03Var = this.j;
                if (y03Var == null) {
                    t11.S("layoutResult");
                    throw null;
                }
                int iD = y03Var.b.d(i);
                y03 y03Var2 = this.j;
                if (y03Var2 == null) {
                    t11.S("layoutResult");
                    throw null;
                }
                float f = y03Var2.b.f(iD) + iRound;
                y03 y03Var3 = this.j;
                if (y03Var3 == null) {
                    t11.S("layoutResult");
                    throw null;
                }
                float f2 = y03Var3.b.f(r0.f - 1);
                y03 y03Var4 = this.j;
                if (f < f2) {
                    if (y03Var4 == null) {
                        t11.S("layoutResult");
                        throw null;
                    }
                    iE = y03Var4.b.e(f);
                } else {
                    if (y03Var4 == null) {
                        t11.S("layoutResult");
                        throw null;
                    }
                    iE = y03Var4.b.f;
                }
                return b(i, k(iE - 1, n) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.v3
    public final int[] i(int i) {
        int iE;
        if (c().length() > 0 && i > 0) {
            try {
                qn2 qn2Var = this.k;
                if (qn2Var == null) {
                    t11.S("node");
                    throw null;
                }
                o62 o62VarG = qn2Var.g();
                int iRound = Math.round(o62VarG.d - o62VarG.b);
                int length = c().length();
                if (length <= i) {
                    i = length;
                }
                y03 y03Var = this.j;
                if (y03Var == null) {
                    t11.S("layoutResult");
                    throw null;
                }
                int iD = y03Var.b.d(i);
                y03 y03Var2 = this.j;
                if (y03Var2 == null) {
                    t11.S("layoutResult");
                    throw null;
                }
                float f = y03Var2.b.f(iD) - iRound;
                if (f > 0.0f) {
                    y03 y03Var3 = this.j;
                    if (y03Var3 == null) {
                        t11.S("layoutResult");
                        throw null;
                    }
                    iE = y03Var3.b.e(f);
                } else {
                    iE = 0;
                }
                if (i == c().length() && iE < iD) {
                    iE++;
                }
                return b(k(iE, m), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int k(int i, c92 c92Var) {
        y03 y03Var = this.j;
        if (y03Var == null) {
            t11.S("layoutResult");
            throw null;
        }
        int iF = y03Var.f(i);
        y03 y03Var2 = this.j;
        if (y03Var2 == null) {
            t11.S("layoutResult");
            throw null;
        }
        c92 c92VarG = y03Var2.g(iF);
        y03 y03Var3 = this.j;
        if (c92Var != c92VarG) {
            if (y03Var3 != null) {
                return y03Var3.f(i);
            }
            t11.S("layoutResult");
            throw null;
        }
        if (y03Var3 != null) {
            return y03Var3.b.c(i, false) - 1;
        }
        t11.S("layoutResult");
        throw null;
    }
}
