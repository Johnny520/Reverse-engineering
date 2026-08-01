package okhttp3.internal.platform;

/* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\rH\u0016R\u0012\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m115d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "putMethod", "Ljava/lang/reflect/Method;", "getMethod", "removeMethod", "clientProviderClass", "Ljava/lang/Class;", "serverProviderClass", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "afterHandshake", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "configureTlsExtensions", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "getSelectedProtocol", "AlpnProvider", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class Jdk8WithJettyBootPlatform extends okhttp3.internal.platform.Platform {
    public static final okhttp3.internal.platform.Jdk8WithJettyBootPlatform.Companion Companion = null;
    private final java.lang.Class<?> clientProviderClass;
    private final java.lang.reflect.Method getMethod;
    private final java.lang.reflect.Method putMethod;
    private final java.lang.reflect.Method removeMethod;
    private final java.lang.Class<?> serverProviderClass;

    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    @kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J0\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m115d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "protocols", "", "", "(Ljava/util/List;)V", "selected", "getSelected", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", "unsupported", "", "getUnsupported", "()Z", "setUnsupported", "(Z)V", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    private static final class AlpnProvider implements java.lang.reflect.InvocationHandler {
        private final java.util.List<java.lang.String> protocols;
        private java.lang.String selected;
        private boolean unsupported;

        public AlpnProvider(java.util.List<java.lang.String> r2) {
                r1 = this;
                java.lang.String r0 = "protocols"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.protocols = r2
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
        public java.lang.Object invoke(java.lang.Object r11, java.lang.reflect.Method r12, java.lang.Object[] r13) throws java.lang.Throwable {
                r10 = this;
                java.lang.String r0 = "proxy"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "method"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                r0 = 0
                if (r13 != 0) goto L10
                java.lang.Object[] r1 = new java.lang.Object[r0]
                goto L11
            L10:
                r1 = r13
            L11:
                java.lang.String r2 = r12.getName()
                java.lang.Class r3 = r12.getReturnType()
                java.lang.String r4 = "supports"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                r5 = 1
                if (r4 == 0) goto L2f
                java.lang.Class r4 = java.lang.Boolean.TYPE
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
                if (r4 == 0) goto L2f
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
                return r0
            L2f:
                java.lang.String r4 = "unsupported"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                r6 = 0
                if (r4 == 0) goto L43
                java.lang.Class r4 = java.lang.Void.TYPE
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
                if (r4 == 0) goto L43
                r10.unsupported = r5
                return r6
            L43:
                java.lang.String r4 = "protocols"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                if (r4 == 0) goto L56
                int r4 = r1.length
                if (r4 != 0) goto L50
                r4 = r5
                goto L51
            L50:
                r4 = r0
            L51:
                if (r4 == 0) goto L56
                java.util.List<java.lang.String> r0 = r10.protocols
                return r0
            L56:
                java.lang.String r4 = "selectProtocol"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
                if (r4 != 0) goto L68
                java.lang.String r4 = "select"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                if (r4 == 0) goto Lb1
            L68:
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
                if (r4 == 0) goto Lb1
                int r4 = r1.length
                if (r4 != r5) goto Lb1
                r4 = r1[r0]
                boolean r4 = r4 instanceof java.util.List
                if (r4 == 0) goto Lb1
                r4 = r1[r0]
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.collections.List<*>"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r5)
                java.util.List r4 = (java.util.List) r4
                r5 = 0
                int r6 = r4.size()
                if (r5 > r6) goto La4
            L89:
                java.lang.Object r8 = r4.get(r5)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r7)
                java.lang.String r8 = (java.lang.String) r8
                java.util.List<java.lang.String> r9 = r10.protocols
                boolean r9 = r9.contains(r8)
                if (r9 == 0) goto L9f
                r10.selected = r8
                java.lang.String r0 = r10.selected
                return r0
            L9f:
                if (r5 == r6) goto La4
                int r5 = r5 + 1
                goto L89
            La4:
                java.util.List<java.lang.String> r5 = r10.protocols
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r10.selected = r0
                java.lang.String r0 = r10.selected
                return r0
            Lb1:
                java.lang.String r4 = "protocolSelected"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                if (r4 != 0) goto Lc1
                java.lang.String r4 = "selected"
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                if (r4 == 0) goto Lce
            Lc1:
                int r4 = r1.length
                if (r4 != r5) goto Lce
                r0 = r1[r0]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r7)
                java.lang.String r0 = (java.lang.String) r0
                r10.selected = r0
                return r6
            Lce:
                int r0 = r1.length
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
                java.lang.Object r0 = r12.invoke(r10, r0)
                return r0
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

    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m115d2 = {"Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.platform.Platform buildIfSupported() {
                r17 = this;
                java.lang.String r0 = "java.specification.version"
                java.lang.String r1 = "unknown"
                java.lang.String r1 = java.lang.System.getProperty(r0, r1)
                r2 = 0
                java.lang.String r0 = "jvmVersion"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)     // Catch: java.lang.NumberFormatException -> L18
                int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L18
                r3 = 9
                if (r0 < r3) goto L19
                return r2
            L18:
                r0 = move-exception
            L19:
                java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
                r3 = 1
                java.lang.Class r4 = java.lang.Class.forName(r0, r3, r2)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                r5.<init>()     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.String r6 = "$Provider"
                java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.String r5 = r5.toString()     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.Class r5 = java.lang.Class.forName(r5, r3, r2)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                r6.<init>()     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.StringBuilder r6 = r6.append(r0)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.String r7 = "$ClientProvider"
                java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.String r6 = r6.toString()     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.Class r6 = java.lang.Class.forName(r6, r3, r2)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                r7.<init>()     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.StringBuilder r7 = r7.append(r0)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.String r8 = "$ServerProvider"
                java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.String r7 = r7.toString()     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.Class r3 = java.lang.Class.forName(r7, r3, r2)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.String r7 = "put"
                java.lang.Class<javax.net.ssl.SSLSocket> r8 = javax.net.ssl.SSLSocket.class
                java.lang.Class[] r8 = new java.lang.Class[]{r8, r5}     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.reflect.Method r7 = r4.getMethod(r7, r8)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                r13 = r7
                java.lang.String r7 = "get"
                java.lang.Class<javax.net.ssl.SSLSocket> r8 = javax.net.ssl.SSLSocket.class
                java.lang.Class[] r8 = new java.lang.Class[]{r8}     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.reflect.Method r7 = r4.getMethod(r7, r8)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                r14 = r7
                java.lang.String r7 = "remove"
                java.lang.Class<javax.net.ssl.SSLSocket> r8 = javax.net.ssl.SSLSocket.class
                java.lang.Class[] r8 = new java.lang.Class[]{r8}     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.reflect.Method r7 = r4.getMethod(r7, r8)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                r15 = r7
                okhttp3.internal.platform.Jdk8WithJettyBootPlatform r16 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.String r7 = "putMethod"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r7)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.String r7 = "getMethod"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r7)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.String r7 = "removeMethod"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r7)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.String r7 = "clientProviderClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                java.lang.String r7 = "serverProviderClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                r7 = r16
                r8 = r13
                r9 = r14
                r10 = r15
                r11 = r6
                r12 = r3
                r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                okhttp3.internal.platform.Platform r16 = (okhttp3.internal.platform.Platform) r16     // Catch: java.lang.NoSuchMethodException -> Lb5 java.lang.ClassNotFoundException -> Lb7
                return r16
            Lb5:
                r0 = move-exception
                goto Lb8
            Lb7:
                r0 = move-exception
            Lb8:
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

    public Jdk8WithJettyBootPlatform(java.lang.reflect.Method r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4, java.lang.Class<?> r5, java.lang.Class<?> r6) {
            r1 = this;
            java.lang.String r0 = "putMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "getMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "removeMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "clientProviderClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "serverProviderClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1.<init>()
            r1.putMethod = r2
            r1.getMethod = r3
            r1.removeMethod = r4
            r1.clientProviderClass = r5
            r1.serverProviderClass = r6
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.lang.String r0 = "failed to remove ALPN"
            java.lang.String r1 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.lang.reflect.Method r1 = r4.removeMethod     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L1d
            java.lang.Object[] r2 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L1d
            r3 = 0
            r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L13 java.lang.IllegalAccessException -> L1d
            return
        L13:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.<init>(r0, r3)
            throw r2
        L1d:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.<init>(r0, r3)
            throw r2
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r7, java.lang.String r8, java.util.List<? extends okhttp3.Protocol> r9) {
            r6 = this;
            java.lang.String r0 = "failed to set ALPN"
            java.lang.String r1 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "protocols"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
            java.util.List r1 = r1.alpnProtocolNames(r9)
            java.lang.Class<okhttp3.internal.platform.Platform> r2 = okhttp3.internal.platform.Platform.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L40
            java.lang.Class<?> r3 = r6.clientProviderClass     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L40
            java.lang.Class<?> r4 = r6.serverProviderClass     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L40
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L40
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform$AlpnProvider r4 = new okhttp3.internal.platform.Jdk8WithJettyBootPlatform$AlpnProvider     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L40
            r4.<init>(r1)     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L40
            java.lang.reflect.InvocationHandler r4 = (java.lang.reflect.InvocationHandler) r4     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L40
            java.lang.Object r2 = java.lang.reflect.Proxy.newProxyInstance(r2, r3, r4)     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L40
            java.lang.reflect.Method r3 = r6.putMethod     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L40
            java.lang.Object[] r4 = new java.lang.Object[]{r7, r2}     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L40
            r5 = 0
            r3.invoke(r5, r4)     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L40
            return
        L36:
            r2 = move-exception
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r3.<init>(r0, r4)
            throw r3
        L40:
            r2 = move-exception
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r3.<init>(r0, r4)
            throw r3
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r11) {
            r10 = this;
            java.lang.String r0 = "failed to get ALPN selected protocol"
            java.lang.String r1 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            java.lang.reflect.Method r1 = r10.getMethod     // Catch: java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L4d
            java.lang.Object[] r2 = new java.lang.Object[]{r11}     // Catch: java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L4d
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L4d
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r1)     // Catch: java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L4d
            java.lang.String r2 = "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L4d
            okhttp3.internal.platform.Jdk8WithJettyBootPlatform$AlpnProvider r1 = (okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider) r1     // Catch: java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L4d
            boolean r2 = r1.getUnsupported()     // Catch: java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L4d
            if (r2 != 0) goto L37
            java.lang.String r2 = r1.getSelected()     // Catch: java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L4d
            if (r2 != 0) goto L37
            r4 = r10
            okhttp3.internal.platform.Platform r4 = (okhttp3.internal.platform.Platform) r4     // Catch: java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L4d
            java.lang.String r5 = "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?"
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            okhttp3.internal.platform.Platform.log$default(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L4d
            return r3
        L37:
            boolean r2 = r1.getUnsupported()     // Catch: java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L4d
            if (r2 == 0) goto L3e
            goto L42
        L3e:
            java.lang.String r3 = r1.getSelected()     // Catch: java.lang.IllegalAccessException -> L43 java.lang.reflect.InvocationTargetException -> L4d
        L42:
            return r3
        L43:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.<init>(r0, r3)
            throw r2
        L4d:
            r1 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.<init>(r0, r3)
            throw r2
    }
}
