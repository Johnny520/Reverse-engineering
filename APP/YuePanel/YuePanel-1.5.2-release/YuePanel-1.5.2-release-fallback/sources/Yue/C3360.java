package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3360 extends Yue.C4773 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C3360.C3362 f10813 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.reflect.Method f10814;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.reflect.Method f10815;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.reflect.Method f10816;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Class<?> f10817;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Class<?> f10818;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۨۨ$ۥ, reason: contains not printable characters */
    public static final class C3361 implements java.lang.reflect.InvocationHandler {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.List<java.lang.String> f10819;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean f10820;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4543
        public java.lang.String f10821;

        public C3361(@Yue.InterfaceC4418 java.util.List<java.lang.String> r2) {
                r1 = this;
                java.lang.String r0 = "protocols"
                Yue.C3329.m13906(r2, r0)
                r1.<init>()
                r1.f10819 = r2
                return
        }

        @Override // java.lang.reflect.InvocationHandler
        @Yue.InterfaceC4543
        public java.lang.Object invoke(@Yue.InterfaceC4418 java.lang.Object r7, @Yue.InterfaceC4418 java.lang.reflect.Method r8, @Yue.InterfaceC4543 java.lang.Object[] r9) throws java.lang.Throwable {
                r6 = this;
                java.lang.String r0 = "proxy"
                Yue.C3329.m13906(r7, r0)
                java.lang.String r7 = "method"
                Yue.C3329.m13906(r8, r7)
                r7 = 0
                if (r9 != 0) goto Lf
                java.lang.Object[] r9 = new java.lang.Object[r7]
            Lf:
                java.lang.String r0 = r8.getName()
                java.lang.Class r1 = r8.getReturnType()
                java.lang.String r2 = "supports"
                boolean r2 = Yue.C3329.m13897(r0, r2)
                if (r2 == 0) goto L2a
                java.lang.Class r2 = java.lang.Boolean.TYPE
                boolean r2 = Yue.C3329.m13897(r2, r1)
                if (r2 == 0) goto L2a
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                return r7
            L2a:
                java.lang.String r2 = "unsupported"
                boolean r2 = Yue.C3329.m13897(r0, r2)
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L3f
                java.lang.Class r2 = java.lang.Void.TYPE
                boolean r2 = Yue.C3329.m13897(r2, r1)
                if (r2 == 0) goto L3f
                r6.f10820 = r4
                return r3
            L3f:
                java.lang.String r2 = "protocols"
                boolean r2 = Yue.C3329.m13897(r0, r2)
                if (r2 == 0) goto L4d
                int r2 = r9.length
                if (r2 != 0) goto L4d
                java.util.List<java.lang.String> r7 = r6.f10819
                return r7
            L4d:
                java.lang.String r2 = "selectProtocol"
                boolean r2 = Yue.C3329.m13897(r0, r2)
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
                if (r2 != 0) goto L5f
                java.lang.String r2 = "select"
                boolean r2 = Yue.C3329.m13897(r0, r2)
                if (r2 == 0) goto La2
            L5f:
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                boolean r1 = Yue.C3329.m13897(r2, r1)
                if (r1 == 0) goto La2
                int r1 = r9.length
                if (r1 != r4) goto La2
                r1 = r9[r7]
                boolean r2 = r1 instanceof java.util.List
                if (r2 == 0) goto La2
                java.lang.String r8 = "null cannot be cast to non-null type kotlin.collections.List<*>"
                Yue.C3329.m13904(r1, r8)
                java.util.List r1 = (java.util.List) r1
                int r8 = r1.size()
                if (r8 < 0) goto L97
                r9 = r7
            L7e:
                java.lang.Object r0 = r1.get(r9)
                Yue.C3329.m13904(r0, r5)
                java.lang.String r0 = (java.lang.String) r0
                java.util.List<java.lang.String> r2 = r6.f10819
                boolean r2 = r2.contains(r0)
                if (r2 == 0) goto L92
                r6.f10821 = r0
                return r0
            L92:
                if (r9 == r8) goto L97
                int r9 = r9 + 1
                goto L7e
            L97:
                java.util.List<java.lang.String> r8 = r6.f10819
                java.lang.Object r7 = r8.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                r6.f10821 = r7
                return r7
            La2:
                java.lang.String r1 = "protocolSelected"
                boolean r1 = Yue.C3329.m13897(r0, r1)
                if (r1 != 0) goto Lb2
                java.lang.String r1 = "selected"
                boolean r0 = Yue.C3329.m13897(r0, r1)
                if (r0 == 0) goto Lbf
            Lb2:
                int r0 = r9.length
                if (r0 != r4) goto Lbf
                r7 = r9[r7]
                Yue.C3329.m13904(r7, r5)
                java.lang.String r7 = (java.lang.String) r7
                r6.f10821 = r7
                return r3
            Lbf:
                int r7 = r9.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r9, r7)
                java.lang.Object r7 = r8.invoke(r6, r7)
                return r7
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String m13968() {
                r1 = this;
                java.lang.String r0 = r1.f10821
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean m13969() {
                r1 = this;
                boolean r0 = r1.f10820
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m13970(@Yue.InterfaceC4543 java.lang.String r1) {
                r0 = this;
                r0.f10821 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m13971(boolean r1) {
                r0 = this;
                r0.f10820 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۨۨ$ۥ۟, reason: contains not printable characters */
    public static final class C3362 {
        public C3362() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C3362(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C4773 m13972() {
                r13 = this;
                java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
                java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
                java.lang.String r2 = "java.specification.version"
                java.lang.String r3 = "unknown"
                java.lang.String r2 = java.lang.System.getProperty(r2, r3)
                r3 = 0
                java.lang.String r4 = "jvmVersion"
                Yue.C3329.m13905(r2, r4)     // Catch: java.lang.NumberFormatException -> L1b
                int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L1b
                r4 = 9
                if (r2 < r4) goto L1b
                return r3
            L1b:
                r2 = 1
                java.lang.Class r4 = java.lang.Class.forName(r0, r2, r3)     // Catch: java.lang.Throwable -> L9d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
                r5.<init>()     // Catch: java.lang.Throwable -> L9d
                r5.append(r0)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r6 = "$Provider"
                r5.append(r6)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L9d
                java.lang.Class r5 = java.lang.Class.forName(r5, r2, r3)     // Catch: java.lang.Throwable -> L9d
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
                r6.<init>()     // Catch: java.lang.Throwable -> L9d
                r6.append(r0)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r7 = "$ClientProvider"
                r6.append(r7)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L9d
                java.lang.Class r11 = java.lang.Class.forName(r6, r2, r3)     // Catch: java.lang.Throwable -> L9d
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
                r6.<init>()     // Catch: java.lang.Throwable -> L9d
                r6.append(r0)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r0 = "$ServerProvider"
                r6.append(r0)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L9d
                java.lang.Class r12 = java.lang.Class.forName(r0, r2, r3)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r0 = "put"
                java.lang.Class[] r2 = new java.lang.Class[]{r1, r5}     // Catch: java.lang.Throwable -> L9d
                java.lang.reflect.Method r8 = r4.getMethod(r0, r2)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r0 = "get"
                java.lang.Class[] r2 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> L9d
                java.lang.reflect.Method r9 = r4.getMethod(r0, r2)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r0 = "remove"
                java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.Throwable -> L9d
                java.lang.reflect.Method r10 = r4.getMethod(r0, r1)     // Catch: java.lang.Throwable -> L9d
                Yue.ۥ۠ۥۨۨ r0 = new Yue.ۥ۠ۥۨۨ     // Catch: java.lang.Throwable -> L9d
                java.lang.String r1 = "putMethod"
                Yue.C3329.m13905(r8, r1)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r1 = "getMethod"
                Yue.C3329.m13905(r9, r1)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r1 = "removeMethod"
                Yue.C3329.m13905(r10, r1)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r1 = "clientProviderClass"
                Yue.C3329.m13905(r11, r1)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r1 = "serverProviderClass"
                Yue.C3329.m13905(r12, r1)     // Catch: java.lang.Throwable -> L9d
                r7 = r0
                r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9d
                return r0
            L9d:
                return r3
        }
    }

    static {
            Yue.ۥ۠ۥۨۨ$ۥ۟ r0 = new Yue.ۥ۠ۥۨۨ$ۥ۟
            r1 = 0
            r0.<init>(r1)
            Yue.C3360.f10813 = r0
            return
    }

    public C3360(@Yue.InterfaceC4418 java.lang.reflect.Method r2, @Yue.InterfaceC4418 java.lang.reflect.Method r3, @Yue.InterfaceC4418 java.lang.reflect.Method r4, @Yue.InterfaceC4418 java.lang.Class<?> r5, @Yue.InterfaceC4418 java.lang.Class<?> r6) {
            r1 = this;
            java.lang.String r0 = "putMethod"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "getMethod"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "removeMethod"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "clientProviderClass"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "serverProviderClass"
            Yue.C3329.m13906(r6, r0)
            r1.<init>()
            r1.f10814 = r2
            r1.f10815 = r3
            r1.f10816 = r4
            r1.f10817 = r5
            r1.f10818 = r6
            return
    }

    @Override // Yue.C4773
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo13967(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r4) {
            r3 = this;
            java.lang.String r0 = "failed to remove ALPN"
            java.lang.String r1 = "sslSocket"
            Yue.C3329.m13906(r4, r1)
            java.lang.reflect.Method r1 = r3.f10816     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14
            r2 = 0
            r1.invoke(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14
            return
        L12:
            r4 = move-exception
            goto L16
        L14:
            r4 = move-exception
            goto L1c
        L16:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r4)
            throw r1
        L1c:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r4)
            throw r1
    }

    @Override // Yue.C4773
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo1392(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r4, @Yue.InterfaceC4543 java.lang.String r5, @Yue.InterfaceC4418 java.util.List<? extends Yue.EnumC4981> r6) {
            r3 = this;
            java.lang.String r5 = "failed to set ALPN"
            java.lang.String r0 = "sslSocket"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "protocols"
            Yue.C3329.m13906(r6, r0)
            Yue.ۥۡۤۡۢ$ۥ r0 = Yue.C4773.f15123
            java.util.List r6 = r0.m19016(r6)
            java.lang.Class<Yue.ۥۡۤۡۢ> r0 = Yue.C4773.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            java.lang.Class<?> r1 = r3.f10817     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            java.lang.Class<?> r2 = r3.f10818     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2}     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            Yue.ۥ۠ۥۨۨ$ۥ r2 = new Yue.ۥ۠ۥۨۨ$ۥ     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            r2.<init>(r6)     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            java.lang.Object r6 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r2)     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            java.lang.reflect.Method r0 = r3.f10814     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r6}     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            r6 = 0
            r0.invoke(r6, r4)     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            return
        L34:
            r4 = move-exception
            goto L38
        L36:
            r4 = move-exception
            goto L3e
        L38:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>(r5, r4)
            throw r6
        L3e:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>(r5, r4)
            throw r6
    }

    @Override // Yue.C4773
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public java.lang.String mo1393(@Yue.InterfaceC4418 javax.net.ssl.SSLSocket r10) {
            r9 = this;
            java.lang.String r0 = "failed to get ALPN selected protocol"
            java.lang.String r1 = "sslSocket"
            Yue.C3329.m13906(r10, r1)
            java.lang.reflect.Method r1 = r9.f10815     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            r2 = 0
            java.lang.Object r10 = r1.invoke(r2, r10)     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            java.lang.reflect.InvocationHandler r10 = java.lang.reflect.Proxy.getInvocationHandler(r10)     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider"
            Yue.C3329.m13904(r10, r1)     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            Yue.ۥ۠ۥۨۨ$ۥ r10 = (Yue.C3360.C3361) r10     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            boolean r1 = r10.m13969()     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            if (r1 != 0) goto L38
            java.lang.String r1 = r10.m13968()     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            if (r1 != 0) goto L38
            java.lang.String r4 = "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?"
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3 = r9
            Yue.C4773.m19011(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            return r2
        L34:
            r10 = move-exception
            goto L44
        L36:
            r10 = move-exception
            goto L4a
        L38:
            boolean r1 = r10.m13969()     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            if (r1 == 0) goto L3f
            goto L43
        L3f:
            java.lang.String r2 = r10.m13968()     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
        L43:
            return r2
        L44:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r10)
            throw r1
        L4a:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r10)
            throw r1
    }
}
