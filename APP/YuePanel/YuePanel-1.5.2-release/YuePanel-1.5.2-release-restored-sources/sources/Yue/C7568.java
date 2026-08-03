package Yue;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7568 extends C3214 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1296 f22873 = new C1296(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public final Class<? super SSLSocketFactory> f22874;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final Class<?> f22875;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۨ$ۥ */
    public static final class C1296 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢ۟ۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1296(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static /* synthetic */ InterfaceC7490 m3735(C1296 c1296, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return c1296.m3736(str);
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final InterfaceC7490 m3736(@InterfaceC6399 String str) {
            C5499.m17103(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                C5499.m17101(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                C5499.m17101(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                C5499.m17102(cls3, "paramsClass");
                return new C7568(cls, cls2, cls3);
            } catch (Exception e) {
                C6668.f2226.m21321().m21315("unable to load android socket classes", 5, e);
                return null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1296() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7568(@InterfaceC6399 Class<? super SSLSocket> cls, @InterfaceC6399 Class<? super SSLSocketFactory> cls2, @InterfaceC6399 Class<?> cls3) {
        super(cls);
        C5499.m17103(cls, "sslSocketClass");
        C5499.m17103(cls2, "sslSocketFactoryClass");
        C5499.m17103(cls3, "paramClass");
        this.f22874 = cls2;
        this.f22875 = cls3;
    }

    @Override // Yue.C3214, Yue.InterfaceC7490
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ */
    public X509TrustManager mo6565(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) throws IllegalAccessException {
        C5499.m17103(sSLSocketFactory, "sslSocketFactory");
        Object objM26876 = C8158.m26876(sSLSocketFactory, this.f22875, "sslParameters");
        C5499.m17100(objM26876);
        X509TrustManager x509TrustManager = (X509TrustManager) C8158.m26876(objM26876, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (X509TrustManager) C8158.m26876(objM26876, X509TrustManager.class, "trustManager") : x509TrustManager;
    }

    @Override // Yue.C3214, Yue.InterfaceC7490
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo6566(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
        C5499.m17103(sSLSocketFactory, "sslSocketFactory");
        return this.f22874.isInstance(sSLSocketFactory);
    }
}
