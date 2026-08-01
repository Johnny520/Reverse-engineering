package kotlinx.serialization.protobuf.internal;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.core.view.C2242;
import p031.C6327;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5514 extends C5513 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5514(long j, C2242 c2242, C6327 c6327, InterfaceC7191 interfaceC7191) {
        super(j, c2242, c6327, interfaceC7191);
        c6327.getClass();
        c2242.getClass();
        interfaceC7191.getClass();
    }

    @Override // kotlinx.serialization.protobuf.internal.C5513, kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final long mo10759(InterfaceC7191 interfaceC7191, int i) {
        long signature;
        long j;
        interfaceC7191.getClass();
        int i2 = i % 2;
        long j2 = this.f15239;
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
