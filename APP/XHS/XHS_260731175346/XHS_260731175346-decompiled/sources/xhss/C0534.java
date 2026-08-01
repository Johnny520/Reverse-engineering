package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛱᛱᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0534 extends java.net.ProxySelector {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0534 f1950 = null;

    static {
            xhss.ᛶᛱᛱᲇ r0 = new xhss.ᛶᛱᛱᲇ
            r0.<init>()
            xhss.C0534.f1950 = r0
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
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L9:
            java.lang.String r0 = "uri must not be null"
            xhss.C0532.m959(r0)
            r0 = 0
            return r0
    }
}
