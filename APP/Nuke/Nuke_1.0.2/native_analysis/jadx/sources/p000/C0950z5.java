package p000;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: z5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0950z5 implements zs2 {
    @Override // p000.zs2
    /* JADX INFO: renamed from: a */
    public final String mo920a(SSLSocket sSLSocket) {
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

    @Override // p000.zs2
    /* JADX INFO: renamed from: b */
    public final boolean mo921b(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: c */
    public final boolean mo922c() {
        zz1 zz1Var = zz1.f14161a;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // p000.zs2
    /* JADX INFO: renamed from: d */
    public final void mo923d(SSLSocket sSLSocket, String str, List list) throws IOException {
        list.getClass();
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            zz1 zz1Var = zz1.f14161a;
            sSLParameters.setApplicationProtocols((String[]) j51.m2439u(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
