package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: StandardAndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0003\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m115d2 = {"Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter;", "Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "sslSocketClass", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketFactoryClass", "Ljavax/net/ssl/SSLSocketFactory;", "paramClass", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "matchesSocketFactory", "", "sslSocketFactory", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class StandardAndroidSocketAdapter extends okhttp3.internal.platform.android.AndroidSocketAdapter {
    public static final okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion Companion = null;
    private final java.lang.Class<?> paramClass;
    private final java.lang.Class<? super javax.net.ssl.SSLSocketFactory> sslSocketFactoryClass;

    /* JADX INFO: compiled from: StandardAndroidSocketAdapter.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m115d2 = {"Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter$Companion;", "", "()V", "buildIfSupported", "Lokhttp3/internal/platform/android/SocketAdapter;", "packageName", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        public static /* synthetic */ okhttp3.internal.platform.android.SocketAdapter buildIfSupported$default(okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion r0, java.lang.String r1, int r2, java.lang.Object r3) {
                r2 = r2 & 1
                if (r2 == 0) goto L6
                java.lang.String r1 = "com.android.org.conscrypt"
            L6:
                okhttp3.internal.platform.android.SocketAdapter r0 = r0.buildIfSupported(r1)
                return r0
        }

        public final okhttp3.internal.platform.android.SocketAdapter buildIfSupported(java.lang.String r6) {
                r5 = this;
                java.lang.String r0 = "packageName"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
                r0.<init>()     // Catch: java.lang.Exception -> L63
                java.lang.StringBuilder r0 = r0.append(r6)     // Catch: java.lang.Exception -> L63
                java.lang.String r1 = ".OpenSSLSocketImpl"
                java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L63
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L63
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L63
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)     // Catch: java.lang.Exception -> L63
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
                r1.<init>()     // Catch: java.lang.Exception -> L63
                java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Exception -> L63
                java.lang.String r2 = ".OpenSSLSocketFactoryImpl"
                java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Exception -> L63
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L63
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L63
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Exception -> L63
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
                r2.<init>()     // Catch: java.lang.Exception -> L63
                java.lang.StringBuilder r2 = r2.append(r6)     // Catch: java.lang.Exception -> L63
                java.lang.String r3 = ".SSLParametersImpl"
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Exception -> L63
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L63
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L63
                okhttp3.internal.platform.android.StandardAndroidSocketAdapter r3 = new okhttp3.internal.platform.android.StandardAndroidSocketAdapter     // Catch: java.lang.Exception -> L63
                java.lang.String r4 = "paramsClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch: java.lang.Exception -> L63
                r3.<init>(r0, r1, r2)     // Catch: java.lang.Exception -> L63
                okhttp3.internal.platform.android.SocketAdapter r3 = (okhttp3.internal.platform.android.SocketAdapter) r3     // Catch: java.lang.Exception -> L63
                goto L74
            L63:
                r0 = move-exception
                okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r1 = r1.get()
                r2 = 5
                r3 = r0
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                java.lang.String r4 = "unable to load android socket classes"
                r1.log(r4, r2, r3)
                r3 = 0
            L74:
                return r3
        }
    }

    static {
            okhttp3.internal.platform.android.StandardAndroidSocketAdapter$Companion r0 = new okhttp3.internal.platform.android.StandardAndroidSocketAdapter$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion = r0
            return
    }

    public StandardAndroidSocketAdapter(java.lang.Class<? super javax.net.ssl.SSLSocket> r2, java.lang.Class<? super javax.net.ssl.SSLSocketFactory> r3, java.lang.Class<?> r4) {
            r1 = this;
            java.lang.String r0 = "sslSocketClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "sslSocketFactoryClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "paramClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>(r2)
            r1.sslSocketFactoryClass = r3
            r1.paramClass = r4
            return
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public boolean matchesSocketFactory(javax.net.ssl.SSLSocketFactory r2) {
            r1 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Class<? super javax.net.ssl.SSLSocketFactory> r0 = r1.sslSocketFactoryClass
            boolean r0 = r0.isInstance(r2)
            return r0
    }

    @Override // okhttp3.internal.platform.android.AndroidSocketAdapter, okhttp3.internal.platform.android.SocketAdapter
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r5) {
            r4 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Class<?> r0 = r4.paramClass
            java.lang.String r1 = "sslParameters"
            java.lang.Object r0 = okhttp3.internal.Util.readFieldOrNull(r5, r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.Class<javax.net.ssl.X509TrustManager> r1 = javax.net.ssl.X509TrustManager.class
            java.lang.String r2 = "x509TrustManager"
            java.lang.Object r1 = okhttp3.internal.Util.readFieldOrNull(r0, r1, r2)
            javax.net.ssl.X509TrustManager r1 = (javax.net.ssl.X509TrustManager) r1
            if (r1 != 0) goto L2a
            java.lang.Class<javax.net.ssl.X509TrustManager> r2 = javax.net.ssl.X509TrustManager.class
            java.lang.String r3 = "trustManager"
            java.lang.Object r2 = okhttp3.internal.Util.readFieldOrNull(r0, r2, r3)
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2
            goto L2b
        L2a:
            r2 = r1
        L2b:
            return r2
    }
}
