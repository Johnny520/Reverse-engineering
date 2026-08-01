package io.ktor.network.sockets;

import io.ktor.network.selector.C4000;
import io.ktor.network.selector.C4003;
import io.ktor.network.selector.C4009;
import io.ktor.network.selector.InterfaceC4006;
import io.ktor.network.selector.InterfaceC4008;
import io.ktor.network.selector.SelectInterest;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.InterfaceC5452;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4025 implements InterfaceC4008, InterfaceC4012, InterfaceC4015 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5451 f12286;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ServerSocketChannel f12287;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4006 f12288;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C4009 f12289;

    public C4025(ServerSocketChannel serverSocketChannel, InterfaceC4006 interfaceC4006) {
        interfaceC4006.getClass();
        this.f12289 = new C4009(serverSocketChannel);
        this.f12287 = serverSocketChannel;
        this.f12288 = interfaceC4006;
        if (serverSocketChannel.isBlocking()) {
            C5925.m11310("Channel need to be configured as non-blocking.");
            throw null;
        }
        this.f12286 = AbstractC5399.m10488();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C5451 c5451 = this.f12286;
        InterfaceC4006 interfaceC4006 = this.f12288;
        try {
            try {
                this.f12287.close();
                ((C4003) interfaceC4006).m8404(this);
                c5451.m10555();
            } catch (Throwable th) {
                ((C4003) interfaceC4006).m8404(this);
                throw th;
            }
        } catch (Throwable th2) {
            c5451.m10554(th2);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5398
    public final void dispose() {
        try {
            close();
        } catch (Throwable unused) {
        }
    }

    @Override // io.ktor.network.sockets.InterfaceC4015
    public final AbstractC4023 getLocalAddress() {
        boolean z = AbstractC4021.f12280;
        ServerSocketChannel serverSocketChannel = this.f12287;
        SocketAddress localAddress = z ? serverSocketChannel.getLocalAddress() : serverSocketChannel.socket().getLocalSocketAddress();
        localAddress.getClass();
        return AbstractC4010.m8419(localAddress);
    }

    @Override // io.ktor.network.selector.InterfaceC4008
    public final boolean isClosed() {
        return this.f12289.f12270.get();
    }

    @Override // io.ktor.network.sockets.InterfaceC4012
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final InterfaceC5452 mo8423() {
        return this.f12286;
    }

    @Override // io.ktor.network.selector.InterfaceC4008
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo8414(SelectInterest selectInterest, boolean z) {
        selectInterest.getClass();
        this.f12289.mo8414(selectInterest, z);
    }

    @Override // io.ktor.network.selector.InterfaceC4008
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final SelectableChannel mo8415() {
        return this.f12287;
    }

    @Override // io.ktor.network.selector.InterfaceC4008
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final int mo8416() {
        return this.f12289.mo8416();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4017 m8430(SocketChannel socketChannel) throws IOException {
        mo8414(SelectInterest.ACCEPT, false);
        socketChannel.configureBlocking(false);
        if (getLocalAddress() instanceof C4029) {
            if (AbstractC4021.f12280) {
                socketChannel.setOption((SocketOption<Boolean>) StandardSocketOptions.TCP_NODELAY, Boolean.TRUE);
            } else {
                socketChannel.socket().setTcpNoDelay(true);
            }
        }
        return new C4017(socketChannel, this.f12288);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:18:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8431(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1 r0 = (io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1 r0 = new io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            io.ktor.network.sockets.飘花落叶言子楪哲苏兰世 r4 = (io.ktor.network.sockets.C4025) r4
            kotlin.AbstractC5185.m10210(r5)
            goto L49
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC5185.m10210(r5)
        L35:
            io.ktor.network.selector.SelectInterest r5 = io.ktor.network.selector.SelectInterest.ACCEPT
            r4.mo8414(r5, r3)
            io.ktor.network.selector.飘花落叶言子楪苏兰世哲 r2 = r4.f12288
            r0.L$0 = r4
            r0.label = r3
            io.ktor.network.selector.飘花落叶言子楪世苏哲兰 r2 = (io.ktor.network.selector.C4003) r2
            java.lang.Object r5 = r2.m8403(r4, r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            java.nio.channels.ServerSocketChannel r5 = r4.f12287
            java.nio.channels.SocketChannel r5 = r5.accept()
            if (r5 == 0) goto L35
            io.ktor.network.sockets.飘花落叶言子楪兰世苏哲 r4 = r4.m8430(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.C4025.m8431(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.network.selector.InterfaceC4008
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final C4000 mo8417() {
        return this.f12289.f12271;
    }
}
