package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C6065;
import kotlinx.coroutines.flow.internal.InterfaceC6062;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6128 implements InterfaceC6096, InterfaceC6151, InterfaceC6062 {
    private final InterfaceC6284 job;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6099 f15225;

    public C6128(C6099 c6099, InterfaceC6284 interfaceC6284) {
        this.f15225 = c6099;
        this.job = interfaceC6284;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6096
    public final Object getValue() {
        return this.f15225.getValue();
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC6062
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6151 mo10851(InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        return ((((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) && !((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND)) ? new C6065(this, interfaceC5192, i, bufferOverflow) : this;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6151
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9012(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) {
        return this.f15225.mo9012(interfaceC6150, interfaceC5189);
    }
}
