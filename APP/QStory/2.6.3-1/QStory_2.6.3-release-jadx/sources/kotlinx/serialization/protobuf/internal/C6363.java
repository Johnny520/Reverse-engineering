package kotlinx.serialization.protobuf.internal;

import kotlinx.serialization.SerializationException;
import p106.InterfaceC8018;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6363 extends C6353 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f15623;

    @Override // kotlinx.serialization.protobuf.internal.C6353
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final String mo11334(long j) {
        throw new SerializationException("Packing only supports primitive number types. The actual reading is for string.");
    }

    @Override // kotlinx.serialization.protobuf.internal.C6353
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final long mo11320(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return 19500L;
    }

    @Override // kotlinx.serialization.protobuf.internal.C6353, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8018 mo11235(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        throw new SerializationException("Packing only supports primitive number types. The input type however was a struct: " + interfaceC8020);
    }

    @Override // kotlinx.serialization.protobuf.internal.C6353, p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo11277(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        C6357 c6357 = this.f15603;
        if (!c6357.f15614) {
            C6349 c6349 = c6357.f15617;
            if (c6349.f15592 - c6349.f15591 == 0) {
                return -1;
            }
        }
        int i = this.f15623;
        this.f15623 = i + 1;
        return i;
    }
}
