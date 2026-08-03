package Yue;

import Yue.C7568;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7687
@InterfaceC7507({"SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1#3:167\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n52#1:164\n52#1:165,2\n*E\n"})
public final class C3212 extends C6668 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0081 f4864 = new C0081(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean f4865;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final List<InterfaceC7490> f4866;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3847 f4867;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۥۡ$ۥ */
    public static final class C0081 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟۠ۥۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0081(C4335 c4335) {
            this();
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final C6668 m291() {
            if (m292()) {
                return new C3212();
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m292() {
            return C3212.f4865;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0081() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۥۡ$ۥ۟ */
    public static final class C0082 implements InterfaceC8002 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final X509TrustManager f134;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public final Method f135;

        public C0082(@InterfaceC6399 X509TrustManager x509TrustManager, @InterfaceC6399 Method method) {
            C5499.m17103(x509TrustManager, "trustManager");
            C5499.m17103(method, "findByIssuerAndSignatureMethod");
            this.f134 = x509TrustManager;
            this.f135 = method;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ C0082 m6578(C0082 c0082, X509TrustManager x509TrustManager, Method method, int i, Object obj) {
            if ((i & 1) != 0) {
                x509TrustManager = c0082.f134;
            }
            if ((i & 2) != 0) {
                method = c0082.f135;
            }
            return c0082.m6580(x509TrustManager, method);
        }

        public boolean equals(@InterfaceC6489 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0082)) {
                return false;
            }
            C0082 c0082 = (C0082) obj;
            return C5499.m17094(this.f134, c0082.f134) && C5499.m17094(this.f135, c0082.f135);
        }

        public int hashCode() {
            return (this.f134.hashCode() * 31) + this.f135.hashCode();
        }

        @InterfaceC6399
        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f134 + ", findByIssuerAndSignatureMethod=" + this.f135 + ')';
        }

        @Override // Yue.InterfaceC8002
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public X509Certificate mo293(@InterfaceC6399 X509Certificate x509Certificate) {
            C5499.m17103(x509Certificate, "cert");
            try {
                Object objInvoke = this.f135.invoke(this.f134, x509Certificate);
                C5499.m17101(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final X509TrustManager m294() {
            return this.f134;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Method m6579() {
            return this.f135;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C0082 m6580(@InterfaceC6399 X509TrustManager x509TrustManager, @InterfaceC6399 Method method) {
            C5499.m17103(x509TrustManager, "trustManager");
            C5499.m17103(method, "findByIssuerAndSignatureMethod");
            return new C0082(x509TrustManager, method);
        }
    }

    static {
        boolean z = false;
        if (C6668.f2226.m21322() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f4865 = z;
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۢ۟ۨ.ۥ.ۥ۟(Yue.ۥۢ۟ۨ$ۥ, java.lang.String, int, java.lang.Object):Yue.ۥۢ۟ۢۢ */
    public C3212() {
        List listM10744 = C3880.m10744(C7568.C1296.m3735(C7568.f22873, null, 1, null), new C4362(C3214.f4944.m6583()), new C4362(C4114.f681.m1082()), new C4362(C3589.f400.m635()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM10744) {
            if (((InterfaceC7490) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f4866 = arrayList;
        this.f4867 = C3847.f7343.m903();
    }

    @Override // Yue.C6668
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public AbstractC3685 mo6560(@InterfaceC6399 X509TrustManager x509TrustManager) {
        C5499.m17103(x509TrustManager, "trustManager");
        C3206 c3206M284 = C3206.f4860.m284(x509TrustManager);
        return c3206M284 != null ? c3206M284 : super.mo6560(x509TrustManager);
    }

    @Override // Yue.C6668
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InterfaceC8002 mo6574(@InterfaceC6399 X509TrustManager x509TrustManager) {
        C5499.m17103(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            C5499.m17102(declaredMethod, "method");
            return new C0082(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo6574(x509TrustManager);
        }
    }

    @Override // Yue.C6668
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo6561(@InterfaceC6399 SSLSocket sSLSocket, @InterfaceC6489 String str, @InterfaceC6399 List<EnumC6835> list) {
        Object next;
        C5499.m17103(sSLSocket, "sslSocket");
        C5499.m17103(list, "protocols");
        Iterator<T> it = this.f4866.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC7490) next).mo279(sSLSocket)) {
                    break;
                }
            }
        }
        InterfaceC7490 interfaceC7490 = (InterfaceC7490) next;
        if (interfaceC7490 != null) {
            interfaceC7490.mo6567(sSLSocket, str, list);
        }
    }

    @Override // Yue.C6668
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo6575(@InterfaceC6399 Socket socket, @InterfaceC6399 InetSocketAddress inetSocketAddress, int i) throws IOException {
        C5499.m17103(socket, "socket");
        C5499.m17103(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // Yue.C6668
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public String mo6562(@InterfaceC6399 SSLSocket sSLSocket) {
        Object next;
        C5499.m17103(sSLSocket, "sslSocket");
        Iterator<T> it = this.f4866.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC7490) next).mo279(sSLSocket)) {
                break;
            }
        }
        InterfaceC7490 interfaceC7490 = (InterfaceC7490) next;
        if (interfaceC7490 != null) {
            return interfaceC7490.mo280(sSLSocket);
        }
        return null;
    }

    @Override // Yue.C6668
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Object mo6576(@InterfaceC6399 String str) {
        C5499.m17103(str, "closer");
        return this.f4867.m901(str);
    }

    @Override // Yue.C6668
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo6563(@InterfaceC6399 String str) {
        C5499.m17103(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // Yue.C6668
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void mo6577(@InterfaceC6399 String str, @InterfaceC6489 Object obj) {
        C5499.m17103(str, "message");
        if (this.f4867.m902(obj)) {
            return;
        }
        C6668.m21313(this, str, 5, null, 4, null);
    }

    @Override // Yue.C6668
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public X509TrustManager mo6564(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
        Object next;
        C5499.m17103(sSLSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f4866.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC7490) next).mo6566(sSLSocketFactory)) {
                break;
            }
        }
        InterfaceC7490 interfaceC7490 = (InterfaceC7490) next;
        if (interfaceC7490 != null) {
            return interfaceC7490.mo6565(sSLSocketFactory);
        }
        return null;
    }
}
