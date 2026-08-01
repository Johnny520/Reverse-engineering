package kotlinx.coroutines.flow.internal;

import kotlin.C5176;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC5318;
import kotlinx.coroutines.flow.InterfaceC5319;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5233 extends AbstractC5215 {
    public C5233(InterfaceC5319 interfaceC5319, int i, BufferOverflow bufferOverflow, int i2) {
        super(interfaceC5319, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : null, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5217
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5319 mo10293() {
        return this.f14801;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5217
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC5217 mo10294(InterfaceC4360 interfaceC4360, int i, BufferOverflow bufferOverflow) {
        return new C5233(this.f14801, interfaceC4360, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5215
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo10291(InterfaceC5318 interfaceC5318, InterfaceC4357 interfaceC4357) {
        Object objMo8453 = this.f14801.mo8453(interfaceC5318, interfaceC4357);
        return objMo8453 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8453 : C5176.f14739;
    }
}
