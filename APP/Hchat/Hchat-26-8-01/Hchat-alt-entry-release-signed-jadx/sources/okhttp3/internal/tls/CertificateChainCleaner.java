package okhttp3.internal.tls;

import gg.AbstractC1411g;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.Platform;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CertificateChainCleaner {
    public static final Companion Companion = new Companion(null);

    public abstract List<Certificate> clean(List<? extends Certificate> list, String str);

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.tls.CertificateChainCleaner.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final CertificateChainCleaner get(X509Certificate... x509CertificateArr) {
            x509CertificateArr.getClass();
            return new BasicCertificateChainCleaner(new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)));
        }

        private Companion() {
        }

        public final CertificateChainCleaner get(X509TrustManager x509TrustManager) {
            x509TrustManager.getClass();
            return Platform.Companion.get().buildCertificateChainCleaner(x509TrustManager);
        }
    }
}
