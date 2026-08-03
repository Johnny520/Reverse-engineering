package Yue;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nConscryptPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,141:1\n37#2,2:142\n*S KotlinDebug\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n*L\n89#1:142,2\n*E\n"})
public final class C4113 extends C6668 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0330 f8214;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean f8215;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Provider f8216;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۨ۠$ۥ */
    public static final class C0330 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۦۨ۠.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0330(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static /* synthetic */ boolean m1078(C0330 c0330, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                i2 = 0;
            }
            if ((i4 & 4) != 0) {
                i3 = 0;
            }
            return c0330.m1079(i, i2, i3);
        }

        /* JADX INFO: renamed from: ۥ */
        public final boolean m1079(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i2 ? version.minor() > i2 : version.patch() >= i3;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C4113 m11727() {
            C4335 c4335 = null;
            if (m11728()) {
                return new C4113(c4335);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m11728() {
            return C4113.f8215;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0330() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۨ۠$ۥ۟ */
    public static final class C0331 implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C0331 f680 = new C0331();

        /* JADX INFO: renamed from: ۥ */
        public final boolean m1080(@InterfaceC6489 String str, @InterfaceC6489 SSLSession sSLSession) {
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m1081(@InterfaceC6489 X509Certificate[] x509CertificateArr, @InterfaceC6489 String str, @InterfaceC6489 SSLSession sSLSession) {
            return true;
        }
    }

    static {
        C0330 c0330 = new C0330(null);
        f8214 = c0330;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, c0330.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (c0330.m1079(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f8215 = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۦۨ۠.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4113(C4335 c4335) {
        this();
    }

    @Override // Yue.C6668
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo6561(@InterfaceC6399 SSLSocket sSLSocket, @InterfaceC6489 String str, @InterfaceC6399 List<EnumC6835> list) {
        C5499.m17103(sSLSocket, "sslSocket");
        C5499.m17103(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo6561(sSLSocket, str, list);
        } else {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C6668.f2226.m3161(list).toArray(new String[0]));
        }
    }

    @Override // Yue.C6668
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public String mo6562(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo6562(sSLSocket);
    }

    @Override // Yue.C6668
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public SSLContext mo9578() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f8216);
        C5499.m17102(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // Yue.C6668
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public SSLSocketFactory mo11726(@InterfaceC6399 X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        C5499.m17103(x509TrustManager, "trustManager");
        SSLContext sSLContextMo9578 = mo9578();
        sSLContextMo9578.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContextMo9578.getSocketFactory();
        C5499.m17102(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // Yue.C6668
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public X509TrustManager mo9579() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C5499.m17100(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                C5499.m17101(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C0331.f680);
                return x509TrustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        C5499.m17102(string, "toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // Yue.C6668
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public X509TrustManager mo6564(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
        C5499.m17103(sSLSocketFactory, "sslSocketFactory");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4113() {
        Provider providerNewProvider = Conscrypt.newProvider();
        C5499.m17102(providerNewProvider, "newProvider()");
        this.f8216 = providerNewProvider;
    }
}
