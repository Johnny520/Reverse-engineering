package p000;

import android.net.http.X509TrustManagerExtensions;
import com.bumptech.glide.AbstractC3056;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: 飘花落叶言世兰哲子楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6081 extends AbstractC3056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final X509TrustManager f16633;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final X509TrustManagerExtensions f16634;

    public C6081(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f16633 = x509TrustManager;
        this.f16634 = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6081) && ((C6081) obj).f16633 == this.f16633;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f16633);
    }

    @Override // com.bumptech.glide.AbstractC3056
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo6718(String str, List list) throws SSLPeerUnverifiedException {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> listCheckServerTrusted = this.f16634.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            listCheckServerTrusted.getClass();
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
