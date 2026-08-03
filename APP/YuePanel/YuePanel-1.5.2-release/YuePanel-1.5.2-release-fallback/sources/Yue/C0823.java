package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nBouncyCastlePlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BouncyCastlePlatform.kt\nokhttp3/internal/platform/BouncyCastlePlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,97:1\n37#2,2:98\n*S KotlinDebug\n*F\n+ 1 BouncyCastlePlatform.kt\nokhttp3/internal/platform/BouncyCastlePlatform\n*L\n65#1:98,2\n*E\n"})
public final class C0823 extends Yue.C4773 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0823.C0824 f2336 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean f2337 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.security.Provider f2338;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۨ$ۥ, reason: contains not printable characters */
    public static final class C0824 {
        public C0824() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0824(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C0823 m4769() {
                r2 = this;
                boolean r0 = r2.m4770()
                r1 = 0
                if (r0 == 0) goto Ld
                Yue.ۥۣ۟ۡۨ r0 = new Yue.ۥۣ۟ۡۨ
                r0.<init>(r1)
                r1 = r0
            Ld:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean m4770() {
                r1 = this;
                boolean r0 = Yue.C0823.m4766()
                return r0
        }
    }

    static {
            Yue.ۥۣ۟ۡۨ$ۥ r0 = new Yue.ۥۣ۟ۡۨ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C0823.f2336 = r0
            r1 = 0
            java.lang.String r2 = "org.bouncycastle.jsse.provider.BouncyCastleJsseProvider"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.Class.forName(r2, r1, r0)     // Catch: java.lang.ClassNotFoundException -> L17
            r1 = 1
        L17:
            Yue.C0823.f2337 = r1
            return
    }

    public C0823() {
            r1 = this;
            r1.<init>()
            org.bouncycastle.jsse.provider.BouncyCastleJsseProvider r0 = new org.bouncycastle.jsse.provider.BouncyCastleJsseProvider
            r0.<init>()
            java.security.Provider r0 = (java.security.Provider) r0
            r1.f2338 = r0
            return
    }

    public /* synthetic */ C0823(Yue.C1769 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ boolean m4766() {
            boolean r0 = Yue.C0823.f2337
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
            super.mo1392(r2, r3, r4)
            return
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public java.lang.String mo1393(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = super.mo1393(r2)
            return r2
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public javax.net.ssl.SSLContext mo4767() {
            r2 = this;
            java.lang.String r0 = "TLS"
            java.security.Provider r1 = r2.f2338
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0, r1)
            java.lang.String r1 = "getInstance(\"TLS\", provider)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public javax.net.ssl.X509TrustManager mo4768() {
            r3 = this;
            java.lang.String r0 = "PKIX"
            java.lang.String r1 = "BCJSSE"
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0, r1)
            r1 = 0
            r0.init(r1)
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
            Yue.C3329.m13903(r0)
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L26
            r1 = 0
            r1 = r0[r1]
            boolean r2 = r1 instanceof javax.net.ssl.X509TrustManager
            if (r2 == 0) goto L26
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
            Yue.C3329.m13904(r1, r0)
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
            return r1
        L26:
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
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with BouncyCastle"
            r2.<init>(r0)
            throw r2
    }
}
