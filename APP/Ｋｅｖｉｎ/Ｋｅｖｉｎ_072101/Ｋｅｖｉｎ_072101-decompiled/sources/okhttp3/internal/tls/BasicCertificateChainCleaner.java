package okhttp3.internal.tls;

/* JADX INFO: compiled from: BasicCertificateChainCleaner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m115d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "(Lokhttp3/internal/tls/TrustRootIndex;)V", "clean", "", "Ljava/security/cert/Certificate;", "chain", "hostname", "", "equals", "", "other", "", "hashCode", "", "verifySignature", "toVerify", "Ljava/security/cert/X509Certificate;", "signingCert", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class BasicCertificateChainCleaner extends okhttp3.internal.tls.CertificateChainCleaner {
    public static final okhttp3.internal.tls.BasicCertificateChainCleaner.Companion Companion = null;
    private static final int MAX_SIGNERS = 9;
    private final okhttp3.internal.tls.TrustRootIndex trustRootIndex;

    /* JADX INFO: compiled from: BasicCertificateChainCleaner.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m115d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner$Companion;", "", "()V", "MAX_SIGNERS", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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
            okhttp3.internal.tls.BasicCertificateChainCleaner$Companion r0 = new okhttp3.internal.tls.BasicCertificateChainCleaner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.tls.BasicCertificateChainCleaner.Companion = r0
            return
    }

    public BasicCertificateChainCleaner(okhttp3.internal.tls.TrustRootIndex r2) {
            r1 = this;
            java.lang.String r0 = "trustRootIndex"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.trustRootIndex = r2
            return
    }

    private final boolean verifySignature(java.security.cert.X509Certificate r3, java.security.cert.X509Certificate r4) {
            r2 = this;
            java.security.Principal r0 = r3.getIssuerDN()
            java.security.Principal r1 = r4.getSubjectDN()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            java.security.PublicKey r0 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L1a
            r3.verify(r0)     // Catch: java.security.GeneralSecurityException -> L1a
            r1 = 1
            goto L1c
        L1a:
            r0 = move-exception
        L1c:
            return r1
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public java.util.List<java.security.cert.Certificate> clean(java.util.List<? extends java.security.cert.Certificate> r11, java.lang.String r12) throws javax.net.ssl.SSLPeerUnverifiedException {
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            java.util.Deque r0 = (java.util.Deque) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r0.removeFirst()
            java.lang.String r3 = "queue.removeFirst()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.add(r2)
            r2 = 0
            r3 = 0
        L29:
            r4 = 9
            if (r3 >= r4) goto La2
            int r4 = r1.size()
            r5 = 1
            int r4 = r4 - r5
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r6 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r6)
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            okhttp3.internal.tls.TrustRootIndex r7 = r10.trustRootIndex
            java.security.cert.X509Certificate r7 = r7.findByIssuerAndSignature(r4)
            if (r7 == 0) goto L5e
            int r6 = r1.size()
            if (r6 > r5) goto L52
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r7)
            if (r5 != 0) goto L55
        L52:
            r1.add(r7)
        L55:
            boolean r5 = r10.verifySignature(r7, r7)
            if (r5 == 0) goto L5c
            return r1
        L5c:
            r2 = 1
            goto L83
        L5e:
            java.util.Iterator r5 = r0.iterator()
            java.lang.String r8 = "queue.iterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
        L67:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L86
            java.lang.Object r8 = r5.next()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r6)
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            boolean r9 = r10.verifySignature(r4, r8)
            if (r9 == 0) goto L67
            r5.remove()
            r1.add(r8)
        L83:
            int r3 = r3 + 1
            goto L29
        L86:
            if (r2 == 0) goto L89
            return r1
        L89:
            javax.net.ssl.SSLPeerUnverifiedException r6 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Failed to find a trusted cert that signed "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r4)
            java.lang.String r8 = r8.toString()
            r6.<init>(r8)
            throw r6
        La2:
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Certificate chain too long: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            goto L17
        L4:
            boolean r1 = r4 instanceof okhttp3.internal.tls.BasicCertificateChainCleaner
            if (r1 == 0) goto L16
            r1 = r4
            okhttp3.internal.tls.BasicCertificateChainCleaner r1 = (okhttp3.internal.tls.BasicCertificateChainCleaner) r1
            okhttp3.internal.tls.TrustRootIndex r1 = r1.trustRootIndex
            okhttp3.internal.tls.TrustRootIndex r2 = r3.trustRootIndex
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public int hashCode() {
            r1 = this;
            okhttp3.internal.tls.TrustRootIndex r0 = r1.trustRootIndex
            int r0 = r0.hashCode()
            return r0
    }
}
