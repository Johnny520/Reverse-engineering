package kotlinx.serialization.protobuf.internal;

import androidx.core.view.C3075;
import kotlinx.serialization.SerializationException;
import p047.C7156;
import p106.InterfaceC8017;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6360 extends C6345 {
    public C6360(long j, C3075 c3075, C7156 c7156, InterfaceC8020 interfaceC8020) {
        C6348 c6348 = new C6348();
        c7156.getClass();
        c3075.getClass();
        interfaceC8020.getClass();
        super(c7156, c3075, j, interfaceC8020, c6348);
    }

    @Override // kotlinx.serialization.protobuf.internal.C6345, kotlinx.serialization.protobuf.internal.C6352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final long mo11318(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return 19500L;
    }

    @Override // kotlinx.serialization.protobuf.internal.C6345, kotlinx.serialization.protobuf.internal.C6352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo11319(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        if (this.f15583.f15589 > 0) {
            super.mo11319(interfaceC8020);
        }
    }

    @Override // kotlinx.serialization.protobuf.internal.C6352, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8017 mo11269(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        throw new SerializationException("Packing only supports primitive number types");
    }

    @Override // kotlinx.serialization.protobuf.internal.C6352, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public final InterfaceC8017 mo11328(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        throw new SerializationException("Packing only supports primitive number types");
    }

    @Override // kotlinx.serialization.protobuf.internal.C6352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo11331(long j, String str) {
        str.getClass();
        throw new SerializationException("Packing only supports primitive number types");
    }
}
