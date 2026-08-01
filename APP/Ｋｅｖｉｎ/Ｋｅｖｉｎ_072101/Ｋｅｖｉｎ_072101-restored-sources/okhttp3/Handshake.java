package okhttp3;

/* JADX INFO: compiled from: Handshake.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n¢\u0006\u0002\u0010\u000bJ\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\b J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b!J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\b\"J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b#J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b$J\b\u0010%\u001a\u00020\u0017H\u0016R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00078GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m115d2 = {"Lokhttp3/Handshake;", "", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "localCertificates", "", "Ljava/security/cert/Certificate;", "peerCertificatesFn", "Lkotlin/Function0;", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "()Lokhttp3/CipherSuite;", "()Ljava/util/List;", "localPrincipal", "Ljava/security/Principal;", "()Ljava/security/Principal;", "peerCertificates", "peerCertificates$delegate", "Lkotlin/Lazy;", "peerPrincipal", "()Lokhttp3/TlsVersion;", "name", "", "getName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "-deprecated_cipherSuite", "equals", "", "other", "hashCode", "", "-deprecated_localCertificates", "-deprecated_localPrincipal", "-deprecated_peerCertificates", "-deprecated_peerPrincipal", "-deprecated_tlsVersion", "toString", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class Handshake {
    public static final okhttp3.Handshake.Companion Companion = null;
    private final okhttp3.CipherSuite cipherSuite;
    private final java.util.List<java.security.cert.Certificate> localCertificates;
    private final kotlin.Lazy peerCertificates$delegate;
    private final okhttp3.TlsVersion tlsVersion;

    /* JADX INFO: compiled from: Handshake.kt */
    @kotlin.Metadata(m114d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0007J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0006H\u0007¢\u0006\u0002\b\u0003J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m115d2 = {"Lokhttp3/Handshake$Companion;", "", "()V", "get", "Lokhttp3/Handshake;", "sslSession", "Ljavax/net/ssl/SSLSession;", "-deprecated_get", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "peerCertificates", "", "Ljava/security/cert/Certificate;", "localCertificates", "handshake", "toImmutableList", "", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        private final java.util.List<java.security.cert.Certificate> toImmutableList(java.security.cert.Certificate[] r2) {
                r1 = this;
                if (r2 == 0) goto Lc
                int r0 = r2.length
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
                java.util.List r0 = okhttp3.internal.Util.immutableListOf(r0)
                goto L10
            Lc:
                java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            L10:
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "sslSession.handshake()", imports = {}))
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.Handshake m10280deprecated_get(javax.net.ssl.SSLSession r2) throws java.io.IOException {
                r1 = this;
                java.lang.String r0 = "sslSession"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.Handshake r0 = r1.get(r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Handshake get(javax.net.ssl.SSLSession r9) throws java.io.IOException {
                r8 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.lang.String r0 = r9.getCipherSuite()
                if (r0 == 0) goto L8e
            Lc:
                java.lang.String r1 = "TLS_NULL_WITH_NULL_NULL"
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r1 == 0) goto L16
                r1 = 1
                goto L1c
            L16:
                java.lang.String r1 = "SSL_NULL_WITH_NULL_NULL"
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            L1c:
                if (r1 != 0) goto L75
                okhttp3.CipherSuite$Companion r1 = okhttp3.CipherSuite.Companion
                okhttp3.CipherSuite r1 = r1.forJavaName(r0)
                java.lang.String r2 = r9.getProtocol()
                if (r2 == 0) goto L67
                java.lang.String r3 = "NONE"
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r2)
                if (r3 != 0) goto L5f
                okhttp3.TlsVersion$Companion r3 = okhttp3.TlsVersion.Companion
                okhttp3.TlsVersion r3 = r3.forJavaName(r2)
                java.security.cert.Certificate[] r4 = r9.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
                java.util.List r4 = r8.toImmutableList(r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L43
                goto L49
            L43:
                r4 = move-exception
                java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
                r4 = r5
            L49:
                okhttp3.Handshake r5 = new okhttp3.Handshake
                java.security.cert.Certificate[] r6 = r9.getLocalCertificates()
                java.util.List r6 = r8.toImmutableList(r6)
                okhttp3.Handshake$Companion$handshake$1 r7 = new okhttp3.Handshake$Companion$handshake$1
                r7.<init>(r4)
                kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
                r5.<init>(r3, r1, r6, r7)
                return r5
            L5f:
                java.io.IOException r3 = new java.io.IOException
                java.lang.String r4 = "tlsVersion == NONE"
                r3.<init>(r4)
                throw r3
            L67:
                r2 = 0
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "tlsVersion == null"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L75:
                java.io.IOException r1 = new java.io.IOException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "cipherSuite == "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L8e:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "cipherSuite == null"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.Handshake get(okhttp3.TlsVersion r5, okhttp3.CipherSuite r6, java.util.List<? extends java.security.cert.Certificate> r7, java.util.List<? extends java.security.cert.Certificate> r8) {
                r4 = this;
                java.lang.String r0 = "tlsVersion"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "cipherSuite"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "peerCertificates"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "localCertificates"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.util.List r0 = okhttp3.internal.Util.toImmutableList(r7)
                okhttp3.Handshake r1 = new okhttp3.Handshake
                java.util.List r2 = okhttp3.internal.Util.toImmutableList(r8)
                okhttp3.Handshake$Companion$get$1 r3 = new okhttp3.Handshake$Companion$get$1
                r3.<init>(r0)
                kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
                r1.<init>(r5, r6, r2, r3)
                return r1
        }
    }


    static {
            okhttp3.Handshake$Companion r0 = new okhttp3.Handshake$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Handshake.Companion = r0
            return
    }

    public Handshake(okhttp3.TlsVersion r2, okhttp3.CipherSuite r3, java.util.List<? extends java.security.cert.Certificate> r4, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.security.cert.Certificate>> r5) {
            r1 = this;
            java.lang.String r0 = "tlsVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "cipherSuite"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "localCertificates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "peerCertificatesFn"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.tlsVersion = r2
            r1.cipherSuite = r3
            r1.localCertificates = r4
            okhttp3.Handshake$peerCertificates$2 r0 = new okhttp3.Handshake$peerCertificates$2
            r0.<init>(r5)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.peerCertificates$delegate = r0
            return
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Handshake get(javax.net.ssl.SSLSession r1) throws java.io.IOException {
            okhttp3.Handshake$Companion r0 = okhttp3.Handshake.Companion
            okhttp3.Handshake r0 = r0.get(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.Handshake get(okhttp3.TlsVersion r1, okhttp3.CipherSuite r2, java.util.List<? extends java.security.cert.Certificate> r3, java.util.List<? extends java.security.cert.Certificate> r4) {
            okhttp3.Handshake$Companion r0 = okhttp3.Handshake.Companion
            okhttp3.Handshake r0 = r0.get(r1, r2, r3, r4)
            return r0
    }

    private final java.lang.String getName(java.security.cert.Certificate r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.security.cert.X509Certificate
            if (r0 == 0) goto L11
            r0 = r3
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            java.security.Principal r0 = r0.getSubjectDN()
            java.lang.String r0 = r0.toString()
            goto L1a
        L11:
            java.lang.String r0 = r3.getType()
            java.lang.String r1 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L1a:
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "cipherSuite", imports = {}))
    /* JADX INFO: renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final okhttp3.CipherSuite m10274deprecated_cipherSuite() {
            r1 = this;
            okhttp3.CipherSuite r0 = r1.cipherSuite
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "localCertificates", imports = {}))
    /* JADX INFO: renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final java.util.List<java.security.cert.Certificate> m10275deprecated_localCertificates() {
            r1 = this;
            java.util.List<java.security.cert.Certificate> r0 = r1.localCertificates
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "localPrincipal", imports = {}))
    /* JADX INFO: renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final java.security.Principal m10276deprecated_localPrincipal() {
            r1 = this;
            java.security.Principal r0 = r1.localPrincipal()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "peerCertificates", imports = {}))
    /* JADX INFO: renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final java.util.List<java.security.cert.Certificate> m10277deprecated_peerCertificates() {
            r1 = this;
            java.util.List r0 = r1.peerCertificates()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "peerPrincipal", imports = {}))
    /* JADX INFO: renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final java.security.Principal m10278deprecated_peerPrincipal() {
            r1 = this;
            java.security.Principal r0 = r1.peerPrincipal()
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "tlsVersion", imports = {}))
    /* JADX INFO: renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final okhttp3.TlsVersion m10279deprecated_tlsVersion() {
            r1 = this;
            okhttp3.TlsVersion r0 = r1.tlsVersion
            return r0
    }

    public final okhttp3.CipherSuite cipherSuite() {
            r1 = this;
            okhttp3.CipherSuite r0 = r1.cipherSuite
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.Handshake
            if (r0 == 0) goto L3a
            r0 = r3
            okhttp3.Handshake r0 = (okhttp3.Handshake) r0
            okhttp3.TlsVersion r0 = r0.tlsVersion
            okhttp3.TlsVersion r1 = r2.tlsVersion
            if (r0 != r1) goto L3a
            r0 = r3
            okhttp3.Handshake r0 = (okhttp3.Handshake) r0
            okhttp3.CipherSuite r0 = r0.cipherSuite
            okhttp3.CipherSuite r1 = r2.cipherSuite
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L3a
            r0 = r3
            okhttp3.Handshake r0 = (okhttp3.Handshake) r0
            java.util.List r0 = r0.peerCertificates()
            java.util.List r1 = r2.peerCertificates()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L3a
            r0 = r3
            okhttp3.Handshake r0 = (okhttp3.Handshake) r0
            java.util.List<java.security.cert.Certificate> r0 = r0.localCertificates
            java.util.List<java.security.cert.Certificate> r1 = r2.localCertificates
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L3a
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 17
            int r1 = r0 * 31
            okhttp3.TlsVersion r2 = r3.tlsVersion
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            int r0 = r1 * 31
            okhttp3.CipherSuite r2 = r3.cipherSuite
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r1 = r0 * 31
            java.util.List r2 = r3.peerCertificates()
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            int r0 = r1 * 31
            java.util.List<java.security.cert.Certificate> r2 = r3.localCertificates
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            return r0
    }

    public final java.util.List<java.security.cert.Certificate> localCertificates() {
            r1 = this;
            java.util.List<java.security.cert.Certificate> r0 = r1.localCertificates
            return r0
    }

    public final java.security.Principal localPrincipal() {
            r3 = this;
            java.util.List<java.security.cert.Certificate> r0 = r3.localCertificates
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            boolean r1 = r0 instanceof java.security.cert.X509Certificate
            r2 = 0
            if (r1 == 0) goto Le
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L15
            javax.security.auth.x500.X500Principal r2 = r0.getSubjectX500Principal()
        L15:
            java.security.Principal r2 = (java.security.Principal) r2
            return r2
    }

    public final java.util.List<java.security.cert.Certificate> peerCertificates() {
            r1 = this;
            kotlin.Lazy r0 = r1.peerCertificates$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final java.security.Principal peerPrincipal() {
            r3 = this;
            java.util.List r0 = r3.peerCertificates()
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            boolean r1 = r0 instanceof java.security.cert.X509Certificate
            r2 = 0
            if (r1 == 0) goto L10
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L17
            javax.security.auth.x500.X500Principal r2 = r0.getSubjectX500Principal()
        L17:
            java.security.Principal r2 = (java.security.Principal) r2
            return r2
    }

    public final okhttp3.TlsVersion tlsVersion() {
            r1 = this;
            okhttp3.TlsVersion r0 = r1.tlsVersion
            return r0
    }

    public java.lang.String toString() {
            r11 = this;
            java.util.List r0 = r11.peerCertificates()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)
            r2.<init>(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            r4 = r0
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L1a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L30
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.security.cert.Certificate r8 = (java.security.cert.Certificate) r8
            r9 = 0
            java.lang.String r8 = r11.getName(r8)
            r2.add(r8)
            goto L1a
        L30:
            java.util.List r2 = (java.util.List) r2
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Handshake{tlsVersion="
            java.lang.StringBuilder r1 = r1.append(r2)
            okhttp3.TlsVersion r2 = r11.tlsVersion
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " cipherSuite="
            java.lang.StringBuilder r1 = r1.append(r2)
            okhttp3.CipherSuite r2 = r11.cipherSuite
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " peerCertificates="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = " localCertificates="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.util.List<java.security.cert.Certificate> r2 = r11.localCertificates
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r3)
            r5.<init>(r3)
            r3 = r5
            java.util.Collection r3 = (java.util.Collection) r3
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L80:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L96
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.security.cert.Certificate r9 = (java.security.cert.Certificate) r9
            r10 = 0
            java.lang.String r9 = r11.getName(r9)
            r3.add(r9)
            goto L80
        L96:
            java.util.List r3 = (java.util.List) r3
            java.lang.StringBuilder r1 = r1.append(r3)
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
