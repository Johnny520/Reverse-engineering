package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: AndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m115d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "sslSocketClass", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "(Ljava/lang/Class;)V", "getAlpnSelectedProtocol", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "setAlpnProtocols", "setHostname", "setUseSessionTickets", "configureTlsExtensions", "", "sslSocket", "hostname", "", "protocols", "", "Lokhttp3/Protocol;", "getSelectedProtocol", "isSupported", "", "matchesSocket", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public class AndroidSocketAdapter implements okhttp3.internal.platform.android.SocketAdapter {
    public static final okhttp3.internal.platform.android.AndroidSocketAdapter.Companion Companion = null;
    private static final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory playProviderFactory = null;
    private final java.lang.reflect.Method getAlpnSelectedProtocol;
    private final java.lang.reflect.Method setAlpnProtocols;
    private final java.lang.reflect.Method setHostname;
    private final java.lang.reflect.Method setUseSessionTickets;
    private final java.lang.Class<? super javax.net.ssl.SSLSocket> sslSocketClass;

    /* JADX INFO: compiled from: AndroidSocketAdapter.kt */
    @kotlin.Metadata(m114d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u000b0\nH\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m115d2 = {"Lokhttp3/internal/platform/android/AndroidSocketAdapter$Companion;", "", "()V", "playProviderFactory", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "getPlayProviderFactory", "()Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "build", "Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "actualSSLSocketClass", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "factory", "packageName", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        public static final /* synthetic */ okhttp3.internal.platform.android.AndroidSocketAdapter access$build(okhttp3.internal.platform.android.AndroidSocketAdapter.Companion r1, java.lang.Class r2) {
                okhttp3.internal.platform.android.AndroidSocketAdapter r0 = r1.build(r2)
                return r0
        }

        private final okhttp3.internal.platform.android.AndroidSocketAdapter build(java.lang.Class<? super javax.net.ssl.SSLSocket> r5) {
                r4 = this;
                r0 = r5
            L1:
                if (r0 == 0) goto L2f
                java.lang.String r1 = r0.getSimpleName()
                java.lang.String r2 = "OpenSSLSocketImpl"
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L2f
                java.lang.Class r0 = r0.getSuperclass()
                if (r0 == 0) goto L16
                goto L1
            L16:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "No OpenSSLSocketImpl superclass of socket of type "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r5)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L2f:
                okhttp3.internal.platform.android.AndroidSocketAdapter r1 = new okhttp3.internal.platform.android.AndroidSocketAdapter
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r1.<init>(r0)
                return r1
        }

        public final okhttp3.internal.platform.android.DeferredSocketAdapter.Factory factory(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "packageName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1 r0 = new okhttp3.internal.platform.android.AndroidSocketAdapter$Companion$factory$1
                r0.<init>(r2)
                okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = (okhttp3.internal.platform.android.DeferredSocketAdapter.Factory) r0
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
            okhttp3.internal.platform.android.AndroidSocketAdapter$Companion r0 = okhttp3.internal.platform.android.AndroidSocketAdapter.Companion
            java.lang.String r1 = "com.google.android.gms.org.conscrypt"
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = r0.factory(r1)
            okhttp3.internal.platform.android.AndroidSocketAdapter.playProviderFactory = r0
            return
    }

    public AndroidSocketAdapter(java.lang.Class<? super javax.net.ssl.SSLSocket> r4) {
            r3 = this;
            java.lang.String r0 = "sslSocketClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.<init>()
            r3.sslSocketClass = r4
            java.lang.Class<? super javax.net.ssl.SSLSocket> r0 = r3.sslSocketClass
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r2 = "setUseSessionTickets"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)
            java.lang.String r1 = "sslSocketClass.getDeclar…:class.javaPrimitiveType)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r3.setUseSessionTickets = r0
            java.lang.Class<? super javax.net.ssl.SSLSocket> r0 = r3.sslSocketClass
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r2 = "setHostname"
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)
            r3.setHostname = r0
            java.lang.Class<? super javax.net.ssl.SSLSocket> r0 = r3.sslSocketClass
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.String r2 = "getAlpnSelectedProtocol"
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)
            r3.getAlpnSelectedProtocol = r0
            java.lang.Class<? super javax.net.ssl.SSLSocket> r0 = r3.sslSocketClass
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r2 = "setAlpnProtocols"
            java.lang.reflect.Method r0 = r0.getMethod(r2, r1)
            r3.setAlpnProtocols = r0
            return
    }

    public static final /* synthetic */ okhttp3.internal.platform.android.DeferredSocketAdapter.Factory access$getPlayProviderFactory$cp() {
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r0 = okhttp3.internal.platform.android.AndroidSocketAdapter.playProviderFactory
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r3, java.lang.String r4, java.util.List<? extends okhttp3.Protocol> r5) {
            r2 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "protocols"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r2.matchesSocket(r3)
            if (r0 == 0) goto L49
        L11:
            java.lang.reflect.Method r0 = r2.setUseSessionTickets     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L42
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L42
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L42
            r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L42
            if (r4 == 0) goto L2a
            java.lang.reflect.Method r0 = r2.setHostname     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L42
            java.lang.Object[] r1 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L42
            r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L42
        L2a:
            java.lang.reflect.Method r0 = r2.setAlpnProtocols     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L42
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L42
            byte[] r1 = r1.concatLengthPrefixed(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L42
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L42
            r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L3b java.lang.IllegalAccessException -> L42
            goto L49
        L3b:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L42:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L49:
            return
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r6) {
            r5 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r5.matchesSocket(r6)
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.reflect.Method r0 = r5.getAlpnSelectedProtocol     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L45
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L45
            java.lang.Object r0 = r0.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L45
            byte[] r0 = (byte[]) r0     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L45
            if (r0 == 0) goto L3e
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L45
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L45
            r2.<init>(r0, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L45
            r1 = r2
            goto L3e
        L24:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()
            boolean r3 = r2 instanceof java.lang.NullPointerException
            if (r3 == 0) goto L3f
            r3 = r2
            java.lang.NullPointerException r3 = (java.lang.NullPointerException) r3
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "ssl == null"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L3f
        L3e:
            return r1
        L3f:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L45:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
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
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Class<? super javax.net.ssl.SSLSocket> r0 = r1.sslSocketClass
            boolean r0 = r0.isInstance(r2)
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            boolean r0 = okhttp3.internal.platform.android.SocketAdapter.DefaultImpls.matchesSocketFactory(r1, r2)
            return r0
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = okhttp3.internal.platform.android.SocketAdapter.DefaultImpls.trustManager(r1, r2)
            return r0
    }
}
