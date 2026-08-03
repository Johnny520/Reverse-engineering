package okhttp3;

import gg.AbstractC1416l;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p276sf.InterfaceC3954a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Address {
    private final CertificatePinner certificatePinner;
    private final List<ConnectionSpec> connectionSpecs;
    private final Dns dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final HttpUrl url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Address(String str, int i9, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        str.getClass();
        dns.getClass();
        socketFactory.getClass();
        authenticator.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i9).build();
        this.protocols = Util.toImmutableList(list);
        this.connectionSpecs = Util.toImmutableList(list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m10927deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m10928deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m10929deprecated_dns() {
        return this.dns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m10930deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m10931deprecated_protocols() {
        return this.protocols;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m10932deprecated_proxy() {
        return this.proxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m10933deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m10934deprecated_proxySelector() {
        return this.proxySelector;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m10935deprecated_socketFactory() {
        return this.socketFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m10936deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m10937deprecated_url() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Dns dns() {
        return this.dns;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return AbstractC1416l.m3825a(this.url, address.url) && equalsNonHost$okhttp(address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equalsNonHost$okhttp(Address address) {
        address.getClass();
        return AbstractC1416l.m3825a(this.dns, address.dns) && AbstractC1416l.m3825a(this.proxyAuthenticator, address.proxyAuthenticator) && AbstractC1416l.m3825a(this.protocols, address.protocols) && AbstractC1416l.m3825a(this.connectionSpecs, address.connectionSpecs) && AbstractC1416l.m3825a(this.proxySelector, address.proxySelector) && AbstractC1416l.m3825a(this.proxy, address.proxy) && AbstractC1416l.m3825a(this.sslSocketFactory, address.sslSocketFactory) && AbstractC1416l.m3825a(this.hostnameVerifier, address.hostnameVerifier) && AbstractC1416l.m3825a(this.certificatePinner, address.certificatePinner) && this.url.port() == address.url.port();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + AbstractC2091b.m5158e(this.connectionSpecs, AbstractC2091b.m5158e(this.protocols, (this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + 527) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Proxy proxy() {
        return this.proxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder("Address{");
        sb3.append(this.url.host());
        sb3.append(':');
        sb3.append(this.url.port());
        sb3.append(", ");
        if (this.proxy != null) {
            sb2 = new StringBuilder("proxy=");
            obj = this.proxy;
        } else {
            sb2 = new StringBuilder("proxySelector=");
            obj = this.proxySelector;
        }
        sb2.append(obj);
        return AbstractC0921a.m2254q(sb3, sb2.toString(), '}');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HttpUrl url() {
        return this.url;
    }
}
