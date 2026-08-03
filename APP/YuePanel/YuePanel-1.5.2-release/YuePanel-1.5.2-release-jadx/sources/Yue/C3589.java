package Yue;

import Yue.C4362;
import Yue.InterfaceC7490;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nBouncyCastleSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,68:1\n37#2,2:69\n*S KotlinDebug\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n*L\n53#1:69,2\n*E\n"})
public final class C3589 implements InterfaceC7490 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C0186 f400 = new C0186(null);

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C4362.InterfaceC0386 f401 = new C0185();

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢ$ۥ */
    public static final class C0185 implements C4362.InterfaceC0386 {
        @Override // Yue.C4362.InterfaceC0386
        /* JADX INFO: renamed from: ۥ */
        public boolean mo297(@InterfaceC6399 SSLSocket sSLSocket) {
            C5499.m17103(sSLSocket, "sslSocket");
            C3588.f6174.m634();
            return false;
        }

        @Override // Yue.C4362.InterfaceC0386
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC7490 mo298(@InterfaceC6399 SSLSocket sSLSocket) {
            C5499.m17103(sSLSocket, "sslSocket");
            return new C3589();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢ$ۥ۟ */
    public static final class C0186 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟ۢ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0186(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C4362.InterfaceC0386 m635() {
            return C3589.f401;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0186() {
        }
    }

    @Override // Yue.InterfaceC7490
    public boolean isSupported() {
        return C3588.f6174.m634();
    }

    @Override // Yue.InterfaceC7490
    /* JADX INFO: renamed from: ۥ */
    public boolean mo279(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        return false;
    }

    @Override // Yue.InterfaceC7490
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public String mo280(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : C5499.m17094(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // Yue.InterfaceC7490
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ */
    public X509TrustManager mo6565(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
        return InterfaceC7490.C1277.m3684(this, sSLSocketFactory);
    }

    @Override // Yue.InterfaceC7490
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo6566(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
        return InterfaceC7490.C1277.m3683(this, sSLSocketFactory);
    }

    @Override // Yue.InterfaceC7490
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo6567(@InterfaceC6399 SSLSocket sSLSocket, @InterfaceC6489 String str, @InterfaceC6399 List<? extends EnumC6835> list) {
        C5499.m17103(sSLSocket, "sslSocket");
        C5499.m17103(list, "protocols");
        if (mo279(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) C6668.f2226.m3161(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
