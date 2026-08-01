package p015;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import p017.AbstractC6234;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6193 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InetSocketAddress f16939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Proxy f16940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6212 f16941;

    public C6193(C6212 c6212, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.f16941 = c6212;
        this.f16940 = proxy;
        this.f16939 = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6193)) {
            return false;
        }
        C6193 c6193 = (C6193) obj;
        return c6193.f16941.equals(this.f16941) && c6193.f16940.equals(this.f16940) && AbstractC4394.m8917(c6193.f16939, this.f16939);
    }

    public final int hashCode() {
        return this.f16939.hashCode() + ((this.f16940.hashCode() + ((this.f16941.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C6222 c6222 = this.f16941.f17054;
        String str = c6222.f17120;
        InetSocketAddress inetSocketAddress = this.f16939;
        InetAddress address = inetSocketAddress.getAddress();
        String strM11699 = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : AbstractC6234.m11699(hostAddress);
        if (AbstractC5143.m10172(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (c6222.f17119 != inetSocketAddress.getPort() || str.equals(strM11699)) {
            sb.append(":");
            sb.append(c6222.f17119);
        }
        if (!str.equals(strM11699)) {
            if (this.f16940.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strM11699 == null) {
                sb.append("<unresolved>");
            } else if (AbstractC5143.m10172(strM11699, ':')) {
                sb.append("[");
                sb.append(strM11699);
                sb.append("]");
            } else {
                sb.append(strM11699);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
