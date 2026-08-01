package kotlinx.serialization.protobuf.internal;

import io.ktor.util.C4211;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p031.C6327;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5519 extends C5521 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long f15250;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f15251;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5519(C6327 c6327, C5525 c5525, long j, InterfaceC7191 interfaceC7191) {
        super(c6327, c5525, interfaceC7191);
        interfaceC7191.getClass();
        this.f15251 = -1;
        if (j == 19500) {
            int iM10790 = c5525.m10790(ProtoIntegerType.DEFAULT);
            if (iM10790 < 0) {
                C4211.m8600(iM10790, interfaceC7191, ", but got ", "Expected positive length for ");
                throw null;
            }
            j = -iM10790;
        }
        this.f15250 = j;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5521
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final long mo10761(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        long j = this.f15250;
        if (j > 0) {
            return j;
        }
        return 19500L;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5521, p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10718(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        long j = this.f15250;
        int i = this.f15251;
        C5525 c5525 = this.f15258;
        if (j > 0) {
            if ((i == -1 ? c5525.f15271 : c5525.m10794()) == ((int) (j & 2147483647L))) {
                int i2 = this.f15251 + 1;
                this.f15251 = i2;
                return i2;
            }
            c5525.f15269 = true;
            int typeId = (c5525.f15271 << 3) | c5525.f15270.getTypeId();
            c5525.m10793(c5525.f15268);
            c5525.f15268 = typeId;
            return -1;
        }
        long j2 = -j;
        int i3 = i + 1;
        this.f15251 = i3;
        if (i3 == j2) {
            return -1;
        }
        if (!c5525.f15269) {
            C5517 c5517 = c5525.f15272;
            if (c5517.f15247 - c5517.f15246 == 0) {
                return -1;
            }
        }
        return i3;
    }
}
