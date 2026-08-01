package io.ktor.network.sockets;

import io.ktor.network.selector.C4832;
import io.ktor.network.selector.C4835;
import io.ktor.network.selector.C4841;
import io.ktor.network.selector.InterfaceC4838;
import io.ktor.network.selector.InterfaceC4840;
import io.ktor.network.selector.SelectInterest;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.InterfaceC6284;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4857 implements InterfaceC4840, InterfaceC4844, InterfaceC4847 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6283 f12631;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ServerSocketChannel f12632;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4838 f12633;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C4841 f12634;

    public C4857(ServerSocketChannel serverSocketChannel, InterfaceC4838 interfaceC4838) {
        interfaceC4838.getClass();
        this.f12634 = new C4841(serverSocketChannel);
        this.f12632 = serverSocketChannel;
        this.f12633 = interfaceC4838;
        if (serverSocketChannel.isBlocking()) {
            C6755.m11869("Channel need to be configured as non-blocking.");
            throw null;
        }
        this.f12631 = AbstractC6231.m11047();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C6283 c6283 = this.f12631;
        InterfaceC4838 interfaceC4838 = this.f12633;
        try {
            try {
                this.f12632.close();
                ((C4835) interfaceC4838).m8963(this);
                c6283.m11114();
            } catch (Throwable th) {
                ((C4835) interfaceC4838).m8963(this);
                throw th;
            }
        } catch (Throwable th2) {
            c6283.m11113(th2);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6230
    public final void dispose() {
        try {
            close();
        } catch (Throwable unused) {
        }
    }

    @Override // io.ktor.network.sockets.InterfaceC4847
    public final AbstractC4855 getLocalAddress() {
        boolean z = AbstractC4853.f12625;
        ServerSocketChannel serverSocketChannel = this.f12632;
        SocketAddress localAddress = z ? serverSocketChannel.getLocalAddress() : serverSocketChannel.socket().getLocalSocketAddress();
        localAddress.getClass();
        return AbstractC4842.m8978(localAddress);
    }

    @Override // io.ktor.network.selector.InterfaceC4840
    public final boolean isClosed() {
        return this.f12634.f12615.get();
    }

    @Override // io.ktor.network.sockets.InterfaceC4844
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final InterfaceC6284 mo8982() {
        return this.f12631;
    }

    @Override // io.ktor.network.selector.InterfaceC4840
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final void mo8973(SelectInterest selectInterest, boolean z) {
        selectInterest.getClass();
        this.f12634.mo8973(selectInterest, z);
    }

    @Override // io.ktor.network.selector.InterfaceC4840
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final SelectableChannel mo8974() {
        return this.f12632;
    }

    @Override // io.ktor.network.selector.InterfaceC4840
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final int mo8975() {
        return this.f12634.mo8975();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4849 m8989(SocketChannel socketChannel) throws IOException {
        mo8973(SelectInterest.ACCEPT, false);
        socketChannel.configureBlocking(false);
        if (getLocalAddress() instanceof C4861) {
            if (AbstractC4853.f12625) {
                socketChannel.setOption((SocketOption<Boolean>) StandardSocketOptions.TCP_NODELAY, Boolean.TRUE);
            } else {
                socketChannel.socket().setTcpNoDelay(true);
            }
        }
        return new C4849(socketChannel, this.f12633);
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
    */
    public final java.lang.Object m8990(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
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
            io.ktor.network.sockets.飘花落叶言子楪哲苏兰世 r4 = (io.ktor.network.sockets.C4857) r4
            kotlin.AbstractC6017.m10769(r5)
            goto L49
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C6755.m11870(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC6017.m10769(r5)
        L35:
            io.ktor.network.selector.SelectInterest r5 = io.ktor.network.selector.SelectInterest.ACCEPT
            r4.mo8973(r5, r3)
            io.ktor.network.selector.飘花落叶言子楪苏兰世哲 r2 = r4.f12633
            r0.L$0 = r4
            r0.label = r3
            io.ktor.network.selector.飘花落叶言子楪世苏哲兰 r2 = (io.ktor.network.selector.C4835) r2
            java.lang.Object r5 = r2.m8962(r4, r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            java.nio.channels.ServerSocketChannel r5 = r4.f12632
            java.nio.channels.SocketChannel r5 = r5.accept()
            if (r5 == 0) goto L35
            io.ktor.network.sockets.飘花落叶言子楪兰世苏哲 r4 = r4.m8989(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.C4857.m8990(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.network.selector.InterfaceC4840
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final C4832 mo8976() {
        return this.f12634.f12616;
    }
}
