package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class r41 implements javax.net.ssl.HostnameVerifier {

    /* JADX INFO: renamed from: α */
    public static final p000.r41 f9259 = null;

    static {
            r41 r0 = new r41
            r0.<init>()
            p000.r41.f9259 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.List m5063(java.security.cert.X509Certificate r4, int r5) {
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
            boolean r2 = p000.ln0.m3626(r2, r3)     // Catch: java.security.cert.CertificateParsingException -> L44
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
            jz r4 = p000.C0450jz.f5672
            return r4
    }

    /* JADX INFO: renamed from: β */
    public static boolean m5064(java.lang.String r13) {
            int r0 = r13.length()
            int r1 = r13.length()
            if (r1 < 0) goto L7c
            int r2 = r13.length()
            if (r1 > r2) goto L5f
            r2 = 0
            r3 = 0
            r5 = r2
        L14:
            if (r5 >= r1) goto L59
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
        L29:
            long r6 = (long) r6
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
            long r6 = (long) r6
            long r3 = r3 + r6
            int r5 = r5 + 2
            goto L14
        L54:
            long r3 = r3 + r8
            r5 = r10
            goto L14
        L57:
            r6 = 3
            goto L29
        L59:
            int r13 = (int) r3
            if (r0 != r13) goto L5e
            r13 = 1
            return r13
        L5e:
            return r2
        L5f:
            java.lang.String r0 = "endIndex > string.length: "
            java.lang.String r2 = " > "
            java.lang.StringBuilder r0 = p000.a12.m19(r1, r0, r2)
            int r13 = r13.length()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L7c:
            java.lang.String r13 = "endIndex < beginIndex: "
            java.lang.String r0 = " < 0"
            java.lang.String r13 = p000.AbstractC0602nx.m4127(r13, r1, r0)
            p000.C1080.m7266(r13)
            r13 = 0
            return r13
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m5065(java.lang.String r9, java.security.cert.X509Certificate r10) {
            r9.getClass()
            ym1 r0 = p000.qd2.f8976
            boolean r0 = r0.m6942(r9)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3a
            java.lang.String r9 = p000.qd2.m4868(r9)
            r0 = 7
            java.util.List r10 = m5063(r10, r0)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L1e
            goto L10c
        L1e:
            java.util.Iterator r10 = r10.iterator()
        L22:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L10c
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = p000.qd2.m4868(r0)
            boolean r0 = p000.ln0.m3626(r9, r0)
            if (r0 == 0) goto L22
            goto L10b
        L3a:
            boolean r0 = m5064(r9)
            if (r0 == 0) goto L46
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r9 = p000.AbstractC0602nx.m4134(r0, r9, r0)
        L46:
            r0 = 2
            java.util.List r10 = m5063(r10, r0)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L53
            goto L10c
        L53:
            java.util.Iterator r10 = r10.iterator()
        L57:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L10c
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            int r3 = r9.length()
            if (r3 != 0) goto L6b
            goto Lde
        L6b:
            java.lang.String r3 = "."
            boolean r4 = p000.x02.m6485(r9, r3, r2)
            if (r4 != 0) goto Lde
            java.lang.String r4 = ".."
            boolean r5 = p000.x02.m6479(r9, r4, r2)
            if (r5 == 0) goto L7c
            goto Lde
        L7c:
            if (r0 == 0) goto Lde
            int r5 = r0.length()
            if (r5 != 0) goto L85
            goto Lde
        L85:
            boolean r5 = p000.x02.m6485(r0, r3, r2)
            if (r5 != 0) goto Lde
            boolean r4 = p000.x02.m6479(r0, r4, r2)
            if (r4 == 0) goto L92
            goto Lde
        L92:
            boolean r4 = p000.x02.m6479(r9, r3, r2)
            if (r4 != 0) goto L9d
            java.lang.String r4 = r9.concat(r3)
            goto L9e
        L9d:
            r4 = r9
        L9e:
            boolean r5 = p000.x02.m6479(r0, r3, r2)
            if (r5 != 0) goto La8
            java.lang.String r0 = r0.concat(r3)
        La8:
            boolean r3 = m5064(r0)
            if (r3 == 0) goto Lb4
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = p000.AbstractC0602nx.m4134(r3, r0, r3)
        Lb4:
            java.lang.String r3 = "*"
            boolean r3 = p000.q02.m4654(r0, r3, r2)
            if (r3 != 0) goto Lc1
            boolean r0 = r4.equals(r0)
            goto L109
        Lc1:
            java.lang.String r3 = "*."
            boolean r5 = p000.x02.m6485(r0, r3, r2)
            if (r5 == 0) goto Lde
            r5 = 42
            r6 = 4
            int r5 = p000.q02.m4668(r0, r5, r1, r6)
            r7 = -1
            if (r5 == r7) goto Ld4
            goto Lde
        Ld4:
            int r5 = r4.length()
            int r8 = r0.length()
            if (r5 >= r8) goto Le0
        Lde:
            r0 = r2
            goto L109
        Le0:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto Le7
            goto Lde
        Le7:
            java.lang.String r0 = r0.substring(r1)
            boolean r3 = p000.x02.m6479(r4, r0, r2)
            if (r3 != 0) goto Lf2
            goto Lde
        Lf2:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto L108
            int r3 = r3 + (-1)
            r0 = 46
            int r0 = p000.q02.m4674(r4, r0, r3, r6)
            if (r0 == r7) goto L108
            goto Lde
        L108:
            r0 = r1
        L109:
            if (r0 == 0) goto L57
        L10b:
            return r1
        L10c:
            return r2
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String r2, javax.net.ssl.SSLSession r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            boolean r1 = m5064(r2)
            r0 = 0
            if (r1 != 0) goto Le
            goto L1e
        Le:
            java.security.cert.Certificate[] r1 = r3.getPeerCertificates()     // Catch: javax.net.ssl.SSLException -> L1e
            r1 = r1[r0]     // Catch: javax.net.ssl.SSLException -> L1e
            r1.getClass()     // Catch: javax.net.ssl.SSLException -> L1e
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1     // Catch: javax.net.ssl.SSLException -> L1e
            boolean r1 = m5065(r2, r1)     // Catch: javax.net.ssl.SSLException -> L1e
            return r1
        L1e:
            return r0
    }
}
