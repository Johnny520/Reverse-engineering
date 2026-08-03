package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0296 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1943 f619;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final javax.net.SocketFactory f620;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final javax.net.ssl.SSLSocketFactory f621;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final javax.net.ssl.HostnameVerifier f622;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.C0960 f623;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0664 f624;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.net.Proxy f625;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.net.ProxySelector f626;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C3171 f627;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<Yue.EnumC4981> f628;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<Yue.C1487> f629;

    public C0296(@Yue.InterfaceC4418 java.lang.String r2, int r3, @Yue.InterfaceC4418 Yue.InterfaceC1943 r4, @Yue.InterfaceC4418 javax.net.SocketFactory r5, @Yue.InterfaceC4543 javax.net.ssl.SSLSocketFactory r6, @Yue.InterfaceC4543 javax.net.ssl.HostnameVerifier r7, @Yue.InterfaceC4543 Yue.C0960 r8, @Yue.InterfaceC4418 Yue.InterfaceC0664 r9, @Yue.InterfaceC4543 java.net.Proxy r10, @Yue.InterfaceC4418 java.util.List<? extends Yue.EnumC4981> r11, @Yue.InterfaceC4418 java.util.List<Yue.C1487> r12, @Yue.InterfaceC4418 java.net.ProxySelector r13) {
            r1 = this;
            java.lang.String r0 = "uriHost"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "dns"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "socketFactory"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "proxyAuthenticator"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "protocols"
            Yue.C3329.m13906(r11, r0)
            java.lang.String r0 = "connectionSpecs"
            Yue.C3329.m13906(r12, r0)
            java.lang.String r0 = "proxySelector"
            Yue.C3329.m13906(r13, r0)
            r1.<init>()
            r1.f619 = r4
            r1.f620 = r5
            r1.f621 = r6
            r1.f622 = r7
            r1.f623 = r8
            r1.f624 = r9
            r1.f625 = r10
            r1.f626 = r13
            Yue.ۥ۠ۤۨۥ$ۥ r4 = new Yue.ۥ۠ۤۨۥ$ۥ
            r4.<init>()
            if (r6 == 0) goto L40
            java.lang.String r5 = "https"
            goto L42
        L40:
            java.lang.String r5 = "http"
        L42:
            Yue.ۥ۠ۤۨۥ$ۥ r4 = r4.m13523(r5)
            Yue.ۥ۠ۤۨۥ$ۥ r2 = r4.m13508(r2)
            Yue.ۥ۠ۤۨۥ$ۥ r2 = r2.m13514(r3)
            Yue.ۥ۠ۤۨۥ r2 = r2.m13492()
            r1.f627 = r2
            java.util.List r2 = Yue.C6656.m25612(r11)
            r1.f628 = r2
            java.util.List r2 = Yue.C6656.m25612(r12)
            r1.f629 = r2
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C0296
            if (r0 == 0) goto L18
            Yue.ۥ۠ۤۨۥ r0 = r2.f627
            Yue.ۥ۟۠ۢ r3 = (Yue.C0296) r3
            Yue.ۥ۠ۤۨۥ r1 = r3.f627
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L18
            boolean r3 = r2.m1310(r3)
            if (r3 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            return r3
    }

    public int hashCode() {
            r2 = this;
            Yue.ۥ۠ۤۨۥ r0 = r2.f627
            int r0 = r0.hashCode()
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            Yue.ۥ۠۟ۧۢ r0 = r2.f619
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            Yue.ۥ۟ۢۡۡ r0 = r2.f624
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<Yue.ۥۡۥۣۧ> r0 = r2.f628
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List<Yue.ۥ۟ۦۧۨ> r0 = r2.f629
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.ProxySelector r0 = r2.f626
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.net.Proxy r0 = r2.f625
            int r0 = java.util.Objects.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            javax.net.ssl.SSLSocketFactory r0 = r2.f621
            int r0 = java.util.Objects.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            javax.net.ssl.HostnameVerifier r0 = r2.f622
            int r0 = java.util.Objects.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            Yue.ۥ۟ۤ۟ۧ r0 = r2.f623
            int r0 = java.util.Objects.hashCode(r0)
            int r1 = r1 + r0
            return r1
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Address{"
            r0.append(r1)
            Yue.ۥ۠ۤۨۥ r1 = r3.f627
            java.lang.String r1 = r1.m13463()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            Yue.ۥ۠ۤۨۥ r1 = r3.f627
            int r1 = r1.m13470()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.net.Proxy r1 = r3.f625
            if (r1 == 0) goto L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "proxy="
            r1.append(r2)
            java.net.Proxy r2 = r3.f625
        L36:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L4b
        L3e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "proxySelector="
            r1.append(r2)
            java.net.ProxySelector r2 = r3.f626
            goto L36
        L4b:
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "certificatePinner", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_certificatePinner")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C0960 m1296() {
            r1 = this;
            Yue.ۥ۟ۤ۟ۧ r0 = r1.f623
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "connectionSpecs", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_connectionSpecs")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.List<Yue.C1487> m1297() {
            r1 = this;
            java.util.List<Yue.ۥ۟ۦۧۨ> r0 = r1.f629
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "dns", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_dns")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC1943 m1298() {
            r1 = this;
            Yue.ۥ۠۟ۧۢ r0 = r1.f619
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "hostnameVerifier", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_hostnameVerifier")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final javax.net.ssl.HostnameVerifier m1299() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.f622
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "protocols", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_protocols")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.util.List<Yue.EnumC4981> m1300() {
            r1 = this;
            java.util.List<Yue.ۥۡۥۣۧ> r0 = r1.f628
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "proxy", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_proxy")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.net.Proxy m1301() {
            r1 = this;
            java.net.Proxy r0 = r1.f625
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "proxyAuthenticator", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_proxyAuthenticator")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Yue.InterfaceC0664 m1302() {
            r1 = this;
            Yue.ۥ۟ۢۡۡ r0 = r1.f624
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "proxySelector", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_proxySelector")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.net.ProxySelector m1303() {
            r1 = this;
            java.net.ProxySelector r0 = r1.f626
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "socketFactory", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_socketFactory")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final javax.net.SocketFactory m1304() {
            r1 = this;
            javax.net.SocketFactory r0 = r1.f620
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "sslSocketFactory", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_sslSocketFactory")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final javax.net.ssl.SSLSocketFactory m1305() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.f621
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "url", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_url")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final Yue.C3171 m1306() {
            r1 = this;
            Yue.ۥ۠ۤۨۥ r0 = r1.f627
            return r0
    }

    @Yue.InterfaceC3421(name = "certificatePinner")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Yue.C0960 m1307() {
            r1 = this;
            Yue.ۥ۟ۤ۟ۧ r0 = r1.f623
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "connectionSpecs")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final java.util.List<Yue.C1487> m1308() {
            r1 = this;
            java.util.List<Yue.ۥ۟ۦۧۨ> r0 = r1.f629
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "dns")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final Yue.InterfaceC1943 m1309() {
            r1 = this;
            Yue.ۥ۠۟ۧۢ r0 = r1.f619
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m1310(@Yue.InterfaceC4418 Yue.C0296 r3) {
            r2 = this;
            java.lang.String r0 = "that"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۠۟ۧۢ r0 = r2.f619
            Yue.ۥ۠۟ۧۢ r1 = r3.f619
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L6f
            Yue.ۥ۟ۢۡۡ r0 = r2.f624
            Yue.ۥ۟ۢۡۡ r1 = r3.f624
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L6f
            java.util.List<Yue.ۥۡۥۣۧ> r0 = r2.f628
            java.util.List<Yue.ۥۡۥۣۧ> r1 = r3.f628
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L6f
            java.util.List<Yue.ۥ۟ۦۧۨ> r0 = r2.f629
            java.util.List<Yue.ۥ۟ۦۧۨ> r1 = r3.f629
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L6f
            java.net.ProxySelector r0 = r2.f626
            java.net.ProxySelector r1 = r3.f626
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L6f
            java.net.Proxy r0 = r2.f625
            java.net.Proxy r1 = r3.f625
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L6f
            javax.net.ssl.SSLSocketFactory r0 = r2.f621
            javax.net.ssl.SSLSocketFactory r1 = r3.f621
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L6f
            javax.net.ssl.HostnameVerifier r0 = r2.f622
            javax.net.ssl.HostnameVerifier r1 = r3.f622
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L6f
            Yue.ۥ۟ۤ۟ۧ r0 = r2.f623
            Yue.ۥ۟ۤ۟ۧ r1 = r3.f623
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L6f
            Yue.ۥ۠ۤۨۥ r0 = r2.f627
            int r0 = r0.m13470()
            Yue.ۥ۠ۤۨۥ r3 = r3.f627
            int r3 = r3.m13470()
            if (r0 != r3) goto L6f
            r3 = 1
            goto L70
        L6f:
            r3 = 0
        L70:
            return r3
    }

    @Yue.InterfaceC3421(name = "hostnameVerifier")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final javax.net.ssl.HostnameVerifier m1311() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.f622
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "protocols")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final java.util.List<Yue.EnumC4981> m1312() {
            r1 = this;
            java.util.List<Yue.ۥۡۥۣۧ> r0 = r1.f628
            return r0
    }

    @Yue.InterfaceC3421(name = "proxy")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final java.net.Proxy m1313() {
            r1 = this;
            java.net.Proxy r0 = r1.f625
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "proxyAuthenticator")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final Yue.InterfaceC0664 m1314() {
            r1 = this;
            Yue.ۥ۟ۢۡۡ r0 = r1.f624
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "proxySelector")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.net.ProxySelector m1315() {
            r1 = this;
            java.net.ProxySelector r0 = r1.f626
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "socketFactory")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final javax.net.SocketFactory m1316() {
            r1 = this;
            javax.net.SocketFactory r0 = r1.f620
            return r0
    }

    @Yue.InterfaceC3421(name = "sslSocketFactory")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final javax.net.ssl.SSLSocketFactory m1317() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.f621
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "url")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final Yue.C3171 m1318() {
            r1 = this;
            Yue.ۥ۠ۤۨۥ r0 = r1.f627
            return r0
    }
}
