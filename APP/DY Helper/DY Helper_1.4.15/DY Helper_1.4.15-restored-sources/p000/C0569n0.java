package p000;

/* JADX INFO: renamed from: n0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0569n0 extends p000.AbstractC0073bd {

    /* JADX INFO: renamed from: υ */
    public final javax.net.ssl.X509TrustManager f7337;

    /* JADX INFO: renamed from: φ */
    public final android.net.http.X509TrustManagerExtensions f7338;

    public C0569n0(javax.net.ssl.X509TrustManager r1, android.net.http.X509TrustManagerExtensions r2) {
            r0 = this;
            r0.<init>()
            r0.f7337 = r1
            r0.f7338 = r2
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.C0569n0
            if (r0 == 0) goto Le
            n0 r2 = (p000.C0569n0) r2
            javax.net.ssl.X509TrustManager r2 = r2.f7337
            javax.net.ssl.X509TrustManager r1 = r1.f7337
            if (r2 != r1) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            javax.net.ssl.X509TrustManager r0 = r0.f7337
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // p000.AbstractC0073bd
    /* JADX INFO: renamed from: θ */
    public final java.util.List mo904(java.lang.String r2, java.util.List r3) {
            r1 = this;
            r3.getClass()
            r2.getClass()
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            android.net.http.X509TrustManagerExtensions r1 = r1.f7338     // Catch: java.security.cert.CertificateException -> L1b
            java.lang.String r0 = "RSA"
            java.util.List r1 = r1.checkServerTrusted(r3, r0, r2)     // Catch: java.security.cert.CertificateException -> L1b
            r1.getClass()     // Catch: java.security.cert.CertificateException -> L1b
            return r1
        L1b:
            r1 = move-exception
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r3 = r1.getMessage()
            r2.<init>(r3)
            r2.initCause(r1)
            throw r2
    }
}
