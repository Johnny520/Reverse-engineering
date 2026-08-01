package kotlinx.coroutines.flow;

import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC5196;
import kotlinx.coroutines.flow.internal.AbstractC5217;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5302 extends AbstractC5217 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6554 f14887;

    public C5302(InterfaceC6554 interfaceC6554, InterfaceC4360 interfaceC4360, int i, BufferOverflow bufferOverflow) {
        super(interfaceC4360, i, bufferOverflow);
        this.f14887 = interfaceC6554;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5217
    public final String toString() {
        return "block[" + this.f14887 + "] -> " + super.toString();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5217
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo10290(InterfaceC5196 interfaceC5196, InterfaceC4357 interfaceC4357) {
        Object objInvoke = this.f14887.invoke(interfaceC5196, interfaceC4357);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : C5176.f14739;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5217
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public AbstractC5217 mo10294(InterfaceC4360 interfaceC4360, int i, BufferOverflow bufferOverflow) {
        return new C5302(this.f14887, interfaceC4360, i, bufferOverflow);
    }
}
