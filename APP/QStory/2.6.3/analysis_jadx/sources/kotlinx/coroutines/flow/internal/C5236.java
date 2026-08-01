package kotlinx.coroutines.flow.internal;

import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC5318;
import kotlinx.coroutines.flow.InterfaceC5319;
import p052.InterfaceC6551;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5236 extends AbstractC5215 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC6551 f14836;

    public C5236(InterfaceC6551 interfaceC6551, InterfaceC5319 interfaceC5319, InterfaceC4360 interfaceC4360, int i, BufferOverflow bufferOverflow) {
        super(interfaceC5319, interfaceC4360, i, bufferOverflow);
        this.f14836 = interfaceC6551;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5217
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC5217 mo10294(InterfaceC4360 interfaceC4360, int i, BufferOverflow bufferOverflow) {
        return new C5236(this.f14836, this.f14801, interfaceC4360, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5215
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo10291(InterfaceC5318 interfaceC5318, InterfaceC4357 interfaceC4357) throws Throwable {
        Object objM10507 = AbstractC5399.m10507(new ChannelFlowTransformLatest$flowCollect$3(this, interfaceC5318, null), interfaceC4357);
        return objM10507 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10507 : C5176.f14739;
    }
}
