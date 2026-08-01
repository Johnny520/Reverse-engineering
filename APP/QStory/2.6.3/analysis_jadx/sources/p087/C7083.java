package p087;

import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.C7192;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7083 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7083 f18997 = new C7083();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7125 f18996 = new C7125("kotlin.Int", C7192.f19190);

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        return Integer.valueOf(interfaceC7187.mo10665());
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return f18996;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        interfaceC7186.mo10645(((Number) obj).intValue());
    }
}
