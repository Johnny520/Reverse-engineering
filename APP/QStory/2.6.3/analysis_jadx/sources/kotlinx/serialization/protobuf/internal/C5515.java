package kotlinx.serialization.protobuf.internal;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import p031.C6327;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5515 extends C5521 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f15242;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5515(C6327 c6327, C5525 c5525, long j, InterfaceC7191 interfaceC7191) {
        super(c6327, c5525, interfaceC7191);
        interfaceC7191.getClass();
        this.f15242 = j;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5521
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final long mo10761(InterfaceC7191 interfaceC7191, int i) {
        long signature;
        long j;
        interfaceC7191.getClass();
        int i2 = i % 2;
        long j2 = this.f15242;
        if (i2 == 0) {
            signature = AbstractC0455.m1163(j2).getSignature();
            j = 1;
        } else {
            signature = AbstractC0455.m1163(j2).getSignature();
            j = 2;
        }
        return signature | j;
    }
}
