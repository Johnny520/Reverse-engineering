package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface SocketAdapter {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class DefaultImpls {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static boolean matchesSocketFactory(SocketAdapter socketAdapter, SSLSocketFactory sSLSocketFactory) {
            sSLSocketFactory.getClass();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static X509TrustManager trustManager(SocketAdapter socketAdapter, SSLSocketFactory sSLSocketFactory) {
            sSLSocketFactory.getClass();
            return null;
        }
    }

    void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list);

    String getSelectedProtocol(SSLSocket sSLSocket);

    boolean isSupported();

    boolean matchesSocket(SSLSocket sSLSocket);

    boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory);

    X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory);
}
