package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5915 extends Yue.C0348 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5915.C5916 f21583 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Class<? super javax.net.ssl.SSLSocketFactory> f21584;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Class<?> f21585;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۨ$ۥ, reason: contains not printable characters */
    public static final class C5916 {
        public C5916() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5916(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ Yue.InterfaceC5818 m21968(Yue.C5915.C5916 r0, java.lang.String r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L6
                java.lang.String r1 = "com.android.org.conscrypt"
            L6:
                Yue.ۥۢ۟ۢۢ r0 = r0.m21969(r1)
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.InterfaceC5818 m21969(@Yue.InterfaceC4418 java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "packageName"
                Yue.C3329.m13906(r5, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L59
                r0.<init>()     // Catch: java.lang.Exception -> L59
                r0.append(r5)     // Catch: java.lang.Exception -> L59
                java.lang.String r1 = ".OpenSSLSocketImpl"
                r0.append(r1)     // Catch: java.lang.Exception -> L59
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L59
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L59
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>"
                Yue.C3329.m13904(r0, r1)     // Catch: java.lang.Exception -> L59
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L59
                r1.<init>()     // Catch: java.lang.Exception -> L59
                r1.append(r5)     // Catch: java.lang.Exception -> L59
                java.lang.String r2 = ".OpenSSLSocketFactoryImpl"
                r1.append(r2)     // Catch: java.lang.Exception -> L59
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L59
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L59
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>"
                Yue.C3329.m13904(r1, r2)     // Catch: java.lang.Exception -> L59
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L59
                r2.<init>()     // Catch: java.lang.Exception -> L59
                r2.append(r5)     // Catch: java.lang.Exception -> L59
                java.lang.String r5 = ".SSLParametersImpl"
                r2.append(r5)     // Catch: java.lang.Exception -> L59
                java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L59
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L59
                Yue.ۥۢ۟ۨ r2 = new Yue.ۥۢ۟ۨ     // Catch: java.lang.Exception -> L59
                java.lang.String r3 = "paramsClass"
                Yue.C3329.m13905(r5, r3)     // Catch: java.lang.Exception -> L59
                r2.<init>(r0, r1, r5)     // Catch: java.lang.Exception -> L59
                goto L67
            L59:
                r5 = move-exception
                Yue.ۥۡۤۡۢ$ۥ r0 = Yue.C4773.f15123
                Yue.ۥۡۤۡۢ r0 = r0.m19021()
                java.lang.String r1 = "unable to load android socket classes"
                r2 = 5
                r0.m19013(r1, r2, r5)
                r2 = 0
            L67:
                return r2
        }
    }

    static {
            Yue.ۥۢ۟ۨ$ۥ r0 = new Yue.ۥۢ۟ۨ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5915.f21583 = r0
            return
    }

    public C5915(@Yue.InterfaceC4418 java.lang.Class<? super javax.net.ssl.SSLSocket> r2, @Yue.InterfaceC4418 java.lang.Class<? super javax.net.ssl.SSLSocketFactory> r3, @Yue.InterfaceC4418 java.lang.Class<?> r4) {
            r1 = this;
            java.lang.String r0 = "sslSocketClass"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "sslSocketFactoryClass"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "paramClass"
            Yue.C3329.m13906(r4, r0)
            r1.<init>(r2)
            r1.f21584 = r3
            r1.f21585 = r4
            return
    }

    @Override // Yue.C0348, Yue.InterfaceC5818
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ */
    public javax.net.ssl.X509TrustManager mo1402(@Yue.InterfaceC4418 javax.net.ssl.SSLSocketFactory r3) {
            r2 = this;
            java.lang.String r0 = "sslSocketFactory"
            Yue.C3329.m13906(r3, r0)
            java.lang.Class<?> r0 = r2.f21585
            java.lang.String r1 = "sslParameters"
            java.lang.Object r3 = Yue.C6656.m25599(r3, r0, r1)
            Yue.C3329.m13903(r3)
            java.lang.String r0 = "x509TrustManager"
            java.lang.Class<javax.net.ssl.X509TrustManager> r1 = javax.net.ssl.X509TrustManager.class
            java.lang.Object r0 = Yue.C6656.m25599(r3, r1, r0)
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
            if (r0 != 0) goto L25
            java.lang.String r0 = "trustManager"
            java.lang.Object r3 = Yue.C6656.m25599(r3, r1, r0)
            r0 = r3
            javax.net.ssl.X509TrustManager r0 = (javax.net.ssl.X509TrustManager) r0
        L25:
            return r0
    }

    @Override // Yue.C0348, Yue.InterfaceC5818
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo1403(@Yue.InterfaceC4418 javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            java.lang.String r0 = "sslSocketFactory"
            Yue.C3329.m13906(r2, r0)
            java.lang.Class<? super javax.net.ssl.SSLSocketFactory> r0 = r1.f21584
            boolean r2 = r0.isInstance(r2)
            return r2
    }
}
