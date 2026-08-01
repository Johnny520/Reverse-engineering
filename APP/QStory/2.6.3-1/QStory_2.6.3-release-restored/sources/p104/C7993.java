package p104;

import com.bumptech.glide.AbstractC3898;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.internal.AbstractC6339;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.C8019;
import p107.C8025;
import p107.InterfaceC8020;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7993 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7993 f19478 = new C7993();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8019 f19477 = AbstractC9004.m14208("kotlinx.serialization.json.JsonNull", C8025.f19550, new InterfaceC8020[0]);

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        AbstractC3898.m7410(interfaceC8016);
        if (interfaceC8016.mo11217()) {
            throw new JsonDecodingException(AbstractC6339.m11317("Expected 'null' literal", null, null, -1, null), "Expected 'null' literal", -1, null, null, null);
        }
        return C7992.INSTANCE;
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f19477;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        ((C7992) obj).getClass();
        AbstractC3898.m7412(interfaceC8015);
        interfaceC8015.mo11268();
    }
}
