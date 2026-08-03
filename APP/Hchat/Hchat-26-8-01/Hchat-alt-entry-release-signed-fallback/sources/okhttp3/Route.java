package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Route {
    private final okhttp3.Address address;
    private final java.net.Proxy proxy;
    private final java.net.InetSocketAddress socketAddress;

    public Route(okhttp3.Address r1, java.net.Proxy r2, java.net.InetSocketAddress r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.address = r1
            r0.proxy = r2
            r0.socketAddress = r3
            return
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_address, reason: not valid java name */
    public final okhttp3.Address m147deprecated_address() {
            r1 = this;
            okhttp3.Address r0 = r1.address
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name */
    public final java.net.Proxy m148deprecated_proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final java.net.InetSocketAddress m149deprecated_socketAddress() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.socketAddress
            return r0
    }

    public final okhttp3.Address address() {
            r1 = this;
            okhttp3.Address r0 = r1.address
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Route
            if (r0 == 0) goto L26
            okhttp3.Route r3 = (okhttp3.Route) r3
            okhttp3.Address r0 = r3.address
            okhttp3.Address r1 = r2.address
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L26
            java.net.Proxy r0 = r3.proxy
            java.net.Proxy r1 = r2.proxy
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L26
            java.net.InetSocketAddress r3 = r3.socketAddress
            java.net.InetSocketAddress r0 = r2.socketAddress
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L26
            r3 = 1
            return r3
        L26:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            okhttp3.Address r0 = r2.address
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            java.net.Proxy r1 = r2.proxy
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.InetSocketAddress r0 = r2.socketAddress
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.net.Proxy proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    public final boolean requiresTunnel() {
            r2 = this;
            okhttp3.Address r0 = r2.address
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactory()
            if (r0 == 0) goto L14
            java.net.Proxy r0 = r2.proxy
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final java.net.InetSocketAddress socketAddress() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.socketAddress
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Route{"
            r0.<init>(r1)
            java.net.InetSocketAddress r1 = r2.socketAddress
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
