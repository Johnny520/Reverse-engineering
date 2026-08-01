package p179i4;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p049I2.AbstractC0797o;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: i4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2347b extends AbstractC0797o {

    /* JADX INFO: renamed from: c */
    public final X509TrustManager f7641c;

    /* JADX INFO: renamed from: d */
    public final X509TrustManagerExtensions f7642d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2347b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f7641c = x509TrustManager;
        this.f7642d = x509TrustManagerExtensions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C2347b) && ((C2347b) obj).f7641c == this.f7641c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return System.identityHashCode(this.f7641c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p049I2.AbstractC0797o
    /* JADX INFO: renamed from: i */
    public final List mo1402i(String str, List list) throws SSLPeerUnverifiedException {
        AbstractC1665j.m2985e(list, "chain");
        AbstractC1665j.m2985e(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f7642d.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            AbstractC1665j.m2984d(listCheckServerTrusted, "checkServerTrusted(...)");
            return listCheckServerTrusted;
        } catch (CertificateException e5) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e5.getMessage());
            sSLPeerUnverifiedException.initCause(e5);
            throw sSLPeerUnverifiedException;
        }
    }
}
