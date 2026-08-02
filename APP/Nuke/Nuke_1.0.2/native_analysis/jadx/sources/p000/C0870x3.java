package p000;

/* JADX INFO: renamed from: x3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0870x3 extends AbstractC0796v3 {

    /* JADX INFO: renamed from: l */
    public static C0870x3 f12782l;

    /* JADX INFO: renamed from: m */
    public static final c92 f12783m = c92.f1252i;

    /* JADX INFO: renamed from: n */
    public static final c92 f12784n = c92.f1251h;

    /* JADX INFO: renamed from: j */
    public y03 f12785j;

    /* JADX INFO: renamed from: k */
    public qn2 f12786k;

    @Override // p000.AbstractC0796v3
    /* JADX INFO: renamed from: a */
    public final int[] mo5611a(int i) {
        int iM2918e;
        if (m5613c().length() > 0 && i < m5613c().length()) {
            try {
                qn2 qn2Var = this.f12786k;
                if (qn2Var == null) {
                    t11.m5067S("node");
                    throw null;
                }
                o62 o62VarM4206g = qn2Var.m4206g();
                int iRound = Math.round(o62VarM4206g.f7539d - o62VarM4206g.f7537b);
                if (i <= 0) {
                    i = 0;
                }
                y03 y03Var = this.f12785j;
                if (y03Var == null) {
                    t11.m5067S("layoutResult");
                    throw null;
                }
                int iM2917d = y03Var.f13267b.m2917d(i);
                y03 y03Var2 = this.f12785j;
                if (y03Var2 == null) {
                    t11.m5067S("layoutResult");
                    throw null;
                }
                float fM2919f = y03Var2.f13267b.m2919f(iM2917d) + iRound;
                y03 y03Var3 = this.f12785j;
                if (y03Var3 == null) {
                    t11.m5067S("layoutResult");
                    throw null;
                }
                float fM2919f2 = y03Var3.f13267b.m2919f(r0.f6151f - 1);
                y03 y03Var4 = this.f12785j;
                if (fM2919f < fM2919f2) {
                    if (y03Var4 == null) {
                        t11.m5067S("layoutResult");
                        throw null;
                    }
                    iM2918e = y03Var4.f13267b.m2918e(fM2919f);
                } else {
                    if (y03Var4 == null) {
                        t11.m5067S("layoutResult");
                        throw null;
                    }
                    iM2918e = y03Var4.f13267b.f6151f;
                }
                return m5612b(i, m6029k(iM2918e - 1, f12784n) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // p000.AbstractC0796v3
    /* JADX INFO: renamed from: i */
    public final int[] mo5618i(int i) {
        int iM2918e;
        if (m5613c().length() > 0 && i > 0) {
            try {
                qn2 qn2Var = this.f12786k;
                if (qn2Var == null) {
                    t11.m5067S("node");
                    throw null;
                }
                o62 o62VarM4206g = qn2Var.m4206g();
                int iRound = Math.round(o62VarM4206g.f7539d - o62VarM4206g.f7537b);
                int length = m5613c().length();
                if (length <= i) {
                    i = length;
                }
                y03 y03Var = this.f12785j;
                if (y03Var == null) {
                    t11.m5067S("layoutResult");
                    throw null;
                }
                int iM2917d = y03Var.f13267b.m2917d(i);
                y03 y03Var2 = this.f12785j;
                if (y03Var2 == null) {
                    t11.m5067S("layoutResult");
                    throw null;
                }
                float fM2919f = y03Var2.f13267b.m2919f(iM2917d) - iRound;
                if (fM2919f > 0.0f) {
                    y03 y03Var3 = this.f12785j;
                    if (y03Var3 == null) {
                        t11.m5067S("layoutResult");
                        throw null;
                    }
                    iM2918e = y03Var3.f13267b.m2918e(fM2919f);
                } else {
                    iM2918e = 0;
                }
                if (i == m5613c().length() && iM2918e < iM2917d) {
                    iM2918e++;
                }
                return m5612b(m6029k(iM2918e, f12783m), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final int m6029k(int i, c92 c92Var) {
        y03 y03Var = this.f12785j;
        if (y03Var == null) {
            t11.m5067S("layoutResult");
            throw null;
        }
        int iM6206f = y03Var.m6206f(i);
        y03 y03Var2 = this.f12785j;
        if (y03Var2 == null) {
            t11.m5067S("layoutResult");
            throw null;
        }
        c92 c92VarM6207g = y03Var2.m6207g(iM6206f);
        y03 y03Var3 = this.f12785j;
        if (c92Var != c92VarM6207g) {
            if (y03Var3 != null) {
                return y03Var3.m6206f(i);
            }
            t11.m5067S("layoutResult");
            throw null;
        }
        if (y03Var3 != null) {
            return y03Var3.f13267b.m2916c(i, false) - 1;
        }
        t11.m5067S("layoutResult");
        throw null;
    }
}
