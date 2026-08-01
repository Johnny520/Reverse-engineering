package p103;

import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.C8021;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7951 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7951 f19404 = new C7951();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7954 f19403 = new C7954("kotlin.Byte", C8021.f19537);

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        return Byte.valueOf(interfaceC8016.mo11259());
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f19403;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        interfaceC8015.mo11206(((Number) obj).byteValue());
    }
}
