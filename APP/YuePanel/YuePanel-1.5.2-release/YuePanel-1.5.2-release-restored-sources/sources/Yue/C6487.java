package Yue;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۢۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nNullProxySelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullProxySelector.kt\nokhttp3/internal/proxy/NullProxySelector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class C6487 extends ProxySelector {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C6487 f2112 = new C6487();

    @Override // java.net.ProxySelector
    public void connectFailed(@InterfaceC6489 URI uri, @InterfaceC6489 SocketAddress socketAddress, @InterfaceC6489 IOException iOException) {
    }

    @Override // java.net.ProxySelector
    @InterfaceC6399
    public List<Proxy> select(@InterfaceC6489 URI uri) {
        if (uri != null) {
            return C3879.m10715(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
