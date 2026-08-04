package yyds;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: yyds.ᛴᛱᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0766 extends AbstractC0181 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final X509TrustManagerExtensions f3538;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final X509TrustManager f3539;

    public C0766(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f3539 = x509TrustManager;
        this.f3538 = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0766) && ((C0766) obj).f3539 == this.f3539;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3539);
    }

    @Override // yyds.AbstractC0181
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final List mo662(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return this.f3538.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
