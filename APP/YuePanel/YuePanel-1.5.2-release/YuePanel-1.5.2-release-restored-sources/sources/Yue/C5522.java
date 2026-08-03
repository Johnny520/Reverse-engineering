package Yue;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5522 implements InterfaceC3466 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4479 f13497;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۨۦ$ۥ */
    public /* synthetic */ class C0784 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1551;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f1551 = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C5522() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // Yue.InterfaceC3466
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public C7101 mo542(@InterfaceC6489 C7184 c7184, @InterfaceC6399 C7141 c7141) throws IOException {
        Proxy proxyM22505;
        InterfaceC4479 interfaceC4479M6505;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        C3175 c3175M22504;
        C5499.m17103(c7141, "response");
        List<C3693> listM22314 = c7141.m22314();
        C7101 c7101M22331 = c7141.m22331();
        C5385 c5385M22160 = c7101M22331.m22160();
        boolean z = c7141.m22315() == 407;
        if (c7184 == null || (proxyM22505 = c7184.m22505()) == null) {
            proxyM22505 = Proxy.NO_PROXY;
        }
        for (C3693 c3693 : listM22314) {
            if (C7627.m23974("Basic", c3693.m10144(), true)) {
                if (c7184 == null || (c3175M22504 = c7184.m22504()) == null || (interfaceC4479M6505 = c3175M22504.m6505()) == null) {
                    interfaceC4479M6505 = this.f13497;
                }
                if (z) {
                    SocketAddress socketAddressAddress = proxyM22505.address();
                    C5499.m17101(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    C5499.m17102(proxyM22505, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m2266(proxyM22505, c5385M22160, interfaceC4479M6505), inetSocketAddress.getPort(), c5385M22160.m16789(), c3693.m10143(), c3693.m10144(), c5385M22160.m16792(), Authenticator.RequestorType.PROXY);
                } else {
                    String strM16772 = c5385M22160.m16772();
                    C5499.m17102(proxyM22505, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strM16772, m2266(proxyM22505, c5385M22160, interfaceC4479M6505), c5385M22160.m16779(), c5385M22160.m16789(), c3693.m10143(), c3693.m10144(), c5385M22160.m16792(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    C5499.m17102(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    C5499.m17102(password, "auth.password");
                    return c7101M22331.m22157().m22172(str, C4253.m1217(userName, new String(password), c3693.m10142())).m3393();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final InetAddress m2266(Proxy proxy, C5385 c5385, InterfaceC4479 interfaceC4479) throws IOException {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0784.f1551[type.ordinal()]) == 1) {
            return (InetAddress) C3888.m10886(interfaceC4479.mo1404(c5385.m16772()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        C5499.m17101(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        C5499.m17102(address, "address() as InetSocketAddress).address");
        return address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5522(@InterfaceC6399 InterfaceC4479 interfaceC4479) {
        C5499.m17103(interfaceC4479, "defaultDns");
        this.f13497 = interfaceC4479;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:Yue.ۥ۠۟ۧۢ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۠۟ۧۢ:0x0004: SGET  A[WRAPPED] (LINE:3) Yue.ۥ۠۟ۧۢ.ۥ۟ Yue.ۥ۠۟ۧۢ) : (r1v0 Yue.ۥ۠۟ۧۢ))
 A[MD:(Yue.ۥ۠۟ۧۢ):void (m)] (LINE:3) call: Yue.ۥ۠ۥۨۦ.<init>(Yue.ۥ۠۟ۧۢ):void type: THIS */
    public /* synthetic */ C5522(InterfaceC4479 interfaceC4479, int i, C4335 c4335) {
        this((i & 1) != 0 ? InterfaceC4479.f916 : interfaceC4479);
    }
}
