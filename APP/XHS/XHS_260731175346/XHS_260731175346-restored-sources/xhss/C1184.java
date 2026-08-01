package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲁᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1184 extends xhss.AbstractC1075 implements xhss.InterfaceC0900 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0723 f3821;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0065 f3822;

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public int f3823;

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final java.util.ArrayList f3824;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.net.Socket f3825;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public int f3826;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public xhss.C0927 f3827;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final xhss.C0623 f3828;

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public long f3829;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public int f3830;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public boolean f3831;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.EnumC1122 f3832;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.net.Socket f3833;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0446 f3834;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public int f3835;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public boolean f3836;

    public C1184(xhss.C0723 r1, xhss.C0065 r2, java.net.Socket r3, java.net.Socket r4, xhss.C0446 r5, xhss.EnumC1122 r6, xhss.C0623 r7) {
            r0 = this;
            r0.<init>()
            r0.f3821 = r1
            r0.f3822 = r2
            r0.f3833 = r3
            r0.f3825 = r4
            r0.f3834 = r5
            r0.f3832 = r6
            r0.f3828 = r7
            r1 = 1
            r0.f3823 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3824 = r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.f3829 = r1
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static void m1894(xhss.C0504 r3, xhss.C0065 r4, java.io.IOException r5) {
            java.net.Proxy r0 = r4.f357
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L1d
            xhss.ᛵᲈᛱᛳ r0 = r4.f359
            java.net.ProxySelector r1 = r0.f1926
            xhss.ᛷᛶᲁᛵ r0 = r0.f1924
            java.net.URI r0 = r0.m1158()
            java.net.Proxy r2 = r4.f357
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r5)
        L1d:
            xhss.ᲇᛵᛲᲁ r3 = r3.f1831
            monitor-enter(r3)
            java.lang.Object r5 = r3.f3349     // Catch: java.lang.Throwable -> L29
            java.util.LinkedHashSet r5 = (java.util.LinkedHashSet) r5     // Catch: java.lang.Throwable -> L29
            r5.add(r4)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)
            return
        L29:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r4
    }

    @Override // xhss.InterfaceC0900
    public final void cancel() {
            r0 = this;
            java.net.Socket r0 = r0.f3833
            xhss.AbstractC0559.m987(r0)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Connection{"
            r0.<init>(r1)
            xhss.ᛱᛷᲁᛶ r1 = r3.f3822
            xhss.ᛵᲈᛱᛳ r2 = r1.f359
            xhss.ᛷᛶᲁᛵ r2 = r2.f1924
            java.lang.String r2 = r2.f2288
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            xhss.ᛵᲈᛱᛳ r2 = r1.f359
            xhss.ᛷᛶᲁᛵ r2 = r2.f1924
            int r2 = r2.f2284
            r0.append(r2)
            java.lang.String r2 = ", proxy="
            r0.append(r2)
            java.net.Proxy r2 = r1.f357
            r0.append(r2)
            java.lang.String r2 = " hostAddress="
            r0.append(r2)
            java.net.InetSocketAddress r1 = r1.f358
            r0.append(r1)
            java.lang.String r1 = " cipherSuite="
            r0.append(r1)
            xhss.ᛵᛲᛸᛲ r1 = r3.f3834
            if (r1 == 0) goto L40
            xhss.ᛳᲁᲇᲀ r1 = r1.f1592
            goto L42
        L40:
            java.lang.String r1 = "none"
        L42:
            r0.append(r1)
            java.lang.String r1 = " protocol="
            r0.append(r1)
            xhss.ᲈᛲᛵᛴ r3 = r3.f3832
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // xhss.AbstractC1075
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final void mo543(xhss.C0741 r2) {
            r1 = this;
            r1 = 8
            r0 = 0
            r2.m1280(r1, r0)
            return
    }

    @Override // xhss.InterfaceC0900
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final xhss.C0065 mo590() {
            r0 = this;
            xhss.ᛱᛷᲁᛶ r0 = r0.f3822
            return r0
    }

    @Override // xhss.AbstractC1075
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo1734(xhss.C0414 r2) {
            r1 = this;
            monitor-enter(r1)
            int r0 = r2.f1468     // Catch: java.lang.Throwable -> L14
            r0 = r0 & 8
            if (r0 == 0) goto Ld
            int[] r2 = r2.f1467     // Catch: java.lang.Throwable -> L14
            r0 = 3
            r2 = r2[r0]     // Catch: java.lang.Throwable -> L14
            goto L10
        Ld:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L10:
            r1.f3823 = r2     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final void m1895() {
            r11 = this;
            long r0 = java.lang.System.nanoTime()
            r11.f3829 = r0
            xhss.ᲈᛲᛵᛴ r0 = r11.f3832
            xhss.ᲈᛲᛵᛴ r1 = xhss.EnumC1122.f3621
            if (r0 == r1) goto L12
            xhss.ᲈᛲᛵᛴ r1 = xhss.EnumC1122.f3619
            if (r0 != r1) goto L11
            goto L12
        L11:
            return
        L12:
            java.net.Socket r0 = r11.f3825
            r1 = 0
            r0.setSoTimeout(r1)
            xhss.ᛳᛴᲀᲁ r0 = xhss.C0263.f979
            xhss.ᛵᛷᛷᲀ r0 = xhss.C0494.f1807
            xhss.ᛴᛴᛴᛵ r2 = new xhss.ᛴᛴᛴᛵ
            xhss.ᛸᛱᛴᛳ r3 = r11.f3821
            r2.<init>(r3)
            xhss.ᛷᛱᛳᲁ r3 = r11.f3828
            xhss.ᛱᛷᲁᛶ r4 = r11.f3822
            xhss.ᛵᲈᛱᛳ r4 = r4.f359
            xhss.ᛷᛶᲁᛵ r4 = r4.f1924
            java.lang.String r4 = r4.f2288
            r2.f1314 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = xhss.AbstractC0559.f1983
            r3.append(r5)
            r5 = 32
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.f1317 = r3
            r2.f1315 = r11
            r2.f1318 = r0
            xhss.ᲁᛲᛵ r0 = new xhss.ᲁᛲᛵ
            r0.<init>(r2)
            r11.f3827 = r0
            xhss.ᛴᲇᛳᲇ r2 = xhss.C0927.f2986
            int r3 = r2.f1468
            r3 = r3 & 8
            if (r3 == 0) goto L60
            int[] r2 = r2.f1467
            r3 = 3
            r2 = r2[r3]
            goto L63
        L60:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L63:
            r11.f3823 = r2
            xhss.ᲀᛱᛶᛳ r11 = r0.f3003
            java.lang.String r2 = ">> CONNECTION "
            monitor-enter(r11)
            boolean r3 = r11.f2709     // Catch: java.lang.Throwable -> L94
            if (r3 != 0) goto L14f
            java.util.logging.Logger r3 = xhss.C0830.f2706     // Catch: java.lang.Throwable -> L94
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L94
            boolean r4 = r3.isLoggable(r4)     // Catch: java.lang.Throwable -> L94
            if (r4 == 0) goto L97
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L94
            xhss.ᛳᛶᲈᲈ r2 = xhss.AbstractC0922.f2974     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = r2.mo608()     // Catch: java.lang.Throwable -> L94
            r4.append(r2)     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L94
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L94
            java.lang.String r2 = xhss.AbstractC0559.m994(r2, r4)     // Catch: java.lang.Throwable -> L94
            r3.fine(r2)     // Catch: java.lang.Throwable -> L94
            goto L97
        L94:
            r0 = move-exception
            goto L157
        L97:
            xhss.ᛱᛸᛵᛱ r2 = r11.f2707     // Catch: java.lang.Throwable -> L94
            xhss.ᛳᛶᲈᲈ r3 = xhss.AbstractC0922.f2974     // Catch: java.lang.Throwable -> L94
            boolean r4 = r2.f409     // Catch: java.lang.Throwable -> L94
            if (r4 != 0) goto L147
            xhss.ᛴᛲᛴᛶ r4 = r2.f408     // Catch: java.lang.Throwable -> L94
            r4.m687(r3)     // Catch: java.lang.Throwable -> L94
            r2.m226()     // Catch: java.lang.Throwable -> L94
            xhss.ᛱᛸᛵᛱ r2 = r11.f2707     // Catch: java.lang.Throwable -> L94
            r2.flush()     // Catch: java.lang.Throwable -> L94
            monitor-exit(r11)
            xhss.ᲀᛱᛶᛳ r11 = r0.f3003
            xhss.ᛴᲇᛳᲇ r2 = r0.f2997
            monitor-enter(r11)
            boolean r3 = r11.f2709     // Catch: java.lang.Throwable -> L10a
            if (r3 != 0) goto L13d
            int r3 = r2.f1468     // Catch: java.lang.Throwable -> L10a
            int r3 = java.lang.Integer.bitCount(r3)     // Catch: java.lang.Throwable -> L10a
            int r3 = r3 * 6
            r4 = 4
            r11.m1417(r1, r3, r4, r1)     // Catch: java.lang.Throwable -> L10a
            r3 = r1
        Lc3:
            r4 = 10
            if (r3 >= r4) goto L117
            r4 = 1
            int r5 = r4 << r3
            int r6 = r2.f1468     // Catch: java.lang.Throwable -> L10a
            r5 = r5 & r6
            if (r5 == 0) goto Ld0
            goto Ld1
        Ld0:
            r4 = r1
        Ld1:
            if (r4 == 0) goto L114
            xhss.ᛱᛸᛵᛱ r4 = r11.f2707     // Catch: java.lang.Throwable -> L10a
            boolean r5 = r4.f409     // Catch: java.lang.Throwable -> L10a
            if (r5 != 0) goto L10c
            xhss.ᛴᛲᛴᛶ r5 = r4.f408     // Catch: java.lang.Throwable -> L10a
            r6 = 2
            xhss.ᛲᛳᲁᛳ r6 = r5.m691(r6)     // Catch: java.lang.Throwable -> L10a
            byte[] r7 = r6.f622     // Catch: java.lang.Throwable -> L10a
            int r8 = r6.f620     // Catch: java.lang.Throwable -> L10a
            int r9 = r8 + 1
            int r10 = r3 >>> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L10a
            r7[r8] = r10     // Catch: java.lang.Throwable -> L10a
            int r8 = r8 + 2
            r10 = r3 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L10a
            r7[r9] = r10     // Catch: java.lang.Throwable -> L10a
            r6.f620 = r8     // Catch: java.lang.Throwable -> L10a
            long r6 = r5.f1261     // Catch: java.lang.Throwable -> L10a
            r8 = 2
            long r6 = r6 + r8
            r5.f1261 = r6     // Catch: java.lang.Throwable -> L10a
            r4.m226()     // Catch: java.lang.Throwable -> L10a
            xhss.ᛱᛸᛵᛱ r4 = r11.f2707     // Catch: java.lang.Throwable -> L10a
            int[] r5 = r2.f1467     // Catch: java.lang.Throwable -> L10a
            r5 = r5[r3]     // Catch: java.lang.Throwable -> L10a
            r4.m231(r5)     // Catch: java.lang.Throwable -> L10a
            goto L114
        L10a:
            r0 = move-exception
            goto L145
        L10c:
            java.lang.String r0 = "closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L10a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L10a
            throw r1     // Catch: java.lang.Throwable -> L10a
        L114:
            int r3 = r3 + 1
            goto Lc3
        L117:
            xhss.ᛱᛸᛵᛱ r2 = r11.f2707     // Catch: java.lang.Throwable -> L10a
            r2.flush()     // Catch: java.lang.Throwable -> L10a
            monitor-exit(r11)
            xhss.ᛴᲇᛳᲇ r11 = r0.f2997
            int r11 = r11.m805()
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r11 == r2) goto L12f
            xhss.ᲀᛱᛶᛳ r3 = r0.f3003
            int r11 = r11 - r2
            long r4 = (long) r11
            r3.m1418(r4, r1)
        L12f:
            xhss.ᛸᛱᛴᛳ r11 = r0.f2999
            xhss.ᲇᲀᲀᛷ r11 = r11.m1271()
            java.lang.String r1 = r0.f3007
            xhss.ᛸᛵᛸᛶ r0 = r0.f2988
            xhss.C1081.m1738(r11, r1, r0)
            return
        L13d:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L10a
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L10a
            throw r0     // Catch: java.lang.Throwable -> L10a
        L145:
            monitor-exit(r11)
            throw r0
        L147:
            java.lang.String r0 = "closed"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L94
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L94
            throw r1     // Catch: java.lang.Throwable -> L94
        L14f:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = "closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L94
            throw r0     // Catch: java.lang.Throwable -> L94
        L157:
            monitor-exit(r11)
            throw r0
    }

    @Override // xhss.InterfaceC0900
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final void mo593() {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.f3831 = r0     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final boolean m1896(boolean r8) {
            r7 = this;
            java.util.TimeZone r0 = xhss.AbstractC0559.f1984
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r7.f3833
            boolean r2 = r2.isClosed()
            r3 = 0
            if (r2 != 0) goto L7d
            java.net.Socket r2 = r7.f3825
            boolean r2 = r2.isClosed()
            if (r2 != 0) goto L7d
            java.net.Socket r2 = r7.f3825
            boolean r2 = r2.isInputShutdown()
            if (r2 != 0) goto L7d
            java.net.Socket r2 = r7.f3825
            boolean r2 = r2.isOutputShutdown()
            if (r2 == 0) goto L28
            goto L7d
        L28:
            xhss.ᲁᛲᛵ r2 = r7.f3827
            r4 = 1
            if (r2 == 0) goto L4a
            monitor-enter(r2)
            boolean r7 = r2.f3004     // Catch: java.lang.Throwable -> L44
            if (r7 == 0) goto L34
            monitor-exit(r2)
            return r3
        L34:
            long r7 = r2.f2992     // Catch: java.lang.Throwable -> L44
            long r5 = r2.f3009     // Catch: java.lang.Throwable -> L44
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 >= 0) goto L46
            long r7 = r2.f2994     // Catch: java.lang.Throwable -> L44
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
            long r5 = r7.f3829     // Catch: java.lang.Throwable -> L7a
            long r0 = r0 - r5
            monitor-exit(r7)
            r5 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L79
            if (r8 == 0) goto L79
            java.net.Socket r8 = r7.f3825
            xhss.ᛷᛱᛳᲁ r7 = r7.f3828
            java.lang.Object r7 = r7.f2153
            xhss.ᲁᛸᛵᛳ r7 = (xhss.C0976) r7
            int r0 = r8.getSoTimeout()     // Catch: java.net.SocketTimeoutException -> L77 java.io.IOException -> L78
            r8.setSoTimeout(r4)     // Catch: java.lang.Throwable -> L72
            boolean r7 = r7.m1606()     // Catch: java.lang.Throwable -> L72
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

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final boolean m1897(xhss.C0526 r9, java.util.List r10) {
            r8 = this;
            xhss.ᛷᛶᲁᛵ r0 = r9.f1924
            java.lang.String r1 = r0.f2288
            java.util.TimeZone r2 = xhss.AbstractC0559.f1984
            java.util.ArrayList r2 = r8.f3824
            int r2 = r2.size()
            int r3 = r8.f3823
            r4 = 0
            if (r2 >= r3) goto Lc2
            boolean r2 = r8.f3831
            if (r2 == 0) goto L17
            goto Lc2
        L17:
            xhss.ᛱᛷᲁᛶ r2 = r8.f3822
            xhss.ᛵᲈᛱᛳ r3 = r2.f359
            xhss.ᛵᲈᛱᛳ r5 = r2.f359
            boolean r3 = r3.m940(r9)
            if (r3 != 0) goto L25
            goto Lc2
        L25:
            xhss.ᛷᛶᲁᛵ r3 = r5.f1924
            java.lang.String r3 = r3.f2288
            boolean r3 = xhss.AbstractC0007.m97(r1, r3)
            if (r3 == 0) goto L31
            goto Lb7
        L31:
            xhss.ᲁᛲᛵ r3 = r8.f3827
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
            xhss.ᛱᛷᲁᛶ r3 = (xhss.C0065) r3
            java.net.Proxy r6 = r3.f357
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L45
            java.net.Proxy r6 = r2.f357
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L45
            java.net.InetSocketAddress r6 = r2.f358
            java.net.InetSocketAddress r3 = r3.f358
            boolean r3 = xhss.AbstractC0007.m97(r6, r3)
            if (r3 == 0) goto L45
            javax.net.ssl.HostnameVerifier r10 = r9.f1927
            xhss.ᲈᛷᛴ r2 = xhss.C1155.f3752
            if (r10 == r2) goto L74
            goto Lc2
        L74:
            java.util.TimeZone r10 = xhss.AbstractC0559.f1984
            xhss.ᛷᛶᲁᛵ r10 = r5.f1924
            int r0 = r0.f2284
            int r2 = r10.f2284
            if (r0 == r2) goto L7f
            goto Lc2
        L7f:
            java.lang.String r10 = r10.f2288
            boolean r10 = xhss.AbstractC0007.m97(r1, r10)
            xhss.ᛵᛲᛸᛲ r0 = r8.f3834
            if (r10 == 0) goto L8a
            goto La6
        L8a:
            boolean r8 = r8.f3836
            if (r8 != 0) goto Lc2
            if (r0 == 0) goto Lc2
            java.util.List r8 = r0.m819()
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto Lc2
            java.lang.Object r8 = r8.get(r4)
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            boolean r8 = xhss.C1155.m1854(r1, r8)
            if (r8 == 0) goto Lc2
        La6:
            xhss.ᛲᛷᲀᲇ r8 = r9.f1921     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            r0.m819()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            java.util.Set r8 = r8.f750     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            java.util.Iterator r8 = r8.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            boolean r9 = r8.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            if (r9 != 0) goto Lb9
        Lb7:
            r8 = 1
            return r8
        Lb9:
            java.lang.Object r8 = r8.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            xhss.AbstractC0390.m786(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
            r8 = 0
            throw r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc2
        Lc2:
            return r4
    }

    @Override // xhss.InterfaceC0900
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final void mo596(xhss.C0819 r4, java.io.IOException r5) {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r5 instanceof xhss.C0095     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            if (r0 == 0) goto L34
            r0 = r5
            xhss.ᛱᲁᛲᛱ r0 = (xhss.C0095) r0     // Catch: java.lang.Throwable -> L1e
            int r0 = r0.f452     // Catch: java.lang.Throwable -> L1e
            r2 = 8
            if (r0 != r2) goto L20
            int r4 = r3.f3835     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.f3835 = r4     // Catch: java.lang.Throwable -> L1e
            if (r4 <= r1) goto L55
            r3.f3831 = r1     // Catch: java.lang.Throwable -> L1e
            int r4 = r3.f3826     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.f3826 = r4     // Catch: java.lang.Throwable -> L1e
            goto L55
        L1e:
            r4 = move-exception
            goto L57
        L20:
            xhss.ᛱᲁᛲᛱ r5 = (xhss.C0095) r5     // Catch: java.lang.Throwable -> L1e
            int r5 = r5.f452     // Catch: java.lang.Throwable -> L1e
            r0 = 9
            if (r5 != r0) goto L2c
            boolean r4 = r4.f2667     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L55
        L2c:
            r3.f3831 = r1     // Catch: java.lang.Throwable -> L1e
            int r4 = r3.f3826     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.f3826 = r4     // Catch: java.lang.Throwable -> L1e
            goto L55
        L34:
            xhss.ᲁᛲᛵ r0 = r3.f3827     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L3a
            r0 = r1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L41
            boolean r0 = r5 instanceof xhss.C1055     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L55
        L41:
            r3.f3831 = r1     // Catch: java.lang.Throwable -> L1e
            int r0 = r3.f3830     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L55
            if (r5 == 0) goto L50
            xhss.ᛵᛸᛷᛲ r4 = r4.f2659     // Catch: java.lang.Throwable -> L1e
            xhss.ᛱᛷᲁᛶ r0 = r3.f3822     // Catch: java.lang.Throwable -> L1e
            m1894(r4, r0, r5)     // Catch: java.lang.Throwable -> L1e
        L50:
            int r4 = r3.f3826     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + r1
            r3.f3826 = r4     // Catch: java.lang.Throwable -> L1e
        L55:
            monitor-exit(r3)
            return
        L57:
            monitor-exit(r3)
            throw r4
    }
}
