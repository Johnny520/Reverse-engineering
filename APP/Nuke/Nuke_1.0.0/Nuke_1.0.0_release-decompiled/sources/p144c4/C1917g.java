package p144c4;

import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p000A.C0066i0;
import p049I2.AbstractC0797o;
import p068N1.C1013c;
import p117X2.AbstractC1665j;
import p118X3.C1679A;
import p118X3.C1684F;
import p118X3.C1692b;
import p118X3.C1696f;
import p118X3.InterfaceC1710t;
import p138b4.C1869n;
import p138b4.InterfaceC1862g;

/* JADX INFO: renamed from: c4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1917g {

    /* JADX INFO: renamed from: a */
    public final C1869n f6485a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f6486b;

    /* JADX INFO: renamed from: c */
    public final int f6487c;

    /* JADX INFO: renamed from: d */
    public final C1013c f6488d;

    /* JADX INFO: renamed from: e */
    public final C1679A f6489e;

    /* JADX INFO: renamed from: f */
    public final int f6490f;

    /* JADX INFO: renamed from: g */
    public final int f6491g;

    /* JADX INFO: renamed from: h */
    public final int f6492h;

    /* JADX INFO: renamed from: i */
    public final C1692b f6493i;

    /* JADX INFO: renamed from: j */
    public final C1696f f6494j;

    /* JADX INFO: renamed from: k */
    public final C0066i0 f6495k;

    /* JADX INFO: renamed from: l */
    public final C1692b f6496l;

    /* JADX INFO: renamed from: m */
    public final C1692b f6497m;

    /* JADX INFO: renamed from: n */
    public final HostnameVerifier f6498n;

    /* JADX INFO: renamed from: o */
    public final C1692b f6499o;

    /* JADX INFO: renamed from: p */
    public final ProxySelector f6500p;

    /* JADX INFO: renamed from: q */
    public final boolean f6501q;

    /* JADX INFO: renamed from: r */
    public final SocketFactory f6502r;

    /* JADX INFO: renamed from: s */
    public final SSLSocketFactory f6503s;

    /* JADX INFO: renamed from: t */
    public final X509TrustManager f6504t;

    /* JADX INFO: renamed from: u */
    public final AbstractC0797o f6505u;

    /* JADX INFO: renamed from: v */
    public int f6506v;

    public C1917g(C1869n c1869n, ArrayList arrayList, int i5, C1013c c1013c, C1679A c1679a, int i6, int i7, int i8, C1692b c1692b, C1696f c1696f, C0066i0 c0066i0, C1692b c1692b2, C1692b c1692b3, HostnameVerifier hostnameVerifier, C1692b c1692b4, ProxySelector proxySelector, boolean z5, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, AbstractC0797o abstractC0797o) {
        AbstractC1665j.m2985e(c1692b, "authenticator");
        AbstractC1665j.m2985e(c1696f, "certificatePinner");
        AbstractC1665j.m2985e(c0066i0, "connectionPool");
        AbstractC1665j.m2985e(c1692b2, "cookieJar");
        AbstractC1665j.m2985e(c1692b3, "dns");
        AbstractC1665j.m2985e(hostnameVerifier, "hostnameVerifier");
        AbstractC1665j.m2985e(c1692b4, "proxyAuthenticator");
        AbstractC1665j.m2985e(proxySelector, "proxySelector");
        AbstractC1665j.m2985e(socketFactory, "socketFactory");
        this.f6485a = c1869n;
        this.f6486b = arrayList;
        this.f6487c = i5;
        this.f6488d = c1013c;
        this.f6489e = c1679a;
        this.f6490f = i6;
        this.f6491g = i7;
        this.f6492h = i8;
        this.f6493i = c1692b;
        this.f6494j = c1696f;
        this.f6495k = c0066i0;
        this.f6496l = c1692b2;
        this.f6497m = c1692b3;
        this.f6498n = hostnameVerifier;
        this.f6499o = c1692b4;
        this.f6500p = proxySelector;
        this.f6501q = z5;
        this.f6502r = socketFactory;
        this.f6503s = sSLSocketFactory;
        this.f6504t = x509TrustManager;
        this.f6505u = abstractC0797o;
    }

    /* JADX INFO: renamed from: a */
    public static C1917g m3408a(C1917g c1917g, int i5, C1013c c1013c, C1679A c1679a, int i6) {
        int i7 = (i6 & 1) != 0 ? c1917g.f6487c : i5;
        C1013c c1013c2 = (i6 & 2) != 0 ? c1917g.f6488d : c1013c;
        C1679A c1679a2 = (i6 & 4) != 0 ? c1917g.f6489e : c1679a;
        int i8 = c1917g.f6490f;
        int i9 = c1917g.f6491g;
        int i10 = c1917g.f6492h;
        C1692b c1692b = c1917g.f6493i;
        C1696f c1696f = c1917g.f6494j;
        C0066i0 c0066i0 = c1917g.f6495k;
        C1692b c1692b2 = c1917g.f6496l;
        C1692b c1692b3 = c1917g.f6497m;
        HostnameVerifier hostnameVerifier = c1917g.f6498n;
        C1692b c1692b4 = c1917g.f6499o;
        ProxySelector proxySelector = c1917g.f6500p;
        boolean z5 = c1917g.f6501q;
        SocketFactory socketFactory = c1917g.f6502r;
        int i11 = i7;
        SSLSocketFactory sSLSocketFactory = c1917g.f6503s;
        X509TrustManager x509TrustManager = c1917g.f6504t;
        AbstractC0797o abstractC0797o = c1917g.f6505u;
        AbstractC1665j.m2985e(c1679a2, "request");
        AbstractC1665j.m2985e(c1692b, "authenticator");
        AbstractC1665j.m2985e(c1696f, "certificatePinner");
        AbstractC1665j.m2985e(c0066i0, "connectionPool");
        AbstractC1665j.m2985e(c1692b2, "cookieJar");
        AbstractC1665j.m2985e(c1692b3, "dns");
        AbstractC1665j.m2985e(hostnameVerifier, "hostnameVerifier");
        AbstractC1665j.m2985e(c1692b4, "proxyAuthenticator");
        AbstractC1665j.m2985e(proxySelector, "proxySelector");
        AbstractC1665j.m2985e(socketFactory, "socketFactory");
        return new C1917g(c1917g.f6485a, c1917g.f6486b, i11, c1013c2, c1679a2, i8, i9, i10, c1692b, c1696f, c0066i0, c1692b2, c1692b3, hostnameVerifier, c1692b4, proxySelector, z5, socketFactory, sSLSocketFactory, x509TrustManager, abstractC0797o);
    }

    /* JADX INFO: renamed from: b */
    public final C1684F m3409b(C1679A c1679a) {
        AbstractC1665j.m2985e(c1679a, "request");
        ArrayList arrayList = this.f6486b;
        int size = arrayList.size();
        int i5 = this.f6487c;
        if (i5 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f6506v++;
        C1013c c1013c = this.f6488d;
        if (c1013c != null) {
            if (!((InterfaceC1862g) c1013c.f3130c).mo3118h().m3368e(c1679a.f5712a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i5 - 1) + " must retain the same host and port").toString());
            }
            if (this.f6506v != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i5 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i6 = i5 + 1;
        C1917g c1917gM3408a = m3408a(this, i6, null, c1679a, 2097146);
        InterfaceC1710t interfaceC1710t = (InterfaceC1710t) arrayList.get(i5);
        C1684F c1684fMo1903a = interfaceC1710t.mo1903a(c1917gM3408a);
        if (c1684fMo1903a == null) {
            throw new NullPointerException("interceptor " + interfaceC1710t + " returned null");
        }
        if (c1013c == null || i6 >= arrayList.size() || c1917gM3408a.f6506v == 1) {
            return c1684fMo1903a;
        }
        throw new IllegalStateException(("network interceptor " + interfaceC1710t + " must call proceed() exactly once").toString());
    }
}
