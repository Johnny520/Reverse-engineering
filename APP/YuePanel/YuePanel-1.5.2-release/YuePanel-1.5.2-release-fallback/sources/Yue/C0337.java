package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC6064
@Yue.InterfaceC5840({"SMAP\nAndroidCertificateChainCleaner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n37#2,2:75\n1#3:77\n*S KotlinDebug\n*F\n+ 1 AndroidCertificateChainCleaner.kt\nokhttp3/internal/platform/android/AndroidCertificateChainCleaner\n*L\n43#1:75,2\n*E\n"})
public final class C0337 extends Yue.AbstractC0958 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0337.C0338 f752 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final javax.net.ssl.X509TrustManager f753;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final android.net.http.X509TrustManagerExtensions f754;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۤۦ$ۥ, reason: contains not printable characters */
    public static final class C0338 {
        public C0338() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0338(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC6064
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C0337 m1408(@Yue.InterfaceC4418 javax.net.ssl.X509TrustManager r3) {
                r2 = this;
                java.lang.String r0 = "trustManager"
                Yue.C3329.m13906(r3, r0)
                r0 = 0
                android.net.http.X509TrustManagerExtensions r1 = new android.net.http.X509TrustManagerExtensions     // Catch: java.lang.IllegalArgumentException -> Lc
                r1.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> Lc
                goto Ld
            Lc:
                r1 = r0
            Ld:
                if (r1 == 0) goto L14
                Yue.ۥ۟۠ۤۦ r0 = new Yue.ۥ۟۠ۤۦ
                r0.<init>(r3, r1)
            L14:
                return r0
        }
    }

    static {
            Yue.ۥ۟۠ۤۦ$ۥ r0 = new Yue.ۥ۟۠ۤۦ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C0337.f752 = r0
            return
    }

    public C0337(@Yue.InterfaceC4418 javax.net.ssl.X509TrustManager r2, @Yue.InterfaceC4418 android.net.http.X509TrustManagerExtensions r3) {
            r1 = this;
            java.lang.String r0 = "trustManager"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "x509TrustManagerExtensions"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f753 = r2
            r1.f754 = r3
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C0337
            if (r0 == 0) goto Le
            Yue.ۥ۟۠ۤۦ r2 = (Yue.C0337) r2
            javax.net.ssl.X509TrustManager r2 = r2.f753
            javax.net.ssl.X509TrustManager r0 = r1.f753
            if (r2 != r0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public int hashCode() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.f753
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // Yue.AbstractC0958
    @Yue.InterfaceC4418
    @Yue.InterfaceC6064
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.util.List<java.security.cert.Certificate> mo1407(@Yue.InterfaceC4418 java.util.List<? extends java.security.cert.Certificate> r3, @Yue.InterfaceC4418 java.lang.String r4) throws javax.net.ssl.SSLPeerUnverifiedException {
            r2 = this;
            java.lang.String r0 = "chain"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "hostname"
            Yue.C3329.m13906(r4, r0)
            r0 = 0
            java.security.cert.X509Certificate[] r0 = new java.security.cert.X509Certificate[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.security.cert.X509Certificate[] r3 = (java.security.cert.X509Certificate[]) r3
            android.net.http.X509TrustManagerExtensions r0 = r2.f754     // Catch: java.security.cert.CertificateException -> L21
            java.lang.String r1 = "RSA"
            java.util.List r3 = r0.checkServerTrusted(r3, r1, r4)     // Catch: java.security.cert.CertificateException -> L21
            java.lang.String r4 = "x509TrustManagerExtensio…ficates, \"RSA\", hostname)"
            Yue.C3329.m13905(r3, r4)     // Catch: java.security.cert.CertificateException -> L21
            return r3
        L21:
            r3 = move-exception
            javax.net.ssl.SSLPeerUnverifiedException r4 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.String r0 = r3.getMessage()
            r4.<init>(r0)
            r4.initCause(r3)
            throw r4
    }
}
