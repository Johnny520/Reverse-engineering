package p118X3;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1773d;
import p123Y3.AbstractC1776g;
import p202m4.AbstractC2617a;

/* JADX INFO: renamed from: X3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1691a {

    /* JADX INFO: renamed from: a */
    public final C1692b f5775a;

    /* JADX INFO: renamed from: b */
    public final SocketFactory f5776b;

    /* JADX INFO: renamed from: c */
    public final SSLSocketFactory f5777c;

    /* JADX INFO: renamed from: d */
    public final HostnameVerifier f5778d;

    /* JADX INFO: renamed from: e */
    public final C1696f f5779e;

    /* JADX INFO: renamed from: f */
    public final C1692b f5780f;

    /* JADX INFO: renamed from: g */
    public final ProxySelector f5781g;

    /* JADX INFO: renamed from: h */
    public final C1709s f5782h;

    /* JADX INFO: renamed from: i */
    public final List f5783i;

    /* JADX INFO: renamed from: j */
    public final List f5784j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1691a(String str, int i5, C1692b c1692b, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C1696f c1696f, C1692b c1692b2, List list, List list2, ProxySelector proxySelector) {
        AbstractC1665j.m2985e(str, "uriHost");
        AbstractC1665j.m2985e(c1692b, "dns");
        AbstractC1665j.m2985e(socketFactory, "socketFactory");
        AbstractC1665j.m2985e(c1692b2, "proxyAuthenticator");
        AbstractC1665j.m2985e(list, "protocols");
        AbstractC1665j.m2985e(list2, "connectionSpecs");
        AbstractC1665j.m2985e(proxySelector, "proxySelector");
        this.f5775a = c1692b;
        this.f5776b = socketFactory;
        this.f5777c = sSLSocketFactory;
        this.f5778d = hostnameVerifier;
        this.f5779e = c1696f;
        this.f5780f = c1692b2;
        this.f5781g = proxySelector;
        C1708r c1708r = new C1708r();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c1708r.f5860a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c1708r.f5860a = "https";
        }
        String strM3159b = AbstractC1773d.m3159b(AbstractC2617a.m4570d(str, 0, 0, 7));
        if (strM3159b == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c1708r.f5863d = strM3159b;
        if (1 > i5 || i5 >= 65536) {
            throw new IllegalArgumentException(AbstractC0231b.m398i("unexpected port: ", i5).toString());
        }
        c1708r.f5864e = i5;
        this.f5782h = c1708r.m3043a();
        this.f5783i = AbstractC1776g.m3182i(list);
        this.f5784j = AbstractC1776g.m3182i(list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m3007a(C1691a c1691a) {
        AbstractC1665j.m2985e(c1691a, "that");
        return AbstractC1665j.m2981a(this.f5775a, c1691a.f5775a) && AbstractC1665j.m2981a(this.f5780f, c1691a.f5780f) && AbstractC1665j.m2981a(this.f5783i, c1691a.f5783i) && AbstractC1665j.m2981a(this.f5784j, c1691a.f5784j) && AbstractC1665j.m2981a(this.f5781g, c1691a.f5781g) && AbstractC1665j.m2981a(this.f5777c, c1691a.f5777c) && AbstractC1665j.m2981a(this.f5778d, c1691a.f5778d) && AbstractC1665j.m2981a(this.f5779e, c1691a.f5779e) && this.f5782h.f5872e == c1691a.f5782h.f5872e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1691a)) {
            return false;
        }
        C1691a c1691a = (C1691a) obj;
        return AbstractC1665j.m2981a(this.f5782h, c1691a.f5782h) && m3007a(c1691a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hashCode(this.f5779e) + ((Objects.hashCode(this.f5778d) + ((Objects.hashCode(this.f5777c) + ((this.f5781g.hashCode() + ((this.f5784j.hashCode() + ((this.f5783i.hashCode() + ((this.f5780f.hashCode() + ((this.f5775a.hashCode() + AbstractC0231b.m394e(527, 31, this.f5782h.f5876i)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C1709s c1709s = this.f5782h;
        sb.append(c1709s.f5871d);
        sb.append(':');
        sb.append(c1709s.f5872e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f5781g);
        sb.append('}');
        return sb.toString();
    }
}
