package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲁᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0908 extends xhss.AbstractC0485 {

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final javax.net.ssl.X509TrustManager f2937;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final android.net.http.X509TrustManagerExtensions f2938;

    public C0908(javax.net.ssl.X509TrustManager r1, android.net.http.X509TrustManagerExtensions r2) {
            r0 = this;
            r0.<init>()
            r0.f2937 = r1
            r0.f2938 = r2
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof xhss.C0908
            if (r0 == 0) goto Le
            xhss.ᲀᲁᲁᛲ r2 = (xhss.C0908) r2
            javax.net.ssl.X509TrustManager r2 = r2.f2937
            javax.net.ssl.X509TrustManager r1 = r1.f2937
            if (r2 != r1) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            javax.net.ssl.X509TrustManager r0 = r0.f2937
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // xhss.AbstractC0485
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.util.List mo892(java.util.List r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            java.security.cert.X509Certificate[] r2 = (java.security.cert.X509Certificate[]) r2
            android.net.http.X509TrustManagerExtensions r1 = r1.f2938     // Catch: java.security.cert.CertificateException -> L12
            java.lang.String r0 = "RSA"
            java.util.List r1 = r1.checkServerTrusted(r2, r0, r3)     // Catch: java.security.cert.CertificateException -> L12
            return r1
        L12:
            r1 = move-exception
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r3 = r1.getMessage()
            r2.<init>(r3)
            r2.initCause(r1)
            throw r2
    }
}
