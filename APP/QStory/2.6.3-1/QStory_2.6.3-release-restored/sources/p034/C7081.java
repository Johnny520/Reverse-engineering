package p034;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p033.AbstractC7067;
import p321.C9452;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7081 implements InterfaceC7078 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean f17564;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7072 f17565 = new C7072();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC7082.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f17564 = z;
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12287(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (mo12289(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            AbstractC7067 abstractC7067 = AbstractC7067.f17543;
            parameters.setApplicationProtocols((String[]) C9452.m14869(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo12288(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12289(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p034.InterfaceC7078
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo12290() {
        return f17564;
    }
}
