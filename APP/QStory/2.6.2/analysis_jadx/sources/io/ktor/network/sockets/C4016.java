package io.ktor.network.sockets;

import io.ktor.network.selector.InterfaceC4005;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4016 extends AbstractC4023 implements InterfaceC4021 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final SocketChannel f12271;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4016(SocketChannel socketChannel, InterfaceC4005 interfaceC4005) {
        super(socketChannel, interfaceC4005);
        interfaceC4005.getClass();
        this.f12271 = socketChannel;
        if (socketChannel.isBlocking()) {
            C5919.m11249("Channel need to be configured as non-blocking.");
            throw null;
        }
    }

    @Override // io.ktor.network.sockets.InterfaceC4014
    public final AbstractC4022 getLocalAddress() {
        boolean z = AbstractC4020.f12276;
        SocketChannel socketChannel = this.f12271;
        SocketAddress localAddress = z ? socketChannel.getLocalAddress() : socketChannel.socket().getLocalSocketAddress();
        if (localAddress != null) {
            return AbstractC4009.m8429(localAddress);
        }
        C5919.m11250("Channel is not yet bound");
        return null;
    }

    @Override // io.ktor.network.selector.C4008, io.ktor.network.selector.InterfaceC4007
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final SelectableChannel mo8426() {
        return this.f12271;
    }

    @Override // io.ktor.network.sockets.InterfaceC4013
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC4022 mo8435() {
        boolean z = AbstractC4020.f12276;
        SocketChannel socketChannel = this.f12271;
        SocketAddress remoteAddress = z ? socketChannel.getRemoteAddress() : socketChannel.socket().getRemoteSocketAddress();
        if (remoteAddress != null) {
            return AbstractC4009.m8429(remoteAddress);
        }
        C5919.m11250("Channel is not yet connected");
        return null;
    }
}
