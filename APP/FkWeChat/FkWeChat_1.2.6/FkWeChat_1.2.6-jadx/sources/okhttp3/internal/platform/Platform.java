package okhttp3.internal.platform;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.C5753h;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p215oc.C5725t;
import p376zd.C9995i;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 @2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010&\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J-\u0010,\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020$2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0004\u0018\u00010\u00012\u0006\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020:2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0004H\u0016¢\u0006\u0004\b?\u0010\u0006¨\u0006A"}, m16758d2 = {"Lokhttp3/internal/platform/Platform;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "getPrefix", "()Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "protocols", "Ll8/i0;", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "afterHandshake", "(Ljavax/net/ssl/SSLSocket;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "getHandshakeServerNames", "(Ljavax/net/ssl/SSLSocket;)Ljava/util/List;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", _UrlKt.FRAGMENT_ENCODE_SET, "connectTimeout", "connectSocket", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "message", "level", _UrlKt.FRAGMENT_ENCODE_SET, "t", "log", "(Ljava/lang/String;ILjava/lang/Throwable;)V", _UrlKt.FRAGMENT_ENCODE_SET, "isCleartextTrafficPermitted", "(Ljava/lang/String;)Z", "closer", "getStackTraceForCloseable", "(Ljava/lang/String;)Ljava/lang/Object;", "stackTrace", "logCloseableLeak", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;", "newSslSocketFactory", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "toString", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public class Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger;
    private static volatile Platform platform;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        platform = companion.findPlatform();
        logger = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static final Platform get() {
        return INSTANCE.get();
    }

    public static /* synthetic */ void log$default(Platform platform2, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: log");
            return;
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th = null;
        }
        platform2.log(str, i10, th);
    }

    public void afterHandshake(SSLSocket sslSocket) {
        sslSocket.getClass();
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager trustManager) {
        trustManager.getClass();
        return new BasicCertificateChainCleaner(buildTrustRootIndex(trustManager));
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager trustManager) {
        trustManager.getClass();
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<Protocol> protocols) {
        sslSocket.getClass();
        protocols.getClass();
    }

    public void connectSocket(Socket socket, InetSocketAddress address, int connectTimeout) throws IOException {
        socket.getClass();
        address.getClass();
        socket.connect(address, connectTimeout);
    }

    public List<String> getHandshakeServerNames(SSLSocket sslSocket) {
        sslSocket.getClass();
        SSLSession session = sslSocket.getSession();
        ExtendedSSLSession extendedSSLSession = session instanceof ExtendedSSLSession ? (ExtendedSSLSession) session : null;
        if (extendedSSLSession == null) {
            return AbstractC5114x.m20800o();
        }
        try {
            List<SNIServerName> requestedServerNames = extendedSSLSession.getRequestedServerNames();
            requestedServerNames.getClass();
            ArrayList arrayList = new ArrayList();
            for (SNIServerName sNIServerName : requestedServerNames) {
                SNIHostName sNIHostName = sNIServerName instanceof SNIHostName ? (SNIHostName) sNIServerName : null;
                String asciiName = sNIHostName != null ? sNIHostName.getAsciiName() : null;
                if (asciiName != null) {
                    arrayList.add(asciiName);
                }
            }
            return arrayList;
        } catch (UnsupportedOperationException unused) {
            return AbstractC5114x.m20800o();
        }
    }

    public final String getPrefix() {
        return "OkHttp";
    }

    public String getSelectedProtocol(SSLSocket sslSocket) {
        sslSocket.getClass();
        return null;
    }

    public Object getStackTraceForCloseable(String closer) {
        closer.getClass();
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(String hostname) {
        hostname.getClass();
        return true;
    }

    public void log(String message, int level, Throwable t10) {
        message.getClass();
        logger.log(level == 5 ? Level.WARNING : Level.INFO, message, t10);
    }

    public void logCloseableLeak(String message, Object stackTrace) {
        message.getClass();
        if (stackTrace == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        log(message, 5, (Throwable) stackTrace);
    }

    public SSLContext newSSLContext() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    public SSLSocketFactory newSslSocketFactory(X509TrustManager trustManager) {
        trustManager.getClass();
        try {
            SSLContext sSLContextNewSSLContext = newSSLContext();
            sSLContextNewSSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextNewSSLContext.getSocketFactory();
            socketFactory.getClass();
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager platformTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        trustManagers.getClass();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                trustManager.getClass();
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        string.getClass();
        C5753h.m23254a("Unexpected default trust managers: ", string);
        return null;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
        sslSocketFactory.getClass();
        try {
            Object fieldOrNull = _UtilJvmKt.readFieldOrNull(sslSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (fieldOrNull == null) {
                return null;
            }
            return (X509TrustManager) _UtilJvmKt.readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e10) {
            if (!AbstractC1061t.m3842c(e10.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw e10;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m16758d2 = {"Lokhttp3/internal/platform/Platform$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lokhttp3/internal/platform/Platform;", "findPlatform", "()Lokhttp3/internal/platform/Platform;", "get", "platform", "Ll8/i0;", "resetForTests", "(Lokhttp3/internal/platform/Platform;)V", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Protocol;", "protocols", _UrlKt.FRAGMENT_ENCODE_SET, "alpnProtocolNames", "(Ljava/util/List;)Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "concatLengthPrefixed", "(Ljava/util/List;)[B", _UrlKt.FRAGMENT_ENCODE_SET, "isAndroid", "()Z", "Lokhttp3/internal/platform/Platform;", _UrlKt.FRAGMENT_ENCODE_SET, "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Platform findPlatform() {
            return PlatformRegistry.INSTANCE.findPlatform();
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
        }

        public final List<String> alpnProtocolNames(List<? extends Protocol> protocols) {
            protocols.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).getProtocol());
            }
            return arrayList2;
        }

        public final byte[] concatLengthPrefixed(List<? extends Protocol> protocols) {
            protocols.getClass();
            C9995i c9995i = new C9995i();
            for (String str : alpnProtocolNames(protocols)) {
                c9995i.writeByte(str.length());
                c9995i.mo38698a0(str);
            }
            return c9995i.mo38672C();
        }

        public final Platform get() {
            return Platform.platform;
        }

        public final boolean isAndroid() {
            return PlatformRegistry.INSTANCE.isAndroid();
        }

        public final void resetForTests(Platform platform) {
            platform.getClass();
            Platform.platform = platform;
            PublicSuffixDatabase.INSTANCE.resetForTests$okhttp();
        }

        private Companion() {
        }
    }
}
