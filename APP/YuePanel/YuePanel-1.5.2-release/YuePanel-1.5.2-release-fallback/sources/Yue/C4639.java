package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nOpenJSSEPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenJSSEPlatform.kt\nokhttp3/internal/platform/OpenJSSEPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n37#2,2:102\n*S KotlinDebug\n*F\n+ 1 OpenJSSEPlatform.kt\nokhttp3/internal/platform/OpenJSSEPlatform\n*L\n68#1:102,2\n*E\n"})
public final class C4639 extends Yue.C4773 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4639.C4640 f14786 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean f14787 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.security.Provider f14788;

    /* JADX INFO: renamed from: Yue.ۥۣۣۡۧ$ۥ, reason: contains not printable characters */
    public static final class C4640 {
        public C4640() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C4640(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C4639 m18465() {
                r2 = this;
                boolean r0 = r2.m18466()
                r1 = 0
                if (r0 == 0) goto Ld
                Yue.ۥۣۣۡۧ r0 = new Yue.ۥۣۣۡۧ
                r0.<init>(r1)
                r1 = r0
            Ld:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean m18466() {
                r1 = this;
                boolean r0 = Yue.C4639.m18464()
                return r0
        }
    }

    static {
            Yue.ۥۣۣۡۧ$ۥ r0 = new Yue.ۥۣۣۡۧ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C4639.f14786 = r0
            r1 = 0
            java.lang.String r2 = "org.openjsse.net.ssl.OpenJSSE"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L17
            java.lang.Class.forName(r2, r1, r0)     // Catch: java.lang.ClassNotFoundException -> L17
            r1 = 1
        L17:
            Yue.C4639.f14787 = r1
            return
    }

    public C4639() {
            r1 = this;
            r1.<init>()
            org.openjsse.net.ssl.OpenJSSE r0 = new org.openjsse.net.ssl.OpenJSSE
            r0.<init>()
            java.security.Provider r0 = (java.security.Provider) r0
            r1.f14788 = r0
            return
    }

    public /* synthetic */ C4639(Yue.C1769 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ boolean m18464() {
            boolean r0 = Yue.C4639.f14787
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
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public javax.net.ssl.SSLContext mo4767() {
            r2 = this;
            java.lang.String r0 = "TLSv1.3"
            java.security.Provider r1 = r2.f14788
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0, r1)
            java.lang.String r1 = "getInstance(\"TLSv1.3\", provider)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public javax.net.ssl.X509TrustManager mo4768() {
            r3 = this;
            java.lang.String r0 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()
            java.security.Provider r1 = r3.f14788
            javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance(r0, r1)
            r1 = 0
            r0.init(r1)
            javax.net.ssl.TrustManager[] r0 = r0.getTrustManagers()
            Yue.C3329.m13903(r0)
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L28
            r1 = 0
            r1 = r0[r1]
            boolean r2 = r1 instanceof javax.net.ssl.X509TrustManager
            if (r2 == 0) goto L28
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"
            Yue.C3329.m13904(r1, r0)
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
            return r1
        L28:
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
            java.lang.String r0 = "clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE"
            r2.<init>(r0)
            throw r2
    }
}
