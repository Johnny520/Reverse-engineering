package kotlinx.serialization.protobuf.internal;

import androidx.core.view.C3075;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p047.C7156;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6345 extends C6352 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C6348 f15583;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final long f15584;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C3075 f15585;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ int f15586 = 1;

    public C6345(long j, C3075 c3075, C7156 c7156, InterfaceC8020 interfaceC8020) {
        C6348 c6348 = new C6348();
        c7156.getClass();
        c3075.getClass();
        interfaceC8020.getClass();
        super(c7156, new C3075(c6348, 27), interfaceC8020);
        this.f15584 = j;
        this.f15585 = c3075;
        this.f15583 = c6348;
    }

    @Override // kotlinx.serialization.protobuf.internal.C6352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public long mo11318(InterfaceC8020 interfaceC8020, int i) {
        switch (this.f15586) {
            case 0:
                interfaceC8020.getClass();
                return ProtoIntegerType.DEFAULT.getSignature() | 1;
            default:
                return super.mo11318(interfaceC8020, i);
        }
    }

    @Override // kotlinx.serialization.protobuf.internal.C6352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public void mo11319(InterfaceC8020 interfaceC8020) {
        int i = this.f15586;
        C3075 c3075 = this.f15585;
        long j = this.f15584;
        C6348 c6348 = this.f15583;
        interfaceC8020.getClass();
        switch (i) {
            case 0:
                c3075.getClass();
                c6348.getClass();
                C3075.m4699(c3075, (C6348) c3075.f6882, ProtoWireType.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
                c3075.m4730(c6348);
                break;
            default:
                if (j == 19500) {
                    c3075.m4730(c6348);
                } else {
                    c3075.getClass();
                    c6348.getClass();
                    C3075.m4699(c3075, (C6348) c3075.f6882, ProtoWireType.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
                    c3075.m4730(c6348);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6345(C7156 c7156, C3075 c3075, long j, InterfaceC8020 interfaceC8020, C6348 c6348) {
        super(c7156, new C3075(c6348, 27), interfaceC8020);
        c7156.getClass();
        c3075.getClass();
        interfaceC8020.getClass();
        this.f15585 = c3075;
        this.f15584 = j;
        this.f15583 = c6348;
    }
}
