package Yue;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nJdk9Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,89:1\n37#2,2:90\n*S KotlinDebug\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n*L\n36#1:90,2\n*E\n"})
public class C5527 extends C6668 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0787 f13505 = new C0787(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean f13506;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦ۟۟$ۥ */
    public static final class C0787 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۦ۟۟.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0787(C4335 c4335) {
            this();
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final C5527 m2273() {
            if (m2274()) {
                return new C5527();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m2274() {
            return C5527.f13506;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0787() {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numM23935 = property != null ? C7626.m23935(property) : null;
        boolean z = false;
        if (numM23935 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numM23935.intValue() >= 9) {
            z = true;
        }
        f13506 = z;
    }

    @Override // Yue.C6668
    @InterfaceC7687
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo6561(@InterfaceC6399 SSLSocket sSLSocket, @InterfaceC6489 String str, @InterfaceC6399 List<EnumC6835> list) {
        C5499.m17103(sSLSocket, "sslSocket");
        C5499.m17103(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) C6668.f2226.m3161(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // Yue.C6668
    @InterfaceC7687
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public String mo6562(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : C5499.m17094(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // Yue.C6668
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public X509TrustManager mo6564(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
        C5499.m17103(sSLSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
}
