package kotlinx.coroutines.flow.internal;

import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC6150;
import kotlinx.coroutines.flow.InterfaceC6151;
import p068.InterfaceC7380;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6068 extends AbstractC6047 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC7380 f15181;

    public C6068(InterfaceC7380 interfaceC7380, InterfaceC6151 interfaceC6151, InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        super(interfaceC6151, interfaceC5192, i, bufferOverflow);
        this.f15181 = interfaceC7380;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6049
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC6049 mo10853(InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        return new C6068(this.f15181, this.f15146, interfaceC5192, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6047
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo10850(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) throws Throwable {
        Object objM11066 = AbstractC6231.m11066(new ChannelFlowTransformLatest$flowCollect$3(this, interfaceC6150, null), interfaceC5189);
        return objM11066 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11066 : C6008.f15084;
    }
}
