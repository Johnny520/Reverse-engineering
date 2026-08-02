package defpackage;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class g53 extends q43 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        if (l41Var.I() != 9) {
            return InetAddress.getByName(l41Var.G());
        }
        l41Var.E();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        o41Var.D(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
