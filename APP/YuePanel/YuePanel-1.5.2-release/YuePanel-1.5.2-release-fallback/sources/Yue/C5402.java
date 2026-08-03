package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5402 implements Yue.InterfaceC3318 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5402.C5403 f20046 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f20047 = 20;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C4559 f20048;

    /* JADX INFO: renamed from: Yue.ۥۡۦۨۢ$ۥ, reason: contains not printable characters */
    public static final class C5403 {
        public C5403() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5403(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥۡۦۨۢ$ۥ r0 = new Yue.ۥۡۦۨۢ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5402.f20046 = r0
            return
    }

    public C5402(@Yue.InterfaceC4418 Yue.C4559 r2) {
            r1 = this;
            java.lang.String r0 = "client"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f20048 = r2
            return
    }

    @Override // Yue.InterfaceC3318
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C5377 mo4781(@Yue.InterfaceC4418 Yue.InterfaceC3318.InterfaceC3319 r11) throws java.io.IOException {
            r10 = this;
            java.lang.String r0 = "chain"
            Yue.C3329.m13906(r11, r0)
            Yue.ۥۡۦ۠ۧ r11 = (Yue.C5228) r11
            Yue.ۥۡۦۤۧ r0 = r11.m19755()
            Yue.ۥۡۦ۠ۤ r1 = r11.m19751()
            java.util.List r2 = Yue.C1208.m6210()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.m19679(r0, r6)
            boolean r6 = r1.mo5244()     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto Lcf
            Yue.ۥۡۦۧ r0 = r11.mo13878(r0)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L99 Yue.C5438 -> Lb2
            if (r7 == 0) goto L40
            Yue.ۥۡۦۧ$ۥ r0 = r0.m20295()     // Catch: java.lang.Throwable -> L42
            Yue.ۥۡۦۧ$ۥ r6 = r7.m20295()     // Catch: java.lang.Throwable -> L42
            Yue.ۥۡۦۧ$ۥ r6 = r6.m20304(r4)     // Catch: java.lang.Throwable -> L42
            Yue.ۥۡۦۧ r6 = r6.m20305()     // Catch: java.lang.Throwable -> L42
            Yue.ۥۡۦۧ$ۥ r0 = r0.m20329(r6)     // Catch: java.lang.Throwable -> L42
            Yue.ۥۡۦۧ r0 = r0.m20305()     // Catch: java.lang.Throwable -> L42
        L40:
            r7 = r0
            goto L45
        L42:
            r11 = move-exception
            goto Ld7
        L45:
            Yue.ۥۣ۠ۡ۟ r0 = r1.m19686()     // Catch: java.lang.Throwable -> L42
            Yue.ۥۡۦۤۧ r6 = r10.m20411(r7, r0)     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto L5e
            if (r0 == 0) goto L5a
            boolean r11 = r0.m10489()     // Catch: java.lang.Throwable -> L42
            if (r11 == 0) goto L5a
            r1.m19697()     // Catch: java.lang.Throwable -> L42
        L5a:
            r1.m19680(r3)
            return r7
        L5e:
            Yue.ۥۡۦۥ r0 = r6.m20079()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            boolean r0 = r0.m20142()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            r1.m19680(r3)
            return r7
        L6e:
            Yue.ۥۡۦۧ۟ r0 = r7.m20280()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L77
            Yue.C6656.m25567(r0)     // Catch: java.lang.Throwable -> L42
        L77:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L82
            r1.m19680(r5)
            r0 = r6
            goto L18
        L82:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L42
            r0.append(r8)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L42
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        L99:
            r6 = move-exception
            boolean r9 = r6 instanceof Yue.C1486     // Catch: java.lang.Throwable -> L42
            r9 = r9 ^ r5
            boolean r9 = r10.m20413(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Lad
            java.util.List r2 = Yue.C1219.m6469(r2, r6)     // Catch: java.lang.Throwable -> L42
        La7:
            r1.m19680(r5)
            r6 = r3
            goto L19
        Lad:
            java.lang.Throwable r11 = Yue.C6656.m25619(r6, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Lb2:
            r6 = move-exception
            java.io.IOException r9 = r6.m20521()     // Catch: java.lang.Throwable -> L42
            boolean r9 = r10.m20413(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Lc6
            java.io.IOException r6 = r6.m20520()     // Catch: java.lang.Throwable -> L42
            java.util.List r2 = Yue.C1219.m6469(r2, r6)     // Catch: java.lang.Throwable -> L42
            goto La7
        Lc6:
            java.io.IOException r11 = r6.m20520()     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable r11 = Yue.C6656.m25619(r11, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Lcf:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Ld7:
            r1.m19680(r5)
            throw r11
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C5317 m20410(Yue.C5377 r9, java.lang.String r10) {
            r8 = this;
            Yue.ۥۣۡۢۨ r0 = r8.f20048
            boolean r0 = r0.m18180()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r0 = "Location"
            r2 = 2
            java.lang.String r0 = Yue.C5377.m20266(r9, r0, r1, r2, r1)
            if (r0 != 0) goto L14
            return r1
        L14:
            Yue.ۥۡۦۤۧ r2 = r9.m20300()
            Yue.ۥ۠ۤۨۥ r2 = r2.m20090()
            Yue.ۥ۠ۤۨۥ r0 = r2.m13479(r0)
            if (r0 != 0) goto L23
            return r1
        L23:
            java.lang.String r2 = r0.m13480()
            Yue.ۥۡۦۤۧ r3 = r9.m20300()
            Yue.ۥ۠ۤۨۥ r3 = r3.m20090()
            java.lang.String r3 = r3.m13480()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 != 0) goto L42
            Yue.ۥۣۡۢۨ r2 = r8.f20048
            boolean r2 = r2.m18181()
            if (r2 != 0) goto L42
            return r1
        L42:
            Yue.ۥۡۦۤۧ r2 = r9.m20300()
            Yue.ۥۡۦۤۧ$ۥ r2 = r2.m20087()
            boolean r3 = Yue.C3169.m13424(r10)
            if (r3 == 0) goto L96
            int r3 = r9.m20284()
            Yue.ۥۣ۠ۤۨ r4 = Yue.C3169.f10460
            boolean r5 = r4.m13428(r10)
            r6 = 307(0x133, float:4.3E-43)
            r7 = 308(0x134, float:4.32E-43)
            if (r5 != 0) goto L67
            if (r3 == r7) goto L67
            if (r3 != r6) goto L65
            goto L67
        L65:
            r5 = 0
            goto L68
        L67:
            r5 = 1
        L68:
            boolean r4 = r4.m13427(r10)
            if (r4 == 0) goto L78
            if (r3 == r7) goto L78
            if (r3 == r6) goto L78
            java.lang.String r10 = "GET"
            r2.m20106(r10, r1)
            goto L85
        L78:
            if (r5 == 0) goto L82
            Yue.ۥۡۦۤۧ r1 = r9.m20300()
            Yue.ۥۡۦۥ r1 = r1.m20079()
        L82:
            r2.m20106(r10, r1)
        L85:
            if (r5 != 0) goto L96
            java.lang.String r10 = "Transfer-Encoding"
            r2.m20110(r10)
            java.lang.String r10 = "Content-Length"
            r2.m20110(r10)
            java.lang.String r10 = "Content-Type"
            r2.m20110(r10)
        L96:
            Yue.ۥۡۦۤۧ r9 = r9.m20300()
            Yue.ۥ۠ۤۨۥ r9 = r9.m20090()
            boolean r9 = Yue.C6656.m25564(r9, r0)
            if (r9 != 0) goto La9
            java.lang.String r9 = "Authorization"
            r2.m20110(r9)
        La9:
            Yue.ۥۡۦۤۧ$ۥ r9 = r2.m20118(r0)
            Yue.ۥۡۦۤۧ r9 = r9.m20093()
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C5317 m20411(Yue.C5377 r6, Yue.C2269 r7) throws java.io.IOException {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto Le
            Yue.ۥۡۦ۠ۥ r1 = r7.m10484()
            if (r1 == 0) goto Le
            Yue.ۥۣۡۧ۠ r1 = r1.mo7317()
            goto Lf
        Le:
            r1 = r0
        Lf:
            int r2 = r6.m20284()
            Yue.ۥۡۦۤۧ r3 = r6.m20300()
            java.lang.String r3 = r3.m20086()
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto Ldf
            r4 = 308(0x134, float:4.32E-43)
            if (r2 == r4) goto Ldf
            r4 = 401(0x191, float:5.62E-43)
            if (r2 == r4) goto Ld4
            r4 = 421(0x1a5, float:5.9E-43)
            if (r2 == r4) goto Lad
            r7 = 503(0x1f7, float:7.05E-43)
            if (r2 == r7) goto L91
            r7 = 407(0x197, float:5.7E-43)
            if (r2 == r7) goto L6f
            r7 = 408(0x198, float:5.72E-43)
            if (r2 == r7) goto L3b
            switch(r2) {
                case 300: goto Ldf;
                case 301: goto Ldf;
                case 302: goto Ldf;
                case 303: goto Ldf;
                default: goto L3a;
            }
        L3a:
            return r0
        L3b:
            Yue.ۥۣۡۢۨ r1 = r5.f20048
            boolean r1 = r1.m18194()
            if (r1 != 0) goto L44
            return r0
        L44:
            Yue.ۥۡۦۤۧ r1 = r6.m20300()
            Yue.ۥۡۦۥ r1 = r1.m20079()
            if (r1 == 0) goto L55
            boolean r1 = r1.m20142()
            if (r1 == 0) goto L55
            return r0
        L55:
            Yue.ۥۡۦۧ r1 = r6.m20297()
            if (r1 == 0) goto L62
            int r1 = r1.m20284()
            if (r1 != r7) goto L62
            return r0
        L62:
            r7 = 0
            int r7 = r5.m20415(r6, r7)
            if (r7 <= 0) goto L6a
            return r0
        L6a:
            Yue.ۥۡۦۤۧ r6 = r6.m20300()
            return r6
        L6f:
            Yue.C3329.m13903(r1)
            java.net.Proxy r7 = r1.m20513()
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r7 != r0) goto L89
            Yue.ۥۣۡۢۨ r7 = r5.f20048
            Yue.ۥ۟ۢۡۡ r7 = r7.m18191()
            Yue.ۥۡۦۤۧ r6 = r7.mo4336(r1, r6)
            return r6
        L89:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r6.<init>(r7)
            throw r6
        L91:
            Yue.ۥۡۦۧ r1 = r6.m20297()
            if (r1 == 0) goto L9e
            int r1 = r1.m20284()
            if (r1 != r7) goto L9e
            return r0
        L9e:
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r5.m20415(r6, r7)
            if (r7 != 0) goto Lac
            Yue.ۥۡۦۤۧ r6 = r6.m20300()
            return r6
        Lac:
            return r0
        Lad:
            Yue.ۥۡۦۤۧ r1 = r6.m20300()
            Yue.ۥۡۦۥ r1 = r1.m20079()
            if (r1 == 0) goto Lbe
            boolean r1 = r1.m20142()
            if (r1 == 0) goto Lbe
            return r0
        Lbe:
            if (r7 == 0) goto Ld3
            boolean r1 = r7.m10488()
            if (r1 != 0) goto Lc7
            goto Ld3
        Lc7:
            Yue.ۥۡۦ۠ۥ r7 = r7.m10484()
            r7.m19730()
            Yue.ۥۡۦۤۧ r6 = r6.m20300()
            return r6
        Ld3:
            return r0
        Ld4:
            Yue.ۥۣۡۢۨ r7 = r5.f20048
            Yue.ۥ۟ۢۡۡ r7 = r7.m18168()
            Yue.ۥۡۦۤۧ r6 = r7.mo4336(r1, r6)
            return r6
        Ldf:
            Yue.ۥۡۦۤۧ r6 = r5.m20410(r6, r3)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m20412(java.io.IOException r4, boolean r5) {
            r3 = this;
            boolean r0 = r4 instanceof java.net.ProtocolException
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r4 instanceof java.io.InterruptedIOException
            r2 = 1
            if (r0 == 0) goto L13
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto L12
            if (r5 != 0) goto L12
            r1 = r2
        L12:
            return r1
        L13:
            boolean r5 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L20
            java.lang.Throwable r5 = r4.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L20
            return r1
        L20:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L25
            return r1
        L25:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m20413(java.io.IOException r3, Yue.C5215 r4, Yue.C5317 r5, boolean r6) {
            r2 = this;
            Yue.ۥۣۡۢۨ r0 = r2.f20048
            boolean r0 = r0.m18194()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            if (r6 == 0) goto L13
            boolean r5 = r2.m20414(r3, r5)
            if (r5 == 0) goto L13
            return r1
        L13:
            boolean r3 = r2.m20412(r3, r6)
            if (r3 != 0) goto L1a
            return r1
        L1a:
            boolean r3 = r4.m19694()
            if (r3 != 0) goto L21
            return r1
        L21:
            r3 = 1
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m20414(java.io.IOException r1, Yue.C5317 r2) {
            r0 = this;
            Yue.ۥۡۦۥ r2 = r2.m20079()
            if (r2 == 0) goto Lc
            boolean r2 = r2.m20142()
            if (r2 != 0) goto L10
        Lc:
            boolean r1 = r1 instanceof java.io.FileNotFoundException
            if (r1 == 0) goto L12
        L10:
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m20415(Yue.C5377 r4, int r5) {
            r3 = this;
            r0 = 0
            r1 = 2
            java.lang.String r2 = "Retry-After"
            java.lang.String r4 = Yue.C5377.m20266(r4, r2, r0, r1, r0)
            if (r4 != 0) goto Lb
            return r5
        Lb:
            Yue.ۥۡۦۣۢ r5 = new Yue.ۥۡۦۣۢ
            java.lang.String r0 = "\\d+"
            r5.<init>(r0)
            boolean r5 = r5.m19953(r4)
            if (r5 == 0) goto L26
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "valueOf(header)"
            Yue.C3329.m13905(r4, r5)
            int r4 = r4.intValue()
            return r4
        L26:
            r4 = 2147483647(0x7fffffff, float:NaN)
            return r4
    }
}
