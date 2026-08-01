package p103;

import kotlin.C6011;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7926 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7926 f19364 = new C7926();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7917 f19363 = AbstractC7973.m12975("kotlin.ULong", C7901.f19321);

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        return new C6011(interfaceC8016.mo11248(f19363).mo11227());
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f19363;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        interfaceC8015.mo11275(f19363).mo11210(((C6011) obj).f15087);
    }
}
