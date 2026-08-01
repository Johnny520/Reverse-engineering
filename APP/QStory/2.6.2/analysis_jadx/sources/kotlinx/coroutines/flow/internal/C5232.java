package kotlinx.coroutines.flow.internal;

import kotlin.C5175;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC5317;
import kotlinx.coroutines.flow.InterfaceC5318;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5232 extends AbstractC5214 {
    public C5232(InterfaceC5318 interfaceC5318, int i, BufferOverflow bufferOverflow, int i2) {
        super(interfaceC5318, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : null, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5216
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5318 mo10289() {
        return this.f14801;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5216
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC5216 mo10290(InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow) {
        return new C5232(this.f14801, interfaceC4359, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo10287(InterfaceC5317 interfaceC5317, InterfaceC4356 interfaceC4356) {
        Object objMo8463 = this.f14801.mo8463(interfaceC5317, interfaceC4356);
        return objMo8463 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8463 : C5175.f14739;
    }
}
