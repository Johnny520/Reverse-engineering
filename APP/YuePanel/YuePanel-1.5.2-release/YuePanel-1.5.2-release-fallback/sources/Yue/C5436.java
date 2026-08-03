package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5436 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0296 f20160;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.net.Proxy f20161;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.net.InetSocketAddress f20162;

    public C5436(@Yue.InterfaceC4418 Yue.C0296 r2, @Yue.InterfaceC4418 java.net.Proxy r3, @Yue.InterfaceC4418 java.net.InetSocketAddress r4) {
            r1 = this;
            java.lang.String r0 = "address"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "proxy"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "socketAddress"
            Yue.C3329.m13906(r4, r0)
            r1.<init>()
            r1.f20160 = r2
            r1.f20161 = r3
            r1.f20162 = r4
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C5436
            if (r0 == 0) goto L26
            Yue.ۥۣۡۧ۠ r3 = (Yue.C5436) r3
            Yue.ۥ۟۠ۢ r0 = r3.f20160
            Yue.ۥ۟۠ۢ r1 = r2.f20160
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L26
            java.net.Proxy r0 = r3.f20161
            java.net.Proxy r1 = r2.f20161
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L26
            java.net.InetSocketAddress r3 = r3.f20162
            java.net.InetSocketAddress r0 = r2.f20162
            boolean r3 = Yue.C3329.m13897(r3, r0)
            if (r3 == 0) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            return r3
    }

    public int hashCode() {
            r2 = this;
            Yue.ۥ۟۠ۢ r0 = r2.f20160
            int r0 = r0.hashCode()
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.Proxy r0 = r2.f20161
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.InetSocketAddress r0 = r2.f20162
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Route{"
            r0.append(r1)
            java.net.InetSocketAddress r1 = r2.f20162
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "address", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_address")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C0296 m20509() {
            r1 = this;
            Yue.ۥ۟۠ۢ r0 = r1.f20160
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "proxy", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_proxy")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.net.Proxy m20510() {
            r1 = this;
            java.net.Proxy r0 = r1.f20161
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "socketAddress", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_socketAddress")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.net.InetSocketAddress m20511() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.f20162
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "address")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C0296 m20512() {
            r1 = this;
            Yue.ۥ۟۠ۢ r0 = r1.f20160
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "proxy")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.net.Proxy m20513() {
            r1 = this;
            java.net.Proxy r0 = r1.f20161
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m20514() {
            r2 = this;
            Yue.ۥ۟۠ۢ r0 = r2.f20160
            javax.net.ssl.SSLSocketFactory r0 = r0.m1317()
            if (r0 == 0) goto L14
            java.net.Proxy r0 = r2.f20161
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP
            if (r0 != r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "socketAddress")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final java.net.InetSocketAddress m20515() {
            r1 = this;
            java.net.InetSocketAddress r0 = r1.f20162
            return r0
    }
}
