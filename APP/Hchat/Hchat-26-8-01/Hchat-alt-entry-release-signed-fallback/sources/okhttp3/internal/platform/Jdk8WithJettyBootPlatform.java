package okhttp3.internal.platform;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Jdk8WithJettyBootPlatform extends okhttp3.internal.platform.Platform {
    public static final okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion Companion = null;
    private final java.lang.Class<?> clientProviderClass;
    private final java.lang.reflect.Method getMethod;
    private final java.lang.reflect.Method putMethod;
    private final java.lang.reflect.Method removeMethod;
    private final java.lang.Class<?> serverProviderClass;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class AlpnProvider implements java.lang.reflect.InvocationHandler {
        private final java.util.List<java.lang.String> protocols;
        private java.lang.String selected;
        private boolean unsupported;

        public AlpnProvider(java.util.List<java.lang.String> r1) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.protocols = r1
                return
        }

        public final java.lang.String getSelected() {
                r1 = this;
                java.lang.String r0 = r1.selected
                return r0
        }

        public final boolean getUnsupported() {
                r1 = this;
                boolean r0 = r1.unsupported
                return r0
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
                r5 = this;
                r6.getClass()
                r7.getClass()
                r6 = 0
                if (r8 != 0) goto Lb
                java.lang.Object[] r8 = new java.lang.Object[r6]
            Lb:
                java.lang.String r0 = r7.getName()
                java.lang.Class r1 = r7.getReturnType()
                java.lang.String r2 = "supports"
                boolean r2 = gg.l.a(r0, r2)
                if (r2 == 0) goto L26
                java.lang.Class r2 = java.lang.Boolean.TYPE
                boolean r2 = gg.l.a(r2, r1)
                if (r2 == 0) goto L26
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                return r6
            L26:
                java.lang.String r2 = "unsupported"
                boolean r2 = gg.l.a(r0, r2)
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L3b
                java.lang.Class r2 = java.lang.Void.TYPE
                boolean r2 = gg.l.a(r2, r1)
                if (r2 == 0) goto L3b
                r5.unsupported = r4
                return r3
            L3b:
                java.lang.String r2 = "protocols"
                boolean r2 = gg.l.a(r0, r2)
                if (r2 == 0) goto L49
                int r2 = r8.length
                if (r2 != 0) goto L49
                java.util.List<java.lang.String> r6 = r5.protocols
                return r6
            L49:
                java.lang.String r2 = "selectProtocol"
                boolean r2 = gg.l.a(r0, r2)
                if (r2 != 0) goto L59
                java.lang.String r2 = "select"
                boolean r2 = gg.l.a(r0, r2)
                if (r2 == 0) goto L9a
            L59:
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                boolean r1 = r2.equals(r1)
                if (r1 == 0) goto L9a
                int r1 = r8.length
                if (r1 != r4) goto L9a
                r1 = r8[r6]
                boolean r2 = r1 instanceof java.util.List
                if (r2 == 0) goto L9a
                r1.getClass()
                java.util.List r1 = (java.util.List) r1
                int r7 = r1.size()
                if (r7 < 0) goto L8f
                r8 = r6
            L76:
                java.lang.Object r0 = r1.get(r8)
                r0.getClass()
                java.lang.String r0 = (java.lang.String) r0
                java.util.List<java.lang.String> r2 = r5.protocols
                boolean r2 = r2.contains(r0)
                if (r2 == 0) goto L8a
                r5.selected = r0
                return r0
            L8a:
                if (r8 == r7) goto L8f
                int r8 = r8 + 1
                goto L76
            L8f:
                java.util.List<java.lang.String> r7 = r5.protocols
                java.lang.Object r6 = r7.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                r5.selected = r6
                return r6
            L9a:
                java.lang.String r1 = "protocolSelected"
                boolean r1 = gg.l.a(r0, r1)
                if (r1 != 0) goto Laa
                java.lang.String r1 = "selected"
                boolean r0 = gg.l.a(r0, r1)
                if (r0 == 0) goto Lb7
            Laa:
                int r0 = r8.length
                if (r0 != r4) goto Lb7
                r6 = r8[r6]
                r6.getClass()
                java.lang.String r6 = (java.lang.String) r6
                r5.selected = r6
                return r3
            Lb7:
                int r6 = r8.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r8, r6)
                java.lang.Object r6 = r7.invoke(r5, r6)
                return r6
        }

        public final void setSelected(java.lang.String r1) {
                r0 = this;
                r0.selected = r1
                return
        }

        public final void setUnsupported(boolean r1) {
                r0 = this;
                r0.unsupported = r1
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.platform.Platform buildIfSupported() {
                r12 = this;
                java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
                java.lang.String r1 = "java.specification.version"
                java.lang.String r2 = "unknown"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)
                r2 = 0
                r1.getClass()     // Catch: java.lang.NumberFormatException -> L17
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L17
                r3 = 9
                if (r1 < r3) goto L17
                goto L63
            L17:
                java.lang.String r1 = "org.eclipse.jetty.alpn.ALPN"
                r3 = 1
                java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L63
                java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
                java.lang.Class r4 = java.lang.Class.forName(r4, r3, r2)     // Catch: java.lang.Throwable -> L63
                java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
                java.lang.Class r10 = java.lang.Class.forName(r5, r3, r2)     // Catch: java.lang.Throwable -> L63
                java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
                java.lang.Class r11 = java.lang.Class.forName(r5, r3, r2)     // Catch: java.lang.Throwable -> L63
                java.lang.String r3 = "put"
                java.lang.Class[] r4 = new java.lang.Class[]{r0, r4}     // Catch: java.lang.Throwable -> L63
                java.lang.reflect.Method r7 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L63
                java.lang.String r3 = "get"
                java.lang.Class[] r4 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L63
                java.lang.reflect.Method r8 = r1.getMethod(r3, r4)     // Catch: java.lang.Throwable -> L63
                java.lang.String r3 = "remove"
                java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L63
                java.lang.reflect.Method r9 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L63
                okhttp3.internal.platform.Jdk8WithJettyBootPlatform r6 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform     // Catch: java.lang.Throwable -> L63
                r7.getClass()     // Catch: java.lang.Throwable -> L63
                r8.getClass()     // Catch: java.lang.Throwable -> L63
                r9.getClass()     // Catch: java.lang.Throwable -> L63
                r10.getClass()     // Catch: java.lang.Throwable -> L63
                r11.getClass()     // Catch: java.lang.Throwable -> L63
                r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L63
                return r6
            L63:
                return r2
        }
    }

    static {
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform$Companion r0 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion = r0
            return
    }

    public Jdk8WithJettyBootPlatform(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3, java.lang.Class<?> r4, java.lang.Class<?> r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.putMethod = r1
            r0.getMethod = r2
            r0.removeMethod = r3
            r0.clientProviderClass = r4
            r0.serverProviderClass = r5
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            java.lang.String r0 = "failed to remove ALPN"
            r4.getClass()
            java.lang.reflect.Method r1 = r3.removeMethod     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            r2 = 0
            r1.invoke(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12
            return
        L10:
            r4 = move-exception
            goto L14
        L12:
            r4 = move-exception
            goto L1a
        L14:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r4)
            throw r1
        L1a:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0, r4)
            throw r1
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r4, java.lang.String r5, java.util.List<? extends okhttp3.Protocol> r6) {
            r3 = this;
            java.lang.String r5 = "failed to set ALPN"
            r4.getClass()
            r6.getClass()
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            java.util.List r6 = r0.alpnProtocolNames(r6)
            java.lang.Class<okhttp3.internal.platform.Platform> r0 = okhttp3.internal.platform.Platform.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            java.lang.Class<?> r1 = r3.clientProviderClass     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            java.lang.Class<?> r2 = r3.serverProviderClass     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2}     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform$AlpnProvider r2 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform$AlpnProvider     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            r2.<init>(r6)     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            java.lang.Object r6 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r2)     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            java.lang.reflect.Method r0 = r3.putMethod     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r6}     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            r6 = 0
            r0.invoke(r6, r4)     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L32
            return
        L30:
            r4 = move-exception
            goto L34
        L32:
            r4 = move-exception
            goto L3a
        L34:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>(r5, r4)
            throw r6
        L3a:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            r6.<init>(r5, r4)
            throw r6
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r10) {
            r9 = this;
            java.lang.String r1 = "failed to get ALPN selected protocol"
            r10.getClass()
            java.lang.reflect.Method r0 = r9.getMethod     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L33
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L33
            r2 = 0
            java.lang.Object r10 = r0.invoke(r2, r10)     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L33
            java.lang.reflect.InvocationHandler r10 = java.lang.reflect.Proxy.getInvocationHandler(r10)     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L33
            r10.getClass()     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L33
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform$AlpnProvider r10 = (okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider) r10     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L33
            boolean r0 = r10.getUnsupported()     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L33
            if (r0 != 0) goto L36
            java.lang.String r0 = r10.getSelected()     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L33
            if (r0 != 0) goto L36
            java.lang.String r4 = "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?"
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            r3 = r9
            okhttp3.internal.platform.Platform.log$default(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L33
            return r2
        L30:
            r0 = move-exception
            r10 = r0
            goto L42
        L33:
            r0 = move-exception
            r10 = r0
            goto L48
        L36:
            boolean r0 = r10.getUnsupported()     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L33
            if (r0 == 0) goto L3d
            return r2
        L3d:
            java.lang.String r10 = r10.getSelected()     // Catch: java.lang.IllegalAccessException -> L30 java.lang.reflect.InvocationTargetException -> L33
            return r10
        L42:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1, r10)
            throw r0
        L48:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1, r10)
            throw r0
    }
}
