package p000;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hb2 {

    /* JADX INFO: renamed from: a */
    public final C0605q5 f3944a;

    /* JADX INFO: renamed from: b */
    public final Proxy f3945b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f3946c;

    public hb2(C0605q5 c0605q5, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.f3944a = c0605q5;
        this.f3945b = proxy;
        this.f3946c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hb2)) {
            return false;
        }
        hb2 hb2Var = (hb2) obj;
        return hb2Var.f3944a.equals(this.f3944a) && hb2Var.f3945b.equals(this.f3945b) && t11.m5086l(hb2Var.f3946c, this.f3946c);
    }

    public final int hashCode() {
        return this.f3946c.hashCode() + ((this.f3945b.hashCode() + ((this.f3944a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        yw0 yw0Var = this.f3944a.f8739i;
        String str = yw0Var.f13644d;
        InetSocketAddress inetSocketAddress = this.f3946c;
        InetAddress address = inetSocketAddress.getAddress();
        String strM4866b = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : sg3.m4866b(hostAddress);
        if (pv2.m3996i0(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (yw0Var.f13645e != inetSocketAddress.getPort() || str.equals(strM4866b)) {
            sb.append(":");
            sb.append(yw0Var.f13645e);
        }
        if (!str.equals(strM4866b)) {
            if (this.f3945b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strM4866b == null) {
                sb.append("<unresolved>");
            } else if (pv2.m3996i0(strM4866b, ':')) {
                sb.append("[");
                sb.append(strM4866b);
                sb.append("]");
            } else {
                sb.append(strM4866b);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
