package p023;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import p029.AbstractC7055;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6949 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InetSocketAddress f17045;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Proxy f17046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6968 f17047;

    public C6949(C6968 c6968, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.f17047 = c6968;
        this.f17046 = proxy;
        this.f17045 = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6949)) {
            return false;
        }
        C6949 c6949 = (C6949) obj;
        return c6949.f17047.equals(this.f17047) && c6949.f17046.equals(this.f17046) && AbstractC5227.m9466(c6949.f17045, this.f17045);
    }

    public final int hashCode() {
        return this.f17045.hashCode() + ((this.f17046.hashCode() + ((this.f17047.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C6978 c6978 = this.f17047.f17160;
        String str = c6978.f17226;
        InetSocketAddress inetSocketAddress = this.f17045;
        InetAddress address = inetSocketAddress.getAddress();
        String strM12248 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : AbstractC7055.m12248(hostAddress);
        if (AbstractC5976.m10722(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (c6978.f17225 != inetSocketAddress.getPort() || str.equals(strM12248)) {
            sb.append(":");
            sb.append(c6978.f17225);
        }
        if (!str.equals(strM12248)) {
            if (this.f17046.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strM12248 == null) {
                sb.append("<unresolved>");
            } else if (AbstractC5976.m10722(strM12248, ':')) {
                sb.append("[");
                sb.append(strM12248);
                sb.append("]");
            } else {
                sb.append(strM12248);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
