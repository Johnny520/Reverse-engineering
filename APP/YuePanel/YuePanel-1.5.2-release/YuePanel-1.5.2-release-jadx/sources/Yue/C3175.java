package Yue;

import Yue.C5385;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3175 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC4479 f109;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final SocketFactory f110;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final SSLSocketFactory f4748;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final HostnameVerifier f4749;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final C3686 f4750;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3466 f4751;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6489
    public final Proxy f4752;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public final ProxySelector f4753;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C5385 f4754;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final List<EnumC6835> f4755;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final List<C4110> f4756;

    public C3175(@InterfaceC6399 String str, int i, @InterfaceC6399 InterfaceC4479 interfaceC4479, @InterfaceC6399 SocketFactory socketFactory, @InterfaceC6489 SSLSocketFactory sSLSocketFactory, @InterfaceC6489 HostnameVerifier hostnameVerifier, @InterfaceC6489 C3686 c3686, @InterfaceC6399 InterfaceC3466 interfaceC3466, @InterfaceC6489 Proxy proxy, @InterfaceC6399 List<? extends EnumC6835> list, @InterfaceC6399 List<C4110> list2, @InterfaceC6399 ProxySelector proxySelector) {
        C5499.m17103(str, "uriHost");
        C5499.m17103(interfaceC4479, "dns");
        C5499.m17103(socketFactory, "socketFactory");
        C5499.m17103(interfaceC3466, "proxyAuthenticator");
        C5499.m17103(list, "protocols");
        C5499.m17103(list2, "connectionSpecs");
        C5499.m17103(proxySelector, "proxySelector");
        this.f109 = interfaceC4479;
        this.f110 = socketFactory;
        this.f4748 = sSLSocketFactory;
        this.f4749 = hostnameVerifier;
        this.f4750 = c3686;
        this.f4751 = interfaceC3466;
        this.f4752 = proxy;
        this.f4753 = proxySelector;
        this.f4754 = new C5385.C0735().m16830(sSLSocketFactory != null ? "https" : "http").m16815(str).m16821(i).m16799();
        this.f4755 = C8158.m26889(list);
        this.f4756 = C8158.m26889(list2);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C3175) {
            C3175 c3175 = (C3175) obj;
            if (C5499.m17094(this.f4754, c3175.f4754) && m6506(c3175)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f4754.hashCode()) * 31) + this.f109.hashCode()) * 31) + this.f4751.hashCode()) * 31) + this.f4755.hashCode()) * 31) + this.f4756.hashCode()) * 31) + this.f4753.hashCode()) * 31) + Objects.hashCode(this.f4752)) * 31) + Objects.hashCode(this.f4748)) * 31) + Objects.hashCode(this.f4749)) * 31) + Objects.hashCode(this.f4750);
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f4754.m16772());
        sb2.append(':');
        sb2.append(this.f4754.m16779());
        sb2.append(", ");
        if (this.f4752 != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.f4752;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.f4753;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append(C6193.f1885);
        return sb2.toString();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "certificatePinner", imports = {}))
    @InterfaceC5572(name = "-deprecated_certificatePinner")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final C3686 m246() {
        return this.f4750;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "connectionSpecs", imports = {}))
    @InterfaceC5572(name = "-deprecated_connectionSpecs")
    /* JADX INFO: renamed from: ۥ۟ */
    public final List<C4110> m247() {
        return this.f4756;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "dns", imports = {}))
    @InterfaceC5572(name = "-deprecated_dns")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC4479 m6494() {
        return this.f109;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "hostnameVerifier", imports = {}))
    @InterfaceC5572(name = "-deprecated_hostnameVerifier")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final HostnameVerifier m6495() {
        return this.f4749;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "protocols", imports = {}))
    @InterfaceC5572(name = "-deprecated_protocols")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final List<EnumC6835> m6496() {
        return this.f4755;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "proxy", imports = {}))
    @InterfaceC5572(name = "-deprecated_proxy")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Proxy m6497() {
        return this.f4752;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "proxyAuthenticator", imports = {}))
    @InterfaceC5572(name = "-deprecated_proxyAuthenticator")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final InterfaceC3466 m6498() {
        return this.f4751;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "proxySelector", imports = {}))
    @InterfaceC5572(name = "-deprecated_proxySelector")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final ProxySelector m6499() {
        return this.f4753;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "socketFactory", imports = {}))
    @InterfaceC5572(name = "-deprecated_socketFactory")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final SocketFactory m6500() {
        return this.f110;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "sslSocketFactory", imports = {}))
    @InterfaceC5572(name = "-deprecated_sslSocketFactory")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final SSLSocketFactory m6501() {
        return this.f4748;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "url", imports = {}))
    @InterfaceC5572(name = "-deprecated_url")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final C5385 m6502() {
        return this.f4754;
    }

    @InterfaceC5572(name = "certificatePinner")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final C3686 m6503() {
        return this.f4750;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "connectionSpecs")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final List<C4110> m6504() {
        return this.f4756;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "dns")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final InterfaceC4479 m6505() {
        return this.f109;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m6506(@InterfaceC6399 C3175 c3175) {
        C5499.m17103(c3175, "that");
        return C5499.m17094(this.f109, c3175.f109) && C5499.m17094(this.f4751, c3175.f4751) && C5499.m17094(this.f4755, c3175.f4755) && C5499.m17094(this.f4756, c3175.f4756) && C5499.m17094(this.f4753, c3175.f4753) && C5499.m17094(this.f4752, c3175.f4752) && C5499.m17094(this.f4748, c3175.f4748) && C5499.m17094(this.f4749, c3175.f4749) && C5499.m17094(this.f4750, c3175.f4750) && this.f4754.m16779() == c3175.f4754.m16779();
    }

    @InterfaceC5572(name = "hostnameVerifier")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final HostnameVerifier m6507() {
        return this.f4749;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "protocols")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final List<EnumC6835> m6508() {
        return this.f4755;
    }

    @InterfaceC5572(name = "proxy")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final Proxy m6509() {
        return this.f4752;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "proxyAuthenticator")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final InterfaceC3466 m6510() {
        return this.f4751;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "proxySelector")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final ProxySelector m6511() {
        return this.f4753;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "socketFactory")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final SocketFactory m6512() {
        return this.f110;
    }

    @InterfaceC5572(name = "sslSocketFactory")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final SSLSocketFactory m6513() {
        return this.f4748;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "url")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final C5385 m6514() {
        return this.f4754;
    }
}
