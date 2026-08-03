package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0348 implements Yue.InterfaceC5818 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0348.C0349 f844 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1799.InterfaceC1800 f845 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Class<? super javax.net.ssl.SSLSocket> f846;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.reflect.Method f847;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.reflect.Method f848;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.lang.reflect.Method f849;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.lang.reflect.Method f850;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۥۣ$ۥ, reason: contains not printable characters */
    public static final class C0349 {

        /* JADX INFO: renamed from: Yue.ۥ۟۠ۥۣ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C0350 implements Yue.C1799.InterfaceC1800 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ java.lang.String f851;

            public C0350(java.lang.String r1) {
                    r0 = this;
                    r0.f851 = r1
                    r0.<init>()
                    return
            }

            @Override // Yue.C1799.InterfaceC1800
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public boolean mo1437(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r5) {
                    r4 = this;
                    java.lang.String r0 = "sslSocket"
                    Yue.C3329.m13906(r5, r0)
                    java.lang.Class r5 = r5.getClass()
                    java.lang.String r5 = r5.getName()
                    java.lang.String r0 = "sslSocket.javaClass.name"
                    Yue.C3329.m13905(r5, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = r4.f851
                    r0.append(r1)
                    r1 = 46
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r1 = 2
                    r2 = 0
                    r3 = 0
                    boolean r5 = Yue.C5988.m22315(r5, r0, r3, r1, r2)
                    return r5
            }

            @Override // Yue.C1799.InterfaceC1800
            @Yue.InterfaceC4418
            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public Yue.InterfaceC5818 mo1438(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
                    r1 = this;
                    java.lang.String r0 = "sslSocket"
                    Yue.C3329.m13906(r2, r0)
                    Yue.ۥ۟۠ۥۣ$ۥ r0 = Yue.C0348.f844
                    java.lang.Class r2 = r2.getClass()
                    Yue.ۥ۟۠ۥۣ r2 = Yue.C0348.C0349.m1433(r0, r2)
                    return r2
            }
        }

        public C0349() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0349(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.C0348 m1433(Yue.C0348.C0349 r0, java.lang.Class r1) {
                Yue.ۥ۟۠ۥۣ r0 = r0.m1434(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C0348 m1434(java.lang.Class<? super javax.net.ssl.SSLSocket> r4) {
                r3 = this;
                r0 = r4
            L1:
                if (r0 == 0) goto L2d
                java.lang.String r1 = r0.getSimpleName()
                java.lang.String r2 = "OpenSSLSocketImpl"
                boolean r1 = Yue.C3329.m13897(r1, r2)
                if (r1 != 0) goto L2d
                java.lang.Class r0 = r0.getSuperclass()
                if (r0 == 0) goto L16
                goto L1
            L16:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "No OpenSSLSocketImpl superclass of socket of type "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            L2d:
                Yue.ۥ۟۠ۥۣ r4 = new Yue.ۥ۟۠ۥۣ
                Yue.C3329.m13903(r0)
                r4.<init>(r0)
                return r4
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C1799.InterfaceC1800 m1435(@Yue.InterfaceC4418 java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "packageName"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥ۟۠ۥۣ$ۥ$ۥ r0 = new Yue.ۥ۟۠ۥۣ$ۥ$ۥ
                r0.<init>(r2)
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.C1799.InterfaceC1800 m1436() {
                r1 = this;
                Yue.ۥ۟ۨۧۧ$ۥ r0 = Yue.C0348.m1432()
                return r0
        }
    }

    static {
            Yue.ۥ۟۠ۥۣ$ۥ r0 = new Yue.ۥ۟۠ۥۣ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C0348.f844 = r0
            java.lang.String r1 = "com.google.android.gms.org.conscrypt"
            Yue.ۥ۟ۨۧۧ$ۥ r0 = r0.m1435(r1)
            Yue.C0348.f845 = r0
            return
    }

    public C0348(@Yue.InterfaceC4418 java.lang.Class<? super javax.net.ssl.SSLSocket> r3) {
            r2 = this;
            java.lang.String r0 = "sslSocketClass"
            Yue.C3329.m13906(r3, r0)
            r2.<init>()
            r2.f846 = r3
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setUseSessionTickets"
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r1, r0)
            java.lang.String r1 = "sslSocketClass.getDeclar…:class.javaPrimitiveType)"
            Yue.C3329.m13905(r0, r1)
            r2.f847 = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setHostname"
            java.lang.reflect.Method r0 = r3.getMethod(r1, r0)
            r2.f848 = r0
            java.lang.String r0 = "getAlpnSelectedProtocol"
            r1 = 0
            java.lang.reflect.Method r0 = r3.getMethod(r0, r1)
            r2.f849 = r0
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setAlpnProtocols"
            java.lang.reflect.Method r3 = r3.getMethod(r1, r0)
            r2.f850 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C1799.InterfaceC1800 m1432() {
            Yue.ۥ۟ۨۧۧ$ۥ r0 = Yue.C0348.f845
            return r0
    }

    @Override // Yue.InterfaceC5818
    public boolean isSupported() {
            r1 = this;
            Yue.ۥ۟۠ۥۡ$ۥ r0 = Yue.C0344.f760
            boolean r0 = r0.m1426()
            return r0
    }

    @Override // Yue.InterfaceC5818
    /* JADX INFO: renamed from: ۥ */
    public boolean mo1400(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r2) {
            r1 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r2, r0)
            java.lang.Class<? super javax.net.ssl.SSLSocket> r0 = r1.f846
            boolean r2 = r0.isInstance(r2)
            return r2
    }

    @Override // Yue.InterfaceC5818
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟ */
    public java.lang.String mo1401(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r4) {
            r3 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r4, r0)
            boolean r0 = r3.mo1400(r4)
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.reflect.Method r0 = r3.f849     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            java.lang.Object r4 = r0.invoke(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            byte[] r4 = (byte[]) r4     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            if (r4 == 0) goto L3a
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            java.nio.charset.Charset r2 = Yue.C1099.f3261     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            r0.<init>(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            r1 = r0
            goto L3a
        L20:
            r4 = move-exception
            goto L24
        L22:
            r4 = move-exception
            goto L41
        L24:
            java.lang.Throwable r0 = r4.getCause()
            boolean r2 = r0 instanceof java.lang.NullPointerException
            if (r2 == 0) goto L3b
            java.lang.NullPointerException r0 = (java.lang.NullPointerException) r0
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "ssl == null"
            boolean r0 = Yue.C3329.m13897(r0, r2)
            if (r0 == 0) goto L3b
        L3a:
            return r1
        L3b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r4)
            throw r0
        L41:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r4)
            throw r0
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
    public void mo1404(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r3, @Yue.InterfaceC4543 java.lang.String r4, @Yue.InterfaceC4418 java.util.List<? extends Yue.EnumC4981> r5) {
            r2 = this;
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "protocols"
            Yue.C3329.m13906(r5, r0)
            boolean r0 = r2.mo1400(r3)
            if (r0 == 0) goto L47
            java.lang.reflect.Method r0 = r2.f847     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalAccessException -> L29
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalAccessException -> L29
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalAccessException -> L29
            r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalAccessException -> L29
            if (r4 == 0) goto L2b
            java.lang.reflect.Method r0 = r2.f848     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalAccessException -> L29
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalAccessException -> L29
            r0.invoke(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalAccessException -> L29
            goto L2b
        L27:
            r3 = move-exception
            goto L3b
        L29:
            r3 = move-exception
            goto L41
        L2b:
            java.lang.reflect.Method r4 = r2.f850     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalAccessException -> L29
            Yue.ۥۡۤۡۢ$ۥ r0 = Yue.C4773.f15123     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalAccessException -> L29
            byte[] r5 = r0.m19017(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalAccessException -> L29
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalAccessException -> L29
            r4.invoke(r3, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L27 java.lang.IllegalAccessException -> L29
            goto L47
        L3b:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>(r3)
            throw r4
        L41:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>(r3)
            throw r4
        L47:
            return
    }
}
