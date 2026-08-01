package defpackage;

/* JADX INFO: renamed from: ᲁᛸᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1894 extends defpackage.AbstractC1923 implements defpackage.InterfaceC0561 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C1326 f8196;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public boolean f8197;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public int f8198;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.C2361 f8199;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public int f8200;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.net.Socket f8201;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public int f8202;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.net.Socket f8203;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2058 f8204;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public boolean f8205;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public int f8206;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public long f8207;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0964 f8208;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C1045 f8209;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final java.util.ArrayList f8210;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.EnumC1832 f8211;

    public C1894(defpackage.C0964 r1, defpackage.C2058 r2, java.net.Socket r3, java.net.Socket r4, defpackage.C1045 r5, defpackage.EnumC1832 r6, defpackage.C1326 r7) {
            r0 = this;
            r0.<init>()
            r0.f8208 = r1
            r0.f8204 = r2
            r0.f8203 = r3
            r0.f8201 = r4
            r0.f8209 = r5
            r0.f8211 = r6
            r0.f8196 = r7
            r1 = 1
            r0.f8200 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f8210 = r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.f8207 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static void m3326(defpackage.C2225 r3, defpackage.C2058 r4, java.io.IOException r5) {
            java.net.Proxy r0 = r4.f8855
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L1d
            ᛱᛲᛶᲈ r0 = r4.f8854
            java.net.ProxySelector r1 = r0.f547
            ᛳᛸᛲ r0 = r0.f538
            java.net.URI r0 = r0.m1304()
            java.net.Proxy r2 = r4.f8855
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r5)
        L1d:
            ᛶᲈᛱᲈ r3 = r3.f9509
            monitor-enter(r3)
            java.lang.Object r5 = r3.f5356     // Catch: java.lang.Throwable -> L29
            java.util.LinkedHashSet r5 = (java.util.LinkedHashSet) r5     // Catch: java.lang.Throwable -> L29
            r5.add(r4)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)
            return
        L29:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r4
    }

    @Override // defpackage.InterfaceC0561
    public final void cancel() {
            r0 = this;
            java.net.Socket r0 = r0.f8203
            defpackage.AbstractC0508.m1294(r0)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Connection{"
            r0.<init>(r1)
            ᲇᛵᲇᲇ r1 = r3.f8204
            ᛱᛲᛶᲈ r2 = r1.f8854
            ᛳᛸᛲ r2 = r2.f538
            java.lang.String r2 = r2.f2563
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            ᛱᛲᛶᲈ r2 = r1.f8854
            ᛳᛸᛲ r2 = r2.f538
            int r2 = r2.f2562
            r0.append(r2)
            java.lang.String r2 = ", proxy="
            r0.append(r2)
            java.net.Proxy r2 = r1.f8855
            r0.append(r2)
            java.lang.String r2 = " hostAddress="
            r0.append(r2)
            java.net.InetSocketAddress r1 = r1.f8853
            r0.append(r1)
            java.lang.String r1 = " cipherSuite="
            r0.append(r1)
            ᛶᛳᛸᛷ r1 = r3.f8209
            if (r1 == 0) goto L40
            ᲁᲀᲇᲀ r1 = r1.f4637
            goto L42
        L40:
            java.lang.String r1 = "none"
        L42:
            r0.append(r1)
            java.lang.String r1 = " protocol="
            r0.append(r1)
            ᲁᛳᛶᛵ r3 = r3.f8211
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // defpackage.InterfaceC0561
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final void mo1355() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.f8205 = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void m3327() {
            r11 = this;
            long r0 = java.lang.System.nanoTime()
            r11.f8207 = r0
            ᲁᛳᛶᛵ r0 = r11.f8211
            ᲁᛳᛶᛵ r1 = defpackage.EnumC1832.f7985
            if (r0 == r1) goto L12
            ᲁᛳᛶᛵ r1 = defpackage.EnumC1832.f7978
            if (r0 != r1) goto L11
            goto L12
        L11:
            return
        L12:
            java.net.Socket r0 = r11.f8201
            r1 = 0
            r0.setSoTimeout(r1)
            ᛷᲈᲀ r0 = defpackage.C1403.f6101
            ᲁᛲᲈᛱ r0 = defpackage.C1826.f7966
            ᛳᲀᲁᲈ r2 = new ᛳᲀᲁᲈ
            ᛵᲀᲇᛸ r3 = r11.f8208
            r2.<init>()
            r2.f2713 = r3
            ᛵᲈᛸᛳ r3 = defpackage.AbstractC1923.f8363
            r2.f2714 = r3
            ᲁᛲᲈᛱ r3 = defpackage.C1826.f7966
            r2.f2715 = r3
            ᛷᛸᛱᛸ r3 = r11.f8196
            ᲇᛵᲇᲇ r4 = r11.f8204
            ᛱᛲᛶᲈ r4 = r4.f8854
            ᛳᛸᛲ r4 = r4.f538
            java.lang.String r4 = r4.f2563
            r2.f2712 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = defpackage.AbstractC0508.f2502
            r3.append(r5)
            r5 = 32
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.f2711 = r3
            r2.f2714 = r11
            r2.f2715 = r0
            ᲈᲈ r0 = new ᲈᲈ
            r0.<init>(r2)
            r11.f8199 = r0
            ᛴᛶᛳᛷ r2 = defpackage.C2361.f10205
            int r3 = r2.f3312
            r3 = r3 & 8
            if (r3 == 0) goto L6a
            int[] r2 = r2.f3313
            r3 = 3
            r2 = r2[r3]
            goto L6d
        L6a:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L6d:
            r11.f8200 = r2
            ᛴᲈᛲᲀ r11 = r0.f10229
            java.lang.String r2 = ">> CONNECTION "
            monitor-enter(r11)
            boolean r3 = r11.f3681     // Catch: java.lang.Throwable -> L9e
            if (r3 != 0) goto L148
            java.util.logging.Logger r3 = defpackage.C0794.f3677     // Catch: java.lang.Throwable -> L9e
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L9e
            boolean r4 = r3.isLoggable(r4)     // Catch: java.lang.Throwable -> L9e
            if (r4 == 0) goto La1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9e
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L9e
            ᛶᛸᛸᛶ r2 = defpackage.AbstractC1853.f8093     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = r2.mo2162()     // Catch: java.lang.Throwable -> L9e
            r4.append(r2)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L9e
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = defpackage.AbstractC0508.m1293(r2, r4)     // Catch: java.lang.Throwable -> L9e
            r3.fine(r2)     // Catch: java.lang.Throwable -> L9e
            goto La1
        L9e:
            r0 = move-exception
            goto L150
        La1:
            ᛶᛳᛵᛸ r2 = r11.f3680     // Catch: java.lang.Throwable -> L9e
            ᛶᛸᛸᛶ r3 = defpackage.AbstractC1853.f8093     // Catch: java.lang.Throwable -> L9e
            r2.m1999(r3)     // Catch: java.lang.Throwable -> L9e
            ᛶᛳᛵᛸ r2 = r11.f3680     // Catch: java.lang.Throwable -> L9e
            r2.flush()     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r11)
            ᛴᲈᛲᲀ r11 = r0.f10229
            ᛴᛶᛳᛷ r2 = r0.f10213
            monitor-enter(r11)
            boolean r3 = r11.f3681     // Catch: java.lang.Throwable -> L10b
            if (r3 != 0) goto L13e
            int r3 = r2.f3312     // Catch: java.lang.Throwable -> L10b
            int r3 = java.lang.Integer.bitCount(r3)     // Catch: java.lang.Throwable -> L10b
            int r3 = r3 * 6
            r4 = 4
            r11.m1717(r1, r3, r4, r1)     // Catch: java.lang.Throwable -> L10b
            r3 = r1
        Lc4:
            r4 = 10
            if (r3 >= r4) goto L118
            r4 = 1
            int r5 = r4 << r3
            int r6 = r2.f3312     // Catch: java.lang.Throwable -> L10b
            r5 = r5 & r6
            if (r5 == 0) goto Ld1
            goto Ld2
        Ld1:
            r4 = r1
        Ld2:
            if (r4 == 0) goto L115
            ᛶᛳᛵᛸ r4 = r11.f3680     // Catch: java.lang.Throwable -> L10b
            boolean r5 = r4.f4610     // Catch: java.lang.Throwable -> L10b
            if (r5 != 0) goto L10d
            ᛸᲁᛵ r5 = r4.f4611     // Catch: java.lang.Throwable -> L10b
            r6 = 2
            ᲁᲇᛶᛶ r6 = r5.m2846(r6)     // Catch: java.lang.Throwable -> L10b
            byte[] r7 = r6.f8467     // Catch: java.lang.Throwable -> L10b
            int r8 = r6.f8466     // Catch: java.lang.Throwable -> L10b
            int r9 = r8 + 1
            int r10 = r3 >>> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L10b
            r7[r8] = r10     // Catch: java.lang.Throwable -> L10b
            int r8 = r8 + 2
            r10 = r3 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L10b
            r7[r9] = r10     // Catch: java.lang.Throwable -> L10b
            r6.f8466 = r8     // Catch: java.lang.Throwable -> L10b
            long r6 = r5.f6928     // Catch: java.lang.Throwable -> L10b
            r8 = 2
            long r6 = r6 + r8
            r5.f6928 = r6     // Catch: java.lang.Throwable -> L10b
            r4.m1998()     // Catch: java.lang.Throwable -> L10b
            ᛶᛳᛵᛸ r4 = r11.f3680     // Catch: java.lang.Throwable -> L10b
            int[] r5 = r2.f3313     // Catch: java.lang.Throwable -> L10b
            r5 = r5[r3]     // Catch: java.lang.Throwable -> L10b
            r4.m1996(r5)     // Catch: java.lang.Throwable -> L10b
            goto L115
        L10b:
            r0 = move-exception
            goto L146
        L10d:
            java.lang.String r0 = "closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L10b
            throw r1     // Catch: java.lang.Throwable -> L10b
        L115:
            int r3 = r3 + 1
            goto Lc4
        L118:
            ᛶᛳᛵᛸ r2 = r11.f3680     // Catch: java.lang.Throwable -> L10b
            r2.flush()     // Catch: java.lang.Throwable -> L10b
            monitor-exit(r11)
            ᛴᛶᛳᛷ r11 = r0.f10213
            int r11 = r11.m1574()
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r11 == r2) goto L130
            ᛴᲈᛲᲀ r3 = r0.f10229
            int r11 = r11 - r2
            long r4 = (long) r11
            r3.m1721(r4, r1)
        L130:
            ᛵᲀᲇᛸ r11 = r0.f10209
            ᛴᛴᛸᛴ r11 = r11.m1908()
            java.lang.String r1 = r0.f10214
            ᛵᲈᛴᲈ r0 = r0.f10226
            defpackage.C0658.m1488(r11, r1, r0)
            return
        L13e:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L10b
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L10b
            throw r0     // Catch: java.lang.Throwable -> L10b
        L146:
            monitor-exit(r11)
            throw r0
        L148:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9e
            throw r0     // Catch: java.lang.Throwable -> L9e
        L150:
            monitor-exit(r11)
            throw r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean m3328(defpackage.C0038 r9, java.util.List r10) {
            r8 = this;
            ᛳᛸᛲ r0 = r9.f538
            java.lang.String r1 = r0.f2563
            java.util.TimeZone r2 = defpackage.AbstractC0508.f2501
            java.util.ArrayList r2 = r8.f8210
            int r2 = r2.size()
            int r3 = r8.f8200
            r4 = 0
            if (r2 >= r3) goto Lc2
            boolean r2 = r8.f8205
            if (r2 == 0) goto L17
            goto Lc2
        L17:
            ᲇᛵᲇᲇ r2 = r8.f8204
            ᛱᛲᛶᲈ r3 = r2.f8854
            ᛱᛲᛶᲈ r5 = r2.f8854
            boolean r3 = r3.m366(r9)
            if (r3 != 0) goto L25
            goto Lc2
        L25:
            ᛳᛸᛲ r3 = r5.f538
            java.lang.String r3 = r3.f2563
            boolean r3 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r3 == 0) goto L31
            goto Lb7
        L31:
            ᲈᲈ r3 = r8.f8199
            if (r3 != 0) goto L37
            goto Lc2
        L37:
            if (r10 == 0) goto Lc2
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L41
            goto Lc2
        L41:
            java.util.Iterator r10 = r10.iterator()
        L45:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Lc2
            java.lang.Object r3 = r10.next()
            ᲇᛵᲇᲇ r3 = (defpackage.C2058) r3
            java.net.Proxy r6 = r3.f8855
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L45
            java.net.Proxy r6 = r2.f8855
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L45
            java.net.InetSocketAddress r6 = r2.f8853
            java.net.InetSocketAddress r3 = r3.f8853
            boolean r3 = defpackage.AbstractC0498.m1280(r6, r3)
            if (r3 == 0) goto L45
            javax.net.ssl.HostnameVerifier r10 = r9.f541
            ᲁᛱᲀᛱ r2 = defpackage.C1800.f7897
            if (r10 == r2) goto L74
            goto Lc2
        L74:
            java.util.TimeZone r10 = defpackage.AbstractC0508.f2501
            ᛳᛸᛲ r10 = r5.f538
            int r0 = r0.f2562
            int r2 = r10.f2562
            if (r0 == r2) goto L7f
            goto Lc2
        L7f:
            java.lang.String r10 = r10.f2563
            boolean r10 = defpackage.AbstractC0498.m1280(r1, r10)
            ᛶᛳᛸᛷ r0 = r8.f8209
            if (r10 == 0) goto L8a
            goto La6
        L8a:
            boolean r8 = r8.f8197
            if (r8 != 0) goto Lc2
            if (r0 == 0) goto Lc2
            java.util.List r8 = r0.m2002()
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto Lc2
            java.lang.Object r8 = r8.get(r4)
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            boolean r8 = defpackage.C1800.m3190(r1, r8)
            if (r8 == 0) goto Lc2
        La6:
            ᲈᛳᛷ r8 = r9.f540     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            r0.m2002()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            java.util.Set r8 = r8.f9420     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            java.util.Iterator r8 = r8.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            boolean r9 = r8.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            if (r9 != 0) goto Lb9
        Lb7:
            r8 = 1
            return r8
        Lb9:
            java.lang.Object r8 = r8.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            defpackage.AbstractC1124.m2150(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            r8 = 0
            throw r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
        Lc2:
            return r4
    }

    @Override // defpackage.AbstractC1923
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo1955(defpackage.C1958 r2) {
            r1 = this;
            r1 = 8
            r0 = 0
            r2.m3377(r1, r0)
            return
    }

    @Override // defpackage.AbstractC1923
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo3329(defpackage.C0688 r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r2.f3312     // Catch: java.lang.Throwable -> L14
            r0 = r0 & 8
            if (r0 == 0) goto Ld
            int[] r2 = r2.f3313     // Catch: java.lang.Throwable -> L14
            r0 = 3
            r2 = r2[r0]     // Catch: java.lang.Throwable -> L14
            goto L10
        Ld:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L10:
            r1.f8200 = r2     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // defpackage.InterfaceC0561
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1356(defpackage.C1065 r4, java.io.IOException r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r5 instanceof defpackage.C0535     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            if (r0 == 0) goto L34
            r0 = r5
            ᛳᛸᲁᲈ r0 = (defpackage.C0535) r0     // Catch: java.lang.Throwable -> L1e
            int r0 = r0.f2653     // Catch: java.lang.Throwable -> L1e
            r2 = 8
            if (r0 != r2) goto L20
            int r4 = r3.f8206     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.f8206 = r4     // Catch: java.lang.Throwable -> L1e
            if (r4 <= r1) goto L55
            r3.f8205 = r1     // Catch: java.lang.Throwable -> L1e
            int r4 = r3.f8198     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.f8198 = r4     // Catch: java.lang.Throwable -> L1e
            goto L55
        L1e:
            r4 = move-exception
            goto L57
        L20:
            ᛳᛸᲁᲈ r5 = (defpackage.C0535) r5     // Catch: java.lang.Throwable -> L1e
            int r5 = r5.f2653     // Catch: java.lang.Throwable -> L1e
            r0 = 9
            if (r5 != r0) goto L2c
            boolean r4 = r4.f4731     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L55
        L2c:
            r3.f8205 = r1     // Catch: java.lang.Throwable -> L1e
            int r4 = r3.f8198     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.f8198 = r4     // Catch: java.lang.Throwable -> L1e
            goto L55
        L34:
            ᲈᲈ r0 = r3.f8199     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L3a
            r0 = r1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L41
            boolean r0 = r5 instanceof defpackage.C2253     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L55
        L41:
            r3.f8205 = r1     // Catch: java.lang.Throwable -> L1e
            int r0 = r3.f8202     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L55
            if (r5 == 0) goto L50
            ᲈᛴᛶᲁ r4 = r4.f4735     // Catch: java.lang.Throwable -> L1e
            ᲇᛵᲇᲇ r0 = r3.f8204     // Catch: java.lang.Throwable -> L1e
            m3326(r4, r0, r5)     // Catch: java.lang.Throwable -> L1e
        L50:
            int r4 = r3.f8198     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.f8198 = r4     // Catch: java.lang.Throwable -> L1e
        L55:
            monitor-exit(r3)
            return
        L57:
            monitor-exit(r3)
            throw r4
    }

    @Override // defpackage.InterfaceC0561
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final defpackage.C2058 mo1357() {
            r0 = this;
            ᲇᛵᲇᲇ r0 = r0.f8204
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean m3330(boolean r8) {
            r7 = this;
            java.util.TimeZone r0 = defpackage.AbstractC0508.f2501
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r7.f8203
            boolean r2 = r2.isClosed()
            r3 = 0
            if (r2 != 0) goto L7d
            java.net.Socket r2 = r7.f8201
            boolean r2 = r2.isClosed()
            if (r2 != 0) goto L7d
            java.net.Socket r2 = r7.f8201
            boolean r2 = r2.isInputShutdown()
            if (r2 != 0) goto L7d
            java.net.Socket r2 = r7.f8201
            boolean r2 = r2.isOutputShutdown()
            if (r2 == 0) goto L28
            goto L7d
        L28:
            ᲈᲈ r2 = r7.f8199
            r4 = 1
            if (r2 == 0) goto L4a
            monitor-enter(r2)
            boolean r7 = r2.f10206     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L34
            monitor-exit(r2)
            return r3
        L34:
            long r7 = r2.f10228     // Catch: java.lang.Throwable -> L44
            long r5 = r2.f10212     // Catch: java.lang.Throwable -> L44
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 >= 0) goto L46
            long r7 = r2.f10224     // Catch: java.lang.Throwable -> L44
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
            long r5 = r7.f8207     // Catch: java.lang.Throwable -> L7a
            long r0 = r0 - r5
            monitor-exit(r7)
            r5 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L79
            if (r8 == 0) goto L79
            java.net.Socket r8 = r7.f8201
            ᛷᛸᛱᛸ r7 = r7.f8196
            java.lang.Object r7 = r7.f5857
            ᲈᛵᲈᛵ r7 = (defpackage.C2252) r7
            int r0 = r8.getSoTimeout()     // Catch: java.net.SocketTimeoutException -> L77 java.io.IOException -> L78
            r8.setSoTimeout(r4)     // Catch: java.lang.Throwable -> L72
            boolean r7 = r7.m3645()     // Catch: java.lang.Throwable -> L72
            r7 = r7 ^ r4
            r8.setSoTimeout(r0)     // Catch: java.net.SocketTimeoutException -> L77 java.io.IOException -> L78
            return r7
        L72:
            r7 = move-exception
            r8.setSoTimeout(r0)     // Catch: java.net.SocketTimeoutException -> L77 java.io.IOException -> L78
            throw r7     // Catch: java.net.SocketTimeoutException -> L77 java.io.IOException -> L78
        L77:
            r3 = r4
        L78:
            return r3
        L79:
            return r4
        L7a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L7d:
            return r3
    }
}
