package okhttp3.internal.connection;

import bsh.C0353j;
import gg.AbstractC1411g;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import p000a.AbstractC0000a;
import p136j8.C2104o;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RouteSelector {
    public static final Companion Companion = new Companion(null);
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Selection(List<Route> list) {
            list.getClass();
            this.routes = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<Route> getRoutes() {
            return this.routes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Route next() {
            if (!hasNext()) {
                C0353j.m1307e();
                return null;
            }
            List<Route> list = this.routes;
            int i9 = this.nextRouteIndex;
            this.nextRouteIndex = i9 + 1;
            return list.get(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        address.getClass();
        routeDatabase.getClass();
        call.getClass();
        eventListener.getClass();
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        C4173t c4173t = C4173t.f13710g;
        this.proxies = c4173t;
        this.inetSocketAddresses = c4173t;
        this.postponedRoutes = new ArrayList();
        resetNextProxy(address.url(), address.proxy());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Proxy nextProxy() throws SocketException, UnknownHostException {
        if (hasNextProxy()) {
            List<? extends Proxy> list = this.proxies;
            int i9 = this.nextProxyIndex;
            this.nextProxyIndex = i9 + 1;
            Proxy proxy = list.get(i9);
            resetNextInetSocketAddress(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void resetNextInetSocketAddress(Proxy proxy) throws SocketException, UnknownHostException {
        String strHost;
        int iPort;
        List<InetAddress> listLookup;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strHost = this.address.url().host();
            iPort = this.address.url().port();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                C2104o.m5300z(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                return;
            } else {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strHost = Companion.getSocketHost(inetSocketAddress);
                iPort = inetSocketAddress.getPort();
            }
        }
        if (1 > iPort || iPort >= 65536) {
            throw new SocketException("No route to " + strHost + ':' + iPort + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strHost, iPort));
            return;
        }
        if (Util.canParseAsIpAddress(strHost)) {
            listLookup = AbstractC0000a.m99x0(InetAddress.getByName(strHost));
        } else {
            this.eventListener.dnsStart(this.call, strHost);
            listLookup = this.address.dns().lookup(strHost);
            if (listLookup.isEmpty()) {
                throw new UnknownHostException(this.address.dns() + " returned no addresses for " + strHost);
            }
            this.eventListener.dnsEnd(this.call, strHost, listLookup);
        }
        Iterator<InetAddress> it = listLookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), iPort));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
        this.eventListener.proxySelectStart(this.call, httpUrl);
        List<Proxy> listResetNextProxy$selectProxies = resetNextProxy$selectProxies(proxy, httpUrl, this);
        this.proxies = listResetNextProxy$selectProxies;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, httpUrl, listResetNextProxy$selectProxies);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final List<Proxy> resetNextProxy$selectProxies(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        if (proxy != null) {
            return AbstractC0000a.m99x0(proxy);
        }
        URI uri = httpUrl.uri();
        if (uri.getHost() == null) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = routeSelector.address.proxySelector().select(uri);
        if (listSelect == null || listSelect.isEmpty()) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        listSelect.getClass();
        return Util.toImmutableList(listSelect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean hasNext() {
        return hasNextProxy() || !this.postponedRoutes.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Selection next() {
        if (!hasNext()) {
            C0353j.m1307e();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (hasNextProxy()) {
            Proxy proxyNextProxy = nextProxy();
            Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                Route route = new Route(this.address, proxyNextProxy, it.next());
                if (this.routeDatabase.shouldPostpone(route)) {
                    this.postponedRoutes.add(route);
                } else {
                    arrayList.add(route);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC4171r.m8432h1(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new Selection(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.connection.RouteSelector.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            inetSocketAddress.getClass();
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                hostName.getClass();
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            hostAddress.getClass();
            return hostAddress;
        }

        private Companion() {
        }
    }
}
