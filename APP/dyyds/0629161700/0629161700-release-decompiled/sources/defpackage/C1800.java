package defpackage;

/* JADX INFO: renamed from: ᲁᛱᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1800 implements javax.net.ssl.HostnameVerifier {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1800 f7897 = null;

    static {
            ᲁᛱᲀᛱ r0 = new ᲁᛱᲀᛱ
            r0.<init>()
            defpackage.C1800.f7897 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static boolean m3190(java.lang.String r9, java.security.cert.X509Certificate r10) {
            ᲁᲀᲈᛵ r0 = defpackage.AbstractC0673.f3257
            java.util.regex.Pattern r0 = r0.f8356
            java.util.regex.Matcher r0 = r0.matcher(r9)
            boolean r0 = r0.matches()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3d
            java.lang.String r9 = defpackage.AbstractC0673.m1519(r9)
            r0 = 7
            java.util.List r10 = m3191(r10, r0)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L21
            goto L10f
        L21:
            java.util.Iterator r10 = r10.iterator()
        L25:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L10f
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = defpackage.AbstractC0673.m1519(r0)
            boolean r0 = defpackage.AbstractC0498.m1280(r9, r0)
            if (r0 == 0) goto L25
            goto L10e
        L3d:
            boolean r0 = m3192(r9)
            if (r0 == 0) goto L49
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r0)
        L49:
            r0 = 2
            java.util.List r10 = m3191(r10, r0)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L56
            goto L10f
        L56:
            java.util.Iterator r10 = r10.iterator()
        L5a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L10f
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            int r3 = r9.length()
            if (r3 != 0) goto L6e
            goto Le1
        L6e:
            java.lang.String r3 = "."
            boolean r4 = r9.startsWith(r3)
            if (r4 != 0) goto Le1
            java.lang.String r4 = ".."
            boolean r5 = defpackage.AbstractC0651.m1483(r9, r4, r2)
            if (r5 == 0) goto L7f
            goto Le1
        L7f:
            if (r0 == 0) goto Le1
            int r5 = r0.length()
            if (r5 != 0) goto L88
            goto Le1
        L88:
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto Le1
            boolean r4 = defpackage.AbstractC0651.m1483(r0, r4, r2)
            if (r4 == 0) goto L95
            goto Le1
        L95:
            boolean r4 = defpackage.AbstractC0651.m1483(r9, r3, r2)
            if (r4 != 0) goto La0
            java.lang.String r4 = r9.concat(r3)
            goto La1
        La0:
            r4 = r9
        La1:
            boolean r5 = defpackage.AbstractC0651.m1483(r0, r3, r2)
            if (r5 != 0) goto Lab
            java.lang.String r0 = r0.concat(r3)
        Lab:
            boolean r3 = m3192(r0)
            if (r3 == 0) goto Lb7
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
        Lb7:
            java.lang.String r3 = "*"
            boolean r3 = defpackage.AbstractC1347.m2500(r0, r3, r2)
            if (r3 != 0) goto Lc4
            boolean r0 = r4.equals(r0)
            goto L10c
        Lc4:
            java.lang.String r3 = "*."
            boolean r5 = r0.startsWith(r3)
            if (r5 == 0) goto Le1
            r5 = 42
            r6 = 4
            int r5 = defpackage.AbstractC1347.m2514(r0, r5, r1, r6)
            r7 = -1
            if (r5 == r7) goto Ld7
            goto Le1
        Ld7:
            int r5 = r4.length()
            int r8 = r0.length()
            if (r5 >= r8) goto Le3
        Le1:
            r0 = r2
            goto L10c
        Le3:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto Lea
            goto Le1
        Lea:
            java.lang.String r0 = r0.substring(r1)
            boolean r3 = defpackage.AbstractC0651.m1483(r4, r0, r2)
            if (r3 != 0) goto Lf5
            goto Le1
        Lf5:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto L10b
            int r3 = r3 + (-1)
            r0 = 46
            int r0 = defpackage.AbstractC1347.m2518(r4, r0, r3, r6)
            if (r0 == r7) goto L10b
            goto Le1
        L10b:
            r0 = r1
        L10c:
            if (r0 == 0) goto L5a
        L10e:
            return r1
        L10f:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.util.List m3191(java.security.cert.X509Certificate r4, int r5) {
            java.util.Collection r4 = r4.getSubjectAlternativeNames()     // Catch: java.security.cert.CertificateParsingException -> L44
            if (r4 != 0) goto L7
            goto L44
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.security.cert.CertificateParsingException -> L44
            r0.<init>()     // Catch: java.security.cert.CertificateParsingException -> L44
            java.util.Iterator r4 = r4.iterator()     // Catch: java.security.cert.CertificateParsingException -> L44
        L10:
            boolean r1 = r4.hasNext()     // Catch: java.security.cert.CertificateParsingException -> L44
            if (r1 == 0) goto L43
            java.lang.Object r1 = r4.next()     // Catch: java.security.cert.CertificateParsingException -> L44
            java.util.List r1 = (java.util.List) r1     // Catch: java.security.cert.CertificateParsingException -> L44
            if (r1 == 0) goto L10
            int r2 = r1.size()     // Catch: java.security.cert.CertificateParsingException -> L44
            r3 = 2
            if (r2 >= r3) goto L26
            goto L10
        L26:
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.security.cert.CertificateParsingException -> L44
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch: java.security.cert.CertificateParsingException -> L44
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r3)     // Catch: java.security.cert.CertificateParsingException -> L44
            if (r2 == 0) goto L10
            r2 = 1
            java.lang.Object r1 = r1.get(r2)     // Catch: java.security.cert.CertificateParsingException -> L44
            if (r1 != 0) goto L3d
            goto L10
        L3d:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.security.cert.CertificateParsingException -> L44
            r0.add(r1)     // Catch: java.security.cert.CertificateParsingException -> L44
            goto L10
        L43:
            return r0
        L44:
            ᲀᛶᲇ r4 = defpackage.C1698.f7558
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static boolean m3192(java.lang.String r13) {
            int r0 = r13.length()
            int r1 = r13.length()
            r2 = 0
            if (r1 < 0) goto L6c
            int r3 = r13.length()
            if (r1 > r3) goto L60
            r3 = 0
            r5 = r2
        L14:
            if (r5 >= r1) goto L5a
            char r6 = r13.charAt(r5)
            r7 = 128(0x80, float:1.8E-43)
            r8 = 1
            if (r6 >= r7) goto L24
            long r3 = r3 + r8
        L21:
            int r5 = r5 + 1
            goto L14
        L24:
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 >= r7) goto L2c
            r6 = 2
        L2a:
            long r3 = r3 + r6
            goto L21
        L2c:
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r7) goto L57
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r6 <= r7) goto L37
            goto L57
        L37:
            int r10 = r5 + 1
            if (r10 >= r1) goto L40
            char r11 = r13.charAt(r10)
            goto L41
        L40:
            r11 = r2
        L41:
            r12 = 56319(0xdbff, float:7.892E-41)
            if (r6 > r12) goto L54
            r6 = 56320(0xdc00, float:7.8921E-41)
            if (r11 < r6) goto L54
            if (r11 <= r7) goto L4e
            goto L54
        L4e:
            r6 = 4
            long r3 = r3 + r6
            int r5 = r5 + 2
            goto L14
        L54:
            long r3 = r3 + r8
            r5 = r10
            goto L14
        L57:
            r6 = 3
            goto L2a
        L5a:
            int r13 = (int) r3
            if (r0 != r13) goto L5f
            r13 = 1
            return r13
        L5f:
            return r2
        L60:
            java.lang.String r0 = " > "
            int r13 = r13.length()
            java.lang.String r3 = "endIndex > string.length: "
            defpackage.C2264.m3669(r3, r1, r0, r13)
            return r2
        L6c:
            java.lang.String r13 = "endIndex < beginIndex: "
            java.lang.String r0 = " < 0"
            defpackage.C0086.m546(r13, r1, r0)
            return r2
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String r2, javax.net.ssl.SSLSession r3) {
            r1 = this;
            boolean r1 = m3192(r2)
            r0 = 0
            if (r1 != 0) goto L8
            goto L15
        L8:
            java.security.cert.Certificate[] r1 = r3.getPeerCertificates()     // Catch: javax.net.ssl.SSLException -> L15
            r1 = r1[r0]     // Catch: javax.net.ssl.SSLException -> L15
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1     // Catch: javax.net.ssl.SSLException -> L15
            boolean r1 = m3190(r2, r1)     // Catch: javax.net.ssl.SSLException -> L15
            return r1
        L15:
            return r0
    }
}
