package defpackage;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class h53 extends q43 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        if (l41Var.I() == 9) {
            l41Var.E();
            return null;
        }
        String strG = l41Var.G();
        try {
            return UUID.fromString(strG);
        } catch (IllegalArgumentException e) {
            um2.e(strG, "' as UUID; at path ", l41Var.o(true), e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        o41Var.D(uuid == null ? null : uuid.toString());
    }
}
