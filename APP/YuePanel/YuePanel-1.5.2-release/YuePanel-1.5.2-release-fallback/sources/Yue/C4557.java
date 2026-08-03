package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nOkHostnameVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1747#2,3:209\n1747#2,3:212\n*S KotlinDebug\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n*L\n63#1:209,3\n71#1:212,3\n*E\n"})
public final class C4557 implements javax.net.ssl.HostnameVerifier {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4557 f14553 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f14554 = 2;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f14555 = 7;

    static {
            Yue.ۥۡۢۨۡ r0 = new Yue.ۥۡۢۨۡ
            r0.<init>()
            Yue.C4557.f14553 = r0
            return
    }

    public C4557() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 javax.net.ssl.SSLSession r4) {
            r2 = this;
            java.lang.String r0 = "host"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "session"
            Yue.C3329.m13906(r4, r0)
            boolean r0 = r2.m18133(r3)
            r1 = 0
            if (r0 != 0) goto L12
            goto L23
        L12:
            java.security.cert.Certificate[] r4 = r4.getPeerCertificates()     // Catch: javax.net.ssl.SSLException -> L23
            r4 = r4[r1]     // Catch: javax.net.ssl.SSLException -> L23
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            Yue.C3329.m13904(r4, r0)     // Catch: javax.net.ssl.SSLException -> L23
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch: javax.net.ssl.SSLException -> L23
            boolean r1 = r2.m18134(r3, r4)     // Catch: javax.net.ssl.SSLException -> L23
        L23:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m18130(@Yue.InterfaceC4418 java.security.cert.X509Certificate r3) {
            r2 = this;
            java.lang.String r0 = "certificate"
            Yue.C3329.m13906(r3, r0)
            r0 = 7
            java.util.List r0 = r2.m18132(r3, r0)
            r1 = 2
            java.util.List r3 = r2.m18132(r3, r1)
            java.util.List r3 = Yue.C1219.m6468(r0, r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String m18131(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.m18133(r3)
            if (r0 == 0) goto L16
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "US"
            Yue.C3329.m13905(r0, r1)
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "this as java.lang.String).toLowerCase(locale)"
            Yue.C3329.m13905(r3, r0)
        L16:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m18132(java.security.cert.X509Certificate r5, int r6) {
            r4 = this;
            java.util.Collection r5 = r5.getSubjectAlternativeNames()     // Catch: java.security.cert.CertificateParsingException -> L48
            if (r5 != 0) goto Lb
            java.util.List r5 = Yue.C1208.m6210()     // Catch: java.security.cert.CertificateParsingException -> L48
            return r5
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.security.cert.CertificateParsingException -> L48
            r0.<init>()     // Catch: java.security.cert.CertificateParsingException -> L48
            java.util.Iterator r5 = r5.iterator()     // Catch: java.security.cert.CertificateParsingException -> L48
        L14:
            boolean r1 = r5.hasNext()     // Catch: java.security.cert.CertificateParsingException -> L48
            if (r1 == 0) goto L47
            java.lang.Object r1 = r5.next()     // Catch: java.security.cert.CertificateParsingException -> L48
            java.util.List r1 = (java.util.List) r1     // Catch: java.security.cert.CertificateParsingException -> L48
            if (r1 == 0) goto L14
            int r2 = r1.size()     // Catch: java.security.cert.CertificateParsingException -> L48
            r3 = 2
            if (r2 >= r3) goto L2a
            goto L14
        L2a:
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.security.cert.CertificateParsingException -> L48
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.security.cert.CertificateParsingException -> L48
            boolean r2 = Yue.C3329.m13897(r2, r3)     // Catch: java.security.cert.CertificateParsingException -> L48
            if (r2 == 0) goto L14
            r2 = 1
            java.lang.Object r1 = r1.get(r2)     // Catch: java.security.cert.CertificateParsingException -> L48
            if (r1 != 0) goto L41
            goto L14
        L41:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.security.cert.CertificateParsingException -> L48
            r0.add(r1)     // Catch: java.security.cert.CertificateParsingException -> L48
            goto L14
        L47:
            return r0
        L48:
            java.util.List r5 = Yue.C1208.m6210()
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m18133(java.lang.String r5) {
            r4 = this;
            int r0 = r5.length()
            r1 = 3
            r2 = 0
            r3 = 0
            long r1 = Yue.C6643.m25536(r5, r3, r3, r1, r2)
            int r5 = (int) r1
            if (r0 != r5) goto Lf
            r3 = 1
        Lf:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m18134(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.security.cert.X509Certificate r3) {
            r1 = this;
            java.lang.String r0 = "host"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "certificate"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = Yue.C6656.m25563(r2)
            if (r0 == 0) goto L15
            boolean r2 = r1.m18137(r2, r3)
            goto L19
        L15:
            boolean r2 = r1.m18136(r2, r3)
        L19:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m18135(java.lang.String r14, java.lang.String r15) {
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lc9
            int r1 = r14.length()
            if (r1 != 0) goto Lb
            goto Lc9
        Lb:
            java.lang.String r1 = "."
            r2 = 2
            r3 = 0
            boolean r4 = Yue.C5988.m22315(r14, r1, r0, r2, r3)
            if (r4 != 0) goto Lc9
            java.lang.String r4 = ".."
            boolean r5 = Yue.C5988.m22280(r14, r4, r0, r2, r3)
            if (r5 == 0) goto L1f
            goto Lc9
        L1f:
            if (r15 == 0) goto Lc9
            int r5 = r15.length()
            if (r5 != 0) goto L29
            goto Lc9
        L29:
            boolean r5 = Yue.C5988.m22315(r15, r1, r0, r2, r3)
            if (r5 != 0) goto Lc9
            boolean r4 = Yue.C5988.m22280(r15, r4, r0, r2, r3)
            if (r4 == 0) goto L37
            goto Lc9
        L37:
            boolean r4 = Yue.C5988.m22280(r14, r1, r0, r2, r3)
            r5 = 46
            if (r4 != 0) goto L4e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r14)
            r4.append(r5)
            java.lang.String r14 = r4.toString()
        L4e:
            r6 = r14
            boolean r14 = Yue.C5988.m22280(r15, r1, r0, r2, r3)
            if (r14 != 0) goto L64
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r15)
            r14.append(r5)
            java.lang.String r15 = r14.toString()
        L64:
            java.lang.String r14 = r13.m18131(r15)
            java.lang.String r15 = "*"
            boolean r15 = Yue.C5989.m22342(r14, r15, r0, r2, r3)
            if (r15 != 0) goto L75
            boolean r14 = Yue.C3329.m13897(r6, r14)
            return r14
        L75:
            java.lang.String r15 = "*."
            boolean r1 = Yue.C5988.m22315(r14, r15, r0, r2, r3)
            if (r1 == 0) goto Lc9
            r11 = 4
            r12 = 0
            r8 = 42
            r9 = 1
            r10 = 0
            r7 = r14
            int r1 = Yue.C5989.m22363(r7, r8, r9, r10, r11, r12)
            r4 = -1
            if (r1 == r4) goto L8c
            goto Lc9
        L8c:
            int r1 = r6.length()
            int r5 = r14.length()
            if (r1 >= r5) goto L97
            return r0
        L97:
            boolean r15 = Yue.C3329.m13897(r15, r14)
            if (r15 == 0) goto L9e
            return r0
        L9e:
            r15 = 1
            java.lang.String r14 = r14.substring(r15)
            java.lang.String r1 = "this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r14, r1)
            boolean r1 = Yue.C5988.m22280(r6, r14, r0, r2, r3)
            if (r1 != 0) goto Laf
            return r0
        Laf:
            int r1 = r6.length()
            int r14 = r14.length()
            int r1 = r1 - r14
            if (r1 <= 0) goto Lc8
            int r8 = r1 + (-1)
            r10 = 4
            r11 = 0
            r7 = 46
            r9 = 0
            int r14 = Yue.C5989.m22377(r6, r7, r8, r9, r10, r11)
            if (r14 == r4) goto Lc8
            return r0
        Lc8:
            return r15
        Lc9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m18136(java.lang.String r4, java.security.cert.X509Certificate r5) {
            r3 = this;
            java.lang.String r4 = r3.m18131(r4)
            r0 = 2
            java.util.List r5 = r3.m18132(r5, r0)
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L15
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L15
            goto L2e
        L15:
            java.util.Iterator r5 = r5.iterator()
        L19:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            Yue.ۥۡۢۨۡ r2 = Yue.C4557.f14553
            boolean r0 = r2.m18135(r4, r0)
            if (r0 == 0) goto L19
            r1 = 1
        L2e:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m18137(java.lang.String r3, java.security.cert.X509Certificate r4) {
            r2 = this;
            java.lang.String r3 = Yue.C3080.m12965(r3)
            r0 = 7
            java.util.List r4 = r2.m18132(r4, r0)
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L15
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L15
            goto L30
        L15:
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = Yue.C3080.m12965(r0)
            boolean r0 = Yue.C3329.m13897(r3, r0)
            if (r0 == 0) goto L19
            r1 = 1
        L30:
            return r1
    }
}
