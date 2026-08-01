package p088;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3066;
import kotlin.jvm.internal.AbstractC4396;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.internal.AbstractC5507;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.C7190;
import p091.C7192;
import p091.InterfaceC7191;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7154 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7154 f19118 = new C7154();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7190 f19117 = AbstractC8175.m13649("kotlinx.serialization.json.JsonPrimitive", C7192.f19184, new InterfaceC7191[0]);

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7178 interfaceC7178M6850 = AbstractC3066.m6850(interfaceC7187);
        AbstractC7176 abstractC7176Mo10681 = interfaceC7178M6850.mo10681();
        if (abstractC7176Mo10681 instanceof AbstractC7148) {
            return (AbstractC7148) abstractC7176Mo10681;
        }
        String strM4575 = AbstractC2442.m4575(AbstractC4396.f12975, abstractC7176Mo10681.getClass(), new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had "));
        String string = interfaceC7178M6850.mo10656().f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10681.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(strM4575, null, null, -1, string), strM4575, -1, null, string, null);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return f19117;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        AbstractC7148 abstractC7148 = (AbstractC7148) obj;
        abstractC7148.getClass();
        AbstractC3066.m6852(interfaceC7186);
        if (abstractC7148 instanceof C7163) {
            interfaceC7186.mo10705(C7164.f19133, C7163.INSTANCE);
        } else {
            interfaceC7186.mo10705(C7165.f19135, (C7161) abstractC7148);
        }
    }
}
