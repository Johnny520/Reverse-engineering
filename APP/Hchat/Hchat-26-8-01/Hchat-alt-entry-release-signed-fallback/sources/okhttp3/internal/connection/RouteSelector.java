package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RouteSelector {
    public static final okhttp3.internal.connection.RouteSelector.Companion Companion = null;
    private final okhttp3.Address address;
    private final okhttp3.Call call;
    private final okhttp3.EventListener eventListener;
    private java.util.List<? extends java.net.InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final java.util.List<okhttp3.Route> postponedRoutes;
    private java.util.List<? extends java.net.Proxy> proxies;
    private final okhttp3.internal.connection.RouteDatabase routeDatabase;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.String getSocketHost(java.net.InetSocketAddress r2) {
                r1 = this;
                r2.getClass()
                java.net.InetAddress r0 = r2.getAddress()
                if (r0 != 0) goto L11
                java.lang.String r2 = r2.getHostName()
                r2.getClass()
                return r2
            L11:
                java.lang.String r2 = r0.getHostAddress()
                r2.getClass()
                return r2
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Selection {
        private int nextRouteIndex;
        private final java.util.List<okhttp3.Route> routes;

        public Selection(java.util.List<okhttp3.Route> r1) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.routes = r1
                return
        }

        public final java.util.List<okhttp3.Route> getRoutes() {
                r1 = this;
                java.util.List<okhttp3.Route> r0 = r1.routes
                return r0
        }

        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.nextRouteIndex
                java.util.List<okhttp3.Route> r1 = r2.routes
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public final okhttp3.Route next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L15
                java.util.List<okhttp3.Route> r0 = r3.routes
                int r1 = r3.nextRouteIndex
                int r2 = r1 + 1
                r3.nextRouteIndex = r2
                java.lang.Object r0 = r0.get(r1)
                okhttp3.Route r0 = (okhttp3.Route) r0
                return r0
            L15:
                bsh.j.e()
                r0 = 0
                return r0
        }
    }

    static {
            okhttp3.internal.connection.RouteSelector$Companion r0 = new okhttp3.internal.connection.RouteSelector$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.connection.RouteSelector.Companion = r0
            return
    }

    public RouteSelector(okhttp3.Address r1, okhttp3.internal.connection.RouteDatabase r2, okhttp3.Call r3, okhttp3.EventListener r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.address = r1
            r0.routeDatabase = r2
            r0.call = r3
            r0.eventListener = r4
            tf.t r2 = tf.t.f13167g
            r0.proxies = r2
            r0.inetSocketAddresses = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.postponedRoutes = r2
            okhttp3.HttpUrl r2 = r1.url()
            java.net.Proxy r1 = r1.proxy()
            r0.resetNextProxy(r2, r1)
            return
    }

    private final boolean hasNextProxy() {
            r2 = this;
            int r0 = r2.nextProxyIndex
            java.util.List<? extends java.net.Proxy> r1 = r2.proxies
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private final java.net.Proxy nextProxy() {
            r5 = this;
            boolean r0 = r5.hasNextProxy()
            if (r0 == 0) goto L18
            java.util.List<? extends java.net.Proxy> r0 = r5.proxies
            int r1 = r5.nextProxyIndex
            int r2 = r1 + 1
            r5.nextProxyIndex = r2
            java.lang.Object r0 = r0.get(r1)
            java.net.Proxy r0 = (java.net.Proxy) r0
            r5.resetNextInetSocketAddress(r0)
            return r0
        L18:
            java.net.SocketException r0 = new java.net.SocketException
            okhttp3.Address r1 = r5.address
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.host()
            java.util.List<? extends java.net.Proxy> r2 = r5.proxies
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No route to "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "; exhausted proxy configurations: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
    }

    private final void resetNextInetSocketAddress(java.net.Proxy r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.inetSocketAddresses = r0
            java.net.Proxy$Type r1 = r6.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.DIRECT
            if (r1 == r2) goto L37
            java.net.Proxy$Type r1 = r6.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.SOCKS
            if (r1 != r2) goto L18
            goto L37
        L18:
            java.net.SocketAddress r1 = r6.address()
            boolean r2 = r1 instanceof java.net.InetSocketAddress
            if (r2 == 0) goto L2d
            okhttp3.internal.connection.RouteSelector$Companion r2 = okhttp3.internal.connection.RouteSelector.Companion
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            java.lang.String r2 = r2.getSocketHost(r1)
            int r1 = r1.getPort()
            goto L4b
        L2d:
            java.lang.String r6 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.Class r0 = r1.getClass()
            j8.o.z(r0, r6)
            return
        L37:
            okhttp3.Address r1 = r5.address
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r2 = r1.host()
            okhttp3.Address r1 = r5.address
            okhttp3.HttpUrl r1 = r1.url()
            int r1 = r1.port()
        L4b:
            r3 = 1
            if (r3 > r1) goto Lc9
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r3) goto Lc9
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r3 = java.net.Proxy.Type.SOCKS
            if (r6 != r3) goto L62
            java.net.InetSocketAddress r6 = java.net.InetSocketAddress.createUnresolved(r2, r1)
            r0.add(r6)
            return
        L62:
            boolean r6 = okhttp3.internal.Util.canParseAsIpAddress(r2)
            if (r6 == 0) goto L71
            java.net.InetAddress r6 = java.net.InetAddress.getByName(r2)
            java.util.List r6 = a.a.x0(r6)
            goto L8f
        L71:
            okhttp3.EventListener r6 = r5.eventListener
            okhttp3.Call r3 = r5.call
            r6.dnsStart(r3, r2)
            okhttp3.Address r6 = r5.address
            okhttp3.Dns r6 = r6.dns()
            java.util.List r6 = r6.lookup(r2)
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto La9
            okhttp3.EventListener r3 = r5.eventListener
            okhttp3.Call r4 = r5.call
            r3.dnsEnd(r4, r2, r6)
        L8f:
            java.util.Iterator r6 = r6.iterator()
        L93:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto La8
            java.lang.Object r2 = r6.next()
            java.net.InetAddress r2 = (java.net.InetAddress) r2
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress
            r3.<init>(r2, r1)
            r0.add(r3)
            goto L93
        La8:
            return
        La9:
            java.net.UnknownHostException r6 = new java.net.UnknownHostException
            okhttp3.Address r0 = r5.address
            okhttp3.Dns r0 = r0.dns()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " returned no addresses for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        Lc9:
            java.net.SocketException r6 = new java.net.SocketException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "No route to "
            r0.<init>(r3)
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "; port is out of range"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    private final void resetNextProxy(okhttp3.HttpUrl r3, java.net.Proxy r4) {
            r2 = this;
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.Call r1 = r2.call
            r0.proxySelectStart(r1, r3)
            java.util.List r4 = resetNextProxy$selectProxies(r4, r3, r2)
            r2.proxies = r4
            r0 = 0
            r2.nextProxyIndex = r0
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.Call r1 = r2.call
            r0.proxySelectEnd(r1, r3, r4)
            return
    }

    private static final java.util.List<java.net.Proxy> resetNextProxy$selectProxies(java.net.Proxy r0, okhttp3.HttpUrl r1, okhttp3.internal.connection.RouteSelector r2) {
            if (r0 == 0) goto L7
            java.util.List r0 = a.a.x0(r0)
            return r0
        L7:
            java.net.URI r0 = r1.uri()
            java.lang.String r1 = r0.getHost()
            if (r1 != 0) goto L1c
            java.net.Proxy r0 = java.net.Proxy.NO_PROXY
            java.net.Proxy[] r0 = new java.net.Proxy[]{r0}
            java.util.List r0 = okhttp3.internal.Util.immutableListOf(r0)
            return r0
        L1c:
            okhttp3.Address r1 = r2.address
            java.net.ProxySelector r1 = r1.proxySelector()
            java.util.List r0 = r1.select(r0)
            if (r0 == 0) goto L37
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2f
            goto L37
        L2f:
            r0.getClass()
            java.util.List r0 = okhttp3.internal.Util.toImmutableList(r0)
            return r0
        L37:
            java.net.Proxy r0 = java.net.Proxy.NO_PROXY
            java.net.Proxy[] r0 = new java.net.Proxy[]{r0}
            java.util.List r0 = okhttp3.internal.Util.immutableListOf(r0)
            return r0
    }

    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNextProxy()
            if (r0 != 0) goto L11
            java.util.List<okhttp3.Route> r0 = r1.postponedRoutes
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }

    public final okhttp3.internal.connection.RouteSelector.Selection next() {
            r6 = this;
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lb:
            boolean r1 = r6.hasNextProxy()
            if (r1 == 0) goto L46
            java.net.Proxy r1 = r6.nextProxy()
            java.util.List<? extends java.net.InetSocketAddress> r2 = r6.inetSocketAddresses
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3
            okhttp3.Route r4 = new okhttp3.Route
            okhttp3.Address r5 = r6.address
            r4.<init>(r5, r1, r3)
            okhttp3.internal.connection.RouteDatabase r3 = r6.routeDatabase
            boolean r3 = r3.shouldPostpone(r4)
            if (r3 == 0) goto L3c
            java.util.List<okhttp3.Route> r3 = r6.postponedRoutes
            r3.add(r4)
            goto L1b
        L3c:
            r0.add(r4)
            goto L1b
        L40:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lb
        L46:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L56
            java.util.List<okhttp3.Route> r1 = r6.postponedRoutes
            tf.r.h1(r0, r1)
            java.util.List<okhttp3.Route> r1 = r6.postponedRoutes
            r1.clear()
        L56:
            okhttp3.internal.connection.RouteSelector$Selection r1 = new okhttp3.internal.connection.RouteSelector$Selection
            r1.<init>(r0)
            return r1
        L5c:
            bsh.j.e()
            r0 = 0
            return r0
    }
}
