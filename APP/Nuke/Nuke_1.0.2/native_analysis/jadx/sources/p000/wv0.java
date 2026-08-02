package p000;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wv0 extends C0846wg {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ xv0 f12689n;

    public wv0(xv0 xv0Var) {
        this.f12689n = xv0Var;
    }

    @Override // p000.C0846wg
    /* JADX INFO: renamed from: j */
    public final IOException mo276j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // p000.C0846wg
    /* JADX INFO: renamed from: k */
    public final void mo277k() {
        this.f12689n.m6186e(cg0.CANCEL);
        qv0 qv0Var = this.f12689n.f13182i;
        synchronized (qv0Var) {
            long j = qv0Var.f9199u;
            long j2 = qv0Var.f9198t;
            if (j < j2) {
                return;
            }
            qv0Var.f9198t = j2 + 1;
            qv0Var.f9200v = System.nanoTime() + 1000000000;
            hy2.m2234b(qv0Var.f9193o, hk1.m2211j(new StringBuilder(), qv0Var.f9188j, " ping"), new C0727ta(10, qv0Var));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6004l() {
        if (m5887i()) {
            throw mo276j(null);
        }
    }
}
