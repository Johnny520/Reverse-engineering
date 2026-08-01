package p009a8;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: a8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0172a {
    /* JADX INFO: renamed from: a */
    public static final String m411a(SocketAddress socketAddress) {
        String hostString;
        socketAddress.getClass();
        InetSocketAddress inetSocketAddress = socketAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddress : null;
        return (inetSocketAddress == null || (hostString = inetSocketAddress.getHostString()) == null) ? _UrlKt.FRAGMENT_ENCODE_SET : hostString;
    }

    /* JADX INFO: renamed from: b */
    public static final int m412b(SocketAddress socketAddress) {
        socketAddress.getClass();
        InetSocketAddress inetSocketAddress = socketAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddress : null;
        if (inetSocketAddress != null) {
            return inetSocketAddress.getPort();
        }
        return 0;
    }
}
