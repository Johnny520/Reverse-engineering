package okhttp3.internal.tls;

/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002J\f\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m115d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", "verify", "", "host", "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "asciiToLowercase", "isAscii", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

    private final java.lang.String asciiToLowercase(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isAscii(r3)
            if (r0 == 0) goto L18
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "US"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = r3.toLowerCase(r0)
            java.lang.String r1 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L19
        L18:
            r0 = r3
        L19:
            return r0
    }

    private final java.util.List<java.lang.String> getSubjectAltNames(java.security.cert.X509Certificate r7, int r8) {
            r6 = this;
            java.util.Collection r0 = r7.getSubjectAlternativeNames()     // Catch: java.security.cert.CertificateParsingException -> L4c
            if (r0 != 0) goto Lc
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.security.cert.CertificateParsingException -> L4c
            return r0
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.security.cert.CertificateParsingException -> L4c
            r1.<init>()     // Catch: java.security.cert.CertificateParsingException -> L4c
            java.util.List r1 = (java.util.List) r1     // Catch: java.security.cert.CertificateParsingException -> L4c
            java.util.Iterator r2 = r0.iterator()     // Catch: java.security.cert.CertificateParsingException -> L4c
        L17:
            boolean r3 = r2.hasNext()     // Catch: java.security.cert.CertificateParsingException -> L4c
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r2.next()     // Catch: java.security.cert.CertificateParsingException -> L4c
            java.util.List r3 = (java.util.List) r3     // Catch: java.security.cert.CertificateParsingException -> L4c
            if (r3 == 0) goto L17
            int r4 = r3.size()     // Catch: java.security.cert.CertificateParsingException -> L4c
            r5 = 2
            if (r4 >= r5) goto L2d
            goto L17
        L2d:
            r4 = 0
            java.lang.Object r4 = r3.get(r4)     // Catch: java.security.cert.CertificateParsingException -> L4c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch: java.security.cert.CertificateParsingException -> L4c
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)     // Catch: java.security.cert.CertificateParsingException -> L4c
            if (r4 == 0) goto L17
            r4 = 1
            java.lang.Object r4 = r3.get(r4)     // Catch: java.security.cert.CertificateParsingException -> L4c
            if (r4 != 0) goto L44
            goto L17
        L44:
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.security.cert.CertificateParsingException -> L4c
            r1.add(r5)     // Catch: java.security.cert.CertificateParsingException -> L4c
            goto L17
        L4b:
            return r1
        L4c:
            r0 = move-exception
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            return r1
    }

    private final boolean isAscii(java.lang.String r5) {
            r4 = this;
            int r0 = r5.length()
            r1 = 3
            r2 = 0
            r3 = 0
            long r1 = okio.Utf8.size$default(r5, r3, r3, r1, r2)
            int r1 = (int) r1
            if (r0 != r1) goto Lf
            r3 = 1
        Lf:
            return r3
    }

    private final boolean verifyHostname(java.lang.String r17, java.lang.String r18) {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L14
            int r2 = r2.length()
            if (r2 != 0) goto L12
            goto L14
        L12:
            r2 = r4
            goto L15
        L14:
            r2 = r3
        L15:
            if (r2 != 0) goto Lf8
            java.lang.String r2 = "."
            r5 = 2
            r6 = 0
            boolean r7 = kotlin.text.StringsKt.startsWith$default(r0, r2, r4, r5, r6)
            if (r7 != 0) goto Lf5
            java.lang.String r7 = ".."
            boolean r8 = kotlin.text.StringsKt.endsWith$default(r0, r7, r4, r5, r6)
            if (r8 == 0) goto L2d
            r2 = r16
            goto Lfa
        L2d:
            r8 = r1
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L3b
            int r8 = r8.length()
            if (r8 != 0) goto L39
            goto L3b
        L39:
            r8 = r4
            goto L3c
        L3b:
            r8 = r3
        L3c:
            if (r8 != 0) goto Lf2
            boolean r8 = kotlin.text.StringsKt.startsWith$default(r1, r2, r4, r5, r6)
            if (r8 != 0) goto Lef
            boolean r7 = kotlin.text.StringsKt.endsWith$default(r1, r7, r4, r5, r6)
            if (r7 == 0) goto L4e
            r2 = r16
            goto Lf4
        L4e:
            boolean r7 = kotlin.text.StringsKt.endsWith$default(r0, r2, r4, r5, r6)
            r8 = 46
            if (r7 != 0) goto L67
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r0 = r7.toString()
        L67:
            boolean r2 = kotlin.text.StringsKt.endsWith$default(r1, r2, r4, r5, r6)
            if (r2 != 0) goto L7e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r1 = r2.toString()
        L7e:
            r2 = r16
            java.lang.String r1 = r2.asciiToLowercase(r1)
            r7 = r1
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r8 = "*"
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r7 = kotlin.text.StringsKt.contains$default(r7, r8, r4, r5, r6)
            if (r7 != 0) goto L96
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            return r3
        L96:
            java.lang.String r7 = "*."
            boolean r8 = kotlin.text.StringsKt.startsWith$default(r1, r7, r4, r5, r6)
            if (r8 == 0) goto Lee
            r9 = r1
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r13 = 4
            r14 = 0
            r10 = 42
            r11 = 1
            r12 = 0
            int r8 = kotlin.text.StringsKt.indexOf$default(r9, r10, r11, r12, r13, r14)
            r9 = -1
            if (r8 == r9) goto Laf
            goto Lee
        Laf:
            int r8 = r0.length()
            int r10 = r1.length()
            if (r8 >= r10) goto Lba
            return r4
        Lba:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r1)
            if (r7 == 0) goto Lc1
            return r4
        Lc1:
            java.lang.String r7 = r1.substring(r3)
            java.lang.String r8 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            boolean r5 = kotlin.text.StringsKt.endsWith$default(r0, r7, r4, r5, r6)
            if (r5 != 0) goto Ld1
            return r4
        Ld1:
            int r5 = r0.length()
            int r6 = r7.length()
            int r5 = r5 - r6
            if (r5 <= 0) goto Led
            r10 = r0
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            int r12 = r5 + (-1)
            r14 = 4
            r15 = 0
            r11 = 46
            r13 = 0
            int r6 = kotlin.text.StringsKt.lastIndexOf$default(r10, r11, r12, r13, r14, r15)
            if (r6 == r9) goto Led
            return r4
        Led:
            return r3
        Lee:
            return r4
        Lef:
            r2 = r16
            goto Lf4
        Lf2:
            r2 = r16
        Lf4:
            return r4
        Lf5:
            r2 = r16
            goto Lfa
        Lf8:
            r2 = r16
        Lfa:
            return r4
    }

    private final boolean verifyHostname(java.lang.String r10, java.security.cert.X509Certificate r11) {
            r9 = this;
            java.lang.String r0 = r9.asciiToLowercase(r10)
            r1 = 2
            java.util.List r1 = r9.getSubjectAltNames(r11, r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            boolean r3 = r1 instanceof java.util.Collection
            r4 = 0
            if (r3 == 0) goto L1b
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1b
            goto L38
        L1b:
            java.util.Iterator r3 = r1.iterator()
        L1f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L37
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            okhttp3.internal.tls.OkHostnameVerifier r8 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE
            boolean r6 = r8.verifyHostname(r0, r6)
            if (r6 == 0) goto L1f
            r4 = 1
            goto L38
        L37:
        L38:
            return r4
    }

    private final boolean verifyIpAddress(java.lang.String r10, java.security.cert.X509Certificate r11) {
            r9 = this;
            java.lang.String r0 = okhttp3.internal.HostnamesKt.toCanonicalHost(r10)
            r1 = 7
            java.util.List r1 = r9.getSubjectAltNames(r11, r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            boolean r3 = r1 instanceof java.util.Collection
            r4 = 0
            if (r3 == 0) goto L1b
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1b
            goto L3a
        L1b:
            java.util.Iterator r3 = r1.iterator()
        L1f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L39
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            java.lang.String r8 = okhttp3.internal.HostnamesKt.toCanonicalHost(r6)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            if (r6 == 0) goto L1f
            r4 = 1
            goto L3a
        L39:
        L3a:
            return r4
    }

    public final java.util.List<java.lang.String> allSubjectAltNames(java.security.cert.X509Certificate r5) {
            r4 = this;
            java.lang.String r0 = "certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 7
            java.util.List r0 = r4.getSubjectAltNames(r5, r0)
            r1 = 2
            java.util.List r1 = r4.getSubjectAltNames(r5, r1)
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r3)
            return r2
    }

    public final boolean verify(java.lang.String r2, java.security.cert.X509Certificate r3) {
            r1 = this;
            java.lang.String r0 = "host"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = okhttp3.internal.Util.canParseAsIpAddress(r2)
            if (r0 == 0) goto L16
            boolean r0 = r1.verifyIpAddress(r2, r3)
            goto L1a
        L16:
            boolean r0 = r1.verifyHostname(r2, r3)
        L1a:
            return r0
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(java.lang.String r4, javax.net.ssl.SSLSession r5) {
            r3 = this;
            java.lang.String r0 = "host"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "session"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r3.isAscii(r4)
            r1 = 0
            if (r0 != 0) goto L12
            goto L29
        L12:
            java.security.cert.Certificate[] r0 = r5.getPeerCertificates()     // Catch: javax.net.ssl.SSLException -> L26
            r0 = r0[r1]     // Catch: javax.net.ssl.SSLException -> L26
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)     // Catch: javax.net.ssl.SSLException -> L26
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch: javax.net.ssl.SSLException -> L26
            boolean r0 = r3.verify(r4, r0)     // Catch: javax.net.ssl.SSLException -> L26
            r1 = r0
            goto L28
        L26:
            r0 = move-exception
        L28:
        L29:
            return r1
    }
}
