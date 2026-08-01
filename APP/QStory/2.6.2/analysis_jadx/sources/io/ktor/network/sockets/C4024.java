package io.ktor.network.sockets;

import io.ktor.network.selector.C3999;
import io.ktor.network.selector.C4002;
import io.ktor.network.selector.C4008;
import io.ktor.network.selector.InterfaceC4005;
import io.ktor.network.selector.InterfaceC4007;
import io.ktor.network.selector.SelectInterest;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.InterfaceC5451;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4024 implements InterfaceC4007, InterfaceC4011, InterfaceC4014 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5450 f12282;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ServerSocketChannel f12283;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4005 f12284;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C4008 f12285;

    public C4024(ServerSocketChannel serverSocketChannel, InterfaceC4005 interfaceC4005) {
        interfaceC4005.getClass();
        this.f12285 = new C4008(serverSocketChannel);
        this.f12283 = serverSocketChannel;
        this.f12284 = interfaceC4005;
        if (serverSocketChannel.isBlocking()) {
            C5919.m11249("Channel need to be configured as non-blocking.");
            throw null;
        }
        this.f12282 = AbstractC5398.m10484();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C5450 c5450 = this.f12282;
        InterfaceC4005 interfaceC4005 = this.f12284;
        try {
            try {
                this.f12283.close();
                ((C4002) interfaceC4005).m8414(this);
                c5450.m10551();
            } catch (Throwable th) {
                ((C4002) interfaceC4005).m8414(this);
                throw th;
            }
        } catch (Throwable th2) {
            c5450.m10550(th2);
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5397
    public final void dispose() {
        try {
            close();
        } catch (Throwable unused) {
        }
    }

    @Override // io.ktor.network.sockets.InterfaceC4014
    public final AbstractC4022 getLocalAddress() {
        boolean z = AbstractC4020.f12276;
        ServerSocketChannel serverSocketChannel = this.f12283;
        SocketAddress localAddress = z ? serverSocketChannel.getLocalAddress() : serverSocketChannel.socket().getLocalSocketAddress();
        localAddress.getClass();
        return AbstractC4009.m8429(localAddress);
    }

    @Override // io.ktor.network.selector.InterfaceC4007
    public final boolean isClosed() {
        return this.f12285.f12266.get();
    }

    @Override // io.ktor.network.sockets.InterfaceC4011
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final InterfaceC5451 mo8433() {
        return this.f12282;
    }

    @Override // io.ktor.network.selector.InterfaceC4007
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final int mo8424() {
        return this.f12285.mo8424();
    }

    @Override // io.ktor.network.selector.InterfaceC4007
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo8425(SelectInterest selectInterest, boolean z) {
        selectInterest.getClass();
        this.f12285.mo8425(selectInterest, z);
    }

    @Override // io.ktor.network.selector.InterfaceC4007
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final SelectableChannel mo8426() {
        return this.f12283;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4016 m8440(SocketChannel socketChannel) throws IOException {
        mo8425(SelectInterest.ACCEPT, false);
        socketChannel.configureBlocking(false);
        if (getLocalAddress() instanceof C4028) {
            if (AbstractC4020.f12276) {
                socketChannel.setOption((SocketOption<Boolean>) StandardSocketOptions.TCP_NODELAY, Boolean.TRUE);
            } else {
                socketChannel.socket().setTcpNoDelay(true);
            }
        }
        return new C4016(socketChannel, this.f12284);
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
    public final java.lang.Object m8441(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
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
            io.ktor.network.sockets.飘花落叶言子楪哲苏兰世 r4 = (io.ktor.network.sockets.C4024) r4
            kotlin.AbstractC5184.m10206(r5)
            goto L49
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            r4 = 0
            return r4
        L32:
            kotlin.AbstractC5184.m10206(r5)
        L35:
            io.ktor.network.selector.SelectInterest r5 = io.ktor.network.selector.SelectInterest.ACCEPT
            r4.mo8425(r5, r3)
            io.ktor.network.selector.飘花落叶言子楪苏兰世哲 r2 = r4.f12284
            r0.L$0 = r4
            r0.label = r3
            io.ktor.network.selector.飘花落叶言子楪世苏哲兰 r2 = (io.ktor.network.selector.C4002) r2
            java.lang.Object r5 = r2.m8413(r4, r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            java.nio.channels.ServerSocketChannel r5 = r4.f12283
            java.nio.channels.SocketChannel r5 = r5.accept()
            if (r5 == 0) goto L35
            io.ktor.network.sockets.飘花落叶言子楪兰世苏哲 r4 = r4.m8440(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.C4024.m8441(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.network.selector.InterfaceC4007
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C3999 mo8427() {
        return this.f12285.f12267;
    }
}
