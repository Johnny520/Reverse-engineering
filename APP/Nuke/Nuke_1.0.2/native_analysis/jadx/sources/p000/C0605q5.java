package p000;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: q5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0605q5 {

    /* JADX INFO: renamed from: a */
    public final na0 f8731a;

    /* JADX INFO: renamed from: b */
    public final SocketFactory f8732b;

    /* JADX INFO: renamed from: c */
    public final SSLSocketFactory f8733c;

    /* JADX INFO: renamed from: d */
    public final HostnameVerifier f8734d;

    /* JADX INFO: renamed from: e */
    public final C0102cq f8735e;

    /* JADX INFO: renamed from: f */
    public final gd3 f8736f;

    /* JADX INFO: renamed from: g */
    public final Proxy f8737g;

    /* JADX INFO: renamed from: h */
    public final ProxySelector f8738h;

    /* JADX INFO: renamed from: i */
    public final yw0 f8739i;

    /* JADX INFO: renamed from: j */
    public final List f8740j;

    /* JADX INFO: renamed from: k */
    public final List f8741k;

    public C0605q5(String str, int i, na0 na0Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0102cq c0102cq, gd3 gd3Var, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        na0Var.getClass();
        socketFactory.getClass();
        gd3Var.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.f8731a = na0Var;
        this.f8732b = socketFactory;
        this.f8733c = sSLSocketFactory;
        this.f8734d = hostnameVerifier;
        this.f8735e = c0102cq;
        this.f8736f = gd3Var;
        this.f8737g = proxy;
        this.f8738h = proxySelector;
        xw0 xw0Var = new xw0();
        xw0Var.m6198g(sSLSocketFactory != null ? "https" : "http");
        xw0Var.m6195d(str);
        if (1 > i || i >= 65536) {
            C0676s.m4645c(vi0.m5688g("unexpected port: ", i));
            throw null;
        }
        xw0Var.f13204e = i;
        this.f8739i = xw0Var.m6193b();
        this.f8740j = wg3.m5896i(list);
        this.f8741k = wg3.m5896i(list2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4054a(C0605q5 c0605q5) {
        c0605q5.getClass();
        return t11.m5086l(this.f8731a, c0605q5.f8731a) && t11.m5086l(this.f8736f, c0605q5.f8736f) && t11.m5086l(this.f8740j, c0605q5.f8740j) && t11.m5086l(this.f8741k, c0605q5.f8741k) && t11.m5086l(this.f8738h, c0605q5.f8738h) && t11.m5086l(this.f8737g, c0605q5.f8737g) && t11.m5086l(this.f8733c, c0605q5.f8733c) && t11.m5086l(this.f8734d, c0605q5.f8734d) && t11.m5086l(this.f8735e, c0605q5.f8735e) && this.f8739i.f13645e == c0605q5.f8739i.f13645e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0605q5)) {
            return false;
        }
        C0605q5 c0605q5 = (C0605q5) obj;
        return t11.m5086l(this.f8739i, c0605q5.f8739i) && m4054a(c0605q5);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f8735e) + ((Objects.hashCode(this.f8734d) + ((Objects.hashCode(this.f8733c) + ((Objects.hashCode(this.f8737g) + ((this.f8738h.hashCode() + ((this.f8741k.hashCode() + ((this.f8740j.hashCode() + ((this.f8736f.hashCode() + ((this.f8731a.hashCode() + hk1.m2207f(this.f8739i.f13649i, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        yw0 yw0Var = this.f8739i;
        sb.append(yw0Var.f13644d);
        sb.append(':');
        sb.append(yw0Var.f13645e);
        sb.append(", ");
        Proxy proxy = this.f8737g;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f8738h;
        }
        return hk1.m2210i(sb, str, '}');
    }
}
