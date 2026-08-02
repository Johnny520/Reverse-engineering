package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q60 implements zs2 {

    /* JADX INFO: renamed from: a */
    public final p60 f8747a;

    /* JADX INFO: renamed from: b */
    public zs2 f8748b;

    public q60(p60 p60Var) {
        this.f8747a = p60Var;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: a */
    public final String mo920a(SSLSocket sSLSocket) {
        zs2 zs2VarM4057e = m4057e(sSLSocket);
        if (zs2VarM4057e != null) {
            return zs2VarM4057e.mo920a(sSLSocket);
        }
        return null;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: b */
    public final boolean mo921b(SSLSocket sSLSocket) {
        return this.f8747a.mo312b(sSLSocket);
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: c */
    public final boolean mo922c() {
        return true;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: d */
    public final void mo923d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        zs2 zs2VarM4057e = m4057e(sSLSocket);
        if (zs2VarM4057e != null) {
            zs2VarM4057e.mo923d(sSLSocket, str, list);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized zs2 m4057e(SSLSocket sSLSocket) {
        try {
            if (this.f8748b == null && this.f8747a.mo312b(sSLSocket)) {
                this.f8748b = this.f8747a.mo313c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8748b;
    }
}
