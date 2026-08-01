package p088;

import io.ktor.util.C4206;
import io.ktor.util.C4210;
import kotlin.reflect.jvm.internal.AbstractC5061;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.C7189;
import p091.C7192;
import p091.InterfaceC7190;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7170 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7170 f19144 = new C7170();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7189 f19143 = AbstractC5061.m10033("kotlinx.serialization.json.JsonElement", C7192.f19198, new InterfaceC7190[0], new C4206(27));

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        return AbstractC9124.m14661(interfaceC7186).mo10655();
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f19143;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        AbstractC7175 abstractC7175 = (AbstractC7175) obj;
        abstractC7175.getClass();
        AbstractC9124.m14663(interfaceC7185);
        if (abstractC7175 instanceof AbstractC7147) {
            interfaceC7185.mo10670(C7153.f19123, abstractC7175);
            return;
        }
        if (abstractC7175 instanceof C7151) {
            interfaceC7185.mo10670(C7149.f19117, abstractC7175);
        } else if (abstractC7175 instanceof C7156) {
            interfaceC7185.mo10670(C7154.f19125, abstractC7175);
        } else {
            C4210.m8621();
        }
    }
}
