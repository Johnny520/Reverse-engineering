package p088;

import androidx.profileinstaller.AbstractC2442;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.internal.AbstractC5506;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.C7189;
import p091.C7191;
import p091.InterfaceC7190;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7153 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7153 f19123 = new C7153();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7189 f19122 = AbstractC5061.m10032("kotlinx.serialization.json.JsonPrimitive", C7191.f19191, new InterfaceC7190[0]);

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7177 interfaceC7177M14661 = AbstractC9124.m14661(interfaceC7186);
        AbstractC7175 abstractC7175Mo10655 = interfaceC7177M14661.mo10655();
        if (abstractC7175Mo10655 instanceof AbstractC7147) {
            return (AbstractC7147) abstractC7175Mo10655;
        }
        String strM4555 = AbstractC2442.m4555(AbstractC4395.f12971, abstractC7175Mo10655.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had "));
        String string = interfaceC7177M14661.mo10643().f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10655.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(strM4555, null, null, -1, string), strM4555, -1, null, string, null);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f19122;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        AbstractC7147 abstractC7147 = (AbstractC7147) obj;
        abstractC7147.getClass();
        AbstractC9124.m14663(interfaceC7185);
        if (abstractC7147 instanceof C7162) {
            interfaceC7185.mo10670(C7163.f19138, C7162.INSTANCE);
        } else {
            interfaceC7185.mo10670(C7164.f19140, (C7160) abstractC7147);
        }
    }
}
