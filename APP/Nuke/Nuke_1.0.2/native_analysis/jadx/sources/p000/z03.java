package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z03 {

    /* JADX INFO: renamed from: a */
    public final y03 f13697a;

    /* JADX INFO: renamed from: b */
    public c61 f13698b = null;

    /* JADX INFO: renamed from: c */
    public c61 f13699c;

    public z03(y03 y03Var, c61 c61Var) {
        this.f13697a = y03Var;
        this.f13699c = c61Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m6375a(long j) {
        o62 o62VarMo644J;
        c61 c61Var = this.f13698b;
        o62 o62Var = o62.f7535e;
        if (c61Var != null) {
            if (c61Var.mo653w()) {
                c61 c61Var2 = this.f13699c;
                o62VarMo644J = c61Var2 != null ? c61Var2.mo644J(c61Var, true) : null;
            } else {
                o62VarMo644J = o62Var;
            }
            if (o62VarMo644J != null) {
                o62Var = o62VarMo644J;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = o62Var.f7536a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = o62Var.f7538c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = o62Var.f7537b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = o62Var.f7539d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public final int m6376b(long j, boolean z) {
        if (z) {
            j = m6375a(j);
        }
        return this.f13697a.f13267b.m2920g(m6378d(j));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6377c(long j) {
        long jM6378d = m6378d(m6375a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jM6378d));
        y03 y03Var = this.f13697a;
        int iM2918e = y03Var.f13267b.m2918e(fIntBitsToFloat);
        int i = (int) (jM6378d >> 32);
        return Float.intBitsToFloat(i) >= y03Var.m6204d(iM2918e) && Float.intBitsToFloat(i) <= y03Var.m6205e(iM2918e);
    }

    /* JADX INFO: renamed from: d */
    public final long m6378d(long j) {
        c61 c61Var;
        c61 c61Var2 = this.f13698b;
        if (c61Var2 != null) {
            if (!c61Var2.mo653w()) {
                c61Var2 = null;
            }
            if (c61Var2 != null && (c61Var = this.f13699c) != null) {
                c61 c61Var3 = c61Var.mo653w() ? c61Var : null;
                if (c61Var3 != null) {
                    return c61Var2.mo651r(c61Var3, j);
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public final long m6379e(long j) {
        c61 c61Var;
        c61 c61Var2 = this.f13698b;
        if (c61Var2 != null) {
            if (!c61Var2.mo653w()) {
                c61Var2 = null;
            }
            if (c61Var2 != null && (c61Var = this.f13699c) != null) {
                c61 c61Var3 = c61Var.mo653w() ? c61Var : null;
                if (c61Var3 != null) {
                    return c61Var3.mo651r(c61Var2, j);
                }
            }
        }
        return j;
    }
}
