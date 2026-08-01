package kotlinx.serialization.protobuf.internal;

import androidx.core.view.C2242;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p030.C6308;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5512 extends C5519 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C5515 f15238;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final long f15239;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C2242 f15240;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ int f15241 = 1;

    public C5512(long j, C2242 c2242, C6308 c6308, InterfaceC7190 interfaceC7190) {
        C5515 c5515 = new C5515();
        c6308.getClass();
        c2242.getClass();
        interfaceC7190.getClass();
        super(c6308, new C2242(c5515, 27), interfaceC7190);
        this.f15239 = j;
        this.f15240 = c2242;
        this.f15238 = c5515;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public long mo10702(InterfaceC7190 interfaceC7190, int i) {
        switch (this.f15241) {
            case 0:
                interfaceC7190.getClass();
                return ProtoIntegerType.DEFAULT.getSignature() | 1;
            default:
                return super.mo10702(interfaceC7190, i);
        }
    }

    @Override // kotlinx.serialization.protobuf.internal.C5519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public void mo10703(InterfaceC7190 interfaceC7190) {
        int i = this.f15241;
        C2242 c2242 = this.f15240;
        long j = this.f15239;
        C5515 c5515 = this.f15238;
        interfaceC7190.getClass();
        switch (i) {
            case 0:
                c2242.getClass();
                c5515.getClass();
                C2242.m4129(c2242, (C5515) c2242.f6536, ProtoWireType.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
                c2242.m4160(c5515);
                break;
            default:
                if (j == 19500) {
                    c2242.m4160(c5515);
                } else {
                    c2242.getClass();
                    c5515.getClass();
                    C2242.m4129(c2242, (C5515) c2242.f6536, ProtoWireType.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
                    c2242.m4160(c5515);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5512(C6308 c6308, C2242 c2242, long j, InterfaceC7190 interfaceC7190, C5515 c5515) {
        super(c6308, new C2242(c5515, 27), interfaceC7190);
        c6308.getClass();
        c2242.getClass();
        interfaceC7190.getClass();
        this.f15240 = c2242;
        this.f15239 = j;
        this.f15238 = c5515;
    }
}
