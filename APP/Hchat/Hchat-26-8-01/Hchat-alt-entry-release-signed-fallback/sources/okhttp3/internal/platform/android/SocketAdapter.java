package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface SocketAdapter {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class DefaultImpls {
        public static boolean matchesSocketFactory(okhttp3.internal.platform.android.SocketAdapter r0, javax.net.ssl.SSLSocketFactory r1) {
                r1.getClass()
                r0 = 0
                return r0
        }

        public static javax.net.ssl.X509TrustManager trustManager(okhttp3.internal.platform.android.SocketAdapter r0, javax.net.ssl.SSLSocketFactory r1) {
                r1.getClass()
                r0 = 0
                return r0
        }
    }

    void configureTlsExtensions(javax.net.ssl.SSLSocket r1, java.lang.String r2, java.util.List<? extends okhttp3.Protocol> r3);

    java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r1);

    boolean isSupported();

    boolean matchesSocket(javax.net.ssl.SSLSocket r1);

    boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory r1);

    javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r1);
}
