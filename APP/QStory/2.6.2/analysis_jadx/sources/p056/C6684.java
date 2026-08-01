package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
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

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6684 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6684 f18100;

    static {
        C6684 c6684 = new C6684();
        f18100 = c6684;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.CallToolRequest", c6684, 4);
        c7128.m12382("name", false);
        c7128.m12382("arguments", true);
        c7128.m12382("_meta", true);
        c7128.m12382("method", true);
        descriptor = c7128;
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        C7149 c7149 = C7149.f19117;
        return new InterfaceC7183[]{C7134.f19094, c7149, c7149, C6791.f18237};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        String strMo6878 = null;
        C7151 c7151 = null;
        C7151 c71512 = null;
        InterfaceC6815 interfaceC6815 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 0);
                i |= 1;
            } else if (iMo10672 == 1) {
                c7151 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 1, C7149.f19117, c7151);
                i |= 2;
            } else if (iMo10672 == 2) {
                c71512 = (C7151) interfaceC7188Mo6876.mo6874(interfaceC7190, 2, C7149.f19117, c71512);
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
        return new C6682(i, strMo6878, c7151, c71512, interfaceC6815);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6682 c6682 = (C6682) obj;
        c6682.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        String str = c6682.f18099;
        InterfaceC6815 interfaceC6815 = c6682.f18096;
        C7151 c7151 = c6682.f18097;
        C7151 c71512 = c6682.f18098;
        interfaceC7187Mo6800.mo6814(interfaceC7190, 0, str);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c71512, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 1, C7149.f19117, c71512);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(c7151, AbstractC6601.f17981)) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 2, C7149.f19117, c7151);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || interfaceC6815 != Method$Defined.ToolsCall) {
            interfaceC7187Mo6800.mo6791(interfaceC7190, 3, C6791.f18237, interfaceC6815);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
