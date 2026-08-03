package okhttp3.internal.tls;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface TrustRootIndex {
    java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate r1);
}
