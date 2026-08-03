package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nBouncyCastleSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,68:1\n37#2,2:69\n*S KotlinDebug\n*F\n+ 1 BouncyCastleSocketAdapter.kt\nokhttp3/internal/platform/android/BouncyCastleSocketAdapter\n*L\n53#1:69,2\n*E\n"})
public final class C0825 implements Yue.InterfaceC5818 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0825.C0827 f2339 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1799.InterfaceC1800 f2340 = null;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢ$ۥ, reason: contains not printable characters */
    public static final class C0826 implements Yue.C1799.InterfaceC1800 {
        public C0826() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.C1799.InterfaceC1800
        /* JADX INFO: renamed from: ۥ */
        public boolean mo1437(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
                r1 = this;
                java.lang.String r0 = "sslSocket"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥۣ۟ۡۨ$ۥ r2 = Yue.C0823.f2336
                boolean r2 = r2.m4770()
                r2 = 0
                return r2
        }

        @Override // Yue.C1799.InterfaceC1800
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟ */
        public Yue.InterfaceC5818 mo1438(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
                r1 = this;
                java.lang.String r0 = "sslSocket"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥۣ۟ۢ r2 = new Yue.ۥۣ۟ۢ
                r2.<init>()
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢ$ۥ۟, reason: contains not printable characters */
    public static final class C0827 {
        public C0827() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0827(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C1799.InterfaceC1800 m4772() {
                r1 = this;
                Yue.ۥ۟ۨۧۧ$ۥ r0 = Yue.C0825.m4771()
                return r0
        }
    }

    static {
            Yue.ۥۣ۟ۢ$ۥ۟ r0 = new Yue.ۥۣ۟ۢ$ۥ۟
            r1 = 0
            r0.<init>(r1)
            Yue.C0825.f2339 = r0
            Yue.ۥۣ۟ۢ$ۥ r0 = new Yue.ۥۣ۟ۢ$ۥ
            r0.<init>()
            Yue.C0825.f2340 = r0
            return
    }

    public C0825() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C1799.InterfaceC1800 m4771() {
            Yue.ۥ۟ۨۧۧ$ۥ r0 = Yue.C0825.f2340
            return r0
    }

    @Override // Yue.InterfaceC5818
    public boolean isSupported() {
            r1 = this;
            Yue.ۥۣ۟ۡۨ$ۥ r0 = Yue.C0823.f2336
            boolean r0 = r0.m4770()
            return r0
    }

    @Override // Yue.InterfaceC5818
    /* JADX INFO: renamed from: ۥ */
    public boolean mo1400(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            r2 = 0
            return r2
    }

    @Override // Yue.InterfaceC5818
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟ */
    public java.lang.String mo1401(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            org.bouncycastle.jsse.BCSSLSocket r2 = (org.bouncycastle.jsse.BCSSLSocket) r2
            java.lang.String r2 = r2.getApplicationProtocol()
            if (r2 != 0) goto Lf
            r0 = 1
            goto L15
        Lf:
            java.lang.String r0 = ""
            boolean r0 = Yue.C3329.m13897(r2, r0)
        L15:
            if (r0 == 0) goto L18
            r2 = 0
        L18:
            return r2
    }

    @Override // Yue.InterfaceC5818
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ */
    public javax.net.ssl.X509TrustManager mo1402(@Yue.InterfaceC4418 javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            javax.net.ssl.X509TrustManager r1 = Yue.InterfaceC5818.C5819.m21665(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC5818
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo1403(@Yue.InterfaceC4418 javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            boolean r1 = Yue.InterfaceC5818.C5819.m21664(r0, r1)
            return r1
    }

    @Override // Yue.InterfaceC5818
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo1404(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2, @Yue.InterfaceC4543 java.lang.String r3, @Yue.InterfaceC4418 java.util.List<? extends Yue.EnumC4981> r4) {
            r1 = this;
            java.lang.String r3 = "sslSocket"
            Yue.C3329.m13906(r2, r3)
            java.lang.String r3 = "protocols"
            Yue.C3329.m13906(r4, r3)
            boolean r3 = r1.mo1400(r2)
            if (r3 == 0) goto L2b
            org.bouncycastle.jsse.BCSSLSocket r2 = (org.bouncycastle.jsse.BCSSLSocket) r2
            org.bouncycastle.jsse.BCSSLParameters r3 = r2.getParameters()
            Yue.ۥۡۤۡۢ$ۥ r0 = Yue.C4773.f15123
            java.util.List r4 = r0.m19016(r4)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.setApplicationProtocols(r4)
            r2.setParameters(r3)
        L2b:
            return
    }
}
