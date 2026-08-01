package defpackage;

/* JADX INFO: renamed from: ᛴᛸᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0741 extends defpackage.AbstractC2193 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final javax.net.ssl.X509TrustManager f3495;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final android.net.http.X509TrustManagerExtensions f3496;

    public C0741(javax.net.ssl.X509TrustManager r1, android.net.http.X509TrustManagerExtensions r2) {
            r0 = this;
            r0.<init>()
            r0.f3495 = r1
            r0.f3496 = r2
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C0741
            if (r0 == 0) goto Le
            ᛴᛸᲈᛷ r2 = (defpackage.C0741) r2
            javax.net.ssl.X509TrustManager r2 = r2.f3495
            javax.net.ssl.X509TrustManager r1 = r1.f3495
            if (r2 != r1) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            javax.net.ssl.X509TrustManager r0 = r0.f3495
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // defpackage.AbstractC2193
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final java.util.List mo1625(java.util.List r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            java.security.cert.X509Certificate[] r2 = (java.security.cert.X509Certificate[]) r2
            android.net.http.X509TrustManagerExtensions r1 = r1.f3496     // Catch: java.security.cert.CertificateException -> L12
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
