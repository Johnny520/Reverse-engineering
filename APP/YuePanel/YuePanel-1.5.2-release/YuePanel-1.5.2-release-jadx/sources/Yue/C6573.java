package Yue;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nOpenJSSEPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenJSSEPlatform.kt\nokhttp3/internal/platform/OpenJSSEPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n37#2,2:102\n*S KotlinDebug\n*F\n+ 1 OpenJSSEPlatform.kt\nokhttp3/internal/platform/OpenJSSEPlatform\n*L\n68#1:102,2\n*E\n"})
public final class C6573 extends C6668 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1015 f16876;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean f16877;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Provider f16878;

    /* JADX INFO: renamed from: Yue.ۥۣۣۡۧ$ۥ */
    public static final class C1015 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۣۡۧ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1015(C4335 c4335) {
            this();
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final C6573 m3031() {
            C4335 c4335 = null;
            if (m3032()) {
                return new C6573(c4335);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m3032() {
            return C6573.f16877;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1015() {
        }
    }

    static {
        C1015 c1015 = new C1015(null);
        f16876 = c1015;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, c1015.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f16877 = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۣۡۧ.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C6573(C4335 c4335) {
        this();
    }

    @Override // Yue.C6668
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo6561(@InterfaceC6399 SSLSocket sSLSocket, @InterfaceC6489 String str, @InterfaceC6399 List<EnumC6835> list) {
        C5499.m17103(sSLSocket, "sslSocket");
        C5499.m17103(list, "protocols");
        super.mo6561(sSLSocket, str, list);
    }

    @Override // Yue.C6668
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public String mo6562(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        return super.mo6562(sSLSocket);
    }

    @Override // Yue.C6668
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public SSLContext mo9578() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f16878);
        C5499.m17102(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // Yue.C6668
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public X509TrustManager mo9579() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f16878);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C5499.m17100(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                C5499.m17101(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
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
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6573() {
        this.f16878 = new OpenJSSE();
    }
}
