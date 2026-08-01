package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C5233;
import kotlinx.coroutines.flow.internal.InterfaceC5230;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5296 implements InterfaceC5264, InterfaceC5319, InterfaceC5230 {
    private final InterfaceC5452 job;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C5267 f14880;

    public C5296(C5267 c5267, InterfaceC5452 interfaceC5452) {
        this.f14880 = c5267;
        this.job = interfaceC5452;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5264
    public final Object getValue() {
        return this.f14880.getValue();
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC5230
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC5319 mo10292(InterfaceC4360 interfaceC4360, int i, BufferOverflow bufferOverflow) {
        return ((((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) && !((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND)) ? new C5233(this, interfaceC4360, i, bufferOverflow) : this;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8453(InterfaceC5318 interfaceC5318, InterfaceC4357 interfaceC4357) {
        return this.f14880.mo8453(interfaceC5318, interfaceC4357);
    }
}
