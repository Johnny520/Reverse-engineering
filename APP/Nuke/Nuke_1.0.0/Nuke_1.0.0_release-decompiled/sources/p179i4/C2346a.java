package p179i4;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p110W0.C1577b;
import p117X2.AbstractC1665j;
import p173h4.AbstractC2263d;

/* JADX INFO: renamed from: i4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2346a implements InterfaceC2359n {
    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: a */
    public final boolean mo4172a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: b */
    public final String mo4173b(SSLSocket sSLSocket) {
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

    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: c */
    public final boolean mo4174c() {
        AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // p179i4.InterfaceC2359n
    /* JADX INFO: renamed from: d */
    public final void mo4175d(SSLSocket sSLSocket, String str, List list) throws IOException {
        AbstractC1665j.m2985e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
            sSLParameters.setApplicationProtocols((String[]) C1577b.m2844l(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e5) {
            throw new IOException("Android internal error", e5);
        }
    }
}
