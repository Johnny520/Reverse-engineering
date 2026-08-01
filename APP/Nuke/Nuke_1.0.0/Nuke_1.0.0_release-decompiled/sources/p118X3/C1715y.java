package p118X3;

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
import p000A.C0066i0;
import p007B0.C0173F;
import p029F0.C0363A;
import p049I2.AbstractC0797o;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p123Y3.AbstractC1776g;
import p133a4.C1808d;
import p173h4.AbstractC2263d;
import p185j4.C2403a;
import p196l4.C2514c;

/* JADX INFO: renamed from: X3.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1715y implements InterfaceC1694d {

    /* JADX INFO: renamed from: B */
    public static final List f5914B = AbstractC1776g.m3183j(new EnumC1716z[]{EnumC1716z.f5947i, EnumC1716z.f5945g});

    /* JADX INFO: renamed from: C */
    public static final List f5915C = AbstractC1776g.m3183j(new C1700j[]{C1700j.f5829e, C1700j.f5830f});

    /* JADX INFO: renamed from: A */
    public final C0066i0 f5916A;

    /* JADX INFO: renamed from: a */
    public final C0173F f5917a;

    /* JADX INFO: renamed from: b */
    public final List f5918b;

    /* JADX INFO: renamed from: c */
    public final List f5919c;

    /* JADX INFO: renamed from: d */
    public final C0363A f5920d;

    /* JADX INFO: renamed from: e */
    public final boolean f5921e;

    /* JADX INFO: renamed from: f */
    public final boolean f5922f;

    /* JADX INFO: renamed from: g */
    public final C1692b f5923g;

    /* JADX INFO: renamed from: h */
    public final boolean f5924h;

    /* JADX INFO: renamed from: i */
    public final boolean f5925i;

    /* JADX INFO: renamed from: j */
    public final C1692b f5926j;

    /* JADX INFO: renamed from: k */
    public final C1692b f5927k;

    /* JADX INFO: renamed from: l */
    public final ProxySelector f5928l;

    /* JADX INFO: renamed from: m */
    public final C1692b f5929m;

    /* JADX INFO: renamed from: n */
    public final SocketFactory f5930n;

    /* JADX INFO: renamed from: o */
    public final SSLSocketFactory f5931o;

    /* JADX INFO: renamed from: p */
    public final X509TrustManager f5932p;

    /* JADX INFO: renamed from: q */
    public final List f5933q;

    /* JADX INFO: renamed from: r */
    public final List f5934r;

    /* JADX INFO: renamed from: s */
    public final C2514c f5935s;

    /* JADX INFO: renamed from: t */
    public final C1696f f5936t;

    /* JADX INFO: renamed from: u */
    public final AbstractC0797o f5937u;

    /* JADX INFO: renamed from: v */
    public final int f5938v;

    /* JADX INFO: renamed from: w */
    public final int f5939w;

    /* JADX INFO: renamed from: x */
    public final int f5940x;

    /* JADX INFO: renamed from: y */
    public final C1753n f5941y;

    /* JADX INFO: renamed from: z */
    public final C1808d f5942z;

    public C1715y(C1714x c1714x) throws NoSuchAlgorithmException, KeyStoreException {
        this.f5917a = c1714x.f5893a;
        this.f5918b = AbstractC1776g.m3182i(c1714x.f5895c);
        this.f5919c = AbstractC1776g.m3182i(c1714x.f5896d);
        this.f5920d = c1714x.f5897e;
        this.f5921e = c1714x.f5898f;
        this.f5922f = c1714x.f5899g;
        this.f5923g = c1714x.f5900h;
        this.f5924h = c1714x.f5901i;
        this.f5925i = c1714x.f5902j;
        this.f5926j = c1714x.f5903k;
        this.f5927k = c1714x.f5904l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f5928l = proxySelector == null ? C2403a.f7765a : proxySelector;
        this.f5929m = c1714x.f5905m;
        this.f5930n = c1714x.f5906n;
        List list = c1714x.f5907o;
        this.f5933q = list;
        this.f5934r = c1714x.f5908p;
        this.f5935s = c1714x.f5909q;
        this.f5938v = c1714x.f5911s;
        this.f5939w = c1714x.f5912t;
        this.f5940x = c1714x.f5913u;
        this.f5941y = new C1753n(2);
        this.f5942z = C1808d.f6161l;
        C0066i0 c0066i0 = c1714x.f5894b;
        if (c0066i0 == null) {
            c0066i0 = new C0066i0(28);
            c1714x.f5894b = c0066i0;
        }
        this.f5916A = c0066i0;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C1700j) it.next()).f5831a) {
                    AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
                    AbstractC2263d.f7404a.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    AbstractC1665j.m2982b(trustManagers);
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.f5932p = x509TrustManager;
                            AbstractC2263d abstractC2263d2 = AbstractC2263d.f7404a;
                            abstractC2263d2.getClass();
                            try {
                                SSLContext sSLContextMo4118j = abstractC2263d2.mo4118j();
                                sSLContextMo4118j.init(null, new TrustManager[]{x509TrustManager}, null);
                                SSLSocketFactory socketFactory = sSLContextMo4118j.getSocketFactory();
                                AbstractC1665j.m2984d(socketFactory, "getSocketFactory(...)");
                                this.f5931o = socketFactory;
                                AbstractC0797o abstractC0797oMo4110a = AbstractC2263d.f7404a.mo4110a(x509TrustManager);
                                this.f5937u = abstractC0797oMo4110a;
                                C1696f c1696f = c1714x.f5910r;
                                c1696f.getClass();
                                this.f5936t = AbstractC1665j.m2981a(c1696f.f5804b, abstractC0797oMo4110a) ? c1696f : new C1696f(c1696f.f5803a, abstractC0797oMo4110a);
                            } catch (GeneralSecurityException e5) {
                                throw new AssertionError("No System TLS: " + e5, e5);
                            }
                        }
                    }
                    String string = Arrays.toString(trustManagers);
                    AbstractC1665j.m2984d(string, "toString(...)");
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
                }
            }
            this.f5931o = null;
            this.f5937u = null;
            this.f5932p = null;
            this.f5936t = C1696f.f5802c;
        } else {
            this.f5931o = null;
            this.f5937u = null;
            this.f5932p = null;
            this.f5936t = C1696f.f5802c;
        }
        X509TrustManager x509TrustManager2 = this.f5932p;
        AbstractC0797o abstractC0797o = this.f5937u;
        SSLSocketFactory sSLSocketFactory = this.f5931o;
        List list2 = this.f5919c;
        List list3 = this.f5918b;
        AbstractC1665j.m2983c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        AbstractC1665j.m2983c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.f5933q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((C1700j) it2.next()).f5831a) {
                    if (sSLSocketFactory == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (abstractC0797o == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (abstractC0797o != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC1665j.m2981a(this.f5936t, C1696f.f5802c)) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
