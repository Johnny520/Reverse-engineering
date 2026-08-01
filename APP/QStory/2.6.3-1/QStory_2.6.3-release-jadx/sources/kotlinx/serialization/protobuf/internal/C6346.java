package kotlinx.serialization.protobuf.internal;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.core.view.C3075;
import p047.C7156;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6346 extends C6345 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6346(long j, C3075 c3075, C7156 c7156, InterfaceC8020 interfaceC8020) {
        super(j, c3075, c7156, interfaceC8020);
        c7156.getClass();
        c3075.getClass();
        interfaceC8020.getClass();
    }

    @Override // kotlinx.serialization.protobuf.internal.C6345, kotlinx.serialization.protobuf.internal.C6352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final long mo11318(InterfaceC8020 interfaceC8020, int i) {
        long signature;
        long j;
        interfaceC8020.getClass();
        int i2 = i % 2;
        long j2 = this.f15584;
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
