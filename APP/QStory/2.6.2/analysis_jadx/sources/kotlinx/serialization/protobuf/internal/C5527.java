package kotlinx.serialization.protobuf.internal;

import androidx.core.view.C2242;
import kotlinx.serialization.SerializationException;
import p030.C6308;
import p090.InterfaceC7187;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5527 extends C5512 {
    public C5527(long j, C2242 c2242, C6308 c6308, InterfaceC7190 interfaceC7190) {
        C5515 c5515 = new C5515();
        c6308.getClass();
        c2242.getClass();
        interfaceC7190.getClass();
        super(c6308, c2242, j, interfaceC7190, c5515);
    }

    @Override // kotlinx.serialization.protobuf.internal.C5512, kotlinx.serialization.protobuf.internal.C5519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final long mo10702(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return 19500L;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5512, kotlinx.serialization.protobuf.internal.C5519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo10703(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        if (this.f15238.f15244 > 0) {
            super.mo10703(interfaceC7190);
        }
    }

    @Override // kotlinx.serialization.protobuf.internal.C5519, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7187 mo6800(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        throw new SerializationException("Packing only supports primitive number types");
    }

    @Override // kotlinx.serialization.protobuf.internal.C5519, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public final InterfaceC7187 mo10712(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        throw new SerializationException("Packing only supports primitive number types");
    }

    @Override // kotlinx.serialization.protobuf.internal.C5519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo10715(long j, String str) {
        str.getClass();
        throw new SerializationException("Packing only supports primitive number types");
    }
}
