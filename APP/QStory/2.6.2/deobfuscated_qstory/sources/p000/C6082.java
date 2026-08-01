package p000;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p019.AbstractC6241;
import p305.C8631;

/* JADX INFO: renamed from: 飘花落叶言世兰哲子楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6082 implements InterfaceC6083 {
    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11380(SSLSocket sSLSocket, String str, List list) throws IOException {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            AbstractC6241 abstractC6241 = AbstractC6241.f17194;
            sSLParameters.setApplicationProtocols((String[]) C8631.m14291(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo11381(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo11382(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p000.InterfaceC6083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo11383() {
        AbstractC6241 abstractC6241 = AbstractC6241.f17194;
        return Build.VERSION.SDK_INT >= 29;
    }
}
