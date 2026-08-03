package okhttp3.internal.proxy;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class NullProxySelector extends java.net.ProxySelector {
    public static final okhttp3.internal.proxy.NullProxySelector INSTANCE = null;

    static {
            okhttp3.internal.proxy.NullProxySelector r0 = new okhttp3.internal.proxy.NullProxySelector
            r0.<init>()
            okhttp3.internal.proxy.NullProxySelector.INSTANCE = r0
            return
    }

    private NullProxySelector() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.net.ProxySelector
    public void connectFailed(java.net.URI r1, java.net.SocketAddress r2, java.io.IOException r3) {
            r0 = this;
            return
    }

    @Override // java.net.ProxySelector
    public java.util.List<java.net.Proxy> select(java.net.URI r1) {
            r0 = this;
            if (r1 == 0) goto L9
            java.net.Proxy r1 = java.net.Proxy.NO_PROXY
            java.util.List r1 = a.a.x0(r1)
            return r1
        L9:
            java.lang.String r1 = "uri must not be null"
            j8.o.t(r1)
            r1 = 0
            return r1
    }
}
