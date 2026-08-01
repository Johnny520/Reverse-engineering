package p088;

import com.bumptech.glide.AbstractC3066;
import io.ktor.util.C4207;
import io.ktor.util.C4211;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.C7190;
import p091.C7193;
import p091.InterfaceC7191;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7171 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7171 f19139 = new C7171();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7190 f19138 = AbstractC8175.m13648("kotlinx.serialization.json.JsonElement", C7193.f19194, new InterfaceC7191[0], new C4207(27));

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        return AbstractC3066.m6850(interfaceC7187).mo10681();
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return f19138;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        AbstractC7176 abstractC7176 = (AbstractC7176) obj;
        abstractC7176.getClass();
        AbstractC3066.m6852(interfaceC7186);
        if (abstractC7176 instanceof AbstractC7148) {
            interfaceC7186.mo10705(C7154.f19118, abstractC7176);
            return;
        }
        if (abstractC7176 instanceof C7152) {
            interfaceC7186.mo10705(C7150.f19112, abstractC7176);
        } else if (abstractC7176 instanceof C7157) {
            interfaceC7186.mo10705(C7155.f19120, abstractC7176);
        } else {
            C4211.m8611();
        }
    }
}
