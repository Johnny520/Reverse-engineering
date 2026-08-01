package p118X3;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1773d;
import p149d3.AbstractC1976d;

/* JADX INFO: renamed from: X3.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1688J {

    /* JADX INFO: renamed from: a */
    public final C1691a f5763a;

    /* JADX INFO: renamed from: b */
    public final Proxy f5764b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f5765c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1688J(C1691a c1691a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        AbstractC1665j.m2985e(inetSocketAddress, "socketAddress");
        this.f5763a = c1691a;
        this.f5764b = proxy;
        this.f5765c = inetSocketAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1688J)) {
            return false;
        }
        C1688J c1688j = (C1688J) obj;
        return AbstractC1665j.m2981a(c1688j.f5763a, this.f5763a) && AbstractC1665j.m2981a(c1688j.f5764b, this.f5764b) && AbstractC1665j.m2981a(c1688j.f5765c, this.f5765c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5765c.hashCode() + ((this.f5764b.hashCode() + ((this.f5763a.hashCode() + 527) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C1709s c1709s = this.f5763a.f5782h;
        String str = c1709s.f5871d;
        InetSocketAddress inetSocketAddress = this.f5765c;
        InetAddress address = inetSocketAddress.getAddress();
        String strM3159b = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : AbstractC1773d.m3159b(hostAddress);
        if (AbstractC1976d.m3628V(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (c1709s.f5872e != inetSocketAddress.getPort() || str.equals(strM3159b)) {
            sb.append(":");
            sb.append(c1709s.f5872e);
        }
        if (!str.equals(strM3159b)) {
            if (this.f5764b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strM3159b == null) {
                sb.append("<unresolved>");
            } else if (AbstractC1976d.m3628V(strM3159b, ':')) {
                sb.append("[");
                sb.append(strM3159b);
                sb.append("]");
            } else {
                sb.append(strM3159b);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
