package okhttp3;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p172l8.InterfaceC4691e;
import p299ub.AbstractC8621f0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\rJ\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u000eJ\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u0018"}, m16758d2 = {"Lokhttp3/Route;", _UrlKt.FRAGMENT_ENCODE_SET, "address", "Lokhttp3/Address;", "proxy", "Ljava/net/Proxy;", "socketAddress", "Ljava/net/InetSocketAddress;", "<init>", "(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "()Lokhttp3/Address;", "()Ljava/net/Proxy;", "()Ljava/net/InetSocketAddress;", "-deprecated_address", "-deprecated_proxy", "-deprecated_socketAddress", "requiresTunnel", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "other", "hashCode", _UrlKt.FRAGMENT_ENCODE_SET, "toString", _UrlKt.FRAGMENT_ENCODE_SET, "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class Route {
    private final Address address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        address.getClass();
        proxy.getClass();
        inetSocketAddress.getClass();
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_address, reason: not valid java name and from getter */
    public final Address getAddress() {
        return this.address;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @InterfaceC4691e
    /* JADX INFO: renamed from: -deprecated_socketAddress, reason: not valid java name and from getter */
    public final InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Route)) {
            return false;
        }
        Route route = (Route) other;
        return AbstractC1061t.m3842c(route.address, this.address) && AbstractC1061t.m3842c(route.proxy, this.proxy) && AbstractC1061t.m3842c(route.socketAddress, this.socketAddress);
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        if (this.proxy.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.address.sslSocketFactory() != null || this.address.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE);
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    public String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        String strHost = this.address.url().host();
        InetAddress address = this.socketAddress.getAddress();
        String canonicalHost = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : _HostnamesCommonKt.toCanonicalHost(hostAddress);
        if (AbstractC8621f0.m33124Z(strHost, ':', false, 2, null)) {
            sb2.append("[");
            sb2.append(strHost);
            sb2.append("]");
        } else {
            sb2.append(strHost);
        }
        if (this.address.url().port() != this.socketAddress.getPort() || AbstractC1061t.m3842c(strHost, canonicalHost)) {
            sb2.append(":");
            sb2.append(this.address.url().port());
        }
        if (!AbstractC1061t.m3842c(strHost, canonicalHost)) {
            if (AbstractC1061t.m3842c(this.proxy, Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (canonicalHost == null) {
                sb2.append("<unresolved>");
            } else if (AbstractC8621f0.m33124Z(canonicalHost, ':', false, 2, null)) {
                sb2.append("[");
                sb2.append(canonicalHost);
                sb2.append("]");
            } else {
                sb2.append(canonicalHost);
            }
            sb2.append(":");
            sb2.append(this.socketAddress.getPort());
        }
        return sb2.toString();
    }
}
