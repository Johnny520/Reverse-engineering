package p078f7;

import io.ktor.network.sockets.AbstractC3436n;
import io.ktor.network.sockets.AbstractC3442t;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: renamed from: f7.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2349i {
    /* JADX INFO: renamed from: a */
    public static final SocketAddress m8532a(AbstractC3442t abstractC3442t) {
        abstractC3442t.getClass();
        SocketAddress socketAddressM12824a = AbstractC3436n.m12824a(abstractC3442t);
        if (socketAddressM12824a instanceof InetSocketAddress) {
            return (InetSocketAddress) socketAddressM12824a;
        }
        return null;
    }
}
