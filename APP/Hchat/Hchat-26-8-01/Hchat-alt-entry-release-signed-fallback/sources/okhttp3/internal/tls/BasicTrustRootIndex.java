package okhttp3.internal.tls;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class BasicTrustRootIndex implements okhttp3.internal.tls.TrustRootIndex {
    private final java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> subjectToCaCerts;

    public BasicTrustRootIndex(java.security.cert.X509Certificate... r7) {
            r6 = this;
            r7.getClass()
            r6.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L2e
            r3 = r7[r2]
            javax.security.auth.x500.X500Principal r4 = r3.getSubjectX500Principal()
            r4.getClass()
            java.lang.Object r5 = r0.get(r4)
            if (r5 != 0) goto L26
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r0.put(r4, r5)
        L26:
            java.util.Set r5 = (java.util.Set) r5
            r5.add(r3)
            int r2 = r2 + 1
            goto Ld
        L2e:
            r6.subjectToCaCerts = r0
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof okhttp3.internal.tls.BasicTrustRootIndex
            if (r0 == 0) goto L13
            okhttp3.internal.tls.BasicTrustRootIndex r2 = (okhttp3.internal.tls.BasicTrustRootIndex) r2
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r2 = r2.subjectToCaCerts
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r0 = r1.subjectToCaCerts
            boolean r2 = gg.l.a(r2, r0)
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = 0
            return r2
        L15:
            r2 = 1
            return r2
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate r5) {
            r4 = this;
            r5.getClass()
            javax.security.auth.x500.X500Principal r0 = r5.getIssuerX500Principal()
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r1 = r4.subjectToCaCerts
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch: java.lang.Exception -> L19
            r5.verify(r3)     // Catch: java.lang.Exception -> L19
            r1 = r2
        L2e:
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r0 = r1.subjectToCaCerts
            int r0 = r0.hashCode()
            return r0
    }
}
