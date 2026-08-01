package p088;

import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.internal.AbstractC5506;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.C7189;
import p091.C7195;
import p091.InterfaceC7190;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7163 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7163 f19138 = new C7163();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7189 f19137 = AbstractC5061.m10032("kotlinx.serialization.json.JsonNull", C7195.f19210, new InterfaceC7190[0]);

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        AbstractC9124.m14661(interfaceC7186);
        if (interfaceC7186.mo6865()) {
            throw new JsonDecodingException(AbstractC5506.m10701("Expected 'null' literal", null, null, -1, null), "Expected 'null' literal", -1, null, null, null);
        }
        return C7162.INSTANCE;
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f19137;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        ((C7162) obj).getClass();
        AbstractC9124.m14663(interfaceC7185);
        interfaceC7185.mo6799();
    }
}
