package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: renamed from: ul */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0777ul implements zs2 {

    /* JADX INFO: renamed from: a */
    public static final C0698sl f11342a = new C0698sl();

    /* JADX INFO: renamed from: b */
    public static final boolean f11343b;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC0738tl.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f11343b = z;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: a */
    public final String mo920a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: b */
    public final boolean mo921b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: c */
    public final boolean mo922c() {
        return f11343b;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: d */
    public final void mo923d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (mo921b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            zz1 zz1Var = zz1.f14161a;
            parameters.setApplicationProtocols((String[]) j51.m2439u(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
