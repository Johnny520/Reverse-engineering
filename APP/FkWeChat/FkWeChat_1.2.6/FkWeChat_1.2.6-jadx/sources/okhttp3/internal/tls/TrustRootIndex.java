package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005À\u0006\u0003"}, m16758d2 = {"Lokhttp3/internal/tls/TrustRootIndex;", _UrlKt.FRAGMENT_ENCODE_SET, "findByIssuerAndSignature", "Ljava/security/cert/X509Certificate;", "cert", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public interface TrustRootIndex {
    X509Certificate findByIssuerAndSignature(X509Certificate cert);
}
