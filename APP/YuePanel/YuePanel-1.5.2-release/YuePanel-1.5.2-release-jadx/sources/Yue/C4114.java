package Yue;

import Yue.C4362;
import Yue.InterfaceC7490;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nConscryptSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,64:1\n37#2,2:65\n*S KotlinDebug\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n*L\n51#1:65,2\n*E\n"})
public final class C4114 implements InterfaceC7490 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C0333 f681 = new C0333(null);

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C4362.InterfaceC0386 f682 = new C0332();

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۨۡ$ۥ */
    public static final class C0332 implements C4362.InterfaceC0386 {
        @Override // Yue.C4362.InterfaceC0386
        /* JADX INFO: renamed from: ۥ */
        public boolean mo297(@InterfaceC6399 SSLSocket sSLSocket) {
            C5499.m17103(sSLSocket, "sslSocket");
            return C4113.f8214.m11728() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // Yue.C4362.InterfaceC0386
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC7490 mo298(@InterfaceC6399 SSLSocket sSLSocket) {
            C5499.m17103(sSLSocket, "sslSocket");
            return new C4114();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۨۡ$ۥ۟ */
    public static final class C0333 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۦۨۡ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0333(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C4362.InterfaceC0386 m1082() {
            return C4114.f682;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0333() {
        }
    }

    @Override // Yue.InterfaceC7490
    public boolean isSupported() {
        return C4113.f8214.m11728();
    }

    @Override // Yue.InterfaceC7490
    /* JADX INFO: renamed from: ۥ */
    public boolean mo279(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // Yue.InterfaceC7490
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public String mo280(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        if (mo279(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
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
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C6668.f2226.m3161(list).toArray(new String[0]));
        }
    }
}
