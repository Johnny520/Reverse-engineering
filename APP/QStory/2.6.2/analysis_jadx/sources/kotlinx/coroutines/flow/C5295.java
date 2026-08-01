package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C5232;
import kotlinx.coroutines.flow.internal.InterfaceC5229;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5295 implements InterfaceC5263, InterfaceC5318, InterfaceC5229 {
    private final InterfaceC5451 job;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C5266 f14880;

    public C5295(C5266 c5266, InterfaceC5451 interfaceC5451) {
        this.f14880 = c5266;
        this.job = interfaceC5451;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5263
    public final Object getValue() {
        return this.f14880.getValue();
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC5229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC5318 mo10288(InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow) {
        return ((((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) && !((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND)) ? new C5232(this, interfaceC4359, i, bufferOverflow) : this;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8463(InterfaceC5317 interfaceC5317, InterfaceC4356 interfaceC4356) {
        return this.f14880.mo8463(interfaceC5317, interfaceC4356);
    }
}
