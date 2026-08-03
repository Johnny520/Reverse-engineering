package okhttp3.internal.tls;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class OkHostnameVerifier implements javax.net.ssl.HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final okhttp3.internal.tls.OkHostnameVerifier INSTANCE = null;

    static {
            okhttp3.internal.tls.OkHostnameVerifier r0 = new okhttp3.internal.tls.OkHostnameVerifier
            r0.<init>()
            okhttp3.internal.tls.OkHostnameVerifier.INSTANCE = r0
            return
    }

    private OkHostnameVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.String asciiToLowercase(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.isAscii(r2)
            if (r0 == 0) goto Lc
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = j8.b.l(r0, r2, r0)
        Lc:
            return r2
    }

    private final java.util.List<java.lang.String> getSubjectAltNames(java.security.cert.X509Certificate r6, int r7) {
            r5 = this;
            tf.t r0 = tf.t.f13167g
            java.util.Collection r6 = r6.getSubjectAlternativeNames()     // Catch: java.security.cert.CertificateParsingException -> L46
            if (r6 != 0) goto L9
            return r0
        L9:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.security.cert.CertificateParsingException -> L46
            r1.<init>()     // Catch: java.security.cert.CertificateParsingException -> L46
            java.util.Iterator r6 = r6.iterator()     // Catch: java.security.cert.CertificateParsingException -> L46
        L12:
            boolean r2 = r6.hasNext()     // Catch: java.security.cert.CertificateParsingException -> L46
            if (r2 == 0) goto L45
            java.lang.Object r2 = r6.next()     // Catch: java.security.cert.CertificateParsingException -> L46
            java.util.List r2 = (java.util.List) r2     // Catch: java.security.cert.CertificateParsingException -> L46
            if (r2 == 0) goto L12
            int r3 = r2.size()     // Catch: java.security.cert.CertificateParsingException -> L46
            r4 = 2
            if (r3 >= r4) goto L28
            goto L12
        L28:
            r3 = 0
            java.lang.Object r3 = r2.get(r3)     // Catch: java.security.cert.CertificateParsingException -> L46
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.security.cert.CertificateParsingException -> L46
            boolean r3 = gg.l.a(r3, r4)     // Catch: java.security.cert.CertificateParsingException -> L46
            if (r3 == 0) goto L12
            r3 = 1
            java.lang.Object r2 = r2.get(r3)     // Catch: java.security.cert.CertificateParsingException -> L46
            if (r2 != 0) goto L3f
            goto L12
        L3f:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.security.cert.CertificateParsingException -> L46
            r1.add(r2)     // Catch: java.security.cert.CertificateParsingException -> L46
            goto L12
        L45:
            return r1
        L46:
            return r0
    }

    private final boolean isAscii(java.lang.String r5) {
            r4 = this;
            int r0 = r5.length()
            r1 = 3
            r2 = 0
            r3 = 0
            long r1 = okio.Utf8.size$default(r5, r3, r3, r1, r2)
            int r5 = (int) r1
            if (r0 != r5) goto L10
            r5 = 1
            return r5
        L10:
            return r3
    }

    private final boolean verifyHostname(java.lang.String r8, java.lang.String r9) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto La1
            int r1 = r8.length()
            if (r1 != 0) goto Lb
            goto La1
        Lb:
            java.lang.String r1 = "."
            boolean r2 = og.t.d0(r8, r1, r0)
            if (r2 != 0) goto La1
            java.lang.String r2 = ".."
            boolean r3 = og.t.W(r8, r2, r0)
            if (r3 == 0) goto L1d
            goto La1
        L1d:
            if (r9 == 0) goto La1
            int r3 = r9.length()
            if (r3 != 0) goto L27
            goto La1
        L27:
            boolean r3 = og.t.d0(r9, r1, r0)
            if (r3 != 0) goto La1
            boolean r2 = og.t.W(r9, r2, r0)
            if (r2 == 0) goto L35
            goto La1
        L35:
            boolean r2 = og.t.W(r8, r1, r0)
            if (r2 != 0) goto L3f
            java.lang.String r8 = r8.concat(r1)
        L3f:
            boolean r2 = og.t.W(r9, r1, r0)
            if (r2 != 0) goto L49
            java.lang.String r9 = r9.concat(r1)
        L49:
            java.lang.String r9 = r7.asciiToLowercase(r9)
            java.lang.String r1 = "*"
            boolean r1 = og.m.h0(r9, r1, r0)
            if (r1 != 0) goto L5a
            boolean r8 = r8.equals(r9)
            return r8
        L5a:
            java.lang.String r1 = "*."
            boolean r2 = og.t.d0(r9, r1, r0)
            if (r2 == 0) goto La1
            r2 = 42
            r3 = 1
            r4 = 4
            int r2 = og.m.q0(r9, r2, r3, r4)
            r5 = -1
            if (r2 == r5) goto L6e
            goto La1
        L6e:
            int r2 = r8.length()
            int r6 = r9.length()
            if (r2 >= r6) goto L79
            goto La1
        L79:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L80
            goto La1
        L80:
            java.lang.String r9 = r9.substring(r3)
            boolean r1 = og.t.W(r8, r9, r0)
            if (r1 != 0) goto L8b
            goto La1
        L8b:
            int r1 = r8.length()
            int r9 = r9.length()
            int r1 = r1 - r9
            if (r1 <= 0) goto La0
            r9 = 46
            int r1 = r1 - r3
            int r8 = og.m.w0(r8, r9, r1, r4)
            if (r8 == r5) goto La0
            goto La1
        La0:
            return r3
        La1:
            return r0
    }

    private final boolean verifyHostname(java.lang.String r4, java.security.cert.X509Certificate r5) {
            r3 = this;
            java.lang.String r4 = r3.asciiToLowercase(r4)
            r0 = 2
            java.util.List r5 = r3.getSubjectAltNames(r5, r0)
            r0 = 0
            if (r5 == 0) goto L13
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L13
            return r0
        L13:
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            okhttp3.internal.tls.OkHostnameVerifier r2 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            boolean r1 = r2.verifyHostname(r4, r1)
            if (r1 == 0) goto L17
            r4 = 1
            return r4
        L2d:
            return r0
    }

    private final boolean verifyIpAddress(java.lang.String r3, java.security.cert.X509Certificate r4) {
            r2 = this;
            java.lang.String r3 = okhttp3.internal.HostnamesKt.toCanonicalHost(r3)
            r0 = 7
            java.util.List r4 = r2.getSubjectAltNames(r4, r0)
            r0 = 0
            if (r4 == 0) goto L13
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L13
            return r0
        L13:
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = okhttp3.internal.HostnamesKt.toCanonicalHost(r1)
            boolean r1 = gg.l.a(r3, r1)
            if (r1 == 0) goto L17
            r3 = 1
            return r3
        L2f:
            return r0
    }

    public final java.util.List<java.lang.String> allSubjectAltNames(java.security.cert.X509Certificate r3) {
            r2 = this;
            r3.getClass()
            r0 = 7
            java.util.List r0 = r2.getSubjectAltNames(r3, r0)
            r1 = 2
            java.util.List r3 = r2.getSubjectAltNames(r3, r1)
            java.util.ArrayList r3 = tf.m.F1(r0, r3)
            return r3
    }

    public final boolean verify(java.lang.String r2, java.security.cert.X509Certificate r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            boolean r0 = okhttp3.internal.Util.canParseAsIpAddress(r2)
            if (r0 == 0) goto L11
            boolean r2 = r1.verifyIpAddress(r2, r3)
            return r2
        L11:
            boolean r2 = r1.verifyHostname(r2, r3)
            return r2
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String r3, javax.net.ssl.SSLSession r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            boolean r0 = r2.isAscii(r3)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.security.cert.Certificate[] r4 = r4.getPeerCertificates()     // Catch: javax.net.ssl.SSLException -> L1d
            r4 = r4[r1]     // Catch: javax.net.ssl.SSLException -> L1d
            r4.getClass()     // Catch: javax.net.ssl.SSLException -> L1d
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4     // Catch: javax.net.ssl.SSLException -> L1d
            boolean r1 = r2.verify(r3, r4)     // Catch: javax.net.ssl.SSLException -> L1d
        L1d:
            return r1
    }
}
