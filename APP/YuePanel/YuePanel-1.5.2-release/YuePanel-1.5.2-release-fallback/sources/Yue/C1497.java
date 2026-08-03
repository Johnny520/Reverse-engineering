package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nConscryptSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,64:1\n37#2,2:65\n*S KotlinDebug\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n*L\n51#1:65,2\n*E\n"})
public final class C1497 implements Yue.InterfaceC5818 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1497.C1499 f4660 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1799.InterfaceC1800 f4661 = null;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۨۡ$ۥ, reason: contains not printable characters */
    public static final class C1498 implements Yue.C1799.InterfaceC1800 {
        public C1498() {
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
                Yue.ۥ۟ۦۨ۠$ۥ r0 = Yue.C1494.f4656
                boolean r0 = r0.m7364()
                if (r0 == 0) goto L15
                boolean r2 = org.conscrypt.Conscrypt.isConscrypt(r2)
                if (r2 == 0) goto L15
                r2 = 1
                goto L16
            L15:
                r2 = 0
            L16:
                return r2
        }

        @Override // Yue.C1799.InterfaceC1800
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟ */
        public Yue.InterfaceC5818 mo1438(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
                r1 = this;
                java.lang.String r0 = "sslSocket"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥ۟ۦۨۡ r2 = new Yue.ۥ۟ۦۨۡ
                r2.<init>()
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۨۡ$ۥ۟, reason: contains not printable characters */
    public static final class C1499 {
        public C1499() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C1499(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C1799.InterfaceC1800 m7368() {
                r1 = this;
                Yue.ۥ۟ۨۧۧ$ۥ r0 = Yue.C1497.m7367()
                return r0
        }
    }

    static {
            Yue.ۥ۟ۦۨۡ$ۥ۟ r0 = new Yue.ۥ۟ۦۨۡ$ۥ۟
            r1 = 0
            r0.<init>(r1)
            Yue.C1497.f4660 = r0
            Yue.ۥ۟ۦۨۡ$ۥ r0 = new Yue.ۥ۟ۦۨۡ$ۥ
            r0.<init>()
            Yue.C1497.f4661 = r0
            return
    }

    public C1497() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C1799.InterfaceC1800 m7367() {
            Yue.ۥ۟ۨۧۧ$ۥ r0 = Yue.C1497.f4661
            return r0
    }

    @Override // Yue.InterfaceC5818
    public boolean isSupported() {
            r1 = this;
            Yue.ۥ۟ۦۨ۠$ۥ r0 = Yue.C1494.f4656
            boolean r0 = r0.m7364()
            return r0
    }

    @Override // Yue.InterfaceC5818
    /* JADX INFO: renamed from: ۥ */
    public boolean mo1400(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            boolean r2 = org.conscrypt.Conscrypt.isConscrypt(r2)
            return r2
    }

    @Override // Yue.InterfaceC5818
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟ */
    public java.lang.String mo1401(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.mo1400(r2)
            if (r0 == 0) goto L10
            java.lang.String r2 = org.conscrypt.Conscrypt.getApplicationProtocol(r2)
            goto L11
        L10:
            r2 = 0
        L11:
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
    public void mo1404(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r1, @Yue.InterfaceC4543 java.lang.String r2, @Yue.InterfaceC4418 java.util.List<? extends Yue.EnumC4981> r3) {
            r0 = this;
            java.lang.String r2 = "sslSocket"
            Yue.C3329.m13906(r1, r2)
            java.lang.String r2 = "protocols"
            Yue.C3329.m13906(r3, r2)
            boolean r2 = r0.mo1400(r1)
            if (r2 == 0) goto L26
            r2 = 1
            org.conscrypt.Conscrypt.setUseSessionTickets(r1, r2)
            Yue.ۥۡۤۡۢ$ۥ r2 = Yue.C4773.f15123
            java.util.List r2 = r2.m19016(r3)
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            org.conscrypt.Conscrypt.setApplicationProtocols(r1, r2)
        L26:
            return
    }
}
