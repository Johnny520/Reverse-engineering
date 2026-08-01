package okhttp3.internal.tls;

/* JADX INFO: compiled from: BasicTrustRootIndex.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m115d2 = {"Lokhttp3/internal/tls/BasicTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "caCerts", "", "Ljava/security/cert/X509Certificate;", "([Ljava/security/cert/X509Certificate;)V", "subjectToCaCerts", "", "Ljavax/security/auth/x500/X500Principal;", "", "equals", "", "other", "", "findByIssuerAndSignature", "cert", "hashCode", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class BasicTrustRootIndex implements okhttp3.internal.tls.TrustRootIndex {
    private final java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> subjectToCaCerts;

    public BasicTrustRootIndex(java.security.cert.X509Certificate... r11) {
            r10 = this;
            java.lang.String r0 = "caCerts"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r10.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            int r1 = r11.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L3f
            r3 = r11[r2]
            javax.security.auth.x500.X500Principal r4 = r3.getSubjectX500Principal()
            java.lang.String r5 = "caCert.subjectX500Principal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r5 = r0
            r6 = 0
            java.lang.Object r7 = r5.get(r4)
            if (r7 != 0) goto L35
            r8 = 0
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.Set r9 = (java.util.Set) r9
            r8 = r9
            r5.put(r4, r8)
            goto L36
        L35:
            r8 = r7
        L36:
            java.util.Set r8 = (java.util.Set) r8
            r8.add(r3)
            int r2 = r2 + 1
            goto L12
        L3f:
            r10.subjectToCaCerts = r0
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L16
            boolean r0 = r3 instanceof okhttp3.internal.tls.BasicTrustRootIndex
            if (r0 == 0) goto L14
            r0 = r3
            okhttp3.internal.tls.BasicTrustRootIndex r0 = (okhttp3.internal.tls.BasicTrustRootIndex) r0
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r0 = r0.subjectToCaCerts
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r1 = r2.subjectToCaCerts
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            return r0
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate r12) {
            r11 = this;
            java.lang.String r0 = "cert"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            javax.security.auth.x500.X500Principal r0 = r12.getIssuerX500Principal()
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r1 = r11.subjectToCaCerts
            java.lang.Object r1 = r1.get(r0)
            java.util.Set r1 = (java.util.Set) r1
            r2 = 0
            if (r1 != 0) goto L15
            return r2
        L15:
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
        L1d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3c
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            r8 = 0
            java.security.PublicKey r9 = r7.getPublicKey()     // Catch: java.lang.Exception -> L35
            r12.verify(r9)     // Catch: java.lang.Exception -> L35
            r9 = 1
            goto L38
        L35:
            r9 = move-exception
            r10 = 0
            r9 = r10
        L38:
            if (r9 == 0) goto L1d
            r2 = r6
            goto L3d
        L3c:
        L3d:
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r0 = r1.subjectToCaCerts
            int r0 = r0.hashCode()
            return r0
    }
}
