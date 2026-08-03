package Yue;

import Yue.InterfaceC7490;
import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7687
@SuppressLint({"NewApi"})
@InterfaceC7507({"SMAP\nAndroid10SocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,77:1\n37#2,2:78\n*S KotlinDebug\n*F\n+ 1 Android10SocketAdapter.kt\nokhttp3/internal/platform/android/Android10SocketAdapter\n*L\n60#1:78,2\n*E\n"})
public final class C3205 implements InterfaceC7490 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C0079 f129 = new C0079(null);

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۤۥ$ۥ */
    @InterfaceC7687
    public static final class C0079 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟۠ۤۥ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0079(C4335 c4335) {
            this();
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final InterfaceC7490 m281() {
            if (m282()) {
                return new C3205();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m282() {
            return C6668.f2226.m21322() && Build.VERSION.SDK_INT >= 29;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0079() {
        }
    }

    @Override // Yue.InterfaceC7490
    public boolean isSupported() {
        return f129.m282();
    }

    @Override // Yue.InterfaceC7490
    /* JADX INFO: renamed from: ۥ */
    public boolean mo279(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // Yue.InterfaceC7490
    @InterfaceC6489
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟ */
    public String mo280(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : C5499.m17094(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // Yue.InterfaceC7490
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public X509TrustManager mo6565(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
        return InterfaceC7490.C1277.m3684(this, sSLSocketFactory);
    }

    @Override // Yue.InterfaceC7490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo6566(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
        return InterfaceC7490.C1277.m3683(this, sSLSocketFactory);
    }

    @Override // Yue.InterfaceC7490
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo6567(@InterfaceC6399 SSLSocket sSLSocket, @InterfaceC6489 String str, @InterfaceC6399 List<? extends EnumC6835> list) throws IOException {
        C5499.m17103(sSLSocket, "sslSocket");
        C5499.m17103(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C6668.f2226.m3161(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
