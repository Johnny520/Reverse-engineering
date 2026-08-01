package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲀᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1079 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C1079 f3476 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C1079 f3477 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3478;

    static {
            xhss.ᲇᲀᛵᲀ r0 = new xhss.ᲇᲀᛵᲀ
            r1 = 0
            r0.<init>(r1)
            xhss.C1079.f3476 = r0
            xhss.ᲇᲀᛵᲀ r0 = new xhss.ᲇᲀᛵᲀ
            r1 = 1
            r0.<init>(r1)
            xhss.C1079.f3477 = r0
            return
    }

    public /* synthetic */ C1079(int r1) {
            r0 = this;
            r0.f3478 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static boolean m1735(java.io.IOException r0, xhss.C0819 r1, xhss.C1000 r2, xhss.C0355 r3) {
            boolean r3 = r0 instanceof xhss.C1055
            boolean r2 = r2.f3278
            if (r2 != 0) goto L7
            goto L50
        L7:
            if (r3 != 0) goto Le
            boolean r2 = r0 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto Le
            goto L50
        Le:
            boolean r2 = r0 instanceof java.net.ProtocolException
            if (r2 == 0) goto L13
            goto L50
        L13:
            boolean r2 = r0 instanceof java.io.InterruptedIOException
            if (r2 == 0) goto L1e
            boolean r0 = r0 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L50
            if (r3 == 0) goto L50
            goto L30
        L1e:
            boolean r2 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r2 == 0) goto L2b
            java.lang.Throwable r2 = r0.getCause()
            boolean r2 = r2 instanceof java.security.cert.CertificateException
            if (r2 == 0) goto L2b
            goto L50
        L2b:
            boolean r0 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L30
            goto L50
        L30:
            xhss.ᲇᛸᛵᛴ r0 = r1.f2663
            if (r0 == 0) goto L50
            boolean r0 = r0.f3441
            r2 = 1
            if (r0 != r2) goto L50
            xhss.ᛵᲇᛷᲀ r0 = r1.f2668
            xhss.ᲁᛴᛶᛸ r0 = r0.mo929()
            xhss.ᲇᛸᛵᛴ r1 = r1.f2663
            if (r1 == 0) goto L48
            xhss.ᲈᲁᛲᲇ r1 = r1.m1723()
            goto L49
        L48:
            r1 = 0
        L49:
            boolean r0 = r0.m1542(r1)
            if (r0 == 0) goto L50
            return r2
        L50:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static int m1736(xhss.C0871 r1, int r2) {
            xhss.ᲁᛸᛱᛵ r1 = r1.f2820
            java.lang.String r0 = "Retry-After"
            java.lang.String r1 = r1.m1605(r0)
            if (r1 != 0) goto Lb
            r1 = 0
        Lb:
            if (r1 != 0) goto Le
            return r2
        Le:
            java.lang.String r2 = "\\d+"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L27
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            return r1
        L27:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C0355 m1737(xhss.C0871 r10, xhss.C1066 r11, xhss.C1000 r12) {
            r0 = 0
            if (r11 == 0) goto La
            xhss.ᲈᲁᛲᲇ r1 = r11.m1723()
            xhss.ᛱᛷᲁᛶ r1 = r1.f3822
            goto Lb
        La:
            r1 = r0
        Lb:
            int r2 = r10.f2813
            xhss.ᛴᛴᛴᛵ r3 = r10.f2809
            java.lang.Object r3 = r3.f1314
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = 1
            r6 = 308(0x134, float:4.32E-43)
            r7 = 307(0x133, float:4.3E-43)
            if (r2 == r7) goto Lb8
            if (r2 == r6) goto Lb8
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto Lb2
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L7f
            r11 = 503(0x1f7, float:7.05E-43)
            if (r2 == r11) goto L69
            r11 = 407(0x197, float:5.7E-43)
            if (r2 == r11) goto L51
            r11 = 408(0x198, float:5.72E-43)
            if (r2 == r11) goto L36
            switch(r2) {
                case 300: goto Lb8;
                case 301: goto Lb8;
                case 302: goto Lb8;
                case 303: goto Lb8;
                default: goto L34;
            }
        L34:
            goto L105
        L36:
            boolean r12 = r12.f3278
            if (r12 != 0) goto L3c
            goto L105
        L3c:
            xhss.ᲀᛶᛷᲁ r12 = r10.f2814
            if (r12 == 0) goto L46
            int r12 = r12.f2813
            if (r12 != r11) goto L46
            goto L105
        L46:
            int r11 = m1736(r10, r4)
            if (r11 <= 0) goto L4e
            goto L105
        L4e:
            xhss.ᛴᛴᛴᛵ r10 = r10.f2809
            return r10
        L51:
            java.net.Proxy r10 = r1.f357
            java.net.Proxy$Type r10 = r10.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.HTTP
            if (r10 != r11) goto L61
            xhss.ᛳᛴᲀᲁ r10 = r12.f3269
            r10.getClass()
            return r0
        L61:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r10.<init>(r11)
            throw r10
        L69:
            xhss.ᲀᛶᛷᲁ r12 = r10.f2814
            if (r12 == 0) goto L73
            int r12 = r12.f2813
            if (r12 != r11) goto L73
            goto L105
        L73:
            r11 = 2147483647(0x7fffffff, float:NaN)
            int r11 = m1736(r10, r11)
            if (r11 != 0) goto L105
            xhss.ᛴᛴᛴᛵ r10 = r10.f2809
            return r10
        L7f:
            if (r11 == 0) goto L105
            xhss.ᛵᲇᛷᲀ r12 = r11.f3438
            xhss.ᲁᛴᛶᛸ r12 = r12.mo929()
            xhss.ᛵᲈᛱᛳ r12 = r12.f3073
            xhss.ᛷᛶᲁᛵ r12 = r12.f1924
            java.lang.String r12 = r12.f2288
            xhss.ᛷᛶᛷᛲ r1 = r11.f3439
            xhss.ᲀᲀᲁᛱ r1 = r1.mo638()
            xhss.ᛱᛷᲁᛶ r1 = r1.mo590()
            xhss.ᛵᲈᛱᛳ r1 = r1.f359
            xhss.ᛷᛶᲁᛵ r1 = r1.f1924
            java.lang.String r1 = r1.f2288
            boolean r12 = xhss.AbstractC0007.m97(r12, r1)
            if (r12 == 0) goto La4
            goto L105
        La4:
            xhss.ᲈᲁᛲᲇ r11 = r11.m1723()
            monitor-enter(r11)
            r11.f3836 = r5     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r11)
            xhss.ᛴᛴᛴᛵ r10 = r10.f2809
            return r10
        Laf:
            r10 = move-exception
            monitor-exit(r11)
            throw r10
        Lb2:
            xhss.ᛳᛴᲀᲁ r10 = r12.f3276
            r10.getClass()
            return r0
        Lb8:
            java.lang.String r11 = "PROPFIND"
            xhss.ᛸᲇᲇᛶ r1 = r12.f3273
            xhss.ᛵᛸᛷᛲ r1 = r1.f2659
            boolean r1 = r1.f1844
            if (r1 != 0) goto Lc3
            goto L105
        Lc3:
            java.lang.String r1 = "Location"
            xhss.ᲁᛸᛱᛵ r2 = r10.f2820
            java.lang.String r1 = r2.m1605(r1)
            if (r1 != 0) goto Lce
            r1 = r0
        Lce:
            xhss.ᛴᛴᛴᛵ r2 = r10.f2809
            if (r1 != 0) goto Ld3
            goto L105
        Ld3:
            java.lang.Object r8 = r2.f1313
            xhss.ᛷᛶᲁᛵ r8 = (xhss.C0669) r8
            r8.getClass()
            xhss.ᛴᲇᛴᛱ r9 = new xhss.ᛴᲇᛴᛱ     // Catch: java.lang.IllegalArgumentException -> Le3
            r9.<init>()     // Catch: java.lang.IllegalArgumentException -> Le3
            r9.m808(r8, r1)     // Catch: java.lang.IllegalArgumentException -> Le3
            goto Le4
        Le3:
            r9 = r0
        Le4:
            if (r9 == 0) goto Leb
            xhss.ᛷᛶᲁᛵ r1 = r9.m809()
            goto Lec
        Leb:
            r1 = r0
        Lec:
            if (r1 != 0) goto Lef
            goto L105
        Lef:
            java.lang.String r8 = r1.f2285
            java.lang.Object r9 = r2.f1313
            xhss.ᛷᛶᲁᛵ r9 = (xhss.C0669) r9
            java.lang.String r9 = r9.f2285
            boolean r8 = xhss.AbstractC0007.m97(r8, r9)
            if (r8 != 0) goto L106
            xhss.ᛸᲇᲇᛶ r12 = r12.f3273
            xhss.ᛵᛸᛷᛲ r12 = r12.f2659
            boolean r12 = r12.f1843
            if (r12 != 0) goto L106
        L105:
            return r0
        L106:
            xhss.ᲇᛸᛶ r12 = r2.m713()
            java.lang.String r0 = "GET"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L157
            java.lang.String r0 = "HEAD"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L157
            int r10 = r10.f2813
            boolean r0 = r3.equals(r11)
            if (r0 != 0) goto L126
            if (r10 == r6) goto L126
            if (r10 != r7) goto L127
        L126:
            r4 = r5
        L127:
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L137
            if (r10 == r6) goto L137
            if (r10 == r7) goto L137
            java.lang.String r10 = "GET"
            r12.m1731(r10)
            goto L13a
        L137:
            r12.m1731(r3)
        L13a:
            if (r4 != 0) goto L157
            java.lang.String r10 = "Transfer-Encoding"
            java.lang.Object r11 = r12.f3445
            xhss.ᛴᲈᛱᲁ r11 = (xhss.C0425) r11
            r11.m812(r10)
            java.lang.String r10 = "Content-Length"
            java.lang.Object r11 = r12.f3445
            xhss.ᛴᲈᛱᲁ r11 = (xhss.C0425) r11
            r11.m812(r10)
            java.lang.String r10 = "Content-Type"
            java.lang.Object r11 = r12.f3445
            xhss.ᛴᲈᛱᲁ r11 = (xhss.C0425) r11
            r11.m812(r10)
        L157:
            java.lang.Object r10 = r2.f1313
            xhss.ᛷᛶᲁᛵ r10 = (xhss.C0669) r10
            boolean r10 = xhss.AbstractC0559.m989(r10, r1)
            if (r10 != 0) goto L16a
            java.lang.String r10 = "Authorization"
            java.lang.Object r11 = r12.f3445
            xhss.ᛴᲈᛱᲁ r11 = (xhss.C0425) r11
            r11.m812(r10)
        L16a:
            r12.f3444 = r1
            xhss.ᛴᛴᛴᛵ r10 = new xhss.ᛴᛴᛴᛵ
            r10.<init>(r12)
            return r10
    }
}
