package p088;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3054;
import kotlin.C5178;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.text.AbstractC5137;
import kotlin.text.AbstractC5138;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.internal.AbstractC5506;
import p087.C7096;
import p087.C7124;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.C7191;
import p091.InterfaceC7190;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7164 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7164 f19140 = new C7164();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7124 f19139 = AbstractC5061.m10035("kotlinx.serialization.json.JsonLiteral", C7191.f19191);

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7177 interfaceC7177M14661 = AbstractC9124.m14661(interfaceC7186);
        AbstractC7175 abstractC7175Mo10655 = interfaceC7177M14661.mo10655();
        if (abstractC7175Mo10655 instanceof C7160) {
            return (C7160) abstractC7175Mo10655;
        }
        String strM4555 = AbstractC2442.m4555(AbstractC4395.f12971, abstractC7175Mo10655.getClass(), new StringBuilder("Unexpected JSON element, expected JsonLiteral, had "));
        String string = interfaceC7177M14661.mo10643().f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10655.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(strM4555, null, null, -1, string), strM4555, -1, null, string, null);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f19139;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C7160 c7160 = (C7160) obj;
        c7160.getClass();
        String str = c7160.f19135;
        AbstractC9124.m14663(interfaceC7185);
        if (c7160.f19136) {
            interfaceC7185.mo6813(str);
            return;
        }
        InterfaceC7190 interfaceC7190 = c7160.f19134;
        if (interfaceC7190 != null) {
            interfaceC7185.mo6808(interfaceC7190).mo6813(str);
            return;
        }
        Long lM10135 = AbstractC5138.m10135(str);
        if (lM10135 != null) {
            interfaceC7185.mo6817(lM10135.longValue());
            return;
        }
        C5178 c5178M6581 = AbstractC3054.m6581(str);
        if (c5178M6581 != null) {
            interfaceC7185.mo6808(C7096.f19023).mo6817(c5178M6581.f14742);
            return;
        }
        Double dM10122 = AbstractC5137.m10122(str);
        if (dM10122 != null) {
            interfaceC7185.mo6811(dM10122.doubleValue());
            return;
        }
        Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            interfaceC7185.mo6806(bool.booleanValue());
        } else {
            interfaceC7185.mo6813(str);
        }
    }
}
