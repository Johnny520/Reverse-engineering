package Yue;

import Yue.AbstractC3685;
import Yue.AbstractC4712;
import Yue.C6668;
import Yue.InterfaceC3645;
import Yue.InterfaceC5491;
import Yue.InterfaceC8408;
import com.android.dex.DexFormat;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n2624#2,3:1080\n2624#2,3:1083\n1#3:1086\n*S KotlinDebug\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n*L\n225#1:1080,3\n255#1:1083,3\n*E\n"})
public class C6504 implements Cloneable, InterfaceC3645.InterfaceC0208, InterfaceC8408.InterfaceC1520 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1005 f16676 = new C1005(null);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final List<EnumC6835> f16677 = C8158.m26858(EnumC6835.HTTP_2, EnumC6835.HTTP_1_1);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final List<C4110> f16678 = C8158.m26858(C4110.f8204, C4110.f8206);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C4421 f16679;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final C4108 f16680;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final List<InterfaceC5491> f16681;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final List<InterfaceC5491> f16682;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final AbstractC4712.InterfaceC4713 f16683;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean f16684;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3466 f16685;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean f16686;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final boolean f16687;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4217 f16688;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    @InterfaceC6489
    public final C3633 f16689;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4479 f16690;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    @InterfaceC6489
    public final Proxy f16691;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final ProxySelector f16692;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3466 f16693;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final SocketFactory f16694;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    @InterfaceC6489
    public final SSLSocketFactory f16695;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6489
    public final X509TrustManager f16696;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    @InterfaceC6399
    public final List<C4110> f16697;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    @InterfaceC6399
    public final List<EnumC6835> f16698;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final HostnameVerifier f16699;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    @InterfaceC6399
    public final C3686 f16700;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6489
    public final AbstractC3685 f16701;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final int f16702;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final int f16703;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final int f16704;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final int f16705;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final int f16706;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final long f16707;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C7185 f16708;

    /* JADX INFO: renamed from: Yue.ۥۣۡۢۨ$ۥ۟ */
    public static final class C1005 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۡۢۨ.ۥ۟.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1005(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final List<C4110> m3001() {
            return C6504.f16678;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final List<EnumC6835> m3002() {
            return C6504.f16677;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1005() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6504(@InterfaceC6399 C1004 c1004) {
        ProxySelector proxySelectorM20704;
        C5499.m17103(c1004, "builder");
        this.f16679 = c1004.m20691();
        this.f16680 = c1004.m20688();
        this.f16681 = C8158.m26889(c1004.m20697());
        this.f16682 = C8158.m26889(c1004.m20699());
        this.f16683 = c1004.m20693();
        this.f16684 = c1004.m20706();
        this.f16685 = c1004.m20682();
        this.f16686 = c1004.m20694();
        this.f16687 = c1004.m20695();
        this.f16688 = c1004.m20690();
        this.f16689 = c1004.m20683();
        this.f16690 = c1004.m20692();
        this.f16691 = c1004.m20702();
        if (c1004.m20702() != null) {
            proxySelectorM20704 = C6487.f2112;
        } else {
            proxySelectorM20704 = c1004.m20704();
            proxySelectorM20704 = proxySelectorM20704 == null ? ProxySelector.getDefault() : proxySelectorM20704;
            if (proxySelectorM20704 == null) {
                proxySelectorM20704 = C6487.f2112;
            }
        }
        this.f16692 = proxySelectorM20704;
        this.f16693 = c1004.m20703();
        this.f16694 = c1004.m20708();
        List<C4110> listM20689 = c1004.m20689();
        this.f16697 = listM20689;
        this.f16698 = c1004.m20701();
        this.f16699 = c1004.m20696();
        this.f16702 = c1004.m20684();
        this.f16703 = c1004.m20687();
        this.f16704 = c1004.m20705();
        this.f16705 = c1004.m20710();
        this.f16706 = c1004.m20700();
        this.f16707 = c1004.m20698();
        C7185 c7185M20707 = c1004.m20707();
        this.f16708 = c7185M20707 == null ? new C7185() : c7185M20707;
        if ((listM20689 instanceof Collection) && listM20689.isEmpty()) {
            this.f16695 = null;
            this.f16701 = null;
            this.f16696 = null;
            this.f16700 = C3686.f6503;
        } else {
            Iterator<T> it = listM20689.iterator();
            while (it.hasNext()) {
                if (((C4110) it.next()).m11705()) {
                    if (c1004.m20709() != null) {
                        this.f16695 = c1004.m20709();
                        AbstractC3685 abstractC3685M20685 = c1004.m20685();
                        C5499.m17100(abstractC3685M20685);
                        this.f16701 = abstractC3685M20685;
                        X509TrustManager x509TrustManagerM20711 = c1004.m20711();
                        C5499.m17100(x509TrustManagerM20711);
                        this.f16696 = x509TrustManagerM20711;
                        C3686 c3686M20686 = c1004.m20686();
                        C5499.m17100(abstractC3685M20685);
                        this.f16700 = c3686M20686.m10111(abstractC3685M20685);
                    } else {
                        C6668.C1054 c1054 = C6668.f2226;
                        X509TrustManager x509TrustManagerMo9579 = c1054.m21321().mo9579();
                        this.f16696 = x509TrustManagerMo9579;
                        C6668 c6668M21321 = c1054.m21321();
                        C5499.m17100(x509TrustManagerMo9579);
                        this.f16695 = c6668M21321.mo11726(x509TrustManagerMo9579);
                        AbstractC3685.C0222 c0222 = AbstractC3685.f458;
                        C5499.m17100(x509TrustManagerMo9579);
                        AbstractC3685 abstractC3685M753 = c0222.m753(x509TrustManagerMo9579);
                        this.f16701 = abstractC3685M753;
                        C3686 c3686M206862 = c1004.m20686();
                        C5499.m17100(abstractC3685M753);
                        this.f16700 = c3686M206862.m10111(abstractC3685M753);
                    }
                }
            }
            this.f16695 = null;
            this.f16701 = null;
            this.f16696 = null;
            this.f16700 = C3686.f6503;
        }
        m20660();
    }

    @InterfaceC6399
    public Object clone() {
        return super.clone();
    }

    @Override // Yue.InterfaceC8408.InterfaceC1520
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceC8408 mo20604(@InterfaceC6399 C7101 c7101, @InterfaceC6399 AbstractC8416 abstractC8416) {
        C5499.m17103(c7101, "request");
        C5499.m17103(abstractC8416, "listener");
        C7033 c7033 = new C7033(C7733.f23262, c7101, abstractC8416, new Random(), this.f16706, null, this.f16707);
        c7033.m21907(this);
        return c7033;
    }

    @Override // Yue.InterfaceC3645.InterfaceC0208
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public InterfaceC3645 mo9978(@InterfaceC6399 C7101 c7101) {
        C5499.m17103(c7101, "request");
        return new C7024(this, c7101, false);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "authenticator", imports = {}))
    @InterfaceC5572(name = "-deprecated_authenticator")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final InterfaceC3466 m20605() {
        return this.f16685;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "cache", imports = {}))
    @InterfaceC5572(name = "-deprecated_cache")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final C3633 m20606() {
        return this.f16689;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "callTimeoutMillis", imports = {}))
    @InterfaceC5572(name = "-deprecated_callTimeoutMillis")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m20607() {
        return this.f16702;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "certificatePinner", imports = {}))
    @InterfaceC5572(name = "-deprecated_certificatePinner")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final C3686 m20608() {
        return this.f16700;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "connectTimeoutMillis", imports = {}))
    @InterfaceC5572(name = "-deprecated_connectTimeoutMillis")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m20609() {
        return this.f16703;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "connectionPool", imports = {}))
    @InterfaceC5572(name = "-deprecated_connectionPool")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C4108 m20610() {
        return this.f16680;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "connectionSpecs", imports = {}))
    @InterfaceC5572(name = "-deprecated_connectionSpecs")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final List<C4110> m20611() {
        return this.f16697;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "cookieJar", imports = {}))
    @InterfaceC5572(name = "-deprecated_cookieJar")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final InterfaceC4217 m20612() {
        return this.f16688;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "dispatcher", imports = {}))
    @InterfaceC5572(name = "-deprecated_dispatcher")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final C4421 m20613() {
        return this.f16679;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "dns", imports = {}))
    @InterfaceC5572(name = "-deprecated_dns")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final InterfaceC4479 m20614() {
        return this.f16690;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "eventListenerFactory", imports = {}))
    @InterfaceC5572(name = "-deprecated_eventListenerFactory")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final AbstractC4712.InterfaceC4713 m20615() {
        return this.f16683;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "followRedirects", imports = {}))
    @InterfaceC5572(name = "-deprecated_followRedirects")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m20616() {
        return this.f16686;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "followSslRedirects", imports = {}))
    @InterfaceC5572(name = "-deprecated_followSslRedirects")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final boolean m20617() {
        return this.f16687;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "hostnameVerifier", imports = {}))
    @InterfaceC5572(name = "-deprecated_hostnameVerifier")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final HostnameVerifier m20618() {
        return this.f16699;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "interceptors", imports = {}))
    @InterfaceC5572(name = "-deprecated_interceptors")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final List<InterfaceC5491> m20619() {
        return this.f16681;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "networkInterceptors", imports = {}))
    @InterfaceC5572(name = "-deprecated_networkInterceptors")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final List<InterfaceC5491> m20620() {
        return this.f16682;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "pingIntervalMillis", imports = {}))
    @InterfaceC5572(name = "-deprecated_pingIntervalMillis")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int m20621() {
        return this.f16706;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "protocols", imports = {}))
    @InterfaceC5572(name = "-deprecated_protocols")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final List<EnumC6835> m20622() {
        return this.f16698;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "proxy", imports = {}))
    @InterfaceC5572(name = "-deprecated_proxy")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final Proxy m20623() {
        return this.f16691;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "proxyAuthenticator", imports = {}))
    @InterfaceC5572(name = "-deprecated_proxyAuthenticator")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final InterfaceC3466 m20624() {
        return this.f16693;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "proxySelector", imports = {}))
    @InterfaceC5572(name = "-deprecated_proxySelector")
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final ProxySelector m20625() {
        return this.f16692;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "readTimeoutMillis", imports = {}))
    @InterfaceC5572(name = "-deprecated_readTimeoutMillis")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final int m20626() {
        return this.f16704;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "retryOnConnectionFailure", imports = {}))
    @InterfaceC5572(name = "-deprecated_retryOnConnectionFailure")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final boolean m20627() {
        return this.f16684;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "socketFactory", imports = {}))
    @InterfaceC5572(name = "-deprecated_socketFactory")
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final SocketFactory m20628() {
        return this.f16694;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "sslSocketFactory", imports = {}))
    @InterfaceC5572(name = "-deprecated_sslSocketFactory")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final SSLSocketFactory m20629() {
        return m20659();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "writeTimeoutMillis", imports = {}))
    @InterfaceC5572(name = "-deprecated_writeTimeoutMillis")
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final int m20630() {
        return this.f16705;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "authenticator")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final InterfaceC3466 m20631() {
        return this.f16685;
    }

    @InterfaceC5572(name = "cache")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final C3633 m20632() {
        return this.f16689;
    }

    @InterfaceC5572(name = "callTimeoutMillis")
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final int m20633() {
        return this.f16702;
    }

    @InterfaceC5572(name = "certificateChainCleaner")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final AbstractC3685 m20634() {
        return this.f16701;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "certificatePinner")
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final C3686 m20635() {
        return this.f16700;
    }

    @InterfaceC5572(name = "connectTimeoutMillis")
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final int m20636() {
        return this.f16703;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "connectionPool")
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final C4108 m20637() {
        return this.f16680;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "connectionSpecs")
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final List<C4110> m20638() {
        return this.f16697;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "cookieJar")
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final InterfaceC4217 m20639() {
        return this.f16688;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "dispatcher")
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final C4421 m20640() {
        return this.f16679;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "dns")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final InterfaceC4479 m20641() {
        return this.f16690;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "eventListenerFactory")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final AbstractC4712.InterfaceC4713 m20642() {
        return this.f16683;
    }

    @InterfaceC5572(name = "followRedirects")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final boolean m20643() {
        return this.f16686;
    }

    @InterfaceC5572(name = "followSslRedirects")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final boolean m20644() {
        return this.f16687;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final C7185 m20645() {
        return this.f16708;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "hostnameVerifier")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final HostnameVerifier m20646() {
        return this.f16699;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "interceptors")
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public final List<InterfaceC5491> m20647() {
        return this.f16681;
    }

    @InterfaceC5572(name = "minWebSocketMessageToCompress")
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public final long m20648() {
        return this.f16707;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "networkInterceptors")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final List<InterfaceC5491> m20649() {
        return this.f16682;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public C1004 m20650() {
        return new C1004(this);
    }

    @InterfaceC5572(name = "pingIntervalMillis")
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final int m20651() {
        return this.f16706;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "protocols")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public final List<EnumC6835> m20652() {
        return this.f16698;
    }

    @InterfaceC5572(name = "proxy")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final Proxy m20653() {
        return this.f16691;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "proxyAuthenticator")
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public final InterfaceC3466 m20654() {
        return this.f16693;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "proxySelector")
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public final ProxySelector m20655() {
        return this.f16692;
    }

    @InterfaceC5572(name = "readTimeoutMillis")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final int m20656() {
        return this.f16704;
    }

    @InterfaceC5572(name = "retryOnConnectionFailure")
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public final boolean m20657() {
        return this.f16684;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "socketFactory")
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final SocketFactory m20658() {
        return this.f16694;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "sslSocketFactory")
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final SSLSocketFactory m20659() {
        SSLSocketFactory sSLSocketFactory = this.f16695;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public final void m20660() {
        C5499.m17101(this.f16681, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null interceptor: " + this.f16681).toString());
        }
        C5499.m17101(this.f16682, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!r0.contains(null))) {
            throw new IllegalStateException(("Null network interceptor: " + this.f16682).toString());
        }
        List<C4110> list = this.f16697;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C4110) it.next()).m11705()) {
                    if (this.f16695 == null) {
                        throw new IllegalStateException("sslSocketFactory == null".toString());
                    }
                    if (this.f16701 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null".toString());
                    }
                    if (this.f16696 == null) {
                        throw new IllegalStateException("x509TrustManager == null".toString());
                    }
                    return;
                }
            }
        }
        if (this.f16695 != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f16701 != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f16696 != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!C5499.m17094(this.f16700, C3686.f6503)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @InterfaceC5572(name = "writeTimeoutMillis")
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public final int m20661() {
        return this.f16705;
    }

    @InterfaceC5572(name = "x509TrustManager")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public final X509TrustManager m20662() {
        return this.f16696;
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۢۨ$ۥ */
    @InterfaceC7507({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n1#2:1080\n*E\n"})
    public static final class C1004 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public C4421 f2120;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public C4108 f2121;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final List<InterfaceC5491> f16709;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public final List<InterfaceC5491> f16710;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public AbstractC4712.InterfaceC4713 f16711;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f16712;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        @InterfaceC6399
        public InterfaceC3466 f16713;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f16714;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f16715;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public InterfaceC4217 f16716;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        @InterfaceC6489
        public C3633 f16717;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        @InterfaceC6399
        public InterfaceC4479 f16718;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        @InterfaceC6489
        public Proxy f16719;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        @InterfaceC6489
        public ProxySelector f16720;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public InterfaceC3466 f16721;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        @InterfaceC6399
        public SocketFactory f16722;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        @InterfaceC6489
        public SSLSocketFactory f16723;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        @InterfaceC6489
        public X509TrustManager f16724;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        @InterfaceC6399
        public List<C4110> f16725;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public List<? extends EnumC6835> f16726;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public HostnameVerifier f16727;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6399
        public C3686 f16728;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        @InterfaceC6489
        public AbstractC3685 f16729;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f16730;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f16731;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public int f16732;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public int f16733;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public int f16734;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public long f16735;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        @InterfaceC6489
        public C7185 f16736;

        /* JADX INFO: renamed from: Yue.ۥۣۡۢۨ$ۥ$ۥ, reason: contains not printable characters */
        @InterfaceC7507({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder$addInterceptor$2\n*L\n1#1,1079:1\n*E\n"})
        public static final class C6505 implements InterfaceC5491 {

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ InterfaceC5124<InterfaceC5491.InterfaceC0776, C7141> f2122;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super Yue.ۥ۠ۥۦۤ$ۥ, Yue.ۥۡۦۧ> */
            /* JADX WARN: Multi-variable type inference failed */
            public C6505(InterfaceC5124<? super InterfaceC5491.InterfaceC0776, C7141> interfaceC5124) {
                this.f2122 = interfaceC5124;
            }

            @Override // Yue.InterfaceC5491
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ */
            public final C7141 mo638(@InterfaceC6399 InterfaceC5491.InterfaceC0776 interfaceC0776) {
                C5499.m17103(interfaceC0776, "chain");
                return this.f2122.invoke(interfaceC0776);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣۡۢۨ$ۥ$ۥ۟, reason: contains not printable characters */
        @InterfaceC7507({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder$addNetworkInterceptor$2\n*L\n1#1,1079:1\n*E\n"})
        public static final class C6506 implements InterfaceC5491 {

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ InterfaceC5124<InterfaceC5491.InterfaceC0776, C7141> f2123;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super Yue.ۥ۠ۥۦۤ$ۥ, Yue.ۥۡۦۧ> */
            /* JADX WARN: Multi-variable type inference failed */
            public C6506(InterfaceC5124<? super InterfaceC5491.InterfaceC0776, C7141> interfaceC5124) {
                this.f2123 = interfaceC5124;
            }

            @Override // Yue.InterfaceC5491
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ */
            public final C7141 mo638(@InterfaceC6399 InterfaceC5491.InterfaceC0776 interfaceC0776) {
                C5499.m17103(interfaceC0776, "chain");
                return this.f2123.invoke(interfaceC0776);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1004() {
            this.f2120 = new C4421();
            this.f2121 = new C4108();
            this.f16709 = new ArrayList();
            this.f16710 = new ArrayList();
            this.f16711 = C8158.m26836(AbstractC4712.f1070);
            this.f16712 = true;
            InterfaceC3466 interfaceC3466 = InterfaceC3466.f310;
            this.f16713 = interfaceC3466;
            this.f16714 = true;
            this.f16715 = true;
            this.f16716 = InterfaceC4217.f745;
            this.f16718 = InterfaceC4479.f916;
            this.f16721 = interfaceC3466;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C5499.m17102(socketFactory, "getDefault()");
            this.f16722 = socketFactory;
            C1005 c1005 = C6504.f16676;
            this.f16725 = c1005.m3001();
            this.f16726 = c1005.m3002();
            this.f16727 = C6502.f2116;
            this.f16728 = C3686.f6503;
            this.f16731 = DexFormat.API_SPACES_IN_SIMPLE_NAME;
            this.f16732 = DexFormat.API_SPACES_IN_SIMPLE_NAME;
            this.f16733 = DexFormat.API_SPACES_IN_SIMPLE_NAME;
            this.f16735 = C7033.f21236;
        }

        @InterfaceC6399
        @InterfaceC5572(name = "-addInterceptor")
        /* JADX INFO: renamed from: ۥ */
        public final C1004 m2999(@InterfaceC6399 InterfaceC5124<? super InterfaceC5491.InterfaceC0776, C7141> interfaceC5124) {
            C5499.m17103(interfaceC5124, "block");
            return m20663(new C6505(interfaceC5124));
        }

        @InterfaceC6399
        @InterfaceC5572(name = "-addNetworkInterceptor")
        /* JADX INFO: renamed from: ۥ۟ */
        public final C1004 m3000(@InterfaceC6399 InterfaceC5124<? super InterfaceC5491.InterfaceC0776, C7141> interfaceC5124) {
            C5499.m17103(interfaceC5124, "block");
            return m20664(new C6506(interfaceC5124));
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C1004 m20663(@InterfaceC6399 InterfaceC5491 interfaceC5491) {
            C5499.m17103(interfaceC5491, "interceptor");
            this.f16709.add(interfaceC5491);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C1004 m20664(@InterfaceC6399 InterfaceC5491 interfaceC5491) {
            C5499.m17103(interfaceC5491, "interceptor");
            this.f16710.add(interfaceC5491);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C1004 m20665(@InterfaceC6399 InterfaceC3466 interfaceC3466) {
            C5499.m17103(interfaceC3466, "authenticator");
            this.f16713 = interfaceC3466;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C6504 m20666() {
            return new C6504(this);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final C1004 m20667(@InterfaceC6489 C3633 c3633) {
            this.f16717 = c3633;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C1004 m20668(long j, @InterfaceC6399 TimeUnit timeUnit) {
            C5499.m17103(timeUnit, "unit");
            this.f16730 = C8158.m26842("timeout", j, timeUnit);
            return this;
        }

        @InterfaceC6399
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final C1004 m20669(@InterfaceC6399 Duration duration) {
            C5499.m17103(duration, "duration");
            m20668(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final C1004 m20670(@InterfaceC6399 C3686 c3686) {
            C5499.m17103(c3686, "certificatePinner");
            if (!C5499.m17094(c3686, this.f16728)) {
                this.f16736 = null;
            }
            this.f16728 = c3686;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final C1004 m20671(long j, @InterfaceC6399 TimeUnit timeUnit) {
            C5499.m17103(timeUnit, "unit");
            this.f16731 = C8158.m26842("timeout", j, timeUnit);
            return this;
        }

        @InterfaceC6399
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final C1004 m20672(@InterfaceC6399 Duration duration) {
            C5499.m17103(duration, "duration");
            m20671(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final C1004 m20673(@InterfaceC6399 C4108 c4108) {
            C5499.m17103(c4108, "connectionPool");
            this.f2121 = c4108;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final C1004 m20674(@InterfaceC6399 List<C4110> list) {
            C5499.m17103(list, "connectionSpecs");
            if (!C5499.m17094(list, this.f16725)) {
                this.f16736 = null;
            }
            this.f16725 = C8158.m26889(list);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final C1004 m20675(@InterfaceC6399 InterfaceC4217 interfaceC4217) {
            C5499.m17103(interfaceC4217, "cookieJar");
            this.f16716 = interfaceC4217;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final C1004 m20676(@InterfaceC6399 C4421 c4421) {
            C5499.m17103(c4421, "dispatcher");
            this.f2120 = c4421;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final C1004 m20677(@InterfaceC6399 InterfaceC4479 interfaceC4479) {
            C5499.m17103(interfaceC4479, "dns");
            if (!C5499.m17094(interfaceC4479, this.f16718)) {
                this.f16736 = null;
            }
            this.f16718 = interfaceC4479;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final C1004 m20678(@InterfaceC6399 AbstractC4712 abstractC4712) {
            C5499.m17103(abstractC4712, "eventListener");
            this.f16711 = C8158.m26836(abstractC4712);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public final C1004 m20679(@InterfaceC6399 AbstractC4712.InterfaceC4713 interfaceC4713) {
            C5499.m17103(interfaceC4713, "eventListenerFactory");
            this.f16711 = interfaceC4713;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final C1004 m20680(boolean z) {
            this.f16714 = z;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final C1004 m20681(boolean z) {
            this.f16715 = z;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final InterfaceC3466 m20682() {
            return this.f16713;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final C3633 m20683() {
            return this.f16717;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final int m20684() {
            return this.f16730;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final AbstractC3685 m20685() {
            return this.f16729;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final C3686 m20686() {
            return this.f16728;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final int m20687() {
            return this.f16731;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final C4108 m20688() {
            return this.f2121;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final List<C4110> m20689() {
            return this.f16725;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public final InterfaceC4217 m20690() {
            return this.f16716;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public final C4421 m20691() {
            return this.f2120;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public final InterfaceC4479 m20692() {
            return this.f16718;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public final AbstractC4712.InterfaceC4713 m20693() {
            return this.f16711;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public final boolean m20694() {
            return this.f16714;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final boolean m20695() {
            return this.f16715;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public final HostnameVerifier m20696() {
            return this.f16727;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public final List<InterfaceC5491> m20697() {
            return this.f16709;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public final long m20698() {
            return this.f16735;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public final List<InterfaceC5491> m20699() {
            return this.f16710;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public final int m20700() {
            return this.f16734;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends Yue.ۥۡۥۣۧ>, java.util.List<Yue.ۥۡۥۣۧ> */
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public final List<EnumC6835> m20701() {
            return this.f16726;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public final Proxy m20702() {
            return this.f16719;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public final InterfaceC3466 m20703() {
            return this.f16721;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public final ProxySelector m20704() {
            return this.f16720;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        public final int m20705() {
            return this.f16732;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public final boolean m20706() {
            return this.f16712;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        public final C7185 m20707() {
            return this.f16736;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        public final SocketFactory m20708() {
            return this.f16722;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final SSLSocketFactory m20709() {
            return this.f16723;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final int m20710() {
            return this.f16733;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public final X509TrustManager m20711() {
            return this.f16724;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public final C1004 m20712(@InterfaceC6399 HostnameVerifier hostnameVerifier) {
            C5499.m17103(hostnameVerifier, "hostnameVerifier");
            if (!C5499.m17094(hostnameVerifier, this.f16727)) {
                this.f16736 = null;
            }
            this.f16727 = hostnameVerifier;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
        public final List<InterfaceC5491> m20713() {
            return this.f16709;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public final C1004 m20714(long j) {
            if (j >= 0) {
                this.f16735 = j;
                return this;
            }
            throw new IllegalArgumentException(("minWebSocketMessageToCompress must be positive: " + j).toString());
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
        public final List<InterfaceC5491> m20715() {
            return this.f16710;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
        public final C1004 m20716(long j, @InterfaceC6399 TimeUnit timeUnit) {
            C5499.m17103(timeUnit, "unit");
            this.f16734 = C8158.m26842("interval", j, timeUnit);
            return this;
        }

        @InterfaceC6399
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
        public final C1004 m20717(@InterfaceC6399 Duration duration) {
            C5499.m17103(duration, "duration");
            m20716(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
        public final C1004 m20718(@InterfaceC6399 List<? extends EnumC6835> list) {
            C5499.m17103(list, "protocols");
            List listM11065 = C3888.m11065(list);
            EnumC6835 enumC6835 = EnumC6835.H2_PRIOR_KNOWLEDGE;
            if (!listM11065.contains(enumC6835) && !listM11065.contains(EnumC6835.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listM11065).toString());
            }
            if (listM11065.contains(enumC6835) && listM11065.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listM11065).toString());
            }
            if (!(!listM11065.contains(EnumC6835.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listM11065).toString());
            }
            C5499.m17101(listM11065, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (!(true ^ listM11065.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            listM11065.remove(EnumC6835.SPDY_3);
            if (!C5499.m17094(listM11065, this.f16726)) {
                this.f16736 = null;
            }
            List<? extends EnumC6835> listUnmodifiableList = Collections.unmodifiableList(listM11065);
            C5499.m17102(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            this.f16726 = listUnmodifiableList;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
        public final C1004 m20719(@InterfaceC6489 Proxy proxy) {
            if (!C5499.m17094(proxy, this.f16719)) {
                this.f16736 = null;
            }
            this.f16719 = proxy;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
        public final C1004 m20720(@InterfaceC6399 InterfaceC3466 interfaceC3466) {
            C5499.m17103(interfaceC3466, "proxyAuthenticator");
            if (!C5499.m17094(interfaceC3466, this.f16721)) {
                this.f16736 = null;
            }
            this.f16721 = interfaceC3466;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
        public final C1004 m20721(@InterfaceC6399 ProxySelector proxySelector) {
            C5499.m17103(proxySelector, "proxySelector");
            if (!C5499.m17094(proxySelector, this.f16720)) {
                this.f16736 = null;
            }
            this.f16720 = proxySelector;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
        public final C1004 m20722(long j, @InterfaceC6399 TimeUnit timeUnit) {
            C5499.m17103(timeUnit, "unit");
            this.f16732 = C8158.m26842("timeout", j, timeUnit);
            return this;
        }

        @InterfaceC6399
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
        public final C1004 m20723(@InterfaceC6399 Duration duration) {
            C5499.m17103(duration, "duration");
            m20722(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public final C1004 m20724(boolean z) {
            this.f16712 = z;
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
        public final void m20725(@InterfaceC6399 InterfaceC3466 interfaceC3466) {
            C5499.m17103(interfaceC3466, "<set-?>");
            this.f16713 = interfaceC3466;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
        public final void m20726(@InterfaceC6489 C3633 c3633) {
            this.f16717 = c3633;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        public final void m20727(int i) {
            this.f16730 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
        public final void m20728(@InterfaceC6489 AbstractC3685 abstractC3685) {
            this.f16729 = abstractC3685;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
        public final void m20729(@InterfaceC6399 C3686 c3686) {
            C5499.m17103(c3686, "<set-?>");
            this.f16728 = c3686;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
        public final void m20730(int i) {
            this.f16731 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
        public final void m20731(@InterfaceC6399 C4108 c4108) {
            C5499.m17103(c4108, "<set-?>");
            this.f2121 = c4108;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
        public final void m20732(@InterfaceC6399 List<C4110> list) {
            C5499.m17103(list, "<set-?>");
            this.f16725 = list;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
        public final void m20733(@InterfaceC6399 InterfaceC4217 interfaceC4217) {
            C5499.m17103(interfaceC4217, "<set-?>");
            this.f16716 = interfaceC4217;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
        public final void m20734(@InterfaceC6399 C4421 c4421) {
            C5499.m17103(c4421, "<set-?>");
            this.f2120 = c4421;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
        public final void m20735(@InterfaceC6399 InterfaceC4479 interfaceC4479) {
            C5499.m17103(interfaceC4479, "<set-?>");
            this.f16718 = interfaceC4479;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
        public final void m20736(@InterfaceC6399 AbstractC4712.InterfaceC4713 interfaceC4713) {
            C5499.m17103(interfaceC4713, "<set-?>");
            this.f16711 = interfaceC4713;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
        public final void m20737(boolean z) {
            this.f16714 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
        public final void m20738(boolean z) {
            this.f16715 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
        public final void m20739(@InterfaceC6399 HostnameVerifier hostnameVerifier) {
            C5499.m17103(hostnameVerifier, "<set-?>");
            this.f16727 = hostnameVerifier;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
        public final void m20740(long j) {
            this.f16735 = j;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
        public final void m20741(int i) {
            this.f16734 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
        public final void m20742(@InterfaceC6399 List<? extends EnumC6835> list) {
            C5499.m17103(list, "<set-?>");
            this.f16726 = list;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
        public final void m20743(@InterfaceC6489 Proxy proxy) {
            this.f16719 = proxy;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
        public final void m20744(@InterfaceC6399 InterfaceC3466 interfaceC3466) {
            C5499.m17103(interfaceC3466, "<set-?>");
            this.f16721 = interfaceC3466;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
        public final void m20745(@InterfaceC6489 ProxySelector proxySelector) {
            this.f16720 = proxySelector;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
        public final void m20746(int i) {
            this.f16732 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
        public final void m20747(boolean z) {
            this.f16712 = z;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
        public final void m20748(@InterfaceC6489 C7185 c7185) {
            this.f16736 = c7185;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
        public final void m20749(@InterfaceC6399 SocketFactory socketFactory) {
            C5499.m17103(socketFactory, "<set-?>");
            this.f16722 = socketFactory;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
        public final void m20750(@InterfaceC6489 SSLSocketFactory sSLSocketFactory) {
            this.f16723 = sSLSocketFactory;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
        public final void m20751(int i) {
            this.f16733 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
        public final void m20752(@InterfaceC6489 X509TrustManager x509TrustManager) {
            this.f16724 = x509TrustManager;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
        public final C1004 m20753(@InterfaceC6399 SocketFactory socketFactory) {
            C5499.m17103(socketFactory, "socketFactory");
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
            }
            if (!C5499.m17094(socketFactory, this.f16722)) {
                this.f16736 = null;
            }
            this.f16722 = socketFactory;
            return this;
        }

        @InterfaceC6399
        @InterfaceC4372(level = EnumC0393.f8971, message = "Use the sslSocketFactory overload that accepts a X509TrustManager.")
        /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
        public final C1004 m20754(@InterfaceC6399 SSLSocketFactory sSLSocketFactory) {
            C5499.m17103(sSLSocketFactory, "sslSocketFactory");
            if (!C5499.m17094(sSLSocketFactory, this.f16723)) {
                this.f16736 = null;
            }
            this.f16723 = sSLSocketFactory;
            C6668.C1054 c1054 = C6668.f2226;
            X509TrustManager x509TrustManagerMo6564 = c1054.m21321().mo6564(sSLSocketFactory);
            if (x509TrustManagerMo6564 != null) {
                this.f16724 = x509TrustManagerMo6564;
                C6668 c6668M21321 = c1054.m21321();
                X509TrustManager x509TrustManager = this.f16724;
                C5499.m17100(x509TrustManager);
                this.f16729 = c6668M21321.mo6560(x509TrustManager);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + c1054.m21321() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
        public final C1004 m20755(@InterfaceC6399 SSLSocketFactory sSLSocketFactory, @InterfaceC6399 X509TrustManager x509TrustManager) {
            C5499.m17103(sSLSocketFactory, "sslSocketFactory");
            C5499.m17103(x509TrustManager, "trustManager");
            if (!C5499.m17094(sSLSocketFactory, this.f16723) || !C5499.m17094(x509TrustManager, this.f16724)) {
                this.f16736 = null;
            }
            this.f16723 = sSLSocketFactory;
            this.f16729 = AbstractC3685.f458.m753(x509TrustManager);
            this.f16724 = x509TrustManager;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
        public final C1004 m20756(long j, @InterfaceC6399 TimeUnit timeUnit) {
            C5499.m17103(timeUnit, "unit");
            this.f16733 = C8158.m26842("timeout", j, timeUnit);
            return this;
        }

        @InterfaceC6399
        @IgnoreJRERequirement
        /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
        public final C1004 m20757(@InterfaceC6399 Duration duration) {
            C5499.m17103(duration, "duration");
            m20756(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C1004(@InterfaceC6399 C6504 c6504) {
            this();
            C5499.m17103(c6504, "okHttpClient");
            this.f2120 = c6504.m20640();
            this.f2121 = c6504.m20637();
            C3885.m10772(this.f16709, c6504.m20647());
            C3885.m10772(this.f16710, c6504.m20649());
            this.f16711 = c6504.m20642();
            this.f16712 = c6504.m20657();
            this.f16713 = c6504.m20631();
            this.f16714 = c6504.m20643();
            this.f16715 = c6504.m20644();
            this.f16716 = c6504.m20639();
            this.f16717 = c6504.m20632();
            this.f16718 = c6504.m20641();
            this.f16719 = c6504.m20653();
            this.f16720 = c6504.m20655();
            this.f16721 = c6504.m20654();
            this.f16722 = c6504.m20658();
            this.f16723 = c6504.f16695;
            this.f16724 = c6504.m20662();
            this.f16725 = c6504.m20638();
            this.f16726 = c6504.m20652();
            this.f16727 = c6504.m20646();
            this.f16728 = c6504.m20635();
            this.f16729 = c6504.m20634();
            this.f16730 = c6504.m20633();
            this.f16731 = c6504.m20636();
            this.f16732 = c6504.m20656();
            this.f16733 = c6504.m20661();
            this.f16734 = c6504.m20651();
            this.f16735 = c6504.m20648();
            this.f16736 = c6504.m20645();
        }
    }

    public C6504() {
        this(new C1004());
    }
}
