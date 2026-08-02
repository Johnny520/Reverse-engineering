package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class w43 extends q43 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        if (l41Var.I() == 9) {
            l41Var.E();
            return null;
        }
        String strG = l41Var.G();
        if (strG.length() == 1) {
            return Character.valueOf(strG.charAt(0));
        }
        um2.h("Expecting character, got: ", strG, "; at ", l41Var.o(true));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        Character ch = (Character) obj;
        o41Var.D(ch == null ? null : String.valueOf(ch));
    }
}
