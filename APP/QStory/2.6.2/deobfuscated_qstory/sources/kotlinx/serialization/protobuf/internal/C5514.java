package kotlinx.serialization.protobuf.internal;

import com.bumptech.glide.AbstractC3064;
import p030.C6308;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5514 extends C5520 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f15242;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5514(C6308 c6308, C5524 c5524, long j, InterfaceC7190 interfaceC7190) {
        super(c6308, c5524, interfaceC7190);
        interfaceC7190.getClass();
        this.f15242 = j;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final long mo10704(InterfaceC7190 interfaceC7190, int i) {
        long signature;
        long j;
        interfaceC7190.getClass();
        int i2 = i % 2;
        long j2 = this.f15242;
        if (i2 == 0) {
            signature = AbstractC3064.m6757(j2).getSignature();
            j = 1;
        } else {
            signature = AbstractC3064.m6757(j2).getSignature();
            j = 2;
        }
        return signature | j;
    }
}
