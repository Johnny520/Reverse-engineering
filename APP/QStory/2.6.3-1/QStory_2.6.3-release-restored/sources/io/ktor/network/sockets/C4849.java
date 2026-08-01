package io.ktor.network.sockets;

import io.ktor.network.selector.InterfaceC4838;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4849 extends AbstractC4856 implements InterfaceC4854 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final SocketChannel f12620;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4849(SocketChannel socketChannel, InterfaceC4838 interfaceC4838) {
        super(socketChannel, interfaceC4838);
        interfaceC4838.getClass();
        this.f12620 = socketChannel;
        if (socketChannel.isBlocking()) {
            C6755.m11869("Channel need to be configured as non-blocking.");
            throw null;
        }
    }

    @Override // io.ktor.network.sockets.InterfaceC4847
    public final AbstractC4855 getLocalAddress() {
        boolean z = AbstractC4853.f12625;
        SocketChannel socketChannel = this.f12620;
        SocketAddress localAddress = z ? socketChannel.getLocalAddress() : socketChannel.socket().getLocalSocketAddress();
        if (localAddress != null) {
            return AbstractC4842.m8978(localAddress);
        }
        C6755.m11870("Channel is not yet bound");
        return null;
    }

    @Override // io.ktor.network.selector.C4841, io.ktor.network.selector.InterfaceC4840
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final SelectableChannel mo8974() {
        return this.f12620;
    }

    @Override // io.ktor.network.sockets.InterfaceC4846
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC4855 mo8984() {
        boolean z = AbstractC4853.f12625;
        SocketChannel socketChannel = this.f12620;
        SocketAddress remoteAddress = z ? socketChannel.getRemoteAddress() : socketChannel.socket().getRemoteSocketAddress();
        if (remoteAddress != null) {
            return AbstractC4842.m8978(remoteAddress);
        }
        C6755.m11870("Channel is not yet connected");
        return null;
    }
}
