package Yue;

import Yue.AbstractC4712;
import Yue.C5380;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5870 extends AbstractC4712 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C5380.InterfaceC0734 f14563;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public long f14564;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۢ$ۥ */
    public static class C0887 implements AbstractC4712.InterfaceC4713 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public final C5380.InterfaceC0734 f1748;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC5573
        public C0887() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // Yue.AbstractC4712.InterfaceC4713
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public AbstractC4712 mo1626(@InterfaceC6399 InterfaceC3645 interfaceC3645) {
            C5499.m17103(interfaceC3645, C6411.f16272);
            return new C5870(this.f1748, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC5573
        public C0887(@InterfaceC6399 C5380.InterfaceC0734 interfaceC0734) {
            C5499.m17103(interfaceC0734, "logger");
            this.f1748 = interfaceC0734;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:Yue.ۥ۠ۤۨۢ$ۥ۟:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۠ۤۨۢ$ۥ۟:0x0004: SGET  A[WRAPPED] (LINE:4) Yue.ۥ۠ۤۨۢ.ۥ۟.ۥ۟ Yue.ۥ۠ۤۨۢ$ۥ۟) : (r1v0 Yue.ۥ۠ۤۨۢ$ۥ۟))
 A[MD:(Yue.ۥ۠ۤۨۢ$ۥ۟):void (m)] (LINE:5) call: Yue.ۥ۠ۨۢ.ۥ.<init>(Yue.ۥ۠ۤۨۢ$ۥ۟):void type: THIS */
        public /* synthetic */ C0887(C5380.InterfaceC0734 interfaceC0734, int i, C4335 c4335) {
            this((i & 1) != 0 ? C5380.InterfaceC0734.f1467 : interfaceC0734);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 Yue.ۥ۠ۤۨۢ$ۥ۟) A[MD:(Yue.ۥ۠ۤۨۢ$ۥ۟):void (m)] (LINE:1) call: Yue.ۥ۠ۨۢ.<init>(Yue.ۥ۠ۤۨۢ$ۥ۟):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5870(C5380.InterfaceC0734 interfaceC0734, C4335 c4335) {
        this(interfaceC0734);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ */
    public void mo1624(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 C7141 c7141) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(c7141, "cachedResponse");
        m18180("cacheConditionalHit: " + c7141);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1625(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 C7141 c7141) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(c7141, "response");
        m18180("cacheHit: " + c7141);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo14049(@InterfaceC6399 InterfaceC3645 interfaceC3645) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        m18180("cacheMiss");
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo14050(@InterfaceC6399 InterfaceC3645 interfaceC3645) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        m18180("callEnd");
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo14051(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 IOException iOException) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(iOException, "ioe");
        m18180("callFailed: " + iOException);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo14052(@InterfaceC6399 InterfaceC3645 interfaceC3645) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        this.f14564 = System.nanoTime();
        m18180("callStart: " + interfaceC3645.mo712());
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo14053(@InterfaceC6399 InterfaceC3645 interfaceC3645) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        m18180("canceled");
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo14054(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 InetSocketAddress inetSocketAddress, @InterfaceC6399 Proxy proxy, @InterfaceC6489 EnumC6835 enumC6835) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(inetSocketAddress, "inetSocketAddress");
        C5499.m17103(proxy, "proxy");
        m18180("connectEnd: " + enumC6835);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo14055(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 InetSocketAddress inetSocketAddress, @InterfaceC6399 Proxy proxy, @InterfaceC6489 EnumC6835 enumC6835, @InterfaceC6399 IOException iOException) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(inetSocketAddress, "inetSocketAddress");
        C5499.m17103(proxy, "proxy");
        C5499.m17103(iOException, "ioe");
        m18180("connectFailed: " + enumC6835 + ' ' + iOException);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo14056(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 InetSocketAddress inetSocketAddress, @InterfaceC6399 Proxy proxy) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(inetSocketAddress, "inetSocketAddress");
        C5499.m17103(proxy, "proxy");
        m18180("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo14057(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 InterfaceC4107 interfaceC4107) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(interfaceC4107, C5368.f13116);
        m18180("connectionAcquired: " + interfaceC4107);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo14058(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 InterfaceC4107 interfaceC4107) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(interfaceC4107, C5368.f13116);
        m18180("connectionReleased");
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo14059(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 String str, @InterfaceC6399 List<? extends InetAddress> list) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(str, "domainName");
        C5499.m17103(list, "inetAddressList");
        m18180("dnsEnd: " + list);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo14060(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 String str) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(str, "domainName");
        m18180("dnsStart: " + str);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo14061(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 C5385 c5385, @InterfaceC6399 List<? extends Proxy> list) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(c5385, "url");
        C5499.m17103(list, "proxies");
        m18180("proxySelectEnd: " + list);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo14062(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 C5385 c5385) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(c5385, "url");
        m18180("proxySelectStart: " + c5385);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo14063(@InterfaceC6399 InterfaceC3645 interfaceC3645, long j) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        m18180("requestBodyEnd: byteCount=" + j);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo14064(@InterfaceC6399 InterfaceC3645 interfaceC3645) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        m18180("requestBodyStart");
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo14065(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 IOException iOException) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(iOException, "ioe");
        m18180("requestFailed: " + iOException);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo14066(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 C7101 c7101) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(c7101, "request");
        m18180("requestHeadersEnd");
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public void mo14067(@InterfaceC6399 InterfaceC3645 interfaceC3645) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        m18180("requestHeadersStart");
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo14068(@InterfaceC6399 InterfaceC3645 interfaceC3645, long j) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        m18180("responseBodyEnd: byteCount=" + j);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public void mo14069(@InterfaceC6399 InterfaceC3645 interfaceC3645) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        m18180("responseBodyStart");
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public void mo14070(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 IOException iOException) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(iOException, "ioe");
        m18180("responseFailed: " + iOException);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public void mo14071(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 C7141 c7141) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(c7141, "response");
        m18180("responseHeadersEnd: " + c7141);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public void mo14072(@InterfaceC6399 InterfaceC3645 interfaceC3645) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        m18180("responseHeadersStart");
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public void mo14073(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6399 C7141 c7141) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        C5499.m17103(c7141, "response");
        m18180("satisfactionFailure: " + c7141);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public void mo14074(@InterfaceC6399 InterfaceC3645 interfaceC3645, @InterfaceC6489 C5241 c5241) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        m18180("secureConnectEnd: " + c5241);
    }

    @Override // Yue.AbstractC4712
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo14075(@InterfaceC6399 InterfaceC3645 interfaceC3645) {
        C5499.m17103(interfaceC3645, C6411.f16272);
        m18180("secureConnectStart");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m18180(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f14564);
        this.f14563.mo2137(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + millis + " ms] " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5870(C5380.InterfaceC0734 interfaceC0734) {
        this.f14563 = interfaceC0734;
    }
}
