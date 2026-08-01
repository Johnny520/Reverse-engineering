package kotlinx.coroutines.flow.internal;

import kotlin.C6008;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC6150;
import kotlinx.coroutines.flow.InterfaceC6151;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6065 extends AbstractC6047 {
    public C6065(InterfaceC6151 interfaceC6151, int i, BufferOverflow bufferOverflow, int i2) {
        super(interfaceC6151, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : null, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6049
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC6151 mo10852() {
        return this.f15146;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6049
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC6049 mo10853(InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        return new C6065(this.f15146, interfaceC5192, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6047
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo10850(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) {
        Object objMo9012 = this.f15146.mo9012(interfaceC6150, interfaceC5189);
        return objMo9012 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9012 : C6008.f15084;
    }
}
