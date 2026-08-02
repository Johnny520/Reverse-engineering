package p000;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class et1 {

    /* JADX INFO: renamed from: F */
    public static final List f2593F = wg3.m5897j(new c42[]{c42.f1140m, c42.f1138k});

    /* JADX INFO: renamed from: G */
    public static final List f2594G = wg3.m5897j(new C0790uy[]{C0790uy.f11548e, C0790uy.f11549f});

    /* JADX INFO: renamed from: A */
    public final int f2595A;

    /* JADX INFO: renamed from: B */
    public final long f2596B;

    /* JADX INFO: renamed from: C */
    public final hh1 f2597C;

    /* JADX INFO: renamed from: D */
    public final iy2 f2598D;

    /* JADX INFO: renamed from: E */
    public final C0485n4 f2599E;

    /* JADX INFO: renamed from: a */
    public final kj1 f2600a;

    /* JADX INFO: renamed from: b */
    public final List f2601b;

    /* JADX INFO: renamed from: c */
    public final List f2602c;

    /* JADX INFO: renamed from: d */
    public final um2 f2603d;

    /* JADX INFO: renamed from: e */
    public final boolean f2604e;

    /* JADX INFO: renamed from: f */
    public final boolean f2605f;

    /* JADX INFO: renamed from: g */
    public final gd3 f2606g;

    /* JADX INFO: renamed from: h */
    public final boolean f2607h;

    /* JADX INFO: renamed from: i */
    public final boolean f2608i;

    /* JADX INFO: renamed from: j */
    public final C0700sn f2609j;

    /* JADX INFO: renamed from: k */
    public final na0 f2610k;

    /* JADX INFO: renamed from: l */
    public final Proxy f2611l;

    /* JADX INFO: renamed from: m */
    public final ProxySelector f2612m;

    /* JADX INFO: renamed from: n */
    public final gd3 f2613n;

    /* JADX INFO: renamed from: o */
    public final SocketFactory f2614o;

    /* JADX INFO: renamed from: p */
    public final SSLSocketFactory f2615p;

    /* JADX INFO: renamed from: q */
    public final X509TrustManager f2616q;

    /* JADX INFO: renamed from: r */
    public final List f2617r;

    /* JADX INFO: renamed from: s */
    public final List f2618s;

    /* JADX INFO: renamed from: t */
    public final ys1 f2619t;

    /* JADX INFO: renamed from: u */
    public final C0102cq f2620u;

    /* JADX INFO: renamed from: v */
    public final up0 f2621v;

    /* JADX INFO: renamed from: w */
    public final int f2622w;

    /* JADX INFO: renamed from: x */
    public final int f2623x;

    /* JADX INFO: renamed from: y */
    public final int f2624y;

    /* JADX INFO: renamed from: z */
    public final int f2625z;

    public et1(dt1 dt1Var) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.f2600a = dt1Var.f2200a;
        this.f2601b = wg3.m5896i(dt1Var.f2202c);
        this.f2602c = wg3.m5896i(dt1Var.f2203d);
        this.f2603d = dt1Var.f2204e;
        this.f2604e = dt1Var.f2205f;
        this.f2605f = dt1Var.f2206g;
        this.f2606g = dt1Var.f2207h;
        this.f2607h = dt1Var.f2208i;
        this.f2608i = dt1Var.f2209j;
        this.f2609j = dt1Var.f2210k;
        this.f2610k = dt1Var.f2211l;
        Proxy proxy = dt1Var.f2212m;
        this.f2611l = proxy;
        if (proxy != null) {
            proxySelector = wr1.f12621a;
        } else {
            proxySelector = dt1Var.f2213n;
            if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
                proxySelector = wr1.f12621a;
            }
        }
        this.f2612m = proxySelector;
        this.f2613n = dt1Var.f2214o;
        this.f2614o = dt1Var.f2215p;
        List list = dt1Var.f2218s;
        this.f2617r = list;
        this.f2618s = dt1Var.f2219t;
        this.f2619t = dt1Var.f2220u;
        this.f2622w = dt1Var.f2223x;
        this.f2623x = dt1Var.f2224y;
        this.f2624y = dt1Var.f2225z;
        this.f2625z = dt1Var.f2195A;
        this.f2595A = dt1Var.f2196B;
        this.f2596B = dt1Var.f2197C;
        hh1 hh1Var = dt1Var.f2198D;
        this.f2597C = hh1Var == null ? new hh1(8) : hh1Var;
        iy2 iy2Var = dt1Var.f2199E;
        this.f2598D = iy2Var == null ? iy2.f4834l : iy2Var;
        C0485n4 c0485n4 = dt1Var.f2201b;
        if (c0485n4 == null) {
            c0485n4 = new C0485n4(6);
            dt1Var.f2201b = c0485n4;
        }
        this.f2599E = c0485n4;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C0790uy) it.next()).f11550a) {
                    SSLSocketFactory sSLSocketFactory = dt1Var.f2216q;
                    if (sSLSocketFactory == null) {
                        zz1 zz1Var = zz1.f14161a;
                        zz1.f14161a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.f2616q = x509TrustManager;
                                zz1 zz1Var2 = zz1.f14161a;
                                zz1Var2.getClass();
                                try {
                                    SSLContext sSLContextMo716i = zz1Var2.mo716i();
                                    sSLContextMo716i.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = sSLContextMo716i.getSocketFactory();
                                    socketFactory.getClass();
                                    this.f2615p = socketFactory;
                                    up0 up0VarMo710a = zz1.f14161a.mo710a(x509TrustManager);
                                    this.f2621v = up0VarMo710a;
                                    C0102cq c0102cq = dt1Var.f2221v;
                                    c0102cq.getClass();
                                    this.f2620u = t11.m5086l(c0102cq.f1667b, up0VarMo710a) ? c0102cq : new C0102cq(c0102cq.f1666a, up0VarMo710a);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        string.getClass();
                        c80.m665h("Unexpected default trust managers: ".concat(string));
                        throw null;
                    }
                    this.f2615p = sSLSocketFactory;
                    up0 up0Var = dt1Var.f2222w;
                    up0Var.getClass();
                    this.f2621v = up0Var;
                    X509TrustManager x509TrustManager2 = dt1Var.f2217r;
                    x509TrustManager2.getClass();
                    this.f2616q = x509TrustManager2;
                    C0102cq c0102cq2 = dt1Var.f2221v;
                    c0102cq2.getClass();
                    this.f2620u = t11.m5086l(c0102cq2.f1667b, up0Var) ? c0102cq2 : new C0102cq(c0102cq2.f1666a, up0Var);
                }
            }
            this.f2615p = null;
            this.f2621v = null;
            this.f2616q = null;
            this.f2620u = C0102cq.f1665c;
        } else {
            this.f2615p = null;
            this.f2621v = null;
            this.f2616q = null;
            this.f2620u = C0102cq.f1665c;
        }
        X509TrustManager x509TrustManager3 = this.f2616q;
        up0 up0Var2 = this.f2621v;
        SSLSocketFactory sSLSocketFactory2 = this.f2615p;
        List list2 = this.f2602c;
        List list3 = this.f2601b;
        list3.getClass();
        if (list3.contains(null)) {
            c80.m681y("Null interceptor: ", list3);
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            c80.m681y("Null network interceptor: ", list2);
            throw null;
        }
        List list4 = this.f2617r;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((C0790uy) it2.next()).f11550a) {
                    if (sSLSocketFactory2 == null) {
                        C0676s.m4653l("sslSocketFactory == null");
                        throw null;
                    }
                    if (up0Var2 == null) {
                        C0676s.m4653l("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager3 != null) {
                        return;
                    }
                    C0676s.m4653l("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            C0676s.m4653l("Check failed.");
            throw null;
        }
        if (up0Var2 != null) {
            C0676s.m4653l("Check failed.");
            throw null;
        }
        if (x509TrustManager3 != null) {
            C0676s.m4653l("Check failed.");
            throw null;
        }
        if (t11.m5086l(this.f2620u, C0102cq.f1665c)) {
            return;
        }
        C0676s.m4653l("Check failed.");
        throw null;
    }
}
