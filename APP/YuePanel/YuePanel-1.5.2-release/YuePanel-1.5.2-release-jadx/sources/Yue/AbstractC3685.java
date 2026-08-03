package Yue;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3685 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C0222 f458 = new C0222(null);

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۟ۦ$ۥ */
    public static final class C0222 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۤ۟ۦ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0222(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final AbstractC3685 m753(@InterfaceC6399 X509TrustManager x509TrustManager) {
            C5499.m17103(x509TrustManager, "trustManager");
            return C6668.f2226.m21321().mo6560(x509TrustManager);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final AbstractC3685 m754(@InterfaceC6399 X509Certificate... x509CertificateArr) {
            C5499.m17103(x509CertificateArr, "caCerts");
            return new C3522(new C3527((X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0222() {
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public abstract List<Certificate> mo283(@InterfaceC6399 List<? extends Certificate> list, @InterfaceC6399 String str) throws SSLPeerUnverifiedException;
}
