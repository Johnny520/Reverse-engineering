package defpackage;

/* JADX INFO: renamed from: ᲁᛵᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1861 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1861 f8114 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1861 f8115 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f8116;

    static {
            ᲁᛵᛷᲁ r0 = new ᲁᛵᛷᲁ
            r1 = 0
            r0.<init>(r1)
            defpackage.C1861.f8115 = r0
            ᲁᛵᛷᲁ r0 = new ᲁᛵᛷᲁ
            r1 = 1
            r0.<init>(r1)
            defpackage.C1861.f8114 = r0
            return
    }

    public /* synthetic */ C1861(int r1) {
            r0 = this;
            r0.f8116 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static int m3274(defpackage.C0569 r1, int r2) {
            ᛱᛱᛷᛳ r1 = r1.f2820
            java.lang.String r0 = "Retry-After"
            java.lang.String r1 = r1.m324(r0)
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

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0478 m3275(defpackage.C0569 r10, defpackage.C0703 r11, defpackage.C1756 r12) {
            r0 = 0
            if (r11 == 0) goto La
            ᲁᛸᛲᛶ r1 = r11.m1596()
            ᲇᛵᲇᲇ r1 = r1.f8204
            goto Lb
        La:
            r1 = r0
        Lb:
            int r2 = r10.f2833
            ᛳᛵᛴᛴ r3 = r10.f2828
            java.lang.Object r3 = r3.f2400
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = 1
            r6 = 308(0x134, float:4.32E-43)
            r7 = 307(0x133, float:4.3E-43)
            if (r2 == r7) goto Lbe
            if (r2 == r6) goto Lbe
            r8 = 401(0x191, float:5.62E-43)
            if (r2 == r8) goto Lb7
            r8 = 421(0x1a5, float:5.9E-43)
            if (r2 == r8) goto L80
            r11 = 503(0x1f7, float:7.05E-43)
            if (r2 == r11) goto L6a
            r11 = 407(0x197, float:5.7E-43)
            if (r2 == r11) goto L51
            r11 = 408(0x198, float:5.72E-43)
            if (r2 == r11) goto L36
            switch(r2) {
                case 300: goto Lbe;
                case 301: goto Lbe;
                case 302: goto Lbe;
                case 303: goto Lbe;
                default: goto L34;
            }
        L34:
            goto L10b
        L36:
            boolean r12 = r12.f7767
            if (r12 != 0) goto L3c
            goto L10b
        L3c:
            ᛳᲇᛲᲁ r12 = r10.f2826
            if (r12 == 0) goto L46
            int r12 = r12.f2833
            if (r12 != r11) goto L46
            goto L10b
        L46:
            int r11 = m3274(r10, r4)
            if (r11 <= 0) goto L4e
            goto L10b
        L4e:
            ᛳᛵᛴᛴ r10 = r10.f2828
            return r10
        L51:
            java.net.Proxy r11 = r1.f8855
            java.net.Proxy$Type r11 = r11.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r11 != r0) goto L62
            ᲈᲈᛳᛷ r11 = r12.f7757
            ᛳᛵᛴᛴ r10 = r11.mo1549(r1, r10)
            return r10
        L62:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r10.<init>(r11)
            throw r10
        L6a:
            ᛳᲇᛲᲁ r12 = r10.f2826
            if (r12 == 0) goto L74
            int r12 = r12.f2833
            if (r12 != r11) goto L74
            goto L10b
        L74:
            r11 = 2147483647(0x7fffffff, float:NaN)
            int r11 = m3274(r10, r11)
            if (r11 != 0) goto L10b
            ᛳᛵᛴᛴ r10 = r10.f2828
            return r10
        L80:
            if (r11 == 0) goto L10b
            java.lang.Object r12 = r11.f3354
            ᛵᛲᲈᛸ r12 = (defpackage.InterfaceC0845) r12
            ᛶᛵᛶᛶ r12 = r12.mo634()
            ᛱᛲᛶᲈ r12 = r12.f4825
            ᛳᛸᛲ r12 = r12.f538
            java.lang.String r12 = r12.f2563
            java.lang.Object r1 = r11.f3353
            ᛸᲀᛷ r1 = (defpackage.InterfaceC1559) r1
            ᛳᲁᲀᲇ r1 = r1.mo1516()
            ᲇᛵᲇᲇ r1 = r1.mo1357()
            ᛱᛲᛶᲈ r1 = r1.f8854
            ᛳᛸᛲ r1 = r1.f538
            java.lang.String r1 = r1.f2563
            boolean r12 = defpackage.AbstractC0498.m1280(r12, r1)
            if (r12 == 0) goto La9
            goto L10b
        La9:
            ᲁᛸᛲᛶ r11 = r11.m1596()
            monitor-enter(r11)
            r11.f8197 = r5     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r11)
            ᛳᛵᛴᛴ r10 = r10.f2828
            return r10
        Lb4:
            r10 = move-exception
            monitor-exit(r11)
            throw r10
        Lb7:
            ᲈᲈᛳᛷ r11 = r12.f7754
            ᛳᛵᛴᛴ r10 = r11.mo1549(r1, r10)
            return r10
        Lbe:
            java.lang.String r11 = "PROPFIND"
            ᛶᛴᲈ r1 = r12.f7764
            ᲈᛴᛶᲁ r1 = r1.f4735
            boolean r1 = r1.f9489
            if (r1 != 0) goto Lc9
            goto L10b
        Lc9:
            java.lang.String r1 = "Location"
            ᛱᛱᛷᛳ r2 = r10.f2820
            java.lang.String r1 = r2.m324(r1)
            if (r1 != 0) goto Ld4
            r1 = r0
        Ld4:
            ᛳᛵᛴᛴ r2 = r10.f2828
            if (r1 != 0) goto Ld9
            goto L10b
        Ld9:
            java.lang.Object r8 = r2.f2401
            ᛳᛸᛲ r8 = (defpackage.C0520) r8
            r8.getClass()
            ᛱᛵᛴᛲ r9 = new ᛱᛵᛴᛲ     // Catch: java.lang.IllegalArgumentException -> Le9
            r9.<init>()     // Catch: java.lang.IllegalArgumentException -> Le9
            r9.m566(r8, r1)     // Catch: java.lang.IllegalArgumentException -> Le9
            goto Lea
        Le9:
            r9 = r0
        Lea:
            if (r9 == 0) goto Lf1
            ᛳᛸᛲ r1 = r9.m568()
            goto Lf2
        Lf1:
            r1 = r0
        Lf2:
            if (r1 != 0) goto Lf5
            goto L10b
        Lf5:
            java.lang.String r8 = r1.f2565
            java.lang.Object r9 = r2.f2401
            ᛳᛸᛲ r9 = (defpackage.C0520) r9
            java.lang.String r9 = r9.f2565
            boolean r8 = defpackage.AbstractC0498.m1280(r8, r9)
            if (r8 != 0) goto L10c
            ᛶᛴᲈ r12 = r12.f7764
            ᲈᛴᛶᲁ r12 = r12.f4735
            boolean r12 = r12.f9492
            if (r12 != 0) goto L10c
        L10b:
            return r0
        L10c:
            ᛳᲀᲁᲈ r12 = r2.m1252()
            boolean r8 = defpackage.AbstractC0209.m775(r3)
            if (r8 == 0) goto L14e
            int r10 = r10.f2833
            boolean r8 = r3.equals(r11)
            if (r8 != 0) goto L122
            if (r10 == r6) goto L122
            if (r10 != r7) goto L123
        L122:
            r4 = r5
        L123:
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L133
            if (r10 == r6) goto L133
            if (r10 == r7) goto L133
            java.lang.String r10 = "GET"
            r12.m1338(r10, r0)
            goto L13d
        L133:
            if (r4 == 0) goto L13a
            java.lang.Object r10 = r2.f2404
            r0 = r10
            ᛸᛳᛲᛳ r0 = (defpackage.AbstractC1450) r0
        L13a:
            r12.m1338(r3, r0)
        L13d:
            if (r4 != 0) goto L14e
            java.lang.String r10 = "Transfer-Encoding"
            r12.m1337(r10)
            java.lang.String r10 = "Content-Length"
            r12.m1337(r10)
            java.lang.String r10 = "Content-Type"
            r12.m1337(r10)
        L14e:
            java.lang.Object r10 = r2.f2401
            ᛳᛸᛲ r10 = (defpackage.C0520) r10
            boolean r10 = defpackage.AbstractC0508.m1295(r10, r1)
            if (r10 != 0) goto L15d
            java.lang.String r10 = "Authorization"
            r12.m1337(r10)
        L15d:
            r12.f2713 = r1
            ᛳᛵᛴᛴ r10 = new ᛳᛵᛴᛴ
            r10.<init>(r12)
            return r10
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static boolean m3276(java.io.IOException r0, defpackage.C1065 r1, defpackage.C1756 r2, defpackage.C0478 r3) {
            boolean r3 = r0 instanceof defpackage.C2253
            boolean r2 = r2.f7767
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
            ᛴᛷᛳᲀ r0 = r1.f4729
            if (r0 == 0) goto L50
            boolean r0 = r0.f3355
            r2 = 1
            if (r0 != r2) goto L50
            ᛵᛲᲈᛸ r0 = r1.f4736
            ᛶᛵᛶᛶ r0 = r0.mo634()
            ᛴᛷᛳᲀ r1 = r1.f4729
            if (r1 == 0) goto L48
            ᲁᛸᛲᛶ r1 = r1.m1596()
            goto L49
        L48:
            r1 = 0
        L49:
            boolean r0 = r0.m2052(r1)
            if (r0 == 0) goto L50
            return r2
        L50:
            r0 = 0
            return r0
    }
}
