package okhttp3;

/* JADX INFO: compiled from: ConnectionSpec.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0002\b\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0015J\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b J\u0015\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000bH\u0007¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u0007H\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\rR\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006%"}, m115d2 = {"Lokhttp3/ConnectionSpec;", "", "isTls", "", "supportsTlsExtensions", "cipherSuitesAsString", "", "", "tlsVersionsAsString", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "cipherSuites", "", "Lokhttp3/CipherSuite;", "()Ljava/util/List;", "[Ljava/lang/String;", "()Z", "tlsVersions", "Lokhttp3/TlsVersion;", "apply", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "isFallback", "apply$okhttp", "-deprecated_cipherSuites", "equals", "other", "hashCode", "", "isCompatible", "socket", "supportedSpec", "-deprecated_supportsTlsExtensions", "-deprecated_tlsVersions", "toString", "Builder", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

    /* JADX INFO: compiled from: ConnectionSpec.kt */
    @kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0019\u001a\u00020\u0000J\u0006\u0010\u001a\u001a\u00020\u0000J\u0006\u0010\u001b\u001a\u00020\u0006J\u001f\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0002\u0010\u001cJ\u001f\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\t\"\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0007J\u001f\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\t\"\u00020\u001f¢\u0006\u0002\u0010 R$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0004R$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006!"}, m115d2 = {"Lokhttp3/ConnectionSpec$Builder;", "", "tls", "", "(Z)V", "connectionSpec", "Lokhttp3/ConnectionSpec;", "(Lokhttp3/ConnectionSpec;)V", "cipherSuites", "", "", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "supportsTlsExtensions", "getSupportsTlsExtensions$okhttp", "()Z", "setSupportsTlsExtensions$okhttp", "getTls$okhttp", "setTls$okhttp", "tlsVersions", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "allEnabledCipherSuites", "allEnabledTlsVersions", "build", "([Ljava/lang/String;)Lokhttp3/ConnectionSpec$Builder;", "Lokhttp3/CipherSuite;", "([Lokhttp3/CipherSuite;)Lokhttp3/ConnectionSpec$Builder;", "Lokhttp3/TlsVersion;", "([Lokhttp3/TlsVersion;)Lokhttp3/ConnectionSpec$Builder;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Builder {
        private java.lang.String[] cipherSuites;
        private boolean supportsTlsExtensions;
        private boolean tls;
        private java.lang.String[] tlsVersions;

        public Builder(okhttp3.ConnectionSpec r2) {
                r1 = this;
                java.lang.String r0 = "connectionSpec"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                boolean r0 = r2.isTls()
                r1.tls = r0
                java.lang.String[] r0 = okhttp3.ConnectionSpec.access$getCipherSuitesAsString$p(r2)
                r1.cipherSuites = r0
                java.lang.String[] r0 = okhttp3.ConnectionSpec.access$getTlsVersionsAsString$p(r2)
                r1.tlsVersions = r0
                boolean r0 = r2.supportsTlsExtensions()
                r1.supportsTlsExtensions = r0
                return
        }

        public Builder(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.tls = r1
                return
        }

        public final okhttp3.ConnectionSpec.Builder allEnabledCipherSuites() {
                r4 = this;
                r0 = r4
                okhttp3.ConnectionSpec$Builder r0 = (okhttp3.ConnectionSpec.Builder) r0
                r1 = 0
                boolean r2 = r0.tls
                if (r2 == 0) goto L10
                r2 = 0
                r0.cipherSuites = r2
                r0 = r4
                okhttp3.ConnectionSpec$Builder r0 = (okhttp3.ConnectionSpec.Builder) r0
                return r0
            L10:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "no cipher suites for cleartext connections"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final okhttp3.ConnectionSpec.Builder allEnabledTlsVersions() {
                r4 = this;
                r0 = r4
                okhttp3.ConnectionSpec$Builder r0 = (okhttp3.ConnectionSpec.Builder) r0
                r1 = 0
                boolean r2 = r0.tls
                if (r2 == 0) goto L10
                r2 = 0
                r0.tlsVersions = r2
                r0 = r4
                okhttp3.ConnectionSpec$Builder r0 = (okhttp3.ConnectionSpec.Builder) r0
                return r0
            L10:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "no TLS versions for cleartext connections"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
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

        public final okhttp3.ConnectionSpec.Builder cipherSuites(java.lang.String... r5) {
                r4 = this;
                java.lang.String r0 = "cipherSuites"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r4
                okhttp3.ConnectionSpec$Builder r0 = (okhttp3.ConnectionSpec.Builder) r0
                r1 = 0
                boolean r2 = r0.tls
                if (r2 == 0) goto L30
                int r2 = r5.length
                if (r2 != 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                if (r2 != 0) goto L22
                java.lang.Object r2 = r5.clone()
                java.lang.String[] r2 = (java.lang.String[]) r2
                r0.cipherSuites = r2
                r0 = r4
                okhttp3.ConnectionSpec$Builder r0 = (okhttp3.ConnectionSpec.Builder) r0
                return r0
            L22:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "At least one cipher suite is required"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L30:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "no cipher suites for cleartext connections"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final okhttp3.ConnectionSpec.Builder cipherSuites(okhttp3.CipherSuite... r14) {
                r13 = this;
                java.lang.String r0 = "cipherSuites"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                r0 = r13
                okhttp3.ConnectionSpec$Builder r0 = (okhttp3.ConnectionSpec.Builder) r0
                r1 = 0
                boolean r2 = r0.tls
                if (r2 == 0) goto L49
                r2 = r14
                r3 = 0
                java.util.ArrayList r4 = new java.util.ArrayList
                int r5 = r2.length
                r4.<init>(r5)
                java.util.Collection r4 = (java.util.Collection) r4
                r5 = r2
                r6 = 0
                int r7 = r5.length
                r8 = 0
                r9 = r8
            L1c:
                if (r9 >= r7) goto L2c
                r10 = r5[r9]
                r11 = r10
                r12 = 0
                java.lang.String r11 = r11.javaName()
                r4.add(r11)
                int r9 = r9 + 1
                goto L1c
            L2c:
                java.util.List r4 = (java.util.List) r4
                java.util.Collection r4 = (java.util.Collection) r4
                r2 = r4
                r3 = 0
                java.lang.String[] r5 = new java.lang.String[r8]
                java.lang.Object[] r2 = r4.toArray(r5)
                java.lang.String[] r2 = (java.lang.String[]) r2
                int r3 = r2.length
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r2, r3)
                java.lang.String[] r3 = (java.lang.String[]) r3
                okhttp3.ConnectionSpec$Builder r3 = r0.cipherSuites(r3)
                return r3
            L49:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "no cipher suites for cleartext connections"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
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

        @kotlin.Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        public final okhttp3.ConnectionSpec.Builder supportsTlsExtensions(boolean r5) {
                r4 = this;
                r0 = r4
                okhttp3.ConnectionSpec$Builder r0 = (okhttp3.ConnectionSpec.Builder) r0
                r1 = 0
                boolean r2 = r0.tls
                if (r2 == 0) goto Lf
                r0.supportsTlsExtensions = r5
                r0 = r4
                okhttp3.ConnectionSpec$Builder r0 = (okhttp3.ConnectionSpec.Builder) r0
                return r0
            Lf:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "no TLS extensions for cleartext connections"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final okhttp3.ConnectionSpec.Builder tlsVersions(java.lang.String... r5) {
                r4 = this;
                java.lang.String r0 = "tlsVersions"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r0 = r4
                okhttp3.ConnectionSpec$Builder r0 = (okhttp3.ConnectionSpec.Builder) r0
                r1 = 0
                boolean r2 = r0.tls
                if (r2 == 0) goto L30
                int r2 = r5.length
                if (r2 != 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                if (r2 != 0) goto L22
                java.lang.Object r2 = r5.clone()
                java.lang.String[] r2 = (java.lang.String[]) r2
                r0.tlsVersions = r2
                r0 = r4
                okhttp3.ConnectionSpec$Builder r0 = (okhttp3.ConnectionSpec.Builder) r0
                return r0
            L22:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "At least one TLS version is required"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L30:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "no TLS versions for cleartext connections"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final okhttp3.ConnectionSpec.Builder tlsVersions(okhttp3.TlsVersion... r14) {
                r13 = this;
                java.lang.String r0 = "tlsVersions"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                r0 = r13
                okhttp3.ConnectionSpec$Builder r0 = (okhttp3.ConnectionSpec.Builder) r0
                r1 = 0
                boolean r2 = r0.tls
                if (r2 == 0) goto L49
                r2 = r14
                r3 = 0
                java.util.ArrayList r4 = new java.util.ArrayList
                int r5 = r2.length
                r4.<init>(r5)
                java.util.Collection r4 = (java.util.Collection) r4
                r5 = r2
                r6 = 0
                int r7 = r5.length
                r8 = 0
                r9 = r8
            L1c:
                if (r9 >= r7) goto L2c
                r10 = r5[r9]
                r11 = r10
                r12 = 0
                java.lang.String r11 = r11.javaName()
                r4.add(r11)
                int r9 = r9 + 1
                goto L1c
            L2c:
                java.util.List r4 = (java.util.List) r4
                java.util.Collection r4 = (java.util.Collection) r4
                r2 = r4
                r3 = 0
                java.lang.String[] r5 = new java.lang.String[r8]
                java.lang.Object[] r2 = r4.toArray(r5)
                java.lang.String[] r2 = (java.lang.String[]) r2
                int r3 = r2.length
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r2, r3)
                java.lang.String[] r3 = (java.lang.String[]) r3
                okhttp3.ConnectionSpec$Builder r3 = r0.tlsVersions(r3)
                return r3
            L49:
                r2 = 0
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "no TLS versions for cleartext connections"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }
    }

    /* JADX INFO: compiled from: ConnectionSpec.kt */
    @kotlin.Metadata(m114d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m115d2 = {"Lokhttp3/ConnectionSpec$Companion;", "", "()V", "APPROVED_CIPHER_SUITES", "", "Lokhttp3/CipherSuite;", "[Lokhttp3/CipherSuite;", "CLEARTEXT", "Lokhttp3/ConnectionSpec;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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
    }

    static {
            okhttp3.ConnectionSpec$Companion r0 = new okhttp3.ConnectionSpec$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.ConnectionSpec.Companion = r0
            r0 = 9
            okhttp3.CipherSuite[] r1 = new okhttp3.CipherSuite[r0]
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256
            r3 = 0
            r1[r3] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384
            r4 = 1
            r1[r4] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256
            r5 = 2
            r1[r5] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256
            r6 = 3
            r1[r6] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
            r7 = 4
            r1[r7] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384
            r8 = 5
            r1[r8] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384
            r9 = 6
            r1[r9] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256
            r10 = 7
            r1[r10] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
            r11 = 8
            r1[r11] = r2
            okhttp3.ConnectionSpec.RESTRICTED_CIPHER_SUITES = r1
            r1 = 16
            okhttp3.CipherSuite[] r1 = new okhttp3.CipherSuite[r1]
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_AES_128_GCM_SHA256
            r1[r3] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_AES_256_GCM_SHA384
            r1[r4] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_CHACHA20_POLY1305_SHA256
            r1[r5] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256
            r1[r6] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
            r1[r7] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384
            r1[r8] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384
            r1[r9] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256
            r1[r10] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
            r1[r11] = r2
            okhttp3.CipherSuite r2 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA
            r1[r0] = r2
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA
            r2 = 10
            r1[r2] = r0
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256
            r2 = 11
            r1[r2] = r0
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384
            r2 = 12
            r1[r2] = r0
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA
            r2 = 13
            r1[r2] = r0
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA
            r2 = 14
            r1[r2] = r0
            okhttp3.CipherSuite r0 = okhttp3.CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA
            r2 = 15
            r1[r2] = r0
            okhttp3.ConnectionSpec.APPROVED_CIPHER_SUITES = r1
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r0.<init>(r4)
            okhttp3.CipherSuite[] r1 = okhttp3.ConnectionSpec.RESTRICTED_CIPHER_SUITES
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            okhttp3.CipherSuite[] r1 = (okhttp3.CipherSuite[]) r1
            okhttp3.ConnectionSpec$Builder r0 = r0.cipherSuites(r1)
            okhttp3.TlsVersion[] r1 = new okhttp3.TlsVersion[r5]
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_3
            r1[r3] = r2
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_2
            r1[r4] = r2
            okhttp3.ConnectionSpec$Builder r0 = r0.tlsVersions(r1)
            okhttp3.ConnectionSpec$Builder r0 = r0.supportsTlsExtensions(r4)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.RESTRICTED_TLS = r0
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r0.<init>(r4)
            okhttp3.CipherSuite[] r1 = okhttp3.ConnectionSpec.APPROVED_CIPHER_SUITES
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            okhttp3.CipherSuite[] r1 = (okhttp3.CipherSuite[]) r1
            okhttp3.ConnectionSpec$Builder r0 = r0.cipherSuites(r1)
            okhttp3.TlsVersion[] r1 = new okhttp3.TlsVersion[r5]
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_3
            r1[r3] = r2
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_2
            r1[r4] = r2
            okhttp3.ConnectionSpec$Builder r0 = r0.tlsVersions(r1)
            okhttp3.ConnectionSpec$Builder r0 = r0.supportsTlsExtensions(r4)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.MODERN_TLS = r0
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r0.<init>(r4)
            okhttp3.CipherSuite[] r1 = okhttp3.ConnectionSpec.APPROVED_CIPHER_SUITES
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            okhttp3.CipherSuite[] r1 = (okhttp3.CipherSuite[]) r1
            okhttp3.ConnectionSpec$Builder r0 = r0.cipherSuites(r1)
            okhttp3.TlsVersion[] r1 = new okhttp3.TlsVersion[r7]
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_3
            r1[r3] = r2
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_2
            r1[r4] = r2
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_1
            r1[r5] = r2
            okhttp3.TlsVersion r2 = okhttp3.TlsVersion.TLS_1_0
            r1[r6] = r2
            okhttp3.ConnectionSpec$Builder r0 = r0.tlsVersions(r1)
            okhttp3.ConnectionSpec$Builder r0 = r0.supportsTlsExtensions(r4)
            okhttp3.ConnectionSpec r0 = r0.build()
            okhttp3.ConnectionSpec.COMPATIBLE_TLS = r0
            okhttp3.ConnectionSpec$Builder r0 = new okhttp3.ConnectionSpec$Builder
            r0.<init>(r3)
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

    public static final /* synthetic */ java.lang.String[] access$getCipherSuitesAsString$p(okhttp3.ConnectionSpec r1) {
            java.lang.String[] r0 = r1.cipherSuitesAsString
            return r0
    }

    public static final /* synthetic */ java.lang.String[] access$getTlsVersionsAsString$p(okhttp3.ConnectionSpec r1) {
            java.lang.String[] r0 = r1.tlsVersionsAsString
            return r0
    }

    private final okhttp3.ConnectionSpec supportedSpec(javax.net.ssl.SSLSocket r8, boolean r9) {
            r7 = this;
            java.lang.String[] r0 = r7.cipherSuitesAsString
            if (r0 == 0) goto L1a
            java.lang.String[] r0 = r8.getEnabledCipherSuites()
            java.lang.String r1 = "sslSocket.enabledCipherSuites"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String[] r1 = r7.cipherSuitesAsString
            okhttp3.CipherSuite$Companion r2 = okhttp3.CipherSuite.Companion
            java.util.Comparator r2 = r2.getORDER_BY_NAME$okhttp()
            java.lang.String[] r0 = okhttp3.internal.Util.intersect(r0, r1, r2)
            goto L1e
        L1a:
            java.lang.String[] r0 = r8.getEnabledCipherSuites()
        L1e:
            java.lang.String[] r1 = r7.tlsVersionsAsString
            if (r1 == 0) goto L37
            java.lang.String[] r1 = r8.getEnabledProtocols()
            java.lang.String r2 = "sslSocket.enabledProtocols"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String[] r2 = r7.tlsVersionsAsString
            java.util.Comparator r3 = kotlin.comparisons.ComparisonsKt.naturalOrder()
            java.lang.String[] r1 = okhttp3.internal.Util.intersect(r1, r2, r3)
            goto L3b
        L37:
            java.lang.String[] r1 = r8.getEnabledProtocols()
        L3b:
            java.lang.String[] r2 = r8.getSupportedCipherSuites()
            java.lang.String r3 = "supportedCipherSuites"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            okhttp3.CipherSuite$Companion r3 = okhttp3.CipherSuite.Companion
            java.util.Comparator r3 = r3.getORDER_BY_NAME$okhttp()
            java.lang.String r4 = "TLS_FALLBACK_SCSV"
            int r3 = okhttp3.internal.Util.indexOf(r2, r4, r3)
            java.lang.String r4 = "cipherSuitesIntersection"
            if (r9 == 0) goto L66
            r5 = -1
            if (r3 == r5) goto L66
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r5 = r2[r3]
            java.lang.String r6 = "supportedCipherSuites[indexOfFallbackScsv]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String[] r0 = okhttp3.internal.Util.concat(r0, r5)
        L66:
            okhttp3.ConnectionSpec$Builder r5 = new okhttp3.ConnectionSpec$Builder
            r5.<init>(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            int r4 = r0.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
            okhttp3.ConnectionSpec$Builder r4 = r5.cipherSuites(r4)
            java.lang.String r5 = "tlsVersionsIntersection"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            int r5 = r1.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r1, r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            okhttp3.ConnectionSpec$Builder r4 = r4.tlsVersions(r5)
            okhttp3.ConnectionSpec r4 = r4.build()
            return r4
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cipherSuites", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cipherSuites, reason: not valid java name */
    public final java.util.List<okhttp3.CipherSuite> m10260deprecated_cipherSuites() {
            r1 = this;
            java.util.List r0 = r1.cipherSuites()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "supportsTlsExtensions", imports = {}))
    /* JADX INFO: renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name */
    public final boolean m10261deprecated_supportsTlsExtensions() {
            r1 = this;
            boolean r0 = r1.supportsTlsExtensions
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "tlsVersions", imports = {}))
    /* JADX INFO: renamed from: -deprecated_tlsVersions, reason: not valid java name */
    public final java.util.List<okhttp3.TlsVersion> m10262deprecated_tlsVersions() {
            r1 = this;
            java.util.List r0 = r1.tlsVersions()
            return r0
    }

    public final void apply$okhttp(javax.net.ssl.SSLSocket r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.ConnectionSpec r0 = r2.supportedSpec(r3, r4)
            java.util.List r1 = r0.tlsVersions()
            if (r1 == 0) goto L14
            java.lang.String[] r1 = r0.tlsVersionsAsString
            r3.setEnabledProtocols(r1)
        L14:
            java.util.List r1 = r0.cipherSuites()
            if (r1 == 0) goto L1f
            java.lang.String[] r1 = r0.cipherSuitesAsString
            r3.setEnabledCipherSuites(r1)
        L1f:
            return
    }

    public final java.util.List<okhttp3.CipherSuite> cipherSuites() {
            r11 = this;
            java.lang.String[] r0 = r11.cipherSuitesAsString
            if (r0 == 0) goto L2e
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.length
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            int r5 = r3.length
            r6 = 0
        L11:
            if (r6 >= r5) goto L23
            r7 = r3[r6]
            r8 = r7
            r9 = 0
            okhttp3.CipherSuite$Companion r10 = okhttp3.CipherSuite.Companion
            okhttp3.CipherSuite r8 = r10.forJavaName(r8)
            r2.add(r8)
            int r6 = r6 + 1
            goto L11
        L23:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r2)
            goto L2f
        L2e:
            r0 = 0
        L2f:
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
            r3 = r5
            okhttp3.ConnectionSpec r3 = (okhttp3.ConnectionSpec) r3
            boolean r3 = r3.isTls
            if (r2 == r3) goto L14
            return r1
        L14:
            boolean r2 = r4.isTls
            if (r2 == 0) goto L3e
            java.lang.String[] r2 = r4.cipherSuitesAsString
            r3 = r5
            okhttp3.ConnectionSpec r3 = (okhttp3.ConnectionSpec) r3
            java.lang.String[] r3 = r3.cipherSuitesAsString
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L26
            return r1
        L26:
            java.lang.String[] r2 = r4.tlsVersionsAsString
            r3 = r5
            okhttp3.ConnectionSpec r3 = (okhttp3.ConnectionSpec) r3
            java.lang.String[] r3 = r3.tlsVersionsAsString
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 != 0) goto L34
            return r1
        L34:
            boolean r2 = r4.supportsTlsExtensions
            r3 = r5
            okhttp3.ConnectionSpec r3 = (okhttp3.ConnectionSpec) r3
            boolean r3 = r3.supportsTlsExtensions
            if (r2 == r3) goto L3e
            return r1
        L3e:
            return r0
    }

    public int hashCode() {
            r4 = this;
            r0 = 17
            boolean r1 = r4.isTls
            if (r1 == 0) goto L27
            int r1 = r0 * 31
            java.lang.String[] r2 = r4.cipherSuitesAsString
            r3 = 0
            if (r2 == 0) goto L12
            int r2 = java.util.Arrays.hashCode(r2)
            goto L13
        L12:
            r2 = r3
        L13:
            int r1 = r1 + r2
            int r0 = r1 * 31
            java.lang.String[] r2 = r4.tlsVersionsAsString
            if (r2 == 0) goto L1e
            int r3 = java.util.Arrays.hashCode(r2)
        L1e:
            int r0 = r0 + r3
            int r1 = r0 * 31
            boolean r2 = r4.supportsTlsExtensions
            r2 = r2 ^ 1
            int r0 = r1 + r2
        L27:
            return r0
    }

    public final boolean isCompatible(javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.isTls
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.lang.String[] r0 = r4.tlsVersionsAsString
            if (r0 == 0) goto L20
            java.lang.String[] r0 = r4.tlsVersionsAsString
            java.lang.String[] r2 = r5.getEnabledProtocols()
            java.util.Comparator r3 = kotlin.comparisons.ComparisonsKt.naturalOrder()
            boolean r0 = okhttp3.internal.Util.hasIntersection(r0, r2, r3)
            if (r0 != 0) goto L20
            return r1
        L20:
            java.lang.String[] r0 = r4.cipherSuitesAsString
            if (r0 == 0) goto L37
            java.lang.String[] r0 = r4.cipherSuitesAsString
            java.lang.String[] r2 = r5.getEnabledCipherSuites()
            okhttp3.CipherSuite$Companion r3 = okhttp3.CipherSuite.Companion
            java.util.Comparator r3 = r3.getORDER_BY_NAME$okhttp()
            boolean r0 = okhttp3.internal.Util.hasIntersection(r0, r2, r3)
            if (r0 != 0) goto L37
            return r1
        L37:
            r0 = 1
            return r0
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
            r11 = this;
            java.lang.String[] r0 = r11.tlsVersionsAsString
            if (r0 == 0) goto L2e
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.length
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            int r5 = r3.length
            r6 = 0
        L11:
            if (r6 >= r5) goto L23
            r7 = r3[r6]
            r8 = r7
            r9 = 0
            okhttp3.TlsVersion$Companion r10 = okhttp3.TlsVersion.Companion
            okhttp3.TlsVersion r8 = r10.forJavaName(r8)
            r2.add(r8)
            int r6 = r6 + 1
            goto L11
        L23:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r2)
            goto L2f
        L2e:
            r0 = 0
        L2f:
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
            r0.<init>()
            java.lang.String r1 = "ConnectionSpec(cipherSuites="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List r1 = r3.cipherSuites()
            java.lang.String r2 = "[all enabled]"
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", tlsVersions="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List r1 = r3.tlsVersions()
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", supportsTlsExtensions="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r3.supportsTlsExtensions
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
