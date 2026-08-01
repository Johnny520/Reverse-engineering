package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0280 implements xhss.InterfaceC0080, xhss.InterfaceC0900 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C1127 f1074;

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public xhss.C0623 f1075;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f1076;

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public volatile boolean f1077;

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public xhss.EnumC1122 f1078;

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public java.net.Socket f1079;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final int f1080;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0723 f1081;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final xhss.C0355 f1082;

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public xhss.C0446 f1083;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.C0946 f1084;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final xhss.C0819 f1085;

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public java.net.Socket f1086;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final int f1087;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.C0065 f1088;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final boolean f1089;

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public xhss.C1184 f1090;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f1091;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final int f1092;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final boolean f1093;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final java.util.List f1094;

    public C0280(xhss.C0723 r1, xhss.C1127 r2, int r3, int r4, int r5, int r6, boolean r7, xhss.C0819 r8, xhss.C0946 r9, xhss.C0065 r10, java.util.List r11, xhss.C0355 r12, int r13, boolean r14) {
            r0 = this;
            r0.<init>()
            r0.f1081 = r1
            r0.f1074 = r2
            r0.f1076 = r3
            r0.f1091 = r4
            r0.f1080 = r5
            r0.f1092 = r6
            r0.f1089 = r7
            r0.f1085 = r8
            r0.f1084 = r9
            r0.f1088 = r10
            r0.f1094 = r11
            r0.f1082 = r12
            r0.f1087 = r13
            r0.f1093 = r14
            return
    }

    @Override // xhss.InterfaceC0080, xhss.InterfaceC0900
    public final void cancel() {
            r1 = this;
            r0 = 1
            r1.f1077 = r0
            java.net.Socket r1 = r1.f1079
            if (r1 == 0) goto La
            xhss.AbstractC0559.m987(r1)
        La:
            return
    }

    @Override // xhss.InterfaceC0080
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final xhss.C0190 mo238() {
            r12 = this;
            java.net.Socket r3 = r12.f1079
            r8 = 0
            if (r3 == 0) goto L15d
            boolean r0 = r12.mo242()
            if (r0 != 0) goto L157
            xhss.ᛱᛷᲁᛶ r0 = r12.f1088
            xhss.ᛵᲈᛱᛳ r0 = r0.f359
            java.util.List r0 = r0.f1925
            xhss.ᛸᲇᲇᛶ r1 = r12.f1085
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f2660
            r1.add(r12)
            r9 = 0
            xhss.ᛴᛴᛴᛵ r1 = r12.f1082     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            if (r1 == 0) goto L3e
            xhss.ᛲᛷᛷᛵ r1 = r12.m597()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            java.lang.Throwable r2 = r1.f746     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            if (r2 == 0) goto L3e
            xhss.ᛸᲇᲇᛶ r0 = r12.f1085
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f2660
            r0.remove(r12)
            java.net.Socket r12 = r12.f1086
            if (r12 == 0) goto L33
            xhss.AbstractC0559.m987(r12)
        L33:
            xhss.AbstractC0559.m987(r3)
            return r1
        L37:
            r0 = move-exception
            goto L143
        L3a:
            r0 = move-exception
            r5 = r8
            goto Lfa
        L3e:
            xhss.ᛱᛷᲁᛶ r1 = r12.f1088     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᛵᲈᛱᛳ r1 = r1.f359     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            javax.net.ssl.SSLSocketFactory r2 = r1.f1920     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            r10 = 1
            if (r2 == 0) goto Lad
            xhss.ᛷᛱᛳᲁ r1 = r12.f1075     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            if (r1 != 0) goto L4c
            r1 = r8
        L4c:
            java.lang.Object r1 = r1.f2153     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᲁᛸᛵᛳ r1 = (xhss.C0976) r1     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᛴᛲᛴᛶ r1 = r1.f3178     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            boolean r1 = r1.m683()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            if (r1 == 0) goto La5
            xhss.ᛷᛱᛳᲁ r1 = r12.f1075     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            if (r1 != 0) goto L5d
            r1 = r8
        L5d:
            java.lang.Object r1 = r1.f2152     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᛱᛸᛵᛱ r1 = (xhss.C0075) r1     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᛴᛲᛴᛶ r1 = r1.f408     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            boolean r1 = r1.m683()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            if (r1 == 0) goto La5
            xhss.ᛸᲇᲇᛶ r1 = r12.f1085     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᲀᲀᛱᲇ r1 = r1.f2665     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            r1.getClass()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᛱᛷᲁᛶ r1 = r12.f1088     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᛵᲈᛱᛳ r1 = r1.f359     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            javax.net.ssl.SSLSocketFactory r2 = r1.f1920     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᛷᛶᲁᛵ r1 = r1.f1924     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            java.lang.String r4 = r1.f2288     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            int r1 = r1.f2284     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            java.net.Socket r1 = r2.createSocket(r3, r4, r1, r10)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᛳᛵᲈ r2 = r12.m594(r0, r1)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            int r4 = r2.f1087     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᛶᛴᛴᛳ r4 = (xhss.C0557) r4     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᛳᛵᲈ r5 = r2.m591(r0, r1)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            boolean r0 = r2.f1093     // Catch: java.lang.Throwable -> L37 java.io.IOException -> La3
            r4.m984(r1, r0)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> La3
            r12.m595(r1, r4)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> La3
            xhss.ᛸᲇᲇᛶ r0 = r12.f1085     // Catch: java.lang.Throwable -> L37 java.io.IOException -> La3
            xhss.ᲀᲀᛱᲇ r0 = r0.f2665     // Catch: java.lang.Throwable -> L37 java.io.IOException -> La3
            r0.getClass()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> La3
            r11 = r5
            goto Lbf
        La3:
            r0 = move-exception
            goto Lfa
        La5:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            java.lang.String r1 = "TLS tunnel buffered too many bytes!"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            throw r0     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
        Lad:
            r12.f1086 = r3     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            java.util.List r0 = r1.f1923     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            xhss.ᲈᛲᛵᛴ r1 = xhss.EnumC1122.f3619     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            if (r0 == 0) goto Lba
            goto Lbc
        Lba:
            xhss.ᲈᛲᛵᛴ r1 = xhss.EnumC1122.f3620     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
        Lbc:
            r12.f1078 = r1     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            r11 = r8
        Lbf:
            xhss.ᲈᲁᛲᲇ r0 = new xhss.ᲈᲁᛲᲇ     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            xhss.ᛸᛱᛴᛳ r1 = r12.f1081     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            xhss.ᛱᛷᲁᛶ r2 = r12.f1088     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            java.net.Socket r4 = r12.f1086     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            xhss.ᛵᛲᛸᛲ r5 = r12.f1083     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            xhss.ᲈᛲᛵᛴ r6 = r12.f1078     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            xhss.ᛷᛱᛳᲁ r7 = r12.f1075     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            if (r7 != 0) goto Ld0
            r7 = r8
        Ld0:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            r12.f1090 = r0     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            r0.m1895()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            xhss.ᛸᲇᲇᛶ r0 = r12.f1085     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            xhss.ᲀᲀᛱᲇ r0 = r0.f2665     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            xhss.ᛱᛷᲁᛶ r1 = r12.f1088     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            java.net.InetSocketAddress r1 = r1.f358     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            r0.getClass()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> Lf8
            xhss.ᛲᛷᛷᛵ r0 = new xhss.ᛲᛷᛷᛵ     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf4
            r1 = 6
            r0.<init>(r12, r8, r1)     // Catch: java.lang.Throwable -> Lf1 java.io.IOException -> Lf4
            xhss.ᛸᲇᲇᛶ r1 = r12.f1085
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f2660
            r1.remove(r12)
            return r0
        Lf1:
            r0 = move-exception
            r9 = r10
            goto L143
        Lf4:
            r0 = move-exception
            r9 = r10
        Lf6:
            r5 = r11
            goto Lfa
        Lf8:
            r0 = move-exception
            goto Lf6
        Lfa:
            xhss.ᛸᲇᲇᛶ r1 = r12.f1085     // Catch: java.lang.Throwable -> L37
            xhss.ᲀᲀᛱᲇ r1 = r1.f2665     // Catch: java.lang.Throwable -> L37
            xhss.ᛱᛷᲁᛶ r2 = r12.f1088     // Catch: java.lang.Throwable -> L37
            java.net.InetSocketAddress r2 = r2.f358     // Catch: java.lang.Throwable -> L37
            r1.getClass()     // Catch: java.lang.Throwable -> L37
            boolean r1 = r12.f1089     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L12a
            boolean r1 = r0 instanceof java.net.ProtocolException     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L10e
            goto L12a
        L10e:
            boolean r1 = r0 instanceof java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L113
            goto L12a
        L113:
            boolean r1 = r0 instanceof javax.net.ssl.SSLHandshakeException     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L120
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1 instanceof java.security.cert.CertificateException     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L120
            goto L12a
        L120:
            boolean r1 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L125
            goto L12a
        L125:
            boolean r1 = r0 instanceof javax.net.ssl.SSLException     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L12a
            r8 = r5
        L12a:
            xhss.ᛲᛷᛷᛵ r1 = new xhss.ᛲᛷᛷᛵ     // Catch: java.lang.Throwable -> L37
            r1.<init>(r12, r8, r0)     // Catch: java.lang.Throwable -> L37
            xhss.ᛸᲇᲇᛶ r0 = r12.f1085
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f2660
            r0.remove(r12)
            if (r9 != 0) goto L142
            java.net.Socket r12 = r12.f1086
            if (r12 == 0) goto L13f
            xhss.AbstractC0559.m987(r12)
        L13f:
            xhss.AbstractC0559.m987(r3)
        L142:
            return r1
        L143:
            xhss.ᛸᲇᲇᛶ r1 = r12.f1085
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f2660
            r1.remove(r12)
            if (r9 != 0) goto L156
            java.net.Socket r12 = r12.f1086
            if (r12 == 0) goto L153
            xhss.AbstractC0559.m987(r12)
        L153:
            xhss.AbstractC0559.m987(r3)
        L156:
            throw r0
        L157:
            java.lang.String r12 = "already connected"
            xhss.C0532.m950(r12)
            return r8
        L15d:
            java.lang.String r12 = "TCP not connected"
            xhss.C0532.m959(r12)
            return r8
    }

    @Override // xhss.InterfaceC0080
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final xhss.C1184 mo239() {
            r5 = this;
            xhss.ᛸᲇᲇᛶ r0 = r5.f1085
            xhss.ᛵᛸᛷᛲ r0 = r0.f2659
            xhss.ᲇᛵᛲᲁ r0 = r0.f1831
            xhss.ᛱᛷᲁᛶ r1 = r5.f1088
            monitor-enter(r0)
            java.lang.Object r2 = r0.f3349     // Catch: java.lang.Throwable -> L47
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2     // Catch: java.lang.Throwable -> L47
            r2.remove(r1)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r0)
            xhss.ᲈᲁᛲᲇ r0 = r5.f1090
            r0.getClass()
            xhss.ᲁᛴᛶᛸ r1 = r5.f1084
            java.util.List r2 = r5.f1094
            xhss.ᛴᛸᲇᛵ r1 = r1.m1543(r5, r2)
            if (r1 == 0) goto L23
            xhss.ᲈᲁᛲᲇ r5 = r1.f1412
            return r5
        L23:
            monitor-enter(r0)
            xhss.ᲈᛲᲀᛵ r1 = r5.f1074     // Catch: java.lang.Throwable -> L44
            java.util.TimeZone r2 = xhss.AbstractC0559.f1984     // Catch: java.lang.Throwable -> L44
            java.util.concurrent.ConcurrentLinkedQueue r2 = r1.f3641     // Catch: java.lang.Throwable -> L44
            r2.add(r0)     // Catch: java.lang.Throwable -> L44
            xhss.ᲇᲀᲀᛷ r2 = r1.f3638     // Catch: java.lang.Throwable -> L44
            xhss.ᛷᲀᲁᲇ r1 = r1.f3639     // Catch: java.lang.Throwable -> L44
            r3 = 0
            r2.m1739(r1, r3)     // Catch: java.lang.Throwable -> L44
            xhss.ᛸᲇᲇᛶ r1 = r5.f1085     // Catch: java.lang.Throwable -> L44
            r1.m1386(r0)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)
            xhss.ᛸᲇᲇᛶ r5 = r5.f1085
            xhss.ᲀᲀᛱᲇ r5 = r5.f2665
            r5.getClass()
            return r0
        L44:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L47:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r5
    }

    @Override // xhss.InterfaceC0900
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0065 mo590() {
            r0 = this;
            xhss.ᛱᛷᲁᛶ r0 = r0.f1088
            return r0
    }

    @Override // xhss.InterfaceC0080
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.InterfaceC0080 mo240() {
            r15 = this;
            xhss.ᛳᛵᲈ r0 = new xhss.ᛳᛵᲈ
            int r13 = r15.f1087
            boolean r14 = r15.f1093
            xhss.ᛸᛱᛴᛳ r1 = r15.f1081
            xhss.ᲈᛲᲀᛵ r2 = r15.f1074
            int r3 = r15.f1076
            int r4 = r15.f1091
            int r5 = r15.f1080
            int r6 = r15.f1092
            boolean r7 = r15.f1089
            xhss.ᛸᲇᲇᛶ r8 = r15.f1085
            xhss.ᲁᛴᛶᛸ r9 = r15.f1084
            xhss.ᛱᛷᲁᛶ r10 = r15.f1088
            java.util.List r11 = r15.f1094
            xhss.ᛴᛴᛴᛵ r12 = r15.f1082
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final xhss.C0280 m591(java.util.List r20, javax.net.ssl.SSLSocket r21) {
            r19 = this;
            r0 = r19
            int r1 = r0.f1087
            int r2 = r1 + 1
            int r3 = r20.size()
        La:
            if (r2 >= r3) goto L68
            r4 = r20
            java.lang.Object r5 = r4.get(r2)
            xhss.ᛶᛴᛴᛳ r5 = (xhss.C0557) r5
            boolean r6 = r5.f1981
            if (r6 != 0) goto L19
            goto L3a
        L19:
            java.lang.String[] r6 = r5.f1982
            if (r6 == 0) goto L2a
            java.lang.String[] r7 = r21.getEnabledProtocols()
            xhss.ᛸᛳᛷᛲ r8 = xhss.C0745.f2496
            boolean r6 = xhss.AbstractC0577.m1047(r6, r7, r8)
            if (r6 != 0) goto L2a
            goto L3a
        L2a:
            java.lang.String[] r5 = r5.f1980
            if (r5 == 0) goto L3d
            java.lang.String[] r6 = r21.getEnabledCipherSuites()
            xhss.ᛸᛲᲇᲁ r7 = xhss.C0321.f1209
            boolean r5 = xhss.AbstractC0577.m1047(r5, r6, r7)
            if (r5 != 0) goto L3d
        L3a:
            int r2 = r2 + 1
            goto La
        L3d:
            r3 = -1
            if (r1 == r3) goto L44
            r1 = 1
        L41:
            r18 = r1
            goto L46
        L44:
            r1 = 0
            goto L41
        L46:
            xhss.ᛳᛵᲈ r4 = new xhss.ᛳᛵᲈ
            xhss.ᛱᛷᲁᛶ r14 = r0.f1088
            java.util.List r15 = r0.f1094
            xhss.ᛸᛱᛴᛳ r5 = r0.f1081
            xhss.ᲈᛲᲀᛵ r6 = r0.f1074
            int r7 = r0.f1076
            int r8 = r0.f1091
            int r9 = r0.f1080
            int r10 = r0.f1092
            boolean r11 = r0.f1089
            xhss.ᛸᲇᲇᛶ r12 = r0.f1085
            xhss.ᲁᛴᛶᛸ r13 = r0.f1084
            xhss.ᛴᛴᛴᛵ r0 = r0.f1082
            r16 = r0
            r17 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r4
        L68:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final void m592() {
            r4 = this;
            xhss.ᛱᛷᲁᛶ r0 = r4.f1088
            java.net.Proxy r0 = r0.f357
            java.net.Proxy$Type r0 = r0.type()
            if (r0 != 0) goto Lc
            r0 = -1
            goto L14
        Lc:
            int[] r1 = xhss.AbstractC0552.f1971
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L14:
            r1 = 1
            if (r0 == r1) goto L24
            r1 = 2
            if (r0 == r1) goto L24
            java.net.Socket r0 = new java.net.Socket
            xhss.ᛱᛷᲁᛶ r1 = r4.f1088
            java.net.Proxy r1 = r1.f357
            r0.<init>(r1)
            goto L2e
        L24:
            xhss.ᛱᛷᲁᛶ r0 = r4.f1088
            xhss.ᛵᲈᛱᛳ r0 = r0.f359
            javax.net.SocketFactory r0 = r0.f1919
            java.net.Socket r0 = r0.createSocket()
        L2e:
            r4.f1079 = r0
            boolean r1 = r4.f1077
            if (r1 != 0) goto L86
            int r1 = r4.f1092
            r0.setSoTimeout(r1)
            xhss.ᛵᛳᛸᲇ r1 = xhss.AbstractC0831.f2712     // Catch: java.net.ConnectException -> L6a
            xhss.ᛵᛳᛸᲇ r1 = xhss.AbstractC0831.f2712     // Catch: java.net.ConnectException -> L6a
            xhss.ᛱᛷᲁᛶ r2 = r4.f1088     // Catch: java.net.ConnectException -> L6a
            java.net.InetSocketAddress r2 = r2.f358     // Catch: java.net.ConnectException -> L6a
            int r3 = r4.f1080     // Catch: java.net.ConnectException -> L6a
            r1.getClass()     // Catch: java.net.ConnectException -> L6a
            r0.connect(r2, r3)     // Catch: java.net.ConnectException -> L6a
            xhss.ᲇᛸᛶ r1 = new xhss.ᲇᛸᛶ     // Catch: java.lang.NullPointerException -> L56
            r1.<init>(r0)     // Catch: java.lang.NullPointerException -> L56
            xhss.ᛷᛱᛳᲁ r0 = new xhss.ᛷᛱᛳᲁ     // Catch: java.lang.NullPointerException -> L56
            r0.<init>(r1)     // Catch: java.lang.NullPointerException -> L56
            r4.f1075 = r0     // Catch: java.lang.NullPointerException -> L56
            return
        L56:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()
            java.lang.String r1 = "throw with null exception"
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 != 0) goto L64
            return
        L64:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r4)
            throw r0
        L6a:
            r0 = move-exception
            java.net.ConnectException r1 = new java.net.ConnectException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to connect to "
            r2.<init>(r3)
            xhss.ᛱᛷᲁᛶ r4 = r4.f1088
            java.net.InetSocketAddress r4 = r4.f358
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            r1.initCause(r0)
            throw r1
        L86:
            java.lang.String r4 = "canceled"
            xhss.C0532.m947(r4)
            return
    }

    @Override // xhss.InterfaceC0900
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final void mo593() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final xhss.C0280 m594(java.util.List r4, javax.net.ssl.SSLSocket r5) {
            r3 = this;
            int r0 = r3.f1087
            r1 = -1
            if (r0 == r1) goto L6
            return r3
        L6:
            xhss.ᛳᛵᲈ r0 = r3.m591(r4, r5)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to find acceptable protocols. isFallback="
            r1.<init>(r2)
            boolean r3 = r3.f1093
            r1.append(r3)
            java.lang.String r3 = ", modes="
            r1.append(r3)
            r1.append(r4)
            java.lang.String[] r3 = r5.getEnabledProtocols()
            java.lang.String r3 = java.util.Arrays.toString(r3)
            java.lang.String r4 = ", supported protocols="
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final void m595(javax.net.ssl.SSLSocket r10, xhss.C0557 r11) {
            r9 = this;
            xhss.ᛱᛷᲁᛶ r0 = r9.f1088
            xhss.ᛵᲈᛱᛳ r0 = r0.f359
            boolean r1 = r11.f1979     // Catch: java.lang.Throwable -> L36
            r2 = 0
            if (r1 == 0) goto L39
            xhss.ᛵᛳᛸᲇ r1 = xhss.AbstractC0831.f2712     // Catch: java.lang.Throwable -> L36
            xhss.ᛵᛳᛸᲇ r1 = xhss.AbstractC0831.f2712     // Catch: java.lang.Throwable -> L36
            xhss.ᛷᛶᲁᛵ r3 = r0.f1924     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = r3.f2288     // Catch: java.lang.Throwable -> L36
            java.util.List r4 = r0.f1923     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList r1 = r1.f1635     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L36
        L19:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L2d
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L36
            r6 = r5
            xhss.ᲈᲀᛳᲇ r6 = (xhss.InterfaceC1173) r6     // Catch: java.lang.Throwable -> L36
            boolean r6 = r6.mo469(r10)     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L19
            goto L2e
        L2d:
            r5 = r2
        L2e:
            xhss.ᲈᲀᛳᲇ r5 = (xhss.InterfaceC1173) r5     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L39
            r5.mo470(r10, r3, r4)     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            r9 = move-exception
            goto L14d
        L39:
            r10.startHandshake()     // Catch: java.lang.Throwable -> L36
            javax.net.ssl.SSLSession r1 = r10.getSession()     // Catch: java.lang.Throwable -> L36
            xhss.ᛵᛲᛸᛲ r3 = xhss.AbstractC0060.m190(r1)     // Catch: java.lang.Throwable -> L36
            javax.net.ssl.HostnameVerifier r4 = r0.f1927     // Catch: java.lang.Throwable -> L36
            xhss.ᛷᛶᲁᛵ r5 = r0.f1924     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r5.f2288     // Catch: java.lang.Throwable -> L36
            boolean r1 = r4.verify(r5, r1)     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto Ld9
            java.util.List r9 = r3.m819()     // Catch: java.lang.Throwable -> L36
            boolean r11 = r9.isEmpty()     // Catch: java.lang.Throwable -> L36
            if (r11 != 0) goto Lb9
            r11 = 0
            java.lang.Object r9 = r9.get(r11)     // Catch: java.lang.Throwable -> L36
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch: java.lang.Throwable -> L36
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r1.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "\n            |Hostname "
            r1.append(r2)     // Catch: java.lang.Throwable -> L36
            xhss.ᛷᛶᲁᛵ r0 = r0.f1924     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.f2288     // Catch: java.lang.Throwable -> L36
            r1.append(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = " not verified:\n            |    certificate: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L36
            xhss.ᛲᛷᲀᲇ r0 = xhss.C0191.f748     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = xhss.AbstractC0694.m1211(r9)     // Catch: java.lang.Throwable -> L36
            r1.append(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "\n            |    DN: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L36
            java.security.Principal r0 = r9.getSubjectDN()     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L36
            r1.append(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "\n            |    subjectAltNames: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L36
            r0 = 7
            java.util.List r0 = xhss.C1155.m1855(r9, r0)     // Catch: java.lang.Throwable -> L36
            r2 = 2
            java.util.List r9 = xhss.C1155.m1855(r9, r2)     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList r9 = xhss.AbstractC0713.m1237(r0, r9)     // Catch: java.lang.Throwable -> L36
            r1.append(r9)     // Catch: java.lang.Throwable -> L36
            java.lang.String r9 = "\n            "
            r1.append(r9)     // Catch: java.lang.Throwable -> L36
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L36
            java.lang.String r9 = xhss.AbstractC0260.m575(r9)     // Catch: java.lang.Throwable -> L36
            r11.<init>(r9)     // Catch: java.lang.Throwable -> L36
            throw r11     // Catch: java.lang.Throwable -> L36
        Lb9:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r11.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "Hostname "
            r11.append(r1)     // Catch: java.lang.Throwable -> L36
            xhss.ᛷᛶᲁᛵ r0 = r0.f1924     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.f2288     // Catch: java.lang.Throwable -> L36
            r11.append(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = " not verified (no certificates)"
            r11.append(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L36
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L36
            throw r9     // Catch: java.lang.Throwable -> L36
        Ld9:
            xhss.ᛲᛷᲀᲇ r1 = r0.f1921     // Catch: java.lang.Throwable -> L36
            xhss.ᛵᛲᛸᛲ r4 = new xhss.ᛵᛲᛸᛲ     // Catch: java.lang.Throwable -> L36
            xhss.ᛶᲈᛴ r5 = r3.f1594     // Catch: java.lang.Throwable -> L36
            xhss.ᛳᲁᲇᲀ r6 = r3.f1592     // Catch: java.lang.Throwable -> L36
            java.util.List r7 = r3.f1593     // Catch: java.lang.Throwable -> L36
            xhss.ᛴᛵᲇᛵ r8 = new xhss.ᛴᛵᲇᛵ     // Catch: java.lang.Throwable -> L36
            r8.<init>(r1, r3, r0)     // Catch: java.lang.Throwable -> L36
            r4.<init>(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L36
            r9.f1083 = r4     // Catch: java.lang.Throwable -> L36
            java.util.Set r0 = r1.f750     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L36
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L145
            boolean r11 = r11.f1979     // Catch: java.lang.Throwable -> L36
            if (r11 == 0) goto L124
            xhss.ᛵᛳᛸᲇ r11 = xhss.AbstractC0831.f2712     // Catch: java.lang.Throwable -> L36
            xhss.ᛵᛳᛸᲇ r11 = xhss.AbstractC0831.f2712     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList r11 = r11.f1635     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L36
        L107:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L11b
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Throwable -> L36
            r1 = r0
            xhss.ᲈᲀᛳᲇ r1 = (xhss.InterfaceC1173) r1     // Catch: java.lang.Throwable -> L36
            boolean r1 = r1.mo469(r10)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L107
            goto L11c
        L11b:
            r0 = r2
        L11c:
            xhss.ᲈᲀᛳᲇ r0 = (xhss.InterfaceC1173) r0     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L124
            java.lang.String r2 = r0.mo467(r10)     // Catch: java.lang.Throwable -> L36
        L124:
            r9.f1086 = r10     // Catch: java.lang.Throwable -> L36
            xhss.ᲇᛸᛶ r11 = new xhss.ᲇᛸᛶ     // Catch: java.lang.Throwable -> L36
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L36
            xhss.ᛷᛱᛳᲁ r0 = new xhss.ᛷᛱᛳᲁ     // Catch: java.lang.Throwable -> L36
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L36
            r9.f1075 = r0     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L139
            xhss.ᲈᛲᛵᛴ r11 = xhss.AbstractC0955.m1567(r2)     // Catch: java.lang.Throwable -> L36
            goto L13b
        L139:
            xhss.ᲈᛲᛵᛴ r11 = xhss.EnumC1122.f3620     // Catch: java.lang.Throwable -> L36
        L13b:
            r9.f1078 = r11     // Catch: java.lang.Throwable -> L36
            xhss.ᛵᛳᛸᲇ r9 = xhss.AbstractC0831.f2712
            xhss.ᛵᛳᛸᲇ r9 = xhss.AbstractC0831.f2712
            r9.getClass()
            return
        L145:
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L36
            xhss.AbstractC0390.m786(r9)     // Catch: java.lang.Throwable -> L36
            throw r2     // Catch: java.lang.Throwable -> L36
        L14d:
            xhss.ᛵᛳᛸᲇ r11 = xhss.AbstractC0831.f2712
            xhss.ᛵᛳᛸᲇ r11 = xhss.AbstractC0831.f2712
            r11.getClass()
            xhss.AbstractC0559.m987(r10)
            throw r9
    }

    @Override // xhss.InterfaceC0080
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final xhss.C0190 mo241() {
            r5 = this;
            java.net.Socket r0 = r5.f1079
            r1 = 0
            if (r0 != 0) goto L85
            xhss.ᛸᲇᲇᛶ r0 = r5.f1085
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f2660
            r0.add(r5)
            r0 = 0
            xhss.ᛸᲇᲇᛶ r2 = r5.f1085     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            xhss.ᲀᲀᛱᲇ r2 = r2.f2665     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            xhss.ᛱᛷᲁᛶ r3 = r5.f1088     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            java.net.InetSocketAddress r3 = r3.f358     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r2.getClass()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r5.m592()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r0 = 1
            xhss.ᛲᛷᛷᛵ r2 = new xhss.ᛲᛷᛷᛵ     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r3 = 6
            r2.<init>(r5, r1, r3)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            xhss.ᛸᲇᲇᛶ r0 = r5.f1085
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f2660
            r0.remove(r5)
            return r2
        L2a:
            r1 = move-exception
            goto L74
        L2c:
            r1 = move-exception
            xhss.ᛱᛷᲁᛶ r2 = r5.f1088     // Catch: java.lang.Throwable -> L2a
            xhss.ᛵᲈᛱᛳ r3 = r2.f359     // Catch: java.lang.Throwable -> L2a
            java.net.Proxy r2 = r2.f357     // Catch: java.lang.Throwable -> L2a
            java.net.Proxy$Type r2 = r2.type()     // Catch: java.lang.Throwable -> L2a
            java.net.Proxy$Type r3 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.Throwable -> L2a
            if (r2 == r3) goto L52
            xhss.ᛱᛷᲁᛶ r2 = r5.f1088     // Catch: java.lang.Throwable -> L2a
            xhss.ᛵᲈᛱᛳ r2 = r2.f359     // Catch: java.lang.Throwable -> L2a
            java.net.ProxySelector r3 = r2.f1926     // Catch: java.lang.Throwable -> L2a
            xhss.ᛷᛶᲁᛵ r2 = r2.f1924     // Catch: java.lang.Throwable -> L2a
            java.net.URI r2 = r2.m1158()     // Catch: java.lang.Throwable -> L2a
            xhss.ᛱᛷᲁᛶ r4 = r5.f1088     // Catch: java.lang.Throwable -> L2a
            java.net.Proxy r4 = r4.f357     // Catch: java.lang.Throwable -> L2a
            java.net.SocketAddress r4 = r4.address()     // Catch: java.lang.Throwable -> L2a
            r3.connectFailed(r2, r4, r1)     // Catch: java.lang.Throwable -> L2a
        L52:
            xhss.ᛸᲇᲇᛶ r2 = r5.f1085     // Catch: java.lang.Throwable -> L2a
            xhss.ᲀᲀᛱᲇ r2 = r2.f2665     // Catch: java.lang.Throwable -> L2a
            xhss.ᛱᛷᲁᛶ r3 = r5.f1088     // Catch: java.lang.Throwable -> L2a
            java.net.InetSocketAddress r3 = r3.f358     // Catch: java.lang.Throwable -> L2a
            r2.getClass()     // Catch: java.lang.Throwable -> L2a
            xhss.ᛲᛷᛷᛵ r2 = new xhss.ᛲᛷᛷᛵ     // Catch: java.lang.Throwable -> L2a
            r3 = 2
            r2.<init>(r5, r1, r3)     // Catch: java.lang.Throwable -> L2a
            xhss.ᛸᲇᲇᛶ r1 = r5.f1085
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f2660
            r1.remove(r5)
            if (r0 != 0) goto L73
            java.net.Socket r5 = r5.f1079
            if (r5 == 0) goto L73
            xhss.AbstractC0559.m987(r5)
        L73:
            return r2
        L74:
            xhss.ᛸᲇᲇᛶ r2 = r5.f1085
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f2660
            r2.remove(r5)
            if (r0 != 0) goto L84
            java.net.Socket r5 = r5.f1079
            if (r5 == 0) goto L84
            xhss.AbstractC0559.m987(r5)
        L84:
            throw r1
        L85:
            java.lang.String r5 = "TCP already connected"
            xhss.C0532.m950(r5)
            return r1
    }

    @Override // xhss.InterfaceC0080
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final boolean mo242() {
            r0 = this;
            xhss.ᲈᛲᛵᛴ r0 = r0.f1078
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // xhss.InterfaceC0900
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void mo596(xhss.C0819 r1, java.io.IOException r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final xhss.C0190 m597() {
            r9 = this;
            xhss.ᛱᛷᲁᛶ r0 = r9.f1088
            xhss.ᛵᲈᛱᛳ r1 = r0.f359
            xhss.ᛷᛶᲁᛵ r1 = r1.f1924
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "CONNECT "
            r2.<init>(r3)
            r3 = 1
            java.lang.String r1 = xhss.AbstractC0559.m991(r1, r3)
            r2.append(r1)
            java.lang.String r1 = " HTTP/1.1"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            xhss.ᛳᲇᲁᲈ r2 = new xhss.ᛳᲇᲁᲈ
            xhss.ᛷᛱᛳᲁ r3 = r9.f1075
            r4 = 0
            if (r3 != 0) goto L26
            r3 = r4
        L26:
            r2.<init>(r4, r9, r3)
            xhss.ᛷᛱᛳᲁ r3 = r9.f1075
            if (r3 != 0) goto L2e
            r3 = r4
        L2e:
            java.lang.Object r3 = r3.f2153
            xhss.ᲁᛸᛵᛳ r3 = (xhss.C0976) r3
            xhss.ᲇᲁᲀᲇ r3 = r3.f3177
            xhss.ᛲᲁᲈᛲ r3 = r3.mo250()
            int r5 = r9.f1076
            long r5 = (long) r5
            r3.mo481(r5)
            xhss.ᛷᛱᛳᲁ r3 = r9.f1075
            if (r3 != 0) goto L43
            r3 = r4
        L43:
            java.lang.Object r3 = r3.f2152
            xhss.ᛱᛸᛵᛱ r3 = (xhss.C0075) r3
            xhss.ᛱᲁᛷᲁ r3 = r3.f407
            xhss.ᛲᲁᲈᛲ r3 = r3.mo229()
            int r5 = r9.f1091
            long r5 = (long) r5
            r3.mo481(r5)
            xhss.ᛴᛴᛴᛵ r3 = r9.f1082
            java.lang.Object r5 = r3.f1317
            xhss.ᲁᛸᛱᛵ r5 = (xhss.C0972) r5
            r2.m663(r5, r1)
            r2.mo635()
            xhss.ᛳᛵᛴ r1 = r2.mo636()
            r1.f1024 = r3
            xhss.ᲀᛶᛷᲁ r1 = r1.m588()
            int r3 = r1.f2813
            long r5 = xhss.AbstractC0559.m988(r1)
            r7 = -1
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 != 0) goto L76
            goto L89
        L76:
            xhss.ᛴᛴᛴᛵ r1 = r1.f2809
            java.lang.Object r1 = r1.f1313
            xhss.ᛷᛶᲁᛵ r1 = (xhss.C0669) r1
            xhss.ᛱᛸᛵᲈ r1 = r2.m662(r1, r5)
            r2 = 2147483647(0x7fffffff, float:NaN)
            xhss.AbstractC0559.m995(r1, r2)
            r1.close()
        L89:
            r1 = 200(0xc8, float:2.8E-43)
            if (r3 == r1) goto La8
            r9 = 407(0x197, float:5.7E-43)
            if (r3 != r9) goto L9e
            xhss.ᛵᲈᛱᛳ r9 = r0.f359
            xhss.ᛳᛴᲀᲁ r9 = r9.f1928
            r9.getClass()
            java.lang.String r9 = "Failed to authenticate with proxy"
            xhss.C0532.m947(r9)
            return r4
        L9e:
            java.lang.String r9 = "Unexpected response code for CONNECT: "
            java.lang.String r9 = xhss.AbstractC0390.m774(r9, r3)
            xhss.C0532.m947(r9)
            return r4
        La8:
            xhss.ᛲᛷᛷᛵ r0 = new xhss.ᛲᛷᛷᛵ
            r1 = 6
            r0.<init>(r9, r4, r1)
            return r0
    }
}
