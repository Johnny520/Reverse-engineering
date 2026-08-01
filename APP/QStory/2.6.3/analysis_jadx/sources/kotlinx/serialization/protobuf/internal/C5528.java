package kotlinx.serialization.protobuf.internal;

import androidx.core.view.C2242;
import kotlinx.serialization.SerializationException;
import p031.C6327;
import p090.InterfaceC7188;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5528 extends C5513 {
    public C5528(long j, C2242 c2242, C6327 c6327, InterfaceC7191 interfaceC7191) {
        C5516 c5516 = new C5516();
        c6327.getClass();
        c2242.getClass();
        interfaceC7191.getClass();
        super(c6327, c2242, j, interfaceC7191, c5516);
    }

    @Override // kotlinx.serialization.protobuf.internal.C5513, kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final long mo10759(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return 19500L;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5513, kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo10760(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        if (this.f15238.f15244 > 0) {
            super.mo10760(interfaceC7191);
        }
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7188 mo10710(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        throw new SerializationException("Packing only supports primitive number types");
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public final InterfaceC7188 mo10769(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        throw new SerializationException("Packing only supports primitive number types");
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo10772(long j, String str) {
        str.getClass();
        throw new SerializationException("Packing only supports primitive number types");
    }
}
