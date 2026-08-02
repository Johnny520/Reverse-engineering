package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class o53 extends q43 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        int I = l41Var.I();
        if (I != 9) {
            return I == 6 ? Boolean.valueOf(Boolean.parseBoolean(l41Var.G())) : Boolean.valueOf(l41Var.t());
        }
        l41Var.E();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            o41Var.p();
            return;
        }
        o41Var.F();
        o41Var.b();
        o41Var.h.write(bool.booleanValue() ? "true" : "false");
    }
}
