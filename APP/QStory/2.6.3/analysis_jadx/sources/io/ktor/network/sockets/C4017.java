package io.ktor.network.sockets;

import io.ktor.network.selector.InterfaceC4006;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4017 extends AbstractC4024 implements InterfaceC4022 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final SocketChannel f12275;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4017(SocketChannel socketChannel, InterfaceC4006 interfaceC4006) {
        super(socketChannel, interfaceC4006);
        interfaceC4006.getClass();
        this.f12275 = socketChannel;
        if (socketChannel.isBlocking()) {
            C5925.m11310("Channel need to be configured as non-blocking.");
            throw null;
        }
    }

    @Override // io.ktor.network.sockets.InterfaceC4015
    public final AbstractC4023 getLocalAddress() {
        boolean z = AbstractC4021.f12280;
        SocketChannel socketChannel = this.f12275;
        SocketAddress localAddress = z ? socketChannel.getLocalAddress() : socketChannel.socket().getLocalSocketAddress();
        if (localAddress != null) {
            return AbstractC4010.m8419(localAddress);
        }
        C5925.m11311("Channel is not yet bound");
        return null;
    }

    @Override // io.ktor.network.selector.C4009, io.ktor.network.selector.InterfaceC4008
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final SelectableChannel mo8415() {
        return this.f12275;
    }

    @Override // io.ktor.network.sockets.InterfaceC4014
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC4023 mo8425() {
        boolean z = AbstractC4021.f12280;
        SocketChannel socketChannel = this.f12275;
        SocketAddress remoteAddress = z ? socketChannel.getRemoteAddress() : socketChannel.socket().getRemoteSocketAddress();
        if (remoteAddress != null) {
            return AbstractC4010.m8419(remoteAddress);
        }
        C5925.m11311("Channel is not yet connected");
        return null;
    }
}
