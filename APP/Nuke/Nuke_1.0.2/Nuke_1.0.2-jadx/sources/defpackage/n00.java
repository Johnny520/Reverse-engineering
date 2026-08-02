package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n00 {
    public final ps2 a = new ps2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(n00 n00Var, mn0 mn0Var, kw kwVar, xm0 xm0Var, int i) {
        if ((i & 8) != 0) {
            kwVar = null;
        }
        n00Var.a.add(new kw(-1789283891, true, new b81(mn0Var, n00Var, kwVar, xm0Var)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(m00 m00Var, px pxVar, int i) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-798501095);
        int i2 = 2;
        int i3 = (go0Var.f(m00Var) ? 4 : 2) | i | (go0Var.f(this) ? 32 : 16);
        if (go0Var.O(i3 & 1, (i3 & 19) != 18)) {
            ps2 ps2Var = this.a;
            int size = ps2Var.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((nn0) ps2Var.get(i4)).e(m00Var, go0Var, Integer.valueOf(i3 & 14));
            }
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new af(i, i2, this, m00Var);
        }
    }
}
