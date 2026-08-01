package kotlinx.serialization.protobuf.internal;

import io.ktor.util.C4210;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p030.C6308;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5518 extends C5520 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long f15250;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f15251;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5518(C6308 c6308, C5524 c5524, long j, InterfaceC7190 interfaceC7190) {
        super(c6308, c5524, interfaceC7190);
        interfaceC7190.getClass();
        this.f15251 = -1;
        if (j == 19500) {
            int iM10733 = c5524.m10733(ProtoIntegerType.DEFAULT);
            if (iM10733 < 0) {
                C4210.m8610(iM10733, interfaceC7190, ", but got ", "Expected positive length for ");
                throw null;
            }
            j = -iM10733;
        }
        this.f15250 = j;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final long mo10704(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        long j = this.f15250;
        if (j > 0) {
            return j;
        }
        return 19500L;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520, p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10672(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        long j = this.f15250;
        int i = this.f15251;
        C5524 c5524 = this.f15258;
        if (j > 0) {
            if ((i == -1 ? c5524.f15271 : c5524.m10737()) == ((int) (j & 2147483647L))) {
                int i2 = this.f15251 + 1;
                this.f15251 = i2;
                return i2;
            }
            c5524.f15269 = true;
            int typeId = (c5524.f15271 << 3) | c5524.f15270.getTypeId();
            c5524.m10736(c5524.f15268);
            c5524.f15268 = typeId;
            return -1;
        }
        long j2 = -j;
        int i3 = i + 1;
        this.f15251 = i3;
        if (i3 == j2) {
            return -1;
        }
        if (!c5524.f15269) {
            C5516 c5516 = c5524.f15272;
            if (c5516.f15247 - c5516.f15246 == 0) {
                return -1;
            }
        }
        return i3;
    }
}
