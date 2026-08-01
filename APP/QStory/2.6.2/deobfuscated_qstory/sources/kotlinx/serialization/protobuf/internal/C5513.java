package kotlinx.serialization.protobuf.internal;

import androidx.core.view.C2242;
import com.bumptech.glide.AbstractC3064;
import p030.C6308;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5513 extends C5512 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5513(long j, C2242 c2242, C6308 c6308, InterfaceC7190 interfaceC7190) {
        super(j, c2242, c6308, interfaceC7190);
        c6308.getClass();
        c2242.getClass();
        interfaceC7190.getClass();
    }

    @Override // kotlinx.serialization.protobuf.internal.C5512, kotlinx.serialization.protobuf.internal.C5519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final long mo10702(InterfaceC7190 interfaceC7190, int i) {
        long signature;
        long j;
        interfaceC7190.getClass();
        int i2 = i % 2;
        long j2 = this.f15239;
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
