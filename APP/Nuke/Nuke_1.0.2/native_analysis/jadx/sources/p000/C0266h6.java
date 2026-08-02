package p000;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: h6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0266h6 extends up0 {

    /* JADX INFO: renamed from: p */
    public final X509TrustManager f3826p;

    /* JADX INFO: renamed from: q */
    public final X509TrustManagerExtensions f3827q;

    public C0266h6(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f3826p = x509TrustManager;
        this.f3827q = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0266h6) && ((C0266h6) obj).f3826p == this.f3826p;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3826p);
    }

    @Override // p000.up0
    /* JADX INFO: renamed from: o */
    public final List mo847o(String str, List list) throws SSLPeerUnverifiedException {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> listCheckServerTrusted = this.f3827q.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            listCheckServerTrusted.getClass();
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
