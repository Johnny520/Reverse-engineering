package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import java.util.Map;
import kotlin.InterfaceC5183;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p087.C7128;
import p087.C7134;
import p087.InterfaceC7078;
import p088.C7149;
import p088.C7151;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;
import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6711 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6711 f18140;

    static {
        C6711 c6711 = new C6711();
        f18140 = c6711;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.GetPromptRequest", c6711, 4);
        c7128.m12382("name", false);
        c7128.m12382("arguments", false);
        c7128.m12382("_meta", true);
        c7128.m12382("method", true);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C7134.f19094, C8675.m14355((InterfaceC7183) C6709.f18135[1].getValue()), C7149.f19117, C6791.f18237};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6709.f18135;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        String strMo6878 = null;
        Map map = null;
        C7151 c7151 = null;
        InterfaceC6815 interfaceC6815 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 0);
                i |= 1;
            } else if (iMo10672 == 1) {
                map = (Map) interfaceC7188Mo6876.mo6875(interfaceC7190, 1, (InterfaceC7183) interfaceC5183Arr[1].getValue(), map);
                i |= 2;
            } else if (iMo10672 == 2) {
                c7151 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 2, C7149.f19117, c7151);
                i |= 4;
            } else {
                if (iMo10672 != 3) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                interfaceC6815 = (InterfaceC6815) interfaceC7188Mo6876.mo6874(interfaceC7190, 3, C6791.f18237, interfaceC6815);
                i |= 8;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6709(i, strMo6878, map, c7151, interfaceC6815);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6709 c6709 = (C6709) obj;
        c6709.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6709.f18135;
        String str = c6709.f18139;
        InterfaceC6815 interfaceC6815 = c6709.f18136;
        C7151 c7151 = c6709.f18137;
        interfaceC7187Mo6800.mo6814(interfaceC7190, 0, str);
        interfaceC7187Mo6800.mo6807(interfaceC7190, 1, (InterfaceC7183) interfaceC5183Arr[1].getValue(), c6709.f18138);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c7151, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 2, C7149.f19117, c7151);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || interfaceC6815 != Method$Defined.PromptsGet) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 3, C6791.f18237, interfaceC6815);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
