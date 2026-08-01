package okhttp3;

/* JADX INFO: compiled from: CertificatePinner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0003!\"#B!\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0000¢\u0006\u0002\b\u0014J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, m115d2 = {"Lokhttp3/CertificatePinner;", "", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "getPins", "()Ljava/util/Set;", "check", "", "hostname", "", "cleanedPeerCertificatesFn", "Lkotlin/Function0;", "", "Ljava/security/cert/X509Certificate;", "check$okhttp", "peerCertificates", "", "Ljava/security/cert/Certificate;", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "equals", "", "other", "findMatchingPins", "hashCode", "", "withCertificateChainCleaner", "withCertificateChainCleaner$okhttp", "Builder", "Companion", "Pin", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class CertificatePinner {
    public static final okhttp3.CertificatePinner.Companion Companion = null;
    public static final okhttp3.CertificatePinner DEFAULT = null;
    private final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
    private final java.util.Set<okhttp3.CertificatePinner.Pin> pins;

    /* JADX INFO: compiled from: CertificatePinner.kt */
    @kotlin.Metadata(m114d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b\"\u00020\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m115d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Builder {
        private final java.util.List<okhttp3.CertificatePinner.Pin> pins;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                r1.pins = r0
                return
        }

        public final okhttp3.CertificatePinner.Builder add(java.lang.String r8, java.lang.String... r9) {
                r7 = this;
                java.lang.String r0 = "pattern"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "pins"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r0 = r7
                okhttp3.CertificatePinner$Builder r0 = (okhttp3.CertificatePinner.Builder) r0
                r1 = 0
                int r2 = r9.length
                r3 = 0
            L10:
                if (r3 >= r2) goto L21
                r4 = r9[r3]
                java.util.List<okhttp3.CertificatePinner$Pin> r5 = r0.pins
                okhttp3.CertificatePinner$Pin r6 = new okhttp3.CertificatePinner$Pin
                r6.<init>(r8, r4)
                r5.add(r6)
                int r3 = r3 + 1
                goto L10
            L21:
                r0 = r7
                okhttp3.CertificatePinner$Builder r0 = (okhttp3.CertificatePinner.Builder) r0
                return r0
        }

        public final okhttp3.CertificatePinner build() {
                r4 = this;
                okhttp3.CertificatePinner r0 = new okhttp3.CertificatePinner
                java.util.List<okhttp3.CertificatePinner$Pin> r1 = r4.pins
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Set r1 = kotlin.collections.CollectionsKt.toSet(r1)
                r2 = 0
                r3 = 2
                r0.<init>(r1, r2, r3, r2)
                return r0
        }

        public final java.util.List<okhttp3.CertificatePinner.Pin> getPins() {
                r1 = this;
                java.util.List<okhttp3.CertificatePinner$Pin> r0 = r1.pins
                return r0
        }
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    @kotlin.Metadata(m114d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0007J\f\u0010\f\u001a\u00020\n*\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m115d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "()V", "DEFAULT", "Lokhttp3/CertificatePinner;", "pin", "", "certificate", "Ljava/security/cert/Certificate;", "sha1Hash", "Lokio/ByteString;", "Ljava/security/cert/X509Certificate;", "sha256Hash", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String pin(java.security.cert.Certificate r3) {
                r2 = this;
                java.lang.String r0 = "certificate"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = r3 instanceof java.security.cert.X509Certificate
                if (r0 == 0) goto L28
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "sha256/"
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r3
                java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
                okio.ByteString r1 = r2.sha256Hash(r1)
                java.lang.String r1 = r1.base64()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L28:
                r0 = 0
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Certificate pinning requires X509 certificates"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString sha1Hash(java.security.cert.X509Certificate r8) {
                r7 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                okio.ByteString$Companion r1 = okio.ByteString.Companion
                java.security.PublicKey r0 = r8.getPublicKey()
                byte[] r2 = r0.getEncoded()
                java.lang.String r0 = "publicKey.encoded"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                r5 = 3
                r6 = 0
                r3 = 0
                r4 = 0
                okio.ByteString r0 = okio.ByteString.Companion.of$default(r1, r2, r3, r4, r5, r6)
                okio.ByteString r0 = r0.sha1()
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.ByteString sha256Hash(java.security.cert.X509Certificate r8) {
                r7 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                okio.ByteString$Companion r1 = okio.ByteString.Companion
                java.security.PublicKey r0 = r8.getPublicKey()
                byte[] r2 = r0.getEncoded()
                java.lang.String r0 = "publicKey.encoded"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                r5 = 3
                r6 = 0
                r3 = 0
                r4 = 0
                okio.ByteString r0 = okio.ByteString.Companion.of$default(r1, r2, r3, r4, r5, r6)
                okio.ByteString r0 = r0.sha256()
                return r0
        }
    }

    /* JADX INFO: compiled from: CertificatePinner.kt */
    @kotlin.Metadata(m114d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m115d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "pattern", "", "pin", "(Ljava/lang/String;Ljava/lang/String;)V", "hash", "Lokio/ByteString;", "getHash", "()Lokio/ByteString;", "hashAlgorithm", "getHashAlgorithm", "()Ljava/lang/String;", "getPattern", "equals", "", "other", "hashCode", "", "matchesCertificate", "certificate", "Ljava/security/cert/X509Certificate;", "matchesHostname", "hostname", "toString", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Pin {
        private final okio.ByteString hash;
        private final java.lang.String hashAlgorithm;
        private final java.lang.String pattern;

        public Pin(java.lang.String r12, java.lang.String r13) {
                r11 = this;
                java.lang.String r0 = "pattern"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String r0 = "pin"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                r11.<init>()
                java.lang.String r0 = "*."
                r1 = 0
                r2 = 2
                r3 = 0
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r12, r0, r1, r2, r3)
                r4 = -1
                if (r0 == 0) goto L29
                r5 = r12
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 1
                r8 = 0
                int r0 = kotlin.text.StringsKt.indexOf$default(r5, r6, r7, r8, r9, r10)
                if (r0 == r4) goto L4f
            L29:
                java.lang.String r0 = "**."
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r12, r0, r1, r2, r3)
                if (r0 == 0) goto L40
                r5 = r12
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r9 = 4
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 2
                r8 = 0
                int r0 = kotlin.text.StringsKt.indexOf$default(r5, r6, r7, r8, r9, r10)
                if (r0 == r4) goto L4f
            L40:
                r5 = r12
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r9 = 6
                r10 = 0
                java.lang.String r6 = "*"
                r7 = 0
                r8 = 0
                int r0 = kotlin.text.StringsKt.indexOf$default(r5, r6, r7, r8, r9, r10)
                if (r0 != r4) goto L51
            L4f:
                r0 = 1
                goto L52
            L51:
                r0 = r1
            L52:
                if (r0 == 0) goto L101
            L55:
                java.lang.String r0 = okhttp3.internal.HostnamesKt.toCanonicalHost(r12)
                if (r0 == 0) goto Le8
                r11.pattern = r0
                java.lang.String r0 = "sha1/"
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r13, r0, r1, r2, r3)
                java.lang.String r4 = "Invalid pin hash: "
                java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
                if (r0 == 0) goto L98
                java.lang.String r0 = "sha1"
                r11.hashAlgorithm = r0
                okio.ByteString$Companion r0 = okio.ByteString.Companion
                r1 = 5
                java.lang.String r1 = r13.substring(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
                okio.ByteString r0 = r0.decodeBase64(r1)
                if (r0 == 0) goto L81
                r11.hash = r0
                goto Lb6
            L81:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.StringBuilder r1 = r1.append(r13)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L98:
                java.lang.String r0 = "sha256/"
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r13, r0, r1, r2, r3)
                if (r0 == 0) goto Lcf
                java.lang.String r0 = "sha256"
                r11.hashAlgorithm = r0
                okio.ByteString$Companion r0 = okio.ByteString.Companion
                r1 = 7
                java.lang.String r1 = r13.substring(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
                okio.ByteString r0 = r0.decodeBase64(r1)
                if (r0 == 0) goto Lb8
                r11.hash = r0
            Lb6:
                return
            Lb8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.StringBuilder r1 = r1.append(r13)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            Lcf:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "pins must start with 'sha256/' or 'sha1/': "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r13)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            Le8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid pattern: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r12)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L101:
                r0 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected pattern: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r12)
                java.lang.String r0 = r1.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof okhttp3.CertificatePinner.Pin
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                java.lang.String r1 = r4.pattern
                r3 = r5
                okhttp3.CertificatePinner$Pin r3 = (okhttp3.CertificatePinner.Pin) r3
                java.lang.String r3 = r3.pattern
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L18
                return r2
            L18:
                java.lang.String r1 = r4.hashAlgorithm
                r3 = r5
                okhttp3.CertificatePinner$Pin r3 = (okhttp3.CertificatePinner.Pin) r3
                java.lang.String r3 = r3.hashAlgorithm
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L26
                return r2
            L26:
                okio.ByteString r1 = r4.hash
                r3 = r5
                okhttp3.CertificatePinner$Pin r3 = (okhttp3.CertificatePinner.Pin) r3
                okio.ByteString r3 = r3.hash
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L34
                return r2
            L34:
                return r0
        }

        public final okio.ByteString getHash() {
                r1 = this;
                okio.ByteString r0 = r1.hash
                return r0
        }

        public final java.lang.String getHashAlgorithm() {
                r1 = this;
                java.lang.String r0 = r1.hashAlgorithm
                return r0
        }

        public final java.lang.String getPattern() {
                r1 = this;
                java.lang.String r0 = r1.pattern
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.pattern
                int r0 = r0.hashCode()
                int r1 = r0 * 31
                java.lang.String r2 = r3.hashAlgorithm
                int r2 = r2.hashCode()
                int r1 = r1 + r2
                int r0 = r1 * 31
                okio.ByteString r2 = r3.hash
                int r2 = r2.hashCode()
                int r0 = r0 + r2
                return r0
        }

        public final boolean matchesCertificate(java.security.cert.X509Certificate r3) {
                r2 = this;
                java.lang.String r0 = "certificate"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = r2.hashAlgorithm
                java.lang.String r1 = "sha256"
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r1 == 0) goto L1c
                okio.ByteString r0 = r2.hash
                okhttp3.CertificatePinner$Companion r1 = okhttp3.CertificatePinner.Companion
                okio.ByteString r1 = r1.sha256Hash(r3)
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                goto L32
            L1c:
                java.lang.String r1 = "sha1"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L31
                okio.ByteString r0 = r2.hash
                okhttp3.CertificatePinner$Companion r1 = okhttp3.CertificatePinner.Companion
                okio.ByteString r1 = r1.sha1Hash(r3)
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                goto L32
            L31:
                r0 = 0
            L32:
                return r0
        }

        public final boolean matchesHostname(java.lang.String r13) {
                r12 = this;
                java.lang.String r0 = "hostname"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                java.lang.String r0 = r12.pattern
                java.lang.String r1 = "**."
                r2 = 0
                r3 = 2
                r4 = 0
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4)
                r1 = 1
                if (r0 == 0) goto L47
                java.lang.String r0 = r12.pattern
                int r0 = r0.length()
                int r0 = r0 + (-3)
                int r3 = r13.length()
                int r11 = r3 - r0
                int r3 = r13.length()
                int r4 = r3 - r0
                java.lang.String r5 = r12.pattern
                r9 = 16
                r10 = 0
                r6 = 3
                r8 = 0
                r3 = r13
                r7 = r0
                boolean r3 = kotlin.text.StringsKt.regionMatches$default(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r3 == 0) goto L45
                if (r11 == 0) goto L43
                int r3 = r11 + (-1)
                char r3 = r13.charAt(r3)
                r4 = 46
                if (r3 != r4) goto L45
            L43:
                r2 = r1
                goto L8e
            L45:
                goto L8e
            L47:
                java.lang.String r0 = r12.pattern
                java.lang.String r5 = "*."
                boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r5, r2, r3, r4)
                if (r0 == 0) goto L88
                java.lang.String r0 = r12.pattern
                int r0 = r0.length()
                int r0 = r0 - r1
                int r3 = r13.length()
                int r11 = r3 - r0
                int r3 = r13.length()
                int r4 = r3 - r0
                java.lang.String r5 = r12.pattern
                r9 = 16
                r10 = 0
                r6 = 1
                r8 = 0
                r3 = r13
                r7 = r0
                boolean r3 = kotlin.text.StringsKt.regionMatches$default(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r3 == 0) goto L86
                r4 = r13
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                int r6 = r11 + (-1)
                r8 = 4
                r9 = 0
                r5 = 46
                r7 = 0
                int r3 = kotlin.text.StringsKt.lastIndexOf$default(r4, r5, r6, r7, r8, r9)
                r4 = -1
                if (r3 != r4) goto L86
                r2 = r1
                goto L8e
            L86:
                goto L8e
            L88:
                java.lang.String r0 = r12.pattern
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r0)
            L8e:
                return r2
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.hashAlgorithm
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 47
                java.lang.StringBuilder r0 = r0.append(r1)
                okio.ByteString r1 = r2.hash
                java.lang.String r1 = r1.base64()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }


    static {
            okhttp3.CertificatePinner$Companion r0 = new okhttp3.CertificatePinner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.CertificatePinner.Companion = r0
            okhttp3.CertificatePinner$Builder r0 = new okhttp3.CertificatePinner$Builder
            r0.<init>()
            okhttp3.CertificatePinner r0 = r0.build()
            okhttp3.CertificatePinner.DEFAULT = r0
            return
    }

    public CertificatePinner(java.util.Set<okhttp3.CertificatePinner.Pin> r2, okhttp3.internal.tls.CertificateChainCleaner r3) {
            r1 = this;
            java.lang.String r0 = "pins"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.pins = r2
            r1.certificateChainCleaner = r3
            return
    }

    public /* synthetic */ CertificatePinner(java.util.Set r1, okhttp3.internal.tls.CertificateChainCleaner r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String pin(java.security.cert.Certificate r1) {
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion
            java.lang.String r0 = r0.pin(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString sha1Hash(java.security.cert.X509Certificate r1) {
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion
            okio.ByteString r0 = r0.sha1Hash(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.ByteString sha256Hash(java.security.cert.X509Certificate r1) {
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion
            okio.ByteString r0 = r0.sha256Hash(r1)
            return r0
    }

    public final void check(java.lang.String r2, java.util.List<? extends java.security.cert.Certificate> r3) throws javax.net.ssl.SSLPeerUnverifiedException {
            r1 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "peerCertificates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.CertificatePinner$check$1 r0 = new okhttp3.CertificatePinner$check$1
            r0.<init>(r1, r3, r2)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r1.check$okhttp(r2, r0)
            return
    }

    @kotlin.Deprecated(message = "replaced with {@link #check(String, List)}.", replaceWith = @kotlin.ReplaceWith(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(java.lang.String r2, java.security.cert.Certificate... r3) throws javax.net.ssl.SSLPeerUnverifiedException {
            r1 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "peerCertificates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.List r0 = kotlin.collections.ArraysKt.toList(r3)
            r1.check(r2, r0)
            return
    }

    public final void check$okhttp(java.lang.String r11, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.security.cert.X509Certificate>> r12) {
            r10 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "cleanedPeerCertificatesFn"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.List r0 = r10.findMatchingPins(r11)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L15
            return
        L15:
            java.lang.Object r1 = r12.invoke()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r2 = r1.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L94
            java.lang.Object r3 = r2.next()
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            r4 = 0
            r5 = 0
            java.util.Iterator r6 = r0.iterator()
        L31:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L1f
            java.lang.Object r7 = r6.next()
            okhttp3.CertificatePinner$Pin r7 = (okhttp3.CertificatePinner.Pin) r7
            java.lang.String r8 = r7.getHashAlgorithm()
            java.lang.String r9 = "sha256"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r9 == 0) goto L5c
            if (r5 != 0) goto L51
            okhttp3.CertificatePinner$Companion r8 = okhttp3.CertificatePinner.Companion
            okio.ByteString r5 = r8.sha256Hash(r3)
        L51:
            okio.ByteString r8 = r7.getHash()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r5)
            if (r8 == 0) goto L31
            return
        L5c:
            java.lang.String r9 = "sha1"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r8 == 0) goto L77
            if (r4 != 0) goto L6c
            okhttp3.CertificatePinner$Companion r8 = okhttp3.CertificatePinner.Companion
            okio.ByteString r4 = r8.sha1Hash(r3)
        L6c:
            okio.ByteString r8 = r7.getHash()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r4)
            if (r8 == 0) goto L31
            return
        L77:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "unsupported hashAlgorithm: "
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = r7.getHashAlgorithm()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            r2.<init>(r6)
            throw r2
        L94:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r2
            r4 = 0
            java.lang.String r5 = "Certificate pinning failure!"
            r3.append(r5)
            java.lang.String r5 = "\n  Peer certificate chain:"
            r3.append(r5)
            java.util.Iterator r5 = r1.iterator()
        La9:
            boolean r6 = r5.hasNext()
            java.lang.String r7 = "\n    "
            if (r6 == 0) goto Ld7
            java.lang.Object r6 = r5.next()
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            r3.append(r7)
            okhttp3.CertificatePinner$Companion r7 = okhttp3.CertificatePinner.Companion
            r8 = r6
            java.security.cert.Certificate r8 = (java.security.cert.Certificate) r8
            java.lang.String r7 = r7.pin(r8)
            r3.append(r7)
            java.lang.String r7 = ": "
            r3.append(r7)
            java.security.Principal r7 = r6.getSubjectDN()
            java.lang.String r7 = r7.getName()
            r3.append(r7)
            goto La9
        Ld7:
            java.lang.String r5 = "\n  Pinned certificates for "
            r3.append(r5)
            r3.append(r11)
            java.lang.String r5 = ":"
            r3.append(r5)
            java.util.Iterator r5 = r0.iterator()
        Le8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lfb
            java.lang.Object r6 = r5.next()
            okhttp3.CertificatePinner$Pin r6 = (okhttp3.CertificatePinner.Pin) r6
            r3.append(r7)
            r3.append(r6)
            goto Le8
        Lfb:
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException
            r3.<init>(r2)
            throw r3
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.CertificatePinner
            if (r0 == 0) goto L20
            r0 = r3
            okhttp3.CertificatePinner r0 = (okhttp3.CertificatePinner) r0
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r0.pins
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r2.pins
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L20
            r0 = r3
            okhttp3.CertificatePinner r0 = (okhttp3.CertificatePinner) r0
            okhttp3.internal.tls.CertificateChainCleaner r0 = r0.certificateChainCleaner
            okhttp3.internal.tls.CertificateChainCleaner r1 = r2.certificateChainCleaner
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    public final java.util.List<okhttp3.CertificatePinner.Pin> findMatchingPins(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r7.pins
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Iterator r3 = r0.iterator()
        L12:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r3.next()
            r5 = r4
            okhttp3.CertificatePinner$Pin r5 = (okhttp3.CertificatePinner.Pin) r5
            r6 = 0
            boolean r5 = r5.matchesHostname(r8)
            if (r5 == 0) goto L12
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L34
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2 = r5
            java.util.List r2 = (java.util.List) r2
        L34:
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r5)
            java.util.List r5 = kotlin.jvm.internal.TypeIntrinsics.asMutableList(r2)
            r5.add(r4)
            goto L12
        L41:
            return r2
    }

    public final okhttp3.internal.tls.CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            r1 = this;
            okhttp3.internal.tls.CertificateChainCleaner r0 = r1.certificateChainCleaner
            return r0
    }

    public final java.util.Set<okhttp3.CertificatePinner.Pin> getPins() {
            r1 = this;
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r1.pins
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 37
            int r1 = r0 * 41
            java.util.Set<okhttp3.CertificatePinner$Pin> r2 = r3.pins
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            int r0 = r1 * 41
            okhttp3.internal.tls.CertificateChainCleaner r2 = r3.certificateChainCleaner
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = 0
        L17:
            int r0 = r0 + r2
            return r0
    }

    public final okhttp3.CertificatePinner withCertificateChainCleaner$okhttp(okhttp3.internal.tls.CertificateChainCleaner r3) {
            r2 = this;
            java.lang.String r0 = "certificateChainCleaner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.tls.CertificateChainCleaner r0 = r2.certificateChainCleaner
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto Lf
            r0 = r2
            goto L16
        Lf:
            okhttp3.CertificatePinner r0 = new okhttp3.CertificatePinner
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r2.pins
            r0.<init>(r1, r3)
        L16:
            return r0
    }
}
