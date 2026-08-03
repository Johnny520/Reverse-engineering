package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Handshake {
    public static final okhttp3.Handshake.Companion Companion = null;
    private final okhttp3.CipherSuite cipherSuite;
    private final java.util.List<java.security.cert.Certificate> localCertificates;
    private final sf.c peerCertificates$delegate;
    private final okhttp3.TlsVersion tlsVersion;

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

        private final java.util.List<java.security.cert.Certificate> toImmutableList(java.security.cert.Certificate[] r2) {
                r1 = this;
                if (r2 == 0) goto Lc
                int r0 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
                java.util.List r2 = okhttp3.internal.Util.immutableListOf(r2)
                return r2
            Lc:
                tf.t r2 = tf.t.f13167g
                return r2
        }

        @sf.a
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.Handshake m64deprecated_get(javax.net.ssl.SSLSession r1) {
                r0 = this;
                r1.getClass()
                okhttp3.Handshake r1 = r0.get(r1)
                return r1
        }

        public final okhttp3.Handshake get(javax.net.ssl.SSLSession r6) {
                r5 = this;
                r6.getClass()
                java.lang.String r0 = r6.getCipherSuite()
                if (r0 == 0) goto L6a
                java.lang.String r1 = "TLS_NULL_WITH_NULL_NULL"
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L13
                r1 = 1
                goto L19
            L13:
                java.lang.String r1 = "SSL_NULL_WITH_NULL_NULL"
                boolean r1 = r0.equals(r1)
            L19:
                if (r1 != 0) goto L60
                okhttp3.CipherSuite$Companion r1 = okhttp3.CipherSuite.Companion
                okhttp3.CipherSuite r0 = r1.forJavaName(r0)
                java.lang.String r1 = r6.getProtocol()
                if (r1 == 0) goto L5a
                java.lang.String r2 = "NONE"
                boolean r2 = r2.equals(r1)
                if (r2 != 0) goto L53
                okhttp3.TlsVersion$Companion r2 = okhttp3.TlsVersion.Companion
                okhttp3.TlsVersion r1 = r2.forJavaName(r1)
                java.security.cert.Certificate[] r2 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L3e
                java.util.List r2 = r5.toImmutableList(r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L3e
                goto L40
            L3e:
                tf.t r2 = tf.t.f13167g
            L40:
                okhttp3.Handshake r3 = new okhttp3.Handshake
                java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
                java.util.List r6 = r5.toImmutableList(r6)
                okhttp3.Handshake$Companion$handshake$1 r4 = new okhttp3.Handshake$Companion$handshake$1
                r4.<init>(r2)
                r3.<init>(r1, r0, r6, r4)
                return r3
            L53:
                java.lang.String r6 = "tlsVersion == NONE"
                j8.o.y(r6)
            L58:
                r6 = 0
                return r6
            L5a:
                java.lang.String r6 = "tlsVersion == null"
                j8.o.A(r6)
                goto L58
            L60:
                java.lang.String r6 = "cipherSuite == "
                java.lang.String r6 = r6.concat(r0)
                j8.o.y(r6)
                goto L58
            L6a:
                java.lang.String r6 = "cipherSuite == null"
                j8.o.A(r6)
                goto L58
        }

        public final okhttp3.Handshake get(okhttp3.TlsVersion r3, okhttp3.CipherSuite r4, java.util.List<? extends java.security.cert.Certificate> r5, java.util.List<? extends java.security.cert.Certificate> r6) {
                r2 = this;
                r3.getClass()
                r4.getClass()
                r5.getClass()
                r6.getClass()
                java.util.List r5 = okhttp3.internal.Util.toImmutableList(r5)
                okhttp3.Handshake r0 = new okhttp3.Handshake
                java.util.List r6 = okhttp3.internal.Util.toImmutableList(r6)
                okhttp3.Handshake$Companion$get$1 r1 = new okhttp3.Handshake$Companion$get$1
                r1.<init>(r5)
                r0.<init>(r3, r4, r6, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.Handshake$peerCertificates$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AnonymousClass2 extends gg.m implements fg.a {
        final /* synthetic */ fg.a $peerCertificatesFn;

        public AnonymousClass2(fg.a r1) {
                r0 = this;
                r0.$peerCertificatesFn = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // fg.a
        public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                r1 = this;
                java.util.List r0 = r1.invoke()
                return r0
        }

        @Override // fg.a
        public final java.util.List<java.security.cert.Certificate> invoke() {
                r1 = this;
                fg.a r0 = r1.$peerCertificatesFn     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9
                java.lang.Object r0 = r0.invoke()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9
                java.util.List r0 = (java.util.List) r0     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L9
                return r0
            L9:
                tf.t r0 = tf.t.f13167g
                return r0
        }
    }

    static {
            okhttp3.Handshake$Companion r0 = new okhttp3.Handshake$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Handshake.Companion = r0
            return
    }

    public Handshake(okhttp3.TlsVersion r1, okhttp3.CipherSuite r2, java.util.List<? extends java.security.cert.Certificate> r3, fg.a r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.tlsVersion = r1
            r0.cipherSuite = r2
            r0.localCertificates = r3
            okhttp3.Handshake$peerCertificates$2 r1 = new okhttp3.Handshake$peerCertificates$2
            r1.<init>(r4)
            sf.i r2 = new sf.i
            r2.<init>(r1)
            r0.peerCertificates$delegate = r2
            return
    }

    public static final okhttp3.Handshake get(javax.net.ssl.SSLSession r1) {
            okhttp3.Handshake$Companion r0 = okhttp3.Handshake.Companion
            okhttp3.Handshake r1 = r0.get(r1)
            return r1
    }

    public static final okhttp3.Handshake get(okhttp3.TlsVersion r1, okhttp3.CipherSuite r2, java.util.List<? extends java.security.cert.Certificate> r3, java.util.List<? extends java.security.cert.Certificate> r4) {
            okhttp3.Handshake$Companion r0 = okhttp3.Handshake.Companion
            okhttp3.Handshake r1 = r0.get(r1, r2, r3, r4)
            return r1
    }

    private final java.lang.String getName(java.security.cert.Certificate r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.security.cert.X509Certificate
            if (r0 == 0) goto Lf
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r2 = r2.toString()
            return r2
        Lf:
            java.lang.String r2 = r2.getType()
            r2.getClass()
            return r2
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final okhttp3.CipherSuite m58deprecated_cipherSuite() {
            r1 = this;
            okhttp3.CipherSuite r0 = r1.cipherSuite
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final java.util.List<java.security.cert.Certificate> m59deprecated_localCertificates() {
            r1 = this;
            java.util.List<java.security.cert.Certificate> r0 = r1.localCertificates
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final java.security.Principal m60deprecated_localPrincipal() {
            r1 = this;
            java.security.Principal r0 = r1.localPrincipal()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final java.util.List<java.security.cert.Certificate> m61deprecated_peerCertificates() {
            r1 = this;
            java.util.List r0 = r1.peerCertificates()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final java.security.Principal m62deprecated_peerPrincipal() {
            r1 = this;
            java.security.Principal r0 = r1.peerPrincipal()
            return r0
    }

    @sf.a
    /* JADX INFO: renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final okhttp3.TlsVersion m63deprecated_tlsVersion() {
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
            if (r0 == 0) goto L30
            okhttp3.Handshake r3 = (okhttp3.Handshake) r3
            okhttp3.TlsVersion r0 = r3.tlsVersion
            okhttp3.TlsVersion r1 = r2.tlsVersion
            if (r0 != r1) goto L30
            okhttp3.CipherSuite r0 = r3.cipherSuite
            okhttp3.CipherSuite r1 = r2.cipherSuite
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L30
            java.util.List r0 = r3.peerCertificates()
            java.util.List r1 = r2.peerCertificates()
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L30
            java.util.List<java.security.cert.Certificate> r3 = r3.localCertificates
            java.util.List<java.security.cert.Certificate> r0 = r2.localCertificates
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L30
            r3 = 1
            return r3
        L30:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            okhttp3.TlsVersion r0 = r2.tlsVersion
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            int r0 = r0 * 31
            okhttp3.CipherSuite r1 = r2.cipherSuite
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r0 = r2.peerCertificates()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<java.security.cert.Certificate> r1 = r2.localCertificates
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.util.List<java.security.cert.Certificate> localCertificates() {
            r1 = this;
            java.util.List<java.security.cert.Certificate> r0 = r1.localCertificates
            return r0
    }

    public final java.security.Principal localPrincipal() {
            r3 = this;
            java.util.List<java.security.cert.Certificate> r0 = r3.localCertificates
            java.lang.Object r0 = tf.m.v1(r0)
            boolean r1 = r0 instanceof java.security.cert.X509Certificate
            r2 = 0
            if (r1 == 0) goto Le
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L16
            javax.security.auth.x500.X500Principal r0 = r0.getSubjectX500Principal()
            return r0
        L16:
            return r2
    }

    public final java.util.List<java.security.cert.Certificate> peerCertificates() {
            r1 = this;
            sf.c r0 = r1.peerCertificates$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final java.security.Principal peerPrincipal() {
            r3 = this;
            java.util.List r0 = r3.peerCertificates()
            java.lang.Object r0 = tf.m.v1(r0)
            boolean r1 = r0 instanceof java.security.cert.X509Certificate
            r2 = 0
            if (r1 == 0) goto L10
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L18
            javax.security.auth.x500.X500Principal r0 = r0.getSubjectX500Principal()
            return r0
        L18:
            return r2
    }

    public final okhttp3.TlsVersion tlsVersion() {
            r1 = this;
            okhttp3.TlsVersion r0 = r1.tlsVersion
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.util.List r0 = r4.peerCertificates()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
            java.lang.String r2 = r4.getName(r2)
            r1.add(r2)
            goto L11
        L25:
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Handshake{tlsVersion="
            r1.<init>(r2)
            okhttp3.TlsVersion r2 = r4.tlsVersion
            r1.append(r2)
            java.lang.String r2 = " cipherSuite="
            r1.append(r2)
            okhttp3.CipherSuite r2 = r4.cipherSuite
            r1.append(r2)
            java.lang.String r2 = " peerCertificates="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " localCertificates="
            r1.append(r0)
            java.util.List<java.security.cert.Certificate> r0 = r4.localCertificates
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r0)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r0.next()
            java.security.cert.Certificate r3 = (java.security.cert.Certificate) r3
            java.lang.String r3 = r4.getName(r3)
            r2.add(r3)
            goto L5b
        L6f:
            r1.append(r2)
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
