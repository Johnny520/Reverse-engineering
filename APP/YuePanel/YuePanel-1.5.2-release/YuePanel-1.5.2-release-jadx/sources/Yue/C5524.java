package Yue;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5524 extends C6668 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0786 f13498 = new C0786(null);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Method f13499;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final Method f13500;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public final Method f13501;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final Class<?> f13502;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final Class<?> f13503;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۨۨ$ۥ */
    public static final class C0785 implements InvocationHandler {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final List<String> f1553;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f1554;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public String f13504;

        public C0785(@InterfaceC6399 List<String> list) {
            C5499.m17103(list, "protocols");
            this.f1553 = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        @InterfaceC6489
        public Object invoke(@InterfaceC6399 Object obj, @InterfaceC6399 Method method, @InterfaceC6489 Object[] objArr) throws Throwable {
            C5499.m17103(obj, "proxy");
            C5499.m17103(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C5499.m17094(name, "supports") && C5499.m17094(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (C5499.m17094(name, "unsupported") && C5499.m17094(Void.TYPE, returnType)) {
                this.f1554 = true;
                return null;
            }
            if (C5499.m17094(name, "protocols") && objArr.length == 0) {
                return this.f1553;
            }
            if ((C5499.m17094(name, "selectProtocol") || C5499.m17094(name, "select")) && C5499.m17094(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    C5499.m17101(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            C5499.m17101(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!this.f1553.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.f13504 = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.f1553.get(0);
                    this.f13504 = str2;
                    return str2;
                }
            }
            if ((!C5499.m17094(name, "protocolSelected") && !C5499.m17094(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            C5499.m17101(obj4, "null cannot be cast to non-null type kotlin.String");
            this.f13504 = (String) obj4;
            return null;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final String m2268() {
            return this.f13504;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m2269() {
            return this.f1554;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m17154(@InterfaceC6489 String str) {
            this.f13504 = str;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m17155(boolean z) {
            this.f1554 = z;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۨۨ$ۥ۟ */
    public static final class C0786 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۥۨۨ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0786(C4335 c4335) {
            this();
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final C6668 m2270() {
            String property = System.getProperty("java.specification.version", C4658.f1036);
            try {
                C5499.m17102(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                C5499.m17102(method, "putMethod");
                C5499.m17102(method2, "getMethod");
                C5499.m17102(method3, "removeMethod");
                C5499.m17102(cls3, "clientProviderClass");
                C5499.m17102(cls4, "serverProviderClass");
                return new C5524(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0786() {
        }
    }

    public C5524(@InterfaceC6399 Method method, @InterfaceC6399 Method method2, @InterfaceC6399 Method method3, @InterfaceC6399 Class<?> cls, @InterfaceC6399 Class<?> cls2) {
        C5499.m17103(method, "putMethod");
        C5499.m17103(method2, "getMethod");
        C5499.m17103(method3, "removeMethod");
        C5499.m17103(cls, "clientProviderClass");
        C5499.m17103(cls2, "serverProviderClass");
        this.f13499 = method;
        this.f13500 = method2;
        this.f13501 = method3;
        this.f13502 = cls;
        this.f13503 = cls2;
    }

    @Override // Yue.C6668
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo17153(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        try {
            this.f13501.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // Yue.C6668
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo6561(@InterfaceC6399 SSLSocket sSLSocket, @InterfaceC6489 String str, @InterfaceC6399 List<? extends EnumC6835> list) {
        C5499.m17103(sSLSocket, "sslSocket");
        C5499.m17103(list, "protocols");
        try {
            this.f13499.invoke(null, sSLSocket, Proxy.newProxyInstance(C6668.class.getClassLoader(), new Class[]{this.f13502, this.f13503}, new C0785(C6668.f2226.m3161(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // Yue.C6668
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public String mo6562(@InterfaceC6399 SSLSocket sSLSocket) {
        C5499.m17103(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f13500.invoke(null, sSLSocket));
            C5499.m17101(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            C0785 c0785 = (C0785) invocationHandler;
            if (!c0785.m2269() && c0785.m2268() == null) {
                C6668.m21313(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (c0785.m2269()) {
                return null;
            }
            return c0785.m2268();
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
