package defpackage;

/* JADX INFO: renamed from: ᛶᲇᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1170 extends java.net.ProxySelector {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1170 f5291 = null;

    static {
            ᛶᲇᛵᛳ r0 = new ᛶᲇᛵᛳ
            r0.<init>()
            defpackage.C1170.f5291 = r0
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
            defpackage.C2264.m3684(r0)
            r0 = 0
            return r0
    }
}
