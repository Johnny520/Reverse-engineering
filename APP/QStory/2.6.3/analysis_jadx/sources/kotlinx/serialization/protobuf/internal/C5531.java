package kotlinx.serialization.protobuf.internal;

import kotlinx.serialization.SerializationException;
import p090.InterfaceC7189;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5531 extends C5521 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f15278;

    @Override // kotlinx.serialization.protobuf.internal.C5521
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final String mo10775(long j) {
        throw new SerializationException("Packing only supports primitive number types. The actual reading is for string.");
    }

    @Override // kotlinx.serialization.protobuf.internal.C5521
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final long mo10761(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return 19500L;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5521, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7189 mo10676(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        throw new SerializationException("Packing only supports primitive number types. The input type however was a struct: " + interfaceC7191);
    }

    @Override // kotlinx.serialization.protobuf.internal.C5521, p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10718(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        C5525 c5525 = this.f15258;
        if (!c5525.f15269) {
            C5517 c5517 = c5525.f15272;
            if (c5517.f15247 - c5517.f15246 == 0) {
                return -1;
            }
        }
        int i = this.f15278;
        this.f15278 = i + 1;
        return i;
    }
}
