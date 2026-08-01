package p056;

import kotlin.InterfaceC5183;
import kotlin.jvm.internal.AbstractC4394;
import p087.AbstractC7143;
import p087.C7128;
import p087.C7134;
import p087.InterfaceC7078;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p144.C7546;
import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6676 implements InterfaceC7078 {
    private static final InterfaceC7190 descriptor;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6676 f18084;

    static {
        C6676 c6676 = new C6676();
        f18084 = c6676;
        C7128 c7128 = new C7128("io.modelcontextprotocol.kotlin.sdk.JSONRPCResponse", c6676, 4);
        c7128.m12382("id", false);
        c7128.m12382("jsonrpc", true);
        c7128.m12382("result", true);
        c7128.m12382("error", true);
        descriptor = c7128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] childSerializers() {
        return new InterfaceC7183[]{C6678.f18090[0].getValue(), C7134.f19094, C8675.m14355(C6792.f18238), C8675.m14355(C6675.f18083)};
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(interfaceC7190);
        InterfaceC5183[] interfaceC5183Arr = C6678.f18090;
        interfaceC7188Mo6876.getClass();
        boolean z = true;
        int i = 0;
        InterfaceC6835 interfaceC6835 = null;
        String strMo6878 = null;
        InterfaceC6795 interfaceC6795 = null;
        C6673 c6673 = null;
        while (z) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(interfaceC7190);
            if (iMo10672 == -1) {
                z = false;
            } else if (iMo10672 == 0) {
                interfaceC6835 = (InterfaceC6835) interfaceC7188Mo6876.mo6874(interfaceC7190, 0, (InterfaceC7183) interfaceC5183Arr[0].getValue(), interfaceC6835);
                i |= 1;
            } else if (iMo10672 == 1) {
                strMo6878 = interfaceC7188Mo6876.mo6878(interfaceC7190, 1);
                i |= 2;
            } else if (iMo10672 == 2) {
                interfaceC6795 = (InterfaceC6795) interfaceC7188Mo6876.mo6875(interfaceC7190, 2, C6792.f18238, interfaceC6795);
                i |= 4;
            } else {
                if (iMo10672 != 3) {
                    C7546.m12738(iMo10672);
                    return null;
                }
                c6673 = (C6673) interfaceC7188Mo6876.mo6875(interfaceC7190, 3, C6675.f18083, c6673);
                i |= 8;
            }
        }
        interfaceC7188Mo6876.mo6877(interfaceC7190);
        return new C6678(i, interfaceC6835, strMo6878, interfaceC6795, c6673);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return descriptor;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        C6678 c6678 = (C6678) obj;
        c6678.getClass();
        InterfaceC7190 interfaceC7190 = descriptor;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(interfaceC7190);
        InterfaceC7183 interfaceC7183 = (InterfaceC7183) C6678.f18090[0].getValue();
        InterfaceC6835 interfaceC6835 = c6678.f18094;
        C6673 c6673 = c6678.f18091;
        InterfaceC6795 interfaceC6795 = c6678.f18092;
        String str = c6678.f18093;
        interfaceC7187Mo6800.mo6791(interfaceC7190, 0, interfaceC7183, interfaceC6835);
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || !AbstractC4394.m8917(str, "2.0")) {
            interfaceC7187Mo6800.mo6814(interfaceC7190, 1, str);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || interfaceC6795 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 2, C6792.f18238, interfaceC6795);
        }
        if (interfaceC7187Mo6800.mo10671(interfaceC7190) || c6673 != null) {
            interfaceC7187Mo6800.mo6807(interfaceC7190, 3, C6675.f18083, c6673);
        }
        interfaceC7187Mo6800.mo6801(interfaceC7190);
    }

    @Override // p087.InterfaceC7078
    public final InterfaceC7183[] typeParametersSerializers() {
        return AbstractC7143.f19108;
    }
}
