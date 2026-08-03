package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Address {
    private final okhttp3.CertificatePinner certificatePinner;
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    private final okhttp3.Dns dns;
    private final javax.net.ssl.HostnameVerifier hostnameVerifier;
    private final java.util.List<okhttp3.Protocol> protocols;
    private final java.net.Proxy proxy;
    private final okhttp3.Authenticator proxyAuthenticator;
    private final java.net.ProxySelector proxySelector;
    private final javax.net.SocketFactory socketFactory;
    private final javax.net.ssl.SSLSocketFactory sslSocketFactory;
    private final okhttp3.HttpUrl url;

    public Address(java.lang.String r1, int r2, okhttp3.Dns r3, javax.net.SocketFactory r4, javax.net.ssl.SSLSocketFactory r5, javax.net.ssl.HostnameVerifier r6, okhttp3.CertificatePinner r7, okhttp3.Authenticator r8, java.net.Proxy r9, java.util.List<? extends okhttp3.Protocol> r10, java.util.List<okhttp3.ConnectionSpec> r11, java.net.ProxySelector r12) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r4.getClass()
            r8.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r0.<init>()
            r0.dns = r3
            r0.socketFactory = r4
            r0.sslSocketFactory = r5
            r0.hostnameVerifier = r6
            r0.certificatePinner = r7
            r0.proxyAuthenticator = r8
            r0.proxy = r9
            r0.proxySelector = r12
            okhttp3.HttpUrl$Builder r3 = new okhttp3.HttpUrl$Builder
            r3.<init>()
            if (r5 == 0) goto L32
            java.lang.String r4 = "https"
            goto L34
        L32:
            java.lang.String r4 = "http"
        L34:
            okhttp3.HttpUrl$Builder r3 = r3.scheme(r4)
            okhttp3.HttpUrl$Builder r1 = r3.host(r1)
            okhttp3.HttpUrl$Builder r1 = r1.port(r2)
            okhttp3.HttpUrl r1 = r1.build()
            r0.url = r1
            java.util.List r1 = okhttp3.internal.Util.toImmutableList(r10)
            r0.protocols = r1
            java.util.List r1 = okhttp3.internal.Util.toImmutableList(r11)
            r0.connectionSpecs = r1
            return
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final okhttp3.CertificatePinner m17deprecated_certificatePinner() {
            r1 = this;
            okhttp3.CertificatePinner r0 = r1.certificatePinner
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final java.util.List<okhttp3.ConnectionSpec> m18deprecated_connectionSpecs() {
            r1 = this;
            java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name */
    public final okhttp3.Dns m19deprecated_dns() {
            r1 = this;
            okhttp3.Dns r0 = r1.dns
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final javax.net.ssl.HostnameVerifier m20deprecated_hostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
    public final java.util.List<okhttp3.Protocol> m21deprecated_protocols() {
            r1 = this;
            java.util.List<okhttp3.Protocol> r0 = r1.protocols
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name */
    public final java.net.Proxy m22deprecated_proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final okhttp3.Authenticator m23deprecated_proxyAuthenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.proxyAuthenticator
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final java.net.ProxySelector m24deprecated_proxySelector() {
            r1 = this;
            java.net.ProxySelector r0 = r1.proxySelector
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final javax.net.SocketFactory m25deprecated_socketFactory() {
            r1 = this;
            javax.net.SocketFactory r0 = r1.socketFactory
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final javax.net.ssl.SSLSocketFactory m26deprecated_sslSocketFactory() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactory
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final okhttp3.HttpUrl m27deprecated_url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }

    public final okhttp3.CertificatePinner certificatePinner() {
            r1 = this;
            okhttp3.CertificatePinner r0 = r1.certificatePinner
            return r0
    }

    public final java.util.List<okhttp3.ConnectionSpec> connectionSpecs() {
            r1 = this;
            java.util.List<okhttp3.ConnectionSpec> r0 = r1.connectionSpecs
            return r0
    }

    public final okhttp3.Dns dns() {
            r1 = this;
            okhttp3.Dns r0 = r1.dns
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Address
            if (r0 == 0) goto L18
            okhttp3.HttpUrl r0 = r2.url
            okhttp3.Address r3 = (okhttp3.Address) r3
            okhttp3.HttpUrl r1 = r3.url
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L18
            boolean r3 = r2.equalsNonHost$okhttp(r3)
            if (r3 == 0) goto L18
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    public final boolean equalsNonHost$okhttp(okhttp3.Address r3) {
            r2 = this;
            r3.getClass()
            okhttp3.Dns r0 = r2.dns
            okhttp3.Dns r1 = r3.dns
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L6d
            okhttp3.Authenticator r0 = r2.proxyAuthenticator
            okhttp3.Authenticator r1 = r3.proxyAuthenticator
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L6d
            java.util.List<okhttp3.Protocol> r0 = r2.protocols
            java.util.List<okhttp3.Protocol> r1 = r3.protocols
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L6d
            java.util.List<okhttp3.ConnectionSpec> r0 = r2.connectionSpecs
            java.util.List<okhttp3.ConnectionSpec> r1 = r3.connectionSpecs
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L6d
            java.net.ProxySelector r0 = r2.proxySelector
            java.net.ProxySelector r1 = r3.proxySelector
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L6d
            java.net.Proxy r0 = r2.proxy
            java.net.Proxy r1 = r3.proxy
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L6d
            javax.net.ssl.SSLSocketFactory r0 = r2.sslSocketFactory
            javax.net.ssl.SSLSocketFactory r1 = r3.sslSocketFactory
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L6d
            javax.net.ssl.HostnameVerifier r0 = r2.hostnameVerifier
            javax.net.ssl.HostnameVerifier r1 = r3.hostnameVerifier
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L6d
            okhttp3.CertificatePinner r0 = r2.certificatePinner
            okhttp3.CertificatePinner r1 = r3.certificatePinner
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L6d
            okhttp3.HttpUrl r0 = r2.url
            int r0 = r0.port()
            okhttp3.HttpUrl r3 = r3.url
            int r3 = r3.port()
            if (r0 != r3) goto L6d
            r3 = 1
            return r3
        L6d:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r3 = this;
            okhttp3.HttpUrl r0 = r3.url
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            r1 = 31
            int r0 = r0 * r1
            okhttp3.Dns r2 = r3.dns
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            okhttp3.Authenticator r0 = r3.proxyAuthenticator
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.List<okhttp3.Protocol> r2 = r3.protocols
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List<okhttp3.ConnectionSpec> r2 = r3.connectionSpecs
            int r0 = j8.b.e(r2, r0, r1)
            java.net.ProxySelector r2 = r3.proxySelector
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.net.Proxy r0 = r3.proxy
            int r0 = java.util.Objects.hashCode(r0)
            int r0 = r0 + r2
            int r0 = r0 * r1
            javax.net.ssl.SSLSocketFactory r2 = r3.sslSocketFactory
            int r2 = java.util.Objects.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            javax.net.ssl.HostnameVerifier r0 = r3.hostnameVerifier
            int r0 = java.util.Objects.hashCode(r0)
            int r0 = r0 + r2
            int r0 = r0 * r1
            okhttp3.CertificatePinner r1 = r3.certificatePinner
            int r1 = java.util.Objects.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final javax.net.ssl.HostnameVerifier hostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.hostnameVerifier
            return r0
    }

    public final java.util.List<okhttp3.Protocol> protocols() {
            r1 = this;
            java.util.List<okhttp3.Protocol> r0 = r1.protocols
            return r0
    }

    public final java.net.Proxy proxy() {
            r1 = this;
            java.net.Proxy r0 = r1.proxy
            return r0
    }

    public final okhttp3.Authenticator proxyAuthenticator() {
            r1 = this;
            okhttp3.Authenticator r0 = r1.proxyAuthenticator
            return r0
    }

    public final java.net.ProxySelector proxySelector() {
            r1 = this;
            java.net.ProxySelector r0 = r1.proxySelector
            return r0
    }

    public final javax.net.SocketFactory socketFactory() {
            r1 = this;
            javax.net.SocketFactory r0 = r1.socketFactory
            return r0
    }

    public final javax.net.ssl.SSLSocketFactory sslSocketFactory() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.sslSocketFactory
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Address{"
            r0.<init>(r1)
            okhttp3.HttpUrl r1 = r3.url
            java.lang.String r1 = r1.host()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            okhttp3.HttpUrl r1 = r3.url
            int r1 = r1.port()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.net.Proxy r1 = r3.proxy
            if (r1 == 0) goto L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "proxy="
            r1.<init>(r2)
            java.net.Proxy r2 = r3.proxy
        L30:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L42
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "proxySelector="
            r1.<init>(r2)
            java.net.ProxySelector r2 = r3.proxySelector
            goto L30
        L42:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }

    public final okhttp3.HttpUrl url() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.url
            return r0
    }
}
