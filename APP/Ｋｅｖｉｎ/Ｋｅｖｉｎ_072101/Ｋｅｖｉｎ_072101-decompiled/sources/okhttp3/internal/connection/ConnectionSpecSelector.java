package okhttp3.internal.connection;

/* JADX INFO: compiled from: ConnectionSpecSelector.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\rH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m115d2 = {"Lokhttp3/internal/connection/ConnectionSpecSelector;", "", "connectionSpecs", "", "Lokhttp3/ConnectionSpec;", "(Ljava/util/List;)V", "isFallback", "", "isFallbackPossible", "nextModeIndex", "", "configureSecureSocket", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "connectionFailed", "e", "Ljava/io/IOException;", "socket", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class ConnectionSpecSelector {
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(java.util.List<okhttp3.ConnectionSpec> r2) {
            r1 = this;
            java.lang.String r0 = "connectionSpecs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.connectionSpecs = r2
            return
    }

    private final boolean isFallbackPossible(javax.net.ssl.SSLSocket r4) {
            r3 = this;
            int r0 = r3.nextModeIndex
            java.util.List<okhttp3.ConnectionSpec> r1 = r3.connectionSpecs
            int r1 = r1.size()
        L8:
            if (r0 >= r1) goto L1d
            java.util.List<okhttp3.ConnectionSpec> r2 = r3.connectionSpecs
            java.lang.Object r2 = r2.get(r0)
            okhttp3.ConnectionSpec r2 = (okhttp3.ConnectionSpec) r2
            boolean r2 = r2.isCompatible(r4)
            if (r2 == 0) goto L1a
            r1 = 1
            return r1
        L1a:
            int r0 = r0 + 1
            goto L8
        L1d:
            r0 = 0
            return r0
    }

    public final okhttp3.ConnectionSpec configureSecureSocket(javax.net.ssl.SSLSocket r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r1 = r5.nextModeIndex
            java.util.List<okhttp3.ConnectionSpec> r2 = r5.connectionSpecs
            int r2 = r2.size()
        Le:
            if (r1 >= r2) goto L27
            java.util.List<okhttp3.ConnectionSpec> r3 = r5.connectionSpecs
            java.lang.Object r3 = r3.get(r1)
            okhttp3.ConnectionSpec r3 = (okhttp3.ConnectionSpec) r3
            boolean r4 = r3.isCompatible(r6)
            if (r4 == 0) goto L24
            r0 = r3
            int r2 = r1 + 1
            r5.nextModeIndex = r2
            goto L27
        L24:
            int r1 = r1 + 1
            goto Le
        L27:
            if (r0 == 0) goto L35
            boolean r1 = r5.isFallbackPossible(r6)
            r5.isFallbackPossible = r1
            boolean r1 = r5.isFallback
            r0.apply$okhttp(r6, r1)
            return r0
        L35:
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to find acceptable protocols. isFallback="
            java.lang.StringBuilder r2 = r2.append(r3)
            boolean r3 = r5.isFallback
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", modes="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.util.List<okhttp3.ConnectionSpec> r3 = r5.connectionSpecs
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", supported protocols="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String[] r3 = r6.getEnabledProtocols()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.String r3 = java.util.Arrays.toString(r3)
            java.lang.String r4 = "toString(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public final boolean connectionFailed(java.io.IOException r4) {
            r3 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 1
            r3.isFallback = r0
            boolean r1 = r3.isFallbackPossible
            r2 = 0
            if (r1 != 0) goto L10
            r0 = r2
            goto L36
        L10:
            boolean r1 = r4 instanceof java.net.ProtocolException
            if (r1 == 0) goto L16
            r0 = r2
            goto L36
        L16:
            boolean r1 = r4 instanceof java.io.InterruptedIOException
            if (r1 == 0) goto L1c
            r0 = r2
            goto L36
        L1c:
            boolean r1 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r1 == 0) goto L2a
            java.lang.Throwable r1 = r4.getCause()
            boolean r1 = r1 instanceof java.security.cert.CertificateException
            if (r1 == 0) goto L2a
            r0 = r2
            goto L36
        L2a:
            boolean r1 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r1 == 0) goto L30
            r0 = r2
            goto L36
        L30:
            boolean r1 = r4 instanceof javax.net.ssl.SSLException
            if (r1 == 0) goto L35
            goto L36
        L35:
            r0 = r2
        L36:
            return r0
    }
}
