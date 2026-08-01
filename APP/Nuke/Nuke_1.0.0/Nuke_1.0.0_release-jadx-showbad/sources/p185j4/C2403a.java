package p185j4;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: j4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2403a extends ProxySelector {

    /* JADX INFO: renamed from: a */
    public static final C2403a f7765a = new C2403a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return AbstractC2352g.m4211y(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
