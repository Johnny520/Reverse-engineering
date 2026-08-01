package io.ktor.network.sockets;

import io.ktor.network.selector.InterfaceC4005;
import io.ktor.utils.io.AbstractC4243;
import io.ktor.utils.io.AbstractC4245;
import io.ktor.utils.io.C4248;
import java.nio.channels.SocketChannel;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.C5401;
import p052.InterfaceC6542;
import p095.C7206;
import p095.ExecutorC7207;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4019 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4023 f12273;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C4248 f12274;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12275;

    public /* synthetic */ C4019(AbstractC4023 abstractC4023, C4248 c4248, int i) {
        this.f12275 = i;
        this.f12273 = abstractC4023;
        this.f12274 = c4248;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        switch (this.f12275) {
            case 0:
                AbstractC4023 abstractC4023 = this.f12273;
                SocketChannel socketChannel = ((C4016) abstractC4023).f12271;
                InterfaceC4005 interfaceC4005 = abstractC4023.f12277;
                socketChannel.getClass();
                interfaceC4005.getClass();
                C7206 c7206 = AbstractC5394.f15030;
                InterfaceC4359 interfaceC4359Plus = ExecutorC7207.f19230.plus(new C5401("cio-to-nio-writer"));
                C4248 c4248 = this.f12274;
                return AbstractC4243.m8670(abstractC4023, interfaceC4359Plus, c4248, new CIOWriterKt$attachForWritingDirectImpl$1(abstractC4023, null, c4248, interfaceC4005, socketChannel, null));
            default:
                AbstractC4023 abstractC40232 = this.f12273;
                InterfaceC4005 interfaceC40052 = abstractC40232.f12277;
                SocketChannel socketChannel2 = ((C4016) abstractC40232).f12271;
                socketChannel2.getClass();
                interfaceC40052.getClass();
                C7206 c72062 = AbstractC5394.f15030;
                InterfaceC4359 interfaceC4359Plus2 = ExecutorC7207.f19230.plus(new C5401("cio-from-nio-reader"));
                C4248 c42482 = this.f12274;
                return AbstractC4245.m8706(abstractC40232, interfaceC4359Plus2, c42482, new CIOReaderKt$attachForReadingDirectImpl$1(abstractC40232, null, c42482, socketChannel2, interfaceC40052, null));
        }
    }
}
