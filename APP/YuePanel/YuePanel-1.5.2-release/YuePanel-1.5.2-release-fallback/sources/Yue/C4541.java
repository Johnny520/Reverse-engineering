package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nNullProxySelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullProxySelector.kt\nokhttp3/internal/proxy/NullProxySelector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class C4541 extends java.net.ProxySelector {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4541 f14548 = null;

    static {
            Yue.ۥۡۢۦۨ r0 = new Yue.ۥۡۢۦۨ
            r0.<init>()
            Yue.C4541.f14548 = r0
            return
    }

    public C4541() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.net.ProxySelector
    public void connectFailed(@Yue.InterfaceC4543 java.net.URI r1, @Yue.InterfaceC4543 java.net.SocketAddress r2, @Yue.InterfaceC4543 java.io.IOException r3) {
            r0 = this;
            return
    }

    @Override // java.net.ProxySelector
    @Yue.InterfaceC4418
    public java.util.List<java.net.Proxy> select(@Yue.InterfaceC4543 java.net.URI r2) {
            r1 = this;
            if (r2 == 0) goto L9
            java.net.Proxy r2 = java.net.Proxy.NO_PROXY
            java.util.List r2 = Yue.C1207.m6190(r2)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "uri must not be null"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }
}
