package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cs1 extends q43 {
    public static final bs1 b = new bs1(new cs1(2), 0);
    public final int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cs1(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        int I = l41Var.I();
        int iU = vi0.u(I);
        if (iU == 5 || iU == 6) {
            return hk1.a(this.a, l41Var);
        }
        if (iU == 8) {
            l41Var.E();
            return null;
        }
        um2.h("Expecting number, got: ", vi0.x(I), "; at path ", l41Var.o(false));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        o41Var.B((Number) obj);
    }
}
