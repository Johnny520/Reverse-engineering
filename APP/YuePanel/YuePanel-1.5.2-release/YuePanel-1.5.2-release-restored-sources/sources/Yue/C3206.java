package Yue;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7687
@InterfaceC7507({"SMAP\nAndroidCertificateChainCleaner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n37#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n*L\n43#1:75,2\n*E\n"})
public final class C3206 extends AbstractC3685 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0080 f4860 = new C0080(null);

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final X509TrustManager f130;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final X509TrustManagerExtensions f4861;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۤۦ$ۥ */
    public static final class C0080 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟۠ۤۦ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0080(C4335 c4335) {
            this();
        }

        @InterfaceC7687
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final C3206 m284(@InterfaceC6399 X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C5499.m17103(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C3206(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0080() {
        }
    }

    public C3206(@InterfaceC6399 X509TrustManager x509TrustManager, @InterfaceC6399 X509TrustManagerExtensions x509TrustManagerExtensions) {
        C5499.m17103(x509TrustManager, "trustManager");
        C5499.m17103(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f130 = x509TrustManager;
        this.f4861 = x509TrustManagerExtensions;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        return (obj instanceof C3206) && ((C3206) obj).f130 == this.f130;
    }

    public int hashCode() {
        return System.identityHashCode(this.f130);
    }

    @Override // Yue.AbstractC3685
    @InterfaceC6399
    @InterfaceC7687
    /* JADX INFO: renamed from: ۥ */
    public List<Certificate> mo283(@InterfaceC6399 List<? extends Certificate> list, @InterfaceC6399 String str) throws SSLPeerUnverifiedException {
        C5499.m17103(list, "chain");
        C5499.m17103(str, "hostname");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f4861.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            C5499.m17102(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
