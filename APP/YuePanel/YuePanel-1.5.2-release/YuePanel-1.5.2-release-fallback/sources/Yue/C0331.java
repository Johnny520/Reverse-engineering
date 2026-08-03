package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC6064
@Yue.InterfaceC5840({"SMAP\nAndroid10Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n766#2:73\n857#2,2:74\n1#3:76\n*S KotlinDebug\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n*L\n43#1:73\n43#1:74,2\n*E\n"})
public final class C0331 extends Yue.C4773 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0331.C0332 f748 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean f749 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<Yue.InterfaceC5818> f750;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۤۢ$ۥ, reason: contains not printable characters */
    public static final class C0332 {
        public C0332() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0332(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C4773 m1396() {
                r1 = this;
                boolean r0 = r1.m1397()
                if (r0 == 0) goto Lc
                Yue.ۥ۟۠ۤۢ r0 = new Yue.ۥ۟۠ۤۢ
                r0.<init>()
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean m1397() {
                r1 = this;
                boolean r0 = Yue.C0331.m1390()
                return r0
        }
    }

    static {
            Yue.ۥ۟۠ۤۢ$ۥ r0 = new Yue.ۥ۟۠ۤۢ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C0331.f748 = r0
            Yue.ۥۡۤۡۢ$ۥ r0 = Yue.C4773.f15123
            boolean r0 = r0.m19022()
            if (r0 == 0) goto L18
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            Yue.C0331.f749 = r0
            return
    }

    public C0331() {
            r6 = this;
            r6.<init>()
            Yue.ۥ۟۠ۤۥ$ۥ r0 = Yue.C0335.f751
            Yue.ۥۢ۟ۢۢ r0 = r0.m1405()
            Yue.ۥ۟ۨۧۧ r1 = new Yue.ۥ۟ۨۧۧ
            Yue.ۥ۟۠ۥۣ$ۥ r2 = Yue.C0348.f844
            Yue.ۥ۟ۨۧۧ$ۥ r2 = r2.m1436()
            r1.<init>(r2)
            Yue.ۥ۟ۨۧۧ r2 = new Yue.ۥ۟ۨۧۧ
            Yue.ۥ۟ۦۨۡ$ۥ۟ r3 = Yue.C1497.f4660
            Yue.ۥ۟ۨۧۧ$ۥ r3 = r3.m7368()
            r2.<init>(r3)
            Yue.ۥ۟ۨۧۧ r3 = new Yue.ۥ۟ۨۧۧ
            Yue.ۥۣ۟ۢ$ۥ۟ r4 = Yue.C0825.f2339
            Yue.ۥ۟ۨۧۧ$ۥ r4 = r4.m4772()
            r3.<init>(r4)
            r4 = 4
            Yue.ۥۢ۟ۢۢ[] r4 = new Yue.InterfaceC5818[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            java.util.List r0 = Yue.C1208.m6219(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L46:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r0.next()
            r3 = r2
            Yue.ۥۢ۟ۢۢ r3 = (Yue.InterfaceC5818) r3
            boolean r3 = r3.isSupported()
            if (r3 == 0) goto L46
            r1.add(r2)
            goto L46
        L5d:
            r6.f750 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ boolean m1390() {
            boolean r0 = Yue.C0331.f749
            return r0
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.AbstractC0958 mo1391(@Yue.InterfaceC4418 javax.net.ssl.X509TrustManager r2) {
            r1 = this;
            java.lang.String r0 = "trustManager"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟۠ۤۦ$ۥ r0 = Yue.C0337.f752
            Yue.ۥ۟۠ۤۦ r0 = r0.m1408(r2)
            if (r0 == 0) goto Le
            goto L12
        Le:
            Yue.ۥ۟ۤ۟ۦ r0 = super.mo1391(r2)
        L12:
            return r0
    }

    @Override // Yue.C4773
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo1392(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r4, @Yue.InterfaceC4543 java.lang.String r5, @Yue.InterfaceC4418 java.util.List<? extends Yue.EnumC4981> r6) {
            r3 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "protocols"
            Yue.C3329.m13906(r6, r0)
            java.util.List<Yue.ۥۢ۟ۢۢ> r0 = r3.f750
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            r2 = r1
            Yue.ۥۢ۟ۢۢ r2 = (Yue.InterfaceC5818) r2
            boolean r2 = r2.mo1400(r4)
            if (r2 == 0) goto L10
            goto L25
        L24:
            r1 = 0
        L25:
            Yue.ۥۢ۟ۢۢ r1 = (Yue.InterfaceC5818) r1
            if (r1 == 0) goto L2c
            r1.mo1404(r4, r5, r6)
        L2c:
            return
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public java.lang.String mo1393(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r5, r0)
            java.util.List<Yue.ۥۢ۟ۢۢ> r0 = r4.f750
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            r3 = r1
            Yue.ۥۢ۟ۢۢ r3 = (Yue.InterfaceC5818) r3
            boolean r3 = r3.mo1400(r5)
            if (r3 == 0) goto Lb
            goto L21
        L20:
            r1 = r2
        L21:
            Yue.ۥۢ۟ۢۢ r1 = (Yue.InterfaceC5818) r1
            if (r1 == 0) goto L29
            java.lang.String r2 = r1.mo1401(r5)
        L29:
            return r2
    }

    @Override // Yue.C4773
    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean mo1394(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "hostname"
            Yue.C3329.m13906(r2, r0)
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r2 = r0.isCleartextTrafficPermitted(r2)
            return r2
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public javax.net.ssl.X509TrustManager mo1395(@Yue.InterfaceC4418 javax.net.ssl.SSLSocketFactory r5) {
            r4 = this;
            java.lang.String r0 = "sslSocketFactory"
            Yue.C3329.m13906(r5, r0)
            java.util.List<Yue.ۥۢ۟ۢۢ> r0 = r4.f750
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            r3 = r1
            Yue.ۥۢ۟ۢۢ r3 = (Yue.InterfaceC5818) r3
            boolean r3 = r3.mo1403(r5)
            if (r3 == 0) goto Lb
            goto L21
        L20:
            r1 = r2
        L21:
            Yue.ۥۢ۟ۢۢ r1 = (Yue.InterfaceC5818) r1
            if (r1 == 0) goto L29
            javax.net.ssl.X509TrustManager r2 = r1.mo1402(r5)
        L29:
            return r2
    }
}
