package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wv0 extends wg {
    public final /* synthetic */ xv0 n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wv0(xv0 xv0Var) {
        this.n = xv0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wg
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wg
    public final void k() {
        this.n.e(cg0.CANCEL);
        qv0 qv0Var = this.n.i;
        synchronized (qv0Var) {
            long j = qv0Var.u;
            long j2 = qv0Var.t;
            if (j < j2) {
                return;
            }
            qv0Var.t = j2 + 1;
            qv0Var.v = System.nanoTime() + 1000000000;
            hy2.b(qv0Var.o, hk1.j(new StringBuilder(), qv0Var.j, " ping"), new ta(10, qv0Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
