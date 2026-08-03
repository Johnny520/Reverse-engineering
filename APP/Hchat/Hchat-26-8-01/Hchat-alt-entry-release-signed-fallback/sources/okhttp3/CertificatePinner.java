package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class CertificatePinner {
    public static final okhttp3.CertificatePinner.Companion Companion = null;
    public static final okhttp3.CertificatePinner DEFAULT = null;
    private final okhttp3.internal.tls.CertificateChainCleaner certificateChainCleaner;
    private final java.util.Set<okhttp3.CertificatePinner.Pin> pins;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Builder {
        private final java.util.List<okhttp3.CertificatePinner.Pin> pins;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.pins = r0
                return
        }

        public final okhttp3.CertificatePinner.Builder add(java.lang.String r6, java.lang.String... r7) {
                r5 = this;
                r6.getClass()
                r7.getClass()
                int r0 = r7.length
                r1 = 0
            L8:
                if (r1 >= r0) goto L19
                r2 = r7[r1]
                java.util.List<okhttp3.CertificatePinner$Pin> r3 = r5.pins
                okhttp3.CertificatePinner$Pin r4 = new okhttp3.CertificatePinner$Pin
                r4.<init>(r6, r2)
                r3.add(r4)
                int r1 = r1 + 1
                goto L8
            L19:
                return r5
        }

        public final okhttp3.CertificatePinner build() {
                r4 = this;
                okhttp3.CertificatePinner r0 = new okhttp3.CertificatePinner
                java.util.List<okhttp3.CertificatePinner$Pin> r1 = r4.pins
                java.util.Set r1 = tf.m.U1(r1)
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

        public final java.lang.String pin(java.security.cert.Certificate r3) {
                r2 = this;
                r3.getClass()
                boolean r0 = r3 instanceof java.security.cert.X509Certificate
                if (r0 == 0) goto L20
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "sha256/"
                r0.<init>(r1)
                java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
                okio.ByteString r3 = r2.sha256Hash(r3)
                java.lang.String r3 = r3.base64()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
            L20:
                java.lang.String r3 = "Certificate pinning requires X509 certificates"
                j8.o.t(r3)
                r3 = 0
                return r3
        }

        public final okio.ByteString sha1Hash(java.security.cert.X509Certificate r7) {
                r6 = this;
                r7.getClass()
                okio.ByteString$Companion r0 = okio.ByteString.Companion
                java.security.PublicKey r7 = r7.getPublicKey()
                byte[] r1 = r7.getEncoded()
                r1.getClass()
                r4 = 3
                r5 = 0
                r2 = 0
                r3 = 0
                okio.ByteString r7 = okio.ByteString.Companion.of$default(r0, r1, r2, r3, r4, r5)
                okio.ByteString r7 = r7.sha1()
                return r7
        }

        public final okio.ByteString sha256Hash(java.security.cert.X509Certificate r7) {
                r6 = this;
                r7.getClass()
                okio.ByteString$Companion r0 = okio.ByteString.Companion
                java.security.PublicKey r7 = r7.getPublicKey()
                byte[] r1 = r7.getEncoded()
                r1.getClass()
                r4 = 3
                r5 = 0
                r2 = 0
                r3 = 0
                okio.ByteString r7 = okio.ByteString.Companion.of$default(r0, r1, r2, r3, r4, r5)
                okio.ByteString r7 = r7.sha256()
                return r7
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Pin {
        private final okio.ByteString hash;
        private final java.lang.String hashAlgorithm;
        private final java.lang.String pattern;

        public Pin(java.lang.String r6, java.lang.String r7) {
                r5 = this;
                r6.getClass()
                r7.getClass()
                r5.<init>()
                java.lang.String r0 = "*."
                r1 = 0
                boolean r0 = og.t.d0(r6, r0, r1)
                r2 = 4
                java.lang.String r3 = "*"
                r4 = -1
                if (r0 == 0) goto L1d
                r0 = 1
                int r0 = og.m.r0(r6, r3, r0, r1, r2)
                if (r0 == r4) goto L33
            L1d:
                java.lang.String r0 = "**."
                boolean r0 = og.t.d0(r6, r0, r1)
                if (r0 == 0) goto L2c
                r0 = 2
                int r0 = og.m.r0(r6, r3, r0, r1, r2)
                if (r0 == r4) goto L33
            L2c:
                r0 = 6
                int r0 = og.m.r0(r6, r3, r1, r1, r0)
                if (r0 != r4) goto L9d
            L33:
                java.lang.String r0 = okhttp3.internal.HostnamesKt.toCanonicalHost(r6)
                if (r0 == 0) goto L92
                r5.pattern = r0
                java.lang.String r6 = "sha1/"
                boolean r6 = og.t.d0(r7, r6, r1)
                java.lang.String r0 = "Invalid pin hash: "
                if (r6 == 0) goto L62
                java.lang.String r6 = "sha1"
                r5.hashAlgorithm = r6
                okio.ByteString$Companion r6 = okio.ByteString.Companion
                r1 = 5
                java.lang.String r1 = r7.substring(r1)
                okio.ByteString r6 = r6.decodeBase64(r1)
                if (r6 == 0) goto L59
                r5.hash = r6
                return
            L59:
                java.lang.String r6 = r0.concat(r7)
                j8.o.t(r6)
                r6 = 0
                throw r6
            L62:
                java.lang.String r6 = "sha256/"
                boolean r6 = og.t.d0(r7, r6, r1)
                if (r6 == 0) goto L87
                java.lang.String r6 = "sha256"
                r5.hashAlgorithm = r6
                okio.ByteString$Companion r6 = okio.ByteString.Companion
                r1 = 7
                java.lang.String r1 = r7.substring(r1)
                okio.ByteString r6 = r6.decodeBase64(r1)
                if (r6 == 0) goto L7e
                r5.hash = r6
                return
            L7e:
                java.lang.String r6 = r0.concat(r7)
                j8.o.t(r6)
                r6 = 0
                throw r6
            L87:
                java.lang.String r6 = "pins must start with 'sha256/' or 'sha1/': "
                java.lang.String r6 = r6.concat(r7)
                j8.o.t(r6)
                r6 = 0
                throw r6
            L92:
                java.lang.String r7 = "Invalid pattern: "
                java.lang.String r6 = r7.concat(r6)
                j8.o.t(r6)
                r6 = 0
                throw r6
            L9d:
                java.lang.String r7 = "Unexpected pattern: "
                java.lang.String r6 = r7.concat(r6)
                j8.o.q(r6)
                r6 = 0
                throw r6
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
                okhttp3.CertificatePinner$Pin r5 = (okhttp3.CertificatePinner.Pin) r5
                java.lang.String r3 = r5.pattern
                boolean r1 = gg.l.a(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.hashAlgorithm
                java.lang.String r3 = r5.hashAlgorithm
                boolean r1 = gg.l.a(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                okio.ByteString r1 = r4.hash
                okio.ByteString r5 = r5.hash
                boolean r5 = gg.l.a(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
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
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r3.hashAlgorithm
                int r0 = eh.a.g(r0, r1, r2)
                okio.ByteString r1 = r3.hash
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final boolean matchesCertificate(java.security.cert.X509Certificate r3) {
                r2 = this;
                r3.getClass()
                java.lang.String r0 = r2.hashAlgorithm
                java.lang.String r1 = "sha256"
                boolean r1 = gg.l.a(r0, r1)
                if (r1 == 0) goto L1a
                okio.ByteString r0 = r2.hash
                okhttp3.CertificatePinner$Companion r1 = okhttp3.CertificatePinner.Companion
                okio.ByteString r3 = r1.sha256Hash(r3)
                boolean r3 = gg.l.a(r0, r3)
                return r3
            L1a:
                java.lang.String r1 = "sha1"
                boolean r0 = gg.l.a(r0, r1)
                if (r0 == 0) goto L2f
                okio.ByteString r0 = r2.hash
                okhttp3.CertificatePinner$Companion r1 = okhttp3.CertificatePinner.Companion
                okio.ByteString r3 = r1.sha1Hash(r3)
                boolean r3 = gg.l.a(r0, r3)
                return r3
            L2f:
                r3 = 0
                return r3
        }

        public final boolean matchesHostname(java.lang.String r12) {
                r11 = this;
                r12.getClass()
                java.lang.String r0 = r11.pattern
                java.lang.String r1 = "**."
                r2 = 0
                boolean r0 = og.t.d0(r0, r1, r2)
                java.lang.String r1 = r11.pattern
                r3 = 46
                r4 = 1
                if (r0 == 0) goto L39
                int r0 = r1.length()
                int r9 = r0 + (-3)
                int r0 = r12.length()
                int r0 = r0 - r9
                int r1 = r12.length()
                int r6 = r1 - r9
                java.lang.String r7 = r11.pattern
                r8 = 3
                r10 = 0
                r5 = r12
                boolean r12 = og.t.Y(r5, r6, r7, r8, r9, r10)
                if (r12 == 0) goto L69
                if (r0 == 0) goto L68
                int r0 = r0 - r4
                char r12 = r5.charAt(r0)
                if (r12 != r3) goto L69
                goto L68
            L39:
                r5 = r12
                java.lang.String r12 = "*."
                boolean r12 = og.t.d0(r1, r12, r2)
                java.lang.String r0 = r11.pattern
                if (r12 == 0) goto L6a
                int r12 = r0.length()
                int r9 = r12 + (-1)
                int r12 = r5.length()
                int r12 = r12 - r9
                int r0 = r5.length()
                int r6 = r0 - r9
                java.lang.String r7 = r11.pattern
                r8 = 1
                r10 = 0
                boolean r0 = og.t.Y(r5, r6, r7, r8, r9, r10)
                if (r0 == 0) goto L69
                int r12 = r12 - r4
                r0 = 4
                int r12 = og.m.w0(r5, r3, r12, r0)
                r0 = -1
                if (r12 != r0) goto L69
            L68:
                return r4
            L69:
                return r2
            L6a:
                boolean r12 = r5.equals(r0)
                return r12
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.hashAlgorithm
                r0.append(r1)
                r1 = 47
                r0.append(r1)
                okio.ByteString r1 = r2.hash
                java.lang.String r1 = r1.base64()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: okhttp3.CertificatePinner$check$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AnonymousClass1 extends gg.m implements fg.a {
        final /* synthetic */ java.lang.String $hostname;
        final /* synthetic */ java.util.List<java.security.cert.Certificate> $peerCertificates;
        final /* synthetic */ okhttp3.CertificatePinner this$0;

        public AnonymousClass1(okhttp3.CertificatePinner r1, java.util.List<? extends java.security.cert.Certificate> r2, java.lang.String r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$peerCertificates = r2
                r0.$hostname = r3
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
        public final java.util.List<java.security.cert.X509Certificate> invoke() {
                r3 = this;
                okhttp3.CertificatePinner r0 = r3.this$0
                okhttp3.internal.tls.CertificateChainCleaner r0 = r0.getCertificateChainCleaner$okhttp()
                if (r0 == 0) goto L12
                java.util.List<java.security.cert.Certificate> r1 = r3.$peerCertificates
                java.lang.String r2 = r3.$hostname
                java.util.List r0 = r0.clean(r1, r2)
                if (r0 != 0) goto L14
            L12:
                java.util.List<java.security.cert.Certificate> r0 = r3.$peerCertificates
            L14:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = tf.n.e1(r0)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L21:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L36
                java.lang.Object r2 = r0.next()
                java.security.cert.Certificate r2 = (java.security.cert.Certificate) r2
                r2.getClass()
                java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
                r1.add(r2)
                goto L21
            L36:
                return r1
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

    public CertificatePinner(java.util.Set<okhttp3.CertificatePinner.Pin> r1, okhttp3.internal.tls.CertificateChainCleaner r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.pins = r1
            r0.certificateChainCleaner = r2
            return
    }

    public /* synthetic */ CertificatePinner(java.util.Set r1, okhttp3.internal.tls.CertificateChainCleaner r2, int r3, gg.g r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    public static final java.lang.String pin(java.security.cert.Certificate r1) {
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion
            java.lang.String r1 = r0.pin(r1)
            return r1
    }

    public static final okio.ByteString sha1Hash(java.security.cert.X509Certificate r1) {
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion
            okio.ByteString r1 = r0.sha1Hash(r1)
            return r1
    }

    public static final okio.ByteString sha256Hash(java.security.cert.X509Certificate r1) {
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion
            okio.ByteString r1 = r0.sha256Hash(r1)
            return r1
    }

    public final void check(java.lang.String r2, java.util.List<? extends java.security.cert.Certificate> r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            okhttp3.CertificatePinner$check$1 r0 = new okhttp3.CertificatePinner$check$1
            r0.<init>(r1, r3, r2)
            r1.check$okhttp(r2, r0)
            return
    }

    @sf.a
    public final void check(java.lang.String r1, java.security.cert.Certificate... r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.util.List r2 = tf.l.L0(r2)
            r0.check(r1, r2)
            return
    }

    public final void check$okhttp(java.lang.String r10, fg.a r11) {
            r9 = this;
            r10.getClass()
            r11.getClass()
            java.util.List r0 = r9.findMatchingPins(r10)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L11
            goto L72
        L11:
            java.lang.Object r11 = r11.invoke()
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r1 = r11.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.util.Iterator r3 = r0.iterator()
            r4 = 0
            r5 = r4
        L2d:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L1b
            java.lang.Object r6 = r3.next()
            okhttp3.CertificatePinner$Pin r6 = (okhttp3.CertificatePinner.Pin) r6
            java.lang.String r7 = r6.getHashAlgorithm()
            java.lang.String r8 = "sha256"
            boolean r8 = gg.l.a(r7, r8)
            if (r8 == 0) goto L58
            if (r4 != 0) goto L4d
            okhttp3.CertificatePinner$Companion r4 = okhttp3.CertificatePinner.Companion
            okio.ByteString r4 = r4.sha256Hash(r2)
        L4d:
            okio.ByteString r6 = r6.getHash()
            boolean r6 = gg.l.a(r6, r4)
            if (r6 == 0) goto L2d
            goto L72
        L58:
            java.lang.String r8 = "sha1"
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L73
            if (r5 != 0) goto L68
            okhttp3.CertificatePinner$Companion r5 = okhttp3.CertificatePinner.Companion
            okio.ByteString r5 = r5.sha1Hash(r2)
        L68:
            okio.ByteString r6 = r6.getHash()
            boolean r6 = gg.l.a(r6, r5)
            if (r6 == 0) goto L2d
        L72:
            return
        L73:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            java.lang.String r11 = r6.getHashAlgorithm()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unsupported hashAlgorithm: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        L8b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Certificate pinning failure!\n  Peer certificate chain:"
            r1.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
        L96:
            boolean r2 = r11.hasNext()
            java.lang.String r3 = "\n    "
            if (r2 == 0) goto Lc1
            java.lang.Object r2 = r11.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            r1.append(r3)
            okhttp3.CertificatePinner$Companion r3 = okhttp3.CertificatePinner.Companion
            java.lang.String r3 = r3.pin(r2)
            r1.append(r3)
            java.lang.String r3 = ": "
            r1.append(r3)
            java.security.Principal r2 = r2.getSubjectDN()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            goto L96
        Lc1:
            java.lang.String r11 = "\n  Pinned certificates for "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = ":"
            r1.append(r10)
            java.util.Iterator r10 = r0.iterator()
        Ld2:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Le5
            java.lang.Object r11 = r10.next()
            okhttp3.CertificatePinner$Pin r11 = (okhttp3.CertificatePinner.Pin) r11
            r1.append(r3)
            r1.append(r11)
            goto Ld2
        Le5:
            java.lang.String r10 = r1.toString()
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException
            r11.<init>(r10)
            throw r11
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof okhttp3.CertificatePinner
            if (r0 == 0) goto L1c
            okhttp3.CertificatePinner r3 = (okhttp3.CertificatePinner) r3
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r3.pins
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r2.pins
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L1c
            okhttp3.internal.tls.CertificateChainCleaner r3 = r3.certificateChainCleaner
            okhttp3.internal.tls.CertificateChainCleaner r0 = r2.certificateChainCleaner
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public final java.util.List<okhttp3.CertificatePinner.Pin> findMatchingPins(java.lang.String r5) {
            r4 = this;
            r5.getClass()
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r4.pins
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            tf.t r1 = tf.t.f13167g
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            r3 = r2
            okhttp3.CertificatePinner$Pin r3 = (okhttp3.CertificatePinner.Pin) r3
            boolean r3 = r3.matchesHostname(r5)
            if (r3 == 0) goto Ld
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L2b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L2b:
            java.util.List r3 = gg.x.a(r1)
            r3.add(r2)
            goto Ld
        L33:
            return r1
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
            r2 = this;
            java.util.Set<okhttp3.CertificatePinner$Pin> r0 = r2.pins
            int r0 = r0.hashCode()
            int r0 = r0 + 1517
            int r0 = r0 * 41
            okhttp3.internal.tls.CertificateChainCleaner r1 = r2.certificateChainCleaner
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            goto L14
        L13:
            r1 = 0
        L14:
            int r0 = r0 + r1
            return r0
    }

    public final okhttp3.CertificatePinner withCertificateChainCleaner$okhttp(okhttp3.internal.tls.CertificateChainCleaner r3) {
            r2 = this;
            r3.getClass()
            okhttp3.internal.tls.CertificateChainCleaner r0 = r2.certificateChainCleaner
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto Lc
            return r2
        Lc:
            okhttp3.CertificatePinner r0 = new okhttp3.CertificatePinner
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r2.pins
            r0.<init>(r1, r3)
            return r0
    }
}
