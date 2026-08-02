package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class q53 extends q43 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        if (l41Var.I() == 9) {
            l41Var.E();
            return null;
        }
        try {
            int iV = l41Var.v();
            if (iV <= 255 && iV >= -128) {
                return Byte.valueOf((byte) iV);
            }
            StringBuilder sbN = vi0.n(iV, "Lossy conversion from ", " to byte; at path ");
            sbN.append(l41Var.o(true));
            throw new t31(sbN.toString());
        } catch (NumberFormatException e) {
            throw new t31(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        if (((Number) obj) == null) {
            o41Var.p();
        } else {
            o41Var.A(r4.byteValue());
        }
    }
}
