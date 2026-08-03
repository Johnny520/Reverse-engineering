package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectionSpec {
    private static final okhttp3.CipherSuite[] APPROVED_CIPHER_SUITES = null;
    public static final okhttp3.ConnectionSpec CLEARTEXT = null;
    public static final okhttp3.ConnectionSpec COMPATIBLE_TLS = null;
    public static final okhttp3.ConnectionSpec.Companion Companion = null;
    public static final okhttp3.ConnectionSpec MODERN_TLS = null;
    private static final okhttp3.CipherSuite[] RESTRICTED_CIPHER_SUITES = null;
    public static final okhttp3.ConnectionSpec RESTRICTED_TLS = null;
    private final java.lang.String[] cipherSuitesAsString;
    private final boolean isTls;
    private final boolean supportsTlsExtensions;
    private final java.lang.String[] tlsVersionsAsString;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private java.lang.String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private java.lang.String[] tlsVersions;

        public Builder(okhttp3.ConnectionSpec r2) {
                r1 = this;
                r2.getClass()
                r1.<init>()
                boolean r0 = r2.isTls()
                r1.tls = r0
                java.lang.String[] r0 = okhttp3.ConnectionSpec.access$getCipherSuitesAsString$p(r2)
                r1.cipherSuites = r0
                java.lang.String[] r0 = okhttp3.ConnectionSpec.access$getTlsVersionsAsString$p(r2)
                r1.tlsVersions = r0
                boolean r2 = r2.supportsTlsExtensions()
                r1.supportsTlsExtensions = r2
                return
        }

        public Builder(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.tls = r1
                return
        }

        public final okhttp3.ConnectionSpec.Builder allEnabledCipherSuites() {
                r1 = this;
                boolean r0 = r1.tls
                if (r0 == 0) goto L8
                r0 = 0
                r1.cipherSuites = r0
                return r1
            L8:
                java.lang.String r0 = "no cipher suites for cleartext connections"
                j8.o.t(r0)
                r0 = 0
                return r0
        }

        public final okhttp3.ConnectionSpec.Builder allEnabledTlsVersions() {
                r1 = this;
                boolean r0 = r1.tls
                if (r0 == 0) goto L8
                r0 = 0
                r1.tlsVersions = r0
                return r1
            L8:
                java.lang.String r0 = "no TLS versions for cleartext connections"
                j8.o.t(r0)
                r0 = 0
                return r0
        }

        public final okhttp3.ConnectionSpec build() {
                r5 = this;
                okhttp3.ConnectionSpec r0 = new okhttp3.ConnectionSpec
                boolean r1 = r5.tls
                boolean r2 = r5.supportsTlsExtensions
                java.lang.String[] r3 = r5.cipherSuites
                java.lang.String[] r4 = r5.tlsVersions
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public final okhttp3.ConnectionSpec.Builder cipherSuites(java.lang.String... r2) {
                r1 = this;
                r2.getClass()
                boolean r0 = r1.tls
                if (r0 == 0) goto L1f
                int r0 = r2.length
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                if (r0 != 0) goto L18
                java.lang.Object r2 = r2.clone()
                java.lang.String[] r2 = (java.lang.String[]) r2
                r1.cipherSuites = r2
                return r1
            L18:
                java.lang.String r2 = "At least one cipher suite is required"
                j8.o.t(r2)
            L1d:
                r2 = 0
                return r2
            L1f:
                java.lang.String r2 = "no cipher suites for cleartext connections"
                j8.o.t(r2)
                goto L1d
        }

        public final okhttp3.ConnectionSpec.Builder cipherSuites(okhttp3.CipherSuite... r6) {
                r5 = this;
                r6.getClass()
                boolean r0 = r5.tls
                if (r0 == 0) goto L32
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.length
                r0.<init>(r1)
                int r1 = r6.length
                r2 = 0
                r3 = r2
            L10:
                if (r3 >= r1) goto L1e
                r4 = r6[r3]
                java.lang.String r4 = r4.javaName()
                r0.add(r4)
                int r3 = r3 + 1
                goto L10
            L1e:
                java.lang.String[] r6 = new java.lang.String[r2]
                java.lang.Object[] r6 = r0.toArray(r6)
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r0 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                okhttp3.ConnectionSpec$Builder r6 = r5.cipherSuites(r6)
                return r6
            L32:
                java.lang.String r6 = "no cipher suites for cleartext connections"
                j8.o.t(r6)
                r6 = 0
                return r6
        }

        public final java.lang.String[] getCipherSuites$okhttp() {
                r1 = this;
                java.lang.String[] r0 = r1.cipherSuites
                return r0
        }

        public final boolean getSupportsTlsExtensions$okhttp() {
                r1 = this;
                boolean r0 = r1.supportsTlsExtensions
                return r0
        }

        public final boolean getTls$okhttp() {
                r1 = this;
                boolean r0 = r1.tls
                return r0
        }

        public final java.lang.String[] getTlsVersions$okhttp() {
                r1 = this;
                java.lang.String[] r0 = r1.tlsVersions
                return r0
        }

        public final void setCipherSuites$okhttp(java.lang.String[] r1) {
                r0 = this;
                r0.cipherSuites = r1
                return
        }

        public final void setSupportsTlsExtensions$okhttp(boolean r1) {
                r0 = this;
                r0.supportsTlsExtensions = r1
                return
        }

        public final void setTls$okhttp(boolean r1) {
                r0 = this;
                r0.tls = r1
                return
        }

        public final void setTlsVersions$okhttp(java.lang.String[] r1) {
                r0 = this;
                r0.tlsVersions = r1
                return
        }

        @sf.a
        public final okhttp3.ConnectionSpec.Builder supportsTlsExtensions(boolean r2) {
                r1 = this;
                boolean r0 = r1.tls
                if (r0 == 0) goto L7
                r1.supportsTlsExtensions = r2
                return r1
            L7:
                java.lang.String r2 = "no TLS extensions for cleartext connections"
                j8.o.t(r2)
                r2 = 0
                return r2
        }

        public final okhttp3.ConnectionSpec.Builder tlsVersions(java.lang.String... r2) {
                r1 = this;
                r2.getClass()
                boolean r0 = r1.tls
                if (r0 == 0) goto L1f
                int r0 = r2.length
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                if (r0 != 0) goto L18
                java.lang.Object r2 = r2.clone()
                java.lang.String[] r2 = (java.lang.String[]) r2
                r1.tlsVersions = r2
                return r1
            L18:
                java.lang.String r2 = "At least one TLS version is required"
                j8.o.t(r2)
            L1d:
                r2 = 0
                return r2
            L1f:
                java.lang.String r2 = "no TLS versions for cleartext connections"
                j8.o.t(r2)
                goto L1d
        }

        public final okhttp3.ConnectionSpec.Builder tlsVersions(okhttp3.TlsVersion... r6) {
                r5 = this;
                r6.getClass()
                boolean r0 = r5.tls
                if (r0 == 0) goto L32
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.length
                r0.<init>(r1)
                int r1 = r6.length
                r2 = 0
                r3 = r2
            L10:
                if (r3 >= r1) goto L1e
                r4 = r6[r3]
                java.lang.String r4 = r4.javaName()
                r0.add(r4)
                int r3 = r3 + 1
                goto L10
            L1e:
                java.lang.String[] r6 = new java.lang.String[r2]
                java.lang.Object[] r6 = r0.toArray(r6)
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r0 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
                java.lang.String[] r6 = (java.lang.String[]) r6
                okhttp3.ConnectionSpec$Builder r6 = r5.tlsVersions(r6)
                return r6
            L32:
                java.lang.String r6 = "no TLS versions for cleartext connections"
                j8.o.t(r6)
                r6 = 0
                return r6
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.ConnectionSpec$Companion r0 = new okhttp3.ConnectionSpec$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.ConnectionSpec.Companion = r0
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256
            okhttp3.CipherSuite r3 = okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384
            okhttp3.CipherSuite r4 = okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256
            okhttp3.CipherSuite r5 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256
            okhttp3.CipherSuite r6 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
            okhttp3.CipherSuite r7 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384
            okhttp3.CipherSuite r8 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384
            okhttp3.CipherSuite r9 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256
            okhttp3.CipherSuite r10 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
            okhttp3.CipherSuite[] r0 = new okhttp3.CipherSuite[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            okhttp3.ConnectionSpec.RESTRICTED_CIPHER_SUITES = r0
            okhttp3.CipherSuite r11 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA
            okhttp3.CipherSuite r12 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA
            okhttp3.CipherSuite r13 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256
            okhttp3.CipherSuite r14 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384
            okhttp3.CipherSuite r15 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA
            okhttp3.CipherSuite r16 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA
            okhttp3.CipherSuite r17 = okhttp3.CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA
            okhttp3.CipherSuite[] r1 = new okhttp3.CipherSuite[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
            okhttp3.ConnectionSpec.APPROVED_CIPHER_SUITES = r1
            okhttp3.ConnectionSpec$Builder r2 = new okhttp3.ConnectionSpec$Builder
            r3 = 1
            r2.<init>(r3)
            int r4 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            okhttp3.CipherSuite[] r0 = (okhttp3.CipherSuite[]) r0
            okhttp3.ConnectionSpec$Builder r0 = r2.cipherSuites(r0)
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_3
            okhttp3.TlsVersion r4 = okhttp3.TlsVersion.TLS_1_2
            okhttp3.TlsVersion[] r5 = new okhttp3.TlsVersion[]{r2, r4}
            okhttp3.ConnectionSpec$Builder r0 = r0.tlsVersions(r5)
            okhttp3.ConnectionSpec$Builder r0 = r0.supportsTlsExtensions(r3)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.RESTRICTED_TLS = r0
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r0.<init>(r3)
            int r5 = r1.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r1, r5)
            okhttp3.CipherSuite[] r5 = (okhttp3.CipherSuite[]) r5
            okhttp3.ConnectionSpec$Builder r0 = r0.cipherSuites(r5)
            okhttp3.TlsVersion[] r5 = new okhttp3.TlsVersion[]{r2, r4}
            okhttp3.ConnectionSpec$Builder r0 = r0.tlsVersions(r5)
            okhttp3.ConnectionSpec$Builder r0 = r0.supportsTlsExtensions(r3)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.MODERN_TLS = r0
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r0.<init>(r3)
            int r5 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r5)
            okhttp3.CipherSuite[] r1 = (okhttp3.CipherSuite[]) r1
            okhttp3.ConnectionSpec$Builder r0 = r0.cipherSuites(r1)
            okhttp3.TlsVersion r1 = okhttp3.TlsVersion.TLS_1_1
            okhttp3.TlsVersion r5 = okhttp3.TlsVersion.TLS_1_0
            okhttp3.TlsVersion[] r1 = new okhttp3.TlsVersion[]{r2, r4, r1, r5}
            okhttp3.ConnectionSpec$Builder r0 = r0.tlsVersions(r1)
            okhttp3.ConnectionSpec$Builder r0 = r0.supportsTlsExtensions(r3)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.COMPATIBLE_TLS = r0
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r1 = 0
            r0.<init>(r1)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.CLEARTEXT = r0
            return
    }

    public ConnectionSpec(boolean r1, boolean r2, java.lang.String[] r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.isTls = r1
            r0.supportsTlsExtensions = r2
            r0.cipherSuitesAsString = r3
            r0.tlsVersionsAsString = r4
            return
    }

    public static final /* synthetic */ java.lang.String[] access$getCipherSuitesAsString$p(okhttp3.ConnectionSpec r0) {
            java.lang.String[] r0 = r0.cipherSuitesAsString
            return r0
    }

    public static final /* synthetic */ java.lang.String[] access$getTlsVersionsAsString$p(okhttp3.ConnectionSpec r0) {
            java.lang.String[] r0 = r0.tlsVersionsAsString
            return r0
    }

    private final okhttp3.ConnectionSpec supportedSpec(javax.net.ssl.SSLSocket r5, boolean r6) {
            r4 = this;
            java.lang.String[] r0 = r4.cipherSuitesAsString
            if (r0 == 0) goto L18
            java.lang.String[] r0 = r5.getEnabledCipherSuites()
            r0.getClass()
            java.lang.String[] r1 = r4.cipherSuitesAsString
            okhttp3.CipherSuite$Companion r2 = okhttp3.CipherSuite.Companion
            java.util.Comparator r2 = r2.getORDER_BY_NAME$okhttp()
            java.lang.String[] r0 = okhttp3.internal.Util.intersect(r0, r1, r2)
            goto L1c
        L18:
            java.lang.String[] r0 = r5.getEnabledCipherSuites()
        L1c:
            java.lang.String[] r1 = r4.tlsVersionsAsString
            if (r1 == 0) goto L30
            java.lang.String[] r1 = r5.getEnabledProtocols()
            r1.getClass()
            java.lang.String[] r2 = r4.tlsVersionsAsString
            vf.a r3 = vf.a.f14314h
            java.lang.String[] r1 = okhttp3.internal.Util.intersect(r1, r2, r3)
            goto L34
        L30:
            java.lang.String[] r1 = r5.getEnabledProtocols()
        L34:
            java.lang.String[] r5 = r5.getSupportedCipherSuites()
            r5.getClass()
            okhttp3.CipherSuite$Companion r2 = okhttp3.CipherSuite.Companion
            java.util.Comparator r2 = r2.getORDER_BY_NAME$okhttp()
            java.lang.String r3 = "TLS_FALLBACK_SCSV"
            int r2 = okhttp3.internal.Util.indexOf(r5, r3, r2)
            if (r6 == 0) goto L58
            r6 = -1
            if (r2 == r6) goto L58
            r0.getClass()
            r5 = r5[r2]
            r5.getClass()
            java.lang.String[] r0 = okhttp3.internal.Util.concat(r0, r5)
        L58:
            okhttp3.ConnectionSpec$Builder r5 = new okhttp3.ConnectionSpec$Builder
            r5.<init>(r4)
            r0.getClass()
            int r6 = r0.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r0, r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            okhttp3.ConnectionSpec$Builder r5 = r5.cipherSuites(r6)
            r1.getClass()
            int r6 = r1.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r1, r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            okhttp3.ConnectionSpec$Builder r5 = r5.tlsVersions(r6)
            okhttp3.ConnectionSpec r5 = r5.build()
            return r5
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_cipherSuites, reason: not valid java name */
    public final java.util.List<okhttp3.CipherSuite> m44deprecated_cipherSuites() {
            r1 = this;
            java.util.List r0 = r1.cipherSuites()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name */
    public final boolean m45deprecated_supportsTlsExtensions() {
            r1 = this;
            boolean r0 = r1.supportsTlsExtensions
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_tlsVersions, reason: not valid java name */
    public final java.util.List<okhttp3.TlsVersion> m46deprecated_tlsVersions() {
            r1 = this;
            java.util.List r0 = r1.tlsVersions()
            return r0
    }

    public final void apply$okhttp(javax.net.ssl.SSLSocket r2, boolean r3) {
            r1 = this;
            r2.getClass()
            okhttp3.ConnectionSpec r3 = r1.supportedSpec(r2, r3)
            java.util.List r0 = r3.tlsVersions()
            if (r0 == 0) goto L12
            java.lang.String[] r0 = r3.tlsVersionsAsString
            r2.setEnabledProtocols(r0)
        L12:
            java.util.List r0 = r3.cipherSuites()
            if (r0 == 0) goto L1d
            java.lang.String[] r3 = r3.cipherSuitesAsString
            r2.setEnabledCipherSuites(r3)
        L1d:
            return
    }

    public final java.util.List<okhttp3.CipherSuite> cipherSuites() {
            r6 = this;
            java.lang.String[] r0 = r6.cipherSuitesAsString
            if (r0 == 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1c
            r4 = r0[r3]
            okhttp3.CipherSuite$Companion r5 = okhttp3.CipherSuite.Companion
            okhttp3.CipherSuite r4 = r5.forJavaName(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto Lc
        L1c:
            java.util.List r0 = tf.m.P1(r1)
            return r0
        L21:
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof okhttp3.ConnectionSpec
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r4) goto La
            return r0
        La:
            boolean r2 = r4.isTls
            okhttp3.ConnectionSpec r5 = (okhttp3.ConnectionSpec) r5
            boolean r3 = r5.isTls
            if (r2 == r3) goto L13
            return r1
        L13:
            if (r2 == 0) goto L32
            java.lang.String[] r2 = r4.cipherSuitesAsString
            java.lang.String[] r3 = r5.cipherSuitesAsString
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.String[] r2 = r4.tlsVersionsAsString
            java.lang.String[] r3 = r5.tlsVersionsAsString
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            boolean r2 = r4.supportsTlsExtensions
            boolean r5 = r5.supportsTlsExtensions
            if (r2 == r5) goto L32
            return r1
        L32:
            return r0
    }

    public int hashCode() {
            r3 = this;
            boolean r0 = r3.isTls
            if (r0 == 0) goto L25
            java.lang.String[] r0 = r3.cipherSuitesAsString
            r1 = 0
            if (r0 == 0) goto Le
            int r0 = java.util.Arrays.hashCode(r0)
            goto Lf
        Le:
            r0 = r1
        Lf:
            r2 = 527(0x20f, float:7.38E-43)
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String[] r0 = r3.tlsVersionsAsString
            if (r0 == 0) goto L1c
            int r1 = java.util.Arrays.hashCode(r0)
        L1c:
            int r2 = r2 + r1
            int r2 = r2 * 31
            boolean r0 = r3.supportsTlsExtensions
            r0 = r0 ^ 1
            int r2 = r2 + r0
            return r2
        L25:
            r0 = 17
            return r0
    }

    public final boolean isCompatible(javax.net.ssl.SSLSocket r5) {
            r4 = this;
            r5.getClass()
            boolean r0 = r4.isTls
            r1 = 0
            if (r0 != 0) goto L9
            return r1
        L9:
            java.lang.String[] r0 = r4.tlsVersionsAsString
            if (r0 == 0) goto L1a
            java.lang.String[] r2 = r5.getEnabledProtocols()
            vf.a r3 = vf.a.f14314h
            boolean r0 = okhttp3.internal.Util.hasIntersection(r0, r2, r3)
            if (r0 != 0) goto L1a
            return r1
        L1a:
            java.lang.String[] r0 = r4.cipherSuitesAsString
            if (r0 == 0) goto L2f
            java.lang.String[] r5 = r5.getEnabledCipherSuites()
            okhttp3.CipherSuite$Companion r2 = okhttp3.CipherSuite.Companion
            java.util.Comparator r2 = r2.getORDER_BY_NAME$okhttp()
            boolean r5 = okhttp3.internal.Util.hasIntersection(r0, r5, r2)
            if (r5 != 0) goto L2f
            return r1
        L2f:
            r5 = 1
            return r5
    }

    public final boolean isTls() {
            r1 = this;
            boolean r0 = r1.isTls
            return r0
    }

    public final boolean supportsTlsExtensions() {
            r1 = this;
            boolean r0 = r1.supportsTlsExtensions
            return r0
    }

    public final java.util.List<okhttp3.TlsVersion> tlsVersions() {
            r6 = this;
            java.lang.String[] r0 = r6.tlsVersionsAsString
            if (r0 == 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1c
            r4 = r0[r3]
            okhttp3.TlsVersion$Companion r5 = okhttp3.TlsVersion.Companion
            okhttp3.TlsVersion r4 = r5.forJavaName(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto Lc
        L1c:
            java.util.List r0 = tf.m.P1(r1)
            return r0
        L21:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.isTls
            if (r0 != 0) goto L7
            java.lang.String r0 = "ConnectionSpec()"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConnectionSpec(cipherSuites="
            r0.<init>(r1)
            java.util.List r1 = r3.cipherSuites()
            java.lang.String r2 = "[all enabled]"
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", tlsVersions="
            r0.append(r1)
            java.util.List r1 = r3.tlsVersions()
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", supportsTlsExtensions="
            r0.append(r1)
            boolean r1 = r3.supportsTlsExtensions
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
