package p087;

import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.C7191;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7121 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7121 f19064 = new C7121();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7124 f19063 = new C7124("kotlin.Byte", C7191.f19189);

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        return Byte.valueOf(interfaceC7186.mo6887());
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f19063;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        interfaceC7185.mo6810(((Number) obj).byteValue());
    }
}
