package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛴᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0946 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C1127 f3066;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f3067;

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public xhss.C0065 f3068;

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final xhss.C0801 f3069;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final int f3070;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0723 f3071;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final boolean f3072;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.C0526 f3073;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final boolean f3074;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public xhss.C0107 f3075;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.C1037 f3076;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final boolean f3077;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f3078;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final int f3079;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public xhss.C0992 f3080;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final xhss.C0819 f3081;

    public C0946(xhss.C0723 r1, xhss.C1127 r2, int r3, int r4, int r5, int r6, boolean r7, boolean r8, xhss.C0526 r9, xhss.C1037 r10, xhss.C0819 r11, xhss.C0355 r12) {
            r0 = this;
            r0.<init>()
            r0.f3071 = r1
            r0.f3066 = r2
            r0.f3067 = r3
            r0.f3078 = r4
            r0.f3070 = r5
            r0.f3079 = r6
            r0.f3077 = r7
            r0.f3074 = r8
            r0.f3073 = r9
            r0.f3076 = r10
            r0.f3081 = r11
            java.lang.Object r1 = r12.f1314
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "GET"
            boolean r1 = xhss.AbstractC0007.m97(r1, r2)
            r1 = r1 ^ 1
            r0.f3072 = r1
            xhss.ᛸᲀᛷᛷ r1 = new xhss.ᛸᲀᛷᛷ
            r1.<init>()
            r0.f3069 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0080 m1540() {
            r13 = this;
            xhss.ᛸᲇᲇᛶ r0 = r13.f3081
            xhss.ᲈᲁᛲᲇ r0 = r0.f2672
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
        L8:
            r3 = r1
            goto L6d
        La:
            boolean r3 = r13.f3072
            boolean r3 = r0.m1896(r3)
            monitor-enter(r0)
            boolean r4 = r0.f3831
            if (r3 != 0) goto L21
            r0.f3831 = r2     // Catch: java.lang.Throwable -> L1e
            xhss.ᛸᲇᲇᛶ r3 = r13.f3081     // Catch: java.lang.Throwable -> L1e
            java.net.Socket r3 = r3.m1387()     // Catch: java.lang.Throwable -> L1e
            goto L4b
        L1e:
            r13 = move-exception
            goto L360
        L21:
            if (r4 != 0) goto L45
            xhss.ᛱᛷᲁᛶ r3 = r0.f3822     // Catch: java.lang.Throwable -> L1e
            xhss.ᛵᲈᛱᛳ r3 = r3.f359     // Catch: java.lang.Throwable -> L1e
            xhss.ᛷᛶᲁᛵ r3 = r3.f1924     // Catch: java.lang.Throwable -> L1e
            xhss.ᛵᲈᛱᛳ r4 = r13.f3073     // Catch: java.lang.Throwable -> L1e
            xhss.ᛷᛶᲁᛵ r4 = r4.f1924     // Catch: java.lang.Throwable -> L1e
            int r5 = r3.f2284     // Catch: java.lang.Throwable -> L1e
            int r6 = r4.f2284     // Catch: java.lang.Throwable -> L1e
            if (r5 != r6) goto L3f
            java.lang.String r3 = r3.f2288     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r4.f2288     // Catch: java.lang.Throwable -> L1e
            boolean r3 = xhss.AbstractC0007.m97(r3, r4)     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L3f
            r3 = r2
            goto L40
        L3f:
            r3 = 0
        L40:
            if (r3 != 0) goto L43
            goto L45
        L43:
            r3 = r1
            goto L4b
        L45:
            xhss.ᛸᲇᲇᛶ r3 = r13.f3081     // Catch: java.lang.Throwable -> L1e
            java.net.Socket r3 = r3.m1387()     // Catch: java.lang.Throwable -> L1e
        L4b:
            monitor-exit(r0)
            xhss.ᛸᲇᲇᛶ r4 = r13.f3081
            xhss.ᲈᲁᛲᲇ r4 = r4.f2672
            if (r4 == 0) goto L60
            if (r3 != 0) goto L5a
            xhss.ᛴᛸᲇᛵ r3 = new xhss.ᛴᛸᲇᛵ
            r3.<init>(r0)
            goto L6d
        L5a:
            java.lang.String r13 = "Check failed."
            xhss.C0532.m950(r13)
            return r1
        L60:
            if (r3 == 0) goto L65
            xhss.AbstractC0559.m987(r3)
        L65:
            xhss.ᛸᲇᲇᛶ r0 = r13.f3081
            xhss.ᲀᲀᛱᲇ r0 = r0.f2665
            r0.getClass()
            goto L8
        L6d:
            if (r3 == 0) goto L70
            return r3
        L70:
            xhss.ᛴᛸᲇᛵ r0 = r13.m1543(r1, r1)
            if (r0 == 0) goto L77
            return r0
        L77:
            xhss.ᛸᲀᛷᛷ r0 = r13.f3069
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L88
            xhss.ᛸᲀᛷᛷ r13 = r13.f3069
            java.lang.Object r13 = r13.removeFirst()
            xhss.ᛱᛸᲁᛶ r13 = (xhss.InterfaceC0080) r13
            return r13
        L88:
            xhss.ᛱᛷᲁᛶ r0 = r13.f3068
            if (r0 == 0) goto L94
            r13.f3068 = r1
            xhss.ᛳᛵᲈ r0 = r13.m1541(r0, r1)
            goto L33e
        L94:
            xhss.ᛱᲇᛴᲇ r0 = r13.f3075
            if (r0 == 0) goto Lc8
            int r3 = r0.f485
            java.lang.Object r4 = r0.f486
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r3 >= r4) goto Lc8
            int r2 = r0.f485
            java.lang.Object r3 = r0.f486
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            if (r2 >= r4) goto Lc2
            int r2 = r0.f485
            int r4 = r2 + 1
            r0.f485 = r4
            java.lang.Object r0 = r3.get(r2)
            xhss.ᛱᛷᲁᛶ r0 = (xhss.C0065) r0
            xhss.ᛳᛵᲈ r0 = r13.m1541(r0, r1)
            goto L33e
        Lc2:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            r13.<init>()
            throw r13
        Lc8:
            xhss.ᲁᲇᛴᛳ r0 = r13.f3080
            if (r0 != 0) goto Ldb
            xhss.ᲁᲇᛴᛳ r0 = new xhss.ᲁᲇᛴᛳ
            xhss.ᛵᲈᛱᛳ r3 = r13.f3073
            xhss.ᲇᛵᛲᲁ r4 = r13.f3076
            xhss.ᛸᲇᲇᛶ r5 = r13.f3081
            boolean r6 = r13.f3074
            r0.<init>(r3, r4, r5, r6)
            r13.f3080 = r0
        Ldb:
            boolean r3 = r0.m1627()
            if (r3 == 0) goto L35a
            boolean r3 = r0.m1627()
            if (r3 == 0) goto L354
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        Lec:
            int r4 = r0.f3220
            java.util.List r5 = r0.f3215
            int r5 = r5.size()
            if (r4 >= r5) goto L308
            java.lang.String r4 = "No route to "
            int r5 = r0.f3220
            java.util.List r6 = r0.f3215
            int r6 = r6.size()
            if (r5 >= r6) goto L2e6
            java.util.List r5 = r0.f3215
            int r6 = r0.f3220
            int r7 = r6 + 1
            r0.f3220 = r7
            java.lang.Object r5 = r5.get(r6)
            java.net.Proxy r5 = (java.net.Proxy) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.f3218 = r6
            java.net.Proxy$Type r7 = r5.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.DIRECT
            if (r7 == r8) goto L162
            java.net.Proxy$Type r7 = r5.type()
            java.net.Proxy$Type r8 = java.net.Proxy.Type.SOCKS
            if (r7 != r8) goto L128
            goto L162
        L128:
            java.net.SocketAddress r7 = r5.address()
            boolean r8 = r7 instanceof java.net.InetSocketAddress
            if (r8 == 0) goto L146
            java.net.InetSocketAddress r7 = (java.net.InetSocketAddress) r7
            java.net.InetAddress r8 = r7.getAddress()
            if (r8 != 0) goto L13d
            java.lang.String r8 = r7.getHostName()
            goto L141
        L13d:
            java.lang.String r8 = r8.getHostAddress()
        L141:
            int r7 = r7.getPort()
            goto L16a
        L146:
            java.lang.String r13 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.Class r0 = r7.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r13)
            r1.append(r0)
            java.lang.String r13 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L162:
            xhss.ᛵᲈᛱᛳ r7 = r0.f3216
            xhss.ᛷᛶᲁᛵ r7 = r7.f1924
            java.lang.String r8 = r7.f2288
            int r7 = r7.f2284
        L16a:
            if (r2 > r7) goto L2c7
            r9 = 65536(0x10000, float:9.1835E-41)
            if (r7 >= r9) goto L2c7
            java.net.Proxy$Type r4 = r5.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.SOCKS
            if (r4 != r9) goto L181
            java.net.InetSocketAddress r4 = java.net.InetSocketAddress.createUnresolved(r8, r7)
            r6.add(r4)
            goto L25e
        L181:
            xhss.ᛲᛳᛴᲁ r4 = xhss.AbstractC0898.f2925
            java.lang.Object r4 = r4.f617
            java.util.regex.Pattern r4 = (java.util.regex.Pattern) r4
            java.util.regex.Matcher r4 = r4.matcher(r8)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L19a
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r8)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            goto L1bd
        L19a:
            xhss.ᛸᲇᲇᛶ r4 = r0.f3214
            xhss.ᲀᲀᛱᲇ r4 = r4.f2665
            r4.getClass()
            xhss.ᛵᲈᛱᛳ r4 = r0.f3216
            xhss.ᛳᛴᲀᲁ r4 = r4.f1922
            r4.getClass()
            java.net.InetAddress[] r4 = java.net.InetAddress.getAllByName(r8)     // Catch: java.lang.NullPointerException -> L2b7
            java.util.List r4 = xhss.AbstractC0193.m454(r4)     // Catch: java.lang.NullPointerException -> L2b7
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L299
            xhss.ᛸᲇᲇᛶ r8 = r0.f3214
            xhss.ᲀᲀᛱᲇ r8 = r8.f2665
            r8.getClass()
        L1bd:
            boolean r8 = r0.f3219
            if (r8 == 0) goto L245
            int r8 = r4.size()
            r9 = 2
            if (r8 >= r9) goto L1ca
            goto L245
        L1ca:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r4.iterator()
        L1d8:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L1f1
            java.lang.Object r11 = r10.next()
            r12 = r11
            java.net.InetAddress r12 = (java.net.InetAddress) r12
            boolean r12 = r12 instanceof java.net.Inet6Address
            if (r12 == 0) goto L1ed
            r8.add(r11)
            goto L1d8
        L1ed:
            r9.add(r11)
            goto L1d8
        L1f1:
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L245
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L1fe
            goto L245
        L1fe:
            byte[] r4 = xhss.AbstractC0577.f2010
            java.util.Iterator r8 = r8.iterator()
            java.util.Iterator r9 = r9.iterator()
            xhss.ᲈᛶᲀᲈ r10 = new xhss.ᲈᛶᲀᲈ
            r4 = 10
            r10.<init>(r4)
        L20f:
            boolean r4 = r8.hasNext()
            if (r4 != 0) goto L22a
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L21c
            goto L22a
        L21c:
            r10.m1852()
            r10.f3747 = r2
            int r4 = r10.f3746
            if (r4 <= 0) goto L227
            r4 = r10
            goto L245
        L227:
            xhss.ᲈᛶᲀᲈ r4 = xhss.C1150.f3744
            goto L245
        L22a:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L237
            java.lang.Object r4 = r8.next()
            r10.add(r4)
        L237:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L20f
            java.lang.Object r4 = r9.next()
            r10.add(r4)
            goto L20f
        L245:
            java.util.Iterator r4 = r4.iterator()
        L249:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L25e
            java.lang.Object r8 = r4.next()
            java.net.InetAddress r8 = (java.net.InetAddress) r8
            java.net.InetSocketAddress r9 = new java.net.InetSocketAddress
            r9.<init>(r8, r7)
            r6.add(r9)
            goto L249
        L25e:
            java.util.List r4 = r0.f3218
            java.util.Iterator r4 = r4.iterator()
        L264:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L292
            java.lang.Object r6 = r4.next()
            java.net.InetSocketAddress r6 = (java.net.InetSocketAddress) r6
            xhss.ᛱᛷᲁᛶ r7 = new xhss.ᛱᛷᲁᛶ
            xhss.ᛵᲈᛱᛳ r8 = r0.f3216
            r7.<init>(r8, r5, r6)
            xhss.ᲇᛵᛲᲁ r6 = r0.f3213
            monitor-enter(r6)
            java.lang.Object r8 = r6.f3349     // Catch: java.lang.Throwable -> L28f
            java.util.LinkedHashSet r8 = (java.util.LinkedHashSet) r8     // Catch: java.lang.Throwable -> L28f
            boolean r8 = r8.contains(r7)     // Catch: java.lang.Throwable -> L28f
            monitor-exit(r6)
            if (r8 == 0) goto L28b
            java.util.ArrayList r6 = r0.f3217
            r6.add(r7)
            goto L264
        L28b:
            r3.add(r7)
            goto L264
        L28f:
            r13 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L28f
            throw r13
        L292:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto Lec
            goto L308
        L299:
            java.net.UnknownHostException r13 = new java.net.UnknownHostException
            xhss.ᛵᲈᛱᛳ r0 = r0.f3216
            xhss.ᛳᛴᲀᲁ r0 = r0.f1922
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " returned no addresses for "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            r13.<init>(r0)
            throw r13
        L2b7:
            r13 = move-exception
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r1 = "Broken system behaviour for dns lookup of "
            java.lang.String r1 = r1.concat(r8)
            r0.<init>(r1)
            r0.initCause(r13)
            throw r0
        L2c7:
            java.net.SocketException r13 = new java.net.SocketException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r8)
            r1 = 58
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = "; port is out of range"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L2e6:
            java.net.SocketException r13 = new java.net.SocketException
            xhss.ᛵᲈᛱᛳ r1 = r0.f3216
            xhss.ᛷᛶᲁᛵ r1 = r1.f1924
            java.lang.String r1 = r1.f2288
            java.lang.String r2 = "; exhausted proxy configurations: "
            java.util.List r0 = r0.f3215
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r1)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r13.<init>(r0)
            throw r13
        L308:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L318
            java.util.ArrayList r2 = r0.f3217
            xhss.AbstractC0648.m1133(r3, r2)
            java.util.ArrayList r0 = r0.f3217
            r0.clear()
        L318:
            xhss.ᛱᲇᛴᲇ r0 = new xhss.ᛱᲇᛴᲇ
            r2 = 6
            r0.<init>(r2, r3)
            r13.f3075 = r0
            xhss.ᛸᲇᲇᛶ r2 = r13.f3081
            boolean r2 = r2.f2667
            if (r2 != 0) goto L34e
            int r1 = r0.f485
            int r2 = r3.size()
            if (r1 >= r2) goto L348
            int r1 = r0.f485
            int r2 = r1 + 1
            r0.f485 = r2
            java.lang.Object r0 = r3.get(r1)
            xhss.ᛱᛷᲁᛶ r0 = (xhss.C0065) r0
            xhss.ᛳᛵᲈ r0 = r13.m1541(r0, r3)
        L33e:
            java.util.List r1 = r0.f1094
            xhss.ᛴᛸᲇᛵ r13 = r13.m1543(r0, r1)
            if (r13 == 0) goto L347
            return r13
        L347:
            return r0
        L348:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            r13.<init>()
            throw r13
        L34e:
            java.lang.String r13 = "Canceled"
            xhss.C0532.m947(r13)
            return r1
        L354:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            r13.<init>()
            throw r13
        L35a:
            java.lang.String r13 = "exhausted all routes"
            xhss.C0532.m947(r13)
            return r1
        L360:
            monitor-exit(r0)
            throw r13
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0280 m1541(xhss.C0065 r16, java.util.ArrayList r17) {
            r15 = this;
            r10 = r16
            xhss.ᲈᛲᛵᛴ r0 = xhss.EnumC1122.f3619
            xhss.ᛵᲈᛱᛳ r1 = r10.f359
            javax.net.ssl.SSLSocketFactory r2 = r1.f1920
            if (r2 != 0) goto L42
            java.util.List r1 = r1.f1925
            xhss.ᛶᛴᛴᛳ r2 = xhss.C0557.f1978
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L3a
            xhss.ᛵᲈᛱᛳ r1 = r10.f359
            xhss.ᛷᛶᲁᛵ r1 = r1.f1924
            java.lang.String r1 = r1.f2288
            xhss.ᛵᛳᛸᲇ r2 = xhss.AbstractC0831.f2712
            xhss.ᛵᛳᛸᲇ r2 = xhss.AbstractC0831.f2712
            r2.getClass()
            android.security.NetworkSecurityPolicy r2 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r2 = r2.isCleartextTrafficPermitted(r1)
            if (r2 == 0) goto L2c
            goto L4a
        L2c:
            java.net.UnknownServiceException r15 = new java.net.UnknownServiceException
            java.lang.String r0 = "CLEARTEXT communication to "
            java.lang.String r2 = " not permitted by network security policy"
            java.lang.String r0 = xhss.AbstractC0390.m781(r0, r1, r2)
            r15.<init>(r0)
            throw r15
        L3a:
            java.net.UnknownServiceException r15 = new java.net.UnknownServiceException
            java.lang.String r0 = "CLEARTEXT communication not enabled for client"
            r15.<init>(r0)
            throw r15
        L42:
            java.util.List r1 = r1.f1923
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto Ld7
        L4a:
            java.net.Proxy r1 = r10.f357
            java.net.Proxy$Type r1 = r1.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.HTTP
            if (r1 == r2) goto L55
            goto L64
        L55:
            xhss.ᛵᲈᛱᛳ r1 = r10.f359
            javax.net.ssl.SSLSocketFactory r2 = r1.f1920
            if (r2 != 0) goto L67
            java.util.List r1 = r1.f1923
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L64
            goto L67
        L64:
            r0 = 0
            r12 = r0
            goto Lbc
        L67:
            xhss.ᲇᛸᛶ r0 = new xhss.ᲇᛸᛶ
            r1 = 5
            r0.<init>(r1)
            xhss.ᛵᲈᛱᛳ r1 = r10.f359
            xhss.ᛷᛶᲁᛵ r1 = r1.f1924
            r0.f3444 = r1
            java.lang.String r1 = "CONNECT"
            r0.m1731(r1)
            xhss.ᛵᲈᛱᛳ r1 = r10.f359
            xhss.ᛷᛶᲁᛵ r2 = r1.f1924
            r3 = 1
            java.lang.String r2 = xhss.AbstractC0559.m991(r2, r3)
            java.lang.Object r4 = r0.f3445
            xhss.ᛴᲈᛱᲁ r4 = (xhss.C0425) r4
            java.lang.String r5 = "Host"
            r4.m813(r5, r2)
            java.lang.Object r2 = r0.f3445
            xhss.ᛴᲈᛱᲁ r2 = (xhss.C0425) r2
            java.lang.String r4 = "Proxy-Connection"
            java.lang.String r5 = "Keep-Alive"
            r2.m813(r4, r5)
            java.lang.Object r2 = r0.f3445
            xhss.ᛴᲈᛱᲁ r2 = (xhss.C0425) r2
            java.lang.String r4 = "User-Agent"
            java.lang.String r5 = "okhttp/5.4.0"
            r2.m813(r4, r5)
            xhss.ᛴᛴᛴᛵ r2 = new xhss.ᛴᛴᛴᛵ
            r2.<init>(r0)
            xhss.ᛵᛷᛳᲀ r0 = xhss.AbstractC1052.f3379
            xhss.ᛴᲈᛱᲁ r0 = new xhss.ᛴᲈᛱᲁ
            r0.<init>(r3)
            java.lang.String r3 = "Proxy-Authenticate"
            java.lang.String r4 = "OkHttp-Preemptive"
            r0.m813(r3, r4)
            xhss.AbstractC0694.m1221(r0)
            xhss.ᛳᛴᲀᲁ r0 = r1.f1928
            r0.getClass()
            r12 = r2
        Lbc:
            xhss.ᛳᛵᲈ r0 = new xhss.ᛳᛵᲈ
            xhss.ᛸᛱᛴᛳ r1 = r15.f3071
            xhss.ᲈᛲᲀᛵ r2 = r15.f3066
            int r3 = r15.f3067
            int r4 = r15.f3078
            int r5 = r15.f3070
            int r6 = r15.f3079
            boolean r7 = r15.f3077
            xhss.ᛸᲇᲇᛶ r8 = r15.f3081
            r13 = -1
            r14 = 0
            r9 = r15
            r11 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        Ld7:
            java.net.UnknownServiceException r15 = new java.net.UnknownServiceException
            java.lang.String r0 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r15.<init>(r0)
            throw r15
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean m1542(xhss.C1184 r5) {
            r4 = this;
            xhss.ᛸᲀᛷᛷ r0 = r4.f3069
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto La
            goto L4e
        La:
            xhss.ᛱᛷᲁᛶ r0 = r4.f3068
            if (r0 == 0) goto Lf
            goto L4e
        Lf:
            if (r5 == 0) goto L39
            monitor-enter(r5)
            int r0 = r5.f3826     // Catch: java.lang.Throwable -> L36
            r2 = 0
            if (r0 == 0) goto L18
            goto L30
        L18:
            boolean r0 = r5.f3831     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L1d
            goto L30
        L1d:
            xhss.ᛱᛷᲁᛶ r0 = r5.f3822     // Catch: java.lang.Throwable -> L36
            xhss.ᛵᲈᛱᛳ r0 = r0.f359     // Catch: java.lang.Throwable -> L36
            xhss.ᛷᛶᲁᛵ r0 = r0.f1924     // Catch: java.lang.Throwable -> L36
            xhss.ᛵᲈᛱᛳ r3 = r4.f3073     // Catch: java.lang.Throwable -> L36
            xhss.ᛷᛶᲁᛵ r3 = r3.f1924     // Catch: java.lang.Throwable -> L36
            boolean r0 = xhss.AbstractC0559.m989(r0, r3)     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L2e
            goto L30
        L2e:
            xhss.ᛱᛷᲁᛶ r2 = r5.f3822     // Catch: java.lang.Throwable -> L36
        L30:
            monitor-exit(r5)
            if (r2 == 0) goto L39
            r4.f3068 = r2
            return r1
        L36:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L39:
            xhss.ᛱᲇᛴᲇ r5 = r4.f3075
            if (r5 == 0) goto L4a
            int r0 = r5.f485
            java.lang.Object r5 = r5.f486
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            if (r0 >= r5) goto L4a
            return r1
        L4a:
            xhss.ᲁᲇᛴᛳ r4 = r4.f3080
            if (r4 != 0) goto L4f
        L4e:
            return r1
        L4f:
            boolean r4 = r4.m1627()
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0399 m1543(xhss.C0280 r11, java.util.List r12) {
            r10 = this;
            xhss.ᲈᛲᲀᛵ r0 = r10.f3066
            boolean r1 = r10.f3072
            xhss.ᛵᲈᛱᛳ r2 = r10.f3073
            xhss.ᛸᲇᲇᛶ r3 = r10.f3081
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.mo242()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f3641
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L60
            java.lang.Object r7 = r0.next()
            xhss.ᲈᲁᛲᲇ r7 = (xhss.C1184) r7
            monitor-enter(r7)
            if (r6 == 0) goto L38
            xhss.ᲁᛲᛵ r9 = r7.f3827     // Catch: java.lang.Throwable -> L36
            if (r9 == 0) goto L31
            r9 = r5
            goto L32
        L31:
            r9 = r4
        L32:
            if (r9 != 0) goto L38
        L34:
            r9 = r4
            goto L43
        L36:
            r10 = move-exception
            goto L5e
        L38:
            boolean r9 = r7.m1897(r2, r12)     // Catch: java.lang.Throwable -> L36
            if (r9 != 0) goto L3f
            goto L34
        L3f:
            r3.m1386(r7)     // Catch: java.lang.Throwable -> L36
            r9 = r5
        L43:
            monitor-exit(r7)
            if (r9 == 0) goto L1b
            boolean r9 = r7.m1896(r1)
            if (r9 == 0) goto L4d
            goto L61
        L4d:
            monitor-enter(r7)
            r7.f3831 = r5     // Catch: java.lang.Throwable -> L5b
            java.net.Socket r8 = r3.m1387()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r7)
            if (r8 == 0) goto L1b
            xhss.AbstractC0559.m987(r8)
            goto L1b
        L5b:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L5e:
            monitor-exit(r7)
            throw r10
        L60:
            r7 = r8
        L61:
            if (r7 != 0) goto L64
            return r8
        L64:
            if (r11 == 0) goto L71
            xhss.ᛱᛷᲁᛶ r12 = r11.f1088
            r10.f3068 = r12
            java.net.Socket r11 = r11.f1086
            if (r11 == 0) goto L71
            xhss.AbstractC0559.m987(r11)
        L71:
            xhss.ᛸᲇᲇᛶ r10 = r10.f3081
            xhss.ᲀᲀᛱᲇ r10 = r10.f2665
            r10.getClass()
            xhss.ᛴᛸᲇᛵ r10 = new xhss.ᛴᛸᲇᛵ
            r10.<init>(r7)
            return r10
    }
}
