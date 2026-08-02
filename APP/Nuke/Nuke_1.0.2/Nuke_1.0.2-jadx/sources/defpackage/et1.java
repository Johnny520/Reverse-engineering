package defpackage;

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
    public static final List F = wg3.j(new c42[]{c42.m, c42.k});
    public static final List G = wg3.j(new uy[]{uy.e, uy.f});
    public final int A;
    public final long B;
    public final hh1 C;
    public final iy2 D;
    public final n4 E;
    public final kj1 a;
    public final List b;
    public final List c;
    public final um2 d;
    public final boolean e;
    public final boolean f;
    public final gd3 g;
    public final boolean h;
    public final boolean i;
    public final sn j;
    public final na0 k;
    public final Proxy l;
    public final ProxySelector m;
    public final gd3 n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final ys1 t;
    public final cq u;
    public final up0 v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public et1(dt1 dt1Var) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        this.a = dt1Var.a;
        this.b = wg3.i(dt1Var.c);
        this.c = wg3.i(dt1Var.d);
        this.d = dt1Var.e;
        this.e = dt1Var.f;
        this.f = dt1Var.g;
        this.g = dt1Var.h;
        this.h = dt1Var.i;
        this.i = dt1Var.j;
        this.j = dt1Var.k;
        this.k = dt1Var.l;
        Proxy proxy = dt1Var.m;
        this.l = proxy;
        if (proxy != null) {
            proxySelector = wr1.a;
        } else {
            proxySelector = dt1Var.n;
            if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
                proxySelector = wr1.a;
            }
        }
        this.m = proxySelector;
        this.n = dt1Var.o;
        this.o = dt1Var.p;
        List list = dt1Var.s;
        this.r = list;
        this.s = dt1Var.t;
        this.t = dt1Var.u;
        this.w = dt1Var.x;
        this.x = dt1Var.y;
        this.y = dt1Var.z;
        this.z = dt1Var.A;
        this.A = dt1Var.B;
        this.B = dt1Var.C;
        hh1 hh1Var = dt1Var.D;
        this.C = hh1Var == null ? new hh1(8) : hh1Var;
        iy2 iy2Var = dt1Var.E;
        this.D = iy2Var == null ? iy2.l : iy2Var;
        n4 n4Var = dt1Var.b;
        if (n4Var == null) {
            n4Var = new n4(6);
            dt1Var.b = n4Var;
        }
        this.E = n4Var;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((uy) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = dt1Var.q;
                    if (sSLSocketFactory == null) {
                        zz1 zz1Var = zz1.a;
                        zz1.a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.q = x509TrustManager;
                                zz1 zz1Var2 = zz1.a;
                                zz1Var2.getClass();
                                try {
                                    SSLContext sSLContextI = zz1Var2.i();
                                    sSLContextI.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = sSLContextI.getSocketFactory();
                                    socketFactory.getClass();
                                    this.p = socketFactory;
                                    up0 up0VarA = zz1.a.a(x509TrustManager);
                                    this.v = up0VarA;
                                    cq cqVar = dt1Var.v;
                                    cqVar.getClass();
                                    this.u = t11.l(cqVar.b, up0VarA) ? cqVar : new cq(cqVar.a, up0VarA);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        string.getClass();
                        c80.h("Unexpected default trust managers: ".concat(string));
                        throw null;
                    }
                    this.p = sSLSocketFactory;
                    up0 up0Var = dt1Var.w;
                    up0Var.getClass();
                    this.v = up0Var;
                    X509TrustManager x509TrustManager2 = dt1Var.r;
                    x509TrustManager2.getClass();
                    this.q = x509TrustManager2;
                    cq cqVar2 = dt1Var.v;
                    cqVar2.getClass();
                    this.u = t11.l(cqVar2.b, up0Var) ? cqVar2 : new cq(cqVar2.a, up0Var);
                }
            }
            this.p = null;
            this.v = null;
            this.q = null;
            this.u = cq.c;
        } else {
            this.p = null;
            this.v = null;
            this.q = null;
            this.u = cq.c;
        }
        X509TrustManager x509TrustManager3 = this.q;
        up0 up0Var2 = this.v;
        SSLSocketFactory sSLSocketFactory2 = this.p;
        List list2 = this.c;
        List list3 = this.b;
        list3.getClass();
        if (list3.contains(null)) {
            c80.y("Null interceptor: ", list3);
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            c80.y("Null network interceptor: ", list2);
            throw null;
        }
        List list4 = this.r;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((uy) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        s.l("sslSocketFactory == null");
                        throw null;
                    }
                    if (up0Var2 == null) {
                        s.l("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager3 != null) {
                        return;
                    }
                    s.l("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            s.l("Check failed.");
            throw null;
        }
        if (up0Var2 != null) {
            s.l("Check failed.");
            throw null;
        }
        if (x509TrustManager3 != null) {
            s.l("Check failed.");
            throw null;
        }
        if (t11.l(this.u, cq.c)) {
            return;
        }
        s.l("Check failed.");
        throw null;
    }
}
