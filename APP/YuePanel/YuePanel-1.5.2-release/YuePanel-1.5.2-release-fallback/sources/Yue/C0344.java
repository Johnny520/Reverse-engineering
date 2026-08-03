package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC6064
@Yue.InterfaceC5840({"SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1#3:167\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n52#1:164\n52#1:165,2\n*E\n"})
public final class C0344 extends Yue.C4773 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0344.C0345 f760 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean f761 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<Yue.InterfaceC5818> f762;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C1170 f763;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۥۡ$ۥ, reason: contains not printable characters */
    public static final class C0345 {
        public C0345() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0345(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C4773 m1425() {
                r1 = this;
                boolean r0 = r1.m1426()
                if (r0 == 0) goto Lc
                Yue.ۥ۟۠ۥۡ r0 = new Yue.ۥ۟۠ۥۡ
                r0.<init>()
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean m1426() {
                r1 = this;
                boolean r0 = Yue.C0344.m1420()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۥۡ$ۥ۟, reason: contains not printable characters */
    public static final class C0346 implements Yue.InterfaceC6455 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final javax.net.ssl.X509TrustManager f764;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.lang.reflect.Method f765;

        public C0346(@Yue.InterfaceC4418 javax.net.ssl.X509TrustManager r2, @Yue.InterfaceC4418 java.lang.reflect.Method r3) {
                r1 = this;
                java.lang.String r0 = "trustManager"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "findByIssuerAndSignatureMethod"
                Yue.C3329.m13906(r3, r0)
                r1.<init>()
                r1.f764 = r2
                r1.f765 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ Yue.C0344.C0346 m1427(Yue.C0344.C0346 r0, javax.net.ssl.X509TrustManager r1, java.lang.reflect.Method r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                javax.net.ssl.X509TrustManager r1 = r0.f764
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.reflect.Method r2 = r0.f765
            Lc:
                Yue.ۥ۟۠ۥۡ$ۥ۟ r0 = r0.m1431(r1, r2)
                return r0
        }

        public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof Yue.C0344.C0346
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                Yue.ۥ۟۠ۥۡ$ۥ۟ r5 = (Yue.C0344.C0346) r5
                javax.net.ssl.X509TrustManager r1 = r4.f764
                javax.net.ssl.X509TrustManager r3 = r5.f764
                boolean r1 = Yue.C3329.m13897(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.reflect.Method r1 = r4.f765
                java.lang.reflect.Method r5 = r5.f765
                boolean r5 = Yue.C3329.m13897(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public int hashCode() {
                r2 = this;
                javax.net.ssl.X509TrustManager r0 = r2.f764
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.reflect.Method r1 = r2.f765
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "CustomTrustRootIndex(trustManager="
                r0.append(r1)
                javax.net.ssl.X509TrustManager r1 = r2.f764
                r0.append(r1)
                java.lang.String r1 = ", findByIssuerAndSignatureMethod="
                r0.append(r1)
                java.lang.reflect.Method r1 = r2.f765
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.InterfaceC6455
        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.security.cert.X509Certificate mo1428(@Yue.InterfaceC4418 java.security.cert.X509Certificate r3) {
                r2 = this;
                java.lang.String r0 = "cert"
                Yue.C3329.m13906(r3, r0)
                java.lang.reflect.Method r0 = r2.f765     // Catch: java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L1f
                javax.net.ssl.X509TrustManager r1 = r2.f764     // Catch: java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L1f
                java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L1f
                java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L1f
                java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.TrustAnchor"
                Yue.C3329.m13904(r3, r0)     // Catch: java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L1f
                java.security.cert.TrustAnchor r3 = (java.security.cert.TrustAnchor) r3     // Catch: java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L1f
                java.security.cert.X509Certificate r3 = r3.getTrustedCert()     // Catch: java.lang.IllegalAccessException -> L1d java.lang.reflect.InvocationTargetException -> L1f
                goto L20
            L1d:
                r3 = move-exception
                goto L21
            L1f:
                r3 = 0
            L20:
                return r3
            L21:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "unable to get issues and signature"
                r0.<init>(r1, r3)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final javax.net.ssl.X509TrustManager m1429() {
                r1 = this;
                javax.net.ssl.X509TrustManager r0 = r1.f764
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.reflect.Method m1430() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.f765
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.C0344.C0346 m1431(@Yue.InterfaceC4418 javax.net.ssl.X509TrustManager r2, @Yue.InterfaceC4418 java.lang.reflect.Method r3) {
                r1 = this;
                java.lang.String r0 = "trustManager"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "findByIssuerAndSignatureMethod"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥ۟۠ۥۡ$ۥ۟ r0 = new Yue.ۥ۟۠ۥۡ$ۥ۟
                r0.<init>(r2, r3)
                return r0
        }
    }

    static {
            Yue.ۥ۟۠ۥۡ$ۥ r0 = new Yue.ۥ۟۠ۥۡ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C0344.f760 = r0
            Yue.ۥۡۤۡۢ$ۥ r0 = Yue.C4773.f15123
            boolean r0 = r0.m19022()
            r1 = 0
            if (r0 != 0) goto L12
            goto L1a
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L19
            goto L1a
        L19:
            r1 = 1
        L1a:
            Yue.C0344.f761 = r1
            return
    }

    public C0344() {
            r7 = this;
            r7.<init>()
            Yue.ۥۢ۟ۨ$ۥ r0 = Yue.C5915.f21583
            r1 = 0
            r2 = 1
            Yue.ۥۢ۟ۢۢ r0 = Yue.C5915.C5916.m21968(r0, r1, r2, r1)
            Yue.ۥ۟ۨۧۧ r1 = new Yue.ۥ۟ۨۧۧ
            Yue.ۥ۟۠ۥۣ$ۥ r3 = Yue.C0348.f844
            Yue.ۥ۟ۨۧۧ$ۥ r3 = r3.m1436()
            r1.<init>(r3)
            Yue.ۥ۟ۨۧۧ r3 = new Yue.ۥ۟ۨۧۧ
            Yue.ۥ۟ۦۨۡ$ۥ۟ r4 = Yue.C1497.f4660
            Yue.ۥ۟ۨۧۧ$ۥ r4 = r4.m7368()
            r3.<init>(r4)
            Yue.ۥ۟ۨۧۧ r4 = new Yue.ۥ۟ۨۧۧ
            Yue.ۥۣ۟ۢ$ۥ۟ r5 = Yue.C0825.f2339
            Yue.ۥ۟ۨۧۧ$ۥ r5 = r5.m4772()
            r4.<init>(r5)
            r5 = 4
            Yue.ۥۢ۟ۢۢ[] r5 = new Yue.InterfaceC5818[r5]
            r6 = 0
            r5[r6] = r0
            r5[r2] = r1
            r0 = 2
            r5[r0] = r3
            r0 = 3
            r5[r0] = r4
            java.util.List r0 = Yue.C1208.m6219(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r0.next()
            r3 = r2
            Yue.ۥۢ۟ۢۢ r3 = (Yue.InterfaceC5818) r3
            boolean r3 = r3.isSupported()
            if (r3 == 0) goto L47
            r1.add(r2)
            goto L47
        L5e:
            r7.f762 = r1
            Yue.ۥ۟ۤۨۦ$ۥ r0 = Yue.C1170.f3653
            Yue.ۥ۟ۤۨۦ r0 = r0.m6113()
            r7.f763 = r0
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ boolean m1420() {
            boolean r0 = Yue.C0344.f761
            return r0
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ */
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
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.InterfaceC6455 mo1421(@Yue.InterfaceC4418 javax.net.ssl.X509TrustManager r4) {
            r3 = this;
            java.lang.String r0 = "trustManager"
            Yue.C3329.m13906(r4, r0)
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.String r1 = "findTrustAnchorByIssuerAndSignature"
            java.lang.Class<java.security.cert.X509Certificate> r2 = java.security.cert.X509Certificate.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L24
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L24
            Yue.ۥ۟۠ۥۡ$ۥ۟ r1 = new Yue.ۥ۟۠ۥۡ$ۥ۟     // Catch: java.lang.NoSuchMethodException -> L24
            java.lang.String r2 = "method"
            Yue.C3329.m13905(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L24
            r1.<init>(r4, r0)     // Catch: java.lang.NoSuchMethodException -> L24
            goto L28
        L24:
            Yue.ۥۢۢۢ۠ r1 = super.mo1421(r4)
        L28:
            return r1
    }

    @Override // Yue.C4773
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo1392(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r4, @Yue.InterfaceC4543 java.lang.String r5, @Yue.InterfaceC4418 java.util.List<Yue.EnumC4981> r6) {
            r3 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "protocols"
            Yue.C3329.m13906(r6, r0)
            java.util.List<Yue.ۥۢ۟ۢۢ> r0 = r3.f762
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
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo1422(@Yue.InterfaceC4418 java.net.Socket r2, @Yue.InterfaceC4418 java.net.InetSocketAddress r3, int r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "socket"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "address"
            Yue.C3329.m13906(r3, r0)
            r2.connect(r3, r4)     // Catch: java.lang.ClassCastException -> Le
            return
        Le:
            r2 = move-exception
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 != r4) goto L1d
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Exception in connect"
            r3.<init>(r4, r2)
            throw r3
        L1d:
            throw r2
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public java.lang.String mo1393(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r5, r0)
            java.util.List<Yue.ۥۢ۟ۢۢ> r0 = r4.f762
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
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.lang.Object mo1423(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "closer"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟ۤۨۦ r0 = r1.f763
            java.lang.Object r2 = r0.m6111(r2)
            return r2
    }

    @Override // Yue.C4773
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo1394(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "hostname"
            Yue.C3329.m13906(r2, r0)
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r2 = r0.isCleartextTrafficPermitted(r2)
            return r2
    }

    @Override // Yue.C4773
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void mo1424(@Yue.InterfaceC4418 java.lang.String r7, @Yue.InterfaceC4543 java.lang.Object r8) {
            r6 = this;
            java.lang.String r0 = "message"
            Yue.C3329.m13906(r7, r0)
            Yue.ۥ۟ۤۨۦ r0 = r6.f763
            boolean r8 = r0.m6112(r8)
            if (r8 != 0) goto L16
            r4 = 4
            r5 = 0
            r2 = 5
            r3 = 0
            r0 = r6
            r1 = r7
            Yue.C4773.m19011(r0, r1, r2, r3, r4, r5)
        L16:
            return
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public javax.net.ssl.X509TrustManager mo1395(@Yue.InterfaceC4418 javax.net.ssl.SSLSocketFactory r5) {
            r4 = this;
            java.lang.String r0 = "sslSocketFactory"
            Yue.C3329.m13906(r5, r0)
            java.util.List<Yue.ۥۢ۟ۢۢ> r0 = r4.f762
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
