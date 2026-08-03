package Yue;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7490 {

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۢۢ$ۥ */
    public static final class C1277 {
        /* JADX INFO: renamed from: ۥ */
        public static boolean m3683(@InterfaceC6399 InterfaceC7490 interfaceC7490, @InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
            C5499.m17103(sSLSocketFactory, "sslSocketFactory");
            return false;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟ */
        public static X509TrustManager m3684(@InterfaceC6399 InterfaceC7490 interfaceC7490, @InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
            C5499.m17103(sSLSocketFactory, "sslSocketFactory");
            return null;
        }
    }

    boolean isSupported();

    /* JADX INFO: renamed from: ۥ */
    boolean mo279(@InterfaceC6399 SSLSocket sSLSocket);

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    String mo280(@InterfaceC6399 SSLSocket sSLSocket);

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ */
    X509TrustManager mo6565(@InterfaceC6399 SSLSocketFactory sSLSocketFactory);

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    boolean mo6566(@InterfaceC6399 SSLSocketFactory sSLSocketFactory);

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    void mo6567(@InterfaceC6399 SSLSocket sSLSocket, @InterfaceC6489 String str, @InterfaceC6399 List<? extends EnumC6835> list);
}
