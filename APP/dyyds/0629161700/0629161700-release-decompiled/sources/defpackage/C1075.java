package defpackage;

/* JADX INFO: renamed from: ᛶᛵᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1075 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean f4822;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final defpackage.C1065 f4823;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final boolean f4824;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.C0038 f4825;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public defpackage.C2058 f4826;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f4827;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public defpackage.C2073 f4828;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f4829;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f4830;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0964 f4831;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.C1180 f4832;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public defpackage.C1413 f4833;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0871 f4834;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f4835;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final defpackage.C1185 f4836;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean f4837;

    public C1075(defpackage.C0964 r1, defpackage.C0871 r2, int r3, int r4, int r5, int r6, boolean r7, boolean r8, defpackage.C0038 r9, defpackage.C1180 r10, defpackage.C1065 r11, defpackage.C0478 r12) {
            r0 = this;
            r0.<init>()
            r0.f4831 = r1
            r0.f4834 = r2
            r0.f4830 = r3
            r0.f4829 = r4
            r0.f4827 = r5
            r0.f4835 = r6
            r0.f4837 = r7
            r0.f4822 = r8
            r0.f4825 = r9
            r0.f4832 = r10
            r0.f4823 = r11
            java.lang.Object r1 = r12.f2400
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "GET"
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r2)
            r1 = r1 ^ 1
            r0.f4824 = r1
            ᛶᲈᛷᛵ r1 = new ᛶᲈᛷᛵ
            r1.<init>()
            r0.f4836 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C2348 m2050(defpackage.C1437 r11, java.util.List r12) {
            r10 = this;
            ᛵᛴᛶᛷ r0 = r10.f4834
            boolean r1 = r10.f4824
            ᛱᛲᛶᲈ r2 = r10.f4825
            ᛶᛴᲈ r3 = r10.f4823
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.mo535()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.f3939
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L60
            java.lang.Object r7 = r0.next()
            ᲁᛸᛲᛶ r7 = (defpackage.C1894) r7
            monitor-enter(r7)
            if (r6 == 0) goto L38
            ᲈᲈ r9 = r7.f8199     // Catch: java.lang.Throwable -> L36
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
            boolean r9 = r7.m3328(r2, r12)     // Catch: java.lang.Throwable -> L36
            if (r9 != 0) goto L3f
            goto L34
        L3f:
            r3.m2023(r7)     // Catch: java.lang.Throwable -> L36
            r9 = r5
        L43:
            monitor-exit(r7)
            if (r9 == 0) goto L1b
            boolean r9 = r7.m3330(r1)
            if (r9 == 0) goto L4d
            goto L61
        L4d:
            monitor-enter(r7)
            r7.f8205 = r5     // Catch: java.lang.Throwable -> L5b
            java.net.Socket r8 = r3.m2019()     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r7)
            if (r8 == 0) goto L1b
            defpackage.AbstractC0508.m1294(r8)
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
            ᲇᛵᲇᲇ r12 = r11.f6311
            r10.f4826 = r12
            java.net.Socket r11 = r11.f6314
            if (r11 == 0) goto L71
            defpackage.AbstractC0508.m1294(r11)
        L71:
            ᛶᛴᲈ r10 = r10.f4823
            ᛳᛳᲀᲁ r10 = r10.f4740
            r10.getClass()
            ᲈᲇᛱᲈ r10 = new ᲈᲇᛱᲈ
            r10.<init>(r7)
            return r10
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1437 m2051(defpackage.C2058 r30, java.util.ArrayList r31) {
            r29 = this;
            r9 = r29
            r10 = r30
            ᲁᛳᛶᛵ r0 = defpackage.EnumC1832.f7978
            ᛱᛲᛶᲈ r1 = r10.f8854
            javax.net.ssl.SSLSocketFactory r2 = r1.f542
            if (r2 != 0) goto L44
            java.util.List r1 = r1.f544
            ᛳᛳᛶᲇ r2 = defpackage.C0441.f2171
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L3c
            ᛱᛲᛶᲈ r1 = r10.f8854
            ᛳᛸᛲ r1 = r1.f538
            java.lang.String r1 = r1.f2563
            ᛴᲈᲀᲇ r2 = defpackage.AbstractC1692.f7550
            ᛴᲈᲀᲇ r2 = defpackage.AbstractC1692.f7550
            r2.getClass()
            android.security.NetworkSecurityPolicy r2 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r2 = r2.isCleartextTrafficPermitted(r1)
            if (r2 == 0) goto L2e
            goto L4c
        L2e:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication to "
            java.lang.String r3 = " not permitted by network security policy"
            java.lang.String r1 = defpackage.AbstractC0225.m817(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L3c:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.String r1 = "CLEARTEXT communication not enabled for client"
            r0.<init>(r1)
            throw r0
        L44:
            java.util.List r1 = r1.f539
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto Lfe
        L4c:
            java.net.Proxy r1 = r10.f8855
            java.net.Proxy$Type r1 = r1.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.HTTP
            r3 = 0
            if (r1 == r2) goto L58
            goto L67
        L58:
            ᛱᛲᛶᲈ r1 = r10.f8854
            javax.net.ssl.SSLSocketFactory r2 = r1.f542
            if (r2 != 0) goto L6a
            java.util.List r1 = r1.f539
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L67
            goto L6a
        L67:
            r13 = r3
            goto Le3
        L6a:
            ᛳᲀᲁᲈ r0 = new ᛳᲀᲁᲈ
            r0.<init>()
            ᛱᛲᛶᲈ r1 = r10.f8854
            ᛳᛸᛲ r1 = r1.f538
            r0.f2713 = r1
            java.lang.String r1 = "CONNECT"
            r0.m1338(r1, r3)
            ᛱᛲᛶᲈ r1 = r10.f8854
            ᛳᛸᛲ r2 = r1.f538
            r3 = 1
            java.lang.String r2 = defpackage.AbstractC0508.m1291(r2, r3)
            java.lang.Object r3 = r0.f2711
            ᛳᲈᛳᛸ r3 = (defpackage.C0588) r3
            java.lang.String r4 = "Host"
            r3.m1386(r4, r2)
            java.lang.Object r2 = r0.f2711
            ᛳᲈᛳᛸ r2 = (defpackage.C0588) r2
            java.lang.String r3 = "Proxy-Connection"
            java.lang.String r4 = "Keep-Alive"
            r2.m1386(r3, r4)
            java.lang.Object r2 = r0.f2711
            ᛳᲈᛳᛸ r2 = (defpackage.C0588) r2
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = "okhttp/5.4.0"
            r2.m1386(r3, r4)
            ᛳᛵᛴᛴ r12 = new ᛳᛵᛴᛴ
            r12.<init>(r0)
            ᛱᛷᛱᛳ r18 = defpackage.AbstractC1188.f5385
            ᲈᛴᛵᲈ r28 = defpackage.InterfaceC1343.f5920
            ᛳᲈᛳᛸ r0 = new ᛳᲈᛳᛸ
            r2 = 2
            r0.<init>(r2)
            ᲁᛳᛶᛵ r13 = defpackage.EnumC1832.f7981
            java.lang.String r2 = "Proxy-Authenticate"
            java.lang.String r3 = "OkHttp-Preemptive"
            r0.m1386(r2, r3)
            ᛱᛱᛷᛳ r17 = defpackage.AbstractC0729.m1641(r0)
            ᛳᲇᛲᲁ r11 = new ᛳᲇᛲᲁ
            java.lang.String r14 = "Preemptive Authenticate"
            r15 = 407(0x197, float:5.7E-43)
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = -1
            r25 = -1
            r27 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r28)
            ᲈᲈᛳᛷ r0 = r1.f546
            ᛳᛵᛴᛴ r0 = r0.mo1549(r10, r11)
            if (r0 != 0) goto Le1
            r3 = r12
            goto L67
        Le1:
            r3 = r0
            goto L67
        Le3:
            ᛸᛲᛶᲈ r0 = new ᛸᛲᛶᲈ
            ᛵᲀᲇᛸ r1 = r9.f4831
            ᛵᛴᛶᛷ r2 = r9.f4834
            int r3 = r9.f4830
            int r4 = r9.f4829
            int r5 = r9.f4827
            int r6 = r9.f4835
            boolean r7 = r9.f4837
            ᛶᛴᲈ r8 = r9.f4823
            r14 = -1
            r15 = 0
            r12 = 0
            r11 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        Lfe:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.String r1 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m2052(defpackage.C1894 r5) {
            r4 = this;
            ᛶᲈᛷᛵ r0 = r4.f4836
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto La
            goto L4e
        La:
            ᲇᛵᲇᲇ r0 = r4.f4826
            if (r0 == 0) goto Lf
            goto L4e
        Lf:
            if (r5 == 0) goto L39
            monitor-enter(r5)
            int r0 = r5.f8198     // Catch: java.lang.Throwable -> L36
            r2 = 0
            if (r0 == 0) goto L18
            goto L30
        L18:
            boolean r0 = r5.f8205     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L1d
            goto L30
        L1d:
            ᲇᛵᲇᲇ r0 = r5.f8204     // Catch: java.lang.Throwable -> L36
            ᛱᛲᛶᲈ r0 = r0.f8854     // Catch: java.lang.Throwable -> L36
            ᛳᛸᛲ r0 = r0.f538     // Catch: java.lang.Throwable -> L36
            ᛱᛲᛶᲈ r3 = r4.f4825     // Catch: java.lang.Throwable -> L36
            ᛳᛸᛲ r3 = r3.f538     // Catch: java.lang.Throwable -> L36
            boolean r0 = defpackage.AbstractC0508.m1295(r0, r3)     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L2e
            goto L30
        L2e:
            ᲇᛵᲇᲇ r2 = r5.f8204     // Catch: java.lang.Throwable -> L36
        L30:
            monitor-exit(r5)
            if (r2 == 0) goto L39
            r4.f4826 = r2
            return r1
        L36:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L39:
            ᲇᛶᲀᛸ r5 = r4.f4828
            if (r5 == 0) goto L4a
            int r0 = r5.f8901
            java.lang.Object r5 = r5.f8900
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            if (r0 >= r5) goto L4a
            return r1
        L4a:
            ᛸᛱᛲᲈ r4 = r4.f4833
            if (r4 != 0) goto L4f
        L4e:
            return r1
        L4f:
            boolean r4 = r4.m2598()
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.InterfaceC0077 m2053() {
            r13 = this;
            ᛶᛴᲈ r0 = r13.f4823
            ᲁᛸᛲᛶ r0 = r0.f4725
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
        L8:
            r3 = r1
            goto L6d
        La:
            boolean r3 = r13.f4824
            boolean r3 = r0.m3330(r3)
            monitor-enter(r0)
            boolean r4 = r0.f8205
            if (r3 != 0) goto L21
            r0.f8205 = r2     // Catch: java.lang.Throwable -> L1e
            ᛶᛴᲈ r3 = r13.f4823     // Catch: java.lang.Throwable -> L1e
            java.net.Socket r3 = r3.m2019()     // Catch: java.lang.Throwable -> L1e
            goto L4b
        L1e:
            r13 = move-exception
            goto L364
        L21:
            if (r4 != 0) goto L45
            ᲇᛵᲇᲇ r3 = r0.f8204     // Catch: java.lang.Throwable -> L1e
            ᛱᛲᛶᲈ r3 = r3.f8854     // Catch: java.lang.Throwable -> L1e
            ᛳᛸᛲ r3 = r3.f538     // Catch: java.lang.Throwable -> L1e
            ᛱᛲᛶᲈ r4 = r13.f4825     // Catch: java.lang.Throwable -> L1e
            ᛳᛸᛲ r4 = r4.f538     // Catch: java.lang.Throwable -> L1e
            int r5 = r3.f2562     // Catch: java.lang.Throwable -> L1e
            int r6 = r4.f2562     // Catch: java.lang.Throwable -> L1e
            if (r5 != r6) goto L3f
            java.lang.String r3 = r3.f2563     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = r4.f2563     // Catch: java.lang.Throwable -> L1e
            boolean r3 = defpackage.AbstractC0498.m1280(r3, r4)     // Catch: java.lang.Throwable -> L1e
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
            ᛶᛴᲈ r3 = r13.f4823     // Catch: java.lang.Throwable -> L1e
            java.net.Socket r3 = r3.m2019()     // Catch: java.lang.Throwable -> L1e
        L4b:
            monitor-exit(r0)
            ᛶᛴᲈ r4 = r13.f4823
            ᲁᛸᛲᛶ r4 = r4.f4725
            if (r4 == 0) goto L60
            if (r3 != 0) goto L5a
            ᲈᲇᛱᲈ r3 = new ᲈᲇᛱᲈ
            r3.<init>(r0)
            goto L6d
        L5a:
            java.lang.String r13 = "Check failed."
            defpackage.C2264.m3676(r13)
            return r1
        L60:
            if (r3 == 0) goto L65
            defpackage.AbstractC0508.m1294(r3)
        L65:
            ᛶᛴᲈ r0 = r13.f4823
            ᛳᛳᲀᲁ r0 = r0.f4740
            r0.getClass()
            goto L8
        L6d:
            if (r3 == 0) goto L70
            return r3
        L70:
            ᲈᲇᛱᲈ r0 = r13.m2050(r1, r1)
            if (r0 == 0) goto L77
            return r0
        L77:
            ᛶᲈᛷᛵ r0 = r13.f4836
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L88
            ᛶᲈᛷᛵ r13 = r13.f4836
            java.lang.Object r13 = r13.removeFirst()
            ᛱᛴᛶᛳ r13 = (defpackage.InterfaceC0077) r13
            return r13
        L88:
            ᲇᛵᲇᲇ r0 = r13.f4826
            if (r0 == 0) goto L94
            r13.f4826 = r1
            ᛸᛲᛶᲈ r0 = r13.m2051(r0, r1)
            goto L342
        L94:
            ᲇᛶᲀᛸ r0 = r13.f4828
            if (r0 == 0) goto Lc8
            int r3 = r0.f8901
            java.lang.Object r4 = r0.f8900
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r3 >= r4) goto Lc8
            int r2 = r0.f8901
            java.lang.Object r3 = r0.f8900
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            if (r2 >= r4) goto Lc2
            int r2 = r0.f8901
            int r4 = r2 + 1
            r0.f8901 = r4
            java.lang.Object r0 = r3.get(r2)
            ᲇᛵᲇᲇ r0 = (defpackage.C2058) r0
            ᛸᛲᛶᲈ r0 = r13.m2051(r0, r1)
            goto L342
        Lc2:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            r13.<init>()
            throw r13
        Lc8:
            ᛸᛱᛲᲈ r0 = r13.f4833
            if (r0 != 0) goto Ldb
            ᛸᛱᛲᲈ r0 = new ᛸᛱᛲᲈ
            ᛱᛲᛶᲈ r3 = r13.f4825
            ᛶᲈᛱᲈ r4 = r13.f4832
            ᛶᛴᲈ r5 = r13.f4823
            boolean r6 = r13.f4822
            r0.<init>(r3, r4, r5, r6)
            r13.f4833 = r0
        Ldb:
            boolean r3 = r0.m2598()
            if (r3 == 0) goto L35e
            boolean r3 = r0.m2598()
            if (r3 == 0) goto L358
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        Lec:
            int r4 = r0.f6193
            java.util.List r5 = r0.f6188
            int r5 = r5.size()
            if (r4 >= r5) goto L30b
            java.lang.String r4 = "No route to "
            int r5 = r0.f6193
            java.util.List r6 = r0.f6188
            int r6 = r6.size()
            if (r5 >= r6) goto L2e9
            java.util.List r5 = r0.f6188
            int r6 = r0.f6193
            int r7 = r6 + 1
            r0.f6193 = r7
            java.lang.Object r5 = r5.get(r6)
            java.net.Proxy r5 = (java.net.Proxy) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.f6194 = r6
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
            ᛱᛲᛶᲈ r7 = r0.f6191
            ᛳᛸᛲ r7 = r7.f538
            java.lang.String r8 = r7.f2563
            int r7 = r7.f2562
        L16a:
            if (r2 > r7) goto L2ca
            r9 = 65536(0x10000, float:9.1835E-41)
            if (r7 >= r9) goto L2ca
            java.net.Proxy$Type r4 = r5.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.SOCKS
            if (r4 != r9) goto L181
            java.net.InetSocketAddress r4 = java.net.InetSocketAddress.createUnresolved(r8, r7)
            r6.add(r4)
            goto L261
        L181:
            ᲁᲀᲈᛵ r4 = defpackage.AbstractC0673.f3257
            java.util.regex.Pattern r4 = r4.f8356
            java.util.regex.Matcher r4 = r4.matcher(r8)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L198
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r8)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            goto L1bb
        L198:
            ᛶᛴᲈ r4 = r0.f6190
            ᛳᛳᲀᲁ r4 = r4.f4740
            r4.getClass()
            ᛱᛲᛶᲈ r4 = r0.f6191
            ᛷᲈᲀ r4 = r4.f543
            r4.getClass()
            java.net.InetAddress[] r4 = java.net.InetAddress.getAllByName(r8)     // Catch: java.lang.NullPointerException -> L2ba
            java.util.List r4 = defpackage.AbstractC2315.m3771(r4)     // Catch: java.lang.NullPointerException -> L2ba
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L29c
            ᛶᛴᲈ r8 = r0.f6190
            ᛳᛳᲀᲁ r8 = r8.f4740
            r8.getClass()
        L1bb:
            boolean r8 = r0.f6189
            if (r8 == 0) goto L248
            int r8 = r4.size()
            r9 = 2
            if (r8 >= r9) goto L1c8
            goto L248
        L1c8:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r4.iterator()
        L1d6:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L1ef
            java.lang.Object r11 = r10.next()
            r12 = r11
            java.net.InetAddress r12 = (java.net.InetAddress) r12
            boolean r12 = r12 instanceof java.net.Inet6Address
            if (r12 == 0) goto L1eb
            r8.add(r11)
            goto L1d6
        L1eb:
            r9.add(r11)
            goto L1d6
        L1ef:
            kotlin.Pair r10 = new kotlin.Pair
            r10.<init>(r8, r9)
            java.lang.Object r8 = r10.component1()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r10.component2()
            java.util.List r9 = (java.util.List) r9
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L248
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L20d
            goto L248
        L20d:
            byte[] r4 = defpackage.AbstractC0709.f3358
            java.util.Iterator r8 = r8.iterator()
            java.util.Iterator r9 = r9.iterator()
            ᛱᲇᲀᛲ r10 = defpackage.AbstractC0425.m1189()
        L21b:
            boolean r4 = r8.hasNext()
            if (r4 != 0) goto L22d
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L228
            goto L22d
        L228:
            ᛱᲇᲀᛲ r4 = defpackage.AbstractC0425.m1197(r10)
            goto L248
        L22d:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L23a
            java.lang.Object r4 = r8.next()
            r10.add(r4)
        L23a:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L21b
            java.lang.Object r4 = r9.next()
            r10.add(r4)
            goto L21b
        L248:
            java.util.Iterator r4 = r4.iterator()
        L24c:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L261
            java.lang.Object r8 = r4.next()
            java.net.InetAddress r8 = (java.net.InetAddress) r8
            java.net.InetSocketAddress r9 = new java.net.InetSocketAddress
            r9.<init>(r8, r7)
            r6.add(r9)
            goto L24c
        L261:
            java.util.List r4 = r0.f6194
            java.util.Iterator r4 = r4.iterator()
        L267:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L295
            java.lang.Object r6 = r4.next()
            java.net.InetSocketAddress r6 = (java.net.InetSocketAddress) r6
            ᲇᛵᲇᲇ r7 = new ᲇᛵᲇᲇ
            ᛱᛲᛶᲈ r8 = r0.f6191
            r7.<init>(r8, r5, r6)
            ᛶᲈᛱᲈ r6 = r0.f6192
            monitor-enter(r6)
            java.lang.Object r8 = r6.f5356     // Catch: java.lang.Throwable -> L292
            java.util.LinkedHashSet r8 = (java.util.LinkedHashSet) r8     // Catch: java.lang.Throwable -> L292
            boolean r8 = r8.contains(r7)     // Catch: java.lang.Throwable -> L292
            monitor-exit(r6)
            if (r8 == 0) goto L28e
            java.util.ArrayList r6 = r0.f6187
            r6.add(r7)
            goto L267
        L28e:
            r3.add(r7)
            goto L267
        L292:
            r13 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L292
            throw r13
        L295:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto Lec
            goto L30b
        L29c:
            java.net.UnknownHostException r13 = new java.net.UnknownHostException
            ᛱᛲᛶᲈ r0 = r0.f6191
            ᛷᲈᲀ r0 = r0.f543
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " returned no addresses for "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            r13.<init>(r0)
            throw r13
        L2ba:
            r13 = move-exception
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r1 = "Broken system behaviour for dns lookup of "
            java.lang.String r1 = r1.concat(r8)
            r0.<init>(r1)
            r0.initCause(r13)
            throw r0
        L2ca:
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
        L2e9:
            java.net.SocketException r13 = new java.net.SocketException
            ᛱᛲᛶᲈ r1 = r0.f6191
            ᛳᛸᛲ r1 = r1.f538
            java.lang.String r1 = r1.f2563
            java.lang.String r2 = "; exhausted proxy configurations: "
            java.util.List r0 = r0.f6188
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r1)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r13.<init>(r0)
            throw r13
        L30b:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L31b
            java.util.ArrayList r2 = r0.f6187
            defpackage.AbstractC1376.m2542(r3, r2)
            java.util.ArrayList r0 = r0.f6187
            r0.clear()
        L31b:
            ᲇᛶᲀᛸ r0 = new ᲇᛶᲀᛸ
            r2 = 9
            r0.<init>(r2, r3)
            r13.f4828 = r0
            ᛶᛴᲈ r2 = r13.f4823
            boolean r2 = r2.f4731
            if (r2 != 0) goto L352
            int r1 = r0.f8901
            int r2 = r3.size()
            if (r1 >= r2) goto L34c
            int r1 = r0.f8901
            int r2 = r1 + 1
            r0.f8901 = r2
            java.lang.Object r0 = r3.get(r1)
            ᲇᛵᲇᲇ r0 = (defpackage.C2058) r0
            ᛸᛲᛶᲈ r0 = r13.m2051(r0, r3)
        L342:
            java.util.List r1 = r0.f6298
            ᲈᲇᛱᲈ r13 = r13.m2050(r0, r1)
            if (r13 == 0) goto L34b
            return r13
        L34b:
            return r0
        L34c:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            r13.<init>()
            throw r13
        L352:
            java.lang.String r13 = "Canceled"
            defpackage.C2264.m3682(r13)
            return r1
        L358:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            r13.<init>()
            throw r13
        L35e:
            java.lang.String r13 = "exhausted all routes"
            defpackage.C2264.m3682(r13)
            return r1
        L364:
            monitor-exit(r0)
            throw r13
    }
}
