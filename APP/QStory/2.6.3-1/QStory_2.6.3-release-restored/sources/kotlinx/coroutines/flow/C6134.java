package kotlinx.coroutines.flow;

import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.coroutines.flow.internal.AbstractC6049;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6134 extends AbstractC6049 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC7383 f15232;

    public C6134(InterfaceC7383 interfaceC7383, InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        super(interfaceC5192, i, bufferOverflow);
        this.f15232 = interfaceC7383;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6049
    public final String toString() {
        return "block[" + this.f15232 + "] -> " + super.toString();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6049
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo10849(InterfaceC6028 interfaceC6028, InterfaceC5189 interfaceC5189) {
        Object objInvoke = this.f15232.invoke(interfaceC6028, interfaceC5189);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : C6008.f15084;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6049
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public AbstractC6049 mo10853(InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        return new C6134(this.f15232, interfaceC5192, i, bufferOverflow);
    }
}
