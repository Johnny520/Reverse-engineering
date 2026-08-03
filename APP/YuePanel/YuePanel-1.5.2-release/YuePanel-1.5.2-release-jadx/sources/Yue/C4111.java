package Yue;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4111 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final List<C4110> f676;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f677;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f8211;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f8212;

    public C4111(@InterfaceC6399 List<C4110> list) {
        C5499.m17103(list, "connectionSpecs");
        this.f676 = list;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final C4110 m1073(@InterfaceC6399 SSLSocket sSLSocket) throws IOException {
        C4110 c4110;
        C5499.m17103(sSLSocket, "sslSocket");
        int i = this.f677;
        int size = this.f676.size();
        while (true) {
            if (i >= size) {
                c4110 = null;
                break;
            }
            c4110 = this.f676.get(i);
            if (c4110.m11704(sSLSocket)) {
                this.f677 = i + 1;
                break;
            }
            i++;
        }
        if (c4110 != null) {
            this.f8211 = m11723(sSLSocket);
            c4110.m11702(sSLSocket, this.f8212);
            return c4110;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f8212);
        sb.append(", modes=");
        sb.append(this.f676);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        C5499.m17100(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        C5499.m17102(string, "toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m1074(@InterfaceC6399 IOException iOException) {
        C5499.m17103(iOException, "e");
        this.f8212 = true;
        return (!this.f8211 || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m11723(SSLSocket sSLSocket) {
        int size = this.f676.size();
        for (int i = this.f677; i < size; i++) {
            if (this.f676.get(i).m11704(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
