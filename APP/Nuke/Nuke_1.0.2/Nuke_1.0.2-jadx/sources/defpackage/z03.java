package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z03 {
    public final y03 a;
    public c61 b = null;
    public c61 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z03(y03 y03Var, c61 c61Var) {
        this.a = y03Var;
        this.c = c61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a(long j) {
        o62 o62VarJ;
        c61 c61Var = this.b;
        o62 o62Var = o62.e;
        if (c61Var != null) {
            if (c61Var.w()) {
                c61 c61Var2 = this.c;
                o62VarJ = c61Var2 != null ? c61Var2.J(c61Var, true) : null;
            } else {
                o62VarJ = o62Var;
            }
            if (o62VarJ != null) {
                o62Var = o62VarJ;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = o62Var.a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = o62Var.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = o62Var.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = o62Var.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        y03 y03Var = this.a;
        int iE = y03Var.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= y03Var.d(iE) && Float.intBitsToFloat(i) <= y03Var.e(iE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long d(long j) {
        c61 c61Var;
        c61 c61Var2 = this.b;
        if (c61Var2 != null) {
            if (!c61Var2.w()) {
                c61Var2 = null;
            }
            if (c61Var2 != null && (c61Var = this.c) != null) {
                c61 c61Var3 = c61Var.w() ? c61Var : null;
                if (c61Var3 != null) {
                    return c61Var2.r(c61Var3, j);
                }
            }
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long e(long j) {
        c61 c61Var;
        c61 c61Var2 = this.b;
        if (c61Var2 != null) {
            if (!c61Var2.w()) {
                c61Var2 = null;
            }
            if (c61Var2 != null && (c61Var = this.c) != null) {
                c61 c61Var3 = c61Var.w() ? c61Var : null;
                if (c61Var3 != null) {
                    return c61Var3.r(c61Var2, j);
                }
            }
        }
        return j;
    }
}
