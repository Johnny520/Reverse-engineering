package p087;

import kotlinx.serialization.SerializationException;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7142 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7142 f19106 = new C7142();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7065 f19105 = C7065.f18970;

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f19105;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        ((Void) obj).getClass();
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
