package p103;

import kotlin.C6008;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7921 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7921 f19355 = new C7921();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C7975 f19356 = new C7975("kotlin.Unit", C6008.f15084);

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        this.f19356.deserialize(interfaceC8016);
        return C6008.f15084;
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return this.f19356.getDescriptor();
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        C6008 c6008 = (C6008) obj;
        c6008.getClass();
        this.f19356.serialize(interfaceC8015, c6008);
    }
}
