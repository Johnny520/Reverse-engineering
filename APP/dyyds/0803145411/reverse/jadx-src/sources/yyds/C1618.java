package yyds;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: yyds.ᛷᛸᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1618 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C0082 f8234;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final List f8235;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2342 f8236;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0135 f8237;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final SocketFactory f8238;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final ProxySelector f8239;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final List f8240;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final SSLSocketFactory f8241;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final InterfaceC2656 f8242;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final HostnameVerifier f8243;

    public C1618(String str, int i, C0135 c0135, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C2342 c2342, InterfaceC2656 interfaceC2656, List list, List list2, ProxySelector proxySelector) {
        this.f8237 = c0135;
        this.f8238 = socketFactory;
        this.f8241 = sSLSocketFactory;
        this.f8243 = hostnameVerifier;
        this.f8236 = c2342;
        this.f8242 = interfaceC2656;
        this.f8239 = proxySelector;
        C0074 c0074 = new C0074();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c0074.f644 = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                C0188.m798("unexpected scheme: ".concat(str2));
                throw null;
            }
            c0074.f644 = "https";
        }
        String strM1185 = AbstractC0425.m1185(AbstractC0879.m1967(0, 0, 7, str));
        if (strM1185 == null) {
            C0188.m798("unexpected host: ".concat(str));
            throw null;
        }
        c0074.f645 = strM1185;
        if (1 > i || i >= 65536) {
            C0188.m806(AbstractC0897.m1989(i, "unexpected port: "));
            throw null;
        }
        c0074.f642 = i;
        this.f8234 = c0074.m462();
        this.f8235 = AbstractC0795.m1807(list);
        this.f8240 = AbstractC0795.m1807(list2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1618)) {
            return false;
        }
        C1618 c1618 = (C1618) obj;
        return this.f8234.equals(c1618.f8234) && m3314(c1618);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f8236) + ((Objects.hashCode(this.f8243) + ((Objects.hashCode(this.f8241) + ((this.f8239.hashCode() + ((this.f8240.hashCode() + ((this.f8235.hashCode() + ((this.f8242.hashCode() + ((this.f8237.hashCode() + AbstractC0897.m1997(this.f8234.f663, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C0082 c0082 = this.f8234;
        sb.append(c0082.f670);
        sb.append(':');
        sb.append(c0082.f664);
        sb.append(", ");
        sb.append("proxySelector=" + this.f8239);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m3314(C1618 c1618) {
        return AbstractC1544.m3188(this.f8237, c1618.f8237) && AbstractC1544.m3188(this.f8242, c1618.f8242) && this.f8235.equals(c1618.f8235) && this.f8240.equals(c1618.f8240) && AbstractC1544.m3188(this.f8239, c1618.f8239) && AbstractC1544.m3188(this.f8241, c1618.f8241) && AbstractC1544.m3188(this.f8243, c1618.f8243) && AbstractC1544.m3188(this.f8236, c1618.f8236) && this.f8234.f664 == c1618.f8234.f664;
    }
}
