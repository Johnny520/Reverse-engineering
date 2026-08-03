package okhttp3.internal.platform.android;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import p136j8.C2104o;
import p218og.AbstractC3137a;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class AndroidSocketAdapter implements SocketAdapter {
    public static final Companion Companion;
    private static final DeferredSocketAdapter.Factory playProviderFactory;
    private final Method getAlpnSelectedProtocol;
    private final Method setAlpnProtocols;
    private final Method setHostname;
    private final Method setUseSessionTickets;
    private final Class<? super SSLSocket> sslSocketClass;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Companion companion = new Companion(null);
        Companion = companion;
        playProviderFactory = companion.factory("com.google.android.gms.org.conscrypt");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AndroidSocketAdapter(Class<? super SSLSocket> cls) throws NoSuchMethodException {
        cls.getClass();
        this.sslSocketClass = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = cls.getMethod("setHostname", String.class);
        this.getAlpnSelectedProtocol = cls.getMethod("getAlpnSelectedProtocol", null);
        this.setAlpnProtocols = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        sSLSocket.getClass();
        list.getClass();
        if (matchesSocket(sSLSocket)) {
            try {
                this.setUseSessionTickets.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.setHostname.invoke(sSLSocket, str);
                }
                this.setAlpnProtocols.invoke(sSLSocket, Platform.Companion.concatLengthPrefixed(list));
            } catch (IllegalAccessException e6) {
                C2104o.m5281f(e6);
            } catch (InvocationTargetException e7) {
                C2104o.m5281f(e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.platform.android.SocketAdapter
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        sSLSocket.getClass();
        if (!matchesSocket(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, AbstractC3137a.f10177a);
            }
            return null;
        } catch (IllegalAccessException e6) {
            C2104o.m5281f(e6);
            return null;
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if ((cause instanceof NullPointerException) && AbstractC1416l.m3825a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            C2104o.m5281f(e7);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
        return AndroidPlatform.Companion.isSupported();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(SSLSocket sSLSocket) {
        sSLSocket.getClass();
        return this.sslSocketClass.isInstance(sSLSocket);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.matchesSocketFactory(this, sSLSocketFactory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.platform.android.SocketAdapter
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return SocketAdapter.DefaultImpls.trustManager(this, sSLSocketFactory);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.platform.android.AndroidSocketAdapter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidSocketAdapter build(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> superclass = cls;
            while (superclass != null && !superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    C2104o.m5281f(AbstractC3199a.m6838k(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                    return null;
                }
            }
            superclass.getClass();
            return new AndroidSocketAdapter(superclass);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DeferredSocketAdapter.Factory factory(final String str) {
            str.getClass();
            return new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public SocketAdapter create(SSLSocket sSLSocket) {
                    sSLSocket.getClass();
                    return AndroidSocketAdapter.Companion.build(sSLSocket.getClass());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
                public boolean matchesSocket(SSLSocket sSLSocket) {
                    sSLSocket.getClass();
                    return AbstractC3156t.m6740d0(sSLSocket.getClass().getName(), str + '.', false);
                }
            };
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final DeferredSocketAdapter.Factory getPlayProviderFactory() {
            return AndroidSocketAdapter.playProviderFactory;
        }

        private Companion() {
        }
    }
}
