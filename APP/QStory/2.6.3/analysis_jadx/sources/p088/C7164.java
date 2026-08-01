package p088;

import com.bumptech.glide.AbstractC3066;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.internal.AbstractC5507;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.C7190;
import p091.C7196;
import p091.InterfaceC7191;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7164 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7164 f19133 = new C7164();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7190 f19132 = AbstractC8175.m13649("kotlinx.serialization.json.JsonNull", C7196.f19205, new InterfaceC7191[0]);

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        AbstractC3066.m6850(interfaceC7187);
        if (interfaceC7187.mo10658()) {
            throw new JsonDecodingException(AbstractC5507.m10758("Expected 'null' literal", null, null, -1, null), "Expected 'null' literal", -1, null, null, null);
        }
        return C7163.INSTANCE;
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return f19132;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        ((C7163) obj).getClass();
        AbstractC3066.m6852(interfaceC7186);
        interfaceC7186.mo10709();
    }
}
