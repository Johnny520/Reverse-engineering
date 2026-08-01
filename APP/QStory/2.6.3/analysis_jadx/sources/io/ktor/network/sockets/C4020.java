package io.ktor.network.sockets;

import io.ktor.network.selector.InterfaceC4006;
import io.ktor.utils.io.AbstractC4244;
import io.ktor.utils.io.AbstractC4246;
import io.ktor.utils.io.C4249;
import java.nio.channels.SocketChannel;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.C5402;
import p052.InterfaceC6543;
import p095.C7207;
import p095.ExecutorC7208;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4020 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4024 f12277;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C4249 f12278;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12279;

    public /* synthetic */ C4020(AbstractC4024 abstractC4024, C4249 c4249, int i) {
        this.f12279 = i;
        this.f12277 = abstractC4024;
        this.f12278 = c4249;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        switch (this.f12279) {
            case 0:
                AbstractC4024 abstractC4024 = this.f12277;
                SocketChannel socketChannel = ((C4017) abstractC4024).f12275;
                InterfaceC4006 interfaceC4006 = abstractC4024.f12281;
                socketChannel.getClass();
                interfaceC4006.getClass();
                C7207 c7207 = AbstractC5395.f15030;
                InterfaceC4360 interfaceC4360Plus = ExecutorC7208.f19225.plus(new C5402("cio-to-nio-writer"));
                C4249 c4249 = this.f12278;
                return AbstractC4244.m8660(abstractC4024, interfaceC4360Plus, c4249, new CIOWriterKt$attachForWritingDirectImpl$1(abstractC4024, null, c4249, interfaceC4006, socketChannel, null));
            default:
                AbstractC4024 abstractC40242 = this.f12277;
                InterfaceC4006 interfaceC40062 = abstractC40242.f12281;
                SocketChannel socketChannel2 = ((C4017) abstractC40242).f12275;
                socketChannel2.getClass();
                interfaceC40062.getClass();
                C7207 c72072 = AbstractC5395.f15030;
                InterfaceC4360 interfaceC4360Plus2 = ExecutorC7208.f19225.plus(new C5402("cio-from-nio-reader"));
                C4249 c42492 = this.f12278;
                return AbstractC4246.m8696(abstractC40242, interfaceC4360Plus2, c42492, new CIOReaderKt$attachForReadingDirectImpl$1(abstractC40242, null, c42492, socketChannel2, interfaceC40062, null));
        }
    }
}
