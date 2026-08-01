package p018;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p017.AbstractC6238;
import p305.C8623;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6252 implements InterfaceC6249 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean f17219;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6243 f17220 = new C6243();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC6253.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f17219 = z;
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11728(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (mo11730(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            AbstractC6238 abstractC6238 = AbstractC6238.f17198;
            parameters.setApplicationProtocols((String[]) C8623.m14310(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo11729(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo11730(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo11731() {
        return f17219;
    }
}
