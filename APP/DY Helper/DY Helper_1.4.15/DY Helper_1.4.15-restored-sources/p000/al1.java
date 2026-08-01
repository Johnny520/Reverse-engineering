package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class al1 {

    /* JADX INFO: renamed from: α */
    public final p000.x22 f308;

    /* JADX INFO: renamed from: β */
    public final p000.xk1 f309;

    /* JADX INFO: renamed from: γ */
    public final int f310;

    /* JADX INFO: renamed from: δ */
    public final int f311;

    /* JADX INFO: renamed from: ε */
    public final int f312;

    /* JADX INFO: renamed from: ζ */
    public final int f313;

    /* JADX INFO: renamed from: η */
    public final boolean f314;

    /* JADX INFO: renamed from: θ */
    public final boolean f315;

    /* JADX INFO: renamed from: ι */
    public final p000.C0669p f316;

    /* JADX INFO: renamed from: κ */
    public final p000.ij0 f317;

    /* JADX INFO: renamed from: λ */
    public final p000.uk1 f318;

    /* JADX INFO: renamed from: μ */
    public final boolean f319;

    /* JADX INFO: renamed from: ν */
    public p000.C0891v f320;

    /* JADX INFO: renamed from: ξ */
    public p000.cp1 f321;

    /* JADX INFO: renamed from: ο */
    public p000.zo1 f322;

    /* JADX INFO: renamed from: π */
    public final p000.C0936w6 f323;

    public al1(p000.x22 r1, p000.xk1 r2, int r3, int r4, int r5, int r6, boolean r7, boolean r8, p000.C0669p r9, p000.ij0 r10, p000.uk1 r11, p000.C0384i5 r12) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r10.getClass()
            r0.<init>()
            r0.f308 = r1
            r0.f309 = r2
            r0.f310 = r3
            r0.f311 = r4
            r0.f312 = r5
            r0.f313 = r6
            r0.f314 = r7
            r0.f315 = r8
            r0.f316 = r9
            r0.f317 = r10
            r0.f318 = r11
            java.lang.Object r1 = r12.f4915
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "GET"
            boolean r1 = p000.ln0.m3626(r1, r2)
            r1 = r1 ^ 1
            r0.f319 = r1
            w6 r1 = new w6
            r1.<init>()
            r0.f323 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m173(p000.vk1 r5) {
            r4 = this;
            w6 r0 = r4.f323
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto La
            goto L4e
        La:
            zo1 r0 = r4.f322
            if (r0 == 0) goto Lf
            goto L4e
        Lf:
            if (r5 == 0) goto L39
            monitor-enter(r5)
            int r0 = r5.f11334     // Catch: java.lang.Throwable -> L36
            r2 = 0
            if (r0 == 0) goto L18
            goto L30
        L18:
            boolean r0 = r5.f11332     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L1d
            goto L30
        L1d:
            zo1 r0 = r5.f11325     // Catch: java.lang.Throwable -> L36
            p r0 = r0.f13229     // Catch: java.lang.Throwable -> L36
            og0 r0 = r0.f8371     // Catch: java.lang.Throwable -> L36
            p r3 = r4.f316     // Catch: java.lang.Throwable -> L36
            og0 r3 = r3.f8371     // Catch: java.lang.Throwable -> L36
            boolean r0 = p000.ud2.m5843(r0, r3)     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L2e
            goto L30
        L2e:
            zo1 r2 = r5.f11325     // Catch: java.lang.Throwable -> L36
        L30:
            monitor-exit(r5)
            if (r2 == 0) goto L39
            r4.f322 = r2
            return r1
        L36:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L39:
            v r5 = r4.f320
            if (r5 == 0) goto L4a
            int r0 = r5.f11044
            java.lang.Object r5 = r5.f11045
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            if (r0 >= r5) goto L4a
            return r1
        L4a:
            cp1 r4 = r4.f321
            if (r4 != 0) goto L4f
        L4e:
            return r1
        L4f:
            boolean r4 = r4.m1608()
            return r4
    }

    /* JADX INFO: renamed from: β */
    public final p000.bp1 m174() {
            r13 = this;
            uk1 r0 = r13.f318
            vk1 r0 = r0.f10895
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
        L8:
            r3 = r1
            goto L69
        La:
            boolean r3 = r13.f319
            boolean r3 = r0.m6270(r3)
            monitor-enter(r0)
            boolean r4 = r0.f11332
            if (r3 != 0) goto L21
            r0.f11332 = r2     // Catch: java.lang.Throwable -> L1e
            uk1 r3 = r13.f318     // Catch: java.lang.Throwable -> L1e
            java.net.Socket r3 = r3.m5935()     // Catch: java.lang.Throwable -> L1e
            goto L4e
        L1e:
            r13 = move-exception
            goto L33b
        L21:
            if (r4 != 0) goto L48
            zo1 r3 = r0.f11325     // Catch: java.lang.Throwable -> L1e
            p r3 = r3.f13229     // Catch: java.lang.Throwable -> L1e
            og0 r3 = r3.f8371     // Catch: java.lang.Throwable -> L1e
            r3.getClass()     // Catch: java.lang.Throwable -> L1e
            p r4 = r13.f316     // Catch: java.lang.Throwable -> L1e
            og0 r4 = r4.f8371     // Catch: java.lang.Throwable -> L1e
            int r5 = r3.f8094     // Catch: java.lang.Throwable -> L1e
            int r6 = r4.f8094     // Catch: java.lang.Throwable -> L1e
            if (r5 != r6) goto L42
            java.lang.String r3 = r3.f8093     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r4.f8093     // Catch: java.lang.Throwable -> L1e
            boolean r3 = p000.ln0.m3626(r3, r4)     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L42
            r3 = r2
            goto L43
        L42:
            r3 = 0
        L43:
            if (r3 != 0) goto L46
            goto L48
        L46:
            r3 = r1
            goto L4e
        L48:
            uk1 r3 = r13.f318     // Catch: java.lang.Throwable -> L1e
            java.net.Socket r3 = r3.m5935()     // Catch: java.lang.Throwable -> L1e
        L4e:
            monitor-exit(r0)
            uk1 r4 = r13.f318
            vk1 r4 = r4.f10895
            if (r4 == 0) goto L63
            if (r3 != 0) goto L5d
            jo1 r3 = new jo1
            r3.<init>(r0)
            goto L69
        L5d:
            java.lang.String r13 = "Check failed."
            p000.C1080.m7279(r13)
            return r1
        L63:
            if (r3 == 0) goto L8
            p000.ud2.m5845(r3)
            goto L8
        L69:
            if (r3 == 0) goto L6c
            return r3
        L6c:
            jo1 r0 = r13.m176(r1, r1)
            if (r0 == 0) goto L73
            return r0
        L73:
            w6 r0 = r13.f323
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L84
            w6 r13 = r13.f323
            java.lang.Object r13 = r13.removeFirst()
            bp1 r13 = (p000.bp1) r13
            return r13
        L84:
            zo1 r0 = r13.f322
            if (r0 == 0) goto L90
            r13.f322 = r1
            mo r0 = r13.m175(r0, r1)
            goto L31d
        L90:
            v r0 = r13.f320
            if (r0 == 0) goto Lc2
            int r3 = r0.f11044
            java.lang.Object r4 = r0.f11045
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r3 >= r4) goto Lc2
            int r2 = r0.f11044
            java.lang.Object r3 = r0.f11045
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            if (r2 >= r4) goto Lbe
            int r2 = r0.f11044
            int r4 = r2 + 1
            r0.f11044 = r4
            java.lang.Object r0 = r3.get(r2)
            zo1 r0 = (p000.zo1) r0
            mo r0 = r13.m175(r0, r1)
            goto L31d
        Lbe:
            p000.C1080.m7277()
            return r1
        Lc2:
            cp1 r0 = r13.f321
            if (r0 != 0) goto Ld5
            cp1 r0 = new cp1
            p r3 = r13.f316
            ij0 r4 = r13.f317
            uk1 r5 = r13.f318
            boolean r6 = r13.f315
            r0.<init>(r3, r4, r5, r6)
            r13.f321 = r0
        Ld5:
            boolean r3 = r0.m1608()
            if (r3 == 0) goto L335
            boolean r3 = r0.m1608()
            if (r3 == 0) goto L331
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        Le6:
            int r4 = r0.f2713
            java.util.List r5 = r0.f2712
            int r5 = r5.size()
            if (r4 >= r5) goto L2e7
            p r4 = r0.f2709
            java.lang.String r5 = "No route to "
            int r6 = r0.f2713
            java.util.List r7 = r0.f2712
            int r7 = r7.size()
            if (r6 >= r7) goto L2c7
            java.util.List r6 = r0.f2712
            int r7 = r0.f2713
            int r8 = r7 + 1
            r0.f2713 = r8
            java.lang.Object r6 = r6.get(r7)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.f2714 = r7
            java.net.Proxy$Type r8 = r6.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 == r9) goto L164
            java.net.Proxy$Type r8 = r6.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.SOCKS
            if (r8 != r9) goto L124
            goto L164
        L124:
            java.net.SocketAddress r8 = r6.address()
            boolean r9 = r8 instanceof java.net.InetSocketAddress
            if (r9 == 0) goto L148
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            java.net.InetAddress r9 = r8.getAddress()
            if (r9 != 0) goto L13c
            java.lang.String r9 = r8.getHostName()
            r9.getClass()
            goto L143
        L13c:
            java.lang.String r9 = r9.getHostAddress()
            r9.getClass()
        L143:
            int r8 = r8.getPort()
            goto L16a
        L148:
            java.lang.String r13 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.Class r0 = r8.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r13)
            r1.append(r0)
            java.lang.String r13 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L164:
            og0 r8 = r4.f8371
            java.lang.String r9 = r8.f8093
            int r8 = r8.f8094
        L16a:
            if (r2 > r8) goto L2a8
            r10 = 65536(0x10000, float:9.1835E-41)
            if (r8 >= r10) goto L2a8
            java.net.Proxy$Type r5 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r5 != r10) goto L181
            java.net.InetSocketAddress r4 = java.net.InetSocketAddress.createUnresolved(r9, r8)
            r7.add(r4)
            goto L243
        L181:
            ym1 r5 = p000.qd2.f8976
            r9.getClass()
            ym1 r5 = p000.qd2.f8976
            boolean r5 = r5.m6942(r9)
            if (r5 == 0) goto L197
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r9)
            java.util.List r4 = p000.AbstractC1021yh.m6896(r4)
            goto L1ae
        L197:
            x r5 = r4.f8364
            r5.getClass()
            java.net.InetAddress[] r5 = java.net.InetAddress.getAllByName(r9)     // Catch: java.lang.NullPointerException -> L298
            r5.getClass()     // Catch: java.lang.NullPointerException -> L298
            java.util.List r5 = p000.AbstractC0312g7.m2262(r5)     // Catch: java.lang.NullPointerException -> L298
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto L27c
            r4 = r5
        L1ae:
            boolean r5 = r0.f2711
            if (r5 == 0) goto L22a
            int r5 = r4.size()
            r9 = 2
            if (r5 >= r9) goto L1bb
            goto L22a
        L1bb:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r4.iterator()
        L1c9:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L1e2
            java.lang.Object r11 = r10.next()
            r12 = r11
            java.net.InetAddress r12 = (java.net.InetAddress) r12
            boolean r12 = r12 instanceof java.net.Inet6Address
            if (r12 == 0) goto L1de
            r5.add(r11)
            goto L1c9
        L1de:
            r9.add(r11)
            goto L1c9
        L1e2:
            boolean r10 = r5.isEmpty()
            if (r10 != 0) goto L22a
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L1ef
            goto L22a
        L1ef:
            byte[] r4 = p000.sd2.f9867
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r9 = r9.iterator()
            zt0 r10 = p000.AbstractC1021yh.m6893()
        L1fd:
            boolean r4 = r5.hasNext()
            if (r4 != 0) goto L20f
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L20a
            goto L20f
        L20a:
            zt0 r4 = p000.AbstractC1021yh.m6883(r10)
            goto L22a
        L20f:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L21c
            java.lang.Object r4 = r5.next()
            r10.add(r4)
        L21c:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L1fd
            java.lang.Object r4 = r9.next()
            r10.add(r4)
            goto L1fd
        L22a:
            java.util.Iterator r4 = r4.iterator()
        L22e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L243
            java.lang.Object r5 = r4.next()
            java.net.InetAddress r5 = (java.net.InetAddress) r5
            java.net.InetSocketAddress r9 = new java.net.InetSocketAddress
            r9.<init>(r5, r8)
            r7.add(r9)
            goto L22e
        L243:
            java.lang.Object r4 = r0.f2714
            java.util.Iterator r4 = r4.iterator()
        L249:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L275
            java.lang.Object r5 = r4.next()
            java.net.InetSocketAddress r5 = (java.net.InetSocketAddress) r5
            zo1 r7 = new zo1
            p r8 = r0.f2709
            r7.<init>(r8, r6, r5)
            ij0 r5 = r0.f2710
            monitor-enter(r5)
            java.util.LinkedHashSet r8 = r5.f5096     // Catch: java.lang.Throwable -> L272
            boolean r8 = r8.contains(r7)     // Catch: java.lang.Throwable -> L272
            monitor-exit(r5)
            if (r8 == 0) goto L26e
            java.util.ArrayList r5 = r0.f2715
            r5.add(r7)
            goto L249
        L26e:
            r3.add(r7)
            goto L249
        L272:
            r13 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L272
            throw r13
        L275:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto Le6
            goto L2e7
        L27c:
            java.net.UnknownHostException r13 = new java.net.UnknownHostException
            x r0 = r4.f8364
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " returned no addresses for "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            r13.<init>(r0)
            throw r13
        L298:
            r13 = move-exception
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r1 = "Broken system behaviour for dns lookup of "
            java.lang.String r1 = r1.concat(r9)
            r0.<init>(r1)
            r0.initCause(r13)
            throw r0
        L2a8:
            java.net.SocketException r13 = new java.net.SocketException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r9)
            r1 = 58
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = "; port is out of range"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L2c7:
            java.net.SocketException r13 = new java.net.SocketException
            og0 r1 = r4.f8371
            java.lang.String r1 = r1.f8093
            java.lang.String r2 = "; exhausted proxy configurations: "
            java.util.List r0 = r0.f2712
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r1)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r13.<init>(r0)
            throw r13
        L2e7:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L2f7
            java.util.ArrayList r2 = r0.f2715
            p000.AbstractC0984xh.m6660(r3, r2)
            java.util.ArrayList r0 = r0.f2715
            r0.clear()
        L2f7:
            v r0 = new v
            r2 = 5
            r0.<init>(r2, r3)
            r13.f320 = r0
            uk1 r2 = r13.f318
            boolean r2 = r2.f10903
            if (r2 != 0) goto L32b
            int r2 = r0.f11044
            int r4 = r3.size()
            if (r2 >= r4) goto L327
            int r1 = r0.f11044
            int r2 = r1 + 1
            r0.f11044 = r2
            java.lang.Object r0 = r3.get(r1)
            zo1 r0 = (p000.zo1) r0
            mo r0 = r13.m175(r0, r3)
        L31d:
            java.util.List r1 = r0.f7225
            jo1 r13 = r13.m176(r0, r1)
            if (r13 == 0) goto L326
            return r13
        L326:
            return r0
        L327:
            p000.C1080.m7277()
            return r1
        L32b:
            java.lang.String r13 = "Canceled"
            p000.C1080.m7281(r13)
            return r1
        L331:
            p000.C1080.m7277()
            return r1
        L335:
            java.lang.String r13 = "exhausted all routes"
            p000.C1080.m7281(r13)
            return r1
        L33b:
            monitor-exit(r0)
            throw r13
    }

    /* JADX INFO: renamed from: γ */
    public final p000.C0556mo m175(p000.zo1 r16, java.util.ArrayList r17) {
            r15 = this;
            r10 = r16
            zj1 r0 = p000.zj1.f13134
            r10.getClass()
            p r1 = r10.f13229
            javax.net.ssl.SSLSocketFactory r2 = r1.f8366
            if (r2 != 0) goto L48
            java.util.List r1 = r1.f8373
            po r2 = p000.C0694po.f8619
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L40
            p r1 = r10.f13229
            og0 r1 = r1.f8371
            java.lang.String r1 = r1.f8093
            f0 r2 = p000.gh1.f4375
            f0 r2 = p000.gh1.f4375
            r2.getClass()
            r1.getClass()
            android.security.NetworkSecurityPolicy r2 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r2 = r2.isCleartextTrafficPermitted(r1)
            if (r2 == 0) goto L32
            goto L50
        L32:
            java.net.UnknownServiceException r15 = new java.net.UnknownServiceException
            java.lang.String r0 = "CLEARTEXT communication to "
            java.lang.String r2 = " not permitted by network security policy"
            java.lang.String r0 = p000.lz1.m3674(r0, r1, r2)
            r15.<init>(r0)
            throw r15
        L40:
            java.net.UnknownServiceException r15 = new java.net.UnknownServiceException
            java.lang.String r0 = "CLEARTEXT communication not enabled for client"
            r15.<init>(r0)
            throw r15
        L48:
            java.util.List r1 = r1.f8372
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L115
        L50:
            java.net.Proxy r1 = r10.f13230
            java.net.Proxy$Type r1 = r1.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.HTTP
            r3 = 0
            if (r1 == r2) goto L5c
            goto L6b
        L5c:
            p r1 = r10.f13229
            javax.net.ssl.SSLSocketFactory r2 = r1.f8366
            if (r2 != 0) goto L6e
            java.util.List r1 = r1.f8372
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L6b
            goto L6e
        L6b:
            r12 = r3
            goto Lfa
        L6e:
            b8 r0 = new b8
            r1 = 6
            r0.<init>(r1)
            p r1 = r10.f13229
            og0 r1 = r1.f8371
            r1.getClass()
            r0.f1555 = r1
            java.lang.String r1 = "CONNECT"
            r0.m817(r1, r3)
            p r1 = r10.f13229
            og0 r2 = r1.f8371
            r3 = 1
            java.lang.String r2 = p000.ud2.m5850(r2, r3)
            java.lang.String r3 = "Host"
            r0.m814(r3, r2)
            java.lang.String r2 = "Proxy-Connection"
            java.lang.String r3 = "Keep-Alive"
            r0.m814(r2, r3)
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = "okhttp/5.3.2"
            r0.m814(r2, r3)
            i5 r3 = new i5
            r3.<init>(r0)
            ao1 r0 = p000.bo1.f1795
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 20
            r2.<init>(r4)
            java.lang.String r4 = "Proxy-Authenticate"
            p000.v81.m6124(r4)
            java.lang.String r5 = "OkHttp-Preemptive"
            p000.v81.m6125(r5, r4)
            r6 = 0
            r7 = r6
        Lb8:
            int r8 = r2.size()
            if (r7 >= r8) goto Ld5
            java.lang.Object r8 = r2.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r4.equalsIgnoreCase(r8)
            if (r8 == 0) goto Ld2
            r2.remove(r7)
            r2.remove(r7)
            int r7 = r7 + (-2)
        Ld2:
            int r7 = r7 + 2
            goto Lb8
        Ld5:
            r2.add(r4)
            java.lang.CharSequence r4 = p000.q02.m4660(r5)
            java.lang.String r4 = r4.toString()
            r2.add(r4)
            vc0 r4 = new vc0
            java.lang.String[] r5 = new java.lang.String[r6]
            java.lang.Object[] r2 = r2.toArray(r5)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r4.<init>(r2)
            r0.getClass()
            x r0 = r1.f8369
            r0.getClass()
            goto L6b
        Lfa:
            mo r0 = new mo
            x22 r1 = r15.f308
            xk1 r2 = r15.f309
            int r3 = r15.f310
            int r4 = r15.f311
            int r5 = r15.f312
            int r6 = r15.f313
            boolean r7 = r15.f314
            uk1 r8 = r15.f318
            r13 = -1
            r14 = 0
            r9 = r15
            r11 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L115:
            java.net.UnknownServiceException r15 = new java.net.UnknownServiceException
            java.lang.String r0 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r15.<init>(r0)
            throw r15
    }

    /* JADX INFO: renamed from: δ */
    public final p000.jo1 m176(p000.C0556mo r11, java.util.List r12) {
            r10 = this;
            xk1 r0 = r10.f309
            boolean r1 = r10.f319
            p r2 = r10.f316
            uk1 r3 = r10.f318
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.mo991()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f12204
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L21:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L69
            java.lang.Object r7 = r0.next()
            vk1 r7 = (p000.vk1) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L41
            dg0 r9 = r7.f11331     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L3a
            r9 = r5
            goto L3b
        L3a:
            r9 = r4
        L3b:
            if (r9 != 0) goto L41
        L3d:
            r9 = r4
            goto L4c
        L3f:
            r10 = move-exception
            goto L67
        L41:
            boolean r9 = r7.m6269(r2, r12)     // Catch: java.lang.Throwable -> L3f
            if (r9 != 0) goto L48
            goto L3d
        L48:
            r3.m5927(r7)     // Catch: java.lang.Throwable -> L3f
            r9 = r5
        L4c:
            monitor-exit(r7)
            if (r9 == 0) goto L21
            boolean r9 = r7.m6270(r1)
            if (r9 == 0) goto L56
            goto L6a
        L56:
            monitor-enter(r7)
            r7.f11332 = r5     // Catch: java.lang.Throwable -> L64
            java.net.Socket r8 = r3.m5935()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r7)
            if (r8 == 0) goto L21
            p000.ud2.m5845(r8)
            goto L21
        L64:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L67:
            monitor-exit(r7)
            throw r10
        L69:
            r7 = r8
        L6a:
            if (r7 != 0) goto L6d
            return r8
        L6d:
            if (r11 == 0) goto L7a
            zo1 r12 = r11.f7224
            r10.f322 = r12
            java.net.Socket r10 = r11.f7231
            if (r10 == 0) goto L7a
            p000.ud2.m5845(r10)
        L7a:
            jo1 r10 = new jo1
            r10.<init>(r7)
            return r10
    }
}
