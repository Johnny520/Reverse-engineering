package p179i4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p110W0.C1577b;
import p117X2.AbstractC1665j;
import p173h4.AbstractC2263d;

/* JADX INFO: renamed from: i4.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2353h implements InterfaceC2359n {

    /* JADX INFO: renamed from: a */
    public static final C2351f f7652a = new C2351f();

    /* JADX INFO: renamed from: b */
    public static final boolean f7653b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        boolean z5 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC2352g.class.getClassLoader());
            z5 = true;
        } catch (ClassNotFoundException unused) {
        }
        f7653b = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: a */
    public final boolean mo4172a(SSLSocket sSLSocket) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: b */
    public final String mo4173b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: c */
    public final boolean mo4174c() {
        return f7653b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: d */
    public final void mo4175d(SSLSocket sSLSocket, String str, List list) {
        AbstractC1665j.m2985e(list, "protocols");
        if (mo4172a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
            parameters.setApplicationProtocols((String[]) C1577b.m2844l(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
