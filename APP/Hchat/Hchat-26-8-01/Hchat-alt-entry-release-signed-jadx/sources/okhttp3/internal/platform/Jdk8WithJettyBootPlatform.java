package okhttp3.internal.platform;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion Companion = new Companion(null);
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AlpnProvider implements InvocationHandler {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AlpnProvider(List<String> list) {
            list.getClass();
            this.protocols = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getSelected() {
            return this.selected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean getUnsupported() {
            return this.unsupported;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            obj.getClass();
            method.getClass();
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (AbstractC1416l.m3825a(name, "supports") && AbstractC1416l.m3825a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (AbstractC1416l.m3825a(name, "unsupported") && AbstractC1416l.m3825a(Void.TYPE, returnType)) {
                this.unsupported = true;
                return null;
            }
            if (AbstractC1416l.m3825a(name, "protocols") && objArr.length == 0) {
                return this.protocols;
            }
            if ((AbstractC1416l.m3825a(name, "selectProtocol") || AbstractC1416l.m3825a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    obj2.getClass();
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i9 = 0;
                        while (true) {
                            Object obj3 = list.get(i9);
                            obj3.getClass();
                            String str = (String) obj3;
                            if (!this.protocols.contains(str)) {
                                if (i9 == size) {
                                    break;
                                }
                                i9++;
                            } else {
                                this.selected = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                }
            }
            if ((!AbstractC1416l.m3825a(name, "protocolSelected") && !AbstractC1416l.m3825a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            this.selected = (String) obj4;
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setSelected(String str) {
            this.selected = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setUnsupported(boolean z9) {
            this.unsupported = z9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        method.getClass();
        method2.getClass();
        method3.getClass();
        cls.getClass();
        cls2.getClass();
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(SSLSocket sSLSocket) {
        sSLSocket.getClass();
        try {
            this.removeMethod.invoke(null, sSLSocket);
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to remove ALPN", e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        sSLSocket.getClass();
        list.getClass();
        try {
            this.putMethod.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(Platform.Companion.alpnProtocolNames(list))));
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to set ALPN", e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        sSLSocket.getClass();
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke(null, sSLSocket));
            invocationHandler.getClass();
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (alpnProvider.getUnsupported()) {
                return null;
            }
            return alpnProvider.getSelected();
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to get ALPN selected protocol", e6);
        } catch (InvocationTargetException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Platform buildIfSupported() {
            String property = System.getProperty("java.specification.version", WeChatSnsPost.TYPE_UNKNOWN);
            try {
                property.getClass();
            } catch (NumberFormatException unused) {
            }
            if (Integer.parseInt(property) < 9) {
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                    Method method = cls.getMethod("put", SSLSocket.class, cls2);
                    Method method2 = cls.getMethod("get", SSLSocket.class);
                    Method method3 = cls.getMethod("remove", SSLSocket.class);
                    method.getClass();
                    method2.getClass();
                    method3.getClass();
                    cls3.getClass();
                    cls4.getClass();
                    return new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
