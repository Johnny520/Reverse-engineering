package kotlinx.coroutines.flow;

import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC5195;
import kotlinx.coroutines.flow.internal.AbstractC5216;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5301 extends AbstractC5216 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6553 f14887;

    public C5301(InterfaceC6553 interfaceC6553, InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow) {
        super(interfaceC4359, i, bufferOverflow);
        this.f14887 = interfaceC6553;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5216
    public final String toString() {
        return "block[" + this.f14887 + "] -> " + super.toString();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5216
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo10286(InterfaceC5195 interfaceC5195, InterfaceC4356 interfaceC4356) {
        Object objInvoke = this.f14887.invoke(interfaceC5195, interfaceC4356);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : C5175.f14739;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5216
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public AbstractC5216 mo10290(InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow) {
        return new C5301(this.f14887, interfaceC4359, i, bufferOverflow);
    }
}
