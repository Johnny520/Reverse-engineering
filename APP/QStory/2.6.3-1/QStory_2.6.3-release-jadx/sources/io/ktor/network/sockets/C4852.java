package io.ktor.network.sockets;

import io.ktor.network.selector.InterfaceC4838;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5081;
import java.nio.channels.SocketChannel;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.C6234;
import p068.InterfaceC7372;
import p111.C8036;
import p111.ExecutorC8037;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4852 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4856 f12622;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C5081 f12623;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12624;

    public /* synthetic */ C4852(AbstractC4856 abstractC4856, C5081 c5081, int i) {
        this.f12624 = i;
        this.f12622 = abstractC4856;
        this.f12623 = c5081;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        switch (this.f12624) {
            case 0:
                AbstractC4856 abstractC4856 = this.f12622;
                SocketChannel socketChannel = ((C4849) abstractC4856).f12620;
                InterfaceC4838 interfaceC4838 = abstractC4856.f12626;
                socketChannel.getClass();
                interfaceC4838.getClass();
                C8036 c8036 = AbstractC6227.f15375;
                InterfaceC5192 interfaceC5192Plus = ExecutorC8037.f19570.plus(new C6234("cio-to-nio-writer"));
                C5081 c5081 = this.f12623;
                return AbstractC5076.m9219(abstractC4856, interfaceC5192Plus, c5081, new CIOWriterKt$attachForWritingDirectImpl$1(abstractC4856, null, c5081, interfaceC4838, socketChannel, null));
            default:
                AbstractC4856 abstractC48562 = this.f12622;
                InterfaceC4838 interfaceC48382 = abstractC48562.f12626;
                SocketChannel socketChannel2 = ((C4849) abstractC48562).f12620;
                socketChannel2.getClass();
                interfaceC48382.getClass();
                C8036 c80362 = AbstractC6227.f15375;
                InterfaceC5192 interfaceC5192Plus2 = ExecutorC8037.f19570.plus(new C6234("cio-from-nio-reader"));
                C5081 c50812 = this.f12623;
                return AbstractC5078.m9255(abstractC48562, interfaceC5192Plus2, c50812, new CIOReaderKt$attachForReadingDirectImpl$1(abstractC48562, null, c50812, socketChannel2, interfaceC48382, null));
        }
    }
}
