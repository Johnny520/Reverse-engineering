package p088;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3066;
import kotlin.C5179;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5139;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.internal.AbstractC5507;
import p087.C7097;
import p087.C7125;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.C7192;
import p091.InterfaceC7191;
import p251.AbstractC8175;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7165 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7165 f19135 = new C7165();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7125 f19134 = AbstractC8175.m13633("kotlinx.serialization.json.JsonLiteral", C7192.f19184);

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7178 interfaceC7178M6850 = AbstractC3066.m6850(interfaceC7187);
        AbstractC7176 abstractC7176Mo10681 = interfaceC7178M6850.mo10681();
        if (abstractC7176Mo10681 instanceof C7161) {
            return (C7161) abstractC7176Mo10681;
        }
        String strM4575 = AbstractC2442.m4575(AbstractC4396.f12975, abstractC7176Mo10681.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had "));
        String string = interfaceC7178M6850.mo10656().f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10681.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(strM4575, null, null, -1, string), strM4575, -1, null, string, null);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return f19134;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        C7161 c7161 = (C7161) obj;
        c7161.getClass();
        String str = c7161.f19130;
        AbstractC3066.m6852(interfaceC7186);
        if (c7161.f19131) {
            interfaceC7186.mo10649(str);
            return;
        }
        InterfaceC7191 interfaceC7191 = c7161.f19129;
        if (interfaceC7191 != null) {
            interfaceC7186.mo10716(interfaceC7191).mo10649(str);
            return;
        }
        Long lM10138 = AbstractC5139.m10138(str);
        if (lM10138 != null) {
            interfaceC7186.mo10651(lM10138.longValue());
            return;
        }
        C5179 c5179M13683 = AbstractC8190.m13683(str);
        if (c5179M13683 != null) {
            interfaceC7186.mo10716(C7097.f19018).mo10651(c5179M13683.f14742);
            return;
        }
        Double dM10126 = AbstractC5138.m10126(str);
        if (dM10126 != null) {
            interfaceC7186.mo10717(dM10126.doubleValue());
            return;
        }
        Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            interfaceC7186.mo10714(bool.booleanValue());
        } else {
            interfaceC7186.mo10649(str);
        }
    }
}
