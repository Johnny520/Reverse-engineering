package Yue;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: Yue.ۥۣۡۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7184 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final C3175 f2722;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final Proxy f2723;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InetSocketAddress f21676;

    public C7184(@InterfaceC6399 C3175 c3175, @InterfaceC6399 Proxy proxy, @InterfaceC6399 InetSocketAddress inetSocketAddress) {
        C5499.m17103(c3175, "address");
        C5499.m17103(proxy, "proxy");
        C5499.m17103(inetSocketAddress, "socketAddress");
        this.f2722 = c3175;
        this.f2723 = proxy;
        this.f21676 = inetSocketAddress;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C7184) {
            C7184 c7184 = (C7184) obj;
            if (C5499.m17094(c7184.f2722, this.f2722) && C5499.m17094(c7184.f2723, this.f2723) && C5499.m17094(c7184.f21676, this.f21676)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f2722.hashCode()) * 31) + this.f2723.hashCode()) * 31) + this.f21676.hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return "Route{" + this.f21676 + C6193.f1885;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "address", imports = {}))
    @InterfaceC5572(name = "-deprecated_address")
    /* JADX INFO: renamed from: ۥ */
    public final C3175 m3468() {
        return this.f2722;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "proxy", imports = {}))
    @InterfaceC5572(name = "-deprecated_proxy")
    /* JADX INFO: renamed from: ۥ۟ */
    public final Proxy m3469() {
        return this.f2723;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "socketAddress", imports = {}))
    @InterfaceC5572(name = "-deprecated_socketAddress")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InetSocketAddress m22503() {
        return this.f21676;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "address")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C3175 m22504() {
        return this.f2722;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "proxy")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Proxy m22505() {
        return this.f2723;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m22506() {
        return this.f2722.m6513() != null && this.f2723.type() == Proxy.Type.HTTP;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "socketAddress")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final InetSocketAddress m22507() {
        return this.f21676;
    }
}
