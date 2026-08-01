package io.ktor.network.sockets;

import io.ktor.network.selector.C4835;
import io.ktor.network.selector.InterfaceC4838;
import io.ktor.network.selector.SelectInterest;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.sockets.SocketImpl", m556f = "SocketImpl.kt", m557l = {47, 65}, m558m = "connect$ktor_network")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class SocketImpl$connect$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4849 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketImpl$connect$1(C4849 c4849, InterfaceC5189<? super SocketImpl$connect$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4849;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0105, code lost:
    
        r13.mo8973(io.ktor.network.selector.SelectInterest.CONNECT, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010a, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010b, code lost:
    
        top.suzhelan.qstory.hook.item.C6755.m11870("localAddress and remoteAddress should not be null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0110, code lost:
    
        return null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        String hostAddress;
        InetAddress address;
        InetAddress address2;
        String hostAddress2;
        InetAddress address3;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4849 c4849 = this.this$0;
        c4849.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new SocketImpl$connect$1(c4849, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            if (c4849.f12620.connect(null)) {
                return c4849;
            }
            SelectInterest selectInterest = SelectInterest.CONNECT;
            c4849.mo8973(selectInterest, true);
            InterfaceC4838 interfaceC4838 = c4849.f12626;
            this.L$0 = c4849;
            this.label = 1;
            if (((C4835) interfaceC4838).m8962(c4849, selectInterest, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1 && i2 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c4849 = (C4849) this.L$0;
        AbstractC6017.m10769(obj2);
        while (true) {
            SocketChannel socketChannel = c4849.f12620;
            if (socketChannel.finishConnect()) {
                boolean z = AbstractC4853.f12625;
                SocketAddress localAddress = z ? socketChannel.getLocalAddress() : socketChannel.socket().getLocalSocketAddress();
                SocketAddress remoteAddress = z ? socketChannel.getRemoteAddress() : socketChannel.socket().getRemoteSocketAddress();
                if (localAddress != null && remoteAddress != null) {
                    InetSocketAddress inetSocketAddress = localAddress instanceof InetSocketAddress ? (InetSocketAddress) localAddress : null;
                    InetSocketAddress inetSocketAddress2 = remoteAddress instanceof InetSocketAddress ? (InetSocketAddress) remoteAddress : null;
                    if (inetSocketAddress == null && inetSocketAddress2 == null) {
                        break;
                    }
                    String str = "";
                    if (inetSocketAddress == null || (address3 = inetSocketAddress.getAddress()) == null || (hostAddress = address3.getHostAddress()) == null) {
                        hostAddress = "";
                    }
                    if (inetSocketAddress2 != null && (address2 = inetSocketAddress2.getAddress()) != null && (hostAddress2 = address2.getHostAddress()) != null) {
                        str = hostAddress2;
                    }
                    boolean zIsAnyLocalAddress = (inetSocketAddress2 == null || (address = inetSocketAddress2.getAddress()) == null) ? false : address.isAnyLocalAddress();
                    if (!AbstractC5227.m9466(inetSocketAddress != null ? Integer.valueOf(inetSocketAddress.getPort()) : null, inetSocketAddress2 != null ? Integer.valueOf(inetSocketAddress2.getPort()) : null) || (!zIsAnyLocalAddress && !hostAddress.equals(str))) {
                        break;
                    }
                    if (z) {
                        socketChannel.close();
                    } else {
                        socketChannel.socket().close();
                    }
                } else {
                    break;
                }
            } else {
                SelectInterest selectInterest2 = SelectInterest.CONNECT;
                c4849.mo8973(selectInterest2, true);
                InterfaceC4838 interfaceC48382 = c4849.f12626;
                this.L$0 = c4849;
                this.label = 2;
                if (((C4835) interfaceC48382).m8962(c4849, selectInterest2, this) == coroutineSingletons) {
                    break;
                }
            }
        }
        return coroutineSingletons;
    }
}
