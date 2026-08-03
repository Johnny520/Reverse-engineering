package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nConscryptPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,141:1\n37#2,2:142\n*S KotlinDebug\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n*L\n89#1:142,2\n*E\n"})
public final class C1494 extends Yue.C4773 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1494.C1495 f4656 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean f4657 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.security.Provider f4658;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۨ۠$ۥ, reason: contains not printable characters */
    public static final class C1495 {
        public C1495() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C1495(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m7361(Yue.C1494.C1495 r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
                r6 = r5 & 2
                r0 = 0
                if (r6 == 0) goto L6
                r3 = r0
            L6:
                r5 = r5 & 4
                if (r5 == 0) goto Lb
                r4 = r0
            Lb:
                boolean r1 = r1.m7362(r2, r3, r4)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final boolean m7362(int r5, int r6, int r7) {
                r4 = this;
                org.conscrypt.Conscrypt$Version r0 = org.conscrypt.Conscrypt.version()
                int r1 = r0.major()
                r2 = 0
                r3 = 1
                if (r1 == r5) goto L14
                int r6 = r0.major()
                if (r6 <= r5) goto L13
                r2 = r3
            L13:
                return r2
            L14:
                int r5 = r0.minor()
                if (r5 == r6) goto L22
                int r5 = r0.minor()
                if (r5 <= r6) goto L21
                r2 = r3
            L21:
                return r2
            L22:
                int r5 = r0.patch()
                if (r5 < r7) goto L29
                r2 = r3
            L29:
                return r2
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C1494 m7363() {
                r2 = this;
                boolean r0 = r2.m7364()
                r1 = 0
                if (r0 == 0) goto Ld
                Yue.ۥ۟ۦۨ۠ r0 = new Yue.ۥ۟ۦۨ۠
                r0.<init>(r1)
                r1 = r0
            Ld:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m7364() {
                r1 = this;
                boolean r0 = Yue.C1494.m7359()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۨ۠$ۥ۟, reason: contains not printable characters */
    public static final class C1496 implements org.conscrypt.ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public static final Yue.C1494.C1496 f4659 = null;

        static {
                Yue.ۥ۟ۦۨ۠$ۥ۟ r0 = new Yue.ۥ۟ۦۨ۠$ۥ۟
                r0.<init>()
                Yue.C1494.C1496.f4659 = r0
                return
        }

        public C1496() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final boolean m7365(@Yue.InterfaceC4543 java.lang.String r1, @Yue.InterfaceC4543 javax.net.ssl.SSLSession r2) {
                r0 = this;
                r1 = 1
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean m7366(@Yue.InterfaceC4543 java.security.cert.X509Certificate[] r1, @Yue.InterfaceC4543 java.lang.String r2, @Yue.InterfaceC4543 javax.net.ssl.SSLSession r3) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    static {
            Yue.ۥ۟ۦۨ۠$ۥ r0 = new Yue.ۥ۟ۦۨ۠$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C1494.f4656 = r0
            r1 = 0
            java.lang.String r2 = "org.conscrypt.Conscrypt$Version"
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L25
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L25
            java.lang.Class.forName(r2, r1, r3)     // Catch: java.lang.Throwable -> L25
            boolean r2 = org.conscrypt.Conscrypt.isAvailable()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L25
            r2 = 2
            r3 = 1
            boolean r0 = r0.m7362(r2, r3, r1)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L25
            r1 = r3
        L25:
            Yue.C1494.f4657 = r1
            return
    }

    public C1494() {
            r2 = this;
            r2.<init>()
            java.security.Provider r0 = org.conscrypt.Conscrypt.newProvider()
            java.lang.String r1 = "newProvider()"
            Yue.C3329.m13905(r0, r1)
            r2.f4658 = r0
            return
    }

    public /* synthetic */ C1494(Yue.C1769 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ boolean m7359() {
            boolean r0 = Yue.C1494.f4657
            return r0
    }

    @Override // Yue.C4773
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo1392(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2, @Yue.InterfaceC4543 java.lang.String r3, @Yue.InterfaceC4418 java.util.List<Yue.EnumC4981> r4) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "protocols"
            Yue.C3329.m13906(r4, r0)
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r2)
            if (r0 == 0) goto L27
            r3 = 1
            org.conscrypt.Conscrypt.setUseSessionTickets(r2, r3)
            Yue.ۥۡۤۡۢ$ۥ r3 = Yue.C4773.f15123
            java.util.List r3 = r3.m19016(r4)
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.lang.String[] r3 = (java.lang.String[]) r3
            org.conscrypt.Conscrypt.setApplicationProtocols(r2, r3)
            goto L2a
        L27:
            super.mo1392(r2, r3, r4)
        L2a:
            return
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public java.lang.String mo1393(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = org.conscrypt.Conscrypt.isConscrypt(r2)
            if (r0 == 0) goto L10
            java.lang.String r2 = org.conscrypt.Conscrypt.getApplicationProtocol(r2)
            goto L14
        L10:
            java.lang.String r2 = super.mo1393(r2)
        L14:
            return r2
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public javax.net.ssl.SSLContext mo4767() {
            r2 = this;
            java.lang.String r0 = "TLS"
            java.security.Provider r1 = r2.f4658
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0, r1)
            java.lang.String r1 = "getInstance(\"TLS\", provider)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public javax.net.ssl.SSLSocketFactory mo7360(@Yue.InterfaceC4418 javax.net.ssl.X509TrustManager r5) {
            r4 = this;
            java.lang.String r0 = "trustManager"
            Yue.C3329.m13906(r5, r0)
            javax.net.ssl.SSLContext r0 = r4.mo4767()
            r1 = 0
            r2 = 1
            javax.net.ssl.TrustManager[] r2 = new javax.net.ssl.TrustManager[r2]
            r3 = 0
            r2[r3] = r5
            r0.init(r1, r2, r1)
            javax.net.ssl.SSLSocketFactory r5 = r0.getSocketFactory()
            java.lang.String r0 = "newSSLContext().apply {\n…null)\n    }.socketFactory"
            Yue.C3329.m13905(r5, r0)
            return r5
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public javax.net.ssl.X509TrustManager mo4768() {
            r3 = this;
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0)
            r1 = 0
            r0.init(r1)
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
            Yue.C3329.m13903(r0)
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L2d
            r1 = 0
            r1 = r0[r1]
            boolean r2 = r1 instanceof javax.net.ssl.X509TrustManager
            if (r2 == 0) goto L2d
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
            Yue.C3329.m13904(r1, r0)
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
            Yue.ۥ۟ۦۨ۠$ۥ۟ r0 = Yue.C1494.C1496.f4659
            org.conscrypt.ConscryptHostnameVerifier r0 = (org.conscrypt.ConscryptHostnameVerifier) r0
            org.conscrypt.Conscrypt.setHostnameVerifier(r1, r0)
            return r1
        L2d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected default trust managers: "
            r1.append(r2)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r2 = "toString(this)"
            Yue.C3329.m13905(r0, r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public javax.net.ssl.X509TrustManager mo1395(@Yue.InterfaceC4418 javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            java.lang.String r0 = "sslSocketFactory"
            Yue.C3329.m13906(r2, r0)
            r2 = 0
            return r2
    }
}
