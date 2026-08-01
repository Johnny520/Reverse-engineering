package kotlinx.coroutines.flow.internal;

import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC5317;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6550;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5235 extends AbstractC5214 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC6550 f14836;

    public C5235(InterfaceC6550 interfaceC6550, InterfaceC5318 interfaceC5318, InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow) {
        super(interfaceC5318, interfaceC4359, i, bufferOverflow);
        this.f14836 = interfaceC6550;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5216
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC5216 mo10290(InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow) {
        return new C5235(this.f14836, this.f14801, interfaceC4359, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo10287(InterfaceC5317 interfaceC5317, InterfaceC4356 interfaceC4356) throws Throwable {
        Object objM10503 = AbstractC5398.m10503(new ChannelFlowTransformLatest$flowCollect$3(this, interfaceC5317, null), interfaceC4356);
        return objM10503 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10503 : C5175.f14739;
    }
}
