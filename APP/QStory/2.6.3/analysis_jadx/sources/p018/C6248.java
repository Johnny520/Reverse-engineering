package p018;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p017.AbstractC6238;
import p305.C8623;

/* JADX INFO: renamed from: 飘花落叶言世兰苏哲楪子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6248 implements InterfaceC6249 {
    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11728(SSLSocket sSLSocket, String str, List list) throws IOException {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            AbstractC6238 abstractC6238 = AbstractC6238.f17198;
            sSLParameters.setApplicationProtocols((String[]) C8623.m14310(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo11729(SSLSocket sSLSocket) {
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

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo11730(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p018.InterfaceC6249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo11731() {
        AbstractC6238 abstractC6238 = AbstractC6238.f17198;
        return Build.VERSION.SDK_INT >= 29;
    }
}
