package okhttp3.internal.tls;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CertificateChainCleaner {
    public static final okhttp3.internal.tls.CertificateChainCleaner.Companion Companion = null;

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

        public final okhttp3.internal.tls.CertificateChainCleaner get(javax.net.ssl.X509TrustManager r2) {
                r1 = this;
                r2.getClass()
                okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r0 = r0.get()
                okhttp3.internal.tls.CertificateChainCleaner r2 = r0.buildCertificateChainCleaner(r2)
                return r2
        }

        public final okhttp3.internal.tls.CertificateChainCleaner get(java.security.cert.X509Certificate... r4) {
                r3 = this;
                r4.getClass()
                okhttp3.internal.tls.BasicCertificateChainCleaner r0 = new okhttp3.internal.tls.BasicCertificateChainCleaner
                okhttp3.internal.tls.BasicTrustRootIndex r1 = new okhttp3.internal.tls.BasicTrustRootIndex
                int r2 = r4.length
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
                java.security.cert.X509Certificate[] r4 = (java.security.cert.X509Certificate[]) r4
                r1.<init>(r4)
                r0.<init>(r1)
                return r0
        }
    }

    static {
            okhttp3.internal.tls.CertificateChainCleaner$Companion r0 = new okhttp3.internal.tls.CertificateChainCleaner$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.tls.CertificateChainCleaner.Companion = r0
            return
    }

    public CertificateChainCleaner() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.util.List<java.security.cert.Certificate> clean(java.util.List<? extends java.security.cert.Certificate> r1, java.lang.String r2);
}
