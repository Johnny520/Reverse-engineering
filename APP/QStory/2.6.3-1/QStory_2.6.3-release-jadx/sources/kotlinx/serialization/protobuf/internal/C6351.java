package kotlinx.serialization.protobuf.internal;

import io.ktor.util.C5043;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p047.C7156;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6351 extends C6353 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final long f15595;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f15596;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6351(C7156 c7156, C6357 c6357, long j, InterfaceC8020 interfaceC8020) {
        super(c7156, c6357, interfaceC8020);
        interfaceC8020.getClass();
        this.f15596 = -1;
        if (j == 19500) {
            int iM11349 = c6357.m11349(ProtoIntegerType.DEFAULT);
            if (iM11349 < 0) {
                C5043.m9159(iM11349, interfaceC8020, ", but got ", "Expected positive length for ");
                throw null;
            }
            j = -iM11349;
        }
        this.f15595 = j;
    }

    @Override // kotlinx.serialization.protobuf.internal.C6353
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final long mo11320(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        long j = this.f15595;
        if (j > 0) {
            return j;
        }
        return 19500L;
    }

    @Override // kotlinx.serialization.protobuf.internal.C6353, p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo11277(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        long j = this.f15595;
        int i = this.f15596;
        C6357 c6357 = this.f15603;
        if (j > 0) {
            if ((i == -1 ? c6357.f15616 : c6357.m11353()) == ((int) (j & 2147483647L))) {
                int i2 = this.f15596 + 1;
                this.f15596 = i2;
                return i2;
            }
            c6357.f15614 = true;
            int typeId = (c6357.f15616 << 3) | c6357.f15615.getTypeId();
            c6357.m11352(c6357.f15613);
            c6357.f15613 = typeId;
            return -1;
        }
        long j2 = -j;
        int i3 = i + 1;
        this.f15596 = i3;
        if (i3 == j2) {
            return -1;
        }
        if (!c6357.f15614) {
            C6349 c6349 = c6357.f15617;
            if (c6349.f15592 - c6349.f15591 == 0) {
                return -1;
            }
        }
        return i3;
    }
}
