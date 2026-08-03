package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5439 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5439.C5440 f20166 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0296 f20167;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5437 f20168;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0904 f20169;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.AbstractC2233 f20170;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public java.util.List<? extends java.net.Proxy> f20171;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f20172;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public java.util.List<? extends java.net.InetSocketAddress> f20173;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<Yue.C5436> f20174;

    /* JADX INFO: renamed from: Yue.ۥۡۧ۠ۦ$ۥ, reason: contains not printable characters */
    public static final class C5440 {
        public C5440() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5440(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String m20529(@Yue.InterfaceC4418 java.net.InetSocketAddress r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                Yue.C3329.m13906(r2, r0)
                java.net.InetAddress r0 = r2.getAddress()
                if (r0 != 0) goto L15
                java.lang.String r2 = r2.getHostName()
                java.lang.String r0 = "hostName"
                Yue.C3329.m13905(r2, r0)
                return r2
            L15:
                java.lang.String r2 = r0.getHostAddress()
                java.lang.String r0 = "address.hostAddress"
                Yue.C3329.m13905(r2, r0)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧ۠ۦ$ۥ۟, reason: contains not printable characters */
    public static final class C5441 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.List<Yue.C5436> f20175;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f20176;

        public C5441(@Yue.InterfaceC4418 java.util.List<Yue.C5436> r2) {
                r1 = this;
                java.lang.String r0 = "routes"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f20175 = r2
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.List<Yue.C5436> m20530() {
                r1 = this;
                java.util.List<Yue.ۥۣۡۧ۠> r0 = r1.f20175
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean m20531() {
                r2 = this;
                int r0 = r2.f20176
                java.util.List<Yue.ۥۣۡۧ۠> r1 = r2.f20175
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C5436 m20532() {
                r3 = this;
                boolean r0 = r3.m20531()
                if (r0 == 0) goto L15
                java.util.List<Yue.ۥۣۡۧ۠> r0 = r3.f20175
                int r1 = r3.f20176
                int r2 = r1 + 1
                r3.f20176 = r2
                java.lang.Object r0 = r0.get(r1)
                Yue.ۥۣۡۧ۠ r0 = (Yue.C5436) r0
                return r0
            L15:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    static {
            Yue.ۥۡۧ۠ۦ$ۥ r0 = new Yue.ۥۡۧ۠ۦ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5439.f20166 = r0
            return
    }

    public C5439(@Yue.InterfaceC4418 Yue.C0296 r2, @Yue.InterfaceC4418 Yue.C5437 r3, @Yue.InterfaceC4418 Yue.InterfaceC0904 r4, @Yue.InterfaceC4418 Yue.AbstractC2233 r5) {
            r1 = this;
            java.lang.String r0 = "address"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "routeDatabase"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "eventListener"
            Yue.C3329.m13906(r5, r0)
            r1.<init>()
            r1.f20167 = r2
            r1.f20168 = r3
            r1.f20169 = r4
            r1.f20170 = r5
            java.util.List r3 = Yue.C1208.m6210()
            r1.f20171 = r3
            java.util.List r3 = Yue.C1208.m6210()
            r1.f20173 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f20174 = r3
            Yue.ۥ۠ۤۨۥ r3 = r2.m1318()
            java.net.Proxy r2 = r2.m1313()
            r1.m20528(r3, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.util.List<java.net.Proxy> m20522(java.net.Proxy r0, Yue.C3171 r1, Yue.C5439 r2) {
            if (r0 == 0) goto L7
            java.util.List r0 = Yue.C1207.m6190(r0)
            return r0
        L7:
            java.net.URI r0 = r1.m13482()
            java.lang.String r1 = r0.getHost()
            if (r1 != 0) goto L1c
            java.net.Proxy r0 = java.net.Proxy.NO_PROXY
            java.net.Proxy[] r0 = new java.net.Proxy[]{r0}
            java.util.List r0 = Yue.C6656.m25581(r0)
            return r0
        L1c:
            Yue.ۥ۟۠ۢ r1 = r2.f20167
            java.net.ProxySelector r1 = r1.m1315()
            java.util.List r0 = r1.select(r0)
            if (r0 == 0) goto L39
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2f
            goto L39
        L2f:
            java.lang.String r1 = "proxiesOrNull"
            Yue.C3329.m13905(r0, r1)
            java.util.List r0 = Yue.C6656.m25612(r0)
            return r0
        L39:
            java.net.Proxy r0 = java.net.Proxy.NO_PROXY
            java.net.Proxy[] r0 = new java.net.Proxy[]{r0}
            java.util.List r0 = Yue.C6656.m25581(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m20523() {
            r2 = this;
            boolean r0 = r2.m20524()
            r1 = 1
            if (r0 != 0) goto L12
            java.util.List<Yue.ۥۣۡۧ۠> r0 = r2.f20174
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L11
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m20524() {
            r2 = this;
            int r0 = r2.f20172
            java.util.List<? extends java.net.Proxy> r1 = r2.f20171
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C5439.C5441 m20525() throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.m20523()
            if (r0 == 0) goto L5e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lb:
            boolean r1 = r6.m20524()
            if (r1 == 0) goto L48
            java.net.Proxy r1 = r6.m20526()
            java.util.List<? extends java.net.InetSocketAddress> r2 = r6.f20173
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3
            Yue.ۥۣۡۧ۠ r4 = new Yue.ۥۣۡۧ۠
            Yue.ۥ۟۠ۢ r5 = r6.f20167
            r4.<init>(r5, r1, r3)
            Yue.ۥۡۧ۠ۤ r3 = r6.f20168
            boolean r3 = r3.m20518(r4)
            if (r3 == 0) goto L3c
            java.util.List<Yue.ۥۣۡۧ۠> r3 = r6.f20174
            r3.add(r4)
            goto L1b
        L3c:
            r0.add(r4)
            goto L1b
        L40:
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto Lb
        L48:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L58
            java.util.List<Yue.ۥۣۡۧ۠> r1 = r6.f20174
            Yue.C1216.m6247(r0, r1)
            java.util.List<Yue.ۥۣۡۧ۠> r1 = r6.f20174
            r1.clear()
        L58:
            Yue.ۥۡۧ۠ۦ$ۥ۟ r1 = new Yue.ۥۡۧ۠ۦ$ۥ۟
            r1.<init>(r0)
            return r1
        L5e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.net.Proxy m20526() throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.m20524()
            if (r0 == 0) goto L18
            java.util.List<? extends java.net.Proxy> r0 = r3.f20171
            int r1 = r3.f20172
            int r2 = r1 + 1
            r3.f20172 = r2
            java.lang.Object r0 = r0.get(r1)
            java.net.Proxy r0 = (java.net.Proxy) r0
            r3.m20527(r0)
            return r0
        L18:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No route to "
            r1.append(r2)
            Yue.ۥ۟۠ۢ r2 = r3.f20167
            Yue.ۥ۠ۤۨۥ r2 = r2.m1318()
            java.lang.String r2 = r2.m13463()
            r1.append(r2)
            java.lang.String r2 = "; exhausted proxy configurations: "
            r1.append(r2)
            java.util.List<? extends java.net.Proxy> r2 = r3.f20171
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m20527(java.net.Proxy r6) throws java.io.IOException {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f20173 = r0
            java.net.Proxy$Type r1 = r6.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.DIRECT
            if (r1 == r2) goto L51
            java.net.Proxy$Type r1 = r6.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.SOCKS
            if (r1 != r2) goto L18
            goto L51
        L18:
            java.net.SocketAddress r1 = r6.address()
            boolean r2 = r1 instanceof java.net.InetSocketAddress
            if (r2 == 0) goto L32
            Yue.ۥۡۧ۠ۦ$ۥ r2 = Yue.C5439.f20166
            java.lang.String r3 = "proxyAddress"
            Yue.C3329.m13905(r1, r3)
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            java.lang.String r2 = r2.m20529(r1)
            int r1 = r1.getPort()
            goto L65
        L32:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Proxy.address() is not an InetSocketAddress: "
            r6.append(r0)
            java.lang.Class r0 = r1.getClass()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L51:
            Yue.ۥ۟۠ۢ r1 = r5.f20167
            Yue.ۥ۠ۤۨۥ r1 = r1.m1318()
            java.lang.String r2 = r1.m13463()
            Yue.ۥ۟۠ۢ r1 = r5.f20167
            Yue.ۥ۠ۤۨۥ r1 = r1.m1318()
            int r1 = r1.m13470()
        L65:
            r3 = 1
            if (r3 > r1) goto Le3
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r3) goto Le3
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r3 = java.net.Proxy.Type.SOCKS
            if (r6 != r3) goto L7c
            java.net.InetSocketAddress r6 = java.net.InetSocketAddress.createUnresolved(r2, r1)
            r0.add(r6)
            goto Lc2
        L7c:
            boolean r6 = Yue.C6656.m25563(r2)
            if (r6 == 0) goto L8b
            java.net.InetAddress r6 = java.net.InetAddress.getByName(r2)
            java.util.List r6 = Yue.C1207.m6190(r6)
            goto La9
        L8b:
            Yue.ۥ۠ۡۡ۟ r6 = r5.f20170
            Yue.ۥۣ۟ۦۣ r3 = r5.f20169
            r6.mo10234(r3, r2)
            Yue.ۥ۟۠ۢ r6 = r5.f20167
            Yue.ۥ۠۟ۧۢ r6 = r6.m1309()
            java.util.List r6 = r6.mo8933(r2)
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto Lc3
            Yue.ۥ۠ۡۡ۟ r3 = r5.f20170
            Yue.ۥۣ۟ۦۣ r4 = r5.f20169
            r3.mo10233(r4, r2, r6)
        La9:
            java.util.Iterator r6 = r6.iterator()
        Lad:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lc2
            java.lang.Object r2 = r6.next()
            java.net.InetAddress r2 = (java.net.InetAddress) r2
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress
            r3.<init>(r2, r1)
            r0.add(r3)
            goto Lad
        Lc2:
            return
        Lc3:
            java.net.UnknownHostException r6 = new java.net.UnknownHostException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            Yue.ۥ۟۠ۢ r1 = r5.f20167
            Yue.ۥ۠۟ۧۢ r1 = r1.m1309()
            r0.append(r1)
            java.lang.String r1 = " returned no addresses for "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        Le3:
            java.net.SocketException r6 = new java.net.SocketException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "No route to "
            r0.append(r3)
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

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m20528(Yue.C3171 r3, java.net.Proxy r4) {
            r2 = this;
            Yue.ۥ۠ۡۡ۟ r0 = r2.f20170
            Yue.ۥۣ۟ۦۣ r1 = r2.f20169
            r0.mo10236(r1, r3)
            java.util.List r4 = m20522(r4, r3, r2)
            r2.f20171 = r4
            r0 = 0
            r2.f20172 = r0
            Yue.ۥ۠ۡۡ۟ r0 = r2.f20170
            Yue.ۥۣ۟ۦۣ r1 = r2.f20169
            r0.mo10235(r1, r3, r4)
            return
    }
}
