package io.ktor.network.sockets;

import io.ktor.network.sockets.AbstractC3447y;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import p024b9.AbstractC1043k;
import p339x6.InterfaceC9457j;
import p376zd.C10010p0;
import p376zd.C9987e;

/* JADX INFO: renamed from: io.ktor.network.sockets.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3446x extends AbstractC3438p implements InterfaceC3441s {

    /* JADX INFO: renamed from: C */
    public final SocketChannel f9501C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3446x(SocketChannel socketChannel, InterfaceC9457j interfaceC9457j, AbstractC3447y.e eVar) {
        super(socketChannel, interfaceC9457j, null, eVar);
        socketChannel.getClass();
        interfaceC9457j.getClass();
        this.f9501C = socketChannel;
        if (mo12830Z().isBlocking()) {
            C9987e.m38645a("Channel need to be configured as non-blocking.");
            throw null;
        }
    }

    @Override // io.ktor.network.sockets.AbstractC3438p, p339x6.InterfaceC9455h
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public SocketChannel mo12830Z() {
        return this.f9501C;
    }

    @Override // io.ktor.network.sockets.InterfaceC3419a
    public AbstractC3442t getLocalAddress() {
        AbstractC3442t abstractC3442tM12825b;
        SocketAddress localAddress = AbstractC3437o.m12827b() ? mo12830Z().getLocalAddress() : mo12830Z().socket().getLocalSocketAddress();
        if (localAddress != null && (abstractC3442tM12825b = AbstractC3436n.m12825b(localAddress)) != null) {
            return abstractC3442tM12825b;
        }
        C10010p0.m38820a("Channel is not yet bound");
        return null;
    }

    @Override // io.ktor.network.sockets.InterfaceC3421b
    /* JADX INFO: renamed from: j */
    public AbstractC3442t mo12793j() {
        AbstractC3442t abstractC3442tM12825b;
        SocketAddress remoteAddress = AbstractC3437o.m12827b() ? mo12830Z().getRemoteAddress() : mo12830Z().socket().getRemoteSocketAddress();
        if (remoteAddress != null && (abstractC3442tM12825b = AbstractC3436n.m12825b(remoteAddress)) != null) {
            return abstractC3442tM12825b;
        }
        C10010p0.m38820a("Channel is not yet connected");
        return null;
    }

    public /* synthetic */ C3446x(SocketChannel socketChannel, InterfaceC9457j interfaceC9457j, AbstractC3447y.e eVar, int i10, AbstractC1043k abstractC1043k) {
        this(socketChannel, interfaceC9457j, (i10 & 4) != 0 ? null : eVar);
    }
}
