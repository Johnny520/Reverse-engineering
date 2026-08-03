package okhttp3.internal.connection;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectionSpecSelector {
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(java.util.List<okhttp3.ConnectionSpec> r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.connectionSpecs = r1
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
            r4 = 1
            return r4
        L1a:
            int r0 = r0 + 1
            goto L8
        L1d:
            r4 = 0
            return r4
    }

    public final okhttp3.ConnectionSpec configureSecureSocket(javax.net.ssl.SSLSocket r5) {
            r4 = this;
            r5.getClass()
            int r0 = r4.nextModeIndex
            java.util.List<okhttp3.ConnectionSpec> r1 = r4.connectionSpecs
            int r1 = r1.size()
        Lb:
            if (r0 >= r1) goto L23
            java.util.List<okhttp3.ConnectionSpec> r2 = r4.connectionSpecs
            java.lang.Object r2 = r2.get(r0)
            okhttp3.ConnectionSpec r2 = (okhttp3.ConnectionSpec) r2
            boolean r3 = r2.isCompatible(r5)
            if (r3 == 0) goto L20
            int r0 = r0 + 1
            r4.nextModeIndex = r0
            goto L24
        L20:
            int r0 = r0 + 1
            goto Lb
        L23:
            r2 = 0
        L24:
            if (r2 == 0) goto L32
            boolean r0 = r4.isFallbackPossible(r5)
            r4.isFallbackPossible = r0
            boolean r0 = r4.isFallback
            r2.apply$okhttp(r5, r0)
            return r2
        L32:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to find acceptable protocols. isFallback="
            r1.<init>(r2)
            boolean r2 = r4.isFallback
            r1.append(r2)
            java.lang.String r2 = ", modes="
            r1.append(r2)
            java.util.List<okhttp3.ConnectionSpec> r2 = r4.connectionSpecs
            r1.append(r2)
            java.lang.String[] r5 = r5.getEnabledProtocols()
            r5.getClass()
            java.lang.String r5 = java.util.Arrays.toString(r5)
            r5.getClass()
            java.lang.String r2 = ", supported protocols="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public final boolean connectionFailed(java.io.IOException r4) {
            r3 = this;
            r4.getClass()
            r0 = 1
            r3.isFallback = r0
            boolean r1 = r3.isFallbackPossible
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            boolean r1 = r4 instanceof java.net.ProtocolException
            if (r1 == 0) goto L11
            return r2
        L11:
            boolean r1 = r4 instanceof java.io.InterruptedIOException
            if (r1 == 0) goto L16
            return r2
        L16:
            boolean r1 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r1 == 0) goto L23
            java.lang.Throwable r1 = r4.getCause()
            boolean r1 = r1 instanceof java.security.cert.CertificateException
            if (r1 == 0) goto L23
            return r2
        L23:
            boolean r1 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r1 == 0) goto L28
            return r2
        L28:
            boolean r4 = r4 instanceof javax.net.ssl.SSLException
            if (r4 == 0) goto L2d
            return r0
        L2d:
            return r2
    }
}
