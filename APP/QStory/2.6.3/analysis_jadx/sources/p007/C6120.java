package p007;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import p013.AbstractC6226;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6120 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InetSocketAddress f16700;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Proxy f16701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6139 f16702;

    public C6120(C6139 c6139, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.f16702 = c6139;
        this.f16701 = proxy;
        this.f16700 = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6120)) {
            return false;
        }
        C6120 c6120 = (C6120) obj;
        return c6120.f16702.equals(this.f16702) && c6120.f16701.equals(this.f16701) && AbstractC4395.m8907(c6120.f16700, this.f16700);
    }

    public final int hashCode() {
        return this.f16700.hashCode() + ((this.f16701.hashCode() + ((this.f16702.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C6149 c6149 = this.f16702.f16815;
        String str = c6149.f16881;
        InetSocketAddress inetSocketAddress = this.f16700;
        InetAddress address = inetSocketAddress.getAddress();
        String strM11689 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : AbstractC6226.m11689(hostAddress);
        if (AbstractC5144.m10163(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (c6149.f16880 != inetSocketAddress.getPort() || str.equals(strM11689)) {
            sb.append(":");
            sb.append(c6149.f16880);
        }
        if (!str.equals(strM11689)) {
            if (this.f16701.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strM11689 == null) {
                sb.append("<unresolved>");
            } else if (AbstractC5144.m10163(strM11689, ':')) {
                sb.append("[");
                sb.append(strM11689);
                sb.append("]");
            } else {
                sb.append(strM11689);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
