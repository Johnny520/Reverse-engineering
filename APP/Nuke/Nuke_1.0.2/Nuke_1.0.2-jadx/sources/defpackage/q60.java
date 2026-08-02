package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q60 implements zs2 {
    public final p60 a;
    public zs2 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q60(p60 p60Var) {
        this.a = p60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zs2
    public final String a(SSLSocket sSLSocket) {
        zs2 zs2VarE = e(sSLSocket);
        if (zs2VarE != null) {
            return zs2VarE.a(sSLSocket);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zs2
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zs2
    public final boolean c() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zs2
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        zs2 zs2VarE = e(sSLSocket);
        if (zs2VarE != null) {
            zs2VarE.d(sSLSocket, str, list);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized zs2 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
