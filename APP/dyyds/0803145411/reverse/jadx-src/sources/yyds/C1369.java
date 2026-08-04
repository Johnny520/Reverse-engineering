package yyds;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: yyds.ᛶᛶᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1369 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1618 f6393;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Proxy f6394;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InetSocketAddress f6395;

    public C1369(C1618 c1618, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.f6393 = c1618;
        this.f6394 = proxy;
        this.f6395 = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1369)) {
            return false;
        }
        C1369 c1369 = (C1369) obj;
        return c1369.f6393.equals(this.f6393) && c1369.f6394.equals(this.f6394) && AbstractC1544.m3188(c1369.f6395, this.f6395);
    }

    public final int hashCode() {
        return this.f6395.hashCode() + ((this.f6394.hashCode() + ((this.f6393.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C0082 c0082 = this.f6393.f8234;
        String str = c0082.f670;
        InetSocketAddress inetSocketAddress = this.f6395;
        InetAddress address = inetSocketAddress.getAddress();
        String strM1185 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : AbstractC0425.m1185(hostAddress);
        if (AbstractC0473.m1295(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (c0082.f664 != inetSocketAddress.getPort() || str.equals(strM1185)) {
            sb.append(":");
            sb.append(c0082.f664);
        }
        if (!str.equals(strM1185)) {
            if (this.f6394.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strM1185 == null) {
                sb.append("<unresolved>");
            } else if (AbstractC0473.m1295(strM1185, ':')) {
                sb.append("[");
                sb.append(strM1185);
                sb.append("]");
            } else {
                sb.append(strM1185);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
