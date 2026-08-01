package kotlinx.serialization.protobuf.internal;

import androidx.core.view.C2242;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p031.C6327;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5513 extends C5520 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C5516 f15238;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final long f15239;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C2242 f15240;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ int f15241 = 1;

    public C5513(long j, C2242 c2242, C6327 c6327, InterfaceC7191 interfaceC7191) {
        C5516 c5516 = new C5516();
        c6327.getClass();
        c2242.getClass();
        interfaceC7191.getClass();
        super(c6327, new C2242(c5516, 27), interfaceC7191);
        this.f15239 = j;
        this.f15240 = c2242;
        this.f15238 = c5516;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public long mo10759(InterfaceC7191 interfaceC7191, int i) {
        switch (this.f15241) {
            case 0:
                interfaceC7191.getClass();
                return ProtoIntegerType.DEFAULT.getSignature() | 1;
            default:
                return super.mo10759(interfaceC7191, i);
        }
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public void mo10760(InterfaceC7191 interfaceC7191) {
        int i = this.f15241;
        C2242 c2242 = this.f15240;
        long j = this.f15239;
        C5516 c5516 = this.f15238;
        interfaceC7191.getClass();
        switch (i) {
            case 0:
                c2242.getClass();
                c5516.getClass();
                C2242.m4139(c2242, (C5516) c2242.f6537, ProtoWireType.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
                c2242.m4170(c5516);
                break;
            default:
                if (j == 19500) {
                    c2242.m4170(c5516);
                } else {
                    c2242.getClass();
                    c5516.getClass();
                    C2242.m4139(c2242, (C5516) c2242.f6537, ProtoWireType.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
                    c2242.m4170(c5516);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5513(C6327 c6327, C2242 c2242, long j, InterfaceC7191 interfaceC7191, C5516 c5516) {
        super(c6327, new C2242(c5516, 27), interfaceC7191);
        c6327.getClass();
        c2242.getClass();
        interfaceC7191.getClass();
        this.f15240 = c2242;
        this.f15239 = j;
        this.f15238 = c5516;
    }
}
