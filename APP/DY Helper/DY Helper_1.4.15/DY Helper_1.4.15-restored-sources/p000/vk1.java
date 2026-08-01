package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vk1 extends p000.bg0 implements p000.a00 {

    /* JADX INFO: renamed from: β */
    public final p000.x22 f11324;

    /* JADX INFO: renamed from: γ */
    public final p000.zo1 f11325;

    /* JADX INFO: renamed from: δ */
    public final java.net.Socket f11326;

    /* JADX INFO: renamed from: ε */
    public final java.net.Socket f11327;

    /* JADX INFO: renamed from: ζ */
    public final p000.qc0 f11328;

    /* JADX INFO: renamed from: η */
    public final p000.zj1 f11329;

    /* JADX INFO: renamed from: θ */
    public final p000.C0538m6 f11330;

    /* JADX INFO: renamed from: ι */
    public p000.dg0 f11331;

    /* JADX INFO: renamed from: κ */
    public boolean f11332;

    /* JADX INFO: renamed from: λ */
    public boolean f11333;

    /* JADX INFO: renamed from: μ */
    public int f11334;

    /* JADX INFO: renamed from: ν */
    public int f11335;

    /* JADX INFO: renamed from: ξ */
    public int f11336;

    /* JADX INFO: renamed from: ο */
    public int f11337;

    /* JADX INFO: renamed from: π */
    public final java.util.ArrayList f11338;

    /* JADX INFO: renamed from: ρ */
    public long f11339;

    public vk1(p000.x22 r1, p000.xk1 r2, p000.zo1 r3, java.net.Socket r4, java.net.Socket r5, p000.qc0 r6, p000.zj1 r7, p000.C0538m6 r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r7.getClass()
            r8.getClass()
            r0.<init>()
            r0.f11324 = r1
            r0.f11325 = r3
            r0.f11326 = r4
            r0.f11327 = r5
            r0.f11328 = r6
            r0.f11329 = r7
            r0.f11330 = r8
            r1 = 1
            r0.f11337 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f11338 = r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.f11339 = r1
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m6268(p000.t41 r3, p000.zo1 r4, java.io.IOException r5) {
            r3.getClass()
            r4.getClass()
            r5.getClass()
            java.net.Proxy r0 = r4.f13230
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L26
            p r0 = r4.f13229
            java.net.ProxySelector r1 = r0.f8370
            og0 r0 = r0.f8371
            java.net.URI r0 = r0.m4236()
            java.net.Proxy r2 = r4.f13230
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r5)
        L26:
            ij0 r3 = r3.f10172
            monitor-enter(r3)
            java.util.LinkedHashSet r5 = r3.f5096     // Catch: java.lang.Throwable -> L30
            r5.add(r4)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r3)
            return
        L30:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L30
            throw r4
    }

    @Override // p000.a00
    public final void cancel() {
            r0 = this;
            java.net.Socket r0 = r0.f11326
            p000.ud2.m5845(r0)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Connection{"
            r0.<init>(r1)
            zo1 r1 = r3.f11325
            p r2 = r1.f13229
            og0 r2 = r2.f8371
            java.lang.String r2 = r2.f8093
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            p r2 = r1.f13229
            og0 r2 = r2.f8371
            int r2 = r2.f8094
            r0.append(r2)
            java.lang.String r2 = ", proxy="
            r0.append(r2)
            java.net.Proxy r2 = r1.f13230
            r0.append(r2)
            java.lang.String r2 = " hostAddress="
            r0.append(r2)
            java.net.InetSocketAddress r1 = r1.f13231
            r0.append(r1)
            java.lang.String r1 = " cipherSuite="
            r0.append(r1)
            qc0 r1 = r3.f11328
            if (r1 == 0) goto L40
            uf r1 = r1.f8958
            goto L42
        L40:
            java.lang.String r1 = "none"
        L42:
            r0.append(r1)
            java.lang.String r1 = " protocol="
            r0.append(r1)
            zj1 r3 = r3.f11329
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // p000.bg0
    /* JADX INFO: renamed from: α */
    public final void mo955(p000.dg0 r1, p000.xs1 r2) {
            r0 = this;
            r2.getClass()
            monitor-enter(r0)
            int r1 = r2.f12278     // Catch: java.lang.Throwable -> L17
            r1 = r1 & 8
            if (r1 == 0) goto L10
            int[] r1 = r2.f12279     // Catch: java.lang.Throwable -> L17
            r2 = 3
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L17
            goto L13
        L10:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L13:
            r0.f11337 = r1     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return
        L17:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // p000.a00
    /* JADX INFO: renamed from: β */
    public final void mo1(p000.uk1 r4, java.io.IOException r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r5 instanceof p000.o02     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            if (r0 == 0) goto L34
            r0 = r5
            o02 r0 = (p000.o02) r0     // Catch: java.lang.Throwable -> L1e
            sz r0 = r0.f7856     // Catch: java.lang.Throwable -> L1e
            sz r2 = p000.EnumC0816sz.f10091     // Catch: java.lang.Throwable -> L1e
            if (r0 != r2) goto L20
            int r4 = r3.f11336     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.f11336 = r4     // Catch: java.lang.Throwable -> L1e
            if (r4 <= r1) goto L55
            r3.f11332 = r1     // Catch: java.lang.Throwable -> L1e
            int r4 = r3.f11334     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.f11334 = r4     // Catch: java.lang.Throwable -> L1e
            goto L55
        L1e:
            r4 = move-exception
            goto L57
        L20:
            o02 r5 = (p000.o02) r5     // Catch: java.lang.Throwable -> L1e
            sz r5 = r5.f7856     // Catch: java.lang.Throwable -> L1e
            sz r0 = p000.EnumC0816sz.f10092     // Catch: java.lang.Throwable -> L1e
            if (r5 != r0) goto L2c
            boolean r4 = r4.f10903     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L55
        L2c:
            r3.f11332 = r1     // Catch: java.lang.Throwable -> L1e
            int r4 = r3.f11334     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.f11334 = r4     // Catch: java.lang.Throwable -> L1e
            goto L55
        L34:
            dg0 r0 = r3.f11331     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L3a
            r0 = r1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L41
            boolean r0 = r5 instanceof p000.C0593no     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L55
        L41:
            r3.f11332 = r1     // Catch: java.lang.Throwable -> L1e
            int r0 = r3.f11335     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L55
            if (r5 == 0) goto L50
            t41 r4 = r4.f10888     // Catch: java.lang.Throwable -> L1e
            zo1 r0 = r3.f11325     // Catch: java.lang.Throwable -> L1e
            m6268(r4, r0, r5)     // Catch: java.lang.Throwable -> L1e
        L50:
            int r4 = r3.f11334     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.f11334 = r4     // Catch: java.lang.Throwable -> L1e
        L55:
            monitor-exit(r3)
            return
        L57:
            monitor-exit(r3)
            throw r4
    }

    @Override // p000.bg0
    /* JADX INFO: renamed from: γ */
    public final void mo109(p000.kg0 r2) {
            r1 = this;
            sz r1 = p000.EnumC0816sz.f10091
            r0 = 0
            r2.m3244(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m6269(p000.C0669p r9, java.util.List r10) {
            r8 = this;
            og0 r0 = r9.f8371
            java.util.TimeZone r1 = p000.ud2.f10709
            java.util.ArrayList r1 = r8.f11338
            int r1 = r1.size()
            int r2 = r8.f11337
            r3 = 0
            if (r1 >= r2) goto Ld6
            boolean r1 = r8.f11332
            if (r1 == 0) goto L15
            goto Ld6
        L15:
            zo1 r1 = r8.f11325
            p r2 = r1.f13229
            p r4 = r1.f13229
            boolean r2 = r2.m4339(r9)
            if (r2 != 0) goto L23
            goto Ld6
        L23:
            java.lang.String r2 = r0.f8093
            java.lang.String r5 = r0.f8093
            og0 r6 = r4.f8371
            java.lang.String r6 = r6.f8093
            boolean r2 = p000.ln0.m3626(r2, r6)
            if (r2 == 0) goto L33
            goto Lcb
        L33:
            dg0 r2 = r8.f11331
            if (r2 != 0) goto L39
            goto Ld6
        L39:
            if (r10 == 0) goto Ld6
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L43
            goto Ld6
        L43:
            java.util.Iterator r10 = r10.iterator()
        L47:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Ld6
            java.lang.Object r2 = r10.next()
            zo1 r2 = (p000.zo1) r2
            java.net.Proxy r6 = r2.f13230
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L47
            java.net.Proxy r6 = r1.f13230
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L47
            java.net.InetSocketAddress r6 = r1.f13231
            java.net.InetSocketAddress r2 = r2.f13231
            boolean r2 = p000.ln0.m3626(r6, r2)
            if (r2 == 0) goto L47
            javax.net.ssl.HostnameVerifier r10 = r9.f8367
            r41 r1 = p000.r41.f9259
            if (r10 == r1) goto L76
            goto Ld6
        L76:
            java.util.TimeZone r10 = p000.ud2.f10709
            og0 r10 = r4.f8371
            int r0 = r0.f8094
            int r1 = r10.f8094
            if (r0 == r1) goto L81
            goto Ld6
        L81:
            java.lang.String r10 = r10.f8093
            boolean r10 = p000.ln0.m3626(r5, r10)
            qc0 r0 = r8.f11328
            if (r10 == 0) goto L8c
            goto Lab
        L8c:
            boolean r8 = r8.f11333
            if (r8 != 0) goto Ld6
            if (r0 == 0) goto Ld6
            java.util.List r8 = r0.m4851()
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto Ld6
            java.lang.Object r8 = r8.get(r3)
            r8.getClass()
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            boolean r8 = p000.r41.m5065(r5, r8)
            if (r8 == 0) goto Ld6
        Lab:
            je r8 = r9.f8368     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r8.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r0.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.List r9 = r0.m4851()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r5.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r9.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.Set r8 = r8.f5436     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            java.util.Iterator r8 = r8.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            boolean r9 = r8.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            if (r9 != 0) goto Lcd
        Lcb:
            r8 = 1
            return r8
        Lcd:
            java.lang.Object r8 = r8.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            p000.lz1.m3698(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
            r8 = 0
            throw r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld6
        Ld6:
            return r3
    }

    @Override // p000.a00
    /* JADX INFO: renamed from: ζ */
    public final p000.zo1 mo2() {
            r0 = this;
            zo1 r0 = r0.f11325
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final boolean m6270(boolean r8) {
            r7 = this;
            java.util.TimeZone r0 = p000.ud2.f10709
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r7.f11326
            boolean r2 = r2.isClosed()
            r3 = 0
            if (r2 != 0) goto L83
            java.net.Socket r2 = r7.f11327
            boolean r2 = r2.isClosed()
            if (r2 != 0) goto L83
            java.net.Socket r2 = r7.f11327
            boolean r2 = r2.isInputShutdown()
            if (r2 != 0) goto L83
            java.net.Socket r2 = r7.f11327
            boolean r2 = r2.isOutputShutdown()
            if (r2 == 0) goto L28
            goto L83
        L28:
            dg0 r2 = r7.f11331
            r4 = 1
            if (r2 == 0) goto L4a
            monitor-enter(r2)
            boolean r7 = r2.f3137     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L34
            monitor-exit(r2)
            return r3
        L34:
            long r7 = r2.f3145     // Catch: java.lang.Throwable -> L44
            long r5 = r2.f3144     // Catch: java.lang.Throwable -> L44
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 >= 0) goto L46
            long r7 = r2.f3146     // Catch: java.lang.Throwable -> L44
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L46
            monitor-exit(r2)
            return r3
        L44:
            r7 = move-exception
            goto L48
        L46:
            monitor-exit(r2)
            return r4
        L48:
            monitor-exit(r2)
            throw r7
        L4a:
            monitor-enter(r7)
            long r5 = r7.f11339     // Catch: java.lang.Throwable -> L80
            long r0 = r0 - r5
            monitor-exit(r7)
            r5 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L7f
            if (r8 == 0) goto L7f
            java.net.Socket r8 = r7.f11327
            m6 r7 = r7.f11330
            java.lang.Object r7 = r7.f6968
            rk1 r7 = (p000.rk1) r7
            r8.getClass()
            r7.getClass()
            int r0 = r8.getSoTimeout()     // Catch: java.net.SocketTimeoutException -> L7d java.io.IOException -> L7e
            r8.setSoTimeout(r4)     // Catch: java.lang.Throwable -> L78
            boolean r7 = r7.m5109()     // Catch: java.lang.Throwable -> L78
            r7 = r7 ^ r4
            r8.setSoTimeout(r0)     // Catch: java.net.SocketTimeoutException -> L7d java.io.IOException -> L7e
            return r7
        L78:
            r7 = move-exception
            r8.setSoTimeout(r0)     // Catch: java.net.SocketTimeoutException -> L7d java.io.IOException -> L7e
            throw r7     // Catch: java.net.SocketTimeoutException -> L7d java.io.IOException -> L7e
        L7d:
            r3 = r4
        L7e:
            return r3
        L7f:
            return r4
        L80:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L83:
            return r3
    }

    @Override // p000.a00
    /* JADX INFO: renamed from: θ */
    public final void mo3() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.f11332 = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ι */
    public final void m6271() {
            r7 = this;
            long r0 = java.lang.System.nanoTime()
            r7.f11339 = r0
            zj1 r0 = r7.f11329
            zj1 r1 = p000.zj1.f13133
            if (r0 == r1) goto L12
            zj1 r1 = p000.zj1.f13134
            if (r0 != r1) goto L11
            goto L12
        L11:
            return
        L12:
            java.net.Socket r0 = r7.f11327
            r1 = 0
            r0.setSoTimeout(r1)
            x r0 = p000.C0966x.f11955
            h40 r0 = p000.h40.f4569
            b8 r2 = new b8
            x22 r3 = r7.f11324
            r3.getClass()
            r2.<init>()
            r2.f1555 = r3
            ag0 r3 = p000.bg0.f1702
            r2.f1558 = r3
            h40 r3 = p000.h40.f4569
            r2.f1559 = r3
            m6 r3 = r7.f11330
            zo1 r4 = r7.f11325
            p r4 = r4.f13229
            og0 r4 = r4.f8371
            java.lang.String r4 = r4.f8093
            r3.getClass()
            r4.getClass()
            r2.f1556 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = p000.ud2.f10710
            r3.append(r5)
            r5 = 32
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.f1557 = r3
            r2.f1558 = r7
            r2.f1559 = r0
            dg0 r0 = new dg0
            r0.<init>(r2)
            r7.f11331 = r0
            xs1 r2 = p000.dg0.f3126
            int r3 = r2.f12278
            r3 = r3 & 8
            if (r3 == 0) goto L73
            int[] r2 = r2.f12279
            r3 = 3
            r2 = r2[r3]
            goto L76
        L73:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L76:
            r7.f11337 = r2
            lg0 r7 = r0.f3129
            java.lang.String r2 = ">> CONNECTION "
            monitor-enter(r7)
            boolean r3 = r7.f6621     // Catch: java.lang.Throwable -> La7
            if (r3 != 0) goto L127
            java.util.logging.Logger r3 = p000.lg0.f6617     // Catch: java.lang.Throwable -> La7
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> La7
            boolean r4 = r3.isLoggable(r4)     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto Laa
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La7
            r4.<init>(r2)     // Catch: java.lang.Throwable -> La7
            dd r2 = p000.vf0.f11255     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = r2.mo1702()     // Catch: java.lang.Throwable -> La7
            r4.append(r2)     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> La7
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = p000.ud2.m5846(r2, r4)     // Catch: java.lang.Throwable -> La7
            r3.fine(r2)     // Catch: java.lang.Throwable -> La7
            goto Laa
        La7:
            r0 = move-exception
            goto L12f
        Laa:
            zc r2 = r7.f6618     // Catch: java.lang.Throwable -> La7
            dd r3 = p000.vf0.f11255     // Catch: java.lang.Throwable -> La7
            r2.mo4894(r3)     // Catch: java.lang.Throwable -> La7
            zc r2 = r7.f6618     // Catch: java.lang.Throwable -> La7
            r2.flush()     // Catch: java.lang.Throwable -> La7
            monitor-exit(r7)
            lg0 r7 = r0.f3129
            xs1 r2 = r0.f3148
            r7.getClass()
            r2.getClass()
            monitor-enter(r7)
            boolean r3 = r7.f6621     // Catch: java.lang.Throwable -> Lf2
            if (r3 != 0) goto L11d
            int r3 = r2.f12278     // Catch: java.lang.Throwable -> Lf2
            int r3 = java.lang.Integer.bitCount(r3)     // Catch: java.lang.Throwable -> Lf2
            int r3 = r3 * 6
            r4 = 4
            r7.m3559(r1, r3, r4, r1)     // Catch: java.lang.Throwable -> Lf2
            r3 = r1
        Ld3:
            r4 = 10
            if (r3 >= r4) goto Lf7
            r4 = 1
            int r5 = r4 << r3
            int r6 = r2.f12278     // Catch: java.lang.Throwable -> Lf2
            r5 = r5 & r6
            if (r5 == 0) goto Le0
            goto Le1
        Le0:
            r4 = r1
        Le1:
            if (r4 == 0) goto Lf4
            zc r4 = r7.f6618     // Catch: java.lang.Throwable -> Lf2
            r4.writeShort(r3)     // Catch: java.lang.Throwable -> Lf2
            zc r4 = r7.f6618     // Catch: java.lang.Throwable -> Lf2
            int[] r5 = r2.f12279     // Catch: java.lang.Throwable -> Lf2
            r5 = r5[r3]     // Catch: java.lang.Throwable -> Lf2
            r4.writeInt(r5)     // Catch: java.lang.Throwable -> Lf2
            goto Lf4
        Lf2:
            r0 = move-exception
            goto L125
        Lf4:
            int r3 = r3 + 1
            goto Ld3
        Lf7:
            zc r2 = r7.f6618     // Catch: java.lang.Throwable -> Lf2
            r2.flush()     // Catch: java.lang.Throwable -> Lf2
            monitor-exit(r7)
            xs1 r7 = r0.f3148
            int r7 = r7.m6782()
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r7 == r2) goto L10f
            lg0 r3 = r0.f3129
            int r7 = r7 - r2
            long r4 = (long) r7
            r3.m3564(r1, r4)
        L10f:
            x22 r7 = r0.f3138
            w22 r7 = r7.m6509()
            java.lang.String r1 = r0.f3134
            cg0 r0 = r0.f3130
            p000.w22.m6309(r7, r1, r0)
            return
        L11d:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf2
            throw r0     // Catch: java.lang.Throwable -> Lf2
        L125:
            monitor-exit(r7)
            throw r0
        L127:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La7
            throw r0     // Catch: java.lang.Throwable -> La7
        L12f:
            monitor-exit(r7)
            throw r0
    }
}
