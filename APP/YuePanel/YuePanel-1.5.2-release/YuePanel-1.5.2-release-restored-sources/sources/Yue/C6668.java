package Yue;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: Yue.ۥۡۤۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6668 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C1054 f2226;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static volatile C6668 f2227 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f17135 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f17136 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Logger f17137;

    /* JADX INFO: renamed from: Yue.ۥۡۤۡۢ$ۥ */
    @InterfaceC7507({"SMAP\nPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n766#2:287\n857#2,2:288\n1549#2:290\n1620#2,3:291\n*S KotlinDebug\n*F\n+ 1 Platform.kt\nokhttp3/internal/platform/Platform$Companion\n*L\n193#1:287\n193#1:288,2\n193#1:290\n193#1:291,3\n*E\n"})
    public static final class C1054 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۤۡۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1054(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static /* synthetic */ void m21316(C1054 c1054, C6668 c6668, int i, Object obj) {
            if ((i & 1) != 0) {
                c6668 = c1054.m21320();
            }
            c1054.m21326(c6668);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final List<String> m3161(@InterfaceC6399 List<? extends EnumC6835> list) {
            C5499.m17103(list, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((EnumC6835) obj) != EnumC6835.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C3881.m10756(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((EnumC6835) it.next()).toString());
            }
            return arrayList2;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final byte[] m21317(@InterfaceC6399 List<? extends EnumC6835> list) {
            C5499.m17103(list, "protocols");
            C3600 c3600 = new C3600();
            for (String str : m3161(list)) {
                c3600.writeByte(str.length());
                c3600.mo9638(str);
            }
            return c3600.mo9618();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C6668 m21318() {
            C3209.f131.m288();
            C6668 c6668M275 = C3202.f4857.m275();
            if (c6668M275 != null) {
                return c6668M275;
            }
            C6668 c6668M291 = C3212.f4864.m291();
            C5499.m17100(c6668M291);
            return c6668M291;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C6668 m21319() {
            C6573 c6573M3031;
            C3588 c3588M633;
            C4113 c4113M11727;
            if (m21324() && (c4113M11727 = C4113.f8214.m11727()) != null) {
                return c4113M11727;
            }
            if (m21323() && (c3588M633 = C3588.f6174.m633()) != null) {
                return c3588M633;
            }
            if (m21325() && (c6573M3031 = C6573.f16876.m3031()) != null) {
                return c6573M3031;
            }
            C5527 c5527M2273 = C5527.f13505.m2273();
            if (c5527M2273 != null) {
                return c5527M2273;
            }
            C6668 c6668M2270 = C5524.f13498.m2270();
            return c6668M2270 != null ? c6668M2270 : new C6668();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C6668 m21320() {
            return m21322() ? m21318() : m21319();
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final C6668 m21321() {
            return C6668.f2227;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final boolean m21322() {
            return C5499.m17094("Dalvik", System.getProperty("java.vm.name"));
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final boolean m21323() {
            return C5499.m17094("BC", Security.getProviders()[0].getName());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final boolean m21324() {
            return C5499.m17094("Conscrypt", Security.getProviders()[0].getName());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final boolean m21325() {
            return C5499.m17094("OpenJSSE", Security.getProviders()[0].getName());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m21326(@InterfaceC6399 C6668 c6668) {
            C5499.m17103(c6668, "platform");
            C6668.f2227 = c6668;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1054() {
        }
    }

    static {
        C1054 c1054 = new C1054(null);
        f2226 = c1054;
        f2227 = c1054.m21320();
        f17137 = Logger.getLogger(C6504.class.getName());
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final C6668 m21312() {
        return f2226.m21321();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m21313(C6668 c6668, String str, int i, Throwable th, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            th = null;
        }
        c6668.m21315(str, i, th);
    }

    @InterfaceC6399
    public String toString() {
        String simpleName = getClass().getSimpleName();
        C5499.m17102(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo17153(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public AbstractC3685 mo6560(@InterfaceC6399 X509TrustManager x509TrustManager) {
        C5499.m17103(x509TrustManager, "trustManager");
        return new C3522(mo6574(x509TrustManager));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public InterfaceC8002 mo6574(@InterfaceC6399 X509TrustManager x509TrustManager) {
        C5499.m17103(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C5499.m17102(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C3527((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo6561(@InterfaceC6399 SSLSocket sSLSocket, @InterfaceC6489 String str, @InterfaceC6399 List<EnumC6835> list) {
        C5499.m17103(sSLSocket, "sslSocket");
        C5499.m17103(list, "protocols");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo6575(@InterfaceC6399 Socket socket, @InterfaceC6399 InetSocketAddress inetSocketAddress, int i) throws IOException {
        C5499.m17103(socket, "socket");
        C5499.m17103(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final String m21314() {
        return "OkHttp";
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public String mo6562(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public Object mo6576(@InterfaceC6399 String str) {
        C5499.m17103(str, "closer");
        if (f17137.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo6563(@InterfaceC6399 String str) {
        C5499.m17103(str, "hostname");
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m21315(@InterfaceC6399 String str, int i, @InterfaceC6489 Throwable th) {
        C5499.m17103(str, "message");
        f17137.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo6577(@InterfaceC6399 String str, @InterfaceC6489 Object obj) {
        C5499.m17103(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m21315(str, 5, (Throwable) obj);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public SSLContext mo9578() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        C5499.m17102(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public SSLSocketFactory mo11726(@InterfaceC6399 X509TrustManager x509TrustManager) {
        C5499.m17103(x509TrustManager, "trustManager");
        try {
            SSLContext sSLContextMo9578 = mo9578();
            sSLContextMo9578.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo9578.getSocketFactory();
            C5499.m17102(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public X509TrustManager mo9579() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public X509TrustManager mo6564(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
        C5499.m17103(sSLSocketFactory, "sslSocketFactory");
        try {
            Class<?> cls = Class.forName("sun.security.ssl.SSLContextImpl");
            C5499.m17102(cls, "sslContextClass");
            Object objM26876 = C8158.m26876(sSLSocketFactory, cls, "context");
            if (objM26876 == null) {
                return null;
            }
            return (X509TrustManager) C8158.m26876(objM26876, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e) {
            if (C5499.m17094(e.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                return null;
            }
            throw e;
        }
    }
}
