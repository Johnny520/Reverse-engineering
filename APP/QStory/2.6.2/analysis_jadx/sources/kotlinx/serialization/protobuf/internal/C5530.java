package kotlinx.serialization.protobuf.internal;

import kotlinx.serialization.SerializationException;
import p090.InterfaceC7188;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5530 extends C5520 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f15278;

    @Override // kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final String mo10718(long j) {
        throw new SerializationException("Packing only supports primitive number types. The actual reading is for string.");
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final long mo10704(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return 19500L;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7188 mo6876(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        throw new SerializationException("Packing only supports primitive number types. The input type however was a struct: " + interfaceC7190);
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520, p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10672(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        C5524 c5524 = this.f15258;
        if (!c5524.f15269) {
            C5516 c5516 = c5524.f15272;
            if (c5516.f15247 - c5516.f15246 == 0) {
                return -1;
            }
        }
        int i = this.f15278;
        this.f15278 = i + 1;
        return i;
    }
}
