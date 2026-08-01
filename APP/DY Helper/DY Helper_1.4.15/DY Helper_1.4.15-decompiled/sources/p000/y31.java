package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y31 extends java.net.ProxySelector {

    /* JADX INFO: renamed from: α */
    public static final p000.y31 f12439 = null;

    static {
            y31 r0 = new y31
            r0.<init>()
            p000.y31.f12439 = r0
            return
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(java.net.URI r1, java.net.SocketAddress r2, java.io.IOException r3) {
            r0 = this;
            return
    }

    @Override // java.net.ProxySelector
    public final java.util.List select(java.net.URI r1) {
            r0 = this;
            if (r1 == 0) goto L9
            java.net.Proxy r0 = java.net.Proxy.NO_PROXY
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            return r0
        L9:
            java.lang.String r0 = "uri must not be null"
            p000.C1080.m7275(r0)
            r0 = 0
            return r0
    }
}
