package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class AndroidSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {
    public static final okhttp3.internal.platform.android.AndroidSocketAdapter.Companion Companion = null;
    private static final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory playProviderFactory = null;
    private final java.lang.reflect.Method getAlpnSelectedProtocol;
    private final java.lang.reflect.Method setAlpnProtocols;
    private final java.lang.reflect.Method setHostname;
    private final java.lang.reflect.Method setUseSessionTickets;
    private final java.lang.Class<? super javax.net.ssl.SSLSocket> sslSocketClass;

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

        public static final /* synthetic */ okhttp3.internal.platform.android.AndroidSocketAdapter access$build(okhttp3.internal.platform.android.AndroidSocketAdapter.Companion r0, java.lang.Class r1) {
                okhttp3.internal.platform.android.AndroidSocketAdapter r0 = r0.build(r1)
                return r0
        }

        private final okhttp3.internal.platform.android.AndroidSocketAdapter build(java.lang.Class<? super javax.net.ssl.SSLSocket> r4) {
                r3 = this;
                r0 = r4
            L1:
                if (r0 == 0) goto L21
                java.lang.String r1 = r0.getSimpleName()
                java.lang.String r2 = "OpenSSLSocketImpl"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L21
                java.lang.Class r0 = r0.getSuperclass()
                if (r0 == 0) goto L16
                goto L1
            L16:
                java.lang.String r0 = "No OpenSSLSocketImpl superclass of socket of type "
                java.lang.String r4 = p.a.k(r4, r0)
                j8.o.f(r4)
                r4 = 0
                return r4
            L21:
                okhttp3.internal.platform.android.AndroidSocketAdapter r4 = new okhttp3.internal.platform.android.AndroidSocketAdapter
                r0.getClass()
                r4.<init>(r0)
                return r4
        }

        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory factory(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1 r0 = new okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                r0.<init>(r2)
                return r0
        }

        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory getPlayProviderFactory() {
                r1 = this;
                okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.AndroidSocketAdapter.access$getPlayProviderFactory$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.android.AndroidSocketAdapter$Companion r0 = new okhttp3.internal.platform.android.AndroidSocketAdapter$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.AndroidSocketAdapter.Companion = r0
            java.lang.String r1 = "com.google.android.gms.org.conscrypt"
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = r0.factory(r1)
            okhttp3.internal.platform.android.AndroidSocketAdapter.playProviderFactory = r0
            return
    }

    public AndroidSocketAdapter(java.lang.Class<? super javax.net.ssl.SSLSocket> r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.sslSocketClass = r3
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setUseSessionTickets"
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r1, r0)
            r0.getClass()
            r2.setUseSessionTickets = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setHostname"
            java.lang.reflect.Method r0 = r3.getMethod(r1, r0)
            r2.setHostname = r0
            java.lang.String r0 = "getAlpnSelectedProtocol"
            r1 = 0
            java.lang.reflect.Method r0 = r3.getMethod(r0, r1)
            r2.getAlpnSelectedProtocol = r0
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setAlpnProtocols"
            java.lang.reflect.Method r3 = r3.getMethod(r1, r0)
            r2.setAlpnProtocols = r3
            return
    }

    public static final /* synthetic */ okhttp3.internal.platform.android.DeferredSocketAdapter.Factory access$getPlayProviderFactory$cp() {
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.AndroidSocketAdapter.playProviderFactory
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r3, java.lang.String r4, java.util.List<? extends okhttp3.Protocol> r5) {
            r2 = this;
            r3.getClass()
            r5.getClass()
            boolean r0 = r2.matchesSocket(r3)
            if (r0 == 0) goto L3e
            java.lang.reflect.Method r0 = r2.setUseSessionTickets     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25
            r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25
            if (r4 == 0) goto L27
            java.lang.reflect.Method r0 = r2.setHostname     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25
            r0.invoke(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25
            goto L27
        L23:
            r3 = move-exception
            goto L37
        L25:
            r3 = move-exception
            goto L3b
        L27:
            java.lang.reflect.Method r4 = r2.setAlpnProtocols     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25
            byte[] r5 = r0.concatLengthPrefixed(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25
            r4.invoke(r3, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L23 java.lang.IllegalAccessException -> L25
            return
        L37:
            j8.o.f(r3)
            return
        L3b:
            j8.o.f(r3)
        L3e:
            return
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            r4.getClass()
            boolean r0 = r3.matchesSocket(r4)
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.lang.reflect.Method r0 = r3.getAlpnSelectedProtocol     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
            java.lang.Object r4 = r0.invoke(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
            byte[] r4 = (byte[]) r4     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
            if (r4 == 0) goto L21
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
            java.nio.charset.Charset r2 = og.a.f9804a     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
            r0.<init>(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
            return r0
        L1d:
            r4 = move-exception
            goto L22
        L1f:
            r4 = move-exception
            goto L3e
        L21:
            return r1
        L22:
            java.lang.Throwable r0 = r4.getCause()
            boolean r2 = r0 instanceof java.lang.NullPointerException
            if (r2 == 0) goto L39
            java.lang.NullPointerException r0 = (java.lang.NullPointerException) r0
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "ssl == null"
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L39
            return r1
        L39:
            j8.o.f(r4)
        L3c:
            r4 = 0
            return r4
        L3e:
            j8.o.f(r4)
            goto L3c
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean isSupported() {
            r1 = this;
            okhttp3.internal.platform.AndroidPlatform$Companion r0 = okhttp3.internal.platform.AndroidPlatform.Companion
            boolean r0 = r0.isSupported()
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocket(javax.net.ssl.SSLSocket r2) {
            r1 = this;
            r2.getClass()
            java.lang.Class<? super javax.net.ssl.SSLSocket> r0 = r1.sslSocketClass
            boolean r2 = r0.isInstance(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            boolean r1 = okhttp3.internal.platform.android.SocketAdapter.DefaultImpls.matchesSocketFactory(r0, r1)
            return r1
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r1) {
            r0 = this;
            javax.net.ssl.X509TrustManager r1 = okhttp3.internal.platform.android.SocketAdapter.DefaultImpls.trustManager(r0, r1)
            return r1
    }
}
