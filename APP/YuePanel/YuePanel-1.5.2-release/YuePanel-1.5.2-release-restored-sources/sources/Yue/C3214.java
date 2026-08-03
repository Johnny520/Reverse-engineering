package Yue;

import Yue.C4362;
import Yue.InterfaceC7490;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3214 implements InterfaceC7490 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0083 f4944;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C4362.InterfaceC0386 f4945;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final Class<? super SSLSocket> f138;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final Method f139;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Method f4946;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Method f4947;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Method f4948;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۥۣ$ۥ */
    public static final class C0083 {

        /* JADX INFO: renamed from: Yue.ۥ۟۠ۥۣ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C3215 implements C4362.InterfaceC0386 {

            /* JADX INFO: renamed from: ۥ */
            public final /* synthetic */ String f140;

            public C3215(String str) {
                this.f140 = str;
            }

            @Override // Yue.C4362.InterfaceC0386
            /* JADX INFO: renamed from: ۥ */
            public boolean mo297(@InterfaceC6399 SSLSocket sSLSocket) {
                C5499.m17103(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                C5499.m17102(name, "sslSocket.javaClass.name");
                return C7627.m24008(name, this.f140 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, false, 2, null);
            }

            @Override // Yue.C4362.InterfaceC0386
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟ */
            public InterfaceC7490 mo298(@InterfaceC6399 SSLSocket sSLSocket) {
                C5499.m17103(sSLSocket, "sslSocket");
                return C3214.f4944.m296(sSLSocket.getClass());
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟۠ۥۣ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0083(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final C3214 m296(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> superclass = cls;
            while (superclass != null && !C5499.m17094(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            C5499.m17100(superclass);
            return new C3214(superclass);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C4362.InterfaceC0386 m6582(@InterfaceC6399 String str) {
            C5499.m17103(str, "packageName");
            return new C3215(str);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C4362.InterfaceC0386 m6583() {
            return C3214.f4945;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0083() {
        }
    }

    static {
        C0083 c0083 = new C0083(null);
        f4944 = c0083;
        f4945 = c0083.m6582("com.google.android.gms.org.conscrypt");
    }

    public C3214(@InterfaceC6399 Class<? super SSLSocket> cls) throws NoSuchMethodException {
        C5499.m17103(cls, "sslSocketClass");
        this.f138 = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        C5499.m17102(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f139 = declaredMethod;
        this.f4946 = cls.getMethod("setHostname", String.class);
        this.f4947 = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f4948 = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // Yue.InterfaceC7490
    public boolean isSupported() {
        return C3212.f4864.m292();
    }

    @Override // Yue.InterfaceC7490
    /* JADX INFO: renamed from: ۥ */
    public boolean mo279(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        return this.f138.isInstance(sSLSocket);
    }

    @Override // Yue.InterfaceC7490
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public String mo280(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        if (!mo279(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f4947.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, C3794.f505);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && C5499.m17094(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
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
            try {
                this.f139.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f4946.invoke(sSLSocket, str);
                }
                this.f4948.invoke(sSLSocket, C6668.f2226.m21317(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
