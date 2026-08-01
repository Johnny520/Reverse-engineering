package io.ktor.network.sockets;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import p024b9.AbstractC1061t;
import p376zd.C10010p0;

/* JADX INFO: renamed from: io.ktor.network.sockets.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3436n {
    /* JADX INFO: renamed from: a */
    public static final SocketAddress m12824a(AbstractC3442t abstractC3442t) {
        abstractC3442t.getClass();
        return abstractC3442t.mo12804a();
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC3442t m12825b(SocketAddress socketAddress) {
        socketAddress.getClass();
        if (socketAddress instanceof InetSocketAddress) {
            return new C3435m((InetSocketAddress) socketAddress);
        }
        if (AbstractC1061t.m3842c(socketAddress.getClass().getName(), "java.net.UnixDomainSocketAddress")) {
            return new C3426d0(socketAddress);
        }
        C10010p0.m38820a("Unknown socket address type");
        return null;
    }
}
