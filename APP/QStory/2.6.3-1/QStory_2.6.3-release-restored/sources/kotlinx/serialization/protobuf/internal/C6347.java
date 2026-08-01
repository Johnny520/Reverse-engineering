package kotlinx.serialization.protobuf.internal;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import p047.C7156;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6347 extends C6353 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f15587;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6347(C7156 c7156, C6357 c6357, long j, InterfaceC8020 interfaceC8020) {
        super(c7156, c6357, interfaceC8020);
        interfaceC8020.getClass();
        this.f15587 = j;
    }

    @Override // kotlinx.serialization.protobuf.internal.C6353
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final long mo11320(InterfaceC8020 interfaceC8020, int i) {
        long signature;
        long j;
        interfaceC8020.getClass();
        int i2 = i % 2;
        long j2 = this.f15587;
        if (i2 == 0) {
            signature = AbstractC1298.m1723(j2).getSignature();
            j = 1;
        } else {
            signature = AbstractC1298.m1723(j2).getSignature();
            j = 2;
        }
        return signature | j;
    }
}
