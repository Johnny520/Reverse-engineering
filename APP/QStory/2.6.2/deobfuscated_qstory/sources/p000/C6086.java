package p000;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p019.AbstractC6241;
import p305.C8631;

/* JADX INFO: renamed from: 飘花落叶言世兰哲子楪苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6086 implements InterfaceC6083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean f16637;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6077 f16638 = new C6077();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC6087.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f16637 = z;
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11380(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (mo11382(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            AbstractC6241 abstractC6241 = AbstractC6241.f17194;
            parameters.setApplicationProtocols((String[]) C8631.m14291(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo11381(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo11382(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo11383() {
        return f16637;
    }
}
